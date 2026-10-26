package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Uz_1 {
   private static final Uz_1 id_class = new Uz_1(ImmutableList.of());
   private static final Comparator<rCv_1<?>> id_break = Comparator.comparing(var0 -> var0.id_class().id_throws());
   private final List<rCv_1<?>> id_byte;

   private Uz_1(List<rCv_1<?>> var1) {
      this.id_byte = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof Uz_1 && this.id_byte.equals(((Uz_1)var1).id_byte);
   }

   @Override
   public String toString() {
      return this.id_break();
   }

   @Override
   public int hashCode() {
      return this.id_byte.hashCode();
   }

   public Uz_1 id_class(rCv_1<?> var1) {
      return new Uz_1(ImmutableList.builder().addAll(this.id_byte).add(var1).build());
   }

   public static Uz_1 id_class() {
      return id_class;
   }

   public static Uz_1 id_class(rCv_1<?>... var0) {
      return new Uz_1(ImmutableList.copyOf(var0));
   }

   public Uz_1 id_class(Uz_1 var1) {
      return new Uz_1(ImmutableList.builder().addAll(this.id_byte).addAll(var1.id_byte).build());
   }

   public String id_break() {
      return this.id_byte.stream().sorted(id_break).map(rCv_1::toString).collect(Collectors.joining(","));
   }
}
