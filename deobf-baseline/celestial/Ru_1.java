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

public class Ru_1 implements ArgumentType<Rm_1> {
   private static final Collection<String> id_class = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.anchor.invalid", var0));

   public static Rm_1 id_class(CommandContext<gy_3> var0, String var1) {
      return (Rm_1)var0.getArgument(var1, Rm_1.class);
   }

   public Rm_1 id_class(StringReader var1) throws CommandSyntaxException {
      int var2 = var1.getCursor();
      String var3 = var1.readUnquotedString();
      Rm_1 var4 = Rm_1.id_class(var3);
      if (var4 == null) {
         var1.setCursor(var2);
         throw id_break.createWithContext(var1, var3);
      } else {
         return var4;
      }
   }

   public static Ru_1 id_class() {
      return new Ru_1();
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.id_break(Rm_1.BY_NAME.keySet(), var2);
   }
}
