package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;

public class Yl_1 {
   private static final Map<rqO_2, SuggestionProvider<gR_2>> id_case = Maps.newHashMap();
   private static final rqO_2 id_catch = new rqO_2("ask_server");
   public static final SuggestionProvider<gR_2> id_class = id_class(id_catch, (var0, var1) -> ((gR_2)var0.getSource()).id_class(var0, var1));
   public static final SuggestionProvider<gy_3> id_break = id_class(
      new rqO_2("all_recipes"), (var0, var1) -> gR_2.id_class(((gR_2)var0.getSource()).id_throws(), var1)
   );
   public static final SuggestionProvider<gy_3> id_byte = id_class(
      new rqO_2("available_sounds"), (var0, var1) -> gR_2.id_class(((gR_2)var0.getSource()).id_protected(), var1)
   );
   public static final SuggestionProvider<gy_3> id_protected = id_class(
      new rqO_2("available_biomes"), (var0, var1) -> gR_2.id_class(((gR_2)var0.getSource()).id_implements().id_break(rVL.n).id_protected(), var1)
   );
   public static final SuggestionProvider<gy_3> id_throws = id_class(
      new rqO_2("summonable_entities"),
      (var0, var1) -> gR_2.id_class(
            rVL.id_transient.id_case().filter(aI_2::id_break), var1, aI_2::id_class, var0x -> new rgn_3(rqR_2.id_class("entity", aI_2.id_class(var0x)))
         )
   );

   public static <S extends gR_2> SuggestionProvider<S> id_class(rqO_2 var0, SuggestionProvider<gR_2> var1) {
      if (id_case.containsKey(var0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + var0);
      } else {
         id_case.put(var0, var1);
         return new YH(var0, var1);
      }
   }

   public static SuggestionProvider<gR_2> id_class(rqO_2 var0) {
      return id_case.getOrDefault(var0, id_class);
   }

   public static rqO_2 id_class(SuggestionProvider<gR_2> var0) {
      return var0 instanceof YH ? ((YH)var0).id_break : id_catch;
   }

   public static SuggestionProvider<gR_2> id_break(SuggestionProvider<gR_2> var0) {
      return var0 instanceof YH ? var0 : id_class;
   }
}
