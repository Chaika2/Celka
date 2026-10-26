package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dj_1 implements DI {
   private final Map<rCZ<?>, String> class_ = Maps.newHashMap();

   @SafeVarargs
   public final <T extends Comparable<T>> Dj_1 class_(rCZ<T> var1, T var2, T... var3) {
      this.class_(var1, break_(var1, (T)var2, (T[])var3));
      return this;
   }

   @Override
   public void class_(rCF<?, ?> var1) {
      List var2 = this.class_.keySet().stream().filter(var1x -> var1.class_(var1x.throws_()) != var1x).collect(Collectors.toList());
      if (!var2.isEmpty()) {
         throw new IllegalStateException("Properties " + var2 + " are missing from " + var1);
      }
   }

   private static <T extends Comparable<T>> String class_(rCZ<T> var0, Stream<T> var1) {
      return var1.<CharSequence>map(var0::class_).collect(Collectors.joining("|"));
   }

   public final <T extends Comparable<T>> Dj_1 class_(rCZ<T> var1, T var2) {
      this.class_(var1, var1.class_((T)var2));
      return this;
   }

   private <T extends Comparable<T>> void class_(rCZ<T> var1, String var2) {
      String var3 = this.class_.put(var1, var2);
      if (var3 != null) {
         throw new IllegalStateException("Tried to replace " + var1 + " value from " + var3 + " to " + var2);
      }
   }

   private static <T extends Comparable<T>> String break_(rCZ<T> var0, T var1, T[] var2) {
      return class_(var0, Stream.concat(Stream.of((T)var1), Stream.of((T[])var2)));
   }

   public JsonElement break_() {
      JsonObject var1 = new JsonObject();
      this.class_.forEach((var1x, var2) -> var1.addProperty(var1x.throws_(), var2));
      return var1;
   }
}
