package celestial;

import com.mojang.serialization.Codec;

public class rUh_1<P extends rDQ> {
   public static final rUh_1<reb_3> class_ = class_("two_layers_feature_size", reb_3.byte_);
   public static final rUh_1<reB_2> break_ = class_("three_layers_feature_size", reB_2.byte_);
   private final Codec<P> byte_;

   private rUh_1(Codec<P> var1) {
      this.byte_ = var1;
   }

   private static <P extends rDQ> rUh_1<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rs, var0, new rUh_1<>(var1));
   }

   public Codec<P> class_() {
      return this.byte_;
   }
}
