package celestial;

import com.google.common.base.Charsets;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class rnu_3 implements AutoCloseable {
   private final FileChannel class_;
   private final FileLock break_;
   private static final ByteBuffer byte_;

   private rnu_3(FileChannel var1, FileLock var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   static {
      byte[] var0 = "☃".getBytes(Charsets.UTF_8);
      byte_ = ByteBuffer.allocateDirect(var0.length);
      byte_.put(var0);
      ((Buffer)byte_).flip();
   }

   public boolean class_() {
      return this.break_.isValid();
   }

   public static rnu_3 class_(Path var0) throws IOException {
      Path var1 = var0.resolve("session.lock");
      if (!Files.isDirectory(var0)) {
         Files.createDirectories(var0);
      }

      FileChannel var2 = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      try {
         var2.write(byte_.duplicate());
         var2.force(true);
         FileLock var3 = var2.tryLock();
         if (var3 == null) {
            throw rnm_3.class_(var1);
         } else {
            return new rnu_3(var2, var3);
         }
      } catch (IOException var6) {
         try {
            var2.close();
         } catch (IOException var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }
   }

   @Override
   public void close() throws IOException {
      try {
         if (this.break_.isValid()) {
            this.break_.release();
         }
      } finally {
         if (this.class_.isOpen()) {
            this.class_.close();
         }
      }
   }

   public static boolean break_(Path var0) throws IOException {
      Path var1 = var0.resolve("session.lock");

      try {
         boolean var4;
         try (
            FileChannel var2 = FileChannel.open(var1, StandardOpenOption.WRITE);
            FileLock var3 = var2.tryLock();
         ) {
            var4 = var3 == null;
         }

         return var4;
      } catch (AccessDeniedException var10) {
         return true;
      } catch (NoSuchFileException var11) {
         return false;
      }
   }
}
