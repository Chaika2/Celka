package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;

public class rrPF extends rrPA {
   public static final Codec<rrPF> id_class = rrPv_1.id_class.listOf().fieldOf("rules").xmap(rrPF::new, var0 -> var0.id_break).codec();
   private final ImmutableList<rrPv_1> id_break;

   public rrPF(List<? extends rrPv_1> var1) {
      this.id_break = ImmutableList.copyOf(var1);
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      Random var7 = new Random(rfU_2.id_class(var5.id_class));
      xc_3 var8 = var1.id_byte(var5.id_class);
      UnmodifiableIterator var9 = this.id_break.iterator();

      while (var9.hasNext()) {
         rrPv_1 var10 = (rrPv_1)var9.next();
         if (var10.id_class(var5.id_break, var8, var4.id_class, var5.id_class, var3, var7)) {
            return new rrPp_1(var5.id_class, var10.id_class(), var10.id_break());
         }
      }

      return var5;
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_throws;
   }
}
