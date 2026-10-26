/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCo_1
extends Enum<rCo_1>
implements rpH_2 {
    public static final /* enum */ rCo_1 TOP = new rCo_1("top");
    public static final /* enum */ rCo_1 BOTTOM = new rCo_1("bottom");
    public static final /* enum */ rCo_1 DOUBLE = new rCo_1("double");
    private final String name;
    private static final /* synthetic */ rCo_1[] $VALUES;

    private rCo_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCo_1.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCo_1[] values() {
        return (rCo_1[])$VALUES.clone();
    }

    public static rCo_1 valueOf(String string) {
        return Enum.valueOf(rCo_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCo_1[] id_break() {
        return new rCo_1[]{TOP, BOTTOM, DOUBLE};
    }
}

