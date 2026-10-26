package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrBg_1 implements rrSx_1 {
   public static final Codec<rrBg_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKu_1.field_236074_c_.fieldOf("step").forGetter(var0x -> var0x.id_break), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rrBg_1::new)
   );
   protected final rKu_1 id_break;
   protected final float id_byte;

   public rrBg_1(rKu_1 var1, float var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }
}
