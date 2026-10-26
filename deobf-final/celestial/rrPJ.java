package celestial;

import com.mojang.serialization.Codec;

public interface rrPJ<P extends rrPL> {
   rrPJ<rrPB> class_ = class_("always_true", rrPB.class_);
   rrPJ<rrPb_1> break_ = class_("block_match", rrPb_1.class_);
   rrPJ<rrPO> byte_ = class_("blockstate_match", rrPO.class_);
   rrPJ<rrPC> protected_ = class_("tag_match", rrPC.class_);
   rrPJ<rrPm_1> throws_ = class_("random_block_match", rrPm_1.class_);
   rrPJ<rrPZ> case_ = class_("random_blockstate_match", rrPZ.class_);

   static <P extends rrPL> rrPJ<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.s, var0, () -> var1);
   }

   Codec<P> codec();
}
