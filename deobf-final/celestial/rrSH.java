package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSH implements rrSx_1 {
   public static final Codec<rrSH> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter(var0x -> var0x.break_),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter(var0x -> var0x.byte_),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrSH::new)
   );
   public final int break_;
   public final double byte_;
   public final double protected_;

   public rrSH(int var1, double var2, double var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var4;
   }
}
