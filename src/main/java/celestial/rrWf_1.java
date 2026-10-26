/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rrWf_1 {
    public static String id_class(JsonObject jsonObject, String string, String string2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? string2 : jsonElement.getAsString();
    }

    public static float[] id_class(JsonElement jsonElement, int n) {
        return rrWf_1.id_class(jsonElement, n, (float[])null);
    }

    public static float[] id_class(JsonElement jsonElement, int n, float[] fArray) {
        if (jsonElement == null) {
            return fArray;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n + ", array: " + jsonArray);
        }
        float[] fArray2 = new float[jsonArray.size()];
        for (int i = 0; i < fArray2.length; ++i) {
            fArray2[i] = jsonArray.get(i).getAsFloat();
        }
        return fArray2;
    }

    public static int[] id_class(JsonElement jsonElement, int n, int[] nArray) {
        if (jsonElement == null) {
            return nArray;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n + ", array: " + jsonArray);
        }
        int[] nArray2 = new int[jsonArray.size()];
        for (int i = 0; i < nArray2.length; ++i) {
            nArray2[i] = jsonArray.get(i).getAsInt();
        }
        return nArray2;
    }

    public static float id_class(JsonObject jsonObject, String string, float f) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? f : jsonElement.getAsFloat();
    }

    public static boolean id_class(JsonObject jsonObject, String string, boolean bl) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? bl : jsonElement.getAsBoolean();
    }

    public static String id_class(JsonObject jsonObject, String string) {
        return rrWf_1.id_class(jsonObject, string, (String)null);
    }

    public static int[] id_break(JsonElement jsonElement, int n) {
        return rrWf_1.id_class(jsonElement, n, (int[])null);
    }
}

