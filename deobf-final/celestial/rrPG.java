package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class rrPG extends rrPA {
   public static final Codec<rrPG> class_ = xc_3.break_
      .xmap(JC::break_, xd_3::continue_)
      .listOf()
      .fieldOf("blocks")
      .xmap(rrPG::new, var0 -> var0.throws_)
      .codec();
   public static final rrPG break_ = new rrPG(ImmutableList.of(xu_3.Js));
   public static final rrPG byte_ = new rrPG(ImmutableList.of(xu_3.class_));
   public static final rrPG protected_ = new rrPG(ImmutableList.of(xu_3.class_, xu_3.Js));
   private final ImmutableList<xd_3> throws_;

   public rrPG(List<xd_3> var1) {
      this.throws_ = ImmutableList.copyOf(var1);
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      return this.throws_.contains(var5.break_.break_()) ? null : var5;
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.class_;
   }
}
