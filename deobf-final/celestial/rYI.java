package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYI {
   public static final Codec<rYI> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter(var0x -> var0x.break_), Codec.DOUBLE.fieldOf("charge").forGetter(var0x -> var0x.byte_))
            .apply(var0, rYI::new)
   );
   private final double break_;
   private final double byte_;

   rYI(double var1, double var3) {
      this.break_ = var1;
      this.byte_ = var3;
   }

   public double class_() {
      return this.break_;
   }

   public double break_() {
      return this.byte_;
   }
}
