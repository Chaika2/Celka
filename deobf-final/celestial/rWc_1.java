package celestial;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class rWc_1<T extends rkw_3<?>> implements rkf_3<T> {
   private final Function<rqO_2, T> synchronized_;

   public rWc_1(Function<rqO_2, T> var1) {
      this.synchronized_ = var1;
   }

   @Override
   public void class_(ruu_3 var1, T var2) {
   }

   @Override
   public T break_(rqO_2 var1, JsonObject var2) {
      return this.synchronized_.apply(var1);
   }

   @Override
   public T break_(rqO_2 var1, ruu_3 var2) {
      return this.synchronized_.apply(var1);
   }
}
