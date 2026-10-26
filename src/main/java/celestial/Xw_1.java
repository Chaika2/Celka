/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xt_1;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class Xw_1
extends hZ_2 {
    private final rqO_2 id_class;

    public Xw_1(ho_3 ho_32, rqO_2 rqO_22) {
        super(Xt_1.id_class, ho_32);
        this.id_class = rqO_22;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.addProperty("loot_table", this.id_class.toString());
        return jsonObject;
    }

    public static Xw_1 id_class(rqO_2 rqO_22) {
        return new Xw_1(ho_3.id_class, rqO_22);
    }

    public boolean id_break(rqO_2 rqO_22) {
        return this.id_class.equals(rqO_22);
    }
}

