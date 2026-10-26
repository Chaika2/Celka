package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class reE_2 implements rUv_1 {
   public static final Codec<reE_2> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rDg_1.id_break.fieldOf("feature_true").forGetter(var0x -> var0x.id_break),
               rDg_1.id_break.fieldOf("feature_false").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, reE_2::new)
   );
   public final Supplier<rDg_1<?, ?>> id_break;
   public final Supplier<rDg_1<?, ?>> id_byte;

   public reE_2(Supplier<rDg_1<?, ?>> var1, Supplier<rDg_1<?, ?>> var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return Stream.concat(this.id_break.get().id_protected(), this.id_byte.get().id_protected());
   }
}
