package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class rND extends rzO_2 {
   final boolean id_break;
   final List<rgP_2> id_byte;
   final rzB_2 id_protected;

   public rND(rQz_1[] var1, boolean var2, List<rgP_2> var3, rzB_2 var4) {
      super(var1);
      this.id_break = var2;
      this.id_byte = ImmutableList.copyOf(var3);
      this.id_protected = var4;
   }

   private rcy_3 id_class(rdn_3 var1, boolean var2) {
      rcd_3 var3;
      if (var1.id_final()) {
         var3 = var1.id_package();
      } else {
         if (!var2) {
            return null;
         }

         var3 = new rcd_3();
         var1.id_byte(var3);
      }

      rcd_3 var4;
      if (var3.id_byte("display", 10)) {
         var4 = var3.id_int("display");
      } else {
         if (!var2) {
            return null;
         }

         var4 = new rcd_3();
         var3.id_class("display", var4);
      }

      if (var4.id_byte("Lore", 9)) {
         return var4.id_protected("Lore", 8);
      } else if (var2) {
         rcy_3 var5 = new rcy_3();
         var4.id_class("Lore", var5);
         return var5;
      } else {
         return null;
      }
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return this.id_protected != null ? ImmutableSet.of(this.id_protected.id_class()) : ImmutableSet.of();
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      rcy_3 var3 = this.id_class(var1, !this.id_byte.isEmpty());
      if (var3 != null) {
         if (this.id_break) {
            var3.clear();
         }

         UnaryOperator var4 = rNi_1.id_class(var2, this.id_protected);
         this.id_byte.stream().map(var4).map(rgB_2::id_class).map(rca_3::id_class).forEach(var3::add);
      }

      return var1;
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_super;
   }
}
