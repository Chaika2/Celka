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
   private static final Logger class_ = LogManager.getLogger();
   private final roY_2 break_;
   private final Long2ObjectMap<Optional<R>> byte_ = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet protected_ = new LongLinkedOpenHashSet();
   private final Function<Runnable, Codec<R>> throws_;
   private final Function<Runnable, R> case_;
   private final DataFixer catch_;
   private final rTv_1 private_;

   private rcd_3 byte_(rfj_3 var1) {
      try {
         return this.break_.class_(var1);
      } catch (IOException var3) {
         class_.error("Error reading chunk {} data from disk", var1, var3);
         return null;
      }
   }

   protected Optional<R> byte_(long var1) {
      return (Optional<R>)this.byte_.get(var1);
   }

   public rKS(File var1, Function<Runnable, Codec<R>> var2, Function<Runnable, R> var3, DataFixer var4, rTv_1 var5, boolean var6) {
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var5;
      this.break_ = new roY_2(var1, var6, var1.getName());
   }

   private <T> Dynamic<T> class_(rfj_3 var1, DynamicOps<T> var2) {
      HashMap var3 = Maps.newHashMap();

      for (int var4 = 0; var4 < 16; var4++) {
         long var5 = rjh_3.class_(var1, var4).continue_();
         this.protected_.remove(var5);
         Optional var7 = (Optional)this.byte_.get(var5);
         if (var7 != null && var7.isPresent()) {
            DataResult var8 = this.throws_.apply(() -> this.class_(var5)).encodeStart(var2, var7.get());
            String var9 = Integer.toString(var4);
            var8.resultOrPartial(class_::error).ifPresent(var3x -> var3.put(var2.createString(var9), var3x));
         }
      }

      return new Dynamic(
         var2,
         var2.createMap(
            ImmutableMap.of(
               var2.createString("Sections"), var2.createMap(var3), var2.createString("DataVersion"), var2.createInt(rqu_3.class_().getWorldVersion())
            )
         )
      );
   }

   protected void class_(BooleanSupplier var1) {
      while (!this.protected_.isEmpty() && var1.getAsBoolean()) {
         rfj_3 var2 = rjh_3.class_(this.protected_.firstLong()).new_();
         this.protected_(var2);
      }
   }

   protected void class_(long var1) {
      Optional var3 = (Optional)this.byte_.get(var1);
      if (var3 != null && var3.isPresent()) {
         this.protected_.add(var1);
      } else {
         class_.warn("No data for position: {}", rjh_3.class_(var1));
      }
   }

   public void class_(rfj_3 var1) {
      if (!this.protected_.isEmpty()) {
         for (int var2 = 0; var2 < 16; var2++) {
            long var3 = rjh_3.class_(var1, var2).continue_();
            if (this.protected_.contains(var3)) {
               this.protected_(var1);
               return;
            }
         }
      }
   }

   private static int class_(Dynamic<?> var0) {
      return var0.get("DataVersion").asInt(1945);
   }

   private <T> void class_(rfj_3 var1, DynamicOps<T> var2, T var3) {
      if (var3 == null) {
         for (int var4 = 0; var4 < 16; var4++) {
            this.byte_.put(rjh_3.class_(var1, var4).continue_(), Optional.empty());
         }
      } else {
         Dynamic var14 = new Dynamic(var2, var3);
         int var5 = class_(var14);
         int var6 = rqu_3.class_().getWorldVersion();
         boolean var7 = var5 != var6;
         Dynamic var8 = this.catch_.update(this.private_.class_(), var14, var5, var6);
         OptionalDynamic var9 = var8.get("Sections");

         for (int var10 = 0; var10 < 16; var10++) {
            long var11 = rjh_3.class_(var1, var10).continue_();
            Optional var13 = var9.get(Integer.toString(var10))
               .result()
               .flatMap(var3x -> this.throws_.apply(() -> this.class_(var11)).parse(var3x).resultOrPartial(class_::error));
            this.byte_.put(var11, var13);
            var13.ifPresent(var4x -> {
               this.break_(var11);
               if (var7) {
                  this.class_(var11);
               }
            });
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.break_.close();
   }

   protected void break_(long var1) {
   }

   private void break_(rfj_3 var1) {
      this.class_(var1, rcf_3.class_, this.byte_(var1));
   }

   protected boolean break_(rjh_3 var1) {
      return rYB.protected_(rjh_3.catch_(var1.byte_()));
   }

   protected R throws_(long var1) {
      Optional var3 = this.protected_(var1);
      if (var3.isPresent()) {
         return (R)var3.get();
      } else {
         Object var4 = this.case_.apply(() -> this.class_(var1));
         this.byte_.put(var1, Optional.of(var4));
         return (R)var4;
      }
   }

   private void protected_(rfj_3 var1) {
      Dynamic var2 = this.class_(var1, rcf_3.class_);
      rcZ_2 var3 = (rcZ_2)var2.getValue();
      if (var3 instanceof rcd_3) {
         this.break_.class_(var1, (rcd_3)var3);
      } else {
         class_.error("Expected compound tag, got {}", var3);
      }
   }

   protected Optional<R> protected_(long var1) {
      rjh_3 var3 = rjh_3.class_(var1);
      if (this.break_(var3)) {
         return Optional.empty();
      } else {
         Optional var4 = this.byte_(var1);
         if (var4 != null) {
            return var4;
         } else {
            this.break_(var3.new_());
            var4 = this.byte_(var1);
            if (var4 == null) {
               throw (IllegalStateException)rqR_2.byte_(new IllegalStateException());
            } else {
               return var4;
            }
         }
      }
   }
}
