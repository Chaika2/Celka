package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPC extends rrPL {
   public static final Codec<rrPC> class_ = rlb_3.class_(() -> rlZ_2.class_().class_()).fieldOf("tag").xmap(rrPC::new, var0 -> var0.break_).codec();
   private final rlb_3<xd_3> break_;

   public rrPC(rlb_3<xd_3> var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_(xc_3 var1, Random var2) {
      return var1.class_(this.break_);
   }

   @Override
   protected rrPJ<?> class_() {
      return rrPJ.protected_;
   }
}
