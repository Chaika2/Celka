package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class rrPk_1 extends rrPA {
   public static final Codec<rrPk_1> class_ = Codec.unit(() -> rrPk_1.break_);
   public static final rrPk_1 break_ = new rrPk_1();

   private rrPk_1() {
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      xc_3 var7 = var5.break_;
      if (var7.class_(xu_3.JE)) {
         String var8 = var5.byte_.native_("final_state");
         Rk_1 var9 = new Rk_1(new StringReader(var8), false);

         try {
            var9.class_(true);
         } catch (CommandSyntaxException var11) {
            throw new RuntimeException(var11);
         }

         return var9.break_().class_(xu_3.bo) ? null : new rrPp_1(var5.class_, var9.break_(), (rcd_3)null);
      } else {
         return var5;
      }
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.protected_;
   }
}
