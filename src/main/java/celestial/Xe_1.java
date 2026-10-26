/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XN;
import celestial.Xa_1;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.xc_3;
import com.google.gson.JsonObject;

public class Xe_1
extends hG_2<Xa_1> {
    public static final rqO_2 id_class = new rqO_2("item_used_on_block");

    public void id_class(rhN_2 rhN_22, rfH_2 rfH_22, rdn_3 rdn_32) {
        xc_3 xc_32 = rhN_22.id_continue().id_byte(rfH_22);
        this.id_class(rhN_22, (T xa_1) -> xa_1.id_class(xc_32, rhN_22.id_continue(), rfH_22, rdn_32));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Xa_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        XN xN = XN.id_class(jsonObject.get("location"));
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        return new Xa_1(ho_32, xN, xh_1);
    }
}

