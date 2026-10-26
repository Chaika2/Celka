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
   private static final Collection<String> byte_ = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.pos.mixed"));
   private final boolean protected_;

   public Yw_1(boolean var1) {
      this.protected_ = var1;
   }

   public Rf_1 class_(StringReader var1) throws CommandSyntaxException {
      return (Rf_1)(var1.canRead() && var1.peek() == '^' ? Ra_1.class_(var1) : Ri_1.class_(var1, this.protected_));
   }

   public static Yw_1 class_() {
      return new Yw_1(true);
   }

   public static Yw_1 class_(boolean var0) {
      return new Yw_1(var0);
   }

   public static rjU_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rf_1)var0.getArgument(var1, Rf_1.class)).class_((gy_3)var0.getSource());
   }

   public static Rf_1 break_(CommandContext<gy_3> var0, String var1) {
      return (Rf_1)var0.getArgument(var1, Rf_1.class);
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
            var4 = ((gR_2)var1.getSource()).catch_();
         }

         return gR_2.class_(var3, (Collection<gY_2>)var4, var2, gp_3.class_(this::class_));
      }
   }
}
