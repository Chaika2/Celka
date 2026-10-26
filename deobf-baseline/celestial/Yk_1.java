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
   private static final Collection<String> id_break = Arrays.asList("foo", "*", "012");
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.objective.notFound", var0));
   private static final DynamicCommandExceptionType id_protected = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.objective.readonly", var0));
   public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(
      var0 -> new rgn_3("commands.scoreboard.objectives.add.longName", var0)
   );

   public static Yk_1 id_class() {
      return new Yk_1();
   }

   public String id_class(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      if (var2.length() > 16) {
         throw id_class.create(16);
      } else {
         return var2;
      }
   }

   public static rnP_2 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      String var2 = (String)var0.getArgument(var1, String.class);
      rnG_2 var3 = ((gy_3)var0.getSource()).id_super().R();
      rnP_2 var4 = var3.id_byte(var2);
      if (var4 == null) {
         throw id_byte.create(var2);
      } else {
         return var4;
      }
   }

   public static rnP_2 id_break(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rnP_2 var2 = id_class(var0, var1);
      if (var2.id_byte().id_break()) {
         throw id_protected.create(var2.id_break());
      } else {
         return var2;
      }
   }

   public Collection<String> getExamples() {
      return id_break;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof gy_3) {
         return gR_2.id_break(((gy_3)var1.getSource()).id_super().R().id_break(), var2);
      } else if (var1.getSource() instanceof gR_2) {
         gR_2 var3 = (gR_2)var1.getSource();
         return var3.id_class(var1, var2);
      } else {
         return Suggestions.empty();
      }
   }
}
