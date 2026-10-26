package celestial;

import com.mojang.serialization.Codec;

public class rUo_1 implements rUv_1 {
   public static final Codec<rUo_1> id_class = riV_2.field_236342_h_.fieldOf("portal_type").xmap(rUo_1::new, var0 -> var0.id_break).codec();
   public final riV_2 id_break;

   public rUo_1(riV_2 var1) {
      this.id_break = var1;
   }
}
