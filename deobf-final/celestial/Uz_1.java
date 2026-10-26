package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Uz_1 {
   private static final Uz_1 class_ = new Uz_1(ImmutableList.of());
   private static final Comparator<rCv_1<?>> break_ = Comparator.comparing(var0 -> var0.class_().throws_());
   private final List<rCv_1<?>> byte_;

   private Uz_1(List<rCv_1<?>> var1) {
      this.byte_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof Uz_1 && this.byte_.equals(((Uz_1)var1).byte_);
   }

   @Override
   public String toString() {
      return this.break_();
   }

   @Override
   public int hashCode() {
      return this.byte_.hashCode();
   }

   public Uz_1 class_(rCv_1<?> var1) {
      return new Uz_1(ImmutableList.builder().addAll(this.byte_).add(var1).build());
   }

   public static Uz_1 class_() {
      return class_;
   }

   public static Uz_1 class_(rCv_1<?>... var0) {
      return new Uz_1(ImmutableList.copyOf(var0));
   }

   public Uz_1 class_(Uz_1 var1) {
      return new Uz_1(ImmutableList.builder().addAll(this.byte_).addAll(var1.byte_).build());
   }

   public String break_() {
      return this.byte_.stream().sorted(break_).map(rCv_1::toString).collect(Collectors.joining(","));
   }
}
