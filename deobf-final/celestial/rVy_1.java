package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVy_1 {
   protected static final Logger class_ = LogManager.getLogger();
   private static final Map<rqO_2, Supplier<?>> extends_ = Maps.newLinkedHashMap();
   private static final rVF<rVF<?>> native_ = new rVC<>(rqM_2.class_(new rqO_2("root")), Lifecycle.experimental());
   public static final rVL<? extends rVL<?>> break_ = native_;
   public static final rVL<rrSR<?>> byte_ = class_(rVL.m, () -> rrSY.int_);
   public static final rVL<rDM<?>> protected_ = class_(rVL.Z, () -> rDO.class_);
   public static final rVL<rDg_1<?, ?>> throws_ = class_(rVL.v, () -> rUx_1.rf);
   public static final rVL<reP_2<?, ?>> case_ = class_(rVL.F, () -> rrrF.break_);
   public static final rVL<rrPn_1> catch_ = class_(rVL.L, () -> rrPu_1.break_);
   public static final rVL<reu_3> private_ = class_(rVL.A, reZ_2::class_);
   public static final rVL<rYG> implements_ = class_(rVL.n, () -> rYC.class_);
   public static final rVL<rKW> finally_ = class_(rVL.u, rKW::implements_);

   static {
      extends_.forEach((var0, var1) -> {
         if (var1.get() == null) {
            class_.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      rVL.class_(native_);
   }

   public static void class_() {
   }

   private static <T> rVL<T> class_(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return class_(var0, new rVC<>(var0, var1), var2, var1);
   }

   private static <T> rVL<T> class_(rqM_2<? extends rVL<T>> var0, Supplier<T> var1) {
      return class_(var0, Lifecycle.stable(), var1);
   }

   private static <T, R extends rVF<T>> R class_(rqM_2<? extends rVL<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      rqO_2 var4 = var0.class_();
      extends_.put(var4, var2);
      rVF var5 = native_;
      return var5.class_(var0, (R)var1, var3);
   }

   public static <T> T class_(rVL<? super T> var0, String var1, T var2) {
      return class_(var0, new rqO_2(var1), (T)var2);
   }

   public static <V, T extends V> T class_(rVL<V> var0, rqO_2 var1, T var2) {
      return ((rVF)var0).class_(rqM_2.class_(var0.break_(), var1), (T)var2, Lifecycle.stable());
   }

   public static <V, T extends V> T class_(rVL<V> var0, int var1, rqM_2<V> var2, T var3) {
      return ((rVF)var0).class_(var1, var2, (T)var3, Lifecycle.stable());
   }
}
