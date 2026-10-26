/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.YH;
import celestial.aI_2;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rVL;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;

public class Yl_1 {
    private static final Map<rqO_2, SuggestionProvider<gR_2>> id_case = Maps.newHashMap();
    private static final rqO_2 id_catch = new rqO_2("ask_server");
    public static final SuggestionProvider<gR_2> id_class = Yl_1.id_class(id_catch, (SuggestionProvider<gR_2>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> ((gR_2)commandContext.getSource()).id_class((CommandContext<gR_2>)commandContext, suggestionsBuilder)));
    public static final SuggestionProvider<gy_3> id_break = Yl_1.id_class(new rqO_2("all_recipes"), (SuggestionProvider<gR_2>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> gR_2.id_class(((gR_2)commandContext.getSource()).id_throws(), suggestionsBuilder)));
    public static final SuggestionProvider<gy_3> id_byte = Yl_1.id_class(new rqO_2("available_sounds"), (SuggestionProvider<gR_2>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> gR_2.id_class(((gR_2)commandContext.getSource()).id_protected(), suggestionsBuilder)));
    public static final SuggestionProvider<gy_3> id_protected = Yl_1.id_class(new rqO_2("available_biomes"), (SuggestionProvider<gR_2>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> gR_2.id_class(((gR_2)commandContext.getSource()).id_implements().id_break(rVL.n).id_protected(), suggestionsBuilder)));
    public static final SuggestionProvider<gy_3> id_throws = Yl_1.id_class(new rqO_2("summonable_entities"), (SuggestionProvider<gR_2>)((SuggestionProvider)(commandContext, suggestionsBuilder) -> gR_2.id_class(rVL.id_transient.id_case().filter(aI_2::id_break), suggestionsBuilder, aI_2::id_class, aI_22 -> new rgn_3(rqR_2.id_class("entity", aI_2.id_class(aI_22))))));

    public static <S extends gR_2> SuggestionProvider<S> id_class(rqO_2 rqO_22, SuggestionProvider<gR_2> suggestionProvider) {
        if (id_case.containsKey(rqO_22)) {
            throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + rqO_22);
        }
        id_case.put(rqO_22, suggestionProvider);
        return new YH(rqO_22, suggestionProvider);
    }

    public static SuggestionProvider<gR_2> id_class(rqO_2 rqO_22) {
        return id_case.getOrDefault(rqO_22, id_class);
    }

    public static rqO_2 id_class(SuggestionProvider<gR_2> suggestionProvider) {
        return suggestionProvider instanceof YH ? ((YH)suggestionProvider).id_break : id_catch;
    }

    public static SuggestionProvider<gR_2> id_break(SuggestionProvider<gR_2> suggestionProvider) {
        return suggestionProvider instanceof YH ? suggestionProvider : id_class;
    }
}

