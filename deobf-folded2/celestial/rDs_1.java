package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Random;

public class rDs_1 extends rKi_1 {
   public static final Codec<rDs_1> id_class = rTB.id_class(xc_3.id_break).comapFlatMap(rDs_1::id_class, var0 -> var0.id_byte).fieldOf("entries").codec();
   private final rTB<xc_3> id_byte;

   public rDs_1() {
      this(new rTB<>());
   }

   private rDs_1(rTB<xc_3> var1) {
      this.id_byte = var1;
   }

   private static DataResult<rDs_1> id_class(rTB<xc_3> var0) {
      return var0.id_break() ? DataResult.error("WeightedStateProvider with no states") : DataResult.success(new rDs_1(var0));
   }

   @Override
   public xc_3 id_class(Random var1, rfH_2 var2) {
      return this.id_byte.id_break(var1);
   }

   public rDs_1 id_class(xc_3 var1, int var2) {
      this.id_byte.id_class(var1, var2);
      return this;
   }

   @Override
   protected rDr_1<?> id_class() {
      return rDr_1.id_break;
   }
}
