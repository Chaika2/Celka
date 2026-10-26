package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Ba_1 {
   ;
   private static String[] stringse1fb41940c3a3230bee21800e360fbb0;
   private static short[] shortse1fb41940c3a3230bee21800e360fbb0;
   public static Object[] staticFieldse1fb41940c3a3230bee21800e360fbb0;
   private static byte[] bytese1fb41940c3a3230bee21800e360fbb0;
   public Object[] fieldse1fb41940c3a3230bee21800e360fbb0;
   private static boolean[] booleanse1fb41940c3a3230bee21800e360fbb0;

   private static void byte_() {
      Object[] var0 = new Object[]{new Ba_1("Легендарный"), new Ba_1("Элитный"), new Ba_1("Богатый"), new Ba_1("Солидный"), new Ba_1("Обычный"), null};
      var0[5] = new Ba_1[]{(Ba_1)var0[0], (Ba_1)var0[1], (Ba_1)var0[2], (Ba_1)var0[3], (Ba_1)var0[4]};
      staticFieldse1fb41940c3a3230bee21800e360fbb0 = var0;
   }

   private Ba_1(String var3) {
      this.break_();
      this.fieldse1fb41940c3a3230bee21800e360fbb0[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1021165413;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2322920535017271744L;
   }

   public String class_() {
      return (String)this.fieldse1fb41940c3a3230bee21800e360fbb0[0];
   }

   public static Ba_1 class_(String var0) {
      for (Ba_1 var4 : values()) {
         if (var0.toLowerCase().contains("уровень лута: " + var4.class_().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 90, 78, -100, 42, -102, 22, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.fieldse1fb41940c3a3230bee21800e360fbb0 == null) {
         this.fieldse1fb41940c3a3230bee21800e360fbb0 = new Object[1];
         Object[] var1 = this.fieldse1fb41940c3a3230bee21800e360fbb0;
      }
   }

   private static void throws_() {
      bytese1fb41940c3a3230bee21800e360fbb0 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void catch_() {
      shortse1fb41940c3a3230bee21800e360fbb0 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void case_() {
      stringse1fb41940c3a3230bee21800e360fbb0 = new String[]{
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

   private static void private_() {
      booleanse1fb41940c3a3230bee21800e360fbb0 = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
