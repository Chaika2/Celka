package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Sr_1 {
   private static short[] shorts14662c0f3f2639faacbab26a5987daba;
   public static Object[] staticFields14662c0f3f2639faacbab26a5987daba;
   private static byte[] bytes14662c0f3f2639faacbab26a5987daba;
   public Object[] fields14662c0f3f2639faacbab26a5987daba;
   private static String[] strings14662c0f3f2639faacbab26a5987daba;
   private static boolean[] booleans14662c0f3f2639faacbab26a5987daba;

   private Sr_1(String var3) {
      this.id_throws();
      this.fields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 4, -109, -118, 111, 115, 114, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 893632482;
   }

   public String id_class() {
      return (String)this.fields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[1]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2139854829696916058L;
   }

   public static Sr_1 id_break(String var0) {
      Sr_1[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans14662c0f3f2639faacbab26a5987daba[0]; var3 < var2; var3++) {
         Sr_1 var4 = var1[var3];
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   private static void id_break() {
      bytes14662c0f3f2639faacbab26a5987daba = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private void id_throws() {
      if (this.fields14662c0f3f2639faacbab26a5987daba == null) {
         this.fields14662c0f3f2639faacbab26a5987daba = new Object[1];
         Object[] var1 = this.fields14662c0f3f2639faacbab26a5987daba;
      }
   }

   private static void id_catch() {
      strings14662c0f3f2639faacbab26a5987daba = new String[]{
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
      Object[] var0 = new Object[]{
         new Sr_1(strings14662c0f3f2639faacbab26a5987daba[1]),
         new Sr_1(strings14662c0f3f2639faacbab26a5987daba[3]),
         new Sr_1(strings14662c0f3f2639faacbab26a5987daba[5]),
         new Sr_1(strings14662c0f3f2639faacbab26a5987daba[7]),
         new Sr_1(strings14662c0f3f2639faacbab26a5987daba[9]),
         null
      };
      var0[5] = new Sr_1[]{(Sr_1)var0[0], (Sr_1)var0[1], (Sr_1)var0[2], (Sr_1)var0[3], (Sr_1)var0[4]};
      staticFields14662c0f3f2639faacbab26a5987daba = var0;
   }

   private static void id_protected() {
      shorts14662c0f3f2639faacbab26a5987daba = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_private() {
      booleans14662c0f3f2639faacbab26a5987daba = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
