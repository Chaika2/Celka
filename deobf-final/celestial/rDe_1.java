package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rDe_1 implements rUv_1 {
   public static final Codec<rDe_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rDg_1.break_.fieldOf("feature").forGetter(var0x -> var0x.break_), rrBo_1.class_.fieldOf("decorator").forGetter(var0x -> var0x.byte_))
            .apply(var0, rDe_1::new)
   );
   public final Supplier<rDg_1<?, ?>> break_;
   public final rrBo_1<?> byte_;

   public rDe_1(Supplier<rDg_1<?, ?>> var1, rrBo_1<?> var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public String toString() {
      return String.format("< %s [%s | %s] >", this.getClass().getSimpleName(), rVL.q.break_(this.break_.get().break_()), this.byte_);
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return this.break_.get().protected_();
   }
}
