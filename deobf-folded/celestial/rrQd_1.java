package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQd_1 {
   private static byte[] bytes634ba5beb257384d8792f008140c7c0a;
   private static boolean[] booleans634ba5beb257384d8792f008140c7c0a;
   public static Object[] staticFields634ba5beb257384d8792f008140c7c0a;
   private static String[] strings634ba5beb257384d8792f008140c7c0a;
   public Object[] fields634ba5beb257384d8792f008140c7c0a;
   private static short[] shorts634ba5beb257384d8792f008140c7c0a;

   private static void id_byte() {
      strings634ba5beb257384d8792f008140c7c0a = new String[]{
         new String("OFFLINE"),
         new String("Offline"),
         new String("RANDOM_OFFLINE"),
         new String("Random Offline"),
         new String("MOJANG"),
         new String("Mojang"),
         new String("MICROSOFT"),
         new String("Microsoft")
      };
   }

   private rrQd_1(String var3) {
      this.id_case();
      this.fields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public String id_class() {
      return (String)this.fields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[1]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1161551751;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4578628389502887333L;
   }

   public static rrQd_1 id_class(String var0) {
      rrQd_1[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleans634ba5beb257384d8792f008140c7c0a[0]; var3 < var2; var3++) {
         rrQd_1 var4 = var1[var3];
         if (var4.id_class().equalsIgnoreCase(var0.toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -68, -88, 124, -67, 19, -123, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      shorts634ba5beb257384d8792f008140c7c0a = new short[]{4, 0, 0, 0, 1, 2, 3};
   }

   private static void id_catch() {
      bytes634ba5beb257384d8792f008140c7c0a = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private void id_case() {
      if (this.fields634ba5beb257384d8792f008140c7c0a == null) {
         this.fields634ba5beb257384d8792f008140c7c0a = new Object[1];
         Object[] var1 = this.fields634ba5beb257384d8792f008140c7c0a;
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{
         new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[1]),
         new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[3]),
         new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[5]),
         new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[7]),
         null
      };
      var0[4] = new rrQd_1[]{(rrQd_1)var0[0], (rrQd_1)var0[1], (rrQd_1)var0[2], (rrQd_1)var0[3]};
      staticFields634ba5beb257384d8792f008140c7c0a = var0;
   }

   private static void id_private() {
      booleans634ba5beb257384d8792f008140c7c0a = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
