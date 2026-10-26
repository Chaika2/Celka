package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVy_1 {
   protected static final Logger id_class = LogManager.getLogger();
   private static final Map<rqO_2, Supplier<?>> id_extends = Maps.newLinkedHashMap();
   private static final rVF<rVF<?>> id_native = new rVC<>(rqM_2.id_class(new rqO_2("root")), Lifecycle.experimental());
   public static final rVL<? extends rVL<?>> id_break = id_native;
   public static final rVL<rrSR<?>> id_byte = id_class(rVL.m, () -> rrSY.id_int);
   public static final rVL<rDM<?>> id_protected = id_class(rVL.Z, () -> rDO.id_class);
   public static final rVL<rDg_1<?, ?>> id_throws = id_class(rVL.v, () -> rUx_1.rf);
   public static final rVL<reP_2<?, ?>> id_case = id_class(rVL.F, () -> rrrF.id_break);
   public static final rVL<rrPn_1> id_catch = id_class(rVL.L, () -> rrPu_1.id_break);
   public static final rVL<reu_3> id_private = id_class(rVL.A, reZ_2::id_class);
   public static final rVL<rYG> id_implements = id_class(rVL.n, () -> rYC.id_class);
   public static final rVL<rKW> id_finally = id_class(rVL.u, rKW::id_implements);

   static {
      id_extends.forEach((var0, var1) -> {
         if (var1.get() == null) {
            id_class.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      rVL.id_class(id_native);
   }

   public static void id_class() {
   }

   private static <T> rVL<T> id_class(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return id_class(var0, new rVC<>(var0, var1), var2, var1);
   }

   private static <T> rVL<T> id_class(rqM_2<? extends rVL<T>> var0, Supplier<T> var1) {
      return id_class(var0, Lifecycle.stable(), var1);
   }

   private static <T, R extends rVF<T>> R id_class(rqM_2<? extends rVL<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      rqO_2 var4 = var0.id_class();
      id_extends.put(var4, var2);
      rVF var5 = id_native;
      return var5.id_class(var0, (R)var1, var3);
   }

   public static <T> T id_class(rVL<? super T> var0, String var1, T var2) {
      return id_class(var0, new rqO_2(var1), (T)var2);
   }

   public static <V, T extends V> T id_class(rVL<V> var0, rqO_2 var1, T var2) {
      return ((rVF)var0).id_class(rqM_2.id_class(var0.id_break(), var1), (T)var2, Lifecycle.stable());
   }

   public static <V, T extends V> T id_class(rVL<V> var0, int var1, rqM_2<V> var2, T var3) {
      return ((rVF)var0).id_class(var1, var2, (T)var3, Lifecycle.stable());
   }
}
