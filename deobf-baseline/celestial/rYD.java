package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class rYD extends rYY {
   private static final rYe_1 id_catch = new rYe_1(-7, ImmutableList.of(1.0, 1.0));
   public static final MapCodec<rYD> id_throws = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").forGetter(var0x -> var0x.id_continue),
               RecordCodecBuilder.create(
                     var0x -> var0x.group(
                              rYM.id_class.fieldOf("parameters").forGetter(Pair::getFirst), rYG.id_protected.fieldOf("biome").forGetter(Pair::getSecond)
                           )
                           .apply(var0x, Pair::of)
                  )
                  .listOf()
                  .fieldOf("biomes")
                  .forGetter(var0x -> var0x.id_int),
               rYe_1.id_class.fieldOf("temperature_noise").forGetter(var0x -> var0x.id_private),
               rYe_1.id_class.fieldOf("humidity_noise").forGetter(var0x -> var0x.id_implements),
               rYe_1.id_class.fieldOf("altitude_noise").forGetter(var0x -> var0x.id_finally),
               rYe_1.id_class.fieldOf("weirdness_noise").forGetter(var0x -> var0x.id_extends)
            )
            .apply(var0, rYD::new)
   );
   public static final Codec<rYD> id_case = Codec.mapEither(rYU.id_class, id_throws)
      .xmap(
         var0 -> (rYD)var0.map(rYU::id_protected, Function.identity()),
         var0 -> var0.id_protected().<Either>map(Either::left).orElseGet(() -> Either.right(var0))
      )
      .codec();
   private final rYe_1 id_private;
   private final rYe_1 id_implements;
   private final rYe_1 id_finally;
   private final rYe_1 id_extends;
   private final rKq_1 id_native;
   private final rKq_1 id_volatile;
   private final rKq_1 id_final;
   private final rKq_1 id_package;
   private final List<Pair<rYM, Supplier<rYG>>> id_int;
   private final boolean id_new;
   private final long id_continue;
   private final Optional<Pair<rVL<rYG>, rYa_1>> id_super;

   private rYD(long var1, List<Pair<rYM, Supplier<rYG>>> var3, rYe_1 var4, rYe_1 var5, rYe_1 var6, rYe_1 var7, Optional<Pair<rVL<rYG>, rYa_1>> var8) {
      super(var3.stream().map(Pair::getSecond));
      this.id_continue = var1;
      this.id_super = var8;
      this.id_private = var4;
      this.id_implements = var5;
      this.id_finally = var6;
      this.id_extends = var7;
      this.id_native = rKq_1.id_class(new rqm_3(var1), var4.id_class(), var4.id_break());
      this.id_volatile = rKq_1.id_class(new rqm_3(var1 + 1L), var5.id_class(), var5.id_break());
      this.id_final = rKq_1.id_class(new rqm_3(var1 + 2L), var6.id_class(), var6.id_break());
      this.id_package = rKq_1.id_class(new rqm_3(var1 + 3L), var7.id_class(), var7.id_break());
      this.id_int = var3;
      this.id_new = false;
   }

   private rYD(long var1, List<Pair<rYM, Supplier<rYG>>> var3, rYe_1 var4, rYe_1 var5, rYe_1 var6, rYe_1 var7) {
      this(var1, var3, var4, var5, var6, var7, Optional.empty());
   }

   rYD(long var1, List<Pair<rYM, Supplier<rYG>>> var3, Optional<Pair<rVL<rYG>, rYa_1>> var4) {
      this(var1, var3, id_catch, id_catch, id_catch, id_catch, var4);
   }

   @Override
   public rYY id_class(long var1) {
      return new rYD(var1, this.id_int, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_super);
   }

   @Override
   protected Codec<? extends rYY> id_class() {
      return id_case;
   }

   public boolean id_break(long var1) {
      return this.id_continue == var1 && this.id_super.isPresent() && Objects.equals(this.id_super.get().getSecond(), rYa_1.id_class);
   }

   private Optional<rYU> id_protected() {
      return this.id_super.map(var1 -> new rYU((rYa_1)var1.getSecond(), (rVL<rYG>)var1.getFirst(), this.id_continue));
   }

   @Override
   public rYG id_protected(int var1, int var2, int var3) {
      int var4 = this.id_new ? var2 : 0;
      rYM var5 = new rYM(
         (float)this.id_native.id_class((double)var1, (double)var4, (double)var3),
         (float)this.id_volatile.id_class((double)var1, (double)var4, (double)var3),
         (float)this.id_final.id_class((double)var1, (double)var4, (double)var3),
         (float)this.id_package.id_class((double)var1, (double)var4, (double)var3),
         0.0F
      );
      return this.id_int
         .stream()
         .min(Comparator.comparing(var1x -> ((rYM)var1x.getFirst()).id_class(var5)))
         .map(Pair::getSecond)
         .map(Supplier::get)
         .orElse(rYC.id_break);
   }
}
