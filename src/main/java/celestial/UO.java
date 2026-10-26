/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class UO
implements Dw_1 {
    private final rqO_2 id_class;
    private final rkg_3 id_break;
    private final rkg_3 id_byte;
    private final rdb_3 id_protected;
    private final Ot_1 id_throws;
    private final rqO_2 id_case;
    private final rkf_3<?> id_catch;

    @Override
    public JsonObject id_byte() {
        return this.id_throws.id_break();
    }

    public UO(rqO_2 rqO_22, rkf_3<?> rkf_32, rkg_3 rkg_32, rkg_3 rkg_33, rdb_3 rdb_32, Ot_1 ot_1, rqO_2 rqO_23) {
        this.id_class = rqO_22;
        this.id_catch = rkf_32;
        this.id_break = rkg_32;
        this.id_byte = rkg_33;
        this.id_protected = rdb_32;
        this.id_throws = ot_1;
        this.id_case = rqO_23;
    }

    @Override
    public rkf_3<?> id_class() {
        return this.id_catch;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        jsonObject.add("base", this.id_break.id_byte());
        jsonObject.add("addition", this.id_byte.id_byte());
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("item", rVL.id_for.id_break(this.id_protected).toString());
        jsonObject.add("result", (JsonElement)jsonObject2);
    }

    @Override
    public rqO_2 id_break() {
        return this.id_class;
    }

    @Override
    public rqO_2 id_protected() {
        return this.id_case;
    }
}

