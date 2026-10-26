package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjk_3 implements MinecraftAccessor {
   private static boolean[] class_;
   private static String[] break_;

   public static boolean byte_(rdn_3 var0) {
      return var0.break_() == rdy_3.kh && var0.final_() ? var0.package_().int_("pyrotechnic-item").native_("name").equals("ALTERNATIVE_TRAP") : class_[4];
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, -12, 19, -89, -52, -61, -124, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -191553648;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5233350799532614894L;
   }

   private static void class_() {
      break_ = new String[]{
         new String("kringeItems"),
         new String("type"),
         new String("SnowBall"),
         new String("kringeItems"),
         new String("type"),
         new String("ExplosiveStuff"),
         new String("pyrotechnic-item"),
         new String("name"),
         new String("STUN_STAR"),
         new String("pyrotechnic-item"),
         new String("name"),
         new String("EXPLOSIVE_TRAP"),
         new String("pyrotechnic-item"),
         new String("name"),
         new String("ALTERNATIVE_TRAP"),
         new String("backpack-inventory")
      };
   }

   public static boolean class_(rdn_3 var0) {
      return var0.break_() == rdy_3.dA && var0.final_() ? var0.package_().int_("pyrotechnic-item").native_("name").equals("EXPLOSIVE_TRAP") : class_[3];
   }

   public static boolean break_(rdn_3 var0) {
      return var0.break_() == rdy_3.xa && var0.final_() ? var0.package_().int_("kringeItems").native_("type").equals("ExplosiveStuff") : class_[1];
   }

   private static void break_() {
      class_ = new boolean[6];
   }

   public static boolean throws_(rdn_3 var0) {
      if (var0.break_() instanceof rxJ_2 var1 && var1.catch_() instanceof Wp_1) {
         return var0.protected_("backpack-inventory");
      }

      return class_[5];
   }

   public static boolean case_(rdn_3 var0) {
      return var0.break_() == rdy_3.hU && var0.final_() ? var0.package_().int_("kringeItems").native_("type").equals("SnowBall") : class_[0];
   }

   public static boolean protected_(rdn_3 var0) {
      return var0.break_() == rdy_3.dQ && var0.final_() ? var0.package_().int_("pyrotechnic-item").native_("name").equals("STUN_STAR") : class_[2];
   }
}
