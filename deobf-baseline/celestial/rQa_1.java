package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQa_1 extends rzO_2 {
   final xd_3 id_break;
   final Set<rCZ<?>> id_byte;

   rQa_1(rQz_1[] var1, xd_3 var2, Set<rCZ<?>> var3) {
      super(var1);
      this.id_break = var2;
      this.id_byte = var3;
   }

   public static rQi_1 id_class(xd_3 var0) {
      return new rQi_1(var0);
   }

   private static <T extends Comparable<T>> String id_class(xc_3 var0, rCZ<T> var1) {
      Comparable var2 = var0.id_byte(var1);
      return var1.id_class((T)var2);
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_catch);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_synchronized;
   }

   @Override
   protected rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      xc_3 var3 = var2.id_break(rzQ_2.id_catch);
      if (var3 != null) {
         rcd_3 var4 = var1.id_int();
         rcd_3 var5;
         if (var4.id_byte("BlockStateTag", 10)) {
            var5 = var4.id_int("BlockStateTag");
         } else {
            var5 = new rcd_3();
            var4.id_class("BlockStateTag", var5);
         }

         this.id_byte.stream().filter(var3::id_break).forEach(var2x -> var5.id_class(var2x.id_throws(), id_class(var3, (rCZ<?>)var2x)));
      }

      return var1;
   }
}
