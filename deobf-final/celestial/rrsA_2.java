package celestial;

import com.mojang.serialization.Codec;

public class rrsA_2<P extends rrsN_2> {
   public static final rrsA_2<rrsL_2> class_ = class_("straight_trunk_placer", rrsL_2.throws_);
   public static final rrsA_2<rrsZ_2> break_ = class_("forking_trunk_placer", rrsZ_2.throws_);
   public static final rrsA_2<rrsv_3> byte_ = class_("giant_trunk_placer", rrsv_3.throws_);
   public static final rrsA_2<rrsF_2> protected_ = class_("mega_jungle_trunk_placer", rrsF_2.case_);
   public static final rrsA_2<rrsc_3> throws_ = class_("dark_oak_trunk_placer", rrsc_3.throws_);
   public static final rrsA_2<rrsu_3> case_ = class_("fancy_trunk_placer", rrsu_3.throws_);
   private final Codec<P> catch_;

   private rrsA_2(Codec<P> var1) {
      this.catch_ = var1;
   }

   private static <P extends rrsN_2> rrsA_2<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rB, var0, new rrsA_2<>(var1));
   }

   public Codec<P> class_() {
      return this.catch_;
   }
}
