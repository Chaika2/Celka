package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dj_1 implements DI {
   private final Map<rCZ<?>, String> id_class = Maps.newHashMap();

   @SafeVarargs
   public final <T extends Comparable<T>> Dj_1 id_class(rCZ<T> var1, T var2, T... var3) {
      this.id_class(var1, id_break(var1, (T)var2, (T[])var3));
      return this;
   }

   @Override
   public void id_class(rCF<?, ?> var1) {
      List var2 = this.id_class.keySet().stream().filter(var1x -> var1.id_class(var1x.id_throws()) != var1x).collect(Collectors.toList());
      if (!var2.isEmpty()) {
         throw new IllegalStateException("Properties " + var2 + " are missing from " + var1);
      }
   }

   private static <T extends Comparable<T>> String id_class(rCZ<T> var0, Stream<T> var1) {
      return var1.<CharSequence>map(var0::id_class).collect(Collectors.joining("|"));
   }

   public final <T extends Comparable<T>> Dj_1 id_class(rCZ<T> var1, T var2) {
      this.id_class(var1, var1.id_class((T)var2));
      return this;
   }

   private <T extends Comparable<T>> void id_class(rCZ<T> var1, String var2) {
      String var3 = this.id_class.put(var1, var2);
      if (var3 != null) {
         throw new IllegalStateException("Tried to replace " + var1 + " value from " + var3 + " to " + var2);
      }
   }

   private static <T extends Comparable<T>> String id_break(rCZ<T> var0, T var1, T[] var2) {
      return id_class(var0, Stream.concat(Stream.of((T)var1), Stream.of((T[])var2)));
   }

   public JsonElement id_break() {
      JsonObject var1 = new JsonObject();
      this.id_class.forEach((var1x, var2) -> var1.addProperty(var1x.id_throws(), var2));
      return var1;
   }
}
