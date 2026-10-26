package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rKa_1 extends rKi_1 {
   public static final Codec<rKa_1> id_class = xc_3.id_break
      .fieldOf("state")
      .xmap(JC::id_break, xd_3::id_continue)
      .xmap(rKa_1::new, var0 -> var0.id_byte)
      .codec();
   private final xd_3 id_byte;

   public rKa_1(xd_3 var1) {
      this.id_byte = var1;
   }

   @Override
   protected rDr_1<?> id_class() {
      return rDr_1.id_throws;
   }

   @Override
   public xc_3 id_class(Random var1, rfH_2 var2) {
      rpB_2 var3 = rpB_2.id_class(var1);
      return this.id_byte.id_continue().id_class(WL.id_new, var3);
   }
}
