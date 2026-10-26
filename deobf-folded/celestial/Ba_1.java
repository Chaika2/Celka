package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Ba_1 {
   private static String[] stringse1fb41940c3a3230bee21800e360fbb0;
   private static short[] shortse1fb41940c3a3230bee21800e360fbb0;
   public static Object[] staticFieldse1fb41940c3a3230bee21800e360fbb0;
   private static byte[] bytese1fb41940c3a3230bee21800e360fbb0;
   public Object[] fieldse1fb41940c3a3230bee21800e360fbb0;
   private static boolean[] booleanse1fb41940c3a3230bee21800e360fbb0;

   private static void id_byte() {
      Object[] var0 = new Object[]{
         new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[1]),
         new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[3]),
         new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[5]),
         new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[7]),
         new Ba_1(stringse1fb41940c3a3230bee21800e360fbb0[9]),
         null
      };
      var0[5] = new Ba_1[]{(Ba_1)var0[0], (Ba_1)var0[1], (Ba_1)var0[2], (Ba_1)var0[3], (Ba_1)var0[4]};
      staticFieldse1fb41940c3a3230bee21800e360fbb0 = var0;
   }

   private Ba_1(String var3) {
      this.id_break();
      this.fieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1021165413;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2322920535017271744L;
   }

   public String id_class() {
      return (String)this.fieldse1fb41940c3a3230bee21800e360fbb0[shortse1fb41940c3a3230bee21800e360fbb0[1]];
   }

   public static Ba_1 id_class(String var0) {
      Ba_1[] var1 = values();
      int var2 = var1.length;

      for (int var3 = booleanse1fb41940c3a3230bee21800e360fbb0[0]; var3 < var2; var3++) {
         Ba_1 var4 = var1[var3];
         if (var0.toLowerCase().contains("уровень лута: " + var4.id_class().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 90, 78, -100, 42, -102, 22, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.fieldse1fb41940c3a3230bee21800e360fbb0 == null) {
         this.fieldse1fb41940c3a3230bee21800e360fbb0 = new Object[1];
         Object[] var1 = this.fieldse1fb41940c3a3230bee21800e360fbb0;
      }
   }

   private static void id_throws() {
      bytese1fb41940c3a3230bee21800e360fbb0 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_catch() {
      shortse1fb41940c3a3230bee21800e360fbb0 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_case() {
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

   private static void id_private() {
      booleanse1fb41940c3a3230bee21800e360fbb0 = new boolean[]{false, false, true, false, false, true, true, true};
   }
}
