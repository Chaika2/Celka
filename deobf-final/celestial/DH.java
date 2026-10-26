package celestial;

import com.google.gson.JsonObject;
import java.util.List;

class DH extends Dy_1 {
   private final DI class_;

   DH(DI var1, List<DS> var2) {
      super(var2);
      this.class_ = var1;
   }

   @Override
   public void class_(rCF<?, ?> var1) {
      this.class_.class_(var1);
   }

   @Override
   public void class_(JsonObject var1) {
      var1.add("when", this.class_.get());
   }
}
