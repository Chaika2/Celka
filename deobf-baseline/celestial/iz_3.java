package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class iz_3 {
   private final Map<iJ_2, ic_3> id_class = Maps.newHashMap();
   private boolean id_break;

   public iz_3 id_class(iJ_2 var1, double var2) {
      ic_3 var4 = this.id_break(var1);
      var4.id_class(var2);
      return this;
   }

   public iW_2 id_class() {
      this.id_break = true;
      return new iW_2(this.id_class);
   }

   public iz_3 id_class(iJ_2 var1) {
      this.id_break(var1);
      return this;
   }

   private ic_3 id_break(iJ_2 var1) {
      ic_3 var2 = new ic_3(var1, var2x -> {
         if (this.id_break) {
            throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + rVL.O.id_break(var1));
         }
      });
      this.id_class.put(var1, var2);
      return var2;
   }
}
