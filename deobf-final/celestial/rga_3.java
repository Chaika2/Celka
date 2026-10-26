package celestial;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rga_3 extends rKS<rge_3> {
   private final rgi_3 class_;
   private final LongSet break_ = new LongOpenHashSet();

   public Optional<rRP> byte_(rfH_2 var1) {
      rge_3 var2 = this.throws_(rjh_3.class_(var1).continue_());
      return var2.byte_(var1);
   }

   public Optional<rfH_2> byte_(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4, rRr_1 var5) {
      return this.class_(var1, var2, var3, var4, var5).findFirst();
   }

   public Stream<rgU_2> byte_(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      int var5 = var3 * var3;
      return this.break_(var1, var2, var3, var4).filter(var2x -> var2x.throws_().private_(var2) <= (double)var5);
   }

   public rga_3(File var1, DataFixer var2, boolean var3) {
      super(var1, rge_3::class_, rge_3::new, var2, rTv_1.POI_CHUNK, var3);
      this.class_ = new rgi_3(this);
   }

   private static boolean class_(roQ_2 var0) {
      return var0.class_(rRP.public_::contains);
   }

   public void class_(rRR var1, rfH_2 var2, int var3) {
      rjh_3.break_(new rfj_3(var2), Math.floorDiv(var3, 16))
         .map(var1x -> Pair.of(var1x, this.protected_(var1x.continue_())))
         .filter(var0 -> !((Optional)var0.getSecond()).<Boolean>map(rge_3::class_).orElse(false))
         .map(var0 -> ((rjh_3)var0.getFirst()).new_())
         .filter(var1x -> this.break_.add(var1x.class_()))
         .forEach(var1x -> var1.class_(var1x.break_, var1x.byte_, roN_2.class_));
   }

   private void class_(roQ_2 var1, rjh_3 var2, BiConsumer<rfH_2, rRP> var3) {
      var2.super_().forEach(var2x -> {
         xc_3 var3x = var1.class_(rjh_3.break_(var2x.b_()), rjh_3.break_(var2x.c_()), rjh_3.break_(var2x.d_()));
         rRP.class_(var3x).ifPresent(var2xx -> var3.accept(var2x, var2xx));
      });
   }

   public Stream<rfH_2> class_(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4, rRr_1 var5) {
      return this.byte_(var1, var3, var4, var5).map(rgU_2::throws_).filter(var2);
   }

   public void class_(rfH_2 var1, rRP var2) {
      this.throws_(rjh_3.class_(var1).continue_()).class_(var1, var2);
   }

   public Optional<rfH_2> class_(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4) {
      return this.byte_(var1, var3, var4, rRr_1.HAS_SPACE).filter(var1x -> var2.test(var1x.throws_())).findFirst().map(var0 -> {
         var0.class_();
         return var0.throws_();
      });
   }

   public Optional<rfH_2> class_(Predicate<rRP> var1, Predicate<rfH_2> var2, rRr_1 var3, rfH_2 var4, int var5, Random var6) {
      List var7 = this.byte_(var1, var4, var5, var3).collect(Collectors.toList());
      Collections.shuffle(var7, var6);
      return var7.stream().filter(var1x -> var2.test(var1x.throws_())).findFirst().map(rgU_2::throws_);
   }

   public boolean class_(rfH_2 var1, Predicate<rRP> var2) {
      return this.protected_(rjh_3.class_(var1).continue_()).map(var2x -> var2x.class_(var1, var2)).orElse(false);
   }

   public void class_(rfH_2 var1) {
      this.throws_(rjh_3.class_(var1).continue_()).class_(var1);
   }

   public long class_(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      return this.byte_(var1, var2, var3, var4).count();
   }

   public boolean class_(rRP var1, rfH_2 var2) {
      Optional var3 = this.throws_(rjh_3.class_(var2).continue_()).byte_(var2);
      return var3.isPresent() && ((rRP)var3.get()).equals(var1);
   }

   public Stream<rgU_2> class_(Predicate<rRP> var1, rfj_3 var2, rRr_1 var3) {
      return IntStream.range(0, 16)
         .boxed()
         .map(var2x -> this.protected_(rjh_3.class_(var2, var2x).continue_()))
         .filter(Optional::isPresent)
         .flatMap(var2x -> var2x.get().class_(var1, var3));
   }

   @Override
   protected void class_(long var1) {
      super.class_(var1);
      this.class_.break_(var1, this.class_.break_(var1), false);
   }

   @Override
   public void class_(BooleanSupplier var1) {
      super.class_(var1);
      this.class_.class_();
   }

   public int class_(rjh_3 var1) {
      this.class_.class_();
      return this.class_.byte_(var1.continue_());
   }

   public void class_(rfj_3 var1, roQ_2 var2) {
      rjh_3 var3 = rjh_3.class_(var1, var2.catch_() >> 4);
      rqR_2.class_(this.protected_(var3.continue_()), var3x -> var3x.class_(var3xx -> {
            if (class_(var2)) {
               this.class_(var2, var3, var3xx);
            }
         }), () -> {
         if (class_(var2)) {
            rge_3 var3x = this.throws_(var3.continue_());
            this.class_(var2, var3, var3x::class_);
         }
      });
   }

   public Stream<rgU_2> break_(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      int var5 = Math.floorDiv(var3, 16) + 1;
      return rfj_3.class_(new rfj_3(var2), var5).flatMap(var3x -> this.class_(var1, var3x, var4)).filter(var2x -> {
         rfH_2 var3x = var2x.throws_();
         return Math.abs(var3x.b_() - var2.b_()) <= var3 && Math.abs(var3x.d_() - var2.d_()) <= var3;
      });
   }

   @Override
   protected void break_(long var1) {
      this.class_.break_(var1, this.class_.break_(var1), false);
   }

   public boolean break_(rfH_2 var1) {
      return this.throws_(rjh_3.class_(var1).continue_()).break_(var1);
   }

   public Stream<rfH_2> break_(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4, rRr_1 var5) {
      return this.class_(var1, var2, var3, var4, var5).sorted(Comparator.comparingDouble(var1x -> var1x.private_(var3)));
   }

   boolean case_(long var1) {
      Optional var3 = this.byte_(var1);
      return var3 == null ? false : var3.<Boolean>map(var0 -> var0.class_(rRP.break_, rRr_1.IS_OCCUPIED).count() > 0L).orElse(false);
   }

   public Optional<rfH_2> protected_(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      return this.byte_(var1, var2, var3, var4).map(rgU_2::throws_).min(Comparator.comparingDouble(var1x -> var1x.private_(var2)));
   }
}
