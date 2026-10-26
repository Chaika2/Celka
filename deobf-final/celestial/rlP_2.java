package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rlP_2 {
   protected final Object2IntMap<rCi_1<?>> class_ = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public rlP_2() {
      this.class_.defaultReturnValue(0);
   }

   public int class_(rCi_1<?> var1) {
      return this.class_.getInt(var1);
   }

   public <T> int class_(rlr_3<T> var1, T var2) {
      return var1.class_(var2) ? this.class_(var1.break_(var2)) : 0;
   }

   public void class_(rhd_3 var1, rCi_1<?> var2, int var3) {
      this.class_.put(var2, var3);
   }

   public void break_(rhd_3 var1, rCi_1<?> var2, int var3) {
      int var4 = (int)Math.min((long)this.class_(var2) + (long)var3, 2147483647L);
      this.class_(var1, var2, var4);
   }
}
