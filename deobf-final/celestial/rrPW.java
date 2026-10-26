package celestial;

import com.mojang.serialization.Codec;

public class rrPW extends rrPA {
   public static final Codec<rrPW> class_ = Codec.unit(() -> rrPW.break_);
   public static final rrPW break_ = new rrPW();

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      rfH_2 var7 = var5.class_;
      boolean var8 = var1.byte_(var7).class_(xu_3.instanceof_);
      return var8 && !xd_3.class_(var5.break_.finally_(var1, var7)) ? new rrPp_1(var7, xu_3.instanceof_.continue_(), var5.byte_) : var5;
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.implements_;
   }
}
