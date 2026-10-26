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

public class Yu_1 implements ArgumentType<rLR> {
   private static final Collection<String> id_break = Arrays.asList("spooky", "effect");
   public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("effect.effectNotFound", var0));

   public static Yu_1 id_class() {
      return new Yu_1();
   }

   public rLR id_class(StringReader var1) throws CommandSyntaxException {
      rqO_2 var2 = rqO_2.id_class(var1);
      return rVL.id_const.id_break(var2).orElseThrow(() -> id_class.create(var2));
   }

   public static rLR id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return (rLR)var0.getArgument(var1, rLR.class);
   }

   public Collection<String> getExamples() {
      return id_break;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.id_class(rVL.id_const.id_protected(), var2);
   }
}
