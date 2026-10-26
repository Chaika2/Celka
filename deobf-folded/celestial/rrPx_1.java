package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface rrPx_1<P extends rrPA> {
   rrPx_1<rrPG> id_class = id_class("block_ignore", rrPG.id_class);
   rrPx_1<rrPd_1> id_break = id_class("block_rot", rrPd_1.id_class);
   rrPx_1<rrPh_1> id_byte = id_class("gravity", rrPh_1.id_class);
   rrPx_1<rrPk_1> id_protected = id_class("jigsaw_replacement", rrPk_1.id_class);
   rrPx_1<rrPF> id_throws = id_class("rule", rrPF.id_class);
   rrPx_1<rrPQ> id_case = id_class("nop", rrPQ.id_class);
   rrPx_1<rrPM> id_catch = id_class("block_age", rrPM.id_class);
   rrPx_1<rrPE> id_private = id_class("blackstone_replace", rrPE.id_class);
   rrPx_1<rrPW> id_implements = id_class("lava_submerged_block", rrPW.id_class);
   Codec<rrPA> id_finally = rVL.rb.dispatch("processor_type", rrPA::id_class, rrPx_1::codec);
   Codec<rrPn_1> id_extends = id_finally.listOf().xmap(rrPn_1::new, rrPn_1::id_class);
   Codec<rrPn_1> id_native = Codec.either(id_extends.fieldOf("processors").codec(), id_extends)
      .xmap(var0 -> (rrPn_1)var0.map(var0x -> var0x, var0x -> var0x), Either::left);
   Codec<Supplier<rrPn_1>> id_volatile = rVA.id_class(rVL.L, id_native);

   static <P extends rrPA> rrPx_1<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rb, var0, () -> var1);
   }

   Codec<P> codec();
}
