package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;

public class rlt_3 {
   private static int byte_(gy_3 var0, String var1) {
      Path var2 = Paths.get(rlH_2.class_);
      rqO_2 var3 = new rqO_2("minecraft", var1);
      Path var4 = var0.final_().O().class_(var3, ".nbt");
      Path var5 = DU.class_(var4, var1, var2);
      if (var5 == null) {
         break_(var0, "Failed to export " + var4);
         return 1;
      } else {
         try {
            Files.createDirectories(var5.getParent());
         } catch (IOException var7) {
            break_(var0, "Could not create folder " + var5.getParent());
            var7.printStackTrace();
            return 1;
         }

         break_(var0, "Exported " + var1 + " to " + var5.toAbsolutePath());
         return 0;
      }
   }

   private static int byte_(gy_3 var0) {
      rfH_2 var1 = new rfH_2(var0.volatile_());
      rrEm_1 var2 = var0.final_();
      rfH_2 var3 = rlH_2.break_(var1, 15, var2);
      if (var3 == null) {
         class_(var2, "Couldn't find any structure block within 15 radius", rgF_2.RED);
         return 0;
      } else {
         ryG_2 var4 = (ryG_2)var2.class_(var3);
         String var5 = var4.catch_();
         return byte_(var0, var5);
      }
   }

   private static void class_(rrEm_1 var0, String var1, rgF_2 var2) {
      var0.class_(var0x -> true).forEach(var2x -> var2x.class_(new rgN_2(var2 + var1), rqR_2.break_));
   }

   private static void class_(gy_3 var0, Collection<rlj_3> var1, int var2, int var3) {
      rfH_2 var4 = new rfH_2(var0.volatile_());
      rfH_2 var5 = new rfH_2(var4.b_(), var0.final_().class_(rKv_1.WORLD_SURFACE, var4).c_(), var4.d_() + 3);
      rrEm_1 var6 = var0.final_();
      rqd_3 var7 = rlH_2.class_(var2);
      Collection var8 = rHr_1.break_(var1, var5, var7, var6, rlT_2.class_, var3);
      rlY_2 var9 = new rlY_2(var8);
      var9.class_(new rlw_3(var6, var9));
      var9.class_(var0x -> rlR_2.class_(var0x.package_()));
   }

   private static int class_(gy_3 var0, boolean var1, int var2, int var3) {
      Collection var4;
      if (var1) {
         var4 = rlR_2.byte_().stream().filter(rlj_3::protected_).collect(Collectors.toList());
      } else {
         var4 = rlR_2.byte_();
      }

      if (var4.isEmpty()) {
         break_(var0, "No failed tests to rerun");
         return 0;
      } else {
         rHr_1.class_(var0.final_());
         break_(var0, "Rerunning " + var4.size() + " failed tests (" + (var1 ? "only required tests" : "including optional tests") + ")");
         class_(var0, var4, var2, var3);
         return 1;
      }
   }

   private static int class_(gy_3 var0) {
      rfH_2 var1 = new rfH_2(var0.volatile_());
      rrEm_1 var2 = var0.final_();
      rfH_2 var3 = rlH_2.break_(var1, 15, var2);
      if (var3 == null) {
         class_(var2, "Couldn't find any structure block within 15 radius", rgF_2.RED);
         return 0;
      } else {
         rHr_1.class_(var2);
         class_(var2, var3, (rlY_2)null);
         return 1;
      }
   }

   private static void class_(rrEm_1 var0, rfH_2 var1, rlY_2 var2) {
      ryG_2 var3 = (ryG_2)var0.class_(var1);
      String var4 = var3.catch_();
      rlj_3 var5 = rlR_2.throws_(var4);
      rle_3 var6 = new rle_3(var5, var3.volatile_(), var0);
      if (var2 != null) {
         var2.class_(var6);
         var6.class_(new rlw_3(var0, var2));
      }

      class_(var5, var0);
      rfl_3 var7 = rlH_2.class_(var3);
      rfH_2 var8 = new rfH_2(var7.class_, var7.break_, var7.byte_);
      rHr_1.class_(var6, var8, rlT_2.class_);
   }

   static void class_(rrEm_1 var0, rlY_2 var1) {
      if (var1.catch_()) {
         class_(var0, "GameTest done! " + var1.case_() + " tests were run", rgF_2.WHITE);
         if (var1.protected_()) {
            class_(var0, var1.class_() + " required tests failed :(", rgF_2.RED);
         } else {
            class_(var0, "All required tests passed :)", rgF_2.GREEN);
         }

         if (var1.throws_()) {
            class_(var0, var1.break_() + " optional tests failed", rgF_2.GRAY);
         }
      }
   }

   private static int class_(gy_3 var0, int var1) {
      rrEm_1 var2 = var0.final_();
      rHr_1.class_(var2);
      rfH_2 var3 = new rfH_2(
         var0.volatile_().break_, (double)var0.final_().class_(rKv_1.WORLD_SURFACE, new rfH_2(var0.volatile_())).c_(), var0.volatile_().protected_
      );
      rHr_1.class_(var2, var3, rlT_2.class_, rfU_2.class_(var1, 0, 1024));
      return 1;
   }

