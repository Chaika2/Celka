package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSB implements rrSx_1 {
   public static final Codec<rrSB> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("baseline").forGetter(var0x -> var0x.break_), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.byte_))
            .apply(var0, rrSB::new)
   );
   public final int break_;
   public final int byte_;

   public rrSB(int var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }
}
