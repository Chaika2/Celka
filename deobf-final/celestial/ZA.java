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
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson throws_ = new GsonBuilder().setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
   private static final rgP_2 case_ = new rgn_3("selectWorld.enterName");
   private LF catch_;
   private final BooleanConsumer private_;
   private Lu_1 implements_;
   private final rrGk_1 finally_;

   public ZA(BooleanConsumer var1, rrGk_1 var2) {
      super(new rgn_3("selectWorld.edit.title"));
      this.private_ = var1;
      this.finally_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 15, 16777215);
      break_(var1, this.super_, case_, this.package_ / 2 - 100, 24, 10526880);
      this.implements_.class_(var1, var2, var3, var4);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.implements_.private_();
      this.break_(var1, var2, var3);
      this.implements_.class_(var4);
   }

   public static void class_(rrGd_1 var0, String var1) {
      try (rrGk_1 var2 = var0.byte_(var1)) {
         class_(var2);
      } catch (IOException var7) {
         class_.warn("Failed to create backup of level {}", var1, var7);
      }
   }

   public static boolean class_(rrGk_1 var0) {
      long var1 = 0L;
      IOException var3 = null;

      try {
         var1 = var0.private_();
      } catch (IOException var5) {
         var3 = var5;
      }

      return var3 == null;
   }

   private void finally_() {
      try {
         this.finally_.class_(this.implements_.private_().trim());
         this.private_.accept(true);
      } catch (IOException var2) {
         class_.error("Failed to access world '{}'", this.finally_.class_(), var2);
         this.private_.accept(true);
      }
   }

   @Override
   public void private_() {
      this.implements_.catch_();
   }

   @Override
   public void volatile_() {
      this.private_.accept(false);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      LF var1 = this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 5, 200, 20, new rgn_3("selectWorld.edit.resetIcon"), var1x -> {
         FileUtils.deleteQuietly(this.finally_.case_());
         var1x.int_ = false;
      })));
      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 100,
            this.int_ / 4 + 24 + 5,
            200,
            20,
            new rgn_3("selectWorld.edit.openFolder"),
            var1x -> rqR_2.implements_().class_(this.finally_.class_(rrGr_1.implements_).toFile())
         ))
      );
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 48 + 5, 200, 20, new rgn_3("selectWorld.edit.backup"), var1x -> {
         boolean var2x = class_(this.finally_);
         this.private_.accept(!var2x);
      })));
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 72 + 5, 200, 20, new rgn_3("selectWorld.edit.backupFolder"), var1x -> {
         rrGd_1 var2x = this.volatile_.M();
         Path var3x = var2x.byte_();

         try {
            Files.createDirectories(Files.exists(var3x) ? var3x.toRealPath() : var3x);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         rqR_2.implements_().class_(var3x.toFile());
      })));
      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 100,
            this.int_ / 4 + 96 + 5,
            200,
            20,
            new rgn_3("selectWorld.edit.optimize"),
            var1x -> this.volatile_.break_(new my_3(this, (var1xx, var2x) -> {
                  if (var1xx) {
                     class_(this.finally_);
                  }

                  this.volatile_.break_(vb_3.class_(this.volatile_, this.private_, this.volatile_.protected_(), this.finally_, var2x));
               }, new rgn_3("optimizeWorld.confirm.title"), new rgn_3("optimizeWorld.confirm.description"), true))
         ))
      );
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 120 + 5, 200, 20, new rgn_3("selectWorld.edit.export_worldgen_settings"), var1x -> {
         rVv_1 var2x = rVm_1.break_();

         DataResult var3x;
         try (QK var4 = this.volatile_.class_(var2x, QY::class_, QY::class_, false, this.finally_)) {
            rVp_1 var5 = rVp_1.class_(JsonOps.INSTANCE, var2x);
            DataResult var6 = rrSp_1.class_.encodeStart(var5, var4.byte_().long_());
            var3x = var6.flatMap(var1xx -> {
               Path var2xx = this.finally_.class_(rrGr_1.implements_).resolve("worldgen_settings_export.json");

               try {
                  JsonWriter var3xx = throws_.newJsonWriter(Files.newBufferedWriter(var2xx, StandardCharsets.UTF_8));

                  try {
                     throws_.toJson(var1xx, var3xx);
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

         var3x.error().ifPresent(var0 -> class_.error("Error exporting world settings: {}", var0));
      })));
      this.catch_ = this.class_(
         (LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 144 + 5, 98, 20, new rgn_3("selectWorld.edit.save"), var1x -> this.finally_()))
      );
      this.class_((LF)(new LF(this.package_ / 2 + 2, this.int_ / 4 + 144 + 5, 98, 20, cN_2.protected_, var1x -> this.private_.accept(false))));
      var1.int_ = this.finally_.case_().isFile();
      rrGm_1 var2 = this.finally_.protected_();
      String var3 = var2 == null ? "" : var2.break_();
      this.implements_ = new Lu_1(this.super_, this.package_ / 2 - 100, 38, 200, 20, new rgn_3("selectWorld.enterName"));
      this.implements_.class_(var3);
      this.implements_.class_(var1x -> this.catch_.int_ = !var1x.trim().isEmpty());
      this.native_.add(this.implements_);
      this.break_(this.implements_);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
