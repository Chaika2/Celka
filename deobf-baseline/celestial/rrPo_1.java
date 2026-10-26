package celestial;

import com.mojang.serialization.Codec;

public class rrPo_1<P extends rrPR> {
   public static final rrPo_1<rrPf_1> id_class = id_class("blob_foliage_placer", rrPf_1.id_class);
   public static final rrPo_1<rrPe_1> id_break = id_class("spruce_foliage_placer", rrPe_1.id_class);
   public static final rrPo_1<rrPU> id_byte = id_class("pine_foliage_placer", rrPU.id_class);
   public static final rrPo_1<rrPI> id_protected = id_class("acacia_foliage_placer", rrPI.id_class);
   public static final rrPo_1<rrPj_1> id_throws = id_class("bush_foliage_placer", rrPj_1.id_byte);
   public static final rrPo_1<rrPg_1> id_case = id_class("fancy_foliage_placer", rrPg_1.id_byte);
   public static final rrPo_1<rrPK> id_catch = id_class("jungle_foliage_placer", rrPK.id_class);
   public static final rrPo_1<rrPD> id_private = id_class("mega_pine_foliage_placer", rrPD.id_class);
   public static final rrPo_1<rrPV> id_implements = id_class("dark_oak_foliage_placer", rrPV.id_class);
   private final Codec<P> id_finally;

   private rrPo_1(Codec<P> var1) {
      this.id_finally = var1;
   }

   private static <P extends rrPR> rrPo_1<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rP, var0, new rrPo_1<>(var1));
   }

   public Codec<P> id_class() {
      return this.id_finally;
   }
}
