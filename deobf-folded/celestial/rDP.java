package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDP extends rKi_1 {
   public static final Codec<rDP> id_class = Codec.unit(() -> rDP.id_byte);
   private static final xc_3[] id_protected = new xc_3[]{
      xu_3.ru.id_continue(),
      xu_3.rm.id_continue(),
      xu_3.rv.id_continue(),
      xu_3.rF.id_continue(),
      xu_3.rL.id_continue(),
      xu_3.rA.id_continue(),
      xu_3.rn.id_continue(),
      xu_3.rC.id_continue(),
      xu_3.rl.id_continue(),
      xu_3.rH.id_continue(),
      xu_3.rp.id_continue()
   };
   public static final rDP id_byte = new rDP();

   @Override
   protected rDr_1<?> id_class() {
      return rDr_1.id_protected;
   }

   @Override
   public xc_3 id_class(Random var1, rfH_2 var2) {
      double var3 = rfU_2.id_class((1.0 + rYG.id_case.id_class((double)var2.b_() / 48.0, (double)var2.d_() / 48.0, false)) / 2.0, 0.0, 0.9999);
      return id_protected[(int)(var3 * (double)id_protected.length)];
   }
}
