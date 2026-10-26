package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfC_2 implements MinecraftAccessor {
   private static short[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_protected = new byte[]{8};
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1135019530;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 24, 50, 41, -91, 84, 52, -63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new short[2];
   }

   public static KeyBind id_class(int var0) {
      return (KeyBind)((Map)id_class[id_break[0]]).getOrDefault(var0, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[1]]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7522296758173799938L;
   }

   public static boolean id_class(Vu_1 var0) {
      if (var0.id_implements().isEmpty()) {
         return id_break(var0.id_int().id_break());
      } else {
         for (Va_1 var2 : var0.id_implements()) {
            if (!id_break(var2.id_break())) {
               return id_byte[1];
            }
         }

         return true;
      }
   }

   private static void id_break() {
      id_byte = new boolean[]{false, false, true, false, true};
   }

   public static boolean id_break(int var0) {
      if (var0 < 0) {
         return id_byte[0];
      } else {
         return var0 <= 8 ? Ve_1.id_break(id_const.id_implements(), var0) : Ve_1.id_class(id_const.id_implements(), var0);
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new LinkedHashMap()};
      id_class = var0;
   }
}
