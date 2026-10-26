package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public class vK_2 implements ZR, cp_3 {
   private static final Logger id_break = LogManager.getLogger();
   static final rgP_2 id_byte = new rgn_3("generator.custom");
   static final rgP_2 id_protected = new rgn_3("generator.amplified.info");
   private static final rgP_2 id_throws = new rgn_3("selectWorld.mapFeatures.info");
   private cv_3 id_case = cv_3.id_class;
   private cm_3 id_catch;
   private int id_private;
   private Lu_1 id_implements;
   private LF id_finally;
   public LF id_class;
   private LF id_extends;
   private LF id_native;
   private LF id_volatile;
   private rVv_1 id_final;
   rrSp_1 id_package;
   Optional<mN_2> id_int;
   private OptionalLong id_new;

   private OptionalLong id_byte() {
      String var1 = this.id_implements.id_private();
      OptionalLong var2;
      if (StringUtils.isEmpty(var1)) {
         var2 = OptionalLong.empty();
      } else {
         OptionalLong var3 = id_class(var1);
         if (var3.isPresent() && var3.getAsLong() != 0L) {
            var2 = var3;
         } else {
            var2 = OptionalLong.of((long)var1.hashCode());
         }
      }

      return var2;
   }

   public vK_2(rVv_1 var1, rrSp_1 var2, Optional<mN_2> var3, OptionalLong var4) {
      this.id_final = var1;
      this.id_package = var2;
      this.id_int = var3;
      this.id_new = var4;
   }

   void id_class(rAh_1 var1) {
      rVv_1 var2 = rVm_1.id_break();
      rVp_1 var3 = rVp_1.id_class(JsonOps.INSTANCE, this.id_final);
      rVq_1 var4 = rVq_1.id_class(JsonOps.INSTANCE, var1.id_private(), var2);
      DataResult var5 = rrSp_1.id_class.encodeStart(var3, this.id_package).flatMap(var1x -> rrSp_1.id_class.parse(var4, var1x));
      var5.resultOrPartial(rqR_2.id_class("Error parsing worldgen settings after loading data packs: ", id_break::error)).ifPresent(var2x -> {
         this.id_package = var2x;
         this.id_final = var2;
      });
   }

   private static OptionalLong id_class(String var0) {
      try {
         return OptionalLong.of(Long.parseLong(var0));
      } catch (NumberFormatException var2) {
         return OptionalLong.empty();
      }
   }

   protected void id_class(rrSp_1 var1) {
      this.id_package = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_finally.id_new) {
         this.id_catch.id_break(var1, id_throws, (float)(this.id_private / 2 - 150), 122.0F, -6250336);
      }

      this.id_implements.id_class(var1, var2, var3, var4);
      if (this.id_int.equals(Optional.of(mN_2.id_break))) {
         this.id_case.id_break(var1, this.id_extends.id_volatile + 2, this.id_extends.id_final + 22, 9, 10526880);
      }
   }

   public void id_class(mo_3 var1, QY var2, cm_3 var3) {
      this.id_catch = var3;
      this.id_private = var1.id_package;
      this.id_implements = new Lu_1(this.id_catch, this.id_private / 2 - 100, 60, 200, 20, new rgn_3("selectWorld.enterSeed"));
      this.id_implements.id_class(id_class(this.id_new));
      this.id_implements.id_class(var1x -> this.id_new = this.id_byte());
      var1.id_protected(this.id_implements);
      int var4 = this.id_private / 2 - 155;
      int var5 = this.id_private / 2 + 5;
      this.id_finally = var1.id_class(
         new vD_2(this, var4, 100, 150, 20, new rgn_3("selectWorld.mapFeatures"), var1x -> this.id_package = this.id_package.id_extends())
      );
      this.id_finally.id_new = false;
      this.id_extends = var1.id_class(new vU_2(this, var5, 100, 150, 20, new rgn_3("selectWorld.mapType"), var2x -> {
         while (this.id_int.isPresent()) {
            int var3x = mN_2.id_byte.indexOf(this.id_int.get()) + 1;
            if (var3x >= mN_2.id_byte.size()) {
               var3x = 0;
            }

            mN_2 var4x = mN_2.id_byte.get(var3x);
            this.id_int = Optional.of(var4x);
            this.id_package = var4x.id_class(this.id_final, this.id_package.id_class(), this.id_package.id_break(), this.id_package.id_byte());
            if (!this.id_package.id_catch() || vm_3.id_synchronized()) {
               break;
            }
         }

         var1.id_finally();
      }));
      this.id_extends.id_new = false;
      this.id_extends.id_int = this.id_int.isPresent();
      this.id_native = var1.id_class(new LF(var5, 120, 150, 20, new rgn_3("selectWorld.customizeType"), var3x -> {
         mn_3 var4x = mN_2.id_protected.get(this.id_int);
         if (var4x != null) {
            var2.id_break(var4x.createEditScreen(var1, this.id_package));
         }
      }));
      this.id_native.id_new = false;
      this.id_class = var1.id_class(
         new ve_3(this, var4, 151, 150, 20, new rgn_3("selectWorld.bonusItems"), var1x -> this.id_package = this.id_package.id_native(), var1)
      );
      this.id_class.id_new = false;
      this.id_volatile = var1.id_class(
         new LF(
            var4,
            185,
            150,
            20,
            new rgn_3("selectWorld.import_worldgen_settings"),
            var3x -> {
               rgn_3 var4x = new rgn_3("selectWorld.import_worldgen_settings.select_file");
               String var5x = TinyFileDialogs.tinyfd_openFileDialog(var4x.getString(), (CharSequence)null, (PointerBuffer)null, (CharSequence)null, false);
               if (var5x != null) {
                  rVv_1 var6 = rVm_1.id_break();
                  rAt_1 var7 = new rAt_1(new rAf_1(), new rAz_1(var1.id_final().toFile(), rAZ.id_byte));

                  rAh_1 var8;
                  try {
                     rnW_2.id_class(var7, var1.id_throws, false);
                     CompletableFuture var9 = rAh_1.id_class(var7.id_case(), gq_3.INTEGRATED, 2, rqR_2.id_case(), var2);
                     var2.id_byte(var9::isDone);
                     var8 = (rAh_1)var9.get();
                  } catch (InterruptedException | ExecutionException var16) {
                     id_break.error("Error loading data packs when importing world settings", var16);
                     new rgn_3("selectWorld.import_worldgen_settings.failure");
                     new rgN_2(var16.getMessage());
                     var7.close();
                     return;
                  }

                  rVq_1 var19 = rVq_1.id_class(JsonOps.INSTANCE, var8.id_private(), var6);
                  JsonParser var10 = new JsonParser();

                  DataResult var11;
                  try (BufferedReader var12 = Files.newBufferedReader(Paths.get(var5x))) {
                     JsonElement var13 = var10.parse(var12);
                     var11 = rrSp_1.id_class.parse(var19, var13);
                  } catch (JsonSyntaxException | IOException | JsonIOException var18) {
                     var11 = DataResult.error("Failed to parse file: " + var18.getMessage());
                  }

                  if (var11.error().isPresent()) {
                     new rgn_3("selectWorld.import_worldgen_settings.failure");
                     String var21 = ((PartialResult)var11.error().get()).message();
                     id_break.error("Error parsing world settings: {}", var21);
                     new rgN_2(var21);
                  }

                  var8.close();
                  Lifecycle var20 = var11.lifecycle();
                  var11.resultOrPartial(id_break::error)
                     .ifPresent(
                        var5xx -> {
                           BooleanConsumer var6x = var5xxx -> {
                              var2.id_break(var1);
                              if (var5xxx) {
                                 this.id_class(var6, var5xx);
                              }
                           };
                           if (var20 == Lifecycle.stable()) {
                              this.id_class(var6, var5xx);
                           } else if (var20 == Lifecycle.experimental()) {
                              var2.id_break(
                                 new mT_2(
                                    var6x,
                                    new rgn_3("selectWorld.import_worldgen_settings.experimental.title"),
                                    new rgn_3("selectWorld.import_worldgen_settings.experimental.question")
                                 )
                              );
                           } else {
                              var2.id_break(
                                 new mT_2(
                                    var6x,
                                    new rgn_3("selectWorld.import_worldgen_settings.deprecated.title"),
                                    new rgn_3("selectWorld.import_worldgen_settings.deprecated.question")
                                 )
                              );
                           }
                        }
                     );
               }
            }
         )
      );
      this.id_volatile.id_new = false;
      this.id_case = cv_3.id_class(var3, id_protected, this.id_extends.id_case());
   }

   private static String id_class(OptionalLong var0) {
      return var0.isPresent() ? Long.toString(var0.getAsLong()) : "";
   }

   public boolean id_class() {
      return this.id_package.id_catch();
   }

   private void id_class(rVv_1 var1, rrSp_1 var2) {
      this.id_final = var1;
      this.id_package = var2;
      this.id_int = mN_2.id_class(var2);
      this.id_new = OptionalLong.of(var2.id_class());
      this.id_implements.id_class(id_class(this.id_new));
      this.id_extends.id_int = this.id_int.isPresent();
   }

   public rrSp_1 id_class(boolean var1) {
      OptionalLong var2 = this.id_byte();
      return this.id_package.id_class(var1, var2);
   }

   public void id_break(boolean var1) {
      this.id_extends.id_new = var1;
      if (this.id_package.id_catch()) {
         this.id_finally.id_new = false;
         this.id_class.id_new = false;
         this.id_native.id_new = false;
         this.id_volatile.id_new = false;
      } else {
         this.id_finally.id_new = var1;
         this.id_class.id_new = var1;
         this.id_native.id_new = var1 && mN_2.id_protected.containsKey(this.id_int);
         this.id_volatile.id_new = var1;
      }

      this.id_implements.id_private(var1);
   }

   public rVv_1 id_break() {
      return this.id_final;
   }

   @Override
   public void id_private() {
      this.id_implements.id_catch();
   }
}
