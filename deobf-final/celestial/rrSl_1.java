package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSl_1 implements rrSx_1 {
   public static final Codec<rrSl_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("bottom_offset").orElse(0).forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("top_offset").orElse(0).forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("maximum").orElse(0).forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rrSl_1::new)
   );
   public final int break_;
   public final int byte_;
   public final int protected_;

   public rrSl_1(int var1, int var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }
}
