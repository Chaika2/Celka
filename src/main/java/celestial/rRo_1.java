/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rRo_1
extends Enum<rRo_1> {
    public static final /* enum */ rRo_1 SKY = new rRo_1(15);
    public static final /* enum */ rRo_1 BLOCK = new rRo_1(0);
    public final int defaultLightValue;
    private static final /* synthetic */ rRo_1[] $VALUES;

    private rRo_1(int n2) {
        this.defaultLightValue = n2;
    }

    static {
        $VALUES = rRo_1.id_class();
    }

    public static rRo_1[] values() {
        return (rRo_1[])$VALUES.clone();
    }

    public static rRo_1 valueOf(String string) {
        return Enum.valueOf(rRo_1.class, string);
    }

    private static /* synthetic */ rRo_1[] id_class() {
        return new rRo_1[]{SKY, BLOCK};
    }
}

