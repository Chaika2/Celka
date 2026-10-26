package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rYV {
   public static final Codec<rYV> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(rLQ.L.fieldOf("options").forGetter(var0x -> var0x.id_break), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.id_byte))
            .apply(var0, rYV::new)
   );
   private final rLx_1 id_break;
   private final float id_byte;

   public rYV(rLx_1 var1, float var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rLx_1 id_class() {
      return this.id_break;
   }

   public boolean id_class(Random var1) {
      return var1.nextFloat() <= this.id_byte;
   }
}
