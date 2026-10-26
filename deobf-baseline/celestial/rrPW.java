package celestial;

import com.mojang.serialization.Codec;

public class rrPW extends rrPA {
   public static final Codec<rrPW> id_class = Codec.unit(() -> rrPW.id_break);
   public static final rrPW id_break = new rrPW();

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      rfH_2 var7 = var5.id_class;
      boolean var8 = var1.id_byte(var7).id_class(xu_3.id_instanceof);
      return var8 && !xd_3.id_class(var5.id_break.id_finally(var1, var7)) ? new rrPp_1(var7, xu_3.id_instanceof.id_continue(), var5.id_byte) : var5;
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_implements;
   }
}
