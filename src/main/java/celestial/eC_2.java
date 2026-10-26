/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eH_2;
import celestial.eI_2;
import celestial.eR_2;
import celestial.eT_2;
import celestial.eV_2;
import celestial.ef_3;
import celestial.eg_3;
import celestial.ej_3;
import celestial.el_3;
import celestial.ep_3;
import celestial.eq_3;
import celestial.et_3;
import celestial.ew_3;
import celestial.ey_3;
import celestial.rdb_3;

public abstract sealed class eC_2
extends Enum<eC_2>
permits el_3, et_3, ew_3, eI_2, ef_3, ej_3, eV_2, eg_3, eR_2, eH_2, ey_3, ep_3, eq_3, eT_2 {
    public static final /* enum */ eC_2 ARMOR = new el_3();
    public static final /* enum */ eC_2 ARMOR_FEET = new et_3();
    public static final /* enum */ eC_2 ARMOR_LEGS = new ew_3();
    public static final /* enum */ eC_2 ARMOR_CHEST = new eI_2();
    public static final /* enum */ eC_2 ARMOR_HEAD = new ef_3();
    public static final /* enum */ eC_2 WEAPON = new ej_3();
    public static final /* enum */ eC_2 DIGGER = new eV_2();
    public static final /* enum */ eC_2 FISHING_ROD = new eg_3();
    public static final /* enum */ eC_2 TRIDENT = new eR_2();
    public static final /* enum */ eC_2 BREAKABLE = new eH_2();
    public static final /* enum */ eC_2 BOW = new ey_3();
    public static final /* enum */ eC_2 WEARABLE = new ep_3();
    public static final /* enum */ eC_2 CROSSBOW = new eq_3();
    public static final /* enum */ eC_2 VANISHABLE = new eT_2();
    private static final /* synthetic */ eC_2[] $VALUES;

    static {
        $VALUES = eC_2.id_class();
    }

    public static eC_2[] values() {
        return (eC_2[])$VALUES.clone();
    }

    public static eC_2 valueOf(String string) {
        return Enum.valueOf(eC_2.class, string);
    }

    private static /* synthetic */ eC_2[] id_class() {
        return new eC_2[]{ARMOR, ARMOR_FEET, ARMOR_LEGS, ARMOR_CHEST, ARMOR_HEAD, WEAPON, DIGGER, FISHING_ROD, TRIDENT, BREAKABLE, BOW, WEARABLE, CROSSBOW, VANISHABLE};
    }

    public abstract boolean id_class(rdb_3 var1);
}

