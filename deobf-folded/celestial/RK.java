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
   private static final Collection<String> id_class = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.item.tag.unknown", var0));

   public static RK id_class() {
      return new RK();
   }

   public static Predicate<rdn_3> id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((RD)var0.getArgument(var1, RD.class)).create(var0);
   }

   public RD id_class(StringReader var1) throws CommandSyntaxException {
      Ro_1 var2 = new Ro_1(var1, true).id_catch();
      if (var2.id_class() != null) {
         RU var4 = new RU(var2.id_class(), var2.id_break());
         return var1x -> var4;
      } else {
         rqO_2 var3 = var2.id_byte();
         return var2x -> {
            rlb_3 var3x = ((gy_3)var2x.getSource()).id_super().g().id_break().id_class(var3);
            if (var3x == null) {
               throw id_break.create(var3.toString());
            } else {
               return new Re_1(var3x, var2.id_break());
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
      Ro_1 var4 = new Ro_1(var3, true);

      try {
         var4.id_catch();
      } catch (CommandSyntaxException var6) {
      }

      return var4.id_class(var2, rlc_3.id_class());
   }
}
