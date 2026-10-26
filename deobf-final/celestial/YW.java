package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class YW implements ArgumentType<rAi_1> {
   private static final Collection<String> break_ = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.criteria.invalid", var0));

   private YW() {
   }

   public static YW class_() {
      return new YW();
   }

   public <T> String class_(rlr_3<T> var1, Object var2) {
      return rCi_1.class_(var1, var2);
   }

   public rAi_1 class_(StringReader var1) throws CommandSyntaxException {
      int var2 = var1.getCursor();

      while (var1.canRead() && var1.peek() != ' ') {
         var1.skip();
      }

      String var3 = var1.getString().substring(var2, var1.getCursor());
      return rAi_1.class_(var3).orElseThrow(() -> {
         var1.setCursor(var2);
         return class_.create(var3);
      });
   }

   public static rAi_1 class_(CommandContext<gy_3> var0, String var1) {
      return (rAi_1)var0.getArgument(var1, rAi_1.class);
   }

   public Collection<String> getExamples() {
      return break_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      ArrayList var3 = Lists.newArrayList(rAi_1.class_.keySet());

      for (rlr_3 var5 : rVL.h) {
         for (Object var7 : var5.class_()) {
            String var8 = this.class_(var5, var7);
            var3.add(var8);
         }
      }

      return gR_2.break_(var3, var2);
   }
}
