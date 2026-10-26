package celestial;

import java.util.EnumSet;

public class rSb_1 extends rBk_1 {
   private final is_3 id_class;

   public rSb_1(is_3 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.JUMP));
      var1.id_public().id_byte(true);
   }

   @Override
   public boolean id_class() {
      return this.id_class.rT() && this.id_class.id_break(rlG_2.id_break) > this.id_class.rI() || this.id_class.ry();
   }

   @Override
   public void id_throws() {
      if (this.id_class.Sa().nextFloat() < 0.8F) {
         this.id_class.id_else().id_class();
      }
   }
}
