package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryY {
   private static String[] strings45ad03cc55cb3e668addddf47f67a723;
   public static Object[] staticFields45ad03cc55cb3e668addddf47f67a723;
   private static short[] shorts45ad03cc55cb3e668addddf47f67a723;
   private static boolean[] booleans45ad03cc55cb3e668addddf47f67a723;
   private static byte[] bytes45ad03cc55cb3e668addddf47f67a723;

   private static void id_byte() {
      booleans45ad03cc55cb3e668addddf47f67a723 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -988096691002208635L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1216178797;
   }

   private static void id_class() {
      strings45ad03cc55cb3e668addddf47f67a723 = new String[]{
         new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_PLAYER_AROUND")
      };
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, 5, -91, 91, 3, -7, 11, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rryY(), new rryY(), new rryY(), new rryY(), null};
      var0[4] = new rryY[]{(rryY)var0[0], (rryY)var0[1], (rryY)var0[2], (rryY)var0[3]};
      staticFields45ad03cc55cb3e668addddf47f67a723 = var0;
   }

   private static void id_case() {
      shorts45ad03cc55cb3e668addddf47f67a723 = new short[]{4, 0, 1, 2, 3};
   }

   private static void id_protected() {
      bytes45ad03cc55cb3e668addddf47f67a723 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }
}
