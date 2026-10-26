package celestial;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

class rTi_1 extends rTa_1 {
   rTi_1(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.id_class = var3;
   }

   @Override
   protected String id_class(String var1) {
      return (String)this.id_class.apply(var1);
   }
}
