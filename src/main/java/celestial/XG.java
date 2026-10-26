/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.Xb_1;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhz_3;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class XG
extends hG_2<Xb_1> {
    public static final rqO_2 id_class = new rqO_2("inventory_changed");

    private void id_class(rhN_2 rhN_22, rhz_3 rhz_32, rdn_3 rdn_32, int n, int n2, int n3) {
        this.id_class(rhN_22, (T xb_1) -> xb_1.id_class(rhz_32, rdn_32, n, n2, n3));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    public void id_class(rhN_2 rhN_22, rhz_3 rhz_32, rdn_3 rdn_32) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < rhz_32.id_else(); ++i) {
            rdn_3 rdn_33 = rhz_32.id_extends(i);
            if (rdn_33.id_class()) {
                ++n2;
                continue;
            }
            ++n3;
            if (rdn_33.id_char() < rdn_33.id_byte()) continue;
            ++n;
        }
        this.id_class(rhN_22, rhz_32, rdn_32, n, n2, n3);
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Xb_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        JsonObject jsonObject2 = rpY_2.id_class(jsonObject, "slots", new JsonObject());
        XF xF = XF.id_class(jsonObject2.get("occupied"));
        XF xF2 = XF.id_class(jsonObject2.get("full"));
        XF xF3 = XF.id_class(jsonObject2.get("empty"));
        Xh_1[] xh_1Array = Xh_1.id_break(jsonObject.get("items"));
        return new Xb_1(ho_32, xF, xF2, xF3, xh_1Array);
    }
}

