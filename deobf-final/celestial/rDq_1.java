package celestial;

import com.mojang.serialization.Codec;

public class rDq_1 implements rUv_1 {
   public static final Codec<rDq_1> class_ = xc_3.break_.fieldOf("state").xmap(rDq_1::new, var0 -> var0.break_).codec();
   public final xc_3 break_;

   public rDq_1(xc_3 var1) {
      this.break_ = var1;
   }
}
