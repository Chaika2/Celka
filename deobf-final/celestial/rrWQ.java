package celestial;

import java.util.Optional;

public class rrWQ<L, R> {
   private Optional<L> class_;
   private Optional<R> break_;

   private rrWQ(Optional<L> var1, Optional<R> var2) {
      this.class_ = var1;
      this.break_ = var2;
      if (!this.class_.isPresent() && !this.break_.isPresent()) {
         throw new IllegalArgumentException("Both left and right are not present");
      } else if (this.class_.isPresent() && this.break_.isPresent()) {
         throw new IllegalArgumentException("Both left and right are present");
      }
   }

   public static <L, R> rrWQ<L, R> class_(L var0) {
      return new rrWQ<>(Optional.of((L)var0), Optional.empty());
   }

   public Optional<L> class_() {
      return this.class_;
   }

   public static <L, R> rrWQ break_(R var0) {
      return new rrWQ<>(Optional.empty(), Optional.of(var0));
   }

   public Optional<R> break_() {
      return this.break_;
   }
}
