package celestial;

import java.util.EnumSet;

public class rBC extends rBk_1 {
   private final is_3 class_;
   private double break_;
   private double byte_;
   private int protected_;

   @Override
   public void byte_() {
      double var1 = (Math.PI * 2) * this.class_.Sa().nextDouble();
      this.break_ = Math.cos(var1);
      this.byte_ = Math.sin(var1);
      this.protected_ = 20 + this.class_.Sa().nextInt(20);
   }

   public rBC(is_3 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.class_.Sa().nextFloat() < 0.02F;
   }

   @Override
   public boolean break_() {
      return this.protected_ >= 0;
   }

   @Override
   public void throws_() {
      this.protected_--;
      this.class_.continue_().class_(this.class_.rx() + this.break_, this.class_.rH(), this.class_.BO() + this.byte_);
   }
}
