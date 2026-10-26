package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jy_3 implements rAm_1 {
   private static final Logger class_ = LogManager.getLogger();
   private static final Pattern break_ = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final rAY byte_;
   private final File protected_;
   private final ReentrantLock throws_ = new ReentrantLock();
   private final jo_3 case_;
   private CompletableFuture<?> catch_;
   private rAp_1 private_;

   private static Map<String, String> byte_() {
      HashMap var0 = Maps.newHashMap();
      var0.put("X-Minecraft-Username", QY.instanceof_().while_().byte_());
      var0.put("X-Minecraft-UUID", QY.instanceof_().while_().break_());
      var0.put("X-Minecraft-Version", rqu_3.class_().getName());
      var0.put("X-Minecraft-Version-ID", rqu_3.class_().getId());
      var0.put("X-Minecraft-Pack-Format", String.valueOf(rqu_3.class_().getPackVersion()));
      var0.put("User-Agent", "Minecraft Java/" + rqu_3.class_().getName());
      return var0;
   }

   private static rAC byte_(File var0) {
      return new jq_3(var0);
   }

   public jy_3(File var1, jo_3 var2) {
      this.protected_ = var1;
      this.case_ = var2;
      this.byte_ = new je_3(var2);
   }

   @Override
   public void class_(Consumer<rAp_1> var1, rAq_1 var2) {
      rAp_1 var3 = rAp_1.class_("vanilla", true, () -> this.byte_, var2, rAT.BOTTOM, rAZ.break_);
      if (var3 != null) {
         var1.accept(var3);
      }

      if (this.private_ != null) {
         var1.accept(this.private_);
      }

      rAp_1 var4 = this.class_(var2);
      if (var4 != null) {
         var1.accept(var4);
      }
   }

   public rAY class_() {
      return this.byte_;
   }

   private rAp_1 class_(rAq_1 var1) {
      rAp_1 var2 = null;
      File var3 = this.case_.class_(new rqO_2("resourcepacks/programmer_art.zip"));
      if (var3 != null && var3.isFile()) {
         var2 = class_(var1, () -> byte_(var3));
      }

      if (var2 == null && rqu_3.byte_) {
         File var4 = this.case_.class_("../resourcepacks/programmer_art");
         if (var4 != null && var4.isDirectory()) {
            var2 = class_(var1, () -> break_(var4));
         }
      }

      return var2;
   }

   private static rAp_1 class_(rAq_1 var0, Supplier<rAC> var1) {
      return rAp_1.class_("programer_art", false, var1, var0, rAT.TOP, rAZ.break_);
   }

   private static void class_(File var0) {
      try {
         Files.delete(var0.toPath());
      } catch (IOException var2) {
         class_.warn("Failed to delete file {}: {}", var0, var2.getMessage());
      }
   }

   private boolean class_(String var1, File var2) {
      try {
         boolean var5;
         try (FileInputStream var3 = new FileInputStream(var2)) {
            String var4 = DigestUtils.sha1Hex(var3);
            if (var1.isEmpty()) {
               class_.info("Found file {} without verification hash", var2);
               return true;
            }

            if (!var4.toLowerCase(Locale.ROOT).equals(var1.toLowerCase(Locale.ROOT))) {
               class_.warn("File {} had wrong hash (expected {}, found {}).", var2, var1, var4);
               return false;
            }

            class_.info("Found file {} matching requested hash {}", var2, var1);
            var5 = true;
         }

         return var5;
      } catch (IOException var8) {
         class_.warn("File {} couldn't be hashed.", var2, var8);
         return false;
      }
   }

   public CompletableFuture<?> class_(String var1, String var2) {
      String var3 = DigestUtils.sha1Hex(var1);
      String var4 = break_.matcher(var2).matches() ? var2 : "";
      this.throws_.lock();

      CompletableFuture var5;
      try {
         this.break_();
         this.protected_();
         File var6 = new File(this.protected_, var3);
         CompletableFuture var7;
         if (var6.exists()) {
            var7 = CompletableFuture.completedFuture("");
         } else {
            vY_2 var8 = new vY_2();
            Map var9 = byte_();
            QY var10 = QY.instanceof_();
            var10.catch_(() -> var10.break_(var8));
            var7 = rpu_3.class_(var6, var1, var9, 104857600, var8, var10.W());
         }

         this.catch_ = var7.<Void>thenCompose(
               var3x -> !this.class_(var4, var6)
                     ? rqR_2.class_((Throwable)(new RuntimeException("Hash check failure for file " + var6 + ", see log")))
                     : this.class_(var6, rAZ.protected_)
            )
            .whenComplete((var1x, var2x) -> {
               if (var2x != null) {
                  class_.warn("Pack application failed: {}, deleting file {}", var2x.getMessage(), var6);
                  class_(var6);
               }
            });
         var5 = this.catch_;
      } finally {
         this.throws_.unlock();
      }

      return var5;
   }

   public CompletableFuture<Void> class_(File var1, rAZ var2) {
      rAK var3;
      try (rAk_1 var4 = new rAk_1(var1)) {
         var3 = var4.class_(rAK.class_);
      } catch (IOException var9) {
         return rqR_2.class_((Throwable)(new IOException(String.format("Invalid resourcepack at %s", var1), var9)));
      }

      class_.info("Applying server pack {}", var1);
      this.private_ = new rAp_1(
         "server", true, () -> new rAk_1(var1), new rgn_3("resourcePack.server.name"), var3.class_(), rAl_1.class_(var3.break_()), rAT.TOP, true, var2
      );
      return QY.instanceof_().x();
   }

   private static rAW break_(File var0) {
      return new jp_3(var0);
   }

   public void break_() {
      this.throws_.lock();

      try {
         if (this.catch_ != null) {
            this.catch_.cancel(true);
         }

         this.catch_ = null;
         if (this.private_ != null) {
            this.private_ = null;
            QY.instanceof_().x();
         }
      } finally {
         this.throws_.unlock();
      }
   }

   private void protected_() {
      try {
         ArrayList var1 = Lists.newArrayList(FileUtils.listFiles(this.protected_, TrueFileFilter.TRUE, (IOFileFilter)null));
         var1.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
         int var2 = 0;

         for (File var4 : var1) {
            if (var2++ >= 10) {
               class_.info("Deleting old server resource pack {}", var4.getName());
               FileUtils.deleteQuietly(var4);
            }
         }
      } catch (IllegalArgumentException var5) {
         class_.error("Error while deleting old server resource pack : {}", var5.getMessage());
      }
   }
}
