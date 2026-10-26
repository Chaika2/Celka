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
   private static final Pattern id_class = Pattern.compile("(\\s+)");
   private static final rgc_3 id_break = rgc_3.id_class.id_class(rgF_2.RED);
   private static final rgc_3 id_byte = rgc_3.id_class.id_class(rgF_2.GRAY);
   private static final List<rgc_3> id_protected = Stream.of(rgF_2.AQUA, rgF_2.YELLOW, rgF_2.GREEN, rgF_2.LIGHT_PURPLE, rgF_2.GOLD)
      .map(rgc_3.id_class::id_class)
      .collect(ImmutableList.toImmutableList());
   final QY id_throws;
   final vm_3 id_case;
   final Lu_1 id_catch;
   final cm_3 id_private;
   private final boolean id_implements;
   private final boolean id_finally;
   final int id_extends;
   final int id_native;
   final boolean id_volatile;
   final int id_final;
   private final List<cz_3> id_package = Lists.newArrayList();
   private int id_int;
   private int id_new;
   private ParseResults<gR_2> id_continue;
   private CompletableFuture<Suggestions> id_super;
   cQ_2 id_this;
   private boolean id_else;
   boolean id_synchronized;

   public Lu_1 id_byte() {
      return this.id_catch;
   }

   public cW_2(QY var1, vm_3 var2, Lu_1 var3, cm_3 var4, boolean var5, boolean var6, int var7, int var8, boolean var9, int var10) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_catch = var3;
      this.id_private = var4;
      this.id_implements = var5;
      this.id_finally = var6;
      this.id_extends = var7;
      this.id_native = var8;
      this.id_volatile = var9;
      this.id_final = var10;
      var3.id_class(this::id_class);
   }

   public void id_class(boolean var1) {
      this.id_else = var1;
      if (!var1) {
         this.id_this = null;
      }
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      if (this.id_this != null) {
         this.id_this.id_class(var1, var2, var3);
      } else {
         int var4 = 0;

         for (cz_3 var6 : this.id_package) {
            rpl_3 var7 = var6.id_class();
            int var8 = this.id_volatile ? this.id_case.id_int - 14 - 13 - 12 * var4 : 72 + 12 * var4;
            ch_3.id_class(var1, this.id_int, var8, this.id_int + this.id_private.id_class(var7) + 4, var8 + 12, this.id_final);
            this.id_private.id_class(var1, var7, (float)this.id_int + 2.0F, (float)(var8 + 2), -1);
            var4++;
         }
      }
   }

   private static rpl_3 id_class(ParseResults<gR_2> var0, String var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      int var4 = 0;
      int var5 = -1;
      CommandContextBuilder var6 = var0.getContext().getLastChild();

      for (ParsedArgument var8 : var6.getArguments().values()) {
         if (++var5 >= id_protected.size()) {
            var5 = 0;
         }

         int var9 = Math.max(var8.getRange().getStart() - var2, 0);
         if (var9 >= var1.length()) {
            break;
         }

         int var10 = Math.min(var8.getRange().getEnd() - var2, var1.length());
         if (var10 > 0) {
            var3.add(rpl_3.id_class(var1.substring(var4, var9), id_byte));
            var3.add(rpl_3.id_class(var1.substring(var9, var10), id_protected.get(var5)));
            var4 = var10;
         }
      }

      if (var0.getReader().canRead()) {
         int var11 = Math.max(var0.getReader().getCursor() - var2, 0);
         if (var11 < var1.length()) {
            int var12 = Math.min(var11 + var0.getReader().getRemainingLength(), var1.length());
            var3.add(rpl_3.id_class(var1.substring(var4, var11), id_byte));
            var3.add(rpl_3.id_class(var1.substring(var11, var12), id_break));
            var4 = var12;
         }
      }

      var3.add(rpl_3.id_class(var1.substring(var4), id_byte));
      return rpl_3.id_class(var3);
   }

   public boolean id_class(int var1, int var2, int var3) {
      if (this.id_this != null && this.id_this.id_break(var1, var2, var3)) {
         return true;
      } else if (this.id_case.id_catch() == this.id_catch && var1 == 258) {
         this.id_break(true);
         return true;
      } else {
         return false;
      }
   }

   private rpl_3 id_class(String var1, int var2) {
      return this.id_continue != null ? id_class(this.id_continue, var1, var2) : rpl_3.id_class(var1, rgc_3.id_class);
   }

   @Nullable
   static String id_class(String var0, String var1) {
      return var1.startsWith(var0) ? var1.substring(var0.length()) : null;
   }

   public void id_class(ParseResults<gR_2> var1) {
      this.id_continue = var1;
   }

   public void id_class(cQ_2 var1) {
      this.id_this = var1;
   }

   public void id_class(CompletableFuture<Suggestions> var1) {
      this.id_super = var1;
   }

   public void id_class() {
      if (((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(this)) {
         this.id_package.clear();
         if (rrLE.id_class(this).id_byte()) {
            this.id_catch.id_byte(null);
            this.id_super = null;
            this.id_this = null;
            this.id_continue = null;
         } else {
            String var1 = this.id_catch.id_private();
            if (this.id_continue != null && !this.id_continue.getReader().getString().equals(var1)) {
               this.id_continue = null;
            }

            if (!this.id_synchronized) {
               this.id_catch.id_byte(null);
               this.id_this = null;
            }

            StringReader var2 = new StringReader(var1);
            boolean var3 = var2.canRead() && var2.peek() == '/';
            if (var3) {
               var2.skip();
            }

            boolean var4 = this.id_implements || var3;
            int var5 = this.id_catch.id_final();
            if (!this.id_synchronized) {
               this.id_catch.id_byte(null);
               this.id_this = null;
            }

            if (var4) {
               CommandDispatcher var6 = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_implements();
               if (this.id_continue == null) {
                  this.id_continue = var6.parse(var2, ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_break());
               }

               int var7 = this.id_finally ? var2.getCursor() : 1;
               if (var5 >= var7 && (this.id_this == null || !this.id_synchronized)) {
                  this.id_super = var6.getCompletionSuggestions(this.id_continue, var5);
                  this.id_super.thenRun(() -> {
                     if (this.id_super.isDone()) {
                        this.id_catch();
                     }
                  });
               }
            } else {
               String var9 = var1.substring(0, var5);
               int var10 = id_class(var9);
               Collection var8 = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_break().id_class();
               this.id_super = gR_2.id_break(var8, new SuggestionsBuilder(var9, var10));
            }
         }
      }
   }

   private List<Suggestion> id_class(Suggestions var1) {
      String var2 = this.id_catch.id_private().substring(0, this.id_catch.id_final());
      int var3 = id_class(var2);
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

   public boolean id_class(double var1, double var3, int var5) {
      return this.id_this != null && this.id_this.id_class((int)var1, (int)var3, var5);
   }

   public boolean id_class(double var1) {
      return this.id_this != null && this.id_this.id_class(rfU_2.id_class(var1, -1.0, 1.0));
   }

   private static cz_3 id_class(CommandSyntaxException var0) {
      rgP_2 var1 = rgv_3.id_class(var0.getRawMessage());
      String var2 = var0.getContext();
      return var2 == null ? new cz_3(var1.id_catch()) : new cz_3(new rgn_3("command.context.parse_error", var1, var0.getCursor(), var2).id_catch());
   }

   private static int id_class(String var0) {
      if (Strings.isNullOrEmpty(var0)) {
         return 0;
      } else {
         int var1 = 0;
         Matcher var2 = id_class.matcher(var0);

         while (var2.find()) {
            var1 = var2.end();
         }

         return var1;
      }
   }

   private void id_class(rgF_2 var1) {
      CommandContextBuilder var2 = this.id_continue.getContext();
      SuggestionContext var3 = var2.findSuggestionContext(this.id_catch.id_final());
      Map var4 = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0])
         .id_implements()
         .getSmartUsage(var3.parent, ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_break());
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;
      rgc_3 var7 = rgc_3.id_class.id_class(var1);

      for (Entry var9 : var4.entrySet()) {
         if (!(var9.getKey() instanceof LiteralCommandNode)) {
            var5.add(new cz_3(rpl_3.id_class((String)var9.getValue(), var7)));
            var6 = Math.max(var6, this.id_private.id_break((String)var9.getValue()));
         }
      }

      if (!var5.isEmpty()) {
         this.id_package.addAll(var5);
      }
   }

   public void id_break(boolean var1) {
      if (this.id_super != null && this.id_super.isDone()) {
         Suggestions var2 = this.id_super.join();
         if (!var2.isEmpty()) {
            int var3 = 0;

            for (Suggestion var5 : var2.getList()) {
               var3 = Math.max(var3, this.id_private.id_break(var5.getText()));
            }

            int var6 = rfU_2.id_class(
               this.id_catch.id_volatile(var2.getRange().getStart()), 0, this.id_catch.id_volatile(0) + this.id_catch.id_package() - var3
            );
            int var7 = this.id_volatile ? this.id_case.id_int - 12 : 72;
            this.id_this = new cQ_2((int)this, var6, var7, var3, (boolean)this.id_class(var2), var1);
         }
      }
   }

   public String id_break() {
      return this.id_this != null ? "\n" + this.id_this.id_byte() : "";
   }

   public List<cz_3> id_throws() {
      return this.id_package;
   }

   private void id_catch() {
      if (this.id_catch.id_final() == this.id_catch.id_private().length()) {
         if (this.id_super.join().isEmpty() && !this.id_continue.getExceptions().isEmpty()) {
            int var1 = 0;

            for (Entry var3 : this.id_continue.getExceptions().entrySet()) {
               CommandSyntaxException var4 = (CommandSyntaxException)var3.getValue();
               if (var4.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                  var1++;
               } else {
                  this.id_package.add(id_class(var4));
               }
            }

            if (var1 > 0) {
               this.id_package.add(id_class(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
            }
         } else if (this.id_continue.getReader().canRead()) {
            this.id_package.add(id_class(gp_3.id_class(this.id_continue)));
         }
      }

      this.id_int = 2;
      this.id_new = this.id_case.id_package;
      if (this.id_package.isEmpty()) {
         this.id_class(rgF_2.GRAY);
      }

      this.id_this = null;
      if (this.id_else && ((Qw_1)this.id_throws.id_class[20]).id_import) {
         this.id_break(false);
      }
   }

   public boolean id_case() {
      return this.id_synchronized;
   }

   public CompletableFuture<Suggestions> id_protected() {
      return this.id_super;
   }
}
