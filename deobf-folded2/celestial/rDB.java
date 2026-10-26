package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDB extends rKi_1 {
   public static final Codec<rDB> id_class = Codec.unit(() -> rDB.id_byte);
   public static final rDB id_byte = new rDB();
   private static final xc_3[] id_protected = new xc_3[]{xu_3.rA.id_continue(), xu_3.rL.id_continue(), xu_3.rC.id_continue(), xu_3.rn.id_continue()};
   private static final xc_3[] id_throws = new xc_3[]{xu_3.rm.id_continue(), xu_3.rF.id_continue(), xu_3.rl.id_continue(), xu_3.rH.id_continue()};

   @Override
   protected rDr_1<?> id_class() {
      return rDr_1.id_byte;
   }

   @Override
   public xc_3 id_class(Random var1, rfH_2 var2) {
      double var3 = rYG.id_case.id_class((double)var2.b_() / 200.0, (double)var2.d_() / 200.0, false);
      if (var3 < -0.8) {
         return rqR_2.id_class(id_protected, var1);
      } else {
         return var1.nextInt(3) > 0 ? rqR_2.id_class(id_throws, var1) : xu_3.ru.id_continue();
      }
   }
}
