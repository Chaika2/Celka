/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class UE
implements Dw_1 {
    private final rqO_2 id_class;
    private final rdb_3 id_break;
    private final int id_byte;
    private final String id_protected;
    private final List<rkg_3> id_throws;
    private final Ot_1 id_case;
    private final rqO_2 id_catch;

    @Override
    public JsonObject id_byte() {
        return this.id_case.id_break();
    }

    public UE(rqO_2 rqO_22, rdb_3 rdb_32, int n, String string, List<rkg_3> list, Ot_1 ot_1, rqO_2 rqO_23) {
        this.id_class = rqO_22;
        this.id_break = rdb_32;
        this.id_byte = n;
        this.id_protected = string;
        this.id_throws = list;
        this.id_case = ot_1;
        this.id_catch = rqO_23;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        if (!this.id_protected.isEmpty()) {
            jsonObject.addProperty("group", this.id_protected);
        }
        JsonArray jsonArray = new JsonArray();
        for (rkg_3 rkg_32 : this.id_throws) {
            jsonArray.add(rkg_32.id_byte());
        }
        jsonObject.add("ingredients", (JsonElement)jsonArray);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("item", rVL.id_for.id_break(this.id_break).toString());
        if (this.id_byte > 1) {
            jsonObject2.addProperty("count", (Number)this.id_byte);
        }
        jsonObject.add("result", (JsonElement)jsonObject2);
    }

    @Override
    public rkf_3<?> id_class() {
        return rkf_3.id_break;
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

