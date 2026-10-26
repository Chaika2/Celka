/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hZ_2;
import celestial.ho_3;
import celestial.hx_3;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rWH;
import com.google.gson.JsonObject;

public class hd_3
extends hZ_2 {
    private final rLi_1 id_class;

    public hd_3(ho_3 ho_32, rLi_1 rLi_12) {
        super(hx_3.id_class, ho_32);
        this.id_class = rLi_12;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        if (this.id_class != null) {
            jsonObject.addProperty("potion", rVL.id_double.id_break(this.id_class).toString());
        }
        return jsonObject;
    }

    public boolean id_class(rLi_1 rLi_12) {
        return this.id_class == null || this.id_class == rLi_12;
    }

    public static hd_3 id_break() {
        return new hd_3(ho_3.id_class, (rLi_1)null);
    }
}

