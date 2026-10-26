package celestial;

public class rLZ extends rLA {
   private rfH_2 class_;

   public rLZ(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_() {
      if (!this.native_()) {
         super.class_();
      } else if (this.class_ != null) {
         if (this.class_.class_(this.break_.Ps(), (double)this.break_.PN())
            || this.break_.re() > (double)this.class_.c_()
               && new rfH_2((double)this.class_.b_(), this.break_.re(), (double)this.class_.d_()).class_(this.break_.Ps(), (double)this.break_.PN())) {
            this.class_ = null;
         } else {
            this.break_.super_().class_((double)this.class_.b_(), (double)this.class_.c_(), (double)this.class_.d_(), this.throws_);
         }
      }
   }

   @Override
   public boolean class_(an_3 var1, double var2) {
      rLC var4 = this.class_(var1, 0);
      if (var4 != null) {
         return this.class_(var4, var2);
      } else {
         this.class_ = var1.Bs();
         this.throws_ = var2;
         return true;
      }
   }

   @Override
   public rLC class_(an_3 var1, int var2) {
      this.class_ = var1.Bs();
      return super.class_(var1, var2);
   }

   @Override
   public rLC class_(rfH_2 var1, int var2) {
      this.class_ = var1;
      return super.class_(var1, var2);
   }
}
