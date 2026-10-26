package celestial;

import java.util.Objects;
import java.util.Optional;

class vU_2 extends LF {
   vU_2(vK_2 var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var1;
   }

   @Override
   protected rVi_1 A_() {
      return Objects.equals(this.id_class.id_int, Optional.of(mN_2.id_break)) ? super.A_().id_break(". ").id_class(vK_2.id_protected) : super.A_();
   }

   @Override
   public rgP_2 C_() {
      return super.C_().id_case().id_break(" ").id_class(this.id_class.id_int.<rgP_2>map(mN_2::id_class).orElse(vK_2.id_byte));
   }
}
