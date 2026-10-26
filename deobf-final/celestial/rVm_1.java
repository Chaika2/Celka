package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rVm_1 {
   private static final Logger class_ = LogManager.getLogger();
   static final Map<rqM_2<? extends rVL<?>>, rVZ<?>> break_ = rqR_2.class_((Supplier<Map<rqM_2<? extends rVL<?>>, rVZ<?>>>)(() -> {
      Builder var0 = ImmutableMap.builder();
      class_(var0, rVL.void_, rRJ.protected_, rRJ.protected_);
      class_(var0, rVL.n, rYG.break_, rYG.byte_);
      class_(var0, rVL.m, rrSR.class_);
      class_(var0, rVL.Z, rDM.class_);
      class_(var0, rVL.v, rDg_1.class_);
      class_(var0, rVL.F, reP_2.class_);
      class_(var0, rVL.L, rrPx_1.native_);
      class_(var0, rVL.A, reu_3.class_);
      class_(var0, rVL.u, rKW.class_);
      return var0.build();
   }));
   private static final rVv_1 byte_ = rqR_2.class_((Supplier<rVv_1>)(() -> {
      rVv_1 var0 = new rVv_1();
      rRJ.class_(var0);
      break_.keySet().stream().filter(var0x -> !var0x.equals(rVL.void_)).forEach(var1 -> class_(var0, (rqM_2<? extends rVL<?>>)var1));
      return var0;
   }));

   private static <E> void class_(rVq_1<?> var0, rVv_1 var1, rVZ<E> var2) {
      rqM_2 var3 = var2.class_();
      rVC var4 = Optional.ofNullable(var1.break_.get(var3)).map(var0x -> (rVC)var0x).orElseThrow(() -> new IllegalStateException("Missing registry: " + var3));
      DataResult var5 = var0.class_(var4, var2.class_(), var2.break_());
      var5.error().ifPresent(var0x -> class_.error("Error loading registry data: {}", var0x.message()));
   }

   public rVL<rRJ> class_() {
      return this.break_(rVL.void_);
   }

   public static void class_(rVv_1 var0, rVq_1<?> var1) {
      for (rVZ var3 : break_.values()) {
         class_(var1, var0, var3);
      }
   }

   public abstract <E> Optional<rVF<E>> class_(rqM_2<? extends rVL<E>> var1);

   private static <E> void class_(Builder<rqM_2<? extends rVL<?>>, rVZ<?>> var0, rqM_2<? extends rVL<E>> var1, Codec<E> var2, Codec<E> var3) {
      var0.put(var1, new rVZ(var1, var2, var3));
   }

   private static <E> void class_(Builder<rqM_2<? extends rVL<?>>, rVZ<?>> var0, rqM_2<? extends rVL<E>> var1, Codec<E> var2) {
      var0.put(var1, new rVZ(var1, var2, (Codec<E>)null));
   }

   private static <E> void class_(rVv_1 var0, rVw_1 var1, rVZ<E> var2) {
      rqM_2 var3 = var2.class_();
      boolean var4 = !var3.equals(rVL.u) && !var3.equals(rVL.void_);
      rVF var5 = byte_.break_(var3);
      rVF var6 = var0.break_(var3);

      for (Entry var8 : var5.throws_()) {
         Object var9 = var8.getValue();
         if (var4) {
            var1.class_(byte_, (rqM_2<Object>)var8.getKey(), var2.break_(), var5.class_(var9), var9, var5.protected_(var9));
         } else {
            var6.class_(var5.class_(var9), (rqM_2)var8.getKey(), var9, var5.protected_(var9));
         }
      }
   }

   private static <R extends rVL<?>> void class_(rVv_1 var0, rqM_2<R> var1) {
      rVL var2 = rVy_1.break_;
      rVL var3 = (rVL)var2.class_(var1);
      if (var3 == null) {
         throw new IllegalStateException("Missing builtin registry: " + var1);
      } else {
         class_(var0, var3);
      }
   }

   private static <E> void class_(rVv_1 var0, rVL<E> var1) {
      rVF var2 = (rVF)var0.class_(var1.break_()).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1.break_()));

      for (Entry var4 : var1.throws_()) {
         Object var5 = var4.getValue();
         var2.class_(var1.class_(var5), (rqM_2)var4.getKey(), var5, var1.protected_(var5));
      }
   }

   public <E> rVF<E> break_(rqM_2<? extends rVL<E>> var1) {
      return this.<E>class_(var1).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1));
   }

   public static rVv_1 break_() {
      rVv_1 var0 = new rVv_1();
      rVw_1 var1 = new rVw_1();

      for (rVZ var3 : break_.values()) {
         class_(var0, var1, var3);
      }

      rVq_1.class_(JsonOps.INSTANCE, var1, var0);
      return var0;
   }
}
