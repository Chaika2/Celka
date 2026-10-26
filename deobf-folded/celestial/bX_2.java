package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bX_2 {
   private static short[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static double[] id_protected;
   private static float[] id_throws;

   private static void id_byte() {
      id_protected = new double[]{
         36.0, Double.MAX_VALUE, Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE, 1.0, 1.0, 1.0, 1.0, Double.MAX_VALUE, Double.MAX_VALUE
      };
   }

   static {
      ntfClinit();
   }

   private static Gx_1 id_class(xc_3 var0) {
      xd_3 var1 = var0.id_break();
      if (var1 instanceof Ja_1) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[1]];
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
         if (((List)C_class.id_instanceof().PD.id_class[id_class[3]]).contains(var1)) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         } else if (!(var1 instanceof dN_2) && !(var1 instanceof dq_3)) {
            if (var1 instanceof xC_2) {
               return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
            } else if (var1 instanceof WD) {
               return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
            } else {
               rXE var2 = var0.id_volatile();
               if (!var2.id_byte()) {
                  return var2.id_class().id_protected(var2) != 8
                     ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
                     : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
               } else if (var1 instanceof xp_3) {
                  return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
               } else {
                  try {
                     return var0.id_class(null, null, rLT.LAND)
                        ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[12]]
                        : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
                  } catch (Throwable var4) {
                     System.out
                        .println("The block " + var0.id_break().id_native().getString() + " requires a special case due to the exception " + var4.getMessage());
                     return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
                  }
               }
            }
         } else {
            return var1 == xu_3.PZ
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[6]];
         }
      } else {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
      }
   }

   public rP_2 id_class(Ps_1 var1, rfl_3 var2, List<iB_2> var3, List<iB_2> var4) {
      rYB var5 = var1.id_case();
      cb_3 var6 = var1.id_catch();
      rfH_2 var7 = var6.Bs();
      if (var4 != null && !var4.isEmpty()) {
         float var8 = 1.5F;

         for (iB_2 var10 : var4) {
            if (var10.BC().id_throws().id_private() && !(var10 instanceof aa_3)) {
               var8 = 3.5F;
               break;
            }
         }

         bx_3 var13 = this.id_class(var5, var4, var2, var7, var8);
         if (var13.id_byte()) {
            return var13;
         }

         ArrayList var14 = new ArrayList();

         for (iB_2 var12 : var3) {
            if (var12.id_int(var6) <= 36.0) {
               var14.add(var12);
            }
         }

         if (!var14.isEmpty()) {
            return this.id_class(var5, var14, var2, var7, var8);
         }
      }

      return var3 != null && !var3.isEmpty() ? new rS_2(((iB_2)var3.get(id_break[0])).Bs()) : null;
   }

   private bx_3 id_class(rYB var1, List<iB_2> var2, rfl_3 var3, rfH_2 var4, float var5) {
      if (var2 != null && !var2.isEmpty()) {
         double var6 = (double)var4.c_();
         double var8 = Double.MAX_VALUE;
         double var10 = Double.MAX_VALUE;
         double var12 = -Double.MAX_VALUE;
         double var14 = -Double.MAX_VALUE;
         float var16 = id_throws[2];
         boolean var17 = id_break[3];

         for (iB_2 var19 : var2) {
            double var20 = var19.rx();
            double var22 = var19.BO();
            var8 = Math.min(var8, var20);
            var12 = Math.max(var12, var20);
            var10 = Math.min(var10, var22);
            var14 = Math.max(var14, var22);
            if (!var3.id_byte(var19.rN())) {
               var16 = 7.0F;
               var17 = true;
            } else if (var19 instanceof rEJ) {
               rEJ var24 = (rEJ)var19;
               if (rrjZ_2.id_class(var24)) {
                  var16 = 7.0F;
                  var17 = true;
               }
            }
         }

         var5 = Math.max(var5, var16);
         int var37 = rfU_2.id_byte(var8 - (double)var5 - 1.0);
         int var38 = rfU_2.id_byte(var12 + (double)var5 + 1.0);
         int var39 = rfU_2.id_byte(var10 - (double)var5 - 1.0);
         int var21 = rfU_2.id_byte(var14 + (double)var5 + 1.0);
         ArrayList var40 = new ArrayList();
         rfw_3 var23 = new rfw_3();

         for (int var41 = var37; var41 <= var38; var41++) {
            id_class(var1, var40, var3, var23, (double)var41, var6, (double)var39);
            id_class(var1, var40, var3, var23, (double)var41, var6, (double)var21);
         }

         for (int var42 = var39 + 1; var42 < var21; var42++) {
            id_class(var1, var40, var3, var23, (double)var37, var6, (double)var42);
            id_class(var1, var40, var3, var23, (double)var38, var6, (double)var42);
         }

         if (var40.isEmpty()) {
            return new bx_3(var4, var5, var17);
         } else {
            rfH_2 var43 = null;
            double var25 = Double.MAX_VALUE;
            ArrayList var27 = new ArrayList();

            for (rfH_2 var29 : var40) {
               double var30 = var29.id_private(var4);
               double var32 = Double.MAX_VALUE;

               for (iB_2 var35 : var2) {
                  var32 = Math.min(var32, var29.id_private(var35.Bs()));
               }

               if (!(var32 <= var30)) {
                  var27.add(var29);
                  if (var30 < var25) {
                     var25 = var30;
                     var43 = var29;
                  }
               }
            }

            return var27.contains(var4) ? new bx_3(var4, var5, var17) : new bx_3(var43 != null ? var43 : ((iB_2)var2.get(id_break[7])).Bs(), var5, var17);
         }
      } else {
         return new bx_3(var4, var5, id_break[2]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 38, -81, 69, 22, 14, 21, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 719704123;
   }

   public rS_2 id_class(Ps_1 var1, rfl_3 var2, int var3, Runnable var4) {
      rYB var5 = var1.id_case();
      int var6 = (int)var2.id_class;
      int var7 = (int)var2.id_break;
      int var8 = (int)var2.id_byte;
      int var9 = (int)var2.id_protected;
      int var10 = (int)var2.id_case;
      ThreadLocalRandom var11 = ThreadLocalRandom.current();
      int var13 = id_break[1];

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
      } while (id_class(var5.id_byte(var12)) != (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_class[0]]);

      return new bJ_2(this, var12);
   }

   private static void id_class(rYB var0, List<rfH_2> var1, rfl_3 var2, rfw_3 var3, double var4, double var6, double var8) {
      var3.id_break(var4, var6, var8);
      if (var2.id_break(var3) && var0.id_finally(var3)) {
         var1.add(var3.id_int());
      }
   }

   private static void id_class() {
      id_break = new boolean[]{false, false, false, false, true, true, true, false};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7076489370255031419L;
   }

   private static void id_break() {
      id_throws = new float[]{1.5F, 3.5F, 0.0F, 7.0F, 7.0F};
   }

   private static void id_throws() {
      id_byte = new byte[]{8};
   }

   private static void id_protected() {
      id_class = new short[]{0, 0, 2, 0, 2, 2, 0, 1, 1, 2, 1, 2, 0, 2, 1};
   }
}
