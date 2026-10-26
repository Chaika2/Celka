package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPd_1 extends rrPA {
   public static final Codec<rrPd_1> id_class = Codec.FLOAT.fieldOf("integrity").orElse(1.0F).xmap(rrPd_1::new, var0 -> var0.id_break).codec();
   private final float id_break;

   public rrPd_1(float var1) {
      this.id_break = var1;
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      Random var7 = var6.id_break(var5.id_class);
      return !(this.id_break >= 1.0F) && !(var7.nextFloat() <= this.id_break) ? null : var5;
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_break;
   }
}
