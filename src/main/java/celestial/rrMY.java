/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
package celestial;

import celestial.HU;
import celestial.Iq_1;
import celestial.rqO_2;
import celestial.rrJY;
import celestial.rrMK;
import celestial.rrMR;
import celestial.rrMU;
import celestial.rrMz_1;
import celestial.rrWf_1;
import celestial.rrXx_1;
import celestial.rrXz_1;
import celestial.rrbb_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class rrMY {
    public static final String id_class = "entity";
    public static final String id_break = "texture";
    public static final String id_byte = "shadowSize";
    public static final String id_protected = "type";
    public static final String id_throws = "textureSize";
    public static final String id_case = "usePlayerTexture";
    public static final String id_catch = "models";
    public static final String id_private = "animations";
    public static final String id_implements = "id";
    public static final String id_finally = "baseId";
    public static final String id_extends = "model";
    public static final String id_native = "type";
    public static final String id_volatile = "part";
    public static final String id_final = "attach";
    public static final String id_package = "invertAxis";
    public static final String id_int = "mirrorTexture";
    public static final String id_new = "translate";
    public static final String id_continue = "rotate";
    public static final String id_super = "scale";
    public static final String id_this = "boxes";
    public static final String id_else = "sprites";
    public static final String id_synchronized = "submodel";
    public static final String id_return = "submodels";
    public static final String id_public = "textureOffset";
    public static final String id_goto = "coordinates";
    public static final String id_while = "sizeAdd";
    public static final String id_try = "EntityModel";
    public static final String id_instanceof = "EntityModelPart";

    public static rqO_2 id_class(String string, String object, String string2) {
        if (!((String)object).endsWith(string2)) {
            object = (String)object + string2;
        }
        if (!((String)object).contains("/")) {
            object = string + "/" + (String)object;
        } else if (((String)object).startsWith("./")) {
            object = string + "/" + ((String)object).substring(2);
        } else if (((String)object).startsWith("~/")) {
            object = "optifine/" + ((String)object).substring(2);
        }
        return new rqO_2((String)object);
    }

    public static rrMU id_class(JsonObject jsonObject, int[] nArray, String string) {
        Object object;
        String string2 = rrWf_1.id_class(jsonObject, id_volatile);
        rrMY.id_class(string2, "Model part not specified, missing \"replace\" or \"attachTo\".");
        boolean bl = rrWf_1.id_class(jsonObject, id_final, false);
        rrMR rrMR2 = new rrMR(HU::id_protected);
        if (nArray != null) {
            rrMR2.id_return = nArray[0];
            rrMR2.id_public = nArray[1];
        }
        rrXx_1 rrXx_12 = null;
        JsonArray jsonArray = (JsonArray)jsonObject.get(id_private);
        if (jsonArray != null) {
            object = new ArrayList();
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    String string3 = (String)entry.getKey();
                    String string4 = ((JsonElement)entry.getValue()).getAsString();
                    rrXz_1 rrXz_12 = new rrXz_1(string3, string4);
                    object.add(rrXz_12);
                }
            }
            if (object.size() > 0) {
                rrXz_1[] rrXz_1Array = object.toArray(new rrXz_1[object.size()]);
                rrXx_12 = new rrXx_1(rrXz_1Array);
            }
        }
        object = rrJY.id_class(jsonObject, rrMR2, nArray, string);
        return new rrMU(string2, bl, (Iq_1)object, rrXx_12);
    }

    private static void id_class(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    public static JsonObject id_class(rqO_2 rqO_22) throws IOException, JsonParseException {
        InputStream inputStream = rrbb_3.id_class(rqO_22);
        if (inputStream == null) {
            return null;
        }
        String string = rrbb_3.id_class(inputStream, "ASCII");
        inputStream.close();
        JsonParser jsonParser = new JsonParser();
        return (JsonObject)jsonParser.parse(string);
    }

    public static rrMK id_class(JsonObject jsonObject, String string) {
        Object object;
        rrMz_1 rrMz_12 = new rrMz_1("CustomEntityModels");
        String string2 = rrMz_12.id_class(string);
        String string3 = rrMz_12.id_break(string);
        String string4 = rrWf_1.id_class(jsonObject, id_break);
        int[] nArray = rrWf_1.id_break(jsonObject.get(id_throws), 2);
        float f = rrWf_1.id_class(jsonObject, id_byte, -1.0f);
        JsonArray jsonArray = (JsonArray)jsonObject.get(id_catch);
        rrMY.id_class(jsonArray, "Missing models");
        HashMap hashMap = new HashMap();
        ArrayList<rrMU> arrayList = new ArrayList<rrMU>();
        for (int i = 0; i < jsonArray.size(); ++i) {
            object = (JsonObject)jsonArray.get(i);
            rrMY.id_class(object, hashMap);
            rrMY.id_class(object, hashMap, string3);
            rrMY.id_break(object, hashMap);
            rrMU rrMU2 = rrMY.id_class(object, nArray, string3);
            if (rrMU2 == null) continue;
            arrayList.add(rrMU2);
        }
        rrMU[] rrMUArray = arrayList.toArray(new rrMU[arrayList.size()]);
        object = null;
        if (string4 != null) {
            object = rrMY.id_class(string3, string4, ".png");
        }
        return new rrMK(string2, string3, (rqO_2)object, rrMUArray, f);
    }

    private static void id_class(JsonObject jsonObject, Map map) {
        String string = rrWf_1.id_class(jsonObject, id_finally);
        if (string != null) {
            JsonObject jsonObject2 = (JsonObject)map.get(string);
            if (jsonObject2 == null) {
                rrbb_3.id_protected("BaseID not found: " + string);
            } else {
                rrMY.id_class(jsonObject2, jsonObject);
            }
        }
    }

    private static void id_class(JsonObject jsonObject, Map map, String string) {
        String string2 = rrWf_1.id_class(jsonObject, id_extends);
        if (string2 != null) {
            rqO_2 rqO_22 = rrMY.id_class(string, string2, ".jpm");
            try {
                JsonObject jsonObject2 = rrMY.id_class(rqO_22);
                if (jsonObject2 == null) {
                    rrbb_3.id_protected("Model not found: " + rqO_22);
                    return;
                }
                rrMY.id_class(jsonObject2, jsonObject);
            }
            catch (IOException iOException) {
                rrbb_3.id_throws(iOException.getClass().getName() + ": " + iOException.getMessage());
            }
            catch (JsonParseException jsonParseException) {
                rrbb_3.id_throws(((Object)((Object)jsonParseException)).getClass().getName() + ": " + jsonParseException.getMessage());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void id_class(JsonObject jsonObject, JsonObject jsonObject2) {
        for (Map.Entry entry : jsonObject.entrySet()) {
            if (((String)entry.getKey()).equals(id_implements) || jsonObject2.has((String)entry.getKey())) continue;
            jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
        }
    }

    private static void id_break(JsonObject jsonObject, Map map) {
        String string = rrWf_1.id_class(jsonObject, id_implements);
        if (string != null) {
            if (string.length() < 1) {
                rrbb_3.id_protected("Empty model ID: " + string);
            } else if (map.containsKey(string)) {
                rrbb_3.id_protected("Duplicate model ID: " + string);
            } else {
                map.put(string, jsonObject);
            }
        }
    }
}

