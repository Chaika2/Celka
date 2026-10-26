package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKS<R> implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private final roY_2 id_break;
   private final Long2ObjectMap<Optional<R>> id_byte = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet id_protected = new LongLinkedOpenHashSet();
   private final Function<Runnable, Codec<R>> id_throws;
   private final Function<Runnable, R> id_case;
   private final DataFixer id_catch;
   private final rTv_1 id_private;

   private rcd_3 id_byte(rfj_3 var1) {
      try {
         return this.id_break.id_class(var1);
      } catch (IOException var3) {
         id_class.error("Error reading chunk {} data from disk", var1, var3);
         return null;
      }
   }

   protected Optional<R> id_byte(long var1) {
      return (Optional<R>)this.id_byte.get(var1);
   }

   public rKS(File var1, Function<Runnable, Codec<R>> var2, Function<Runnable, R> var3, DataFixer var4, rTv_1 var5, boolean var6) {
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var5;
      this.id_break = new roY_2(var1, var6, var1.getName());
   }

   private <T> Dynamic<T> id_class(rfj_3 var1, DynamicOps<T> var2) {
      HashMap var3 = Maps.newHashMap();

      for (int var4 = 0; var4 < 16; var4++) {
         long var5 = rjh_3.id_class(var1, var4).id_continue();
         this.id_protected.remove(var5);
         Optional var7 = (Optional)this.id_byte.get(var5);
         if (var7 != null && var7.isPresent()) {
            DataResult var8 = this.id_throws.apply(() -> this.id_class(var5)).encodeStart(var2, var7.get());
            String var9 = Integer.toString(var4);
            var8.resultOrPartial(id_class::error).ifPresent(var3x -> var3.put(var2.createString(var9), var3x));
         }
      }

      return new Dynamic(
         var2,
         var2.createMap(
            ImmutableMap.of(
               var2.createString("Sections"), var2.createMap(var3), var2.createString("DataVersion"), var2.createInt(rqu_3.id_class().getWorldVersion())
            )
         )
      );
   }

   protected void id_class(BooleanSupplier var1) {
      while (!this.id_protected.isEmpty() && var1.getAsBoolean()) {
         rfj_3 var2 = rjh_3.id_class(this.id_protected.firstLong()).id_new();
         this.id_protected(var2);
      }
   }

   protected void id_class(long var1) {
      Optional var3 = (Optional)this.id_byte.get(var1);
      if (var3 != null && var3.isPresent()) {
         this.id_protected.add(var1);
      } else {
         id_class.warn("No data for position: {}", rjh_3.id_class(var1));
      }
   }

   public void id_class(rfj_3 var1) {
      if (!this.id_protected.isEmpty()) {
         for (int var2 = 0; var2 < 16; var2++) {
            long var3 = rjh_3.id_class(var1, var2).id_continue();
            if (this.id_protected.contains(var3)) {
               this.id_protected(var1);
               return;
            }
         }
      }
   }

   private static int id_class(Dynamic<?> var0) {
      return var0.get("DataVersion").asInt(1945);
   }

   private <T> void id_class(rfj_3 var1, DynamicOps<T> var2, T var3) {
      if (var3 == null) {
         for (int var4 = 0; var4 < 16; var4++) {
            this.id_byte.put(rjh_3.id_class(var1, var4).id_continue(), Optional.empty());
         }
      } else {
         Dynamic var14 = new Dynamic(var2, var3);
         int var5 = id_class(var14);
         int var6 = rqu_3.id_class().getWorldVersion();
         boolean var7 = var5 != var6;
         Dynamic var8 = this.id_catch.update(this.id_private.id_class(), var14, var5, var6);
         OptionalDynamic var9 = var8.get("Sections");

         for (int var10 = 0; var10 < 16; var10++) {
            long var11 = rjh_3.id_class(var1, var10).id_continue();
            Optional var13 = var9.get(Integer.toString(var10))
               .result()
               .flatMap(var3x -> this.id_throws.apply(() -> this.id_class(var11)).parse(var3x).resultOrPartial(id_class::error));
            this.id_byte.put(var11, var13);
            var13.ifPresent(var4x -> {
               this.id_break(var11);
               if (var7) {
                  this.id_class(var11);
               }
            });
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.id_break.close();
   }

   protected void id_break(long var1) {
   }

   private void id_break(rfj_3 var1) {
      this.id_class(var1, rcf_3.id_class, this.id_byte(var1));
   }

   protected boolean id_break(rjh_3 var1) {
      return rYB.id_protected(rjh_3.id_catch(var1.id_byte()));
   }

   protected R id_throws(long var1) {
      Optional var3 = this.id_protected(var1);
      if (var3.isPresent()) {
         return (R)var3.get();
      } else {
         Object var4 = this.id_case.apply(() -> this.id_class(var1));
         this.id_byte.put(var1, Optional.of(var4));
         return (R)var4;
      }
   }

   private void id_protected(rfj_3 var1) {
      Dynamic var2 = this.id_class(var1, rcf_3.id_class);
      rcZ_2 var3 = (rcZ_2)var2.getValue();
      if (var3 instanceof rcd_3) {
         this.id_break.id_class(var1, (rcd_3)var3);
      } else {
         id_class.error("Expected compound tag, got {}", var3);
      }
   }

   protected Optional<R> id_protected(long var1) {
      rjh_3 var3 = rjh_3.id_class(var1);
      if (this.id_break(var3)) {
         return Optional.empty();
      } else {
         Optional var4 = this.id_byte(var1);
         if (var4 != null) {
            return var4;
         } else {
            this.id_break(var3.id_new());
            var4 = this.id_byte(var1);
            if (var4 == null) {
               throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException());
            } else {
               return var4;
            }
         }
      }
   }
}
