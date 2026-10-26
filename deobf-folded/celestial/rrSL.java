package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSL<DC extends rrSx_1> extends rrSu_1<DC> {
   public rrSL(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public final Stream<rfH_2> id_class(reX_2 var1, Random var2, DC var3, rfH_2 var4) {
      return this.id_class(var2, (DC)var3, var4);
   }

   protected abstract Stream<rfH_2> id_class(Random var1, DC var2, rfH_2 var3);
}
