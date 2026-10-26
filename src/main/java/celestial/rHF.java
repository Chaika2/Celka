/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rHF
extends Enum<rHF> {
    public static final /* enum */ rHF SEQUENCE = new rHF();
    public static final /* enum */ rHF AUTO = new rHF();
    public static final /* enum */ rHF REDSTONE = new rHF();
    private static final /* synthetic */ rHF[] $VALUES;

    static {
        $VALUES = rHF.id_class();
    }

    public static rHF[] values() {
        return (rHF[])$VALUES.clone();
    }

    public static rHF valueOf(String string) {
        return Enum.valueOf(rHF.class, string);
    }

    private static /* synthetic */ rHF[] id_class() {
        return new rHF[]{SEQUENCE, AUTO, REDSTONE};
    }
}

