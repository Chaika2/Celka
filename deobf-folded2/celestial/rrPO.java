package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPO extends rrPL {
   public static final Codec<rrPO> id_class = xc_3.id_break.fieldOf("block_state").xmap(rrPO::new, var0 -> var0.id_break).codec();
   private final xc_3 id_break;

   public rrPO(xc_3 var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class(xc_3 var1, Random var2) {
      return var1 == this.id_break;
   }

   @Override
   protected rrPJ<?> id_class() {
      return rrPJ.id_byte;
   }
}
