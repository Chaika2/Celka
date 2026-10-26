package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rs_3 implements rP_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static double[] id_protected;

   private static void id_byte() {
      id_break = new short[9];
   }

   public rs_3(rP_2... var1) {
      this.id_throws();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rs_3 var2 = (rs_3)var1;
         return Arrays.equals((Object[])((rP_2[])this.id_class[0]), (Object[])((rP_2[])var2.id_class[0]));
      } else {
         return id_byte[6];
      }
   }

   @Override
   public String toString() {
      return "GoalComposite" + Arrays.toString((Object[])((rP_2[])this.id_class[0]));
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode((Object[])((rP_2[])this.id_class[0]));
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      double var4 = Double.MAX_VALUE;

      for (rP_2 var9 : (rP_2[])this.id_class[0]) {
         var4 = Math.min(var4, var9.id_class(var1, var2, var3));
      }

      return var4;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 796425861;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 106, -37, -44, 22, -77, -117, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -592638550000721693L;
   }

   @Override
   public double id_class() {
      double var1 = Double.MAX_VALUE;

      for (rP_2 var6 : (rP_2[])this.id_class[0]) {
         var1 = Math.min(var1, var6.id_class());
      }

      return var1;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      for (rP_2 var7 : (rP_2[])this.id_class[0]) {
         if (var7.id_break(var1, var2, var3)) {
            return true;
         }
      }

      return id_byte[2];
   }

   public rP_2[] id_break() {
      return (rP_2[])this.id_class[0];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_byte = new boolean[]{false, true, false, false, false, true, false, true};
   }

   private static void id_protected() {
      id_protected = new double[]{Double.MAX_VALUE, Double.MAX_VALUE};
   }
}
