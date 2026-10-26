package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPO extends rrPL {
   public static final Codec<rrPO> class_ = xc_3.break_.fieldOf("block_state").xmap(rrPO::new, var0 -> var0.break_).codec();
   private final xc_3 break_;

   public rrPO(xc_3 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_(xc_3 var1, Random var2) {
      return var1 == this.break_;
   }

   @Override
   protected rrPJ<?> class_() {
      return rrPJ.byte_;
   }
}
