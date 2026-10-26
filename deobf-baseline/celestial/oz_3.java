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
   private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.execute.blocks.toobig", var0, var1)
   );
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(
      var0 -> new rgn_3("commands.execute.conditional.fail_count", var0)
   );
   private static final BinaryOperator<ResultConsumer<gy_3>> id_protected = (var0, var1) -> (var2, var3, var4) -> {
         var0.onCommandComplete(var2, var3, var4);
         var1.onCommandComplete(var2, var3, var4);
      };
   private static final SuggestionProvider<gy_3> id_throws = (var0, var1) -> {
      rzZ_2 var2 = ((gy_3)var0.getSource()).id_super().K();
      return gR_2.id_class(var2.id_break(), var1);
   };

   private static OptionalInt id_byte(CommandContext<gy_3> var0, boolean var1) throws CommandSyntaxException {
      return id_class(((gy_3)var0.getSource()).id_final(), RM.id_class(var0, "start"), RM.id_class(var0, "end"), RM.id_class(var0, "destination"), var1);
   }

   private static Command<gy_3> id_class(boolean var0, oN_2 var1) {
      return var0 ? var1x -> {
         int var2 = var1.test(var1x);
         if (var2 > 0) {
            ((gy_3)var1x.getSource()).id_class(new rgn_3("commands.execute.conditional.pass_count", var2), false);
            return var2;
         } else {
            throw id_break.create();
         }
      } : var1x -> {
         int var2 = var1.test(var1x);
         if (var2 == 0) {
            ((gy_3)var1x.getSource()).id_class(new rgn_3("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw id_byte.create(var2);
         }
      };
   }

   private static ArgumentBuilder<gy_3, ?> id_class(CommandNode<gy_3> var0, LiteralArgumentBuilder<gy_3> var1, boolean var2) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                     gp_3.id_class("block")
                        .then(
                           gp_3.id_class("pos", RM.id_class())
                              .then(
                                 id_class(
                                    var0,
                                    gp_3.id_class("block", RO.id_class()),
                                    var2,
                                    var0x -> RO.id_class(var0x, "block").test(new ryw_3(((gy_3)var0x.getSource()).id_final(), RM.id_class(var0x, "pos"), true))
                                 )
                              )
                        )
                  ))
                  .then(
                     gp_3.id_class("score")
                        .then(
                           gp_3.id_class("target", Yv_1.id_class())
                              .suggests(Yv_1.id_class)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                                      "targetObjective", Yk_1.id_class()
                                                   )
                                                   .then(
                                                      gp_3.id_class("=")
                                                         .then(
                                                            gp_3.id_class("source", Yv_1.id_class())
                                                               .suggests(Yv_1.id_class)
                                                               .then(
                                                                  id_class(
                                                                     var0,
                                                                     gp_3.id_class("sourceObjective", Yk_1.id_class()),
                                                                     var2,
                                                                     var0x -> id_class(var0x, Integer::equals)
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("<")
                                                      .then(
                                                         gp_3.id_class("source", Yv_1.id_class())
                                                            .suggests(Yv_1.id_class)
                                                            .then(
                                                               id_class(
                                                                  var0,
                                                                  gp_3.id_class("sourceObjective", Yk_1.id_class()),
                                                                  var2,
                                                                  var0x -> id_class(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx < var1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                gp_3.id_class("<=")
                                                   .then(
                                                      gp_3.id_class("source", Yv_1.id_class())
                                                         .suggests(Yv_1.id_class)
                                                         .then(
                                                            id_class(
                                                               var0,
                                                               gp_3.id_class("sourceObjective", Yk_1.id_class()),
                                                               var2,
                                                               var0x -> id_class(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx <= var1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             gp_3.id_class(">")
                                                .then(
                                                   gp_3.id_class("source", Yv_1.id_class())
                                                      .suggests(Yv_1.id_class)
                                                      .then(
                                                         id_class(
                                                            var0,
                                                            gp_3.id_class("sourceObjective", Yk_1.id_class()),
                                                            var2,
                                                            var0x -> id_class(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx > var1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class(">=")
                                             .then(
                                                gp_3.id_class("source", Yv_1.id_class())
                                                   .suggests(Yv_1.id_class)
                                                   .then(
                                                      id_class(
                                                         var0,
                                                         gp_3.id_class("sourceObjective", Yk_1.id_class()),
                                                         var2,
                                                         var0x -> id_class(var0x, (BiPredicate<Integer, Integer>)((var0xx, var1x) -> var0xx >= var1x))
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("matches")
                                          .then(
                                             id_class(
                                                var0, gp_3.id_class("range", Rj_1.id_class()), var2, var0x -> id_class(var0x, Rg_1.id_class(var0x, "range"))
                                             )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  gp_3.id_class("blocks")
                     .then(
                        gp_3.id_class("start", RM.id_class())
                           .then(
                              gp_3.id_class("end", RM.id_class())
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.id_class("destination", RM.id_class())
                                          .then(id_class(var0, gp_3.id_class("all"), var2, false)))
                                       .then(id_class(var0, gp_3.id_class("masked"), var2, true))
                                 )
                           )
                     )
               ))
            .then(
               gp_3.id_class("entity")
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("entities", RZ.id_break())
                           .fork(var0, var1x -> id_class(var1x, var2, !RZ.id_byte(var1x, "entities").isEmpty())))
                        .executes(id_class(var2, (oN_2)(var0x -> RZ.id_byte(var0x, "entities").size())))
                  )
            ))
         .then(
            gp_3.id_class("predicate")
               .then(
                  id_class(
                     var0,
                     gp_3.id_class("predicate", Ym_1.id_class()).suggests(id_throws),
                     var2,
                     var0x -> id_class((gy_3)var0x.getSource(), Ym_1.id_byte(var0x, "predicate"))
                  )
               )
         );

      for (Kp_1 var4 : Ky_1.id_byte) {
         var1.then(
            var4.id_class(
               gp_3.id_class("data"),
               var3 -> var3.then(
                     ((RequiredArgumentBuilder)gp_3.id_class("path", YE.id_class())
                           .fork(var0, var2xx -> id_class(var2xx, var2, id_class(var4.id_class(var2xx), YE.id_class(var2xx, "path")) > 0)))
                        .executes(id_class(var2, (oN_2)(var1xx -> id_class(var4.id_class(var1xx), YE.id_class(var1xx, "path")))))
                  )
            )
         );
      }

      return var1;
   }

   private static gy_3 id_class(gy_3 var0, KI var1, YJ var2, IntFunction<rcZ_2> var3, boolean var4) {
      return var0.id_class((var4x, var5, var6) -> {
         try {
            rcd_3 var7 = var1.id_class();
            int var8 = var4 ? var6 : (var5 ? 1 : 0);
            var2.id_break(var7, () -> (rcZ_2)var3.apply(var8));
            var1.id_class(var7);
         } catch (CommandSyntaxException var9) {
         }
      }, id_protected);
   }

   private static gy_3 id_class(gy_3 var0, rnx_3 var1, boolean var2, boolean var3) {
      return var0.id_class((var3x, var4, var5) -> {
         int var6 = var3 ? var5 : (var4 ? 1 : 0);
         if (var2) {
            var1.id_class(var6);
         } else {
            var1.id_break(var6);
         }
      }, id_protected);
   }

   private static gy_3 id_class(gy_3 var0, Collection<String> var1, rnP_2 var2, boolean var3) {
      rnG_2 var4 = var0.id_super().R();
      return var0.id_class((var4x, var5, var6) -> {
         for (String var8 : var1) {
            rAa_1 var9 = var4.id_break(var8, var2);
            int var10 = var3 ? var6 : (var5 ? 1 : 0);
            var9.id_break(var10);
         }
      }, id_protected);
   }

   private static ArgumentBuilder<gy_3, ?> id_class(LiteralCommandNode<gy_3> var0, LiteralArgumentBuilder<gy_3> var1, boolean var2) {
      var1.then(
         gp_3.id_class("score")
            .then(
               gp_3.id_class("targets", Yv_1.id_break())
                  .suggests(Yv_1.id_class)
                  .then(
                     gp_3.id_class("objective", Yk_1.id_class())
                        .redirect(var0, var1x -> id_class((gy_3)var1x.getSource(), Yv_1.id_byte(var1x, "targets"), Yk_1.id_class(var1x, "objective"), var2))
                  )
            )
      );
      var1.then(
         gp_3.id_class("bossbar")
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("id", Ym_1.id_class())
                     .suggests(os_3.id_class)
                     .then(gp_3.id_class("value").redirect(var0, var1x -> id_class((gy_3)var1x.getSource(), os_3.id_class(var1x), true, var2))))
                  .then(gp_3.id_class("max").redirect(var0, var1x -> id_class((gy_3)var1x.getSource(), os_3.id_class(var1x), false, var2)))
            )
      );

      for (Kp_1 var4 : Ky_1.id_break) {
         var4.id_class(
            var1,
            var3 -> var3.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                       "path", YE.id_class()
                                    )
                                    .then(
                                       gp_3.id_class("id_int")
                                          .then(
                                             gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   var0,
                                                   var2xx -> id_class(
                                                         (gy_3)var2xx.getSource(),
                                                         var4.id_class(var2xx),
                                                         YE.id_class(var2xx, "path"),
                                                         var1xxx -> rcn_3.id_class((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                         var2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("float")
                                       .then(
                                          gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                var0,
                                                var2xx -> id_class(
                                                      (gy_3)var2xx.getSource(),
                                                      var4.id_class(var2xx),
                                                      YE.id_class(var2xx, "path"),
                                                      var1xxx -> rcu_3.id_class((float)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                      var2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("short")
                                    .then(
                                       gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             var0,
                                             var2xx -> id_class(
                                                   (gy_3)var2xx.getSource(),
                                                   var4.id_class(var2xx),
                                                   YE.id_class(var2xx, "path"),
                                                   var1xxx -> rcD_2.id_class((short)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
                                                   var2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("long")
                                 .then(
                                    gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          var0,
                                          var2xx -> id_class(
                                                (gy_3)var2xx.getSource(),
                                                var4.id_class(var2xx),
                                                YE.id_class(var2xx, "path"),
                                                var1xxx -> rct_3.id_class((long)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                var2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("double")
                              .then(
                                 gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       var0,
                                       var2xx -> id_class(
                                             (gy_3)var2xx.getSource(),
                                             var4.id_class(var2xx),
                                             YE.id_class(var2xx, "path"),
                                             var1xxx -> rcz_3.id_class((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")),
                                             var2
                                          )
                                    )
                              )
                        ))
                     .then(
                        gp_3.id_class("id_byte")
                           .then(
                              gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    var0,
                                    var2xx -> id_class(
                                          (gy_3)var2xx.getSource(),
                                          var4.id_class(var2xx),
                                          YE.id_class(var2xx, "path"),
                                          var1xxx -> rch_3.id_class((byte)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
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

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register((LiteralArgumentBuilder)gp_3.id_class("execute").requires(var0x -> var0x.id_class(2)));
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                                   "execute"
                                                )
                                                .requires(var0x -> var0x.id_class(2)))
                                             .then(gp_3.id_class("run").redirect(var0.getRoot())))
                                          .then(id_class(var1, gp_3.id_class("if"), true)))
                                       .then(id_class(var1, gp_3.id_class("unless"), false)))
                                    .then(gp_3.id_class("as").then(gp_3.id_class("targets", RZ.id_break()).fork(var1, var0x -> {
                                       ArrayList var1x = Lists.newArrayList();

                                       for (an_3 var3 : RZ.id_byte(var0x, "targets")) {
                                          var1x.add(((gy_3)var0x.getSource()).id_class(var3));
                                       }

                                       return var1x;
                                    }))))
                                 .then(gp_3.id_class("at").then(gp_3.id_class("targets", RZ.id_break()).fork(var1, var0x -> {
                                    ArrayList var1x = Lists.newArrayList();

                                    for (an_3 var3 : RZ.id_byte(var0x, "targets")) {
                                       var1x.add(
                                          ((gy_3)var0x.getSource()).id_class((rrEm_1)((rYB)var3.id_throws[7])).id_class(var3.Ps()).id_class(var3.id_import())
                                       );
                                    }

                                    return var1x;
                                 }))))
                              .then(
                                 ((LiteralArgumentBuilder)gp_3.id_class("store").then(id_class(var1, gp_3.id_class("result"), true)))
                                    .then(id_class(var1, gp_3.id_class("success"), false))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)gp_3.id_class("positioned")
                                    .then(
                                       gp_3.id_class("pos", Yw_1.id_class())
                                          .redirect(var1, var0x -> ((gy_3)var0x.getSource()).id_class(Yw_1.id_class(var0x, "pos")).id_class(Rm_1.FEET))
                                    ))
                                 .then(gp_3.id_class("as").then(gp_3.id_class("targets", RZ.id_break()).fork(var1, var0x -> {
                                    ArrayList var1x = Lists.newArrayList();

                                    for (an_3 var3 : RZ.id_byte(var0x, "targets")) {
                                       var1x.add(((gy_3)var0x.getSource()).id_class(var3.Ps()));
                                    }

                                    return var1x;
                                 })))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)gp_3.id_class("rotated")
                                 .then(
                                    gp_3.id_class("rot", YZ.id_class())
                                       .redirect(var1, var0x -> ((gy_3)var0x.getSource()).id_class(YZ.id_class(var0x, "rot").id_break((gy_3)var0x.getSource())))
                                 ))
                              .then(gp_3.id_class("as").then(gp_3.id_class("targets", RZ.id_break()).fork(var1, var0x -> {
                                 ArrayList var1x = Lists.newArrayList();

                                 for (an_3 var3 : RZ.id_byte(var0x, "targets")) {
                                    var1x.add(((gy_3)var0x.getSource()).id_class(var3.id_import()));
                                 }

                                 return var1x;
                              })))
                        ))
                     .then(
                        ((LiteralArgumentBuilder)gp_3.id_class("facing")
                              .then(
                                 gp_3.id_class("entity")
                                    .then(gp_3.id_class("targets", RZ.id_break()).then(gp_3.id_class("anchor", Ru_1.id_class()).fork(var1, var0x -> {
                                       ArrayList var1x = Lists.newArrayList();
                                       Rm_1 var2 = Ru_1.id_class(var0x, "anchor");

                                       for (an_3 var4 : RZ.id_byte(var0x, "targets")) {
                                          var1x.add(((gy_3)var0x.getSource()).id_class(var4, var2));
                                       }

                                       return var1x;
                                    })))
                              ))
                           .then(gp_3.id_class("pos", Yw_1.id_class()).redirect(var1, var0x -> ((gy_3)var0x.getSource()).id_break(Yw_1.id_class(var0x, "pos"))))
                     ))
                  .then(
                     gp_3.id_class("align")
                        .then(
                           gp_3.id_class("axes", Yy_1.id_class())
                              .redirect(
                                 var1,
                                 var0x -> ((gy_3)var0x.getSource()).id_class(((gy_3)var0x.getSource()).id_volatile().id_class(Yy_1.id_class(var0x, "axes")))
                              )
                        )
                  ))
               .then(
                  gp_3.id_class("anchored")
                     .then(gp_3.id_class("anchor", Ru_1.id_class()).redirect(var1, var0x -> ((gy_3)var0x.getSource()).id_class(Ru_1.id_class(var0x, "anchor"))))
               ))
            .then(
               gp_3.id_class("in")
                  .then(gp_3.id_class("dimension", RN.id_class()).redirect(var1, var0x -> ((gy_3)var0x.getSource()).id_class(RN.id_class(var0x, "dimension"))))
            )
      );
   }

   private static int id_class(KI var0, YJ var1) throws CommandSyntaxException {
      return var1.id_break(var0.id_class());
   }

   private static ArgumentBuilder<gy_3, ?> id_class(CommandNode<gy_3> var0, ArgumentBuilder<gy_3, ?> var1, boolean var2, boolean var3) {
      return var1.fork(var0, var2x -> id_class(var2x, var2, id_byte(var2x, var3).isPresent()))
         .executes(var2 ? var1x -> id_class(var1x, var3) : var1x -> id_break(var1x, var3));
   }

   private static int id_class(CommandContext<gy_3> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var2 = id_byte(var0, var1);
      if (var2.isPresent()) {
         ((gy_3)var0.getSource()).id_class(new rgn_3("commands.execute.conditional.pass_count", var2.getAsInt()), false);
         return var2.getAsInt();
      } else {
         throw id_break.create();
      }
   }

   private static ArgumentBuilder<gy_3, ?> id_class(CommandNode<gy_3> var0, ArgumentBuilder<gy_3, ?> var1, boolean var2, oQ_2 var3) {
      return var1.fork(var0, var2x -> id_class(var2x, var2, var3.test(var2x))).executes(var2x -> {
         if (var2 == var3.test(var2x)) {
            ((gy_3)var2x.getSource()).id_class(new rgn_3("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw id_break.create();
         }
      });
   }

   private static OptionalInt id_class(rrEm_1 var0, rfH_2 var1, rfH_2 var2, rfH_2 var3, boolean var4) throws CommandSyntaxException {
      rfi_3 var5 = new rfi_3(var1, var2);
      rfi_3 var6 = new rfi_3(var3, var3.id_break(var5.id_byte()));
      rfH_2 var7 = new rfH_2(var6.id_class - var5.id_class, var6.id_break - var5.id_break, var6.id_byte - var5.id_byte);
      int var8 = var5.id_protected() * var5.id_throws() * var5.id_case();
      if (var8 > 32768) {
         throw id_class.create(32768, var8);
      } else {
         int var9 = 0;

         for (int var10 = var5.id_byte; var10 <= var5.id_case; var10++) {
            for (int var11 = var5.id_break; var11 <= var5.id_throws; var11++) {
               for (int var12 = var5.id_class; var12 <= var5.id_protected; var12++) {
                  rfH_2 var13 = new rfH_2(var12, var11, var10);
                  rfH_2 var14 = var13.id_break(var7);
                  xc_3 var15 = var0.id_byte(var13);
                  if (!var4 || !var15.id_class(xu_3.id_class)) {
                     if (var15 != var0.id_byte(var14)) {
                        return OptionalInt.empty();
                     }

                     ryO_2 var16 = var0.id_class(var13);
                     ryO_2 var17 = var0.id_class(var14);
                     if (var16 != null) {
                        if (var17 == null) {
                           return OptionalInt.empty();
                        }

                        rcd_3 var18 = var16.id_class(new rcd_3());
                        var18.id_continue("x");
                        var18.id_continue("y");
                        var18.id_continue("z");
                        rcd_3 var19 = var17.id_class(new rcd_3());
                        var19.id_continue("x");
                        var19.id_continue("y");
                        var19.id_continue("z");
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

   private static boolean id_class(CommandContext<gy_3> var0, XF var1) throws CommandSyntaxException {
      String var2 = Yv_1.id_class(var0, "target");
      rnP_2 var3 = Yk_1.id_class(var0, "targetObjective");
      rnG_2 var4 = ((gy_3)var0.getSource()).id_super().R();
      return !var4.id_class(var2, var3) ? false : var1.id_byte(var4.id_break(var2, var3).id_break());
   }

   private static boolean id_class(CommandContext<gy_3> var0, BiPredicate<Integer, Integer> var1) throws CommandSyntaxException {
      String var2 = Yv_1.id_class(var0, "target");
      rnP_2 var3 = Yk_1.id_class(var0, "targetObjective");
      String var4 = Yv_1.id_class(var0, "source");
      rnP_2 var5 = Yk_1.id_class(var0, "sourceObjective");
      rnG_2 var6 = ((gy_3)var0.getSource()).id_super().R();
      if (var6.id_class(var2, var3) && var6.id_class(var4, var5)) {
         rAa_1 var7 = var6.id_break(var2, var3);
         rAa_1 var8 = var6.id_break(var4, var5);
         return var1.test(var7.id_break(), var8.id_break());
      } else {
         return false;
      }
   }

   private static Collection<gy_3> id_class(CommandContext<gy_3> var0, boolean var1, boolean var2) {
      return (Collection<gy_3>)(var2 == var1 ? Collections.singleton((gy_3)var0.getSource()) : Collections.emptyList());
   }

   private static boolean id_class(gy_3 var0, rQz_1 var1) {
      rrEm_1 var2 = var0.id_final();
      rzP_2 var3 = new rzP_2(var2).id_class(rzQ_2.id_case, var0.id_volatile()).id_break(rzQ_2.id_class, var0.id_package());
      return var1.test(var3.id_class(rzz_3.id_byte));
   }

   private static int id_break(CommandContext<gy_3> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var2 = id_byte(var0, var1);
      if (var2.isPresent()) {
         throw id_byte.create(var2.getAsInt());
      } else {
         ((gy_3)var0.getSource()).id_class(new rgn_3("commands.execute.conditional.pass"), false);
         return 1;
      }
   }
}
