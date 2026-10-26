/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package celestial;

import celestial.an_3;
import celestial.rhp_3;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class rWI {
    public static final rWI id_class = new rWI(false);
    private boolean id_break;

    private rWI(boolean bl) {
        this.id_break = bl;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("in_open_water", (JsonElement)new JsonPrimitive(Boolean.valueOf(this.id_break)));
        return jsonObject;
    }

    public boolean id_class(an_3 an_32) {
        if (this == id_class) {
            return true;
        }
        if (!(an_32 instanceof rhp_3)) {
            return false;
        }
        rhp_3 rhp_32 = (rhp_3)an_32;
        return this.id_break == rhp_32.id_protected();
    }

    public static rWI id_class(boolean bl) {
        return new rWI(bl);
    }

    public static rWI id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "fishing_hook");
            JsonElement jsonElement2 = jsonObject.get("in_open_water");
            return jsonElement2 != null ? new rWI(rpY_2.id_byte(jsonElement2, "in_open_water")) : id_class;
        }
        return id_class;
    }
}

