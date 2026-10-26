/*
 * Decompiled with CFR 0.152.
 */
package celestial;

@Deprecated
public final class OE
extends Enum<OE> {
    public static final /* enum */ OE S = new OE();
    public static final /* enum */ OE T = new OE();
    public static final /* enum */ OE R = new OE();
    public static final /* enum */ OE Q = new OE();
    private static final /* synthetic */ OE[] $VALUES;

    static {
        $VALUES = OE.id_class();
    }

    public static OE[] values() {
        return (OE[])$VALUES.clone();
    }

    public static OE valueOf(String string) {
        return Enum.valueOf(OE.class, string);
    }

    private static /* synthetic */ OE[] id_class() {
        return new OE[]{S, T, R, Q};
    }
}

