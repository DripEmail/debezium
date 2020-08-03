package io.debezium.outbox.quarkus.deployment;
public final class OutboxProcessor$$accessor {
    private OutboxProcessor$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_debeziumOutboxConfig(Object __instance) {
        return ((OutboxProcessor)__instance).debeziumOutboxConfig;
    }
    @SuppressWarnings("unchecked")
    public static void set_debeziumOutboxConfig(Object __instance, Object debeziumOutboxConfig) {
        ((OutboxProcessor)__instance).debeziumOutboxConfig = (DebeziumOutboxConfig)debeziumOutboxConfig;
    }
    public static Object construct() {
        return new OutboxProcessor();
    }
}
