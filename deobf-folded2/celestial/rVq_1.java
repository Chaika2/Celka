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
   static final Logger id_break = LogManager.getLogger();
   private final rVT id_byte;
   private final rVv_1 id_protected;
   private final Map<rqM_2<? extends rVL<?>>, rVI<?>> id_throws;
   private final rVq_1<JsonElement> id_case;

   private rVq_1(DynamicOps<T> var1, rVT var2, rVv_1 var3, IdentityHashMap<rqM_2<? extends rVL<?>>, rVI<?>> var4) {
      super(var1);
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var1 == JsonOps.INSTANCE ? this : new rVq_1<>(JsonOps.INSTANCE, var2, var3, var4);
   }

   public static <T> rVq_1<T> id_class(DynamicOps<T> var0, rAL var1, rVv_1 var2) {
      return id_class(var0, rVT.id_class(var1), var2);
   }

   protected <E> DataResult<rVL<E>> id_class(rqM_2<? extends rVL<E>> var1) {
      return this.id_protected
         .id_class(var1)
         .map(var0 -> DataResult.success(var0, var0.id_byte()))
         .orElseGet(() -> DataResult.error("Unknown registry: " + var1));
   }

   public static <T> rVq_1<T> id_class(DynamicOps<T> var0, rVT var1, rVv_1 var2) {
      rVq_1 var3 = new rVq_1(var0, var1, var2, Maps.newIdentityHashMap());
      rVm_1.id_class(var2, var3);
      return var3;
   }

   public <E> DataResult<rVC<E>> id_class(rVC<E> var1, rqM_2<? extends rVL<E>> var2, Codec<E> var3) {
      Collection var4 = this.id_byte.id_class(var2);
      DataResult var5 = DataResult.success(var1, Lifecycle.stable());
      String var6 = var2.id_class().id_break() + "/";

      for (rqO_2 var8 : var4) {
         String var9 = var8.id_break();
         if (!var9.endsWith(".json")) {
            id_break.warn("Skipping resource {} since it is not a json file", var8);
         } else if (!var9.startsWith(var6)) {
            id_break.warn("Skipping resource {} since it does not have a registry name prefix", var8);
         } else {
            String var10 = var9.substring(var6.length(), var9.length() - ".json".length());
            rqO_2 var11 = new rqO_2(var8.id_byte(), var10);
            var5 = var5.flatMap(var4x -> this.id_class(var2, var4x, var3, var11).map(var1xx -> var4x));
         }
      }

      return var5.setPartial(var1);
   }

   protected <E> DataResult<Pair<Supplier<E>, T>> id_class(T var1, rqM_2<? extends rVL<E>> var2, Codec<E> var3, boolean var4) {
      Optional var5 = this.id_protected.id_class(var2);
      if (!var5.isPresent()) {
         return DataResult.error("Unknown registry: " + var2);
      } else {
         rVF var6 = (rVF)var5.get();
         DataResult var7 = rqO_2.id_class.decode(this.id_class, var1);
         if (!var7.result().isPresent()) {
            return !var4 ? DataResult.error("Inline definitions not allowed here") : var3.decode(this, var1).map(var0 -> var0.mapFirst(var0x -> () -> var0x));
         } else {
            Pair var8 = (Pair)var7.result().get();
            rqO_2 var9 = (rqO_2)var8.getFirst();
            return this.id_class(var2, var6, var3, var9).map(var1x -> Pair.of(var1x, var8.getSecond()));
         }
      }
   }

   private <E> DataResult<Supplier<E>> id_class(rqM_2<? extends rVL<E>> var1, rVF<E> var2, Codec<E> var3, rqO_2 var4) {
      rqM_2 var5 = rqM_2.id_class(var1, var4);
      rVI var6 = this.id_break(var1);
      DataResult var7 = var6.id_class.get(var5);
      if (var7 != null) {
         return var7;
      } else {
         com.google.common.base.Supplier var8 = Suppliers.memoize(() -> {
            Object var2x = var2.id_class(var5);
            if (var2x == null) {
               throw new RuntimeException("Error during recursive registry parsing, element resolved too early: " + var5);
            } else {
               return var2x;
            }
         });
         var6.id_class.put(var5, DataResult.success(var8));
         DataResult var9 = this.id_byte.id_class(this.id_case, var1, var5, var3);
         Optional var10 = var9.result();
         if (var10.isPresent()) {
            Pair var11 = (Pair)var10.get();
            var2.id_class((OptionalInt)var11.getSecond(), var5, var11.getFirst(), var9.lifecycle());
         }

         DataResult var12;
         if (!var10.isPresent() && var2.id_class(var5) != null) {
            var12 = DataResult.success((Supplier<>)() -> var2.id_class(var5), Lifecycle.stable());
         } else {
            var12 = var9.map(var2x -> () -> var2.id_class(var5));
         }

         var6.id_class.put(var5, var12);
         return var12;
      }
   }

   private <E> rVI<E> id_break(rqM_2<? extends rVL<E>> var1) {
      return (rVI<E>)this.id_throws.computeIfAbsent(var1, var0 -> new rVI());
   }
}
