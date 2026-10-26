package celestial;

import java.util.EnumSet;

class rGR extends rBk_1 {
   @Override
   public void id_byte() {
      iB_2 var1 = this.id_class.I_();
      rjU_2 var2 = var1.id_new(1.0F);
      rGg_1.id_break(this.id_class).id_class(var2.id_break, var2.id_byte, var2.id_protected, 1.0);
      this.id_class.id_this(true);
      this.id_class.id_class(rqn_3.dD, 1.0F, 1.0F);
   }

   public rGR(rGg_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      return this.id_class.I_() != null && !this.id_class.id_super().id_break() && rGg_1.id_class(this.id_class).nextInt(7) == 0
         ? this.id_class.id_int(this.id_class.I_()) > 4.0
         : false;
   }

   @Override
   public boolean id_break() {
      return this.id_class.id_super().id_break() && this.id_class.sx() && this.id_class.I_() != null && this.id_class.I_().BM();
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_class.I_();
      if (this.id_class.rN().id_byte(var1.rN())) {
         this.id_class.id_public(var1);
         this.id_class.id_this(false);
      } else {
         double var2 = this.id_class.id_int(var1);
         if (var2 < 9.0) {
            rjU_2 var4 = var1.id_new(1.0F);
            rGg_1.id_byte(this.id_class).id_class(var4.id_break, var4.id_byte, var4.id_protected, 1.0);
         }
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_this(false);
   }
}
