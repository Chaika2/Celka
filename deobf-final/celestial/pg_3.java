package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class pg_3 {
   private static final HU case_ = HU.native_(new rqO_2("textures/misc/shadow.png"));
   private final Map<aI_2, pV_2> catch_ = Maps.newHashMap();
   private final Map<String, ql_3> private_ = Maps.newHashMap();
   private final ql_3 implements_;
   private final cm_3 finally_;
   public final fY_2 class_;
   private rYB extends_;
   public ly_3 break_;
   private rjY_2 native_;
   public an_3 byte_;
   public final Qw_1 protected_;
   private boolean volatile_ = true;
   private boolean final_;
   public pV_2 throws_ = null;

   public rjY_2 byte_() {
      return this.native_;
   }

   public pg_3(fY_2 var1, Hz_1 var2, rAv_1 var3, cm_3 var4, Qw_1 var5) {
      this.class_ = var1;
      this.finally_ = var4;
      this.protected_ = var5;
      this.class_(var2, var3);
      this.implements_ = new ql_3(this);
      this.private_.put("id_default", this.implements_);
      this.private_.put("slim", new ql_3(this, true));
   }

   private static void class_(Ml_1 var0, Hx_1 var1, an_3 var2, float var3, float var4, rRR var5, float var6) {
      if (!rrbb_3.rs() || !rrdZ.BJ) {
         float var7 = var6;
         if (var2 instanceof is_3 var8 && var8.n_()) {
            var7 = var6 * 0.5F;
         }

         double var24 = rfU_2.protected_((double)var4, (Double)var2.throws_[34], var2.rx());
         double var10 = rfU_2.protected_((double)var4, (Double)var2.throws_[35], var2.re());
         double var12 = rfU_2.protected_((double)var4, (Double)var2.throws_[36], var2.BO());
         int var14 = rfU_2.byte_(var24 - (double)var7);
         int var15 = rfU_2.byte_(var24 + (double)var7);
         int var16 = rfU_2.byte_(var10 - (double)var7);
         int var17 = rfU_2.byte_(var10);
         int var18 = rfU_2.byte_(var12 - (double)var7);
         int var19 = rfU_2.byte_(var12 + (double)var7);
         MH var20 = var0.byte_();
         Ok_1 var21 = var1.getBuffer(case_);

         for (rfH_2 var23 : rfH_2.class_(new rfH_2(var14, var16, var18), new rfH_2(var15, var17, var19))) {
            class_(var20, var21, var5, var23, var24, var10, var12, var7, var3);
         }
      }
   }

   private static void class_(MH var0, Ok_1 var1, float var2, float var3, float var4, float var5, float var6) {
      var1.class_(var0.class_(), var2, var3, var4)
         .break_(255, 255, 255, 255)
         .class_(var5, var6)
         .break_(0, 10)
         .break_(240)
         .class_(var0.break_(), 0.0F, 1.0F, 0.0F)
         .class_();
   }

   private void class_(Ml_1 var1, Hx_1 var2, an_3 var3) {
      fj_3 var4 = IC.class_.byte_();
      fj_3 var5 = IC.break_.byte_();
      var1.class_();
      float var6 = var3.PN() * 1.4F;
      var1.class_(var6, var6, var6);
      float var7 = 0.5F;
      float var8 = var3.Bm() / var6;
      float var9 = 0.0F;
      var1.class_(rje_3.protected_.byte_(-this.break_.throws_()));
      var1.class_(0.0, 0.0, (double)(-0.3F + (float)((int)var8) * 0.02F));
      float var10 = 0.0F;
      int var11 = 0;
      Ok_1 var12 = var2.getBuffer(lp_3.private_());
      if (rrbb_3.w()) {
         var12.class_(true);
      }

      for (MH var13 = var1.byte_(); var8 > 0.0F; var11++) {
         fj_3 var14 = var11 % 2 == 0 ? var4 : var5;
         var12.break_(var14);
         float var15 = var14.case_();
         float var16 = var14.private_();
         float var17 = var14.catch_();
         float var18 = var14.implements_();
         if (var11 / 2 % 2 == 0) {
            float var19 = var17;
            var17 = var15;
            var15 = var19;
         }

         class_(var13, var12, var7 - 0.0F, 0.0F - var9, var10, var17, var18);
         class_(var13, var12, -var7 - 0.0F, 0.0F - var9, var10, var15, var18);
         class_(var13, var12, -var7 - 0.0F, 1.4F - var9, var10, var15, var16);
         class_(var13, var12, var7 - 0.0F, 1.4F - var9, var10, var17, var16);
         var8 -= 0.45F;
         var9 -= 0.45F;
         var7 *= 0.9F;
         var10 += 0.03F;
      }

      var1.break_();
   }

   private void class_(Ml_1 var1, Ok_1 var2, an_3 var3, float var4, float var5, float var6) {
      rfl_3 var7 = var3.rN();
      if (var3 instanceof iB_2 var8) {
         var7 = var7.class_((double)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnJ_2.class_(var8, 0.0F)).break_());
      }

      rfl_3 var9 = var7.protected_(-var3.rx(), -var3.re(), -var3.BO());
      yX_2.class_(var1, var2, var9, var4, var5, var6, 1.0F);
   }

   private void class_(Ml_1 var1, Ok_1 var2, an_3 var3, float var4) {
      if (!rrdZ.new_) {
         float var5 = var3.PN() / 2.0F;
         this.class_(var1, var2, var3, 1.0F, 1.0F, 1.0F);
         boolean var6 = var3 instanceof rSu_1;
         if (rrxr_3.l.byte_() && rrxr_3.C.byte_()) {
            var6 = rrxr_3.break_(var3, rrxr_3.l);
         }

         if (var6) {
            double var7 = -rfU_2.protected_((double)var4, (Double)var3.throws_[34], var3.rx());
            double var9 = -rfU_2.protected_((double)var4, (Double)var3.throws_[35], var3.re());
            double var11 = -rfU_2.protected_((double)var4, (Double)var3.throws_[36], var3.BO());
            Object var13 = rrxr_3.C.byte_() ? (an_3[])rrxr_3.private_(var3, rrxr_3.C) : ((rSu_1)var3).implements_();

            for (Object var17 : var13) {
               var1.class_();
               double var18 = var7 + rfU_2.protected_((double)var4, (Double)((an_3)var17).throws_[34], ((an_3)var17).rx());
               double var20 = var9 + rfU_2.protected_((double)var4, (Double)((an_3)var17).throws_[35], ((an_3)var17).re());
               double var22 = var11 + rfU_2.protected_((double)var4, (Double)((an_3)var17).throws_[36], ((an_3)var17).BO());
               var1.class_(var18, var20, var22);
               this.class_(var1, var2, (an_3)var17, 0.25F, 1.0F, 0.0F);
               var1.break_();
            }
         }

         if (var3 instanceof iB_2) {
            yX_2.class_(
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

         rjU_2 var24 = var3.break_(var4);
         rjV_2 var8 = var1.byte_().class_();
         var2.class_(var8, 0.0F, var3.Bx(), 0.0F).break_(0, 0, 255, 255).class_();
         var2.class_(var8, (float)(var24.break_ * 2.0), (float)((double)var3.Bx() + var24.byte_ * 2.0), (float)(var24.protected_ * 2.0))
            .break_(0, 0, 255, 255)
            .class_();
      }
   }

   public <E extends an_3> int class_(E var1, float var2) {
      int var3 = this.class_(var1).break_(var1, var2);
      if (rrbb_3.rL()) {
         var3 = rrbg_3.class_(var1, var3);
      }

      return var3;
   }

   public double class_(double var1, double var3, double var5) {
      return this.break_.break_().protected_(var1, var3, var5);
   }

   public void class_(rYB var1) {
      this.extends_ = var1;
      if (var1 == null) {
         this.break_ = null;
      }
   }

   private static void class_(MH var0, Ok_1 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.class_(var0.class_(), var3, var4, var5)
         .class_(1.0F, 1.0F, 1.0F, var2)
         .class_(var6, var7)
         .byte_(fZ_2.class_)
         .break_(15728880)
         .class_(var0.break_(), 0.0F, 1.0F, 0.0F)
         .class_();
   }

   private static void class_(MH var0, Ok_1 var1, rRR var2, rfH_2 var3, double var4, double var6, double var8, float var10, float var11) {
      rfH_2 var12 = var3.break_();
      xc_3 var13 = var2.byte_(var12);
      if (var13.private_() != xN_2.INVISIBLE && var2.package_(var3) > 3 && var13.new_(var2, var12)) {
         rjC_2 var14 = var13.finally_(var2, var3.break_());
         if (!var14.break_()) {
            float var15 = (float)(((double)var11 - (var6 - (double)var3.c_()) / 2.0) * 0.5 * (double)var2.native_(var3));
            if (var15 >= 0.0F) {
               if (var15 > 1.0F) {
                  var15 = 1.0F;
               }

               rfl_3 var16 = var14.class_();
               double var17 = (double)var3.b_() + var16.class_;
               double var19 = (double)var3.b_() + var16.protected_;
               double var21 = (double)var3.c_() + var16.break_ + 0.001;
               double var23 = (double)var3.d_() + var16.byte_;
               double var25 = (double)var3.d_() + var16.case_;
               float var27 = (float)(var17 - var4);
               float var28 = (float)(var19 - var4);
               float var29 = (float)(var21 - var6);
               float var30 = (float)(var23 - var8);
               float var31 = (float)(var25 - var8);
               float var32 = -var27 / 2.0F / var10 + 0.5F;
               float var33 = -var28 / 2.0F / var10 + 0.5F;
               float var34 = -var30 / 2.0F / var10 + 0.5F;
               float var35 = -var31 / 2.0F / var10 + 0.5F;
               class_(var0, var1, var15, var27, var29, var30, var32, var34);
               class_(var0, var1, var15, var27, var29, var31, var32, var35);
               class_(var0, var1, var15, var28, var29, var31, var33, var35);
               class_(var0, var1, var15, var28, var29, var30, var33, var34);
            }
         }
      }
   }

   public void class_(rjY_2 var1) {
      this.native_ = var1;
   }

   public void class_(rYB var1, ly_3 var2, an_3 var3) {
      this.extends_ = var1;
      this.break_ = var2;
      this.native_ = var2.case_();
      this.byte_ = var3;
   }

   public <T extends an_3> pV_2<? super T> class_(T var1) {
      if (var1 instanceof cG_2) {
         String var2 = ((cG_2)var1).break_();
         ql_3 var3 = this.private_.get(var2);
         return var3 != null ? var3 : this.implements_;
      } else {
         return this.catch_.get(var1.BC());
      }
   }

   private <T extends an_3> void class_(aI_2<T> var1, pV_2<? super T> var2) {
      this.catch_.put(var1, var2);
   }

   public void class_() {
      for (aI_2 var2 : rVL.transient_) {
         if (var2 != aI_2.rM && !this.catch_.containsKey(var2)) {
            throw new IllegalStateException("No renderer registered for " + rVL.transient_.break_(var2));
         }
      }
   }

   private void class_(Hz_1 var1, rAv_1 var2) {
      this.class_(aI_2.class_, new pz_3(this));
      this.class_(aI_2.break_, new pQ_2(this));
      this.class_(aI_2.byte_, new qi_3(this));
      this.class_(aI_2.protected_, new pc_3(this));
      this.class_(aI_2.throws_, new pu_3(this));
      this.class_(aI_2.case_, new pZ_2(this));
      this.class_(aI_2.catch_, new pv_3(this));
      this.class_(aI_2.private_, new pF_2(this));
      this.class_(aI_2.implements_, new pL_2(this));
      this.class_(aI_2.r, new qN_2<>(this));
      this.class_(aI_2.finally_, new pn_3(this));
      this.class_(aI_2.extends_, new pC_2(this));
      this.class_(aI_2.P, new qN_2<>(this));
      this.class_(aI_2.native_, new pl_3(this));
      this.class_(aI_2.volatile_, new pH_2(this));
      this.class_(aI_2.final_, new py_3(this));
      this.class_(aI_2.package_, new pA_2<>(this, 0.87F));
      this.class_(aI_2.int_, new pp_3(this));
      this.class_(aI_2.new_, new pq_3(this));
      this.class_(aI_2.I, new qo_3<>(this, var1));
      this.class_(aI_2.continue_, new pT_2(this));
      this.class_(aI_2.super_, new pt_3(this));
      this.class_(aI_2.this_, new pw_3(this));
      this.class_(aI_2.else_, new pf_3(this));
      this.class_(aI_2.synchronized_, new pj_3(this));
      this.class_(aI_2.f, new qo_3<>(this, var1));
      this.class_(aI_2.public_, new pR_2(this));
      this.class_(aI_2.return_, new pY_2<>(this));
      this.class_(aI_2.j, new qo_3<>(this, var1));
      this.class_(aI_2.goto_, new pK_2(this));
      this.class_(aI_2.while_, new qo_3<>(this, var1, 1.0F, true));
      this.class_(aI_2.try_, new pD_2(this));
      this.class_(aI_2.const_, new qo_3<>(this, var1, 3.0F, true));
      this.class_(aI_2.instanceof_, new pU_2(this, var1));
      this.class_(aI_2.rO, new pe_3(this));
      this.class_(aI_2.throw_, new pa_3(this));
      this.class_(aI_2.B, new qN_2<>(this));
      this.class_(aI_2.interface_, new pi_3(this));
      this.class_(aI_2.char_, new qr_3(this, 6.0F));
      this.class_(aI_2.abstract_, new qP_2(this));
      this.class_(aI_2.long_, new qB_2(this));
      this.class_(aI_2.S, new qN_2<>(this));
      this.class_(aI_2.float_, new qS_2(this));
      this.class_(aI_2.void_, new qs_3(this));
      this.class_(aI_2.static_, new qb_3(this));
      this.class_(aI_2.import_, new qO_2(this));
      this.class_(aI_2.short_, new qX_2(this, var1));
      this.class_(aI_2.default_, new qh_3(this, var1));
      this.class_(aI_2.strictfp_, new qJ_2(this));
      this.class_(aI_2.boolean_, new qx_3(this));
      this.class_(aI_2.transient_, new qW_2(this));
      this.class_(aI_2.for_, new qz_3(this));
      this.class_(aI_2.double_, new qQ_2(this));
      this.class_(aI_2.switch_, new qN_2<>(this));
      this.class_(aI_2.b, new qu_3(this));
      this.class_(aI_2.G, new pA_2<>(this, 0.92F));
      this.class_(aI_2.M, new qm_3(this));
      this.class_(aI_2.O, new qZ_2(this));
      this.class_(aI_2.h, new qv_3(this));
      this.class_(aI_2.X, new qF_2(this));
      this.class_(aI_2.J, new qL_2(this));
      this.class_(aI_2.x, new qA_2(this));
      this.class_(aI_2.d, new qn_3(this, false));
      this.class_(aI_2.k, new qn_3(this, false));
      this.class_(aI_2.W, new qC_2(this));
      this.class_(aI_2.z, new qH_2(this));
      this.class_(aI_2.V, new qo_3<>(this, var1));
      this.class_(aI_2.N, new qy_3(this));
      this.class_(aI_2.c, new qp_3(this));
      this.class_(aI_2.u, new qq_3(this));
      this.class_(aI_2.m, new qT_2(this));
      this.class_(aI_2.Z, new qt_3(this));
      this.class_(aI_2.F, new qw_3(this));
      this.class_(aI_2.v, new qI_2(this));
      this.class_(aI_2.L, new qf_3(this));
      this.class_(aI_2.n, new TS(this));
      this.class_(aI_2.A, new qj_3(this));
      this.class_(aI_2.C, new qV_2(this));
      this.class_(aI_2.l, new qo_3<>(this, var1, 0.75F, true));
      this.class_(aI_2.y, new qo_3<>(this, var1));
      this.class_(aI_2.H, new qg_3(this));
      this.class_(aI_2.s, new qN_2<>(this));
      this.class_(aI_2.p, new qR_2(this));
      this.class_(aI_2.q, new qY_2<>(this));
      this.class_(aI_2.T, new qK_2(this));
      this.class_(aI_2.t, new qD_2(this));
      this.class_(aI_2.E, new qe_3(this));
      this.class_(aI_2.Q, new qa_3(this));
      this.class_(aI_2.R, new qW_2(this));
      this.class_(aI_2.g, new Tr_1(this));
      this.class_(aI_2.Y, new TP(this));
      this.class_(aI_2.o, new TB(this));
      this.class_(aI_2.K, new Ts_1(this));
      this.class_(aI_2.D, new TE(this, var2));
      this.class_(aI_2.U, new TG(this));
      this.class_(aI_2.e, new TM(this));
      this.class_(aI_2.a, new TO(this));
      this.class_(aI_2.i, new Th_1(this));
      this.class_(aI_2.rr, new TX(this));
      this.class_(aI_2.rP, new TJ(this));
      this.class_(aI_2.rB, new Tx_1(this));
      this.class_(aI_2.rS, new Td_1(this));
      this.class_(aI_2.rE, new TS(this));
      this.class_(aI_2.rs, new Tk_1(this));
      this.class_(aI_2.rb, new qn_3(this, true));
      this.class_(aI_2.rG, new TW(this, var2));
      this.class_(aI_2.w, new qU_2(this));
   }

   public <E extends an_3> boolean class_(E var1, yt_3 var2, double var3, double var5, double var7) {
      pV_2 var9 = this.class_(var1);
      return var9.class_(var1, var2, var3, var5, var7);
   }

   public <E extends an_3> void class_(E var1, double var2, double var4, double var6, float var8, float var9, Ml_1 var10, Hx_1 var11, int var12) {
      if (this.break_ != null && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().h().class_(var1)) {
         pV_2 var13 = this.class_(var1);

         try {
            rjU_2 var14 = var13.class_(var1, var9);
            double var25 = var2 + var14.class_();
            double var26 = var4 + var14.break_();
            double var19 = var6 + var14.byte_();
            var10.class_();
            var10.class_(var25, var26, var19);
            if (rrMo_1.break_()) {
               this.throws_ = var13;
            }

            if (rrbY_2.class_()) {
               rrbY_2.byte_();
            }

            var13.class_(var1, var8, var9, var10, var11, var12);
            if (rrbY_2.class_()) {
               if (rrbY_2.protected_()) {
                  rrbY_2.throws_();
                  var13.class_(var1, var8, var9, var10, var11, HQ.class_);
                  rrbY_2.catch_();
               }

               rrbY_2.private_();
            }

            if (var1.T()) {
               this.class_(var10, var11, var1);
            }

            var10.class_(-var14.class_(), -var14.break_(), -var14.byte_());
            if (this.protected_.boolean_ && this.volatile_ && var13.byte_ > 0.0F && !var1.Pp()) {
               double var21 = this.class_(var1.rx(), var1.re(), var1.BO());
               float var23 = (float)((1.0 - var21 / 256.0) * (double)var13.protected_);
               if (var23 > 0.0F) {
                  class_(var10, var11, var1, var23, var9, this.extends_, var13.byte_);
               }
            }

            Ok_1 var27 = var11.getBuffer(HU.return_());
            if (this.final_ && !QY.instanceof_().E()) {
               this.class_(var10, var27, var1, var9);
            }

            if (var1 == (cb_3)QY.instanceof_().class_[57]) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .finally_()
                  .class_(rrnr_3.class_(var10, var27, (cb_3)QY.instanceof_().class_[57], var9, (float)var25, (float)var26, (float)var19));
            }

            var10.break_();
         } catch (Throwable var24) {
            KY var15 = KY.class_(var24, "Rendering entity in world");
            Ko_1 var16 = var15.class_("Entity being rendered");
            var1.class_(var16);
            Ko_1 var17 = var15.class_("Renderer details");
            var17.class_("Assigned renderer", var13);
            var17.class_("Location", Ko_1.class_(var2, var4, var6));
            var17.class_("Rotation", var8);
            var17.class_("Delta", var9);
            throw new KU(var15);
         }
      }
   }

   public void class_(boolean var1) {
      this.volatile_ = var1;
   }

   public double break_(an_3 var1) {
      return this.break_.break_().implements_(var1.Ps());
   }

   public boolean break_() {
      return this.final_;
   }

   public void break_(boolean var1) {
      this.final_ = var1;
   }

   public Map<aI_2, pV_2> throws_() {
      return this.catch_;
   }

   public double catch_() {
      return this.break_ != null && this.break_.break_() != null ? this.break_.break_().byte_ : 0.0;
   }

   public double case_() {
      return this.break_ != null && this.break_.break_() != null ? this.break_.break_().break_ : 0.0;
   }

   public cm_3 protected_() {
      return this.finally_;
   }

   public double private_() {
      return this.break_ != null && this.break_.break_() != null ? this.break_.break_().protected_ : 0.0;
   }
}
