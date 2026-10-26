package celestial;

import java.util.EnumSet;

public class rSG extends rBk_1 {
   private final rOQ class_;

   @Override
   public void byte_() {
      this.class_.public_().final_();
      this.class_.public_(true);
   }

   public rSG(rOQ var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (!this.class_.sZ()) {
         return false;
      } else if (this.class_.Pa()) {
         return false;
      } else if (!this.class_.BL()) {
         return false;
      } else {
         iB_2 var1 = this.class_.sF();
         if (var1 == null) {
            return true;
         } else {
            return this.class_.int_(var1) < 144.0 && var1.Sr() != null ? false : this.class_.sL();
         }
      }
   }

   @Override
   public boolean break_() {
      return this.class_.sL();
   }

   @Override
   public void protected_() {
      this.class_.public_(false);
   }
}
