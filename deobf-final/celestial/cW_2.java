package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cW_2 {
   private static final Pattern class_ = Pattern.compile("(\\s+)");
   private static final rgc_3 break_ = rgc_3.class_.class_(rgF_2.RED);
   private static final rgc_3 byte_ = rgc_3.class_.class_(rgF_2.GRAY);
   private static final List<rgc_3> protected_ = Stream.of(rgF_2.AQUA, rgF_2.YELLOW, rgF_2.GREEN, rgF_2.LIGHT_PURPLE, rgF_2.GOLD)
      .map(rgc_3.class_::class_)
      .collect(ImmutableList.toImmutableList());
   final QY throws_;
   final vm_3 case_;
   final Lu_1 catch_;
   final cm_3 private_;
   private final boolean implements_;
   private final boolean finally_;
   final int extends_;
   final int native_;
   final boolean volatile_;
   final int final_;
   private final List<cz_3> package_ = Lists.newArrayList();
   private int int_;
   private int new_;
   private ParseResults<gR_2> continue_;
   private CompletableFuture<Suggestions> super_;
   cQ_2 this_;
   private boolean else_;
   boolean synchronized_;

   public Lu_1 byte_() {
      return this.catch_;
   }

   public cW_2(QY var1, vm_3 var2, Lu_1 var3, cm_3 var4, boolean var5, boolean var6, int var7, int var8, boolean var9, int var10) {
      this.throws_ = var1;
      this.case_ = var2;
      this.catch_ = var3;
      this.private_ = var4;
      this.implements_ = var5;
      this.finally_ = var6;
      this.extends_ = var7;
      this.native_ = var8;
      this.volatile_ = var9;
      this.final_ = var10;
      var3.class_(this::class_);
   }

   public void class_(boolean var1) {
      this.else_ = var1;
      if (!var1) {
         this.this_ = null;
      }
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      if (this.this_ != null) {
         this.this_.class_(var1, var2, var3);
      } else {
         int var4 = 0;

         for (cz_3 var6 : this.package_) {
            rpl_3 var7 = var6.class_();
            int var8 = this.volatile_ ? this.case_.int_ - 14 - 13 - 12 * var4 : 72 + 12 * var4;
            ch_3.class_(var1, this.int_, var8, this.int_ + this.private_.class_(var7) + 4, var8 + 12, this.final_);
            this.private_.class_(var1, var7, (float)this.int_ + 2.0F, (float)(var8 + 2), -1);
            var4++;
         }
      }
   }

   private static rpl_3 class_(ParseResults<gR_2> var0, String var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = 0;
      int var5 = -1;
      CommandContextBuilder var6 = var0.getContext().getLastChild();

      for (ParsedArgument var8 : var6.getArguments().values()) {
         if (++var5 >= protected_.size()) {
            var5 = 0;
         }

         int var9 = Math.max(var8.getRange().getStart() - var2, 0);
         if (var9 >= var1.length()) {
            break;
         }

         int var10 = Math.min(var8.getRange().getEnd() - var2, var1.length());
         if (var10 > 0) {
            var3.add(rpl_3.class_(var1.substring(var4, var9), byte_));
            var3.add(rpl_3.class_(var1.substring(var9, var10), protected_.get(var5)));
            var4 = var10;
         }
      }

      if (var0.getReader().canRead()) {
         int var11 = Math.max(var0.getReader().getCursor() - var2, 0);
         if (var11 < var1.length()) {
            int var12 = Math.min(var11 + var0.getReader().getRemainingLength(), var1.length());
            var3.add(rpl_3.class_(var1.substring(var4, var11), byte_));
            var3.add(rpl_3.class_(var1.substring(var11, var12), break_));
            var4 = var12;
         }
      }

      var3.add(rpl_3.class_(var1.substring(var4), byte_));
      return rpl_3.class_(var3);
   }

   public boolean class_(int var1, int var2, int var3) {
      if (this.this_ != null && this.this_.break_(var1, var2, var3)) {
         return true;
      } else if (this.case_.catch_() == this.catch_ && var1 == 258) {
         this.break_(true);
         return true;
      } else {
         return false;
      }
   }

   private rpl_3 class_(String var1, int var2) {
      return this.continue_ != null ? class_(this.continue_, var1, var2) : rpl_3.class_(var1, rgc_3.class_);
   }

   @Nullable
   static String class_(String var0, String var1) {
      return var1.startsWith(var0) ? var1.substring(var0.length()) : null;
   }

   public void class_(ParseResults<gR_2> var1) {
      this.continue_ = var1;
   }

   public void class_(cQ_2 var1) {
      this.this_ = var1;
   }

   public void class_(CompletableFuture<Suggestions> var1) {
      this.super_ = var1;
   }

   public void class_() {
      if (((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(this)) {
         this.package_.clear();
         if (rrLE.class_(this).byte_()) {
            this.catch_.byte_(null);
            this.super_ = null;
            this.this_ = null;
            this.continue_ = null;
         } else {
            String var1 = this.catch_.private_();
            if (this.continue_ != null && !this.continue_.getReader().getString().equals(var1)) {
               this.continue_ = null;
            }

            if (!this.synchronized_) {
               this.catch_.byte_(null);
               this.this_ = null;
            }

            StringReader var2 = new StringReader(var1);
            boolean var3 = var2.canRead() && var2.peek() == '/';
            if (var3) {
               var2.skip();
            }

            boolean var4 = this.implements_ || var3;
            int var5 = this.catch_.final_();
            if (!this.synchronized_) {
               this.catch_.byte_(null);
               this.this_ = null;
            }

            if (var4) {
               CommandDispatcher var6 = ((Aq_1)((cb_3)this.throws_.class_[57]).break_[0]).implements_();
               if (this.continue_ == null) {
                  this.continue_ = var6.parse(var2, ((Aq_1)((cb_3)this.throws_.class_[57]).break_[0]).break_());
               }

               int var7 = this.finally_ ? var2.getCursor() : 1;
               if (var5 >= var7 && (this.this_ == null || !this.synchronized_)) {
                  this.super_ = var6.getCompletionSuggestions(this.continue_, var5);
                  this.super_.thenRun(() -> {
                     if (this.super_.isDone()) {
                        this.catch_();
                     }
                  });
               }
            } else {
               String var9 = var1.substring(0, var5);
               int var10 = class_(var9);
               Collection var8 = ((Aq_1)((cb_3)this.throws_.class_[57]).break_[0]).break_().class_();
               this.super_ = gR_2.break_(var8, new SuggestionsBuilder(var9, var10));
            }
         }
      }
   }

   private List<Suggestion> class_(Suggestions var1) {
      String var2 = this.catch_.private_().substring(0, this.catch_.final_());
      int var3 = class_(var2);
      String var4 = var2.substring(var3).toLowerCase(Locale.ROOT);
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();

      for (Suggestion var8 : var1.getList()) {
         if (!var8.getText().startsWith(var4) && !var8.getText().startsWith("minecraft:" + var4)) {
            var6.add(var8);
         } else {
            var5.add(var8);
         }
      }

      var5.addAll(var6);
      return var5;
   }

   public boolean class_(double var1, double var3, int var5) {
      return this.this_ != null && this.this_.class_((int)var1, (int)var3, var5);
   }

   public boolean class_(double var1) {
      return this.this_ != null && this.this_.class_(rfU_2.class_(var1, -1.0, 1.0));
   }

   private static cz_3 class_(CommandSyntaxException var0) {
      rgP_2 var1 = rgv_3.class_(var0.getRawMessage());
      String var2 = var0.getContext();
      return var2 == null ? new cz_3(var1.catch_()) : new cz_3(new rgn_3("command.context.parse_error", var1, var0.getCursor(), var2).catch_());
   }

   private static int class_(String var0) {
      if (Strings.isNullOrEmpty(var0)) {
         return 0;
      } else {
         int var1 = 0;
         Matcher var2 = class_.matcher(var0);

         while (var2.find()) {
            var1 = var2.end();
         }

         return var1;
      }
   }

   private void class_(rgF_2 var1) {
      CommandContextBuilder var2 = this.continue_.getContext();
      SuggestionContext var3 = var2.findSuggestionContext(this.catch_.final_());
      Map var4 = ((Aq_1)((cb_3)this.throws_.class_[57]).break_[0])
         .implements_()
         .getSmartUsage(var3.parent, ((Aq_1)((cb_3)this.throws_.class_[57]).break_[0]).break_());
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;
      rgc_3 var7 = rgc_3.class_.class_(var1);

      for (Entry var9 : var4.entrySet()) {
         if (!(var9.getKey() instanceof LiteralCommandNode)) {
            var5.add(new cz_3(rpl_3.class_((String)var9.getValue(), var7)));
            var6 = Math.max(var6, this.private_.break_((String)var9.getValue()));
         }
      }

      if (!var5.isEmpty()) {
         this.package_.addAll(var5);
      }
   }

   public void break_(boolean var1) {
      if (this.super_ != null && this.super_.isDone()) {
         Suggestions var2 = this.super_.join();
         if (!var2.isEmpty()) {
            int var3 = 0;

            for (Suggestion var5 : var2.getList()) {
               var3 = Math.max(var3, this.private_.break_(var5.getText()));
            }

            int var6 = rfU_2.class_(this.catch_.volatile_(var2.getRange().getStart()), 0, this.catch_.volatile_(0) + this.catch_.package_() - var3);
            int var7 = this.volatile_ ? this.case_.int_ - 12 : 72;
            this.this_ = new cQ_2((int)this, var6, var7, var3, (boolean)this.class_(var2), var1);
         }
      }
   }

   public String break_() {
      return this.this_ != null ? "\n" + this.this_.byte_() : "";
   }

   public List<cz_3> throws_() {
      return this.package_;
   }

   private void catch_() {
      if (this.catch_.final_() == this.catch_.private_().length()) {
         if (this.super_.join().isEmpty() && !this.continue_.getExceptions().isEmpty()) {
            int var1 = 0;

            for (Entry var3 : this.continue_.getExceptions().entrySet()) {
               CommandSyntaxException var4 = (CommandSyntaxException)var3.getValue();
               if (var4.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                  var1++;
               } else {
                  this.package_.add(class_(var4));
               }
            }

            if (var1 > 0) {
               this.package_.add(class_(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
            }
         } else if (this.continue_.getReader().canRead()) {
            this.package_.add(class_(gp_3.class_(this.continue_)));
         }
      }

      this.int_ = 2;
      this.new_ = this.case_.package_;
      if (this.package_.isEmpty()) {
         this.class_(rgF_2.GRAY);
      }

      this.this_ = null;
      if (this.else_ && ((Qw_1)this.throws_.class_[20]).import_) {
         this.break_(false);
      }
   }

   public boolean case_() {
      return this.synchronized_;
   }

   public CompletableFuture<Suggestions> protected_() {
      return this.super_;
   }
}
