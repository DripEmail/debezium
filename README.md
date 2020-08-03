## Setup

Switching to the fork
```
git remote rename origin upstream
git remote add origin git@github.com:DripEmail/debezium.git
```

Creating a maven repo, following advice from the following links:
https://engineering.groupon.com/2014/misc/maven-and-github-forking-a-github-repository-and-hosting-its-maven-artifacts/
https://gist.github.com/fernandezpablo85/03cf8b0cd2e7d8527063
https://stackoverflow.com/a/15034426
```
git checkout --orphan mvn-repo
```

## Updating

While on the branch to release:
1. Update all pom files to use new version number
2. Generate jar files for the new version
```
mvn clean install -Passembly -DskipITs -DskipTests
```
3. Generate maven files and jars to host
```
mvn install:install-file -DgroupId=io.debezium -DartifactId=debezium-connector-postgres -Dversion=1.1.3 -Dfile=debezium-connector-postgres/target/debezium-connector-postgres-1.1.3.jar -Dpackaging=jar -DpomFile=debezium-connector-postgres/pom.xml -DlocalRepositoryPath=. -DcreateChecksum=true
```
4. Checkout maven repository branch
```
git checkout mvn-repo
```
5. Update branch using new files
