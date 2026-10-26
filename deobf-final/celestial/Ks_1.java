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
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType case_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.scoreboard.players.get.null", var0, var1)
   );

   private static int byte_(gy_3 var0, Collection<String> var1, rnP_2 var2, int var3) {
      rnG_2 var4 = var0.super_().R();
      int var5 = 0;

      for (String var7 : var1) {
         rAa_1 var8 = var4.break_(var7, var2);
         var8.break_(var8.break_() - var3);
         var5 += var8.break_();
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.scoreboard.players.remove.success.single", var3, var2.throws_(), var1.iterator().next(), var5), true);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.remove.success.multiple", var3, var2.throws_(), var1.size()), true);
      }

      return var5;
   }

   private static int class_(gy_3 var0, String var1, rnP_2 var2) throws CommandSyntaxException {
      rnG_2 var3 = var0.super_().R();
      if (!var3.class_(var1, var2)) {
         throw case_.create(var2.break_(), var1);
      } else {
         rAa_1 var4 = var3.break_(var1, var2);
         var0.class_(new rgn_3("commands.scoreboard.players.get.success", var1, var4.break_(), var2.throws_()), false);
         return var4.break_();
      }
   }

   private static int class_(gy_3 var0, String var1, rAi_1 var2, rgP_2 var3) throws CommandSyntaxException {
      rnG_2 var4 = var0.super_().R();
      if (var4.byte_(var1) != null) {
         throw class_.create();
      } else if (var1.length() > 16) {
         throw Yk_1.class_.create(16);
      } else {
         var4.class_(var1, var2, var3, var2.byte_());
         rnP_2 var5 = var4.byte_(var1);
         var0.class_(new rgn_3("commands.scoreboard.objectives.add.success", var5.throws_()), true);
         return var4.class_().size();
      }
   }

   private static int class_(gy_3 var0, rnP_2 var1) {
      rnG_2 var2 = var0.super_().R();
      var2.byte_(var1);
      var0.class_(new rgn_3("commands.scoreboard.objectives.remove.success", var1.throws_()), true);
      return var2.class_().size();
   }

   private static int class_(gy_3 var0, rnP_2 var1, rnr_3 var2) {
      if (var1.case_() != var2) {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.scoreboard.objectives.modify.rendertype", var1.throws_()), true);
      }

      return 0;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("scoreboard").requires(var0x -> var0x.class_(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("objectives")
                                 .then(gp_3.class_("list").executes(var0x -> break_((gy_3)var0x.getSource()))))
                              .then(
                                 gp_3.class_("add")
                                    .then(
                                       gp_3.class_("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.class_("criteria", YW.class_())
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            StringArgumentType.getString(var0x, "objective"),
                                                            YW.class_(var0x, "criteria"),
                                                            new rgN_2(StringArgumentType.getString(var0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("displayName", RQ.class_())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               StringArgumentType.getString(var0x, "objective"),
                                                               YW.class_(var0x, "criteria"),
                                                               RQ.class_(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.class_("objective", Yk_1.class_())
                                          .then(
                                             gp_3.class_("displayname")
                                                .then(
                                                   gp_3.class_("displayName", RQ.class_())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(), Yk_1.class_(var0x, "objective"), RQ.class_(var0x, "displayName")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(class_())
                                 )
                           ))
                        .then(
                           gp_3.class_("remove")
                              .then(gp_3.class_("objective", Yk_1.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), Yk_1.class_(var0x, "objective"))))
                        ))
                     .then(
                        gp_3.class_("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)gp_3.class_("slot", Yn_1.class_())
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), Yn_1.class_(var0x, "slot"))))
                                 .then(
                                    gp_3.class_("objective", Yk_1.class_())
                                       .executes(var0x -> class_((gy_3)var0x.getSource(), Yn_1.class_(var0x, "slot"), Yk_1.class_(var0x, "objective")))
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)gp_3.class_("list").executes(var0x -> class_((gy_3)var0x.getSource())))
                                             .then(
                                                gp_3.class_("target", Yv_1.class_())
                                                   .suggests(Yv_1.class_)
                                                   .executes(var0x -> class_((gy_3)var0x.getSource(), Yv_1.class_(var0x, "target")))
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("set")
                                          .then(
                                             gp_3.class_("targets", Yv_1.break_())
                                                .suggests(Yv_1.class_)
                                                .then(
                                                   gp_3.class_("objective", Yk_1.class_())
                                                      .then(
                                                         gp_3.class_("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> class_(
                                                                     (gy_3)var0x.getSource(),
                                                                     Yv_1.byte_(var0x, "targets"),
                                                                     Yk_1.break_(var0x, "objective"),
                                                                     IntegerArgumentType.getInteger(var0x, "score")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("get")
                                       .then(
                                          gp_3.class_("target", Yv_1.class_())
                                             .suggests(Yv_1.class_)
                                             .then(
                                                gp_3.class_("objective", Yk_1.class_())
                                                   .executes(
                                                      var0x -> class_((gy_3)var0x.getSource(), Yv_1.class_(var0x, "target"), Yk_1.class_(var0x, "objective"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("add")
                                    .then(
                                       gp_3.class_("targets", Yv_1.break_())
                                          .suggests(Yv_1.class_)
                                          .then(
                                             gp_3.class_("objective", Yk_1.class_())
                                                .then(
                                                   gp_3.class_("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         var0x -> break_(
                                                               (gy_3)var0x.getSource(),
                                                               Yv_1.byte_(var0x, "targets"),
                                                               Yk_1.break_(var0x, "objective"),
                                                               IntegerArgumentType.getInteger(var0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("remove")
                                 .then(
                                    gp_3.class_("targets", Yv_1.break_())
                                       .suggests(Yv_1.class_)
                                       .then(
                                          gp_3.class_("objective", Yk_1.class_())
                                             .then(
                                                gp_3.class_("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      var0x -> byte_(
                                                            (gy_3)var0x.getSource(),
                                                            Yv_1.byte_(var0x, "targets"),
                                                            Yk_1.break_(var0x, "objective"),
                                                            IntegerArgumentType.getInteger(var0x, "score")
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("reset")
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.class_("targets", Yv_1.break_())
                                       .suggests(Yv_1.class_)
                                       .executes(var0x -> class_((gy_3)var0x.getSource(), Yv_1.byte_(var0x, "targets"))))
                                    .then(
                                       gp_3.class_("objective", Yk_1.class_())
                                          .executes(var0x -> break_((gy_3)var0x.getSource(), Yv_1.byte_(var0x, "targets"), Yk_1.class_(var0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        gp_3.class_("enable")
                           .then(
                              gp_3.class_("targets", Yv_1.break_())
                                 .suggests(Yv_1.class_)
                                 .then(
                                    gp_3.class_("objective", Yk_1.class_())
                                       .suggests((var0x, var1) -> class_((gy_3)var0x.getSource(), Yv_1.byte_(var0x, "targets"), var1))
                                       .executes(var0x -> class_((gy_3)var0x.getSource(), Yv_1.byte_(var0x, "targets"), Yk_1.class_(var0x, "objective")))
                                 )
                           )
                     ))
                  .then(
                     gp_3.class_("operation")
                        .then(
                           gp_3.class_("targets", Yv_1.break_())
                              .suggests(Yv_1.class_)
                              .then(
                                 gp_3.class_("targetObjective", Yk_1.class_())
                                    .then(
                                       gp_3.class_("operation", Yz_1.class_())
                                          .then(
                                             gp_3.class_("source", Yv_1.break_())
                                                .suggests(Yv_1.class_)
                                                .then(
                                                   gp_3.class_("sourceObjective", Yk_1.class_())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               Yv_1.byte_(var0x, "targets"),
                                                               Yk_1.break_(var0x, "targetObjective"),
                                                               Yz_1.class_(var0x, "operation"),
                                                               Yv_1.byte_(var0x, "source"),
                                                               Yk_1.class_(var0x, "sourceObjective")
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

   private static LiteralArgumentBuilder<gy_3> class_() {
      LiteralArgumentBuilder var0 = gp_3.class_("rendertype");

      for (rnr_3 var4 : rnr_3.values()) {
         var0.then(gp_3.class_(var4.class_()).executes(var1 -> class_((gy_3)var1.getSource(), Yk_1.class_(var1, "objective"), var4)));
      }

      return var0;
   }

   private static CompletableFuture<Suggestions> class_(gy_3 var0, Collection<String> var1, SuggestionsBuilder var2) {
      ArrayList var3 = Lists.newArrayList();
      rnG_2 var4 = var0.super_().R();

      for (rnP_2 var6 : var4.class_()) {
         if (var6.byte_() == rAi_1.byte_) {
            boolean var7 = false;

            for (String var9 : var1) {
               if (!var4.class_(var9, var6) || var4.break_(var9, var6).catch_()) {
                  var7 = true;
                  break;
               }
            }

            if (var7) {
               var3.add(var6.break_());
            }
         }
      }

      return gR_2.break_(var3, var2);
   }

   private static int class_(gy_3 var0) {
      Collection var1 = var0.super_().R().byte_();
      if (var1.isEmpty()) {
         var0.class_(new rgn_3("commands.scoreboard.players.list.empty"), false);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.list.success", var1.size(), rgv_3.class_(var1)), false);
      }

      return var1.size();
   }

   private static int class_(gy_3 var0, Collection<String> var1, rnP_2 var2, YN var3, Collection<String> var4, rnP_2 var5) throws CommandSyntaxException {
      rnG_2 var6 = var0.super_().R();
      int var7 = 0;

      for (String var9 : var1) {
         rAa_1 var10 = var6.break_(var9, var2);

         for (String var12 : var4) {
            rAa_1 var13 = var6.break_(var12, var5);
            var3.apply(var10, var13);
         }

         var7 += var10.break_();
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.scoreboard.players.operation.success.single", var2.throws_(), var1.iterator().next(), var7), true);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.operation.success.multiple", var2.throws_(), var1.size()), true);
      }

      return var7;
   }

   private static int class_(gy_3 var0, Collection<String> var1, rnP_2 var2) throws CommandSyntaxException {
      if (var2.byte_() != rAi_1.byte_) {
         throw throws_.create();
      } else {
         rnG_2 var3 = var0.super_().R();
         int var4 = 0;

         for (String var6 : var1) {
            rAa_1 var7 = var3.break_(var6, var2);
            if (var7.catch_()) {
               var7.class_(false);
               var4++;
            }
         }

         if (var4 == 0) {
            throw protected_.create();
         } else {
            if (var1.size() == 1) {
               var0.class_(new rgn_3("commands.scoreboard.players.enable.success.single", var2.throws_(), var1.iterator().next()), true);
            } else {
               var0.class_(new rgn_3("commands.scoreboard.players.enable.success.multiple", var2.throws_(), var1.size()), true);
            }

            return var4;
         }
      }
   }

   private static int class_(gy_3 var0, Collection<String> var1, rnP_2 var2, int var3) {
      rnG_2 var4 = var0.super_().R();

      for (String var6 : var1) {
         rAa_1 var7 = var4.break_(var6, var2);
         var7.break_(var3);
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.scoreboard.players.set.success.single", var2.throws_(), var1.iterator().next(), var3), true);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.set.success.multiple", var2.throws_(), var1.size(), var3), true);
      }

      return var3 * var1.size();
   }

   private static int class_(gy_3 var0, Collection<String> var1) {
      rnG_2 var2 = var0.super_().R();

      for (String var4 : var1) {
         var2.byte_(var4, (rnP_2)null);
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.scoreboard.players.reset.all.single", var1.iterator().next()), true);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.reset.all.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int class_(gy_3 var0, int var1, rnP_2 var2) throws CommandSyntaxException {
      rnG_2 var3 = var0.super_().R();
      if (var3.class_(var1) == var2) {
         throw byte_.create();
      } else {
         var3.class_(var1, var2);
         var0.class_(new rgn_3("commands.scoreboard.objectives.display.set", rns_3.catch_()[var1], var2.protected_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, int var1) throws CommandSyntaxException {
      rnG_2 var2 = var0.super_().R();
      if (var2.class_(var1) == null) {
         throw break_.create();
      } else {
         var2.class_(var1, (rnP_2)null);
         var0.class_(new rgn_3("commands.scoreboard.objectives.display.cleared", rns_3.catch_()[var1]), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rnP_2 var1, rgP_2 var2) {
      if (!var1.protected_().equals(var2)) {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.scoreboard.objectives.modify.displayname", var1.break_(), var1.throws_()), true);
      }

      return 0;
   }

   private static int class_(gy_3 var0, String var1) {
      Map var2 = var0.super_().R().protected_(var1);
      if (var2.isEmpty()) {
         var0.class_(new rgn_3("commands.scoreboard.players.list.entity.empty", var1), false);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.list.entity.success", var1, var2.size()), false);

         for (Entry var4 : var2.entrySet()) {
            var0.class_(new rgn_3("commands.scoreboard.players.list.entity.entry", ((rnP_2)var4.getKey()).throws_(), ((rAa_1)var4.getValue()).break_()), false);
         }
      }

      return var2.size();
   }

   private static int break_(gy_3 var0, Collection<String> var1, rnP_2 var2, int var3) {
      rnG_2 var4 = var0.super_().R();
      int var5 = 0;

      for (String var7 : var1) {
         rAa_1 var8 = var4.break_(var7, var2);
         var8.break_(var8.break_() + var3);
         var5 += var8.break_();
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.scoreboard.players.add.success.single", var3, var2.throws_(), var1.iterator().next(), var5), true);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.add.success.multiple", var3, var2.throws_(), var1.size()), true);
      }

      return var5;
   }

   private static int break_(gy_3 var0, Collection<String> var1, rnP_2 var2) {
      rnG_2 var3 = var0.super_().R();

      for (String var5 : var1) {
         var3.byte_(var5, var2);
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.scoreboard.players.reset.specific.single", var2.throws_(), var1.iterator().next()), true);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.players.reset.specific.multiple", var2.throws_(), var1.size()), true);
      }

      return var1.size();
   }

   private static int break_(gy_3 var0) {
      Collection var1 = var0.super_().R().class_();
      if (var1.isEmpty()) {
         var0.class_(new rgn_3("commands.scoreboard.objectives.list.empty"), false);
      } else {
         var0.class_(new rgn_3("commands.scoreboard.objectives.list.success", var1.size(), rgv_3.break_(var1, rnP_2::throws_)), false);
      }

      return var1.size();
   }
}
