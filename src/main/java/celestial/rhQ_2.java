/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;

public final class rhQ_2
extends Enum<rhQ_2> {
    public static final /* enum */ rhQ_2 CAPE = new rhQ_2(0, "cape");
    public static final /* enum */ rhQ_2 JACKET = new rhQ_2(1, "jacket");
    public static final /* enum */ rhQ_2 LEFT_SLEEVE = new rhQ_2(2, "left_sleeve");
    public static final /* enum */ rhQ_2 RIGHT_SLEEVE = new rhQ_2(3, "right_sleeve");
    public static final /* enum */ rhQ_2 LEFT_PANTS_LEG = new rhQ_2(4, "left_pants_leg");
    public static final /* enum */ rhQ_2 RIGHT_PANTS_LEG = new rhQ_2(5, "right_pants_leg");
    public static final /* enum */ rhQ_2 HAT = new rhQ_2(6, "hat");
    private final int partId;
    private final int partMask;
    private final String partName;
    private final rgP_2 name;
    private static final /* synthetic */ rhQ_2[] $VALUES;

    public rgP_2 id_byte() {
        return this.name;
    }

    private rhQ_2(int n2, String string2) {
        this.partId = n2;
        this.partMask = 1 << n2;
        this.partName = string2;
        this.name = new rgn_3("options.modelPart." + string2);
    }

    static {
        $VALUES = rhQ_2.id_protected();
    }

    public static rhQ_2[] values() {
        return (rhQ_2[])$VALUES.clone();
    }

    public static rhQ_2 valueOf(String string) {
        return Enum.valueOf(rhQ_2.class, string);
    }

    public int id_class() {
        return this.partMask;
    }

    public String id_break() {
        return this.partName;
    }

    private static /* synthetic */ rhQ_2[] id_protected() {
        return new rhQ_2[]{CAPE, JACKET, LEFT_SLEEVE, RIGHT_SLEEVE, LEFT_PANTS_LEG, RIGHT_PANTS_LEG, HAT};
    }
}

