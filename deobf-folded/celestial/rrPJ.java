package celestial;

import com.mojang.serialization.Codec;

public interface rrPJ<P extends rrPL> {
   rrPJ<rrPB> id_class = id_class("always_true", rrPB.id_class);
   rrPJ<rrPb_1> id_break = id_class("block_match", rrPb_1.id_class);
   rrPJ<rrPO> id_byte = id_class("blockstate_match", rrPO.id_class);
   rrPJ<rrPC> id_protected = id_class("tag_match", rrPC.id_class);
   rrPJ<rrPm_1> id_throws = id_class("random_block_match", rrPm_1.id_class);
   rrPJ<rrPZ> id_case = id_class("random_blockstate_match", rrPZ.id_class);

   static <P extends rrPL> rrPJ<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.s, var0, () -> var1);
   }

   Codec<P> codec();
}
