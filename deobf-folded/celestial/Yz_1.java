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
import java.util.concurrent.CompletableFuture;

public class Yz_1 implements ArgumentType<YN> {
   private static final Collection<String> id_class = Arrays.asList("=", ">", "<");
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("arguments.operation.div0"));

   public static YN id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return (YN)var0.getArgument(var1, YN.class);
   }

   private static YN id_class(String var0) throws CommandSyntaxException {
      return (YN)(var0.equals("><") ? (var0x, var1) -> {
         int var2 = var0x.id_break();
         var0x.id_break(var1.id_break());
         var1.id_break(var2);
      } : id_break(var0));
   }

   public YN id_class(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw id_break.create();
      } else {
         int var2 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         return id_class(var1.getString().substring(var2, var1.getCursor()));
      }
   }

   public static Yz_1 id_class() {
      return new Yz_1();
   }

   private static YQ id_break(String var0) throws CommandSyntaxException {
      switch (var0) {
         case "=":
            return (var0x, var1) -> var1;
         case "+=":
            return (var0x, var1) -> var0x + var1;
         case "-=":
            return (var0x, var1) -> var0x - var1;
         case "*=":
            return (var0x, var1) -> var0x * var1;
         case "/=":
            return (var0x, var1) -> {
               if (var1 == 0) {
                  throw id_byte.create();
               } else {
                  return rfU_2.id_class(var0x, var1);
               }
            };
         case "%=":
            return (var0x, var1) -> {
               if (var1 == 0) {
                  throw id_byte.create();
               } else {
                  return rfU_2.id_break(var0x, var1);
               }
            };
         case "<":
            return Math::min;
         case ">":
            return Math::max;
         default:
            throw id_break.create();
      }
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.id_class(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, var2);
   }
}
