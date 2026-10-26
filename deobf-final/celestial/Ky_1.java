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
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType throws_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.get.invalid", var0));
   private static final DynamicCommandExceptionType case_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.get.unknown", var0));
   private static final SimpleCommandExceptionType catch_ = new SimpleCommandExceptionType(new rgn_3("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType private_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.modify.expected_list", var0));
   private static final DynamicCommandExceptionType implements_ = new DynamicCommandExceptionType(
      var0 -> new rgn_3("commands.data.modify.expected_object", var0)
   );
   private static final DynamicCommandExceptionType finally_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.data.modify.invalid_index", var0));
   public static final List<Function<String, Kp_1>> class_ = ImmutableList.of(Kt_1.class_, Kl_1.class_, Kf_1.class_);
   public static final List<Kp_1> break_ = class_.stream().map(var0 -> var0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<Kp_1> byte_ = class_.stream().map(var0 -> var0.apply("source")).collect(ImmutableList.toImmutableList());

   private static int class_(CommandContext<gy_3> var0, Kp_1 var1, KT var2, List<rcZ_2> var3) throws CommandSyntaxException {
      KI var4 = var1.class_(var0);
      YJ var5 = YE.class_(var0, "targetPath");
      rcd_3 var6 = var4.class_();
      int var7 = var2.modify(var0, var6, var5, var3);
      if (var7 == 0) {
         throw protected_.create();
      } else {
         var4.class_(var6);
         ((gy_3)var0.getSource()).class_(var4.break_(), true);
         return var7;
      }
   }

   private static int class_(gy_3 var0, KI var1, YJ var2) throws CommandSyntaxException {
      rcd_3 var3 = var1.class_();
      int var4 = var2.byte_(var3);
      if (var4 == 0) {
         throw protected_.create();
      } else {
         var1.class_(var3);
         var0.class_(var1.break_(), true);
         return var4;
      }
   }

   private static int class_(int var0, rcd_3 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException {
      List var4 = var2.class_(var1, rcy_3::new);
      int var5 = 0;

      for (rcZ_2 var7 : var4) {
         if (!(var7 instanceof rcx_3)) {
            throw private_.create(var7);
         }

         boolean var8 = false;
         rcx_3 var9 = (rcx_3)var7;
         int var10 = var0 < 0 ? var9.size() + var0 + 1 : var0;

         for (rcZ_2 var12 : var3) {
            try {
               if (var9.break_(var10, var12.byte_())) {
                  var10++;
                  var8 = true;
               }
            } catch (IndexOutOfBoundsException var14) {
               throw finally_.create(var10);
            }
         }

         var5 += var8 ? 1 : 0;
      }

      return var5;
   }

   private static ArgumentBuilder<gy_3, ?> class_(BiConsumer<ArgumentBuilder<gy_3, ?>, Kq_1> var0) {
      LiteralArgumentBuilder var1 = gp_3.class_("modify");

      for (Kp_1 var3 : break_) {
         var3.class_(var1, var2 -> {
            RequiredArgumentBuilder var3x = gp_3.class_("targetPath", YE.class_());

            for (Kp_1 var5 : byte_) {
               var0.accept(var3x, var2x -> var5.class_(gp_3.class_("from"), var3xx -> var3xx.executes(var3xxx -> {
                        List var4 = Collections.singletonList(var5.class_(var3xxx).class_());
                        return class_(var3xxx, var3, var2x, var4);
                     }).then(gp_3.class_("sourcePath", YE.class_()).executes(var3xxx -> {
                        KI var4 = var5.class_(var3xxx);
                        YJ var5x = YE.class_(var3xxx, "sourcePath");
                        List var6 = var5x.class_(var4.class_());
                        return class_(var3xxx, var3, var2x, var6);
                     }))));
            }

            var0.accept(var3x, var1xx -> gp_3.class_("value").then(gp_3.class_("value", Yd_1.class_()).executes(var2x -> {
                  List var3xx = Collections.singletonList(Yd_1.class_(var2x, "value"));
                  return class_(var2x, var3, var1xx, var3xx);
               })));
            return var2.then(var3x);
         });
      }

      return var1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.class_("data").requires(var0x -> var0x.class_(2));

      for (Kp_1 var3 : break_) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                     var3.class_(
                        gp_3.class_("merge"),
                        var1x -> var1x.then(
                              gp_3.class_("nbt", Ys_1.class_())
                                 .executes(var1xx -> class_((gy_3)var1xx.getSource(), var3.class_(var1xx), Ys_1.class_(var1xx, "nbt")))
                           )
                     )
                  ))
                  .then(
                     var3.class_(
                        gp_3.class_("get"),
                        var1x -> var1x.executes(var1xx -> class_((gy_3)var1xx.getSource(), var3.class_(var1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.class_("path", YE.class_())
                                       .executes(var1xx -> break_((gy_3)var1xx.getSource(), var3.class_(var1xx), YE.class_(var1xx, "path"))))
                                    .then(
                                       gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var1xx -> class_(
                                                   (gy_3)var1xx.getSource(),
                                                   var3.class_(var1xx),
                                                   YE.class_(var1xx, "path"),
                                                   DoubleArgumentType.getDouble(var1xx, "scale")
                                                )
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  var3.class_(
                     gp_3.class_("remove"),
                     var1x -> var1x.then(
                           gp_3.class_("path", YE.class_())
                              .executes(var1xx -> class_((gy_3)var1xx.getSource(), var3.class_(var1xx), YE.class_(var1xx, "path")))
                        )
                  )
               ))
            .then(
               class_(
                  (BiConsumer<ArgumentBuilder<gy_3, ?>, Kq_1>)((var0x, var1x) -> var0x.then(
                           gp_3.class_("insert").then(gp_3.class_("index", IntegerArgumentType.integer()).then(var1x.create((var0xx, var1xx, var2, var3x) -> {
                              int var4 = IntegerArgumentType.getInteger(var0xx, "index");
                              return class_(var4, var1xx, var2, var3x);
                           })))
                        )
                        .then(gp_3.class_("prepend").then(var1x.create((var0xx, var1xx, var2, var3x) -> class_(0, var1xx, var2, var3x))))
                        .then(gp_3.class_("append").then(var1x.create((var0xx, var1xx, var2, var3x) -> class_(-1, var1xx, var2, var3x))))
                        .then(
                           gp_3.class_("set")
                              .then(var1x.create((var0xx, var1xx, var2, var3x) -> var2.break_(var1xx, ((rcZ_2)Iterables.getLast(var3x))::byte_)))
                        )
                        .then(gp_3.class_("merge").then(var1x.create((var0xx, var1xx, var2, var3x) -> {
                           List var4 = var2.class_(var1xx, rcd_3::new);
                           int var5 = 0;

                           for (rcZ_2 var7 : var4) {
                              if (!(var7 instanceof rcd_3 var8)) {
                                 throw implements_.create(var7);
                              }

                              rcd_3 var9 = var8.catch_();

                              for (rcZ_2 var11 : var3x) {
                                 if (!(var11 instanceof rcd_3)) {
                                    throw implements_.create(var11);
                                 }

                                 var8.class_((rcd_3)var11);
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

   private static int class_(gy_3 var0, KI var1, rcd_3 var2) throws CommandSyntaxException {
      rcd_3 var3 = var1.class_();
      rcd_3 var4 = var3.catch_().class_(var2);
      if (var3.equals(var4)) {
         throw protected_.create();
      } else {
         var1.class_(var4);
         var0.class_(var1.break_(), true);
         return 1;
      }
   }

   private static int class_(gy_3 var0, KI var1) throws CommandSyntaxException {
      var0.class_(var1.class_((rcZ_2)var1.class_()), false);
      return 1;
   }

   private static int class_(gy_3 var0, KI var1, YJ var2, double var3) throws CommandSyntaxException {
      rcZ_2 var5 = class_(var2, var1);
      if (!(var5 instanceof rcK_2)) {
         throw throws_.create(var2.toString());
      } else {
         int var6 = rfU_2.byte_(((rcK_2)var5).implements_() * var3);
         var0.class_(var1.class_(var2, var3, var6), false);
         return var6;
      }
   }

   private static rcZ_2 class_(YJ var0, KI var1) throws CommandSyntaxException {
      List var2 = var0.class_(var1.class_());
      Iterator var3 = var2.iterator();
      rcZ_2 var4 = (rcZ_2)var3.next();
      if (var3.hasNext()) {
         throw catch_.create();
      } else {
         return var4;
      }
   }

   private static int break_(gy_3 var0, KI var1, YJ var2) throws CommandSyntaxException {
      rcZ_2 var3 = class_(var2, var1);
      int var4;
      if (var3 instanceof rcK_2) {
         var4 = rfU_2.byte_(((rcK_2)var3).implements_());
      } else if (var3 instanceof rcx_3) {
         var4 = ((rcx_3)var3).size();
      } else if (var3 instanceof rcd_3) {
         var4 = ((rcd_3)var3).throws_();
      } else {
         if (!(var3 instanceof rca_3)) {
            throw case_.create(var2.toString());
         }

         var4 = var3.native_().length();
      }

      var0.class_(var1.class_(var3), false);
      return var4;
   }
}
