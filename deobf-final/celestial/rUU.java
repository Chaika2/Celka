package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rUU implements rUv_1 {
   public static final Codec<rUU> class_ = rDg_1.byte_.fieldOf("features").xmap(rUU::new, var0 -> var0.break_).codec();
   public final List<Supplier<rDg_1<?, ?>>> break_;

   public rUU(List<Supplier<rDg_1<?, ?>>> var1) {
      this.break_ = var1;
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return this.break_.stream().flatMap(var0 -> var0.get().protected_());
   }
}
