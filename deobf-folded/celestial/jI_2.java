package celestial;

import com.google.common.collect.Lists;
import java.util.IllegalFormatException;

public class jI_2 {
   private static volatile rgX_2 id_class = rgX_2.id_byte();

   public static String id_class(rgX_2 var0, String var1, Object... var2) {
      String var3 = var0.id_class(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   public static boolean id_class(String var0) {
      return id_class.id_break(var0);
   }

   public static String id_class(String var0, String var1, Object... var2) {
      rAL var3 = rrbb_3.x();
      jj_3 var4 = jV_2.id_class(var3.id_break()).getOrDefault(var0, jV_2.id_class);
      jC_2 var5 = jC_2.id_class(var3, Lists.newArrayList(new jj_3[]{var4}));
      return id_class(var5, var1, var2);
   }

   static void id_class(rgX_2 var0) {
      id_class = var0;
   }

   public static String id_class(String var0, Object... var1) {
      return id_class(id_class, var0, var1);
   }
}
