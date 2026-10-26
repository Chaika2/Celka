package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrBj_1 implements rrSx_1 {
   public static final Codec<rrBj_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("count").forGetter(var0x -> var0x.id_break),
               Codec.FLOAT.fieldOf("extra_chance").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("extra_count").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrBj_1::new)
   );
   public final int id_break;
   public final float id_byte;
   public final int id_protected;

   public rrBj_1(int var1, float var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }
}
