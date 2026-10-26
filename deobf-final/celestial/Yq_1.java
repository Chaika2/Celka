package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class Yq_1 implements ArgumentType<Integer> {
   private static final Collection<String> class_ = Arrays.asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.time.invalid_unit"));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.time.invalid_tick_count", var0));
   private static final Object2IntMap<String> protected_ = new Object2IntOpenHashMap();

   static {
      protected_.put("d", 24000);
      protected_.put("s", 20);
      protected_.put("t", 1);
      protected_.put("", 1);
   }

   public static Yq_1 class_() {
      return new Yq_1();
   }

   public Integer class_(StringReader var1) throws CommandSyntaxException {
      float var2 = var1.readFloat();
      String var3 = var1.readUnquotedString();
      int var4 = protected_.getOrDefault(var3, 0);
      if (var4 == 0) {
         throw break_.create();
      } else {
         int var5 = Math.round(var2 * (float)var4);
         if (var5 < 0) {
            throw byte_.create(var5);
         } else {
            return var5;
         }
      }
   }

   public Collection<String> getExamples() {
      return class_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getRemaining());

      try {
         var3.readFloat();
      } catch (CommandSyntaxException var5) {
         return var2.buildFuture();
      }

      return gR_2.break_(protected_.keySet(), var2.createOffset(var2.getStart() + var3.getCursor()));
   }
}