   private static int class_(gy_3 var0, String var1) throws CommandSyntaxException {
      rff_3 var2 = (rff_3)var0.new_().break_(10.0, 1.0F, false);
      rfH_2 var3 = var2.class_();
      rrEm_1 var4 = var0.final_();
      Optional var5 = rlH_2.class_(var3, 15, var4);
      if (!var5.isPresent()) {
         var5 = rlH_2.class_(var3, 200, var4);
      }

      if (!var5.isPresent()) {
         var0.class_(new rgN_2("Can't find a structure block that contains the targeted pos " + var3));
         return 0;
      } else {
         ryG_2 var6 = (ryG_2)var4.class_((rfH_2)var5.get());
         rfH_2 var7 = var3.byte_((rja_3)var5.get());
         String var8 = var7.b_() + ", " + var7.c_() + ", " + var7.d_();
         String var9 = var6.catch_();
         rVi_1 var10 = new rgN_2(var8)
            .class_(
               rgc_3.class_
                  .class_(true)
                  .class_(rgF_2.GREEN)
                  .class_(new rgy_3(rgp_3.class_, new rgN_2("Click to copy to clipboard")))
                  .class_(new rgl_3(rgH_2.COPY_TO_CLIPBOARD, "final BlockPos " + var1 + " = new BlockPos(" + var8 + ");"))
            );
         var0.class_(new rgN_2("Position relative to " + var9 + ": ").class_(var10), false);
         ruP_2.class_(var4, new rfH_2(var3), var8, -2147418368, 10000);
         return 1;
      }
   }

