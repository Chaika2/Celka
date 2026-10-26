/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XN;
import celestial.XX;
import celestial.Xc_1;
import celestial.Xe_1;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.xc_3;
import com.google.gson.JsonObject;

public class Xa_1
extends hZ_2 {
    private final XN id_class;
    private final Xh_1 id_break;

    public Xa_1(ho_3 ho_32, XN xN, Xh_1 xh_1) {
        super(Xe_1.id_class, ho_32);
        this.id_class = xN;
        this.id_break = xh_1;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("location", this.id_class.id_class());
        jsonObject.add("item", this.id_break.id_class());
        return jsonObject;
    }

    public boolean id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        return !this.id_class.id_class(rrEm_12, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5) ? false : this.id_break.id_class(rdn_32);
    }

    public static Xa_1 id_class(Xc_1 xc_1, XX xX) {
        return new Xa_1(ho_3.id_class, xc_1.id_break(), xX.id_break());
    }
}

