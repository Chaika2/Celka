package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum BV {
   ;
   private static boolean[] booleansb1ef2a77de6235bb9d31938bdf7ffd8a;
   public Object[] fieldsb1ef2a77de6235bb9d31938bdf7ffd8a;
   public static Object[] staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a;
   private static byte[] bytesb1ef2a77de6235bb9d31938bdf7ffd8a;
   private static short[] shortsb1ef2a77de6235bb9d31938bdf7ffd8a;
   private static String[] stringsb1ef2a77de6235bb9d31938bdf7ffd8a;

   private static void byte_() {
      booleansb1ef2a77de6235bb9d31938bdf7ffd8a = new boolean[]{false, false, true, false, false, true, true, true};
   }

   private BV(String var3) {
      this.case_();
      this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a[0] = var3;
   }

   static {
      ntfClinit();
   }

   public String class_() {
      return (String)this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5952751240161125735L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 4, 41, -15, -88, -75, 87, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1455232475;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new BV("Легендарный"), new BV("Элитный"), new BV("Богатый"), new BV("Солидный"), new BV("Обычный"), null};
      var0[5] = new BV[]{(BV)var0[0], (BV)var0[1], (BV)var0[2], (BV)var0[3], (BV)var0[4]};
      staticFieldsb1ef2a77de6235bb9d31938bdf7ffd8a = var0;
   }

   public static BV break_(String var0) {
      for (BV var4 : values()) {
         if (var0.toLowerCase().contains("уровень лута: " + var4.class_().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   private static void throws_() {
      bytesb1ef2a77de6235bb9d31938bdf7ffd8a = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void catch_() {
      shortsb1ef2a77de6235bb9d31938bdf7ffd8a = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private void case_() {
      if (this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a == null) {
         this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a = new Object[1];
         Object[] var1 = this.fieldsb1ef2a77de6235bb9d31938bdf7ffd8a;
      }
   }

   private static void private_() {
      stringsb1ef2a77de6235bb9d31938bdf7ffd8a = new String[]{
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
}
