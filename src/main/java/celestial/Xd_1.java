/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xk_1;
import celestial.an_3;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.hn_3;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rye_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Xd_1
extends hG_2<Xk_1> {
    public final rqO_2 id_class;

    public Xd_1(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    public void id_class(rhN_2 rhN_22, an_3 an_32, rye_3 rye_32) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, an_32);
        this.id_class(rhN_22, (T xk_1) -> xk_1.id_class(rhN_22, rzr_32, rye_32));
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    @Override
    public rqO_2 id_class() {
        return this.id_class;
    }

    public Xk_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return new Xk_1(this.id_class, ho_32, ho_3.id_class(jsonObject, "entity", rWl_12), hn_3.id_class(jsonObject.get("killing_blow")));
    }
}

