package celestial;

import java.util.function.Predicate;

class rMD extends rBI<rhd_3> {
   public rMD(rMK var1) {
      super(var1, rhd_3.class, 20, true, true, (Predicate<iB_2>)null);
      this.implements_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.implements_.n_()) {
         return false;
      } else {
         if (super.class_()) {
            for (rMK var2 : ((rYB)this.implements_.throws_[7]).class_(rMK.class, this.implements_.rN().byte_(8.0, 4.0, 8.0))) {
               if (var2.n_()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected double extends_() {
      return super.extends_() * 0.5;
   }
}
