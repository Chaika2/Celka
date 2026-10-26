package celestial;

import com.mojang.serialization.Codec;

public class rKo_1<P extends rKY> {
   public static final rKo_1<rKU> id_class = id_class("simple_block_placer", rKU.id_break);
   public static final rKo_1<rKD> id_break = id_class("double_plant_placer", rKD.id_break);
   public static final rKo_1<rKK> id_byte = id_class("column_placer", rKK.id_break);
   private final Codec<P> id_protected;

   private rKo_1(Codec<P> var1) {
      this.id_protected = var1;
   }

   private static <P extends rKY> rKo_1<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rr, var0, new rKo_1<>(var1));
   }

   public Codec<P> id_class() {
      return this.id_protected;
   }
}
