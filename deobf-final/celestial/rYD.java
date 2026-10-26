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
   private static final rYe_1 catch_ = new rYe_1(-7, ImmutableList.of(1.0, 1.0));
   public static final MapCodec<rYD> throws_ = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").forGetter(var0x -> var0x.continue_),
               RecordCodecBuilder.create(
                     var0x -> var0x.group(
                              rYM.class_.fieldOf("parameters").forGetter(Pair::getFirst), rYG.protected_.fieldOf("biome").forGetter(Pair::getSecond)
                           )
                           .apply(var0x, Pair::of)
                  )
                  .listOf()
                  .fieldOf("biomes")
                  .forGetter(var0x -> var0x.int_),
               rYe_1.class_.fieldOf("temperature_noise").forGetter(var0x -> var0x.private_),
               rYe_1.class_.fieldOf("humidity_noise").forGetter(var0x -> var0x.implements_),
               rYe_1.class_.fieldOf("altitude_noise").forGetter(var0x -> var0x.finally_),
               rYe_1.class_.fieldOf("weirdness_noise").forGetter(var0x -> var0x.extends_)
            )
            .apply(var0, rYD::new)
   );
   public static final Codec<rYD> case_ = Codec.mapEither(rYU.class_, throws_)
      .xmap(
         var0 -> (rYD)var0.map(rYU::protected_, Function.identity()), var0 -> var0.protected_().<Either>map(Either::left).orElseGet(() -> Either.right(var0))
      )
      .codec();
   private final rYe_1 private_;
   private final rYe_1 implements_;
   private final rYe_1 finally_;
   private final rYe_1 extends_;
   private final rKq_1 native_;
   private final rKq_1 volatile_;
   private final rKq_1 final_;
   private final rKq_1 package_;
   private final List<Pair<rYM, Supplier<rYG>>> int_;
   private final boolean new_;
   private final long continue_;
   private final Optional<Pair<rVL<rYG>, rYa_1>> super_;

   private rYD(long var1, List<Pair<rYM, Supplier<rYG>>> var3, rYe_1 var4, rYe_1 var5, rYe_1 var6, rYe_1 var7, Optional<Pair<rVL<rYG>, rYa_1>> var8) {
      super(var3.stream().map(Pair::getSecond));
      this.continue_ = var1;
      this.super_ = var8;
      this.private_ = var4;
      this.implements_ = var5;
      this.finally_ = var6;
      this.extends_ = var7;
      this.native_ = rKq_1.class_(new rqm_3(var1), var4.class_(), var4.break_());
      this.volatile_ = rKq_1.class_(new rqm_3(var1 + 1L), var5.class_(), var5.break_());
      this.final_ = rKq_1.class_(new rqm_3(var1 + 2L), var6.class_(), var6.break_());
      this.package_ = rKq_1.class_(new rqm_3(var1 + 3L), var7.class_(), var7.break_());
      this.int_ = var3;
      this.new_ = false;
   }

   private rYD(long var1, List<Pair<rYM, Supplier<rYG>>> var3, rYe_1 var4, rYe_1 var5, rYe_1 var6, rYe_1 var7) {
      this(var1, var3, var4, var5, var6, var7, Optional.empty());
   }

   rYD(long var1, List<Pair<rYM, Supplier<rYG>>> var3, Optional<Pair<rVL<rYG>, rYa_1>> var4) {
      this(var1, var3, catch_, catch_, catch_, catch_, var4);
   }

   @Override
   public rYY class_(long var1) {
      return new rYD(var1, this.int_, this.private_, this.implements_, this.finally_, this.extends_, this.super_);
   }

   @Override
   protected Codec<? extends rYY> class_() {
      return case_;
   }

   public boolean break_(long var1) {
      return this.continue_ == var1 && this.super_.isPresent() && Objects.equals(this.super_.get().getSecond(), rYa_1.class_);
   }

   private Optional<rYU> protected_() {
      return this.super_.map(var1 -> new rYU((rYa_1)var1.getSecond(), (rVL<rYG>)var1.getFirst(), this.continue_));
   }

   @Override
   public rYG protected_(int var1, int var2, int var3) {
      int var4 = this.new_ ? var2 : 0;
      rYM var5 = new rYM(
         (float)this.native_.class_((double)var1, (double)var4, (double)var3),
         (float)this.volatile_.class_((double)var1, (double)var4, (double)var3),
         (float)this.final_.class_((double)var1, (double)var4, (double)var3),
         (float)this.package_.class_((double)var1, (double)var4, (double)var3),
         0.0F
      );
      return this.int_
         .stream()
         .min(Comparator.comparing(var1x -> ((rYM)var1x.getFirst()).class_(var5)))
         .map(Pair::getSecond)
         .map(Supplier::get)
         .orElse(rYC.break_);
   }
}
