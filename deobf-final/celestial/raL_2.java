package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class raL_2 {
   static final rqO_2 class_ = new rqO_2("igloo/top");
   private static final rqO_2 break_ = new rqO_2("igloo/middle");
   private static final rqO_2 byte_ = new rqO_2("igloo/bottom");
   static final Map<rqO_2, rfH_2> protected_ = ImmutableMap.of(class_, new rfH_2(3, 5, 5), break_, new rfH_2(1, 3, 1), byte_, new rfH_2(3, 6, 7));
   static final Map<rqO_2, rfH_2> throws_ = ImmutableMap.of(class_, rfH_2.protected_, break_, new rfH_2(2, -3, 4), byte_, new rfH_2(0, -3, -2));

   public static void class_(rrPt_1 var0, rfH_2 var1, rqd_3 var2, List<rrrn_1> var3, Random var4) {
      if (var4.nextDouble() < 0.5) {
         int var5 = var4.nextInt(8) + 4;
         var3.add(new raA_2(var0, byte_, var1, var2, var5 * 3));

         for (int var6 = 0; var6 < var5 - 1; var6++) {
            var3.add(new raA_2(var0, break_, var1, var2, var6 * 3));
         }
      }

      var3.add(new raA_2(var0, class_, var1, var2, 0));
   }
}
