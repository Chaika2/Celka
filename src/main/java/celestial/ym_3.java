/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class ym_3
extends Enum<ym_3> {
    public static final /* enum */ ym_3 SUCCESSFUL = new ym_3();
    public static final /* enum */ ym_3 CANCELLED = new ym_3();
    private static final /* synthetic */ ym_3[] $VALUES;

    static {
        $VALUES = ym_3.id_class();
    }

    public static ym_3[] values() {
        return (ym_3[])$VALUES.clone();
    }

    public static ym_3 valueOf(String string) {
        return Enum.valueOf(ym_3.class, string);
    }

    private static /* synthetic */ ym_3[] id_class() {
        return new ym_3[]{SUCCESSFUL, CANCELLED};
    }
}

