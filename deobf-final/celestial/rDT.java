package celestial;

import com.mojang.serialization.Codec;

public class rDT implements rUv_1 {
   public static final Codec<rDT> class_ = rKi_1.break_.fieldOf("state_provider").xmap(rDT::new, var0 -> var0.break_).codec();
   public final rKi_1 break_;

   public rDT(rKi_1 var1) {
      this.break_ = var1;
   }
}
