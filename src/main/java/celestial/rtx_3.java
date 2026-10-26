/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rtx_3
extends Enum<rtx_3> {
    public static final /* enum */ rtx_3 POSITIVE = new rtx_3(1);
    public static final /* enum */ rtx_3 NEGATIVE = new rtx_3(-1);
    private final int step;
    private static final /* synthetic */ rtx_3[] $VALUES;

    private rtx_3(int n2) {
        this.step = n2;
    }

    static {
        $VALUES = rtx_3.id_break();
    }

    public static rtx_3[] values() {
        return (rtx_3[])$VALUES.clone();
    }

    public static rtx_3 valueOf(String string) {
        return Enum.valueOf(rtx_3.class, string);
    }

    public int id_class() {
        return this.step;
    }

    private static /* synthetic */ rtx_3[] id_break() {
        return new rtx_3[]{POSITIVE, NEGATIVE};
    }
}

