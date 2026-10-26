package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class Rx_1 implements ArgumentType<Rd_1> {
   private static final Collection<String> id_class = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");

   public static Rx_1 id_class() {
      return new Rx_1();
   }

   public static Rd_1 id_class(CommandContext<gy_3> var0, String var1) {
      return (Rd_1)var0.getArgument(var1, Rd_1.class);
   }

   public Rd_1 id_class(StringReader var1) throws CommandSyntaxException {
      Rk_1 var2 = new Rk_1(var1, false).id_class(true);
      return new Rd_1(var2.id_break(), var2.id_class().keySet(), var2.id_byte());
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getInput());
      var3.setCursor(var2.getStart());
      Rk_1 var4 = new Rk_1(var3, false);

      try {
         var4.id_class(true);
      } catch (CommandSyntaxException var6) {
      }

      return var4.id_class(var2, rls_3.id_class());
   }
}
