/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rPe_1
extends Enum<rPe_1> {
    public static final /* enum */ rPe_1 GO_TO_BOAT = new rPe_1();
    public static final /* enum */ rPe_1 GO_IN_BOAT_DIRECTION = new rPe_1();
    private static final /* synthetic */ rPe_1[] $VALUES;

    static {
        $VALUES = rPe_1.id_class();
    }

    public static rPe_1[] values() {
        return (rPe_1[])$VALUES.clone();
    }

    public static rPe_1 valueOf(String string) {
        return Enum.valueOf(rPe_1.class, string);
    }

    private static /* synthetic */ rPe_1[] id_class() {
        return new rPe_1[]{GO_TO_BOAT, GO_IN_BOAT_DIRECTION};
    }
}

