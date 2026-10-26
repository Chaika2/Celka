package celestial;

import java.util.List;
import java.util.Optional;

public interface EF extends PP, rx_3 {
   static boolean id_byte(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      Gx_1 var5 = id_implements(var4);
      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         return true;
      } else {
         return var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2] ? false : id_catch(var0, var1, var2, var3, var4);
      }
   }

   static boolean id_byte(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      return ((GJ)var0.id_break[29]).id_class((bw_3)var0.id_break[4], var1, var2, var3, var4);
   }

   static boolean id_byte(Ps_1 var0, rfH_2 var1) {
      return id_class(new bw_3(var0), var1);
   }

   static boolean id_byte(xc_3 var0) {
      rXs_1 var1 = var0.id_volatile().id_class();
      return var1 == rXG.id_byte || var1 == rXG.id_break;
   }

   static boolean id_byte(bw_3 var0, int var1, int var2, int var3) {
      return id_byte(var0, var1, var2, var3, var0.id_class(var1, var2, var3));
   }

   static boolean id_byte(int var0, int var1, int var2, xc_3 var3, bw_3 var4) {
      rXE var5 = var3.id_volatile();
      if (!(var5.id_class() instanceof rXB)) {
         return false;
      } else {
         return var5.id_class().id_protected(var5) != 8
            ? true
            : id_protected(var4.id_class(var0 + 1, var1, var2))
               || id_protected(var4.id_class(var0 - 1, var1, var2))
               || id_protected(var4.id_class(var0, var1, var2 + 1))
               || id_protected(var4.id_class(var0, var1, var2 - 1));
      }
   }

   static boolean id_byte(EZ var0, int var1, int var2, int var3) {
      return ((GJ)var0.id_break[29]).id_byte((bw_3)var0.id_break[4], var1, var2, var3, var0.id_class(var1, var2, var3));
   }

   static boolean id_class(Ps_1 var0, rU_2 var1, xc_3 var2) {
      return id_byte(new bw_3(var0), (Integer)var1.id_break[0], (Integer)var1.id_break[1], (Integer)var1.id_break[2], var2);
   }

   static boolean id_class(EZ var0, xc_3 var1) {
      return (Integer)var0.id_break[17] != 0 && var1.id_byte() == QP.id_finally && var1.id_byte(dj_3.id_volatile) == 0;
   }

   static void id_class(Ps_1 var0, xc_3 var1) {
      id_class(var0, var1, new bU_2(var0.id_catch()), (Boolean)C_throws.id_break().G.id_class[0]);
   }

   static boolean id_class(EZ var0, int var1, int var2, int var3) {
      return id_class(var0, var1, var2, var3, var0.id_class(var1, var2, var3));
   }

   static EL id_class(EA var0, C_case var1, rfH_2 var2, boolean var3, boolean var4) {
      return id_class(var0, var1, var2, var3, var4, true);
   }

   static boolean id_class(bw_3 var0, int var1, int var2, int var3, boolean var4) {
      xc_3 var5 = var0.id_class(var1, var2, var3);
      xd_3 var6 = var5.id_break();
      if (!var4 && var6 instanceof dH_2 && (Boolean)C_class.id_instanceof().id_continue.id_class[0] && dH_2.id_implements(var0.id_class(var1, var2 - 1, var3))) {
         return true;
      } else if (var6 instanceof dj_3) {
         if (!var4 && !(Boolean)C_class.id_instanceof().rY.id_class[0]) {
            int var7 = var5.id_byte(dj_3.id_volatile);
            return var7 == 0 ? true : !(var0.id_class(var1, var2 - 1, var3).id_break() instanceof dj_3);
         } else {
            return true;
         }
      } else {
         return !var5.id_volatile().id_byte();
      }
   }

   static EL id_class(EA var0, C_case var1, rfH_2 var2, boolean var3, boolean var4, boolean var5) {
      Ps_1 var6 = var1.id_throw();
      Optional var7 = PJ.id_class(var6, var2, var4);
      boolean var8 = false;
      if (var7.isPresent()) {
         var0.id_class(new En_1(((Px_1)var7.get()).id_class(), true));
         var8 = true;
      }

      int var9 = 0;

      while (true) {
         label90: {
            if (var9 < 5) {
               rfH_2 var10 = var2.id_break(((rpr_3[])Ev_1.id_class[0])[var9]);
               if (!id_byte(var6, var10)) {
                  break label90;
               }

               if (!((C_class)var1).id_static().id_class(false, var2.b_(), var2.c_(), var2.d_())) {
                  PP.a_.id_byte("bb pls get me some blocks. dirt, netherrack, cobble");
                  var0.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
                  return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[2];
               }

               double var11 = ((double)(var2.b_() + var10.b_()) + 1.0) * 0.5;
               double var13 = ((double)(var2.c_() + var10.c_()) + 0.5) * 0.5;
               double var15 = ((double)(var2.d_() + var10.d_()) + 1.0) * 0.5;
               PX var17 = PJ.id_class(var4 ? Ph_1.id_class(var6.id_catch()) : var6.id_finally(), new rjU_2(var11, var13, var15), var6.id_protected());
               PX var18 = var1.id_catch().id_class().id_class(var17);
               rjG_2 var19 = Ph_1.id_class(var6.id_catch(), var18, var6.id_native().id_case(), var4);
               if (var19 == null || var19.id_byte() != rjM_2.BLOCK) {
                  break label90;
               }

               rfH_2 var20 = ((rff_3)var19).id_class();
               if (!var20.equals(var10) || !var20.id_break(((rff_3)var19).id_break()).equals(var2)) {
                  break label90;
               }

               var0.id_class(new En_1(var17, true));
               var8 = true;
               if (var3) {
                  break label90;
               }
            }

            if (var6.id_class().isPresent()) {
               rfH_2 var21 = var6.id_class().get();
               rpr_3 var22 = ((rff_3)var6.id_byte()).id_break();
               if (var21.equals(var2) || id_byte(var6, var21) && var21.id_break(var22).equals(var2)) {
                  if (var4) {
                     var0.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  }

                  if (var5) {
                     ((C_class)var1).id_static().id_class(true, var2.b_(), var2.c_(), var2.d_());
                  }

                  return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[0];
               }
            }

            if (var8) {
               if (var4) {
                  var0.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
               }

               if (var5) {
                  ((C_class)var1).id_static().id_class(true, var2.b_(), var2.c_(), var2.d_());
               }

               return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[1];
            }

            return (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[2];
         }

         var9++;
      }
   }

   static void id_class(Ps_1 var0, xc_3 var1, bU_2 var2, boolean var3) {
      if (C_class.id_instanceof().id_protected() && !(Boolean)C_class.id_instanceof().rr.id_class[0]) {
         ((rhz_3)var0.id_catch().id_implements[1]).id_protected = var2.id_class(var1.id_break(), var3);
      }
   }

   static double id_class(EZ var0, int var1, int var2, int var3, xc_3 var4, boolean var5) {
      if (!id_break(var0, var1, var2, var3, var4)) {
         if (!var4.id_volatile().id_byte()) {
            return 1000000.0;
         } else {
            double var6 = var0.id_break(var1, var2, var3, var4);
            if (var6 >= 1000000.0) {
               return 1000000.0;
            } else if (id_class((bw_3)var0.id_break[4], var1, var2, var3, var4)) {
               return 1000000.0;
            } else {
               double var8 = ((bU_2)var0.id_break[5]).id_class(var4);
               if (var8 <= 0.0) {
                  return 1000000.0;
               } else {
                  double var10 = 1.0 / var8;
                  var10 += var0.id_break[24];
                  var10 *= var6;
                  if (var5) {
                     xc_3 var12 = var0.id_class(var1, var2 + 1, var3);
                     if (var12.id_break() instanceof dH_2) {
                        var10 += id_class(var0, var1, var2 + 1, var3, var12, true);
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

   static double id_class(EZ var0, int var1, int var2, int var3, boolean var4) {
      return id_class(var0, var1, var2, var3, var0.id_class(var1, var2, var3), var4);
   }

   static void id_class(Ps_1 var0, EA var1, rfH_2 var2) {
      var1.id_class(
            new En_1(new PX(PJ.id_class(var0.id_finally(), Pu_1.id_class(var2), var0.id_protected()).id_throws(), (Float)var0.id_catch().id_throws[16]), false)
         )
         .id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
      rz_3 var3 = C_throws.id_byte().id_void().id_throws();
      if (var3 != null) {
         var3.id_class(var1);
      }
   }

   static boolean id_class(xd_3 var0) {
      return var0 instanceof Ja_1 || var0 == xu_3.id_instanceof || var0 == xu_3.id_try;
   }

   @Deprecated
   static boolean id_class(int var0, int var1, int var2, xc_3 var3, bw_3 var4) {
      return id_break(var0, var1, var2, var3, var4);
   }

   static boolean id_class(bw_3 var0, rfH_2 var1) {
      return id_class(var0, var1.b_(), var1.c_(), var1.d_());
   }

   static boolean id_class(Ps_1 var0, rfH_2 var1) {
      return id_byte(new bw_3(var0), var1.b_(), var1.c_(), var1.d_());
   }

   static boolean id_class(rfH_2 var0, xc_3 var1, rfH_2 var2, rCN var3) {
      if (var2.equals(var0)) {
         return false;
      } else {
         rpB_2 var4 = var1.id_byte(kE_2.p).id_final();
         boolean var5 = var1.id_byte(var3);
         rpB_2 var6;
         if (!var2.id_private().equals(var0) && !var2.id_protected().equals(var0)) {
            if (!var2.id_extends().equals(var0) && !var2.id_byte().equals(var0)) {
               return true;
            }

            var6 = rpB_2.X;
         } else {
            var6 = rpB_2.Z;
         }

         return var4 == var6 == var5;
      }
   }

   static boolean id_class(Ps_1 var0, rfH_2 var1, rfH_2 var2) {
      if (var2.equals(var1)) {
         return false;
      } else {
         xc_3 var3 = bw_3.id_class(var0, var1);
         return !(var3.id_break() instanceof dN_2) ? true : id_class(var1, var3, var2, dN_2.id_final);
      }
   }

   static boolean id_class(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      return ((GJ)var0.id_break[29]).id_break((bw_3)var0.id_break[4], var1, var2, var3, var4);
   }

   static boolean id_class(bw_3 var0, int var1, int var2, int var3) {
      return id_case(var0, var1, var2, var3, var0.id_class(var1, var2, var3));
   }

   static boolean id_class(Ps_1 var0, rU_2 var1) {
      return id_break(new bw_3(var0), (Integer)var1.id_break[0], (Integer)var1.id_break[1], (Integer)var1.id_break[2]);
   }

   static Gx_1 id_class(xc_3 var0) {
      xd_3 var1 = var0.id_break();
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
         && var0.id_volatile().id_byte()
         && !(var1 instanceof zv_3)
         && !(var1 instanceof dL_2)
         && !(var1 instanceof Ww_1)
         && !(var1 instanceof Wp_1)) {
         try {
            return var0.id_class(null, null, rLT.LAND)
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         } catch (Throwable var3) {
            System.out.println("The block " + var0.id_break().id_native().getString() + " requires a special case due to the exception " + var3.getMessage());
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
         }
      } else {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
      }
   }

   static boolean id_class(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      if (!((ba_3)var0.id_class[5]).id_class(var1, var3)) {
         return true;
      } else {
         xd_3 var5 = var4.id_break();
         return ((List)C_class.id_instanceof().Pl.id_class[0]).contains(var5)
            || var5 == xu_3.PT
            || var5 instanceof WT
            || id_class(var0, var1, var2 + 1, var3, true)
            || id_class(var0, var1 + 1, var2, var3, false)
            || id_class(var0, var1 - 1, var2, var3, false)
            || id_class(var0, var1, var2, var3 + 1, false)
            || id_class(var0, var1, var2, var3 - 1, false);
      }
   }

   static boolean id_break(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      return ((GJ)var0.id_break[29]).id_byte((bw_3)var0.id_break[4], var1, var2, var3, var4);
   }

   static boolean id_break(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      Gx_1 var5 = id_private(var4);
      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         return true;
      } else {
         return var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2] ? false : id_throws(var0, var1, var2, var3, var4);
      }
   }

   static boolean id_break(int var0, int var1, int var2, xc_3 var3, bw_3 var4) {
      xd_3 var5 = var3.id_break();
      if (var5 instanceof Ja_1) {
         return true;
      } else if (var5 instanceof WD) {
         return !var4.id_class(var0, var2) ? true : var3.id_byte(WD.id_volatile) == 1;
      } else {
         return var5 != xu_3.GE && var5 != xu_3.Gs ? var3.id_byte().id_throws() : true;
      }
   }

   static boolean id_break(xc_3 var0) {
      return var0.id_break() instanceof Wg_1 && var0.id_byte(Wg_1.id_volatile) == rCo_1.BOTTOM;
   }

   static boolean id_break(Ps_1 var0, rfH_2 var1) {
      xc_3 var2 = bw_3.id_class(var0, var1);
      return eA_2.id_implements(var0.id_catch()) && var2.id_byte() == QP.id_finally && var2.id_byte(dj_3.id_volatile) == 0;
   }

   static boolean id_break(EZ var0, int var1, int var2, int var3) {
      return id_byte(var0, var1, var2, var3, var0.id_class(var1, var2, var3));
   }

   static boolean id_break(bw_3 var0, int var1, int var2, int var3) {
      return id_break(var0, var1, var2, var3, var0.id_class(var1, var2, var3));
   }

   static boolean id_break(Ps_1 var0, rU_2 var1) {
      return id_byte(new bw_3(var0), (Integer)var1.id_break[0], (Integer)var1.id_break[1], (Integer)var1.id_break[2]);
   }

   static boolean id_break(Ps_1 var0, rfH_2 var1, rfH_2 var2) {
      if (var2.equals(var1)) {
         return false;
      } else {
         xc_3 var3 = bw_3.id_class(var0, var1);
         return !(var3.id_break() instanceof dq_3) ? true : var3.id_byte(dq_3.id_volatile);
      }
   }

   static boolean id_throws(Ps_1 var0, rfH_2 var1) {
      return id_byte(bw_3.id_class(var0, var1));
   }

   static boolean id_throws(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      xd_3 var5 = var4.id_break();
      if (var5 instanceof xC_2) {
         return id_byte(var0, var1, var2 - 1, var3);
      } else if (var5 instanceof WD) {
         if (!var0.id_class(var1, var3)) {
            return true;
         } else {
            return var4.id_byte(WD.id_volatile) >= 3 ? false : id_byte(var0, var1, var2 - 1, var3);
         }
      } else {
         rXE var6 = var4.id_volatile();
         if (!var6.id_byte()) {
            if (id_byte(var1, var2, var3, var4, var0)) {
               return false;
            } else if ((Boolean)C_class.id_instanceof().rZ.id_class[0]) {
               return false;
            } else {
               xc_3 var7 = var0.id_class(var1, var2 + 1, var3);
               return var7.id_volatile().id_byte() && !(var7.id_break() instanceof kn_3) ? var6.id_class() instanceof rXh_1 : false;
            }
         } else {
            return var4.id_class((rRq_1)var0.id_class[4], rfH_2.id_protected, rLT.LAND);
         }
      }
   }

   static boolean id_throws(xc_3 var0) {
      xd_3 var1 = var0.id_break();
      return !var0.id_volatile().id_byte()
         || var1 == xu_3.bV
         || var1 == xu_3.Pw
         || var1 == xu_3.XJ
         || var1 instanceof Jj_1
         || var1 == xu_3.SM
         || var1 == xu_3.U
         || var1 == xu_3.hM;
   }

   static boolean id_finally(xc_3 var0) {
      return !var0.id_volatile().id_byte();
   }

   static boolean id_catch(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      if (!id_byte(var4)) {
         return id_case(var4) && !id_byte(var1, var2, var3, var4, var0) && (Boolean)C_class.id_instanceof().rj.id_class[0];
      } else {
         xc_3 var5 = var0.id_class(var1, var2 + 1, var3);
         xd_3 var6 = var5.id_break();
         if (var6 != xu_3.Sr && !(var6 instanceof xC_2)) {
            return !id_byte(var1, var2, var3, var4, var0) && var5.id_volatile().id_class() != rXG.id_break
               ? id_byte(var5) ^ (Boolean)C_class.id_instanceof().rZ.id_class[0]
               : id_byte(var5) && !(Boolean)C_class.id_instanceof().rZ.id_class[0];
         } else {
            return true;
         }
      }
   }

   static boolean id_catch(xc_3 var0) {
      xd_3 var1 = var0.id_break();
      if (!(var1 instanceof xP_2) && !(var1 instanceof ky_3) && !(var1 instanceof Wl_1) && !(var1 instanceof Wp_1)) {
         try {
            return xd_3.id_class(var0.id_extends(null, null));
         } catch (Exception var3) {
            return false;
         }
      } else {
         return false;
      }
   }

   static boolean id_case(Ps_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_case().id_byte(var1);
      Gx_1 var3 = id_class(var2);
      if (var3 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         return true;
      } else {
         return var3 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
            ? false
            : id_protected(new bw_3(var0), var1.b_(), var1.c_(), var1.d_(), var2);
      }
   }

   static boolean id_case(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      return !((ba_3)var0.id_class[5]).id_class(var1, var3) ? false : id_catch(var4) || var4.id_break() == xu_3.u || var4.id_break() instanceof zs_3;
   }

   static boolean id_case(xc_3 var0) {
      rXs_1 var1 = var0.id_volatile().id_class();
      return var1 == rXG.id_throws || var1 == rXG.id_protected;
   }

   static Gx_1 id_implements(xc_3 var0) {
      xd_3 var1 = var0.id_break();
      if (id_catch(var0) && var1 != xu_3.bV && var1 != xu_3.hM && var1 != xu_3.Jh) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      } else if (var1 != xu_3.PJ && (var1 != xu_3.BD || !(Boolean)C_class.id_instanceof().id_public.id_class[0])) {
         if (var1 == xu_3.PS || var1 == xu_3.bt || var1 == xu_3.PY) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (var1 == xu_3.SW || var1 == xu_3.re || var1 == xu_3.sZ) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (var1 == xu_3.u || var1 instanceof zs_3) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (var1 instanceof zG_2) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (id_byte(var0)) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
         } else if (id_case(var0) && (Boolean)C_class.id_instanceof().rj.id_class[0]) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1];
         } else if (var1 instanceof zv_3 && id_final()) {
            return var0.id_byte(zv_3.id_volatile) && var0.id_byte(zv_3.id_final) == rCj_1.TOP
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else if (!(var1 instanceof Wg_1)) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         } else if (C_class.id_instanceof().id_break()) {
            return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
         } else {
            return var0.id_byte(Wg_1.id_volatile) != rCo_1.BOTTOM
               ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
               : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
         }
      } else {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      }
   }

   static boolean id_protected(Ps_1 var0, rfH_2 var1) {
      return id_finally(bw_3.id_class(var0, var1));
   }

   static boolean id_protected(EZ var0, int var1, int var2, int var3, xc_3 var4) {
      xd_3 var5 = var4.id_break();
      if (var5 != xu_3.PJ && var5 != xu_3.BD) {
         if (!var4.id_volatile().id_byte()) {
            if (var5 instanceof Wg_1) {
               if (var4.id_byte(Wg_1.id_volatile) != rCo_1.BOTTOM) {
                  return true;
               }
            } else if (var5 instanceof zG_2) {
               if (var4.id_byte(zG_2.id_final) == rCj_1.TOP) {
                  return true;
               }

               rCK var6 = var4.id_byte(zG_2.id_package);
               if (var6 == rCK.INNER_LEFT || var6 == rCK.INNER_RIGHT) {
                  return true;
               }
            } else if (var5 instanceof zv_3) {
               if (!var4.id_byte(zv_3.id_volatile) && var4.id_byte(zv_3.id_final) == rCj_1.TOP) {
                  return true;
               }
            } else if (var5 == xu_3.hU) {
               return true;
            }

            if ((Boolean)var0.id_break[16]) {
               return false;
            }

            xd_3 var7 = var0.id_break(var1, var2 + 1, var3);
            if (var7 instanceof dj_3) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static boolean id_protected(bw_3 var0, int var1, int var2, int var3, xc_3 var4) {
      return var4.id_class((rRq_1)var0.id_class[4], ((rfw_3)var0.id_class[3]).id_class(var1, var2, var3), rLT.LAND);
   }

   static boolean id_protected(xc_3 var0) {
      rXE var1 = var0.id_volatile();
      return var1.id_class() instanceof rXB && var1.id_class().id_protected(var1) != 8;
   }

   static Gx_1 id_private(xc_3 var0) {
      xd_3 var1 = var0.id_break();
      if (var1 instanceof Ja_1) {
         return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
      } else {
         if (id_final()) {
            if (var1 instanceof zv_3) {
               return var0.id_byte(zv_3.id_volatile) && var0.id_byte(zv_3.id_final) == rCj_1.TOP
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
            if (((List)C_class.id_instanceof().PD.id_class[0]).contains(var1)) {
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
                     bO_2 var3 = C_throws.id_byte().id_break();
                     if (var3.id_class(var0)) {
                        return (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0];
                     } else {
                        try {
                           return var0.id_class(null, null, rLT.LAND)
                              ? (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
                              : (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2];
                        } catch (Throwable var5) {
                           System.out
                              .println(
                                 "The block " + var0.id_break().id_native().getString() + " requires a special case due to the exception " + var5.getMessage()
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

   static boolean id_final() {
      C_class var0 = C_throws.id_byte();
      bO_2 var1 = var0.id_break();
      bW_2 var2 = var0.id_abstract();
      return var1.id_byte() || var2.id_byte();
   }
}
