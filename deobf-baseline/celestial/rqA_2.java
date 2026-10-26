package celestial;

import com.mojang.serialization.Codec;

public class rqA_2 {
   public static final Codec<rqA_2> id_class = rqO_2.id_class.xmap(rqA_2::new, var0 -> var0.id_break);
   private final rqO_2 id_break;

   public rqA_2(rqO_2 var1) {
      this.id_break = var1;
   }

   public rqO_2 id_class() {
      return this.id_break;
   }
}
