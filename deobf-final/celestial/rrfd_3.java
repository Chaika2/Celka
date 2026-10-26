package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfd_3 {
   ;
   private static byte[] bytes910c98266de533b4bd870045b610162a;
   public static Object[] staticFields910c98266de533b4bd870045b610162a;
   private static boolean[] booleans910c98266de533b4bd870045b610162a;
   private static short[] shorts910c98266de533b4bd870045b610162a;
   private static String[] strings910c98266de533b4bd870045b610162a;

   private static void byte_() {
      strings910c98266de533b4bd870045b610162a = new String[]{
         new String("OTHER"),
         new String("TALISMAN"),
         new String("SPHERE"),
         new String("SWORD"),
         new String("PICKAXE"),
         new String("ELYTRA"),
         new String("TRIDENT"),
         new String("ARMOR"),
         new String("CROSSBOW"),
         new String("POTION"),
         new String("ARROW"),
         new String("LOCKPICK"),
         new String("SIGNAL_FIRE"),
         new String("TRAP_SKINS"),
         new String("TEST")
      };
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, 28, -35, 78, -93, -73, -19, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 261717342;
   }

   private static void class_() {
      Object[] var0 = new Object[]{
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         new rrfd_3(),
         null
      };
      var0[15] = new rrfd_3[]{
         (rrfd_3)var0[0],
         (rrfd_3)var0[1],
         (rrfd_3)var0[2],
         (rrfd_3)var0[3],
         (rrfd_3)var0[4],
         (rrfd_3)var0[5],
         (rrfd_3)var0[6],
         (rrfd_3)var0[7],
         (rrfd_3)var0[8],
         (rrfd_3)var0[9],
         (rrfd_3)var0[10],
         (rrfd_3)var0[11],
         (rrfd_3)var0[12],
         (rrfd_3)var0[13],
         (rrfd_3)var0[14]
      };
      staticFields910c98266de533b4bd870045b610162a = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 222553596327450959L;
   }

   private static void break_() {
      booleans910c98266de533b4bd870045b610162a = new boolean[]{false, true, false, false, true, true};
   }

   private static void case_() {
      shorts910c98266de533b4bd870045b610162a = new short[]{15, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
   }

   private static void protected_() {
      bytes910c98266de533b4bd870045b610162a = new byte[]{
         15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16
      };
   }
}
