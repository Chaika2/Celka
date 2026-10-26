package celestial;

import java.util.List;
import java.util.Optional;

public interface EF extends PP, rx_3 {
   static boolean byte_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      Gx_1 var5 = implements_(var4);
      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         return true;
      } else {
         return var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2] ? false : catch_(var0, var1, var2, var3, var4);
      }
   }

   static boolean byte_(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      return ((GJ)var0.break_[29]).class_((bw_3)var0.break_[4], var1, var2, var3, var4);
   }

   static boolean byte_(Ps_1 var0, rfH_2 var1) {
      return class_(new bw_3(var0), var1);
   }

   static boolean byte_(xc_3 var0) {
      rXs_1 var1 = var0.volatile_().class_();
      return var1 == rXG.byte_ || var1 == rXG.break_;
   }

   static boolean byte_(bw_3 var0, int var1, int var2, int var3) {
      return byte_(var0, var1, var2, var3, var0.class_(var1, var2, var3));
   }

   static boolean byte_(int var0, int var1, int var2, xc_3 var3, bw_3 var4) {
      rXE var5 = var3.volatile_();
      if (!(var5.class_() instanceof rXB)) {
         return false;
      } else {
         return var5.class_().protected_(var5) != 8
            ? true
            : protected_(var4.class_(var0 + 1, var1, var2))
               || protected_(var4.class_(var0 - 1, var1, var2))
               || protected_(var4.class_(var0, var1, var2 + 1))
               || protected_(var4.class_(var0, var1, var2 - 1));
      }
   }

   static boolean byte_(EZ var0, int var1, int var2, int var3) {
      return ((GJ)var0.break_[29]).byte_((bw_3)var0.break_[4], var1, var2, var3, var0.class_(var1, var2, var3));
   }

   static boolean class_(Ps_1 var0, rU_2 var1, xc_3 var2) {
      return byte_(new bw_3(var0), (Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2], var2);
   }

   static boolean class_(EZ var0, xc_3 var1) {
      return (Integer)var0.break_[17] != 0 && var1.byte_() == QP.finally_ && var1.byte_(dj_3.volatile_) == 0;
   }

   static void class_(Ps_1 var0, xc_3 var1) {
      class_(var0, var1, new bU_2(var0.catch_()), (Boolean)C_throws.break_().G.class_[0]);
   }

   static boolean class_(EZ var0, int var1, int var2, int var3) {
      return class_(var0, var1, var2, var3, var0.class_(var1, var2, var3));
   }

   static EL class_(EA var0, C_case var1, rfH_2 var2, boolean var3, boolean var4) {
      return class_(var0, var1, var2, var3, var4, true);
   }

   static boolean class_(bw_3 var0, int var1, int var2, int var3, boolean var4) {
      xc_3 var5 = var0.class_(var1, var2, var3);
      xd_3 var6 = var5.break_();
      if (!var4 && var6 instanceof dH_2 && (Boolean)C_class.instanceof_().continue_.class_[0] && dH_2.implements_(var0.class_(var1, var2 - 1, var3))) {
         return true;
      } else if (var6 instanceof dj_3) {
         if (!var4 && !(Boolean)C_class.instanceof_().rY.class_[0]) {
            int var7 = var5.byte_(dj_3.volatile_);
            return var7 == 0 ? true : !(var0.class_(var1, var2 - 1, var3).break_() instanceof dj_3);
         } else {
            return true;
         }
      } else {
         return !var5.volatile_().byte_();
      }
   }

   static EL class_(EA var0, C_case var1, rfH_2 var2, boolean var3, boolean var4, boolean var5) {
      Ps_1 var6 = var1.throw_();
      Optional var7 = PJ.class_(var6, var2, var4);
      boolean var8 = false;
      if (var7.isPresent()) {
         var0.class_(new En_1(((Px_1)var7.get()).class_(), true));
         var8 = true;
      }

      int var9 = 0;

      while (true) {
         label90: {
            if (var9 < 5) {
               rfH_2 var10 = var2.break_(((rpr_3[])Ev_1.class_[0])[var9]);
               if (!byte_(var6, var10)) {
                  break label90;
               }

               if (!((C_class)var1).static_().class_(false, var2.b_(), var2.c_(), var2.d_())) {
                  PP.a_.byte_("bb pls get me some blocks. dirt, netherrack, cobble");
                  var0.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
                  return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[2];
               }

               double var11 = ((double)(var2.b_() + var10.b_()) + 1.0) * 0.5;
               double var13 = ((double)(var2.c_() + var10.c_()) + 0.5) * 0.5;
               double var15 = ((double)(var2.d_() + var10.d_()) + 1.0) * 0.5;
               PX var17 = PJ.class_(var4 ? Ph_1.class_(var6.catch_()) : var6.finally_(), new rjU_2(var11, var13, var15), var6.protected_());
               PX var18 = var1.catch_().class_().class_(var17);
               rjG_2 var19 = Ph_1.class_(var6.catch_(), var18, var6.native_().case_(), var4);
               if (var19 == null || var19.byte_() != rjM_2.BLOCK) {
                  break label90;
               }

               rfH_2 var20 = ((rff_3)var19).class_();
               if (!var20.equals(var10) || !var20.break_(((rff_3)var19).break_()).equals(var2)) {
                  break label90;
               }

               var0.class_(new En_1(var17, true));
               var8 = true;
               if (var3) {
                  break label90;
               }
            }

            if (var6.class_().isPresent()) {
               rfH_2 var21 = var6.class_().get();
               rpr_3 var22 = ((rff_3)var6.byte_()).break_();
               if (var21.equals(var2) || byte_(var6, var21) && var21.break_(var22).equals(var2)) {
                  if (var4) {
                     var0.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  }

                  if (var5) {
                     ((C_class)var1).static_().class_(true, var2.b_(), var2.c_(), var2.d_());
                  }

                  return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[0];
               }
            }

            if (var8) {
               if (var4) {
                  var0.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
               }

               if (var5) {
                  ((C_class)var1).static_().class_(true, var2.b_(), var2.c_(), var2.d_());
               }

               return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[1];
            }

            return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[2];
         }

         var9++;
      }
   }

   static void class_(Ps_1 var0, xc_3 var1, bU_2 var2, boolean var3) {
      if (C_class.instanceof_().protected_() && !(Boolean)C_class.instanceof_().rr.class_[0]) {
         ((rhz_3)var0.catch_().implements_[1]).protected_ = var2.class_(var1.break_(), var3);
      }
   }

   static double class_(EZ var0, int var1, int var2, int var3, xc_3 var4, boolean var5) {
      if (!break_(var0, var1, var2, var3, var4)) {
         if (!var4.volatile_().byte_()) {
            return 1000000.0;
         } else {
            double var6 = var0.break_(var1, var2, var3, var4);
            if (var6 >= 1000000.0) {
               return 1000000.0;
            } else if (class_((bw_3)var0.break_[4], var1, var2, var3, var4)) {
               return 1000000.0;
            } else {
               double var8 = ((bU_2)var0.break_[5]).class_(var4);
               if (var8 <= 0.0) {
                  return 1000000.0;
               } else {
                  double var10 = 1.0 / var8;
                  var10 += var0.break_[24];
                  var10 *= var6;
                  if (var5) {
                     xc_3 var12 = var0.class_(var1, var2 + 1, var3);
                     if (var12.break_() instanceof dH_2) {
                        var10 += class_(var0, var1, var2 + 1, var3, var12, true);
                     }
                  }

                  return var10;
               }
            }
         }
      } else {
         return 0.0;
      }
   }

   static double class_(EZ var0, int var1, int var2, int var3, boolean var4) {
      return class_(var0, var1, var2, var3, var0.class_(var1, var2, var3), var4);
   }

   static void class_(Ps_1 var0, EA var1, rfH_2 var2) {
      var1.class_(new En_1(new PX(PJ.class_(var0.finally_(), Pu_1.class_(var2), var0.protected_()).throws_(), (Float)var0.catch_().throws_[16]), false))
         .class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
      rz_3 var3 = C_throws.byte_().void_().throws_();
      if (var3 != null) {
         var3.class_(var1);
      }
   }

   static boolean class_(xd_3 var0) {
      return var0 instanceof Ja_1 || var0 == xu_3.instanceof_ || var0 == xu_3.try_;
   }

   @Deprecated
   static boolean class_(int var0, int var1, int var2, xc_3 var3, bw_3 var4) {
      return break_(var0, var1, var2, var3, var4);
   }

   static boolean class_(bw_3 var0, rfH_2 var1) {
      return class_(var0, var1.b_(), var1.c_(), var1.d_());
   }

   static boolean class_(Ps_1 var0, rfH_2 var1) {
      return byte_(new bw_3(var0), var1.b_(), var1.c_(), var1.d_());
   }

   static boolean class_(rfH_2 var0, xc_3 var1, rfH_2 var2, rCN var3) {
      if (var2.equals(var0)) {
         return false;
      } else {
         rpB_2 var4 = var1.byte_(kE_2.p).final_();
         boolean var5 = var1.byte_(var3);
         rpB_2 var6;
         if (!var2.private_().equals(var0) && !var2.protected_().equals(var0)) {
            if (!var2.extends_().equals(var0) && !var2.byte_().equals(var0)) {
               return true;
            }

            var6 = rpB_2.X;
         } else {
            var6 = rpB_2.Z;
         }

         return var4 == var6 == var5;
      }
   }

   static boolean class_(Ps_1 var0, rfH_2 var1, rfH_2 var2) {
      if (var2.equals(var1)) {
         return false;
      } else {
         xc_3 var3 = bw_3.class_(var0, var1);
         return !(var3.break_() instanceof dN_2) ? true : class_(var1, var3, var2, dN_2.final_);
      }
   }

   static boolean class_(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      return ((GJ)var0.break_[29]).break_((bw_3)var0.break_[4], var1, var2, var3, var4);
   }

   static boolean class_(bw_3 var0, int var1, int var2, int var3) {
      return case_(var0, var1, var2, var3, var0.class_(var1, var2, var3));
   }

   static boolean class_(Ps_1 var0, rU_2 var1) {
      return break_(new bw_3(var0), (Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2]);
   }

   static Gx_1 class_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      if (var1 instanceof Ja_1) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      } else if (!(var1 instanceof Jj_1)
         && var1 != xu_3.SQ
         && var1 != xu_3.U
         && var1 != xu_3.BD
         && var1 != xu_3.PJ
         && var1 != xu_3.Sx
         && !(var1 instanceof dN_2)
         && !(var1 instanceof dq_3)
         && !(var1 instanceof WD)
         && var0.volatile_().byte_()
         && !(var1 instanceof zv_3)
         && !(var1 instanceof dL_2)
         && !(var1 instanceof Ww_1)
         && !(var1 instanceof Wp_1)) {
         try {
            return var0.class_(null, null, rLT.LAND)
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         } catch (Throwable var3) {
            System.out.println("The block " + var0.break_().native_().getString() + " requires a special case due to the exception " + var3.getMessage());
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
         }
      } else {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
      }
   }

   static boolean class_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      if (!((ba_3)var0.class_[5]).class_(var1, var3)) {
         return true;
      } else {
         xd_3 var5 = var4.break_();
         return ((List)C_class.instanceof_().Pl.class_[0]).contains(var5)
            || var5 == xu_3.PT
            || var5 instanceof WT
            || class_(var0, var1, var2 + 1, var3, true)
            || class_(var0, var1 + 1, var2, var3, false)
            || class_(var0, var1 - 1, var2, var3, false)
            || class_(var0, var1, var2, var3 + 1, false)
            || class_(var0, var1, var2, var3 - 1, false);
      }
   }

   static boolean break_(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      return ((GJ)var0.break_[29]).byte_((bw_3)var0.break_[4], var1, var2, var3, var4);
   }

   static boolean break_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      Gx_1 var5 = private_(var4);
      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         return true;
      } else {
         return var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2] ? false : throws_(var0, var1, var2, var3, var4);
      }
   }

   static boolean break_(int var0, int var1, int var2, xc_3 var3, bw_3 var4) {
      xd_3 var5 = var3.break_();
      if (var5 instanceof Ja_1) {
         return true;
      } else if (var5 instanceof WD) {
         return !var4.class_(var0, var2) ? true : var3.byte_(WD.volatile_) == 1;
      } else {
         return var5 != xu_3.GE && var5 != xu_3.Gs ? var3.byte_().throws_() : true;
      }
   }

   static boolean break_(xc_3 var0) {
      return var0.break_() instanceof Wg_1 && var0.byte_(Wg_1.volatile_) == rCo_1.BOTTOM;
   }

   static boolean break_(Ps_1 var0, rfH_2 var1) {
      xc_3 var2 = bw_3.class_(var0, var1);
      return eA_2.implements_(var0.catch_()) && var2.byte_() == QP.finally_ && var2.byte_(dj_3.volatile_) == 0;
   }

   static boolean break_(EZ var0, int var1, int var2, int var3) {
      return byte_(var0, var1, var2, var3, var0.class_(var1, var2, var3));
   }

   static boolean break_(bw_3 var0, int var1, int var2, int var3) {
      return break_(var0, var1, var2, var3, var0.class_(var1, var2, var3));
   }

   static boolean break_(Ps_1 var0, rU_2 var1) {
      return byte_(new bw_3(var0), (Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2]);
   }

   static boolean break_(Ps_1 var0, rfH_2 var1, rfH_2 var2) {
      if (var2.equals(var1)) {
         return false;
      } else {
         xc_3 var3 = bw_3.class_(var0, var1);
         return !(var3.break_() instanceof dq_3) ? true : var3.byte_(dq_3.volatile_);
      }
   }

   static boolean throws_(Ps_1 var0, rfH_2 var1) {
      return byte_(bw_3.class_(var0, var1));
   }

   static boolean throws_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      xd_3 var5 = var4.break_();
      if (var5 instanceof xC_2) {
         return byte_(var0, var1, var2 - 1, var3);
      } else if (var5 instanceof WD) {
         if (!var0.class_(var1, var3)) {
            return true;
         } else {
            return var4.byte_(WD.volatile_) >= 3 ? false : byte_(var0, var1, var2 - 1, var3);
         }
      } else {
         rXE var6 = var4.volatile_();
         if (!var6.byte_()) {
            if (byte_(var1, var2, var3, var4, var0)) {
               return false;
            } else if ((Boolean)C_class.instanceof_().rZ.class_[0]) {
               return false;
            } else {
               xc_3 var7 = var0.class_(var1, var2 + 1, var3);
               return var7.volatile_().byte_() && !(var7.break_() instanceof kn_3) ? var6.class_() instanceof rXh_1 : false;
            }
         } else {
            return var4.class_((rRq_1)var0.class_[4], rfH_2.protected_, rLT.LAND);
         }
      }
   }

   static boolean throws_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      return !var0.volatile_().byte_()
         || var1 == xu_3.bV
         || var1 == xu_3.Pw
         || var1 == xu_3.XJ
         || var1 instanceof Jj_1
         || var1 == xu_3.SM
         || var1 == xu_3.U
         || var1 == xu_3.hM;
   }

   static boolean finally_(xc_3 var0) {
      return !var0.volatile_().byte_();
   }

   static boolean catch_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      if (!byte_(var4)) {
         return case_(var4) && !byte_(var1, var2, var3, var4, var0) && (Boolean)C_class.instanceof_().rj.class_[0];
      } else {
         xc_3 var5 = var0.class_(var1, var2 + 1, var3);
         xd_3 var6 = var5.break_();
         if (var6 != xu_3.Sr && !(var6 instanceof xC_2)) {
            return !byte_(var1, var2, var3, var4, var0) && var5.volatile_().class_() != rXG.break_
               ? byte_(var5) ^ (Boolean)C_class.instanceof_().rZ.class_[0]
               : byte_(var5) && !(Boolean)C_class.instanceof_().rZ.class_[0];
         } else {
            return true;
         }
      }
   }

   static boolean catch_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      if (!(var1 instanceof xP_2) && !(var1 instanceof ky_3) && !(var1 instanceof Wl_1) && !(var1 instanceof Wp_1)) {
         try {
            return xd_3.class_(var0.extends_(null, null));
         } catch (Exception var3) {
            return false;
         }
      } else {
         return false;
      }
   }

   static boolean case_(Ps_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.case_().byte_(var1);
      Gx_1 var3 = class_(var2);
      if (var3 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         return true;
      } else {
         return var3 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2] ? false : protected_(new bw_3(var0), var1.b_(), var1.c_(), var1.d_(), var2);
      }
   }

   static boolean case_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      return !((ba_3)var0.class_[5]).class_(var1, var3) ? false : catch_(var4) || var4.break_() == xu_3.u || var4.break_() instanceof zs_3;
   }

   static boolean case_(xc_3 var0) {
      rXs_1 var1 = var0.volatile_().class_();
      return var1 == rXG.throws_ || var1 == rXG.protected_;
   }

   static Gx_1 implements_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      if (catch_(var0) && var1 != xu_3.bV && var1 != xu_3.hM && var1 != xu_3.Jh) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      } else if (var1 != xu_3.PJ && (var1 != xu_3.BD || !(Boolean)C_class.instanceof_().public_.class_[0])) {
         if (var1 == xu_3.PS || var1 == xu_3.bt || var1 == xu_3.PY) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (var1 == xu_3.SW || var1 == xu_3.re || var1 == xu_3.sZ) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (var1 == xu_3.u || var1 instanceof zs_3) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (var1 instanceof zG_2) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (byte_(var0)) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
         } else if (case_(var0) && (Boolean)C_class.instanceof_().rj.class_[0]) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
         } else if (var1 instanceof zv_3 && final_()) {
            return var0.byte_(zv_3.volatile_) && var0.byte_(zv_3.final_) == rCj_1.TOP
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (!(var1 instanceof Wg_1)) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         } else if (C_class.instanceof_().break_()) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else {
            return var0.byte_(Wg_1.volatile_) != rCo_1.BOTTOM
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         }
      } else {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      }
   }

   static boolean protected_(Ps_1 var0, rfH_2 var1) {
      return finally_(bw_3.class_(var0, var1));
   }

   static boolean protected_(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      xd_3 var5 = var4.break_();
      if (var5 != xu_3.PJ && var5 != xu_3.BD) {
         if (!var4.volatile_().byte_()) {
            if (var5 instanceof Wg_1) {
               if (var4.byte_(Wg_1.volatile_) != rCo_1.BOTTOM) {
                  return true;
               }
            } else if (var5 instanceof zG_2) {
               if (var4.byte_(zG_2.final_) == rCj_1.TOP) {
                  return true;
               }

               rCK var6 = var4.byte_(zG_2.package_);
               if (var6 == rCK.INNER_LEFT || var6 == rCK.INNER_RIGHT) {
                  return true;
               }
            } else if (var5 instanceof zv_3) {
               if (!var4.byte_(zv_3.volatile_) && var4.byte_(zv_3.final_) == rCj_1.TOP) {
                  return true;
               }
            } else if (var5 == xu_3.hU) {
               return true;
            }

            if ((Boolean)var0.break_[16]) {
               return false;
            }

            xd_3 var7 = var0.break_(var1, var2 + 1, var3);
            if (var7 instanceof dj_3) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static boolean protected_(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      return var4.class_((rRq_1)var0.class_[4], ((rfw_3)var0.class_[3]).class_(var1, var2, var3), rLT.LAND);
   }

   static boolean protected_(xc_3 var0) {
      rXE var1 = var0.volatile_();
      return var1.class_() instanceof rXB && var1.class_().protected_(var1) != 8;
   }

   static Gx_1 private_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      if (var1 instanceof Ja_1) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      } else {
         if (final_()) {
            if (var1 instanceof zv_3) {
               return var0.byte_(zv_3.volatile_) && var0.byte_(zv_3.final_) == rCj_1.TOP
                  ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
                  : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
            }
         } else if (var1 instanceof zv_3) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         }

         if (!(var1 instanceof Jj_1)
            && var1 != xu_3.SQ
            && var1 != xu_3.U
            && var1 != xu_3.SM
            && var1 != xu_3.Sx
            && !(var1 instanceof JU)
            && var1 != xu_3.hM
            && !(var1 instanceof Wp_1)
            && !(var1 instanceof Wg_1)
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
                     bO_2 var3 = C_throws.byte_().break_();
                     if (var3.class_(var0)) {
                        return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
                     } else {
                        try {
                           return var0.class_(null, null, rLT.LAND)
                              ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
                              : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
                        } catch (Throwable var5) {
                           System.out
                              .println(
                                 "The block " + var0.break_().native_().getString() + " requires a special case due to the exception " + var5.getMessage()
                              );
                           return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
                        }
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
   }

   static boolean final_() {
      C_class var0 = C_throws.byte_();
      bO_2 var1 = var0.break_();
      bW_2 var2 = var0.abstract_();
      return var1.byte_() || var2.byte_();
   }
}
