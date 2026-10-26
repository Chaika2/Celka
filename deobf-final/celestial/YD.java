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
   private static final SuggestionProvider<gy_3> class_ = (var0, var1) -> {
      Collection var2 = ((gy_3)var0.getSource()).super_().t().class_();
      return gR_2.class_(var2.stream().map(OT::private_), var1);
   };

   private static int class_(gy_3 var0, Collection<rhN_2> var1, YU var2, OT var3, String var4) {
      int var5 = 0;
      if (!var3.case_().containsKey(var4)) {
         throw new gH_2(new rgn_3("commands.advancement.criterionNotFound", var3.finally_(), var4));
      } else {
         for (rhN_2 var7 : var1) {
            if (var2.class_(var7, var3, var4)) {
               var5++;
            }
         }

         if (var5 == 0) {
            if (var1.size() == 1) {
               throw new gH_2(new rgn_3(var2.class_() + ".criterion.to.one.failure", var4, var3.finally_(), ((rhN_2)var1.iterator().next()).L_()));
            } else {
               throw new gH_2(new rgn_3(var2.class_() + ".criterion.to.many.failure", var4, var3.finally_(), var1.size()));
            }
         } else {
            if (var1.size() == 1) {
               var0.class_(new rgn_3(var2.class_() + ".criterion.to.one.success", var4, var3.finally_(), ((rhN_2)var1.iterator().next()).L_()), true);
            } else {
               var0.class_(new rgn_3(var2.class_() + ".criterion.to.many.success", var4, var3.finally_(), var1.size()), true);
            }

            return var5;
         }
      }
   }

   private static int class_(gy_3 var0, Collection<rhN_2> var1, YU var2, Collection<OT> var3) {
      int var4 = 0;

      for (rhN_2 var6 : var1) {
         var4 += var2.class_(var6, var3);
      }

      if (var4 == 0) {
         if (var3.size() == 1) {
            if (var1.size() == 1) {
               throw new gH_2(new rgn_3(var2.class_() + ".one.to.one.failure", ((OT)var3.iterator().next()).finally_(), ((rhN_2)var1.iterator().next()).L_()));
            } else {
               throw new gH_2(new rgn_3(var2.class_() + ".one.to.many.failure", ((OT)var3.iterator().next()).finally_(), var1.size()));
            }
         } else if (var1.size() == 1) {
            throw new gH_2(new rgn_3(var2.class_() + ".many.to.one.failure", var3.size(), ((rhN_2)var1.iterator().next()).L_()));
         } else {
            throw new gH_2(new rgn_3(var2.class_() + ".many.to.many.failure", var3.size(), var1.size()));
         }
      } else {
         if (var3.size() == 1) {
            if (var1.size() == 1) {
               var0.class_(
                  new rgn_3(var2.class_() + ".one.to.one.success", ((OT)var3.iterator().next()).finally_(), ((rhN_2)var1.iterator().next()).L_()), true
               );
            } else {
               var0.class_(new rgn_3(var2.class_() + ".one.to.many.success", ((OT)var3.iterator().next()).finally_(), var1.size()), true);
            }
         } else if (var1.size() == 1) {
            var0.class_(new rgn_3(var2.class_() + ".many.to.one.success", var3.size(), ((rhN_2)var1.iterator().next()).L_()), true);
         } else {
            var0.class_(new rgn_3(var2.class_() + ".many.to.many.success", var3.size(), var1.size()), true);
         }

         return var4;
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("advancement").requires(var0x -> var0x.class_(2)))
               .then(
                  gp_3.class_("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                          "targets", RZ.protected_()
                                       )
                                       .then(
                                          gp_3.class_("only")
                                             .then(
                                                ((RequiredArgumentBuilder)gp_3.class_("advancement", Ym_1.class_())
                                                      .suggests(class_)
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               RZ.case_(var0x, "targets"),
                                                               YU.GRANT,
                                                               class_(Ym_1.class_(var0x, "advancement"), Yi_1.ONLY)
                                                            )
                                                      ))
                                                   .then(
                                                      gp_3.class_("criterion", StringArgumentType.greedyString())
                                                         .suggests((var0x, var1) -> gR_2.break_(Ym_1.class_(var0x, "advancement").case_().keySet(), var1))
                                                         .executes(
                                                            var0x -> class_(
                                                                  (gy_3)var0x.getSource(),
                                                                  RZ.case_(var0x, "targets"),
                                                                  YU.GRANT,
                                                                  Ym_1.class_(var0x, "advancement"),
                                                                  StringArgumentType.getString(var0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("from")
                                          .then(
                                             gp_3.class_("advancement", Ym_1.class_())
                                                .suggests(class_)
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         RZ.case_(var0x, "targets"),
                                                         YU.GRANT,
                                                         class_(Ym_1.class_(var0x, "advancement"), Yi_1.FROM)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("until")
                                       .then(
                                          gp_3.class_("advancement", Ym_1.class_())
                                             .suggests(class_)
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.case_(var0x, "targets"),
                                                      YU.GRANT,
                                                      class_(Ym_1.class_(var0x, "advancement"), Yi_1.UNTIL)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("through")
                                    .then(
                                       gp_3.class_("advancement", Ym_1.class_())
                                          .suggests(class_)
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.case_(var0x, "targets"),
                                                   YU.GRANT,
                                                   class_(Ym_1.class_(var0x, "advancement"), Yi_1.THROUGH)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("everything")
                                 .executes(
                                    var0x -> class_(
                                          (gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), YU.GRANT, ((gy_3)var0x.getSource()).super_().t().class_()
                                       )
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                       "targets", RZ.protected_()
                                    )
                                    .then(
                                       gp_3.class_("only")
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.class_("advancement", Ym_1.class_())
                                                   .suggests(class_)
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RZ.case_(var0x, "targets"),
                                                            YU.REVOKE,
                                                            class_(Ym_1.class_(var0x, "advancement"), Yi_1.ONLY)
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("criterion", StringArgumentType.greedyString())
                                                      .suggests((var0x, var1) -> gR_2.break_(Ym_1.class_(var0x, "advancement").case_().keySet(), var1))
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               RZ.case_(var0x, "targets"),
                                                               YU.REVOKE,
                                                               Ym_1.class_(var0x, "advancement"),
                                                               StringArgumentType.getString(var0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("from")
                                       .then(
                                          gp_3.class_("advancement", Ym_1.class_())
                                             .suggests(class_)
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.case_(var0x, "targets"),
                                                      YU.REVOKE,
                                                      class_(Ym_1.class_(var0x, "advancement"), Yi_1.FROM)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("until")
                                    .then(
                                       gp_3.class_("advancement", Ym_1.class_())
                                          .suggests(class_)
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.case_(var0x, "targets"),
                                                   YU.REVOKE,
                                                   class_(Ym_1.class_(var0x, "advancement"), Yi_1.UNTIL)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("through")
                                 .then(
                                    gp_3.class_("advancement", Ym_1.class_())
                                       .suggests(class_)
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(),
                                                RZ.case_(var0x, "targets"),
                                                YU.REVOKE,
                                                class_(Ym_1.class_(var0x, "advancement"), Yi_1.THROUGH)
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("everything")
                              .executes(
                                 var0x -> class_(
                                       (gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), YU.REVOKE, ((gy_3)var0x.getSource()).super_().t().class_()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static void class_(OT var0, List<OT> var1) {
      for (OT var3 : var0.throws_()) {
         var1.add(var3);
         class_(var3, var1);
      }
   }

   private static List<OT> class_(OT var0, Yi_1 var1) {
      ArrayList var2 = Lists.newArrayList();
      if (var1.includesParents) {
         for (OT var3 = var0.break_(); var3 != null; var3 = var3.break_()) {
            var2.add(var3);
         }
      }

      var2.add(var0);
      if (var1.includesChildren) {
         class_(var0, var2);
      }

      return var2;
   }
}
