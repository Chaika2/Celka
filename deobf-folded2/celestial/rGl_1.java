package celestial;

import java.util.EnumSet;

class rGl_1 extends rBk_1 {
   private final rGA id_class;

   public rGl_1(rGA var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
      var1.id_public().id_byte(true);
   }

   @Override
   public boolean id_class() {
      return (this.id_class.rT() || this.id_class.ry()) && this.id_class.id_super() instanceof rGy_1;
   }

   @Override
   public void id_throws() {
      if (this.id_class.Sa().nextFloat() < 0.8F) {
         this.id_class.id_else().id_class();
      }

      ((rGy_1)this.id_class.id_super()).id_class(1.2);
   }
}
