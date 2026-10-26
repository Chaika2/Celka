/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class ryM_2
extends Enum<ryM_2> {
    public static final /* enum */ ryM_2 UPDATE_DATA = new ryM_2();
    public static final /* enum */ ryM_2 SAVE_AREA = new ryM_2();
    public static final /* enum */ ryM_2 LOAD_AREA = new ryM_2();
    public static final /* enum */ ryM_2 SCAN_AREA = new ryM_2();
    private static final /* synthetic */ ryM_2[] $VALUES;

    static {
        $VALUES = ryM_2.id_class();
    }

    public static ryM_2[] values() {
        return (ryM_2[])$VALUES.clone();
    }

    public static ryM_2 valueOf(String string) {
        return Enum.valueOf(ryM_2.class, string);
    }

    private static /* synthetic */ ryM_2[] id_class() {
        return new ryM_2[]{UPDATE_DATA, SAVE_AREA, LOAD_AREA, SCAN_AREA};
    }
}

