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
   private static final Collection<String> catch_ = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.toomany"));
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.player.toomany"));
   public static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("argument.player.entities"));
   public static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType case_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.selector.not_allowed"));
   final boolean private_;
   final boolean implements_;

   public static Collection<? extends an_3> byte_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).break_((gy_3)var0.getSource());
   }

   public static RZ byte_() {
      return new RZ(true, true);
   }

   protected RZ(boolean var1, boolean var2) {
      this.private_ = var1;
      this.implements_ = var2;
   }

   public static RZ class_() {
      return new RZ(true, false);
   }

   public Rn_1 class_(StringReader var1) throws CommandSyntaxException {
      boolean var2 = false;
      RC var3 = new RC(var1);
      Rn_1 var4 = var3.super_();
      if (var4.class_() > 1 && this.private_) {
         if (this.implements_) {
            var1.setCursor(0);
            throw break_.createWithContext(var1);
         } else {
            var1.setCursor(0);
            throw class_.createWithContext(var1);
         }
      } else if (var4.break_() && this.implements_ && !var4.byte_()) {
         var1.setCursor(0);
         throw byte_.createWithContext(var1);
      } else {
         return var4;
      }
   }

   public static an_3 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).class_((gy_3)var0.getSource());
   }

   public static Collection<? extends an_3> break_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      Collection var2 = byte_(var0, var1);
      if (var2.isEmpty()) {
         throw protected_.create();
      } else {
         return var2;
      }
   }

   public static RZ break_() {
      return new RZ(false, false);
   }

   public static rhN_2 throws_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).byte_((gy_3)var0.getSource());
   }

   public static Collection<rhN_2> case_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      List var2 = ((Rn_1)var0.getArgument(var1, Rn_1.class)).protected_((gy_3)var0.getSource());
      if (var2.isEmpty()) {
         throw throws_.create();
      } else {
         return var2;
      }
   }

   public static RZ protected_() {
      return new RZ(false, true);
   }

   public static Collection<rhN_2> protected_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rn_1)var0.getArgument(var1, Rn_1.class)).protected_((gy_3)var0.getSource());
   }

   public Collection<String> getExamples() {
      return catch_;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof gR_2) {
         StringReader var3 = new StringReader(var2.getInput());
         var3.setCursor(var2.getStart());
         gR_2 var4 = (gR_2)var1.getSource();
         RC var5 = new RC(var3, var4.class_(2));

         try {
            var5.super_();
         } catch (CommandSyntaxException var7) {
         }

         return var5.class_(var2, var2x -> {
            Collection var3x = var4.class_();
            Object var4x = this.implements_ ? var3x : Iterables.concat(var3x, var4.break_());
            gR_2.break_((Iterable<String>)var4x, var2x);
         });
      } else {
         return Suggestions.empty();
      }
   }
}
