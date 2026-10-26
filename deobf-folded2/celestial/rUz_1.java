package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUz_1 implements rUv_1 {
   public static final Codec<rUz_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 255).fieldOf("height").forGetter(var0x -> var0x.id_break), xc_3.id_break.fieldOf("state").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rUz_1::new)
   );
   public final int id_break;
   public final xc_3 id_byte;

   public rUz_1(int var1, xc_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }
}
