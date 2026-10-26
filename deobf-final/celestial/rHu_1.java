package celestial;

public class rHu_1 extends rHK implements rHf_1, rHw_1 {
   private rqs_3<rdn_3> case_ = rqs_3.class_(27, rdn_3.break_);
   protected float class_;
   protected float break_;
   protected int byte_;
   private int catch_;

   protected rHu_1(ryW_2<?> var1) {
      super(var1);
   }

   public rHu_1() {
      this(ryW_2.break_);
   }

   private void class_(rqA_2 var1) {
      rCt_1 var2 = this.abstract_().byte_(xt_3.package_);
      if (var2 != rCt_1.LEFT) {
         double var3 = (double)this.native_.b_() + 0.5;
         double var5 = (double)this.native_.c_() + 0.5;
         double var7 = (double)this.native_.d_() + 0.5;
         if (var2 == rCt_1.RIGHT) {
            rpr_3 var9 = xt_3.implements_(this.abstract_());
            var3 += (double)var9.implements_() * 0.5;
            var7 += (double)var9.extends_() * 0.5;
         }

         this.extends_.class_((rhd_3)null, var3, var5, var7, var1, rqL_2.BLOCKS, 0.5F, this.extends_.int_.nextFloat() * 0.1F + 0.9F);
      }
   }

   public static void class_(rHu_1 var0, rHu_1 var1) {
      rqs_3 var2 = var0.ad_();
      var0.class_(var1.ad_());
      var1.class_(var2);
   }

   public static int class_(rYB var0, rHD var1, int var2, int var3, int var4) {
      int var5 = 0;
      float var6 = 5.0F;

      for (rhd_3 var8 : var0.class_(
         rhd_3.class,
         new rfl_3(
            (double)((float)var2 - 5.0F),
            (double)((float)var3 - 5.0F),
            (double)((float)var4 - 5.0F),
            (double)((float)(var2 + 1) + 5.0F),
            (double)((float)(var3 + 1) + 5.0F),
            (double)((float)(var4 + 1) + 5.0F)
         )
      )) {
         if ((rJr_1)var8.implements_[4] instanceof rXe_1) {
            rXu_1 var9 = ((rXe_1)((rJr_1)var8.implements_[4])).class_();
            if (var9 == var1 || var9 instanceof rXW && ((rXW)var9).class_(var1)) {
               var5++;
            }
         }
      }

      return var5;
   }

   public static int class_(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      if (var2.break_().protected_()) {
         ryO_2 var3 = var0.class_(var1);
         if (var3 instanceof rHu_1) {
            return ((rHu_1)var3).byte_;
         }
      }

      return 0;
   }

   @Override
   public float class_(float var1) {
      return rfU_2.catch_(var1, this.break_, this.class_);
   }

   @Override
   protected void class_(rqs_3<rdn_3> var1) {
      this.case_ = var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.case_ = rqs_3.class_(this.else_(), rdn_3.break_);
      if (!this.break_(var2)) {
         rXC.break_(var2, this.case_);
      }
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (!this.byte_(var1)) {
         rXC.class_(var1, this.case_);
      }

      return var1;
   }

   @Override
   protected rJr_1 class_(int var1, rhz_3 var2) {
      return rXe_1.class_(var1, var2, this);
   }

   public static int class_(rYB var0, rHD var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var0.continue_ && var6 != 0 && (var2 + var3 + var4 + var5) % 200 == 0) {
         var6 = class_(var0, var1, var3, var4, var5);
      }

      return var6;
   }

   @Override
   public void break_(rhd_3 var1) {
      if (!var1.native_()) {
         this.byte_--;
         this.catch_();
      }
   }

   @Override
   public void throws_() {
      int var1 = this.native_.b_();
      int var2 = this.native_.c_();
      int var3 = this.native_.d_();
      this.catch_++;
      this.byte_ = class_(this.extends_, this, this.catch_, var1, var2, var3, this.byte_);
      this.break_ = this.class_;
      float var4 = 0.1F;
      if (this.byte_ > 0 && this.class_ == 0.0F) {
         this.class_(rqn_3.rI);
      }

      if (this.byte_ == 0 && this.class_ > 0.0F || this.byte_ > 0 && this.class_ < 1.0F) {
         float var5 = this.class_;
         if (this.byte_ > 0) {
            this.class_ += 0.1F;
         } else {
            this.class_ -= 0.1F;
         }

         if (this.class_ > 1.0F) {
            this.class_ = 1.0F;
         }

         float var6 = 0.5F;
         if (this.class_ < 0.5F && var5 >= 0.5F) {
            this.class_(rqn_3.rt);
         }

         if (this.class_ < 0.0F) {
            this.class_ = 0.0F;
         }
      }
   }

   protected void catch_() {
      xd_3 var1 = this.abstract_().break_();
      if (var1 instanceof xt_3) {
         this.extends_.class_(this.native_, var1, 1, this.byte_);
         this.extends_.break_(this.native_, var1);
      }
   }

   @Override
   public int else_() {
      return 27;
   }

   public int private_() {
      return this.byte_;
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.byte_ = var2;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.case_;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (!var1.native_()) {
         if (this.byte_ < 0) {
            this.byte_ = 0;
         }

         this.byte_++;
         this.catch_();
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.chest");
   }
}
