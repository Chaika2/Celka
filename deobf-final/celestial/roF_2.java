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
   private static final Logger class_ = LogManager.getLogger();
   private final Map<rTX<?>, rov_3<? extends Function<rTX<rqg_3>, ?>>> break_;
   private final Set<rTX<?>> byte_;
   private final rTh_1<rTk_1> protected_;

   public roF_2(List<rTX<?>> var1, Executor var2, int var3) {
      this.break_ = var1.stream().collect(Collectors.toMap(Function.identity(), var1x -> new rov_3<>(var1x.j_() + "_queue", var3)));
      this.byte_ = Sets.newHashSet(var1);
      this.protected_ = new rTh_1<>(new rTd_1(4), var2, "sorter");
   }

   public static roL_2<Runnable> class_(Runnable var0, long var1, IntSupplier var3) {
      return new roL_2<>(var1x -> () -> {
            var0.run();
            var1x.class_(rqg_3.INSTANCE);
         }, var1, var3);
   }

   @Override
   public void class_(rfj_3 var1, IntSupplier var2, int var3, IntConsumer var4) {
      this.protected_.class_(new rTk_1(0, () -> {
         int var5 = var2.getAsInt();
         this.break_.values().forEach(var3xx -> var3xx.class_(var5, var1, var3));
         var4.accept(var3);
      }));
   }

   private <T> void class_(rTX<T> var1, long var2, Runnable var4, boolean var5) {
      this.protected_.class_(new rTk_1(1, () -> {
         rov_3 var6 = this.break_(var1);
         var6.class_(var2, var5);
         if (this.byte_.remove(var1)) {
            this.class_(var6, var1);
         }

         var4.run();
      }));
   }

   public static roL_2<Runnable> class_(rrEG var0, Runnable var1) {
      return class_(var1, var0.implements_().class_(), var0::extends_);
   }

   private <T> void class_(rov_3<Function<rTX<rqg_3>, T>> var1, rTX<T> var2) {
      this.protected_.class_(new rTk_1(3, () -> {
         Stream var3 = var1.class_();
         if (var3 == null) {
            this.byte_.add(var2);
         } else {
            rqR_2.break_(var3.<CompletableFuture>map(var1xx -> (CompletableFuture)var1xx.map(var2::break_, var0x -> {
                  var0x.run();
                  return CompletableFuture.completedFuture(rqg_3.INSTANCE);
               })).collect(Collectors.toList())).thenAccept(var3x -> this.class_(var1, var2));
         }
      }));
   }

   public rTX<roA_2> class_(rTX<Runnable> var1) {
      return this.protected_
         .<rTX<roA_2>>break_(
            var2 -> new rTk_1(
                  0,
                  () -> var2.class_(
                        rTX.class_("chunk priority sorter around " + var1.j_(), var2xx -> this.class_(var1, var2xx.break_, var2xx.class_, var2xx.byte_))
                     )
               )
         )
         .join();
   }

   public <T> rTX<roL_2<T>> class_(rTX<T> var1, boolean var2) {
      return this.protected_.<rTX<roL_2<T>>>break_(var3 -> new rTk_1(0, () -> {
            this.break_(var1);
            var3.class_(rTX.class_("chunk priority sorter around " + var1.j_(), var3xx -> this.class_(var1, var3xx.class_, var3xx.break_, var3xx.byte_, var2)));
         })).join();
   }

   public static roA_2 class_(Runnable var0, long var1, boolean var3) {
      return new roA_2(var0, var1, var3);
   }

   private <T> void class_(rTX<T> var1, Function<rTX<rqg_3>, T> var2, long var3, IntSupplier var5, boolean var6) {
      this.protected_.class_(new rTk_1(2, () -> {
         rov_3 var7 = this.break_(var1);
         int var8 = var5.getAsInt();
         var7.class_(Optional.of(var2), var3, var8);
         if (var6) {
            var7.class_(Optional.empty(), var3, var8);
         }

         if (this.byte_.remove(var1)) {
            this.class_(var7, var1);
         }
      }));
   }

   public String class_() {
      return this.break_
            .entrySet()
            .stream()
            .map(
               var0 -> var0.getKey().j_()
                     + "=["
                     + var0.getValue().break_().stream().map(var0x -> var0x + ":" + new rfj_3(var0x)).collect(Collectors.joining(","))
                     + "]"
            )
            .collect(Collectors.joining(","))
         + ", s="
         + this.byte_.size();
   }

   @Override
   public void close() {
      this.break_.keySet().forEach(rTX::close);
   }

   private <T> rov_3<Function<rTX<rqg_3>, T>> break_(rTX<T> var1) {
      rov_3 var2 = this.break_.get(var1);
      if (var2 == null) {
         throw (IllegalArgumentException)rqR_2.byte_(new IllegalArgumentException("No queue for: " + var1));
      } else {
         return var2;
      }
   }
}
