package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum SB {
   ;
   private static short[] shortsf97e83773d1d3413a5d252db949e1945;
   public Object[] fieldsf97e83773d1d3413a5d252db949e1945;
   private static boolean[] booleansf97e83773d1d3413a5d252db949e1945;
   private static String[] stringsf97e83773d1d3413a5d252db949e1945;
   private static byte[] bytesf97e83773d1d3413a5d252db949e1945;
   public static Object[] staticFieldsf97e83773d1d3413a5d252db949e1945;

   private static void byte_() {
      bytesf97e83773d1d3413a5d252db949e1945 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private SB(String var3) {
      this.private_();
      this.fieldsf97e83773d1d3413a5d252db949e1945[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2059320868;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1144983564014924615L;
   }

   public static SB class_(String var0) {
      for (SB var4 : values()) {
         if (var0.toLowerCase().contains("уровень лута: " + var4.class_().toLowerCase())) {
            return var4;
         }
      }

      return null;
   }

   public String class_() {
      return (String)this.fieldsf97e83773d1d3413a5d252db949e1945[0];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 68, 103, -75, 92, -10, 27, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      booleansf97e83773d1d3413a5d252db949e1945 = new boolean[]{false, false, true, false, false, true, true, true};
   }

   private static void throws_() {
      stringsf97e83773d1d3413a5d252db949e1945 = new String[]{
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

   private static void case_() {
      Object[] var0 = new Object[]{new SB("Легендарный"), new SB("Элитный"), new SB("Богатый"), new SB("Солидный"), new SB("Обычный"), null};
      var0[5] = new SB[]{(SB)var0[0], (SB)var0[1], (SB)var0[2], (SB)var0[3], (SB)var0[4]};
      staticFieldsf97e83773d1d3413a5d252db949e1945 = var0;
   }

   private static void protected_() {
      shortsf97e83773d1d3413a5d252db949e1945 = new short[]{5, 0, 0, 0, 1, 2, 3, 4};
   }

   private void private_() {
      if (this.fieldsf97e83773d1d3413a5d252db949e1945 == null) {
         this.fieldsf97e83773d1d3413a5d252db949e1945 = new Object[1];
         Object[] var1 = this.fieldsf97e83773d1d3413a5d252db949e1945;
      }
   }
}
