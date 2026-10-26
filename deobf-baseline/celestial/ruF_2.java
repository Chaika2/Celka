package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;

class ruF_2<T extends ruB_2> {
   private final Object2IntMap<Class<? extends ruS_2<T>>> id_class = rqR_2.id_class(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
   private final List<Supplier<? extends ruS_2<T>>> id_break = Lists.newArrayList();

   public ruS_2<?> id_class(int var1) {
      Supplier var2 = this.id_break.get(var1);
      return var2 != null ? (ruS_2)var2.get() : null;
   }

   public Iterable<Class<? extends ruS_2<?>>> id_class() {
      return Iterables.unmodifiableIterable(this.id_class.keySet());
   }

   public Integer id_class(Class<?> var1) {
      int var2 = this.id_class.getInt(var1);
      return var2 == -1 ? null : var2;
   }

   public <P extends ruS_2<T>> ruF_2<T> id_class(Class<P> var1, Supplier<P> var2) {
      int var3 = this.id_break.size();
      int var4 = this.id_class.put(var1, var3);
      if (var4 != -1) {
         String var5 = "Packet " + var1 + " is already registered to ID " + var4;
         LogManager.getLogger().fatal(var5);
         throw new IllegalArgumentException(var5);
      } else {
         this.id_break.add(var2);
         return this;
      }
   }
}
