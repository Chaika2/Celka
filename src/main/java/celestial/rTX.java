/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.rTJ;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public interface rTX<Msg>
extends AutoCloseable {
    default public <Source> CompletableFuture<Source> id_byte(Function<? super rTX<Either<Source, Exception>>, ? extends Msg> function) {
        CompletableFuture completableFuture = new CompletableFuture();
        Msg Msg = function.apply(rTX.id_class("ask future procesor handle", (Msg either) -> {
            either.ifLeft(completableFuture::complete);
            either.ifRight(completableFuture::completeExceptionally);
        }));
        this.id_class(Msg);
        return completableFuture;
    }

    public static <Msg> rTX<Msg> id_class(String string, Consumer<Msg> consumer) {
        return new rTJ(string, consumer);
    }

    public void id_class(Msg var1);

    @Override
    default public void close() {
    }

    default public <Source> CompletableFuture<Source> id_break(Function<? super rTX<Source>, ? extends Msg> function) {
        CompletableFuture completableFuture = new CompletableFuture();
        Msg Msg = function.apply(rTX.id_class("ask future procesor handle", completableFuture::complete));
        this.id_class(Msg);
        return completableFuture;
    }

    public String j_();
}

