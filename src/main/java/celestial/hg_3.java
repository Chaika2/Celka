/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hG_2;
import celestial.hL_2;
import celestial.hR_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rye_3;
import com.google.gson.JsonObject;

public class hg_3
extends hG_2<hR_2> {
    public static final rqO_2 id_class = new rqO_2("entity_hurt_player");

    public void id_class(rhN_2 rhN_22, rye_3 rye_32, float f, float f2, boolean bl) {
        this.id_class(rhN_22, (T hR_22) -> hR_22.id_class(rhN_22, rye_32, f, f2, bl));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hR_2 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        hL_2 hL_22 = hL_2.id_class(jsonObject.get("damage"));
        return new hR_2(ho_32, hL_22);
    }
}

