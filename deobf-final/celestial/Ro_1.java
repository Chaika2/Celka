package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class Ro_1 {
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.item.tag.disallowed"));
   public static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.item.id.invalid", var0));
   private static final BiFunction<SuggestionsBuilder, rlW_2<rdb_3>, CompletableFuture<Suggestions>> byte_ = (var0, var1) -> var0.buildFuture();
   private final StringReader protected_;
   private final boolean throws_;
   private final Map<rCZ<?>, Comparable<?>> case_ = Maps.newHashMap();
   private rdb_3 catch_;
   private rcd_3 private_;
   private rqO_2 implements_ = new rqO_2("");
   private int finally_;
   private BiFunction<SuggestionsBuilder, rlW_2<rdb_3>, CompletableFuture<Suggestions>> extends_ = byte_;

   public rqO_2 byte_() {
      return this.implements_;
   }

   private CompletableFuture<Suggestions> byte_(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      return gR_2.class_(var2.break_(), var1.createOffset(this.finally_));
   }

   public Ro_1(StringReader var1, boolean var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public CompletableFuture<Suggestions> class_(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      return this.extends_.apply(var1.createOffset(this.protected_.getCursor()), var2);
   }

   public rdb_3 class_() {
      return this.catch_;
   }

   private CompletableFuture<Suggestions> break_(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   public rcd_3 break_() {
      return this.private_;
   }

   public void throws_() throws CommandSyntaxException {
      if (!this.throws_) {
         throw class_.create();
      } else {
         this.extends_ = this::byte_;
         this.protected_.expect('#');
         this.finally_ = this.protected_.getCursor();
         this.implements_ = rqO_2.class_(this.protected_);
      }
   }

   public Ro_1 catch_() throws CommandSyntaxException {
      this.extends_ = this::protected_;
      if (this.protected_.canRead() && this.protected_.peek() == '#') {
         this.throws_();
      } else {
         this.protected_();
         this.extends_ = this::break_;
      }

      if (this.protected_.canRead() && this.protected_.peek() == '{') {
         this.extends_ = byte_;
         this.case_();
      }

      return this;
   }

   public void case_() throws CommandSyntaxException {
      this.private_ = new rcH_2(this.protected_).case_();
   }

   public void protected_() throws CommandSyntaxException {
      int var1 = this.protected_.getCursor();
      rqO_2 var2 = rqO_2.class_(this.protected_);
      this.catch_ = rVL.for_.break_(var2).orElseThrow(() -> {
         this.protected_.setCursor(var1);
         return break_.createWithContext(this.protected_, var2.toString());
      });
   }

   private CompletableFuture<Suggestions> protected_(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      if (this.throws_) {
         gR_2.class_(var2.break_(), var1, String.valueOf('#'));
      }

      return gR_2.class_(rVL.for_.protected_(), var1);
   }
}
