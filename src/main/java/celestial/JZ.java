/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jm_1;
import celestial.Xh_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class JZ
extends hZ_2 {
    private final ho_3 id_class;
    private final Xh_1 id_break;

    public JZ(ho_3 ho_32, ho_3 ho_33, Xh_1 xh_1) {
        super(Jm_1.id_class, ho_32);
        this.id_class = ho_33;
        this.id_break = xh_1;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("item", this.id_break.id_class());
        jsonObject.add("villager", this.id_class.id_class(rWH2));
        return jsonObject;
    }

    public boolean id_class(rzr_3 rzr_32, rdn_3 rdn_32) {
        if (!this.id_class.id_class(rzr_32)) {
            return false;
        }
        return this.id_break.id_class(rdn_32);
    }

    public static JZ id_break() {
        return new JZ(ho_3.id_class, ho_3.id_class, Xh_1.id_class);
    }
}

