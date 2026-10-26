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
   private static int id_byte(gy_3 var0, String var1) {
      Path var2 = Paths.get(rlH_2.id_class);
      rqO_2 var3 = new rqO_2("minecraft", var1);
      Path var4 = var0.id_final().O().id_class(var3, ".nbt");
      Path var5 = DU.id_class(var4, var1, var2);
      if (var5 == null) {
         id_break(var0, "Failed to export " + var4);
         return 1;
      } else {
         try {
            Files.createDirectories(var5.getParent());
         } catch (IOException var7) {
            id_break(var0, "Could not create folder " + var5.getParent());
            var7.printStackTrace();
            return 1;
         }

         id_break(var0, "Exported " + var1 + " to " + var5.toAbsolutePath());
         return 0;
      }
   }

   private static int id_byte(gy_3 var0) {
      rfH_2 var1 = new rfH_2(var0.id_volatile());
      rrEm_1 var2 = var0.id_final();
      rfH_2 var3 = rlH_2.id_break(var1, 15, var2);
      if (var3 == null) {
         id_class(var2, "Couldn't find any structure block within 15 radius", rgF_2.RED);
         return 0;
      } else {
         ryG_2 var4 = (ryG_2)var2.id_class(var3);
         String var5 = var4.id_catch();
         return id_byte(var0, var5);
      }
   }

   private static void id_class(rrEm_1 var0, String var1, rgF_2 var2) {
      var0.id_class(var0x -> true).forEach(var2x -> var2x.id_class(new rgN_2(var2 + var1), rqR_2.id_break));
   }

   private static void id_class(gy_3 var0, Collection<rlj_3> var1, int var2, int var3) {
      rfH_2 var4 = new rfH_2(var0.id_volatile());
      rfH_2 var5 = new rfH_2(var4.b_(), var0.id_final().id_class(rKv_1.WORLD_SURFACE, var4).c_(), var4.d_() + 3);
      rrEm_1 var6 = var0.id_final();
      rqd_3 var7 = rlH_2.id_class(var2);
      Collection var8 = rHr_1.id_break(var1, var5, var7, var6, rlT_2.id_class, var3);
      rlY_2 var9 = new rlY_2(var8);
      var9.id_class(new rlw_3(var6, var9));
      var9.id_class(var0x -> rlR_2.id_class(var0x.id_package()));
   }

   private static int id_class(gy_3 var0, boolean var1, int var2, int var3) {
      Collection var4;
      if (var1) {
         var4 = rlR_2.id_byte().stream().filter(rlj_3::id_protected).collect(Collectors.toList());
      } else {
         var4 = rlR_2.id_byte();
      }

      if (var4.isEmpty()) {
         id_break(var0, "No failed tests to rerun");
         return 0;
      } else {
         rHr_1.id_class(var0.id_final());
         id_break(var0, "Rerunning " + var4.size() + " failed tests (" + (var1 ? "only required tests" : "including optional tests") + ")");
         id_class(var0, var4, var2, var3);
         return 1;
      }
   }

   private static int id_class(gy_3 var0) {
      rfH_2 var1 = new rfH_2(var0.id_volatile());
      rrEm_1 var2 = var0.id_final();
      rfH_2 var3 = rlH_2.id_break(var1, 15, var2);
      if (var3 == null) {
         id_class(var2, "Couldn't find any structure block within 15 radius", rgF_2.RED);
         return 0;
      } else {
         rHr_1.id_class(var2);
         id_class(var2, var3, (rlY_2)null);
         return 1;
      }
   }

   private static void id_class(rrEm_1 var0, rfH_2 var1, rlY_2 var2) {
      ryG_2 var3 = (ryG_2)var0.id_class(var1);
      String var4 = var3.id_catch();
      rlj_3 var5 = rlR_2.id_throws(var4);
      rle_3 var6 = new rle_3(var5, var3.id_volatile(), var0);
      if (var2 != null) {
         var2.id_class(var6);
         var6.id_class(new rlw_3(var0, var2));
      }

      id_class(var5, var0);
      rfl_3 var7 = rlH_2.id_class(var3);
      rfH_2 var8 = new rfH_2(var7.id_class, var7.id_break, var7.id_byte);
      rHr_1.id_class(var6, var8, rlT_2.id_class);
   }

   static void id_class(rrEm_1 var0, rlY_2 var1) {
      if (var1.id_catch()) {
         id_class(var0, "GameTest done! " + var1.id_case() + " tests were run", rgF_2.WHITE);
         if (var1.id_protected()) {
            id_class(var0, var1.id_class() + " required tests failed :(", rgF_2.RED);
         } else {
            id_class(var0, "All required tests passed :)", rgF_2.GREEN);
         }

         if (var1.id_throws()) {
            id_class(var0, var1.id_break() + " optional tests failed", rgF_2.GRAY);
         }
      }
   }

   private static int id_class(gy_3 var0, int var1) {
      rrEm_1 var2 = var0.id_final();
      rHr_1.id_class(var2);
      rfH_2 var3 = new rfH_2(
         var0.id_volatile().id_break,
         (double)var0.id_final().id_class(rKv_1.WORLD_SURFACE, new rfH_2(var0.id_volatile())).c_(),
         var0.id_volatile().id_protected
      );
      rHr_1.id_class(var2, var3, rlT_2.id_class, rfU_2.id_class(var1, 0, 1024));
      return 1;
   }

   private static int id_class(gy_3 var0, String var1) throws CommandSyntaxException {
      rff_3 var2 = (rff_3)var0.id_new().id_break(10.0, 1.0F, false);
      rfH_2 var3 = var2.id_class();
      rrEm_1 var4 = var0.id_final();
      Optional var5 = rlH_2.id_class(var3, 15, var4);
      if (!var5.isPresent()) {
         var5 = rlH_2.id_class(var3, 200, var4);
      }

      if (!var5.isPresent()) {
         var0.id_class(new rgN_2("Can't find a structure block that contains the targeted pos " + var3));
         return 0;
      } else {
         ryG_2 var6 = (ryG_2)var4.id_class((rfH_2)var5.get());
         rfH_2 var7 = var3.id_byte((rja_3)var5.get());
         String var8 = var7.b_() + ", " + var7.c_() + ", " + var7.d_();
         String var9 = var6.id_catch();
         rVi_1 var10 = new rgN_2(var8)
            .id_class(
               rgc_3.id_class
                  .id_class(true)
                  .id_class(rgF_2.GREEN)
                  .id_class(new rgy_3(rgp_3.id_class, new rgN_2("Click to copy to clipboard")))
                  .id_class(new rgl_3(rgH_2.COPY_TO_CLIPBOARD, "final BlockPos " + var1 + " = new BlockPos(" + var8 + ");"))
            );
         var0.id_class(new rgN_2("Position relative to " + var9 + ": ").id_class(var10), false);
         ruP_2.id_class(var4, new rfH_2(var3), var8, -2147418368, 10000);
         return 1;
      }
   }

   private static int id_class(gy_3 var0, String var1, int var2, int var3, int var4) {
      if (var2 <= 48 && var3 <= 48 && var4 <= 48) {
         rrEm_1 var5 = var0.id_final();
         rfH_2 var6 = new rfH_2(var0.id_volatile());
         rfH_2 var7 = new rfH_2(var6.b_(), var0.id_final().id_class(rKv_1.WORLD_SURFACE, var6).c_(), var6.d_() + 3);
         rlH_2.id_class(var1.toLowerCase(), var7, new rfH_2(var2, var3, var4), rqd_3.NONE, var5);

         for (int var8 = 0; var8 < var2; var8++) {
            for (int var9 = 0; var9 < var4; var9++) {
               rfH_2 var10 = new rfH_2(var7.b_() + var8, var7.c_() + 1, var7.d_() + var9);
               xd_3 var11 = xu_3.id_private;
               Rd_1 var12 = new Rd_1(var11.id_continue(), Collections.EMPTY_SET, (rcd_3)null);
               var12.id_class(var5, var10, 2);
            }
         }

         rlH_2.id_class(var7, new rfH_2(1, 0, -1), rqd_3.NONE, var5);
         return 0;
      } else {
         throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                             "test"
                                          )
                                          .then(gp_3.id_class("runthis").executes(var0x -> id_class((gy_3)var0x.getSource()))))
                                       .then(gp_3.id_class("runthese").executes(var0x -> id_break((gy_3)var0x.getSource()))))
                                    .then(
                                       ((LiteralArgumentBuilder)gp_3.id_class("runfailed").executes(var0x -> id_class((gy_3)var0x.getSource(), false, 0, 8)))
                                          .then(
                                             ((RequiredArgumentBuilder)gp_3.id_class("onlyRequiredTests", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> id_class((gy_3)var0x.getSource(), BoolArgumentType.getBool(var0x, "onlyRequiredTests"), 0, 8)
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)gp_3.id_class("rotationSteps", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> id_class(
                                                                  (gy_3)var0x.getSource(),
                                                                  BoolArgumentType.getBool(var0x, "onlyRequiredTests"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  8
                                                               )
                                                         ))
                                                      .then(
                                                         gp_3.id_class("testsPerRow", IntegerArgumentType.integer())
                                                            .executes(
                                                               var0x -> id_class(
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
                                    gp_3.id_class("run")
                                       .then(
                                          ((RequiredArgumentBuilder)gp_3.id_class("testName", rly_3.id_class())
                                                .executes(var0x -> id_class((gy_3)var0x.getSource(), rly_3.id_class(var0x, "testName"), 0)))
                                             .then(
                                                gp_3.id_class("rotationSteps", IntegerArgumentType.integer())
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            rly_3.id_class(var0x, "testName"),
                                                            IntegerArgumentType.getInteger(var0x, "rotationSteps")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("runall")
                                          .executes(var0x -> id_class((gy_3)var0x.getSource(), 0, 8)))
                                       .then(
                                          ((RequiredArgumentBuilder)gp_3.id_class("testClassName", rli_3.id_class())
                                                .executes(var0x -> id_class((gy_3)var0x.getSource(), rli_3.id_class(var0x, "testClassName"), 0, 8)))
                                             .then(
                                                ((RequiredArgumentBuilder)gp_3.id_class("rotationSteps", IntegerArgumentType.integer())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               rli_3.id_class(var0x, "testClassName"),
                                                               IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                               8
                                                            )
                                                      ))
                                                   .then(
                                                      gp_3.id_class("testsPerRow", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> id_class(
                                                                  (gy_3)var0x.getSource(),
                                                                  rli_3.id_class(var0x, "testClassName"),
                                                                  IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                                  IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)gp_3.id_class("rotationSteps", IntegerArgumentType.integer())
                                             .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "rotationSteps"), 8)))
                                          .then(
                                             gp_3.id_class("testsPerRow", IntegerArgumentType.integer())
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         IntegerArgumentType.getInteger(var0x, "rotationSteps"),
                                                         IntegerArgumentType.getInteger(var0x, "testsPerRow")
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              gp_3.id_class("export")
                                 .then(
                                    gp_3.id_class("testName", StringArgumentType.word())
                                       .executes(var0x -> id_byte((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                                 )
                           ))
                        .then(gp_3.id_class("exportthis").executes(var0x -> id_byte((gy_3)var0x.getSource()))))
                     .then(
                        gp_3.id_class("import")
                           .then(
                              gp_3.id_class("testName", StringArgumentType.word())
                                 .executes(var0x -> id_protected((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "testName")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)gp_3.id_class("pos").executes(var0x -> id_class((gy_3)var0x.getSource(), "pos")))
                        .then(
                           gp_3.id_class("var", StringArgumentType.word())
                              .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "var")))
                        )
                  ))
               .then(
                  gp_3.id_class("create")
                     .then(
                        ((RequiredArgumentBuilder)gp_3.id_class("testName", StringArgumentType.word())
                              .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "testName"), 5, 5, 5)))
                           .then(
                              ((RequiredArgumentBuilder)gp_3.id_class("width", IntegerArgumentType.integer())
                                    .executes(
                                       var0x -> id_class(
                                             (gy_3)var0x.getSource(),
                                             StringArgumentType.getString(var0x, "testName"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "width")
                                          )
                                    ))
                                 .then(
                                    gp_3.id_class("height", IntegerArgumentType.integer())
                                       .then(
                                          gp_3.id_class("depth", IntegerArgumentType.integer())
                                             .executes(
                                                var0x -> id_class(
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
               ((LiteralArgumentBuilder)gp_3.id_class("clearall").executes(var0x -> id_class((gy_3)var0x.getSource(), 200)))
                  .then(
                     gp_3.id_class("radius", IntegerArgumentType.integer())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "radius")))
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, String var1, int var2, int var3) {
      Collection var4 = rlR_2.id_class(var1);
      rHr_1.id_class(var0.id_final());
      id_break(var0, "Running " + var4.size() + " tests from " + var1 + "...");
      rlR_2.id_protected();
      id_class(var0, var4, var2, var3);
      return 1;
   }

   private static int id_class(gy_3 var0, int var1, int var2) {
      rHr_1.id_class(var0.id_final());
      Collection var3 = rlR_2.id_class();
      id_break(var0, "Running all " + var3.size() + " tests...");
      rlR_2.id_protected();
      id_class(var0, var3, var1, var2);
      return 1;
   }

   private static void id_class(rlj_3 var0, rrEm_1 var1) {
      Consumer var2 = rlR_2.id_byte(var0.id_throws());
      if (var2 != null) {
         var2.accept(var1);
      }
   }

   private static int id_class(gy_3 var0, rlj_3 var1, int var2) {
      rrEm_1 var3 = var0.id_final();
      rfH_2 var4 = new rfH_2(var0.id_volatile());
      int var5 = var0.id_final().id_class(rKv_1.WORLD_SURFACE, var4).c_();
      rfH_2 var6 = new rfH_2(var4.b_(), var5, var4.d_() + 3);
      rHr_1.id_class(var3);
      id_class(var1, var3);
      rqd_3 var7 = rlH_2.id_class(var2);
      rle_3 var8 = new rle_3(var1, var7, var3);
      rHr_1.id_class(var8, var6, rlT_2.id_class);
      return 1;
   }

   private static void id_break(gy_3 var0, String var1) {
      var0.id_class(new rgN_2(var1), false);
   }

   private static int id_break(gy_3 var0) {
      rfH_2 var1 = new rfH_2(var0.id_volatile());
      rrEm_1 var2 = var0.id_final();
      Collection var3 = rlH_2.id_byte(var1, 200, var2);
      if (var3.isEmpty()) {
         id_class(var2, "Couldn't find any structure blocks within 200 block radius", rgF_2.RED);
         return 1;
      } else {
         rHr_1.id_class(var2);
         id_break(var0, "Running " + var3.size() + " tests...");
         rlY_2 var4 = new rlY_2();
         var3.forEach(var2x -> id_class(var2, var2x, var4));
         return 1;
      }
   }

   private static int id_protected(gy_3 var0, String var1) {
      Path var2 = Paths.get(rlH_2.id_class, var1 + ".snbt");
      rqO_2 var3 = new rqO_2("minecraft", var1);
      Path var4 = var0.id_final().O().id_class(var3, ".nbt");

      try {
         BufferedReader var5 = Files.newBufferedReader(var2);
         String var6 = IOUtils.toString(var5);
         Files.createDirectories(var4.getParent());

         try (OutputStream var7 = Files.newOutputStream(var4)) {
            rcW_2.id_class(rcH_2.id_class(var6), var7);
         }

         id_break(var0, "Imported to " + var4.toAbsolutePath());
         return 0;
      } catch (IOException | CommandSyntaxException var12) {
         System.err.println("Failed to load structure " + var1);
         var12.printStackTrace();
         return 1;
      }
   }
}
