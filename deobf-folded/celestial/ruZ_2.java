package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruZ_2 {
   private static final Logger id_break = LogManager.getLogger();
   public static rqM_2<rYB> id_class = null;

   protected static void id_class(ruS_2 var0) {
      if (var0 instanceof rvD_2) {
         ((yX_2)QY.id_instanceof().id_class[8]).id_else();
      }

      if (var0 instanceof rFP var1) {
         id_class = var1.id_byte();
      } else if (var0 instanceof rvZ_2 var2) {
         id_class = var2.id_finally();
      } else {
         id_class = null;
      }
   }

   public static <T extends ruB_2> void id_class(ruS_2<T> var0, T var1, rrEm_1 var2) throws ruT_2 {
      id_class(var0, var1, var2.id_const());
   }

   public static <T extends ruB_2> void id_class(ruS_2<T> var0, T var1, rTQ<?> var2) throws ruT_2 {
      if (!var2.rX()) {
         var2.execute(new rrzB_2(var0, () -> {
            id_class(var0);
            if (var1.id_class().id_case()) {
               var0.id_class(var1);
            } else {
               id_break.debug("Ignoring packet due to disconnection: " + var0);
            }
         }));
         throw ruT_2.id_class;
      } else {
         id_class(var0);
      }
   }
}
