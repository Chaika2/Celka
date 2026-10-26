package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSP implements rrSx_1 {
   public static final Codec<rrSP> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(rrBo_1.id_class.fieldOf("outer").forGetter(rrSP::id_class), rrBo_1.id_class.fieldOf("inner").forGetter(rrSP::id_break))
            .apply(var0, rrSP::new)
   );
   private final rrBo_1<?> id_break;
   private final rrBo_1<?> id_byte;

   public rrSP(rrBo_1<?> var1, rrBo_1<?> var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rrBo_1<?> id_class() {
      return this.id_break;
   }

   public rrBo_1<?> id_break() {
      return this.id_byte;
   }
}
