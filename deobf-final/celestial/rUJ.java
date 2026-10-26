package celestial;

import com.mojang.serialization.Codec;

public class rUJ implements rUv_1, rrSx_1 {
   public static final Codec<rUJ> class_ = rUX.class_(-10, 128, 128).fieldOf("count").xmap(rUJ::new, rUJ::break_).codec();
   private final rUX break_;

   public rUJ(int var1) {
      this.break_ = rUX.class_(var1);
   }

   public rUJ(rUX var1) {
      this.break_ = var1;
   }

   public rUX break_() {
      return this.break_;
   }
}
