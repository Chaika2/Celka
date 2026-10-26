package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;

public class KS {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.schedule.cleared.failure", var0));
   private static final SuggestionProvider<gy_3> byte_ = (var0, var1) -> gR_2.break_(
         ((gy_3)var0.getSource()).super_().rB().instanceof_().else_().class_(), var1
      );

   private static int class_(gy_3 var0, Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> var1, int var2, boolean var3) throws CommandSyntaxException {
      if (var2 == 0) {
         throw class_.create();
      } else {
         long var4 = var0.final_().r() + (long)var2;
         rqO_2 var6 = (rqO_2)var1.getFirst();
         gi_3 var7 = var0.super_().rB().instanceof_().else_();
         ((Either)var1.getSecond()).ifLeft(var7x -> {
            String var8 = var6.toString();
            if (var3) {
               var7.class_(var8);
            }

            var7.class_(var8, var4, new gD_2(var6));
            var0.class_(new rgn_3("commands.schedule.created.function", var6, var2, var4), true);
         }).ifRight(var7x -> {
            String var8 = "#" + var6.toString();
            if (var3) {
               var7.class_(var8);
            }

            var7.class_(var8, var4, new ge_3(var6));
            var0.class_(new rgn_3("commands.schedule.created.tag", var6, var2, var4), true);
         });
         return (int)Math.floorMod(var4, 2147483647L);
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("schedule").requires(var0x -> var0x.class_(2)))
               .then(
                  gp_3.class_("function")
                     .then(
                        gp_3.class_("function", RH.class_())
                           .suggests(oF_2.class_)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("time", Yq_1.class_())
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(), RH.break_(var0x, "function"), IntegerArgumentType.getInteger(var0x, "time"), true
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("append")
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(), RH.break_(var0x, "function"), IntegerArgumentType.getInteger(var0x, "time"), false
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("replace")
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(), RH.break_(var0x, "function"), IntegerArgumentType.getInteger(var0x, "time"), true
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("clear")
                  .then(
                     gp_3.class_("function", StringArgumentType.greedyString())
                        .suggests(byte_)
                        .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "function")))
                  )
            )
      );
   }

   private static int class_(gy_3 var0, String var1) throws CommandSyntaxException {
      int var2 = var0.super_().rB().instanceof_().else_().class_(var1);
      if (var2 == 0) {
         throw break_.create(var1);
      } else {
         var0.class_(new rgn_3("commands.schedule.cleared.success", var2, var1), true);
         return var2;
      }
   }
}
