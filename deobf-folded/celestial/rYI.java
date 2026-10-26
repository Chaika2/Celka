package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYI {
   public static final Codec<rYI> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("energy_budget").forGetter(var0x -> var0x.id_break), Codec.DOUBLE.fieldOf("charge").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rYI::new)
   );
   private final double id_break;
   private final double id_byte;

   rYI(double var1, double var3) {
      this.id_break = var1;
      this.id_byte = var3;
   }

   public double id_class() {
      return this.id_break;
   }

   public double id_break() {
      return this.id_byte;
   }
}
