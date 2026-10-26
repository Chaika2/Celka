package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum MB {
   private static String[] strings66e4c6f8de393faf832676ed33680249;
   public static Object[] staticFields66e4c6f8de393faf832676ed33680249;
   private static short[] shorts66e4c6f8de393faf832676ed33680249;
   public Object[] fields66e4c6f8de393faf832676ed33680249;
   private static boolean[] booleans66e4c6f8de393faf832676ed33680249;
   private static byte[] bytes66e4c6f8de393faf832676ed33680249;

   private static void id_byte() {
      bytes66e4c6f8de393faf832676ed33680249 = new byte[]{2, 2, 4, 2, 3, 2, 2, 2, 3, 3, 3, 4, 5};
   }

   private MB(int var3) {
      this.id_catch();
      boolean[] var10001 = new boolean[bytes66e4c6f8de393faf832676ed33680249[0]];
      var10001[booleans66e4c6f8de393faf832676ed33680249[0]] = (var3 & bytes66e4c6f8de393faf832676ed33680249[1]) != 0
         ? booleans66e4c6f8de393faf832676ed33680249[1]
         : booleans66e4c6f8de393faf832676ed33680249[2];
      var10001[booleans66e4c6f8de393faf832676ed33680249[3]] = (var3 & booleans66e4c6f8de393faf832676ed33680249[4]) != 0
         ? booleans66e4c6f8de393faf832676ed33680249[5]
         : booleans66e4c6f8de393faf832676ed33680249[6];
      boolean[] var8 = var10001;
      this.fields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[1]] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, 60, -41, 54, 9, -117, -21, -13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1801828025;
   }

   public static MB id_class(boolean var0, boolean var1) {
      return var0
         ? (
            var1
               ? (MB)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[3]]
               : (MB)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[4]]
         )
         : (
            var1
               ? (MB)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[5]]
               : (MB)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[6]]
         );
   }

   public boolean[] id_class() {
      return (boolean[])this.fields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[2]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1521385483347564296L;
   }

   private static void id_break() {
      strings66e4c6f8de393faf832676ed33680249 = new String[]{new String("AIR"), new String("WATER"), new String("AVOID"), new String("SOLID")};
   }

   private static void id_throws() {
      booleans66e4c6f8de393faf832676ed33680249 = new boolean[]{
         false, true, false, true, true, true, false, false, true, false, false, false, true, true, true, true
      };
   }

   private void id_catch() {
      if (this.fields66e4c6f8de393faf832676ed33680249 == null) {
         this.fields66e4c6f8de393faf832676ed33680249 = new Object[booleans66e4c6f8de393faf832676ed33680249[15]];
         Object[] var1 = this.fields66e4c6f8de393faf832676ed33680249;
      }
   }

   private static void id_case() {
      shorts66e4c6f8de393faf832676ed33680249 = new short[]{4, 0, 0, 3, 2, 1, 0, 0, 1, 2, 3};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new MB(0), new MB(1), new MB(2), new MB(3), null};
      var0[4] = new MB[]{(MB)var0[0], (MB)var0[1], (MB)var0[2], (MB)var0[3]};
      staticFields66e4c6f8de393faf832676ed33680249 = var0;
   }
}
