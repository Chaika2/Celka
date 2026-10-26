package celestial;

import com.mojang.serialization.Codec;

public class rDr_1<P extends rKi_1> {
   public static final rDr_1<rDS> id_class = id_class("simple_state_provider", rDS.id_class);
   public static final rDr_1<rDs_1> id_break = id_class("weighted_state_provider", rDs_1.id_class);
   public static final rDr_1<rDB> id_byte = id_class("plain_flower_provider", rDB.id_class);
   public static final rDr_1<rDP> id_protected = id_class("forest_flower_provider", rDP.id_class);
   public static final rDr_1<rKa_1> id_throws = id_class("rotated_block_provider", rKa_1.id_class);
   private final Codec<P> id_case;

   private rDr_1(Codec<P> var1) {
      this.id_case = var1;
   }

   private static <P extends rKi_1> rDr_1<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.i, var0, new rDr_1<>(var1));
   }

   public Codec<P> id_class() {
      return this.id_case;
   }
}
