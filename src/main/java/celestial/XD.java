/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XU;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class XD
extends hG_2<XU> {
    public static final rqO_2 id_class = new rqO_2("recipe_unlocked");

    public static XU id_class(rqO_2 rqO_22) {
        return new XU(ho_3.id_class, rqO_22);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public void id_class(rhN_2 rhN_22, rkw_3<?> rkw_32) {
        ((hG_2)this).id_class(rhN_22, (T xU) -> xU.id_class(rkw_32));
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public XU id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "recipe"));
        return new XU(ho_32, rqO_22);
    }
}

