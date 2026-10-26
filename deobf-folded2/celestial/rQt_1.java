package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQt_1 implements rQz_1 {
   final ev_3 id_class;
   final float[] id_break;

   rQt_1(ev_3 var1, float[] var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(rzr_3 var1) {
      rdn_3 var2 = var1.id_break(rzQ_2.id_implements);
      int var3 = var2 != null ? eA_2.id_class(this.id_class, var2) : 0;
      float var4 = this.id_break[Math.min(var3, this.id_break.length - 1)];
      return var1.id_class().nextFloat() < var4;
   }

   public static rQQ id_class(ev_3 var0, float... var1) {
      return () -> new rQt_1(var0, var1);
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_implements);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_finally;
   }
}
