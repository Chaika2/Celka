package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPb_1 extends rrPL {
   public static final Codec<rrPb_1> id_class = rVL.id_strictfp.fieldOf("block").xmap(rrPb_1::new, var0 -> var0.id_break).codec();
   private final xd_3 id_break;

   public rrPb_1(xd_3 var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class(xc_3 var1, Random var2) {
      return var1.id_class(this.id_break);
   }

   @Override
   protected rrPJ<?> id_class() {
      return rrPJ.id_break;
   }
}
