package io.debezium.outbox.quarkus.deployment;
public final class DebeziumOutboxConfig$DebeziumOutboxConfigType$$accessor {
    private DebeziumOutboxConfig$DebeziumOutboxConfigType$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_name(Object __instance) {
        return ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)__instance).name;
    }
    @SuppressWarnings("unchecked")
    public static void set_name(Object __instance, Object name) {
        ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)__instance).name = (String)name;
    }
    @SuppressWarnings("unchecked")
    public static Object get_columnDefinition(Object __instance) {
        return ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)__instance).columnDefinition;
    }
    @SuppressWarnings("unchecked")
    public static void set_columnDefinition(Object __instance, Object columnDefinition) {
        ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)__instance).columnDefinition = (java.util.Optional<String>)columnDefinition;
    }
    @SuppressWarnings("unchecked")
    public static Object get_converter(Object __instance) {
        return ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)__instance).converter;
    }
    @SuppressWarnings("unchecked")
    public static void set_converter(Object __instance, Object converter) {
        ((io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType)__instance).converter = (java.util.Optional<String>)converter;
    }
    public static Object construct() {
        return new io.debezium.outbox.quarkus.deployment.DebeziumOutboxConfig.DebeziumOutboxConfigType();
    }
}
