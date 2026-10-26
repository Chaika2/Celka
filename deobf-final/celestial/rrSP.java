package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSP implements rrSx_1 {
   public static final Codec<rrSP> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rrBo_1.class_.fieldOf("outer").forGetter(rrSP::class_), rrBo_1.class_.fieldOf("inner").forGetter(rrSP::break_)).apply(var0, rrSP::new)
   );
   private final rrBo_1<?> break_;
   private final rrBo_1<?> byte_;

   public rrSP(rrBo_1<?> var1, rrBo_1<?> var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rrBo_1<?> class_() {
      return this.break_;
   }

   public rrBo_1<?> break_() {
      return this.byte_;
   }
}
