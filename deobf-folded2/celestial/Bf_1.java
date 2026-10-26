package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bf_1 implements Bw_1 {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   @Override
   public Bt_1 id_class(String var1) {
      var1 = var1.toLowerCase();
      if (BI.id_class(var1, (String[])Bl_1.id_class[4])) {
         return new Be_1();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[5])) {
         return new SP();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[7])) {
         return new Bg_1();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[6])) {
         return new Bi_1();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[8])) {
         return new BY();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[9])) {
         return new SE();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[10])) {
         return new Sb_1();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[11])) {
         return new Bj_1();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[12])) {
         return new SS();
      } else if (BI.id_class(var1, (String[])Bl_1.id_class[13])) {
         return new BK();
      } else {
         return BI.id_class(var1, (String[])Bl_1.id_class[14]) ? new BD() : null;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -248498048;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3320816255408605788L;
   }

   private static void id_class() {
      id_class = new short[]{4, 5, 7, 6, 8, 9, 10, 11, 12, 13, 14};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, 40, 107, 51, 86, 97, 33, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
