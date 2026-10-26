package celestial;

import com.mojang.authlib.GameProfile;
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

public class RT implements ArgumentType<Rt_1> {
   private static final Collection<String> id_break = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.player.unknown"));

   public static Collection<GameProfile> id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rt_1)var0.getArgument(var1, Rt_1.class)).getNames((gy_3)var0.getSource());
   }

   public Rt_1 id_class(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         RC var4 = new RC(var1);
         Rn_1 var5 = var4.id_super();
         if (var5.id_break()) {
            throw RZ.id_byte.create();
         } else {
            return new Rw_1(var5);
         }
      } else {
         int var2 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         String var3 = var1.getString().substring(var2, var1.getCursor());
         return var1x -> {
            GameProfile var2x = var1x.id_super().F().id_class(var3);
            if (var2x == null) {
               throw id_class.create();
            } else {
               return Collections.singleton(var2x);
            }
         };
      }
   }

   public static RT id_class() {
      return new RT();
   }

   public Collection<String> getExamples() {
      return id_break;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof gR_2) {
         StringReader var3 = new StringReader(var2.getInput());
         var3.setCursor(var2.getStart());
         RC var4 = new RC(var3);

         try {
            var4.id_super();
         } catch (CommandSyntaxException var6) {
         }

         return var4.id_class(var2, var1x -> gR_2.id_break(((gR_2)var1.getSource()).id_class(), var1x));
      } else {
         return Suggestions.empty();
      }
   }
}
