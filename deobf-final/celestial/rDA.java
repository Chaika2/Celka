package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDA implements rUv_1 {
   public static final Codec<rDA> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKi_1.break_.fieldOf("cap_provider").forGetter(var0x -> var0x.break_),
               rKi_1.break_.fieldOf("stem_provider").forGetter(var0x -> var0x.byte_),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter(var0x -> var0x.protected_)
            )
            .apply(var0, rDA::new)
   );
   public final rKi_1 break_;
   public final rKi_1 byte_;
   public final int protected_;

   public rDA(rKi_1 var1, rKi_1 var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }
}
