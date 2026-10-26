package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rUy_1 implements rUv_1 {
   public static final Codec<rUy_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.apply2(
            rUy_1::new,
            rDR.class_.listOf().fieldOf("features").forGetter(var0x -> var0x.break_),
            rDg_1.break_.fieldOf("default").forGetter(var0x -> var0x.byte_)
         )
   );
   public final List<rDR> break_;
   public final Supplier<rDg_1<?, ?>> byte_;

   public rUy_1(List<rDR> var1, rDg_1<?, ?> var2) {
      this(var1, () -> var2);
   }

   private rUy_1(List<rDR> var1, Supplier<rDg_1<?, ?>> var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return Stream.concat(this.break_.stream().flatMap(var0 -> var0.break_.get().protected_()), this.byte_.get().protected_());
   }
}
