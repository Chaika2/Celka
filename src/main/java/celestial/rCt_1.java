/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCt_1
extends Enum<rCt_1>
implements rpH_2 {
    public static final /* enum */ rCt_1 SINGLE = new rCt_1("single", 0);
    public static final /* enum */ rCt_1 LEFT = new rCt_1("left", 2);
    public static final /* enum */ rCt_1 RIGHT = new rCt_1("right", 1);
    public static final rCt_1[] VALUES;
    private final String name;
    private final int opposite;
    private static final /* synthetic */ rCt_1[] $VALUES;

    private static /* synthetic */ rCt_1[] id_byte() {
        return new rCt_1[]{SINGLE, LEFT, RIGHT};
    }

    private rCt_1(String string2, int n2) {
        this.name = string2;
        this.opposite = n2;
    }

    static {
        $VALUES = rCt_1.id_byte();
        VALUES = rCt_1.values();
    }

    public static rCt_1[] values() {
        return (rCt_1[])$VALUES.clone();
    }

    public static rCt_1 valueOf(String string) {
        return Enum.valueOf(rCt_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public rCt_1 id_break() {
        return VALUES[this.opposite];
    }
}

