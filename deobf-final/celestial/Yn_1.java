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

public class Yn_1 implements ArgumentType<Integer> {
   private static final Collection<String> break_ = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.scoreboardDisplaySlot.invalid", var0));

   private Yn_1() {
   }

   public static Yn_1 class_() {
      return new Yn_1();
   }

   public Integer class_(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      int var3 = rns_3.finally_(var2);
      if (var3 == -1) {
         throw class_.create(var2);
      } else {
         return var3;
      }
   }

   public static int class_(CommandContext<gy_3> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Collection<String> getExamples() {
      return break_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.class_(rns_3.catch_(), var2);
   }
}
