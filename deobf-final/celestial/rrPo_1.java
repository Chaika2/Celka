package celestial;

import com.mojang.serialization.Codec;

public class rrPo_1<P extends rrPR> {
   public static final rrPo_1<rrPf_1> class_ = class_("blob_foliage_placer", rrPf_1.class_);
   public static final rrPo_1<rrPe_1> break_ = class_("spruce_foliage_placer", rrPe_1.class_);
   public static final rrPo_1<rrPU> byte_ = class_("pine_foliage_placer", rrPU.class_);
   public static final rrPo_1<rrPI> protected_ = class_("acacia_foliage_placer", rrPI.class_);
   public static final rrPo_1<rrPj_1> throws_ = class_("bush_foliage_placer", rrPj_1.byte_);
   public static final rrPo_1<rrPg_1> case_ = class_("fancy_foliage_placer", rrPg_1.byte_);
   public static final rrPo_1<rrPK> catch_ = class_("jungle_foliage_placer", rrPK.class_);
   public static final rrPo_1<rrPD> private_ = class_("mega_pine_foliage_placer", rrPD.class_);
   public static final rrPo_1<rrPV> implements_ = class_("dark_oak_foliage_placer", rrPV.class_);
   private final Codec<P> finally_;

   private rrPo_1(Codec<P> var1) {
      this.finally_ = var1;
   }

   private static <P extends rrPR> rrPo_1<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rP, var0, new rrPo_1<>(var1));
   }

   public Codec<P> class_() {
      return this.finally_;
   }
}
