package celestial;

import java.util.Optional;

public interface rkj_3<T extends rkw_3<?>> {
   rkj_3<rkt_3> class_ = class_("crafting");
   rkj_3<rkT_2> break_ = class_("smelting");
   rkj_3<rkA_2> byte_ = class_("blasting");
   rkj_3<rWQ> protected_ = class_("smoking");
   rkj_3<rkC_2> throws_ = class_("campfire_cooking");
   rkj_3<rWu_1> case_ = class_("stonecutting");
   rkj_3<rWW> catch_ = class_("smithing");

   default <C extends rXu_1> Optional<T> class_(rkw_3<C> var1, rYB var2, C var3) {
      return var1.class_(var3, var2) ? Optional.of((T)var1) : Optional.empty();
   }

   static <T extends rkw_3<?>> rkj_3<T> class_(String var0) {
      return rVL.class_(rVL.b, new rqO_2(var0), new rkV_2(var0));
   }
}
