package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RP<C> {
   private static final Logger break_ = LogManager.getLogger();
   public static final RP<rnW_2> class_ = new RP<rnW_2>().class_(new gU_2()).class_(new ga_3());
   private final Map<rqO_2, gK_2<C, ?>> byte_ = Maps.newHashMap();
   private final Map<Class<?>, gK_2<C, ?>> protected_ = Maps.newHashMap();

   public <T extends go_3<C>> rcd_3 class_(T var1) {
      gK_2 var2 = this.class_(var1.getClass());
      rcd_3 var3 = new rcd_3();
      var2.class_(var3, (C)var1);
      var3.class_("Type", var2.class_().toString());
      return var3;
   }

   public go_3<C> class_(rcd_3 var1) {
      rqO_2 var2 = rqO_2.break_(var1.native_("Type"));
      gK_2 var3 = this.byte_.get(var2);
      if (var3 == null) {
         break_.error("Failed to deserialize timer callback: " + var1);
         return null;
      } else {
         try {
            return var3.class_(var1);
         } catch (Exception var5) {
            break_.error("Failed to deserialize timer callback: " + var1, var5);
            return null;
         }
      }
   }

   public RP<C> class_(gK_2<C, ?> var1) {
      this.byte_.put(var1.class_(), var1);
      this.protected_.put(var1.break_(), var1);
      return this;
   }

   private <T extends go_3<C>> gK_2<C, T> class_(Class<?> var1) {
      return (gK_2<C, T>)this.protected_.get(var1);
   }
}
