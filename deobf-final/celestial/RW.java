package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class RW implements ArgumentType<rgF_2> {
   private static final Collection<String> break_ = Arrays.asList("red", "green");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.color.invalid", var0));

   private RW() {
   }

   public static RW class_() {
      return new RW();
   }

   public rgF_2 class_(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      rgF_2 var3 = rgF_2.break_(var2);
      if (var3 != null && !var3.break_()) {
         return var3;
      } else {
         throw class_.create(var2);
      }
   }

   public static rgF_2 class_(CommandContext<gy_3> var0, String var1) {
      return (rgF_2)var0.getArgument(var1, rgF_2.class);
   }

   public Collection<String> getExamples() {
      return break_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.break_(rgF_2.class_(true, false), var2);
   }
}
