package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Random;
import java.util.Set;

public class rQq_1 implements rQz_1 {
   static final rQq_1 id_class = new rQq_1();

   public static rQQ id_byte() {
      return () -> id_class;
   }

   private rQq_1() {
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_finally);
   }

   public boolean id_class(rzr_3 var1) {
      Float var2 = var1.id_break(rzQ_2.id_finally);
      if (var2 != null) {
         Random var3 = var1.id_class();
         float var4 = 1.0F / var2;
         return var3.nextFloat() <= var4;
      } else {
         return true;
      }
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_extends;
   }
}
