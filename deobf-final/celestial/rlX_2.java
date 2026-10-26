package celestial;

import com.google.gson.JsonArray;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlX_2 implements rlh_3 {
   private final rqO_2 class_;

   public rlX_2(rqO_2 var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return this.class_.toString();
   }

   @Override
   public <T> boolean class_(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2, Consumer<T> var3) {
      Object var4 = var2.apply(this.class_);
      if (var4 == null) {
         return false;
      } else {
         var3.accept(var4);
         return true;
      }
   }

   @Override
   public void class_(JsonArray var1) {
      var1.add(this.class_.toString());
   }
}
