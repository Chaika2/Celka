package celestial;

public class rJq_1 extends rJY {
   private final rXl_1 class_;
   private final rhd_3 break_;
   private int catch_;
   private final rsA_2 private_;

   public rJq_1(rhd_3 var1, rsA_2 var2, rXl_1 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.break_ = var1;
      this.private_ = var2;
      this.class_ = var3;
   }

   @Override
   public rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      this.b_(var2);
      rdI_2 var3 = this.class_.protected_();
      if (var3 != null) {
         rdn_3 var4 = this.class_.extends_(0);
         rdn_3 var5 = this.class_.extends_(1);
         if (var3.break_(var4, var5) || var3.break_(var5, var4)) {
            this.private_.class_(var3);
            var1.break_(rlB_2.double_);
            this.class_.break_(0, var4);
            this.class_.break_(1, var5);
         }

         this.private_.class_(this.private_.protected_() + var3.package_());
      }

      return var2;
   }

   @Override
   protected void class_(rdn_3 var1, int var2) {
      this.catch_ += var2;
      this.b_(var1);
   }

   @Override
   public rdn_3 class_(int var1) {
      if (this.break_()) {
         this.catch_ = this.catch_ + Math.min(var1, this.class_().char_());
      }

      return super.class_(var1);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }

   @Override
   protected void b_(rdn_3 var1) {
      var1.class_((rYB)this.break_.throws_[7], this.break_, this.catch_);
      this.catch_ = 0;
   }
}
