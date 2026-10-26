package celestial;

import java.util.List;
import java.util.Optional;

public class vl_3 extends vm_3 {
   protected final vm_3 case_;
   protected final Qw_1 catch_;

   public vl_3(vm_3 var1, Qw_1 var2, rgP_2 var3) {
      super(var3);
      this.case_ = var1;
      this.catch_ = var2;
   }

   public static List<rpl_3> class_(Le_1 var0, int var1, int var2) {
      Optional var3 = var0.throws_((double)var1, (double)var2);
      if (var3.isPresent() && var3.get() instanceof cn_3) {
         Optional var4 = ((cn_3)var3.get()).class_();
         return (List<rpl_3>)var4.orElse((List)null);
      } else {
         return null;
      }
   }

   @Override
   public void volatile_() {
      this.volatile_.break_(this.case_);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.volatile_.class_[20]).break_();
   }
}
