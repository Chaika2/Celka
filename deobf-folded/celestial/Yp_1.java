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

public class Yp_1 implements ArgumentType<String> {
   private static final Collection<String> id_class = Arrays.asList("foo", "123");
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("team.notFound", var0));

   public static Yp_1 id_class() {
      return new Yp_1();
   }

   public String id_class(StringReader var1) throws CommandSyntaxException {
      return var1.readUnquotedString();
   }

   public static rnB_2 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      String var2 = (String)var0.getArgument(var1, String.class);
      rnG_2 var3 = ((gy_3)var0.getSource()).id_super().R();
      rnB_2 var4 = var3.id_throws(var2);
      if (var4 == null) {
         throw id_break.create(var2);
      } else {
         return var4;
      }
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return var1.getSource() instanceof gR_2 ? gR_2.id_break(((gR_2)var1.getSource()).id_byte(), var2) : Suggestions.empty();
   }
}
