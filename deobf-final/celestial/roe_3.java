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
   private static final Logger break_ = LogManager.getLogger();
   private static final ByteBuffer byte_ = ByteBuffer.allocateDirect(1);
   private final FileChannel protected_;
   private final Path throws_;
   final rKP case_;
   private final ByteBuffer catch_ = ByteBuffer.allocateDirect(8192);
   private final IntBuffer private_;
   private final IntBuffer implements_;
   protected final roU_2 class_ = new roU_2();

   private static int byte_(int var0) {
      return (var0 + 4096 - 1) / 4096;
   }

   private void byte_() throws IOException {
      ((Buffer)this.catch_).position(0);
      this.protected_.write(this.catch_, 0L);
   }

   public DataOutputStream byte_(rfj_3 var1) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(this.case_.class_(new roa_3(this, var1))));
   }

   public roe_3(File var1, File var2, boolean var3) throws IOException {
      this(var1.toPath(), var2.toPath(), rKP.break_, var3);
   }

   public roe_3(Path var1, Path var2, rKP var3, boolean var4) throws IOException {
      this.case_ = var3;
      if (!Files.isDirectory(var2)) {
         throw new IllegalArgumentException("Expected directory, got " + var2.toAbsolutePath());
      } else {
         this.throws_ = var2;
         this.private_ = this.catch_.asIntBuffer();
         ((Buffer)this.private_).limit(1024);
         ((Buffer)this.catch_).position(4096);
         this.implements_ = this.catch_.asIntBuffer();
         if (var4) {
            this.protected_ = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC);
         } else {
            this.protected_ = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
         }

         this.class_.class_(0, 2);
         ((Buffer)this.catch_).position(0);
         int var5 = this.protected_.read(this.catch_, 0L);
         if (var5 != -1) {
            if (var5 != 8192) {
               break_.warn("Region file {} has truncated header: {}", var1, var5);
            }

            long var6 = Files.size(var1);

            for (int var8 = 0; var8 < 1024; var8++) {
               int var9 = this.private_.get(var8);
               if (var9 != 0) {
                  int var10 = break_(var9);
                  int var11 = class_(var9);
                  if (var10 < 2) {
                     break_.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", var1, var8, var10);
                     this.private_.put(var8, 0);
                  } else if (var11 == 0) {
                     break_.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", var1, var8);
                     this.private_.put(var8, 0);
                  } else if ((long)var10 * 4096L > var6) {
                     break_.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", var1, var8, var10);
                     this.private_.put(var8, 0);
                  } else {
                     this.class_.class_(var10, var11);
                  }
               }
            }
         }
      }
   }

   protected synchronized void class_(rfj_3 var1, ByteBuffer var2) throws IOException {
      int var3 = catch_(var1);
      int var4 = this.private_.get(var3);
      int var5 = break_(var4);
      int var6 = class_(var4);
      int var7 = var2.remaining();
      int var8 = byte_(var7);
      int var9;
      roi_3 var10;
      if (var8 >= 256) {
         Path var11 = this.throws_(var1);
         break_.warn("Saving oversized chunk {} ({} bytes} to external file {}", var1, var7, var11);
         var8 = 1;
         var9 = this.class_.class_(var8);
         var10 = this.class_(var11, var2);
         ByteBuffer var12 = this.break_();
         this.protected_.write(var12, (long)(var9 * 4096));
      } else {
         var9 = this.class_.class_(var8);
         var10 = () -> Files.deleteIfExists(this.throws_(var1));
         this.protected_.write(var2, (long)(var9 * 4096));
      }

      int var13 = (int)(rqR_2.protected_() / 1000L);
      this.private_.put(var3, this.class_(var9, var8));
      this.implements_.put(var3, var13);
      this.byte_();
      var10.run();
      if (var5 != 0) {
         this.class_.break_(var5, var6);
      }
   }

   public void class_() throws IOException {
      this.protected_.force(true);
   }

   public synchronized DataInputStream class_(rfj_3 var1) throws IOException {
      int var2 = this.case_(var1);
      if (var2 == 0) {
         return null;
      } else {
         int var3 = break_(var2);
         int var4 = class_(var2);
         int var5 = var4 * 4096;
         ByteBuffer var6 = ByteBuffer.allocate(var5);
         this.protected_.read(var6, (long)(var3 * 4096));
         ((Buffer)var6).flip();
         if (var6.remaining() < 5) {
            break_.error("Chunk {} header is truncated: expected {} but read {}", var1, var5, var6.remaining());
            return null;
         } else {
            int var7 = var6.getInt();
            byte var8 = var6.get();
            if (var7 == 0) {
               break_.warn("Chunk {} is allocated, but stream is missing", var1);
               return null;
            } else {
               int var9 = var7 - 1;
               if (class_(var8)) {
                  if (var9 != 0) {
                     break_.warn("Chunk has both internal and external streams");
                  }

                  return this.class_(var1, break_(var8));
               } else if (var9 > var6.remaining()) {
                  break_.error("Chunk {} stream is truncated: expected {} but read {}", var1, var9, var6.remaining());
                  return null;
               } else if (var9 < 0) {
                  break_.error("Declared size {} of chunk {} is negative", var7, var1);
                  return null;
               } else {
                  return this.class_(var1, var8, class_(var6, var9));
               }
            }
         }
      }
   }

   private roi_3 class_(Path var1, ByteBuffer var2) throws IOException {
      Path var3 = Files.createTempFile(this.throws_, "tmp", (String)null);

      try (FileChannel var4 = FileChannel.open(var3, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
         ((Buffer)var2).position(5);
         var4.write(var2);
      }

      return () -> Files.move(var3, var1, StandardCopyOption.REPLACE_EXISTING);
   }

   private static boolean class_(byte var0) {
      return (var0 & 128) != 0;
   }

   private static int class_(int var0) {
      return var0 & 0xFF;
   }

   private int class_(int var1, int var2) {
      return var1 << 8 | var2;
   }

   private DataInputStream class_(rfj_3 var1, byte var2) throws IOException {
      Path var3 = this.throws_(var1);
      if (!Files.isRegularFile(var3)) {
         break_.error("External chunk path {} is not file", var3);
         return null;
      } else {
         return this.class_(var1, var2, Files.newInputStream(var3));
      }
   }

   private static ByteArrayInputStream class_(ByteBuffer var0, int var1) {
      return new ByteArrayInputStream(var0.array(), var0.position(), var1);
   }

   private DataInputStream class_(rfj_3 var1, byte var2, InputStream var3) throws IOException {
      rKP var4 = rKP.class_(var2);
      if (var4 == null) {
         break_.error("Chunk {} has invalid chunk stream version {}", var1, var2);
         return null;
      } else {
         return new DataInputStream(new BufferedInputStream(var4.class_(var3)));
      }
   }

   @Override
   public void close() throws IOException {
      try {
         this.protected_();
      } finally {
         try {
            this.protected_.force(true);
         } finally {
            this.protected_.close();
         }
      }
   }

   private static byte break_(byte var0) {
      return (byte)(var0 & -129);
   }

   private static int break_(int var0) {
      return var0 >> 8 & 16777215;
   }

   public boolean break_(rfj_3 var1) {
      int var2 = this.case_(var1);
      if (var2 == 0) {
         return false;
      } else {
         int var3 = break_(var2);
         int var4 = class_(var2);
         ByteBuffer var5 = ByteBuffer.allocate(5);

         try {
            this.protected_.read(var5, (long)(var3 * 4096));
            ((Buffer)var5).flip();
            if (var5.remaining() != 5) {
               return false;
            } else {
               int var6 = var5.getInt();
               byte var7 = var5.get();
               if (class_(var7)) {
                  if (!rKP.break_(break_(var7))) {
                     return false;
                  }

                  if (!Files.isRegularFile(this.throws_(var1))) {
                     return false;
                  }
               } else {
                  if (!rKP.break_(var7)) {
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

   private ByteBuffer break_() {
      ByteBuffer var1 = ByteBuffer.allocate(5);
      var1.putInt(1);
      var1.put((byte)(this.case_.class_() | 128));
      ((Buffer)var1).flip();
      return var1;
   }

   private Path throws_(rfj_3 var1) {
      String var2 = "c." + var1.break_ + "." + var1.byte_ + ".mcc";
      return this.throws_.resolve(var2);
   }

   private static int catch_(rfj_3 var0) {
      return var0.private_() + var0.implements_() * 32;
   }

   private int case_(rfj_3 var1) {
      return this.private_.get(catch_(var1));
   }

   public boolean protected_(rfj_3 var1) {
      return this.case_(var1) != 0;
   }

   private void protected_() throws IOException {
      int var1 = (int)this.protected_.size();
      int var2 = byte_(var1) * 4096;
      if (var1 != var2) {
         ByteBuffer var3 = byte_.duplicate();
         ((Buffer)var3).position(0);
         this.protected_.write(var3, (long)(var2 - 1));
      }
   }
}
