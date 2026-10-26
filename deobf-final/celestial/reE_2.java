package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class reE_2 implements rUv_1 {
   public static final Codec<reE_2> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rDg_1.break_.fieldOf("feature_true").forGetter(var0x -> var0x.break_), rDg_1.break_.fieldOf("feature_false").forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, reE_2::new)
   );
   public final Supplier<rDg_1<?, ?>> break_;
   public final Supplier<rDg_1<?, ?>> byte_;

   public reE_2(Supplier<rDg_1<?, ?>> var1, Supplier<rDg_1<?, ?>> var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return Stream.concat(this.break_.get().protected_(), this.byte_.get().protected_());
   }
}
