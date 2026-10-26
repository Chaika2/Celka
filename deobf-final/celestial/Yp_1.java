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
   private static final Collection<String> class_ = Arrays.asList("foo", "123");
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("team.notFound", var0));

   public static Yp_1 class_() {
      return new Yp_1();
   }

   public String class_(StringReader var1) throws CommandSyntaxException {
      return var1.readUnquotedString();
   }

   public static rnB_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      String var2 = (String)var0.getArgument(var1, String.class);
      rnG_2 var3 = ((gy_3)var0.getSource()).super_().R();
      rnB_2 var4 = var3.throws_(var2);
      if (var4 == null) {
         throw break_.create(var2);
      } else {
         return var4;
      }
   }

   public Collection<String> getExamples() {
      return class_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return var1.getSource() instanceof gR_2 ? gR_2.break_(((gR_2)var1.getSource()).byte_(), var2) : Suggestions.empty();
   }
}
