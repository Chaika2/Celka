/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hZ_2;
import celestial.ho_3;
import celestial.hv_3;
import celestial.rWH;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class hF_2
extends hZ_2 {
    private final ho_3 id_class;
    private final ho_3 id_break;

    public hF_2(ho_3 ho_32, ho_3 ho_33, ho_3 ho_34) {
        super(hv_3.id_class, ho_32);
        this.id_class = ho_33;
        this.id_break = ho_34;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("zombie", this.id_class.id_class(rWH2));
        jsonObject.add("villager", this.id_break.id_class(rWH2));
        return jsonObject;
    }

    public boolean id_class(rzr_3 rzr_32, rzr_3 rzr_33) {
        if (!this.id_class.id_class(rzr_32)) {
            return false;
        }
        return this.id_break.id_class(rzr_33);
    }

    public static hF_2 id_break() {
        return new hF_2(ho_3.id_class, ho_3.id_class, ho_3.id_class);
    }
}

