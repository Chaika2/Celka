package celestial;

import com.mojang.serialization.Codec;

public class rio_3 implements rUv_1 {
   public static final Codec<rio_3> class_ = Codec.BOOL.fieldOf("is_beached").orElse(false).xmap(rio_3::new, var0 -> var0.break_).codec();
   public final boolean break_;

   public rio_3(boolean var1) {
      this.break_ = var1;
   }
}
