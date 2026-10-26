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

public class Rc_1 implements ArgumentType<ev_3> {
   private static final Collection<String> break_ = Arrays.asList("unbreaking", "silk_touch");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("enchantment.unknown", var0));

   public static Rc_1 class_() {
      return new Rc_1();
   }

   public ev_3 class_(StringReader var1) throws CommandSyntaxException {
      rqO_2 var2 = rqO_2.class_(var1);
      return rVL.boolean_.break_(var2).orElseThrow(() -> class_.create(var2));
   }

   public static ev_3 class_(CommandContext<gy_3> var0, String var1) {
      return (ev_3)var0.getArgument(var1, ev_3.class);
   }

   public Collection<String> getExamples() {
      return break_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.class_(rVL.boolean_.protected_(), var2);
   }
}
