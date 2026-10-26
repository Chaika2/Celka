package celestial;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RZ implements ArgumentType<Rn_1> {
   private static final Collection<String> id_catch = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.entity.toomany"));
   public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("argument.player.toomany"));
   public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("argument.player.entities"));
   public static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType(new rgn_3("argument.entity.selector.not_allowed"));
   final boolean id_private;
   final boolean id_implements;

   public static Collection<? extends an_3> id_byte(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).id_break((gy_3)var0.getSource());
   }

   public static RZ id_byte() {
      return new RZ(true, true);
   }

   protected RZ(boolean var1, boolean var2) {
      this.id_private = var1;
      this.id_implements = var2;
   }

   public static RZ id_class() {
      return new RZ(true, false);
   }

   public Rn_1 id_class(StringReader var1) throws CommandSyntaxException {
      boolean var2 = false;
      RC var3 = new RC(var1);
      Rn_1 var4 = var3.id_super();
      if (var4.id_class() > 1 && this.id_private) {
         if (this.id_implements) {
            var1.setCursor(0);
            throw id_break.createWithContext(var1);
         } else {
            var1.setCursor(0);
            throw id_class.createWithContext(var1);
         }
      } else if (var4.id_break() && this.id_implements && !var4.id_byte()) {
         var1.setCursor(0);
         throw id_byte.createWithContext(var1);
      } else {
         return var4;
      }
   }

   public static an_3 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).id_class((gy_3)var0.getSource());
   }

   public static Collection<? extends an_3> id_break(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      Collection var2 = id_byte(var0, var1);
      if (var2.isEmpty()) {
         throw id_protected.create();
      } else {
         return var2;
      }
   }

   public static RZ id_break() {
      return new RZ(false, false);
   }

   public static rhN_2 id_throws(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).id_byte((gy_3)var0.getSource());
   }

   public static Collection<rhN_2> id_case(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      List var2 = ((Rn_1)var0.getArgument(var1, Rn_1.class)).id_protected((gy_3)var0.getSource());
      if (var2.isEmpty()) {
         throw id_throws.create();
      } else {
         return var2;
      }
   }

   public static RZ id_protected() {
      return new RZ(false, true);
   }

   public static Collection<rhN_2> id_protected(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).id_protected((gy_3)var0.getSource());
   }

   public Collection<String> getExamples() {
      return id_catch;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof gR_2) {
         StringReader var3 = new StringReader(var2.getInput());
         var3.setCursor(var2.getStart());
         gR_2 var4 = (gR_2)var1.getSource();
         RC var5 = new RC(var3, var4.id_class(2));

         try {
            var5.id_super();
         } catch (CommandSyntaxException var7) {
         }

         return var5.id_class(var2, var2x -> {
            Collection var3x = var4.id_class();
            Object var4x = this.id_implements ? var3x : Iterables.concat(var3x, var4.id_break());
            gR_2.id_break((Iterable<String>)var4x, var2x);
         });
      } else {
         return Suggestions.empty();
      }
   }
}
