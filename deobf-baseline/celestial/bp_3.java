package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bp_3 implements D, bj_3 {
   private static short[] id_catch;
   private static double[] id_private;
   public static Object[] id_class;
   private static boolean[] id_implements;
   public Object[] id_break;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[id_implements[9]];
         Object[] var1 = this.id_break;
      }
   }

   public bp_3(C_class var1, by_3 var2) {
      this.id_byte();
      this.id_break[id_catch[0]] = var2;
      var1.s().id_class(this);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7382193856303215155L;
   }

   public static void id_class(Ml_1 var0, rY_2[] var1) {
      float var2 = (Float)id_protected.id_super.id_class[id_catch[1]];
      boolean var3 = (Boolean)id_protected.id_package.id_class[id_catch[2]];
      float var4 = (Float)id_protected.PT.id_class[id_catch[3]];
      if ((Boolean)id_protected.J.id_class[id_catch[4]]) {
         bj_3.id_class((Color)id_protected.id_try.id_class[id_catch[5]], var2, var4, var3);
         rY_2[] var5 = var1;
         int var6 = var1.length;

         for (int var7 = id_implements[0]; var7 < var6; var7++) {
            rY_2 var8 = var5[var7];
            bj_3.id_class(var0, var8.id_break(), id_private[0]);
         }

         if ((Boolean)id_protected.Pw.id_class[id_catch[6]]) {
            bj_3.id_class((Color)id_protected.id_short.id_class[id_catch[7]], var2);
            var5 = var1;
            var6 = var1.length;

            for (int var13 = id_implements[1]; var13 < var6; var13++) {
               rY_2 var15 = var5[var13];
               bj_3.id_class(var0, new rfl_3(var15.id_byte(), var15.id_byte().id_class(id_implements[2], id_implements[3], id_implements[4])));
            }

            bj_3.id_class((Color)id_protected.id_float.id_class[id_catch[8]], var2);
            var5 = var1;
            var6 = var1.length;

            for (int var14 = id_implements[5]; var14 < var6; var14++) {
               rY_2 var16 = var5[var14];
               bj_3.id_class(var0, new rfl_3(var16.id_case(), var16.id_case().id_class(id_implements[6], id_implements[7], id_implements[8])));
            }
         }

         bj_3.id_class(var3);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1124077589;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 49, -43, 123, -67, 100, -2, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_catch = new short[10];
   }

   @Override
   public void id_class(T var1) {
      id_class(var1.id_byte(), ((by_3)this.id_break[id_catch[9]]).id_byte());
   }

   private static void id_break() {
      id_implements = new boolean[]{false, false, true, true, true, false, true, true, true, true, true, false};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{0.005};
      id_class = var0;
   }

   private static void id_protected() {
      id_private = new double[]{0.005, 0.005};
   }
}
