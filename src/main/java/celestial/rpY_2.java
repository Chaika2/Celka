/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rVL;
import celestial.rdb_3;
import celestial.rqO_2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.lang3.StringUtils;

public class rpY_2 {
    private static final Gson id_class = new GsonBuilder().create();

    public static boolean id_byte(JsonObject jsonObject, String string) {
        return !rpY_2.id_throws(jsonObject, string) ? false : jsonObject.get(string).isJsonArray();
    }

    public static String id_byte(JsonElement jsonElement) {
        String string = StringUtils.abbreviateMiddle((String)String.valueOf(jsonElement), (String)"...", (int)10);
        if (jsonElement == null) {
            return "null (missing)";
        }
        if (jsonElement.isJsonNull()) {
            return "null (json)";
        }
        if (jsonElement.isJsonArray()) {
            return "an array (" + string + ")";
        }
        if (jsonElement.isJsonObject()) {
            return "an object (" + string + ")";
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                return "a number (" + string + ")";
            }
            if (jsonPrimitive.isBoolean()) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }

    public static boolean id_byte(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Boolean, was " + rpY_2.id_byte(jsonElement));
    }

    public static boolean id_class(JsonElement jsonElement) {
        return !jsonElement.isJsonPrimitive() ? false : jsonElement.getAsJsonPrimitive().isString();
    }

    public static byte id_class(JsonObject jsonObject, String string, byte by) {
        return jsonObject.has(string) ? rpY_2.id_catch(jsonObject.get(string), string) : by;
    }

    public static <T> T id_class(Gson gson, Reader reader, TypeToken<T> typeToken) {
        return rpY_2.id_class(gson, reader, typeToken, false);
    }

    public static <T> T id_class(Gson gson, String string, Class<T> clazz, boolean bl) {
        return rpY_2.id_class(gson, (Reader)new StringReader(string), clazz, bl);
    }

