package celestial;

import java.util.Random;

public class Ci_1 extends lO_2 {
   private static final Random class_ = new Random();
   private final Ch_1 break_;

   Ci_1(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, 0.5 - class_.nextDouble(), var10, 0.5 - class_.nextDouble());
      this.break_ = var14;
      this.extends_ *= 0.2F;
      if (var8 == 0.0 && var12 == 0.0) {
         this.finally_ *= 0.1F;
         this.native_ *= 0.1F;
      }

      this.throw_ *= 0.75F;
      this.this_ = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.final_ = false;
      this.break_(var14);
   }

   @Override
   public CJ class_() {
      return CJ.byte_;
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.break_(this.break_);
         this.extends_ += 0.004;
         this.class_(this.finally_, this.extends_, this.native_);
         if (this.private_ == this.throws_) {
            this.finally_ *= 1.1;
            this.native_ *= 1.1;
         }

         this.finally_ *= 0.96F;
         this.extends_ *= 0.96F;
         this.native_ *= 0.96F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
