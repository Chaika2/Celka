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
   private static final Gson class_ = new GsonBuilder().create();

   public static boolean byte_(JsonObject var0, String var1) {
      return !throws_(var0, var1) ? false : var0.get(var1).isJsonArray();
   }

   public static String byte_(JsonElement var0) {
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

   public static boolean byte_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsBoolean();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Boolean, was " + byte_(var0));
      }
   }

   public static boolean class_(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isString();
   }

   public static byte class_(JsonObject var0, String var1, byte var2) {
      return var0.has(var1) ? catch_(var0.get(var1), var1) : var2;
   }

   public static <T> T class_(Gson var0, Reader var1, TypeToken<T> var2) {
      return class_(var0, var1, var2, false);
   }

   public static <T> T class_(Gson var0, String var1, Class<T> var2, boolean var3) {
      return class_(var0, new StringReader(var1), var2, var3);
   }

   public static <T> T class_(Gson var0, Reader var1, Class<T> var2, boolean var3) {
      try {
         JsonReader var4 = new JsonReader(var1);
         var4.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var4);
      } catch (IOException var5) {
         throw new JsonParseException(var5);
      }
   }

   public static <T> T class_(Gson var0, Reader var1, Class<T> var2) {
      return class_(var0, var1, var2, false);
   }

   public static <T> T class_(Gson var0, String var1, TypeToken<T> var2) {
      return class_(var0, var1, var2, false);
   }

   public static int class_(JsonObject var0, String var1, int var2) {
      return var0.has(var1) ? case_(var0.get(var1), var1) : var2;
   }

   public static <T> T class_(JsonElement var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0 != null) {
         return (T)var2.deserialize(var0, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static <T> T class_(JsonObject var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0.has(var1)) {
         return class_(var0.get(var1), var1, var2, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static <T> T class_(JsonObject var0, String var1, T var2, JsonDeserializationContext var3, Class<? extends T> var4) {
      return (T)(var0.has(var1) ? class_(var0.get(var1), var1, var3, var4) : var2);
   }

   public static boolean class_(JsonObject var0, String var1) {
      return !protected_(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isString();
   }

   public static JsonObject class_(JsonObject var0, String var1, JsonObject var2) {
      return var0.has(var1) ? private_(var0.get(var1), var1) : var2;
   }

   public static <T> T class_(Gson var0, String var1, TypeToken<T> var2, boolean var3) {
      return class_(var0, new StringReader(var1), var2, var3);
   }

   public static <T> T class_(Gson var0, Reader var1, TypeToken<T> var2, boolean var3) {
      try {
         JsonReader var4 = new JsonReader(var1);
         var4.setLenient(var3);
         return (T)var0.getAdapter(var2).read(var4);
      } catch (IOException var5) {
         throw new JsonParseException(var5);
      }
   }

   public static JsonArray class_(JsonObject var0, String var1, JsonArray var2) {
      return var0.has(var1) ? implements_(var0.get(var1), var1) : var2;
   }

   public static boolean class_(JsonObject var0, String var1, boolean var2) {
      return var0.has(var1) ? byte_(var0.get(var1), var1) : var2;
   }

   public static JsonObject class_(Reader var0, boolean var1) {
      return class_(class_, var0, JsonObject.class, var1);
   }

   public static String class_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsString();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + byte_(var0));
      }
   }

   public static JsonObject class_(Reader var0) {
      return class_(var0, false);
   }

   public static String class_(JsonObject var0, String var1, String var2) {
      return var0.has(var1) ? class_(var0.get(var1), var1) : var2;
   }

   public static JsonObject class_(String var0) {
      return class_(var0, false);
   }

   public static long class_(JsonObject var0, String var1, long var2) {
      return var0.has(var1) ? throws_(var0.get(var1), var1) : var2;
   }

   public static float class_(JsonObject var0, String var1, float var2) {
      return var0.has(var1) ? protected_(var0.get(var1), var1) : var2;
   }

   public static <T> T class_(Gson var0, String var1, Class<T> var2) {
      return class_(var0, var1, var2, false);
   }

   public static JsonObject class_(String var0, boolean var1) {
      return class_(new StringReader(var0), var1);
   }

   public static boolean break_(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isNumber();
   }

   public static boolean break_(JsonObject var0, String var1) {
      return !protected_(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isBoolean();
   }

   public static rdb_3 break_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         String var2 = var0.getAsString();
         return rVL.for_
            .break_(new rqO_2(var2))
            .orElseThrow(() -> new JsonSyntaxException("Expected " + var1 + " to be an item, was unknown string '" + var2 + "'"));
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was " + byte_(var0));
      }
   }

   public static long throws_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsLong();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Long, was " + byte_(var0));
      }
   }

   public static boolean throws_(JsonObject var0, String var1) {
      return var0 == null ? false : var0.get(var1) != null;
   }

   public static long finally_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return throws_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Long");
      }
   }

   public static byte catch_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsByte();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Byte, was " + byte_(var0));
      }
   }

   public static rdb_3 catch_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return break_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find an item");
      }
   }

   public static int extends_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return case_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      }
   }

   public static String case_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return class_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      }
   }

   public static int case_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + byte_(var0));
      }
   }

   public static float implements_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return protected_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      }
   }

   public static JsonArray implements_(JsonElement var0, String var1) {
      if (var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + byte_(var0));
      }
   }

   public static float protected_(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float, was " + byte_(var0));
      }
   }

   public static boolean protected_(JsonObject var0, String var1) {
      return !throws_(var0, var1) ? false : var0.get(var1).isJsonPrimitive();
   }

   public static boolean private_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return byte_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      }
   }

   public static JsonObject private_(JsonElement var0, String var1) {
      if (var0.isJsonObject()) {
         return var0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + byte_(var0));
      }
   }

   public static JsonArray volatile_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return implements_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static JsonObject native_(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return private_(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      }
   }
}
