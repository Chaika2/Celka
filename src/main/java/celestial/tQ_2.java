/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class tQ_2
extends Enum<tQ_2> {
    public static final /* enum */ tQ_2 EMPTY = new tQ_2(false);
    public static final /* enum */ tQ_2 ITEM = new tQ_2(false);
    public static final /* enum */ tQ_2 BLOCK = new tQ_2(false);
    public static final /* enum */ tQ_2 BOW_AND_ARROW = new tQ_2(true);
    public static final /* enum */ tQ_2 THROW_SPEAR = new tQ_2(false);
    public static final /* enum */ tQ_2 CROSSBOW_CHARGE = new tQ_2(true);
    public static final /* enum */ tQ_2 CROSSBOW_HOLD = new tQ_2(true);
    private final boolean field_241656_h_;
    private static final /* synthetic */ tQ_2[] $VALUES;

    private tQ_2(boolean bl) {
        this.field_241656_h_ = bl;
    }

    static {
        $VALUES = tQ_2.id_break();
    }

    public static tQ_2[] values() {
        return (tQ_2[])$VALUES.clone();
    }

    public static tQ_2 valueOf(String string) {
        return Enum.valueOf(tQ_2.class, string);
    }

    public boolean id_class() {
        return this.field_241656_h_;
    }

    private static /* synthetic */ tQ_2[] id_break() {
        return new tQ_2[]{EMPTY, ITEM, BLOCK, BOW_AND_ARROW, THROW_SPEAR, CROSSBOW_CHARGE, CROSSBOW_HOLD};
    }
}

