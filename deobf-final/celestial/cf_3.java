package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cf_3 {
   private static final rpl_3 class_ = rpl_3.class_(32, rgc_3.class_);

   private static String class_(String var0) {
      return ((Qw_1)QY.instanceof_().class_[20]).short_ ? var0 : rgF_2.class_(var0);
   }

   public static List<rpl_3> class_(rgS_2 var0, int var1, cm_3 var2) {
      rgA_2 var3 = new rgA_2();
      var0.class_((var1x, var2x) -> {
         var3.class_(rgS_2.class_(class_(var2x), var1x));
         return Optional.empty();
      }, rgc_3.class_);
      ArrayList var4 = Lists.newArrayList();
      var2.break_().class_(var3.break_(), var1, rgc_3.class_, (var1x, var2x) -> {
         rpl_3 var3x = rgX_2.byte_().class_(var1x);
         var4.add(var2x ? rpl_3.class_(class_, var3x) : var3x);
      });
      return var4.isEmpty() ? Lists.newArrayList(new rpl_3[]{rpl_3.class_}) : var4;
   }
}
