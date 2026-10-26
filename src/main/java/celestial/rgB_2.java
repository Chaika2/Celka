/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.stream.JsonReader
 *  com.mojang.brigadier.StringReader
 */
package celestial;

import celestial.QY;
import celestial.cq_3;
import celestial.module.player.StreamerMode;
import celestial.rVa_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgQ_2;
import celestial.rgW_2;
import celestial.rgZ_2;
import celestial.rgc_3;
import celestial.rgd_3;
import celestial.rgh_3;
import celestial.rgk_3;
import celestial.rgm_3;
import celestial.rgn_3;
import celestial.rgx_3;
import celestial.rgz_3;
import celestial.rpY_2;
import celestial.rpd_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrQX;
import celestial.rrfp_3;
import celestial.rrfq_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.regex.Pattern;

public class rgB_2
implements JsonDeserializer<rVi_1>,
JsonSerializer<rgP_2> {
    private static final Gson id_class = rqR_2.id_class(() -> {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.disableHtmlEscaping();
        gsonBuilder.registerTypeHierarchyAdapter(rgP_2.class, (Object)new rgB_2());
        gsonBuilder.registerTypeHierarchyAdapter(rgc_3.class, (Object)new rgm_3());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new rpd_3());
        return gsonBuilder.create();
    });
    private static final Field id_break = rqR_2.id_class(() -> {
        try {
            new JsonReader((Reader)new StringReader(""));
            Field field = JsonReader.class.getDeclaredField("pos");
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", noSuchFieldException);
        }
    });
    private static final Field id_byte = rqR_2.id_class(() -> {
        try {
            new JsonReader((Reader)new StringReader(""));
            Field field = JsonReader.class.getDeclaredField("lineStart");
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", noSuchFieldException);
        }
    });

    private void id_class(rgc_3 rgc_32, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = jsonSerializationContext.serialize((Object)rgc_32);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }

    public static rVi_1 id_class(com.mojang.brigadier.StringReader stringReader) {
        try {
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(stringReader.getRemaining()));
            jsonReader.setLenient(false);
            rVi_1 rVi_12 = (rVi_1)id_class.getAdapter(rVi_1.class).read(jsonReader);
            stringReader.setCursor(stringReader.getCursor() + rgB_2.id_class(jsonReader));
            return rVi_12;
        }
        catch (IOException | StackOverflowError throwable) {
            throw new JsonParseException(throwable);
        }
    }

    private static int id_class(JsonReader jsonReader) {
        try {
            return id_break.getInt(jsonReader) - id_byte.getInt(jsonReader) + 1;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException("Couldn't read position of JsonReader", illegalAccessException);
        }
    }

    public rVi_1 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        rVi_1 rVi_12;
        rgZ_2 rgZ_22;
        String string;
        boolean bl;
        boolean bl2 = bl = (cq_3)QY.id_instanceof().id_class[19] != null && (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_super();
        if (jsonElement.isJsonPrimitive()) {
            if (bl) {
                String string2 = jsonElement.getAsString();
                if (((Pattern)StreamerMode.id_break[3]).matcher(string2).find()) {
                    return new rgN_2(((Pattern)StreamerMode.id_break[3]).matcher(string2).replaceAll("celestial"));
                }
                if (((Pattern)StreamerMode.id_break[4]).matcher(string2).find()) {
                    return new rgN_2(((Pattern)StreamerMode.id_break[4]).matcher(string2).replaceAll("CelAC"));
                }
            }
            return new rgN_2(jsonElement.getAsString());
        }
        if (!jsonElement.isJsonObject()) {
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                rVi_1 rVi_13 = null;
                for (JsonElement jsonElement2 : jsonArray) {
                    rVi_1 rVi_14 = this.id_class(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                    if (rVi_13 == null) {
                        rVi_13 = rVi_14;
                        continue;
                    }
                    rVi_13.id_class(rVi_14);
                }
                return rVi_13;
            }
            throw new JsonParseException("Don't know how to turn " + jsonElement + " into a Component");
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.has("text")) {
            rgZ_22 = bl ? (((Pattern)StreamerMode.id_break[3]).matcher(string = rpY_2.id_case(jsonObject, "text")).find() ? new rgN_2(((Pattern)StreamerMode.id_break[3]).matcher(string).replaceAll("celestial")) : (((Pattern)StreamerMode.id_break[4]).matcher(string).find() ? new rgN_2(((Pattern)StreamerMode.id_break[4]).matcher(string).replaceAll("CelAC")) : new rgN_2(rpY_2.id_case(jsonObject, "text")))) : new rgN_2(rpY_2.id_case(jsonObject, "text"));
        } else if (jsonObject.has("translate")) {
            string = rpY_2.id_case(jsonObject, "translate");
            if (jsonObject.has("with")) {
                JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "with");
                Object[] objectArray = new Object[jsonArray.size()];
                for (int i = 0; i < objectArray.length; ++i) {
                    objectArray[i] = this.id_class(jsonArray.get(i), type, jsonDeserializationContext);
                    if (!(objectArray[i] instanceof rgN_2) || !((rgZ_2)(rVi_12 = (rgN_2)objectArray[i])).id_class().id_catch() || !((rgZ_2)rVi_12).id_protected().isEmpty()) continue;
                    objectArray[i] = ((rgN_2)rVi_12).id_private();
                }
                rgZ_22 = new rgn_3(string, objectArray);
            } else {
                rgZ_22 = new rgn_3(string);
            }
        } else if (jsonObject.has("score")) {
            string = rpY_2.id_native(jsonObject, "score");
            if (!string.has("name") || !string.has("objective")) {
                throw new JsonParseException("A score component needs a least a name and an objective");
            }
            rgZ_22 = new rgz_3(rpY_2.id_case((JsonObject)string, "name"), rpY_2.id_case((JsonObject)string, "objective"));
        } else if (jsonObject.has("selector")) {
            rgZ_22 = new rgQ_2(rpY_2.id_case(jsonObject, "selector"));
        } else if (jsonObject.has("keybind")) {
            rgZ_22 = new rgh_3(rpY_2.id_case(jsonObject, "keybind"));
        } else {
            if (!jsonObject.has("nbt")) {
                throw new JsonParseException("Don't know how to turn " + jsonElement + " into a Component");
            }
            string = rpY_2.id_case(jsonObject, "nbt");
            boolean bl3 = rpY_2.id_class(jsonObject, "interpret", false);
            if (jsonObject.has("block")) {
                rgZ_22 = new rgd_3(string, bl3, rpY_2.id_case(jsonObject, "block"));
            } else if (jsonObject.has("entity")) {
                rgZ_22 = new rgk_3(string, bl3, rpY_2.id_case(jsonObject, "entity"));
            } else {
                if (!jsonObject.has("storage")) {
                    throw new JsonParseException("Don't know how to turn " + jsonElement + " into a Component");
                }
                rgZ_22 = new rgW_2(string, bl3, new rqO_2(rpY_2.id_case(jsonObject, "storage")));
            }
        }
        if (jsonObject.has("extra")) {
            string = rpY_2.id_volatile(jsonObject, "extra");
            if (string.size() <= 0) {
                throw new JsonParseException("Unexpected empty array of components");
            }
            for (int i = 0; i < string.size(); ++i) {
                rgZ_22.id_class(this.id_class(string.get(i), type, jsonDeserializationContext));
            }
        }
        rgZ_22.id_class((rgc_3)jsonDeserializationContext.deserialize(jsonElement, rgc_3.class));
        if (bl) {
            int n;
            rgc_3 rgc_32;
            string = rgZ_22.getString().toLowerCase();
            if (string.contains("funtime")) {
                StreamerMode.id_class(rgZ_22, "funtime", (Map)StreamerMode.id_break[5]);
            }
            if (string.contains("\u0444\u0430\u043d\u0442\u0430\u0439\u043c")) {
                StreamerMode.id_class(rgZ_22, "\u0444\u0430\u043d\u0442\u0430\u0439\u043c", (Map)StreamerMode.id_break[5]);
            }
            if (string.contains("funac")) {
                StreamerMode.id_class(rgZ_22, "funac", (Map)StreamerMode.id_break[6]);
            }
            if ((rgc_32 = rgZ_22.id_class()).id_class() != null && StreamerMode.id_class(n = rgc_32.id_class().id_class())) {
                rgZ_22.id_class(rgc_32.id_class((rVa_1)StreamerMode.id_break[7]));
            }
            for (rgP_2 rgP_22 : rgZ_22.id_protected()) {
                int n2;
                rgc_3 rgc_33;
                if (!(rgP_22 instanceof rVi_1) || (rgc_33 = (rVi_12 = (rVi_1)rgP_22).id_class()).id_class() == null || !StreamerMode.id_class(n2 = rgc_33.id_class().id_class())) continue;
                rVi_12.id_class(rgc_33.id_class((rVa_1)StreamerMode.id_break[7]));
            }
        }
        return rgZ_22;
    }

    public static String id_class(rgP_2 rgP_22) {
        return id_class.toJson((Object)rgP_22);
    }

    public JsonElement id_class(rgP_2 rgP_22, Type type, JsonSerializationContext jsonSerializationContext) {
        Object object;
        JsonObject jsonObject = new JsonObject();
        if (!rgP_22.id_class().id_catch()) {
            this.id_class(rgP_22.id_class(), jsonObject, jsonSerializationContext);
        }
        if (!rgP_22.id_protected().isEmpty()) {
            object = new JsonArray();
            for (rgP_2 objectArray : rgP_22.id_protected()) {
                object.add(this.id_class(objectArray, objectArray.getClass(), jsonSerializationContext));
            }
            jsonObject.add("extra", (JsonElement)object);
        }
        if (rgP_22 instanceof rgN_2) {
            jsonObject.addProperty("text", ((rgN_2)rgP_22).id_private());
        } else if (rgP_22 instanceof rgn_3) {
            object = (rgn_3)rgP_22;
            jsonObject.addProperty("translate", ((rgn_3)object).id_implements());
            if (((rgn_3)object).id_extends() != null && ((rgn_3)object).id_extends().length > 0) {
                var6_6 = new JsonArray();
                for (Object object2 : ((rgn_3)object).id_extends()) {
                    if (object2 instanceof rgP_2) {
                        var6_6.add(this.id_class((rgP_2)object2, object2.getClass(), jsonSerializationContext));
                        continue;
                    }
                    var6_6.add((JsonElement)new JsonPrimitive(String.valueOf(object2)));
                }
                jsonObject.add("with", (JsonElement)var6_6);
            }
        } else if (rgP_22 instanceof rgz_3) {
            object = (rgz_3)rgP_22;
            var6_6 = new JsonObject();
            var6_6.addProperty("name", ((rgz_3)object).id_private());
            var6_6.addProperty("objective", ((rgz_3)object).id_implements());
            jsonObject.add("score", (JsonElement)var6_6);
        } else if (rgP_22 instanceof rgQ_2) {
            object = (rgQ_2)rgP_22;
            jsonObject.addProperty("selector", ((rgQ_2)object).id_private());
        } else if (rgP_22 instanceof rgh_3) {
            object = (rgh_3)rgP_22;
            jsonObject.addProperty("keybind", ((rgh_3)object).id_implements());
        } else {
            if (!(rgP_22 instanceof rgx_3)) {
                throw new IllegalArgumentException("Don't know how to serialize " + rgP_22 + " as a Component");
            }
            object = (rgx_3)rgP_22;
            jsonObject.addProperty("nbt", ((rgx_3)object).id_private());
            jsonObject.addProperty("interpret", Boolean.valueOf(((rgx_3)object).id_implements()));
            if (rgP_22 instanceof rgd_3) {
                var6_6 = (rgd_3)rgP_22;
                jsonObject.addProperty("block", ((rgd_3)var6_6).id_extends());
            } else if (rgP_22 instanceof rgk_3) {
                var6_6 = (rgk_3)rgP_22;
                jsonObject.addProperty("entity", ((rgk_3)var6_6).id_extends());
            } else {
                if (!(rgP_22 instanceof rgW_2)) {
                    throw new IllegalArgumentException("Don't know how to serialize " + rgP_22 + " as a Component");
                }
                var6_6 = (rgW_2)rgP_22;
                jsonObject.addProperty("storage", ((rgW_2)var6_6).id_extends().toString());
            }
        }
        return jsonObject;
    }

    public static rVi_1 id_class(String string) {
        return rpY_2.id_class(id_class, string, rVi_1.class, false);
    }

    public static rVi_1 id_class(JsonElement jsonElement) {
        return (rVi_1)id_class.fromJson(jsonElement, rVi_1.class);
    }

    public static JsonElement id_break(rgP_2 rgP_22) {
        return id_class.toJsonTree((Object)rgP_22);
    }

    public static rVi_1 id_break(String string) {
        return rpY_2.id_class(id_class, string, rVi_1.class, true);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((rgP_2)object, type, jsonSerializationContext);
    }
}

