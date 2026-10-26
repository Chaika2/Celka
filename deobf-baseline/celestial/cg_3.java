package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cg_3 {
   private static final Logger id_class = LogManager.getLogger();
   private static final Map<rJP<?>, cR_2<?, ?>> id_break = Maps.newHashMap();

   static {
      id_class(rJP.id_class, Fc_1::new);
      id_class(rJP.id_break, Fc_1::new);
      id_class(rJP.id_byte, Fc_1::new);
      id_class(rJP.id_protected, Fc_1::new);
      id_class(rJP.id_throws, Fc_1::new);
      id_class(rJP.id_case, Fc_1::new);
      id_class(rJP.id_catch, Fn_1::new);
      id_class(rJP.id_private, FO::new);
      id_class(rJP.id_implements, Fh_1::new);
      id_class(rJP.id_finally, Fz_1::new);
      id_class(rJP.id_extends, FQ::new);
      id_class(rJP.id_native, Fm_1::new);
      id_class(rJP.id_volatile, Zn_1::new);
      id_class(rJP.id_final, FC::new);
      id_class(rJP.id_package, Zj_1::new);
      id_class(rJP.id_int, ZV::new);
      id_class(rJP.id_new, Zi_1::new);
      id_class(rJP.id_continue, vP_2::new);
      id_class(rJP.id_super, Fy_1::new);
      id_class(rJP.id_this, Fq_1::new);
      id_class(rJP.id_else, FT::new);
      id_class(rJP.id_synchronized, Ft_1::new);
      id_class(rJP.id_return, FN::new);
      id_class(rJP.id_public, Fw_1::new);
   }

   private static <M extends rJr_1, U extends vm_3 & cl_3<M>> void id_class(rJP<? extends M> var0, cR_2<M, U> var1) {
      cR_2 var2 = id_break.put(var0, var1);
      if (var2 != null) {
         throw new IllegalStateException("Duplicate registration for " + rVL.G.id_break(var0));
      }
   }

   public static boolean id_class() {
      boolean var0 = false;

      for (rJP var2 : rVL.G) {
         if (!id_break.containsKey(var2)) {
            id_class.debug("Menu {} has no matching screen", rVL.G.id_break(var2));
            var0 = true;
         }
      }

      return var0;
   }

   public static <T extends rJr_1> void id_class(rJP<T> var0, QY var1, int var2, rgP_2 var3) {
      if (var0 == null) {
         id_class.warn("Trying to open invalid screen with name: {}", var3.getString());
      } else {
         cR_2 var4 = id_class(var0);
         if (var4 == null) {
            id_class.warn("Failed to create screen for menu type: {}", rVL.G.id_break(var0));
         } else {
            var4.id_class(var3, var0, var1, var2);
         }
      }
   }

   private static <T extends rJr_1> cR_2<T, ?> id_class(rJP<T> var0) {
      return (cR_2<T, ?>)id_break.get(var0);
   }
}
