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
   public static final SuggestionProvider<gy_3> id_class = (var0, var1) -> {
      rzC_2 var2 = ((gy_3)var0.getSource()).id_super().o();
      return gR_2.id_class(var2.id_break(), var1);
   };
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.drop.no_held_items", var0));
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.drop.no_loot_table", var0));

   private static rXu_1 id_class(gy_3 var0, rfH_2 var1) throws CommandSyntaxException {
      ryO_2 var2 = var0.id_final().id_class(var1);
      if (!(var2 instanceof rXu_1)) {
         throw oa_3.id_class.create();
      } else {
         return (rXu_1)var2;
      }
   }

   private static int id_class(CommandContext<gy_3> var0, rqO_2 var1, rzr_3 var2, of_3 var3) throws CommandSyntaxException {
      gy_3 var4 = (gy_3)var0.getSource();
      rzL_2 var5 = var4.id_super().o().id_class(var1);
      List var6 = var5.id_class(var2);
      return var3.accept(var0, var6, var1x -> id_class(var4, var1x));
   }

   private static int id_class(CommandContext<gy_3> var0, rqO_2 var1, rfH_2 var2, rdn_3 var3, of_3 var4) throws CommandSyntaxException {
      gy_3 var5 = (gy_3)var0.getSource();
      rzr_3 var6 = new rzP_2(var5.id_final())
         .id_class(rzQ_2.id_case, rjU_2.id_class((rja_3)var2))
         .id_class(rzQ_2.id_implements, var3)
         .id_break(rzQ_2.id_class, var5.id_package())
         .id_class(rzz_3.id_throws);
      return id_class(var0, var1, var6, var4);
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         id_class(
            (LiteralArgumentBuilder)gp_3.id_class("loot").requires(var0x -> var0x.id_class(2)),
            (var0x, var1) -> var0x.then(
                     gp_3.id_class("fish")
                        .then(
                           gp_3.id_class("loot_table", Ym_1.id_class())
                              .suggests(id_class)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class())
                                             .executes(
                                                var1x -> id_class(var1x, Ym_1.id_throws(var1x, "loot_table"), RM.id_class(var1x, "pos"), rdn_3.id_break, var1)
                                             ))
                                          .then(
                                             gp_3.id_class("tool", RR.id_class())
                                                .executes(
                                                   var1x -> id_class(
                                                         var1x,
                                                         Ym_1.id_throws(var1x, "loot_table"),
                                                         RM.id_class(var1x, "pos"),
                                                         RR.id_class(var1x, "tool").id_class(1, false),
                                                         var1
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("mainhand")
                                             .executes(
                                                var1x -> id_class(
                                                      var1x,
                                                      Ym_1.id_throws(var1x, "loot_table"),
                                                      RM.id_class(var1x, "pos"),
                                                      id_class((gy_3)var1x.getSource(), rXQ.MAINHAND),
                                                      var1
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("offhand")
                                          .executes(
                                             var1x -> id_class(
                                                   var1x,
                                                   Ym_1.id_throws(var1x, "loot_table"),
                                                   RM.id_class(var1x, "pos"),
                                                   id_class((gy_3)var1x.getSource(), rXQ.OFFHAND),
                                                   var1
                                                )
                                          )
                                    )
                              )
                        )
                  )
                  .then(
                     gp_3.id_class("loot")
                        .then(
                           gp_3.id_class("loot_table", Ym_1.id_class())
                              .suggests(id_class)
                              .executes(var1x -> id_class(var1x, Ym_1.id_throws(var1x, "loot_table"), var1))
                        )
                  )
                  .then(
                     gp_3.id_class("kill").then(gp_3.id_class("target", RZ.id_class()).executes(var1x -> id_class(var1x, RZ.id_class(var1x, "target"), var1)))
                  )
                  .then(
                     gp_3.id_class("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class())
                                       .executes(var1x -> id_class(var1x, RM.id_class(var1x, "pos"), rdn_3.id_break, var1)))
                                    .then(
                                       gp_3.id_class("tool", RR.id_class())
                                          .executes(var1x -> id_class(var1x, RM.id_class(var1x, "pos"), RR.id_class(var1x, "tool").id_class(1, false), var1))
                                    ))
                                 .then(
                                    gp_3.id_class("mainhand")
                                       .executes(var1x -> id_class(var1x, RM.id_class(var1x, "pos"), id_class((gy_3)var1x.getSource(), rXQ.MAINHAND), var1))
                                 ))
                              .then(
                                 gp_3.id_class("offhand")
                                    .executes(var1x -> id_class(var1x, RM.id_class(var1x, "pos"), id_class((gy_3)var1x.getSource(), rXQ.OFFHAND), var1))
                              )
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<gy_3, T>> T id_class(T var0, ow_3 var1) {
      return (T)var0.then(
            ((LiteralArgumentBuilder)gp_3.id_class("replace")
                  .then(
                     gp_3.id_class("entity")
                        .then(
                           gp_3.id_class("entities", RZ.id_break())
                              .then(
                                 var1.construct(
                                       gp_3.id_class("slot", YC.id_class()),
                                       (var0x, var1x, var2) -> id_class(RZ.id_break(var0x, "entities"), YC.id_class(var0x, "slot"), var1x.size(), var1x, var2)
                                    )
                                    .then(
                                       var1.construct(
                                          gp_3.id_class("count", IntegerArgumentType.integer(0)),
                                          (var0x, var1x, var2) -> id_class(
                                                RZ.id_break(var0x, "entities"),
                                                YC.id_class(var0x, "slot"),
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
                  gp_3.id_class("block")
                     .then(
                        gp_3.id_class("targetPos", RM.id_class())
                           .then(
                              var1.construct(
                                    gp_3.id_class("slot", YC.id_class()),
                                    (var0x, var1x, var2) -> id_class(
                                          (gy_3)var0x.getSource(), RM.id_class(var0x, "targetPos"), YC.id_class(var0x, "slot"), var1x.size(), var1x, var2
                                       )
                                 )
                                 .then(
                                    var1.construct(
                                       gp_3.id_class("count", IntegerArgumentType.integer(0)),
                                       (var0x, var1x, var2) -> id_class(
                                             (gy_3)var0x.getSource(),
                                             RM.id_class(var0x, "targetPos"),
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
            gp_3.id_class("insert")
               .then(
                  var1.construct(
                     gp_3.id_class("targetPos", RM.id_class()),
                     (var0x, var1x, var2) -> id_class((gy_3)var0x.getSource(), RM.id_class(var0x, "targetPos"), var1x, var2)
                  )
               )
         )
         .then(
            gp_3.id_class("give")
               .then(var1.construct(gp_3.id_class("players", RZ.id_protected()), (var0x, var1x, var2) -> id_class(RZ.id_case(var0x, "players"), var1x, var2)))
         )
         .then(
            gp_3.id_class("spawn")
               .then(
                  var1.construct(
                     gp_3.id_class("targetPos", Yw_1.id_class()),
                     (var0x, var1x, var2) -> id_class((gy_3)var0x.getSource(), Yw_1.id_class(var0x, "targetPos"), var1x, var2)
                  )
               )
         );
   }

   private static int id_class(Collection<rhN_2> var0, List<rdn_3> var1, oI_2 var2) throws CommandSyntaxException {
      ArrayList var3 = Lists.newArrayListWithCapacity(var1.size());

      for (rdn_3 var5 : var1) {
         for (rhN_2 var7 : var0) {
            if (((rhz_3)var7.id_implements[1]).id_throws(var5.id_implements())) {
               var3.add(var5);
            }
         }
      }

      var2.accept(var3);
      return var3.size();
   }

   private static void id_class(an_3 var0, List<rdn_3> var1, int var2, int var3, List<rdn_3> var4) {
      for (int var5 = 0; var5 < var3; var5++) {
         rdn_3 var6 = var5 < var1.size() ? (rdn_3)var1.get(var5) : rdn_3.id_break;
         if (var0.id_class(var2 + var5, var6.id_implements())) {
            var4.add(var6);
         }
      }
   }

   private static int id_class(Collection<? extends an_3> var0, int var1, int var2, List<rdn_3> var3, oI_2 var4) throws CommandSyntaxException {
      ArrayList var5 = Lists.newArrayListWithCapacity(var3.size());

      for (an_3 var7 : var0) {
         if (var7 instanceof rhN_2 var8) {
            ((rJT)var8.id_implements[3]).id_native();
            id_class(var7, var3, var1, var2, var5);
            ((rJT)var8.id_implements[3]).id_native();
         } else {
            id_class(var7, var3, var1, var2, var5);
         }
      }

      var4.accept(var5);
      return var5.size();
   }

   private static int id_class(gy_3 var0, rjU_2 var1, List<rdn_3> var2, oI_2 var3) throws CommandSyntaxException {
      rrEm_1 var4 = var0.id_final();
      var2.forEach(var2x -> {
         rsE_2 var3x = new rsE_2(var4, var1.id_break, var1.id_byte, var1.id_protected, var2x.id_implements());
         var3x.id_private();
         var4.a_(var3x);
      });
      var3.accept(var2);
      return var2.size();
   }

   private static int id_class(gy_3 var0, rfH_2 var1, List<rdn_3> var2, oI_2 var3) throws CommandSyntaxException {
      rXu_1 var4 = id_class(var0, var1);
      ArrayList var5 = Lists.newArrayListWithCapacity(var2.size());

      for (rdn_3 var7 : var2) {
         if (id_class(var4, var7.id_implements())) {
            var4.id_break();
            var5.add(var7);
         }
      }

      var3.accept(var5);
      return var5.size();
   }

   private static boolean id_class(rXu_1 var0, rdn_3 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.id_else() && !var1.id_class(); var3++) {
         rdn_3 var4 = var0.id_extends(var3);
         if (var0.a_(var3, var1)) {
            if (var4.id_class()) {
               var0.id_break(var3, var1);
               var2 = true;
               break;
            }

            if (id_class(var4, var1)) {
               int var5 = var1.id_byte() - var4.id_char();
               int var6 = Math.min(var1.id_char(), var5);
               var1.id_catch(var6);
               var4.id_case(var6);
               var2 = true;
            }
         }
      }

      return var2;
   }

   private static int id_class(gy_3 var0, rfH_2 var1, int var2, int var3, List<rdn_3> var4, oI_2 var5) throws CommandSyntaxException {
      rXu_1 var6 = id_class(var0, var1);
      int var7 = var6.id_else();
      if (var2 >= 0 && var2 < var7) {
         ArrayList var8 = Lists.newArrayListWithCapacity(var4.size());

         for (int var9 = 0; var9 < var3; var9++) {
            int var10 = var2 + var9;
            rdn_3 var11 = var9 < var4.size() ? (rdn_3)var4.get(var9) : rdn_3.id_break;
            if (var6.a_(var10, var11)) {
               var6.id_break(var10, var11);
               var8.add(var11);
            }
         }

         var5.accept(var8);
         return var8.size();
      } else {
         throw oa_3.id_break.create(var2);
      }
   }

   private static boolean id_class(rdn_3 var0, rdn_3 var1) {
      return var0.id_break() == var1.id_break()
         && var0.id_catch() == var1.id_catch()
         && var0.id_char() <= var0.id_byte()
         && Objects.equals(var0.id_package(), var1.id_package());
   }

   private static int id_class(CommandContext<gy_3> var0, an_3 var1, of_3 var2) throws CommandSyntaxException {
      if (!(var1 instanceof iB_2)) {
         throw id_byte.create(var1.L_());
      } else {
         rqO_2 var3 = ((iB_2)var1).By();
         gy_3 var4 = (gy_3)var0.getSource();
         rzP_2 var5 = new rzP_2(var4.id_final());
         an_3 var6 = var4.id_package();
         if (var6 instanceof rhd_3) {
            var5.id_class(rzQ_2.id_break, (rhd_3)var6);
         }

         var5.id_class(rzQ_2.id_byte, rye_3.id_package);
         var5.id_break(rzQ_2.id_throws, var6);
         var5.id_break(rzQ_2.id_protected, var6);
         var5.id_class(rzQ_2.id_class, var1);
         var5.id_class(rzQ_2.id_case, var4.id_volatile());
         rzL_2 var7 = var4.id_super().o().id_class(var3);
         List var8 = var7.id_class(var5.id_class(rzz_3.id_case));
         return var2.accept(var0, var8, var2x -> id_class(var4, var2x, var3));
      }
   }

   private static int id_class(CommandContext<gy_3> var0, rfH_2 var1, rdn_3 var2, of_3 var3) throws CommandSyntaxException {
      gy_3 var4 = (gy_3)var0.getSource();
      rrEm_1 var5 = var4.id_final();
      xc_3 var6 = var5.id_byte(var1);
      ryO_2 var7 = var5.id_class(var1);
      rzP_2 var8 = new rzP_2(var5)
         .id_class(rzQ_2.id_case, rjU_2.id_class((rja_3)var1))
         .id_class(rzQ_2.id_catch, var6)
         .id_break(rzQ_2.id_private, var7)
         .id_break(rzQ_2.id_class, var4.id_package())
         .id_class(rzQ_2.id_implements, var2);
      List var9 = var6.id_class(var8);
      return var3.accept(var0, var9, var2x -> id_class(var4, var2x, var6.id_break().id_throws()));
   }

   private static void id_class(gy_3 var0, List<rdn_3> var1, rqO_2 var2) {
      if (var1.size() == 1) {
         rdn_3 var3 = (rdn_3)var1.get(0);
         var0.id_class(new rgn_3("commands.drop.success.single_with_table", var3.id_char(), var3.id_throw(), var2), false);
      } else {
         var0.id_class(new rgn_3("commands.drop.success.multiple_with_table", var1.size(), var2), false);
      }
   }

   private static rdn_3 id_class(gy_3 var0, rXQ var1) throws CommandSyntaxException {
      an_3 var2 = var0.id_int();
      if (var2 instanceof iB_2) {
         return ((iB_2)var2).id_class(var1);
      } else {
         throw id_break.create(var2.L_());
      }
   }

   private static void id_class(gy_3 var0, List<rdn_3> var1) {
      if (var1.size() == 1) {
         rdn_3 var2 = (rdn_3)var1.get(0);
         var0.id_class(new rgn_3("commands.drop.success.single", var2.id_char(), var2.id_throw()), false);
      } else {
         var0.id_class(new rgn_3("commands.drop.success.multiple", var1.size()), false);
      }
   }

   private static int id_class(CommandContext<gy_3> var0, rqO_2 var1, of_3 var2) throws CommandSyntaxException {
      gy_3 var3 = (gy_3)var0.getSource();
      rzP_2 var4 = new rzP_2(var3.id_final()).id_break(rzQ_2.id_class, var3.id_package()).id_class(rzQ_2.id_case, var3.id_volatile());
      return id_class(var0, var1, var4.id_class(rzz_3.id_break), var2);
   }
}
