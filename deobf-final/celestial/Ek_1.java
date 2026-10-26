package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ek_1 extends EW {
   private static double[] case_;
   private static byte[] catch_;
   private static short[] private_;
   private static long[] implements_;
   private static String[] finally_;
   public Object[] class_;
   private static boolean[] extends_;

   public Ek_1(rU_2 var1, int var2, int var3, int var4, rP_2 var5, bi_3 var6, EZ var7) {
      super(var1, var2, var3, var4, var5, var7);
      this.volatile_();
      this.class_[0] = var6;
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8601365714148650332L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1963383543;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, -76, 36, -33, -103, 17, 60, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Optional<a_1> break_(long var1, long var3) {
      this.volatile_();
      EQ var47 = this.class_(
         (Integer)this.throws_[1],
         (Integer)this.throws_[2],
         (Integer)this.throws_[3],
         rU_2.byte_((Integer)this.throws_[1], (Integer)this.throws_[2], (Integer)this.throws_[3])
      );
      this.throws_[7] = var47;
      EQ var10000 = (EQ)this.throws_[7];
      Double var48 = 0.0;
      var10000.class_[4] = var48;
      var10000 = (EQ)this.throws_[7];
      Double var49 = (Double)((EQ)this.throws_[7]).class_[3];
      var10000.class_[5] = var49;
      EN var5 = new EN();
      var5.class_((EQ)this.throws_[7]);
      double[] var6 = new double[((double[])break_[0]).length];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = (Double)((EQ)this.throws_[7]).class_[3];
         ((EQ[])this.throws_[9])[var7] = (EQ)this.throws_[7];
      }

      Mr_1 var55 = new Mr_1();
      ba_3 var8 = new ba_3(((rYB)((EZ)this.class_[1]).break_[2]).instanceof_());
      long var9 = System.currentTimeMillis();
      boolean var11 = (Boolean)C_class.instanceof_().synchronized_.class_[0];
      long var12 = var9 + (var11 ? (Long)C_class.instanceof_().j.class_[0] : var1);
      long var14 = var9 + (var11 ? (Long)C_class.instanceof_().j.class_[0] : var3);
      boolean var16 = true;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      boolean var20 = !((bi_3)this.class_[0]).class_() ? true : extends_[6];
      byte var21 = 64;
      int var22 = (Integer)C_class.instanceof_().s.class_[0];
      double var23 = C_class.instanceof_().PC.class_[0] ? 0.01 : case_[2];
      EC[] var25 = EC.values();

      while (!var5.byte_() && var19 < var22 && !this.throws_[11]) {
         if ((var17 & var21 - 1) == 0) {
            long var26 = System.currentTimeMillis();
            if (var26 - var14 >= 0L || !var16 && var26 - var12 >= 0L) {
               break;
            }
         }

         if (var11) {
            try {
               Thread.sleep((Long)C_class.instanceof_().rT.class_[private_[30]]);
            } catch (InterruptedException var54) {
            }
         }

         EQ var56 = var5.break_();
         this.throws_[8] = var56;
         var17++;
         if (((rP_2)this.throws_[4]).break_((Integer)var56.class_[0], (Integer)var56.class_[1], (Integer)var56.class_[2])) {
            return Optional.of(new Ez_1((rU_2)this.throws_[0], (EQ)this.throws_[7], var56, var17, (rP_2)this.throws_[4], (EZ)this.class_[1]));
         }

         for (EC var30 : var25) {
            int var31 = (Integer)var56.class_[0] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[2];
            int var32 = (Integer)var56.class_[2] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[4];
            if ((var31 >> 4 != (Integer)var56.class_[0] >> 4 || var32 >> 4 != (Integer)var56.class_[2] >> 4) && !((EZ)this.class_[1]).class_(var31, var32)) {
               if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[0]) {
                  var19++;
               }
            } else if (((Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[0] || var8.break_(var31, var32))
               && (Integer)var56.class_[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3] <= 256
               && (Integer)var56.class_[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3] >= 0) {
               var55.class_();
               var30.class_((EZ)this.class_[1], (Integer)var56.class_[0], (Integer)var56.class_[1], (Integer)var56.class_[2], var55);
               var18++;
               double var33 = (Double)var55.class_[3];
               if (!(var33 >= 1000000.0)) {
                  if (var33 <= 0.0 || Double.isNaN(var33)) {
                     throw new IllegalStateException(
                        String.format(
                           "%s from %s %s %s calculated implausible cost %s",
                           var30,
                           Pd_1.class_((Integer)var56.class_[0]),
                           Pd_1.class_((Integer)var56.class_[1]),
                           Pd_1.class_((Integer)var56.class_[2]),
                           var33
                        )
                     );
                  }

                  if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[0] || var8.break_((Integer)var55.class_[0], (Integer)var55.class_[2])) {
                     if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[0] && ((Integer)var55.class_[0] != var31 || (Integer)var55.class_[2] != var32)) {
                        throw new IllegalStateException(
                           String.format(
                              "%s from %s %s %s ended at x z %s %s instead of %s %s",
                              var30,
                              Pd_1.class_((Integer)var56.class_[0]),
                              Pd_1.class_((Integer)var56.class_[1]),
                              Pd_1.class_((Integer)var56.class_[2]),
                              Pd_1.class_((Integer)var55.class_[0]),
                              Pd_1.class_((Integer)var55.class_[2]),
                              Pd_1.class_(var31),
                              Pd_1.class_(var32)
                           )
                        );
                     }

                     if (!(Boolean)var30.fields08a057b7f10f37959d555668d812e9fc[1]
                        && (Integer)var55.class_[1] != (Integer)var56.class_[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3]) {
                        throw new IllegalStateException(
                           String.format(
                              "%s from %s %s %s ended at y %s instead of %s",
                              var30,
                              Pd_1.class_((Integer)var56.class_[0]),
                              Pd_1.class_((Integer)var56.class_[1]),
                              Pd_1.class_((Integer)var56.class_[2]),
                              Pd_1.class_((Integer)var55.class_[1]),
                              Pd_1.class_((Integer)var56.class_[1] + (Integer)var30.fields08a057b7f10f37959d555668d812e9fc[3])
                           )
                        );
                     }

                     long var35 = rU_2.byte_((Integer)var55.class_[0], (Integer)var55.class_[1], (Integer)var55.class_[2]);
                     if (var20) {
                        var33 *= ((bi_3)this.class_[0]).class_(var35);
                     }

                     EQ var37 = this.class_((Integer)var55.class_[0], (Integer)var55.class_[1], (Integer)var55.class_[2], var35);
                     double var38 = (Double)var56.class_[4] + var33;
                     if ((Double)var37.class_[4] - var38 > var23) {
                        var37.class_[6] = var56;
                        Double var52 = var38;
                        var37.class_[4] = var52;
                        Double var53 = var38 + (Double)var37.class_[3];
                        var37.class_[5] = var53;
                        if (var37.class_()) {
                           var5.break_(var37);
                        } else {
                           var5.class_(var37);
                        }

                        for (int var40 = extends_[15]; var40 < ((double[])break_[0]).length; var40++) {
                           double var41 = (Double)var37.class_[3] + (Double)var37.class_[4] / ((double[])break_[0])[var40];
                           if (var6[var40] - var41 > var23) {
                              var6[var40] = var41;
                              ((EQ[])this.throws_[9])[var40] = var37;
                              if (var16 && this.class_(var37) > 25.0) {
                                 var16 = false;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return this.throws_[11] ? Optional.empty() : this.class_(true, var17);
   }

   private static void finally_() {
      catch_ = new byte[]{64, 4, 4, 4, 4, 5, 2, 3, 4, 8, 2, 3, 4, 5, 6, 7, 6, 2, 3, 4, 5, 2};
   }

   private static void extends_() {
      implements_ = new long[2];
   }

   private static void implements_() {
      finally_ = new String[]{
         new String("%s from %s %s %s calculated implausible cost %s"),
         new String("%s from %s %s %s ended at x z %s %s instead of %s %s"),
         new String("%s from %s %s %s ended at y %s instead of %s")
      };
   }

   private static void private_() {
      case_ = new double[]{0.0, 0.01, 0.0, 1000000.0, 0.0, 25.0};
   }

   private static void final_() {
      private_ = new short[]{
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

   private void volatile_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void native_() {
      extends_ = new boolean[]{false, true, false, false, false, true, false, true, false, false, true, false, true, false, true, false, false, true};
   }
}
