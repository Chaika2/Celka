package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfC_2 implements MinecraftAccessor {
   private static short[] break_;
   public static Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      protected_ = new byte[]{8};
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1135019530;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 24, 50, 41, -91, 84, 52, -63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new short[2];
   }

   public static KeyBind class_(int var0) {
      return (KeyBind)((Map)class_[0]).getOrDefault(var0, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7522296758173799938L;
   }

   public static boolean class_(Vu_1 var0) {
      if (var0.implements_().isEmpty()) {
         return break_(var0.int_().break_());
      } else {
         for (Va_1 var2 : var0.implements_()) {
            if (!break_(var2.break_())) {
               return false;
            }
         }

         return byte_[2];
      }
   }

   private static void break_() {
      byte_ = new boolean[]{false, false, true, false, true};
   }

   public static boolean break_(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         return var0 <= 8 ? Ve_1.break_(const_.implements_(), var0) : Ve_1.class_(const_.implements_(), var0);
      }
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new LinkedHashMap()};
      class_ = var0;
   }
}
