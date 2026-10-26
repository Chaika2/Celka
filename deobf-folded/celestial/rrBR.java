package celestial;

import com.mojang.serialization.Codec;

public class rrBR implements rrSx_1 {
   public static final Codec<rrBR> id_class = Codec.INT.fieldOf("chance").xmap(rrBR::new, var0 -> var0.id_break).codec();
   public final int id_break;

   public rrBR(int var1) {
      this.id_break = var1;
   }
}
