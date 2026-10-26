package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rM_2 implements rP_2 {
   private static String[] id_break;
   public Object[] id_class;
   private static double[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;
   private static int[] id_catch;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[1]];
         Object[] var1 = this.id_class;
         var1[id_protected[12]] = Integer.valueOf(id_protected[13]);
      }
   }

   public rM_2(double var1, Integer var3, rfH_2... var4) {
      this.id_byte();
      if (var4.length == 0) {
         throw new IllegalArgumentException();
      } else {
         this.id_class[id_case[0]] = var4;
         Integer var10 = (int)(var1 * var1);
         this.id_class[id_case[1]] = var10;
         this.id_class[id_case[2]] = var3;
      }
   }

   public rM_2(double var1, rfH_2... var3) {
      this(var1, null, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_protected[6];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rM_2 var2 = (rM_2)var1;
         return this.id_class[id_case[12]] == var2.id_class[id_case[13]]
               && Arrays.equals((Object[])((rfH_2[])this.id_class[id_case[14]]), (Object[])((rfH_2[])var2.id_class[id_case[15]]))
               && Objects.equals((Integer)this.id_class[id_case[16]], (Integer)var2.id_class[id_case[17]])
            ? id_protected[8]
            : id_protected[9];
      } else {
         return id_protected[7];
      }
   }

   @Override
   public String toString() {
      if ((Integer)this.id_class[id_case[21]] != null) {
         String var10000 = id_break[0];
         Object[] var10001 = new Object[id_throws[0]];
         var10001[id_protected[10]] = Pd_1.id_class((Integer)this.id_class[id_case[22]]);
         var10001[id_protected[11]] = Arrays.asList((rfH_2[])this.id_class[id_case[23]]);
         return String.format(var10000, var10001);
      } else {
         return "GoalRunAwayFrom" + Arrays.asList((rfH_2[])this.id_class[id_case[24]]);
      }
   }

   @Override
   public int hashCode() {
      int var1 = Arrays.hashCode((Object[])((rfH_2[])this.id_class[id_case[18]]));
      var1 = var1 * id_catch[6] + (Integer)this.id_class[id_case[19]];
      return var1 * id_catch[7] + (Integer)this.id_class[id_case[20]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 2, 126, -71, -120, -90, -54, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1109047170;
   }

   @Override
   public double id_class() {
      int var1 = (int)Math.ceil(Math.sqrt((double)((Integer)this.id_class[id_case[10]]).intValue()));
      int var2 = id_catch[0];
      int var3 = id_catch[1];
      int var4 = id_catch[2];
      int var5 = id_catch[3];
      int var6 = id_catch[4];
      int var7 = id_catch[5];
      rfH_2[] var8 = (rfH_2[])this.id_class[id_case[11]];
      int var9 = var8.length;

      for (int var10 = id_protected[5]; var10 < var9; var10++) {
         rfH_2 var11 = var8[var10];
         var2 = Math.min(var2, var11.b_() - var1);
         var3 = Math.min(var3, var11.c_() - var1);
         var4 = Math.min(var4, var11.d_() - var1);
         var5 = Math.max(var2, var11.b_() + var1);
         var6 = Math.max(var3, var11.c_() + var1);
         var7 = Math.max(var4, var11.d_() + var1);
      }

      DoubleOpenHashSet var16 = new DoubleOpenHashSet();
      double var17 = id_byte[3];

      for (int var18 = var2; var18 <= var5; var18++) {
         for (int var12 = var3; var12 <= var6; var12++) {
            for (int var13 = var4; var13 <= var7; var13++) {
               double var14 = this.id_class(var18, var12, var13);
               if (var14 < var17 && this.id_break(var18, var12, var13)) {
                  var16.add(var14);
               } else {
                  var17 = Math.min(var17, var14);
               }
            }
         }
      }

      double var19 = id_byte[4];
      DoubleIterator var20 = var16.iterator();

      while (var20.hasNext()) {
         double var21 = var20.nextDouble();
         if (var21 < var17) {
            var19 = Math.max(var19, var21);
         }
      }

      return var19;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      double var4 = id_byte[0];
      rfH_2[] var6 = (rfH_2[])this.id_class[id_case[7]];
      int var7 = var6.length;

      for (int var8 = id_protected[4]; var8 < var7; var8++) {
         rfH_2 var9 = var6[var8];
         double var10 = rX_2.id_class((double)(var9.b_() - var1), (double)(var9.d_() - var3));
         if (var10 < var4) {
            var4 = var10;
         }
      }

      var4 = -var4;
      if ((Integer)this.id_class[id_case[8]] != null) {
         var4 = var4 * id_byte[1] + rJ_2.id_class((Integer)this.id_class[id_case[9]], var2) * id_byte[2];
      }

      return var4;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5976058835283113264L;
   }

   private static void id_break() {
      id_throws = new byte[]{2, 3};
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      if ((Integer)this.id_class[id_case[3]] != null && (Integer)this.id_class[id_case[4]] != var2) {
         return id_protected[0];
      } else {
         rfH_2[] var4 = (rfH_2[])this.id_class[id_case[5]];
         int var5 = var4.length;

         for (int var6 = id_protected[1]; var6 < var5; var6++) {
            rfH_2 var7 = var4[var6];
            int var8 = var1 - var7.b_();
            int var9 = var3 - var7.d_();
            int var10 = var8 * var8 + var9 * var9;
            if (var10 < (Integer)this.id_class[id_case[6]]) {
               return id_protected[2];
            }
         }

         return id_protected[3];
      }
   }

   private static void id_throws() {
      id_catch = new int[]{
         Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1196803141, -2053788840
      };
   }

   private static void id_catch() {
      id_break = new String[]{new String("GoalRunAwayFromMaintainY y=%s, %s")};
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, false, true, false, false, true, false, true, false, false, true, true, false};
   }

   private static void id_protected() {
      id_case = new short[]{0, 1, 2, 2, 2, 0, 1, 0, 2, 2, 1, 0, 1, 1, 0, 0, 2, 2, 0, 1, 2, 2, 2, 0, 0};
   }

   private static void id_private() {
      id_byte = new double[]{Double.MAX_VALUE, 0.6, 1.5, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
   }
}
