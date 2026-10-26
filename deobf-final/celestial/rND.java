package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class rND extends rzO_2 {
   final boolean break_;
   final List<rgP_2> byte_;
   final rzB_2 protected_;

   public rND(rQz_1[] var1, boolean var2, List<rgP_2> var3, rzB_2 var4) {
      super(var1);
      this.break_ = var2;
      this.byte_ = ImmutableList.copyOf(var3);
      this.protected_ = var4;
   }

   private rcy_3 class_(rdn_3 var1, boolean var2) {
      rcd_3 var3;
      if (var1.final_()) {
         var3 = var1.package_();
      } else {
         if (!var2) {
            return null;
         }

         var3 = new rcd_3();
         var1.byte_(var3);
      }

      rcd_3 var4;
      if (var3.byte_("display", 10)) {
         var4 = var3.int_("display");
      } else {
         if (!var2) {
            return null;
         }

         var4 = new rcd_3();
         var3.class_("display", var4);
      }

      if (var4.byte_("Lore", 9)) {
         return var4.protected_("Lore", 8);
      } else if (var2) {
         rcy_3 var5 = new rcy_3();
         var4.class_("Lore", var5);
         return var5;
      } else {
         return null;
      }
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return this.protected_ != null ? ImmutableSet.of(this.protected_.class_()) : ImmutableSet.of();
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      rcy_3 var3 = this.class_(var1, !this.byte_.isEmpty());
      if (var3 != null) {
         if (this.break_) {
            var3.clear();
         }

         UnaryOperator var4 = rNi_1.class_(var2, this.protected_);
         this.byte_.stream().map(var4).map(rgB_2::class_).map(rca_3::class_).forEach(var3::add);
      }

      return var1;
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.super_;
   }
}
