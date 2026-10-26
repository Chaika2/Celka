/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rXa_1
extends Enum<rXa_1> {
    public static final /* enum */ rXa_1 PICKUP = new rXa_1(false);
    public static final /* enum */ rXa_1 QUICK_MOVE = new rXa_1(false);
    public static final /* enum */ rXa_1 SWAP = new rXa_1(true);
    public static final /* enum */ rXa_1 CLONE = new rXa_1(false);
    public static final /* enum */ rXa_1 THROW = new rXa_1(true);
    public static final /* enum */ rXa_1 QUICK_CRAFT = new rXa_1(false);
    public static final /* enum */ rXa_1 PICKUP_ALL = new rXa_1(false);
    private final boolean isReturningAirItem;
    private static final /* synthetic */ rXa_1[] $VALUES;

    private rXa_1(boolean bl) {
        this.isReturningAirItem = bl;
    }

    static {
        $VALUES = rXa_1.id_break();
    }

    public static rXa_1[] values() {
        return (rXa_1[])$VALUES.clone();
    }

    public static rXa_1 valueOf(String string) {
        return Enum.valueOf(rXa_1.class, string);
    }

    public boolean id_class() {
        return this.isReturningAirItem;
    }

    private static /* synthetic */ rXa_1[] id_break() {
        return new rXa_1[]{PICKUP, QUICK_MOVE, SWAP, CLONE, THROW, QUICK_CRAFT, PICKUP_ALL};
    }
}

