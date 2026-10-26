package celestial;

import java.util.stream.Stream;

public class Ud_1<T> {
   private final rlM_2 id_class;
   private final rVL<T> id_break;
   private final String id_byte;

   Ud_1(rlM_2 var1, rVL<T> var2, String var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @SafeVarargs
   public final Ud_1<T> id_class(T... var1) {
      Stream.of(var1).map(this.id_break::id_break).forEach(var1x -> this.id_class.id_class(var1x, this.id_byte));
      return this;
   }

   public Ud_1<T> id_class(rlO_2<T> var1) {
      this.id_class.id_break(var1.id_break(), this.id_byte);
      return this;
   }

   public Ud_1<T> id_class(T var1) {
      this.id_class.id_class(this.id_break.id_break((T)var1), this.id_byte);
      return this;
   }
}
