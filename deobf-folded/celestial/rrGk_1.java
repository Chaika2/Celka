package celestial;

import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.DynamicOps;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.zip.ZipOutputStream;

public class rrGk_1 implements AutoCloseable {
   final rnu_3 id_break;
   final Path id_byte;
   private final String id_protected;
   private final Map<rrGr_1, Path> id_throws;

   public boolean id_byte() {
      rrGm_1 var1 = this.id_protected();
      return var1 != null && var1.id_finally().id_class() != this.id_class.id_protected();
   }

   public rrGk_1(rrGd_1 var1, String var2) throws IOException {
      this.id_class = var1;
      this.id_throws = new ConcurrentHashMap<>();
      this.id_protected = var2;
      this.id_byte = var1.id_protected.resolve(var2);
      this.id_break = rnu_3.id_class(this.id_byte);
   }

   public boolean id_class(rpC_2 var1) {
      this.id_implements();
      return rrED.id_class(this, var1);
   }

   public void id_class(String var1) throws IOException {
      this.id_implements();
      File var2 = new File(this.id_class.id_protected.toFile(), this.id_protected);
      if (var2.exists()) {
         File var3 = new File(var2, "level.dat");
         if (var3.exists()) {
            rcd_3 var4 = rcW_2.id_class(var3);
            rcd_3 var5 = var4.id_int("Data");
            var5.id_class("LevelName", var1);
            rcW_2.id_class(var4, var3);
         }
      }
   }

   public rrGP id_class(DynamicOps<rcZ_2> var1, rTH var2) {
      this.id_implements();
      return this.id_class.id_class(this.id_byte.toFile(), rrGd_1.id_class(var1, var2));
   }

   public void id_class(rVm_1 var1, rrGP var2, rcd_3 var3) {
      File var4 = this.id_byte.toFile();
      rcd_3 var5 = var2.id_class(var1, var3);
      rcd_3 var6 = new rcd_3();
      var6.id_class("Data", var5);

      try {
         File var7 = File.createTempFile("level", ".dat", var4);
         rcW_2.id_class(var6, var7);
         File var8 = new File(var4, "level.dat_old");
         File var9 = new File(var4, "level.dat");
         rqR_2.id_class(var9, var7, var8);
      } catch (Exception var10) {
         rrGd_1.id_class.error("Failed to save level {}", var4, var10);
      }
   }

   public void id_class(rVm_1 var1, rrGP var2) {
      this.id_class(var1, var2, (rcd_3)null);
   }

   public Path id_class(rrGr_1 var1) {
      return this.id_throws.computeIfAbsent(var1, var1x -> this.id_byte.resolve(var1x.id_class()));
   }

   public File id_class(rqM_2<rYB> var1) {
      return rRJ.id_class(var1, this.id_byte.toFile());
   }

   public String id_class() {
      return this.id_protected;
   }

   @Override
   public void close() throws IOException {
      this.id_break.close();
   }

   public rrGx_1 id_break() {
      this.id_implements();
      return new rrGx_1(this, this.id_class.id_case);
   }

   public rTH id_throws() {
      this.id_implements();
      return this.id_class.id_class(this.id_byte.toFile(), (BiFunction<File, DataFixer, rTH>)((var0, var1) -> rrGd_1.id_class(var0, var1)));
   }

   public void id_catch() throws IOException {
      this.id_implements();
      Path var1 = this.id_byte.resolve("session.lock");

      for (int var2 = 1; var2 <= 5; var2++) {
         rrGd_1.id_class.info("Attempt {}...", var2);

         try {
            Files.walkFileTree(this.id_byte, new rrGW(this, var1));
            break;
         } catch (IOException var6) {
            if (var2 >= 5) {
               throw var6;
            }

            rrGd_1.id_class.warn("Failed to delete {}", this.id_byte, var6);

            try {
               Thread.sleep(500L);
            } catch (InterruptedException var5) {
            }
         }
      }
   }

   public File id_case() {
      this.id_implements();
      return this.id_byte.resolve("icon.png").toFile();
   }

   private void id_implements() {
      if (!this.id_break.id_class()) {
         throw new IllegalStateException("Lock is no longer valid");
      }
   }

   public rrGm_1 id_protected() {
      this.id_implements();
      return this.id_class.id_class(this.id_byte.toFile(), this.id_class.id_class(this.id_byte.toFile(), false));
   }

   public long id_private() throws IOException {
      this.id_implements();
      String var1 = LocalDateTime.now().format(rrGd_1.id_break) + "_" + this.id_protected;
      Path var2 = this.id_class.id_byte();

      try {
         Files.createDirectories(Files.exists(var2) ? var2.toRealPath() : var2);
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }

      Path var3 = var2.resolve(rpz_3.id_class(var2, var1, ".zip"));

      try (ZipOutputStream var4 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(var3)))) {
         Path var5 = Paths.get(this.id_protected);
         Files.walkFileTree(this.id_byte, new rrGz_1(this, var5, var4));
      }

      return Files.size(var3);
   }
}
