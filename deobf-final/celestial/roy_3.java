package celestial;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.stream.Stream;

public final class roy_3 {
   private final Object2BooleanMap<rhN_2> class_ = new Object2BooleanOpenHashMap();

   public boolean byte_(rhN_2 var1) {
      return this.class_.getOrDefault(var1, true);
   }

   public void class_(long var1, long var3, rhN_2 var5) {
   }

   public void class_(rhN_2 var1) {
      this.class_.replace(var1, true);
   }

   public Stream<rhN_2> class_(long var1) {
      return this.class_.keySet().stream();
   }

   public void class_(long var1, rhN_2 var3, boolean var4) {
      this.class_.put(var3, var4);
   }

   public void class_(long var1, rhN_2 var3) {
      this.class_.removeBoolean(var3);
   }

   public void break_(rhN_2 var1) {
      this.class_.replace(var1, false);
   }

   public boolean protected_(rhN_2 var1) {
      return this.class_.getBoolean(var1);
   }
}
