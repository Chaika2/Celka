package celestial;

import java.util.Comparator;
import java.util.List;

class rGs_1 extends rBk_1 {
   private final ay_3 break_;
   private int byte_;

   rGs_1(rGB var1) {
      this.class_ = var1;
      this.break_ = new ay_3().class_(64.0);
      this.byte_ = 20;
   }

   @Override
   public boolean class_() {
      if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else {
         this.byte_ = 60;
         List var1 = ((rYB)this.class_.throws_[7]).class_(this.break_, this.class_, this.class_.rN().byte_(16.0, 64.0, 16.0));
         if (!var1.isEmpty()) {
            var1.sort(Comparator.comparing(an_3::re).reversed());

            for (rhd_3 var3 : var1) {
               if (this.class_.class_(var3, ay_3.class_)) {
                  this.class_.byte_(var3);
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.class_.I_();
      return var1 != null ? this.class_.class_(var1, ay_3.class_) : false;
   }
}
