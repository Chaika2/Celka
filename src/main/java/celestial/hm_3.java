/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XC;
import celestial.XF;
import celestial.Xh_1;
import celestial.hT_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hu_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rpL_2;
import com.google.gson.JsonObject;

public class hm_3
extends hZ_2 {
    private final Xh_1 id_class;

    public hm_3(ho_3 ho_32, Xh_1 xh_1) {
        super(hu_3.id_class, ho_32);
        this.id_class = xh_1;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("item", this.id_class.id_class());
        return jsonObject;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_class.id_class(rdn_32);
    }

    public static hm_3 id_class(rpL_2 rpL_22) {
        return new hm_3(ho_3.id_class, new Xh_1(null, rpL_22.id_case(), XF.id_throws, XF.id_throws, hT_2.id_break, hT_2.id_break, null, XC.id_class));
    }

    public static hm_3 id_break() {
        return new hm_3(ho_3.id_class, Xh_1.id_class);
    }
}

