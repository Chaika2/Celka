package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPS extends rrPc_1 {
   public static final Codec<rrPS> class_ = Codec.unit(() -> rrPS.break_);
   public static final rrPS break_ = new rrPS();

   private rrPS() {
   }

   @Override
   public boolean class_(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4) {
      return true;
   }

   @Override
   protected rrPX<?> class_() {
      return rrPX.class_;
   }
}
