package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDA implements rUv_1 {
   public static final Codec<rDA> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKi_1.id_break.fieldOf("cap_provider").forGetter(var0x -> var0x.id_break),
               rKi_1.id_break.fieldOf("stem_provider").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rDA::new)
   );
   public final rKi_1 id_break;
   public final rKi_1 id_byte;
   public final int id_protected;

   public rDA(rKi_1 var1, rKi_1 var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }
}
