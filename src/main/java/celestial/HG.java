/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class HG
extends Enum<HG> {
    public static final /* enum */ HG FOG_SKY = new HG();
    public static final /* enum */ HG FOG_TERRAIN = new HG();
    private static final /* synthetic */ HG[] $VALUES;

    static {
        $VALUES = HG.id_class();
    }

    public static HG[] values() {
        return (HG[])$VALUES.clone();
    }

    public static HG valueOf(String string) {
        return Enum.valueOf(HG.class, string);
    }

    private static /* synthetic */ HG[] id_class() {
        return new HG[]{FOG_SKY, FOG_TERRAIN};
    }
}

