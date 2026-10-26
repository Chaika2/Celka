package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rUy_1 implements rUv_1 {
   public static final Codec<rUy_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.apply2(
            rUy_1::new,
            rDR.id_class.listOf().fieldOf("features").forGetter(var0x -> var0x.id_break),
            rDg_1.id_break.fieldOf("default").forGetter(var0x -> var0x.id_byte)
         )
   );
   public final List<rDR> id_break;
   public final Supplier<rDg_1<?, ?>> id_byte;

   public rUy_1(List<rDR> var1, rDg_1<?, ?> var2) {
      this(var1, () -> var2);
   }

   private rUy_1(List<rDR> var1, Supplier<rDg_1<?, ?>> var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public Stream<rDg_1<?, ?>> ae_() {
      return Stream.concat(this.id_break.stream().flatMap(var0 -> var0.id_break.get().id_protected()), this.id_byte.get().id_protected());
   }
}
