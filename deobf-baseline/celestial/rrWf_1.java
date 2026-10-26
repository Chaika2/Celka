package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rrWf_1 {
   public static String id_class(JsonObject var0, String var1, String var2) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3.getAsString();
   }

   public static float[] id_class(JsonElement var0, int var1) {
      return id_class(var0, var1, (float[])null);
   }

   public static float[] id_class(JsonElement var0, int var1, float[] var2) {
      if (var0 == null) {
         return var2;
      } else {
         JsonArray var3 = var0.getAsJsonArray();
         if (var3.size() != var1) {
            throw new JsonParseException("Wrong array length: " + var3.size() + ", should be: " + var1 + ", array: " + var3);
         } else {
            float[] var4 = new float[var3.size()];

            for (int var5 = 0; var5 < var4.length; var5++) {
               var4[var5] = var3.get(var5).getAsFloat();
            }

            return var4;
         }
      }
   }

   public static int[] id_class(JsonElement var0, int var1, int[] var2) {
      if (var0 == null) {
         return var2;
      } else {
         JsonArray var3 = var0.getAsJsonArray();
         if (var3.size() != var1) {
            throw new JsonParseException("Wrong array length: " + var3.size() + ", should be: " + var1 + ", array: " + var3);
         } else {
            int[] var4 = new int[var3.size()];

            for (int var5 = 0; var5 < var4.length; var5++) {
               var4[var5] = var3.get(var5).getAsInt();
            }

            return var4;
         }
      }
   }

   public static float id_class(JsonObject var0, String var1, float var2) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3.getAsFloat();
   }

   public static boolean id_class(JsonObject var0, String var1, boolean var2) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3.getAsBoolean();
   }

   public static String id_class(JsonObject var0, String var1) {
      return id_class(var0, var1, (String)null);
   }

   public static int[] id_break(JsonElement var0, int var1) {
      return id_class(var0, var1, (int[])null);
   }
}
