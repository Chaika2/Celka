/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCj_1
extends Enum<rCj_1>
implements rpH_2 {
    public static final /* enum */ rCj_1 TOP = new rCj_1("top");
    public static final /* enum */ rCj_1 BOTTOM = new rCj_1("bottom");
    private final String name;
    private static final /* synthetic */ rCj_1[] $VALUES;

    private rCj_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCj_1.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCj_1[] values() {
        return (rCj_1[])$VALUES.clone();
    }

    public static rCj_1 valueOf(String string) {
        return Enum.valueOf(rCj_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCj_1[] id_break() {
        return new rCj_1[]{TOP, BOTTOM};
    }
}

