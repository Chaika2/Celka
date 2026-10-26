/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XA;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hy_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class hH_2
extends hG_2<hy_3> {
    public static final rqO_2 id_class = new rqO_2("effects_changed");

    public void id_class(rhN_2 rhN_22) {
        this.id_class(rhN_22, (T hy_32) -> hy_32.id_class(rhN_22));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hy_3 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        XA xA = XA.id_class(jsonObject.get("effects"));
        return new hy_3(ho_32, xA);
    }
}

