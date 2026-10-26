package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class KL {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.trigger.failed.invalid"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)gp_3.class_("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("objective", Yk_1.class_())
                        .suggests((var0x, var1) -> class_((gy_3)var0x.getSource(), var1))
                        .executes(var0x -> class_((gy_3)var0x.getSource(), class_(((gy_3)var0x.getSource()).new_(), Yk_1.class_(var0x, "objective")))))
                     .then(
                        gp_3.class_("add")
                           .then(
                              gp_3.class_("value", IntegerArgumentType.integer())
                                 .executes(
                                    var0x -> class_(
                                          (gy_3)var0x.getSource(),
                                          class_(((gy_3)var0x.getSource()).new_(), Yk_1.class_(var0x, "objective")),
                                          IntegerArgumentType.getInteger(var0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     gp_3.class_("set")
                        .then(
                           gp_3.class_("value", IntegerArgumentType.integer())
                              .executes(
                                 var0x -> break_(
                                       (gy_3)var0x.getSource(),
                                       class_(((gy_3)var0x.getSource()).new_(), Yk_1.class_(var0x, "objective")),
                                       IntegerArgumentType.getInteger(var0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static rAa_1 class_(rhN_2 var0, rnP_2 var1) throws CommandSyntaxException {
      if (var1.byte_() != rAi_1.byte_) {
         throw break_.create();
      } else {
         rns_3 var2 = var0.st();
         String var3 = var0.i();
         if (!var2.class_(var3, var1)) {
            throw class_.create();
         } else {
            rAa_1 var4 = var2.break_(var3, var1);
            if (var4.catch_()) {
               throw class_.create();
            } else {
               var4.class_(true);
               return var4;
            }
         }
      }
   }

   private static int class_(gy_3 var0, rAa_1 var1, int var2) {
      var1.class_(var2);
      var0.class_(new rgn_3("commands.trigger.add.success", var1.protected_().throws_(), var2), true);
      return var1.break_();
   }

   private static int class_(gy_3 var0, rAa_1 var1) {
      var1.class_(1);
      var0.class_(new rgn_3("commands.trigger.simple.success", var1.protected_().throws_()), true);
      return var1.break_();
   }

   public static CompletableFuture<Suggestions> class_(gy_3 var0, SuggestionsBuilder var1) {
      an_3 var2 = var0.package_();
      ArrayList var3 = Lists.newArrayList();
      if (var2 != null) {
         rnG_2 var4 = var0.super_().R();
         String var5 = var2.i();

         for (rnP_2 var7 : var4.class_()) {
            if (var7.byte_() == rAi_1.byte_ && var4.class_(var5, var7)) {
               rAa_1 var8 = var4.break_(var5, var7);
               if (!var8.catch_()) {
                  var3.add(var7.break_());
               }
            }
         }
      }

      return gR_2.break_(var3, var1);
   }

   private static int break_(gy_3 var0, rAa_1 var1, int var2) {
      var1.break_(var2);
      var0.class_(new rgn_3("commands.trigger.set.success", var1.protected_().throws_(), var2), true);
      return var2;
   }
}
