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
   private static final Logger break_ = LogManager.getLogger();
   static final rgP_2 byte_ = new rgn_3("generator.custom");
   static final rgP_2 protected_ = new rgn_3("generator.amplified.info");
   private static final rgP_2 throws_ = new rgn_3("selectWorld.mapFeatures.info");
   private cv_3 case_ = cv_3.class_;
   private cm_3 catch_;
   private int private_;
   private Lu_1 implements_;
   private LF finally_;
   public LF class_;
   private LF extends_;
   private LF native_;
   private LF volatile_;
   private rVv_1 final_;
   rrSp_1 package_;
   Optional<mN_2> int_;
   private OptionalLong new_;

   private OptionalLong byte_() {
      String var1 = this.implements_.private_();
      OptionalLong var2;
      if (StringUtils.isEmpty(var1)) {
         var2 = OptionalLong.empty();
      } else {
         OptionalLong var3 = class_(var1);
         if (var3.isPresent() && var3.getAsLong() != 0L) {
            var2 = var3;
         } else {
            var2 = OptionalLong.of((long)var1.hashCode());
         }
      }

      return var2;
   }

   public vK_2(rVv_1 var1, rrSp_1 var2, Optional<mN_2> var3, OptionalLong var4) {
      this.final_ = var1;
      this.package_ = var2;
      this.int_ = var3;
      this.new_ = var4;
   }

   void class_(rAh_1 var1) {
      rVv_1 var2 = rVm_1.break_();
      rVp_1 var3 = rVp_1.class_(JsonOps.INSTANCE, this.final_);
      rVq_1 var4 = rVq_1.class_(JsonOps.INSTANCE, var1.private_(), var2);
      DataResult var5 = rrSp_1.class_.encodeStart(var3, this.package_).flatMap(var1x -> rrSp_1.class_.parse(var4, var1x));
      var5.resultOrPartial(rqR_2.class_("Error parsing worldgen settings after loading data packs: ", break_::error)).ifPresent(var2x -> {
         this.package_ = var2x;
         this.final_ = var2;
      });
   }

   private static OptionalLong class_(String var0) {
      try {
         return OptionalLong.of(Long.parseLong(var0));
      } catch (NumberFormatException var2) {
         return OptionalLong.empty();
      }
   }

   protected void class_(rrSp_1 var1) {
      this.package_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.finally_.new_) {
         this.catch_.break_(var1, throws_, (float)(this.private_ / 2 - 150), 122.0F, -6250336);
      }

      this.implements_.class_(var1, var2, var3, var4);
      if (this.int_.equals(Optional.of(mN_2.break_))) {
         this.case_.break_(var1, this.extends_.volatile_ + 2, this.extends_.final_ + 22, 9, 10526880);
      }
   }

   public void class_(mo_3 var1, QY var2, cm_3 var3) {
      this.catch_ = var3;
      this.private_ = var1.package_;
      this.implements_ = new Lu_1(this.catch_, this.private_ / 2 - 100, 60, 200, 20, new rgn_3("selectWorld.enterSeed"));
      this.implements_.class_(class_(this.new_));
      this.implements_.class_(var1x -> this.new_ = this.byte_());
      var1.protected_(this.implements_);
      int var4 = this.private_ / 2 - 155;
      int var5 = this.private_ / 2 + 5;
      this.finally_ = var1.class_(new vD_2(this, var4, 100, 150, 20, new rgn_3("selectWorld.mapFeatures"), var1x -> this.package_ = this.package_.extends_()));
      this.finally_.new_ = false;
      this.extends_ = var1.class_(new vU_2(this, var5, 100, 150, 20, new rgn_3("selectWorld.mapType"), var2x -> {
         while (this.int_.isPresent()) {
            int var3x = mN_2.byte_.indexOf(this.int_.get()) + 1;
            if (var3x >= mN_2.byte_.size()) {
               var3x = 0;
            }

            mN_2 var4x = mN_2.byte_.get(var3x);
            this.int_ = Optional.of(var4x);
            this.package_ = var4x.class_(this.final_, this.package_.class_(), this.package_.break_(), this.package_.byte_());
            if (!this.package_.catch_() || vm_3.synchronized_()) {
               break;
            }
         }

         var1.finally_();
      }));
      this.extends_.new_ = false;
      this.extends_.int_ = this.int_.isPresent();
      this.native_ = var1.class_(new LF(var5, 120, 150, 20, new rgn_3("selectWorld.customizeType"), var3x -> {
         mn_3 var4x = mN_2.protected_.get(this.int_);
         if (var4x != null) {
            var2.break_(var4x.createEditScreen(var1, this.package_));
         }
      }));
      this.native_.new_ = false;
      this.class_ = var1.class_(new ve_3(this, var4, 151, 150, 20, new rgn_3("selectWorld.bonusItems"), var1x -> this.package_ = this.package_.native_(), var1));
      this.class_.new_ = false;
      this.volatile_ = var1.class_(
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
                  rVv_1 var6 = rVm_1.break_();
                  rAt_1 var7 = new rAt_1(new rAf_1(), new rAz_1(var1.final_().toFile(), rAZ.byte_));

                  rAh_1 var8;
                  try {
                     rnW_2.class_(var7, var1.throws_, false);
                     CompletableFuture var9 = rAh_1.class_(var7.case_(), gq_3.INTEGRATED, 2, rqR_2.case_(), var2);
                     var2.byte_(var9::isDone);
                     var8 = (rAh_1)var9.get();
                  } catch (InterruptedException | ExecutionException var16) {
                     break_.error("Error loading data packs when importing world settings", var16);
                     new rgn_3("selectWorld.import_worldgen_settings.failure");
                     new rgN_2(var16.getMessage());
                     var7.close();
                     return;
                  }

                  rVq_1 var19 = rVq_1.class_(JsonOps.INSTANCE, var8.private_(), var6);
                  JsonParser var10 = new JsonParser();

                  DataResult var11;
                  try (BufferedReader var12 = Files.newBufferedReader(Paths.get(var5x))) {
                     JsonElement var13 = var10.parse(var12);
                     var11 = rrSp_1.class_.parse(var19, var13);
                  } catch (JsonSyntaxException | IOException | JsonIOException var18) {
                     var11 = DataResult.error("Failed to parse file: " + var18.getMessage());
                  }

                  if (var11.error().isPresent()) {
                     new rgn_3("selectWorld.import_worldgen_settings.failure");
                     String var21 = ((PartialResult)var11.error().get()).message();
                     break_.error("Error parsing world settings: {}", var21);
                     new rgN_2(var21);
                  }

                  var8.close();
                  Lifecycle var20 = var11.lifecycle();
                  var11.resultOrPartial(break_::error)
                     .ifPresent(
                        var5xx -> {
                           BooleanConsumer var6x = var5xxx -> {
                              var2.break_(var1);
                              if (var5xxx) {
                                 this.class_(var6, var5xx);
                              }
                           };
                           if (var20 == Lifecycle.stable()) {
                              this.class_(var6, var5xx);
                           } else if (var20 == Lifecycle.experimental()) {
                              var2.break_(
                                 new mT_2(
                                    var6x,
                                    new rgn_3("selectWorld.import_worldgen_settings.experimental.title"),
                                    new rgn_3("selectWorld.import_worldgen_settings.experimental.question")
                                 )
                              );
                           } else {
                              var2.break_(
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
      this.volatile_.new_ = false;
      this.case_ = cv_3.class_(var3, protected_, this.extends_.case_());
   }

   private static String class_(OptionalLong var0) {
      return var0.isPresent() ? Long.toString(var0.getAsLong()) : "";
   }

   public boolean class_() {
      return this.package_.catch_();
   }

   private void class_(rVv_1 var1, rrSp_1 var2) {
      this.final_ = var1;
      this.package_ = var2;
      this.int_ = mN_2.class_(var2);
      this.new_ = OptionalLong.of(var2.class_());
      this.implements_.class_(class_(this.new_));
      this.extends_.int_ = this.int_.isPresent();
   }

   public rrSp_1 class_(boolean var1) {
      OptionalLong var2 = this.byte_();
      return this.package_.class_(var1, var2);
   }

   public void break_(boolean var1) {
      this.extends_.new_ = var1;
      if (this.package_.catch_()) {
         this.finally_.new_ = false;
         this.class_.new_ = false;
         this.native_.new_ = false;
         this.volatile_.new_ = false;
      } else {
         this.finally_.new_ = var1;
         this.class_.new_ = var1;
         this.native_.new_ = var1 && mN_2.protected_.containsKey(this.int_);
         this.volatile_.new_ = var1;
      }

      this.implements_.private_(var1);
   }

   public rVv_1 break_() {
      return this.final_;
   }

   @Override
   public void private_() {
      this.implements_.catch_();
   }
}
