package celestial;

public class FP extends vm_3 {
   private String throws_ = "";
   private int case_ = -1;
   public Lu_1 class_;
   private final String catch_;
   cW_2 private_;

   private void byte_(String var1) {
      this.class_.class_(var1);
   }

   public FP(String var1) {
      super(rgN_2.byte_);
      this.catch_ = var1;
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      if (var5 > 1.0) {
         var5 = 1.0;
      }

      if (var5 < -1.0) {
         var5 = -1.0;
      }

      if (this.private_.class_(var5)) {
         return true;
      } else {
         if (!synchronized_()) {
            var5 *= 7.0;
         }

         ((cq_3)this.volatile_.class_[19]).throws_().class_(var5);
         return true;
      }
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).class_().class_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5);
      return super.class_(var1, var3, var5);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (this.private_.class_(var1, var2, var3)) {
         return true;
      } else if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 == 256) {
         this.volatile_.break_(null);
         return true;
      } else if (var1 == 257 || var1 == 335) {
         String var4 = this.class_.private_().trim();
         if (!var4.isEmpty()) {
            this.break_(var4);
         }

         this.volatile_.break_(null);
         return true;
      } else if (var1 == 265) {
         this.break_(-1);
         return true;
      } else if (var1 == 264) {
         this.break_(1);
         return true;
      } else if (var1 == 266) {
         ((cq_3)this.volatile_.class_[19]).throws_().class_((double)(((cq_3)this.volatile_.class_[19]).throws_().implements_() - 1));
         return true;
      } else if (var1 == 267) {
         ((cq_3)this.volatile_.class_[19]).throws_().class_((double)(-((cq_3)this.volatile_.class_[19]).throws_().implements_() + 1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void class_(String var1, boolean var2) {
      if (var2) {
         this.class_.class_(var1);
      } else {
         this.class_.break_(var1);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(this.class_);
      this.class_.byte_(true);
      class_(var1, 2, this.int_ - 14, this.package_ - 2, this.int_ - 2, ((Qw_1)this.volatile_.class_[20]).class_(Integer.MIN_VALUE));
      this.class_.class_(var1, var2, var3, var4);
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().protected_(this.class_.private_())) {
         BlurShader.class_(
            var1,
            () -> class_(var1, 2, this.int_ - 14, Math.min(this.class_.case_() + 6, this.super_.break_(this.class_.private_()) + 5), this.int_ - 2, -1),
            10.0F
         );
      }

      this.private_.class_(var1, var2, var3);
      rgc_3 var5 = ((cq_3)this.volatile_.class_[19]).throws_().break_((double)var2, (double)var3);
      if (var5 != null && var5.implements_() != null) {
         this.class_(var1, var5, var2, var3);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.class_.private_();
      this.break_(var1, var2, var3);
      this.byte_(var4);
      this.private_.class_();
   }

   private void class_(String var1) {
      String var2 = this.class_.private_();
      this.private_.class_(!var2.equals(this.catch_));
      this.private_.class_();
   }

   public void break_(int var1) {
      int var2 = this.case_ + var1;
      int var3 = ((cq_3)this.volatile_.class_[19]).throws_().protected_().size();
      var2 = rfU_2.class_(var2, 0, var3);
      if (var2 != this.case_) {
         if (var2 == var3) {
            this.case_ = var3;
            this.class_.class_(this.throws_);
         } else {
            if (this.case_ == var3) {
               this.throws_ = this.class_.private_();
            }

            this.class_.class_(((cq_3)this.volatile_.class_[19]).throws_().protected_().get(var2));
            this.private_.class_(false);
            this.case_ = var2;
         }
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).class_().class_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var5, true, false);
      if (this.private_.class_((double)((int)var1), (double)((int)var3), var5)) {
         return true;
      } else {
         if (var5 == 0) {
            cI_2 var6 = ((cq_3)this.volatile_.class_[19]).throws_();
            if (var6.class_(var1, var3)) {
               return true;
            }

            rgc_3 var7 = var6.break_(var1, var3);
            if (var7 != null && this.class_(var7)) {
               return true;
            }
         }

         return this.class_.break_(var1, var3, var5) || super.break_(var1, var3, var5);
      }
   }

   public cW_2 finally_() {
      return this.private_;
   }

   @Override
   public void private_() {
      this.class_.catch_();
   }

   @Override
   public void volatile_() {
      super.volatile_();
   }

   @Override
   protected void v_() {
      short var1 = 130;
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.case_ = ((cq_3)this.volatile_.class_[19]).throws_().protected_().size();
      this.class_ = new FB(this, this.super_, 4, this.int_ - 12, this.package_ - var1 - 10, 12, new rgn_3("chat.editBox"));
      this.class_.implements_(Integer.MAX_VALUE);
      this.class_.protected_(false);
      this.class_.class_(this.catch_);
      this.class_.class_(this::class_);
      this.native_.add(this.class_);
      this.private_ = new cW_2(this.volatile_, this, this.class_, this.super_, false, false, 1, 10, true, -805306368);
      this.private_.class_();
      this.break_(this.class_);
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
      ((Qw_1)this.volatile_.class_[20]).break_();
      ((cq_3)this.volatile_.class_[19]).throws_().throws_();
      this.class_.byte_(false);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).class_().class_((Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], 0);
   }
}
