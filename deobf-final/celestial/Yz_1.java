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
   private static final Collection<String> class_ = Arrays.asList("=", ">", "<");
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("arguments.operation.div0"));

   public static YN class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return (YN)var0.getArgument(var1, YN.class);
   }

   private static YN class_(String var0) throws CommandSyntaxException {
      return (YN)(var0.equals("><") ? (var0x, var1) -> {
         int var2 = var0x.break_();
         var0x.break_(var1.break_());
         var1.break_(var2);
      } : break_(var0));
   }

   public YN class_(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw break_.create();
      } else {
         int var2 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         return class_(var1.getString().substring(var2, var1.getCursor()));
      }
   }

   public static Yz_1 class_() {
      return new Yz_1();
   }

   private static YQ break_(String var0) throws CommandSyntaxException {
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
                  throw byte_.create();
               } else {
                  return rfU_2.class_(var0x, var1);
               }
            };
         case "%=":
            return (var0x, var1) -> {
               if (var1 == 0) {
                  throw byte_.create();
               } else {
                  return rfU_2.break_(var0x, var1);
               }
            };
         case "<":
            return Math::min;
         case ">":
            return Math::max;
         default:
            throw break_.create();
      }
   }

   public Collection<String> getExamples() {
      return class_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.class_(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, var2);
   }
}
