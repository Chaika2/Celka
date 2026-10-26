/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rGT
extends Enum<rGT> {
    public static final /* enum */ rGT NONE = new rGT(0, 0.0, 0.0, 0.0);
    public static final /* enum */ rGT SUMMON_VEX = new rGT(1, 0.7, 0.7, 0.8);
    public static final /* enum */ rGT FANGS = new rGT(2, 0.4, 0.3, 0.35);
    public static final /* enum */ rGT WOLOLO = new rGT(3, 0.7, 0.5, 0.2);
    public static final /* enum */ rGT DISAPPEAR = new rGT(4, 0.3, 0.3, 0.8);
    public static final /* enum */ rGT BLINDNESS = new rGT(5, 0.1, 0.1, 0.2);
    public final int id;
    public final double[] particleSpeed;
    private static final /* synthetic */ rGT[] $VALUES;

    private rGT(int n2, double d, double d2, double d3) {
        this.id = n2;
        this.particleSpeed = new double[]{d, d2, d3};
    }

    static {
        $VALUES = rGT.id_class();
    }

    public static rGT[] values() {
        return (rGT[])$VALUES.clone();
    }

    public static rGT valueOf(String string) {
        return Enum.valueOf(rGT.class, string);
    }

    private static /* synthetic */ rGT[] id_class() {
        return new rGT[]{NONE, SUMMON_VEX, FANGS, WOLOLO, DISAPPEAR, BLINDNESS};
    }

    public static rGT id_class(int n) {
        for (rGT rGT2 : rGT.values()) {
            if (n != rGT2.id) continue;
            return rGT2;
        }
        return NONE;
    }
}

