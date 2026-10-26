package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public abstract class rYY implements rYn_1 {
   public static final Codec<rYY> class_ = rVL.rE.dispatchStable(rYY::class_, Function.identity());
   protected final Map<rrrZ<?>, Boolean> break_ = Maps.newHashMap();
   protected final Set<xc_3> byte_ = Sets.newHashSet();
   protected final List<rYG> protected_;

   public Set<xc_3> byte_() {
      if (this.byte_.isEmpty()) {
         for (rYG var2 : this.protected_) {
            this.byte_.add(var2.throws_().throws_().class_());
         }
      }

      return this.byte_;
   }

   protected rYY(Stream<Supplier<rYG>> var1) {
      this(var1.map(Supplier::get).collect(ImmutableList.toImmutableList()));
   }

   protected rYY(List<rYG> var1) {
      this.protected_ = var1;
   }

   static {
      rVL.class_(rVL.rE, "fixed", ror_3.throws_);
      rVL.class_(rVL.rE, "multi_noise", rYD.case_);
      rVL.class_(rVL.rE, "checkerboard", rYo_1.throws_);
      rVL.class_(rVL.rE, "vanilla_layered", rYi_1.throws_);
      rVL.class_(rVL.rE, "the_end", rYK.throws_);
   }

   public rfH_2 class_(int var1, int var2, int var3, int var4, int var5, Predicate<rYG> var6, Random var7, boolean var8) {
      int var9 = var1 >> 2;
      int var10 = var3 >> 2;
      int var11 = var4 >> 2;
      int var12 = var2 >> 2;
      rfH_2 var13 = null;
      int var14 = 0;
      int var15 = var8 ? 0 : var11;
      int var16 = var15;

      while (var16 <= var11) {
         for (int var17 = -var16; var17 <= var16; var17 += var5) {
            boolean var18 = Math.abs(var17) == var16;

            for (int var19 = -var16; var19 <= var16; var19 += var5) {
               if (var8) {
                  boolean var20 = Math.abs(var19) == var16;
                  if (!var20 && !var18) {
                     continue;
                  }
               }

               int var22 = var9 + var19;
               int var21 = var10 + var17;
               if (var6.test(this.protected_(var22, var12, var21))) {
                  if (var13 == null || var7.nextInt(var14 + 1) == 0) {
                     var13 = new rfH_2(var22 << 2, var2, var21 << 2);
                     if (var8) {
                        return var13;
                     }
                  }

                  var14++;
               }
            }
         }

         var16 += var5;
      }

      return var13;
   }

   public rfH_2 class_(int var1, int var2, int var3, int var4, Predicate<rYG> var5, Random var6) {
      return this.class_(var1, var2, var3, var4, 1, var5, var6, false);
   }

   protected abstract Codec<? extends rYY> class_();

   public boolean class_(rrrZ<?> var1) {
      return this.break_.computeIfAbsent(var1, var1x -> this.protected_.stream().anyMatch(var1xx -> var1xx.throws_().class_(var1x)));
   }

   public Set<rYG> class_(int var1, int var2, int var3, int var4) {
      int var5 = var1 - var4 >> 2;
      int var6 = var2 - var4 >> 2;
      int var7 = var3 - var4 >> 2;
      int var8 = var1 + var4 >> 2;
      int var9 = var2 + var4 >> 2;
      int var10 = var3 + var4 >> 2;
      int var11 = var8 - var5 + 1;
      int var12 = var9 - var6 + 1;
      int var13 = var10 - var7 + 1;
      HashSet var14 = Sets.newHashSet();

      for (int var15 = 0; var15 < var13; var15++) {
         for (int var16 = 0; var16 < var11; var16++) {
            for (int var17 = 0; var17 < var12; var17++) {
               int var18 = var5 + var16;
               int var19 = var6 + var17;
               int var20 = var7 + var15;
               var14.add(this.protected_(var18, var19, var20));
            }
         }
      }

      return var14;
   }

   public abstract rYY class_(long var1);

   public List<rYG> break_() {
      return this.protected_;
   }
}
