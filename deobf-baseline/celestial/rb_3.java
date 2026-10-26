package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rb_3 implements PZ, rP_2 {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static double[] id_throws;
   private static String[] id_case;

   private static void id_byte() {
      id_break = new byte[]{4, 2, 3, 4, 2, 3};
   }

   public rb_3(rfH_2 var1, int var2) {
      this.id_throws();
      Integer var7 = var1.b_();
      this.id_class[id_byte[0]] = var7;
      Integer var8 = var1.c_();
      this.id_class[id_byte[1]] = var8;
      Integer var9 = var1.d_();
      this.id_class[id_byte[2]] = var9;
      Integer var10 = var2 * var2;
      this.id_class[id_byte[3]] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_protected[2];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rb_3 var2 = (rb_3)var1;
         return this.id_class[id_byte[21]] == var2.id_class[id_byte[22]]
               && this.id_class[id_byte[23]] == var2.id_class[id_byte[24]]
               && this.id_class[id_byte[25]] == var2.id_class[id_byte[26]]
               && this.id_class[id_byte[27]] == var2.id_class[id_byte[28]]
            ? id_protected[4]
            : id_protected[5];
      } else {
         return id_protected[3];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_case[0];
      Object[] var10001 = new Object[id_break[0]];
      var10001[id_protected[6]] = Pd_1.id_class((Integer)this.id_class[id_byte[33]]);
      var10001[id_protected[7]] = Pd_1.id_class((Integer)this.id_class[id_byte[34]]);
      var10001[id_break[1]] = Pd_1.id_class((Integer)this.id_class[id_byte[35]]);
      var10001[id_break[2]] = (Integer)this.id_class[id_byte[36]];
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return (int)rU_2.id_byte((Integer)this.id_class[id_byte[29]], (Integer)this.id_class[id_byte[30]], (Integer)this.id_class[id_byte[31]])
         + (Integer)this.id_class[id_byte[32]];
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_byte[8]];
      int var5 = var2 - (Integer)this.id_class[id_byte[9]];
      int var6 = var3 - (Integer)this.id_class[id_byte[10]];
      return rS_2.id_class((double)var4, var5, (double)var6);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1333548188069331969L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -550505083;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 67, 55, -70, 98, 98, 89, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public double id_class() {
      int var1 = (int)Math.ceil(Math.sqrt((double)((Integer)this.id_class[id_byte[11]]).intValue()));
      DoubleOpenHashSet var2 = new DoubleOpenHashSet();
      double var3 = id_throws[0];

      for (int var5 = -var1; var5 <= var1; var5++) {
         for (int var6 = -var1; var6 <= var1; var6++) {
            for (int var7 = -var1; var7 <= var1; var7++) {
               double var8 = this.id_class(
                  (Integer)this.id_class[id_byte[12]] + var5, (Integer)this.id_class[id_byte[13]] + var6, (Integer)this.id_class[id_byte[14]] + var7
               );
               if (var8 < var3
                  && this.id_break(
                     (Integer)this.id_class[id_byte[15]] + var5, (Integer)this.id_class[id_byte[16]] + var6, (Integer)this.id_class[id_byte[17]] + var7
                  )) {
                  var2.add(var8);
               } else {
                  var3 = Math.min(var3, var8);
               }
            }
         }
      }

      double var10 = id_throws[1];
      DoubleIterator var11 = var2.iterator();

      while (var11.hasNext()) {
         double var12 = var11.nextDouble();
         if (var12 < var3) {
            var10 = Math.max(var10, var12);
         }
      }

      return var10;
   }

   @Override
   public rfH_2 id_break() {
      return new rfH_2((Integer)this.id_class[id_byte[18]], (Integer)this.id_class[id_byte[19]], (Integer)this.id_class[id_byte[20]]);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_byte[4]];
      int var5 = var2 - (Integer)this.id_class[id_byte[5]];
      int var6 = var3 - (Integer)this.id_class[id_byte[6]];
      return var4 * var4 + var5 * var5 + var6 * var6 <= this.id_class[id_byte[7]] ? id_protected[0] : id_protected[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[3]];
         Object[] var1 = this.id_class;
         var1[id_protected[8]] = Integer.valueOf(id_protected[9]);
         var1[id_protected[10]] = Integer.valueOf(id_protected[11]);
         var1[id_break[4]] = Integer.valueOf(id_protected[12]);
         var1[id_break[5]] = Integer.valueOf(id_protected[13]);
      }
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static void id_case() {
      id_throws = new double[]{Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
   }

   private static void id_protected() {
      id_case = new String[]{new String("GoalNear{x=%s, y=%s, z=%s, rangeSq=%d}")};
   }

   private static void id_private() {
      id_protected = new boolean[]{true, false, true, false, true, false, false, true, false, false, true, false, false, false};
   }
}
