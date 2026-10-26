package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSl_1 implements rrSx_1 {
   public static final Codec<rrSl_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("bottom_offset").orElse(0).forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("top_offset").orElse(0).forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("maximum").orElse(0).forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrSl_1::new)
   );
   public final int id_break;
   public final int id_byte;
   public final int id_protected;

   public rrSl_1(int var1, int var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }
}
