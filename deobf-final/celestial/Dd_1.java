package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Dd_1 {
   private final Map<Uz_1, List<DS>> class_ = Maps.newHashMap();

   private void byte_() {
      List var1 = this.break_();
      Stream var2 = Stream.of(Uz_1.class_());

      for (rCZ var4 : var1) {
         var2 = var2.flatMap(var1x -> var4.byte_().map(var1x::class_));
      }

      List var5 = var2.filter(var1x -> !this.class_.containsKey(var1x)).collect(Collectors.toList());
      if (!var5.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + var5);
      }
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> DN<T1, T2, T3> class_(
      rCZ<T1> var0, rCZ<T2> var1, rCZ<T3> var2
   ) {
      return new DN<>(var0, var1, var2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> DW<T1, T2, T3, T4> class_(
      rCZ<T1> var0, rCZ<T2> var1, rCZ<T3> var2, rCZ<T4> var3
   ) {
      return new DW<>(var0, var1, var2, var3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> Dk_1<T1, T2, T3, T4, T5> class_(
      rCZ<T1> var0, rCZ<T2> var1, rCZ<T3> var2, rCZ<T4> var3, rCZ<T5> var4
   ) {
      return new Dk_1<>(var0, var1, var2, var3, var4);
   }

   Map<Uz_1, List<DS>> class_() {
      this.byte_();
      return ImmutableMap.copyOf(this.class_);
   }

   protected void class_(Uz_1 var1, List<DS> var2) {
      List var3 = this.class_.put(var1, var2);
      if (var3 != null) {
         throw new IllegalStateException("Value " + var1 + " is already defined");
      }
   }

   public static <T1 extends Comparable<T1>> DQ<T1> class_(rCZ<T1> var0) {
      return new DQ<>(var0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> Dc_1<T1, T2> class_(rCZ<T1> var0, rCZ<T2> var1) {
      return new Dc_1<>(var0, var1);
   }

   abstract List<rCZ<?>> break_();
}
