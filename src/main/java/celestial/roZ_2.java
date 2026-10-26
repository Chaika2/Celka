/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class roZ_2
extends Enum<roZ_2> {
    public static final /* enum */ roZ_2 PROTOCHUNK = new roZ_2();
    public static final /* enum */ roZ_2 LEVELCHUNK = new roZ_2();
    private static final /* synthetic */ roZ_2[] $VALUES;

    static {
        $VALUES = roZ_2.id_class();
    }

    public static roZ_2[] values() {
        return (roZ_2[])$VALUES.clone();
    }

    public static roZ_2 valueOf(String string) {
        return Enum.valueOf(roZ_2.class, string);
    }

    private static /* synthetic */ roZ_2[] id_class() {
        return new roZ_2[]{PROTOCHUNK, LEVELCHUNK};
    }
}

