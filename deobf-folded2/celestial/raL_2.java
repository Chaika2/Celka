package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class raL_2 {
   static final rqO_2 id_class = new rqO_2("igloo/top");
   private static final rqO_2 id_break = new rqO_2("igloo/middle");
   private static final rqO_2 id_byte = new rqO_2("igloo/bottom");
   static final Map<rqO_2, rfH_2> id_protected = ImmutableMap.of(id_class, new rfH_2(3, 5, 5), id_break, new rfH_2(1, 3, 1), id_byte, new rfH_2(3, 6, 7));
   static final Map<rqO_2, rfH_2> id_throws = ImmutableMap.of(id_class, rfH_2.id_protected, id_break, new rfH_2(2, -3, 4), id_byte, new rfH_2(0, -3, -2));

   public static void id_class(rrPt_1 var0, rfH_2 var1, rqd_3 var2, List<rrrn_1> var3, Random var4) {
      if (var4.nextDouble() < 0.5) {
         int var5 = var4.nextInt(8) + 4;
         var3.add(new raA_2(var0, id_byte, var1, var2, var5 * 3));

         for (int var6 = 0; var6 < var5 - 1; var6++) {
            var3.add(new raA_2(var0, id_break, var1, var2, var6 * 3));
         }
      }

      var3.add(new raA_2(var0, id_class, var1, var2, 0));
   }
}
