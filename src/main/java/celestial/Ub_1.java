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
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class Ub_1
implements Dw_1 {
    private final rqO_2 id_class;
    private final String id_break;
    private final rkg_3 id_byte;
    private final rdb_3 id_protected;
    private final int id_throws;
    private final Ot_1 id_case;
    private final rqO_2 id_catch;
    private final rkf_3<?> id_private;

    @Override
    public JsonObject id_byte() {
        return this.id_case.id_break();
    }

    public Ub_1(rqO_2 rqO_22, rkf_3<?> rkf_32, String string, rkg_3 rkg_32, rdb_3 rdb_32, int n, Ot_1 ot_1, rqO_2 rqO_23) {
        this.id_class = rqO_22;
        this.id_private = rkf_32;
        this.id_break = string;
        this.id_byte = rkg_32;
        this.id_protected = rdb_32;
        this.id_throws = n;
        this.id_case = ot_1;
        this.id_catch = rqO_23;
    }

    @Override
    public rkf_3<?> id_class() {
        return this.id_private;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        if (!this.id_break.isEmpty()) {
            jsonObject.addProperty("group", this.id_break);
        }
        jsonObject.add("ingredient", this.id_byte.id_byte());
        jsonObject.addProperty("result", rVL.id_for.id_break(this.id_protected).toString());
        jsonObject.addProperty("count", (Number)this.id_throws);
    }

    @Override
    public rqO_2 id_break() {
        return this.id_class;
    }

    @Override
    public rqO_2 id_protected() {
        return this.id_catch;
    }
}

