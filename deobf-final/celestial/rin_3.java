package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rin_3 implements rUv_1 {
   public static final Codec<rin_3> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rip_3.field_236998_c_.fieldOf("biome_temp").forGetter(var0x -> var0x.break_),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter(var0x -> var0x.byte_),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rin_3::new)
   );
   public final rip_3 break_;
   public final float byte_;
   public final float protected_;

   public rin_3(rip_3 var1, float var2, float var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }
}
