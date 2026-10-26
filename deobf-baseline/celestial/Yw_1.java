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

public class Yw_1 implements ArgumentType<Rf_1> {
   private static final Collection<String> id_byte = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("argument.pos.mixed"));
   private final boolean id_protected;

   public Yw_1(boolean var1) {
      this.id_protected = var1;
   }

   public Rf_1 id_class(StringReader var1) throws CommandSyntaxException {
      return (Rf_1)(var1.canRead() && var1.peek() == '^' ? Ra_1.id_class(var1) : Ri_1.id_class(var1, this.id_protected));
   }

   public static Yw_1 id_class() {
      return new Yw_1(true);
   }

   public static Yw_1 id_class(boolean var0) {
      return new Yw_1(var0);
   }

   public static rjU_2 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rf_1)var0.getArgument(var1, Rf_1.class)).id_class((gy_3)var0.getSource());
   }

   public static Rf_1 id_break(CommandContext<gy_3> var0, String var1) {
      return (Rf_1)var0.getArgument(var1, Rf_1.class);
   }

   public Collection<String> getExamples() {
      return id_byte;
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
            var4 = ((gR_2)var1.getSource()).id_catch();
         }

         return gR_2.id_class(var3, (Collection<gY_2>)var4, var2, gp_3.id_class(this::id_class));
      }
   }
}
