package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQd_1 {
   ;
   private static byte[] bytes634ba5beb257384d8792f008140c7c0a;
   private static boolean[] booleans634ba5beb257384d8792f008140c7c0a;
   public static Object[] staticFields634ba5beb257384d8792f008140c7c0a;
   private static String[] strings634ba5beb257384d8792f008140c7c0a;
   public Object[] fields634ba5beb257384d8792f008140c7c0a;
   private static short[] shorts634ba5beb257384d8792f008140c7c0a;

   private static void byte_() {
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
      this.case_();
      this.fields634ba5beb257384d8792f008140c7c0a[0] = var3;
   }

   static {
      ntfClinit();
   }

   public String class_() {
      return (String)this.fields634ba5beb257384d8792f008140c7c0a[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1161551751;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4578628389502887333L;
   }

   public static rrQd_1 class_(String var0) {
      for (rrQd_1 var4 : values()) {
         if (var4.class_().equalsIgnoreCase(var0.toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -68, -88, 124, -67, 19, -123, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      shorts634ba5beb257384d8792f008140c7c0a = new short[]{4, 0, 0, 0, 1, 2, 3};
   }

   private static void catch_() {
      bytes634ba5beb257384d8792f008140c7c0a = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private void case_() {
      if (this.fields634ba5beb257384d8792f008140c7c0a == null) {
         this.fields634ba5beb257384d8792f008140c7c0a = new Object[1];
         Object[] var1 = this.fields634ba5beb257384d8792f008140c7c0a;
      }
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrQd_1("Offline"), new rrQd_1("Random Offline"), new rrQd_1("Mojang"), new rrQd_1("Microsoft"), null};
      var0[4] = new rrQd_1[]{(rrQd_1)var0[0], (rrQd_1)var0[1], (rrQd_1)var0[2], (rrQd_1)var0[3]};
      staticFields634ba5beb257384d8792f008140c7c0a = var0;
   }

   private static void private_() {
      booleans634ba5beb257384d8792f008140c7c0a = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
