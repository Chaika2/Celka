package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSH implements rrSx_1 {
   public static final Codec<rrSH> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter(var0x -> var0x.id_break),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter(var0x -> var0x.id_byte),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrSH::new)
   );
   public final int id_break;
   public final double id_byte;
   public final double id_protected;

   public rrSH(int var1, double var2, double var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var4;
   }
}
