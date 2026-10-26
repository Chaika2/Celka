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
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.item.tag.disallowed"));
   public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.item.id.invalid", var0));
   private static final BiFunction<SuggestionsBuilder, rlW_2<rdb_3>, CompletableFuture<Suggestions>> id_byte = (var0, var1) -> var0.buildFuture();
   private final StringReader id_protected;
   private final boolean id_throws;
   private final Map<rCZ<?>, Comparable<?>> id_case = Maps.newHashMap();
   private rdb_3 id_catch;
   private rcd_3 id_private;
   private rqO_2 id_implements = new rqO_2("");
   private int id_finally;
   private BiFunction<SuggestionsBuilder, rlW_2<rdb_3>, CompletableFuture<Suggestions>> id_extends = id_byte;

   public rqO_2 id_byte() {
      return this.id_implements;
   }

   private CompletableFuture<Suggestions> id_byte(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      return gR_2.id_class(var2.id_break(), var1.createOffset(this.id_finally));
   }

   public Ro_1(StringReader var1, boolean var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public CompletableFuture<Suggestions> id_class(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      return this.id_extends.apply(var1.createOffset(this.id_protected.getCursor()), var2);
   }

   public rdb_3 id_class() {
      return this.id_catch;
   }

   private CompletableFuture<Suggestions> id_break(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   public rcd_3 id_break() {
      return this.id_private;
   }

   public void id_throws() throws CommandSyntaxException {
      if (!this.id_throws) {
         throw id_class.create();
      } else {
         this.id_extends = this::id_byte;
         this.id_protected.expect('#');
         this.id_finally = this.id_protected.getCursor();
         this.id_implements = rqO_2.id_class(this.id_protected);
      }
   }

   public Ro_1 id_catch() throws CommandSyntaxException {
      this.id_extends = this::id_protected;
      if (this.id_protected.canRead() && this.id_protected.peek() == '#') {
         this.id_throws();
      } else {
         this.id_protected();
         this.id_extends = this::id_break;
      }

      if (this.id_protected.canRead() && this.id_protected.peek() == '{') {
         this.id_extends = id_byte;
         this.id_case();
      }

      return this;
   }

   public void id_case() throws CommandSyntaxException {
      this.id_private = new rcH_2(this.id_protected).id_case();
   }

   public void id_protected() throws CommandSyntaxException {
      int var1 = this.id_protected.getCursor();
      rqO_2 var2 = rqO_2.id_class(this.id_protected);
      this.id_catch = rVL.id_for.id_break(var2).orElseThrow(() -> {
         this.id_protected.setCursor(var1);
         return id_break.createWithContext(this.id_protected, var2.toString());
      });
   }

   private CompletableFuture<Suggestions> id_protected(SuggestionsBuilder var1, rlW_2<rdb_3> var2) {
      if (this.id_throws) {
         gR_2.id_class(var2.id_break(), var1, String.valueOf('#'));
      }

      return gR_2.id_class(rVL.id_for.id_protected(), var1);
   }
}
