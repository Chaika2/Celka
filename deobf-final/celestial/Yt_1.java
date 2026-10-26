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

public class Yt_1 implements ArgumentType<Rf_1> {
   private static final Collection<String> break_ = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.pos2d.incomplete"));
   private final boolean byte_;

   public Yt_1(boolean var1) {
      this.byte_ = var1;
   }

   public static Yt_1 class_() {
      return new Yt_1(true);
   }

   public Rf_1 class_(StringReader var1) throws CommandSyntaxException {
      int var2 = var1.getCursor();
      if (!var1.canRead()) {
         throw class_.createWithContext(var1);
      } else {
         Yr_1 var3 = Yr_1.class_(var1, this.byte_);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            Yr_1 var4 = Yr_1.class_(var1, this.byte_);
            return new Ri_1(var3, new Yr_1(true, 0.0), var4);
         } else {
            var1.setCursor(var2);
            throw class_.createWithContext(var1);
         }
      }
   }

   public static rjK_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rjU_2 var2 = ((Rf_1)var0.getArgument(var1, Rf_1.class)).class_((gy_3)var0.getSource());
      return new rjK_2((float)var2.break_, (float)var2.protected_);
   }

   public Collection<String> getExamples() {
      return break_;
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

         return gR_2.break_(var3, (Collection<gY_2>)var4, var2, gp_3.class_(this::class_));
      }
   }
}
