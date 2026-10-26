package celestial;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Io_1 {
   private static final Logger byte_ = LogManager.getLogger();
   public static final EnumMap<rpr_3, rjo_3> class_ = rqR_2.class_(Maps.newEnumMap(rpr_3.class), var0 -> {
      var0.put(rpr_3.SOUTH, rjo_3.class_());
      var0.put(rpr_3.EAST, new rjo_3((rje_3)null, new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), 90.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.WEST, new rjo_3((rje_3)null, new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), -90.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.NORTH, new rjo_3((rje_3)null, new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), 180.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.UP, new rjo_3((rje_3)null, new rjY_2(new rje_3(1.0F, 0.0F, 0.0F), -90.0F, true), (rje_3)null, (rjY_2)null));
      var0.put(rpr_3.DOWN, new rjo_3((rje_3)null, new rjY_2(new rje_3(1.0F, 0.0F, 0.0F), 90.0F, true), (rje_3)null, (rjY_2)null));
   });
   public static final EnumMap<rpr_3, rjo_3> break_ = rqR_2.class_(Maps.newEnumMap(rpr_3.class), var0 -> {
      for (rpr_3 var4 : rpr_3.values()) {
         var0.put(var4, class_.get(var4).break_());
      }
   });

   public static rjo_3 class_(rjo_3 var0) {
      rjV_2 var1 = rjV_2.case_(0.5F, 0.5F, 0.5F);
      var1.class_(var0.byte_());
      var1.class_(rjV_2.case_(-0.5F, -0.5F, -0.5F));
      return new rjo_3(var1);
   }

   public static rjo_3 class_(rjo_3 var0, rpr_3 var1, Supplier<String> var2) {
      rpr_3 var3 = rpr_3.class_(var0.byte_(), var1);
      rjo_3 var4 = var0.break_();
      if (var4 == null) {
         byte_.warn((String)var2.get());
         return new rjo_3((rje_3)null, (rjY_2)null, new rje_3(0.0F, 0.0F, 0.0F), (rjY_2)null);
      } else {
         rjo_3 var5 = break_.get(var1).class_(var4).class_(class_.get(var3));
         return class_(var5);
      }
   }
}
