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
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.team.add.duplicate"));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.team.add.longName", var0));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType case_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType catch_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType private_ = new SimpleCommandExceptionType(
      new rgn_3("commands.team.option.seeFriendlyInvisibles.alreadyEnabled")
   );
   private static final SimpleCommandExceptionType implements_ = new SimpleCommandExceptionType(
      new rgn_3("commands.team.option.seeFriendlyInvisibles.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType finally_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType extends_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType native_ = new SimpleCommandExceptionType(new rgn_3("commands.team.option.collisionRule.unchanged"));

   private static int byte_(gy_3 var0, rnB_2 var1, rgP_2 var2) {
      var1.byte_(var2);
      var0.class_(new rgn_3("commands.team.option.suffix.success", var2), false);
      return 1;
   }

   private static int byte_(gy_3 var0, rnB_2 var1) {
      Collection var2 = var1.case_();
      if (var2.isEmpty()) {
         var0.class_(new rgn_3("commands.team.list.members.empty", var1.byte_()), false);
      } else {
         var0.class_(new rgn_3("commands.team.list.members.success", var1.byte_(), var2.size(), rgv_3.class_(var2)), false);
      }

      return var2.size();
   }

   private static int class_(gy_3 var0, rnB_2 var1, rnX_2 var2) throws CommandSyntaxException {
      if (var1.implements_() == var2) {
         throw finally_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.team.option.nametagVisibility.success", var1.byte_(), var2.class_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0) {
      Collection var1 = var0.super_().R().throws_();
      if (var1.isEmpty()) {
         var0.class_(new rgn_3("commands.team.list.teams.empty"), false);
      } else {
         var0.class_(new rgn_3("commands.team.list.teams.success", var1.size(), rgv_3.break_(var1, rnB_2::byte_)), false);
      }

      return var1.size();
   }

   private static int class_(gy_3 var0, String var1, rgP_2 var2) throws CommandSyntaxException {
      rnG_2 var3 = var0.super_().R();
      if (var3.throws_(var1) != null) {
         throw class_.create();
      } else if (var1.length() > 16) {
         throw break_.create(16);
      } else {
         rnB_2 var4 = var3.case_(var1);
         var4.class_(var2);
         var0.class_(new rgn_3("commands.team.add.success", var4.byte_()), true);
         return var3.throws_().size();
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                    "team"
                                 )
                                 .requires(var0x -> var0x.class_(2)))
                              .then(
                                 ((LiteralArgumentBuilder)gp_3.class_("list").executes(var0x -> class_((gy_3)var0x.getSource())))
                                    .then(gp_3.class_("team", Yp_1.class_()).executes(var0x -> byte_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"))))
                              ))
                           .then(
                              gp_3.class_("add")
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.class_("team", StringArgumentType.word())
                                          .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "team"))))
                                       .then(
                                          gp_3.class_("displayName", RQ.class_())
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "team"), RQ.class_(var0x, "displayName")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("remove")
                              .then(gp_3.class_("team", Yp_1.class_()).executes(var0x -> break_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"))))
                        ))
                     .then(
                        gp_3.class_("empty")
                           .then(gp_3.class_("team", Yp_1.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"))))
                     ))
                  .then(
                     gp_3.class_("join")
                        .then(
                           ((RequiredArgumentBuilder)gp_3.class_("team", Yp_1.class_())
                                 .executes(
                                    var0x -> class_(
                                          (gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), Collections.singleton(((gy_3)var0x.getSource()).int_().i())
                                       )
                                 ))
                              .then(
                                 gp_3.class_("members", Yv_1.break_())
                                    .suggests(Yv_1.class_)
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), Yv_1.byte_(var0x, "members")))
                              )
                        )
                  ))
               .then(
                  gp_3.class_("leave")
                     .then(
                        gp_3.class_("members", Yv_1.break_())
                           .suggests(Yv_1.class_)
                           .executes(var0x -> class_((gy_3)var0x.getSource(), Yv_1.byte_(var0x, "members")))
                     )
               ))
            .then(
               gp_3.class_("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                                   "team", Yp_1.class_()
                                                )
                                                .then(
                                                   gp_3.class_("displayName")
                                                      .then(
                                                         gp_3.class_("displayName", RQ.class_())
                                                            .executes(
                                                               var0x -> class_(
                                                                     (gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), RQ.class_(var0x, "displayName")
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.class_("color")
                                                   .then(
                                                      gp_3.class_("value", RW.class_())
                                                         .executes(
                                                            var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), RW.class_(var0x, "value"))
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.class_("friendlyFire")
                                                .then(
                                                   gp_3.class_("allowed", BoolArgumentType.bool())
                                                      .executes(
                                                         var0x -> break_(
                                                               (gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), BoolArgumentType.getBool(var0x, "allowed")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("seeFriendlyInvisibles")
                                             .then(
                                                gp_3.class_("allowed", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), BoolArgumentType.getBool(var0x, "allowed")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("nametagVisibility")
                                                   .then(
                                                      gp_3.class_("never")
                                                         .executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.NEVER))
                                                   ))
                                                .then(
                                                   gp_3.class_("hideForOtherTeams")
                                                      .executes(
                                                         var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.HIDE_FOR_OTHER_TEAMS)
                                                      )
                                                ))
                                             .then(
                                                gp_3.class_("hideForOwnTeam")
                                                   .executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.HIDE_FOR_OWN_TEAM))
                                             ))
                                          .then(
                                             gp_3.class_("always").executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.ALWAYS))
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("deathMessageVisibility")
                                                .then(
                                                   gp_3.class_("never")
                                                      .executes(var0x -> break_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.NEVER))
                                                ))
                                             .then(
                                                gp_3.class_("hideForOtherTeams")
                                                   .executes(var0x -> break_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.HIDE_FOR_OTHER_TEAMS))
                                             ))
                                          .then(
                                             gp_3.class_("hideForOwnTeam")
                                                .executes(var0x -> break_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.HIDE_FOR_OWN_TEAM))
                                          ))
                                       .then(gp_3.class_("always").executes(var0x -> break_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnX_2.ALWAYS)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("collisionRule")
                                             .then(
                                                gp_3.class_("never")
                                                   .executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnh_3.NEVER))
                                             ))
                                          .then(
                                             gp_3.class_("pushOwnTeam")
                                                .executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnh_3.PUSH_OWN_TEAM))
                                          ))
                                       .then(
                                          gp_3.class_("pushOtherTeams")
                                             .executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnh_3.PUSH_OTHER_TEAMS))
                                       ))
                                    .then(gp_3.class_("always").executes(var0x -> class_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), rnh_3.ALWAYS)))
                              ))
                           .then(
                              gp_3.class_("prefix")
                                 .then(
                                    gp_3.class_("prefix", RQ.class_())
                                       .executes(var0x -> break_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), RQ.class_(var0x, "prefix")))
                                 )
                           ))
                        .then(
                           gp_3.class_("suffix")
                              .then(
                                 gp_3.class_("suffix", RQ.class_())
                                    .executes(var0x -> byte_((gy_3)var0x.getSource(), Yp_1.class_(var0x, "team"), RQ.class_(var0x, "suffix")))
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, Collection<String> var1) {
      rnG_2 var2 = var0.super_().R();

      for (String var4 : var1) {
         var2.catch_(var4);
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.team.leave.success.single", var1.iterator().next()), true);
      } else {
         var0.class_(new rgn_3("commands.team.leave.success.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int class_(gy_3 var0, rnB_2 var1, Collection<String> var2) {
      rnG_2 var3 = var0.super_().R();

      for (String var5 : var2) {
         var3.class_(var5, var1);
      }

      if (var2.size() == 1) {
         var0.class_(new rgn_3("commands.team.join.success.single", var2.iterator().next(), var1.byte_()), true);
      } else {
         var0.class_(new rgn_3("commands.team.join.success.multiple", var2.size(), var1.byte_()), true);
      }

      return var2.size();
   }

   private static int class_(gy_3 var0, rnB_2 var1, rgP_2 var2) throws CommandSyntaxException {
      if (var1.break_().equals(var2)) {
         throw protected_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.team.option.name.success", var1.byte_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rnB_2 var1, rgF_2 var2) throws CommandSyntaxException {
      if (var1.volatile_() == var2) {
         throw throws_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.team.option.color.success", var1.byte_(), var2.throws_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rnB_2 var1) throws CommandSyntaxException {
      rnG_2 var2 = var0.super_().R();
      ArrayList var3 = Lists.newArrayList(var1.case_());
      if (var3.isEmpty()) {
         throw byte_.create();
      } else {
         for (String var5 : var3) {
            var2.break_(var5, var1);
         }

         var0.class_(new rgn_3("commands.team.empty.success", var3.size(), var1.byte_()), true);
         return var3.size();
      }
   }

   private static int class_(gy_3 var0, rnB_2 var1, rnh_3 var2) throws CommandSyntaxException {
      if (var1.extends_() == var2) {
         throw native_.create();
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.team.option.collisionRule.success", var1.byte_(), var2.class_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, rnB_2 var1, boolean var2) throws CommandSyntaxException {
      if (var1.private_() == var2) {
         if (var2) {
            throw private_.create();
         } else {
            throw implements_.create();
         }
      } else {
         var1.break_(var2);
         var0.class_(new rgn_3("commands.team.option.seeFriendlyInvisibles." + (var2 ? "enabled" : "disabled"), var1.byte_()), true);
         return 0;
      }
   }

   private static int class_(gy_3 var0, String var1) throws CommandSyntaxException {
      return class_(var0, var1, new rgN_2(var1));
   }

   private static int break_(gy_3 var0, rnB_2 var1, rnX_2 var2) throws CommandSyntaxException {
      if (var1.finally_() == var2) {
         throw extends_.create();
      } else {
         var1.break_(var2);
         var0.class_(new rgn_3("commands.team.option.deathMessageVisibility.success", var1.byte_(), var2.class_()), true);
         return 0;
      }
   }

   private static int break_(gy_3 var0, rnB_2 var1, boolean var2) throws CommandSyntaxException {
      if (var1.catch_() == var2) {
         if (var2) {
            throw case_.create();
         } else {
            throw catch_.create();
         }
      } else {
         var1.class_(var2);
         var0.class_(new rgn_3("commands.team.option.friendlyfire." + (var2 ? "enabled" : "disabled"), var1.byte_()), true);
         return 0;
      }
   }

   private static int break_(gy_3 var0, rnB_2 var1) {
      rnG_2 var2 = var0.super_().R();
      var2.class_(var1);
      var0.class_(new rgn_3("commands.team.remove.success", var1.byte_()), true);
      return var2.throws_().size();
   }

   private static int break_(gy_3 var0, rnB_2 var1, rgP_2 var2) {
      var1.break_(var2);
      var0.class_(new rgn_3("commands.team.option.prefix.success", var2), false);
      return 1;
   }
}
