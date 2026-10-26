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
import java.util.concurrent.CompletableFuture;

public class rli_3 implements ArgumentType<String> {
   private static final Collection<String> class_ = Arrays.asList("techtests", "mobtests");

   public String class_(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      if (rlR_2.break_(var2)) {
         return var2;
      } else {
         rgN_2 var3 = new rgN_2("No such test class: " + var2);
         throw new CommandSyntaxException(new SimpleCommandExceptionType(var3), var3);
      }
   }

   public static String class_(CommandContext<gy_3> var0, String var1) {
      return (String)var0.getArgument(var1, String.class);
   }

   public static rli_3 class_() {
      return new rli_3();
   }

   public Collection<String> getExamples() {
      return class_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.break_(rlR_2.break_().stream(), var2);
   }
}
