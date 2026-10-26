package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RP<C> {
   private static final Logger id_break = LogManager.getLogger();
   public static final RP<rnW_2> id_class = new RP<rnW_2>().id_class(new gU_2()).id_class(new ga_3());
   private final Map<rqO_2, gK_2<C, ?>> id_byte = Maps.newHashMap();
   private final Map<Class<?>, gK_2<C, ?>> id_protected = Maps.newHashMap();

   public <T extends go_3<C>> rcd_3 id_class(T var1) {
      gK_2 var2 = this.id_class(var1.getClass());
      rcd_3 var3 = new rcd_3();
      var2.id_class(var3, (C)var1);
      var3.id_class("Type", var2.id_class().toString());
      return var3;
   }

   public go_3<C> id_class(rcd_3 var1) {
      rqO_2 var2 = rqO_2.id_break(var1.id_native("Type"));
      gK_2 var3 = this.id_byte.get(var2);
      if (var3 == null) {
         id_break.error("Failed to deserialize timer callback: " + var1);
         return null;
      } else {
         try {
            return var3.id_class(var1);
         } catch (Exception var5) {
            id_break.error("Failed to deserialize timer callback: " + var1, var5);
            return null;
         }
      }
   }

   public RP<C> id_class(gK_2<C, ?> var1) {
      this.id_byte.put(var1.id_class(), var1);
      this.id_protected.put(var1.id_break(), var1);
      return this;
   }

   private <T extends go_3<C>> gK_2<C, T> id_class(Class<?> var1) {
      return (gK_2<C, T>)this.id_protected.get(var1);
   }
}
