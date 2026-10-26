/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class wG_2
extends Enum<wG_2> {
    public static final /* enum */ wG_2 FLYING = new wG_2();
    public static final /* enum */ wG_2 STANDING = new wG_2();
    public static final /* enum */ wG_2 SITTING = new wG_2();
    public static final /* enum */ wG_2 PARTY = new wG_2();
    public static final /* enum */ wG_2 ON_SHOULDER = new wG_2();
    private static final /* synthetic */ wG_2[] $VALUES;

    static {
        $VALUES = wG_2.id_class();
    }

    public static wG_2[] values() {
        return (wG_2[])$VALUES.clone();
    }

    public static wG_2 valueOf(String string) {
        return Enum.valueOf(wG_2.class, string);
    }

    private static /* synthetic */ wG_2[] id_class() {
        return new wG_2[]{FLYING, STANDING, SITTING, PARTY, ON_SHOULDER};
    }
}

