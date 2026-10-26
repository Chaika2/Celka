package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruZ_2 {
   private static final Logger break_ = LogManager.getLogger();
   public static rqM_2<rYB> class_ = null;

   protected static void class_(ruS_2 var0) {
      if (var0 instanceof rvD_2) {
         ((yX_2)QY.instanceof_().class_[8]).else_();
      }

      if (var0 instanceof rFP var1) {
         class_ = var1.byte_();
      } else if (var0 instanceof rvZ_2 var2) {
         class_ = var2.finally_();
      } else {
         class_ = null;
      }
   }

   public static <T extends ruB_2> void class_(ruS_2<T> var0, T var1, rrEm_1 var2) throws ruT_2 {
      class_(var0, var1, var2.const_());
   }

   public static <T extends ruB_2> void class_(ruS_2<T> var0, T var1, rTQ<?> var2) throws ruT_2 {
      if (!var2.rX()) {
         var2.execute(new rrzB_2(var0, () -> {
            class_(var0);
            if (var1.class_().case_()) {
               var0.class_(var1);
            } else {
               break_.debug("Ignoring packet due to disconnection: " + var0);
            }
         }));
         throw ruT_2.class_;
      } else {
         class_(var0);
      }
   }
}
