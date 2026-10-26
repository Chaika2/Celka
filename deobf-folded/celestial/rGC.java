package celestial;

import java.util.EnumSet;

class rGC extends rBk_1 {
   private final rGA id_class;
   private float id_break;
   private int id_byte;

   public rGC(rGA var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_class.I_() == null
         && (rGA.id_class(this.id_class) || this.id_class.rT() || this.id_class.ry() || this.id_class.id_break(rLD.id_goto))
         && this.id_class.id_super() instanceof rGy_1;
   }

   @Override
   public void id_throws() {
      if (--this.id_byte <= 0) {
         this.id_byte = 40 + this.id_class.Sa().nextInt(60);
         this.id_break = (float)this.id_class.Sa().nextInt(360);
      }

      ((rGy_1)this.id_class.id_super()).id_class(this.id_break, false);
   }
}
