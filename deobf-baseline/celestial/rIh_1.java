package celestial;

import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class rIh_1 extends rIx_1 {
   public rIh_1(Schema var1, boolean var2) {
      super("EntityTippedArrowFix", var1, var2);
   }

   @Override
   protected String id_class(String var1) {
      return Objects.equals(var1, "TippedArrow") ? "Arrow" : var1;
   }
}
