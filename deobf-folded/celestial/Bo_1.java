package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Bo_1 {
   private static boolean[] booleansde151cace23f3e089965a701a59baa11;
   private static byte[] bytesde151cace23f3e089965a701a59baa11;
   public Object[] fieldsde151cace23f3e089965a701a59baa11;
   public static Object[] staticFieldsde151cace23f3e089965a701a59baa11;
   private static String[] stringsde151cace23f3e089965a701a59baa11;
   private static short[] shortsde151cace23f3e089965a701a59baa11;

   private void id_byte() {
      if (this.fieldsde151cace23f3e089965a701a59baa11 == null) {
         this.fieldsde151cace23f3e089965a701a59baa11 = new Object[1];
         Object[] var1 = this.fieldsde151cace23f3e089965a701a59baa11;
      }
   }

   private Bo_1(String var3) {
      this.id_byte();
      this.fieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 847892379;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1791243898142426332L;
   }

   public String id_class() {
      return (String)this.fieldsde151cace23f3e089965a701a59baa11[shortsde151cace23f3e089965a701a59baa11[1]];
   }

   public static Bo_1 id_class(String var0) {
      Bo_1[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleansde151cace23f3e089965a701a59baa11[0]; var3 < var2; var3++) {
         Bo_1 var4 = var1[var3];
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -30, 29, 68, 114, 57, -52, 81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      shortsde151cace23f3e089965a701a59baa11 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_catch() {
      stringsde151cace23f3e089965a701a59baa11 = new String[]{
         new String("LEGENDARY"),
         new String("Легендарный"),
         new String("ELITE"),
         new String("Элитный"),
         new String("RICH"),
         new String("Богатый"),
         new String("SOLID"),
         new String("Солидный"),
         new String("COMMON"),
         new String("Обычный")
      };
   }

   private static void id_case() {
      bytesde151cace23f3e089965a701a59baa11 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_protected() {
      booleansde151cace23f3e089965a701a59baa11 = new boolean[]{false, false, true, false, false, true, true, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{
         new Bo_1(stringsde151cace23f3e089965a701a59baa11[1]),
         new Bo_1(stringsde151cace23f3e089965a701a59baa11[3]),
         new Bo_1(stringsde151cace23f3e089965a701a59baa11[5]),
         new Bo_1(stringsde151cace23f3e089965a701a59baa11[7]),
         new Bo_1(stringsde151cace23f3e089965a701a59baa11[9]),
         null
      };
      var0[5] = new Bo_1[]{(Bo_1)var0[0], (Bo_1)var0[1], (Bo_1)var0[2], (Bo_1)var0[3], (Bo_1)var0[4]};
      staticFieldsde151cace23f3e089965a701a59baa11 = var0;
   }
}
