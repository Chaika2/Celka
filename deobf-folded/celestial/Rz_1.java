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

public class Rz_1 implements ArgumentType<Rf_1> {
   private static final Collection<String> id_break = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.pos2d.incomplete"));

   public static Rz_1 id_class() {
      return new Rz_1();
   }

   public Rf_1 id_class(StringReader var1) throws CommandSyntaxException {
      int var2 = var1.getCursor();
      if (!var1.canRead()) {
         throw id_class.createWithContext(var1);
      } else {
         Yr_1 var3 = Yr_1.id_class(var1);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            Yr_1 var4 = Yr_1.id_class(var1);
            return new Ri_1(var3, new Yr_1(true, 0.0), var4);
         } else {
            var1.setCursor(var2);
            throw id_class.createWithContext(var1);
         }
      }
   }

   public static rfg_3 id_class(CommandContext<gy_3> var0, String var1) {
      rfH_2 var2 = ((Rf_1)var0.getArgument(var1, Rf_1.class)).id_byte((gy_3)var0.getSource());
      return new rfg_3(var2.b_(), var2.d_());
   }

   public Collection<String> getExamples() {
      return id_break;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof gR_2)) {
         return Suggestions.empty();
      } else {
         String var3 = var2.getRemaining();
         Object var4;
         if (!var3.isEmpty() && var3.charAt(0) == '^') {
            var4 = Collections.singleton(gY_2.id_class);
         } else {
            var4 = ((gR_2)var1.getSource()).id_case();
         }

         return gR_2.id_break(var3, (Collection<gY_2>)var4, var2, gp_3.id_class(this::id_class));
      }
   }
}
