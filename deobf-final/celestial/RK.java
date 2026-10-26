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
import java.util.function.Predicate;

public class RK implements ArgumentType<RD> {
   private static final Collection<String> class_ = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.item.tag.unknown", var0));

   public static RK class_() {
      return new RK();
   }

   public static Predicate<rdn_3> class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((RD)var0.getArgument(var1, RD.class)).create(var0);
   }

   public RD class_(StringReader var1) throws CommandSyntaxException {
      Ro_1 var2 = new Ro_1(var1, true).catch_();
      if (var2.class_() != null) {
         RU var4 = new RU(var2.class_(), var2.break_());
         return var1x -> var4;
      } else {
         rqO_2 var3 = var2.byte_();
         return var2x -> {
            rlb_3 var3x = ((gy_3)var2x.getSource()).super_().g().break_().class_(var3);
            if (var3x == null) {
               throw break_.create(var3.toString());
            } else {
               return new Re_1(var3x, var2.break_());
            }
         };
      }
   }

   public Collection<String> getExamples() {
      return class_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getInput());
      var3.setCursor(var2.getStart());
      Ro_1 var4 = new Ro_1(var3, true);

      try {
         var4.catch_();
      } catch (CommandSyntaxException var6) {
      }

      return var4.class_(var2, rlc_3.class_());
   }
}
