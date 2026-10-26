package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class iz_3 {
   private final Map<iJ_2, ic_3> class_ = Maps.newHashMap();
   private boolean break_;

   public iz_3 class_(iJ_2 var1, double var2) {
      ic_3 var4 = this.break_(var1);
      var4.class_(var2);
      return this;
   }

   public iW_2 class_() {
      this.break_ = true;
      return new iW_2(this.class_);
   }

   public iz_3 class_(iJ_2 var1) {
      this.break_(var1);
      return this;
   }

   private ic_3 break_(iJ_2 var1) {
      ic_3 var2 = new ic_3(var1, var2x -> {
         if (this.break_) {
            throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + rVL.O.break_(var1));
         }
      });
      this.class_.put(var1, var2);
      return var2;
   }
}
