package celestial;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roF_2 implements AutoCloseable, rrEh_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final Map<rTX<?>, rov_3<? extends Function<rTX<rqg_3>, ?>>> id_break;
   private final Set<rTX<?>> id_byte;
   private final rTh_1<rTk_1> id_protected;

   public roF_2(List<rTX<?>> var1, Executor var2, int var3) {
      this.id_break = var1.stream().collect(Collectors.toMap(Function.identity(), var1x -> new rov_3<>(var1x.j_() + "_queue", var3)));
      this.id_byte = Sets.newHashSet(var1);
      this.id_protected = new rTh_1<>(new rTd_1(4), var2, "sorter");
   }

   public static roL_2<Runnable> id_class(Runnable var0, long var1, IntSupplier var3) {
      return new roL_2<>(var1x -> () -> {
            var0.run();
            var1x.id_class(rqg_3.INSTANCE);
         }, var1, var3);
   }

   @Override
   public void id_class(rfj_3 var1, IntSupplier var2, int var3, IntConsumer var4) {
      this.id_protected.id_class(new rTk_1(0, () -> {
         int var5 = var2.getAsInt();
         this.id_break.values().forEach(var3xx -> var3xx.id_class(var5, var1, var3));
         var4.accept(var3);
      }));
   }

   private <T> void id_class(rTX<T> var1, long var2, Runnable var4, boolean var5) {
      this.id_protected.id_class(new rTk_1(1, () -> {
         rov_3 var6 = this.id_break(var1);
         var6.id_class(var2, var5);
         if (this.id_byte.remove(var1)) {
            this.id_class(var6, var1);
         }

         var4.run();
      }));
   }

   public static roL_2<Runnable> id_class(rrEG var0, Runnable var1) {
      return id_class(var1, var0.id_implements().id_class(), var0::id_extends);
   }

   private <T> void id_class(rov_3<Function<rTX<rqg_3>, T>> var1, rTX<T> var2) {
      this.id_protected.id_class(new rTk_1(3, () -> {
         Stream var3 = var1.id_class();
         if (var3 == null) {
            this.id_byte.add(var2);
         } else {
            rqR_2.id_break(var3.<CompletableFuture>map(var1xx -> (CompletableFuture)var1xx.map(var2::id_break, var0x -> {
                  var0x.run();
                  return CompletableFuture.completedFuture(rqg_3.INSTANCE);
               })).collect(Collectors.toList())).thenAccept(var3x -> this.id_class(var1, var2));
         }
      }));
   }

   public rTX<roA_2> id_class(rTX<Runnable> var1) {
      return this.id_protected
         .<rTX<roA_2>>id_break(
            var2 -> new rTk_1(
                  0,
                  () -> var2.id_class(
                        rTX.id_class(
                           "chunk priority sorter around " + var1.j_(), var2xx -> this.id_class(var1, var2xx.id_break, var2xx.id_class, var2xx.id_byte)
                        )
                     )
               )
         )
         .join();
   }

   public <T> rTX<roL_2<T>> id_class(rTX<T> var1, boolean var2) {
      return this.id_protected
         .<rTX<roL_2<T>>>id_break(
            var3 -> new rTk_1(
                  0,
                  () -> {
                     this.id_break(var1);
                     var3.id_class(
                        rTX.id_class(
                           "chunk priority sorter around " + var1.j_(), var3xx -> this.id_class(var1, var3xx.id_class, var3xx.id_break, var3xx.id_byte, var2)
                        )
                     );
                  }
               )
         )
         .join();
   }

   public static roA_2 id_class(Runnable var0, long var1, boolean var3) {
      return new roA_2(var0, var1, var3);
   }

   private <T> void id_class(rTX<T> var1, Function<rTX<rqg_3>, T> var2, long var3, IntSupplier var5, boolean var6) {
      this.id_protected.id_class(new rTk_1(2, () -> {
         rov_3 var7 = this.id_break(var1);
         int var8 = var5.getAsInt();
         var7.id_class(Optional.of(var2), var3, var8);
         if (var6) {
            var7.id_class(Optional.empty(), var3, var8);
         }

         if (this.id_byte.remove(var1)) {
            this.id_class(var7, var1);
         }
      }));
   }

   public String id_class() {
      return this.id_break
            .entrySet()
            .stream()
            .map(
               var0 -> var0.getKey().j_()
                     + "=["
                     + var0.getValue().id_break().stream().map(var0x -> var0x + ":" + new rfj_3(var0x)).collect(Collectors.joining(","))
                     + "]"
            )
            .collect(Collectors.joining(","))
         + ", s="
         + this.id_byte.size();
   }

   @Override
   public void close() {
      this.id_break.keySet().forEach(rTX::close);
   }

   private <T> rov_3<Function<rTX<rqg_3>, T>> id_break(rTX<T> var1) {
      rov_3 var2 = this.id_break.get(var1);
      if (var2 == null) {
         throw (IllegalArgumentException)rqR_2.id_byte(new IllegalArgumentException("No queue for: " + var1));
      } else {
         return var2;
      }
   }
}
