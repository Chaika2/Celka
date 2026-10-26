/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.xd_3;
import celestial.xu_3;

public final class rSe_1
extends Enum<rSe_1> {
    public static final /* enum */ rSe_1 OAK = new rSe_1(xu_3.id_final, "oak");
    public static final /* enum */ rSe_1 SPRUCE = new rSe_1(xu_3.id_package, "spruce");
    public static final /* enum */ rSe_1 BIRCH = new rSe_1(xu_3.id_int, "birch");
    public static final /* enum */ rSe_1 JUNGLE = new rSe_1(xu_3.id_new, "jungle");
    public static final /* enum */ rSe_1 ACACIA = new rSe_1(xu_3.id_continue, "acacia");
    public static final /* enum */ rSe_1 DARK_OAK = new rSe_1(xu_3.id_super, "dark_oak");
    private final String name;
    private final xd_3 block;
    private static final /* synthetic */ rSe_1[] $VALUES;

    private static /* synthetic */ rSe_1[] id_byte() {
        return new rSe_1[]{OAK, SPRUCE, BIRCH, JUNGLE, ACACIA, DARK_OAK};
    }

    private rSe_1(xd_3 xd_32, String string2) {
        this.name = string2;
        this.block = xd_32;
    }

    static {
        $VALUES = rSe_1.id_byte();
    }

    public String toString() {
        return this.name;
    }

    public static rSe_1[] values() {
        return (rSe_1[])$VALUES.clone();
    }

    public static rSe_1 valueOf(String string) {
        return Enum.valueOf(rSe_1.class, string);
    }

    public static rSe_1 id_class(String string) {
        rSe_1[] rSe_1Array = rSe_1.values();
        for (int i = 0; i < rSe_1Array.length; ++i) {
            if (!rSe_1Array[i].id_class().equals(string)) continue;
            return rSe_1Array[i];
        }
        return rSe_1Array[0];
    }

    public static rSe_1 id_class(int n) {
        rSe_1[] rSe_1Array = rSe_1.values();
        if (n < 0 || n >= rSe_1Array.length) {
            n = 0;
        }
        return rSe_1Array[n];
    }

    public String id_class() {
        return this.name;
    }

    public xd_3 id_break() {
        return this.block;
    }
}

