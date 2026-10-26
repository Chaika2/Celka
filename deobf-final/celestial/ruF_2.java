package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;

class ruF_2<T extends ruB_2> {
   private final Object2IntMap<Class<? extends ruS_2<T>>> class_ = rqR_2.class_(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
   private final List<Supplier<? extends ruS_2<T>>> break_ = Lists.newArrayList();

   public ruS_2<?> class_(int var1) {
      Supplier var2 = this.break_.get(var1);
      return var2 != null ? (ruS_2)var2.get() : null;
   }

   public Iterable<Class<? extends ruS_2<?>>> class_() {
      return Iterables.unmodifiableIterable(this.class_.keySet());
   }

   public Integer class_(Class<?> var1) {
      int var2 = this.class_.getInt(var1);
      return var2 == -1 ? null : var2;
   }

   public <P extends ruS_2<T>> ruF_2<T> class_(Class<P> var1, Supplier<P> var2) {
      int var3 = this.break_.size();
      int var4 = this.class_.put(var1, var3);
      if (var4 != -1) {
         String var5 = "Packet " + var1 + " is already registered to ID " + var4;
         LogManager.getLogger().fatal(var5);
         throw new IllegalArgumentException(var5);
      } else {
         this.break_.add(var2);
         return this;
      }
   }
}
