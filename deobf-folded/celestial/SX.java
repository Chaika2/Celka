package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SX implements Bw_1 {
   private static boolean[] id_class;
   private static short[] id_break;

   static {
      ntfClinit();
   }

   @Override
   public Bt_1 id_class(String var1) {
      var1 = var1.toLowerCase();
      String[] var2 = (String[])BH.id_class[id_break[0]];
      int var3 = var2.length;

      for (int var4 = id_class[0]; var4 < var3; var4++) {
         String var5 = var2[var4];
         if (var1.contains(var5)) {
            return new SJ();
         }
      }

      var2 = (String[])BH.id_class[1];
      var3 = var2.length;

      for (int var13 = id_class[1]; var13 < var3; var13++) {
         String var16 = var2[var13];
         if (var1.contains(var16)) {
            return new Sd_1();
         }
      }

      var2 = (String[])BH.id_class[2];
      var3 = var2.length;

      for (int var14 = id_class[2]; var14 < var3; var14++) {
         String var17 = var2[var14];
         if (var1.contains(var17)) {
            return new Sk_1();
         }
      }

      var2 = (String[])BH.id_class[3];
      var3 = var2.length;

      for (int var15 = id_class[3]; var15 < var3; var15++) {
         String var18 = var2[var15];
         if (var1.contains(var18)) {
            return new SW();
         }
      }

      return null;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -684867440;
   }

   private static void id_class() {
      id_class = new boolean[4];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1493947366313965655L;
   }

   private static void id_break() {
      id_break = new short[]{0, 1, 2, 3};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -50, 81, 86, -22, 59, -1, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
