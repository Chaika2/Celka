/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCg_1
extends Enum<rCg_1>
implements rpH_2 {
    public static final /* enum */ rCg_1 DEFAULT = new rCg_1("normal");
    public static final /* enum */ rCg_1 STICKY = new rCg_1("sticky");
    private final String name;
    private static final /* synthetic */ rCg_1[] $VALUES;

    private rCg_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCg_1.id_break();
    }

    public String toString() {
        return this.name;
    }

    public static rCg_1[] values() {
        return (rCg_1[])$VALUES.clone();
    }

    public static rCg_1 valueOf(String string) {
        return Enum.valueOf(rCg_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rCg_1[] id_break() {
        return new rCg_1[]{DEFAULT, STICKY};
    }
}

