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
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roY_2 implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private final AtomicBoolean id_break = new AtomicBoolean();
   private final rTh_1<rTk_1> id_byte;
   private final rKr_1 id_protected;
   private final Map<rfj_3, roo_3> id_throws = Maps.newLinkedHashMap();

   private void id_byte() {
      this.id_byte.id_class(new rTk_1(roK_2.LOW.ordinal(), this::id_break));
   }

   protected roY_2(File var1, boolean var2, String var3) {
      this.id_protected = new rKr_1(var1, var2);
      this.id_byte = new rTh_1(new rTd_1(roK_2.values().length), rqR_2.id_catch(), "IOWorker-" + var3);
   }

   public CompletableFuture<Void> id_class(rfj_3 var1, rcd_3 var2) {
      return this.id_class((Supplier<Either<? extends CompletionStage<Void>, Exception>>)(() -> {
         roo_3 var3 = this.id_throws.computeIfAbsent(var1, var1xx -> new roo_3(var2));
         var3.id_class = var2;
         return Either.left(var3.id_break);
      })).thenCompose(Function.identity());
   }

   private <T> CompletableFuture<T> id_class(Supplier<Either<T, Exception>> var1) {
      return this.id_byte.id_byte(var2 -> new rTk_1(roK_2.HIGH.ordinal(), () -> {
            if (!this.id_break.get()) {
               var2.id_class((Either)var1.get());
            }

            this.id_byte();
         }));
   }

   public CompletableFuture<Void> id_class() {
      CompletableFuture var1 = this.id_class(
            (Supplier)(() -> Either.left(CompletableFuture.allOf(this.id_throws.values().stream().map(var0 -> var0.id_break).toArray(CompletableFuture[]::new))))
         )
         .thenCompose(Function.identity());
      return var1.thenCompose(var1x -> this.id_class((Supplier<Either<Void, Exception>>)(() -> {
            try {
               this.id_protected.id_class();
               return Either.left((Void)null);
            } catch (Exception var2) {
               id_class.warn("Failed to synchronized chunks", var2);
               return Either.right(var2);
            }
         })));
   }

   private void id_class(rfj_3 var1, roo_3 var2) {
      try {
         this.id_protected.id_class(var1, var2.id_class);
         var2.id_break.complete((Void)null);
      } catch (Exception var4) {
         id_class.error("Failed to store chunk {}", var1, var4);
         var2.id_break.completeExceptionally(var4);
      }
   }

   public rcd_3 id_class(rfj_3 var1) throws IOException {
      CompletableFuture var2 = this.id_class((Supplier)(() -> {
         roo_3 var2x = this.id_throws.get(var1);
         if (var2x != null) {
            return Either.left(var2x.id_class);
         } else {
            try {
               rcd_3 var3 = this.id_protected.id_class(var1);
               return Either.left(var3);
            } catch (Exception var4x) {
               id_class.warn("Failed to read chunk {}", var1, var4x);
               return Either.right(var4x);
            }
         }
      }));

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
      if (this.id_break.compareAndSet(false, true)) {
         CompletableFuture var1 = this.id_byte.id_break(var0 -> new rTk_1(roK_2.HIGH.ordinal(), () -> var0.id_class(rqg_3.INSTANCE)));

         try {
            var1.join();
         } catch (CompletionException var4) {
            if (var4.getCause() instanceof IOException) {
               throw (IOException)var4.getCause();
            }

            throw var4;
         }

         this.id_byte.close();
         this.id_throws.forEach(this::id_class);
         this.id_throws.clear();

         try {
            this.id_protected.close();
         } catch (Exception var3) {
            id_class.error("Failed to close storage", var3);
         }
      }
   }

   private void id_break() {
      Iterator var1 = this.id_throws.entrySet().iterator();
      if (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         var1.remove();
         this.id_class((rfj_3)var2.getKey(), (roo_3)var2.getValue());
         this.id_byte();
      }
   }
}
