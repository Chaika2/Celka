package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gb_1 extends Ev_1 {
   private static boolean[] super_;
   public Object[] continue_;
   private static String[] this_;
   private static double[] else_;
   private static byte[] synchronized_;
   private static float[] return_;
   private static short[] public_;

   @Override
   public EA byte_(EA var1) {
      this.continue_();
      super.byte_(var1);
      xc_3 var2 = bw_3.class_((Ps_1)this.new_[1], ((rU_2[])this.new_[5])[0]);
      xc_3 var3 = bw_3.class_((Ps_1)this.new_[1], ((rU_2[])this.new_[5])[1]);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         if (!(Boolean)C_class.instanceof_().d.class_[0]) {
            return var1;
         } else if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[0]) {
            return var1;
         } else if (EF.throws_(var2)) {
            return var1;
         } else if (EF.throws_(var3)) {
            return var1;
         } else {
            double var29 = Math.max(
               Math.abs(((Ps_1)this.new_[1]).catch_().Ps().break_ - ((double)((rU_2)this.new_[4]).b_() + 0.5)),
               Math.abs(((Ps_1)this.new_[1]).catch_().Ps().protected_ - ((double)((rU_2)this.new_[4]).d_() + 0.5))
            );
            if (var29 < 0.83) {
               return var1;
            } else if (!var1.class_().break_().isPresent()) {
               return var1;
            } else {
               float var32 = PJ.class_(
                     ((Ps_1)this.new_[1]).finally_(), Pu_1.class_(((Ps_1)this.new_[1]).case_(), (rU_2)this.new_[4]), ((Ps_1)this.new_[1]).protected_()
                  )
                  .throws_();
               float var35 = var1.class_().break_().get().protected_();
               if (EF.catch_(var2) || var2.break_() instanceof Ja_1 && (EF.catch_(var3) || var3.break_() instanceof Ja_1)) {
                  var35 = return_[0];
               }

               return var1.class_(new En_1(new PX(var32, var35), true))
                  .class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true)
                  .class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
            }
         }
      } else {
         var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], false);
         xd_3 var4 = bw_3.class_((Ps_1)this.new_[1], ((rU_2)this.new_[3]).case_()).break_();
         boolean var5 = var4 != xu_3.PJ && var4 != xu_3.BD ? super_[32] : super_[31];
         if (var2.break_() instanceof dN_2 || var3.break_() instanceof dN_2) {
            boolean var6 = (!(var2.break_() instanceof dN_2) || EF.class_((Ps_1)this.new_[1], (rU_2)this.new_[3], (rU_2)this.new_[4]))
                  && (!(var3.break_() instanceof dN_2) || EF.class_((Ps_1)this.new_[1], (rU_2)this.new_[4], (rU_2)this.new_[3]))
               ? super_[34]
               : super_[33];
            boolean var7 = !xu_3.PZ.equals(var2.break_()) && !xu_3.PZ.equals(var3.break_()) ? true : super_[36];
            if (var6 && var7) {
               return var1.class_(
                     new En_1(
                        PJ.class_(
                           ((Ps_1)this.new_[1]).finally_(),
                           Pu_1.class_(((Ps_1)this.new_[1]).case_(), ((rU_2[])this.new_[5])[0]),
                           ((Ps_1)this.new_[1]).protected_()
                        ),
                        true
                     )
                  )
                  .class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
            }
         }

         if (var2.break_() instanceof dq_3 || var3.break_() instanceof dq_3) {
            rU_2 var30 = !EF.break_((Ps_1)this.new_[1], ((rU_2[])this.new_[5])[0], ((rU_2)this.new_[3]).class_())
               ? ((rU_2[])this.new_[5])[0]
               : (!EF.break_((Ps_1)this.new_[1], ((rU_2[])this.new_[5])[1], (rU_2)this.new_[3]) ? ((rU_2[])this.new_[5])[1] : null);
            if (var30 != null) {
               Optional var33 = PJ.class_((Ps_1)this.new_[1], var30);
               if (var33.isPresent()) {
                  return var1.class_(new En_1(((Px_1)var33.get()).class_(), true)).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               }
            }
         }

         boolean var31 = !EF.break_((Ps_1)this.new_[1], (rU_2)this.new_[6]) && !var5 && !EF.break_((Ps_1)this.new_[1], (rfH_2)((rU_2)this.new_[6]))
            ? super_[47]
            : super_[46];
         rU_2 var34 = ((Ps_1)this.new_[1]).volatile_();
         if (var34.c_() != ((rU_2)this.new_[4]).c_() && !var5) {
            this.byte_("Wrong Y coordinate");
            return var34.c_() < ((rU_2)this.new_[4]).c_() ? var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true) : var1;
         } else if (var31) {
            if (var34.equals((rU_2)this.new_[4])) {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            } else if (!(Boolean)C_class.instanceof_().switch_.class_[0]
               || !var34.equals(((rU_2)this.new_[4]).break_(this.byte_())) && !var34.equals(((rU_2)this.new_[4]).break_(this.byte_()).break_(this.byte_()))) {
               xd_3 var36 = bw_3.class_((Ps_1)this.new_[1], (rU_2)this.new_[3]).break_();
               xd_3 var38 = bw_3.class_((Ps_1)this.new_[1], ((rU_2)this.new_[3]).class_()).break_();
               if (!(((Ps_1)this.new_[1]).catch_().Ps().byte_ > (double)((Integer)((rU_2)this.new_[3]).break_[1]).intValue() + 0.1)
                  || ((Ps_1)this.new_[1]).catch_().BL()
                  || var36 != xu_3.BD && var36 != xu_3.PJ && var38 != xu_3.BD && var38 != xu_3.PJ) {
                  rfH_2 var10 = ((rU_2)this.new_[4]).byte_((rU_2)this.new_[3]).break_((rU_2)this.new_[4]);
                  xc_3 var39 = bw_3.class_((Ps_1)this.new_[1], var10);
                  xc_3 var41 = bw_3.class_((Ps_1)this.new_[1], var10.final_());
                  if ((Boolean)this.continue_[0]
                     && (!EF.protected_((Ps_1)this.new_[1], var34) || (Boolean)C_class.instanceof_().finally_.class_[0])
                     && (!EF.throws_(var39) || EF.byte_(var39))
                     && !EF.throws_(var41)) {
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
                  }

                  xc_3 var13 = bw_3.class_((Ps_1)this.new_[1], ((rU_2)this.new_[4]).case_());
                  Object var42 = ((rU_2[])this.new_[5])[0];
                  if (var34.c_() != ((rU_2)this.new_[4]).c_() && var5 && (var13.break_() == xu_3.BD || var13.break_() == xu_3.PJ)) {
                     var42 = var13.break_() == xu_3.BD
                        ? GG.class_(new EZ((C_case)this.new_[0]), ((rU_2)this.new_[4]).case_())
                        : ((rU_2)this.new_[4]).class_(var13.byte_(kc_3.volatile_).case_());
                     if (var42 == null) {
                        this.case_("Unable to climb vines. Consider disabling allowVines.");
                        return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
                     }
                  }

                  EF.class_((Ps_1)this.new_[1], var1, (rfH_2)var42);
                  return var1;
               } else {
                  return var1;
               }
            } else {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }
         } else {
            Boolean var28 = false;
            this.continue_[0] = var28;
            xd_3 var8 = bw_3.class_((Ps_1)this.new_[1], var34.break_()).break_();
            if (var8.equals(xu_3.PY) || var8 instanceof Wg_1) {
               double var9 = Math.max(
                  Math.abs((double)((rU_2)this.new_[4]).b_() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().break_),
                  Math.abs((double)((rU_2)this.new_[4]).d_() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().protected_)
               );
               if (var9 < 0.85) {
                  EF.class_((Ps_1)this.new_[1], var1, (rU_2)this.new_[4]);
                  return var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], false)
                     .class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1], true);
               }
            }

            double var37 = Math.max(
               Math.abs(((Ps_1)this.new_[1]).catch_().Ps().break_ - ((double)((rU_2)this.new_[4]).b_() + 0.5)),
               Math.abs(((Ps_1)this.new_[1]).catch_().Ps().protected_ - ((double)((rU_2)this.new_[4]).d_() + 0.5))
            );
            EL var11 = EF.class_(var1, (C_case)this.new_[0], ((rU_2)this.new_[4]).case_(), false, true);
            if ((var11 == (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[0] || var37 < 0.6) && !(Boolean)C_class.instanceof_().Pr.class_[0]) {
               var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
            }

            switch (((int[])GM.class_[0])[var11.ordinal()]) {
               case 1:
                  if (((Ps_1)this.new_[1]).catch_().x() || (Boolean)C_class.instanceof_().Pr.class_[0]) {
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }

                  return var1;
               case 2:
                  if (var37 > 0.83) {
                     float var40 = PJ.class_(((Ps_1)this.new_[1]).finally_(), Pu_1.class_((rU_2)this.new_[4]), ((Ps_1)this.new_[1]).protected_()).throws_();
                     if ((double)Math.abs(((PX)var1.class_().class_[0]).throws_() - var40) < 0.1) {
                        return var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
                     }
                  } else if (((Ps_1)this.new_[1]).protected_().class_((PX)var1.class_().class_[0])) {
                     return var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return var1;
               default:
                  if (var34.equals((rU_2)this.new_[4])) {
                     double var12 = ((double)(((rU_2)this.new_[4]).b_() + ((rU_2)this.new_[3]).b_()) + 1.0) * 0.5;
                     double var14 = ((double)(((rU_2)this.new_[4]).c_() + ((rU_2)this.new_[3]).c_()) - 1.0) * 0.5;
                     double var16 = ((double)(((rU_2)this.new_[4]).d_() + ((rU_2)this.new_[3]).d_()) + 1.0) * 0.5;
                     rU_2 var18 = ((rU_2)this.new_[3]).case_();
                     PX var19 = PJ.class_(((Ps_1)this.new_[1]).finally_(), new rjU_2(var12, var14, var16), ((Ps_1)this.new_[1]).protected_());
                     float var20 = var19.protected_();
                     double var21 = Math.max(
                        Math.abs(((Ps_1)this.new_[1]).catch_().Ps().break_ - var12), Math.abs(((Ps_1)this.new_[1]).catch_().Ps().protected_ - var16)
                     );
                     if (var21 < 0.29) {
                        float var23 = PJ.class_(Pu_1.class_((rU_2)this.new_[4]), ((Ps_1)this.new_[1]).finally_(), ((Ps_1)this.new_[1]).protected_()).throws_();
                        var1.class_(new En_1(new PX(var23, var20), true));
                        var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1], true);
                     } else {
                        var1.class_(new En_1(var19, true));
                     }

                     if (((Ps_1)this.new_[1]).class_(var18)) {
                        return var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     } else {
                        if (((Ps_1)this.new_[1]).protected_().class_((PX)var1.class_().class_[0])) {
                           var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                        }

                        return var1;
                     }
                  } else {
                     EF.class_((Ps_1)this.new_[1], var1, ((rU_2[])this.new_[5])[0]);
                     return var1;
                  }
            }
         }
      }
   }

   private static void int_() {
      public_ = new short[]{
         0,
         0,
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         0,
         4,
         2,
         3,
         4,
         16,
         23,
         27,
         8,
         4,
         23,
         0,
         0,
         0,
         4,
         1,
         5,
         1,
         5,
         2,
         0,
         0,
         1,
         4,
         1,
         4,
         1,
         1,
         4,
         1,
         0,
         8,
         7,
         1,
         3,
         1,
         3,
         4,
         1,
         4,
         3,
         1,
         1,
         5,
         1,
         5,
         1,
         5,
         3,
         5,
         1,
         5,
         3,
         5,
         1,
         5,
         1,
         6,
         1,
         6,
         1,
         4,
         4,
         6,
         4,
         3,
         0,
         4,
         4,
         3,
         1,
         3,
         1,
         3,
         1,
         3,
         1,
         1,
         4,
         3,
         4,
         1,
         1,
         0,
         1,
         0,
         8,
         1,
         4,
         5,
         4,
         0,
         4,
         4,
         4,
         1,
         0,
         1,
         4,
         1,
         4,
         1,
         1,
         4,
         0,
         1,
         1,
         4,
         1,
         4,
         0,
         4,
         0,
         0,
         7,
         0,
         1,
         0,
         5,
         1,
         4,
         1,
         0,
         0,
         1,
         0,
         4,
         4,
         4,
         3,
         4,
         3,
         4,
         3,
         3,
         1,
         1,
         1,
         1,
         4,
         1,
         1,
         1,
         1,
         5,
         1,
         0,
         4,
         1,
         5,
         2,
         1,
         4,
         1,
         3,
         1,
         3,
         1,
         3,
         7
      };
   }

   public Gb_1(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, new rU_2[]{var3.class_(), var3}, var3.case_());
      this.continue_();
      Boolean var8 = true;
      this.continue_[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      super_ = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false
      };
   }

   @Override
   public double class_(EZ var1) {
      return class_(
         var1,
         (Integer)((rU_2)this.new_[3]).break_[0],
         (Integer)((rU_2)this.new_[3]).break_[1],
         (Integer)((rU_2)this.new_[3]).break_[2],
         (Integer)((rU_2)this.new_[4]).break_[0],
         (Integer)((rU_2)this.new_[4]).break_[2]
      );
   }

   @Override
   public boolean class_(EA var1) {
      return var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2] && !EF.break_((Ps_1)this.new_[1], ((rU_2)this.new_[4]).case_())
         ? super_[67]
         : super_[66];
   }

   public static double class_(EZ var0, int var1, int var2, int var3, int var4, int var5) {
      xc_3 var6 = var0.class_(var4, var2 + 1, var5);
      xc_3 var7 = var0.class_(var4, var2, var5);
      xc_3 var8 = var0.class_(var4, var2 - 1, var5);
      xc_3 var9 = var0.class_(var1, var2 - 1, var3);
      xd_3 var10 = var9.break_();
      boolean var11 = EF.protected_(var0, var1, var2 - 1, var3, var9);
      boolean var12 = var11 && !var0.break_[16] && EF.class_(var0, var8) ? true : super_[9];
      if (!var12 && !EF.class_(var0, var4, var2 - 1, var5, var8)) {
         if (var10 != xu_3.PJ && var10 != xu_3.BD) {
            if (!EF.break_(var4, var2 - 1, var5, var8, (bw_3)var0.break_[4])) {
               return else_[21];
            } else {
               boolean var26 = !EF.byte_(var6) && !EF.byte_(var7) ? super_[18] : super_[17];
               if (EF.byte_(var8) && var26) {
                  return 1000000.0;
               } else {
                  double var14 = var0.class_(var4, var2 - 1, var5, var8);
                  if (var14 >= 1000000.0) {
                     return 1000000.0;
                  } else {
                     double var27 = EF.class_(var0, var4, var2, var5, var7, false);
                     if (var27 >= 1000000.0) {
                        return 1000000.0;
                     } else {
                        double var28 = EF.class_(var0, var4, var2 + 1, var5, var6, true);
                        double var20 = var26 ? (Double)var0.break_[23] : else_[16];

                        for (int var22 = 0; var22 < 5; var22++) {
                           int var23 = var4 + ((rpr_3[])class_[0])[var22].implements_();
                           int var24 = var2 - 1 + ((rpr_3[])class_[0])[var22].finally_();
                           int var25 = var5 + ((rpr_3[])class_[0])[var22].extends_();
                           if ((var23 != var1 || var25 != var3) && EF.class_((bw_3)var0.break_[4], var23, var24, var25)) {
                              return var20 + var14 + var27 + var28;
                           }
                        }

                        if (var10 == xu_3.PY || var10 instanceof Wg_1 && var9.byte_(Wg_1.volatile_) != rCo_1.DOUBLE) {
                           return else_[17];
                        } else if (!var11) {
                           return 1000000.0;
                        } else {
                           xd_3 var30 = var0.break_(var1, var2, var3);
                           if ((var30 == xu_3.Sr || var30 instanceof xC_2) && !var9.volatile_().byte_()) {
                              return 1000000.0;
                           } else {
                              var20 *= 3.3207692307692307;
                              return var20 + var14 + var27 + var28;
                           }
                        }
                     }
                  }
               }
            }
         } else {
            return else_[10];
         }
      } else {
         double var13 = else_[0];
         boolean var15 = false;
         if (!EF.byte_(var6) && !EF.byte_(var7)) {
            if (var8.break_() == xu_3.PY) {
               var13 += 2.316423442205235;
            } else if (!var12 && var8.break_() == xu_3.try_) {
               var13 += var0.break_[27];
            }

            if (var10 == xu_3.PY) {
               var13 += 2.316423442205235;
            }
         } else {
            var13 = (Double)var0.break_[23];
            var15 = true;
         }

         double var16 = EF.class_(var0, var4, var2, var5, var7, false);
         if (var16 >= 1000000.0) {
            return 1000000.0;
         } else {
            double var18 = EF.class_(var0, var4, var2 + 1, var5, var6, true);
            if (var16 == 0.0 && var18 == 0.0) {
               if (!var15 && (Boolean)var0.break_[8]) {
                  var13 *= 0.7692444761225944;
               }

               return var13;
            } else {
               if (var10 == xu_3.PJ || var10 == xu_3.BD) {
                  var16 *= 5.0;
                  var18 *= 5.0;
               }

               return var13 + var16 + var18;
            }
         }
      }
   }

   @Override
   public void class_() {
      this.continue_();
      super.class_();
      Boolean var5 = true;
      this.continue_[0] = var5;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5788537775898149104L;
   }

   @Override
   public boolean break_(EA var1) {
      if (((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[3]) || ((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[3]).case_())) {
         xd_3 var2 = bw_3.break_((Ps_1)this.new_[1], ((rU_2)this.new_[3]).case_());
         if (var2 == xu_3.PJ || var2 == xu_3.BD) {
            var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
         }
      }

      return super.break_(var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 17, -34, -26, -35, 90, 35, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2062451839;
   }

   private void continue_() {
      if (this.continue_ == null) {
         this.continue_ = new Object[1];
         Object[] var1 = this.continue_;
         var1[0] = false;
      }
   }

   private static void else_() {
      synchronized_ = new byte[]{2, 5};
   }

   private static void new_() {
      this_ = new String[]{new String("Wrong Y coordinate"), new String("Unable to climb vines. Consider disabling allowVines.")};
   }

   private static void package_() {
      return_ = new float[]{26.0F};
   }

   private static void super_() {
      else_ = new double[]{
         4.63284688441047,
         2.316423442205235,
         2.316423442205235,
         1000000.0,
         1000000.0,
         0.0,
         0.0,
         0.7692444761225944,
         5.0,
         5.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         4.63284688441047,
         1000000.0,
         1000000.0,
         1000000.0,
         3.3207692307692307,
         1000000.0,
         0.5,
         0.5,
         0.83,
         0.1,
         0.5,
         0.5,
         0.85,
         0.5,
         0.5,
         0.6,
         0.83,
         0.1,
         1.0,
         0.5,
         1.0,
         0.5,
         1.0,
         0.5,
         0.29
      };
   }

   @Override
   public Set<rU_2> native_() {
      return ImmutableSet.of((rU_2)this.new_[3], (rU_2)this.new_[4]);
   }
}
