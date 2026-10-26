/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.JS;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hw_3;
import celestial.rVL;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class ht_3
extends hG_2<hw_3> {
    public static final rqO_2 id_class = new rqO_2("enter_block");

    @Override
    public rqO_2 id_class() {
        return id_class;
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

    public void id_class(rhN_2 rhN_22, xc_3 xc_32) {
        this.id_class(rhN_22, (T hw_32) -> hw_32.id_class(xc_32));
    }

    public hw_3 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        xd_3 xd_32 = ht_3.id_class(jsonObject);
        JS jS = JS.id_class(jsonObject.get("state"));
        if (xd_32 != null) {
            jS.id_class(xd_32.id_new(), (String string) -> {
                throw new JsonSyntaxException("Block " + xd_32 + " has no property " + string);
            });
        }
        return new hw_3(ho_32, xd_32, jS);
    }
}

