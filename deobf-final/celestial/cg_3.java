package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cg_3 {
   private static final Logger class_ = LogManager.getLogger();
   private static final Map<rJP<?>, cR_2<?, ?>> break_ = Maps.newHashMap();

   static {
      class_(rJP.class_, Fc_1::new);
      class_(rJP.break_, Fc_1::new);
      class_(rJP.byte_, Fc_1::new);
      class_(rJP.protected_, Fc_1::new);
      class_(rJP.throws_, Fc_1::new);
      class_(rJP.case_, Fc_1::new);
      class_(rJP.catch_, Fn_1::new);
      class_(rJP.private_, FO::new);
      class_(rJP.implements_, Fh_1::new);
      class_(rJP.finally_, Fz_1::new);
      class_(rJP.extends_, FQ::new);
      class_(rJP.native_, Fm_1::new);
      class_(rJP.volatile_, Zn_1::new);
      class_(rJP.final_, FC::new);
      class_(rJP.package_, Zj_1::new);
      class_(rJP.int_, ZV::new);
      class_(rJP.new_, Zi_1::new);
      class_(rJP.continue_, vP_2::new);
      class_(rJP.super_, Fy_1::new);
      class_(rJP.this_, Fq_1::new);
      class_(rJP.else_, FT::new);
      class_(rJP.synchronized_, Ft_1::new);
      class_(rJP.return_, FN::new);
      class_(rJP.public_, Fw_1::new);
   }

   private static <M extends rJr_1, U extends vm_3 & cl_3<M>> void class_(rJP<? extends M> var0, cR_2<M, U> var1) {
      cR_2 var2 = break_.put(var0, var1);
      if (var2 != null) {
         throw new IllegalStateException("Duplicate registration for " + rVL.G.break_(var0));
      }
   }

   public static boolean class_() {
      boolean var0 = false;

      for (rJP var2 : rVL.G) {
         if (!break_.containsKey(var2)) {
            class_.debug("Menu {} has no matching screen", rVL.G.break_(var2));
            var0 = true;
         }
      }

      return var0;
   }

   public static <T extends rJr_1> void class_(rJP<T> var0, QY var1, int var2, rgP_2 var3) {
      if (var0 == null) {
         class_.warn("Trying to open invalid screen with name: {}", var3.getString());
      } else {
         cR_2 var4 = class_(var0);
         if (var4 == null) {
            class_.warn("Failed to create screen for menu type: {}", rVL.G.break_(var0));
         } else {
            var4.class_(var3, var0, var1, var2);
         }
      }
   }

   private static <T extends rJr_1> cR_2<T, ?> class_(rJP<T> var0) {
      return (cR_2<T, ?>)break_.get(var0);
   }
}
