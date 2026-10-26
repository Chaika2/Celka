/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpB_2;
import celestial.ryA_2;
import celestial.ryL_2;
import celestial.ryn_3;

public abstract sealed class ryF_2
extends Enum<ryF_2>
permits ryL_2, ryA_2, ryn_3 {
    public static final /* enum */ ryF_2 NONE = new ryL_2();
    public static final /* enum */ ryF_2 FORWARD = new ryA_2();
    public static final /* enum */ ryF_2 BACKWARD = new ryn_3();
    public static final rpB_2[] AXES;
    public static final ryF_2[] AXIS_ROTATIONS;
    private static final /* synthetic */ ryF_2[] $VALUES;

    static {
        $VALUES = ryF_2.id_break();
        AXES = rpB_2.values();
        AXIS_ROTATIONS = ryF_2.values();
    }

    public static ryF_2[] values() {
        return (ryF_2[])$VALUES.clone();
    }

    public static ryF_2 valueOf(String string) {
        return Enum.valueOf(ryF_2.class, string);
    }

    public abstract rpB_2 id_class(rpB_2 var1);

    public static ryF_2 id_class(rpB_2 rpB_22, rpB_2 rpB_23) {
        return AXIS_ROTATIONS[Math.floorMod(rpB_23.ordinal() - rpB_22.ordinal(), 3)];
    }

    public abstract ryF_2 id_class();

    public abstract int id_class(int var1, int var2, int var3, rpB_2 var4);

    private static /* synthetic */ ryF_2[] id_break() {
        return new ryF_2[]{NONE, FORWARD, BACKWARD};
    }
}

