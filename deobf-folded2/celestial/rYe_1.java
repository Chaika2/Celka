package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;

class rYe_1 {
   private final int id_break;
   private final DoubleList id_byte;
   public static final Codec<rYe_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("firstOctave").forGetter(rYe_1::id_class), Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(rYe_1::id_break))
            .apply(var0, rYe_1::new)
   );

   public rYe_1(int var1, List<Double> var2) {
      this.id_break = var1;
      this.id_byte = new DoubleArrayList(var2);
   }

   public int id_class() {
      return this.id_break;
   }

   public DoubleList id_break() {
      return this.id_byte;
   }
}
