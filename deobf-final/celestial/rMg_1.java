package celestial;

class rMg_1 extends rBA {
   private final rMl_1 catch_;

   public rMg_1(rMl_1 var1, Class<? extends iB_2> var2, float var3) {
      super(var1, var2, var3);
      this.catch_ = var1;
   }

   public void class_(iB_2 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.class_.Sa().nextFloat() >= this.protected_) {
         return false;
      } else {
         if (this.break_ == null) {
            if (this.throws_ == rhd_3.class) {
               this.break_ = ((rYB)this.class_.throws_[7]).class_(this.case_, this.class_, this.class_.rx(), this.class_.rH(), this.class_.BO());
            } else {
               this.break_ = ((rYB)this.class_.throws_[7])
                  .break_(
                     this.throws_,
                     this.case_,
                     this.class_,
                     this.class_.rx(),
                     this.class_.rH(),
                     this.class_.BO(),
                     this.class_.rN().byte_((double)this.byte_, 3.0, (double)this.byte_)
                  );
            }
         }

         return this.catch_.sy() && this.break_ != null;
      }
   }

   @Override
   public boolean break_() {
      return this.break_ != null && super.break_();
   }

   @Override
   public void throws_() {
      if (this.break_ != null) {
         super.throws_();
      }
   }
}
