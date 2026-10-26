package celestial;

import com.mojang.serialization.Codec;

public class rDr_1<P extends rKi_1> {
   public static final rDr_1<rDS> class_ = class_("simple_state_provider", rDS.class_);
   public static final rDr_1<rDs_1> break_ = class_("weighted_state_provider", rDs_1.class_);
   public static final rDr_1<rDB> byte_ = class_("plain_flower_provider", rDB.class_);
   public static final rDr_1<rDP> protected_ = class_("forest_flower_provider", rDP.class_);
   public static final rDr_1<rKa_1> throws_ = class_("rotated_block_provider", rKa_1.class_);
   private final Codec<P> case_;

   private rDr_1(Codec<P> var1) {
      this.case_ = var1;
   }

   private static <P extends rKi_1> rDr_1<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.i, var0, new rDr_1<>(var1));
   }

   public Codec<P> class_() {
      return this.case_;
   }
}
