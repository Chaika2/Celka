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
   final rnu_3 break_;
   final Path byte_;
   private final String protected_;
   private final Map<rrGr_1, Path> throws_;

   public boolean byte_() {
      rrGm_1 var1 = this.protected_();
      return var1 != null && var1.finally_().class_() != this.class_.protected_();
   }

   public rrGk_1(rrGd_1 var1, String var2) throws IOException {
      this.class_ = var1;
      this.throws_ = new ConcurrentHashMap<>();
      this.protected_ = var2;
      this.byte_ = var1.protected_.resolve(var2);
      this.break_ = rnu_3.class_(this.byte_);
   }

   public boolean class_(rpC_2 var1) {
      this.implements_();
      return rrED.class_(this, var1);
   }

   public void class_(String var1) throws IOException {
      this.implements_();
      File var2 = new File(this.class_.protected_.toFile(), this.protected_);
      if (var2.exists()) {
         File var3 = new File(var2, "level.dat");
         if (var3.exists()) {
            rcd_3 var4 = rcW_2.class_(var3);
            rcd_3 var5 = var4.int_("Data");
            var5.class_("LevelName", var1);
            rcW_2.class_(var4, var3);
         }
      }
   }

   public rrGP class_(DynamicOps<rcZ_2> var1, rTH var2) {
      this.implements_();
      return this.class_.class_(this.byte_.toFile(), rrGd_1.class_(var1, var2));
   }

   public void class_(rVm_1 var1, rrGP var2, rcd_3 var3) {
      File var4 = this.byte_.toFile();
      rcd_3 var5 = var2.class_(var1, var3);
      rcd_3 var6 = new rcd_3();
      var6.class_("Data", var5);

      try {
         File var7 = File.createTempFile("level", ".dat", var4);
         rcW_2.class_(var6, var7);
         File var8 = new File(var4, "level.dat_old");
         File var9 = new File(var4, "level.dat");
         rqR_2.class_(var9, var7, var8);
      } catch (Exception var10) {
         rrGd_1.class_.error("Failed to save level {}", var4, var10);
      }
   }

   public void class_(rVm_1 var1, rrGP var2) {
      this.class_(var1, var2, (rcd_3)null);
   }

   public Path class_(rrGr_1 var1) {
      return this.throws_.computeIfAbsent(var1, var1x -> this.byte_.resolve(var1x.class_()));
   }

   public File class_(rqM_2<rYB> var1) {
      return rRJ.class_(var1, this.byte_.toFile());
   }

   public String class_() {
      return this.protected_;
   }

   @Override
   public void close() throws IOException {
      this.break_.close();
   }

   public rrGx_1 break_() {
      this.implements_();
      return new rrGx_1(this, this.class_.case_);
   }

   public rTH throws_() {
      this.implements_();
      return this.class_.class_(this.byte_.toFile(), (BiFunction<File, DataFixer, rTH>)((var0, var1) -> rrGd_1.class_(var0, var1)));
   }

   public void catch_() throws IOException {
      this.implements_();
      Path var1 = this.byte_.resolve("session.lock");

      for (int var2 = 1; var2 <= 5; var2++) {
         rrGd_1.class_.info("Attempt {}...", var2);

         try {
            Files.walkFileTree(this.byte_, new rrGW(this, var1));
            break;
         } catch (IOException var6) {
            if (var2 >= 5) {
               throw var6;
            }

            rrGd_1.class_.warn("Failed to delete {}", this.byte_, var6);

            try {
               Thread.sleep(500L);
            } catch (InterruptedException var5) {
            }
         }
      }
   }

   public File case_() {
      this.implements_();
      return this.byte_.resolve("icon.png").toFile();
   }

   private void implements_() {
      if (!this.break_.class_()) {
         throw new IllegalStateException("Lock is no longer valid");
      }
   }

   public rrGm_1 protected_() {
      this.implements_();
      return this.class_.class_(this.byte_.toFile(), this.class_.class_(this.byte_.toFile(), false));
   }

   public long private_() throws IOException {
      this.implements_();
      String var1 = LocalDateTime.now().format(rrGd_1.break_) + "_" + this.protected_;
      Path var2 = this.class_.byte_();

      try {
         Files.createDirectories(Files.exists(var2) ? var2.toRealPath() : var2);
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }

      Path var3 = var2.resolve(rpz_3.class_(var2, var1, ".zip"));

      try (ZipOutputStream var4 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(var3)))) {
         Path var5 = Paths.get(this.protected_);
         Files.walkFileTree(this.byte_, new rrGz_1(this, var5, var4));
      }

      return Files.size(var3);
   }
}
