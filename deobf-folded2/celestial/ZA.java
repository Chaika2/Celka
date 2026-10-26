package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ZA extends vm_3 {
   private static final Logger id_class = LogManager.getLogger();
   private static final Gson id_throws = new GsonBuilder().setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
   private static final rgP_2 id_case = new rgn_3("selectWorld.enterName");
   private LF id_catch;
   private final BooleanConsumer id_private;
   private Lu_1 id_implements;
   private final rrGk_1 id_finally;

   public ZA(BooleanConsumer var1, rrGk_1 var2) {
      super(new rgn_3("selectWorld.edit.title"));
      this.id_private = var1;
      this.id_finally = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 15, 16777215);
      id_break(var1, this.id_super, id_case, this.id_package / 2 - 100, 24, 10526880);
      this.id_implements.id_class(var1, var2, var3, var4);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_implements.id_private();
      this.id_break(var1, var2, var3);
      this.id_implements.id_class(var4);
   }

   public static void id_class(rrGd_1 var0, String var1) {
      try (rrGk_1 var2 = var0.id_byte(var1)) {
         id_class(var2);
      } catch (IOException var7) {
         id_class.warn("Failed to create backup of level {}", var1, var7);
      }
   }

   public static boolean id_class(rrGk_1 var0) {
      long var1 = 0L;
      IOException var3 = null;

      try {
         var1 = var0.id_private();
      } catch (IOException var5) {
         var3 = var5;
      }

      return var3 == null;
   }

   private void id_finally() {
      try {
         this.id_finally.id_class(this.id_implements.id_private().trim());
         this.id_private.accept(true);
      } catch (IOException var2) {
         id_class.error("Failed to access world '{}'", this.id_finally.id_class(), var2);
         this.id_private.accept(true);
      }
   }

   @Override
   public void id_private() {
      this.id_implements.id_catch();
   }

   @Override
   public void id_volatile() {
      this.id_private.accept(false);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      LF var1 = this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 5, 200, 20, new rgn_3("selectWorld.edit.resetIcon"), var1x -> {
         FileUtils.deleteQuietly(this.id_finally.id_case());
         var1x.id_int = false;
      })));
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 100,
            this.id_int / 4 + 24 + 5,
            200,
            20,
            new rgn_3("selectWorld.edit.openFolder"),
            var1x -> rqR_2.id_implements().id_class(this.id_finally.id_class(rrGr_1.id_implements).toFile())
         ))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 48 + 5, 200, 20, new rgn_3("selectWorld.edit.backup"), var1x -> {
         boolean var2x = id_class(this.id_finally);
         this.id_private.accept(!var2x);
      })));
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 72 + 5, 200, 20, new rgn_3("selectWorld.edit.backupFolder"), var1x -> {
         rrGd_1 var2x = this.id_volatile.M();
         Path var3x = var2x.id_byte();

         try {
            Files.createDirectories(Files.exists(var3x) ? var3x.toRealPath() : var3x);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         rqR_2.id_implements().id_class(var3x.toFile());
      })));
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 100,
            this.id_int / 4 + 96 + 5,
            200,
            20,
            new rgn_3("selectWorld.edit.optimize"),
            var1x -> this.id_volatile.id_break(new my_3(this, (var1xx, var2x) -> {
                  if (var1xx) {
                     id_class(this.id_finally);
                  }

                  this.id_volatile.id_break(vb_3.id_class(this.id_volatile, this.id_private, this.id_volatile.id_protected(), this.id_finally, var2x));
               }, new rgn_3("optimizeWorld.confirm.title"), new rgn_3("optimizeWorld.confirm.description"), true))
         ))
      );
      this.id_class(
         (LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 5, 200, 20, new rgn_3("selectWorld.edit.export_worldgen_settings"), var1x -> {
            rVv_1 var2x = rVm_1.id_break();

            DataResult var3x;
            try (QK var4 = this.id_volatile.id_class(var2x, QY::id_class, QY::id_class, false, this.id_finally)) {
               rVp_1 var5 = rVp_1.id_class(JsonOps.INSTANCE, var2x);
               DataResult var6 = rrSp_1.id_class.encodeStart(var5, var4.id_byte().id_long());
               var3x = var6.flatMap(var1xx -> {
                  Path var2xx = this.id_finally.id_class(rrGr_1.id_implements).resolve("worldgen_settings_export.json");

                  try {
                     JsonWriter var3xx = id_throws.newJsonWriter(Files.newBufferedWriter(var2xx, StandardCharsets.UTF_8));

                     try {
                        id_throws.toJson(var1xx, var3xx);
                     } catch (Throwable var7) {
                        if (var3xx != null) {
                           try {
                              var3xx.close();
                           } catch (Throwable var6x) {
                              var7.addSuppressed(var6x);
                           }
                        }

                        throw var7;
                     }

                     if (var3xx != null) {
                        var3xx.close();
                     }
                  } catch (IOException | JsonIOException var8) {
                     return DataResult.error("Error writing file: " + var8.getMessage());
                  }

                  return DataResult.success(var2xx.toString());
               });
            } catch (InterruptedException | ExecutionException var9) {
               var3x = DataResult.error("Could not parse level data!");
            }

            var3x.error().ifPresent(var0 -> id_class.error("Error exporting world settings: {}", var0));
         }))
      );
      this.id_catch = this.id_class(
         (LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 144 + 5, 98, 20, new rgn_3("selectWorld.edit.save"), var1x -> this.id_finally()))
      );
      this.id_class((LF)(new LF(this.id_package / 2 + 2, this.id_int / 4 + 144 + 5, 98, 20, cN_2.id_protected, var1x -> this.id_private.accept(false))));
      var1.id_int = this.id_finally.id_case().isFile();
      rrGm_1 var2 = this.id_finally.id_protected();
      String var3 = var2 == null ? "" : var2.id_break();
      this.id_implements = new Lu_1(this.id_super, this.id_package / 2 - 100, 38, 200, 20, new rgn_3("selectWorld.enterName"));
      this.id_implements.id_class(var3);
      this.id_implements.id_class(var1x -> this.id_catch.id_int = !var1x.trim().isEmpty());
      this.id_native.add(this.id_implements);
      this.id_break(this.id_implements);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
