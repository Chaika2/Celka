/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class KM
extends Enum<KM> {
    public static final /* enum */ KM REPLACE = new KM();
    public static final /* enum */ KM DESTROY = new KM();
    private static final /* synthetic */ KM[] $VALUES;

    static {
        $VALUES = KM.id_class();
    }

    public static KM[] values() {
        return (KM[])$VALUES.clone();
    }

    public static KM valueOf(String string) {
        return Enum.valueOf(KM.class, string);
    }

    private static /* synthetic */ KM[] id_class() {
        return new KM[]{REPLACE, DESTROY};
    }
}

