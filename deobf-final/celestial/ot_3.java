package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ot_3 {
   public static final SuggestionProvider<gy_3> class_ = (var0, var1) -> {
      rzC_2 var2 = ((gy_3)var0.getSource()).super_().o();
      return gR_2.class_(var2.break_(), var1);
   };
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.drop.no_held_items", var0));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.drop.no_loot_table", var0));

   private static rXu_1 class_(gy_3 var0, rfH_2 var1) throws CommandSyntaxException {
      ryO_2 var2 = var0.final_().class_(var1);
      if (!(var2 instanceof rXu_1)) {
         throw oa_3.class_.create();
      } else {
         return (rXu_1)var2;
      }
   }

   private static int class_(CommandContext<gy_3> var0, rqO_2 var1, rzr_3 var2, of_3 var3) throws CommandSyntaxException {
      gy_3 var4 = (gy_3)var0.getSource();
      rzL_2 var5 = var4.super_().o().class_(var1);
      List var6 = var5.class_(var2);
      return var3.accept(var0, var6, var1x -> class_(var4, var1x));
   }

   private static int class_(CommandContext<gy_3> var0, rqO_2 var1, rfH_2 var2, rdn_3 var3, of_3 var4) throws CommandSyntaxException {
      gy_3 var5 = (gy_3)var0.getSource();
      rzr_3 var6 = new rzP_2(var5.final_())
         .class_(rzQ_2.case_, rjU_2.class_((rja_3)var2))
         .class_(rzQ_2.implements_, var3)
         .break_(rzQ_2.class_, var5.package_())
         .class_(rzz_3.throws_);
      return class_(var0, var1, var6, var4);
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         class_(
            (LiteralArgumentBuilder)gp_3.class_("loot").requires(var0x -> var0x.class_(2)),
            (var0x, var1) -> var0x.then(
                     gp_3.class_("fish")
                        .then(
                           gp_3.class_("loot_table", Ym_1.class_())
                              .suggests(class_)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("pos", RM.class_())
                                             .executes(var1x -> class_(var1x, Ym_1.throws_(var1x, "loot_table"), RM.class_(var1x, "pos"), rdn_3.break_, var1)))
                                          .then(
                                             gp_3.class_("tool", RR.class_())
                                                .executes(
                                                   var1x -> class_(
                                                         var1x,
                                                         Ym_1.throws_(var1x, "loot_table"),
                                                         RM.class_(var1x, "pos"),
                                                         RR.class_(var1x, "tool").class_(1, false),
                                                         var1
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("mainhand")
                                             .executes(
                                                var1x -> class_(
                                                      var1x,
                                                      Ym_1.throws_(var1x, "loot_table"),
                                                      RM.class_(var1x, "pos"),
                                                      class_((gy_3)var1x.getSource(), rXQ.MAINHAND),
                                                      var1
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("offhand")
                                          .executes(
                                             var1x -> class_(
                                                   var1x,
                                                   Ym_1.throws_(var1x, "loot_table"),
                                                   RM.class_(var1x, "pos"),
                                                   class_((gy_3)var1x.getSource(), rXQ.OFFHAND),
                                                   var1
                                                )
                                          )
                                    )
                              )
                        )
                  )
                  .then(
                     gp_3.class_("loot")
                        .then(
                           gp_3.class_("loot_table", Ym_1.class_()).suggests(class_).executes(var1x -> class_(var1x, Ym_1.throws_(var1x, "loot_table"), var1))
                        )
                  )
                  .then(gp_3.class_("kill").then(gp_3.class_("target", RZ.class_()).executes(var1x -> class_(var1x, RZ.class_(var1x, "target"), var1))))
                  .then(
                     gp_3.class_("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("pos", RM.class_())
                                       .executes(var1x -> class_(var1x, RM.class_(var1x, "pos"), rdn_3.break_, var1)))
                                    .then(
                                       gp_3.class_("tool", RR.class_())
                                          .executes(var1x -> class_(var1x, RM.class_(var1x, "pos"), RR.class_(var1x, "tool").class_(1, false), var1))
                                    ))
                                 .then(
                                    gp_3.class_("mainhand")
                                       .executes(var1x -> class_(var1x, RM.class_(var1x, "pos"), class_((gy_3)var1x.getSource(), rXQ.MAINHAND), var1))
                                 ))
                              .then(
                                 gp_3.class_("offhand")
                                    .executes(var1x -> class_(var1x, RM.class_(var1x, "pos"), class_((gy_3)var1x.getSource(), rXQ.OFFHAND), var1))
                              )
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<gy_3, T>> T class_(T var0, ow_3 var1) {
      return (T)var0.then(
            ((LiteralArgumentBuilder)gp_3.class_("replace")
                  .then(
                     gp_3.class_("entity")
                        .then(
                           gp_3.class_("entities", RZ.break_())
                              .then(
                                 var1.construct(
                                       gp_3.class_("slot", YC.class_()),
                                       (var0x, var1x, var2) -> class_(RZ.break_(var0x, "entities"), YC.class_(var0x, "slot"), var1x.size(), var1x, var2)
                                    )
                                    .then(
                                       var1.construct(
                                          gp_3.class_("count", IntegerArgumentType.integer(0)),
                                          (var0x, var1x, var2) -> class_(
                                                RZ.break_(var0x, "entities"),
                                                YC.class_(var0x, "slot"),
                                                IntegerArgumentType.getInteger(var0x, "count"),
                                                var1x,
                                                var2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  gp_3.class_("block")
                     .then(
                        gp_3.class_("targetPos", RM.class_())
                           .then(
                              var1.construct(
                                    gp_3.class_("slot", YC.class_()),
                                    (var0x, var1x, var2) -> class_(
                                          (gy_3)var0x.getSource(), RM.class_(var0x, "targetPos"), YC.class_(var0x, "slot"), var1x.size(), var1x, var2
                                       )
                                 )
                                 .then(
                                    var1.construct(
                                       gp_3.class_("count", IntegerArgumentType.integer(0)),
                                       (var0x, var1x, var2) -> class_(
                                             (gy_3)var0x.getSource(),
                                             RM.class_(var0x, "targetPos"),
                                             IntegerArgumentType.getInteger(var0x, "slot"),
                                             IntegerArgumentType.getInteger(var0x, "count"),
                                             var1x,
                                             var2
                                          )
                                    )
                                 )
                           )
                     )
               )
         )
         .then(
            gp_3.class_("insert")
               .then(
                  var1.construct(
                     gp_3.class_("targetPos", RM.class_()), (var0x, var1x, var2) -> class_((gy_3)var0x.getSource(), RM.class_(var0x, "targetPos"), var1x, var2)
                  )
               )
         )
         .then(
            gp_3.class_("give")
               .then(var1.construct(gp_3.class_("players", RZ.protected_()), (var0x, var1x, var2) -> class_(RZ.case_(var0x, "players"), var1x, var2)))
         )
         .then(
            gp_3.class_("spawn")
               .then(
                  var1.construct(
                     gp_3.class_("targetPos", Yw_1.class_()),
                     (var0x, var1x, var2) -> class_((gy_3)var0x.getSource(), Yw_1.class_(var0x, "targetPos"), var1x, var2)
                  )
               )
         );
   }

   private static int class_(Collection<rhN_2> var0, List<rdn_3> var1, oI_2 var2) throws CommandSyntaxException {
      ArrayList var3 = Lists.newArrayListWithCapacity(var1.size());

      for (rdn_3 var5 : var1) {
         for (rhN_2 var7 : var0) {
            if (((rhz_3)var7.implements_[1]).throws_(var5.implements_())) {
               var3.add(var5);
            }
         }
      }

      var2.accept(var3);
      return var3.size();
   }

   private static void class_(an_3 var0, List<rdn_3> var1, int var2, int var3, List<rdn_3> var4) {
      for (int var5 = 0; var5 < var3; var5++) {
         rdn_3 var6 = var5 < var1.size() ? (rdn_3)var1.get(var5) : rdn_3.break_;
         if (var0.class_(var2 + var5, var6.implements_())) {
            var4.add(var6);
         }
      }
   }

   private static int class_(Collection<? extends an_3> var0, int var1, int var2, List<rdn_3> var3, oI_2 var4) throws CommandSyntaxException {
      ArrayList var5 = Lists.newArrayListWithCapacity(var3.size());

      for (an_3 var7 : var0) {
         if (var7 instanceof rhN_2 var8) {
            ((rJT)var8.implements_[3]).native_();
            class_(var7, var3, var1, var2, var5);
            ((rJT)var8.implements_[3]).native_();
         } else {
            class_(var7, var3, var1, var2, var5);
         }
      }

      var4.accept(var5);
      return var5.size();
   }

   private static int class_(gy_3 var0, rjU_2 var1, List<rdn_3> var2, oI_2 var3) throws CommandSyntaxException {
      rrEm_1 var4 = var0.final_();
      var2.forEach(var2x -> {
         rsE_2 var3x = new rsE_2(var4, var1.break_, var1.byte_, var1.protected_, var2x.implements_());
         var3x.private_();
         var4.a_(var3x);
      });
      var3.accept(var2);
      return var2.size();
   }

   private static int class_(gy_3 var0, rfH_2 var1, List<rdn_3> var2, oI_2 var3) throws CommandSyntaxException {
      rXu_1 var4 = class_(var0, var1);
      ArrayList var5 = Lists.newArrayListWithCapacity(var2.size());

      for (rdn_3 var7 : var2) {
         if (class_(var4, var7.implements_())) {
            var4.break_();
            var5.add(var7);
         }
      }

      var3.accept(var5);
      return var5.size();
   }

   private static boolean class_(rXu_1 var0, rdn_3 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.else_() && !var1.class_(); var3++) {
         rdn_3 var4 = var0.extends_(var3);
         if (var0.a_(var3, var1)) {
            if (var4.class_()) {
               var0.break_(var3, var1);
               var2 = true;
               break;
            }

            if (class_(var4, var1)) {
               int var5 = var1.byte_() - var4.char_();
               int var6 = Math.min(var1.char_(), var5);
               var1.catch_(var6);
               var4.case_(var6);
               var2 = true;
            }
         }
      }

      return var2;
   }

   private static int class_(gy_3 var0, rfH_2 var1, int var2, int var3, List<rdn_3> var4, oI_2 var5) throws CommandSyntaxException {
      rXu_1 var6 = class_(var0, var1);
      int var7 = var6.else_();
      if (var2 >= 0 && var2 < var7) {
         ArrayList var8 = Lists.newArrayListWithCapacity(var4.size());

         for (int var9 = 0; var9 < var3; var9++) {
            int var10 = var2 + var9;
            rdn_3 var11 = var9 < var4.size() ? (rdn_3)var4.get(var9) : rdn_3.break_;
            if (var6.a_(var10, var11)) {
               var6.break_(var10, var11);
               var8.add(var11);
            }
         }

         var5.accept(var8);
         return var8.size();
      } else {
         throw oa_3.break_.create(var2);
      }
   }

   private static boolean class_(rdn_3 var0, rdn_3 var1) {
      return var0.break_() == var1.break_()
         && var0.catch_() == var1.catch_()
         && var0.char_() <= var0.byte_()
         && Objects.equals(var0.package_(), var1.package_());
   }

   private static int class_(CommandContext<gy_3> var0, an_3 var1, of_3 var2) throws CommandSyntaxException {
      if (!(var1 instanceof iB_2)) {
         throw byte_.create(var1.L_());
      } else {
         rqO_2 var3 = ((iB_2)var1).By();
         gy_3 var4 = (gy_3)var0.getSource();
         rzP_2 var5 = new rzP_2(var4.final_());
         an_3 var6 = var4.package_();
         if (var6 instanceof rhd_3) {
            var5.class_(rzQ_2.break_, (rhd_3)var6);
         }

         var5.class_(rzQ_2.byte_, rye_3.package_);
         var5.break_(rzQ_2.throws_, var6);
         var5.break_(rzQ_2.protected_, var6);
         var5.class_(rzQ_2.class_, var1);
         var5.class_(rzQ_2.case_, var4.volatile_());
         rzL_2 var7 = var4.super_().o().class_(var3);
         List var8 = var7.class_(var5.class_(rzz_3.case_));
         return var2.accept(var0, var8, var2x -> class_(var4, var2x, var3));
      }
   }

   private static int class_(CommandContext<gy_3> var0, rfH_2 var1, rdn_3 var2, of_3 var3) throws CommandSyntaxException {
      gy_3 var4 = (gy_3)var0.getSource();
      rrEm_1 var5 = var4.final_();
      xc_3 var6 = var5.byte_(var1);
      ryO_2 var7 = var5.class_(var1);
      rzP_2 var8 = new rzP_2(var5)
         .class_(rzQ_2.case_, rjU_2.class_((rja_3)var1))
         .class_(rzQ_2.catch_, var6)
         .break_(rzQ_2.private_, var7)
         .break_(rzQ_2.class_, var4.package_())
         .class_(rzQ_2.implements_, var2);
      List var9 = var6.class_(var8);
      return var3.accept(var0, var9, var2x -> class_(var4, var2x, var6.break_().throws_()));
   }

   private static void class_(gy_3 var0, List<rdn_3> var1, rqO_2 var2) {
      if (var1.size() == 1) {
         rdn_3 var3 = (rdn_3)var1.get(0);
         var0.class_(new rgn_3("commands.drop.success.single_with_table", var3.char_(), var3.throw_(), var2), false);
      } else {
         var0.class_(new rgn_3("commands.drop.success.multiple_with_table", var1.size(), var2), false);
      }
   }

   private static rdn_3 class_(gy_3 var0, rXQ var1) throws CommandSyntaxException {
      an_3 var2 = var0.int_();
      if (var2 instanceof iB_2) {
         return ((iB_2)var2).class_(var1);
      } else {
         throw break_.create(var2.L_());
      }
   }

   private static void class_(gy_3 var0, List<rdn_3> var1) {
      if (var1.size() == 1) {
         rdn_3 var2 = (rdn_3)var1.get(0);
         var0.class_(new rgn_3("commands.drop.success.single", var2.char_(), var2.throw_()), false);
      } else {
         var0.class_(new rgn_3("commands.drop.success.multiple", var1.size()), false);
      }
   }

   private static int class_(CommandContext<gy_3> var0, rqO_2 var1, of_3 var2) throws CommandSyntaxException {
      gy_3 var3 = (gy_3)var0.getSource();
      rzP_2 var4 = new rzP_2(var3.final_()).break_(rzQ_2.class_, var3.package_()).class_(rzQ_2.case_, var3.volatile_());
      return class_(var0, var1, var4.class_(rzz_3.break_), var2);
   }
}
