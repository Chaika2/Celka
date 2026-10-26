package celestial;

public class rJX extends rJY {
   private final rhd_3 class_;
   private int break_;

   public rJX(rhd_3 var1, rXu_1 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.class_ = var1;
   }

   @Override
   protected void class_(rdn_3 var1, int var2) {
      this.break_ += var2;
      this.b_(var1);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      this.b_(var2);
      super.class_(var1, var2);
      return var2;
   }

   @Override
   public rdn_3 class_(int var1) {
      if (this.break_()) {
         this.break_ = this.break_ + Math.min(var1, this.class_().char_());
      }

      return super.class_(var1);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }

   @Override
   protected void b_(rdn_3 var1) {
      var1.class_((rYB)this.class_.throws_[7], this.class_, this.break_);
      if (!((rYB)this.class_.throws_[7]).continue_ && this.byte_ instanceof rHS) {
         ((rHS)this.byte_).protected_(this.class_);
      }

      this.break_ = 0;
   }
}
