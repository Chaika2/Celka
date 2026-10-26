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
      this.id_class[id_byte[1]] = var8;
      Integer var9 = var1.d_();
      this.id_class[id_byte[2]] = var9;
      Integer var10 = var2.id_implements();
      this.id_class[id_byte[3]] = var10;
      Integer var11 = var2.id_extends();
      this.id_class[id_byte[4]] = var11;
      if ((Integer)this.id_class[id_byte[5]] == 0 && (Integer)this.id_class[id_byte[6]] == 0) {
         throw new IllegalArgumentException(var2 + "");
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_throws[1];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rO_2 var2 = (rO_2)var1;
         return this.id_class[id_byte[18]] == var2.id_class[id_byte[19]]
               && this.id_class[id_byte[20]] == var2.id_class[id_byte[21]]
               && this.id_class[id_byte[22]] == var2.id_class[id_byte[23]]
               && this.id_class[id_byte[24]] == var2.id_class[id_byte[25]]
               && this.id_class[id_byte[26]] == var2.id_class[id_byte[27]]
            ? id_throws[3]
            : id_throws[4];
      } else {
         return id_throws[2];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_protected[0];
      Object[] var10001 = new Object[id_catch[1]];
      var10001[id_throws[5]] = Pd_1.id_class((Integer)this.id_class[id_byte[33]]);
      var10001[id_throws[6]] = Pd_1.id_class((Integer)this.id_class[id_byte[34]]);
      var10001[id_catch[2]] = Pd_1.id_class((Integer)this.id_class[id_byte[35]]);
      var10001[id_catch[3]] = Pd_1.id_class((Integer)this.id_class[id_byte[36]]);
      var10001[id_catch[4]] = Pd_1.id_class((Integer)this.id_class[id_byte[37]]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      int var1 = (int)rU_2.id_byte((Integer)this.id_class[id_byte[28]], (Integer)this.id_class[id_byte[29]], (Integer)this.id_class[id_byte[30]]);
      var1 = var1 * id_break[0] + (Integer)this.id_class[id_byte[31]];
      return var1 * id_break[1] + (Integer)this.id_class[id_byte[32]];
   }

   @Override
   public double id_class() {
      return id_case[0];
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
      int var4 = (var1 - (Integer)this.id_class[id_byte[7]]) * (Integer)this.id_class[id_byte[8]]
         + (var3 - (Integer)this.id_class[id_byte[9]]) * (Integer)this.id_class[id_byte[10]];
      int var5 = Math.abs((var1 - (Integer)this.id_class[id_byte[11]]) * (Integer)this.id_class[id_byte[12]])
         + Math.abs((var3 - (Integer)this.id_class[id_byte[13]]) * (Integer)this.id_class[id_byte[14]]);
      int var6 = Math.abs(var2 - (Integer)this.id_class[id_byte[15]]);
      double var7 = (double)(-var4 * id_catch[0]);
      var7 += (double)(var5 * id_byte[16]);
      return var7 + (double)(var6 * id_byte[17]);
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
         this.id_class = new Object[id_catch[5]];
         Object[] var1 = this.id_class;
         var1[id_throws[7]] = Integer.valueOf(id_throws[8]);
         var1[id_throws[9]] = Integer.valueOf(id_throws[10]);
         var1[id_catch[6]] = Integer.valueOf(id_throws[11]);
         var1[id_catch[7]] = Integer.valueOf(id_throws[12]);
         var1[id_catch[8]] = Integer.valueOf(id_throws[13]);
      }
   }
}
