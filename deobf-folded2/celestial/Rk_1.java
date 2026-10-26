package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class Rk_1 {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.block.tag.disallowed"));
   public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.block.id.invalid", var0));
   public static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.block.property.unknown", var0, var1)
   );
   public static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.block.property.duplicate", var1, var0)
   );
   public static final Dynamic3CommandExceptionType id_throws = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new rgn_3("argument.block.property.invalid", var0, var2, var1)
   );
   public static final Dynamic2CommandExceptionType id_case = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.block.property.novalue", var0, var1)
   );
   public static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType(new rgn_3("argument.block.property.unclosed"));
   private static final BiFunction<SuggestionsBuilder, rlW_2<xd_3>, CompletableFuture<Suggestions>> id_private = (var0, var1) -> var0.buildFuture();
   private final StringReader id_implements;
   private final boolean id_finally;
   private final Map<rCZ<?>, Comparable<?>> id_extends = Maps.newHashMap();
   private final Map<String, String> id_native = Maps.newHashMap();
   private rqO_2 id_volatile = new rqO_2("");
   private rCF<xd_3, xc_3> id_final;
   private xc_3 id_package;
   private rcd_3 id_int;
   private rqO_2 id_new = new rqO_2("");
   private int id_continue;
   private BiFunction<SuggestionsBuilder, rlW_2<xd_3>, CompletableFuture<Suggestions>> id_super = id_private;

   private CompletableFuture<Suggestions> id_byte(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.id_throws(var1, var2);
   }

   public rcd_3 id_byte() {
      return this.id_int;
   }

   public Rk_1(StringReader var1, boolean var2) {
      this.id_implements = var1;
      this.id_finally = var2;
   }

   private CompletableFuture<Suggestions> id_class(SuggestionsBuilder var1, rlW_2<xd_3> var2, String var3) {
      boolean var4 = false;
      if (this.id_new != null && !this.id_new.id_break().isEmpty()) {
         rlb_3 var5 = var2.id_class(this.id_new);
         if (var5 != null) {
            for (xd_3 var7 : var5.id_class()) {
               rCZ var8 = var7.id_new().id_class(var3);
               if (var8 != null) {
                  id_class(var1, var8);
               }

               if (!var4) {
                  for (rCZ var10 : var7.id_new().id_protected()) {
                     if (!this.id_native.containsKey(var10.id_throws())) {
                        var4 = true;
                        break;
                     }
                  }
               }
            }
         }
      }

      if (var4) {
         var1.suggest(String.valueOf(','));
      }

      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   private static <T extends Comparable<T>> SuggestionsBuilder id_class(SuggestionsBuilder var0, rCZ<T> var1) {
      for (Comparable var3 : var1.id_class()) {
         if (var3 instanceof Integer) {
            var0.suggest((Integer)var3);
         } else {
            var0.suggest(var1.id_class((T)var3));
         }
      }

      return var0;
   }

   private <T extends Comparable<T>> void id_class(rCZ<T> var1, String var2, int var3) throws CommandSyntaxException {
      Optional var4 = var1.id_break(var2);
      if (var4.isPresent()) {
         this.id_package = this.id_package.id_class(var1, (Comparable)var4.get());
         this.id_extends.put(var1, (Comparable<?>)var4.get());
      } else {
         this.id_implements.setCursor(var3);
         throw id_throws.createWithContext(this.id_implements, this.id_volatile.toString(), var1.id_throws(), var2);
      }
   }

   public static String id_class(xc_3 var0) {
      StringBuilder var1 = new StringBuilder(rVL.id_strictfp.id_break(var0.id_break()).toString());
      if (!var0.id_public().isEmpty()) {
         var1.append('[');
         boolean var2 = false;

         for (UnmodifiableIterator var3 = var0.id_goto().entrySet().iterator(); var3.hasNext(); var2 = true) {
            Entry var4 = (Entry)var3.next();
            if (var2) {
               var1.append(',');
            }

            id_class(var1, (rCZ)var4.getKey(), (Comparable<?>)var4.getValue());
         }

         var1.append(']');
      }

      return var1.toString();
   }

   private static <T extends Comparable<T>> void id_class(StringBuilder var0, rCZ<T> var1, Comparable<?> var2) {
      var0.append(var1.id_throws());
      var0.append('=');
      var0.append(var1.id_class((T)var2));
   }

   public CompletableFuture<Suggestions> id_class(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      return this.id_super.apply(var1.createOffset(this.id_implements.getCursor()), var2);
   }

   public Rk_1 id_class(boolean var1) throws CommandSyntaxException {
      this.id_super = this::id_native;
      if (this.id_implements.canRead() && this.id_implements.peek() == '#') {
         this.id_case();
         this.id_super = this::id_implements;
         if (this.id_implements.canRead() && this.id_implements.peek() == '[') {
            this.id_private();
            this.id_super = this::id_case;
         }
      } else {
         this.id_throws();
         this.id_super = this::id_finally;
         if (this.id_implements.canRead() && this.id_implements.peek() == '[') {
            this.id_catch();
            this.id_super = this::id_case;
         }
      }

      if (var1 && this.id_implements.canRead() && this.id_implements.peek() == '{') {
         this.id_super = id_private;
         this.id_implements();
      }

      return this;
   }

   public Map<rCZ<?>, Comparable<?>> id_class() {
      return this.id_extends;
   }

   private boolean id_class(rlW_2<xd_3> var1) {
      if (this.id_package != null) {
         return this.id_package.id_break().id_protected();
      } else {
         if (this.id_new != null) {
            rlb_3 var2 = var1.id_class(this.id_new);
            if (var2 != null) {
               for (xd_3 var4 : var2.id_class()) {
                  if (var4.id_protected()) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private CompletableFuture<Suggestions> id_break(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.id_protected(var1, var2);
   }

   public xc_3 id_break() {
      return this.id_package;
   }

   public void id_throws() throws CommandSyntaxException {
      int var1 = this.id_implements.getCursor();
      this.id_volatile = rqO_2.id_class(this.id_implements);
      xd_3 var2 = rVL.id_strictfp.id_break(this.id_volatile).orElseThrow(() -> {
         this.id_implements.setCursor(var1);
         return id_break.createWithContext(this.id_implements, this.id_volatile.toString());
      });
      this.id_final = var2.id_new();
      this.id_package = var2.id_continue();
   }

   private CompletableFuture<Suggestions> id_throws(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      String var3 = var1.getRemaining().toLowerCase(Locale.ROOT);
      if (this.id_new != null && !this.id_new.id_break().isEmpty()) {
         rlb_3 var4 = var2.id_class(this.id_new);
         if (var4 != null) {
            for (xd_3 var6 : var4.id_class()) {
               for (rCZ var8 : var6.id_new().id_protected()) {
                  if (!this.id_native.containsKey(var8.id_throws()) && var8.id_throws().startsWith(var3)) {
                     var1.suggest(var8.id_throws() + "=");
                  }
               }
            }
         }
      }

      return var1.buildFuture();
   }

   public Map<String, String> id_finally() {
      return this.id_native;
   }

   private CompletableFuture<Suggestions> id_finally(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         if (!this.id_package.id_break().id_new().id_protected().isEmpty()) {
            var1.suggest(String.valueOf('['));
         }

         if (this.id_package.id_break().id_protected()) {
            var1.suggest(String.valueOf('{'));
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> id_catch(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('='));
      }

      return var1.buildFuture();
   }

   public void id_catch() throws CommandSyntaxException {
      this.id_implements.skip();
      this.id_super = this::id_break;
      this.id_implements.skipWhitespace();

      while (this.id_implements.canRead() && this.id_implements.peek() != ']') {
         this.id_implements.skipWhitespace();
         int var1 = this.id_implements.getCursor();
         String var2 = this.id_implements.readString();
         rCZ var3 = this.id_final.id_class(var2);
         if (var3 == null) {
            this.id_implements.setCursor(var1);
            throw id_byte.createWithContext(this.id_implements, this.id_volatile.toString(), var2);
         }

         if (this.id_extends.containsKey(var3)) {
            this.id_implements.setCursor(var1);
            throw id_protected.createWithContext(this.id_implements, this.id_volatile.toString(), var2);
         }

         this.id_implements.skipWhitespace();
         this.id_super = this::id_catch;
         if (!this.id_implements.canRead() || this.id_implements.peek() != '=') {
            throw id_case.createWithContext(this.id_implements, this.id_volatile.toString(), var2);
         }

         this.id_implements.skip();
         this.id_implements.skipWhitespace();
         this.id_super = (var1x, var2x) -> id_class(var1x, var3).buildFuture();
         int var4 = this.id_implements.getCursor();
         this.id_class(var3, this.id_implements.readString(), var4);
         this.id_super = this::id_private;
         this.id_implements.skipWhitespace();
         if (this.id_implements.canRead()) {
            if (this.id_implements.peek() != ',') {
               if (this.id_implements.peek() != ']') {
                  throw id_catch.createWithContext(this.id_implements);
               }
               break;
            }

            this.id_implements.skip();
            this.id_super = this::id_protected;
         }
      }

      if (this.id_implements.canRead()) {
         this.id_implements.skip();
      } else {
         throw id_catch.createWithContext(this.id_implements);
      }
   }

   private CompletableFuture<Suggestions> id_extends(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      return gR_2.id_class(var2.id_break(), var1.createOffset(this.id_continue).add(var1));
   }

   public void id_case() throws CommandSyntaxException {
      if (!this.id_finally) {
         throw id_class.create();
      } else {
         this.id_super = this::id_extends;
         this.id_implements.expect('#');
         this.id_continue = this.id_implements.getCursor();
         this.id_new = rqO_2.id_class(this.id_implements);
      }
   }

   private CompletableFuture<Suggestions> id_case(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty() && this.id_class(var2)) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> id_implements(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         rlb_3 var3 = var2.id_class(this.id_new);
         if (var3 != null) {
            boolean var4 = false;
            boolean var5 = false;

            for (xd_3 var7 : var3.id_class()) {
               var4 |= !var7.id_new().id_protected().isEmpty();
               var5 |= var7.id_protected();
               if (var4 && var5) {
                  break;
               }
            }

            if (var4) {
               var1.suggest(String.valueOf('['));
            }

            if (var5) {
               var1.suggest(String.valueOf('{'));
            }
         }
      }

      return this.id_extends(var1, var2);
   }

   public void id_implements() throws CommandSyntaxException {
      this.id_int = new rcH_2(this.id_implements).id_case();
   }

   private CompletableFuture<Suggestions> id_protected(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      String var3 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (rCZ var5 : this.id_package.id_public()) {
         if (!this.id_extends.containsKey(var5) && var5.id_throws().startsWith(var3)) {
            var1.suggest(var5.id_throws() + "=");
         }
      }

      return var1.buildFuture();
   }

   public rqO_2 id_protected() {
      return this.id_new;
   }

   public void id_private() throws CommandSyntaxException {
      this.id_implements.skip();
      this.id_super = this::id_byte;
      int var1 = -1;
      this.id_implements.skipWhitespace();

      while (this.id_implements.canRead() && this.id_implements.peek() != ']') {
         this.id_implements.skipWhitespace();
         int var2 = this.id_implements.getCursor();
         String var3 = this.id_implements.readString();
         if (this.id_native.containsKey(var3)) {
            this.id_implements.setCursor(var2);
            throw id_protected.createWithContext(this.id_implements, this.id_volatile.toString(), var3);
         }

         this.id_implements.skipWhitespace();
         if (!this.id_implements.canRead() || this.id_implements.peek() != '=') {
            this.id_implements.setCursor(var2);
            throw id_case.createWithContext(this.id_implements, this.id_volatile.toString(), var3);
         }

         this.id_implements.skip();
         this.id_implements.skipWhitespace();
         this.id_super = (var2x, var3x) -> this.id_class(var2x, var3x, var3);
         var1 = this.id_implements.getCursor();
         String var4 = this.id_implements.readString();
         this.id_native.put(var3, var4);
         this.id_implements.skipWhitespace();
         if (this.id_implements.canRead()) {
            var1 = -1;
            if (this.id_implements.peek() != ',') {
               if (this.id_implements.peek() != ']') {
                  throw id_catch.createWithContext(this.id_implements);
               }
               break;
            }

            this.id_implements.skip();
            this.id_super = this::id_throws;
         }
      }

      if (this.id_implements.canRead()) {
         this.id_implements.skip();
      } else {
         if (var1 >= 0) {
            this.id_implements.setCursor(var1);
         }

         throw id_catch.createWithContext(this.id_implements);
      }
   }

   private CompletableFuture<Suggestions> id_private(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      if (var1.getRemaining().isEmpty() && this.id_extends.size() < this.id_package.id_public().size()) {
         var1.suggest(String.valueOf(','));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> id_native(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (this.id_finally) {
         gR_2.id_class(var2.id_break(), var1, String.valueOf('#'));
      }

      gR_2.id_class(rVL.id_strictfp.id_protected(), var1);
      return var1.buildFuture();
   }
}
