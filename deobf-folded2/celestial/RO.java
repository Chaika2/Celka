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

public class RO implements ArgumentType<RX> {
   private static final Collection<String> id_class = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.block.tag.unknown", var0));

   public static RO id_class() {
      return new RO();
   }

   public static Predicate<ryw_3> id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((RX)var0.getArgument(var1, RX.class)).create(((gy_3)var0.getSource()).id_super().g());
   }

   public RX id_class(StringReader var1) throws CommandSyntaxException {
      Rk_1 var2 = new Rk_1(var1, true).id_class(true);
      if (var2.id_break() != null) {
         Rh_1 var4 = new Rh_1(var2.id_break(), var2.id_class().keySet(), var2.id_byte());
         return var1x -> var4;
      } else {
         rqO_2 var3 = var2.id_protected();
         return var2x -> {
            rlb_3 var3x = var2x.id_class().id_class(var3);
            if (var3x == null) {
               throw id_break.create(var3.toString());
            } else {
               return new RJ(var3x, var2.id_finally(), var2.id_byte());
            }
         };
      }
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getInput());
      var3.setCursor(var2.getStart());
      Rk_1 var4 = new Rk_1(var3, true);

      try {
         var4.id_class(true);
      } catch (CommandSyntaxException var6) {
      }

      return var4.id_class(var2, rls_3.id_class());
   }
}
