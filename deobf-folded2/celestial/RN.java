package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RN implements ArgumentType<rqO_2> {
   private static final Collection<String> id_class = Stream.of(rYB.id_byte, rYB.id_protected)
      .map(var0 -> var0.id_class().toString())
      .collect(Collectors.toList());
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.dimension.invalid", var0));

   public rqO_2 id_class(StringReader var1) throws CommandSyntaxException {
      return rqO_2.id_class(var1);
   }

   public static RN id_class() {
      return new RN();
   }

   public static rrEm_1 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      rqM_2 var3 = rqM_2.id_class(rVL.id_static, var2);
      rrEm_1 var4 = ((gy_3)var0.getSource()).id_super().id_class(var3);
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
      return var1.getSource() instanceof gR_2 ? gR_2.id_class(((gR_2)var1.getSource()).id_private().stream().map(rqM_2::id_class), var2) : Suggestions.empty();
   }
}
