package celestial;

public class ly_3 {
   private boolean class_;
   private rRq_1 break_;
   private an_3 byte_;
   private rjU_2 protected_ = rjU_2.class_;
   private rjU_2 throws_ = rjU_2.class_;
   private final rfw_3 case_ = new rfw_3();
   private final rje_3 catch_ = new rje_3(0.0F, 0.0F, 1.0F);
   private final rje_3 private_ = new rje_3(0.0F, 1.0F, 0.0F);
   private final rje_3 implements_ = new rje_3(1.0F, 0.0F, 0.0F);
   private float finally_;
   private float extends_;
   private final rjY_2 native_ = new rjY_2(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean volatile_;
   private boolean final_;
   private float package_;
   private float int_;

   public rfH_2 byte_() {
      return this.case_;
   }

   public float int_() {
      return this.package_;
   }

   public float class_(float var1) {
      return rfU_2.catch_(var1, this.int_, this.package_);
   }

   protected void class_(rjU_2 var1) {
      this.protected_ = var1;
      this.case_.break_(var1.break_, var1.byte_, var1.protected_);
   }

   public void class_(float var1, float var2) {
      this.finally_ = var2;
      this.extends_ = var1;
      this.native_.class_(0.0F, 0.0F, 0.0F, 1.0F);
      this.native_.class_(rje_3.protected_.byte_(-var1));
      this.native_.class_(rje_3.break_.byte_(var2));
      this.catch_.break_(0.0F, 0.0F, 1.0F);
      this.catch_.class_(this.native_);
      this.private_.break_(0.0F, 1.0F, 0.0F);
      this.private_.class_(this.native_);
      this.implements_.break_(1.0F, 0.0F, 0.0F);
      this.implements_.class_(this.native_);
   }

   private double class_(double var1) {
      return var1;
   }

   public void class_(QY var1, rRq_1 var2, an_3 var3, boolean var4, boolean var5, float var6) {
      this.class_ = true;
      this.break_ = var2;
      this.byte_ = var3;
      this.volatile_ = var4;
      this.final_ = var5;
      rrLt_1 var7 = rrLt_1.class_(var3.Pt(), var3.Ps(), false);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var7);
      rjU_2 var8 = var7.break_();
      rjU_2 var9 = var7.class_();
      boolean var10 = var7.byte_();
      cb_3 var11 = (cb_3)var1.class_[57];
      if (var3 == var11 && var11.s() != null) {
         PX var12 = var11.s().class_();
         this.class_(var12.throws_(), var12.protected_());
      } else {
         this.class_(var3.throws_(var6), var3.case_(var6));
      }

      this.break_(
         rfU_2.protected_((double)var6, var8.break_, var9.break_),
         rfU_2.protected_((double)var6, var8.byte_, var9.byte_) + (double)rfU_2.catch_(var6, this.int_, this.package_),
         rfU_2.protected_((double)var6, var8.protected_, var9.protected_)
      );
      this.throws_ = this.protected_;
      if (!var10) {
         if (var4) {
            if (var5) {
               this.class_(this.extends_ + 180.0F, -this.finally_);
            }

            this.class_(-this.class_(4.0), 0.0, 0.0);
         } else if (var3 instanceof iB_2 && ((iB_2)var3).Sc()) {
            rpr_3 var13 = ((iB_2)var3).Bi();
            this.class_(var13 != null ? var13.package_() - 180.0F : 0.0F, 0.0F);
            this.class_(0.0, 0.3, 0.0);
         }
      }
   }

   public void class_(double var1, double var3, double var5) {
      double var7 = (double)this.catch_.class_() * var1 + (double)this.private_.class_() * var3 + (double)this.implements_.class_() * var5;
      double var9 = (double)this.catch_.break_() * var1 + (double)this.private_.break_() * var3 + (double)this.implements_.break_() * var5;
      double var11 = (double)this.catch_.byte_() * var1 + (double)this.private_.byte_() * var3 + (double)this.implements_.byte_() * var5;
      this.class_(new rjU_2(this.protected_.break_ + var7, this.protected_.byte_ + var9, this.protected_.protected_ + var11));
   }

   public void class_() {
      if (this.byte_ != null) {
         this.int_ = this.package_;
         this.package_ = this.package_ + (this.byte_.Bx() - this.package_) * 0.5F;
      }
   }

   public void break_(float var1, float var2) {
      this.extends_ = var1;
      this.finally_ = var2;
   }

   public rjU_2 break_() {
      return this.protected_;
   }

   protected void break_(double var1, double var3, double var5) {
      this.class_(new rjU_2(var1, var3, var5));
   }

   public float throws_() {
      return this.extends_;
   }

   public rXE finally_() {
      if (!this.class_) {
         return rXG.class_.private_();
      } else {
         rXE var1 = this.break_.break_(this.case_);
         return !var1.byte_() && this.protected_.byte_ >= (double)((float)this.case_.c_() + var1.class_(this.break_, this.case_))
            ? rXG.class_.private_()
            : var1;
      }
   }

   public an_3 catch_() {
      return this.byte_;
   }

   public xc_3 extends_() {
      return !this.class_ ? xu_3.class_.continue_() : this.break_.byte_(this.case_);
   }

   public rjY_2 case_() {
      return this.native_;
   }

   public boolean implements_() {
      return this.volatile_;
   }

   public rjU_2 new_() {
      return this.throws_;
   }

   public void package_() {
      this.break_ = null;
      this.byte_ = null;
      this.class_ = false;
   }

   public float protected_() {
      return this.finally_;
   }

   public boolean private_() {
      return this.class_;
   }

   public final rje_3 final_() {
      return this.private_;
   }

   public final rje_3 volatile_() {
      return this.catch_;
   }

   public xc_3 native_() {
      if (!this.class_) {
         return xu_3.class_.continue_();
      } else {
         xc_3 var1 = this.break_.byte_(this.case_);
         if (rrxr_3.u.byte_()) {
            var1 = (xc_3)rrxr_3.private_(var1, rrxr_3.u, this.break_, this.case_, this.protected_);
         }

         return var1;
      }
   }
}
