package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface rrPx_1<P extends rrPA> {
   rrPx_1<rrPG> class_ = class_("block_ignore", rrPG.class_);
   rrPx_1<rrPd_1> break_ = class_("block_rot", rrPd_1.class_);
   rrPx_1<rrPh_1> byte_ = class_("gravity", rrPh_1.class_);
   rrPx_1<rrPk_1> protected_ = class_("jigsaw_replacement", rrPk_1.class_);
   rrPx_1<rrPF> throws_ = class_("rule", rrPF.class_);
   rrPx_1<rrPQ> case_ = class_("nop", rrPQ.class_);
   rrPx_1<rrPM> catch_ = class_("block_age", rrPM.class_);
   rrPx_1<rrPE> private_ = class_("blackstone_replace", rrPE.class_);
   rrPx_1<rrPW> implements_ = class_("lava_submerged_block", rrPW.class_);
   Codec<rrPA> finally_ = rVL.rb.dispatch("processor_type", rrPA::class_, rrPx_1::codec);
   Codec<rrPn_1> extends_ = finally_.listOf().xmap(rrPn_1::new, rrPn_1::class_);
   Codec<rrPn_1> native_ = Codec.either(extends_.fieldOf("processors").codec(), extends_)
      .xmap(var0 -> (rrPn_1)var0.map(var0x -> var0x, var0x -> var0x), Either::left);
   Codec<Supplier<rrPn_1>> volatile_ = rVA.class_(rVL.L, native_);

   static <P extends rrPA> rrPx_1<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rb, var0, () -> var1);
   }

   Codec<P> codec();
}
