package celestial;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class rDM<WC extends rDX> {
   public static final Codec<rDM<?>> class_ = rVL.y.dispatch(var0 -> var0.protected_, rDk_1::byte_);
   public static final Codec<Supplier<rDM<?>>> break_ = rVA.class_(rVL.Z, class_);
   public static final Codec<List<Supplier<rDM<?>>>> byte_ = rVA.break_(rVL.Z, class_);
   private final rDk_1<WC> protected_;
   private final WC throws_;

   public rDM(rDk_1<WC> var1, WC var2) {
      this.protected_ = var1;
      this.throws_ = (WC)var2;
   }

   public boolean class_(roC_2 var1, Function<rfH_2, rYG> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9) {
      return this.protected_.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, this.throws_);
   }

   public WC class_() {
      return this.throws_;
   }

   public boolean class_(Random var1, int var2, int var3) {
      return this.protected_.class_(var1, var2, var3, this.throws_);
   }
}
