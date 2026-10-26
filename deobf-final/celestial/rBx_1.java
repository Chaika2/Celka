package celestial;

import java.util.List;

public class rBx_1 extends rBk_1 {
   private final rbZ_2 class_;
   private rbZ_2 break_;
   private final double byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.protected_ = 0;
   }

   public rBx_1(rbZ_2 var1, double var2) {
      this.class_ = var1;
      this.byte_ = var2;
   }

   @Override
   public boolean class_() {
      if (this.class_.O_() >= 0) {
         return false;
      } else {
         List var1 = ((rYB)this.class_.throws_[7]).class_(this.class_.getClass(), this.class_.rN().byte_(8.0, 4.0, 8.0));
         rbZ_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (rbZ_2 var6 : var1) {
            if (var6.O_() >= 0) {
               double var7 = this.class_.int_(var6);
               if (!(var7 > var3)) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         if (var2 == null) {
            return false;
         } else if (var3 < 9.0) {
            return false;
         } else {
            this.break_ = var2;
            return true;
         }
      }
   }

   @Override
   public boolean break_() {
      if (this.class_.O_() >= 0) {
         return false;
      } else if (!this.break_.BM()) {
         return false;
      } else {
         double var1 = this.class_.int_(this.break_);
         return !(var1 < 9.0) && !(var1 > 256.0);
      }
   }

   @Override
   public void throws_() {
      if (--this.protected_ <= 0) {
         this.protected_ = 10;
         this.class_.public_().class_(this.break_, this.byte_);
      }
   }

   @Override
   public void protected_() {
      this.break_ = null;
   }
}
