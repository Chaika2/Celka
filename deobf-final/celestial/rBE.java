package celestial;

import java.util.EnumSet;
import java.util.List;

public class rBE extends rSM {
   private final rMZ class_;
   private iB_2 break_;
   private final ay_3 byte_ = new ay_3().class_(64.0);

   @Override
   public void byte_() {
      this.class_.byte_(this.break_);
      super.byte_();
   }

   public rBE(rMZ var1) {
      super(var1, false, true);
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.TARGET));
   }

   @Override
   public boolean class_() {
      rfl_3 var1 = this.class_.rN().byte_(10.0, 8.0, 10.0);
      List var2 = ((rYB)this.class_.throws_[7]).class_(rsq_3.class, this.byte_, this.class_, var1);
      List var3 = ((rYB)this.class_.throws_[7]).class_(this.byte_, this.class_, var1);

      for (iB_2 var5 : var2) {
         rsq_3 var6 = (rsq_3)var5;

         for (rhd_3 var8 : var3) {
            int var9 = var6.throws_(var8);
            if (var9 <= -100) {
               this.break_ = var8;
            }
         }
      }

      return this.break_ == null ? false : !(this.break_ instanceof rhd_3) || !this.break_.native_() && !((rhd_3)this.break_).implements_();
   }
}
