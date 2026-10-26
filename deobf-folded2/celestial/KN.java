package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KN {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.team.add.duplicate"));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.team.add.longName", var0));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType(new rgn_3("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType(new rgn_3("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType id_private = new SimpleCommandExceptionType(
      new rgn_3("commands.team.option.seeFriendlyInvisibles.alreadyEnabled")
   );
   private static final SimpleCommandExceptionType id_implements = new SimpleCommandExceptionType(
      new rgn_3("commands.team.option.seeFriendlyInvisibles.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType id_finally = new SimpleCommandExceptionType(new rgn_3("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType id_extends = new SimpleCommandExceptionType(
      new rgn_3("commands.team.option.deathMessageVisibility.unchanged")
   );
   private static final SimpleCommandExceptionType id_native = new SimpleCommandExceptionType(new rgn_3("commands.team.option.collisionRule.unchanged"));

   private static int id_byte(gy_3 var0, rnB_2 var1, rgP_2 var2) {
      var1.id_byte(var2);
      var0.id_class(new rgn_3("commands.team.option.suffix.success", var2), false);
      return 1;
   }

   private static int id_byte(gy_3 var0, rnB_2 var1) {
      Collection var2 = var1.id_case();
      if (var2.isEmpty()) {
         var0.id_class(new rgn_3("commands.team.list.members.empty", var1.id_byte()), false);
      } else {
         var0.id_class(new rgn_3("commands.team.list.members.success", var1.id_byte(), var2.size(), rgv_3.id_class(var2)), false);
      }

      return var2.size();
   }

   private static int id_class(gy_3 var0, rnB_2 var1, rnX_2 var2) throws CommandSyntaxException {
      if (var1.id_implements() == var2) {
         throw id_finally.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.team.option.nametagVisibility.success", var1.id_byte(), var2.id_class()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0) {
      Collection var1 = var0.id_super().R().id_throws();
      if (var1.isEmpty()) {
         var0.id_class(new rgn_3("commands.team.list.teams.empty"), false);
      } else {
         var0.id_class(new rgn_3("commands.team.list.teams.success", var1.size(), rgv_3.id_break(var1, rnB_2::id_byte)), false);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, String var1, rgP_2 var2) throws CommandSyntaxException {
      rnG_2 var3 = var0.id_super().R();
      if (var3.id_throws(var1) != null) {
         throw id_class.create();
      } else if (var1.length() > 16) {
         throw id_break.create(16);
      } else {
         rnB_2 var4 = var3.id_case(var1);
         var4.id_class(var2);
         var0.id_class(new rgn_3("commands.team.add.success", var4.id_byte()), true);
         return var3.id_throws().size();
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                    "team"
                                 )
                                 .requires(var0x -> var0x.id_class(2)))
                              .then(
                                 ((LiteralArgumentBuilder)gp_3.id_class("list").executes(var0x -> id_class((gy_3)var0x.getSource())))
                                    .then(
                                       gp_3.id_class("team", Yp_1.id_class()).executes(var0x -> id_byte((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team")))
                                    )
                              ))
                           .then(
                              gp_3.id_class("add")
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.id_class("team", StringArgumentType.word())
                                          .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "team"))))
                                       .then(
                                          gp_3.id_class("displayName", RQ.id_class())
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "team"), RQ.id_class(var0x, "displayName")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("remove")
                              .then(gp_3.id_class("team", Yp_1.id_class()).executes(var0x -> id_break((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"))))
                        ))
                     .then(
                        gp_3.id_class("empty")
                           .then(gp_3.id_class("team", Yp_1.id_class()).executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"))))
                     ))
                  .then(
                     gp_3.id_class("join")
                        .then(
                           ((RequiredArgumentBuilder)gp_3.id_class("team", Yp_1.id_class())
                                 .executes(
                                    var0x -> id_class(
                                          (gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), Collections.singleton(((gy_3)var0x.getSource()).id_int().i())
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("members", Yv_1.id_break())
                                    .suggests(Yv_1.id_class)
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), Yv_1.id_byte(var0x, "members")))
                              )
                        )
                  ))
               .then(
                  gp_3.id_class("leave")
                     .then(
                        gp_3.id_class("members", Yv_1.id_break())
                           .suggests(Yv_1.id_class)
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), Yv_1.id_byte(var0x, "members")))
                     )
               ))
            .then(
               gp_3.id_class("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                                   "team", Yp_1.id_class()
                                                )
                                                .then(
                                                   gp_3.id_class("displayName")
                                                      .then(
                                                         gp_3.id_class("displayName", RQ.id_class())
                                                            .executes(
                                                               var0x -> id_class(
                                                                     (gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), RQ.id_class(var0x, "displayName")
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.id_class("color")
                                                   .then(
                                                      gp_3.id_class("value", RW.id_class())
                                                         .executes(
                                                            var0x -> id_class(
                                                                  (gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), RW.id_class(var0x, "value")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.id_class("friendlyFire")
                                                .then(
                                                   gp_3.id_class("allowed", BoolArgumentType.bool())
                                                      .executes(
                                                         var0x -> id_break(
                                                               (gy_3)var0x.getSource(),
                                                               Yp_1.id_class(var0x, "team"),
                                                               BoolArgumentType.getBool(var0x, "allowed")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("seeFriendlyInvisibles")
                                             .then(
                                                gp_3.id_class("allowed", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), BoolArgumentType.getBool(var0x, "allowed")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("nametagVisibility")
                                                   .then(
                                                      gp_3.id_class("never")
                                                         .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.NEVER))
                                                   ))
                                                .then(
                                                   gp_3.id_class("hideForOtherTeams")
                                                      .executes(
                                                         var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.HIDE_FOR_OTHER_TEAMS)
                                                      )
                                                ))
                                             .then(
                                                gp_3.id_class("hideForOwnTeam")
                                                   .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.HIDE_FOR_OWN_TEAM))
                                             ))
                                          .then(
                                             gp_3.id_class("always")
                                                .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.ALWAYS))
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("deathMessageVisibility")
                                                .then(
                                                   gp_3.id_class("never")
                                                      .executes(var0x -> id_break((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.NEVER))
                                                ))
                                             .then(
                                                gp_3.id_class("hideForOtherTeams")
                                                   .executes(
                                                      var0x -> id_break((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.HIDE_FOR_OTHER_TEAMS)
                                                   )
                                             ))
                                          .then(
                                             gp_3.id_class("hideForOwnTeam")
                                                .executes(var0x -> id_break((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.HIDE_FOR_OWN_TEAM))
                                          ))
                                       .then(
                                          gp_3.id_class("always")
                                             .executes(var0x -> id_break((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnX_2.ALWAYS))
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("collisionRule")
                                             .then(
                                                gp_3.id_class("never")
                                                   .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnh_3.NEVER))
                                             ))
                                          .then(
                                             gp_3.id_class("pushOwnTeam")
                                                .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnh_3.PUSH_OWN_TEAM))
                                          ))
                                       .then(
                                          gp_3.id_class("pushOtherTeams")
                                             .executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnh_3.PUSH_OTHER_TEAMS))
                                       ))
                                    .then(
                                       gp_3.id_class("always").executes(var0x -> id_class((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), rnh_3.ALWAYS))
                                    )
                              ))
                           .then(
                              gp_3.id_class("prefix")
                                 .then(
                                    gp_3.id_class("prefix", RQ.id_class())
                                       .executes(var0x -> id_break((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), RQ.id_class(var0x, "prefix")))
                                 )
                           ))
                        .then(
                           gp_3.id_class("suffix")
                              .then(
                                 gp_3.id_class("suffix", RQ.id_class())
                                    .executes(var0x -> id_byte((gy_3)var0x.getSource(), Yp_1.id_class(var0x, "team"), RQ.id_class(var0x, "suffix")))
                              )
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, Collection<String> var1) {
      rnG_2 var2 = var0.id_super().R();

      for (String var4 : var1) {
         var2.id_catch(var4);
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.team.leave.success.single", var1.iterator().next()), true);
      } else {
         var0.id_class(new rgn_3("commands.team.leave.success.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, rnB_2 var1, Collection<String> var2) {
      rnG_2 var3 = var0.id_super().R();

      for (String var5 : var2) {
         var3.id_class(var5, var1);
      }

      if (var2.size() == 1) {
         var0.id_class(new rgn_3("commands.team.join.success.single", var2.iterator().next(), var1.id_byte()), true);
      } else {
         var0.id_class(new rgn_3("commands.team.join.success.multiple", var2.size(), var1.id_byte()), true);
      }

      return var2.size();
   }

   private static int id_class(gy_3 var0, rnB_2 var1, rgP_2 var2) throws CommandSyntaxException {
      if (var1.id_break().equals(var2)) {
         throw id_protected.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.team.option.name.success", var1.id_byte()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnB_2 var1, rgF_2 var2) throws CommandSyntaxException {
      if (var1.id_volatile() == var2) {
         throw id_throws.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.team.option.color.success", var1.id_byte(), var2.id_throws()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnB_2 var1) throws CommandSyntaxException {
      rnG_2 var2 = var0.id_super().R();
      ArrayList var3 = Lists.newArrayList(var1.id_case());
      if (var3.isEmpty()) {
         throw id_byte.create();
      } else {
         for (String var5 : var3) {
            var2.id_break(var5, var1);
         }

         var0.id_class(new rgn_3("commands.team.empty.success", var3.size(), var1.id_byte()), true);
         return var3.size();
      }
   }

   private static int id_class(gy_3 var0, rnB_2 var1, rnh_3 var2) throws CommandSyntaxException {
      if (var1.id_extends() == var2) {
         throw id_native.create();
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.team.option.collisionRule.success", var1.id_byte(), var2.id_class()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, rnB_2 var1, boolean var2) throws CommandSyntaxException {
      if (var1.id_private() == var2) {
         if (var2) {
            throw id_private.create();
         } else {
            throw id_implements.create();
         }
      } else {
         var1.id_break(var2);
         var0.id_class(new rgn_3("commands.team.option.seeFriendlyInvisibles." + (var2 ? "enabled" : "disabled"), var1.id_byte()), true);
         return 0;
      }
   }

   private static int id_class(gy_3 var0, String var1) throws CommandSyntaxException {
      return id_class(var0, var1, new rgN_2(var1));
   }

   private static int id_break(gy_3 var0, rnB_2 var1, rnX_2 var2) throws CommandSyntaxException {
      if (var1.id_finally() == var2) {
         throw id_extends.create();
      } else {
         var1.id_break(var2);
         var0.id_class(new rgn_3("commands.team.option.deathMessageVisibility.success", var1.id_byte(), var2.id_class()), true);
         return 0;
      }
   }

   private static int id_break(gy_3 var0, rnB_2 var1, boolean var2) throws CommandSyntaxException {
      if (var1.id_catch() == var2) {
         if (var2) {
            throw id_case.create();
         } else {
            throw id_catch.create();
         }
      } else {
         var1.id_class(var2);
         var0.id_class(new rgn_3("commands.team.option.friendlyfire." + (var2 ? "enabled" : "disabled"), var1.id_byte()), true);
         return 0;
      }
   }

   private static int id_break(gy_3 var0, rnB_2 var1) {
      rnG_2 var2 = var0.id_super().R();
      var2.id_class(var1);
      var0.id_class(new rgn_3("commands.team.remove.success", var1.id_byte()), true);
      return var2.id_throws().size();
   }

   private static int id_break(gy_3 var0, rnB_2 var1, rgP_2 var2) {
      var1.id_break(var2);
      var0.id_class(new rgn_3("commands.team.option.prefix.success", var2), false);
      return 1;
   }
}
