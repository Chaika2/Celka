/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCY
extends Enum<rCY>
implements rpH_2 {
    public static final /* enum */ rCY UP = new rCY("up");
    public static final /* enum */ rCY SIDE = new rCY("side");
    public static final /* enum */ rCY NONE = new rCY("none");
    private final String name;
    private static final /* synthetic */ rCY[] $VALUES;

    private static /* synthetic */ rCY[] id_byte() {
        return new rCY[]{UP, SIDE, NONE};
    }

    private rCY(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCY.id_byte();
    }

    public String toString() {
        return this.id_class();
    }

    public static rCY[] values() {
        return (rCY[])$VALUES.clone();
    }

    public static rCY valueOf(String string) {
        return Enum.valueOf(rCY.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public boolean id_break() {
        return this != NONE;
    }
}

