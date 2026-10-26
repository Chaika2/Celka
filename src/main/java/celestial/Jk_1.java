/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jd_1;
import celestial.XX;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Jk_1
extends hZ_2 {
    private final Xh_1 id_class;
    private final ho_3 id_break;

    public Jk_1(ho_3 ho_32, Xh_1 xh_1, ho_3 ho_33) {
        super(Jd_1.id_class, ho_32);
        this.id_class = xh_1;
        this.id_break = ho_33;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("item", this.id_class.id_class());
        jsonObject.add("entity", this.id_break.id_class(rWH2));
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22, rdn_3 rdn_32, rzr_3 rzr_32) {
        if (!this.id_class.id_class(rdn_32)) {
            return false;
        }
        return this.id_break.id_class(rzr_32);
    }

    public static Jk_1 id_class(ho_3 ho_32, XX xX, ho_3 ho_33) {
        return new Jk_1(ho_32, xX.id_break(), ho_33);
    }
}

