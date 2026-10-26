/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JN;
import celestial.Xm_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class JQ
extends hG_2<JN> {
    public static final rqO_2 id_class = new rqO_2("used_ender_eye");

    public void id_class(rhN_2 rhN_22, rfH_2 rfH_22) {
        double d = rhN_22.rx() - (double)rfH_22.b_();
        double d2 = rhN_22.BO() - (double)rfH_22.d_();
        double d3 = d * d + d2 * d2;
        this.id_class(rhN_22, (T jN) -> jN.id_class(d3));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public JN id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        Xm_1 xm_1 = Xm_1.id_class(jsonObject.get("distance"));
        return new JN(ho_32, xm_1);
    }
}

