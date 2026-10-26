package celestial;

import com.mojang.serialization.Codec;

public class rDq_1 implements rUv_1 {
   public static final Codec<rDq_1> id_class = xc_3.id_break.fieldOf("state").xmap(rDq_1::new, var0 -> var0.id_break).codec();
   public final xc_3 id_break;

   public rDq_1(xc_3 var1) {
      this.id_break = var1;
   }
}
