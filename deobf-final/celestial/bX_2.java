package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bX_2 {
   private static short[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static double[] protected_;
   private static float[] throws_;

   private static void byte_() {
      protected_ = new double[]{
         36.0, Double.MAX_VALUE, Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE, 1.0, 1.0, 1.0, 1.0, Double.MAX_VALUE, Double.MAX_VALUE
      };
   }

   static {
      ntfClinit();
   }

   private static Gx_1 class_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      if (var1 instanceof Ja_1) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      } else if (!(var1 instanceof Jj_1)
         && var1 != xu_3.SQ
         && var1 != xu_3.U
         && var1 != xu_3.SM
         && var1 != xu_3.Sx
         && !(var1 instanceof JU)
         && var1 != xu_3.hM
         && !(var1 instanceof Wp_1)
         && !(var1 instanceof Wg_1)
         && !(var1 instanceof zv_3)
         && var1 != xu_3.Jh
         && var1 != xu_3.bn
         && var1 != xu_3.XJ) {
         if (((List)C_class.instanceof_().PD.class_[0]).contains(var1)) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         } else if (!(var1 instanceof dN_2) && !(var1 instanceof dq_3)) {
            if (var1 instanceof xC_2) {
               return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
            } else if (var1 instanceof WD) {
               return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
            } else {
               rXE var2 = var0.volatile_();
               if (!var2.byte_()) {
                  return var2.class_().protected_(var2) != 8
                     ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
                     : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
               } else if (var1 instanceof xp_3) {
                  return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
               } else {
                  try {
                     return var0.class_(null, null, rLT.LAND)
                        ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[class_[12]]
                        : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[class_[13]];
                  } catch (Throwable var4) {
                     System.out
                        .println("The block " + var0.break_().native_().getString() + " requires a special case due to the exception " + var4.getMessage());
                     return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
                  }
               }
            }
         } else {
            return var1 == xu_3.PZ ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2] : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         }
      } else {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
      }
   }

   public rP_2 class_(Ps_1 var1, rfl_3 var2, List<iB_2> var3, List<iB_2> var4) {
      rYB var5 = var1.case_();
      cb_3 var6 = var1.catch_();
      rfH_2 var7 = var6.Bs();
      if (var4 != null && !var4.isEmpty()) {
         float var8 = 1.5F;

         for (iB_2 var10 : var4) {
            if (var10.BC().throws_().private_() && !(var10 instanceof aa_3)) {
               var8 = 3.5F;
               break;
            }
         }

         bx_3 var13 = this.class_(var5, var4, var2, var7, var8);
         if (var13.byte_()) {
            return var13;
         }

         ArrayList var14 = new ArrayList();

         for (iB_2 var12 : var3) {
            if (var12.int_(var6) <= 36.0) {
               var14.add(var12);
            }
         }

         if (!var14.isEmpty()) {
            return this.class_(var5, var14, var2, var7, var8);
         }
      }

      return var3 != null && !var3.isEmpty() ? new rS_2(((iB_2)var3.get(0)).Bs()) : null;
   }

   private bx_3 class_(rYB var1, List<iB_2> var2, rfl_3 var3, rfH_2 var4, float var5) {
      if (var2 != null && !var2.isEmpty()) {
         double var6 = (double)var4.c_();
         double var8 = Double.MAX_VALUE;
         double var10 = Double.MAX_VALUE;
         double var12 = -Double.MAX_VALUE;
         double var14 = -Double.MAX_VALUE;
         float var16 = 0.0F;
         boolean var17 = false;

         for (iB_2 var19 : var2) {
            double var20 = var19.rx();
            double var22 = var19.BO();
            var8 = Math.min(var8, var20);
            var12 = Math.max(var12, var20);
            var10 = Math.min(var10, var22);
            var14 = Math.max(var14, var22);
            if (!var3.byte_(var19.rN())) {
               var16 = 7.0F;
               var17 = true;
            } else if (var19 instanceof rEJ) {
               rEJ var24 = (rEJ)var19;
               if (rrjZ_2.class_(var24)) {
                  var16 = 7.0F;
                  var17 = true;
               }
            }
         }

         var5 = Math.max(var5, var16);
         int var37 = rfU_2.byte_(var8 - (double)var5 - 1.0);
         int var38 = rfU_2.byte_(var12 + (double)var5 + 1.0);
         int var39 = rfU_2.byte_(var10 - (double)var5 - 1.0);
         int var21 = rfU_2.byte_(var14 + (double)var5 + 1.0);
         ArrayList var40 = new ArrayList();
         rfw_3 var23 = new rfw_3();

         for (int var41 = var37; var41 <= var38; var41++) {
            class_(var1, var40, var3, var23, (double)var41, var6, (double)var39);
            class_(var1, var40, var3, var23, (double)var41, var6, (double)var21);
         }

         for (int var42 = var39 + 1; var42 < var21; var42++) {
            class_(var1, var40, var3, var23, (double)var37, var6, (double)var42);
            class_(var1, var40, var3, var23, (double)var38, var6, (double)var42);
         }

         if (var40.isEmpty()) {
            return new bx_3(var4, var5, var17);
         } else {
            rfH_2 var43 = null;
            double var25 = Double.MAX_VALUE;
            ArrayList var27 = new ArrayList();

            for (rfH_2 var29 : var40) {
               double var30 = var29.private_(var4);
               double var32 = Double.MAX_VALUE;

               for (iB_2 var35 : var2) {
                  var32 = Math.min(var32, var29.private_(var35.Bs()));
               }

               if (!(var32 <= var30)) {
                  var27.add(var29);
                  if (var30 < var25) {
                     var25 = var30;
                     var43 = var29;
                  }
               }
            }

            return var27.contains(var4) ? new bx_3(var4, var5, var17) : new bx_3(var43 != null ? var43 : ((iB_2)var2.get(0)).Bs(), var5, var17);
         }
      } else {
         return new bx_3(var4, var5, false);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 38, -81, 69, 22, 14, 21, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 719704123;
   }

   public rS_2 class_(Ps_1 var1, rfl_3 var2, int var3, Runnable var4) {
      rYB var5 = var1.case_();
      int var6 = (int)var2.class_;
      int var7 = (int)var2.break_;
      int var8 = (int)var2.byte_;
      int var9 = (int)var2.protected_;
      int var10 = (int)var2.case_;
      ThreadLocalRandom var11 = ThreadLocalRandom.current();
      int var13 = 0;

      rfH_2 var12;
      do {
         int var14 = var11.nextInt(var6, var9);
         int var15 = var11.nextInt(var8, var10);
         var12 = new rfH_2(var14, var7, var15);
         if (++var13 >= var3) {
            if (var4 != null) {
               var4.run();
            }
            break;
         }
      } while (class_(var5.byte_(var12)) != (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);

      return new bJ_2(this, var12);
   }

   private static void class_(rYB var0, List<rfH_2> var1, rfl_3 var2, rfw_3 var3, double var4, double var6, double var8) {
      var3.break_(var4, var6, var8);
      if (var2.break_(var3) && var0.finally_(var3)) {
         var1.add(var3.int_());
      }
   }

   private static void class_() {
      break_ = new boolean[]{false, false, false, false, true, true, true, false};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7076489370255031419L;
   }

   private static void break_() {
      throws_ = new float[]{1.5F, 3.5F, 0.0F, 7.0F, 7.0F};
   }

   private static void throws_() {
      byte_ = new byte[]{8};
   }

   private static void protected_() {
      class_ = new short[]{0, 0, 2, 0, 2, 2, 0, 1, 1, 2, 1, 2, 0, 2, 1};
   }
}
