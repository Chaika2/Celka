/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class aw_3
extends Enum<aw_3> {
    public static final /* enum */ aw_3 ON_GROUND = new aw_3();
    public static final /* enum */ aw_3 IN_WATER = new aw_3();
    public static final /* enum */ aw_3 NO_RESTRICTIONS = new aw_3();
    public static final /* enum */ aw_3 IN_LAVA = new aw_3();
    private static final /* synthetic */ aw_3[] $VALUES;

    static {
        $VALUES = aw_3.id_class();
    }

    public static aw_3[] values() {
        return (aw_3[])$VALUES.clone();
    }

    public static aw_3 valueOf(String string) {
        return Enum.valueOf(aw_3.class, string);
    }

    private static /* synthetic */ aw_3[] id_class() {
        return new aw_3[]{ON_GROUND, IN_WATER, NO_RESTRICTIONS, IN_LAVA};
    }
}

