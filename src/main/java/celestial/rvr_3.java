/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rvr_3
extends Enum<rvr_3> {
    public static final /* enum */ rvr_3 ENTER_COMBAT = new rvr_3();
    public static final /* enum */ rvr_3 END_COMBAT = new rvr_3();
    public static final /* enum */ rvr_3 ENTITY_DIED = new rvr_3();
    private static final /* synthetic */ rvr_3[] $VALUES;

    static {
        $VALUES = rvr_3.id_class();
    }

    public static rvr_3[] values() {
        return (rvr_3[])$VALUES.clone();
    }

    public static rvr_3 valueOf(String string) {
        return Enum.valueOf(rvr_3.class, string);
    }

    private static /* synthetic */ rvr_3[] id_class() {
        return new rvr_3[]{ENTER_COMBAT, END_COMBAT, ENTITY_DIED};
    }
}

