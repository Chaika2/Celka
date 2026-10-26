/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCw_1
extends Enum<rCw_1>
implements rpH_2 {
    public static final /* enum */ rCw_1 COMPARE = new rCw_1("compare");
    public static final /* enum */ rCw_1 SUBTRACT = new rCw_1("subtract");
    private final String name;
    private static final /* synthetic */ rCw_1[] $VALUES;

    private rCw_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCw_1.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCw_1[] values() {
        return (rCw_1[])$VALUES.clone();
    }

    public static rCw_1 valueOf(String string) {
        return Enum.valueOf(rCw_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCw_1[] id_break() {
        return new rCw_1[]{COMPARE, SUBTRACT};
    }
}

