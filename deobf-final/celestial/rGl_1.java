package celestial;

import java.util.EnumSet;

class rGl_1 extends rBk_1 {
   private final rGA class_;

   public rGl_1(rGA var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.JUMP, rBW.MOVE));
      var1.public_().byte_(true);
   }

   @Override
   public boolean class_() {
      return (this.class_.rT() || this.class_.ry()) && this.class_.super_() instanceof rGy_1;
   }

   @Override
   public void throws_() {
      if (this.class_.Sa().nextFloat() < 0.8F) {
         this.class_.else_().class_();
      }

      ((rGy_1)this.class_.super_()).class_(1.2);
   }
}
