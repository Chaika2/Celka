package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AntiShuffler extends Module {
   private static String[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public AntiShuffler() {
      super("Anti Shuffler", "Убирает переключение слотов\nантичитом", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvm_3 var2) {
         if ((cb_3)id_import.id_class[57] == null) {
            return;
         }

         uR_2 var4 = ((cq_3)id_import.id_class[19]).id_implements();
         if (var4.id_protected() == null && var4.id_class() == null) {
            return;
         }

         rrfo_3.id_class(var2.id_break());
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 667273603;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 595498148922535266L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 114, -120, -73, 103, -107, -84, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_byte = new short[]{4, 57, 19, 57, 1};
   }

   private static void id_new() {
      id_protected = new boolean[]{true};
   }

   private static void id_super() {
      id_break = new String[]{new String("Anti Shuffler"), new String("Убирает переключение слотов\nантичитом")};
   }
}
