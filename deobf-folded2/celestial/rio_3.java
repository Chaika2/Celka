package celestial;

import com.mojang.serialization.Codec;

public class rio_3 implements rUv_1 {
   public static final Codec<rio_3> id_class = Codec.BOOL.fieldOf("is_beached").orElse(false).xmap(rio_3::new, var0 -> var0.id_break).codec();
   public final boolean id_break;

   public rio_3(boolean var1) {
      this.id_break = var1;
   }
}
