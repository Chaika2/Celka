/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XH;
import celestial.XN;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.hl_3;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class Xl_1
extends hG_2<XH> {
    public static final rqO_2 id_class = new rqO_2("nether_travel");

    public void id_class(rhN_2 rhN_22, rjU_2 rjU_22) {
        this.id_class(rhN_22, (T xH) -> xH.id_class(rhN_22.id_continue(), rjU_22, rhN_22.rx(), rhN_22.re(), rhN_22.BO()));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public XH id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        XN xN = XN.id_class(jsonObject.get("entered"));
        XN xN2 = XN.id_class(jsonObject.get("exited"));
        hl_3 hl_32 = hl_3.id_class(jsonObject.get("distance"));
        return new XH(ho_32, xN, xN2, hl_32);
    }
}

