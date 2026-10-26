/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XD;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rkw_3;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class XU
extends hZ_2 {
    private final rqO_2 id_class;

    public XU(ho_3 ho_32, rqO_2 rqO_22) {
        super(XD.id_class, ho_32);
        this.id_class = rqO_22;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.addProperty("recipe", this.id_class.toString());
        return jsonObject;
    }

    public boolean id_class(rkw_3<?> rkw_32) {
        return this.id_class.equals(rkw_32.id_case());
    }
}

