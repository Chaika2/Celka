package celestial;

import com.mojang.serialization.Codec;

public class rDT implements rUv_1 {
   public static final Codec<rDT> id_class = rKi_1.id_break.fieldOf("state_provider").xmap(rDT::new, var0 -> var0.id_break).codec();
   public final rKi_1 id_break;

   public rDT(rKi_1 var1) {
      this.id_break = var1;
   }
}
