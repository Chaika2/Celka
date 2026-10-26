/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XK;
import celestial.XN;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Xo_1
extends hG_2<XK> {
    public final rqO_2 id_class;

    public Xo_1(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    public void id_class(rhN_2 rhN_22) {
        this.id_class(rhN_22, (T xK) -> xK.id_class(rhN_22.id_continue(), rhN_22.rx(), rhN_22.re(), rhN_22.BO()));
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    @Override
    public rqO_2 id_class() {
        return this.id_class;
    }

    public XK id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        JsonObject jsonObject2 = rpY_2.id_class(jsonObject, "location", jsonObject);
        XN xN = XN.id_class((JsonElement)jsonObject2);
        return new XK(this.id_class, ho_32, xN);
    }
}

