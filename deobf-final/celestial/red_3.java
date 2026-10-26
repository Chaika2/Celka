package celestial;

import com.mojang.serialization.Codec;

public interface red_3<P extends rev_3> {
   red_3<reA_2> class_ = class_("single_pool_element", reA_2.break_);
   red_3<reL_2> break_ = class_("list_pool_element", reL_2.class_);
   red_3<rex_3> byte_ = class_("feature_pool_element", rex_3.class_);
   red_3<reJ_2> protected_ = class_("empty_pool_element", reJ_2.class_);
   red_3<reF_2> throws_ = class_("legacy_single_pool_element", reF_2.class_);

   static <P extends rev_3> red_3<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rM, var0, () -> var1);
   }

   Codec<P> codec();
}
