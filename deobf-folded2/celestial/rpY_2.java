package celestial;

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

   public static boolean id_byte(JsonObject var0, String var1) {
      return !id_throws(var0, var1) ? false : var0.get(var1).isJsonArray();
   }

   public static String id_byte(JsonElement var0) {
      String var1 = StringUtils.abbreviateMiddle(String.valueOf(var0), "...", 10);
      if (var0 == null) {
         return "null (missing)";
      } else if (var0.isJsonNull()) {
         return "null (json)";
      } else if (var0.isJsonArray()) {
         return "an array (" + var1 + ")";
      } else if (var0.isJsonObject()) {
         return "an object (" + var1 + ")";
      } else {
         if (var0.isJsonPrimitive()) {
            JsonPrimitive var2 = var0.getAsJsonPrimitive();
            if (var2.isNumber()) {
               return "a number (" + var1 + ")";
            }

            if (var2.isBoolean()) {
               return "a boolean (" + var1 + ")";
            }
         }

         return var1;
      }
   }

   public static boolean id_byte(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsBoolean();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Boolean, was " + id_byte(var0));
      }
   }

   public static boolean id_class(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isString();
   }

   public static byte id_class(JsonObject var0, String var1, byte var2) {
      return var0.has(var1) ? id_catch(var0.get(var1), var1) : var2;
   }

   public static <T> T id_class(Gson var0, Reader var1, TypeToken<T> var2) {
      return id_class(var0, var1, var2, false);
   }

   public static <T> T id_class(Gson var0, String var1, Class<T> var2, boolean var3) {
      return id_class(var0, new StringReader(var1), var2, var3);
   }

   public static <T> T id_class(Gson var0, Reader var1, Class<T> var2, boolean var3) {
      try {
         JsonReader var4 = new JsonReader(var1);
         var4.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var4);
      } catch (IOException var5) {
         throw new JsonParseException(var5);
      }
   }

   public static <T> T id_class(Gson var0, Reader var1, Class<T> var2) {
      return id_class(var0, var1, var2, false);
   }

   public static <T> T id_class(Gson var0, String var1, TypeToken<T> var2) {
      return id_class(var0, var1, var2, false);
   }

   public static int id_class(JsonObject var0, String var1, int var2) {
      return var0.has(var1) ? id_case(var0.get(var1), var1) : var2;
   }

   public static <T> T id_class(JsonElement var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0 != null) {
         return (T)var2.deserialize(var0, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static <T> T id_class(JsonObject var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0.has(var1)) {
         return id_class(var0.get(var1), var1, var2, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static <T> T id_class(JsonObject var0, String var1, T var2, JsonDeserializationContext var3, Class<? extends T> var4) {
      return (T)(var0.has(var1) ? id_class(var0.get(var1), var1, var3, var4) : var2);
   }

   public static boolean id_class(JsonObject var0, String var1) {
      return !id_protected(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isString();
   }

   public static JsonObject id_class(JsonObject var0, String var1, JsonObject var2) {
      return var0.has(var1) ? id_private(var0.get(var1), var1) : var2;
   }

   public static <T> T id_class(Gson var0, String var1, TypeToken<T> var2, boolean var3) {
      return id_class(var0, new StringReader(var1), var2, var3);
   }

   public static <T> T id_class(Gson var0, Reader var1, TypeToken<T> var2, boolean var3) {
      try {
         JsonReader var4 = new JsonReader(var1);
         var4.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var4);
      } catch (IOException var5) {
         throw new JsonParseException(var5);
      }
   }

   public static JsonArray id_class(JsonObject var0, String var1, JsonArray var2) {
      return var0.has(var1) ? id_implements(var0.get(var1), var1) : var2;
   }

   public static boolean id_class(JsonObject var0, String var1, boolean var2) {
      return var0.has(var1) ? id_byte(var0.get(var1), var1) : var2;
   }

   public static JsonObject id_class(Reader var0, boolean var1) {
      return id_class(id_class, var0, JsonObject.class, var1);
   }

   public static String id_class(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsString();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + id_byte(var0));
      }
   }

   public static JsonObject id_class(Reader var0) {
      return id_class(var0, false);
   }

   public static String id_class(JsonObject var0, String var1, String var2) {
      return var0.has(var1) ? id_class(var0.get(var1), var1) : var2;
   }

   public static JsonObject id_class(String var0) {
      return id_class(var0, false);
   }

   public static long id_class(JsonObject var0, String var1, long var2) {
      return var0.has(var1) ? id_throws(var0.get(var1), var1) : var2;
   }

   public static float id_class(JsonObject var0, String var1, float var2) {
      return var0.has(var1) ? id_protected(var0.get(var1), var1) : var2;
   }

   public static <T> T id_class(Gson var0, String var1, Class<T> var2) {
      return id_class(var0, var1, var2, false);
   }

   public static JsonObject id_class(String var0, boolean var1) {
      return id_class(new StringReader(var0), var1);
   }

   public static boolean id_break(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isNumber();
   }

   public static boolean id_break(JsonObject var0, String var1) {
      return !id_protected(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isBoolean();
   }

   public static rdb_3 id_break(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         String var2 = var0.getAsString();
         return rVL.id_for
            .id_break(new rqO_2(var2))
            .orElseThrow(() -> new JsonSyntaxException("Expected " + var1 + " to be an item, was unknown string '" + var2 + "'"));
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was " + id_byte(var0));
      }
   }

   public static long id_throws(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsLong();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Long, was " + id_byte(var0));
      }
   }

   public static boolean id_throws(JsonObject var0, String var1) {
      return var0 == null ? false : var0.get(var1) != null;
   }

   public static long id_finally(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_throws(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Long");
      }
   }

   public static byte id_catch(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsByte();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Byte, was " + id_byte(var0));
      }
   }

   public static rdb_3 id_catch(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_break(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find an item");
      }
   }

   public static int id_extends(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_case(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      }
   }

   public static String id_case(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_class(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      }
   }

   public static int id_case(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + id_byte(var0));
      }
   }

   public static float id_implements(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_protected(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      }
   }

   public static JsonArray id_implements(JsonElement var0, String var1) {
      if (var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + id_byte(var0));
      }
   }

   public static float id_protected(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float, was " + id_byte(var0));
      }
   }

   public static boolean id_protected(JsonObject var0, String var1) {
      return !id_throws(var0, var1) ? false : var0.get(var1).isJsonPrimitive();
   }

   public static boolean id_private(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_byte(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      }
   }

   public static JsonObject id_private(JsonElement var0, String var1) {
      if (var0.isJsonObject()) {
         return var0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + id_byte(var0));
      }
   }

   public static JsonArray id_volatile(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_implements(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static JsonObject id_native(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return id_private(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      }
   }
}
