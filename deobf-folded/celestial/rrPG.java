package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class rrPG extends rrPA {
   public static final Codec<rrPG> id_class = xc_3.id_break
      .xmap(JC::id_break, xd_3::id_continue)
      .listOf()
      .fieldOf("blocks")
      .xmap(rrPG::new, var0 -> var0.id_throws)
      .codec();
   public static final rrPG id_break = new rrPG(ImmutableList.of(xu_3.Js));
   public static final rrPG id_byte = new rrPG(ImmutableList.of(xu_3.id_class));
   public static final rrPG id_protected = new rrPG(ImmutableList.of(xu_3.id_class, xu_3.Js));
   private final ImmutableList<xd_3> id_throws;

   public rrPG(List<xd_3> var1) {
      this.id_throws = ImmutableList.copyOf(var1);
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      return this.id_throws.contains(var5.id_break.id_break()) ? null : var5;
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_class;
   }
}
