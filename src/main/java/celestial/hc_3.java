/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.hN_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rHO;
import celestial.rWH;
import com.google.gson.JsonObject;

public class hc_3
extends hZ_2 {
    private final XF id_class;

    public hc_3(ho_3 ho_32, XF xF) {
        super(hN_2.id_class, ho_32);
        this.id_class = xF;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("level", this.id_class.id_protected());
        return jsonObject;
    }

    public boolean id_class(rHO rHO2) {
        return this.id_class.id_byte(rHO2.id_private());
    }

    public static hc_3 id_class(XF xF) {
        return new hc_3(ho_3.id_class, xF);
    }
}

