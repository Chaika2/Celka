package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cf_3 {
   private static final rpl_3 id_class = rpl_3.id_class(32, rgc_3.id_class);

   private static String id_class(String var0) {
      return ((Qw_1)QY.id_instanceof().id_class[20]).id_short ? var0 : rgF_2.id_class(var0);
   }

   public static List<rpl_3> id_class(rgS_2 var0, int var1, cm_3 var2) {
      rgA_2 var3 = new rgA_2();
      var0.id_class((var1x, var2x) -> {
         var3.id_class(rgS_2.id_class(id_class(var2x), var1x));
         return Optional.empty();
      }, rgc_3.id_class);
      ArrayList var4 = Lists.newArrayList();
      var2.id_break().id_class(var3.id_break(), var1, rgc_3.id_class, (var1x, var2x) -> {
         rpl_3 var3x = rgX_2.id_byte().id_class(var1x);
         var4.add(var2x ? rpl_3.id_class(id_class, var3x) : var3x);
      });
      return var4.isEmpty() ? Lists.newArrayList(new rpl_3[]{rpl_3.id_class}) : var4;
   }
}
