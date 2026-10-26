package celestial;

import com.mojang.serialization.Codec;

public class rUo_1 implements rUv_1 {
   public static final Codec<rUo_1> class_ = riV_2.field_236342_h_.fieldOf("portal_type").xmap(rUo_1::new, var0 -> var0.break_).codec();
   public final riV_2 break_;

   public rUo_1(riV_2 var1) {
      this.break_ = var1;
   }
}
