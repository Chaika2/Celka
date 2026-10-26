/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rKF
extends Enum<rKF> {
    public static final /* enum */ rKF WORLDGEN = new rKF();
    public static final /* enum */ rKF LIVE_WORLD = new rKF();
    public static final /* enum */ rKF CLIENT = new rKF();
    private static final /* synthetic */ rKF[] $VALUES;

    static {
        $VALUES = rKF.id_class();
    }

    public static rKF[] values() {
        return (rKF[])$VALUES.clone();
    }

    public static rKF valueOf(String string) {
        return Enum.valueOf(rKF.class, string);
    }

    private static /* synthetic */ rKF[] id_class() {
        return new rKF[]{WORLDGEN, LIVE_WORLD, CLIENT};
    }
}

