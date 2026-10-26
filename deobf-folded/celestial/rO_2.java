package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rO_2 implements rP_2 {
   private static int[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_class;
   private static double[] id_case;
   private static byte[] id_catch;

   private static void id_byte() {
      id_catch = new byte[]{100, 5, 2, 3, 4, 5, 2, 3, 4};
   }

   public rO_2(rfH_2 var1, rpr_3 var2) {
      this.id_private();
      Integer var7 = var1.b_();
      this.id_class[id_byte[0]] = var7;
      Integer var8 = var1.c_();
      this.id_class[1] = var8;
      Integer var9 = var1.d_();
      this.id_class[2] = var9;
      Integer var10 = var2.id_implements();
      this.id_class[3] = var10;
      Integer var11 = var2.id_extends();
      this.id_class[4] = var11;
      if ((Integer)this.id_class[3] == 0 && (Integer)this.id_class[4] == 0) {
         throw new IllegalArgumentException(var2 + "");
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rO_2 var2 = (rO_2)var1;
         return this.id_class[id_byte[18]] == var2.id_class[id_byte[19]]
               && this.id_class[1] == var2.id_class[1]
               && this.id_class[2] == var2.id_class[2]
               && this.id_class[3] == var2.id_class[3]
               && this.id_class[4] == var2.id_class[4]
            ? true
            : id_throws[4];
      } else {
         return id_throws[2];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_protected[0];
      Object[] var10001 = new Object[5];
      var10001[id_throws[5]] = Pd_1.id_class((Integer)this.id_class[id_byte[33]]);
      var10001[1] = Pd_1.id_class((Integer)this.id_class[1]);
      var10001[2] = Pd_1.id_class((Integer)this.id_class[2]);
      var10001[3] = Pd_1.id_class((Integer)this.id_class[3]);
      var10001[4] = Pd_1.id_class((Integer)this.id_class[4]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      int var1 = (int)rU_2.id_byte((Integer)this.id_class[id_byte[28]], (Integer)this.id_class[1], (Integer)this.id_class[2]);
      var1 = var1 * 630627507 + (Integer)this.id_class[3];
      return var1 * -283028380 + (Integer)this.id_class[4];
   }

   @Override
   public double id_class() {
      return Double.NEGATIVE_INFINITY;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -52, 51, 72, 18, 47, 23, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7478469126141294663L;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = (var1 - (Integer)this.id_class[id_byte[7]]) * (Integer)this.id_class[3] + (var3 - (Integer)this.id_class[2]) * (Integer)this.id_class[4];
      int var5 = Math.abs((var1 - (Integer)this.id_class[id_byte[11]]) * (Integer)this.id_class[4])
         + Math.abs((var3 - (Integer)this.id_class[2]) * (Integer)this.id_class[3]);
      int var6 = Math.abs(var2 - (Integer)this.id_class[1]);
      double var7 = (double)(-var4 * 100);
      var7 += (double)(var5 * 1000);
      return var7 + (double)(var6 * 1000);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1306671006;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return id_throws[0];
   }

   private static void id_break() {
      id_protected = new String[]{new String("GoalStrictDirection{x=%s, y=%s, z=%s, dx=%s, dz=%s}")};
   }

   private static void id_throws() {
      id_case = new double[]{Double.NEGATIVE_INFINITY};
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, true, false, true, false, false, true, false, false, true, false, false, false, false};
   }

   private static void id_case() {
      id_break = new int[]{630627507, -283028380};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 2, 3, 4, 3, 4, 0, 3, 2, 4, 0, 4, 2, 3, 1, 1000, 1000, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[id_throws[7]] = Integer.valueOf(id_throws[8]);
         var1[1] = Integer.valueOf(id_throws[10]);
         var1[2] = Integer.valueOf(id_throws[11]);
         var1[3] = Integer.valueOf(id_throws[12]);
         var1[4] = Integer.valueOf(id_throws[13]);
      }
   }
}
