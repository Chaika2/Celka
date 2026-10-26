package celestial;

import java.util.EnumSet;

class rbe_3 extends rBk_1 {
   private final rbo_3 id_class;
   private final double id_break;
   private rhd_3 id_byte;

   @Override
   public void id_byte() {
      this.id_byte.id_break(new rLY(rLD.id_interface, 100));
   }

   rbe_3(rbo_3 var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      this.id_byte = ((rYB)this.id_class.id_throws[7]).id_class(rbo_3.id_this, this.id_class);
      return this.id_byte == null ? false : this.id_byte.Py() && this.id_class.I_() != this.id_byte;
   }

   @Override
   public boolean id_break() {
      return this.id_byte != null && this.id_byte.Py() && this.id_class.id_int(this.id_byte) < 256.0;
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_byte, (float)(this.id_class.S() + 20), (float)this.id_class.r());
      if (this.id_class.id_int(this.id_byte) < 6.25) {
         this.id_class.id_public().id_final();
      } else {
         this.id_class.id_public().id_class(this.id_byte, this.id_break);
      }

      if (this.id_byte.Py() && ((rYB)this.id_byte.id_throws[7]).id_int.nextInt(6) == 0) {
         this.id_byte.id_break(new rLY(rLD.id_interface, 100));
      }
   }

   @Override
   public void id_protected() {
      this.id_byte = null;
      this.id_class.id_public().id_final();
   }
}
