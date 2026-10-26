package celestial;

import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVq_1<T> extends rTF<T> {
   static final Logger break_ = LogManager.getLogger();
   private final rVT byte_;
   private final rVv_1 protected_;
   private final Map<rqM_2<? extends rVL<?>>, rVI<?>> throws_;
   private final rVq_1<JsonElement> case_;

   private rVq_1(DynamicOps<T> var1, rVT var2, rVv_1 var3, IdentityHashMap<rqM_2<? extends rVL<?>>, rVI<?>> var4) {
      super(var1);
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var1 == JsonOps.INSTANCE ? this : new rVq_1<>(JsonOps.INSTANCE, var2, var3, var4);
   }

   public static <T> rVq_1<T> class_(DynamicOps<T> var0, rAL var1, rVv_1 var2) {
      return class_(var0, rVT.class_(var1), var2);
   }

   protected <E> DataResult<rVL<E>> class_(rqM_2<? extends rVL<E>> var1) {
      return this.protected_.class_(var1).map(var0 -> DataResult.success(var0, var0.byte_())).orElseGet(() -> DataResult.error("Unknown registry: " + var1));
   }

   public static <T> rVq_1<T> class_(DynamicOps<T> var0, rVT var1, rVv_1 var2) {
      rVq_1 var3 = new rVq_1(var0, var1, var2, Maps.newIdentityHashMap());
      rVm_1.class_(var2, var3);
      return var3;
   }

   public <E> DataResult<rVC<E>> class_(rVC<E> var1, rqM_2<? extends rVL<E>> var2, Codec<E> var3) {
      Collection var4 = this.byte_.class_(var2);
      DataResult var5 = DataResult.success(var1, Lifecycle.stable());
      String var6 = var2.class_().break_() + "/";

      for (rqO_2 var8 : var4) {
         String var9 = var8.break_();
         if (!var9.endsWith(".json")) {
            break_.warn("Skipping resource {} since it is not a json file", var8);
         } else if (!var9.startsWith(var6)) {
            break_.warn("Skipping resource {} since it does not have a registry name prefix", var8);
         } else {
            String var10 = var9.substring(var6.length(), var9.length() - ".json".length());
            rqO_2 var11 = new rqO_2(var8.byte_(), var10);
            var5 = var5.flatMap(var4x -> this.class_(var2, var4x, var3, var11).map(var1xx -> var4x));
         }
      }

      return var5.setPartial(var1);
   }

   protected <E> DataResult<Pair<Supplier<E>, T>> class_(T var1, rqM_2<? extends rVL<E>> var2, Codec<E> var3, boolean var4) {
      Optional var5 = this.protected_.class_(var2);
      if (!var5.isPresent()) {
         return DataResult.error("Unknown registry: " + var2);
      } else {
         rVF var6 = (rVF)var5.get();
         DataResult var7 = rqO_2.class_.decode(this.class_, var1);
         if (!var7.result().isPresent()) {
            return !var4 ? DataResult.error("Inline definitions not allowed here") : var3.decode(this, var1).map(var0 -> var0.mapFirst(var0x -> () -> var0x));
         } else {
            Pair var8 = (Pair)var7.result().get();
            rqO_2 var9 = (rqO_2)var8.getFirst();
            return this.class_(var2, var6, var3, var9).map(var1x -> Pair.of(var1x, var8.getSecond()));
         }
      }
   }

   private <E> DataResult<Supplier<E>> class_(rqM_2<? extends rVL<E>> var1, rVF<E> var2, Codec<E> var3, rqO_2 var4) {
      rqM_2 var5 = rqM_2.class_(var1, var4);
      rVI var6 = this.break_(var1);
      DataResult var7 = var6.class_.get(var5);
      if (var7 != null) {
         return var7;
      } else {
         com.google.common.base.Supplier var8 = Suppliers.memoize(() -> {
            Object var2x = var2.class_(var5);
            if (var2x == null) {
               throw new RuntimeException("Error during recursive registry parsing, element resolved too early: " + var5);
            } else {
               return var2x;
            }
         });
         var6.class_.put(var5, DataResult.success(var8));
         DataResult var9 = this.byte_.class_(this.case_, var1, var5, var3);
         Optional var10 = var9.result();
         if (var10.isPresent()) {
            Pair var11 = (Pair)var10.get();
            var2.class_((OptionalInt)var11.getSecond(), var5, var11.getFirst(), var9.lifecycle());
         }

         DataResult var12;
         if (!var10.isPresent() && var2.class_(var5) != null) {
            var12 = DataResult.success((Supplier<>)() -> var2.class_(var5), Lifecycle.stable());
         } else {
            var12 = var9.map(var2x -> () -> var2.class_(var5));
         }

         var6.class_.put(var5, var12);
         return var12;
      }
   }

   private <E> rVI<E> break_(rqM_2<? extends rVL<E>> var1) {
      return (rVI<E>)this.throws_.computeIfAbsent(var1, var0 -> new rVI());
   }
}
