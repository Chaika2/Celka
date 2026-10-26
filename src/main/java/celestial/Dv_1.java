/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Dw_1;
import celestial.Ot_1;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkv_3;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class Dv_1
implements Dw_1 {
    private final rqO_2 id_class;
    private final String id_break;
    private final rkg_3 id_byte;
    private final rdb_3 id_protected;
    private final float id_throws;
    private final int id_case;
    private final Ot_1 id_catch;
    private final rqO_2 id_private;
    private final rkf_3<? extends rkv_3> id_implements;

    @Override
    public JsonObject id_byte() {
        return this.id_catch.id_break();
    }

    public Dv_1(rqO_2 rqO_22, String string, rkg_3 rkg_32, rdb_3 rdb_32, float f, int n, Ot_1 ot_1, rqO_2 rqO_23, rkf_3<? extends rkv_3> rkf_32) {
        this.id_class = rqO_22;
        this.id_break = string;
        this.id_byte = rkg_32;
        this.id_protected = rdb_32;
        this.id_throws = f;
        this.id_case = n;
        this.id_catch = ot_1;
        this.id_private = rqO_23;
        this.id_implements = rkf_32;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        if (!this.id_break.isEmpty()) {
            jsonObject.addProperty("group", this.id_break);
        }
        jsonObject.add("ingredient", this.id_byte.id_byte());
        jsonObject.addProperty("result", rVL.id_for.id_break(this.id_protected).toString());
        jsonObject.addProperty("experience", (Number)Float.valueOf(this.id_throws));
        jsonObject.addProperty("cookingtime", (Number)this.id_case);
    }

    @Override
    public rkf_3<?> id_class() {
        return this.id_implements;
    }

    @Override
    public rqO_2 id_break() {
        return this.id_class;
    }

    @Override
    public rqO_2 id_protected() {
        return this.id_private;
    }
}

