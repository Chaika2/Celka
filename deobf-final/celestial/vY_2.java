package celestial;

public class vY_2 extends vm_3 implements rpC_2 {
   private rgP_2 class_;
   private rgP_2 throws_;
   private int case_;
   private boolean catch_;
   private final rrbT_2 private_ = rrbt_3.class_();

   @Override
   public void byte_(rgP_2 var1) {
      this.class_ = var1;
      this.protected_(new rgn_3("progress.working"));
   }

   public vY_2() {
      super(rgN_2.byte_);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.catch_) {
         this.volatile_.break_(null);
      } else {
         if (this.private_ != null && (gm_3)this.volatile_.class_[56] == null) {
            this.private_.class_(this.package_, this.int_);
         } else {
            this.class_(var1);
         }

         if (this.case_ > 0) {
            if (this.class_ != null) {
               class_(var1, this.super_, this.class_, this.package_ / 2, 70, 16777215);
            }

            if (this.throws_ != null && this.case_ != 0) {
               class_(var1, this.super_, new rgN_2("").class_(this.throws_).break_(" " + this.case_ + "%"), this.package_ / 2, 90, 16777215);
            }
         }

         super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   public void break_(int var1) {
      this.case_ = var1;
   }

   @Override
   public void break_(rgP_2 var1) {
      this.byte_(var1);
   }

   @Override
   public void finally_() {
      this.catch_ = true;
   }

   @Override
   public void protected_(rgP_2 var1) {
      this.throws_ = var1;
      this.break_(0);
   }

   @Override
   public boolean E_() {
      return false;
   }
}
