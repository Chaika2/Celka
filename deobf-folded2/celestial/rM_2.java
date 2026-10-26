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
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = 0;
      }
   }

   public rM_2(double var1, Integer var3, rfH_2... var4) {
      this.id_byte();
      if (var4.length == 0) {
         throw new IllegalArgumentException();
      } else {
         this.id_class[0] = var4;
         Integer var10 = (int)(var1 * var1);
         this.id_class[1] = var10;
         this.id_class[2] = var3;
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
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rM_2 var2 = (rM_2)var1;
         return this.id_class[1] == var2.id_class[1]
               && Arrays.equals((Object[])((rfH_2[])this.id_class[0]), (Object[])((rfH_2[])var2.id_class[0]))
               && Objects.equals((Integer)this.id_class[2], (Integer)var2.id_class[2])
            ? true
            : id_protected[9];
      } else {
         return id_protected[7];
      }
   }

   @Override
   public String toString() {
      return (Integer)this.id_class[2] != null
         ? String.format("GoalRunAwayFromMaintainY y=%s, %s", Pd_1.id_class((Integer)this.id_class[2]), Arrays.asList((rfH_2[])this.id_class[0]))
         : "GoalRunAwayFrom" + Arrays.asList((rfH_2[])this.id_class[0]);
   }

   @Override
   public int hashCode() {
      int var1 = Arrays.hashCode((Object[])((rfH_2[])this.id_class[0]));
      var1 = var1 * 1196803141 + (Integer)this.id_class[1];
      return var1 * -2053788840 + (Integer)this.id_class[2];
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
      int var1 = (int)Math.ceil(Math.sqrt((double)((Integer)this.id_class[1]).intValue()));
      int var2 = Integer.MAX_VALUE;
      int var3 = Integer.MAX_VALUE;
      int var4 = Integer.MAX_VALUE;
      int var5 = Integer.MIN_VALUE;
      int var6 = Integer.MIN_VALUE;
      int var7 = Integer.MIN_VALUE;

      for (rfH_2 var11 : (rfH_2[])this.id_class[0]) {
         var2 = Math.min(var2, var11.b_() - var1);
         var3 = Math.min(var3, var11.c_() - var1);
         var4 = Math.min(var4, var11.d_() - var1);
         var5 = Math.max(var2, var11.b_() + var1);
         var6 = Math.max(var3, var11.c_() + var1);
         var7 = Math.max(var4, var11.d_() + var1);
      }

      DoubleOpenHashSet var16 = new DoubleOpenHashSet();
      double var17 = Double.POSITIVE_INFINITY;

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
      double var4 = Double.MAX_VALUE;

      for (rfH_2 var9 : (rfH_2[])this.id_class[0]) {
         double var10 = rX_2.id_class((double)(var9.b_() - var1), (double)(var9.d_() - var3));
         if (var10 < var4) {
            var4 = var10;
         }
      }

      var4 = -var4;
      if ((Integer)this.id_class[2] != null) {
         var4 = var4 * 0.6 + rJ_2.id_class((Integer)this.id_class[2], var2) * 1.5;
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
      if ((Integer)this.id_class[2] != null && (Integer)this.id_class[2] != var2) {
         return false;
      } else {
         for (rfH_2 var7 : (rfH_2[])this.id_class[0]) {
            int var8 = var1 - var7.b_();
            int var9 = var3 - var7.d_();
            int var10 = var8 * var8 + var9 * var9;
            if (var10 < (Integer)this.id_class[1]) {
               return false;
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
