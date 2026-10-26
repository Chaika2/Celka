package celestial;

import java.util.EnumSet;

public class rSb_1 extends rBk_1 {
   private final is_3 class_;

   public rSb_1(is_3 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.JUMP));
      var1.public_().byte_(true);
   }

   @Override
   public boolean class_() {
      return this.class_.rT() && this.class_.break_(rlG_2.break_) > this.class_.rI() || this.class_.ry();
   }

   @Override
   public void throws_() {
      if (this.class_.Sa().nextFloat() < 0.8F) {
         this.class_.else_().class_();
      }
   }
}
