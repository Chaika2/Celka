/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.XF;
import celestial.ev_3;
import celestial.rVL;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class hT_2 {
    public static final hT_2 id_class = new hT_2();
    public static final hT_2[] id_break = new hT_2[0];
    private final ev_3 id_byte;
    private final XF id_protected;

    public hT_2() {
        this.id_byte = null;
        this.id_protected = XF.id_throws;
    }

    public hT_2(ev_3 ev_32, XF xF) {
        this.id_byte = ev_32;
        this.id_protected = xF;
    }

    private static /* synthetic */ JsonSyntaxException id_class(rqO_2 rqO_22) {
        return new JsonSyntaxException("Unknown enchantment '" + rqO_22 + "'");
    }

    public static hT_2 id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            Object object;
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "enchantment");
            ev_3 ev_32 = null;
            if (jsonObject.has("enchantment")) {
                object = new rqO_2(rpY_2.id_case(jsonObject, "enchantment"));
                ev_32 = rVL.id_boolean.id_break((rqO_2)object).orElseThrow(() -> hT_2.id_class((rqO_2)object));
            }
            object = XF.id_class(jsonObject.get("levels"));
            return new hT_2(ev_32, (XF)object);
        }
        return id_class;
    }

    public boolean id_class(Map<ev_3, Integer> map) {
        if (this.id_byte != null) {
            if (!map.containsKey(this.id_byte)) {
                return false;
            }
            int n = map.get(this.id_byte);
            if (this.id_protected != null && !this.id_protected.id_byte(n)) {
                return false;
            }
        } else if (this.id_protected != null) {
            for (Integer n : map.values()) {
                if (!this.id_protected.id_byte(n)) continue;
                return true;
            }
            return false;
        }
        return true;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_byte != null) {
            jsonObject.addProperty("enchantment", rVL.id_boolean.id_break(this.id_byte).toString());
        }
        jsonObject.add("levels", this.id_protected.id_protected());
        return jsonObject;
    }

    public static hT_2[] id_break(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonArray jsonArray = rpY_2.id_implements(jsonElement, "enchantments");
            hT_2[] hT_2Array = new hT_2[jsonArray.size()];
            for (int i = 0; i < hT_2Array.length; ++i) {
                hT_2Array[i] = hT_2.id_class(jsonArray.get(i));
            }
            return hT_2Array;
        }
        return id_break;
    }
}

