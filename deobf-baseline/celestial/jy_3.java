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
   private static final Logger id_class = LogManager.getLogger();
   private static final Pattern id_break = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final rAY id_byte;
   private final File id_protected;
   private final ReentrantLock id_throws = new ReentrantLock();
   private final jo_3 id_case;
   private CompletableFuture<?> id_catch;
   private rAp_1 id_private;

   private static Map<String, String> id_byte() {
      HashMap var0 = Maps.newHashMap();
      var0.put("X-Minecraft-Username", QY.id_instanceof().id_while().id_byte());
      var0.put("X-Minecraft-UUID", QY.id_instanceof().id_while().id_break());
      var0.put("X-Minecraft-Version", rqu_3.id_class().getName());
      var0.put("X-Minecraft-Version-ID", rqu_3.id_class().getId());
      var0.put("X-Minecraft-Pack-Format", String.valueOf(rqu_3.id_class().getPackVersion()));
      var0.put("User-Agent", "Minecraft Java/" + rqu_3.id_class().getName());
      return var0;
   }

   private static rAC id_byte(File var0) {
      return new jq_3(var0);
   }

   public jy_3(File var1, jo_3 var2) {
      this.id_protected = var1;
      this.id_case = var2;
      this.id_byte = new je_3(var2);
   }

   @Override
   public void id_class(Consumer<rAp_1> var1, rAq_1 var2) {
      rAp_1 var3 = rAp_1.id_class("vanilla", true, () -> this.id_byte, var2, rAT.BOTTOM, rAZ.id_break);
      if (var3 != null) {
         var1.accept(var3);
      }

      if (this.id_private != null) {
         var1.accept(this.id_private);
      }

      rAp_1 var4 = this.id_class(var2);
      if (var4 != null) {
         var1.accept(var4);
      }
   }

   public rAY id_class() {
      return this.id_byte;
   }

   private rAp_1 id_class(rAq_1 var1) {
      rAp_1 var2 = null;
      File var3 = this.id_case.id_class(new rqO_2("resourcepacks/programmer_art.zip"));
      if (var3 != null && var3.isFile()) {
         var2 = id_class(var1, () -> id_byte(var3));
      }

      if (var2 == null && rqu_3.id_byte) {
         File var4 = this.id_case.id_class("../resourcepacks/programmer_art");
         if (var4 != null && var4.isDirectory()) {
            var2 = id_class(var1, () -> id_break(var4));
         }
      }

      return var2;
   }

   private static rAp_1 id_class(rAq_1 var0, Supplier<rAC> var1) {
      return rAp_1.id_class("programer_art", false, var1, var0, rAT.TOP, rAZ.id_break);
   }

   private static void id_class(File var0) {
      try {
         Files.delete(var0.toPath());
      } catch (IOException var2) {
         id_class.warn("Failed to delete file {}: {}", var0, var2.getMessage());
      }
   }

   private boolean id_class(String var1, File var2) {
      try {
         boolean var5;
         try (FileInputStream var3 = new FileInputStream(var2)) {
            String var4 = DigestUtils.sha1Hex(var3);
            if (var1.isEmpty()) {
               id_class.info("Found file {} without verification hash", var2);
               return true;
            }

            if (!var4.toLowerCase(Locale.ROOT).equals(var1.toLowerCase(Locale.ROOT))) {
               id_class.warn("File {} had wrong hash (expected {}, found {}).", var2, var1, var4);
               return false;
            }

            id_class.info("Found file {} matching requested hash {}", var2, var1);
            var5 = true;
         }

         return var5;
      } catch (IOException var8) {
         id_class.warn("File {} couldn't be hashed.", var2, var8);
         return false;
      }
   }

   public CompletableFuture<?> id_class(String var1, String var2) {
      String var3 = DigestUtils.sha1Hex(var1);
      String var4 = id_break.matcher(var2).matches() ? var2 : "";
      this.id_throws.lock();

      CompletableFuture var5;
      try {
         this.id_break();
         this.id_protected();
         File var6 = new File(this.id_protected, var3);
         CompletableFuture var7;
         if (var6.exists()) {
            var7 = CompletableFuture.completedFuture("");
         } else {
            vY_2 var8 = new vY_2();
            Map var9 = id_byte();
            QY var10 = QY.id_instanceof();
            var10.id_catch(() -> var10.id_break(var8));
            var7 = rpu_3.id_class(var6, var1, var9, 104857600, var8, var10.W());
         }

         this.id_catch = var7.<Void>thenCompose(
               var3x -> !this.id_class(var4, var6)
                     ? rqR_2.id_class((Throwable)(new RuntimeException("Hash check failure for file " + var6 + ", see log")))
                     : this.id_class(var6, rAZ.id_protected)
            )
            .whenComplete((var1x, var2x) -> {
               if (var2x != null) {
                  id_class.warn("Pack application failed: {}, deleting file {}", var2x.getMessage(), var6);
                  id_class(var6);
               }
            });
         var5 = this.id_catch;
      } finally {
         this.id_throws.unlock();
      }

      return var5;
   }

   public CompletableFuture<Void> id_class(File var1, rAZ var2) {
      rAK var3;
      try (rAk_1 var4 = new rAk_1(var1)) {
         var3 = var4.id_class(rAK.id_class);
      } catch (IOException var9) {
         return rqR_2.id_class((Throwable)(new IOException(String.format("Invalid resourcepack at %s", var1), var9)));
      }

      id_class.info("Applying server pack {}", var1);
      this.id_private = new rAp_1(
         "server", true, () -> new rAk_1(var1), new rgn_3("resourcePack.server.name"), var3.id_class(), rAl_1.id_class(var3.id_break()), rAT.TOP, true, var2
      );
      return QY.id_instanceof().x();
   }

   private static rAW id_break(File var0) {
      return new jp_3(var0);
   }

   public void id_break() {
      this.id_throws.lock();

      try {
         if (this.id_catch != null) {
            this.id_catch.cancel(true);
         }

         this.id_catch = null;
         if (this.id_private != null) {
            this.id_private = null;
            QY.id_instanceof().x();
         }
      } finally {
         this.id_throws.unlock();
      }
   }

   private void id_protected() {
      try {
         ArrayList var1 = Lists.newArrayList(FileUtils.listFiles(this.id_protected, TrueFileFilter.TRUE, (IOFileFilter)null));
         var1.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
         int var2 = 0;

         for (File var4 : var1) {
            if (var2++ >= 10) {
               id_class.info("Deleting old server resource pack {}", var4.getName());
               FileUtils.deleteQuietly(var4);
            }
         }
      } catch (IllegalArgumentException var5) {
         id_class.error("Error while deleting old server resource pack : {}", var5.getMessage());
      }
   }
}
