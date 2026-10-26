/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XI;
import celestial.hA_2;
import celestial.hL_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rhN_2;
import celestial.rye_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Xf_1
extends hZ_2 {
    private final hL_2 id_class;
    private final ho_3 id_break;

    public Xf_1(ho_3 ho_32, hL_2 hL_22, ho_3 ho_33) {
        super(XI.id_class, ho_32);
        this.id_class = hL_22;
        this.id_break = ho_33;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("damage", this.id_class.id_class());
        jsonObject.add("entity", this.id_break.id_class(rWH2));
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22, rzr_3 rzr_32, rye_3 rye_32, float f, float f2, boolean bl) {
        if (!this.id_class.id_class(rhN_22, rye_32, f, f2, bl)) {
            return false;
        }
        return this.id_break.id_class(rzr_32);
    }

    public static Xf_1 id_class(hA_2 hA_22) {
        return new Xf_1(ho_3.id_class, hA_22.id_break(), ho_3.id_class);
    }
}

