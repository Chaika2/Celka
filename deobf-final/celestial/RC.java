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
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.invalid"));
   public static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.selector.unknown", var0));
   public static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.selector.not_allowed"));
   public static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("argument.entity.options.unterminated"));
   public static final DynamicCommandExceptionType case_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.entity.options.valueless", var0));
   public static final BiConsumer<rjU_2, List<? extends an_3>> catch_ = (var0, var1) -> {
   };
   public static final BiConsumer<rjU_2, List<? extends an_3>> private_ = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var1x.break_(var0), var2.break_(var0))
      );
   public static final BiConsumer<rjU_2, List<? extends an_3>> implements_ = (var0, var1) -> var1.sort(
         (var1x, var2) -> Doubles.compare(var2.break_(var0), var1x.break_(var0))
      );
   public static final BiConsumer<rjU_2, List<? extends an_3>> finally_ = (var0, var1) -> Collections.shuffle(var1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> extends_ = (var0, var1) -> var0.buildFuture();
   private final StringReader native_;
   private final boolean volatile_;
   private int final_;
   private boolean package_;
   private boolean int_;
   private Xm_1 new_ = Xm_1.throws_;
   private XF continue_ = XF.throws_;
   private Double super_;
   private Double this_;
   private Double else_;
   private Double synchronized_;
   private Double return_;
   private Double public_;
   private XL goto_ = XL.class_;
   private XL while_ = XL.class_;
   private Predicate<an_3> try_ = var0 -> true;
   private BiConsumer<rjU_2, List<? extends an_3>> instanceof_ = catch_;
   private boolean throw_;
   private String interface_;
   private int char_;
   private UUID abstract_;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> long_ = extends_;
   private boolean float_;
   private boolean void_;
   private boolean static_;
   private boolean import_;
   private boolean short_;
   private boolean default_;
   private boolean const_;
   private boolean strictfp_;
   private aI_2<?> boolean_;
   private boolean transient_;
   private boolean for_;
   private boolean double_;
   private boolean switch_;

   public boolean char_() {
      return this.for_;
   }

   private CompletableFuture<Suggestions> byte_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var3 = var1.createOffset(this.char_);
      var2.accept(var3);
      return var1.add(var3).buildFuture();
   }

   public void byte_(double var1) {
      this.else_ = var1;
   }

   protected void byte_() throws CommandSyntaxException {
      if (this.native_.canRead()) {
         this.long_ = this::byte_;
      }

      int var1 = this.native_.getCursor();
      String var2 = this.native_.readString();

      try {
         this.abstract_ = UUID.fromString(var2);
         this.package_ = true;
      } catch (IllegalArgumentException var4) {
         if (var2.isEmpty() || var2.length() > 16) {
            this.native_.setCursor(var1);
            throw class_.createWithContext(this.native_);
         }

         this.package_ = false;
         this.interface_ = var2;
      }

      this.final_ = 1;
   }

   public void byte_(boolean var1) {
      this.void_ = var1;
   }

   public Double int_() {
      return this.synchronized_;
   }

   private void long_() {
      if (this.goto_ != XL.class_) {
         this.try_ = this.try_.and(this.class_(this.goto_, var0 -> (double)((Float)var0.throws_[16]).floatValue()));
      }

      if (this.while_ != XL.class_) {
         this.try_ = this.try_.and(this.class_(this.while_, var0 -> (double)((Float)var0.throws_[15]).floatValue()));
      }

      if (!this.continue_.byte_()) {
         this.try_ = this.try_.and(var1 -> !(var1 instanceof rhN_2) ? false : this.continue_.byte_((Integer)((rhN_2)var1).implements_[19]));
      }
   }

   public RC(StringReader var1) {
      this(var1, true);
   }

   public RC(StringReader var1, boolean var2) {
      this.native_ = var1;
      this.volatile_ = var2;
   }

   public boolean this_() {
      return this.throw_;
   }

   public boolean interface_() {
      return this.transient_;
   }

   public void class_(aI_2<?> var1) {
      this.boolean_ = var1;
   }

   private Predicate<an_3> class_(XL var1, ToDoubleFunction<an_3> var2) {
      double var3 = (double)rfU_2.catch_(var1.class_() == null ? 0.0F : var1.class_());
      double var5 = (double)rfU_2.catch_(var1.break_() == null ? 359.0F : var1.break_());
      return var5x -> {
         double var6 = rfU_2.case_(var2.applyAsDouble(var5x));
         return var3 > var5 ? var6 >= var3 || var6 <= var5 : var6 >= var3 && var6 <= var5;
      };
   }

   public void class_(Predicate<an_3> var1) {
      this.try_ = this.try_.and(var1);
   }

   private rfl_3 class_(double var1, double var3, double var5) {
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

   public void class_(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> var1) {
      this.long_ = var1;
   }

   public CompletableFuture<Suggestions> class_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      return this.long_.apply(var1.createOffset(this.native_.getCursor()), var2);
   }

   private static void class_(SuggestionsBuilder var0) {
      var0.suggest("@p", new rgn_3("argument.entity.selector.nearestPlayer"));
      var0.suggest("@a", new rgn_3("argument.entity.selector.allPlayers"));
      var0.suggest("@r", new rgn_3("argument.entity.selector.randomPlayer"));
      var0.suggest("@s", new rgn_3("argument.entity.selector.self"));
      var0.suggest("@e", new rgn_3("argument.entity.selector.allEntities"));
   }

   public void class_(BiConsumer<rjU_2, List<? extends an_3>> var1) {
      this.instanceof_ = var1;
   }

   public void class_(boolean var1) {
      this.package_ = var1;
   }

   public void class_(int var1) {
      this.final_ = var1;
   }

   public void class_(XL var1) {
      this.goto_ = var1;
   }

   public Rn_1 class_() {
      rfl_3 var1;
      if (this.synchronized_ == null && this.return_ == null && this.public_ == null) {
         if (this.new_.break_() != null) {
            float var2 = this.new_.break_();
            var1 = new rfl_3((double)(-var2), (double)(-var2), (double)(-var2), (double)(var2 + 1.0F), (double)(var2 + 1.0F), (double)(var2 + 1.0F));
         } else {
            var1 = null;
         }
      } else {
         var1 = this.class_(
            this.synchronized_ == null ? 0.0 : this.synchronized_, this.return_ == null ? 0.0 : this.return_, this.public_ == null ? 0.0 : this.public_
         );
      }

      Function var3;
      if (this.super_ == null && this.this_ == null && this.else_ == null) {
         var3 = var0 -> var0;
      } else {
         var3 = var1x -> new rjU_2(
               this.super_ == null ? var1x.break_ : this.super_,
               this.this_ == null ? var1x.byte_ : this.this_,
               this.else_ == null ? var1x.protected_ : this.else_
            );
      }

      return new Rn_1(
         this.final_,
         this.package_,
         this.int_,
         this.try_,
         this.new_,
         var3,
         var1,
         this.instanceof_,
         this.throw_,
         this.interface_,
         this.abstract_,
         this.boolean_,
         this.switch_
      );
   }

   public void class_(XF var1) {
      this.continue_ = var1;
   }

   public void class_(Xm_1 var1) {
      this.new_ = var1;
   }

   public void class_(double var1) {
      this.super_ = var1;
   }

   public void break_(boolean var1) {
      this.float_ = var1;
   }

   protected void break_() throws CommandSyntaxException {
      this.switch_ = true;
      this.long_ = this::protected_;
      if (!this.native_.canRead()) {
         throw protected_.createWithContext(this.native_);
      } else {
         int var1 = this.native_.getCursor();
         char var2 = this.native_.read();
         if (var2 == 'p') {
            this.final_ = 1;
            this.package_ = false;
            this.instanceof_ = private_;
            this.class_(aI_2.rM);
         } else if (var2 == 'a') {
            this.final_ = Integer.MAX_VALUE;
            this.package_ = false;
            this.instanceof_ = catch_;
            this.class_(aI_2.rM);
         } else if (var2 == 'r') {
            this.final_ = 1;
            this.package_ = false;
            this.instanceof_ = finally_;
            this.class_(aI_2.rM);
         } else if (var2 == 's') {
            this.final_ = 1;
            this.package_ = true;
            this.throw_ = true;
         } else {
            if (var2 != 'e') {
               this.native_.setCursor(var1);
               throw break_.createWithContext(this.native_, "@" + var2);
            }

            this.final_ = Integer.MAX_VALUE;
            this.package_ = true;
            this.instanceof_ = catch_;
            this.try_ = an_3::BM;
         }

         this.long_ = this::throws_;
         if (this.native_.canRead() && this.native_.peek() == '[') {
            this.native_.skip();
            this.long_ = this::case_;
            this.protected_();
         }
      }
   }

   public void break_(double var1) {
      this.this_ = var1;
   }

   public void break_(XL var1) {
      this.while_ = var1;
   }

   private CompletableFuture<Suggestions> break_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var2.accept(var1);
      if (this.volatile_) {
         class_(var1);
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> throws_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf('['));
      return var1.buildFuture();
   }

   public void throws_(double var1) {
      this.return_ = var1;
   }

   public void throws_(boolean var1) {
      this.import_ = var1;
   }

   public boolean throws_() {
      this.native_.skipWhitespace();
      if (this.native_.canRead() && this.native_.peek() == '!') {
         this.native_.skip();
         this.native_.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public XF finally_() {
      return this.continue_;
   }

   public void finally_(boolean var1) {
      this.for_ = var1;
   }

   public StringReader catch_() {
      return this.native_;
   }

   public void catch_(boolean var1) {
      this.default_ = var1;
   }

   private CompletableFuture<Suggestions> catch_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      RF.class_(this, var1);
      return var1.buildFuture();
   }

   public XL extends_() {
      return this.goto_;
   }

   public void extends_(boolean var1) {
      this.double_ = var1;
   }

   public boolean goto_() {
      return this.short_;
   }

   public boolean case_() {
      this.native_.skipWhitespace();
      if (this.native_.canRead() && this.native_.peek() == '#') {
         this.native_.skip();
         this.native_.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public void case_(double var1) {
      this.public_ = var1;
   }

   public void case_(boolean var1) {
      this.short_ = var1;
   }

   private CompletableFuture<Suggestions> case_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(']'));
      RF.class_(this, var1);
      return var1.buildFuture();
   }

   public Double continue_() {
      return this.public_;
   }

   public boolean else_() {
      return this.float_;
   }

   public Xm_1 implements_() {
      return this.new_;
   }

   public void implements_(boolean var1) {
      this.strictfp_ = var1;
   }

   public void instanceof_() {
      this.transient_ = true;
   }

   public Double new_() {
      return this.return_;
   }

   public Double package_() {
      return this.else_;
   }

   public boolean return_() {
      return this.static_;
   }

   public Rn_1 super_() throws CommandSyntaxException {
      this.char_ = this.native_.getCursor();
      this.long_ = this::break_;
      if (this.native_.canRead() && this.native_.peek() == '@') {
         if (!this.volatile_) {
            throw byte_.createWithContext(this.native_);
         }

         this.native_.skip();
         this.break_();
      } else {
         this.byte_();
      }

      this.long_();
      return this.class_();
   }

   public boolean throw_() {
      return this.boolean_ != null;
   }

   public boolean try_() {
      return this.const_;
   }

   public boolean while_() {
      return this.default_;
   }

   public boolean public_() {
      return this.import_;
   }

   public void protected_(boolean var1) {
      this.static_ = var1;
   }

   protected void protected_() throws CommandSyntaxException {
      this.long_ = this::catch_;
      this.native_.skipWhitespace();

      while (this.native_.canRead() && this.native_.peek() != ']') {
         this.native_.skipWhitespace();
         int var1 = this.native_.getCursor();
         String var2 = this.native_.readString();
         RL var3 = RF.class_(this, var2, var1);
         this.native_.skipWhitespace();
         if (!this.native_.canRead() || this.native_.peek() != '=') {
            this.native_.setCursor(var1);
            throw case_.createWithContext(this.native_, var2);
         }

         this.native_.skip();
         this.native_.skipWhitespace();
         this.long_ = extends_;
         var3.handle(this);
         this.native_.skipWhitespace();
         this.long_ = this::private_;
         if (this.native_.canRead()) {
            if (this.native_.peek() != ',') {
               if (this.native_.peek() != ']') {
                  throw throws_.createWithContext(this.native_);
               }
               break;
            }

            this.native_.skip();
            this.long_ = this::catch_;
         }
      }

      if (this.native_.canRead()) {
         this.native_.skip();
         this.long_ = extends_;
      } else {
         throw throws_.createWithContext(this.native_);
      }
   }

   public void protected_(double var1) {
      this.synchronized_ = var1;
   }

   private CompletableFuture<Suggestions> protected_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder var3 = var1.createOffset(var1.getStart() - 1);
      class_(var3);
      var1.add(var3);
      return var1.buildFuture();
   }

   public void private_(boolean var1) {
      this.const_ = var1;
   }

   private CompletableFuture<Suggestions> private_(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(','));
      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   public void private_() {
      this.int_ = true;
   }

   public boolean abstract_() {
      return this.double_;
   }

   public Double final_() {
      return this.this_;
   }

   public Double volatile_() {
      return this.super_;
   }

   public boolean synchronized_() {
      return this.void_;
   }

   public XL native_() {
      return this.while_;
   }
}
