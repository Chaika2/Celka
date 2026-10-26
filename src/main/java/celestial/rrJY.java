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
import celestial.In_1;
import celestial.Iq_1;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.rrJR;
import celestial.rrJj_1;
import celestial.rrJo_1;
import celestial.rrMY;
import celestial.rrWf_1;
import celestial.rrbb_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class rrJY {
    private static JsonParser id_void = new JsonParser();
    public static final String id_class = "type";
    public static final String id_break = "textureSize";
    public static final String id_byte = "usePlayerTexture";
    public static final String id_protected = "models";
    public static final String id_throws = "id";
    public static final String id_case = "baseId";
    public static final String id_catch = "type";
    public static final String id_private = "texture";
    public static final String id_implements = "textureSize";
    public static final String id_finally = "attachTo";
    public static final String id_extends = "invertAxis";
    public static final String id_native = "mirrorTexture";
    public static final String id_volatile = "translate";
    public static final String id_final = "rotate";
    public static final String id_package = "scale";
    public static final String id_int = "boxes";
    public static final String id_new = "sprites";
    public static final String id_continue = "submodel";
    public static final String id_super = "submodels";
    public static final String id_this = "textureOffset";
    public static final String id_else = "coordinates";
    public static final String id_synchronized = "sizeAdd";
    public static final String id_return = "uvDown";
    public static final String id_public = "uvUp";
    public static final String id_goto = "uvNorth";
    public static final String id_while = "uvSouth";
    public static final String id_try = "uvWest";
    public static final String id_instanceof = "uvEast";
    public static final String id_throw = "uvFront";
    public static final String id_interface = "uvBack";
    public static final String id_char = "uvLeft";
    public static final String id_abstract = "uvRight";
    public static final String id_long = "PlayerItem";
    public static final String id_float = "ModelBox";

    private rrJY() {
    }

    public static Iq_1 id_class(JsonObject jsonObject, In_1 in_1, int[] nArray, String string) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        float f;
        Object object;
        Object object2;
        Object object3;
        JsonArray jsonArray2;
        int[] nArray2;
        float f2;
        Iq_1 iq_1 = new Iq_1(in_1);
        String string2 = rrWf_1.id_class(jsonObject, id_throws);
        iq_1.id_class(string2);
        iq_1.id_package = f2 = rrWf_1.id_class(jsonObject, id_package, 1.0f);
        iq_1.id_int = f2;
        iq_1.id_new = f2;
        String string3 = rrWf_1.id_class(jsonObject, id_private);
        if (string3 != null) {
            iq_1.id_class(rrMY.id_class(string, string3, ".png"));
        }
        if ((nArray2 = rrWf_1.id_break(jsonObject.get("textureSize"), 2)) == null) {
            nArray2 = nArray;
        }
        if (nArray2 != null) {
            iq_1.id_break(nArray2[0], nArray2[1]);
        }
        String string4 = rrWf_1.id_class(jsonObject, id_extends, "").toLowerCase();
        boolean bl = string4.contains("x");
        boolean bl2 = string4.contains("y");
        boolean bl3 = string4.contains("z");
        float[] fArray = rrWf_1.id_class(jsonObject.get(id_volatile), 3, new float[3]);
        if (bl) {
            fArray[0] = -fArray[0];
        }
        if (bl2) {
            fArray[1] = -fArray[1];
        }
        if (bl3) {
            fArray[2] = -fArray[2];
        }
        float[] fArray2 = rrWf_1.id_class(jsonObject.get(id_final), 3, new float[3]);
        for (int i = 0; i < fArray2.length; ++i) {
            fArray2[i] = fArray2[i] / 180.0f * rfU_2.id_break;
        }
        if (bl) {
            fArray2[0] = -fArray2[0];
        }
        if (bl2) {
            fArray2[1] = -fArray2[1];
        }
        if (bl3) {
            fArray2[2] = -fArray2[2];
        }
        iq_1.id_class(fArray[0], fArray[1], fArray[2]);
        iq_1.id_case = fArray2[0];
        iq_1.id_catch = fArray2[1];
        iq_1.id_private = fArray2[2];
        String string5 = rrWf_1.id_class(jsonObject, id_native, "").toLowerCase();
        boolean bl4 = string5.contains("u");
        boolean bl5 = string5.contains("v");
        if (bl4) {
            iq_1.id_implements = true;
        }
        if (bl5) {
            iq_1.id_final = true;
        }
        if ((jsonArray2 = jsonObject.getAsJsonArray(id_int)) != null) {
            for (int i = 0; i < jsonArray2.size(); ++i) {
                JsonObject jsonObject3 = jsonArray2.get(i).getAsJsonObject();
                object3 = rrWf_1.id_break(jsonObject3.get(id_this), 2);
                object2 = rrJY.id_break(jsonObject3);
                if (object3 == null && object2 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                object = rrWf_1.id_class(jsonObject3.get(id_else), 6);
                if (object == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl) {
                    object[0] = -object[0] - object[3];
                }
                if (bl2) {
                    object[1] = -object[1] - object[4];
                }
                if (bl3) {
                    object[2] = -object[2] - object[5];
                }
                f = rrWf_1.id_class(jsonObject3, id_synchronized, 0.0f);
                if (object2 != null) {
                    iq_1.id_class((int[][])object2, object[0], object[1], object[2], object[3], object[4], object[5], f);
                    continue;
                }
                iq_1.id_class(object3[0], object3[1]);
                iq_1.id_class(object[0], object[1], object[2], (float)((int)object[3]), (float)((int)object[4]), (float)((int)object[5]), f);
            }
        }
        if ((jsonArray = jsonObject.getAsJsonArray(id_new)) != null) {
            for (int i = 0; i < jsonArray.size(); ++i) {
                object3 = jsonArray.get(i).getAsJsonObject();
                object2 = rrWf_1.id_break(object3.get(id_this), 2);
                if (object2 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                object = rrWf_1.id_class(object3.get(id_else), 6);
                if (object == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl) {
                    object[0] = -object[0] - object[3];
                }
                if (bl2) {
                    object[1] = -object[1] - object[4];
                }
                if (bl3) {
                    object[2] = -object[2] - object[5];
                }
                f = rrWf_1.id_class((JsonObject)object3, id_synchronized, 0.0f);
                iq_1.id_class((int)object2[0], (int)object2[1]);
                iq_1.id_class(object[0], object[1], object[2], (int)object[3], (int)object[4], (int)object[5], f);
            }
        }
        if ((jsonObject2 = (JsonObject)jsonObject.get(id_continue)) != null) {
            object3 = rrJY.id_class(jsonObject2, in_1, nArray2, string);
            iq_1.id_break((Iq_1)object3);
        }
        if ((object3 = (Object)((JsonArray)jsonObject.get(id_super))) != null) {
            for (int i = 0; i < object3.size(); ++i) {
                Iq_1 iq_12;
                object = (JsonObject)object3.get(i);
                Iq_1 iq_13 = rrJY.id_class((JsonObject)object, in_1, nArray2, string);
                if (iq_13.id_byte() != null && (iq_12 = iq_1.id_break(iq_13.id_byte())) != null) {
                    rrbb_3.id_protected("Duplicate model ID: " + iq_13.id_byte());
                }
                iq_1.id_break(iq_13);
            }
        }
        return iq_1;
    }

    public static rrJo_1 id_class(JsonObject jsonObject, Dimension dimension) {
        String string = rrWf_1.id_class(jsonObject, "type");
        if (!rrbb_3.id_class((Object)string, (Object)id_float)) {
            rrbb_3.id_protected("Unknown model type: " + string);
            return null;
        }
        String string2 = rrWf_1.id_class(jsonObject, id_finally);
        int n = rrJY.id_break(string2);
        rrJj_1 rrJj_12 = new rrJj_1(HU::id_protected);
        rrJj_12.id_return = dimension.width;
        rrJj_12.id_public = dimension.height;
        Iq_1 iq_1 = rrJY.id_class(jsonObject, rrJj_12, null, null);
        return new rrJo_1(n, iq_1);
    }

    public static rrJR id_class(JsonObject jsonObject) {
        String string = rrWf_1.id_class(jsonObject, "type");
        if (!rrbb_3.id_class((Object)string, (Object)id_long)) {
            throw new JsonParseException("Unknown model type: " + string);
        }
        int[] nArray = rrWf_1.id_break(jsonObject.get("textureSize"), 2);
        rrJY.id_class(nArray, "Missing texture size");
        Dimension dimension = new Dimension(nArray[0], nArray[1]);
        boolean bl = rrWf_1.id_class(jsonObject, id_byte, false);
        JsonArray jsonArray = (JsonArray)jsonObject.get(id_protected);
        rrJY.id_class(jsonArray, "Missing elements");
        HashMap<String, JsonObject> hashMap = new HashMap<String, JsonObject>();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        new ArrayList();
        for (int i = 0; i < jsonArray.size(); ++i) {
            Object object;
            String string2;
            JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
            String string3 = rrWf_1.id_class(jsonObject2, id_case);
            if (string3 != null) {
                string2 = (JsonObject)hashMap.get(string3);
                if (string2 == null) {
                    rrbb_3.id_protected("BaseID not found: " + string3);
                    continue;
                }
                object = string2.entrySet().iterator();
                while (object.hasNext()) {
                    Map.Entry entry = (Map.Entry)object.next();
                    if (jsonObject2.has((String)entry.getKey())) continue;
                    jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
                }
            }
            if ((string2 = rrWf_1.id_class(jsonObject2, id_throws)) != null) {
                if (!hashMap.containsKey(string2)) {
                    hashMap.put(string2, jsonObject2);
                } else {
                    rrbb_3.id_protected("Duplicate model ID: " + string2);
                }
            }
            if ((object = rrJY.id_class(jsonObject2, dimension)) == null) continue;
            arrayList.add(object);
        }
        rrJo_1[] rrJo_1Array = arrayList.toArray(new rrJo_1[arrayList.size()]);
        return new rrJR(dimension, bl, rrJo_1Array);
    }

    private static rqO_2 id_class(String string) {
        int n = string.indexOf(58);
        if (n < 0) {
            return new rqO_2(string);
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return new rqO_2(string2, string3);
    }

    private static void id_class(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    private static int id_break(String string) {
        if (string == null) {
            return 0;
        }
        if (string.equals("body")) {
            return 0;
        }
        if (string.equals("head")) {
            return 1;
        }
        if (string.equals("leftArm")) {
            return 2;
        }
        if (string.equals("rightArm")) {
            return 3;
        }
        if (string.equals("leftLeg")) {
            return 4;
        }
        if (string.equals("rightLeg")) {
            return 5;
        }
        if (string.equals("cape")) {
            return 6;
        }
        rrbb_3.id_protected("Unknown attachModel: " + string);
        return 0;
    }

    private static int[][] id_break(JsonObject jsonObject) {
        int[][] nArrayArray = new int[][]{rrWf_1.id_break(jsonObject.get(id_return), 4), rrWf_1.id_break(jsonObject.get(id_public), 4), rrWf_1.id_break(jsonObject.get(id_goto), 4), rrWf_1.id_break(jsonObject.get(id_while), 4), rrWf_1.id_break(jsonObject.get(id_try), 4), rrWf_1.id_break(jsonObject.get(id_instanceof), 4)};
        if (nArrayArray[2] == null) {
            nArrayArray[2] = rrWf_1.id_break(jsonObject.get(id_throw), 4);
        }
        if (nArrayArray[3] == null) {
            nArrayArray[3] = rrWf_1.id_break(jsonObject.get(id_interface), 4);
        }
        if (nArrayArray[4] == null) {
            nArrayArray[4] = rrWf_1.id_break(jsonObject.get(id_char), 4);
        }
        if (nArrayArray[5] == null) {
            nArrayArray[5] = rrWf_1.id_break(jsonObject.get(id_abstract), 4);
        }
        boolean bl = false;
        for (int i = 0; i < nArrayArray.length; ++i) {
            if (nArrayArray[i] == null) continue;
            bl = true;
        }
        return !bl ? (Object)null : nArrayArray;
    }
}

