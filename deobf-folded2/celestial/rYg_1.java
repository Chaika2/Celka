package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYg_1 {
   public static final Codec<rYg_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqA_2.id_class.fieldOf("sound").forGetter(var0x -> var0x.id_break), Codec.DOUBLE.fieldOf("tick_chance").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rYg_1::new)
   );
   private rqA_2 id_break;
   private double id_byte;

   public rYg_1(rqA_2 var1, double var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rqA_2 id_class() {
      return this.id_break;
   }

   public double id_break() {
      return this.id_byte;
   }
}
