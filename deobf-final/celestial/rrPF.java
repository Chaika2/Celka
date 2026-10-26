package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;

public class rrPF extends rrPA {
   public static final Codec<rrPF> class_ = rrPv_1.class_.listOf().fieldOf("rules").xmap(rrPF::new, var0 -> var0.break_).codec();
   private final ImmutableList<rrPv_1> break_;

   public rrPF(List<? extends rrPv_1> var1) {
      this.break_ = ImmutableList.copyOf(var1);
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      Random var7 = new Random(rfU_2.class_(var5.class_));
      xc_3 var8 = var1.byte_(var5.class_);
      UnmodifiableIterator var9 = this.break_.iterator();

      while (var9.hasNext()) {
         rrPv_1 var10 = (rrPv_1)var9.next();
         if (var10.class_(var5.break_, var8, var4.class_, var5.class_, var3, var7)) {
            return new rrPp_1(var5.class_, var10.class_(), var10.break_());
         }
      }

      return var5;
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.throws_;
   }
}
