package celestial;

import java.util.EnumSet;

public class rSX extends rBk_1 {
   private final rsy_3 class_;

   @Override
   public void byte_() {
      this.class_.public_().final_();
   }

   public rSX(rsy_3 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (!this.class_.BM()) {
         return false;
      } else if (this.class_.rT()) {
         return false;
      } else if (!this.class_.BL()) {
         return false;
      } else if ((Boolean)this.class_.throws_[25]) {
         return false;
      } else {
         rhd_3 var1 = this.class_.class_();
         if (var1 == null) {
            return false;
         } else {
            return this.class_.int_(var1) > 16.0 ? false : (rJr_1)var1.implements_[4] != null;
         }
      }
   }

   @Override
   public void protected_() {
      this.class_.class_((rhd_3)null);
   }
}
