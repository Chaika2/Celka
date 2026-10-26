package celestial;

import com.mojang.serialization.Codec;

public interface rrPX<P extends rrPc_1> {
   rrPX<rrPS> id_class = id_class("always_true", rrPS.id_class);
   rrPX<rrPz_1> id_break = id_class("linear_pos", rrPz_1.id_class);
   rrPX<rrPs_1> id_byte = id_class("axis_aligned_linear_pos", rrPs_1.id_class);

   static <P extends rrPc_1> rrPX<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.E, var0, () -> var1);
   }

   Codec<P> codec();
}
