package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Ky_1 {
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType id_throws = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.get.invalid", var0));
   private static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.get.unknown", var0));
   private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType(new rgn_3("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType id_private = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.modify.expected_list", var0));
   private static final DynamicCommandExceptionType id_implements = new DynamicCommandExceptionType(
      var0 -> new rgn_3("commands.data.modify.expected_object", var0)
   );
   private static final DynamicCommandExceptionType id_finally = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.modify.invalid_index", var0));
   public static final List<Function<String, Kp_1>> id_class = ImmutableList.of(Kt_1.id_class, Kl_1.id_class, Kf_1.id_class);
   public static final List<Kp_1> id_break = id_class.stream().map(var0 -> var0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<Kp_1> id_byte = id_class.stream().map(var0 -> var0.apply("source")).collect(ImmutableList.toImmutableList());

   private static int id_class(CommandContext<gy_3> var0, Kp_1 var1, KT var2, List<rcZ_2> var3) throws CommandSyntaxException {
      KI var4 = var1.id_class(var0);
      YJ var5 = YE.id_class(var0, "targetPath");
      rcd_3 var6 = var4.id_class();
      int var7 = var2.modify(var0, var6, var5, var3);
      if (var7 == 0) {
         throw id_protected.create();
      } else {
         var4.id_class(var6);
         ((gy_3)var0.getSource()).id_class(var4.id_break(), true);
         return var7;
      }
   }

   private static int id_class(gy_3 var0, KI var1, YJ var2) throws CommandSyntaxException {
      rcd_3 var3 = var1.id_class();
      int var4 = var2.id_byte(var3);
      if (var4 == 0) {
         throw id_protected.create();
      } else {
         var1.id_class(var3);
         var0.id_class(var1.id_break(), true);
         return var4;
      }
   }

   private static int id_class(int var0, rcd_3 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException {
      List var4 = var2.id_class(var1, rcy_3::new);
      int var5 = 0;

      for (rcZ_2 var7 : var4) {
         if (!(var7 instanceof rcx_3)) {
            throw id_private.create(var7);
         }

         boolean var8 = false;
         rcx_3 var9 = (rcx_3)var7;
         int var10 = var0 < 0 ? var9.size() + var0 + 1 : var0;

         for (rcZ_2 var12 : var3) {
            try {
               if (var9.id_break(var10, var12.id_byte())) {
                  var10++;
                  var8 = true;
               }
            } catch (IndexOutOfBoundsException var14) {
               throw id_finally.create(var10);
            }
         }

         var5 += var8 ? 1 : 0;
      }

      return var5;
   }

   private static ArgumentBuilder<gy_3, ?> id_class(BiConsumer<ArgumentBuilder<gy_3, ?>, Kq_1> var0) {
      LiteralArgumentBuilder var1 = gp_3.id_class("modify");

      for (Kp_1 var3 : id_break) {
         var3.id_class(var1, var2 -> {
            RequiredArgumentBuilder var3x = gp_3.id_class("targetPath", YE.id_class());

            for (Kp_1 var5 : id_byte) {
               var0.accept(var3x, var2x -> var5.id_class(gp_3.id_class("from"), var3xx -> var3xx.executes(var3xxx -> {
                        List var4 = Collections.singletonList(var5.id_class(var3xxx).id_class());
                        return id_class(var3xxx, var3, var2x, var4);
                     }).then(gp_3.id_class("sourcePath", YE.id_class()).executes(var3xxx -> {
                        KI var4 = var5.id_class(var3xxx);
                        YJ var5x = YE.id_class(var3xxx, "sourcePath");
                        List var6 = var5x.id_class(var4.id_class());
                        return id_class(var3xxx, var3, var2x, var6);
                     }))));
            }

            var0.accept(var3x, var1xx -> gp_3.id_class("value").then(gp_3.id_class("value", Yd_1.id_class()).executes(var2x -> {
                  List var3xx = Collections.singletonList(Yd_1.id_class(var2x, "value"));
                  return id_class(var2x, var3, var1xx, var3xx);
               })));
            return var2.then(var3x);
         });
      }

      return var1;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.id_class("data").requires(var0x -> var0x.id_class(2));

      for (Kp_1 var3 : id_break) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                     var3.id_class(
                        gp_3.id_class("merge"),
                        var1x -> var1x.then(
                              gp_3.id_class("nbt", Ys_1.id_class())
                                 .executes(var1xx -> id_class((gy_3)var1xx.getSource(), var3.id_class(var1xx), Ys_1.id_class(var1xx, "nbt")))
                           )
                     )
                  ))
                  .then(
                     var3.id_class(
                        gp_3.id_class("get"),
                        var1x -> var1x.executes(var1xx -> id_class((gy_3)var1xx.getSource(), var3.id_class(var1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.id_class("path", YE.id_class())
                                       .executes(var1xx -> id_break((gy_3)var1xx.getSource(), var3.id_class(var1xx), YE.id_class(var1xx, "path"))))
                                    .then(
                                       gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var1xx -> id_class(
                                                   (gy_3)var1xx.getSource(),
                                                   var3.id_class(var1xx),
                                                   YE.id_class(var1xx, "path"),
                                                   DoubleArgumentType.getDouble(var1xx, "scale")
                                                )
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  var3.id_class(
                     gp_3.id_class("remove"),
                     var1x -> var1x.then(
                           gp_3.id_class("path", YE.id_class())
                              .executes(var1xx -> id_class((gy_3)var1xx.getSource(), var3.id_class(var1xx), YE.id_class(var1xx, "path")))
                        )
                  )
               ))
            .then(
               id_class(
                  (BiConsumer<ArgumentBuilder<gy_3, ?>, Kq_1>)((var0x, var1x) -> var0x.then(
                           gp_3.id_class("insert")
                              .then(gp_3.id_class("index", IntegerArgumentType.integer()).then(var1x.create((var0xx, var1xx, var2, var3x) -> {
                                 int var4 = IntegerArgumentType.getInteger(var0xx, "index");
                                 return id_class(var4, var1xx, var2, var3x);
                              })))
                        )
                        .then(gp_3.id_class("prepend").then(var1x.create((var0xx, var1xx, var2, var3x) -> id_class(0, var1xx, var2, var3x))))
                        .then(gp_3.id_class("append").then(var1x.create((var0xx, var1xx, var2, var3x) -> id_class(-1, var1xx, var2, var3x))))
                        .then(
                           gp_3.id_class("set")
                              .then(var1x.create((var0xx, var1xx, var2, var3x) -> var2.id_break(var1xx, ((rcZ_2)Iterables.getLast(var3x))::id_byte)))
                        )
                        .then(gp_3.id_class("merge").then(var1x.create((var0xx, var1xx, var2, var3x) -> {
                           List var4 = var2.id_class(var1xx, rcd_3::new);
                           int var5 = 0;

                           for (rcZ_2 var7 : var4) {
                              if (!(var7 instanceof rcd_3 var8)) {
                                 throw id_implements.create(var7);
                              }

                              rcd_3 var9 = var8.id_catch();

                              for (rcZ_2 var11 : var3x) {
                                 if (!(var11 instanceof rcd_3)) {
                                    throw id_implements.create(var11);
                                 }

                                 var8.id_class((rcd_3)var11);
                              }

                              var5 += var9.equals(var8) ? 0 : 1;
                           }

                           return var5;
                        }))))
               )
            );
      }

      var0.register(var1);
   }

   private static int id_class(gy_3 var0, KI var1, rcd_3 var2) throws CommandSyntaxException {
      rcd_3 var3 = var1.id_class();
      rcd_3 var4 = var3.id_catch().id_class(var2);
      if (var3.equals(var4)) {
         throw id_protected.create();
      } else {
         var1.id_class(var4);
         var0.id_class(var1.id_break(), true);
         return 1;
      }
   }

   private static int id_class(gy_3 var0, KI var1) throws CommandSyntaxException {
      var0.id_class(var1.id_class((rcZ_2)var1.id_class()), false);
      return 1;
   }

   private static int id_class(gy_3 var0, KI var1, YJ var2, double var3) throws CommandSyntaxException {
      rcZ_2 var5 = id_class(var2, var1);
      if (!(var5 instanceof rcK_2)) {
         throw id_throws.create(var2.toString());
      } else {
         int var6 = rfU_2.id_byte(((rcK_2)var5).id_implements() * var3);
         var0.id_class(var1.id_class(var2, var3, var6), false);
         return var6;
      }
   }

   private static rcZ_2 id_class(YJ var0, KI var1) throws CommandSyntaxException {
      List var2 = var0.id_class(var1.id_class());
      Iterator var3 = var2.iterator();
      rcZ_2 var4 = (rcZ_2)var3.next();
      if (var3.hasNext()) {
         throw id_catch.create();
      } else {
         return var4;
      }
   }

   private static int id_break(gy_3 var0, KI var1, YJ var2) throws CommandSyntaxException {
      rcZ_2 var3 = id_class(var2, var1);
      int var4;
      if (var3 instanceof rcK_2) {
         var4 = rfU_2.id_byte(((rcK_2)var3).id_implements());
      } else if (var3 instanceof rcx_3) {
         var4 = ((rcx_3)var3).size();
      } else if (var3 instanceof rcd_3) {
         var4 = ((rcd_3)var3).id_throws();
      } else {
         if (!(var3 instanceof rca_3)) {
            throw id_case.create(var2.toString());
         }

         var4 = var3.id_native().length();
      }

      var0.id_class(var1.id_class(var3), false);
      return var4;
   }
}
