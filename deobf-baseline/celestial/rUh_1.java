package celestial;

import com.mojang.serialization.Codec;

public class rUh_1<P extends rDQ> {
   public static final rUh_1<reb_3> id_class = id_class("two_layers_feature_size", reb_3.id_byte);
   public static final rUh_1<reB_2> id_break = id_class("three_layers_feature_size", reB_2.id_byte);
   private final Codec<P> id_byte;

   private rUh_1(Codec<P> var1) {
      this.id_byte = var1;
   }

   private static <P extends rDQ> rUh_1<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rs, var0, new rUh_1<>(var1));
   }

   public Codec<P> id_class() {
      return this.id_byte;
   }
}
