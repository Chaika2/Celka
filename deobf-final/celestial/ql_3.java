package celestial;

public class ql_3 extends qd_3<cG_2, wh_3<cG_2>> {
   public ql_3(pg_3 var1) {
      this(var1, false);
   }

   public ql_3(pg_3 var1, boolean var2) {
      super(var1, new wh_3<>(0.0F, var2), 0.5F);
      this.class_(new Tc_1<>(this, new tW_2(0.5F), new tW_2(1.0F)));
      this.class_(new TT<>(this));
      this.class_(new TL(this));
      this.class_(new rruM(this));
      this.class_(new Tp_1<>(this));
      this.class_(new TC<>(this));
      this.class_(new TY<>(this));
      this.class_(new tr_3<>(this));
      this.class_(new TN<>(this));
   }

   protected void class_(cG_2 var1, Ml_1 var2, float var3, float var4, float var5) {
      float var6 = var1.synchronized_(var5);
      float var7 = (Float)var1.throws_[16];
      if (var1.Sy()) {
         super.class_(var1, var2, var3, var4, var5);
         float var8 = (float)var1.BD() + var5;
         float var9 = rfU_2.class_(var8 * var8 / 100.0F, 0.0F, 1.0F);
         if (!var1.Sz()) {
            var2.class_(rje_3.break_.byte_(var9 * (-90.0F - var7)));
         }

         rjU_2 var10 = var1.break_(var5);
         rjU_2 var11 = var1.rv();
         double var12 = an_3.case_(var11);
         double var14 = an_3.case_(var10);
         if (var12 > 0.0 && var14 > 0.0) {
            double var16 = (var11.break_ * var10.break_ + var11.protected_ * var10.protected_) / Math.sqrt(var12 * var14);
            double var18 = var11.break_ * var10.protected_ - var11.protected_ * var10.break_;
            var2.class_(rje_3.protected_.break_((float)(Math.signum(var18) * Math.acos(var16))));
         }
      } else if (var6 > 0.0F) {
         super.class_(var1, var2, var3, var4, var5);
         float var20 = var1.rT() ? -90.0F - var7 : -90.0F;
         float var21 = rfU_2.catch_(var6, 0.0F, var20);
         var2.class_(rje_3.break_.byte_(var21));
         if (var1.rP()) {
            var2.class_(0.0, -1.0, 0.3F);
         }
      } else {
         super.class_(var1, var2, var3, var4, var5);
      }
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, Iq_1 var5, Iq_1 var6) {
      wh_3 var7 = this.class_();
      this.break_(var4);
      var7.final_ = 0.0F;
      var7.finally_ = false;
      var7.extends_ = 0.0F;
      var7.class_(var4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      var5.case_ = 0.0F;
      if (var4.Pp()) {
         var5.class_(var1, var2.getBuffer(HU.private_(var4.final_())), var3, fZ_2.class_, 0.5F);
      } else {
         var5.class_(var1, var2.getBuffer(HU.break_(var4.final_())), var3, fZ_2.class_);
      }

      var6.case_ = 0.0F;
      var6.class_(var1, var2.getBuffer(HU.private_(var4.final_())), var3, fZ_2.class_);
   }

   public rqO_2 class_(cG_2 var1) {
      return var1.final_();
   }

   private static tQ_2 class_(cG_2 var0, rpm_3 var1) {
      rdn_3 var2 = var0.protected_(var1);
      if (var2.class_()) {
         return tQ_2.EMPTY;
      } else {
         if (var0.P() == var1 && var0.SH() > 0) {
            rkc_3 var3 = var2.native_();
            if (var3 == rkc_3.BLOCK) {
               return tQ_2.BLOCK;
            }

            if (var3 == rkc_3.BOW) {
               return tQ_2.BOW_AND_ARROW;
            }

            if (var3 == rkc_3.SPEAR) {
               return tQ_2.THROW_SPEAR;
            }

            if (var3 == rkc_3.CROSSBOW && var1 == var0.P()) {
               return tQ_2.CROSSBOW_CHARGE;
            }
         } else if (!(Boolean)var0.private_[5] && var2.break_() == rdy_3.kU && rxm_3.protected_(var2)) {
            return tQ_2.CROSSBOW_HOLD;
         }

         return tQ_2.ITEM;
      }
   }

   public rjU_2 class_(cG_2 var1, float var2) {
      return var1.x() ? new rjU_2(0.0, -0.125, 0.0) : super.class_(var1, var2);
   }

   public void class_(cG_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      this.break_(var1);
      super.class_((cG_2)var1, var2, var3, var4, var5, var6);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4) {
      this.class_(var1, var2, var3, var4, this.throws_.protected_, this.throws_.continue_);
   }

   protected void class_(cG_2 var1, rgP_2 var2, Ml_1 var3, Hx_1 var4, int var5) {
      double var6 = this.break_.break_(var1);
      var3.class_();
      if (var6 < 100.0) {
         rns_3 var8 = var1.st();
         rnP_2 var9 = var8.class_(2);
         if (var9 != null) {
            rAa_1 var10 = var8.break_(var1.i(), var9);
            super.class_(var1, new rgN_2(Integer.toString(var10.break_())).break_(" ").class_(var9.protected_()), var3, var4, var5);
            var3.class_(0.0, 0.25875F, 0.0);
         }
      }

      super.class_(var1, var2, var3, var4, var5);
      var3.break_();
   }

   protected void class_(cG_2 var1, Ml_1 var2, float var3) {
      float var4 = 0.9375F;
      var2.class_(0.9375F, 0.9375F, 0.9375F);
   }

   private void break_(cG_2 var1) {
      wh_3 var2 = this.class_();
      if (var1.native_()) {
         var2.b_(false);
         var2.class_.finally_ = true;
         var2.break_.finally_ = true;
      } else {
         var2.b_(true);
         var2.break_.finally_ = var1.class_(rhQ_2.HAT);
         var2.else_.finally_ = var1.class_(rhQ_2.JACKET);
         var2.super_.finally_ = var1.class_(rhQ_2.LEFT_PANTS_LEG);
         var2.this_.finally_ = var1.class_(rhQ_2.RIGHT_PANTS_LEG);
         var2.new_.finally_ = var1.class_(rhQ_2.LEFT_SLEEVE);
         var2.continue_.finally_ = var1.class_(rhQ_2.RIGHT_SLEEVE);
         var2.finally_ = var1.x();
         tQ_2 var3 = class_(var1, rpm_3.MAIN_HAND);
         tQ_2 var4 = class_(var1, rpm_3.OFF_HAND);
         if (var3.class_()) {
            var4 = var1.Sn().class_() ? tQ_2.EMPTY : tQ_2.ITEM;
         }

         if (var1.Su() == rpZ_2.RIGHT) {
            var2.implements_ = var3;
            var2.private_ = var4;
         } else {
            var2.implements_ = var4;
            var2.private_ = var3;
         }
      }
   }

   public void break_(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4) {
      this.class_(var1, var2, var3, var4, this.throws_.throws_, this.throws_.new_);
   }
}
