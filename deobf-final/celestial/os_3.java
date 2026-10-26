package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

public class os_3 {
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.bossbar.create.failed", var0));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.bossbar.unknown", var0));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType case_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType catch_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType private_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType implements_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType finally_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType extends_ = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<gy_3> class_ = (var0, var1) -> gR_2.class_(((gy_3)var0.getSource()).super_().U().class_(), var1);

   private static int byte_(gy_3 var0, rnx_3 var1) {
      if (var1.package_()) {
         var0.class_(new rgn_3("commands.bossbar.get.visible.visible", var1.case_()), true);
         return 1;
      } else {
         var0.class_(new rgn_3("commands.bossbar.get.visible.hidden", var1.case_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rqO_2 var1, rgP_2 var2) throws CommandSyntaxException {
      rnd_3 var3 = var0.super_().U();
      if (var3.class_(var1) != null) {
         throw break_.create(var1.toString());
      } else {
         rnx_3 var4 = var3.class_(var1, rgv_3.class_(var0, var2, (an_3)null, 0));
         var0.class_(new rgn_3("commands.bossbar.create.success", var4.case_()), true);
         return var3.break_().size();
      }
   }

   private static int class_(gy_3 var0) {
      Collection var1 = var0.super_().U().break_();
      if (var1.isEmpty()) {
         var0.class_(new rgn_3("commands.bossbar.list.bars.none"), false);
      } else {
         var0.class_(new rgn_3("commands.bossbar.list.bars.some", var1.size(), rgv_3.break_(var1, rnx_3::case_)), false);
      }

      return var1.size();
   }

   private static int class_(gy_3 var0, rnx_3 var1, Collection<rhN_2> var2) throws CommandSyntaxException {
      boolean var3 = var1.class_(var2);
      if (!var3) {
         throw protected_.create();
      } else {
         if (var1.int_().isEmpty()) {
            var0.class_(new rgn_3("commands.bossbar.set.players.success.none", var1.case_()), true);
         } else {
            var0.class_(new rgn_3("commands.bossbar.set.players.success.some", var1.case_(), var2.size(), rgv_3.break_(var2, rhd_3::L_)), true);
         }

         return var1.int_().size();
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                              "bossbar"
                           )
                           .requires(var0x -> var0x.class_(2)))
                        .then(
                           gp_3.class_("add")
                              .then(
                                 gp_3.class_("id", Ym_1.class_())
                                    .then(
                                       gp_3.class_("name", RQ.class_())
                                          .executes(var0x -> class_((gy_3)var0x.getSource(), Ym_1.throws_(var0x, "id"), RQ.class_(var0x, "name")))
                                    )
                              )
                        ))
                     .then(
                        gp_3.class_("remove")
                           .then(gp_3.class_("id", Ym_1.class_()).suggests(class_).executes(var0x -> throws_((gy_3)var0x.getSource(), class_(var0x))))
                     ))
                  .then(gp_3.class_("list").executes(var0x -> class_((gy_3)var0x.getSource()))))
               .then(
                  gp_3.class_("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                                "id", Ym_1.class_()
                                             )
                                             .suggests(class_)
                                             .then(
                                                gp_3.class_("name")
                                                   .then(
                                                      gp_3.class_("name", RQ.class_())
                                                         .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), RQ.class_(var0x, "name")))
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                                                     "color"
                                                                  )
                                                                  .then(
                                                                     gp_3.class_("pink")
                                                                        .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.PINK))
                                                                  ))
                                                               .then(
                                                                  gp_3.class_("blue")
                                                                     .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.BLUE))
                                                               ))
                                                            .then(
                                                               gp_3.class_("red").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.RED))
                                                            ))
                                                         .then(
                                                            gp_3.class_("green").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.GREEN))
                                                         ))
                                                      .then(
                                                         gp_3.class_("yellow").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.YELLOW))
                                                      ))
                                                   .then(gp_3.class_("purple").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.PURPLE))))
                                                .then(gp_3.class_("white").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRb_1.WHITE)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                                            "style"
                                                         )
                                                         .then(
                                                            gp_3.class_("progress")
                                                               .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRM.PROGRESS))
                                                         ))
                                                      .then(
                                                         gp_3.class_("notched_6")
                                                            .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRM.NOTCHED_6))
                                                      ))
                                                   .then(
                                                      gp_3.class_("notched_10")
                                                         .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRM.NOTCHED_10))
                                                   ))
                                                .then(
                                                   gp_3.class_("notched_12").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRM.NOTCHED_12))
                                                ))
                                             .then(gp_3.class_("notched_20").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), rRM.NOTCHED_20)))
                                       ))
                                    .then(
                                       gp_3.class_("value")
                                          .then(
                                             gp_3.class_("value", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> class_((gy_3)var0x.getSource(), class_(var0x), IntegerArgumentType.getInteger(var0x, "value"))
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("max")
                                       .then(
                                          gp_3.class_("max", IntegerArgumentType.integer(1))
                                             .executes(var0x -> break_((gy_3)var0x.getSource(), class_(var0x), IntegerArgumentType.getInteger(var0x, "max")))
                                       )
                                 ))
                              .then(
                                 gp_3.class_("visible")
                                    .then(
                                       gp_3.class_("visible", BoolArgumentType.bool())
                                          .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), BoolArgumentType.getBool(var0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)gp_3.class_("players")
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), Collections.emptyList())))
                                 .then(
                                    gp_3.class_("targets", RZ.protected_())
                                       .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x), RZ.protected_(var0x, "targets")))
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("id", Ym_1.class_())
                                 .suggests(class_)
                                 .then(gp_3.class_("value").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x)))))
                              .then(gp_3.class_("max").executes(var0x -> break_((gy_3)var0x.getSource(), class_(var0x)))))
                           .then(gp_3.class_("visible").executes(var0x -> byte_((gy_3)var0x.getSource(), class_(var0x)))))
                        .then(gp_3.class_("players").executes(var0x -> protected_((gy_3)var0x.getSource(), class_(var0x))))
                  )
            )
      );
   }

   private static int class_(gy_3 var0, rnx_3 var1) {
      var0.class_(new rgn_3("commands.bossbar.get.value", var1.case_(), var1.protected_()), true);
      return var1.protected_();
   }

   private static int class_(gy_3 var0, rnx_3 var1, int var2) throws CommandSyntaxException {
      if (var1.protected_() == var2) {
         throw private_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.bossbar.set.value.success", var1.case_(), var2), true);
         return var2;
      }
   }

   private static int class_(gy_3 var0, rnx_3 var1, boolean var2) throws CommandSyntaxException {
      if (var1.package_() == var2) {
         if (var2) {
            throw extends_.create();
         } else {
            throw finally_.create();
         }
      } else {
         var1.protected_(var2);
         if (var2) {
            var0.class_(new rgn_3("commands.bossbar.set.visible.success.visible", var1.case_()), true);
         } else {
            var0.class_(new rgn_3("commands.bossbar.set.visible.success.hidden", var1.case_()), true);
         }

         return 0;
      }
   }

   private static int class_(gy_3 var0, rnx_3 var1, rRb_1 var2) throws CommandSyntaxException {
      if (var1.finally_().equals(var2)) {
         throw case_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.bossbar.set.color.success", var1.case_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rnx_3 var1, rgP_2 var2) throws CommandSyntaxException {
      rVi_1 var3 = rgv_3.class_(var0, var2, (an_3)null, 0);
      if (var1.implements_().equals(var3)) {
         throw throws_.create();
      } else {
         var1.class_(var3);
         var0.class_(new rgn_3("commands.bossbar.set.name.success", var1.case_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rnx_3 var1, rRM var2) throws CommandSyntaxException {
      if (var1.extends_().equals(var2)) {
         throw catch_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.bossbar.set.style.success", var1.case_()), true);
         return 0;
      }
   }

   public static rnx_3 class_(CommandContext<gy_3> var0) throws CommandSyntaxException {
      rqO_2 var1 = Ym_1.throws_(var0, "id");
      rnx_3 var2 = ((gy_3)var0.getSource()).super_().U().class_(var1);
      if (var2 == null) {
         throw byte_.create(var1.toString());
      } else {
         return var2;
      }
   }

   private static int break_(gy_3 var0, rnx_3 var1) {
      var0.class_(new rgn_3("commands.bossbar.get.max", var1.case_(), var1.throws_()), true);
      return var1.throws_();
   }

   private static int break_(gy_3 var0, rnx_3 var1, int var2) throws CommandSyntaxException {
      if (var1.throws_() == var2) {
         throw implements_.create();
      } else {
         var1.break_(var2);
         var0.class_(new rgn_3("commands.bossbar.set.max.success", var1.case_(), var2), true);
         return var2;
      }
   }

   private static int throws_(gy_3 var0, rnx_3 var1) {
      rnd_3 var2 = var0.super_().U();
      var1.byte_();
      var2.class_(var1);
      var0.class_(new rgn_3("commands.bossbar.remove.success", var1.case_()), true);
      return var2.break_().size();
   }

   private static int protected_(gy_3 var0, rnx_3 var1) {
      if (var1.int_().isEmpty()) {
         var0.class_(new rgn_3("commands.bossbar.get.players.none", var1.case_()), true);
      } else {
         var0.class_(new rgn_3("commands.bossbar.get.players.some", var1.case_(), var1.int_().size(), rgv_3.break_(var1.int_(), rhd_3::L_)), true);
      }

      return var1.int_().size();
   }
}
