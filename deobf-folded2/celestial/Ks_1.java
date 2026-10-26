package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;

public class Ks_1 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType id_case = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.scoreboard.players.get.null", var0, var1)
   );

   private static int id_byte(gy_3 var0, Collection<String> var1, rnP_2 var2, int var3) {
      rnG_2 var4 = var0.id_super().R();
      int var5 = 0;

      for (String var7 : var1) {
         rAa_1 var8 = var4.id_break(var7, var2);
         var8.id_break(var8.id_break() - var3);
         var5 += var8.id_break();
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.scoreboard.players.remove.success.single", var3, var2.id_throws(), var1.iterator().next(), var5), true);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.remove.success.multiple", var3, var2.id_throws(), var1.size()), true);
      }

      return var5;
   }

   private static int id_class(gy_3 var0, String var1, rnP_2 var2) throws CommandSyntaxException {
      rnG_2 var3 = var0.id_super().R();
      if (!var3.id_class(var1, var2)) {
         throw id_case.create(var2.id_break(), var1);
      } else {
         rAa_1 var4 = var3.id_break(var1, var2);
         var0.id_class(new rgn_3("commands.scoreboard.players.get.success", var1, var4.id_break(), var2.id_throws()), false);
         return var4.id_break();
      }
   }

   private static int id_class(gy_3 var0, String var1, rAi_1 var2, rgP_2 var3) throws CommandSyntaxException {
      rnG_2 var4 = var0.id_super().R();
      if (var4.id_byte(var1) != null) {
         throw id_class.create();
      } else if (var1.length() > 16) {
         throw Yk_1.id_class.create(16);
      } else {
         var4.id_class(var1, var2, var3, var2.id_byte());
         rnP_2 var5 = var4.id_byte(var1);
         var0.id_class(new rgn_3("commands.scoreboard.objectives.add.success", var5.id_throws()), true);
         return var4.id_class().size();
      }
   }

   private static int id_class(gy_3 var0, rnP_2 var1) {
      rnG_2 var2 = var0.id_super().R();
      var2.id_byte(var1);
      var0.id_class(new rgn_3("commands.scoreboard.objectives.remove.success", var1.id_throws()), true);
      return var2.id_class().size();
   }

   private static int id_class(gy_3 var0, rnP_2 var1, rnr_3 var2) {
      if (var1.id_case() != var2) {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.scoreboard.objectives.modify.rendertype", var1.id_throws()), true);
      }

      return 0;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("scoreboard").requires(var0x -> var0x.id_class(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("objectives")
                                 .then(gp_3.id_class("list").executes(var0x -> id_break((gy_3)var0x.getSource()))))
                              .then(
                                 gp_3.id_class("add")
                                    .then(
                                       gp_3.id_class("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.id_class("criteria", YW.id_class())
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            StringArgumentType.getString(var0x, "objective"),
                                                            YW.id_class(var0x, "criteria"),
                                                            new rgN_2(StringArgumentType.getString(var0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("displayName", RQ.id_class())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               StringArgumentType.getString(var0x, "objective"),
                                                               YW.id_class(var0x, "criteria"),
                                                               RQ.id_class(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.id_class("objective", Yk_1.id_class())
                                          .then(
                                             gp_3.id_class("displayname")
                                                .then(
                                                   gp_3.id_class("displayName", RQ.id_class())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(), Yk_1.id_class(var0x, "objective"), RQ.id_class(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(id_class())
                                 )
                           ))
                        .then(
                           gp_3.id_class("remove")
                              .then(
                                 gp_3.id_class("objective", Yk_1.id_class())
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), Yk_1.id_class(var0x, "objective")))
                              )
                        ))
                     .then(
                        gp_3.id_class("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)gp_3.id_class("slot", Yn_1.id_class())
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), Yn_1.id_class(var0x, "slot"))))
                                 .then(
                                    gp_3.id_class("objective", Yk_1.id_class())
                                       .executes(var0x -> id_class((gy_3)var0x.getSource(), Yn_1.id_class(var0x, "slot"), Yk_1.id_class(var0x, "objective")))
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)gp_3.id_class("list").executes(var0x -> id_class((gy_3)var0x.getSource())))
                                             .then(
                                                gp_3.id_class("target", Yv_1.id_class())
                                                   .suggests(Yv_1.id_class)
                                                   .executes(var0x -> id_class((gy_3)var0x.getSource(), Yv_1.id_class(var0x, "target")))
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("set")
                                          .then(
                                             gp_3.id_class("targets", Yv_1.id_break())
                                                .suggests(Yv_1.id_class)
                                                .then(
                                                   gp_3.id_class("objective", Yk_1.id_class())
                                                      .then(
                                                         gp_3.id_class("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> id_class(
                                                                     (gy_3)var0x.getSource(),
                                                                     Yv_1.id_byte(var0x, "targets"),
                                                                     Yk_1.id_break(var0x, "objective"),
                                                                     IntegerArgumentType.getInteger(var0x, "score")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("get")
                                       .then(
                                          gp_3.id_class("target", Yv_1.id_class())
                                             .suggests(Yv_1.id_class)
                                             .then(
                                                gp_3.id_class("objective", Yk_1.id_class())
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(), Yv_1.id_class(var0x, "target"), Yk_1.id_class(var0x, "objective")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("add")
                                    .then(
                                       gp_3.id_class("targets", Yv_1.id_break())
                                          .suggests(Yv_1.id_class)
                                          .then(
                                             gp_3.id_class("objective", Yk_1.id_class())
                                                .then(
                                                   gp_3.id_class("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         var0x -> id_break(
                                                               (gy_3)var0x.getSource(),
                                                               Yv_1.id_byte(var0x, "targets"),
                                                               Yk_1.id_break(var0x, "objective"),
                                                               IntegerArgumentType.getInteger(var0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("remove")
                                 .then(
                                    gp_3.id_class("targets", Yv_1.id_break())
                                       .suggests(Yv_1.id_class)
                                       .then(
                                          gp_3.id_class("objective", Yk_1.id_class())
                                             .then(
                                                gp_3.id_class("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      var0x -> id_byte(
                                                            (gy_3)var0x.getSource(),
                                                            Yv_1.id_byte(var0x, "targets"),
                                                            Yk_1.id_break(var0x, "objective"),
                                                            IntegerArgumentType.getInteger(var0x, "score")
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("reset")
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.id_class("targets", Yv_1.id_break())
                                       .suggests(Yv_1.id_class)
                                       .executes(var0x -> id_class((gy_3)var0x.getSource(), Yv_1.id_byte(var0x, "targets"))))
                                    .then(
                                       gp_3.id_class("objective", Yk_1.id_class())
                                          .executes(
                                             var0x -> id_break((gy_3)var0x.getSource(), Yv_1.id_byte(var0x, "targets"), Yk_1.id_class(var0x, "objective"))
                                          )
                                    )
                              )
                        ))
                     .then(
                        gp_3.id_class("enable")
                           .then(
                              gp_3.id_class("targets", Yv_1.id_break())
                                 .suggests(Yv_1.id_class)
                                 .then(
                                    gp_3.id_class("objective", Yk_1.id_class())
                                       .suggests((var0x, var1) -> id_class((gy_3)var0x.getSource(), Yv_1.id_byte(var0x, "targets"), var1))
                                       .executes(var0x -> id_class((gy_3)var0x.getSource(), Yv_1.id_byte(var0x, "targets"), Yk_1.id_class(var0x, "objective")))
                                 )
                           )
                     ))
                  .then(
                     gp_3.id_class("operation")
                        .then(
                           gp_3.id_class("targets", Yv_1.id_break())
                              .suggests(Yv_1.id_class)
                              .then(
                                 gp_3.id_class("targetObjective", Yk_1.id_class())
                                    .then(
                                       gp_3.id_class("operation", Yz_1.id_class())
                                          .then(
                                             gp_3.id_class("source", Yv_1.id_break())
                                                .suggests(Yv_1.id_class)
                                                .then(
                                                   gp_3.id_class("sourceObjective", Yk_1.id_class())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               Yv_1.id_byte(var0x, "targets"),
                                                               Yk_1.id_break(var0x, "targetObjective"),
                                                               Yz_1.id_class(var0x, "operation"),
                                                               Yv_1.id_byte(var0x, "source"),
                                                               Yk_1.id_class(var0x, "sourceObjective")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static LiteralArgumentBuilder<gy_3> id_class() {
      LiteralArgumentBuilder var0 = gp_3.id_class("rendertype");

      for (rnr_3 var4 : rnr_3.values()) {
         var0.then(gp_3.id_class(var4.id_class()).executes(var1 -> id_class((gy_3)var1.getSource(), Yk_1.id_class(var1, "objective"), var4)));
      }

      return var0;
   }

   private static CompletableFuture<Suggestions> id_class(gy_3 var0, Collection<String> var1, SuggestionsBuilder var2) {
      ArrayList var3 = Lists.newArrayList();
      rnG_2 var4 = var0.id_super().R();

      for (rnP_2 var6 : var4.id_class()) {
         if (var6.id_byte() == rAi_1.id_byte) {
            boolean var7 = false;

            for (String var9 : var1) {
               if (!var4.id_class(var9, var6) || var4.id_break(var9, var6).id_catch()) {
                  var7 = true;
                  break;
               }
            }

            if (var7) {
               var3.add(var6.id_break());
            }
         }
      }

      return gR_2.id_break(var3, var2);
   }

   private static int id_class(gy_3 var0) {
      Collection var1 = var0.id_super().R().id_byte();
      if (var1.isEmpty()) {
         var0.id_class(new rgn_3("commands.scoreboard.players.list.empty"), false);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.list.success", var1.size(), rgv_3.id_class(var1)), false);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, Collection<String> var1, rnP_2 var2, YN var3, Collection<String> var4, rnP_2 var5) throws CommandSyntaxException {
      rnG_2 var6 = var0.id_super().R();
      int var7 = 0;

      for (String var9 : var1) {
         rAa_1 var10 = var6.id_break(var9, var2);

         for (String var12 : var4) {
            rAa_1 var13 = var6.id_break(var12, var5);
            var3.apply(var10, var13);
         }

         var7 += var10.id_break();
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.scoreboard.players.operation.success.single", var2.id_throws(), var1.iterator().next(), var7), true);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.operation.success.multiple", var2.id_throws(), var1.size()), true);
      }

      return var7;
   }

   private static int id_class(gy_3 var0, Collection<String> var1, rnP_2 var2) throws CommandSyntaxException {
      if (var2.id_byte() != rAi_1.id_byte) {
         throw id_throws.create();
      } else {
         rnG_2 var3 = var0.id_super().R();
         int var4 = 0;

         for (String var6 : var1) {
            rAa_1 var7 = var3.id_break(var6, var2);
            if (var7.id_catch()) {
               var7.id_class(false);
               var4++;
            }
         }

         if (var4 == 0) {
            throw id_protected.create();
         } else {
            if (var1.size() == 1) {
               var0.id_class(new rgn_3("commands.scoreboard.players.enable.success.single", var2.id_throws(), var1.iterator().next()), true);
            } else {
               var0.id_class(new rgn_3("commands.scoreboard.players.enable.success.multiple", var2.id_throws(), var1.size()), true);
            }

            return var4;
         }
      }
   }

   private static int id_class(gy_3 var0, Collection<String> var1, rnP_2 var2, int var3) {
      rnG_2 var4 = var0.id_super().R();

      for (String var6 : var1) {
         rAa_1 var7 = var4.id_break(var6, var2);
         var7.id_break(var3);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.scoreboard.players.set.success.single", var2.id_throws(), var1.iterator().next(), var3), true);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.set.success.multiple", var2.id_throws(), var1.size(), var3), true);
      }

      return var3 * var1.size();
   }

   private static int id_class(gy_3 var0, Collection<String> var1) {
      rnG_2 var2 = var0.id_super().R();

      for (String var4 : var1) {
         var2.id_byte(var4, (rnP_2)null);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.scoreboard.players.reset.all.single", var1.iterator().next()), true);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.reset.all.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, int var1, rnP_2 var2) throws CommandSyntaxException {
      rnG_2 var3 = var0.id_super().R();
      if (var3.id_class(var1) == var2) {
         throw id_byte.create();
      } else {
         var3.id_class(var1, var2);
         var0.id_class(new rgn_3("commands.scoreboard.objectives.display.set", rns_3.id_catch()[var1], var2.id_protected()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, int var1) throws CommandSyntaxException {
      rnG_2 var2 = var0.id_super().R();
      if (var2.id_class(var1) == null) {
         throw id_break.create();
      } else {
         var2.id_class(var1, (rnP_2)null);
         var0.id_class(new rgn_3("commands.scoreboard.objectives.display.cleared", rns_3.id_catch()[var1]), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnP_2 var1, rgP_2 var2) {
      if (!var1.id_protected().equals(var2)) {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.scoreboard.objectives.modify.displayname", var1.id_break(), var1.id_throws()), true);
      }

      return 0;
   }

   private static int id_class(gy_3 var0, String var1) {
      Map var2 = var0.id_super().R().id_protected(var1);
      if (var2.isEmpty()) {
         var0.id_class(new rgn_3("commands.scoreboard.players.list.entity.empty", var1), false);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.list.entity.success", var1, var2.size()), false);

         for (Entry var4 : var2.entrySet()) {
            var0.id_class(
               new rgn_3("commands.scoreboard.players.list.entity.entry", ((rnP_2)var4.getKey()).id_throws(), ((rAa_1)var4.getValue()).id_break()), false
            );
         }
      }

      return var2.size();
   }

   private static int id_break(gy_3 var0, Collection<String> var1, rnP_2 var2, int var3) {
      rnG_2 var4 = var0.id_super().R();
      int var5 = 0;

      for (String var7 : var1) {
         rAa_1 var8 = var4.id_break(var7, var2);
         var8.id_break(var8.id_break() + var3);
         var5 += var8.id_break();
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.scoreboard.players.add.success.single", var3, var2.id_throws(), var1.iterator().next(), var5), true);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.add.success.multiple", var3, var2.id_throws(), var1.size()), true);
      }

      return var5;
   }

   private static int id_break(gy_3 var0, Collection<String> var1, rnP_2 var2) {
      rnG_2 var3 = var0.id_super().R();

      for (String var5 : var1) {
         var3.id_byte(var5, var2);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.scoreboard.players.reset.specific.single", var2.id_throws(), var1.iterator().next()), true);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.players.reset.specific.multiple", var2.id_throws(), var1.size()), true);
      }

      return var1.size();
   }

   private static int id_break(gy_3 var0) {
      Collection var1 = var0.id_super().R().id_class();
      if (var1.isEmpty()) {
         var0.id_class(new rgn_3("commands.scoreboard.objectives.list.empty"), false);
      } else {
         var0.id_class(new rgn_3("commands.scoreboard.objectives.list.success", var1.size(), rgv_3.id_break(var1, rnP_2::id_throws)), false);
      }

      return var1.size();
   }
}
