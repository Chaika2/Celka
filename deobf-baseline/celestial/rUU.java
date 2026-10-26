package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rUU implements rUv_1 {
   public static final Codec<rUU> id_class = rDg_1.id_byte.fieldOf("features").xmap(rUU::new, var0 -> var0.id_break).codec();
   public final List<Supplier<rDg_1<?, ?>>> id_break;

   public rUU(List<Supplier<rDg_1<?, ?>>> var1) {
      this.id_break = var1;
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return this.id_break.stream().flatMap(var0 -> var0.get().id_protected());
   }
}
