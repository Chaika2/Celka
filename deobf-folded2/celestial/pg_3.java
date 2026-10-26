package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class pg_3 {
   private static final HU id_case = HU.id_native(new rqO_2("textures/misc/shadow.png"));
   private final Map<aI_2, pV_2> id_catch = Maps.newHashMap();
   private final Map<String, ql_3> id_private = Maps.newHashMap();
   private final ql_3 id_implements;
   private final cm_3 id_finally;
   public final fY_2 id_class;
   private rYB id_extends;
   public ly_3 id_break;
   private rjY_2 id_native;
   public an_3 id_byte;
   public final Qw_1 id_protected;
   private boolean id_volatile = true;
   private boolean id_final;
   public pV_2 id_throws = null;

   public rjY_2 id_byte() {
      return this.id_native;
   }

   public pg_3(fY_2 var1, Hz_1 var2, rAv_1 var3, cm_3 var4, Qw_1 var5) {
      this.id_class = var1;
      this.id_finally = var4;
      this.id_protected = var5;
      this.id_class(var2, var3);
      this.id_implements = new ql_3(this);
      this.id_private.put("id_default", this.id_implements);
      this.id_private.put("slim", new ql_3(this, true));
   }

   private static void id_class(Ml_1 var0, Hx_1 var1, an_3 var2, float var3, float var4, rRR var5, float var6) {
      if (!rrbb_3.rs() || !rrdZ.BJ) {
         float var7 = var6;
         if (var2 instanceof is_3 var8 && var8.n_()) {
            var7 = var6 * 0.5F;
         }

         double var24 = rfU_2.id_protected((double)var4, (Double)var2.id_throws[34], var2.rx());
         double var10 = rfU_2.id_protected((double)var4, (Double)var2.id_throws[35], var2.re());
         double var12 = rfU_2.id_protected((double)var4, (Double)var2.id_throws[36], var2.BO());
         int var14 = rfU_2.id_byte(var24 - (double)var7);
         int var15 = rfU_2.id_byte(var24 + (double)var7);
         int var16 = rfU_2.id_byte(var10 - (double)var7);
         int var17 = rfU_2.id_byte(var10);
         int var18 = rfU_2.id_byte(var12 - (double)var7);
         int var19 = rfU_2.id_byte(var12 + (double)var7);
         MH var20 = var0.id_byte();
         Ok_1 var21 = var1.getBuffer(id_case);

         for (rfH_2 var23 : rfH_2.id_class(new rfH_2(var14, var16, var18), new rfH_2(var15, var17, var19))) {
            id_class(var20, var21, var5, var23, var24, var10, var12, var7, var3);
         }
      }
   }

   private static void id_class(MH var0, Ok_1 var1, float var2, float var3, float var4, float var5, float var6) {
      var1.id_class(var0.id_class(), var2, var3, var4)
         .id_break(255, 255, 255, 255)
         .id_class(var5, var6)
         .id_break(0, 10)
         .id_break(240)
         .id_class(var0.id_break(), 0.0F, 1.0F, 0.0F)
         .id_class();
   }

   private void id_class(Ml_1 var1, Hx_1 var2, an_3 var3) {
      fj_3 var4 = IC.id_class.id_byte();
      fj_3 var5 = IC.id_break.id_byte();
      var1.id_class();
      float var6 = var3.PN() * 1.4F;
      var1.id_class(var6, var6, var6);
      float var7 = 0.5F;
      float var8 = var3.Bm() / var6;
      float var9 = 0.0F;
      var1.id_class(rje_3.id_protected.id_byte(-this.id_break.id_throws()));
      var1.id_class(0.0, 0.0, (double)(-0.3F + (float)((int)var8) * 0.02F));
      float var10 = 0.0F;
      int var11 = 0;
      Ok_1 var12 = var2.getBuffer(lp_3.id_private());
      if (rrbb_3.w()) {
         var12.id_class(true);
      }

      for (MH var13 = var1.id_byte(); var8 > 0.0F; var11++) {
         fj_3 var14 = var11 % 2 == 0 ? var4 : var5;
         var12.id_break(var14);
         float var15 = var14.id_case();
         float var16 = var14.id_private();
         float var17 = var14.id_catch();
         float var18 = var14.id_implements();
         if (var11 / 2 % 2 == 0) {
            float var19 = var17;
            var17 = var15;
            var15 = var19;
         }

         id_class(var13, var12, var7 - 0.0F, 0.0F - var9, var10, var17, var18);
         id_class(var13, var12, -var7 - 0.0F, 0.0F - var9, var10, var15, var18);
         id_class(var13, var12, -var7 - 0.0F, 1.4F - var9, var10, var15, var16);
         id_class(var13, var12, var7 - 0.0F, 1.4F - var9, var10, var17, var16);
         var8 -= 0.45F;
         var9 -= 0.45F;
         var7 *= 0.9F;
         var10 += 0.03F;
      }

      var1.id_break();
   }

   private void id_class(Ml_1 var1, Ok_1 var2, an_3 var3, float var4, float var5, float var6) {
      rfl_3 var7 = var3.rN();
      if (var3 instanceof iB_2 var8) {
         var7 = var7.id_class(
            (double)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnJ_2.id_class(var8, 0.0F)).id_break()
         );
      }

      rfl_3 var9 = var7.id_protected(-var3.rx(), -var3.re(), -var3.BO());
      yX_2.id_class(var1, var2, var9, var4, var5, var6, 1.0F);
   }

   private void id_class(Ml_1 var1, Ok_1 var2, an_3 var3, float var4) {
      if (!rrdZ.id_new) {
         float var5 = var3.PN() / 2.0F;
         this.id_class(var1, var2, var3, 1.0F, 1.0F, 1.0F);
         boolean var6 = var3 instanceof rSu_1;
         if (rrxr_3.l.id_byte() && rrxr_3.C.id_byte()) {
            var6 = rrxr_3.id_break(var3, rrxr_3.l);
         }

         if (var6) {
            double var7 = -rfU_2.id_protected((double)var4, (Double)var3.id_throws[34], var3.rx());
            double var9 = -rfU_2.id_protected((double)var4, (Double)var3.id_throws[35], var3.re());
            double var11 = -rfU_2.id_protected((double)var4, (Double)var3.id_throws[36], var3.BO());
            Object var13 = rrxr_3.C.id_byte() ? (an_3[])rrxr_3.id_private(var3, rrxr_3.C) : ((rSu_1)var3).id_implements();

            for (Object var17 : var13) {
               var1.id_class();
               double var18 = var7 + rfU_2.id_protected((double)var4, (Double)((an_3)var17).id_throws[34], ((an_3)var17).rx());
               double var20 = var9 + rfU_2.id_protected((double)var4, (Double)((an_3)var17).id_throws[35], ((an_3)var17).re());
               double var22 = var11 + rfU_2.id_protected((double)var4, (Double)((an_3)var17).id_throws[36], ((an_3)var17).BO());
               var1.id_class(var18, var20, var22);
               this.id_class(var1, var2, (an_3)var17, 0.25F, 1.0F, 0.0F);
               var1.id_break();
            }
         }

         if (var3 instanceof iB_2) {
            yX_2.id_class(
               var1,
               var2,
               (double)(-var5),
               (double)(var3.Bx() - 0.01F),
               (double)(-var5),
               (double)var5,
               (double)(var3.Bx() + 0.01F),
               (double)var5,
               1.0F,
               0.0F,
               0.0F,
               1.0F
            );
         }

         rjU_2 var24 = var3.id_break(var4);
         rjV_2 var8 = var1.id_byte().id_class();
         var2.id_class(var8, 0.0F, var3.Bx(), 0.0F).id_break(0, 0, 255, 255).id_class();
         var2.id_class(var8, (float)(var24.id_break * 2.0), (float)((double)var3.Bx() + var24.id_byte * 2.0), (float)(var24.id_protected * 2.0))
            .id_break(0, 0, 255, 255)
            .id_class();
      }
   }

   public <E extends an_3> int id_class(E var1, float var2) {
      int var3 = this.id_class(var1).id_break(var1, var2);
      if (rrbb_3.rL()) {
         var3 = rrbg_3.id_class(var1, var3);
      }

      return var3;
   }

   public double id_class(double var1, double var3, double var5) {
      return this.id_break.id_break().id_protected(var1, var3, var5);
   }

   public void id_class(rYB var1) {
      this.id_extends = var1;
      if (var1 == null) {
         this.id_break = null;
      }
   }

   private static void id_class(MH var0, Ok_1 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.id_class(var0.id_class(), var3, var4, var5)
         .id_class(1.0F, 1.0F, 1.0F, var2)
         .id_class(var6, var7)
         .id_byte(fZ_2.id_class)
         .id_break(15728880)
         .id_class(var0.id_break(), 0.0F, 1.0F, 0.0F)
         .id_class();
   }

   private static void id_class(MH var0, Ok_1 var1, rRR var2, rfH_2 var3, double var4, double var6, double var8, float var10, float var11) {
      rfH_2 var12 = var3.id_break();
      xc_3 var13 = var2.id_byte(var12);
      if (var13.id_private() != xN_2.INVISIBLE && var2.id_package(var3) > 3 && var13.id_new(var2, var12)) {
         rjC_2 var14 = var13.id_finally(var2, var3.id_break());
         if (!var14.id_break()) {
            float var15 = (float)(((double)var11 - (var6 - (double)var3.c_()) / 2.0) * 0.5 * (double)var2.id_native(var3));
            if (var15 >= 0.0F) {
               if (var15 > 1.0F) {
                  var15 = 1.0F;
               }

               rfl_3 var16 = var14.id_class();
               double var17 = (double)var3.b_() + var16.id_class;
               double var19 = (double)var3.b_() + var16.id_protected;
               double var21 = (double)var3.c_() + var16.id_break + 0.001;
               double var23 = (double)var3.d_() + var16.id_byte;
               double var25 = (double)var3.d_() + var16.id_case;
               float var27 = (float)(var17 - var4);
               float var28 = (float)(var19 - var4);
               float var29 = (float)(var21 - var6);
               float var30 = (float)(var23 - var8);
               float var31 = (float)(var25 - var8);
               float var32 = -var27 / 2.0F / var10 + 0.5F;
               float var33 = -var28 / 2.0F / var10 + 0.5F;
               float var34 = -var30 / 2.0F / var10 + 0.5F;
               float var35 = -var31 / 2.0F / var10 + 0.5F;
               id_class(var0, var1, var15, var27, var29, var30, var32, var34);
               id_class(var0, var1, var15, var27, var29, var31, var32, var35);
               id_class(var0, var1, var15, var28, var29, var31, var33, var35);
               id_class(var0, var1, var15, var28, var29, var30, var33, var34);
            }
         }
      }
   }

   public void id_class(rjY_2 var1) {
      this.id_native = var1;
   }

   public void id_class(rYB var1, ly_3 var2, an_3 var3) {
      this.id_extends = var1;
      this.id_break = var2;
      this.id_native = var2.id_case();
      this.id_byte = var3;
   }

   public <T extends an_3> pV_2<? super T> id_class(T var1) {
      if (var1 instanceof cG_2) {
         String var2 = ((cG_2)var1).id_break();
         ql_3 var3 = this.id_private.get(var2);
         return var3 != null ? var3 : this.id_implements;
      } else {
         return this.id_catch.get(var1.BC());
      }
   }

   private <T extends an_3> void id_class(aI_2<T> var1, pV_2<? super T> var2) {
      this.id_catch.put(var1, var2);
   }

   public void id_class() {
      for (aI_2 var2 : rVL.id_transient) {
         if (var2 != aI_2.rM && !this.id_catch.containsKey(var2)) {
            throw new IllegalStateException("No renderer registered for " + rVL.id_transient.id_break(var2));
         }
      }
   }

   private void id_class(Hz_1 var1, rAv_1 var2) {
      this.id_class(aI_2.id_class, new pz_3(this));
      this.id_class(aI_2.id_break, new pQ_2(this));
      this.id_class(aI_2.id_byte, new qi_3(this));
      this.id_class(aI_2.id_protected, new pc_3(this));
      this.id_class(aI_2.id_throws, new pu_3(this));
      this.id_class(aI_2.id_case, new pZ_2(this));
      this.id_class(aI_2.id_catch, new pv_3(this));
      this.id_class(aI_2.id_private, new pF_2(this));
      this.id_class(aI_2.id_implements, new pL_2(this));
      this.id_class(aI_2.r, new qN_2<>(this));
      this.id_class(aI_2.id_finally, new pn_3(this));
      this.id_class(aI_2.id_extends, new pC_2(this));
      this.id_class(aI_2.P, new qN_2<>(this));
      this.id_class(aI_2.id_native, new pl_3(this));
      this.id_class(aI_2.id_volatile, new pH_2(this));
      this.id_class(aI_2.id_final, new py_3(this));
      this.id_class(aI_2.id_package, new pA_2<>(this, 0.87F));
      this.id_class(aI_2.id_int, new pp_3(this));
      this.id_class(aI_2.id_new, new pq_3(this));
      this.id_class(aI_2.I, new qo_3<>(this, var1));
      this.id_class(aI_2.id_continue, new pT_2(this));
      this.id_class(aI_2.id_super, new pt_3(this));
      this.id_class(aI_2.id_this, new pw_3(this));
      this.id_class(aI_2.id_else, new pf_3(this));
      this.id_class(aI_2.id_synchronized, new pj_3(this));
      this.id_class(aI_2.f, new qo_3<>(this, var1));
      this.id_class(aI_2.id_public, new pR_2(this));
      this.id_class(aI_2.id_return, new pY_2<>(this));
      this.id_class(aI_2.j, new qo_3<>(this, var1));
      this.id_class(aI_2.id_goto, new pK_2(this));
      this.id_class(aI_2.id_while, new qo_3<>(this, var1, 1.0F, true));
      this.id_class(aI_2.id_try, new pD_2(this));
      this.id_class(aI_2.id_const, new qo_3<>(this, var1, 3.0F, true));
      this.id_class(aI_2.id_instanceof, new pU_2(this, var1));
      this.id_class(aI_2.rO, new pe_3(this));
      this.id_class(aI_2.id_throw, new pa_3(this));
      this.id_class(aI_2.B, new qN_2<>(this));
      this.id_class(aI_2.id_interface, new pi_3(this));
      this.id_class(aI_2.id_char, new qr_3(this, 6.0F));
      this.id_class(aI_2.id_abstract, new qP_2(this));
      this.id_class(aI_2.id_long, new qB_2(this));
      this.id_class(aI_2.S, new qN_2<>(this));
      this.id_class(aI_2.id_float, new qS_2(this));
      this.id_class(aI_2.id_void, new qs_3(this));
      this.id_class(aI_2.id_static, new qb_3(this));
      this.id_class(aI_2.id_import, new qO_2(this));
      this.id_class(aI_2.id_short, new qX_2(this, var1));
      this.id_class(aI_2.id_default, new qh_3(this, var1));
      this.id_class(aI_2.id_strictfp, new qJ_2(this));
      this.id_class(aI_2.id_boolean, new qx_3(this));
      this.id_class(aI_2.id_transient, new qW_2(this));
      this.id_class(aI_2.id_for, new qz_3(this));
      this.id_class(aI_2.id_double, new qQ_2(this));
      this.id_class(aI_2.id_switch, new qN_2<>(this));
      this.id_class(aI_2.b, new qu_3(this));
      this.id_class(aI_2.G, new pA_2<>(this, 0.92F));
      this.id_class(aI_2.M, new qm_3(this));
      this.id_class(aI_2.O, new qZ_2(this));
      this.id_class(aI_2.h, new qv_3(this));
      this.id_class(aI_2.X, new qF_2(this));
      this.id_class(aI_2.J, new qL_2(this));
      this.id_class(aI_2.x, new qA_2(this));
      this.id_class(aI_2.d, new qn_3(this, false));
      this.id_class(aI_2.k, new qn_3(this, false));
      this.id_class(aI_2.W, new qC_2(this));
      this.id_class(aI_2.z, new qH_2(this));
      this.id_class(aI_2.V, new qo_3<>(this, var1));
      this.id_class(aI_2.N, new qy_3(this));
      this.id_class(aI_2.c, new qp_3(this));
      this.id_class(aI_2.u, new qq_3(this));
      this.id_class(aI_2.m, new qT_2(this));
      this.id_class(aI_2.Z, new qt_3(this));
      this.id_class(aI_2.F, new qw_3(this));
      this.id_class(aI_2.v, new qI_2(this));
      this.id_class(aI_2.L, new qf_3(this));
      this.id_class(aI_2.n, new TS(this));
      this.id_class(aI_2.A, new qj_3(this));
      this.id_class(aI_2.C, new qV_2(this));
      this.id_class(aI_2.l, new qo_3<>(this, var1, 0.75F, true));
      this.id_class(aI_2.y, new qo_3<>(this, var1));
      this.id_class(aI_2.H, new qg_3(this));
      this.id_class(aI_2.s, new qN_2<>(this));
      this.id_class(aI_2.p, new qR_2(this));
      this.id_class(aI_2.q, new qY_2<>(this));
      this.id_class(aI_2.T, new qK_2(this));
      this.id_class(aI_2.t, new qD_2(this));
      this.id_class(aI_2.E, new qe_3(this));
      this.id_class(aI_2.Q, new qa_3(this));
      this.id_class(aI_2.R, new qW_2(this));
      this.id_class(aI_2.g, new Tr_1(this));
      this.id_class(aI_2.Y, new TP(this));
      this.id_class(aI_2.o, new TB(this));
      this.id_class(aI_2.K, new Ts_1(this));
      this.id_class(aI_2.D, new TE(this, var2));
      this.id_class(aI_2.U, new TG(this));
      this.id_class(aI_2.e, new TM(this));
      this.id_class(aI_2.a, new TO(this));
      this.id_class(aI_2.i, new Th_1(this));
      this.id_class(aI_2.rr, new TX(this));
      this.id_class(aI_2.rP, new TJ(this));
      this.id_class(aI_2.rB, new Tx_1(this));
      this.id_class(aI_2.rS, new Td_1(this));
      this.id_class(aI_2.rE, new TS(this));
      this.id_class(aI_2.rs, new Tk_1(this));
      this.id_class(aI_2.rb, new qn_3(this, true));
      this.id_class(aI_2.rG, new TW(this, var2));
      this.id_class(aI_2.w, new qU_2(this));
   }

   public <E extends an_3> boolean id_class(E var1, yt_3 var2, double var3, double var5, double var7) {
      pV_2 var9 = this.id_class(var1);
      return var9.id_class(var1, var2, var3, var5, var7);
   }

   public <E extends an_3> void id_class(E var1, double var2, double var4, double var6, float var8, float var9, Ml_1 var10, Hx_1 var11, int var12) {
      if (this.id_break != null && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_class(var1)) {
         pV_2 var13 = this.id_class(var1);

         try {
            rjU_2 var14 = var13.id_class(var1, var9);
            double var25 = var2 + var14.id_class();
            double var26 = var4 + var14.id_break();
            double var19 = var6 + var14.id_byte();
            var10.id_class();
            var10.id_class(var25, var26, var19);
            if (rrMo_1.id_break()) {
               this.id_throws = var13;
            }

            if (rrbY_2.id_class()) {
               rrbY_2.id_byte();
            }

            var13.id_class(var1, var8, var9, var10, var11, var12);
            if (rrbY_2.id_class()) {
               if (rrbY_2.id_protected()) {
                  rrbY_2.id_throws();
                  var13.id_class(var1, var8, var9, var10, var11, HQ.id_class);
                  rrbY_2.id_catch();
               }

               rrbY_2.id_private();
            }

            if (var1.T()) {
               this.id_class(var10, var11, var1);
            }

            var10.id_class(-var14.id_class(), -var14.id_break(), -var14.id_byte());
            if (this.id_protected.id_boolean && this.id_volatile && var13.id_byte > 0.0F && !var1.Pp()) {
               double var21 = this.id_class(var1.rx(), var1.re(), var1.BO());
               float var23 = (float)((1.0 - var21 / 256.0) * (double)var13.id_protected);
               if (var23 > 0.0F) {
                  id_class(var10, var11, var1, var23, var9, this.id_extends, var13.id_byte);
               }
            }

            Ok_1 var27 = var11.getBuffer(HU.id_return());
            if (this.id_final && !QY.id_instanceof().E()) {
               this.id_class(var10, var27, var1, var9);
            }

            if (var1 == (cb_3)QY.id_instanceof().id_class[57]) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .id_finally()
                  .id_class(rrnr_3.id_class(var10, var27, (cb_3)QY.id_instanceof().id_class[57], var9, (float)var25, (float)var26, (float)var19));
            }

            var10.id_break();
         } catch (Throwable var24) {
            KY var15 = KY.id_class(var24, "Rendering entity in world");
            Ko_1 var16 = var15.id_class("Entity being rendered");
            var1.id_class(var16);
            Ko_1 var17 = var15.id_class("Renderer details");
            var17.id_class("Assigned renderer", var13);
            var17.id_class("Location", Ko_1.id_class(var2, var4, var6));
            var17.id_class("Rotation", var8);
            var17.id_class("Delta", var9);
            throw new KU(var15);
         }
      }
   }

   public void id_class(boolean var1) {
      this.id_volatile = var1;
   }

   public double id_break(an_3 var1) {
      return this.id_break.id_break().id_implements(var1.Ps());
   }

   public boolean id_break() {
      return this.id_final;
   }

   public void id_break(boolean var1) {
      this.id_final = var1;
   }

   public Map<aI_2, pV_2> id_throws() {
      return this.id_catch;
   }

   public double id_catch() {
      return this.id_break != null && this.id_break.id_break() != null ? this.id_break.id_break().id_byte : 0.0;
   }

   public double id_case() {
      return this.id_break != null && this.id_break.id_break() != null ? this.id_break.id_break().id_break : 0.0;
   }

   public cm_3 id_protected() {
      return this.id_finally;
   }

   public double id_private() {
      return this.id_break != null && this.id_break.id_break() != null ? this.id_break.id_break().id_protected : 0.0;
   }
}
