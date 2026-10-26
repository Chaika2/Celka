/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rmf_3
extends Enum<rmf_3> {
    public static final /* enum */ rmf_3 PERFORM_RESPAWN = new rmf_3();
    public static final /* enum */ rmf_3 REQUEST_STATS = new rmf_3();
    private static final /* synthetic */ rmf_3[] $VALUES;

    static {
        $VALUES = rmf_3.id_class();
    }

    public static rmf_3[] values() {
        return (rmf_3[])$VALUES.clone();
    }

    public static rmf_3 valueOf(String string) {
        return Enum.valueOf(rmf_3.class, string);
    }

    private static /* synthetic */ rmf_3[] id_class() {
        return new rmf_3[]{PERFORM_RESPAWN, REQUEST_STATS};
    }
}

