/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.ryp_3;
import celestial.ryq_3;
import celestial.ryy_3;
import celestial.xc_3;

public abstract sealed class ryH_2
extends Enum<ryH_2>
permits ryy_3, ryp_3, ryq_3 {
    public static final /* enum */ ryH_2 FULL = new ryy_3();
    public static final /* enum */ ryH_2 CENTER = new ryp_3();
    public static final /* enum */ ryH_2 RIGID = new ryq_3();
    private static final /* synthetic */ ryH_2[] $VALUES;

    static {
        $VALUES = ryH_2.id_class();
    }

    public static ryH_2[] values() {
        return (ryH_2[])$VALUES.clone();
    }

    public static ryH_2 valueOf(String string) {
        return Enum.valueOf(ryH_2.class, string);
    }

    private static /* synthetic */ ryH_2[] id_class() {
        return new ryH_2[]{FULL, CENTER, RIGID};
    }

    public abstract boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4);
}

