/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCy_1
extends Enum<rCy_1>
implements rpH_2 {
    public static final /* enum */ rCy_1 NONE = new rCy_1("none");
    public static final /* enum */ rCy_1 SMALL = new rCy_1("small");
    public static final /* enum */ rCy_1 LARGE = new rCy_1("large");
    private final String name;
    private static final /* synthetic */ rCy_1[] $VALUES;

    private rCy_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCy_1.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCy_1[] values() {
        return (rCy_1[])$VALUES.clone();
    }

    public static rCy_1 valueOf(String string) {
        return Enum.valueOf(rCy_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCy_1[] id_break() {
        return new rCy_1[]{NONE, SMALL, LARGE};
    }
}

