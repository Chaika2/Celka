package celestial;

public class qh_3 extends pV_2<rsG_2> {
   private static final II class_ = new II("item_frame", "map=false");
   private static final II throws_ = new II("item_frame", "map=true");
   private final QY case_ = QY.instanceof_();
   private final Hz_1 catch_;
   private static double private_ = 4096.0;

   private boolean byte_(rsG_2 var1) {
      if (rrdZ.new_) {
         return false;
      } else {
         if (!rrbb_3.package_) {
            an_3 var2 = this.case_.catch_();
            double var3 = var1.class_(var2.rx(), var2.re(), var2.BO());
            if (var3 > private_) {
               return false;
            }
         }

         return true;
      }
   }

   public qh_3(pg_3 var1, Hz_1 var2) {
      super(var1);
      this.catch_ = var2;
   }

   public void class_(rsG_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.class_(var1, var2, var3, var4, var5, var6);
      var4.class_();
      rpr_3 var7 = var1.Pg();
      rjU_2 var8 = this.class_(var1, var3);
      var4.class_(-var8.class_(), -var8.break_(), -var8.byte_());
      double var9 = 0.46875;
      var4.class_((double)var7.implements_() * 0.46875, (double)var7.finally_() * 0.46875, (double)var7.extends_() * 0.46875);
      var4.class_(rje_3.break_.byte_((Float)var1.throws_[16]));
      var4.class_(rje_3.protected_.byte_(180.0F - (Float)var1.throws_[15]));
      boolean var11 = var1.Pp();
      if (!var11) {
         lo_3 var12 = this.case_.synchronized_();
         Ip_1 var13 = var12.break_().class_();
         II var14 = var1.final_().break_() instanceof rxI_2 ? throws_ : class_;
         var4.class_();
         var4.class_(-0.5, -0.5, -0.5);
         var12.byte_().class_(var4.byte_(), var5.getBuffer(lp_3.catch_()), (xc_3)null, var13.class_(var14), 1.0F, 1.0F, 1.0F, var6, fZ_2.class_);
         var4.break_();
      }

      rdn_3 var16 = var1.final_();
      if (!var16.class_()) {
         boolean var17 = var16.break_() instanceof rxI_2;
         if (var11) {
            var4.class_(0.0, 0.0, 0.5);
         } else {
            var4.class_(0.0, 0.0, 0.4375);
         }

         int var18 = var17 ? var1.package_() % 4 * 2 : var1.package_();
         var4.class_(rje_3.case_.byte_((float)var18 * 360.0F / 8.0F));
         if (var17) {
            var4.class_(rje_3.case_.byte_(180.0F));
            var4.class_(0.0078125F, 0.0078125F, 0.0078125F);
            var4.class_(-64.0, -64.0, 0.0);
            rrGb_1 var15 = rxI_2.break_(var16, (rYB)var1.throws_[7]);
            var4.class_(0.0, 0.0, -1.0);
            if (var15 != null) {
               ((Hh_1)this.case_.class_[16]).catch_().class_(var4, var5, var15, true, var6);
            }
         } else {
            var4.class_(0.5F, 0.5F, 0.5F);
            if (this.byte_(var1)) {
               this.catch_.class_(var16, IQ.FIXED, var6, fZ_2.class_, var4, var5);
            }
         }
      }

      var4.break_();
   }

   public rqO_2 class_(rsG_2 var1) {
      return fJ_2.class_;
   }

   protected void class_(rsG_2 var1, rgP_2 var2, Ml_1 var3, Hx_1 var4, int var5) {
      super.class_(var1, var1.final_().continue_(), var3, var4, var5);
   }

   public rjU_2 class_(rsG_2 var1, float var2) {
      return new rjU_2((double)((float)var1.Pg().implements_() * 0.3F), -0.25, (double)((float)var1.Pg().extends_() * 0.3F));
   }

   protected boolean break_(rsG_2 var1) {
      if (QY.public_() && !var1.final_().class_() && var1.final_().this_() && this.break_.byte_ == var1) {
         double var2 = this.break_.break_(var1);
         float var4 = var1.Pw() ? 32.0F : 64.0F;
         return var2 < (double)(var4 * var4);
      } else {
         return false;
      }
   }

   public static void throws_() {
      QY var0 = QY.instanceof_();
      double var1 = rrbb_3.class_(((Qw_1)var0.class_[20]).U, 1.0, 120.0);
      double var3 = Math.max(6.0 * (double)var0.else_().continue_() / var1, 16.0);
      private_ = var3 * var3;
   }
}
