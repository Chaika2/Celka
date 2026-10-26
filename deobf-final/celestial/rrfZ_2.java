package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfZ_2 implements MinecraftAccessor {
   private static String[] class_;

   public static boolean byte_() {
      return C_throws.byte_().synchronized_().class_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3600891581747311370L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1318256104;
   }

   public static void class_() {
      rrfu_3.byte_("Вас попытались крашнуть, но AntiCrash предотвратил это");
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 110, -48, 29, -102, 24, -38, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void break_() {
      if (protected_()) {
         C_throws.class_().break_().switch_().class_("cancel");
      }
   }

   private static void throws_() {
      class_ = new String[]{new String("cancel"), new String("Вас попытались крашнуть, но AntiCrash предотвратил это")};
   }

   public static boolean protected_() {
      return C_throws.class_().catch_();
   }
}
