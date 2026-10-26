package celestial;

import java.util.EnumSet;

public class rhM_2 extends rSM {
   private final rhP_2 class_;
   private iB_2 break_;
   private int byte_;

   @Override
   public void byte_() {
      this.throws_.byte_(this.break_);
      an_3 var1 = this.class_.N();
      if (var1 instanceof rsU_2) {
         this.byte_ = ((rsU_2)var1).Sb();
      }

      super.byte_();
   }

   public rhM_2(rhb_3 var1, rhP_2 var2) {
      super(var2, false);
      this.class_ = var2;
      this.class_(EnumSet.of(rBW.TARGET));
   }

   @Override
   public boolean class_() {
      if (!this.class_.z()) {
         return false;
      } else if (!(this.class_.N() instanceof rsU_2 var2)) {
         return false;
      } else {
         this.break_ = var2.Sr();
         int var3 = var2.Sb();
         return var3 != this.byte_ && this.class_(this.break_, ay_3.class_);
      }
   }
}
