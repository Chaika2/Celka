package celestial;

import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public interface rTX<Msg> extends AutoCloseable {
   default <Source> CompletableFuture<Source> id_byte(Function<? super rTX<Either<Source, Exception>>, ? extends Msg> var1) {
      CompletableFuture var2 = new CompletableFuture();
      Object var3 = var1.apply(id_class("ask future procesor handle", var1x -> {
         var1x.ifLeft(var2::complete);
         var1x.ifRight(var2::completeExceptionally);
      }));
      this.id_class((Msg)var3);
      return var2;
   }

   static <Msg> rTX<Msg> id_class(String var0, Consumer<Msg> var1) {
      return new rTJ(var0, var1);
   }

   void id_class(Msg var1);

   @Override
   default void close() {
   }

   default <Source> CompletableFuture<Source> id_break(Function<? super rTX<Source>, ? extends Msg> var1) {
      CompletableFuture var2 = new CompletableFuture();
      Object var3 = var1.apply(id_class("ask future procesor handle", var2::complete));
      this.id_class((Msg)var3);
      return var2;
   }

   String j_();
}
