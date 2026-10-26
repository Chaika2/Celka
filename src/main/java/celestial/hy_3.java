/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XA;
import celestial.hH_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rhN_2;
import com.google.gson.JsonObject;

public class hy_3
extends hZ_2 {
    private final XA id_class;

    public hy_3(ho_3 ho_32, XA xA) {
        super(hH_2.id_class, ho_32);
        this.id_class = xA;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("effects", this.id_class.id_break());
        return jsonObject;
    }

    public boolean id_class(rhN_2 rhN_22) {
        return this.id_class.id_class(rhN_22);
    }

    public static hy_3 id_class(XA xA) {
        return new hy_3(ho_3.id_class, xA);
    }
}

