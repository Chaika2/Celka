package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class oz_3 {
   private static final Dynamic2CommandExceptionType class_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.execute.blocks.toobig", var0, var1)
   );
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.execute.conditional.fail_count", var0));
   private static final BinaryOperator<ResultConsumer<gy_3>> protected_ = (var0, var1) -> (var2, var3, var4) -> {
         var0.onCommandComplete(var2, var3, var4);
         var1.onCommandComplete(var2, var3, var4);
      };
   private static final SuggestionProvider<gy_3> throws_ = (var0, var1) -> {
      rzZ_2 var2 = ((gy_3)var0.getSource()).super_().K();
      return gR_2.class_(var2.break_(), var1);
   };

   private static OptionalInt byte_(CommandContext<gy_3> var0, boolean var1) throws CommandSyntaxException {
      return class_(((gy_3)var0.getSource()).final_(), RM.class_(var0, "start"), RM.class_(var0, "end"), RM.class_(var0, "destination"), var1);
   }

   private static Command<gy_3> class_(boolean var0, oN_2 var1) {
      return var0 ? var1x -> {
         int var2 = var1.test(var1x);
         if (var2 > 0) {
            ((gy_3)var1x.getSource()).class_(new rgn_3("commands.execute.conditional.pass_count", var2), false);
            return var2;
         } else {
            throw break_.create();
         }
      } : var1x -> {
         int var2 = var1.test(var1x);
         if (var2 == 0) {
            ((gy_3)var1x.getSource()).class_(new rgn_3("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw byte_.create(var2);
         }
      };
   }

   private static ArgumentBuilder<gy_3, ?> class_(CommandNode<gy_3> var0, LiteralArgumentBuilder<gy_3> var1, boolean var2) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                     gp_3.class_("block")
                        .then(
                           gp_3.class_("pos", RM.class_())
                              .then(
                                 class_(
                                    var0,
                                    gp_3.class_("block", RO.class_()),
                                    var2,
                                    var0x -> RO.class_(var0x, "block").test(new ryw_3(((gy_3)var0x.getSource()).final_(), RM.class_(var0x, "pos"), true))
                                 )
                              )
                        )
                  ))
                  .then(
                     gp_3.class_("score")
                        .then(
                           gp_3.class_("target", Yv_1.class_())
                              .suggests(Yv_1.class_)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                                      "targetObjective", Yk_1.class_()
                                                   )
                                                   .then(
                                                      gp_3.class_("=")
                                                         .then(
                                                            gp_3.class_("source", Yv_1.class_())
                                                               .suggests(Yv_1.class_)
                                                               .then(
                                                                  class_(
                                                                     var0,
                                                                     gp_3.class_("sourceObjective", Yk_1.class_()),
                                                                     var2,
                                                                     var0x -> class_(var0x, Integer::equals)
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("<")
                                                      .then(
                                                         gp_3.class_("source", Yv_1.class_())
                                                            .suggests(Yv_1.class_)
                                                            .then(
                                                               class_(
                                                                  var0,
                                                                  gp_3.class_("sourceObjective", Yk_1.class_()),
                                                                  var2,
                                                                  var0x -> class_(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx < var1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.class_("<=")
                                                   .then(
                                                      gp_3.class_("source", Yv_1.class_())
                                                         .suggests(Yv_1.class_)
                                                         .then(
                                                            class_(
                                                               var0,
                                                               gp_3.class_("sourceObjective", Yk_1.class_()),
                                                               var2,
                                                               var0x -> class_(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx <= var1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.class_(">")
                                                .then(
                                                   gp_3.class_("source", Yv_1.class_())
                                                      .suggests(Yv_1.class_)
                                                      .then(
                                                         class_(
                                                            var0,
                                                            gp_3.class_("sourceObjective", Yk_1.class_()),
                                                            var2,
                                                            var0x -> class_(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx > var1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.class_(">=")
                                             .then(
                                                gp_3.class_("source", Yv_1.class_())
                                                   .suggests(Yv_1.class_)
                                                   .then(
                                                      class_(
                                                         var0,
                                                         gp_3.class_("sourceObjective", Yk_1.class_()),
                                                         var2,
                                                         var0x -> class_(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx >= var1x))
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("matches")
                                          .then(class_(var0, gp_3.class_("range", Rj_1.class_()), var2, var0x -> class_(var0x, Rg_1.class_(var0x, "range"))))
                                    )
                              )
                        )
                  ))
               .then(
                  gp_3.class_("blocks")
                     .then(
                        gp_3.class_("start", RM.class_())
                           .then(
                              gp_3.class_("end", RM.class_())
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.class_("destination", RM.class_()).then(class_(var0, gp_3.class_("all"), var2, false)))
                                       .then(class_(var0, gp_3.class_("masked"), var2, true))
                                 )
                           )
                     )
               ))
            .then(
               gp_3.class_("entity")
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("entities", RZ.break_())
                           .fork(var0, var1x -> class_(var1x, var2, !RZ.byte_(var1x, "entities").isEmpty())))
                        .executes(class_(var2, (oN_2)(var0x -> RZ.byte_(var0x, "entities").size())))
                  )
            ))
         .then(
            gp_3.class_("predicate")
               .then(
                  class_(
                     var0,
                     gp_3.class_("predicate", Ym_1.class_()).suggests(throws_),
                     var2,
                     var0x -> class_((gy_3)var0x.getSource(), Ym_1.byte_(var0x, "predicate"))
                  )
               )
         );

      for (Kp_1 var4 : Ky_1.byte_) {
         var1.then(
            var4.class_(
               gp_3.class_("data"),
               var3 -> var3.then(
                     ((RequiredArgumentBuilder)gp_3.class_("path", YE.class_())
                           .fork(var0, var2xx -> class_(var2xx, var2, class_(var4.class_(var2xx), YE.class_(var2xx, "path")) > 0)))
                        .executes(class_(var2, (oN_2)(var1xx -> class_(var4.class_(var1xx), YE.class_(var1xx, "path")))))
                  )
            )
         );
      }

      return var1;
   }

   private static gy_3 class_(gy_3 var0, KI var1, YJ var2, IntFunction<rcZ_2> var3, boolean var4) {
      return var0.class_((var4x, var5, var6) -> {
         try {
            rcd_3 var7 = var1.class_();
            int var8 = var4 ? var6 : (var5 ? 1 : 0);
            var2.break_(var7, () -> (rcZ_2)var3.apply(var8));
            var1.class_(var7);
         } catch (CommandSyntaxException var9) {
         }
      }, protected_);
   }

   private static gy_3 class_(gy_3 var0, rnx_3 var1, boolean var2, boolean var3) {
      return var0.class_((var3x, var4, var5) -> {
         int var6 = var3 ? var5 : (var4 ? 1 : 0);
         if (var2) {
            var1.class_(var6);
         } else {
            var1.break_(var6);
         }
      }, protected_);
   }

   private static gy_3 class_(gy_3 var0, Collection<String> var1, rnP_2 var2, boolean var3) {
      rnG_2 var4 = var0.super_().R();
      return var0.class_((var4x, var5, var6) -> {
         for (String var8 : var1) {
            rAa_1 var9 = var4.break_(var8, var2);
            int var10 = var3 ? var6 : (var5 ? 1 : 0);
            var9.break_(var10);
         }
      }, protected_);
   }

   private static ArgumentBuilder<gy_3, ?> class_(LiteralCommandNode<gy_3> var0, LiteralArgumentBuilder<gy_3> var1, boolean var2) {
      var1.then(
         gp_3.class_("score")
            .then(
               gp_3.class_("targets", Yv_1.break_())
                  .suggests(Yv_1.class_)
                  .then(
                     gp_3.class_("objective", Yk_1.class_())
                        .redirect(var0, var1x -> class_((gy_3)var1x.getSource(), Yv_1.byte_(var1x, "targets"), Yk_1.class_(var1x, "objective"), var2))
                  )
            )
      );
      var1.then(
         gp_3.class_("bossbar")
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("id", Ym_1.class_())
                     .suggests(os_3.class_)
                     .then(gp_3.class_("value").redirect(var0, var1x -> class_((gy_3)var1x.getSource(), os_3.class_(var1x), true, var2))))
                  .then(gp_3.class_("max").redirect(var0, var1x -> class_((gy_3)var1x.getSource(), os_3.class_(var1x), false, var2)))
            )
      );

      for (Kp_1 var4 : Ky_1.break_) {
         var4.class_(
            var1,
            var3 -> var3.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                       "path", YE.class_()
                                    )
                                    .then(
                                       gp_3.class_("id_int")
                                          .then(
                                             gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   var0,
                                                   var2xx -> class_(
                                                         (gy_3)var2xx.getSource(),
                                                         var4.class_(var2xx),
                                                         YE.class_(var2xx, "path"),
                                                         var1xxx -> rcn_3.class_((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                         var2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("float")
                                       .then(
                                          gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                var0,
                                                var2xx -> class_(
                                                      (gy_3)var2xx.getSource(),
                                                      var4.class_(var2xx),
                                                      YE.class_(var2xx, "path"),
                                                      var1xxx -> rcu_3.class_((float)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                      var2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("short")
                                    .then(
                                       gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             var0,
                                             var2xx -> class_(
                                                   (gy_3)var2xx.getSource(),
                                                   var4.class_(var2xx),
                                                   YE.class_(var2xx, "path"),
                                                   var1xxx -> rcD_2.class_((short)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
                                                   var2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("long")
                                 .then(
                                    gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          var0,
                                          var2xx -> class_(
                                                (gy_3)var2xx.getSource(),
                                                var4.class_(var2xx),
                                                YE.class_(var2xx, "path"),
                                                var1xxx -> rct_3.class_((long)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                var2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("double")
                              .then(
                                 gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       var0,
                                       var2xx -> class_(
                                             (gy_3)var2xx.getSource(),
                                             var4.class_(var2xx),
                                             YE.class_(var2xx, "path"),
                                             var1xxx -> rcz_3.class_((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")),
                                             var2
                                          )
                                    )
                              )
                        ))
                     .then(
                        gp_3.class_("id_byte")
                           .then(
                              gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    var0,
                                    var2xx -> class_(
                                          (gy_3)var2xx.getSource(),
                                          var4.class_(var2xx),
                                          YE.class_(var2xx, "path"),
                                          var1xxx -> rch_3.class_((byte)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
                                          var2
                                       )
                                 )
                           )
                     )
               )
         );
      }

      return var1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register((LiteralArgumentBuilder)gp_3.class_("execute").requires(var0x -> var0x.class_(2)));
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                                   "execute"
                                                )
                                                .requires(var0x -> var0x.class_(2)))
                                             .then(gp_3.class_("run").redirect(var0.getRoot())))
                                          .then(class_(var1, gp_3.class_("if"), true)))
                                       .then(class_(var1, gp_3.class_("unless"), false)))
                                    .then(gp_3.class_("as").then(gp_3.class_("targets", RZ.break_()).fork(var1, var0x -> {
                                       ArrayList var1x = Lists.newArrayList();

                                       for (an_3 var3 : RZ.byte_(var0x, "targets")) {
                                          var1x.add(((gy_3)var0x.getSource()).class_(var3));
                                       }

                                       return var1x;
                                    }))))
                                 .then(gp_3.class_("at").then(gp_3.class_("targets", RZ.break_()).fork(var1, var0x -> {
                                    ArrayList var1x = Lists.newArrayList();

                                    for (an_3 var3 : RZ.byte_(var0x, "targets")) {
                                       var1x.add(((gy_3)var0x.getSource()).class_((rrEm_1)((rYB)var3.throws_[7])).class_(var3.Ps()).class_(var3.import_()));
                                    }

                                    return var1x;
                                 }))))
                              .then(
                                 ((LiteralArgumentBuilder)gp_3.class_("store").then(class_(var1, gp_3.class_("result"), true)))
                                    .then(class_(var1, gp_3.class_("success"), false))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)gp_3.class_("positioned")
                                    .then(
                                       gp_3.class_("pos", Yw_1.class_())
                                          .redirect(var1, var0x -> ((gy_3)var0x.getSource()).class_(Yw_1.class_(var0x, "pos")).class_(Rm_1.FEET))
                                    ))
                                 .then(gp_3.class_("as").then(gp_3.class_("targets", RZ.break_()).fork(var1, var0x -> {
                                    ArrayList var1x = Lists.newArrayList();

                                    for (an_3 var3 : RZ.byte_(var0x, "targets")) {
                                       var1x.add(((gy_3)var0x.getSource()).class_(var3.Ps()));
                                    }

                                    return var1x;
                                 })))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)gp_3.class_("rotated")
                                 .then(
                                    gp_3.class_("rot", YZ.class_())
                                       .redirect(var1, var0x -> ((gy_3)var0x.getSource()).class_(YZ.class_(var0x, "rot").break_((gy_3)var0x.getSource())))
                                 ))
                              .then(gp_3.class_("as").then(gp_3.class_("targets", RZ.break_()).fork(var1, var0x -> {
                                 ArrayList var1x = Lists.newArrayList();

                                 for (an_3 var3 : RZ.byte_(var0x, "targets")) {
                                    var1x.add(((gy_3)var0x.getSource()).class_(var3.import_()));
                                 }

                                 return var1x;
                              })))
                        ))
                     .then(
                        ((LiteralArgumentBuilder)gp_3.class_("facing")
                              .then(
                                 gp_3.class_("entity").then(gp_3.class_("targets", RZ.break_()).then(gp_3.class_("anchor", Ru_1.class_()).fork(var1, var0x -> {
                                    ArrayList var1x = Lists.newArrayList();
                                    Rm_1 var2 = Ru_1.class_(var0x, "anchor");

                                    for (an_3 var4 : RZ.byte_(var0x, "targets")) {
                                       var1x.add(((gy_3)var0x.getSource()).class_(var4, var2));
                                    }

                                    return var1x;
                                 })))
                              ))
                           .then(gp_3.class_("pos", Yw_1.class_()).redirect(var1, var0x -> ((gy_3)var0x.getSource()).break_(Yw_1.class_(var0x, "pos"))))
                     ))
                  .then(
                     gp_3.class_("align")
                        .then(
                           gp_3.class_("axes", Yy_1.class_())
                              .redirect(
                                 var1, var0x -> ((gy_3)var0x.getSource()).class_(((gy_3)var0x.getSource()).volatile_().class_(Yy_1.class_(var0x, "axes")))
                              )
                        )
                  ))
               .then(
                  gp_3.class_("anchored")
                     .then(gp_3.class_("anchor", Ru_1.class_()).redirect(var1, var0x -> ((gy_3)var0x.getSource()).class_(Ru_1.class_(var0x, "anchor"))))
               ))
            .then(
               gp_3.class_("in")
                  .then(gp_3.class_("dimension", RN.class_()).redirect(var1, var0x -> ((gy_3)var0x.getSource()).class_(RN.class_(var0x, "dimension"))))
            )
      );
   }

   private static int class_(KI var0, YJ var1) throws CommandSyntaxException {
      return var1.break_(var0.class_());
   }

   private static ArgumentBuilder<gy_3, ?> class_(CommandNode<gy_3> var0, ArgumentBuilder<gy_3, ?> var1, boolean var2, boolean var3) {
      return var1.fork(var0, var2x -> class_(var2x, var2, byte_(var2x, var3).isPresent()))
         .executes(var2 ? var1x -> class_(var1x, var3) : var1x -> break_(var1x, var3));
   }

   private static int class_(CommandContext<gy_3> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var2 = byte_(var0, var1);
      if (var2.isPresent()) {
         ((gy_3)var0.getSource()).class_(new rgn_3("commands.execute.conditional.pass_count", var2.getAsInt()), false);
         return var2.getAsInt();
      } else {
         throw break_.create();
      }
   }

   private static ArgumentBuilder<gy_3, ?> class_(CommandNode<gy_3> var0, ArgumentBuilder<gy_3, ?> var1, boolean var2, oQ_2 var3) {
      return var1.fork(var0, var2x -> class_(var2x, var2, var3.test(var2x))).executes(var2x -> {
         if (var2 == var3.test(var2x)) {
            ((gy_3)var2x.getSource()).class_(new rgn_3("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw break_.create();
         }
      });
   }

   private static OptionalInt class_(rrEm_1 var0, rfH_2 var1, rfH_2 var2, rfH_2 var3, boolean var4) throws CommandSyntaxException {
      rfi_3 var5 = new rfi_3(var1, var2);
      rfi_3 var6 = new rfi_3(var3, var3.break_(var5.byte_()));
      rfH_2 var7 = new rfH_2(var6.class_ - var5.class_, var6.break_ - var5.break_, var6.byte_ - var5.byte_);
      int var8 = var5.protected_() * var5.throws_() * var5.case_();
      if (var8 > 32768) {
         throw class_.create(32768, var8);
      } else {
         int var9 = 0;

         for (int var10 = var5.byte_; var10 <= var5.case_; var10++) {
            for (int var11 = var5.break_; var11 <= var5.throws_; var11++) {
               for (int var12 = var5.class_; var12 <= var5.protected_; var12++) {
                  rfH_2 var13 = new rfH_2(var12, var11, var10);
                  rfH_2 var14 = var13.break_(var7);
                  xc_3 var15 = var0.byte_(var13);
                  if (!var4 || !var15.class_(xu_3.class_)) {
                     if (var15 != var0.byte_(var14)) {
                        return OptionalInt.empty();
                     }

                     ryO_2 var16 = var0.class_(var13);
                     ryO_2 var17 = var0.class_(var14);
                     if (var16 != null) {
                        if (var17 == null) {
                           return OptionalInt.empty();
                        }

                        rcd_3 var18 = var16.class_(new rcd_3());
                        var18.continue_("x");
                        var18.continue_("y");
                        var18.continue_("z");
                        rcd_3 var19 = var17.class_(new rcd_3());
                        var19.continue_("x");
                        var19.continue_("y");
                        var19.continue_("z");
                        if (!var18.equals(var19)) {
                           return OptionalInt.empty();
                        }
                     }

                     var9++;
                  }
               }
            }
         }

         return OptionalInt.of(var9);
      }
   }

   private static boolean class_(CommandContext<gy_3> var0, XF var1) throws CommandSyntaxException {
      String var2 = Yv_1.class_(var0, "target");
      rnP_2 var3 = Yk_1.class_(var0, "targetObjective");
      rnG_2 var4 = ((gy_3)var0.getSource()).super_().R();
      return !var4.class_(var2, var3) ? false : var1.byte_(var4.break_(var2, var3).break_());
   }

   private static boolean class_(CommandContext<gy_3> var0, BiPredicate<Integer, Integer> var1) throws CommandSyntaxException {
      String var2 = Yv_1.class_(var0, "target");
      rnP_2 var3 = Yk_1.class_(var0, "targetObjective");
      String var4 = Yv_1.class_(var0, "source");
      rnP_2 var5 = Yk_1.class_(var0, "sourceObjective");
      rnG_2 var6 = ((gy_3)var0.getSource()).super_().R();
      if (var6.class_(var2, var3) && var6.class_(var4, var5)) {
         rAa_1 var7 = var6.break_(var2, var3);
         rAa_1 var8 = var6.break_(var4, var5);
         return var1.test(var7.break_(), var8.break_());
      } else {
         return false;
      }
   }

   private static Collection<gy_3> class_(CommandContext<gy_3> var0, boolean var1, boolean var2) {
      return (Collection<gy_3>)(var2 == var1 ? Collections.singleton((gy_3)var0.getSource()) : Collections.emptyList());
   }

   private static boolean class_(gy_3 var0, rQz_1 var1) {
      rrEm_1 var2 = var0.final_();
      rzP_2 var3 = new rzP_2(var2).class_(rzQ_2.case_, var0.volatile_()).break_(rzQ_2.class_, var0.package_());
      return var1.test(var3.class_(rzz_3.byte_));
   }

   private static int break_(CommandContext<gy_3> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var2 = byte_(var0, var1);
      if (var2.isPresent()) {
         throw byte_.create(var2.getAsInt());
      } else {
         ((gy_3)var0.getSource()).class_(new rgn_3("commands.execute.conditional.pass"), false);
         return 1;
      }
   }
}
