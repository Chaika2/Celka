package celestial;

import com.mojang.serialization.Codec;

public class rrPQ extends rrPA {
   public static final Codec<rrPQ> id_class = Codec.unit(() -> rrPQ.id_break);
   public static final rrPQ id_break = new rrPQ();

   private rrPQ() {
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      return var5;
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_case;
   }
}