    public static <T> T id_class(Gson gson, Reader reader, Class<T> clazz, boolean bl) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(bl);
            return (T)gson.getAdapter(clazz).read(jsonReader);
        }
        catch (IOException iOException) {
            throw new JsonParseException((Throwable)iOException);
        }
    }

    public static <T> T id_class(Gson gson, Reader reader, Class<T> clazz) {
        return rpY_2.id_class(gson, reader, clazz, false);
    }

    public static <T> T id_class(Gson gson, String string, TypeToken<T> typeToken) {
        return rpY_2.id_class(gson, string, typeToken, false);
    }

    public static int id_class(JsonObject jsonObject, String string, int n) {
        return jsonObject.has(string) ? rpY_2.id_case(jsonObject.get(string), string) : n;
    }

    public static <T> T id_class(JsonElement jsonElement, String string, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
        if (jsonElement != null) {
            return (T)jsonDeserializationContext.deserialize(jsonElement, clazz);
        }
        throw new JsonSyntaxException("Missing " + string);
    }

    public static <T> T id_class(JsonObject jsonObject, String string, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
        if (jsonObject.has(string)) {
            return rpY_2.id_class(jsonObject.get(string), string, jsonDeserializationContext, clazz);
        }
        throw new JsonSyntaxException("Missing " + string);
    }

    public static <T> T id_class(JsonObject jsonObject, String string, T t, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
        return jsonObject.has(string) ? rpY_2.id_class(jsonObject.get(string), string, jsonDeserializationContext, clazz) : t;
    }

    public static boolean id_class(JsonObject jsonObject, String string) {
        return !rpY_2.id_protected(jsonObject, string) ? false : jsonObject.getAsJsonPrimitive(string).isString();
    }

    public static JsonObject id_class(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        return jsonObject.has(string) ? rpY_2.id_private(jsonObject.get(string), string) : jsonObject2;
    }

    public static <T> T id_class(Gson gson, String string, TypeToken<T> typeToken, boolean bl) {
        return rpY_2.id_class(gson, (Reader)new StringReader(string), typeToken, bl);
    }

    public static <T> T id_class(Gson gson, Reader reader, TypeToken<T> typeToken, boolean bl) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(bl);
            return (T)gson.getAdapter(typeToken).read(jsonReader);
        }
        catch (IOException iOException) {
            throw new JsonParseException((Throwable)iOException);
        }
    }

    public static JsonArray id_class(JsonObject jsonObject, String string, JsonArray jsonArray) {
        return jsonObject.has(string) ? rpY_2.id_implements(jsonObject.get(string), string) : jsonArray;
    }

    public static boolean id_class(JsonObject jsonObject, String string, boolean bl) {
        return jsonObject.has(string) ? rpY_2.id_byte(jsonObject.get(string), string) : bl;
    }

    public static JsonObject id_class(Reader reader, boolean bl) {
        return rpY_2.id_class(id_class, reader, JsonObject.class, bl);
    }

    public static String id_class(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsString();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a string, was " + rpY_2.id_byte(jsonElement));
    }

    public static JsonObject id_class(Reader reader) {
        return rpY_2.id_class(reader, false);
    }

    public static String id_class(JsonObject jsonObject, String string, String string2) {
        return jsonObject.has(string) ? rpY_2.id_class(jsonObject.get(string), string) : string2;
    }

    public static JsonObject id_class(String string) {
        return rpY_2.id_class(string, false);
    }

    public static long id_class(JsonObject jsonObject, String string, long l) {
        return jsonObject.has(string) ? rpY_2.id_throws(jsonObject.get(string), string) : l;
    }

    public static float id_class(JsonObject jsonObject, String string, float f) {
        return jsonObject.has(string) ? rpY_2.id_protected(jsonObject.get(string), string) : f;
    }

    public static <T> T id_class(Gson gson, String string, Class<T> clazz) {
        return rpY_2.id_class(gson, string, clazz, false);
    }

    public static JsonObject id_class(String string, boolean bl) {
        return rpY_2.id_class(new StringReader(string), bl);
    }

    public static boolean id_break(JsonElement jsonElement) {
        return !jsonElement.isJsonPrimitive() ? false : jsonElement.getAsJsonPrimitive().isNumber();
    }

    public static boolean id_break(JsonObject jsonObject, String string) {
        return !rpY_2.id_protected(jsonObject, string) ? false : jsonObject.getAsJsonPrimitive(string).isBoolean();
    }

    public static rdb_3 id_break(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            String string2 = jsonElement.getAsString();
            return rVL.id_for.id_break(new rqO_2(string2)).orElseThrow(() -> new JsonSyntaxException("Expected " + string + " to be an item, was unknown string '" + string2 + "'"));
        }
        throw new JsonSyntaxException("Expected " + string + " to be an item, was " + rpY_2.id_byte(jsonElement));
    }

    public static long id_throws(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsLong();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Long, was " + rpY_2.id_byte(jsonElement));
    }

    public static boolean id_throws(JsonObject jsonObject, String string) {
        if (jsonObject == null) {
            return false;
        }
        return jsonObject.get(string) != null;
    }

    public static long id_finally(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_throws(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Long");
    }

    public static byte id_catch(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsByte();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Byte, was " + rpY_2.id_byte(jsonElement));
    }

    public static rdb_3 id_catch(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_break(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find an item");
    }

    public static int id_extends(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_case(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Int");
    }

    public static String id_case(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_class(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a string");
    }

    public static int id_case(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Int, was " + rpY_2.id_byte(jsonElement));
    }

    public static float id_implements(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_protected(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
    }

    public static JsonArray id_implements(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonArray, was " + rpY_2.id_byte(jsonElement));
    }

    public static float id_protected(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Float, was " + rpY_2.id_byte(jsonElement));
    }

    public static boolean id_protected(JsonObject jsonObject, String string) {
        return !rpY_2.id_throws(jsonObject, string) ? false : jsonObject.get(string).isJsonPrimitive();
    }

    public static boolean id_private(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_byte(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Boolean");
    }

    public static JsonObject id_private(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonObject, was " + rpY_2.id_byte(jsonElement));
    }

    public static JsonArray id_volatile(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_implements(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonArray");
    }

    public static JsonObject id_native(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return rpY_2.id_private(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonObject");
    }
}

