package celestial;

import java.util.function.Consumer;

public class DF {
   final rWc_1<?> class_;

   public DF(rWc_1<?> var1) {
      this.class_ = var1;
   }

   public static DF class_(rWc_1<?> var0) {
      return new DF(var0);
   }

   public void class_(Consumer<Dw_1> var1, String var2) {
      var1.accept(new DL(this, var2));
   }
}
