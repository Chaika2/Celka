package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ri_3 {
   private static boolean[] break_;
   private static short[] byte_;
   public static Object[] class_;
   private static String[] protected_;

   private static void byte_() {
      protected_ = new String[]{new String("minecraft"), new String("Invalid block name %s"), new String(":")};
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, 51, -88, -58, -16, 21, 104, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private ri_3() {
   }

   static {
      ntfClinit();
   }

   public static String class_(xd_3 var0) {
      rqO_2 var1 = rVL.strictfp_.break_(var0);
      String var2 = var1.break_();
      if (!var1.byte_().equals("minecraft")) {
         var2 = var1.toString();
      }

      return var2;
   }

   private static void class_() {
      break_ = new boolean[]{true, false, false, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6928496806877921579L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1836709736;
   }

   public static xd_3 class_(String var0) {
      xd_3 var1 = protected_(var0);
      return var1 == null ? xu_3.class_ : var1;
   }

   public static xd_3 break_(String var0) {
      xd_3 var1 = protected_(var0);
      if (var1 == null) {
         throw new IllegalArgumentException(String.format("Invalid block name %s", var0));
      } else {
         return var1;
      }
   }

   private static void break_() {
      byte_ = new short[4];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new HashMap()};
      class_ = var0;
   }

   public static xd_3 protected_(String var0) {
      xd_3 var1 = (xd_3)((Map)class_[0]).get(var0);
      if (var1 != null) {
         return var1;
      } else if (((Map)class_[0]).containsKey(var0)) {
         return null;
      } else {
         var1 = rVL.strictfp_.break_(rqO_2.break_(var0.contains(":") ? var0 : "minecraft:" + var0)).orElse(null);
         HashMap var2 = new HashMap((Map)class_[0]);
         var2.put(var0, var1);
         class_[0] = var2;
         return var1;
      }
   }
}
