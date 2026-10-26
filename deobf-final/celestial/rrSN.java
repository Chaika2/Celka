package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSN implements rrSx_1 {
   public static final Codec<rrSN> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("noise_level").forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("below_noise").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("above_noise").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrSN::new)
   );
   public final double break_;
   public final int byte_;
   public final int protected_;

   public rrSN(double var1, int var3, int var4) {
      this.break_ = var1;
      this.byte_ = var3;
      this.protected_ = var4;
   }
}
