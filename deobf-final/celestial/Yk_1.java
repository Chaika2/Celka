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

public class Yk_1 implements ArgumentType<String> {
   private static final Collection<String> break_ = Arrays.asList("foo", "*", "012");
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.objective.notFound", var0));
   private static final DynamicCommandExceptionType protected_ = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.objective.readonly", var0));
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(
      var0 -> new rgn_3("commands.scoreboard.objectives.add.longName", var0)
   );

   public static Yk_1 class_() {
      return new Yk_1();
   }

   public String class_(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      if (var2.length() > 16) {
         throw class_.create(16);
      } else {
         return var2;
      }
   }

   public static rnP_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      String var2 = (String)var0.getArgument(var1, String.class);
      rnG_2 var3 = ((gy_3)var0.getSource()).super_().R();
      rnP_2 var4 = var3.byte_(var2);
      if (var4 == null) {
         throw byte_.create(var2);
      } else {
         return var4;
      }
   }

   public static rnP_2 break_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rnP_2 var2 = class_(var0, var1);
      if (var2.byte_().break_()) {
         throw protected_.create(var2.break_());
      } else {
         return var2;
      }
   }

   public Collection<String> getExamples() {
      return break_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof gy_3) {
         return gR_2.break_(((gy_3)var1.getSource()).super_().R().break_(), var2);
      } else if (var1.getSource() instanceof gR_2) {
         gR_2 var3 = (gR_2)var1.getSource();
         return var3.class_(var1, var2);
      } else {
         return Suggestions.empty();
      }
   }
}
