package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYg_1 {
   public static final Codec<rYg_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rqA_2.class_.fieldOf("sound").forGetter(var0x -> var0x.break_), Codec.DOUBLE.fieldOf("tick_chance").forGetter(var0x -> var0x.byte_))
            .apply(var0, rYg_1::new)
   );
   private rqA_2 break_;
   private double byte_;

   public rYg_1(rqA_2 var1, double var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rqA_2 class_() {
      return this.break_;
   }

   public double break_() {
      return this.byte_;
   }
}
