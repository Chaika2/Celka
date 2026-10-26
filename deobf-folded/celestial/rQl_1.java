package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQl_1 implements rQz_1 {
   final float id_class;
   final float id_break;

   rQl_1(float var1, float var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(rzr_3 var1) {
      an_3 var2 = var1.id_break(rzQ_2.id_protected);
      int var3 = 0;
      if (var2 instanceof iB_2) {
         var3 = eA_2.id_catch((iB_2)var2);
      }

      return var1.id_class().nextFloat() < this.id_class + (float)var3 * this.id_break;
   }

   public static rQQ id_class(float var0, float var1) {
      return () -> new rQl_1(var0, var1);
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_protected);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_protected;
   }
}
