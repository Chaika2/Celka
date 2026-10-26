package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class YD {
   private static final SuggestionProvider<gy_3> id_class = (var0, var1) -> {
      Collection var2 = ((gy_3)var0.getSource()).id_super().t().id_class();
      return gR_2.id_class(var2.stream().map(OT::id_private), var1);
   };

   private static int id_class(gy_3 var0, Collection<rhN_2> var1, YU var2, OT var3, String var4) {
      int var5 = 0;
      if (!var3.id_case().containsKey(var4)) {
         throw new gH_2(new rgn_3("commands.advancement.criterionNotFound", var3.id_finally(), var4));
      } else {
         for (rhN_2 var7 : var1) {
            if (var2.id_class(var7, var3, var4)) {
               var5++;
            }
         }

         if (var5 == 0) {
            if (var1.size() == 1) {
               throw new gH_2(new rgn_3(var2.id_class() + ".criterion.to.one.failure", var4, var3.id_finally(), ((rhN_2)var1.iterator().next()).L_()));
            } else {
               throw new gH_2(new rgn_3(var2.id_class() + ".criterion.to.many.failure", var4, var3.id_finally(), var1.size()));
            }
         } else {
            if (var1.size() == 1) {
               var0.id_class(new rgn_3(var2.id_class() + ".criterion.to.one.success", var4, var3.id_finally(), ((rhN_2)var1.iterator().next()).L_()), true);
            } else {
               var0.id_class(new rgn_3(var2.id_class() + ".criterion.to.many.success", var4, var3.id_finally(), var1.size()), true);
            }

            return var5;
         }
      }
   }

   private static int id_class(gy_3 var0, Collection<rhN_2> var1, YU var2, Collection<OT> var3) {
      int var4 = 0;

      for (rhN_2 var6 : var1) {
         var4 += var2.id_class(var6, var3);
      }

      if (var4 == 0) {
         if (var3.size() == 1) {
            if (var1.size() == 1) {
               throw new gH_2(
                  new rgn_3(var2.id_class() + ".one.to.one.failure", ((OT)var3.iterator().next()).id_finally(), ((rhN_2)var1.iterator().next()).L_())
               );
            } else {
               throw new gH_2(new rgn_3(var2.id_class() + ".one.to.many.failure", ((OT)var3.iterator().next()).id_finally(), var1.size()));
            }
         } else if (var1.size() == 1) {
            throw new gH_2(new rgn_3(var2.id_class() + ".many.to.one.failure", var3.size(), ((rhN_2)var1.iterator().next()).L_()));
         } else {
            throw new gH_2(new rgn_3(var2.id_class() + ".many.to.many.failure", var3.size(), var1.size()));
         }
      } else {
         if (var3.size() == 1) {
            if (var1.size() == 1) {
               var0.id_class(
                  new rgn_3(var2.id_class() + ".one.to.one.success", ((OT)var3.iterator().next()).id_finally(), ((rhN_2)var1.iterator().next()).L_()), true
               );
            } else {
               var0.id_class(new rgn_3(var2.id_class() + ".one.to.many.success", ((OT)var3.iterator().next()).id_finally(), var1.size()), true);
            }
         } else if (var1.size() == 1) {
            var0.id_class(new rgn_3(var2.id_class() + ".many.to.one.success", var3.size(), ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.id_class(new rgn_3(var2.id_class() + ".many.to.many.success", var3.size(), var1.size()), true);
         }

         return var4;
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("advancement").requires(var0x -> var0x.id_class(2)))
               .then(
                  gp_3.id_class("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                          "targets", RZ.id_protected()
                                       )
                                       .then(
                                          gp_3.id_class("only")
                                             .then(
                                                ((RequiredArgumentBuilder)gp_3.id_class("advancement", Ym_1.id_class())
                                                      .suggests(id_class)
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               RZ.id_case(var0x, "targets"),
                                                               YU.GRANT,
                                                               id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.ONLY)
                                                            )
                                                      ))
                                                   .then(
                                                      gp_3.id_class("criterion", StringArgumentType.greedyString())
                                                         .suggests((var0x, var1) -> gR_2.id_break(Ym_1.id_class(var0x, "advancement").id_case().keySet(), var1))
                                                         .executes(
                                                            var0x -> id_class(
                                                                  (gy_3)var0x.getSource(),
                                                                  RZ.id_case(var0x, "targets"),
                                                                  YU.GRANT,
                                                                  Ym_1.id_class(var0x, "advancement"),
                                                                  StringArgumentType.getString(var0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("from")
                                          .then(
                                             gp_3.id_class("advancement", Ym_1.id_class())
                                                .suggests(id_class)
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         RZ.id_case(var0x, "targets"),
                                                         YU.GRANT,
                                                         id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.FROM)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("until")
                                       .then(
                                          gp_3.id_class("advancement", Ym_1.id_class())
                                             .suggests(id_class)
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.id_case(var0x, "targets"),
                                                      YU.GRANT,
                                                      id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.UNTIL)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("through")
                                    .then(
                                       gp_3.id_class("advancement", Ym_1.id_class())
                                          .suggests(id_class)
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_case(var0x, "targets"),
                                                   YU.GRANT,
                                                   id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.THROUGH)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("everything")
                                 .executes(
                                    var0x -> id_class(
                                          (gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), YU.GRANT, ((gy_3)var0x.getSource()).id_super().t().id_class()
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                       "targets", RZ.id_protected()
                                    )
                                    .then(
                                       gp_3.id_class("only")
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.id_class("advancement", Ym_1.id_class())
                                                   .suggests(id_class)
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RZ.id_case(var0x, "targets"),
                                                            YU.REVOKE,
                                                            id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.ONLY)
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("criterion", StringArgumentType.greedyString())
                                                      .suggests((var0x, var1) -> gR_2.id_break(Ym_1.id_class(var0x, "advancement").id_case().keySet(), var1))
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               RZ.id_case(var0x, "targets"),
                                                               YU.REVOKE,
                                                               Ym_1.id_class(var0x, "advancement"),
                                                               StringArgumentType.getString(var0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("from")
                                       .then(
                                          gp_3.id_class("advancement", Ym_1.id_class())
                                             .suggests(id_class)
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.id_case(var0x, "targets"),
                                                      YU.REVOKE,
                                                      id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.FROM)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("until")
                                    .then(
                                       gp_3.id_class("advancement", Ym_1.id_class())
                                          .suggests(id_class)
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_case(var0x, "targets"),
                                                   YU.REVOKE,
                                                   id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.UNTIL)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("through")
                                 .then(
                                    gp_3.id_class("advancement", Ym_1.id_class())
                                       .suggests(id_class)
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(),
                                                RZ.id_case(var0x, "targets"),
                                                YU.REVOKE,
                                                id_class(Ym_1.id_class(var0x, "advancement"), Yi_1.THROUGH)
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("everything")
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), YU.REVOKE, ((gy_3)var0x.getSource()).id_super().t().id_class()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static void id_class(OT var0, List<OT> var1) {
      for (OT var3 : var0.id_throws()) {
         var1.add(var3);
         id_class(var3, var1);
      }
   }

   private static List<OT> id_class(OT var0, Yi_1 var1) {
      ArrayList var2 = Lists.newArrayList();
      if (var1.includesParents) {
         for (OT var3 = var0.id_break(); var3 != null; var3 = var3.id_break()) {
            var2.add(var3);
         }
      }

      var2.add(var0);
      if (var1.includesChildren) {
         id_class(var0, var2);
      }

      return var2;
   }
}
