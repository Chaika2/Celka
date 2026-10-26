package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrBj_1 implements rrSx_1 {
   public static final Codec<rrBj_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("count").forGetter(var0x -> var0x.break_),
               Codec.FLOAT.fieldOf("extra_chance").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("extra_count").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrBj_1::new)
   );
   public final int break_;
   public final float byte_;
   public final int protected_;

   public rrBj_1(int var1, float var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }
}
