package celestial;

import com.mojang.serialization.Codec;

public interface red_3<P extends rev_3> {
   red_3<reA_2> id_class = id_class("single_pool_element", reA_2.id_break);
   red_3<reL_2> id_break = id_class("list_pool_element", reL_2.id_class);
   red_3<rex_3> id_byte = id_class("feature_pool_element", rex_3.id_class);
   red_3<reJ_2> id_protected = id_class("empty_pool_element", reJ_2.id_class);
   red_3<reF_2> id_throws = id_class("legacy_single_pool_element", reF_2.id_class);

   static <P extends rev_3> red_3<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rM, var0, () -> var1);
   }

   Codec<P> codec();
}
