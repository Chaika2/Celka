package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Dd_1 {
   private final Map<Uz_1, List<DS>> id_class = Maps.newHashMap();

   private void id_byte() {
      List var1 = this.id_break();
      Stream var2 = Stream.of(Uz_1.id_class());

      for (rCZ var4 : var1) {
         var2 = var2.flatMap(var1x -> var4.id_byte().map(var1x::id_class));
      }

      List var5 = var2.filter(var1x -> !this.id_class.containsKey(var1x)).collect(Collectors.toList());
      if (!var5.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + var5);
      }
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> DN<T1, T2, T3> id_class(
      rCZ<T1> var0, rCZ<T2> var1, rCZ<T3> var2
   ) {
      return new DN<>(var0, var1, var2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> DW<T1, T2, T3, T4> id_class(
      rCZ<T1> var0, rCZ<T2> var1, rCZ<T3> var2, rCZ<T4> var3
   ) {
      return new DW<>(var0, var1, var2, var3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> Dk_1<T1, T2, T3, T4, T5> id_class(
      rCZ<T1> var0, rCZ<T2> var1, rCZ<T3> var2, rCZ<T4> var3, rCZ<T5> var4
   ) {
      return new Dk_1<>(var0, var1, var2, var3, var4);
   }

   Map<Uz_1, List<DS>> id_class() {
      this.id_byte();
      return ImmutableMap.copyOf(this.id_class);
   }

   protected void id_class(Uz_1 var1, List<DS> var2) {
      List var3 = this.id_class.put(var1, var2);
      if (var3 != null) {
         throw new IllegalStateException("Value " + var1 + " is already defined");
      }
   }

   public static <T1 extends Comparable<T1>> DQ<T1> id_class(rCZ<T1> var0) {
      return new DQ<>(var0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> Dc_1<T1, T2> id_class(rCZ<T1> var0, rCZ<T2> var1) {
      return new Dc_1<>(var0, var1);
   }

   abstract List<rCZ<?>> id_break();
}
