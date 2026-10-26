package celestial;

import java.util.Objects;
import java.util.Optional;

class vU_2 extends LF {
   vU_2(vK_2 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.class_ = var1;
   }

   @Override
   protected rVi_1 A_() {
      return Objects.equals(this.class_.int_, Optional.of(mN_2.break_)) ? super.A_().break_(". ").class_(vK_2.protected_) : super.A_();
   }

   @Override
   public rgP_2 C_() {
      return super.C_().case_().break_(" ").class_(this.class_.int_.<rgP_2>map(mN_2::class_).orElse(vK_2.byte_));
   }
}
