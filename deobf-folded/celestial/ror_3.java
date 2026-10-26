package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ror_3 extends rYY {
   public static final Codec<ror_3> id_throws = rYG.id_protected.fieldOf("biome").xmap(ror_3::new, var0 -> var0.id_case).stable().codec();
   private final Supplier<rYG> id_case;

   public ror_3(rYG var1) {
      this(() -> var1);
   }

   public ror_3(Supplier<rYG> var1) {
      super(ImmutableList.of(var1.get()));
      this.id_case = var1;
   }

   @Override
   public Set<rYG> id_class(int var1, int var2, int var3, int var4) {
      return Sets.newHashSet(new rYG[]{this.id_case.get()});
   }

   @Override
   public rfH_2 id_class(int var1, int var2, int var3, int var4, int var5, Predicate<rYG> var6, Random var7, boolean var8) {
      if (var6.test(this.id_case.get())) {
         return var8 ? new rfH_2(var1, var2, var3) : new rfH_2(var1 - var4 + var7.nextInt(var4 * 2 + 1), var2, var3 - var4 + var7.nextInt(var4 * 2 + 1));
      } else {
         return null;
      }
   }

   @Override
   protected Codec<? extends rYY> id_class() {
      return id_throws;
   }

   @Override
   public rYY id_class(long var1) {
      return this;
   }

   @Override
   public rYG id_protected(int var1, int var2, int var3) {
      return this.id_case.get();
   }
}
