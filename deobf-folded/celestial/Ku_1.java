package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class Ku_1 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.teleport.invalidPosition"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("teleport")
                     .requires(var0x -> var0x.id_class(2)))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_break())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("location", Yw_1.id_class())
                                       .executes(
                                          var0x -> id_class(
                                                (gy_3)var0x.getSource(),
                                                RZ.id_break(var0x, "targets"),
                                                ((gy_3)var0x.getSource()).id_final(),
                                                Yw_1.id_break(var0x, "location"),
                                                (Rf_1)null,
                                                (Km_1)null
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("rotation", YZ.id_class())
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_break(var0x, "targets"),
                                                   ((gy_3)var0x.getSource()).id_final(),
                                                   Yw_1.id_break(var0x, "location"),
                                                   YZ.id_class(var0x, "rotation"),
                                                   (Km_1)null
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)gp_3.id_class("facing")
                                          .then(
                                             gp_3.id_class("entity")
                                                .then(
                                                   ((RequiredArgumentBuilder)gp_3.id_class("facingEntity", RZ.id_class())
                                                         .executes(
                                                            var0x -> id_class(
                                                                  (gy_3)var0x.getSource(),
                                                                  RZ.id_break(var0x, "targets"),
                                                                  ((gy_3)var0x.getSource()).id_final(),
                                                                  Yw_1.id_break(var0x, "location"),
                                                                  (Rf_1)null,
                                                                  new Km_1(RZ.id_class(var0x, "facingEntity"), Rm_1.FEET)
                                                               )
                                                         ))
                                                      .then(
                                                         gp_3.id_class("facingAnchor", Ru_1.id_class())
                                                            .executes(
                                                               var0x -> id_class(
                                                                     (gy_3)var0x.getSource(),
                                                                     RZ.id_break(var0x, "targets"),
                                                                     ((gy_3)var0x.getSource()).id_final(),
                                                                     Yw_1.id_break(var0x, "location"),
                                                                     (Rf_1)null,
                                                                     new Km_1(RZ.id_class(var0x, "facingEntity"), Ru_1.id_class(var0x, "facingAnchor"))
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("facingLocation", Yw_1.id_class())
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.id_break(var0x, "targets"),
                                                      ((gy_3)var0x.getSource()).id_final(),
                                                      Yw_1.id_break(var0x, "location"),
                                                      (Rf_1)null,
                                                      new Km_1(Yw_1.id_class(var0x, "facingLocation"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("destination", RZ.id_class())
                              .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_break(var0x, "targets"), RZ.id_class(var0x, "destination")))
                        )
                  ))
               .then(
                  gp_3.id_class("location", Yw_1.id_class())
                     .executes(
                        var0x -> id_class(
                              (gy_3)var0x.getSource(),
                              Collections.singleton(((gy_3)var0x.getSource()).id_int()),
                              ((gy_3)var0x.getSource()).id_final(),
                              Yw_1.id_break(var0x, "location"),
                              Ri_1.id_protected(),
                              (Km_1)null
                           )
                     )
               ))
            .then(
               gp_3.id_class("destination", RZ.id_class())
                  .executes(
                     var0x -> id_class((gy_3)var0x.getSource(), Collections.singleton(((gy_3)var0x.getSource()).id_int()), RZ.id_class(var0x, "destination"))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("tp").requires(var0x -> var0x.id_class(2))).redirect(var1));
   }

   private static int id_class(gy_3 var0, Collection<? extends an_3> var1, an_3 var2) throws CommandSyntaxException {
      for (an_3 var4 : var1) {
         id_class(
            var0,
            var4,
            (rrEm_1)((rYB)var2.id_throws[7]),
            var2.rx(),
            var2.re(),
            var2.BO(),
            EnumSet.noneOf(rvU_2.class),
            (Float)var2.id_throws[15],
            (Float)var2.id_throws[16],
            (Km_1)null
         );
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.teleport.success.entity.single", ((an_3)var1.iterator().next()).L_(), var2.L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.teleport.success.entity.multiple", var1.size(), var2.L_()), true);
      }

      return var1.size();
   }

   private static int id_class(gy_3 var0, Collection<? extends an_3> var1, rrEm_1 var2, Rf_1 var3, Rf_1 var4, Km_1 var5) throws CommandSyntaxException {
      rjU_2 var6 = var3.id_class(var0);
      rjK_2 var7 = var4 == null ? null : var4.id_break(var0);
      EnumSet var8 = EnumSet.noneOf(rvU_2.class);
      if (var3.id_class()) {
         var8.add(rvU_2.X);
      }

      if (var3.id_break()) {
         var8.add(rvU_2.Y);
      }

      if (var3.id_byte()) {
         var8.add(rvU_2.Z);
      }

      if (var4 == null) {
         var8.add(rvU_2.X_ROT);
         var8.add(rvU_2.Y_ROT);
      } else {
         if (var4.id_class()) {
            var8.add(rvU_2.X_ROT);
         }

         if (var4.id_break()) {
            var8.add(rvU_2.Y_ROT);
         }
      }

      for (an_3 var10 : var1) {
         if (var4 == null) {
            id_class(var0, var10, var2, var6.id_break, var6.id_byte, var6.id_protected, var8, (Float)var10.id_throws[15], (Float)var10.id_throws[16], var5);
         } else {
            id_class(var0, var10, var2, var6.id_break, var6.id_byte, var6.id_protected, var8, var7.id_protected, var7.id_byte, var5);
         }
      }

      if (var1.size() == 1) {
         var0.id_class(
            new rgn_3("commands.teleport.success.location.single", ((an_3)var1.iterator().next()).L_(), var6.id_break, var6.id_byte, var6.id_protected), true
         );
      } else {
         var0.id_class(new rgn_3("commands.teleport.success.location.multiple", var1.size(), var6.id_break, var6.id_byte, var6.id_protected), true);
      }

      return var1.size();
   }

   private static void id_class(gy_3 var0, an_3 var1, rrEm_1 var2, double var3, double var5, double var7, Set<rvU_2> var9, float var10, float var11, Km_1 var12) throws CommandSyntaxException {
      rfH_2 var13 = new rfH_2(var3, var5, var7);
      if (!rYB.id_continue(var13)) {
         throw id_class.create();
      } else {
         if (var1 instanceof rhN_2) {
            rfj_3 var14 = new rfj_3(new rfH_2(var3, var5, var7));
            var2.id_else().id_class(rrEl_1.id_catch, var14, 1, var1.V());
            var1.BH();
            if (((rhN_2)var1).Sc()) {
               ((rhN_2)var1).id_class(true, true);
            }

            if (var2 == (rYB)var1.id_throws[7]) {
               ((rhN_2)var1).id_class.id_class(var3, var5, var7, var10, var11, var9);
            } else {
               ((rhN_2)var1).id_class(var2, var3, var5, var7, var10, var11);
            }

            var1.id_implements(var10);
         } else {
            float var22 = rfU_2.id_catch(var10);
            float var15 = rfU_2.id_catch(var11);
            var15 = rfU_2.id_class(var15, -90.0F, 90.0F);
            if (var2 == (rYB)var1.id_throws[7]) {
               var1.id_class(var3, var5, var7, var22, var15);
               var1.id_implements(var22);
            } else {
               var1.K();
               an_3 var16 = var1;
               var1 = var1.BC().id_class(var2);
               if (var1 == null) {
                  return;
               }

               var1.id_throws(var16);
               var1.id_class(var3, var5, var7, var22, var15);
               var1.id_implements(var22);
               var2.id_catch(var1);
               Boolean var21 = true;
               var16.id_throws[27] = var21;
            }
         }

         if (var12 != null) {
            var12.id_class(var0, var1);
         }

         if (!(var1 instanceof iB_2) || !((iB_2)var1).Sy()) {
            var1.id_byte(var1.rv().id_throws(1.0, 0.0, 1.0));
            var1.id_int(true);
         }

         if (var1 instanceof aA_2) {
            ((aA_2)var1).id_public().id_final();
         }
      }
   }
}
