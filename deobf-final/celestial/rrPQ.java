package celestial;

import com.mojang.serialization.Codec;

public class rrPQ extends rrPA {
   public static final Codec<rrPQ> class_ = Codec.unit(() -> rrPQ.break_);
   public static final rrPQ break_ = new rrPQ();

   private rrPQ() {
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      return var5;
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.case_;
   }
}
