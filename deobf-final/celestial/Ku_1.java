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
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.teleport.invalidPosition"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("teleport")
                     .requires(var0x -> var0x.class_(2)))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.break_())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("location", Yw_1.class_())
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(),
                                                RZ.break_(var0x, "targets"),
                                                ((gy_3)var0x.getSource()).final_(),
                                                Yw_1.break_(var0x, "location"),
                                                (Rf_1)null,
                                                (Km_1)null
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("rotation", YZ.class_())
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.break_(var0x, "targets"),
                                                   ((gy_3)var0x.getSource()).final_(),
                                                   Yw_1.break_(var0x, "location"),
                                                   YZ.class_(var0x, "rotation"),
                                                   (Km_1)null
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)gp_3.class_("facing")
                                          .then(
                                             gp_3.class_("entity")
                                                .then(
                                                   ((RequiredArgumentBuilder)gp_3.class_("facingEntity", RZ.class_())
                                                         .executes(
                                                            var0x -> class_(
                                                                  (gy_3)var0x.getSource(),
                                                                  RZ.break_(var0x, "targets"),
                                                                  ((gy_3)var0x.getSource()).final_(),
                                                                  Yw_1.break_(var0x, "location"),
                                                                  (Rf_1)null,
                                                                  new Km_1(RZ.class_(var0x, "facingEntity"), Rm_1.FEET)
                                                               )
                                                         ))
                                                      .then(
                                                         gp_3.class_("facingAnchor", Ru_1.class_())
                                                            .executes(
                                                               var0x -> class_(
                                                                     (gy_3)var0x.getSource(),
                                                                     RZ.break_(var0x, "targets"),
                                                                     ((gy_3)var0x.getSource()).final_(),
                                                                     Yw_1.break_(var0x, "location"),
                                                                     (Rf_1)null,
                                                                     new Km_1(RZ.class_(var0x, "facingEntity"), Ru_1.class_(var0x, "facingAnchor"))
                                                                  )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("facingLocation", Yw_1.class_())
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.break_(var0x, "targets"),
                                                      ((gy_3)var0x.getSource()).final_(),
                                                      Yw_1.break_(var0x, "location"),
                                                      (Rf_1)null,
                                                      new Km_1(Yw_1.class_(var0x, "facingLocation"))
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("destination", RZ.class_())
                              .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"), RZ.class_(var0x, "destination")))
                        )
                  ))
               .then(
                  gp_3.class_("location", Yw_1.class_())
                     .executes(
                        var0x -> class_(
                              (gy_3)var0x.getSource(),
                              Collections.singleton(((gy_3)var0x.getSource()).int_()),
                              ((gy_3)var0x.getSource()).final_(),
                              Yw_1.break_(var0x, "location"),
                              Ri_1.protected_(),
                              (Km_1)null
                           )
                     )
               ))
            .then(
               gp_3.class_("destination", RZ.class_())
                  .executes(var0x -> class_((gy_3)var0x.getSource(), Collections.singleton(((gy_3)var0x.getSource()).int_()), RZ.class_(var0x, "destination")))
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("tp").requires(var0x -> var0x.class_(2))).redirect(var1));
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, an_3 var2) throws CommandSyntaxException {
      for (an_3 var4 : var1) {
         class_(
            var0,
            var4,
            (rrEm_1)((rYB)var2.throws_[7]),
            var2.rx(),
            var2.re(),
            var2.BO(),
            EnumSet.noneOf(rvU_2.class),
            (Float)var2.throws_[15],
            (Float)var2.throws_[16],
            (Km_1)null
         );
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.teleport.success.entity.single", ((an_3)var1.iterator().next()).L_(), var2.L_()), true);
      } else {
         var0.class_(new rgn_3("commands.teleport.success.entity.multiple", var1.size(), var2.L_()), true);
      }

      return var1.size();
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, rrEm_1 var2, Rf_1 var3, Rf_1 var4, Km_1 var5) throws CommandSyntaxException {
      rjU_2 var6 = var3.class_(var0);
      rjK_2 var7 = var4 == null ? null : var4.break_(var0);
      EnumSet var8 = EnumSet.noneOf(rvU_2.class);
      if (var3.class_()) {
         var8.add(rvU_2.X);
      }

      if (var3.break_()) {
         var8.add(rvU_2.Y);
      }

      if (var3.byte_()) {
         var8.add(rvU_2.Z);
      }

      if (var4 == null) {
         var8.add(rvU_2.X_ROT);
         var8.add(rvU_2.Y_ROT);
      } else {
         if (var4.class_()) {
            var8.add(rvU_2.X_ROT);
         }

         if (var4.break_()) {
            var8.add(rvU_2.Y_ROT);
         }
      }

      for (an_3 var10 : var1) {
         if (var4 == null) {
            class_(var0, var10, var2, var6.break_, var6.byte_, var6.protected_, var8, (Float)var10.throws_[15], (Float)var10.throws_[16], var5);
         } else {
            class_(var0, var10, var2, var6.break_, var6.byte_, var6.protected_, var8, var7.protected_, var7.byte_, var5);
         }
      }

      if (var1.size() == 1) {
         var0.class_(
            new rgn_3("commands.teleport.success.location.single", ((an_3)var1.iterator().next()).L_(), var6.break_, var6.byte_, var6.protected_), true
         );
      } else {
         var0.class_(new rgn_3("commands.teleport.success.location.multiple", var1.size(), var6.break_, var6.byte_, var6.protected_), true);
      }

      return var1.size();
   }

   private static void class_(gy_3 var0, an_3 var1, rrEm_1 var2, double var3, double var5, double var7, Set<rvU_2> var9, float var10, float var11, Km_1 var12) throws CommandSyntaxException {
      rfH_2 var13 = new rfH_2(var3, var5, var7);
      if (!rYB.continue_(var13)) {
         throw class_.create();
      } else {
         if (var1 instanceof rhN_2) {
            rfj_3 var14 = new rfj_3(new rfH_2(var3, var5, var7));
            var2.else_().class_(rrEl_1.catch_, var14, 1, var1.V());
            var1.BH();
            if (((rhN_2)var1).Sc()) {
               ((rhN_2)var1).class_(true, true);
            }

            if (var2 == (rYB)var1.throws_[7]) {
               ((rhN_2)var1).class_.class_(var3, var5, var7, var10, var11, var9);
            } else {
               ((rhN_2)var1).class_(var2, var3, var5, var7, var10, var11);
            }

            var1.implements_(var10);
         } else {
            float var22 = rfU_2.catch_(var10);
            float var15 = rfU_2.catch_(var11);
            var15 = rfU_2.class_(var15, -90.0F, 90.0F);
            if (var2 == (rYB)var1.throws_[7]) {
               var1.class_(var3, var5, var7, var22, var15);
               var1.implements_(var22);
            } else {
               var1.K();
               an_3 var16 = var1;
               var1 = var1.BC().class_(var2);
               if (var1 == null) {
                  return;
               }

               var1.throws_(var16);
               var1.class_(var3, var5, var7, var22, var15);
               var1.implements_(var22);
               var2.catch_(var1);
               Boolean var21 = true;
               var16.throws_[27] = var21;
            }
         }

         if (var12 != null) {
            var12.class_(var0, var1);
         }

         if (!(var1 instanceof iB_2) || !((iB_2)var1).Sy()) {
            var1.byte_(var1.rv().throws_(1.0, 0.0, 1.0));
            var1.int_(true);
         }

         if (var1 instanceof aA_2) {
            ((aA_2)var1).public_().final_();
         }
      }
   }
}
