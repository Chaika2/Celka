package celestial;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Io_1 {
   private static final Logger id_byte = LogManager.getLogger();
   public static final EnumMap<rpr_3, rjo_3> id_class = rqR_2.id_class(Maps.newEnumMap(rpr_3.class), var0 -> {
      var0.put(rpr_3.SOUTH, rjo_3.id_class());
      var0.put(rpr_3.EAST, new rjo_3((rje_3)null, new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), 90.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.WEST, new rjo_3((rje_3)null, new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), -90.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.NORTH, new rjo_3((rje_3)null, new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), 180.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.UP, new rjo_3((rje_3)null, new rjY_2(new rje_3(1.0F, 0.0F, 0.0F), -90.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.DOWN, new rjo_3((rje_3)null, new rjY_2(new rje_3(1.0F, 0.0F, 0.0F), 90.0F, true), (rje_3)null, (rjY_2)null));
   });
   public static final EnumMap<rpr_3, rjo_3> id_break = rqR_2.id_class(Maps.newEnumMap(rpr_3.class), var0 -> {
      for (rpr_3 var4 : rpr_3.values()) {
         var0.put(var4, id_class.get(var4).id_break());
      }
   });

   public static rjo_3 id_class(rjo_3 var0) {
      rjV_2 var1 = rjV_2.id_case(0.5F, 0.5F, 0.5F);
      var1.id_class(var0.id_byte());
      var1.id_class(rjV_2.id_case(-0.5F, -0.5F, -0.5F));
      return new rjo_3(var1);
   }

   public static rjo_3 id_class(rjo_3 var0, rpr_3 var1, Supplier<String> var2) {
      rpr_3 var3 = rpr_3.id_class(var0.id_byte(), var1);
      rjo_3 var4 = var0.id_break();
      if (var4 == null) {
         id_byte.warn((String)var2.get());
         return new rjo_3((rje_3)null, (rjY_2)null, new rje_3(0.0F, 0.0F, 0.0F), (rjY_2)null);
      } else {
         rjo_3 var5 = id_break.get(var1).id_class(var4).id_class(id_class.get(var3));
         return id_class(var5);
      }
   }
}
