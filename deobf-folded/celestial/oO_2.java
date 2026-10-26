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
   private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.datapack.unknown", var0));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.datapack.enable.failed", var0));
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.datapack.disable.failed", var0));
   private static final SuggestionProvider<gy_3> id_protected = (var0, var1) -> gR_2.id_break(
         ((gy_3)var0.getSource()).id_super().I().id_protected().stream().map(StringArgumentType::escapeIfRequired), var1
      );
   private static final SuggestionProvider<gy_3> id_throws = (var0, var1) -> {
      rAt_1 var2 = ((gy_3)var0.getSource()).id_super().I();
      Collection var3 = var2.id_protected();
      return gR_2.id_break(var2.id_break().stream().filter(var1x -> !var3.contains(var1x)).map(StringArgumentType::escapeIfRequired), var1);
   };

   private static int id_byte(gy_3 var0) {
      rAt_1 var1 = var0.id_super().I();
      var1.id_class();
      Collection var2 = var1.id_throws();
      if (var2.isEmpty()) {
         var0.id_class(new rgn_3("commands.datapack.list.enabled.none"), false);
      } else {
         var0.id_class(new rgn_3("commands.datapack.list.enabled.success", var2.size(), rgv_3.id_break(var2, var0x -> var0x.id_class(true))), false);
      }

      return var2.size();
   }

   private static int id_class(gy_3 var0, rAp_1 var1, oh_3 var2) throws CommandSyntaxException {
      rAt_1 var3 = var0.id_super().I();
      ArrayList var4 = Lists.newArrayList(var3.id_throws());
      var2.apply(var4, var1);
      var0.id_class(new rgn_3("commands.datapack.modify.enable", var1.id_class(true)), true);
      oe_3.id_class(var4.stream().map(rAp_1::id_throws).collect(Collectors.toList()), var0);
      return var4.size();
   }

   private static int id_class(gy_3 var0, rAp_1 var1) {
      rAt_1 var2 = var0.id_super().I();
      ArrayList var3 = Lists.newArrayList(var2.id_throws());
      var3.remove(var1);
      var0.id_class(new rgn_3("commands.datapack.modify.disable", var1.id_class(true)), true);
      oe_3.id_class(var3.stream().map(rAp_1::id_throws).collect(Collectors.toList()), var0);
      return var3.size();
   }

   private static int id_class(gy_3 var0) {
      return id_byte(var0) + id_break(var0);
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("datapack")
                     .requires(var0x -> var0x.id_class(2)))
                  .then(
                     gp_3.id_class("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(id_throws)
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   id_class(var0x, "name", true),
                                                   (var0xx, var1) -> var1.id_private().id_class(var0xx, var1, var0xxx -> var0xxx, false)
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("after")
                                             .then(
                                                gp_3.id_class("existing", StringArgumentType.string())
                                                   .suggests(id_protected)
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            id_class(var0x, "name", true),
                                                            (var1, var2) -> var1.add(var1.indexOf(id_class(var0x, "existing", false)) + 1, var2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       gp_3.id_class("before")
                                          .then(
                                             gp_3.id_class("existing", StringArgumentType.string())
                                                .suggests(id_protected)
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         id_class(var0x, "name", true),
                                                         (var1, var2) -> var1.add(var1.indexOf(id_class(var0x, "existing", false)), var2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(gp_3.id_class("last").executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x, "name", true), List::add))))
                              .then(
                                 gp_3.id_class("first")
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x, "name", true), (var0xx, var1) -> var0xx.add(0, var1)))
                              )
                        )
                  ))
               .then(
                  gp_3.id_class("disable")
                     .then(
                        gp_3.id_class("name", StringArgumentType.string())
                           .suggests(id_protected)
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), id_class(var0x, "name", false)))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("list").executes(var0x -> id_class((gy_3)var0x.getSource())))
                     .then(gp_3.id_class("available").executes(var0x -> id_break((gy_3)var0x.getSource()))))
                  .then(gp_3.id_class("enabled").executes(var0x -> id_byte((gy_3)var0x.getSource())))
            )
      );
   }

   private static rAp_1 id_class(CommandContext<gy_3> var0, String var1, boolean var2) throws CommandSyntaxException {
      String var3 = StringArgumentType.getString(var0, var1);
      rAt_1 var4 = ((gy_3)var0.getSource()).id_super().I();
      rAp_1 var5 = var4.id_class(var3);
      if (var5 == null) {
         throw id_class.create(var3);
      } else {
         boolean var6 = var4.id_throws().contains(var5);
         if (var2 && var6) {
            throw id_break.create(var3);
         } else if (!var2 && !var6) {
            throw id_byte.create(var3);
         } else {
            return var5;
         }
      }
   }

   private static int id_break(gy_3 var0) {
      rAt_1 var1 = var0.id_super().I();
      var1.id_class();
      Collection var2 = var1.id_throws();
      Collection var3 = var1.id_byte();
      List var4 = var3.stream().filter(var1x -> !var2.contains(var1x)).collect(Collectors.toList());
      if (var4.isEmpty()) {
         var0.id_class(new rgn_3("commands.datapack.list.available.none"), false);
      } else {
         var0.id_class(new rgn_3("commands.datapack.list.available.success", var4.size(), rgv_3.id_break(var4, var0x -> var0x.id_class(false))), false);
      }

      return var4.size();
   }
}
