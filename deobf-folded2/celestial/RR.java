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

public class RR implements ArgumentType<RY> {
   private static final Collection<String> id_class = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");

   public static RR id_class() {
      return new RR();
   }

   public static <S> RY id_class(CommandContext<S> var0, String var1) {
      return (RY)var0.getArgument(var1, RY.class);
   }

   public RY id_class(StringReader var1) throws CommandSyntaxException {
      Ro_1 var2 = new Ro_1(var1, false).id_catch();
      return new RY(var2.id_class(), var2.id_break());
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getInput());
      var3.setCursor(var2.getStart());
      Ro_1 var4 = new Ro_1(var3, false);

      try {
         var4.id_catch();
      } catch (CommandSyntaxException var6) {
      }

      return var4.id_class(var2, rlc_3.id_class());
   }
}
