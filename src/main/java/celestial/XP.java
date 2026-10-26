/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XB;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhp_3;
import celestial.rqO_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;
import java.util.Collection;

public class XP
extends hG_2<XB> {
    public static final rqO_2 id_class = new rqO_2("fishing_rod_hooked");

    public void id_class(rhN_2 rhN_22, rdn_3 rdn_32, rhp_3 rhp_32, Collection<rdn_3> collection) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, rhp_32.id_catch() != null ? rhp_32.id_catch() : rhp_32);
        this.id_class(rhN_22, (T xB) -> xB.id_class(rdn_32, rzr_32, collection));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public XB id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("rod"));
        ho_3 ho_33 = ho_3.id_class(jsonObject, "entity", rWl_12);
        Xh_1 xh_12 = Xh_1.id_class(jsonObject.get("item"));
        return new XB(ho_32, xh_1, ho_33, xh_12);
    }
}

