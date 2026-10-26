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
   private static short[] class_;
   private static boolean[] break_;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4013815108339048008L;
   }

   public static void class_(JsonObject var0, Setting<?> var1) {
      if (var1 instanceof rrIk_1 var2) {
         var0.add(var1.throws_(), new JsonPrimitive(var2.class_()));
      } else if (var1 instanceof rrIQ var3) {
         var0.add(var1.throws_(), new JsonPrimitive(var3.byte_()));
      } else if (var1 instanceof rrIm_1 var4) {
         var0.add(var1.throws_(), new JsonPrimitive(var4.byte_()));
      } else if (var1 instanceof rrIz_1 var5) {
         var0.add(var1.throws_(), new JsonPrimitive(var5.byte_()));
      } else if (var1 instanceof rrIv_1 var6) {
         var0.add(var1.throws_(), new JsonPrimitive(var6.extends_()));
      } else {
         if (var1 instanceof rrIF var7 && var7.finally_() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]) {
            var0.add(var1.throws_(), new JsonPrimitive(var7.finally_().byte_()));
            return;
         }

         if (var1 instanceof rrIc_1 var8) {
            JsonObject var9 = new JsonObject();
            var8.class_().forEach(var1x -> var9.add(var1x.throws_(), new JsonPrimitive(var1x.class_())));
            var0.add(var1.throws_(), var9);
         }
      }
   }

   public static void class_(JsonElement var0, Setting<?> var1) {
      if (var1 instanceof rrIk_1 var2) {
         var2.class_(Boolean.valueOf(var0.getAsBoolean()), true, true);
      } else if (var1 instanceof rrIQ var3) {
         var3.class_(var0.getAsString(), true);
      } else if (var1 instanceof rrIm_1 var4) {
         var4.class_(var0.getAsFloat(), true, true);
      } else if (var1 instanceof rrIz_1 var5) {
         var5.class_(Integer.valueOf(var0.getAsInt()), true, true);
      } else if (var1 instanceof rrIF var6) {
         var6.class_(rrfC_2.class_(var0.getAsInt()), true, true);
      } else if (var1 instanceof rrIv_1 var7) {
         String var9 = var0.getAsString();
         var7.class_(var9, true, true);
         var7.class_(var9);
      } else if (var1 instanceof rrIc_1 var8 && var0.isJsonObject()) {
         JsonObject var10 = var0.getAsJsonObject();
         var8.class_()
            .stream()
            .filter(var1x -> var10.has(var1x.throws_()))
            .forEach(var1x -> var1x.class_(Boolean.valueOf(var10.get(var1x.throws_()).getAsBoolean()), true, true));
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1364152717;
   }

   private static void class_() {
      class_ = new short[1];
   }

   public static void class_(rrwI_2 var0, JsonObject var1) {
      for (Setting var3 : var0.b()) {
         if (var3 != null && var1 != null && var1.has(var3.throws_())) {
            JsonElement var4 = var1.get(var3.throws_());
            if (var3 instanceof GroupSetting) {
               GroupSetting var5 = (GroupSetting)var3;
               List var6 = var5.byte_();
               JsonObject var7 = var4.getAsJsonObject();

               for (Setting var9 : var6) {
                  if (var9 != null) {
                     JsonElement var10 = var7.get(var9.throws_());
                     if (var10 != null) {
                        class_(var10, var9);
                     }
                  }
               }
            } else {
               class_(var4, var3);
            }
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, 117, -108, 18, 8, 87, -21, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true};
   }

   public static JsonObject break_(rrwI_2 var0, JsonObject var1) {
      for (Setting var3 : var0.b()) {
         if (var3 != null) {
            if (var3 instanceof GroupSetting) {
               GroupSetting var4 = (GroupSetting)var3;
               List var5 = var4.byte_();
               JsonObject var6 = new JsonObject();

               for (Setting var8 : var5) {
                  if (var8 != null) {
                     class_(var6, var8);
                  }
               }

               var1.add(var4.throws_(), var6);
            } else {
               class_(var1, var3);
            }
         }
      }

      return var1;
   }
}
