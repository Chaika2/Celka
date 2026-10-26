package celestial;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

class rte_3 extends rtU_2 {
   rte_3(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.class_ = var3;
   }

   @Override
   protected String class_(String var1) {
      return (String)this.class_.apply(var1);
   }
}
