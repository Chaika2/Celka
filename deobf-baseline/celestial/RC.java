package celestial;

import com.google.common.primitives.Doubles;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class RC {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.entity.invalid"));
   public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.selector.unknown", var0));
   public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("argument.entity.selector.not_allowed"));
   public static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.unterminated"));
   public static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.valueless", var0));
   public static final BiConsumer<rjU_2, List<? extends an_3>> id_catch = (var0, var1) -> {
   };
   public static final BiConsumer<rjU_2, List<? extends an_3>> id_private = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var1x.id_break(var0), var2.id_break(var0))
      );
   public static final BiConsumer<rjU_2, List<? extends an_3>> id_implements = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var2.id_break(var0), var1x.id_break(var0))
      );
   public static final BiConsumer<rjU_2, List<? extends an_3>> id_finally = (var0, var1) -> Collections.shuffle(var1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> id_extends = (var0, var1) -> var0.buildFuture();
   private final StringReader id_native;
   private final boolean id_volatile;
   private int id_final;
   private boolean id_package;
   private boolean id_int;
   private Xm_1 id_new = Xm_1.id_throws;
   private XF id_continue = XF.id_throws;
   private Double id_super;
   private Double id_this;
   private Double id_else;
   private Double id_synchronized;
   private Double id_return;
   private Double id_public;
   private XL id_goto = XL.id_class;
   private XL id_while = XL.id_class;
   private Predicate<an_3> id_try = var0 -> true;
   private BiConsumer<rjU_2, List<? extends an_3>> id_instanceof = id_catch;
   private boolean id_throw;
   private String id_interface;
   private int id_char;
   private UUID id_abstract;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> id_long = id_extends;
   private boolean id_float;
   private boolean id_void;
   private boolean id_static;
   private boolean id_import;
   private boolean id_short;
   private boolean id_default;
   private boolean id_const;
   private boolean id_strictfp;
   private aI_2<?> id_boolean;
   private boolean id_transient;
   private boolean id_for;
   private boolean id_double;
   private boolean id_switch;

   public boolean id_char() {
      return this.id_for;
   }

   private CompletableFuture<Suggestions> id_byte(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var3 = var1.createOffset(this.id_char);
      var2.accept(var3);
      return var1.add(var3).buildFuture();
   }

   public void id_byte(double var1) {
      this.id_else = var1;
   }

   protected void id_byte() throws CommandSyntaxException {
      if (this.id_native.canRead()) {
         this.id_long = this::id_byte;
      }

      int var1 = this.id_native.getCursor();
      String var2 = this.id_native.readString();

      try {
         this.id_abstract = UUID.fromString(var2);
         this.id_package = true;
      } catch (IllegalArgumentException var4) {
         if (var2.isEmpty() || var2.length() > 16) {
            this.id_native.setCursor(var1);
            throw id_class.createWithContext(this.id_native);
         }

         this.id_package = false;
         this.id_interface = var2;
      }

      this.id_final = 1;
   }

   public void id_byte(boolean var1) {
      this.id_void = var1;
   }

   public Double id_int() {
      return this.id_synchronized;
   }

   private void id_long() {
      if (this.id_goto != XL.id_class) {
         this.id_try = this.id_try.and(this.id_class(this.id_goto, var0 -> (double)((Float)var0.id_throws[16]).floatValue()));
      }

      if (this.id_while != XL.id_class) {
         this.id_try = this.id_try.and(this.id_class(this.id_while, var0 -> (double)((Float)var0.id_throws[15]).floatValue()));
      }

      if (!this.id_continue.id_byte()) {
         this.id_try = this.id_try.and(var1 -> !(var1 instanceof rhN_2) ? false : this.id_continue.id_byte((Integer)((rhN_2)var1).id_implements[19]));
      }
   }

   public RC(StringReader var1) {
      this(var1, true);
   }

   public RC(StringReader var1, boolean var2) {
      this.id_native = var1;
      this.id_volatile = var2;
   }

   public boolean id_this() {
      return this.id_throw;
   }

   public boolean id_interface() {
      return this.id_transient;
   }

   public void id_class(aI_2<?> var1) {
      this.id_boolean = var1;
   }

   private Predicate<an_3> id_class(XL var1, ToDoubleFunction<an_3> var2) {
      double var3 = (double)rfU_2.id_catch(var1.id_class() == null ? 0.0F : var1.id_class());
      double var5 = (double)rfU_2.id_catch(var1.id_break() == null ? 359.0F : var1.id_break());
      return var5x -> {
         double var6 = rfU_2.id_case(var2.applyAsDouble(var5x));
         return var3 > var5 ? var6 >= var3 || var6 <= var5 : var6 >= var3 && var6 <= var5;
      };
   }

   public void id_class(Predicate<an_3> var1) {
      this.id_try = this.id_try.and(var1);
   }

   private rfl_3 id_class(double var1, double var3, double var5) {
      boolean var7 = var1 < 0.0;
      boolean var8 = var3 < 0.0;
      boolean var9 = var5 < 0.0;
      double var10 = var7 ? var1 : 0.0;
      double var12 = var8 ? var3 : 0.0;
      double var14 = var9 ? var5 : 0.0;
      double var16 = (var7 ? 0.0 : var1) + 1.0;
      double var18 = (var8 ? 0.0 : var3) + 1.0;
      double var20 = (var9 ? 0.0 : var5) + 1.0;
      return new rfl_3(var10, var12, var14, var16, var18, var20);
   }

   public void id_class(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> var1) {
      this.id_long = var1;
   }

   public CompletableFuture<Suggestions> id_class(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      return this.id_long.apply(var1.createOffset(this.id_native.getCursor()), var2);
   }

   private static void id_class(SuggestionsBuilder var0) {
      var0.suggest("@p", new rgn_3("argument.entity.selector.nearestPlayer"));
      var0.suggest("@a", new rgn_3("argument.entity.selector.allPlayers"));
      var0.suggest("@r", new rgn_3("argument.entity.selector.randomPlayer"));
      var0.suggest("@s", new rgn_3("argument.entity.selector.self"));
      var0.suggest("@e", new rgn_3("argument.entity.selector.allEntities"));
   }

   public void id_class(BiConsumer<rjU_2, List<? extends an_3>> var1) {
      this.id_instanceof = var1;
   }

   public void id_class(boolean var1) {
      this.id_package = var1;
   }

   public void id_class(int var1) {
      this.id_final = var1;
   }

   public void id_class(XL var1) {
      this.id_goto = var1;
   }

   public Rn_1 id_class() {
      rfl_3 var1;
      if (this.id_synchronized == null && this.id_return == null && this.id_public == null) {
         if (this.id_new.id_break() != null) {
            float var2 = this.id_new.id_break();
            var1 = new rfl_3((double)(-var2), (double)(-var2), (double)(-var2), (double)(var2 + 1.0F), (double)(var2 + 1.0F), (double)(var2 + 1.0F));
         } else {
            var1 = null;
         }
      } else {
         var1 = this.id_class(
            this.id_synchronized == null ? 0.0 : this.id_synchronized,
            this.id_return == null ? 0.0 : this.id_return,
            this.id_public == null ? 0.0 : this.id_public
         );
      }

      Function var3;
      if (this.id_super == null && this.id_this == null && this.id_else == null) {
         var3 = var0 -> var0;
      } else {
         var3 = var1x -> new rjU_2(
               this.id_super == null ? var1x.id_break : this.id_super,
               this.id_this == null ? var1x.id_byte : this.id_this,
               this.id_else == null ? var1x.id_protected : this.id_else
            );
      }

      return new Rn_1(
         this.id_final,
         this.id_package,
         this.id_int,
         this.id_try,
         this.id_new,
         var3,
         var1,
         this.id_instanceof,
         this.id_throw,
         this.id_interface,
         this.id_abstract,
         this.id_boolean,
         this.id_switch
      );
   }

   public void id_class(XF var1) {
      this.id_continue = var1;
   }

   public void id_class(Xm_1 var1) {
      this.id_new = var1;
   }

   public void id_class(double var1) {
      this.id_super = var1;
   }

   public void id_break(boolean var1) {
      this.id_float = var1;
   }

   protected void id_break() throws CommandSyntaxException {
      this.id_switch = true;
      this.id_long = this::id_protected;
      if (!this.id_native.canRead()) {
         throw id_protected.createWithContext(this.id_native);
      } else {
         int var1 = this.id_native.getCursor();
         char var2 = this.id_native.read();
         if (var2 == 'p') {
            this.id_final = 1;
            this.id_package = false;
            this.id_instanceof = id_private;
            this.id_class(aI_2.rM);
         } else if (var2 == 'a') {
            this.id_final = Integer.MAX_VALUE;
            this.id_package = false;
            this.id_instanceof = id_catch;
            this.id_class(aI_2.rM);
         } else if (var2 == 'r') {
            this.id_final = 1;
            this.id_package = false;
            this.id_instanceof = id_finally;
            this.id_class(aI_2.rM);
         } else if (var2 == 's') {
            this.id_final = 1;
            this.id_package = true;
            this.id_throw = true;
         } else {
            if (var2 != 'e') {
               this.id_native.setCursor(var1);
               throw id_break.createWithContext(this.id_native, "@" + var2);
            }

            this.id_final = Integer.MAX_VALUE;
            this.id_package = true;
            this.id_instanceof = id_catch;
            this.id_try = an_3::BM;
         }

         this.id_long = this::id_throws;
         if (this.id_native.canRead() && this.id_native.peek() == '[') {
            this.id_native.skip();
            this.id_long = this::id_case;
            this.id_protected();
         }
      }
   }

   public void id_break(double var1) {
      this.id_this = var1;
   }

   public void id_break(XL var1) {
      this.id_while = var1;
   }

   private CompletableFuture<Suggestions> id_break(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var2.accept(var1);
      if (this.id_volatile) {
         id_class(var1);
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> id_throws(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf('['));
      return var1.buildFuture();
   }

   public void id_throws(double var1) {
      this.id_return = var1;
   }

   public void id_throws(boolean var1) {
      this.id_import = var1;
   }

   public boolean id_throws() {
      this.id_native.skipWhitespace();
      if (this.id_native.canRead() && this.id_native.peek() == '!') {
         this.id_native.skip();
         this.id_native.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public XF id_finally() {
      return this.id_continue;
   }

   public void id_finally(boolean var1) {
      this.id_for = var1;
   }

   public StringReader id_catch() {
      return this.id_native;
   }

   public void id_catch(boolean var1) {
      this.id_default = var1;
   }

   private CompletableFuture<Suggestions> id_catch(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      RF.id_class(this, var1);
      return var1.buildFuture();
   }

   public XL id_extends() {
      return this.id_goto;
   }

   public void id_extends(boolean var1) {
      this.id_double = var1;
   }

   public boolean id_goto() {
      return this.id_short;
   }

   public boolean id_case() {
      this.id_native.skipWhitespace();
      if (this.id_native.canRead() && this.id_native.peek() == '#') {
         this.id_native.skip();
         this.id_native.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public void id_case(double var1) {
      this.id_public = var1;
   }

   public void id_case(boolean var1) {
      this.id_short = var1;
   }

   private CompletableFuture<Suggestions> id_case(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(']'));
      RF.id_class(this, var1);
      return var1.buildFuture();
   }

   public Double id_continue() {
      return this.id_public;
   }

   public boolean id_else() {
      return this.id_float;
   }

   public Xm_1 id_implements() {
      return this.id_new;
   }

   public void id_implements(boolean var1) {
      this.id_strictfp = var1;
   }

   public void id_instanceof() {
      this.id_transient = true;
   }

   public Double id_new() {
      return this.id_return;
   }

   public Double id_package() {
      return this.id_else;
   }

   public boolean id_return() {
      return this.id_static;
   }

   public Rn_1 id_super() throws CommandSyntaxException {
      this.id_char = this.id_native.getCursor();
      this.id_long = this::id_break;
      if (this.id_native.canRead() && this.id_native.peek() == '@') {
         if (!this.id_volatile) {
            throw id_byte.createWithContext(this.id_native);
         }

         this.id_native.skip();
         this.id_break();
      } else {
         this.id_byte();
      }

      this.id_long();
      return this.id_class();
   }

   public boolean id_throw() {
      return this.id_boolean != null;
   }

   public boolean id_try() {
      return this.id_const;
   }

   public boolean id_while() {
      return this.id_default;
   }

   public boolean id_public() {
      return this.id_import;
   }

   public void id_protected(boolean var1) {
      this.id_static = var1;
   }

   protected void id_protected() throws CommandSyntaxException {
      this.id_long = this::id_catch;
      this.id_native.skipWhitespace();

      while (this.id_native.canRead() && this.id_native.peek() != ']') {
         this.id_native.skipWhitespace();
         int var1 = this.id_native.getCursor();
         String var2 = this.id_native.readString();
         RL var3 = RF.id_class(this, var2, var1);
         this.id_native.skipWhitespace();
         if (!this.id_native.canRead() || this.id_native.peek() != '=') {
            this.id_native.setCursor(var1);
            throw id_case.createWithContext(this.id_native, var2);
         }

         this.id_native.skip();
         this.id_native.skipWhitespace();
         this.id_long = id_extends;
         var3.handle(this);
         this.id_native.skipWhitespace();
         this.id_long = this::id_private;
         if (this.id_native.canRead()) {
            if (this.id_native.peek() != ',') {
               if (this.id_native.peek() != ']') {
                  throw id_throws.createWithContext(this.id_native);
               }
               break;
            }

            this.id_native.skip();
            this.id_long = this::id_catch;
         }
      }

      if (this.id_native.canRead()) {
         this.id_native.skip();
         this.id_long = id_extends;
      } else {
         throw id_throws.createWithContext(this.id_native);
      }
   }

   public void id_protected(double var1) {
      this.id_synchronized = var1;
   }

   private CompletableFuture<Suggestions> id_protected(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var3 = var1.createOffset(var1.getStart() - 1);
      id_class(var3);
      var1.add(var3);
      return var1.buildFuture();
   }

   public void id_private(boolean var1) {
      this.id_const = var1;
   }

   private CompletableFuture<Suggestions> id_private(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(','));
      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   public void id_private() {
      this.id_int = true;
   }

   public boolean id_abstract() {
      return this.id_double;
   }

   public Double id_final() {
      return this.id_this;
   }

   public Double id_volatile() {
      return this.id_super;
   }

   public boolean id_synchronized() {
      return this.id_void;
   }

   public XL id_native() {
      return this.id_while;
   }
}
