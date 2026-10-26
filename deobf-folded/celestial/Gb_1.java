package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gb_1 extends Ev_1 {
   private static boolean[] id_super;
   public Object[] id_continue;
   private static String[] id_this;
   private static double[] id_else;
   private static byte[] id_synchronized;
   private static float[] id_return;
   private static short[] id_public;

   @Override
   public EA id_byte(EA var1) {
      this.id_continue();
      super.id_byte(var1);
      xc_3 var2 = bw_3.id_class((Ps_1)this.id_new[1], ((rU_2[])this.id_new[5])[id_super[25]]);
      xc_3 var3 = bw_3.id_class((Ps_1)this.id_new[1], ((rU_2[])this.id_new[5])[1]);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         if (!(Boolean)C_class.id_instanceof().d.id_class[id_public[29]]) {
            return var1;
         } else if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[30]]) {
            return var1;
         } else if (EF.id_throws(var2)) {
            return var1;
         } else if (EF.id_throws(var3)) {
            return var1;
         } else {
            double var29 = Math.max(
               Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[4]).b_() + 0.5)),
               Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[4]).d_() + 0.5))
            );
            if (var29 < 0.83) {
               return var1;
            } else if (!var1.id_class().id_break().isPresent()) {
               return var1;
            } else {
               float var32 = PJ.id_class(
                     ((Ps_1)this.id_new[1]).id_finally(),
                     Pu_1.id_class(((Ps_1)this.id_new[1]).id_case(), (rU_2)this.id_new[4]),
                     ((Ps_1)this.id_new[1]).id_protected()
                  )
                  .id_throws();
               float var35 = var1.id_class().id_break().get().id_protected();
               if (EF.id_catch(var2) || var2.id_break() instanceof Ja_1 && (EF.id_catch(var3) || var3.id_break() instanceof Ja_1)) {
                  var35 = 26.0F;
               }

               return var1.id_class(new En_1(new PX(var32, var35), true))
                  .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[39]], true)
                  .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
            }
         }
      } else {
         var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], id_super[30]);
         xd_3 var4 = bw_3.id_class((Ps_1)this.id_new[1], ((rU_2)this.id_new[3]).id_case()).id_break();
         boolean var5 = var4 != xu_3.PJ && var4 != xu_3.BD ? id_super[32] : true;
         if (var2.id_break() instanceof dN_2 || var3.id_break() instanceof dN_2) {
            boolean var6 = (!(var2.id_break() instanceof dN_2) || EF.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[3], (rU_2)this.id_new[4]))
                  && (!(var3.id_break() instanceof dN_2) || EF.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[4], (rU_2)this.id_new[3]))
               ? id_super[34]
               : true;
            boolean var7 = !xu_3.PZ.equals(var2.id_break()) && !xu_3.PZ.equals(var3.id_break()) ? true : id_super[36];
            if (var6 && var7) {
               return var1.id_class(
                     new En_1(
                        PJ.id_class(
                           ((Ps_1)this.id_new[1]).id_finally(),
                           Pu_1.id_class(((Ps_1)this.id_new[1]).id_case(), ((rU_2[])this.id_new[5])[id_super[37]]),
                           ((Ps_1)this.id_new[1]).id_protected()
                        ),
                        true
                     )
                  )
                  .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
            }
         }

         if (var2.id_break() instanceof dq_3 || var3.id_break() instanceof dq_3) {
            rU_2 var30 = !EF.id_break((Ps_1)this.id_new[1], ((rU_2[])this.id_new[5])[id_super[40]], ((rU_2)this.id_new[3]).id_class())
               ? ((rU_2[])this.id_new[5])[id_super[41]]
               : (!EF.id_break((Ps_1)this.id_new[1], ((rU_2[])this.id_new[5])[1], (rU_2)this.id_new[3]) ? ((rU_2[])this.id_new[5])[1] : null);
            if (var30 != null) {
               Optional var33 = PJ.id_class((Ps_1)this.id_new[1], var30);
               if (var33.isPresent()) {
                  return var1.id_class(new En_1(((Px_1)var33.get()).id_class(), true))
                     .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               }
            }
         }

         boolean var31 = !EF.id_break((Ps_1)this.id_new[1], (rU_2)this.id_new[6]) && !var5 && !EF.id_break((Ps_1)this.id_new[1], (rfH_2)((rU_2)this.id_new[6]))
            ? id_super[47]
            : true;
         rU_2 var34 = ((Ps_1)this.id_new[1]).id_volatile();
         if (var34.c_() != ((rU_2)this.id_new[4]).c_() && !var5) {
            this.id_byte(id_this[0]);
            return var34.c_() < ((rU_2)this.id_new[4]).c_() ? var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true) : var1;
         } else if (var31) {
            if (var34.equals((rU_2)this.id_new[4])) {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            } else if (!(Boolean)C_class.id_instanceof().id_switch.id_class[id_public[75]]
               || !var34.equals(((rU_2)this.id_new[4]).id_break(this.id_byte()))
                  && !var34.equals(((rU_2)this.id_new[4]).id_break(this.id_byte()).id_break(this.id_byte()))) {
               xd_3 var36 = bw_3.id_class((Ps_1)this.id_new[1], (rU_2)this.id_new[3]).id_break();
               xd_3 var38 = bw_3.id_class((Ps_1)this.id_new[1], ((rU_2)this.id_new[3]).id_class()).id_break();
               if (!(((Ps_1)this.id_new[1]).id_catch().Ps().id_byte > (double)((Integer)((rU_2)this.id_new[3]).id_break[1]).intValue() + 0.1)
                  || ((Ps_1)this.id_new[1]).id_catch().BL()
                  || var36 != xu_3.BD && var36 != xu_3.PJ && var38 != xu_3.BD && var38 != xu_3.PJ) {
                  rfH_2 var10 = ((rU_2)this.id_new[4]).id_byte((rU_2)this.id_new[3]).id_break((rU_2)this.id_new[4]);
                  xc_3 var39 = bw_3.id_class((Ps_1)this.id_new[1], var10);
                  xc_3 var41 = bw_3.id_class((Ps_1)this.id_new[1], var10.id_final());
                  if ((Boolean)this.id_continue[id_public[92]]
                     && (!EF.id_protected((Ps_1)this.id_new[1], var34) || (Boolean)C_class.id_instanceof().id_finally.id_class[id_public[94]])
                     && (!EF.id_throws(var39) || EF.id_byte(var39))
                     && !EF.id_throws(var41)) {
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[8], true);
                  }

                  xc_3 var13 = bw_3.id_class((Ps_1)this.id_new[1], ((rU_2)this.id_new[4]).id_case());
                  Object var42 = ((rU_2[])this.id_new[5])[id_super[50]];
                  if (var34.c_() != ((rU_2)this.id_new[4]).c_() && var5 && (var13.id_break() == xu_3.BD || var13.id_break() == xu_3.PJ)) {
                     var42 = var13.id_break() == xu_3.BD
                        ? GG.id_class(new EZ((C_case)this.id_new[id_public[100]]), ((rU_2)this.id_new[4]).id_case())
                        : ((rU_2)this.id_new[4]).id_class(var13.id_byte(kc_3.id_volatile).id_case());
                     if (var42 == null) {
                        this.id_case(id_this[1]);
                        return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
                     }
                  }

                  EF.id_class((Ps_1)this.id_new[1], var1, (rfH_2)var42);
                  return var1;
               } else {
                  return var1;
               }
            } else {
               return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }
         } else {
            Boolean var28 = id_super[51];
            this.id_continue[id_public[105]] = var28;
            xd_3 var8 = bw_3.id_class((Ps_1)this.id_new[1], var34.id_break()).id_break();
            if (var8.equals(xu_3.PY) || var8 instanceof Wg_1) {
               double var9 = Math.max(
                  Math.abs((double)((rU_2)this.id_new[4]).b_() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_break),
                  Math.abs((double)((rU_2)this.id_new[4]).d_() + 0.5 - ((Ps_1)this.id_new[1]).id_catch().Ps().id_protected)
               );
               if (var9 < 0.85) {
                  EF.id_class((Ps_1)this.id_new[1], var1, (rU_2)this.id_new[4]);
                  return var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[113]], id_super[52])
                     .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1], true);
               }
            }

            double var37 = Math.max(
               Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[4]).b_() + 0.5)),
               Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[4]).d_() + 0.5))
            );
            EL var11 = EF.id_class(var1, (C_case)this.id_new[id_public[119]], ((rU_2)this.id_new[4]).id_case(), id_super[54], true);
            if ((var11 == (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[id_public[121]] || var37 < 0.6)
               && !(Boolean)C_class.id_instanceof().Pr.id_class[id_public[122]]) {
               var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
            }

            switch (((int[])GM.id_class[id_public[124]])[var11.ordinal()]) {
               case 1:
                  if (((Ps_1)this.id_new[1]).id_catch().x() || (Boolean)C_class.id_instanceof().Pr.id_class[id_public[126]]) {
                     var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }

                  return var1;
               case 2:
                  if (var37 > 0.83) {
                     float var40 = PJ.id_class(((Ps_1)this.id_new[1]).id_finally(), Pu_1.id_class((rU_2)this.id_new[4]), ((Ps_1)this.id_new[1]).id_protected())
                        .id_throws();
                     if ((double)Math.abs(((PX)var1.id_class().id_class[id_public[131]]).id_throws() - var40) < 0.1) {
                        return var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[132]], true);
                     }
                  } else if (((Ps_1)this.id_new[1]).id_protected().id_class((PX)var1.id_class().id_class[id_public[134]])) {
                     return var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  }

                  return var1;
               default:
                  if (var34.equals((rU_2)this.id_new[4])) {
                     double var12 = ((double)(((rU_2)this.id_new[4]).b_() + ((rU_2)this.id_new[3]).b_()) + 1.0) * 0.5;
                     double var14 = ((double)(((rU_2)this.id_new[4]).c_() + ((rU_2)this.id_new[3]).c_()) - 1.0) * 0.5;
                     double var16 = ((double)(((rU_2)this.id_new[4]).d_() + ((rU_2)this.id_new[3]).d_()) + 1.0) * 0.5;
                     rU_2 var18 = ((rU_2)this.id_new[3]).id_case();
                     PX var19 = PJ.id_class(((Ps_1)this.id_new[1]).id_finally(), new rjU_2(var12, var14, var16), ((Ps_1)this.id_new[1]).id_protected());
                     float var20 = var19.id_protected();
                     double var21 = Math.max(
                        Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_break - var12),
                        Math.abs(((Ps_1)this.id_new[1]).id_catch().Ps().id_protected - var16)
                     );
                     if (var21 < 0.29) {
                        float var23 = PJ.id_class(
                              Pu_1.id_class((rU_2)this.id_new[4]), ((Ps_1)this.id_new[1]).id_finally(), ((Ps_1)this.id_new[1]).id_protected()
                           )
                           .id_throws();
                        var1.id_class(new En_1(new PX(var23, var20), true));
                        var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1], true);
                     } else {
                        var1.id_class(new En_1(var19, true));
                     }

                     if (((Ps_1)this.id_new[1]).id_class(var18)) {
                        return var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                     } else {
                        if (((Ps_1)this.id_new[1]).id_protected().id_class((PX)var1.id_class().id_class[id_public[155]])) {
                           var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                        }

                        return var1;
                     }
                  } else {
                     EF.id_class((Ps_1)this.id_new[1], var1, ((rU_2[])this.id_new[5])[id_super[65]]);
                     return var1;
                  }
            }
         }
      }
   }

   private static void id_int() {
      id_public = new short[]{
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
      rU_2[] var10004 = new rU_2[2];
      var10004[id_super[0]] = var3.id_class();
      var10004[1] = var3;
      super(var1, var2, var3, var10004, var3.id_case());
      this.id_continue();
      Boolean var8 = true;
      this.id_continue[id_public[0]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_super = new boolean[]{
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
   public double id_class(EZ var1) {
      return id_class(
         var1,
         (Integer)((rU_2)this.id_new[3]).id_break[id_public[3]],
         (Integer)((rU_2)this.id_new[3]).id_break[1],
         (Integer)((rU_2)this.id_new[3]).id_break[2],
         (Integer)((rU_2)this.id_new[4]).id_break[id_public[9]],
         (Integer)((rU_2)this.id_new[4]).id_break[2]
      );
   }

   @Override
   public boolean id_class(EA var1) {
      return var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]
            && !EF.id_break((Ps_1)this.id_new[1], ((rU_2)this.id_new[4]).id_case())
         ? id_super[67]
         : true;
   }

   public static double id_class(EZ var0, int var1, int var2, int var3, int var4, int var5) {
      xc_3 var6 = var0.id_class(var4, var2 + 1, var5);
      xc_3 var7 = var0.id_class(var4, var2, var5);
      xc_3 var8 = var0.id_class(var4, var2 - 1, var5);
      xc_3 var9 = var0.id_class(var1, var2 - 1, var3);
      xd_3 var10 = var9.id_break();
      boolean var11 = EF.id_protected(var0, var1, var2 - 1, var3, var9);
      boolean var12 = var11 && !var0.id_break[16] && EF.id_class(var0, var8) ? true : id_super[9];
      if (!var12 && !EF.id_class(var0, var4, var2 - 1, var5, var8)) {
         if (var10 != xu_3.PJ && var10 != xu_3.BD) {
            if (!EF.id_break(var4, var2 - 1, var5, var8, (bw_3)var0.id_break[4])) {
               return 1000000.0;
            } else {
               boolean var26 = !EF.id_byte(var6) && !EF.id_byte(var7) ? id_super[18] : true;
               if (EF.id_byte(var8) && var26) {
                  return 1000000.0;
               } else {
                  double var14 = var0.id_class(var4, var2 - 1, var5, var8);
                  if (var14 >= 1000000.0) {
                     return 1000000.0;
                  } else {
                     double var27 = EF.id_class(var0, var4, var2, var5, var7, id_super[20]);
                     if (var27 >= 1000000.0) {
                        return 1000000.0;
                     } else {
                        double var28 = EF.id_class(var0, var4, var2 + 1, var5, var6, true);
                        double var20 = var26 ? (Double)var0.id_break[23] : 4.63284688441047;

                        for (int var22 = id_super[23]; var22 < 5; var22++) {
                           int var23 = var4 + ((rpr_3[])id_class[id_public[20]])[var22].id_implements();
                           int var24 = var2 - 1 + ((rpr_3[])id_class[id_public[21]])[var22].id_finally();
                           int var25 = var5 + ((rpr_3[])id_class[id_public[22]])[var22].id_extends();
                           if ((var23 != var1 || var25 != var3) && EF.id_class((bw_3)var0.id_break[4], var23, var24, var25)) {
                              return var20 + var14 + var27 + var28;
                           }
                        }

                        if (var10 == xu_3.PY || var10 instanceof Wg_1 && var9.id_byte(Wg_1.id_volatile) != rCo_1.DOUBLE) {
                           return 1000000.0;
                        } else if (!var11) {
                           return 1000000.0;
                        } else {
                           xd_3 var30 = var0.id_break(var1, var2, var3);
                           if ((var30 == xu_3.Sr || var30 instanceof xC_2) && !var9.id_volatile().id_byte()) {
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
            return 1000000.0;
         }
      } else {
         double var13 = 4.63284688441047;
         boolean var15 = id_super[11];
         if (!EF.id_byte(var6) && !EF.id_byte(var7)) {
            if (var8.id_break() == xu_3.PY) {
               var13 += 2.316423442205235;
            } else if (!var12 && var8.id_break() == xu_3.id_try) {
               var13 += var0.id_break[27];
            }

            if (var10 == xu_3.PY) {
               var13 += 2.316423442205235;
            }
         } else {
            var13 = (Double)var0.id_break[23];
            var15 = true;
         }

         double var16 = EF.id_class(var0, var4, var2, var5, var7, id_super[13]);
         if (var16 >= 1000000.0) {
            return 1000000.0;
         } else {
            double var18 = EF.id_class(var0, var4, var2 + 1, var5, var6, true);
            if (var16 == id_else[5] && var18 == id_else[6]) {
               if (!var15 && (Boolean)var0.id_break[8]) {
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
   public void id_class() {
      this.id_continue();
      super.id_class();
      Boolean var5 = true;
      this.id_continue[id_public[1]] = var5;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5788537775898149104L;
   }

   @Override
   public boolean id_break(EA var1) {
      if (((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[3]) || ((Ps_1)this.id_new[1]).id_volatile().equals(((rU_2)this.id_new[3]).id_case())) {
         xd_3 var2 = bw_3.id_break((Ps_1)this.id_new[1], ((rU_2)this.id_new[3]).id_case());
         if (var2 == xu_3.PJ || var2 == xu_3.BD) {
            var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
         }
      }

      return super.id_break(var1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 17, -34, -26, -35, 90, 35, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2062451839;
   }

   private void id_continue() {
      if (this.id_continue == null) {
         this.id_continue = new Object[1];
         Object[] var1 = this.id_continue;
         var1[id_super[70]] = id_super[71];
      }
   }

   private static void id_else() {
      id_synchronized = new byte[]{2, 5};
   }

   private static void id_new() {
      id_this = new String[]{new String("Wrong Y coordinate"), new String("Unable to climb vines. Consider disabling allowVines.")};
   }

   private static void id_package() {
      id_return = new float[]{26.0F};
   }

   private static void id_super() {
      id_else = new double[]{
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
   public Set<rU_2> id_native() {
      return ImmutableSet.of((rU_2)this.id_new[3], (rU_2)this.id_new[4]);
   }
}
