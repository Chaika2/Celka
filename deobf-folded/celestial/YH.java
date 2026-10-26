package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class YH implements SuggestionProvider<gR_2> {
   private final SuggestionProvider<gR_2> id_class;
   final rqO_2 id_break;

   public YH(rqO_2 var1, SuggestionProvider<gR_2> var2) {
      this.id_class = var2;
      this.id_break = var1;
   }

   public CompletableFuture<Suggestions> getSuggestions(CommandContext<gR_2> var1, SuggestionsBuilder var2) throws CommandSyntaxException {
      return this.id_class.getSuggestions(var1, var2);
   }
}
