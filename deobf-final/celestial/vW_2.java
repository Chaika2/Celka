package celestial;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

class vW_2 implements AutoCloseable {
   private final WatchService class_;
   private final Path break_;

   public vW_2(File var1) throws IOException {
      this.break_ = var1.toPath();
      this.class_ = this.break_.getFileSystem().newWatchService();

      try {
         this.class_(this.break_);

         try (DirectoryStream var2 = Files.newDirectoryStream(this.break_)) {
            for (Path var4 : var2) {
               if (Files.isDirectory(var4, LinkOption.NOFOLLOW_LINKS)) {
                  this.class_(var4);
               }
            }
         }
      } catch (Exception var7) {
         this.class_.close();
         throw var7;
      }
   }

   public boolean class_() throws IOException {
      boolean var1 = false;

      WatchKey var2;
      while ((var2 = this.class_.poll()) != null) {
         for (WatchEvent var4 : var2.pollEvents()) {
            var1 = true;
            if (var2.watchable() == this.break_ && var4.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
               Path var5 = this.break_.resolve((Path)var4.context());
               if (Files.isDirectory(var5, LinkOption.NOFOLLOW_LINKS)) {
                  this.class_(var5);
               }
            }
         }

         var2.reset();
      }

      return var1;
   }

   private void class_(Path var1) throws IOException {
      var1.register(this.class_, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
   }

   public static vW_2 class_(File var0) {
      try {
         return new vW_2(var0);
      } catch (IOException var2) {
         vk_3.implements_.warn("Failed to initialize pack directory {} monitoring", var0, var2);
         return null;
      }
   }

   @Override
   public void close() throws IOException {
      this.class_.close();
   }
}
