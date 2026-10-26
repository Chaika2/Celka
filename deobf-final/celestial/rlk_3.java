package celestial;

import com.google.gson.JsonArray;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlk_3 implements rlh_3 {
   private final rqO_2 class_;

   public rlk_3(rqO_2 var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return "#" + this.class_;
   }

   @Override
   public <T> boolean class_(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2, Consumer<T> var3) {
      rlb_3 var4 = (rlb_3)var1.apply(this.class_);
      if (var4 == null) {
         return false;
      } else {
         var4.class_().forEach(var3);
         return true;
      }
   }

   @Override
   public void class_(JsonArray var1) {
      var1.add("#" + this.class_);
   }
}
