package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ek_1 extends EW {
   private static double[] id_case;
   private static byte[] id_catch;
   private static short[] id_private;
   private static long[] id_implements;
   private static String[] id_finally;
   public Object[] id_class;
   private static boolean[] id_extends;

   public Ek_1(rU_2 var1, int var2, int var3, int var4, rP_2 var5, bi_3 var6, EZ var7) {
      super(var1, var2, var3, var4, var5, var7);
      this.id_volatile();
      this.id_class[id_private[0]] = var6;
      this.id_class[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8601365714148650332L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1963383543;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, -76, 36, -33, -103, 17, 60, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Optional<a_1> id_break(long var1, long var3) {
      this.id_volatile();
      EQ var47 = this.id_class(
         (Integer)this.id_throws[1],
         (Integer)this.id_throws[2],
         (Integer)this.id_throws[3],
         rU_2.id_byte((Integer)this.id_throws[1], (Integer)this.id_throws[2], (Integer)this.id_throws[3])
      );
      this.id_throws[7] = var47;
      EQ var10000 = (EQ)this.id_throws[7];
      Double var48 = id_case[0];
      var10000.id_class[4] = var48;
      var10000 = (EQ)this.id_throws[7];
      Double var49 = (Double)((EQ)this.id_throws[7]).id_class[3];
      var10000.id_class[5] = var49;
      EN var5 = new EN();
      var5.id_class((EQ)this.id_throws[7]);
      double[] var6 = new double[((double[])id_break[id_private[16]]).length];

      for (int var7 = id_extends[0]; var7 < var6.length; var7++) {
         var6[var7] = (Double)((EQ)this.id_throws[7]).id_class[3];
         ((EQ[])this.id_throws[9])[var7] = (EQ)this.id_throws[7];
      }

      Mr_1 var55 = new Mr_1();
      ba_3 var8 = new ba_3(((rYB)((EZ)this.id_class[1]).id_break[2]).id_instanceof());
      long var9 = System.currentTimeMillis();
      boolean var11 = (Boolean)C_class.id_instanceof().id_synchronized.id_class[id_private[23]];
      long var12 = var9 + (var11 ? (Long)C_class.id_instanceof().j.id_class[id_private[24]] : var1);
      long var14 = var9 + (var11 ? (Long)C_class.id_instanceof().j.id_class[id_private[25]] : var3);
      boolean var16 = true;
      int var17 = id_extends[2];
      int var18 = id_extends[3];
      int var19 = id_extends[4];
      boolean var20 = !((bi_3)this.id_class[id_private[26]]).id_class() ? true : id_extends[6];
      byte var21 = 64;
      int var22 = (Integer)C_class.id_instanceof().s.id_class[id_private[27]];
      double var23 = C_class.id_instanceof().PC.id_class[id_private[28]] ? 0.01 : id_case[2];
      EC[] var25 = EC.values();

      while (!var5.id_byte() && var19 < var22 && !this.id_throws[11]) {
         if ((var17 & var21 - 1) == 0) {
            long var26 = System.currentTimeMillis();
            if (var26 - var14 >= id_implements[0] || !var16 && var26 - var12 >= id_implements[1]) {
               break;
            }
         }

         if (var11) {
            try {
               Thread.sleep((Long)C_class.id_instanceof().rT.id_class[id_private[30]]);
            } catch (InterruptedException var54) {
            }
         }

         EQ var56 = var5.id_break();
         this.id_throws[8] = var56;
         var17++;
         if (((rP_2)this.id_throws[4]).id_break((Integer)var56.id_class[id_private[33]], (Integer)var56.id_class[1], (Integer)var56.id_class[2])) {
            return Optional.of(
               new Ez_1((rU_2)this.id_throws[id_private[36]], (EQ)this.id_throws[7], var56, var17, (rP_2)this.id_throws[4], (EZ)this.id_class[1])
            );
         }

         EC[] var27 = var25;
         int var28 = var25.length;

         for (int var29 = id_extends[8]; var29 < var28; var29++) {
            EC var30 = var27[var29];
            int var31 = (Integer)var56.id_class[id_private[40]] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[2];
            int var32 = (Integer)var56.id_class[2] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[4];
            if ((var31 >> 4 != (Integer)var56.id_class[id_private[44]] >> 4 || var32 >> 4 != (Integer)var56.id_class[2] >> 4)
               && !((EZ)this.id_class[1]).id_class(var31, var32)) {
               if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[id_private[47]]) {
                  var19++;
               }
            } else if (((Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[id_private[48]] || var8.id_break(var31, var32))
               && (Integer)var56.id_class[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3] <= 256
               && (Integer)var56.id_class[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3] >= 0) {
               var55.id_class();
               var30.id_class((EZ)this.id_class[1], (Integer)var56.id_class[id_private[55]], (Integer)var56.id_class[1], (Integer)var56.id_class[2], var55);
               var18++;
               double var33 = (Double)var55.id_class[3];
               if (!(var33 >= 1000000.0)) {
                  if (var33 <= id_case[4] || Double.isNaN(var33)) {
                     String var59 = id_finally[0];
                     Object[] var61 = new Object[5];
                     var61[id_extends[9]] = var30;
                     var61[1] = Pd_1.id_class((Integer)var56.id_class[id_private[59]]);
                     var61[2] = Pd_1.id_class((Integer)var56.id_class[1]);
                     var61[3] = Pd_1.id_class((Integer)var56.id_class[2]);
                     var61[4] = var33;
                     throw new IllegalStateException(String.format(var59, var61));
                  }

                  if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[id_private[62]]
                     || var8.id_break((Integer)var55.id_class[id_private[63]], (Integer)var55.id_class[2])) {
                     if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[id_private[65]]
                        && ((Integer)var55.id_class[id_private[66]] != var31 || (Integer)var55.id_class[2] != var32)) {
                        String var58 = id_finally[1];
                        Object[] var60 = new Object[8];
                        var60[id_extends[11]] = var30;
                        var60[1] = Pd_1.id_class((Integer)var56.id_class[id_private[68]]);
                        var60[2] = Pd_1.id_class((Integer)var56.id_class[1]);
                        var60[3] = Pd_1.id_class((Integer)var56.id_class[2]);
                        var60[4] = Pd_1.id_class((Integer)var55.id_class[id_private[71]]);
                        var60[5] = Pd_1.id_class((Integer)var55.id_class[2]);
                        var60[6] = Pd_1.id_class(var31);
                        var60[7] = Pd_1.id_class(var32);
                        throw new IllegalStateException(String.format(var58, var60));
                     }

                     if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[1]
                        && (Integer)var55.id_class[1] != (Integer)var56.id_class[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3]) {
                        String var10002 = id_finally[2];
                        Object[] var10003 = new Object[6];
                        var10003[id_extends[13]] = var30;
                        var10003[1] = Pd_1.id_class((Integer)var56.id_class[id_private[77]]);
                        var10003[2] = Pd_1.id_class((Integer)var56.id_class[1]);
                        var10003[3] = Pd_1.id_class((Integer)var56.id_class[2]);
                        var10003[4] = Pd_1.id_class((Integer)var55.id_class[1]);
                        var10003[5] = Pd_1.id_class((Integer)var56.id_class[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3]);
                        throw new IllegalStateException(String.format(var10002, var10003));
                     }

                     long var35 = rU_2.id_byte((Integer)var55.id_class[id_private[83]], (Integer)var55.id_class[1], (Integer)var55.id_class[2]);
                     if (var20) {
                        var33 *= ((bi_3)this.id_class[id_private[86]]).id_class(var35);
                     }

                     EQ var37 = this.id_class((Integer)var55.id_class[id_private[87]], (Integer)var55.id_class[1], (Integer)var55.id_class[2], var35);
                     double var38 = (Double)var56.id_class[4] + var33;
                     if ((Double)var37.id_class[4] - var38 > var23) {
                        var37.id_class[6] = var56;
                        Double var52 = var38;
                        var37.id_class[4] = var52;
                        Double var53 = var38 + (Double)var37.id_class[3];
                        var37.id_class[5] = var53;
                        if (var37.id_class()) {
                           var5.id_break(var37);
                        } else {
                           var5.id_class(var37);
                        }

                        for (int var40 = id_extends[15]; var40 < ((double[])id_break[id_private[96]]).length; var40++) {
                           double var41 = (Double)var37.id_class[3] + (Double)var37.id_class[4] / ((double[])id_break[id_private[99]])[var40];
                           if (var6[var40] - var41 > var23) {
                              var6[var40] = var41;
                              ((EQ[])this.id_throws[9])[var40] = var37;
                              if (var16 && this.id_class(var37) > 25.0) {
                                 var16 = id_extends[16];
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return this.id_throws[11] ? Optional.empty() : this.id_class(true, var17);
   }

   private static void id_finally() {
      id_catch = new byte[]{64, 4, 4, 4, 4, 5, 2, 3, 4, 8, 2, 3, 4, 5, 6, 7, 6, 2, 3, 4, 5, 2};
   }

   private static void id_extends() {
      id_implements = new long[2];
   }

   private static void id_implements() {
      id_finally = new String[]{
         new String("%s from %s %s %s calculated implausible cost %s"),
         new String("%s from %s %s %s ended at x z %s %s instead of %s %s"),
         new String("%s from %s %s %s ended at y %s instead of %s")
      };
   }

   private static void id_private() {
      id_case = new double[]{0.0, 0.01, 0.0, 1000000.0, 0.0, 25.0};
   }

   private static void id_final() {
      id_private = new short[]{
         0,
         1,
         1,
         2,
         3,
         1,
         2,
         3,
         7,
         7,
         4,
         7,
         7,
         3,
         5,
         7,
         0,
         7,
         3,
         9,
         7,
         1,
         2,
         0,
         0,
         0,
         0,
         0,
         0,
         11,
         0,
         8,
         4,
         0,
         1,
         2,
         0,
         7,
         4,
         1,
         0,
         2,
         2,
         4,
         0,
         2,
         1,
         0,
         0,
         1,
         3,
         256,
         1,
         3,
         1,
         0,
         1,
         2,
         3,
         0,
         1,
         2,
         0,
         0,
         2,
         0,
         0,
         2,
         0,
         1,
         2,
         0,
         2,
         1,
         1,
         1,
         3,
         0,
         1,
         2,
         1,
         1,
         3,
         0,
         1,
         2,
         0,
         0,
         1,
         2,
         4,
         4,
         6,
         4,
         3,
         5,
         0,
         3,
         4,
         0,
         9,
         11
      };
   }

   private void id_volatile() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_native() {
      id_extends = new boolean[]{false, true, false, false, false, true, false, true, false, false, true, false, true, false, true, false, false, true};
   }
}
