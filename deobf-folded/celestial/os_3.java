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
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.bossbar.create.failed", var0));
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.bossbar.unknown", var0));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType id_private = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType id_implements = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType id_finally = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType id_extends = new SimpleCommandExceptionType(new rgn_3("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<gy_3> id_class = (var0, var1) -> gR_2.id_class(((gy_3)var0.getSource()).id_super().U().id_class(), var1);

   private static int id_byte(gy_3 var0, rnx_3 var1) {
      if (var1.id_package()) {
         var0.id_class(new rgn_3("commands.bossbar.get.visible.visible", var1.id_case()), true);
         return 1;
      } else {
         var0.id_class(new rgn_3("commands.bossbar.get.visible.hidden", var1.id_case()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rqO_2 var1, rgP_2 var2) throws CommandSyntaxException {
      rnd_3 var3 = var0.id_super().U();
      if (var3.id_class(var1) != null) {
         throw id_break.create(var1.toString());
      } else {
         rnx_3 var4 = var3.id_class(var1, rgv_3.id_class(var0, var2, (an_3)null, 0));
         var0.id_class(new rgn_3("commands.bossbar.create.success", var4.id_case()), true);
         return var3.id_break().size();
      }
   }

   private static int id_class(gy_3 var0) {
      Collection var1 = var0.id_super().U().id_break();
      if (var1.isEmpty()) {
         var0.id_class(new rgn_3("commands.bossbar.list.bars.none"), false);
      } else {
         var0.id_class(new rgn_3("commands.bossbar.list.bars.some", var1.size(), rgv_3.id_break(var1, rnx_3::id_case)), false);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, rnx_3 var1, Collection<rhN_2> var2) throws CommandSyntaxException {
      boolean var3 = var1.id_class(var2);
      if (!var3) {
         throw id_protected.create();
      } else {
         if (var1.id_int().isEmpty()) {
            var0.id_class(new rgn_3("commands.bossbar.set.players.success.none", var1.id_case()), true);
         } else {
            var0.id_class(new rgn_3("commands.bossbar.set.players.success.some", var1.id_case(), var2.size(), rgv_3.id_break(var2, rhd_3::L_)), true);
         }

         return var1.id_int().size();
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                              "bossbar"
                           )
                           .requires(var0x -> var0x.id_class(2)))
                        .then(
                           gp_3.id_class("add")
                              .then(
                                 gp_3.id_class("id", Ym_1.id_class())
                                    .then(
                                       gp_3.id_class("name", RQ.id_class())
                                          .executes(var0x -> id_class((gy_3)var0x.getSource(), Ym_1.id_throws(var0x, "id"), RQ.id_class(var0x, "name")))
                                    )
                              )
                        ))
                     .then(
                        gp_3.id_class("remove")
                           .then(gp_3.id_class("id", Ym_1.id_class()).suggests(id_class).executes(var0x -> id_throws((gy_3)var0x.getSource(), id_class(var0x))))
                     ))
                  .then(gp_3.id_class("list").executes(var0x -> id_class((gy_3)var0x.getSource()))))
               .then(
                  gp_3.id_class("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                                "id", Ym_1.id_class()
                                             )
                                             .suggests(id_class)
                                             .then(
                                                gp_3.id_class("name")
                                                   .then(
                                                      gp_3.id_class("name", RQ.id_class())
                                                         .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), RQ.id_class(var0x, "name")))
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                                                     "color"
                                                                  )
                                                                  .then(
                                                                     gp_3.id_class("pink")
                                                                        .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.PINK))
                                                                  ))
                                                               .then(
                                                                  gp_3.id_class("blue")
                                                                     .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.BLUE))
                                                               ))
                                                            .then(
                                                               gp_3.id_class("red")
                                                                  .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.RED))
                                                            ))
                                                         .then(
                                                            gp_3.id_class("green")
                                                               .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.GREEN))
                                                         ))
                                                      .then(
                                                         gp_3.id_class("yellow")
                                                            .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.YELLOW))
                                                      ))
                                                   .then(
                                                      gp_3.id_class("purple")
                                                         .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.PURPLE))
                                                   ))
                                                .then(gp_3.id_class("white").executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRb_1.WHITE)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                                            "style"
                                                         )
                                                         .then(
                                                            gp_3.id_class("progress")
                                                               .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRM.PROGRESS))
                                                         ))
                                                      .then(
                                                         gp_3.id_class("notched_6")
                                                            .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRM.NOTCHED_6))
                                                      ))
                                                   .then(
                                                      gp_3.id_class("notched_10")
                                                         .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRM.NOTCHED_10))
                                                   ))
                                                .then(
                                                   gp_3.id_class("notched_12")
                                                      .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRM.NOTCHED_12))
                                                ))
                                             .then(
                                                gp_3.id_class("notched_20")
                                                   .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), rRM.NOTCHED_20))
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("value")
                                          .then(
                                             gp_3.id_class("value", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), IntegerArgumentType.getInteger(var0x, "value"))
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("max")
                                       .then(
                                          gp_3.id_class("max", IntegerArgumentType.integer(1))
                                             .executes(
                                                var0x -> id_break((gy_3)var0x.getSource(), id_class(var0x), IntegerArgumentType.getInteger(var0x, "max"))
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("visible")
                                    .then(
                                       gp_3.id_class("visible", BoolArgumentType.bool())
                                          .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), BoolArgumentType.getBool(var0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)gp_3.id_class("players")
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), Collections.emptyList())))
                                 .then(
                                    gp_3.id_class("targets", RZ.id_protected())
                                       .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x), RZ.id_protected(var0x, "targets")))
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("id", Ym_1.id_class())
                                 .suggests(id_class)
                                 .then(gp_3.id_class("value").executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x)))))
                              .then(gp_3.id_class("max").executes(var0x -> id_break((gy_3)var0x.getSource(), id_class(var0x)))))
                           .then(gp_3.id_class("visible").executes(var0x -> id_byte((gy_3)var0x.getSource(), id_class(var0x)))))
                        .then(gp_3.id_class("players").executes(var0x -> id_protected((gy_3)var0x.getSource(), id_class(var0x))))
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, rnx_3 var1) {
      var0.id_class(new rgn_3("commands.bossbar.get.value", var1.id_case(), var1.id_protected()), true);
      return var1.id_protected();
   }

   private static int id_class(gy_3 var0, rnx_3 var1, int var2) throws CommandSyntaxException {
      if (var1.id_protected() == var2) {
         throw id_private.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.bossbar.set.value.success", var1.id_case(), var2), true);
         return var2;
      }
   }

   private static int id_class(gy_3 var0, rnx_3 var1, boolean var2) throws CommandSyntaxException {
      if (var1.id_package() == var2) {
         if (var2) {
            throw id_extends.create();
         } else {
            throw id_finally.create();
         }
      } else {
         var1.id_protected(var2);
         if (var2) {
            var0.id_class(new rgn_3("commands.bossbar.set.visible.success.visible", var1.id_case()), true);
         } else {
            var0.id_class(new rgn_3("commands.bossbar.set.visible.success.hidden", var1.id_case()), true);
         }

         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnx_3 var1, rRb_1 var2) throws CommandSyntaxException {
      if (var1.id_finally().equals(var2)) {
         throw id_case.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.bossbar.set.color.success", var1.id_case()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnx_3 var1, rgP_2 var2) throws CommandSyntaxException {
      rVi_1 var3 = rgv_3.id_class(var0, var2, (an_3)null, 0);
      if (var1.id_implements().equals(var3)) {
         throw id_throws.create();
      } else {
         var1.id_class(var3);
         var0.id_class(new rgn_3("commands.bossbar.set.name.success", var1.id_case()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnx_3 var1, rRM var2) throws CommandSyntaxException {
      if (var1.id_extends().equals(var2)) {
         throw id_catch.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.bossbar.set.style.success", var1.id_case()), true);
         return 0;
      }
   }

   public static rnx_3 id_class(CommandContext<gy_3> var0) throws CommandSyntaxException {
      rqO_2 var1 = Ym_1.id_throws(var0, "id");
      rnx_3 var2 = ((gy_3)var0.getSource()).id_super().U().id_class(var1);
      if (var2 == null) {
         throw id_byte.create(var1.toString());
      } else {
         return var2;
      }
   }

   private static int id_break(gy_3 var0, rnx_3 var1) {
      var0.id_class(new rgn_3("commands.bossbar.get.max", var1.id_case(), var1.id_throws()), true);
      return var1.id_throws();
   }

   private static int id_break(gy_3 var0, rnx_3 var1, int var2) throws CommandSyntaxException {
      if (var1.id_throws() == var2) {
         throw id_implements.create();
      } else {
         var1.id_break(var2);
         var0.id_class(new rgn_3("commands.bossbar.set.max.success", var1.id_case(), var2), true);
         return var2;
      }
   }

   private static int id_throws(gy_3 var0, rnx_3 var1) {
      rnd_3 var2 = var0.id_super().U();
      var1.id_byte();
      var2.id_class(var1);
      var0.id_class(new rgn_3("commands.bossbar.remove.success", var1.id_case()), true);
      return var2.id_break().size();
   }

   private static int id_protected(gy_3 var0, rnx_3 var1) {
      if (var1.id_int().isEmpty()) {
         var0.id_class(new rgn_3("commands.bossbar.get.players.none", var1.id_case()), true);
      } else {
         var0.id_class(new rgn_3("commands.bossbar.get.players.some", var1.id_case(), var1.id_int().size(), rgv_3.id_break(var1.id_int(), rhd_3::L_)), true);
      }

      return var1.id_int().size();
   }
}
