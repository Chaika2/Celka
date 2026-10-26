package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Random;

public class rDs_1 extends rKi_1 {
   public static final Codec<rDs_1> class_ = rTB.class_(xc_3.break_).comapFlatMap(rDs_1::class_, var0 -> var0.byte_).fieldOf("entries").codec();
   private final rTB<xc_3> byte_;

   public rDs_1() {
      this(new rTB<>());
   }

   private rDs_1(rTB<xc_3> var1) {
      this.byte_ = var1;
   }

   private static DataResult<rDs_1> class_(rTB<xc_3> var0) {
      return var0.break_() ? DataResult.error("WeightedStateProvider with no states") : DataResult.success(new rDs_1(var0));
   }

   @Override
   public xc_3 class_(Random var1, rfH_2 var2) {
      return this.byte_.break_(var1);
   }

   public rDs_1 class_(xc_3 var1, int var2) {
      this.byte_.class_(var1, var2);
      return this;
   }

   @Override
   protected rDr_1<?> class_() {
      return rDr_1.break_;
   }
}
