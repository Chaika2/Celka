package celestial;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class YH implements SuggestionProvider<gR_2> {
   private final SuggestionProvider<gR_2> class_;
   final rqO_2 break_;

   public YH(rqO_2 var1, SuggestionProvider<gR_2> var2) {
      this.class_ = var2;
      this.break_ = var1;
   }

   public CompletableFuture<Suggestions> getSuggestions(CommandContext<gR_2> var1, SuggestionsBuilder var2) throws CommandSyntaxException {
      return this.class_.getSuggestions(var1, var2);
   }
}
