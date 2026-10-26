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
   private static final SuggestionProvider<gy_3> class_ = (var0, var1) -> gR_2.class_(rVL.O.protected_(), var1);
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.attribute.failed.entity", var0));
   private static final Dynamic2CommandExceptionType byte_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.attribute.failed.no_attribute", var0, var1)
   );
   private static final Dynamic3CommandExceptionType protected_ = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new rgn_3("commands.attribute.failed.no_modifier", var1, var0, var2)
   );
   private static final Dynamic3CommandExceptionType throws_ = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new rgn_3("commands.attribute.failed.modifier_already_present", var2, var1, var0)
   );

   private static int byte_(gy_3 var0, an_3 var1, iJ_2 var2, double var3) throws CommandSyntaxException {
      class_(var1, var2).class_(var3);
      var0.class_(new rgn_3("commands.attribute.base_value.set.success", new rgn_3(var2.byte_()), var1.g(), var3), false);
      return 1;
   }

   private static ic_3 class_(an_3 var0, iJ_2 var1) throws CommandSyntaxException {
      ic_3 var2 = class_(var0).BT().class_(var1);
      if (var2 == null) {
         throw byte_.create(var0.g(), new rgn_3(var1.byte_()));
      } else {
         return var2;
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("attribute").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("target", RZ.class_())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("attribute", Ym_1.class_())
                              .suggests(class_)
                              .then(
                                 ((LiteralArgumentBuilder)gp_3.class_("get")
                                       .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.class_(var0x, "target"), Ym_1.protected_(var0x, "attribute"), 1.0)))
                                    .then(
                                       gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   RZ.class_(var0x, "target"),
                                                   Ym_1.protected_(var0x, "attribute"),
                                                   DoubleArgumentType.getDouble(var0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)gp_3.class_("base")
                                    .then(
                                       gp_3.class_("set")
                                          .then(
                                             gp_3.class_("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   var0x -> byte_(
                                                         (gy_3)var0x.getSource(),
                                                         RZ.class_(var0x, "target"),
                                                         Ym_1.protected_(var0x, "attribute"),
                                                         DoubleArgumentType.getDouble(var0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)gp_3.class_("get")
                                          .executes(
                                             var0x -> break_((gy_3)var0x.getSource(), RZ.class_(var0x, "target"), Ym_1.protected_(var0x, "attribute"), 1.0)
                                          ))
                                       .then(
                                          gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                var0x -> break_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.class_(var0x, "target"),
                                                      Ym_1.protected_(var0x, "attribute"),
                                                      DoubleArgumentType.getDouble(var0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("modifier")
                                    .then(
                                       gp_3.class_("add")
                                          .then(
                                             gp_3.class_("uuid", YT.class_())
                                                .then(
                                                   gp_3.class_("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_(
                                                                     "value", DoubleArgumentType.doubleArg()
                                                                  )
                                                                  .then(
                                                                     gp_3.class_("add")
                                                                        .executes(
                                                                           var0x -> class_(
                                                                                 (gy_3)var0x.getSource(),
                                                                                 RZ.class_(var0x, "target"),
                                                                                 Ym_1.protected_(var0x, "attribute"),
                                                                                 YT.class_(var0x, "uuid"),
                                                                                 StringArgumentType.getString(var0x, "name"),
                                                                                 DoubleArgumentType.getDouble(var0x, "value"),
                                                                                 id_3.ADDITION
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  gp_3.class_("multiply")
                                                                     .executes(
                                                                        var0x -> class_(
                                                                              (gy_3)var0x.getSource(),
                                                                              RZ.class_(var0x, "target"),
                                                                              Ym_1.protected_(var0x, "attribute"),
                                                                              YT.class_(var0x, "uuid"),
                                                                              StringArgumentType.getString(var0x, "name"),
                                                                              DoubleArgumentType.getDouble(var0x, "value"),
                                                                              id_3.MULTIPLY_TOTAL
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               gp_3.class_("multiply_base")
                                                                  .executes(
                                                                     var0x -> class_(
                                                                           (gy_3)var0x.getSource(),
                                                                           RZ.class_(var0x, "target"),
                                                                           Ym_1.protected_(var0x, "attribute"),
                                                                           YT.class_(var0x, "uuid"),
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
                                    gp_3.class_("remove")
                                       .then(
                                          gp_3.class_("uuid", YT.class_())
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      RZ.class_(var0x, "target"),
                                                      Ym_1.protected_(var0x, "attribute"),
                                                      YT.class_(var0x, "uuid")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("value")
                                    .then(
                                       gp_3.class_("get")
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.class_("uuid", YT.class_())
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            RZ.class_(var0x, "target"),
                                                            Ym_1.protected_(var0x, "attribute"),
                                                            YT.class_(var0x, "uuid"),
                                                            1.0
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.class_("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               RZ.class_(var0x, "target"),
                                                               Ym_1.protected_(var0x, "attribute"),
                                                               YT.class_(var0x, "uuid"),
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

   private static int class_(gy_3 var0, an_3 var1, iJ_2 var2, double var3) throws CommandSyntaxException {
      iB_2 var5 = break_(var1, var2);
      double var6 = var5.class_(var2);
      var0.class_(new rgn_3("commands.attribute.value.get.success", new rgn_3(var2.byte_()), var1.g(), var6), false);
      return (int)(var6 * var3);
   }

   private static int class_(gy_3 var0, an_3 var1, iJ_2 var2, UUID var3, double var4) throws CommandSyntaxException {
      iB_2 var6 = break_(var1, var2);
      ik_3 var7 = var6.BT();
      if (!var7.class_(var2, var3)) {
         throw protected_.create(var1.g(), new rgn_3(var2.byte_()), var3);
      } else {
         double var8 = var7.break_(var2, var3);
         var0.class_(new rgn_3("commands.attribute.modifier.value.get.success", var3, new rgn_3(var2.byte_()), var1.g(), var8), false);
         return (int)(var8 * var4);
      }
   }

   private static int class_(gy_3 var0, an_3 var1, iJ_2 var2, UUID var3) throws CommandSyntaxException {
      ic_3 var4 = class_(var1, var2);
      if (var4.byte_(var3)) {
         var0.class_(new rgn_3("commands.attribute.modifier.remove.success", var3, new rgn_3(var2.byte_()), var1.g()), false);
         return 1;
      } else {
         throw protected_.create(var1.g(), new rgn_3(var2.byte_()), var3);
      }
   }

   private static int class_(gy_3 var0, an_3 var1, iJ_2 var2, UUID var3, String var4, double var5, id_3 var7) throws CommandSyntaxException {
      ic_3 var8 = class_(var1, var2);
      ix_3 var9 = new ix_3(var3, var4, var5, var7);
      if (var8.class_(var9)) {
         throw throws_.create(var1.g(), new rgn_3(var2.byte_()), var3);
      } else {
         var8.byte_(var9);
         var0.class_(new rgn_3("commands.attribute.modifier.add.success", var3, new rgn_3(var2.byte_()), var1.g()), false);
         return 1;
      }
   }

   private static iB_2 class_(an_3 var0) throws CommandSyntaxException {
      if (!(var0 instanceof iB_2)) {
         throw break_.create(var0.g());
      } else {
         return (iB_2)var0;
      }
   }

   private static iB_2 break_(an_3 var0, iJ_2 var1) throws CommandSyntaxException {
      iB_2 var2 = class_(var0);
      if (!var2.BT().break_(var1)) {
         throw byte_.create(var0.g(), new rgn_3(var1.byte_()));
      } else {
         return var2;
      }
   }

   private static int break_(gy_3 var0, an_3 var1, iJ_2 var2, double var3) throws CommandSyntaxException {
      iB_2 var5 = break_(var1, var2);
      double var6 = var5.break_(var2);
      var0.class_(new rgn_3("commands.attribute.base_value.get.success", new rgn_3(var2.byte_()), var1.g(), var6), false);
      return (int)(var6 * var3);
   }
}
