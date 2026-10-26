/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rGS
extends Enum<rGS> {
    public static final /* enum */ rGS CIRCLE = new rGS();
    public static final /* enum */ rGS SWOOP = new rGS();
    private static final /* synthetic */ rGS[] $VALUES;

    static {
        $VALUES = rGS.id_class();
    }

    public static rGS[] values() {
        return (rGS[])$VALUES.clone();
    }

    public static rGS valueOf(String string) {
        return Enum.valueOf(rGS.class, string);
    }

    private static /* synthetic */ rGS[] id_class() {
        return new rGS[]{CIRCLE, SWOOP};
    }
}

