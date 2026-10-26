package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roY_2 implements AutoCloseable {
   private static final Logger class_ = LogManager.getLogger();
   private final AtomicBoolean break_ = new AtomicBoolean();
   private final rTh_1<rTk_1> byte_;
   private final rKr_1 protected_;
   private final Map<rfj_3, roo_3> throws_ = Maps.newLinkedHashMap();

   private void byte_() {
      this.byte_.class_(new rTk_1(roK_2.LOW.ordinal(), this::break_));
   }

   protected roY_2(File var1, boolean var2, String var3) {
      this.protected_ = new rKr_1(var1, var2);
      this.byte_ = new rTh_1<>(new rTd_1(roK_2.values().length), rqR_2.catch_(), "IOWorker-" + var3);
   }

   public CompletableFuture<Void> class_(rfj_3 var1, rcd_3 var2) {
      return this.class_(() -> {
         roo_3 var3 = this.throws_.computeIfAbsent(var1, var1xx -> new roo_3(var2));
         var3.class_ = var2;
         return Either.left(var3.break_);
      }).thenCompose(Function.identity());
   }

   private <T> CompletableFuture<T> class_(Supplier<Either<T, Exception>> var1) {
      return this.byte_.byte_(var2 -> new rTk_1(roK_2.HIGH.ordinal(), () -> {
            if (!this.break_.get()) {
               var2.class_((Either)var1.get());
            }

            this.byte_();
         }));
   }

   public CompletableFuture<Void> class_() {
      CompletableFuture var1 = this.class_(
            () -> Either.left(CompletableFuture.allOf(this.throws_.values().stream().map(var0 -> var0.break_).toArray(CompletableFuture[]::new)))
         )
         .thenCompose(Function.identity());
      return var1.thenCompose(var1x -> this.class_(() -> {
            try {
               this.protected_.class_();
               return Either.left((Void)null);
            } catch (Exception var2) {
               class_.warn("Failed to synchronized chunks", var2);
               return Either.right(var2);
            }
         }));
   }

   private void class_(rfj_3 var1, roo_3 var2) {
      try {
         this.protected_.class_(var1, var2.class_);
         var2.break_.complete((Void)null);
      } catch (Exception var4) {
         class_.error("Failed to store chunk {}", var1, var4);
         var2.break_.completeExceptionally(var4);
      }
   }

   public rcd_3 class_(rfj_3 var1) throws IOException {
      CompletableFuture var2 = this.class_(() -> {
         roo_3 var2x = this.throws_.get(var1);
         if (var2x != null) {
            return Either.left(var2x.class_);
         } else {
            try {
               rcd_3 var3 = this.protected_.class_(var1);
               return Either.left(var3);
            } catch (Exception var4x) {
               class_.warn("Failed to read chunk {}", var1, var4x);
               return Either.right(var4x);
            }
         }
      });

      try {
         return (rcd_3)var2.join();
      } catch (CompletionException var4) {
         if (var4.getCause() instanceof IOException) {
            throw (IOException)var4.getCause();
         } else {
            throw var4;
         }
      }
   }

   @Override
   public void close() throws IOException {
      if (this.break_.compareAndSet(false, true)) {
         CompletableFuture var1 = this.byte_.break_(var0 -> new rTk_1(roK_2.HIGH.ordinal(), () -> var0.class_(rqg_3.INSTANCE)));

         try {
            var1.join();
         } catch (CompletionException var4) {
            if (var4.getCause() instanceof IOException) {
               throw (IOException)var4.getCause();
            }

            throw var4;
         }

         this.byte_.close();
         this.throws_.forEach(this::class_);
         this.throws_.clear();

         try {
            this.protected_.close();
         } catch (Exception var3) {
            class_.error("Failed to close storage", var3);
         }
      }
   }

   private void break_() {
      Iterator var1 = this.throws_.entrySet().iterator();
      if (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         var1.remove();
         this.class_((rfj_3)var2.getKey(), (roo_3)var2.getValue());
         this.byte_();
      }
   }
}
