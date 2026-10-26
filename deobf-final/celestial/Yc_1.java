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

public class Yc_1 implements ArgumentType<rLx_1> {
   private static final Collection<String> break_ = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("particle.notFound", var0));

   public static Yc_1 class_() {
      return new Yc_1();
   }

   private static <T extends rLx_1> T class_(StringReader var0, rLz_1<T> var1) throws CommandSyntaxException {
      return (T)var1.case_().break_(var1, var0);
   }

   public rLx_1 class_(StringReader var1) throws CommandSyntaxException {
      return break_(var1);
   }

   public static rLx_1 class_(CommandContext<gy_3> var0, String var1) {
      return (rLx_1)var0.getArgument(var1, rLx_1.class);
   }

   public static rLx_1 break_(StringReader var0) throws CommandSyntaxException {
      rqO_2 var1 = rqO_2.class_(var0);
      rLz_1 var2 = rVL.switch_.break_(var1).orElseThrow(() -> class_.create(var1));
      return class_(var0, var2);
   }

   public Collection<String> getExamples() {
      return break_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.class_(rVL.switch_.protected_(), var2);
   }
}
