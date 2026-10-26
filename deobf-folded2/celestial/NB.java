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
   private final rAL id_class;
   private final Map<rqO_2, CompletableFuture<NP>> id_break = Maps.newHashMap();

   public NB(rAL var1) {
      this.id_class = var1;
   }

   public CompletableFuture<NP> id_class(rqO_2 var1) {
      return this.id_break.computeIfAbsent(var1, var1x -> CompletableFuture.supplyAsync(() -> {
            try {
               NP var6;
               try (
                  rAF var2 = this.id_class.id_class(var1x);
                  InputStream var3 = var2.id_break();
                  NA var4 = new NA(var3);
               ) {
                  ByteBuffer var5 = var4.id_break();
                  var6 = new NP(var5, var4.id_class());
               }

               return var6;
            } catch (IOException var13) {
               throw new CompletionException(var13);
            }
         }, rqR_2.id_case()));
   }

   public CompletableFuture<Nz_1> id_class(rqO_2 var1, boolean var2) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            rAF var3 = this.id_class.id_class(var1);
            InputStream var4 = var3.id_break();
            return (Nz_1)(var2 ? new NC(NA::new, var4) : new NA(var4));
         } catch (IOException var5) {
            throw new CompletionException(var5);
         }
      }, rqR_2.id_case());
   }

   public void id_class() {
      this.id_break.values().forEach(var0 -> var0.thenAccept(NP::id_break));
      this.id_break.clear();
   }

   public CompletableFuture<?> id_class(Collection<Nq_1> var1) {
      return CompletableFuture.allOf(var1.stream().map(var1x -> this.id_class(var1x.id_protected())).toArray(CompletableFuture[]::new));
   }
}
