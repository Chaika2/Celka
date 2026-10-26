/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.gR_2;
import celestial.rqO_2;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class YH
implements SuggestionProvider<gR_2> {
    private final SuggestionProvider<gR_2> id_class;
    public final rqO_2 id_break;

    public YH(rqO_2 rqO_22, SuggestionProvider<gR_2> suggestionProvider) {
        this.id_class = suggestionProvider;
        this.id_break = rqO_22;
    }

    public CompletableFuture<Suggestions> getSuggestions(CommandContext<gR_2> commandContext, SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
        return this.id_class.getSuggestions(commandContext, suggestionsBuilder);
    }
}

