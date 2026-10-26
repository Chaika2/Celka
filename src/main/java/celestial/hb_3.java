/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.XF;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hM_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rVL;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hb_3
extends hG_2<hM_2> {
    public static final rqO_2 id_class = new rqO_2("bee_nest_destroyed");

    public void id_class(rhN_2 rhN_22, xd_3 xd_32, rdn_3 rdn_32, int n) {
        this.id_class(rhN_22, (T hM_22) -> hM_22.id_class(xd_32, rdn_32, n));
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    private static xd_3 id_class(JsonObject jsonObject) {
        if (jsonObject.has("block")) {
            rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "block"));
            return rVL.id_strictfp.id_break(rqO_22).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + rqO_22 + "'"));
        }
        return null;
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    public hM_2 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        xd_3 xd_32 = hb_3.id_class(jsonObject);
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        XF xF = XF.id_class(jsonObject.get("num_bees_inside"));
        return new hM_2(ho_32, xd_32, xh_1, xF);
    }
}

