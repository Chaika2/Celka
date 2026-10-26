package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;

public class Yl_1 {
   private static final Map<rqO_2, SuggestionProvider<gR_2>> case_ = Maps.newHashMap();
   private static final rqO_2 catch_ = new rqO_2("ask_server");
   public static final SuggestionProvider<gR_2> class_ = class_(catch_, (var0, var1) -> ((gR_2)var0.getSource()).class_(var0, var1));
   public static final SuggestionProvider<gy_3> break_ = class_(new rqO_2("all_recipes"), (var0, var1) -> gR_2.class_(((gR_2)var0.getSource()).throws_(), var1));
   public static final SuggestionProvider<gy_3> byte_ = class_(
      new rqO_2("available_sounds"), (var0, var1) -> gR_2.class_(((gR_2)var0.getSource()).protected_(), var1)
   );
   public static final SuggestionProvider<gy_3> protected_ = class_(
      new rqO_2("available_biomes"), (var0, var1) -> gR_2.class_(((gR_2)var0.getSource()).implements_().break_(rVL.n).protected_(), var1)
   );
   public static final SuggestionProvider<gy_3> throws_ = class_(
      new rqO_2("summonable_entities"),
      (var0, var1) -> gR_2.class_(
            rVL.transient_.case_().filter(aI_2::break_), var1, aI_2::class_, var0x -> new rgn_3(rqR_2.class_("entity", aI_2.class_(var0x)))
         )
   );

   public static <S extends gR_2> SuggestionProvider<S> class_(rqO_2 var0, SuggestionProvider<gR_2> var1) {
      if (case_.containsKey(var0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + var0);
      } else {
         case_.put(var0, var1);
         return new YH(var0, var1);
      }
   }

   public static SuggestionProvider<gR_2> class_(rqO_2 var0) {
      return case_.getOrDefault(var0, class_);
   }

   public static rqO_2 class_(SuggestionProvider<gR_2> var0) {
      return var0 instanceof YH ? ((YH)var0).break_ : catch_;
   }

   public static SuggestionProvider<gR_2> break_(SuggestionProvider<gR_2> var0) {
      return var0 instanceof YH ? var0 : class_;
   }
}
