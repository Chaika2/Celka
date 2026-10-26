package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class oG_2 {
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType byte_ = new Dynamic2CommandExceptionType((var0, var1) -> new rgn_3("commands.clone.toobig", var0, var1));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.clone.failed"));
   public static final Predicate<ryw_3> class_ = var0 -> !var0.class_().catch_();

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("clone").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("begin", RM.class_())
                  .then(
                     gp_3.class_("end", RM.class_())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("destination", RM.class_())
                                       .executes(
                                          var0x -> class_(
                                                (gy_3)var0x.getSource(),
                                                RM.class_(var0x, "begin"),
                                                RM.class_(var0x, "end"),
                                                RM.class_(var0x, "destination"),
                                                var0xx -> true,
                                                oM_2.NORMAL
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("replace")
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RM.class_(var0x, "begin"),
                                                            RM.class_(var0x, "end"),
                                                            RM.class_(var0x, "destination"),
                                                            var0xx -> true,
                                                            oM_2.NORMAL
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("force")
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               RM.class_(var0x, "begin"),
                                                               RM.class_(var0x, "end"),
                                                               RM.class_(var0x, "destination"),
                                                               var0xx -> true,
                                                               oM_2.FORCE
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.class_("move")
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RM.class_(var0x, "begin"),
                                                            RM.class_(var0x, "end"),
                                                            RM.class_(var0x, "destination"),
                                                            var0xx -> true,
                                                            oM_2.MOVE
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.class_("normal")
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         RM.class_(var0x, "begin"),
                                                         RM.class_(var0x, "end"),
                                                         RM.class_(var0x, "destination"),
                                                         var0xx -> true,
                                                         oM_2.NORMAL
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("masked")
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         RM.class_(var0x, "begin"),
                                                         RM.class_(var0x, "end"),
                                                         RM.class_(var0x, "destination"),
                                                         class_,
                                                         oM_2.NORMAL
                                                      )
                                                ))
                                             .then(
                                                gp_3.class_("force")
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RM.class_(var0x, "begin"),
                                                            RM.class_(var0x, "end"),
                                                            RM.class_(var0x, "destination"),
                                                            class_,
                                                            oM_2.FORCE
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.class_("move")
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         RM.class_(var0x, "begin"),
                                                         RM.class_(var0x, "end"),
                                                         RM.class_(var0x, "destination"),
                                                         class_,
                                                         oM_2.MOVE
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("normal")
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RM.class_(var0x, "begin"),
                                                      RM.class_(var0x, "end"),
                                                      RM.class_(var0x, "destination"),
                                                      class_,
                                                      oM_2.NORMAL
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("filtered")
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("filter", RO.class_())
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RM.class_(var0x, "begin"),
                                                            RM.class_(var0x, "end"),
                                                            RM.class_(var0x, "destination"),
                                                            RO.class_(var0x, "filter"),
                                                            oM_2.NORMAL
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("force")
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               RM.class_(var0x, "begin"),
                                                               RM.class_(var0x, "end"),
                                                               RM.class_(var0x, "destination"),
                                                               RO.class_(var0x, "filter"),
                                                               oM_2.FORCE
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.class_("move")
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RM.class_(var0x, "begin"),
                                                            RM.class_(var0x, "end"),
                                                            RM.class_(var0x, "destination"),
                                                            RO.class_(var0x, "filter"),
                                                            oM_2.MOVE
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.class_("normal")
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         RM.class_(var0x, "begin"),
                                                         RM.class_(var0x, "end"),
                                                         RM.class_(var0x, "destination"),
                                                         RO.class_(var0x, "filter"),
                                                         oM_2.NORMAL
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

   private static int class_(gy_3 var0, rfH_2 var1, rfH_2 var2, rfH_2 var3, Predicate<ryw_3> var4, oM_2 var5) throws CommandSyntaxException {
      rfi_3 var6 = new rfi_3(var1, var2);
      rfH_2 var7 = var3.break_(var6.byte_());
      rfi_3 var8 = new rfi_3(var3, var7);
      if (!var5.class_() && var8.class_(var6)) {
         throw break_.create();
      } else {
         int var9 = var6.protected_() * var6.throws_() * var6.case_();
         if (var9 > 32768) {
            throw byte_.create(32768, var9);
         } else {
            rrEm_1 var10 = var0.final_();
            if (var10.class_(var1, var2) && var10.class_(var3, var7)) {
               ArrayList var11 = Lists.newArrayList();
               ArrayList var12 = Lists.newArrayList();
               ArrayList var13 = Lists.newArrayList();
               LinkedList var14 = Lists.newLinkedList();
               rfH_2 var15 = new rfH_2(var8.class_ - var6.class_, var8.break_ - var6.break_, var8.byte_ - var6.byte_);

               for (int var16 = var6.byte_; var16 <= var6.case_; var16++) {
                  for (int var17 = var6.break_; var17 <= var6.throws_; var17++) {
                     for (int var18 = var6.class_; var18 <= var6.protected_; var18++) {
                        rfH_2 var19 = new rfH_2(var18, var17, var16);
                        rfH_2 var20 = var19.break_(var15);
                        ryw_3 var21 = new ryw_3(var10, var19, false);
                        xc_3 var22 = var21.class_();
                        if (var4.test(var21)) {
                           ryO_2 var23 = var10.class_(var19);
                           if (var23 != null) {
                              rcd_3 var24 = var23.class_(new rcd_3());
                              var12.add(new ob_3(var20, var22, var24));
                              var14.addLast(var19);
                           } else if (!var22.implements_(var10, var19) && !var22.new_(var10, var19)) {
                              var13.add(new ob_3(var20, var22, (rcd_3)null));
                              var14.addFirst(var19);
                           } else {
                              var11.add(new ob_3(var20, var22, (rcd_3)null));
                              var14.addLast(var19);
                           }
                        }
                     }
                  }
               }

               if (var5 == oM_2.MOVE) {
                  for (rfH_2 var28 : var14) {
                     ryO_2 var31 = var10.class_(var28);
                     rXc_1.class_(var31);
                     var10.class_(var28, xu_3.Ec.continue_(), 2);
                  }

                  for (rfH_2 var29 : var14) {
                     var10.class_(var29, xu_3.class_.continue_(), 3);
                  }
               }

               ArrayList var27 = Lists.newArrayList();
               var27.addAll(var11);
               var27.addAll(var12);
               var27.addAll(var13);
               List var30 = Lists.reverse(var27);

               for (ob_3 var34 : var30) {
                  ryO_2 var38 = var10.class_(var34.class_);
                  rXc_1.class_(var38);
                  var10.class_(var34.class_, xu_3.Ec.continue_(), 2);
               }

               int var33 = 0;

               for (ob_3 var39 : var27) {
                  if (var10.class_(var39.class_, var39.break_, 2)) {
                     var33++;
                  }
               }

               for (ob_3 var40 : var12) {
                  ryO_2 var42 = var10.class_(var40.class_);
                  if (var40.byte_ != null && var42 != null) {
                     var40.byte_.break_("x", var40.class_.b_());
                     var40.byte_.break_("y", var40.class_.c_());
                     var40.byte_.break_("z", var40.class_.d_());
                     var42.class_(var40.break_, var40.byte_);
                     var42.break_();
                  }

                  var10.class_(var40.class_, var40.break_, 2);
               }

               for (ob_3 var41 : var30) {
                  var10.class_(var41.class_, var41.break_.break_());
               }

               var10.synchronized_().class_(var6, var15);
               if (var33 == 0) {
                  throw protected_.create();
               } else {
                  var0.class_(new rgn_3("commands.clone.success", var33), true);
                  return var33;
               }
            } else {
               throw RM.class_.create();
            }
         }
      }
   }
}
