/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jz_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class JW
extends hG_2<Jz_1> {
    public static final rqO_2 id_class = new rqO_2("tick");

    public void id_class(rhN_2 rhN_22) {
        this.id_class(rhN_22, (T jz_1) -> true);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Jz_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return new Jz_1(ho_32);
    }
}

