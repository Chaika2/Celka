package celestial;

import com.google.common.collect.Lists;
import java.util.IllegalFormatException;

public class jI_2 {
   private static volatile rgX_2 class_ = rgX_2.byte_();

   public static String class_(rgX_2 var0, String var1, Object... var2) {
      String var3 = var0.class_(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   public static boolean class_(String var0) {
      return class_.break_(var0);
   }

   public static String class_(String var0, String var1, Object... var2) {
      rAL var3 = rrbb_3.x();
      jj_3 var4 = jV_2.class_(var3.break_()).getOrDefault(var0, jV_2.class_);
      jC_2 var5 = jC_2.class_(var3, Lists.newArrayList(new jj_3[]{var4}));
      return class_(var5, var1, var2);
   }

   static void class_(rgX_2 var0) {
      class_ = var0;
   }

   public static String class_(String var0, Object... var1) {
      return class_(class_, var0, var1);
   }
}
