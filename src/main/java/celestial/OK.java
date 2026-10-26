/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.Oo_1;
import celestial.hP_2;
import celestial.hr_3;
import celestial.rWH;
import celestial.rWl_1;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;

public class OK {
    private final hr_3 id_class;

    public static Map<String, OK> id_byte(ruu_3 ruu_32) {
        HashMap hashMap = Maps.newHashMap();
        int n = ruu_32.id_case();
        for (int i = 0; i < n; ++i) {
            hashMap.put(ruu_32.id_throws(Short.MAX_VALUE), OK.id_break(ruu_32));
        }
        return hashMap;
    }

    public OK(hr_3 hr_32) {
        this.id_class = hr_32;
    }

    public OK() {
        this.id_class = null;
    }

    public hr_3 id_class() {
        return this.id_class;
    }

    public static void id_class(Map<String, OK> map, ruu_3 ruu_32) {
        ruu_32.id_protected(map.size());
        for (Map.Entry<String, OK> entry : map.entrySet()) {
            ruu_32.id_class(entry.getKey());
            entry.getValue().id_class(ruu_32);
        }
    }

    public static OK id_class(JsonObject jsonObject, rWl_1 rWl_12) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "trigger"));
        hP_2 hP_22 = Oo_1.id_class(rqO_22);
        if (hP_22 == null) {
            throw new JsonSyntaxException("Invalid criterion trigger: " + rqO_22);
        }
        Object t = hP_22.id_class(rpY_2.id_class(jsonObject, "conditions", new JsonObject()), rWl_12);
        return new OK((hr_3)t);
    }

    public void id_class(ruu_3 ruu_32) {
    }

    public JsonElement id_break() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("trigger", this.id_class.id_class().toString());
        JsonObject jsonObject2 = this.id_class.id_class(rWH.id_class);
        if (jsonObject2.size() != 0) {
            jsonObject.add("conditions", (JsonElement)jsonObject2);
        }
        return jsonObject;
    }

    public static Map<String, OK> id_break(JsonObject jsonObject, rWl_1 rWl_12) {
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            hashMap.put((String)entry.getKey(), OK.id_class(rpY_2.id_private((JsonElement)entry.getValue(), "criterion"), rWl_12));
        }
        return hashMap;
    }

    public static OK id_break(ruu_3 ruu_32) {
        return new OK();
    }
}

