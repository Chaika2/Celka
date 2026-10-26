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
   private final FileChannel id_class;
   private final FileLock id_break;
   private static final ByteBuffer id_byte;

   private rnu_3(FileChannel var1, FileLock var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   static {
      byte[] var0 = "☃".getBytes(Charsets.UTF_8);
      id_byte = ByteBuffer.allocateDirect(var0.length);
      id_byte.put(var0);
      ((Buffer)id_byte).flip();
   }

   public boolean id_class() {
      return this.id_break.isValid();
   }

   public static rnu_3 id_class(Path var0) throws IOException {
      Path var1 = var0.resolve("session.lock");
      if (!Files.isDirectory(var0)) {
         Files.createDirectories(var0);
      }

      FileChannel var2 = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      try {
         var2.write(id_byte.duplicate());
         var2.force(true);
         FileLock var3 = var2.tryLock();
         if (var3 == null) {
            throw rnm_3.id_class(var1);
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
         if (this.id_break.isValid()) {
            this.id_break.release();
         }
      } finally {
         if (this.id_class.isOpen()) {
            this.id_class.close();
         }
      }
   }

   public static boolean id_break(Path var0) throws IOException {
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
