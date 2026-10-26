package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDV implements rUv_1 {
   public static final Codec<rDV> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rUX.id_class(0, 2, 1).fieldOf("reach").forGetter(var0x -> var0x.id_break),
               rUX.id_class(1, 5, 5).fieldOf("height").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rDV::new)
   );
   private final rUX id_break;
   private final rUX id_byte;

   public rDV(rUX var1, rUX var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rUX id_class() {
      return this.id_break;
   }

   public rUX id_break() {
      return this.id_byte;
   }
}
