package celestial;

import com.mojang.serialization.Codec;

public interface rrPX<P extends rrPc_1> {
   rrPX<rrPS> class_ = class_("always_true", rrPS.class_);
   rrPX<rrPz_1> break_ = class_("linear_pos", rrPz_1.class_);
   rrPX<rrPs_1> byte_ = class_("axis_aligned_linear_pos", rrPs_1.class_);

   static <P extends rrPc_1> rrPX<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.E, var0, () -> var1);
   }

   Codec<P> codec();
}
