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
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.block.tag.disallowed"));
   public static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.block.id.invalid", var0));
   public static final Dynamic2CommandExceptionType byte_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.block.property.unknown", var0, var1)
   );
   public static final Dynamic2CommandExceptionType protected_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.block.property.duplicate", var1, var0)
   );
   public static final Dynamic3CommandExceptionType throws_ = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new rgn_3("argument.block.property.invalid", var0, var2, var1)
   );
   public static final Dynamic2CommandExceptionType case_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("argument.block.property.novalue", var0, var1)
   );
   public static final SimpleCommandExceptionType catch_ = new SimpleCommandExceptionType(new rgn_3("argument.block.property.unclosed"));
   private static final BiFunction<SuggestionsBuilder, rlW_2<xd_3>, CompletableFuture<Suggestions>> private_ = (var0, var1) -> var0.buildFuture();
   private final StringReader implements_;
   private final boolean finally_;
   private final Map<rCZ<?>, Comparable<?>> extends_ = Maps.newHashMap();
   private final Map<String, String> native_ = Maps.newHashMap();
   private rqO_2 volatile_ = new rqO_2("");
   private rCF<xd_3, xc_3> final_;
   private xc_3 package_;
   private rcd_3 int_;
   private rqO_2 new_ = new rqO_2("");
   private int continue_;
   private BiFunction<SuggestionsBuilder, rlW_2<xd_3>, CompletableFuture<Suggestions>> super_ = private_;

   private CompletableFuture<Suggestions> byte_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.throws_(var1, var2);
   }

   public rcd_3 byte_() {
      return this.int_;
   }

   public Rk_1(StringReader var1, boolean var2) {
      this.implements_ = var1;
      this.finally_ = var2;
   }

   private CompletableFuture<Suggestions> class_(SuggestionsBuilder var1, rlW_2<xd_3> var2, String var3) {
      boolean var4 = false;
      if (this.new_ != null && !this.new_.break_().isEmpty()) {
         rlb_3 var5 = var2.class_(this.new_);
         if (var5 != null) {
            for (xd_3 var7 : var5.class_()) {
               rCZ var8 = var7.new_().class_(var3);
               if (var8 != null) {
                  class_(var1, var8);
               }

               if (!var4) {
                  for (rCZ var10 : var7.new_().protected_()) {
                     if (!this.native_.containsKey(var10.throws_())) {
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

   private static <T extends Comparable<T>> SuggestionsBuilder class_(SuggestionsBuilder var0, rCZ<T> var1) {
      for (Comparable var3 : var1.class_()) {
         if (var3 instanceof Integer) {
            var0.suggest((Integer)var3);
         } else {
            var0.suggest(var1.class_((T)var3));
         }
      }

      return var0;
   }

   private <T extends Comparable<T>> void class_(rCZ<T> var1, String var2, int var3) throws CommandSyntaxException {
      Optional var4 = var1.break_(var2);
      if (var4.isPresent()) {
         this.package_ = this.package_.class_(var1, (Comparable)var4.get());
         this.extends_.put(var1, (Comparable<?>)var4.get());
      } else {
         this.implements_.setCursor(var3);
         throw throws_.createWithContext(this.implements_, this.volatile_.toString(), var1.throws_(), var2);
      }
   }

   public static String class_(xc_3 var0) {
      StringBuilder var1 = new StringBuilder(rVL.strictfp_.break_(var0.break_()).toString());
      if (!var0.public_().isEmpty()) {
         var1.append('[');
         boolean var2 = false;

         for (UnmodifiableIterator var3 = var0.goto_().entrySet().iterator(); var3.hasNext(); var2 = true) {
            Entry var4 = (Entry)var3.next();
            if (var2) {
               var1.append(',');
            }

            class_(var1, (rCZ)var4.getKey(), (Comparable<?>)var4.getValue());
         }

         var1.append(']');
      }

      return var1.toString();
   }

   private static <T extends Comparable<T>> void class_(StringBuilder var0, rCZ<T> var1, Comparable<?> var2) {
      var0.append(var1.throws_());
      var0.append('=');
      var0.append(var1.class_((T)var2));
   }

   public CompletableFuture<Suggestions> class_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      return this.super_.apply(var1.createOffset(this.implements_.getCursor()), var2);
   }

   public Rk_1 class_(boolean var1) throws CommandSyntaxException {
      this.super_ = this::native_;
      if (this.implements_.canRead() && this.implements_.peek() == '#') {
         this.case_();
         this.super_ = this::implements_;
         if (this.implements_.canRead() && this.implements_.peek() == '[') {
            this.private_();
            this.super_ = this::case_;
         }
      } else {
         this.throws_();
         this.super_ = this::finally_;
         if (this.implements_.canRead() && this.implements_.peek() == '[') {
            this.catch_();
            this.super_ = this::case_;
         }
      }

      if (var1 && this.implements_.canRead() && this.implements_.peek() == '{') {
         this.super_ = private_;
         this.implements_();
      }

      return this;
   }

   public Map<rCZ<?>, Comparable<?>> class_() {
      return this.extends_;
   }

   private boolean class_(rlW_2<xd_3> var1) {
      if (this.package_ != null) {
         return this.package_.break_().protected_();
      } else {
         if (this.new_ != null) {
            rlb_3 var2 = var1.class_(this.new_);
            if (var2 != null) {
               for (xd_3 var4 : var2.class_()) {
                  if (var4.protected_()) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private CompletableFuture<Suggestions> break_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.protected_(var1, var2);
   }

   public xc_3 break_() {
      return this.package_;
   }

   public void throws_() throws CommandSyntaxException {
      int var1 = this.implements_.getCursor();
      this.volatile_ = rqO_2.class_(this.implements_);
      xd_3 var2 = rVL.strictfp_.break_(this.volatile_).orElseThrow(() -> {
         this.implements_.setCursor(var1);
         return break_.createWithContext(this.implements_, this.volatile_.toString());
      });
      this.final_ = var2.new_();
      this.package_ = var2.continue_();
   }

   private CompletableFuture<Suggestions> throws_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      String var3 = var1.getRemaining().toLowerCase(Locale.ROOT);
      if (this.new_ != null && !this.new_.break_().isEmpty()) {
         rlb_3 var4 = var2.class_(this.new_);
         if (var4 != null) {
            for (xd_3 var6 : var4.class_()) {
               for (rCZ var8 : var6.new_().protected_()) {
                  if (!this.native_.containsKey(var8.throws_()) && var8.throws_().startsWith(var3)) {
                     var1.suggest(var8.throws_() + "=");
                  }
               }
            }
         }
      }

      return var1.buildFuture();
   }

   public Map<String, String> finally_() {
      return this.native_;
   }

   private CompletableFuture<Suggestions> finally_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         if (!this.package_.break_().new_().protected_().isEmpty()) {
            var1.suggest(String.valueOf('['));
         }

         if (this.package_.break_().protected_()) {
            var1.suggest(String.valueOf('{'));
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> catch_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('='));
      }

      return var1.buildFuture();
   }

   public void catch_() throws CommandSyntaxException {
      this.implements_.skip();
      this.super_ = this::break_;
      this.implements_.skipWhitespace();

      while (this.implements_.canRead() && this.implements_.peek() != ']') {
         this.implements_.skipWhitespace();
         int var1 = this.implements_.getCursor();
         String var2 = this.implements_.readString();
         rCZ var3 = this.final_.class_(var2);
         if (var3 == null) {
            this.implements_.setCursor(var1);
            throw byte_.createWithContext(this.implements_, this.volatile_.toString(), var2);
         }

         if (this.extends_.containsKey(var3)) {
            this.implements_.setCursor(var1);
            throw protected_.createWithContext(this.implements_, this.volatile_.toString(), var2);
         }

         this.implements_.skipWhitespace();
         this.super_ = this::catch_;
         if (!this.implements_.canRead() || this.implements_.peek() != '=') {
            throw case_.createWithContext(this.implements_, this.volatile_.toString(), var2);
         }

         this.implements_.skip();
         this.implements_.skipWhitespace();
         this.super_ = (var1x, var2x) -> class_(var1x, var3).buildFuture();
         int var4 = this.implements_.getCursor();
         this.class_(var3, this.implements_.readString(), var4);
         this.super_ = this::private_;
         this.implements_.skipWhitespace();
         if (this.implements_.canRead()) {
            if (this.implements_.peek() != ',') {
               if (this.implements_.peek() != ']') {
                  throw catch_.createWithContext(this.implements_);
               }
               break;
            }

            this.implements_.skip();
            this.super_ = this::protected_;
         }
      }

      if (this.implements_.canRead()) {
         this.implements_.skip();
      } else {
         throw catch_.createWithContext(this.implements_);
      }
   }

   private CompletableFuture<Suggestions> extends_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      return gR_2.class_(var2.break_(), var1.createOffset(this.continue_).add(var1));
   }

   public void case_() throws CommandSyntaxException {
      if (!this.finally_) {
         throw class_.create();
      } else {
         this.super_ = this::extends_;
         this.implements_.expect('#');
         this.continue_ = this.implements_.getCursor();
         this.new_ = rqO_2.class_(this.implements_);
      }
   }

   private CompletableFuture<Suggestions> case_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty() && this.class_(var2)) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> implements_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         rlb_3 var3 = var2.class_(this.new_);
         if (var3 != null) {
            boolean var4 = false;
            boolean var5 = false;

            for (xd_3 var7 : var3.class_()) {
               var4 |= !var7.new_().protected_().isEmpty();
               var5 |= var7.protected_();
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

      return this.extends_(var1, var2);
   }

   public void implements_() throws CommandSyntaxException {
      this.int_ = new rcH_2(this.implements_).case_();
   }

   private CompletableFuture<Suggestions> protected_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      String var3 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (rCZ var5 : this.package_.public_()) {
         if (!this.extends_.containsKey(var5) && var5.throws_().startsWith(var3)) {
            var1.suggest(var5.throws_() + "=");
         }
      }

      return var1.buildFuture();
   }

   public rqO_2 protected_() {
      return this.new_;
   }

   public void private_() throws CommandSyntaxException {
      this.implements_.skip();
      this.super_ = this::byte_;
      int var1 = -1;
      this.implements_.skipWhitespace();

      while (this.implements_.canRead() && this.implements_.peek() != ']') {
         this.implements_.skipWhitespace();
         int var2 = this.implements_.getCursor();
         String var3 = this.implements_.readString();
         if (this.native_.containsKey(var3)) {
            this.implements_.setCursor(var2);
            throw protected_.createWithContext(this.implements_, this.volatile_.toString(), var3);
         }

         this.implements_.skipWhitespace();
         if (!this.implements_.canRead() || this.implements_.peek() != '=') {
            this.implements_.setCursor(var2);
            throw case_.createWithContext(this.implements_, this.volatile_.toString(), var3);
         }

         this.implements_.skip();
         this.implements_.skipWhitespace();
         this.super_ = (var2x, var3x) -> this.class_(var2x, var3x, var3);
         var1 = this.implements_.getCursor();
         String var4 = this.implements_.readString();
         this.native_.put(var3, var4);
         this.implements_.skipWhitespace();
         if (this.implements_.canRead()) {
            var1 = -1;
            if (this.implements_.peek() != ',') {
               if (this.implements_.peek() != ']') {
                  throw catch_.createWithContext(this.implements_);
               }
               break;
            }

            this.implements_.skip();
            this.super_ = this::throws_;
         }
      }

      if (this.implements_.canRead()) {
         this.implements_.skip();
      } else {
         if (var1 >= 0) {
            this.implements_.setCursor(var1);
         }

         throw catch_.createWithContext(this.implements_);
      }
   }

   private CompletableFuture<Suggestions> private_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      if (var1.getRemaining().isEmpty() && this.extends_.size() < this.package_.public_().size()) {
         var1.suggest(String.valueOf(','));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> native_(SuggestionsBuilder var1, rlW_2<xd_3> var2) {
      if (this.finally_) {
         gR_2.class_(var2.break_(), var1, String.valueOf('#'));
      }

      gR_2.class_(rVL.strictfp_.protected_(), var1);
      return var1.buildFuture();
   }
}
