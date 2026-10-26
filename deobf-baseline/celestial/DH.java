package celestial;

import com.google.gson.JsonObject;
import java.util.List;

class DH extends Dy_1 {
   private final DI id_class;

   DH(DI var1, List<DS> var2) {
      super(var2);
      this.id_class = var1;
   }

   @Override
   public void id_class(rCF<?, ?> var1) {
      this.id_class.id_class(var1);
   }

   @Override
   public void id_class(JsonObject var1) {
      var1.add("when", this.id_class.get());
   }
}
