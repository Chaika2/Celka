package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rlP_2 {
   protected final Object2IntMap<rCi_1<?>> id_class = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public rlP_2() {
      this.id_class.defaultReturnValue(0);
   }

   public int id_class(rCi_1<?> var1) {
      return this.id_class.getInt(var1);
   }

   public <T> int id_class(rlr_3<T> var1, T var2) {
      return var1.id_class(var2) ? this.id_class(var1.id_break(var2)) : 0;
   }

   public void id_class(rhd_3 var1, rCi_1<?> var2, int var3) {
      this.id_class.put(var2, var3);
   }

   public void id_break(rhd_3 var1, rCi_1<?> var2, int var3) {
      int var4 = (int)Math.min((long)this.id_class(var2) + (long)var3, 2147483647L);
      this.id_class(var1, var2, var4);
   }
}
