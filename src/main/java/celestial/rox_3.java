/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rox_3
extends Enum<rox_3> {
    public static final /* enum */ rox_3 IMMEDIATE = new rox_3();
    public static final /* enum */ rox_3 QUEUED = new rox_3();
    public static final /* enum */ rox_3 CHECK = new rox_3();
    private static final /* synthetic */ rox_3[] $VALUES;

    static {
        $VALUES = rox_3.id_class();
    }

    public static rox_3[] values() {
        return (rox_3[])$VALUES.clone();
    }

    public static rox_3 valueOf(String string) {
        return Enum.valueOf(rox_3.class, string);
    }

    private static /* synthetic */ rox_3[] id_class() {
        return new rox_3[]{IMMEDIATE, QUEUED, CHECK};
    }
}

