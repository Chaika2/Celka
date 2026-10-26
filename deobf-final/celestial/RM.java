package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class RM implements ArgumentType<Rf_1> {
   private static final Collection<String> byte_ = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.pos.outofworld"));

   public Rf_1 class_(StringReader var1) throws CommandSyntaxException {
      return (Rf_1)(var1.canRead() && var1.peek() == '^' ? Ra_1.class_(var1) : Ri_1.class_(var1));
   }

   public static RM class_() {
      return new RM();
   }

   public static rfH_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rfH_2 var2 = ((Rf_1)var0.getArgument(var1, Rf_1.class)).byte_((gy_3)var0.getSource());
      if (!((gy_3)var0.getSource()).final_().int_(var2)) {
         throw class_.create();
      } else {
         ((gy_3)var0.getSource()).final_();
         if (!rrEm_1.new_(var2)) {
            throw break_.create();
         } else {
            return var2;
         }
      }
   }

   public static rfH_2 break_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rf_1)var0.getArgument(var1, Rf_1.class)).byte_((gy_3)var0.getSource());
   }

   public Collection<String> getExamples() {
      return byte_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof gR_2)) {
         return Suggestions.empty();
      } else {
         String var3 = var2.getRemaining();
         Object var4;
         if (!var3.isEmpty() && var3.charAt(0) == '^') {
            var4 = Collections.singleton(gY_2.class_);
         } else {
            var4 = ((gR_2)var1.getSource()).case_();
         }

         return gR_2.class_(var3, (Collection<gY_2>)var4, var2, gp_3.class_(this::class_));
      }
   }
}
