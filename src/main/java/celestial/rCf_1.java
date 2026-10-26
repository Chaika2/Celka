/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCf_1
extends Enum<rCf_1>
implements rpH_2 {
    public static final /* enum */ rCf_1 UPPER = new rCf_1();
    public static final /* enum */ rCf_1 LOWER = new rCf_1();
    private static final /* synthetic */ rCf_1[] $VALUES;

    static {
        $VALUES = rCf_1.id_break();
    }

    public String toString() {
        return this.id_class();
    }

    public static rCf_1[] values() {
        return (rCf_1[])$VALUES.clone();
    }

    public static rCf_1 valueOf(String string) {
        return Enum.valueOf(rCf_1.class, string);
    }

    @Override
    public String id_class() {
        return this == UPPER ? "upper" : "lower";
    }

    private static /* synthetic */ rCf_1[] id_break() {
        return new rCf_1[]{UPPER, LOWER};
    }
}

