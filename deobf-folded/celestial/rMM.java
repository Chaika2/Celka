package celestial;

import java.util.EnumSet;

class rMM extends rBk_1 {
   int id_class;

   @Override
   public void id_byte() {
      this.id_class = 40;
   }

   public rMM(rba_3 var1) {
      this.id_break = var1;
      this.id_class(EnumSet.of(rBW.LOOK, rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      return this.id_break.sx();
   }

   @Override
   public boolean id_break() {
      return this.id_class() && this.id_class > 0;
   }

   @Override
   public void id_throws() {
      this.id_class--;
   }

   @Override
   public void id_protected() {
      this.id_break.id_public(false);
   }
}
