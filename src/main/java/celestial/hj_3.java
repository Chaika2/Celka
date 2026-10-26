/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.an_3;
import celestial.hV_2;
import celestial.iB_2;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hj_3 {
    public static final hj_3 id_class = new hV_2().id_break();
    private final Boolean id_break;
    private final Boolean id_byte;
    private final Boolean id_protected;
    private final Boolean id_throws;
    private final Boolean id_case;

    public hj_3(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
        this.id_break = bl;
        this.id_byte = bl2;
        this.id_protected = bl3;
        this.id_throws = bl4;
        this.id_case = bl5;
    }

    public static hj_3 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "entity flags");
            Boolean bl = hj_3.id_class(jsonObject, "is_on_fire");
            Boolean bl2 = hj_3.id_class(jsonObject, "is_sneaking");
            Boolean bl3 = hj_3.id_class(jsonObject, "is_sprinting");
            Boolean bl4 = hj_3.id_class(jsonObject, "is_swimming");
            Boolean bl5 = hj_3.id_class(jsonObject, "is_baby");
            return new hj_3(bl, bl2, bl3, bl4, bl5);
        }
        return id_class;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        this.id_class(jsonObject, "is_on_fire", this.id_break);
        this.id_class(jsonObject, "is_sneaking", this.id_byte);
        this.id_class(jsonObject, "is_sprinting", this.id_protected);
        this.id_class(jsonObject, "is_swimming", this.id_throws);
        this.id_class(jsonObject, "is_baby", this.id_case);
        return jsonObject;
    }

    private void id_class(JsonObject jsonObject, String string, Boolean bl) {
        if (bl != null) {
            jsonObject.addProperty(string, bl);
        }
    }

    public boolean id_class(an_3 an_32) {
        if (this.id_break != null && an_32.Pz() != this.id_break.booleanValue()) {
            return false;
        }
        if (this.id_byte != null && an_32.x() != this.id_byte.booleanValue()) {
            return false;
        }
        if (this.id_protected != null && an_32.PF() != this.id_protected.booleanValue()) {
            return false;
        }
        if (this.id_throws != null && an_32.Py() != this.id_throws.booleanValue()) {
            return false;
        }
        return this.id_case == null || !(an_32 instanceof iB_2) || ((iB_2)an_32).n_() == this.id_case.booleanValue();
    }

    private static Boolean id_class(JsonObject jsonObject, String string) {
        return jsonObject.has(string) ? Boolean.valueOf(rpY_2.id_private(jsonObject, string)) : null;
    }
}

