/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKG;
import celestial.rKJ;
import celestial.rKM;
import celestial.rKO;
import celestial.rKX;
import celestial.rKh_1;
import celestial.rSa_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import java.util.List;

public abstract sealed class rKb_1
extends Enum<rKb_1>
permits rKM, rKO, rKh_1, rKX, rKJ {
    public static final /* enum */ rKb_1 START = new rKM();
    public static final /* enum */ rKb_1 PREPARING_TO_SUMMON_PILLARS = new rKO();
    public static final /* enum */ rKb_1 SUMMONING_PILLARS = new rKh_1();
    public static final /* enum */ rKb_1 SUMMONING_DRAGON = new rKX();
    public static final /* enum */ rKb_1 END = new rKJ();
    private static final /* synthetic */ rKb_1[] $VALUES;

    static {
        $VALUES = rKb_1.id_class();
    }

    public static rKb_1[] values() {
        return (rKb_1[])$VALUES.clone();
    }

    public static rKb_1 valueOf(String string) {
        return Enum.valueOf(rKb_1.class, string);
    }

    private static /* synthetic */ rKb_1[] id_class() {
        return new rKb_1[]{START, PREPARING_TO_SUMMON_PILLARS, SUMMONING_PILLARS, SUMMONING_DRAGON, END};
    }

    public abstract void id_class(rrEm_1 var1, rKG var2, List<rSa_1> var3, int var4, rfH_2 var5);
}

