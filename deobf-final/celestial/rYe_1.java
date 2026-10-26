package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;

class rYe_1 {
   private final int break_;
   private final DoubleList byte_;
   public static final Codec<rYe_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("firstOctave").forGetter(rYe_1::class_), Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(rYe_1::break_))
            .apply(var0, rYe_1::new)
   );

   public rYe_1(int var1, List<Double> var2) {
      this.break_ = var1;
      this.byte_ = new DoubleArrayList(var2);
   }

   public int class_() {
      return this.break_;
   }

   public DoubleList break_() {
      return this.byte_;
   }
}