   private static int class_(gy_3 var0, String var1, int var2, int var3, int var4) {
      if (var2 <= 48 && var3 <= 48 && var4 <= 48) {
         rrEm_1 var5 = var0.final_();
         rfH_2 var6 = new rfH_2(var0.volatile_());
         rfH_2 var7 = new rfH_2(var6.b_(), var0.final_().class_(rKv_1.WORLD_SURFACE, var6).c_(), var6.d_() + 3);
         rlH_2.class_(var1.toLowerCase(), var7, new rfH_2(var2, var3, var4), rqd_3.NONE, var5);

         for (int var8 = 0; var8 < var2; var8++) {
            for (int var9 = 0; var9 < var4; var9++) {
               rfH_2 var10 = new rfH_2(var7.b_() + var8, var7.c_() + 1, var7.d_() + var9);
               xd_3 var11 = xu_3.private_;
               Rd_1 var12 = new Rd_1(var11.continue_(), Collections.EMPTY_SET, (rcd_3)null);
               var12.class_(var5, var10, 2);
            }
         }

         rlH_2.class_(var7, new rfH_2(1, 0, -1), rqd_3.NONE, var5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                             "test"
                                          )
                                          .then(gp_3.class_("runthis").executes(var0x -> class_((gy_3)var0x.getSource()))))
                                       .then(gp_3.class_("runthese").executes(var0x -> break_((gy_3)var0x.getSource()))))
                                    .then(
                                       ((LiteralArgumentBuilder)gp_3.class_("runfailed").executes(var0x -> class_((gy_3)var0x.getSource(), false, 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.class_("onlyRequiredTests", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> class_((gy_3)var0x.getSource(), BoolArgumentType.getBool(var0x, "onlyRequiredTests"), 0, 8)
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)gp_3.class_("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> class_(
                                                                  (gy_3)var0x.getSource(),
                                                                  BoolArgumentType.getBool(var0x, "onlyRequiredTests"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         gp_3.class_("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> class_(
                                                                     (gy_3)var0x.getSource(),
                                                                     BoolArgumentType.getBool(var0x, "onlyRequiredTests"),
                                                                     IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                     IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("run")
                                       .then(
                                          ((RequiredArgumentBuilder)gp_3.class_("testName", rly_3.class_())
                                                .executes(var0x -> class_((gy_3)var0x.getSource(), rly_3.class_(var0x, "testName"), 0)))
                                             .then(
                                                gp_3.class_("rotationSteps", IntegerArgumentType.integer())
                                                   .executes(
                                                      var0x -> class_(
                                                            (gy_3)var0x.getSource(),
                                                            rly_3.class_(var0x, "testName"),
                                                            IntegerArgumentType.getInteger(var0x, "rotationSteps")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("runall")
                                          .executes(var0x -> class_((gy_3)var0x.getSource(), 0, 8)))
                                       .then(
                                          ((RequiredArgumentBuilder)gp_3.class_("testClassName", rli_3.class_())
                                                .executes(var0x -> class_((gy_3)var0x.getSource(), rli_3.class_(var0x, "testClassName"), 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)gp_3.class_("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               rli_3.class_(var0x, "testClassName"),
                                                               IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                               8
                                                            )
                                                      ))
                                                   .then(
                                                      gp_3.class_("testsPerRow", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> class_(
                                                                  (gy_3)var0x.getSource(),
                                                                  rli_3.class_(var0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)gp_3.class_("rotationSteps", IntegerArgumentType.integer())
                                             .executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "rotationSteps"), 8)))
                                          .then(
                                             gp_3.class_("testsPerRow", IntegerArgumentType.integer())
                                                .executes(
                                                   var0x -> class_(
                                                         (gy_3)var0x.getSource(),
                                                         IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                         IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.class_("export")
                                 .then(
                                    gp_3.class_("testName", StringArgumentType.word())
                                       .executes(var0x -> byte_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                                 )
                           ))
                        .then(gp_3.class_("exportthis").executes(var0x -> byte_((gy_3)var0x.getSource()))))
                     .then(
                        gp_3.class_("import")
                           .then(
                              gp_3.class_("testName", StringArgumentType.word())
                                 .executes(var0x -> protected_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)gp_3.class_("pos").executes(var0x -> class_((gy_3)var0x.getSource(), "pos")))
                        .then(
                           gp_3.class_("var", StringArgumentType.word())
                              .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "var")))
                        )
                  ))
               .then(
                  gp_3.class_("create")
                     .then(
                        ((RequiredArgumentBuilder)gp_3.class_("testName", StringArgumentType.word())
                              .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)gp_3.class_("width", IntegerArgumentType.integer())
                                    .executes(
                                       var0x -> class_(
                                             (gy_3)var0x.getSource(),
                                             StringArgumentType.getString(var0x, "testName"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width")
                                          )
                                    ))
                                 .then(
                                    gp_3.class_("height", IntegerArgumentType.integer())
                                       .then(
                                          gp_3.class_("depth", IntegerArgumentType.integer())
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      StringArgumentType.getString(var0x, "testName"),
                                                      IntegerArgumentType.getInteger(var0x, "width"),
                                                      IntegerArgumentType.getInteger(var0x, "height"),
                                                      IntegerArgumentType.getInteger(var0x, "depth")
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)gp_3.class_("clearall").executes(var0x -> class_((gy_3)var0x.getSource(), 200)))
                  .then(
                     gp_3.class_("radius", IntegerArgumentType.integer())
                        .executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "radius")))
                  )
            )
      );
   }

   private static int class_(gy_3 var0, String var1, int var2, int var3) {
      Collection var4 = rlR_2.class_(var1);
      rHr_1.class_(var0.final_());
      break_(var0, "Running " + var4.size() + " tests from " + var1 + "...");
      rlR_2.protected_();
      class_(var0, var4, var2, var3);
      return 1;
   }

   private static int class_(gy_3 var0, int var1, int var2) {
      rHr_1.class_(var0.final_());
      Collection var3 = rlR_2.class_();
      break_(var0, "Running all " + var3.size() + " tests...");
      rlR_2.protected_();
      class_(var0, var3, var1, var2);
      return 1;
   }

   private static void class_(rlj_3 var0, rrEm_1 var1) {
      Consumer var2 = rlR_2.byte_(var0.throws_());
      if (var2 != null) {
         var2.accept(var1);
      }
   }

   private static int class_(gy_3 var0, rlj_3 var1, int var2) {
      rrEm_1 var3 = var0.final_();
      rfH_2 var4 = new rfH_2(var0.volatile_());
      int var5 = var0.final_().class_(rKv_1.WORLD_SURFACE, var4).c_();
      rfH_2 var6 = new rfH_2(var4.b_(), var5, var4.d_() + 3);
      rHr_1.class_(var3);
      class_(var1, var3);
      rqd_3 var7 = rlH_2.class_(var2);
      rle_3 var8 = new rle_3(var1, var7, var3);
      rHr_1.class_(var8, var6, rlT_2.class_);
      return 1;
   }

   private static void break_(gy_3 var0, String var1) {
      var0.class_(new rgN_2(var1), false);
   }

   private static int break_(gy_3 var0) {
      rfH_2 var1 = new rfH_2(var0.volatile_());
      rrEm_1 var2 = var0.final_();
      Collection var3 = rlH_2.byte_(var1, 200, var2);
      if (var3.isEmpty()) {
         class_(var2, "Couldn't find any structure blocks within 200 block radius", rgF_2.RED);
         return 1;
      } else {
         rHr_1.class_(var2);
         break_(var0, "Running " + var3.size() + " tests...");
         rlY_2 var4 = new rlY_2();
         var3.forEach(var2x -> class_(var2, var2x, var4));
         return 1;
      }
   }

   private static int protected_(gy_3 var0, String var1) {
      Path var2 = Paths.get(rlH_2.class_, var1 + ".snbt");
      rqO_2 var3 = new rqO_2("minecraft", var1);
      Path var4 = var0.final_().O().class_(var3, ".nbt");

      try {
         BufferedReader var5 = Files.newBufferedReader(var2);
         String var6 = IOUtils.toString(var5);
         Files.createDirectories(var4.getParent());

         try (OutputStream var7 = Files.newOutputStream(var4)) {
            rcW_2.class_(rcH_2.class_(var6), var7);
         }

         break_(var0, "Imported to " + var4.toAbsolutePath());
         return 0;
      } catch (IOException | CommandSyntaxException var12) {
         System.err.println("Failed to load structure " + var1);
         var12.printStackTrace();
         return 1;
      }
   }
}
