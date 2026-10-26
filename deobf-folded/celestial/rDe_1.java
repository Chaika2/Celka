package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rDe_1 implements rUv_1 {
   public static final Codec<rDe_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rDg_1.id_break.fieldOf("feature").forGetter(var0x -> var0x.id_break), rrBo_1.id_class.fieldOf("decorator").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rDe_1::new)
   );
   public final Supplier<rDg_1<?, ?>> id_break;
   public final rrBo_1<?> id_byte;

   public rDe_1(Supplier<rDg_1<?, ?>> var1, rrBo_1<?> var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public String toString() {
      return String.format("< %s [%s | %s] >", this.getClass().getSimpleName(), rVL.q.id_break(this.id_break.get().id_break()), this.id_byte);
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return this.id_break.get().id_protected();
   }
}
