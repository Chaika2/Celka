package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class raI_2 implements rUv_1 {
   public static final Codec<raI_2> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.id_break),
               raU_2.field_236324_c_.fieldOf("type").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, raI_2::new)
   );
   public final float id_break;
   public final raU_2 id_byte;

   public raI_2(float var1, raU_2 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }
}
