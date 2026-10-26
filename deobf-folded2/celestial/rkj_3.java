package celestial;

import java.util.Optional;

public interface rkj_3<T extends rkw_3<?>> {
   rkj_3<rkt_3> id_class = id_class("crafting");
   rkj_3<rkT_2> id_break = id_class("smelting");
   rkj_3<rkA_2> id_byte = id_class("blasting");
   rkj_3<rWQ> id_protected = id_class("smoking");
   rkj_3<rkC_2> id_throws = id_class("campfire_cooking");
   rkj_3<rWu_1> id_case = id_class("stonecutting");
   rkj_3<rWW> id_catch = id_class("smithing");

   default <C extends rXu_1> Optional<T> id_class(rkw_3<C> var1, rYB var2, C var3) {
      return var1.id_class(var3, var2) ? Optional.of((T)var1) : Optional.empty();
   }

   static <T extends rkw_3<?>> rkj_3<T> id_class(String var0) {
      return rVL.id_class(rVL.b, new rqO_2(var0), new rkV_2(var0));
   }
}
