/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hA_2;
import celestial.hL_2;
import celestial.hZ_2;
import celestial.hg_3;
import celestial.ho_3;
import celestial.rWH;
import celestial.rhN_2;
import celestial.rye_3;
import com.google.gson.JsonObject;

public class hR_2
extends hZ_2 {
    private final hL_2 id_class;

    public hR_2(ho_3 ho_32, hL_2 hL_22) {
        super(hg_3.id_class, ho_32);
        this.id_class = hL_22;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("damage", this.id_class.id_class());
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22, rye_3 rye_32, float f, float f2, boolean bl) {
        return this.id_class.id_class(rhN_22, rye_32, f, f2, bl);
    }

    public static hR_2 id_class(hA_2 hA_22) {
        return new hR_2(ho_3.id_class, hA_22.id_break());
    }
}

