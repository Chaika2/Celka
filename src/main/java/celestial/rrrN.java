/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrrN
extends Enum<rrrN> {
    public static final /* enum */ rrrN OPENING = new rrrN();
    public static final /* enum */ rrrN WOOD_DOOR = new rrrN();
    public static final /* enum */ rrrN GRATES = new rrrN();
    public static final /* enum */ rrrN IRON_DOOR = new rrrN();
    private static final /* synthetic */ rrrN[] $VALUES;

    static {
        $VALUES = rrrN.id_class();
    }

    public static rrrN[] values() {
        return (rrrN[])$VALUES.clone();
    }

    public static rrrN valueOf(String string) {
        return Enum.valueOf(rrrN.class, string);
    }

    private static /* synthetic */ rrrN[] id_class() {
        return new rrrN[]{OPENING, WOOD_DOOR, GRATES, IRON_DOOR};
    }
}

