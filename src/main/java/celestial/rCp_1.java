/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCp_1
extends Enum<rCp_1>
implements rpH_2 {
    public static final /* enum */ rCp_1 HEAD = new rCp_1("head");
    public static final /* enum */ rCp_1 FOOT = new rCp_1("foot");
    private final String name;
    private static final /* synthetic */ rCp_1[] $VALUES;

    private rCp_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCp_1.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCp_1[] values() {
        return (rCp_1[])$VALUES.clone();
    }

    public static rCp_1 valueOf(String string) {
        return Enum.valueOf(rCp_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCp_1[] id_break() {
        return new rCp_1[]{HEAD, FOOT};
    }
}

