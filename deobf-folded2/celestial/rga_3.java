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
   private final rgi_3 id_class;
   private final LongSet id_break = new LongOpenHashSet();

   public Optional<rRP> id_byte(rfH_2 var1) {
      rge_3 var2 = this.id_throws(rjh_3.id_class(var1).id_continue());
      return var2.id_byte(var1);
   }

   public Optional<rfH_2> id_byte(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4, rRr_1 var5) {
      return this.id_class(var1, var2, var3, var4, var5).findFirst();
   }

   public Stream<rgU_2> id_byte(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      int var5 = var3 * var3;
      return this.id_break(var1, var2, var3, var4).filter(var2x -> var2x.id_throws().id_private(var2) <= (double)var5);
   }

   public rga_3(File var1, DataFixer var2, boolean var3) {
      super(var1, rge_3::id_class, rge_3::new, var2, rTv_1.POI_CHUNK, var3);
      this.id_class = new rgi_3(this);
   }

   private static boolean id_class(roQ_2 var0) {
      return var0.id_class(rRP.id_public::contains);
   }

   public void id_class(rRR var1, rfH_2 var2, int var3) {
      rjh_3.id_break(new rfj_3(var2), Math.floorDiv(var3, 16))
         .map(var1x -> Pair.of(var1x, this.id_protected(var1x.id_continue())))
         .filter(var0 -> !((Optional)var0.getSecond()).<Boolean>map(rge_3::id_class).orElse(false))
         .map(var0 -> ((rjh_3)var0.getFirst()).id_new())
         .filter(var1x -> this.id_break.add(var1x.id_class()))
         .forEach(var1x -> var1.id_class(var1x.id_break, var1x.id_byte, roN_2.id_class));
   }

   private void id_class(roQ_2 var1, rjh_3 var2, BiConsumer<rfH_2, rRP> var3) {
      var2.id_super().forEach(var2x -> {
         xc_3 var3x = var1.id_class(rjh_3.id_break(var2x.b_()), rjh_3.id_break(var2x.c_()), rjh_3.id_break(var2x.d_()));
         rRP.id_class(var3x).ifPresent(var2xx -> var3.accept(var2x, var2xx));
      });
   }

   public Stream<rfH_2> id_class(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4, rRr_1 var5) {
      return this.id_byte(var1, var3, var4, var5).map(rgU_2::id_throws).filter(var2);
   }

   public void id_class(rfH_2 var1, rRP var2) {
      this.id_throws(rjh_3.id_class(var1).id_continue()).id_class(var1, var2);
   }

   public Optional<rfH_2> id_class(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4) {
      return this.id_byte(var1, var3, var4, rRr_1.HAS_SPACE).filter(var1x -> var2.test(var1x.id_throws())).findFirst().map(var0 -> {
         var0.id_class();
         return var0.id_throws();
      });
   }

   public Optional<rfH_2> id_class(Predicate<rRP> var1, Predicate<rfH_2> var2, rRr_1 var3, rfH_2 var4, int var5, Random var6) {
      List var7 = this.id_byte(var1, var4, var5, var3).collect(Collectors.toList());
      Collections.shuffle(var7, var6);
      return var7.stream().filter(var1x -> var2.test(var1x.id_throws())).findFirst().map(rgU_2::id_throws);
   }

   public boolean id_class(rfH_2 var1, Predicate<rRP> var2) {
      return this.id_protected(rjh_3.id_class(var1).id_continue()).map(var2x -> var2x.id_class(var1, var2)).orElse(false);
   }

   public void id_class(rfH_2 var1) {
      this.id_throws(rjh_3.id_class(var1).id_continue()).id_class(var1);
   }

   public long id_class(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      return this.id_byte(var1, var2, var3, var4).count();
   }

   public boolean id_class(rRP var1, rfH_2 var2) {
      Optional var3 = this.id_throws(rjh_3.id_class(var2).id_continue()).id_byte(var2);
      return var3.isPresent() && ((rRP)var3.get()).equals(var1);
   }

   public Stream<rgU_2> id_class(Predicate<rRP> var1, rfj_3 var2, rRr_1 var3) {
      return IntStream.range(0, 16)
         .boxed()
         .map(var2x -> this.id_protected(rjh_3.id_class(var2, var2x).id_continue()))
         .filter(Optional::isPresent)
         .flatMap(var2x -> var2x.get().id_class(var1, var3));
   }

   @Override
   protected void id_class(long var1) {
      super.id_class(var1);
      this.id_class.id_break(var1, this.id_class.id_break(var1), false);
   }

   @Override
   public void id_class(BooleanSupplier var1) {
      super.id_class(var1);
      this.id_class.id_class();
   }

   public int id_class(rjh_3 var1) {
      this.id_class.id_class();
      return this.id_class.id_byte(var1.id_continue());
   }

   public void id_class(rfj_3 var1, roQ_2 var2) {
      rjh_3 var3 = rjh_3.id_class(var1, var2.id_catch() >> 4);
      rqR_2.id_class(this.id_protected(var3.id_continue()), var3x -> var3x.id_class(var3xx -> {
            if (id_class(var2)) {
               this.id_class(var2, var3, var3xx);
            }
         }), () -> {
         if (id_class(var2)) {
            rge_3 var3x = this.id_throws(var3.id_continue());
            this.id_class(var2, var3, var3x::id_class);
         }
      });
   }

   public Stream<rgU_2> id_break(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      int var5 = Math.floorDiv(var3, 16) + 1;
      return rfj_3.id_class(new rfj_3(var2), var5).flatMap(var3x -> this.id_class(var1, var3x, var4)).filter(var2x -> {
         rfH_2 var3x = var2x.id_throws();
         return Math.abs(var3x.b_() - var2.b_()) <= var3 && Math.abs(var3x.d_() - var2.d_()) <= var3;
      });
   }

   @Override
   protected void id_break(long var1) {
      this.id_class.id_break(var1, this.id_class.id_break(var1), false);
   }

   public boolean id_break(rfH_2 var1) {
      return this.id_throws(rjh_3.id_class(var1).id_continue()).id_break(var1);
   }

   public Stream<rfH_2> id_break(Predicate<rRP> var1, Predicate<rfH_2> var2, rfH_2 var3, int var4, rRr_1 var5) {
      return this.id_class(var1, var2, var3, var4, var5).sorted(Comparator.comparingDouble(var1x -> var1x.id_private(var3)));
   }

   boolean id_case(long var1) {
      Optional var3 = this.id_byte(var1);
      return var3 == null ? false : var3.<Boolean>map(var0 -> var0.id_class(rRP.id_break, rRr_1.IS_OCCUPIED).count() > 0L).orElse(false);
   }

   public Optional<rfH_2> id_protected(Predicate<rRP> var1, rfH_2 var2, int var3, rRr_1 var4) {
      return this.id_byte(var1, var2, var3, var4).map(rgU_2::id_throws).min(Comparator.comparingDouble(var1x -> var1x.id_private(var2)));
   }
}
