package celestial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roe_3 implements AutoCloseable {
   private static final Logger id_break = LogManager.getLogger();
   private static final ByteBuffer id_byte = ByteBuffer.allocateDirect(1);
   private final FileChannel id_protected;
   private final Path id_throws;
   final rKP id_case;
   private final ByteBuffer id_catch = ByteBuffer.allocateDirect(8192);
   private final IntBuffer id_private;
   private final IntBuffer id_implements;
   protected final roU_2 id_class = new roU_2();

   private static int id_byte(int var0) {
      return (var0 + 4096 - 1) / 4096;
   }

   private void id_byte() throws IOException {
      ((Buffer)this.id_catch).position(0);
      this.id_protected.write(this.id_catch, 0L);
   }

   public DataOutputStream id_byte(rfj_3 var1) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(this.id_case.id_class(new roa_3(this, var1))));
   }

   public roe_3(File var1, File var2, boolean var3) throws IOException {
      this(var1.toPath(), var2.toPath(), rKP.id_break, var3);
   }

   public roe_3(Path var1, Path var2, rKP var3, boolean var4) throws IOException {
      this.id_case = var3;
      if (!Files.isDirectory(var2)) {
         throw new IllegalArgumentException("Expected directory, got " + var2.toAbsolutePath());
      } else {
         this.id_throws = var2;
         this.id_private = this.id_catch.asIntBuffer();
         ((Buffer)this.id_private).limit(1024);
         ((Buffer)this.id_catch).position(4096);
         this.id_implements = this.id_catch.asIntBuffer();
         if (var4) {
            this.id_protected = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC);
         } else {
            this.id_protected = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
         }

         this.id_class.id_class(0, 2);
         ((Buffer)this.id_catch).position(0);
         int var5 = this.id_protected.read(this.id_catch, 0L);
         if (var5 != -1) {
            if (var5 != 8192) {
               id_break.warn("Region file {} has truncated header: {}", var1, var5);
            }

            long var6 = Files.size(var1);

            for (int var8 = 0; var8 < 1024; var8++) {
               int var9 = this.id_private.get(var8);
               if (var9 != 0) {
                  int var10 = id_break(var9);
                  int var11 = id_class(var9);
                  if (var10 < 2) {
                     id_break.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", var1, var8, var10);
                     this.id_private.put(var8, 0);
                  } else if (var11 == 0) {
                     id_break.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", var1, var8);
                     this.id_private.put(var8, 0);
                  } else if ((long)var10 * 4096L > var6) {
                     id_break.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", var1, var8, var10);
                     this.id_private.put(var8, 0);
                  } else {
                     this.id_class.id_class(var10, var11);
                  }
               }
            }
         }
      }
   }

   protected synchronized void id_class(rfj_3 var1, ByteBuffer var2) throws IOException {
      int var3 = id_catch(var1);
      int var4 = this.id_private.get(var3);
      int var5 = id_break(var4);
      int var6 = id_class(var4);
      int var7 = var2.remaining();
      int var8 = id_byte(var7);
      int var9;
      roi_3 var10;
      if (var8 >= 256) {
         Path var11 = this.id_throws(var1);
         id_break.warn("Saving oversized chunk {} ({} bytes} to external file {}", var1, var7, var11);
         var8 = 1;
         var9 = this.id_class.id_class(var8);
         var10 = this.id_class(var11, var2);
         ByteBuffer var12 = this.id_break();
         this.id_protected.write(var12, (long)(var9 * 4096));
      } else {
         var9 = this.id_class.id_class(var8);
         var10 = () -> Files.deleteIfExists(this.id_throws(var1));
         this.id_protected.write(var2, (long)(var9 * 4096));
      }

      int var13 = (int)(rqR_2.id_protected() / 1000L);
      this.id_private.put(var3, this.id_class(var9, var8));
      this.id_implements.put(var3, var13);
      this.id_byte();
      var10.run();
      if (var5 != 0) {
         this.id_class.id_break(var5, var6);
      }
   }

   public void id_class() throws IOException {
      this.id_protected.force(true);
   }

   public synchronized DataInputStream id_class(rfj_3 var1) throws IOException {
      int var2 = this.id_case(var1);
      if (var2 == 0) {
         return null;
      } else {
         int var3 = id_break(var2);
         int var4 = id_class(var2);
         int var5 = var4 * 4096;
         ByteBuffer var6 = ByteBuffer.allocate(var5);
         this.id_protected.read(var6, (long)(var3 * 4096));
         ((Buffer)var6).flip();
         if (var6.remaining() < 5) {
            id_break.error("Chunk {} header is truncated: expected {} but read {}", var1, var5, var6.remaining());
            return null;
         } else {
            int var7 = var6.getInt();
            byte var8 = var6.get();
            if (var7 == 0) {
               id_break.warn("Chunk {} is allocated, but stream is missing", var1);
               return null;
            } else {
               int var9 = var7 - 1;
               if (id_class(var8)) {
                  if (var9 != 0) {
                     id_break.warn("Chunk has both internal and external streams");
                  }

                  return this.id_class(var1, id_break(var8));
               } else if (var9 > var6.remaining()) {
                  id_break.error("Chunk {} stream is truncated: expected {} but read {}", var1, var9, var6.remaining());
                  return null;
               } else if (var9 < 0) {
                  id_break.error("Declared size {} of chunk {} is negative", var7, var1);
                  return null;
               } else {
                  return this.id_class(var1, var8, id_class(var6, var9));
               }
            }
         }
      }
   }

   private roi_3 id_class(Path var1, ByteBuffer var2) throws IOException {
      Path var3 = Files.createTempFile(this.id_throws, "tmp", (String)null);

      try (FileChannel var4 = FileChannel.open(var3, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
         ((Buffer)var2).position(5);
         var4.write(var2);
      }

      return () -> Files.move(var3, var1, StandardCopyOption.REPLACE_EXISTING);
   }

   private static boolean id_class(byte var0) {
      return (var0 & 128) != 0;
   }

   private static int id_class(int var0) {
      return var0 & 0xFF;
   }

   private int id_class(int var1, int var2) {
      return var1 << 8 | var2;
   }

   private DataInputStream id_class(rfj_3 var1, byte var2) throws IOException {
      Path var3 = this.id_throws(var1);
      if (!Files.isRegularFile(var3)) {
         id_break.error("External chunk path {} is not file", var3);
         return null;
      } else {
         return this.id_class(var1, var2, Files.newInputStream(var3));
      }
   }

   private static ByteArrayInputStream id_class(ByteBuffer var0, int var1) {
      return new ByteArrayInputStream(var0.array(), var0.position(), var1);
   }

   private DataInputStream id_class(rfj_3 var1, byte var2, InputStream var3) throws IOException {
      rKP var4 = rKP.id_class(var2);
      if (var4 == null) {
         id_break.error("Chunk {} has invalid chunk stream version {}", var1, var2);
         return null;
      } else {
         return new DataInputStream(new BufferedInputStream(var4.id_class(var3)));
      }
   }

   @Override
   public void close() throws IOException {
      try {
         this.id_protected();
      } finally {
         try {
            this.id_protected.force(true);
         } finally {
            this.id_protected.close();
         }
      }
   }

   private static byte id_break(byte var0) {
      return (byte)(var0 & -129);
   }

   private static int id_break(int var0) {
      return var0 >> 8 & 16777215;
   }

   public boolean id_break(rfj_3 var1) {
      int var2 = this.id_case(var1);
      if (var2 == 0) {
         return false;
      } else {
         int var3 = id_break(var2);
         int var4 = id_class(var2);
         ByteBuffer var5 = ByteBuffer.allocate(5);

         try {
            this.id_protected.read(var5, (long)(var3 * 4096));
            ((Buffer)var5).flip();
            if (var5.remaining() != 5) {
               return false;
            } else {
               int var6 = var5.getInt();
               byte var7 = var5.get();
               if (id_class(var7)) {
                  if (!rKP.id_break(id_break(var7))) {
                     return false;
                  }

                  if (!Files.isRegularFile(this.id_throws(var1))) {
                     return false;
                  }
               } else {
                  if (!rKP.id_break(var7)) {
                     return false;
                  }

                  if (var6 == 0) {
                     return false;
                  }

                  int var8 = var6 - 1;
                  if (var8 < 0 || var8 > 4096 * var4) {
                     return false;
                  }
               }

               return true;
            }
         } catch (IOException var9) {
            return false;
         }
      }
   }

   private ByteBuffer id_break() {
      ByteBuffer var1 = ByteBuffer.allocate(5);
      var1.putInt(1);
      var1.put((byte)(this.id_case.id_class() | 128));
      ((Buffer)var1).flip();
      return var1;
   }

   private Path id_throws(rfj_3 var1) {
      String var2 = "c." + var1.id_break + "." + var1.id_byte + ".mcc";
      return this.id_throws.resolve(var2);
   }

   private static int id_catch(rfj_3 var0) {
      return var0.id_private() + var0.id_implements() * 32;
   }

   private int id_case(rfj_3 var1) {
      return this.id_private.get(id_catch(var1));
   }

   public boolean id_protected(rfj_3 var1) {
      return this.id_case(var1) != 0;
   }

   private void id_protected() throws IOException {
      int var1 = (int)this.id_protected.size();
      int var2 = id_byte(var1) * 4096;
      if (var1 != var2) {
         ByteBuffer var3 = id_byte.duplicate();
         ((Buffer)var3).position(0);
         this.id_protected.write(var3, (long)(var2 - 1));
      }
   }
}
