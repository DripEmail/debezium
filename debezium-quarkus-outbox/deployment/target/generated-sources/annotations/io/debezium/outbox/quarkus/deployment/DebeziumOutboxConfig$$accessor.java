package io.debezium.outbox.quarkus.deployment;
public final class DebeziumOutboxConfig$$accessor {
    private DebeziumOutboxConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_tableName(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).tableName;
    }
    @SuppressWarnings("unchecked")
    public static void set_tableName(Object __instance, Object tableName) {
        ((DebeziumOutboxConfig)__instance).tableName = (String)tableName;
    }
    @SuppressWarnings("unchecked")
    public static Object get_id(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).id;
    }
    @SuppressWarnings("unchecked")
    public static void set_id(Object __instance, Object id) {
        ((DebeziumOutboxConfig)__instance).id = (io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigId)id;
    }
    @SuppressWarnings("unchecked")
    public static Object get_aggregateId(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).aggregateId;
    }
    @SuppressWarnings("unchecked")
    public static void set_aggregateId(Object __instance, Object aggregateId) {
        ((DebeziumOutboxConfig)__instance).aggregateId = (io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigAggregateId)aggregateId;
    }
    @SuppressWarnings("unchecked")
    public static Object get_aggregateType(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).aggregateType;
    }
    @SuppressWarnings("unchecked")
    public static void set_aggregateType(Object __instance, Object aggregateType) {
        ((DebeziumOutboxConfig)__instance).aggregateType = (io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigAggregateType)aggregateType;
    }
    @SuppressWarnings("unchecked")
    public static Object get_type(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).type;
    }
    @SuppressWarnings("unchecked")
    public static void set_type(Object __instance, Object type) {
        ((DebeziumOutboxConfig)__instance).type = (io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)type;
    }
    @SuppressWarnings("unchecked")
    public static Object get_timestamp(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).timestamp;
    }
    @SuppressWarnings("unchecked")
    public static void set_timestamp(Object __instance, Object timestamp) {
        ((DebeziumOutboxConfig)__instance).timestamp = (io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigTimestamp)timestamp;
    }
    @SuppressWarnings("unchecked")
    public static Object get_payload(Object __instance) {
        return ((DebeziumOutboxConfig)__instance).payload;
    }
    @SuppressWarnings("unchecked")
    public static void set_payload(Object __instance, Object payload) {
        ((DebeziumOutboxConfig)__instance).payload = (io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigPayload)payload;
    }
    public static Object construct() {
        return new DebeziumOutboxConfig();
    }
}
