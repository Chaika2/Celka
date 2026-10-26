package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gp_3 {
   private static final Logger class_ = LogManager.getLogger();
   private final CommandDispatcher<gy_3> break_ = new CommandDispatcher();

   public gp_3(gq_3 var1) {
      YD.class_(this.break_);
      or_3.class_(this.break_);
      oz_3.class_(this.break_);
      os_3.class_(this.break_);
      oE_2.class_(this.break_);
      oG_2.class_(this.break_);
      Ky_1.class_(this.break_);
      oO_2.class_(this.break_);
      oJ_2.class_(this.break_);
      ox_3.class_(this.break_);
      od_3.class_(this.break_);
      ok_3.class_(this.break_);
      oj_3.class_(this.break_);
      oW_2.class_(this.break_);
      oc_3.class_(this.break_);
      om_3.class_(this.break_);
      ov_3.class_(this.break_);
      oF_2.class_(this.break_);
      oL_2.class_(this.break_);
      oA_2.class_(this.break_);
      oC_2.class_(this.break_);
      ol_3.class_(this.break_);
      oH_2.class_(this.break_);
      oy_3.class_(this.break_);
      op_3.class_(this.break_);
      oT_2.class_(this.break_);
      oq_3.class_(this.break_);
      ot_3.class_(this.break_);
      oV_2.class_(this.break_);
      oo_3.class_(this.break_);
      oK_2.class_(this.break_);
      oe_3.class_(this.break_);
      oU_2.class_(this.break_);
      oa_3.class_(this.break_);
      KB.class_(this.break_);
      KS.class_(this.break_);
      Ks_1.class_(this.break_);
      KE.class_(this.break_, var1 != gq_3.INTEGRATED);
      KG.class_(this.break_);
      KX.class_(this.break_);
      Kh_1.class_(this.break_);
      KJ.class_(this.break_);
      Kx_1.class_(this.break_);
      KW.class_(this.break_);
      Kz_1.class_(this.break_);
      KQ.class_(this.break_);
      KN.class_(this.break_);
      Kc_1.class_(this.break_);
      Ku_1.class_(this.break_);
      KZ.class_(this.break_);
      Kv_1.class_(this.break_);
      KF.class_(this.break_);
      KL.class_(this.break_);
      KA.class_(this.break_);
      KC.class_(this.break_);
      if (rqu_3.byte_) {
         rlt_3.class_(this.break_);
      }

      if (var1.field_237220_e_) {
         oB_2.class_(this.break_);
         oS_2.class_(this.break_);
         oP_2.class_(this.break_);
         oX_2.class_(this.break_);
         og_3.class_(this.break_);
         oR_2.class_(this.break_);
         oY_2.class_(this.break_);
         oi_3.class_(this.break_);
         Kr_1.class_(this.break_);
         KP.class_(this.break_);
         KO.class_(this.break_);
         Kk_1.class_(this.break_);
         Kn_1.class_(this.break_);
      }

      if (var1.field_237219_d_) {
         oD_2.class_(this.break_);
      }

      this.break_
         .findAmbiguities(
            (var1x, var2, var3, var4) -> class_.warn(
                  "Ambiguity between arguments {} and {} with inputs: {}", this.break_.getPath(var2), this.break_.getPath(var3), var4
               )
         );
      this.break_.setConsumer((var0, var1x, var2) -> ((gy_3)var0.getSource()).class_(var0, var1x, var2));
   }

   public int class_(gy_3 var1, String var2) {
      StringReader var3 = new StringReader(var2);
      if (var3.canRead() && var3.peek() == '/') {
         var3.skip();
      }

      try {
         return this.break_.execute(var3, var1);
      } catch (gH_2 var8) {
         var1.class_(var8.class_());
         return 0;
      } catch (CommandSyntaxException var9) {
         var1.class_(rgv_3.class_(var9.getRawMessage()));
         if (var9.getInput() != null && var9.getCursor() >= 0) {
            int var11 = Math.min(var9.getInput().length(), var9.getCursor());
            rVi_1 var12 = new rgN_2("").class_(rgF_2.GRAY).class_(var1x -> var1x.class_(new rgl_3(rgH_2.SUGGEST_COMMAND, var2)));
            if (var11 > 10) {
               var12.break_("...");
            }

            var12.break_(var9.getInput().substring(Math.max(0, var11 - 10), var11));
            if (var11 < var9.getInput().length()) {
               rVi_1 var13 = new rgN_2(var9.getInput().substring(var11)).class_(new rgF_2[]{rgF_2.RED, rgF_2.UNDERLINE});
               var12.class_(var13);
            }

            var12.class_(new rgn_3("command.context.here").class_(new rgF_2[]{rgF_2.RED, rgF_2.ITALIC}));
            var1.class_(var12);
         }

         return 0;
      } catch (Exception var10) {
         rgN_2 var5 = new rgN_2(var10.getMessage() == null ? var10.getClass().getName() : var10.getMessage());
         if (class_.isDebugEnabled()) {
            class_.error("Command exception: {}", var2, var10);
            StackTraceElement[] var6 = var10.getStackTrace();

            for (int var7 = 0; var7 < Math.min(var6.length, 3); var7++) {
               var5.break_("\n\n")
                  .break_(var6[var7].getMethodName())
                  .break_("\n ")
                  .break_(var6[var7].getFileName())
                  .break_(":")
                  .break_(String.valueOf(var6[var7].getLineNumber()));
            }
         }

         var1.class_(new rgn_3("command.failed").class_(var1x -> var1x.class_(new rgy_3(rgp_3.class_, var5))));
         if (rqu_3.byte_) {
            var1.class_(new rgN_2(rqR_2.protected_(var10)));
            class_.error("'" + var2 + "' threw an exception", var10);
         }

         return 0;
      }
   }

   public static Predicate<String> class_(gT_2 var0) {
      return var1 -> {
         try {
            var0.parse(new StringReader(var1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public void class_(rhN_2 var1) {
      HashMap var2 = Maps.newHashMap();
      RootCommandNode var3 = new RootCommandNode();
      var2.put(this.break_.getRoot(), var3);
      this.class_(this.break_.getRoot(), var3, var1.PL(), var2);
      var1.class_.class_(new rvP_2(var3));
   }

   public static LiteralArgumentBuilder<gy_3> class_(String var0) {
      return LiteralArgumentBuilder.literal(var0);
   }

   private void class_(CommandNode<gy_3> var1, CommandNode<gR_2> var2, gy_3 var3, Map<CommandNode<gy_3>, CommandNode<gR_2>> var4) {
      for (CommandNode var6 : var1.getChildren()) {
         if (var6.canUse(var3)) {
            ArgumentBuilder var7 = var6.createBuilder();
            var7.requires(var0 -> true);
            if (var7.getCommand() != null) {
               var7.executes(var0 -> 0);
            }

            if (var7 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder var8 = (RequiredArgumentBuilder)var7;
               if (var8.getSuggestionsProvider() != null) {
                  var8.suggests(Yl_1.break_(var8.getSuggestionsProvider()));
               }
            }

            if (var7.getRedirect() != null) {
               var7.redirect((CommandNode)var4.get(var7.getRedirect()));
            }

            CommandNode var9 = var7.build();
            var4.put(var6, var9);
            var2.addChild(var9);
            if (!var6.getChildren().isEmpty()) {
               this.class_(var6, var9, var3, var4);
            }
         }
      }
   }

   public static <T> RequiredArgumentBuilder<gy_3, T> class_(String var0, ArgumentType<T> var1) {
      return RequiredArgumentBuilder.argument(var0, var1);
   }

   public static <S> CommandSyntaxException class_(ParseResults<S> var0) {
      if (!var0.getReader().canRead()) {
         return null;
      } else if (var0.getExceptions().size() == 1) {
         return (CommandSyntaxException)var0.getExceptions().values().iterator().next();
      } else {
         return var0.getContext().getRange().isEmpty()
            ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(var0.getReader())
            : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(var0.getReader());
      }
   }

   public CommandDispatcher<gy_3> class_() {
      return this.break_;
   }

   public static void break_() {
      RootCommandNode var0 = new gp_3(gq_3.ALL).class_().getRoot();
      Set var1 = RG.class_(var0);
      Set var2 = var1.stream().filter(var0x -> !RG.class_((ArgumentType<?>)var0x)).collect(Collectors.toSet());
      if (!var2.isEmpty()) {
         class_.warn("Missing type registration for following arguments:\n {}", var2.stream().map(var0x -> "\t" + var0x).collect(Collectors.joining(",\n")));
         throw new IllegalStateException("Unregistered argument types");
      }
   }
}
