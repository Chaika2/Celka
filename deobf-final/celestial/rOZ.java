package celestial;

import java.util.Random;

class rOZ extends rBP {
   private final rON protected_;

   rOZ(rON var1, double var2) {
      super(var1, var2);
      this.protected_ = var1;
   }

   @Override
   public boolean class_() {
      return super.class_() && !this.protected_.L();
   }

   @Override
   protected void catch_() {
      rhN_2 var1 = this.class_.sz();
      if (var1 == null && this.byte_.sz() != null) {
         var1 = this.byte_.sz();
      }

      if (var1 != null) {
         var1.break_(rlB_2.strictfp_);
         Oo_1.package_.class_(var1, this.class_, this.byte_, (au_3)null);
      }

      this.protected_.this_(true);
      this.class_.sN();
      this.byte_.sN();
      Random var2 = this.class_.Sa();
      if (this.break_.B().break_(rRu_1.throws_)) {
         this.break_.a_(new rsP_2(this.break_, this.class_.rx(), this.class_.re(), this.class_.BO(), var2.nextInt(7) + 1));
      }
   }
}
