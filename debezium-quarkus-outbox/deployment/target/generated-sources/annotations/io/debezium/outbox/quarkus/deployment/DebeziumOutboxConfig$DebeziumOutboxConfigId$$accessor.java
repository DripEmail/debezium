package io.debezium.outbox.quarkus.deployment;
public final class DebeziumOutboxConfig$DebeziumOutboxConfigId$$accessor {
    private DebeziumOutboxConfig$DebeziumOutboxConfigId$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_name(Object __instance) {
        return ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigId)__instance).name;
    }
    @SuppressWarnings("unchecked")
    public static void set_name(Object __instance, Object name) {
        ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigId)__instance).name = (String)name;
    }
    @SuppressWarnings("unchecked")
    public static Object get_columnDefinition(Object __instance) {
        return ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigId)__instance).columnDefinition;
    }
    @SuppressWarnings("unchecked")
    public static void set_columnDefinition(Object __instance, Object columnDefinition) {
        ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigId)__instance).columnDefinition = (java.util.Optional<String>)columnDefinition;
    }
    public static Object construct() {
        return new io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigId();
    }
}
