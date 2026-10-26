package celestial;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.stream.Stream;

public final class roy_3 {
   private final Object2BooleanMap<rhN_2> id_class = new Object2BooleanOpenHashMap();

   public boolean id_byte(rhN_2 var1) {
      return this.id_class.getOrDefault(var1, true);
   }

   public void id_class(long var1, long var3, rhN_2 var5) {
   }

   public void id_class(rhN_2 var1) {
      this.id_class.replace(var1, true);
   }

   public Stream<rhN_2> id_class(long var1) {
      return this.id_class.keySet().stream();
   }

   public void id_class(long var1, rhN_2 var3, boolean var4) {
      this.id_class.put(var3, var4);
   }

   public void id_class(long var1, rhN_2 var3) {
      this.id_class.removeBoolean(var3);
   }

   public void id_break(rhN_2 var1) {
      this.id_class.replace(var1, false);
   }

   public boolean id_protected(rhN_2 var1) {
      return this.id_class.getBoolean(var1);
   }
}
