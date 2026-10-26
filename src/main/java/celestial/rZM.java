/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rZM
extends Enum<rZM> {
    public static final /* enum */ rZM START_DESTROY_BLOCK = new rZM();
    public static final /* enum */ rZM ABORT_DESTROY_BLOCK = new rZM();
    public static final /* enum */ rZM STOP_DESTROY_BLOCK = new rZM();
    public static final /* enum */ rZM DROP_ALL_ITEMS = new rZM();
    public static final /* enum */ rZM DROP_ITEM = new rZM();
    public static final /* enum */ rZM RELEASE_USE_ITEM = new rZM();
    public static final /* enum */ rZM SWAP_ITEM_WITH_OFFHAND = new rZM();
    private static final /* synthetic */ rZM[] $VALUES;

    static {
        $VALUES = rZM.id_class();
    }

    public static rZM[] values() {
        return (rZM[])$VALUES.clone();
    }

    public static rZM valueOf(String string) {
        return Enum.valueOf(rZM.class, string);
    }

    private static /* synthetic */ rZM[] id_class() {
        return new rZM[]{START_DESTROY_BLOCK, ABORT_DESTROY_BLOCK, STOP_DESTROY_BLOCK, DROP_ALL_ITEMS, DROP_ITEM, RELEASE_USE_ITEM, SWAP_ITEM_WITH_OFFHAND};
    }
}

