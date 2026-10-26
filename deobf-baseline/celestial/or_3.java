package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.UUID;

public class or_3 {
   private static final SuggestionProvider<gy_3> id_class = (var0, var1) -> gR_2.id_class(rVL.O.id_protected(), var1);
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.attribute.failed.entity", var0));
   private static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.attribute.failed.no_attribute", var0, var1)
   );
   private static final Dynamic3CommandExceptionType id_protected = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new rgn_3("commands.attribute.failed.no_modifier", var1, var0, var2)
   );
   private static final Dynamic3CommandExceptionType id_throws = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new rgn_3("commands.attribute.failed.modifier_already_present", var2, var1, var0)
   );

   private static int id_byte(gy_3 var0, an_3 var1, iJ_2 var2, double var3) throws CommandSyntaxException {
      id_class(var1, var2).id_class(var3);
      var0.id_class(new rgn_3("commands.attribute.base_value.set.success", new rgn_3(var2.id_byte()), var1.g(), var3), false);
      return 1;
   }

   private static ic_3 id_class(an_3 var0, iJ_2 var1) throws CommandSyntaxException {
      ic_3 var2 = id_class(var0).BT().id_class(var1);
      if (var2 == null) {
         throw id_byte.create(var0.g(), new rgn_3(var1.id_byte()));
      } else {
         return var2;
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("attribute").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("target", RZ.id_class())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("attribute", Ym_1.id_class())
                              .suggests(id_class)
                              .then(
                                 ((LiteralArgumentBuilder)gp_3.id_class("get")
                                       .executes(
                                          var0x -> id_class((gy_3)var0x.getSource(), RZ.id_class(var0x, "target"), Ym_1.id_protected(var0x, "attribute"), 1.0)
                                       ))
                                    .then(
                                       gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.id_class(var0x, "target"),
                                                   Ym_1.id_protected(var0x, "attribute"),
                                                   DoubleArgumentType.getDouble(var0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)gp_3.id_class("base")
                                    .then(
                                       gp_3.id_class("set")
                                          .then(
                                             gp_3.id_class("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   var0x -> id_byte(
                                                         (gy_3)var0x.getSource(),
                                                         RZ.id_class(var0x, "target"),
                                                         Ym_1.id_protected(var0x, "attribute"),
                                                         DoubleArgumentType.getDouble(var0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)gp_3.id_class("get")
                                          .executes(
                                             var0x -> id_break(
                                                   (gy_3)var0x.getSource(), RZ.id_class(var0x, "target"), Ym_1.id_protected(var0x, "attribute"), 1.0
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                var0x -> id_break(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.id_class(var0x, "target"),
                                                      Ym_1.id_protected(var0x, "attribute"),
                                                      DoubleArgumentType.getDouble(var0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("modifier")
                                    .then(
                                       gp_3.id_class("add")
                                          .then(
                                             gp_3.id_class("uuid", YT.id_class())
                                                .then(
                                                   gp_3.id_class("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class(
                                                                     "value", DoubleArgumentType.doubleArg()
                                                                  )
                                                                  .then(
                                                                     gp_3.id_class("add")
                                                                        .executes(
                                                                           var0x -> id_class(
                                                                                 (gy_3)var0x.getSource(),
                                                                                 RZ.id_class(var0x, "target"),
                                                                                 Ym_1.id_protected(var0x, "attribute"),
                                                                                 YT.id_class(var0x, "uuid"),
                                                                                 StringArgumentType.getString(var0x, "name"),
                                                                                 DoubleArgumentType.getDouble(var0x, "value"),
                                                                                 id_3.ADDITION
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  gp_3.id_class("multiply")
                                                                     .executes(
                                                                        var0x -> id_class(
                                                                              (gy_3)var0x.getSource(),
                                                                              RZ.id_class(var0x, "target"),
                                                                              Ym_1.id_protected(var0x, "attribute"),
                                                                              YT.id_class(var0x, "uuid"),
                                                                              StringArgumentType.getString(var0x, "name"),
                                                                              DoubleArgumentType.getDouble(var0x, "value"),
                                                                              id_3.MULTIPLY_TOTAL
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               gp_3.id_class("multiply_base")
                                                                  .executes(
                                                                     var0x -> id_class(
                                                                           (gy_3)var0x.getSource(),
                                                                           RZ.id_class(var0x, "target"),
                                                                           Ym_1.id_protected(var0x, "attribute"),
                                                                           YT.id_class(var0x, "uuid"),
                                                                           StringArgumentType.getString(var0x, "name"),
                                                                           DoubleArgumentType.getDouble(var0x, "value"),
                                                                           id_3.MULTIPLY_BASE
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("remove")
                                       .then(
                                          gp_3.id_class("uuid", YT.id_class())
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.id_class(var0x, "target"),
                                                      Ym_1.id_protected(var0x, "attribute"),
                                                      YT.id_class(var0x, "uuid")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.id_class("value")
                                    .then(
                                       gp_3.id_class("get")
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.id_class("uuid", YT.id_class())
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            RZ.id_class(var0x, "target"),
                                                            Ym_1.id_protected(var0x, "attribute"),
                                                            YT.id_class(var0x, "uuid"),
                                                            1.0
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               RZ.id_class(var0x, "target"),
                                                               Ym_1.id_protected(var0x, "attribute"),
                                                               YT.id_class(var0x, "uuid"),
                                                               DoubleArgumentType.getDouble(var0x, "scale")
                                                            )
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

   private static int id_class(gy_3 var0, an_3 var1, iJ_2 var2, double var3) throws CommandSyntaxException {
      iB_2 var5 = id_break(var1, var2);
      double var6 = var5.id_class(var2);
      var0.id_class(new rgn_3("commands.attribute.value.get.success", new rgn_3(var2.id_byte()), var1.g(), var6), false);
      return (int)(var6 * var3);
   }

   private static int id_class(gy_3 var0, an_3 var1, iJ_2 var2, UUID var3, double var4) throws CommandSyntaxException {
      iB_2 var6 = id_break(var1, var2);
      ik_3 var7 = var6.BT();
      if (!var7.id_class(var2, var3)) {
         throw id_protected.create(var1.g(), new rgn_3(var2.id_byte()), var3);
      } else {
         double var8 = var7.id_break(var2, var3);
         var0.id_class(new rgn_3("commands.attribute.modifier.value.get.success", var3, new rgn_3(var2.id_byte()), var1.g(), var8), false);
         return (int)(var8 * var4);
      }
   }

   private static int id_class(gy_3 var0, an_3 var1, iJ_2 var2, UUID var3) throws CommandSyntaxException {
      ic_3 var4 = id_class(var1, var2);
      if (var4.id_byte(var3)) {
         var0.id_class(new rgn_3("commands.attribute.modifier.remove.success", var3, new rgn_3(var2.id_byte()), var1.g()), false);
         return 1;
      } else {
         throw id_protected.create(var1.g(), new rgn_3(var2.id_byte()), var3);
      }
   }

   private static int id_class(gy_3 var0, an_3 var1, iJ_2 var2, UUID var3, String var4, double var5, id_3 var7) throws CommandSyntaxException {
      ic_3 var8 = id_class(var1, var2);
      ix_3 var9 = new ix_3(var3, var4, var5, var7);
      if (var8.id_class(var9)) {
         throw id_throws.create(var1.g(), new rgn_3(var2.id_byte()), var3);
      } else {
         var8.id_byte(var9);
         var0.id_class(new rgn_3("commands.attribute.modifier.add.success", var3, new rgn_3(var2.id_byte()), var1.g()), false);
         return 1;
      }
   }

   private static iB_2 id_class(an_3 var0) throws CommandSyntaxException {
      if (!(var0 instanceof iB_2)) {
         throw id_break.create(var0.g());
      } else {
         return (iB_2)var0;
      }
   }

   private static iB_2 id_break(an_3 var0, iJ_2 var1) throws CommandSyntaxException {
      iB_2 var2 = id_class(var0);
      if (!var2.BT().id_break(var1)) {
         throw id_byte.create(var0.g(), new rgn_3(var1.id_byte()));
      } else {
         return var2;
      }
   }

   private static int id_break(gy_3 var0, an_3 var1, iJ_2 var2, double var3) throws CommandSyntaxException {
      iB_2 var5 = id_break(var1, var2);
      double var6 = var5.id_break(var2);
      var0.id_class(new rgn_3("commands.attribute.base_value.get.success", new rgn_3(var2.id_byte()), var1.g(), var6), false);
      return (int)(var6 * var3);
   }
}
