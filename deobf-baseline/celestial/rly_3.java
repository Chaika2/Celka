package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class rly_3 implements ArgumentType<rlj_3> {
   private static final Collection<String> id_class = Arrays.asList("techtests.piston", "techtests");

   public rlj_3 id_class(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      Optional var3 = rlR_2.id_protected(var2);
      if (var3.isPresent()) {
         return (rlj_3)var3.get();
      } else {
         rgN_2 var4 = new rgN_2("No such test: " + var2);
         throw new CommandSyntaxException(new SimpleCommandExceptionType(var4), var4);
      }
   }

   public static rlj_3 id_class(CommandContext<gy_3> var0, String var1) {
      return (rlj_3)var0.getArgument(var1, rlj_3.class);
   }

   public static rly_3 id_class() {
      return new rly_3();
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      Stream var3 = rlR_2.id_class().stream().map(rlj_3::id_class);
      return gR_2.id_break(var3, var2);
   }
}
