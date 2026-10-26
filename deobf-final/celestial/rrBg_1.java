package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrBg_1 implements rrSx_1 {
   public static final Codec<rrBg_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKu_1.field_236074_c_.fieldOf("step").forGetter(var0x -> var0x.break_), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, rrBg_1::new)
   );
   protected final rKu_1 break_;
   protected final float byte_;

   public rrBg_1(rKu_1 var1, float var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }
}
