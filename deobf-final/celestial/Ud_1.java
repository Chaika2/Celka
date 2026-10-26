package celestial;

import java.util.stream.Stream;

public class Ud_1<T> {
   private final rlM_2 class_;
   private final rVL<T> break_;
   private final String byte_;

   Ud_1(rlM_2 var1, rVL<T> var2, String var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @SafeVarargs
   public final Ud_1<T> class_(T... var1) {
      Stream.of(var1).map(this.break_::break_).forEach(var1x -> this.class_.class_(var1x, this.byte_));
      return this;
   }

   public Ud_1<T> class_(rlO_2<T> var1) {
      this.class_.break_(var1.break_(), this.byte_);
      return this;
   }

   public Ud_1<T> class_(T var1) {
      this.class_.class_(this.break_.break_((T)var1), this.byte_);
      return this;
   }
}
