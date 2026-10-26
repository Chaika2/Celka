package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSN implements rrSx_1 {
   public static final Codec<rrSN> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("noise_level").forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("below_noise").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("above_noise").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrSN::new)
   );
   public final double id_break;
   public final int id_byte;
   public final int id_protected;

   public rrSN(double var1, int var3, int var4) {
      this.id_break = var1;
      this.id_byte = var3;
      this.id_protected = var4;
   }
}
