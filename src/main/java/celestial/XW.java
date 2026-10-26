/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.Xz_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.hl_3;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class XW
extends hG_2<Xz_1> {
    public static final rqO_2 id_class = new rqO_2("levitation");

    public void id_class(rhN_2 rhN_22, rjU_2 rjU_22, int n) {
        this.id_class(rhN_22, (T xz_1) -> xz_1.id_class(rhN_22, rjU_22, n));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Xz_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        hl_3 hl_32 = hl_3.id_class(jsonObject.get("distance"));
        XF xF = XF.id_class(jsonObject.get("duration"));
        return new Xz_1(ho_32, hl_32, xF);
    }
}

