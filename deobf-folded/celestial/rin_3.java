package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rin_3 implements rUv_1 {
   public static final Codec<rin_3> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rip_3.field_236998_c_.fieldOf("biome_temp").forGetter(var0x -> var0x.id_break),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter(var0x -> var0x.id_byte),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rin_3::new)
   );
   public final rip_3 id_break;
   public final float id_byte;
   public final float id_protected;

   public rin_3(rip_3 var1, float var2, float var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }
}
