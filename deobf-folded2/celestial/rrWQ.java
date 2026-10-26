package celestial;

import java.util.Optional;

public class rrWQ<L, R> {
   private Optional<L> id_class;
   private Optional<R> id_break;

   private rrWQ(Optional<L> var1, Optional<R> var2) {
      this.id_class = var1;
      this.id_break = var2;
      if (!this.id_class.isPresent() && !this.id_break.isPresent()) {
         throw new IllegalArgumentException("Both left and right are not present");
      } else if (this.id_class.isPresent() && this.id_break.isPresent()) {
         throw new IllegalArgumentException("Both left and right are present");
      }
   }

   public static <L, R> rrWQ<L, R> id_class(L var0) {
      return new rrWQ<>(Optional.of((L)var0), Optional.empty());
   }

   public Optional<L> id_class() {
      return this.id_class;
   }

   public static <L, R> rrWQ id_break(R var0) {
      return new rrWQ<>(Optional.empty(), Optional.of(var0));
   }

   public Optional<R> id_break() {
      return this.id_break;
   }
}
