package celestial;

import com.mojang.serialization.Codec;

public class rrBR implements rrSx_1 {
   public static final Codec<rrBR> class_ = Codec.INT.fieldOf("chance").xmap(rrBR::new, var0 -> var0.break_).codec();
   public final int break_;

   public rrBR(int var1) {
      this.break_ = var1;
   }
}
