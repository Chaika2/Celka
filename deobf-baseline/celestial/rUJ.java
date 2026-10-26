package celestial;

import com.mojang.serialization.Codec;

public class rUJ implements rUv_1, rrSx_1 {
   public static final Codec<rUJ> id_class = rUX.id_class(-10, 128, 128).fieldOf("count").xmap(rUJ::new, rUJ::id_break).codec();
   private final rUX id_break;

   public rUJ(int var1) {
      this.id_break = rUX.id_class(var1);
   }

   public rUJ(rUX var1) {
      this.id_break = var1;
   }

   public rUX id_break() {
      return this.id_break;
   }
}
