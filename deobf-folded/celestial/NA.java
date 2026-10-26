package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisAlloc;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class NA implements Nz_1 {
   private long id_class;
   private final AudioFormat id_break;
   private final InputStream id_byte;
   private ByteBuffer id_protected = MemoryUtil.memAlloc(8192);

   private boolean id_byte() throws IOException {
      int var1 = this.id_protected.limit();
      int var2 = this.id_protected.capacity() - var1;
      if (var2 == 0) {
         return true;
      } else {
         byte[] var3 = new byte[var2];
         int var4 = this.id_byte.read(var3);
         if (var4 == -1) {
            return false;
         } else {
            int var5 = this.id_protected.position();
            ((Buffer)this.id_protected).limit(var1 + var4);
            ((Buffer)this.id_protected).position(var1);
            this.id_protected.put(var3, 0, var4);
            ((Buffer)this.id_protected).position(var5);
            return true;
         }
      }
   }

   public NA(InputStream var1) throws IOException {
      this.id_byte = var1;
      ((Buffer)this.id_protected).limit(0);
      MemoryStack var2 = MemoryStack.stackPush();

      try {
         IntBuffer var3 = var2.mallocInt(1);
         IntBuffer var4 = var2.mallocInt(1);

         while (this.id_class == 0L) {
            if (!this.id_byte()) {
               throw new IOException("Failed to find Ogg header");
            }

            int var5 = this.id_protected.position();
            ((Buffer)this.id_protected).position(0);
            this.id_class = STBVorbis.stb_vorbis_open_pushdata(this.id_protected, var3, var4, (STBVorbisAlloc)null);
            ((Buffer)this.id_protected).position(var5);
            int var6 = var4.get(0);
            if (var6 == 1) {
               this.id_protected();
            } else if (var6 != 0) {
               throw new IOException("Failed to read Ogg file " + var6);
            }
         }

         ((Buffer)this.id_protected).position(this.id_protected.position() + var3.get(0));
         STBVorbisInfo var9 = STBVorbisInfo.mallocStack(var2);
         STBVorbis.stb_vorbis_get_info(this.id_class, var9);
         this.id_break = new AudioFormat((float)var9.sample_rate(), 16, var9.channels(), true, false);
      } catch (Throwable var8) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   @Override
   public AudioFormat id_class() {
      return this.id_break;
   }

   private void id_class(FloatBuffer var1, FloatBuffer var2, Nn_1 var3) {
      while (var1.hasRemaining() && var2.hasRemaining()) {
         var3.id_class(var1.get());
         var3.id_class(var2.get());
      }
   }

   @Override
   public ByteBuffer id_class(int var1) throws IOException {
      Nn_1 var2 = new Nn_1(var1 + 8192);

      while (this.id_class(var2) && var2.id_byte < var1) {
      }

      return var2.id_class();
   }

   private boolean id_class(Nn_1 var1) throws IOException {
      if (this.id_class == 0L) {
         return false;
      } else {
         MemoryStack var2 = MemoryStack.stackPush();

         int var14;
         label79: {
            boolean var15;
            label80: {
               try {
                  PointerBuffer var3 = var2.mallocPointer(1);
                  IntBuffer var4 = var2.mallocInt(1);
                  IntBuffer var5 = var2.mallocInt(1);

                  while (true) {
                     int var6 = STBVorbis.stb_vorbis_decode_frame_pushdata(this.id_class, this.id_protected, var4, var3, var5);
                     ((Buffer)this.id_protected).position(this.id_protected.position() + var6);
                     int var7 = STBVorbis.stb_vorbis_get_error(this.id_class);
                     if (var7 == 1) {
                        this.id_protected();
                        if (!this.id_byte()) {
                           var14 = 0;
                           break label79;
                        }
                     } else {
                        if (var7 != 0) {
                           throw new IOException("Failed to read Ogg file " + var7);
                        }

                        var14 = var5.get(0);
                        if (var14 != 0) {
                           int var9 = var4.get(0);
                           PointerBuffer var10 = var3.getPointerBuffer(var9);
                           if (var9 != 1) {
                              if (var9 == 2) {
                                 this.id_class(var10.getFloatBuffer(0, var14), var10.getFloatBuffer(1, var14), var1);
                                 var15 = true;
                                 break label80;
                              }

                              throw new IllegalStateException("Invalid number of channels: " + var9);
                           }

                           this.id_class(var10.getFloatBuffer(0, var14), var1);
                           var15 = true;
                           break;
                        }
                     }
                  }
               } catch (Throwable var13) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var12) {
                        var13.addSuppressed(var12);
                     }
                  }

                  throw var13;
               }

               if (var2 != null) {
                  var2.close();
               }

               return var15;
            }

            if (var2 != null) {
               var2.close();
            }

            return var15;
         }

         if (var2 != null) {
            var2.close();
         }

         return (boolean)var14;
      }
   }

   private void id_class(FloatBuffer var1, Nn_1 var2) {
      while (var1.hasRemaining()) {
         var2.id_class(var1.get());
      }
   }

   @Override
   public void close() throws IOException {
      if (this.id_class != 0L) {
         STBVorbis.stb_vorbis_close(this.id_class);
         this.id_class = 0L;
      }

      MemoryUtil.memFree(this.id_protected);
      this.id_byte.close();
   }

   public ByteBuffer id_break() throws IOException {
      Nn_1 var1 = new Nn_1(16384);

      while (this.id_class(var1)) {
      }

      return var1.id_class();
   }

   private void id_protected() {
      boolean var1 = this.id_protected.position() == 0;
      boolean var2 = this.id_protected.position() == this.id_protected.limit();
      if (var2 && !var1) {
         ((Buffer)this.id_protected).position(0);
         ((Buffer)this.id_protected).limit(0);
      } else {
         ByteBuffer var3 = MemoryUtil.memAlloc(var1 ? 2 * this.id_protected.capacity() : this.id_protected.capacity());
         var3.put(this.id_protected);
         MemoryUtil.memFree(this.id_protected);
         ((Buffer)var3).flip();
         this.id_protected = var3;
      }
   }
}
