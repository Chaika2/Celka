package celestial;

import com.mojang.serialization.Codec;

public class rKo_1<P extends rKY> {
   public static final rKo_1<rKU> class_ = class_("simple_block_placer", rKU.break_);
   public static final rKo_1<rKD> break_ = class_("double_plant_placer", rKD.break_);
   public static final rKo_1<rKK> byte_ = class_("column_placer", rKK.break_);
   private final Codec<P> protected_;

   private rKo_1(Codec<P> var1) {
      this.protected_ = var1;
   }

   private static <P extends rKY> rKo_1<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rr, var0, new rKo_1<>(var1));
   }

   public Codec<P> class_() {
      return this.protected_;
   }
}
