package celestial;

import com.mojang.serialization.Codec;

public class rrsA_2<P extends rrsN_2> {
   public static final rrsA_2<rrsL_2> id_class = id_class("straight_trunk_placer", rrsL_2.id_throws);
   public static final rrsA_2<rrsZ_2> id_break = id_class("forking_trunk_placer", rrsZ_2.id_throws);
   public static final rrsA_2<rrsv_3> id_byte = id_class("giant_trunk_placer", rrsv_3.id_throws);
   public static final rrsA_2<rrsF_2> id_protected = id_class("mega_jungle_trunk_placer", rrsF_2.id_case);
   public static final rrsA_2<rrsc_3> id_throws = id_class("dark_oak_trunk_placer", rrsc_3.id_throws);
   public static final rrsA_2<rrsu_3> id_case = id_class("fancy_trunk_placer", rrsu_3.id_throws);
   private final Codec<P> id_catch;

   private rrsA_2(Codec<P> var1) {
      this.id_catch = var1;
   }

   private static <P extends rrsN_2> rrsA_2<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rB, var0, new rrsA_2<>(var1));
   }

   public Codec<P> id_class() {
      return this.id_catch;
   }
}
