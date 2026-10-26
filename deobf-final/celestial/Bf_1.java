package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bf_1 implements Bw_1 {
   private static short[] class_;

   static {
      ntfClinit();
   }

   @Override
   public Bt_1 class_(String var1) {
      var1 = var1.toLowerCase();
      if (BI.class_(var1, (String[])Bl_1.class_[4])) {
         return new Be_1();
      } else if (BI.class_(var1, (String[])Bl_1.class_[5])) {
         return new SP();
      } else if (BI.class_(var1, (String[])Bl_1.class_[7])) {
         return new Bg_1();
      } else if (BI.class_(var1, (String[])Bl_1.class_[6])) {
         return new Bi_1();
      } else if (BI.class_(var1, (String[])Bl_1.class_[8])) {
         return new BY();
      } else if (BI.class_(var1, (String[])Bl_1.class_[9])) {
         return new SE();
      } else if (BI.class_(var1, (String[])Bl_1.class_[10])) {
         return new Sb_1();
      } else if (BI.class_(var1, (String[])Bl_1.class_[11])) {
         return new Bj_1();
      } else if (BI.class_(var1, (String[])Bl_1.class_[12])) {
         return new SS();
      } else if (BI.class_(var1, (String[])Bl_1.class_[13])) {
         return new BK();
      } else {
         return BI.class_(var1, (String[])Bl_1.class_[14]) ? new BD() : null;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -248498048;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3320816255408605788L;
   }

   private static void class_() {
      class_ = new short[]{4, 5, 7, 6, 8, 9, 10, 11, 12, 13, 14};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, 40, 107, 51, 86, 97, 33, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
