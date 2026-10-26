package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class oO_2 {
   private static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.datapack.unknown", var0));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.datapack.enable.failed", var0));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.datapack.disable.failed", var0));
   private static final SuggestionProvider<gy_3> protected_ = (var0, var1) -> gR_2.break_(
         ((gy_3)var0.getSource()).super_().I().protected_().stream().map(StringArgumentType::escapeIfRequired), var1
      );
   private static final SuggestionProvider<gy_3> throws_ = (var0, var1) -> {
      rAt_1 var2 = ((gy_3)var0.getSource()).super_().I();
      Collection var3 = var2.protected_();
      return gR_2.break_(var2.break_().stream().filter(var1x -> !var3.contains(var1x)).map(StringArgumentType::escapeIfRequired), var1);
   };

   private static int byte_(gy_3 var0) {
      rAt_1 var1 = var0.super_().I();
      var1.class_();
      Collection var2 = var1.throws_();
      if (var2.isEmpty()) {
         var0.class_(new rgn_3("commands.datapack.list.enabled.none"), false);
      } else {
         var0.class_(new rgn_3("commands.datapack.list.enabled.success", var2.size(), rgv_3.break_(var2, var0x -> var0x.class_(true))), false);
      }

      return var2.size();
   }

   private static int class_(gy_3 var0, rAp_1 var1, oh_3 var2) throws CommandSyntaxException {
      rAt_1 var3 = var0.super_().I();
      ArrayList var4 = Lists.newArrayList(var3.throws_());
      var2.apply(var4, var1);
      var0.class_(new rgn_3("commands.datapack.modify.enable", var1.class_(true)), true);
      oe_3.class_(var4.stream().map(rAp_1::throws_).collect(Collectors.toList()), var0);
      return var4.size();
   }

   private static int class_(gy_3 var0, rAp_1 var1) {
      rAt_1 var2 = var0.super_().I();
      ArrayList var3 = Lists.newArrayList(var2.throws_());
      var3.remove(var1);
      var0.class_(new rgn_3("commands.datapack.modify.disable", var1.class_(true)), true);
      oe_3.class_(var3.stream().map(rAp_1::throws_).collect(Collectors.toList()), var0);
      return var3.size();
   }

   private static int class_(gy_3 var0) {
      return byte_(var0) + break_(var0);
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("datapack")
                     .requires(var0x -> var0x.class_(2)))
                  .then(
                     gp_3.class_("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(throws_)
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   class_(var0x, "name", true),
                                                   (var0xx, var1) -> var1.private_().class_(var0xx, var1, var0xxx -> var0xxx, false)
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("after")
                                             .then(
                                                gp_3.class_("existing", StringArgumentType.string())
                                                   .suggests(protected_)
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            class_(var0x, "name", true),
                                                            (var1, var2) -> var1.add(var1.indexOf(class_(var0x, "existing", false)) + 1, var2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.class_("before")
                                          .then(
                                             gp_3.class_("existing", StringArgumentType.string())
                                                .suggests(protected_)
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         class_(var0x, "name", true),
                                                         (var1, var2) -> var1.add(var1.indexOf(class_(var0x, "existing", false)), var2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(gp_3.class_("last").executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x, "name", true), List::add))))
                              .then(
                                 gp_3.class_("first")
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x, "name", true), (var0xx, var1) -> var0xx.add(0, var1)))
                              )
                        )
                  ))
               .then(
                  gp_3.class_("disable")
                     .then(
                        gp_3.class_("name", StringArgumentType.string())
                           .suggests(protected_)
                           .executes(var0x -> class_((gy_3)var0x.getSource(), class_(var0x, "name", false)))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("list").executes(var0x -> class_((gy_3)var0x.getSource())))
                     .then(gp_3.class_("available").executes(var0x -> break_((gy_3)var0x.getSource()))))
                  .then(gp_3.class_("enabled").executes(var0x -> byte_((gy_3)var0x.getSource())))
            )
      );
   }

   private static rAp_1 class_(CommandContext<gy_3> var0, String var1, boolean var2) throws CommandSyntaxException {
      String var3 = StringArgumentType.getString(var0, var1);
      rAt_1 var4 = ((gy_3)var0.getSource()).super_().I();
      rAp_1 var5 = var4.class_(var3);
      if (var5 == null) {
         throw class_.create(var3);
      } else {
         boolean var6 = var4.throws_().contains(var5);
         if (var2 && var6) {
            throw break_.create(var3);
         } else if (!var2 && !var6) {
            throw byte_.create(var3);
         } else {
            return var5;
         }
      }
   }

   private static int break_(gy_3 var0) {
      rAt_1 var1 = var0.super_().I();
      var1.class_();
      Collection var2 = var1.throws_();
      Collection var3 = var1.byte_();
      List var4 = var3.stream().filter(var1x -> !var2.contains(var1x)).collect(Collectors.toList());
      if (var4.isEmpty()) {
         var0.class_(new rgn_3("commands.datapack.list.available.none"), false);
      } else {
         var0.class_(new rgn_3("commands.datapack.list.available.success", var4.size(), rgv_3.break_(var4, var0x -> var0x.class_(false))), false);
      }

      return var4.size();
   }
}
