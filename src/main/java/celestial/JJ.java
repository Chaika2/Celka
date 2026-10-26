/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jx_1;
import celestial.XF;
import celestial.an_3;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class JJ
extends hG_2<Jx_1> {
    public static final rqO_2 id_class = new rqO_2("target_hit");

    public void id_class(rhN_2 rhN_22, an_3 an_32, rjU_2 rjU_22, int n) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, an_32);
        this.id_class(rhN_22, (T jx_1) -> jx_1.id_class(rzr_32, rjU_22, n));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Jx_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        XF xF = XF.id_class(jsonObject.get("signal_strength"));
        ho_3 ho_33 = ho_3.id_class(jsonObject, "projectile", rWl_12);
        return new Jx_1(ho_32, xF, ho_33);
    }
}

