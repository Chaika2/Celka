package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum MB {
   ;
   private static String[] strings66e4c6f8de393faf832676ed33680249;
   public static Object[] staticFields66e4c6f8de393faf832676ed33680249;
   private static short[] shorts66e4c6f8de393faf832676ed33680249;
   public Object[] fields66e4c6f8de393faf832676ed33680249;
   private static boolean[] booleans66e4c6f8de393faf832676ed33680249;
   private static byte[] bytes66e4c6f8de393faf832676ed33680249;

   private static void byte_() {
      bytes66e4c6f8de393faf832676ed33680249 = new byte[]{2, 2, 4, 2, 3, 2, 2, 2, 3, 3, 3, 4, 5};
   }

   private MB(int var3) {
      this.catch_();
      boolean[] var8 = new boolean[]{
         (var3 & 2) != 0 ? true : booleans66e4c6f8de393faf832676ed33680249[2], (var3 & 1) != 0 ? true : booleans66e4c6f8de393faf832676ed33680249[6]
      };
      this.fields66e4c6f8de393faf832676ed33680249[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, 60, -41, 54, 9, -117, -21, -13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1801828025;
   }

   public static MB class_(boolean var0, boolean var1) {
      return var0
         ? (var1 ? (MB)staticFields66e4c6f8de393faf832676ed33680249[3] : (MB)staticFields66e4c6f8de393faf832676ed33680249[2])
         : (var1 ? (MB)staticFields66e4c6f8de393faf832676ed33680249[1] : (MB)staticFields66e4c6f8de393faf832676ed33680249[0]);
   }

   public boolean[] class_() {
      return (boolean[])this.fields66e4c6f8de393faf832676ed33680249[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1521385483347564296L;
   }

   private static void break_() {
      strings66e4c6f8de393faf832676ed33680249 = new String[]{new String("AIR"), new String("WATER"), new String("AVOID"), new String("SOLID")};
   }

   private static void throws_() {
      booleans66e4c6f8de393faf832676ed33680249 = new boolean[]{
         false, true, false, true, true, true, false, false, true, false, false, false, true, true, true, true
      };
   }

   private void catch_() {
      if (this.fields66e4c6f8de393faf832676ed33680249 == null) {
         this.fields66e4c6f8de393faf832676ed33680249 = new Object[1];
         Object[] var1 = this.fields66e4c6f8de393faf832676ed33680249;
      }
   }

   private static void case_() {
      shorts66e4c6f8de393faf832676ed33680249 = new short[]{4, 0, 0, 3, 2, 1, 0, 0, 1, 2, 3};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new MB(0), new MB(1), new MB(2), new MB(3), null};
      var0[4] = new MB[]{(MB)var0[0], (MB)var0[1], (MB)var0[2], (MB)var0[3]};
      staticFields66e4c6f8de393faf832676ed33680249 = var0;
   }
}
