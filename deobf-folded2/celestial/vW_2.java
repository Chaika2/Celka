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
   private final WatchService id_class;
   private final Path id_break;

   public vW_2(File var1) throws IOException {
      this.id_break = var1.toPath();
      this.id_class = this.id_break.getFileSystem().newWatchService();

      try {
         this.id_class(this.id_break);

         try (DirectoryStream var2 = Files.newDirectoryStream(this.id_break)) {
            for (Path var4 : var2) {
               if (Files.isDirectory(var4, LinkOption.NOFOLLOW_LINKS)) {
                  this.id_class(var4);
               }
            }
         }
      } catch (Exception var7) {
         this.id_class.close();
         throw var7;
      }
   }

   public boolean id_class() throws IOException {
      boolean var1 = false;

      WatchKey var2;
      while ((var2 = this.id_class.poll()) != null) {
         for (WatchEvent var4 : var2.pollEvents()) {
            var1 = true;
            if (var2.watchable() == this.id_break && var4.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
               Path var5 = this.id_break.resolve((Path)var4.context());
               if (Files.isDirectory(var5, LinkOption.NOFOLLOW_LINKS)) {
                  this.id_class(var5);
               }
            }
         }

         var2.reset();
      }

      return var1;
   }

   private void id_class(Path var1) throws IOException {
      var1.register(this.id_class, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
   }

   public static vW_2 id_class(File var0) {
      try {
         return new vW_2(var0);
      } catch (IOException var2) {
         vk_3.id_implements.warn("Failed to initialize pack directory {} monitoring", var0, var2);
         return null;
      }
   }

   @Override
   public void close() throws IOException {
      this.id_class.close();
   }
}
