package io.debezium.outbox.quarkus.internal;
public final class DebeziumOutboxRuntimeConfig$$accessor {
    private DebeziumOutboxRuntimeConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static boolean get_removeAfterInsert(Object __instance) {
        return ((DebeziumOutboxRuntimeConfig)__instance).removeAfterInsert;
    }
    @SuppressWarnings("unchecked")
    public static void set_removeAfterInsert(Object __instance, boolean removeAfterInsert) {
        ((DebeziumOutboxRuntimeConfig)__instance).removeAfterInsert = removeAfterInsert;
    }
    public static Object construct() {
        return new DebeziumOutboxRuntimeConfig();
    }
}
