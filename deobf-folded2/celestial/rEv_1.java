package celestial;

import java.util.EnumSet;

class rEv_1 extends rBk_1 {
   private final rEu_1 id_class;
   private iB_2 id_break;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_final();
   }

   public rEv_1(rEu_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      this.id_break = this.id_class.I_();
      if (!(this.id_break instanceof rhd_3)) {
         return false;
      } else {
         double var1 = this.id_break.id_int(this.id_class);
         return var1 > 256.0 ? false : this.id_class.id_case((rhd_3)this.id_break);
      }
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_break.rx(), this.id_break.rH(), this.id_break.BO());
   }
}
