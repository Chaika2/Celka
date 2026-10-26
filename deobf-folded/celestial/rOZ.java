package celestial;

import java.util.Random;

class rOZ extends rBP {
   private final rON id_protected;

   rOZ(rON var1, double var2) {
      super(var1, var2);
      this.id_protected = var1;
   }

   @Override
   public boolean id_class() {
      return super.id_class() && !this.id_protected.L();
   }

   @Override
   protected void id_catch() {
      rhN_2 var1 = this.id_class.sz();
      if (var1 == null && this.id_byte.sz() != null) {
         var1 = this.id_byte.sz();
      }

      if (var1 != null) {
         var1.id_break(rlB_2.id_strictfp);
         Oo_1.id_package.id_class(var1, this.id_class, this.id_byte, (au_3)null);
      }

      this.id_protected.id_this(true);
      this.id_class.sN();
      this.id_byte.sN();
      Random var2 = this.id_class.Sa();
      if (this.id_break.B().id_break(rRu_1.id_throws)) {
         this.id_break.a_(new rsP_2(this.id_break, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), var2.nextInt(7) + 1));
      }
   }
}
