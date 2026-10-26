/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCK
extends Enum<rCK>
implements rpH_2 {
    public static final /* enum */ rCK STRAIGHT = new rCK("straight");
    public static final /* enum */ rCK INNER_LEFT = new rCK("inner_left");
    public static final /* enum */ rCK INNER_RIGHT = new rCK("inner_right");
    public static final /* enum */ rCK OUTER_LEFT = new rCK("outer_left");
    public static final /* enum */ rCK OUTER_RIGHT = new rCK("outer_right");
    private final String name;
    private static final /* synthetic */ rCK[] $VALUES;

    private rCK(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCK.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCK[] values() {
        return (rCK[])$VALUES.clone();
    }

    public static rCK valueOf(String string) {
        return Enum.valueOf(rCK.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCK[] id_break() {
        return new rCK[]{STRAIGHT, INNER_LEFT, INNER_RIGHT, OUTER_LEFT, OUTER_RIGHT};
    }
}

