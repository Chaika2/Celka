/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rdC_2
extends Enum<rdC_2> {
    public static final /* enum */ rdC_2 ENCHANTMENTS = new rdC_2();
    public static final /* enum */ rdC_2 MODIFIERS = new rdC_2();
    public static final /* enum */ rdC_2 UNBREAKABLE = new rdC_2();
    public static final /* enum */ rdC_2 CAN_DESTROY = new rdC_2();
    public static final /* enum */ rdC_2 CAN_PLACE = new rdC_2();
    public static final /* enum */ rdC_2 ADDITIONAL = new rdC_2();
    public static final /* enum */ rdC_2 DYE = new rdC_2();
    private int field_242396_h = 1 << this.ordinal();
    private static final /* synthetic */ rdC_2[] $VALUES;

    static {
        $VALUES = rdC_2.id_break();
    }

    public static rdC_2[] values() {
        return (rdC_2[])$VALUES.clone();
    }

    public static rdC_2 valueOf(String string) {
        return Enum.valueOf(rdC_2.class, string);
    }

    public int id_class() {
        return this.field_242396_h;
    }

    private static /* synthetic */ rdC_2[] id_break() {
        return new rdC_2[]{ENCHANTMENTS, MODIFIERS, UNBREAKABLE, CAN_DESTROY, CAN_PLACE, ADDITIONAL, DYE};
    }
}

