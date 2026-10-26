package celestial;

import java.util.EnumSet;

class rGC extends rBk_1 {
   private final rGA class_;
   private float break_;
   private int byte_;

   public rGC(rGA var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.class_.I_() == null
         && (rGA.class_(this.class_) || this.class_.rT() || this.class_.ry() || this.class_.break_(rLD.goto_))
         && this.class_.super_() instanceof rGy_1;
   }

   @Override
   public void throws_() {
      if (--this.byte_ <= 0) {
         this.byte_ = 40 + this.class_.Sa().nextInt(60);
         this.break_ = (float)this.class_.Sa().nextInt(360);
      }

      ((rGy_1)this.class_.super_()).class_(this.break_, false);
   }
}
