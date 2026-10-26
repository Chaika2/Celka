/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rsd_3
extends Enum<rsd_3> {
    public static final /* enum */ rsd_3 RIDEABLE = new rsd_3();
    public static final /* enum */ rsd_3 CHEST = new rsd_3();
    public static final /* enum */ rsd_3 FURNACE = new rsd_3();
    public static final /* enum */ rsd_3 TNT = new rsd_3();
    public static final /* enum */ rsd_3 SPAWNER = new rsd_3();
    public static final /* enum */ rsd_3 HOPPER = new rsd_3();
    public static final /* enum */ rsd_3 COMMAND_BLOCK = new rsd_3();
    private static final /* synthetic */ rsd_3[] $VALUES;

    static {
        $VALUES = rsd_3.id_class();
    }

    public static rsd_3[] values() {
        return (rsd_3[])$VALUES.clone();
    }

    public static rsd_3 valueOf(String string) {
        return Enum.valueOf(rsd_3.class, string);
    }

    private static /* synthetic */ rsd_3[] id_class() {
        return new rsd_3[]{RIDEABLE, CHEST, FURNACE, TNT, SPAWNER, HOPPER, COMMAND_BLOCK};
    }
}

