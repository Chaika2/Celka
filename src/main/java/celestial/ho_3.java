/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hY_2;
import celestial.rQF;
import celestial.rQx_1;
import celestial.rQz_1;
import celestial.rWH;
import celestial.rWl_1;
import celestial.rpY_2;
import celestial.rzB_2;
import celestial.rzr_3;
import celestial.rzz_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.function.Predicate;

public class ho_3 {
    public static final ho_3 id_class = new ho_3(new rQz_1[0]);
    private final rQz_1[] id_break;
    private final Predicate<rzr_3> id_byte;

    private ho_3(rQz_1[] rQz_1Array) {
        this.id_break = rQz_1Array;
        this.id_byte = rQF.id_class(rQz_1Array);
    }

    public boolean id_class(rzr_3 rzr_32) {
        return this.id_byte.test(rzr_32);
    }

    public JsonElement id_class(rWH rWH2) {
        return this.id_break.length == 0 ? JsonNull.INSTANCE : rWH2.id_class(this.id_break);
    }

    public static JsonElement id_class(ho_3[] ho_3Array, rWH rWH2) {
        if (ho_3Array.length == 0) {
            return JsonNull.INSTANCE;
        }
        JsonArray jsonArray = new JsonArray();
        for (ho_3 ho_32 : ho_3Array) {
            jsonArray.add(ho_32.id_class(rWH2));
        }
        return jsonArray;
    }

    public static ho_3 id_class(hY_2 hY_22) {
        if (hY_22 == hY_2.id_class) {
            return id_class;
        }
        rQz_1 rQz_12 = rQx_1.id_class(rzB_2.THIS, hY_22).build();
        return new ho_3(new rQz_1[]{rQz_12});
    }

    public static ho_3 id_class(JsonObject jsonObject, String string, rWl_1 rWl_12) {
        JsonElement jsonElement = jsonObject.get(string);
        return ho_3.id_class(string, rWl_12, jsonElement);
    }

    private static ho_3 id_class(String string, rWl_1 rWl_12, JsonElement jsonElement) {
        if (jsonElement != null && jsonElement.isJsonArray()) {
            rQz_1[] rQz_1Array = rWl_12.id_class(jsonElement.getAsJsonArray(), rWl_12.id_class().toString() + "/" + string, rzz_3.id_finally);
            return new ho_3(rQz_1Array);
        }
        hY_2 hY_22 = hY_2.id_class(jsonElement);
        return ho_3.id_class(hY_22);
    }

    public static ho_3 id_class(rQz_1 ... rQz_1Array) {
        return new ho_3(rQz_1Array);
    }

    public static ho_3[] id_break(JsonObject jsonObject, String string, rWl_1 rWl_12) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonArray jsonArray = rpY_2.id_implements(jsonElement, string);
            ho_3[] ho_3Array = new ho_3[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); ++i) {
                ho_3Array[i] = ho_3.id_class(string + "[" + i + "]", rWl_12, jsonArray.get(i));
            }
            return ho_3Array;
        }
        return new ho_3[0];
    }
}

