package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPC extends rrPL {
   public static final Codec<rrPC> id_class = rlb_3.id_class(() -> rlZ_2.id_class().id_class()).fieldOf("tag").xmap(rrPC::new, var0 -> var0.id_break).codec();
   private final rlb_3<xd_3> id_break;

   public rrPC(rlb_3<xd_3> var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class(xc_3 var1, Random var2) {
      return var1.id_class(this.id_break);
   }

   @Override
   protected rrPJ<?> id_class() {
      return rrPJ.id_protected;
   }
}
