package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ror_3 extends rYY {
   public static final Codec<ror_3> throws_ = rYG.protected_.fieldOf("biome").xmap(ror_3::new, var0 -> var0.case_).stable().codec();
   private final Supplier<rYG> case_;

   public ror_3(rYG var1) {
      this(() -> var1);
   }

   public ror_3(Supplier<rYG> var1) {
      super(ImmutableList.of(var1.get()));
      this.case_ = var1;
   }

   @Override
   public Set<rYG> class_(int var1, int var2, int var3, int var4) {
      return Sets.newHashSet(new rYG[]{this.case_.get()});
   }

   @Override
   public rfH_2 class_(int var1, int var2, int var3, int var4, int var5, Predicate<rYG> var6, Random var7, boolean var8) {
      if (var6.test(this.case_.get())) {
         return var8 ? new rfH_2(var1, var2, var3) : new rfH_2(var1 - var4 + var7.nextInt(var4 * 2 + 1), var2, var3 - var4 + var7.nextInt(var4 * 2 + 1));
      } else {
         return null;
      }
   }

   @Override
   protected Codec<? extends rYY> class_() {
      return throws_;
   }

   @Override
   public rYY class_(long var1) {
      return this;
   }

   @Override
   public rYG protected_(int var1, int var2, int var3) {
      return this.case_.get();
   }
}
