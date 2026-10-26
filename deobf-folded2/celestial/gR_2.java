package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface gR_2 {
   Collection<String> id_byte();

   static CompletableFuture<Suggestions> id_class(Stream<rqO_2> var0, SuggestionsBuilder var1) {
      return id_class(var0::iterator, var1);
   }

   static CompletableFuture<Suggestions> id_class(String var0, Collection<gY_2> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList var4 = Lists.newArrayList();
      if (Strings.isNullOrEmpty(var0)) {
         for (gY_2 var6 : var1) {
            String var7 = var6.id_byte + " " + var6.id_protected + " " + var6.id_throws;
            if (var3.test(var7)) {
               var4.add(var6.id_byte);
               var4.add(var6.id_byte + " " + var6.id_protected);
               var4.add(var7);
            }
         }
      } else {
         String[] var9 = var0.split(" ");
         if (var9.length == 1) {
            for (gY_2 var12 : var1) {
               String var8 = var9[0] + " " + var12.id_protected + " " + var12.id_throws;
               if (var3.test(var8)) {
                  var4.add(var9[0] + " " + var12.id_protected);
                  var4.add(var8);
               }
            }
         } else if (var9.length == 2) {
            for (gY_2 var13 : var1) {
               String var14 = var9[0] + " " + var9[1] + " " + var13.id_throws;
               if (var3.test(var14)) {
                  var4.add(var14);
               }
            }
         }
      }

      return id_break(var4, var2);
   }

   static <T> CompletableFuture<Suggestions> id_class(Stream<T> var0, SuggestionsBuilder var1, Function<T, rqO_2> var2, Function<T, Message> var3) {
      return id_class(var0::iterator, var1, var2, var3);
   }

   static <T> CompletableFuture<Suggestions> id_class(Iterable<T> var0, SuggestionsBuilder var1, Function<T, rqO_2> var2, Function<T, Message> var3) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);
      id_class(var0, var4, var2, var3x -> var1.suggest(((rqO_2)var2.apply(var3x)).toString(), (Message)var3.apply(var3x)));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> id_class(Iterable<rqO_2> var0, SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      id_class(var0, var2, var0x -> var0x, var1x -> var1.suggest(var1x.toString()));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> id_class(Iterable<rqO_2> var0, SuggestionsBuilder var1, String var2) {
      String var3 = var1.getRemaining().toLowerCase(Locale.ROOT);
      id_class(var0, var3, var2, var0x -> var0x, var2x -> var1.suggest(var2 + var2x));
      return var1.buildFuture();
   }

   static boolean id_class(String var0, String var1) {
      for (int var3 = 0; !var1.startsWith(var0, var3); var3++) {
         var3 = var1.indexOf(95, var3);
         if (var3 < 0) {
            return false;
         }
      }

      return true;
   }

   static CompletableFuture<Suggestions> id_class(String[] var0, SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String var6 : var0) {
         if (id_class(var2, var6.toLowerCase(Locale.ROOT))) {
            var1.suggest(var6);
         }
      }

      return var1.buildFuture();
   }

   CompletableFuture<Suggestions> id_class(CommandContext<gR_2> var1, SuggestionsBuilder var2);

   Collection<String> id_class();

   boolean id_class(int var1);

   static <T> void id_class(Iterable<T> var0, String var1, String var2, Function<T, rqO_2> var3, Consumer<T> var4) {
      if (var1.isEmpty()) {
         var0.forEach(var4);
      } else {
         String var5 = Strings.commonPrefix(var1, var2);
         if (!var5.isEmpty()) {
            String var6 = var1.substring(var5.length());
            id_class(var0, var6, var3, var4);
         }
      }
   }

   static <T> void id_class(Iterable<T> var0, String var1, Function<T, rqO_2> var2, Consumer<T> var3) {
      boolean var4 = var1.indexOf(58) > -1;

      for (Object var6 : var0) {
         rqO_2 var7 = (rqO_2)var2.apply(var6);
         if (var4) {
            String var8 = var7.toString();
            if (id_class(var1, var8)) {
               var3.accept(var6);
            }
         } else if (id_class(var1, var7.id_byte()) || var7.id_byte().equals("minecraft") && id_class(var1, var7.id_break())) {
            var3.accept(var6);
         }
      }
   }

   static CompletableFuture<Suggestions> id_break(Stream<String> var0, SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      var0.filter(var1x -> id_class(var2, var1x.toLowerCase(Locale.ROOT))).forEach(var1::suggest);
      return var1.buildFuture();
   }

   default Collection<String> id_break() {
      return Collections.emptyList();
   }

   static CompletableFuture<Suggestions> id_break(String var0, Collection<gY_2> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList var4 = Lists.newArrayList();
      if (Strings.isNullOrEmpty(var0)) {
         for (gY_2 var6 : var1) {
            String var7 = var6.id_byte + " " + var6.id_throws;
            if (var3.test(var7)) {
               var4.add(var6.id_byte);
               var4.add(var7);
            }
         }
      } else {
         String[] var9 = var0.split(" ");
         if (var9.length == 1) {
            for (gY_2 var11 : var1) {
               String var8 = var9[0] + " " + var11.id_throws;
               if (var3.test(var8)) {
                  var4.add(var8);
               }
            }
         }
      }

      return id_break(var4, var2);
   }

   static CompletableFuture<Suggestions> id_break(Iterable<String> var0, SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String var4 : var0) {
         if (id_class(var2, var4.toLowerCase(Locale.ROOT))) {
            var1.suggest(var4);
         }
      }

      return var1.buildFuture();
   }

   Stream<rqO_2> id_throws();

   default Collection<gY_2> id_catch() {
      return Collections.singleton(gY_2.id_break);
   }

   default Collection<gY_2> id_case() {
      return Collections.singleton(gY_2.id_break);
   }

   rVm_1 id_implements();

   Collection<rqO_2> id_protected();

   Set<rqM_2<rYB>> id_private();
}
