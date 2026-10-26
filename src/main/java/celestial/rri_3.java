/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rPP;
import celestial.rPm_1;
import celestial.rPr_1;
import celestial.rTB;
import celestial.rrEm_1;

public abstract sealed class rri_3
extends Enum<rri_3>
permits rPr_1, rPP {
    public static final /* enum */ rri_3 RUN_ONE = new rPr_1();
    public static final /* enum */ rri_3 TRY_ALL = new rPP();
    private static final /* synthetic */ rri_3[] $VALUES;

    static {
        $VALUES = rri_3.id_class();
    }

    public static rri_3[] values() {
        return (rri_3[])$VALUES.clone();
    }

    public static rri_3 valueOf(String string) {
        return Enum.valueOf(rri_3.class, string);
    }

    private static /* synthetic */ rri_3[] id_class() {
        return new rri_3[]{RUN_ONE, TRY_ALL};
    }

    public abstract <E extends iB_2> void id_class(rTB<rPm_1<? super E>> var1, rrEm_1 var2, E var3, long var4);
}

