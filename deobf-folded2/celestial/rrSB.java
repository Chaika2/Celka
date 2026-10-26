package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSB implements rrSx_1 {
   public static final Codec<rrSB> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("baseline").forGetter(var0x -> var0x.id_break), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.id_byte))
            .apply(var0, rrSB::new)
   );
   public final int id_break;
   public final int id_byte;

   public rrSB(int var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }
}
