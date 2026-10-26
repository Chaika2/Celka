package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrww_3 {
   private static short[] id_class;
   private static boolean[] id_break;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4013815108339048008L;
   }

   public static void id_class(JsonObject var0, Setting<?> var1) {
      if (var1 instanceof rrIk_1 var2) {
         var0.add(var1.id_throws(), new JsonPrimitive(var2.id_class()));
      } else if (var1 instanceof rrIQ var3) {
         var0.add(var1.id_throws(), new JsonPrimitive(var3.id_byte()));
      } else if (var1 instanceof rrIm_1 var4) {
         var0.add(var1.id_throws(), new JsonPrimitive(var4.id_byte()));
      } else if (var1 instanceof rrIz_1 var5) {
         var0.add(var1.id_throws(), new JsonPrimitive(var5.id_byte()));
      } else if (var1 instanceof rrIv_1 var6) {
         var0.add(var1.id_throws(), new JsonPrimitive(var6.id_extends()));
      } else {
         if (var1 instanceof rrIF var7 && var7.id_finally() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_class[0]]) {
            var0.add(var1.id_throws(), new JsonPrimitive(var7.id_finally().id_byte()));
            return;
         }

         if (var1 instanceof rrIc_1 var8) {
            JsonObject var9 = new JsonObject();
            var8.id_class().forEach(var1x -> var9.add(var1x.id_throws(), new JsonPrimitive(var1x.id_class())));
            var0.add(var1.id_throws(), var9);
         }
      }
   }

   public static void id_class(JsonElement var0, Setting<?> var1) {
      if (var1 instanceof rrIk_1 var2) {
         var2.id_class(Boolean.valueOf(var0.getAsBoolean()), id_break[0], id_break[1]);
      } else if (var1 instanceof rrIQ var3) {
         var3.id_class(var0.getAsString(), id_break[2]);
      } else if (var1 instanceof rrIm_1 var4) {
         var4.id_class(var0.getAsFloat(), id_break[3], id_break[4]);
      } else if (var1 instanceof rrIz_1 var5) {
         var5.id_class(Integer.valueOf(var0.getAsInt()), id_break[5], id_break[6]);
      } else if (var1 instanceof rrIF var6) {
         var6.id_class(rrfC_2.id_class(var0.getAsInt()), id_break[7], id_break[8]);
      } else if (var1 instanceof rrIv_1 var7) {
         String var9 = var0.getAsString();
         var7.id_class(var9, id_break[9], id_break[10]);
         var7.id_class(var9);
      } else if (var1 instanceof rrIc_1 var8 && var0.isJsonObject()) {
         JsonObject var10 = var0.getAsJsonObject();
         var8.id_class()
            .stream()
            .filter(var1x -> var10.has(var1x.id_throws()))
            .forEach(var1x -> var1x.id_class(Boolean.valueOf(var10.get(var1x.id_throws()).getAsBoolean()), id_break[11], id_break[12]));
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1364152717;
   }

   private static void id_class() {
      id_class = new short[1];
   }

   public static void id_class(rrwI_2 var0, JsonObject var1) {
      for (Setting var3 : var0.b()) {
         if (var3 != null && var1 != null && var1.has(var3.id_throws())) {
            JsonElement var4 = var1.get(var3.id_throws());
            if (var3 instanceof GroupSetting) {
               GroupSetting var5 = (GroupSetting)var3;
               List var6 = var5.id_byte();
               JsonObject var7 = var4.getAsJsonObject();

               for (Setting var9 : var6) {
                  if (var9 != null) {
                     JsonElement var10 = var7.get(var9.id_throws());
                     if (var10 != null) {
                        id_class(var10, var9);
                     }
                  }
               }
            } else {
               id_class(var4, var3);
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, 117, -108, 18, 8, 87, -21, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true};
   }

   public static JsonObject id_break(rrwI_2 var0, JsonObject var1) {
      for (Setting var3 : var0.b()) {
         if (var3 != null) {
            if (var3 instanceof GroupSetting) {
               GroupSetting var4 = (GroupSetting)var3;
               List var5 = var4.id_byte();
               JsonObject var6 = new JsonObject();

               for (Setting var8 : var5) {
                  if (var8 != null) {
                     id_class(var6, var8);
                  }
               }

               var1.add(var4.id_throws(), var6);
            } else {
               id_class(var1, var3);
            }
         }
      }

      return var1;
   }
}
