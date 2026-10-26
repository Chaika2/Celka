package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfZ_2 implements MinecraftAccessor {
   private static String[] id_class;

   public static boolean id_byte() {
      return C_throws.id_byte().id_synchronized().id_class();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3600891581747311370L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1318256104;
   }

   public static void id_class() {
      rrfu_3.id_byte(id_class[1]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 110, -48, 29, -102, 24, -38, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_break() {
      if (id_protected()) {
         C_throws.id_class().id_break().id_switch().id_class(id_class[0]);
      }
   }

   private static void id_throws() {
      id_class = new String[]{new String("cancel"), new String("Вас попытались крашнуть, но AntiCrash предотвратил это")};
   }

   public static boolean id_protected() {
      return C_throws.id_class().id_catch();
   }
}
