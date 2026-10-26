/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xm_1;
import celestial.hA_2;
import celestial.hY_2;
import celestial.hn_3;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rye_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hL_2 {
    public static final hL_2 id_class = hA_2.id_class().id_break();
    private final Xm_1 id_break;
    private final Xm_1 id_byte;
    private final hY_2 id_protected;
    private final Boolean id_throws;
    private final hn_3 id_case;

    public hL_2() {
        this.id_break = Xm_1.id_throws;
        this.id_byte = Xm_1.id_throws;
        this.id_protected = hY_2.id_class;
        this.id_throws = null;
        this.id_case = hn_3.id_class;
    }

    public hL_2(Xm_1 xm_1, Xm_1 xm_12, hY_2 hY_22, Boolean bl, hn_3 hn_32) {
        this.id_break = xm_1;
        this.id_byte = xm_12;
        this.id_protected = hY_22;
        this.id_throws = bl;
        this.id_case = hn_32;
    }

    public boolean id_class(rhN_2 rhN_22, rye_3 rye_32, float f, float f2, boolean bl) {
        if (this == id_class) {
            return true;
        }
        if (!this.id_break.id_break(f)) {
            return false;
        }
        if (!this.id_byte.id_break(f2)) {
            return false;
        }
        if (!this.id_protected.id_class(rhN_22, rye_32.id_extends())) {
            return false;
        }
        if (this.id_throws != null && this.id_throws != bl) {
            return false;
        }
        return this.id_case.id_class(rhN_22, rye_32);
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("dealt", this.id_break.id_protected());
        jsonObject.add("taken", this.id_byte.id_protected());
        jsonObject.add("source_entity", this.id_protected.id_class());
        jsonObject.add("type", this.id_case.id_class());
        if (this.id_throws != null) {
            jsonObject.addProperty("blocked", this.id_throws);
        }
        return jsonObject;
    }

    public static hL_2 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "damage");
            Xm_1 xm_1 = Xm_1.id_class(jsonObject.get("dealt"));
            Xm_1 xm_12 = Xm_1.id_class(jsonObject.get("taken"));
            Boolean bl = jsonObject.has("blocked") ? Boolean.valueOf(rpY_2.id_private(jsonObject, "blocked")) : null;
            hY_2 hY_22 = hY_2.id_class(jsonObject.get("source_entity"));
            hn_3 hn_32 = hn_3.id_class(jsonObject.get("type"));
            return new hL_2(xm_1, xm_12, hY_22, bl, hn_32);
        }
        return id_class;
    }
}

