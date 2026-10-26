/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhx_3;

public final class rRl_1
extends Enum<rRl_1> {
    public static final /* enum */ rRl_1 NOT_SET = new rRl_1(-1, "");
    public static final /* enum */ rRl_1 SURVIVAL = new rRl_1(0, "survival");
    public static final /* enum */ rRl_1 CREATIVE = new rRl_1(1, "creative");
    public static final /* enum */ rRl_1 ADVENTURE = new rRl_1(2, "adventure");
    public static final /* enum */ rRl_1 SPECTATOR = new rRl_1(3, "spectator");
    private final int id;
    private final String name;
    private static final /* synthetic */ rRl_1[] $VALUES;

    public rgP_2 id_byte() {
        return new rgn_3("gameMode." + this.name);
    }

    private rRl_1(int n2, String string2) {
        this.id = n2;
        this.name = string2;
    }

    static {
        $VALUES = rRl_1.id_catch();
    }

    public static rRl_1[] values() {
        return (rRl_1[])$VALUES.clone();
    }

    public static rRl_1 valueOf(String string) {
        return Enum.valueOf(rRl_1.class, string);
    }

    public static rRl_1 id_class(String string, rRl_1 rRl_12) {
        for (rRl_1 rRl_13 : rRl_1.values()) {
            if (!rRl_13.name.equals(string)) continue;
            return rRl_13;
        }
        return rRl_12;
    }

    public static rRl_1 id_class(int n, rRl_1 rRl_12) {
        for (rRl_1 rRl_13 : rRl_1.values()) {
            if (rRl_13.id != n) continue;
            return rRl_13;
        }
        return rRl_12;
    }

    public static rRl_1 id_class(String string) {
        return rRl_1.id_class(string, SURVIVAL);
    }

    public void id_class(rhx_3 rhx_32) {
        if (this == CREATIVE) {
            rhx_32.id_byte = true;
            rhx_32.id_protected = true;
            rhx_32.id_class = true;
        } else if (this == SPECTATOR) {
            rhx_32.id_byte = true;
            rhx_32.id_protected = false;
            rhx_32.id_class = true;
            rhx_32.id_break = true;
        } else {
            rhx_32.id_byte = false;
            rhx_32.id_protected = false;
            rhx_32.id_class = false;
            rhx_32.id_break = false;
        }
        rhx_32.id_throws = !this.id_protected();
    }

    public int id_class() {
        return this.id;
    }

    public static rRl_1 id_class(int n) {
        return rRl_1.id_class(n, SURVIVAL);
    }

    public String id_break() {
        return this.name;
    }

    public boolean id_throws() {
        return this == CREATIVE;
    }

    private static /* synthetic */ rRl_1[] id_catch() {
        return new rRl_1[]{NOT_SET, SURVIVAL, CREATIVE, ADVENTURE, SPECTATOR};
    }

    public boolean id_case() {
        return this == SURVIVAL || this == ADVENTURE;
    }

    public boolean id_protected() {
        return this == ADVENTURE || this == SPECTATOR;
    }
}

