package celestial;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class NB {
   private final rAL class_;
   private final Map<rqO_2, CompletableFuture<NP>> break_ = Maps.newHashMap();

   public NB(rAL var1) {
      this.class_ = var1;
   }

   public CompletableFuture<NP> class_(rqO_2 var1) {
      return this.break_.computeIfAbsent(var1, var1x -> CompletableFuture.supplyAsync(() -> {
            try {
               NP var6;
               try (
                  rAF var2 = this.class_.class_(var1x);
                  InputStream var3 = var2.break_();
                  NA var4 = new NA(var3);
               ) {
                  ByteBuffer var5 = var4.break_();
                  var6 = new NP(var5, var4.class_());
               }

               return var6;
            } catch (IOException var13) {
               throw new CompletionException(var13);
            }
         }, rqR_2.case_()));
   }

   public CompletableFuture<Nz_1> class_(rqO_2 var1, boolean var2) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            rAF var3 = this.class_.class_(var1);
            InputStream var4 = var3.break_();
            return (Nz_1)(var2 ? new NC(NA::new, var4) : new NA(var4));
         } catch (IOException var5) {
            throw new CompletionException(var5);
         }
      }, rqR_2.case_());
   }

   public void class_() {
      this.break_.values().forEach(var0 -> var0.thenAccept(NP::break_));
      this.break_.clear();
   }

   public CompletableFuture<?> class_(Collection<Nq_1> var1) {
      return CompletableFuture.allOf(var1.stream().map(var1x -> this.class_(var1x.protected_())).toArray(CompletableFuture[]::new));
   }
}
