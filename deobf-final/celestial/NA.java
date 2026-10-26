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
   private long class_;
   private final AudioFormat break_;
   private final InputStream byte_;
   private ByteBuffer protected_ = MemoryUtil.memAlloc(8192);

   private boolean byte_() throws IOException {
      int var1 = this.protected_.limit();
      int var2 = this.protected_.capacity() - var1;
      if (var2 == 0) {
         return true;
      } else {
         byte[] var3 = new byte[var2];
         int var4 = this.byte_.read(var3);
         if (var4 == -1) {
            return false;
         } else {
            int var5 = this.protected_.position();
            ((Buffer)this.protected_).limit(var1 + var4);
            ((Buffer)this.protected_).position(var1);
            this.protected_.put(var3, 0, var4);
            ((Buffer)this.protected_).position(var5);
            return true;
         }
      }
   }

   public NA(InputStream var1) throws IOException {
      this.byte_ = var1;
      ((Buffer)this.protected_).limit(0);
      MemoryStack var2 = MemoryStack.stackPush();

      try {
         IntBuffer var3 = var2.mallocInt(1);
         IntBuffer var4 = var2.mallocInt(1);

         while (this.class_ == 0L) {
            if (!this.byte_()) {
               throw new IOException("Failed to find Ogg header");
            }

            int var5 = this.protected_.position();
            ((Buffer)this.protected_).position(0);
            this.class_ = STBVorbis.stb_vorbis_open_pushdata(this.protected_, var3, var4, (STBVorbisAlloc)null);
            ((Buffer)this.protected_).position(var5);
            int var6 = var4.get(0);
            if (var6 == 1) {
               this.protected_();
            } else if (var6 != 0) {
               throw new IOException("Failed to read Ogg file " + var6);
            }
         }

         ((Buffer)this.protected_).position(this.protected_.position() + var3.get(0));
         STBVorbisInfo var9 = STBVorbisInfo.mallocStack(var2);
         STBVorbis.stb_vorbis_get_info(this.class_, var9);
         this.break_ = new AudioFormat((float)var9.sample_rate(), 16, var9.channels(), true, false);
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
   public AudioFormat class_() {
      return this.break_;
   }

   private void class_(FloatBuffer var1, FloatBuffer var2, Nn_1 var3) {
      while (var1.hasRemaining() && var2.hasRemaining()) {
         var3.class_(var1.get());
         var3.class_(var2.get());
      }
   }

   @Override
   public ByteBuffer class_(int var1) throws IOException {
      Nn_1 var2 = new Nn_1(var1 + 8192);

      while (this.class_(var2) && var2.byte_ < var1) {
      }

      return var2.class_();
   }

   private boolean class_(Nn_1 var1) throws IOException {
      if (this.class_ == 0L) {
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
                     int var6 = STBVorbis.stb_vorbis_decode_frame_pushdata(this.class_, this.protected_, var4, var3, var5);
                     ((Buffer)this.protected_).position(this.protected_.position() + var6);
                     int var7 = STBVorbis.stb_vorbis_get_error(this.class_);
                     if (var7 == 1) {
                        this.protected_();
                        if (!this.byte_()) {
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
                                 this.class_(var10.getFloatBuffer(0, var14), var10.getFloatBuffer(1, var14), var1);
                                 var15 = true;
                                 break label80;
                              }

                              throw new IllegalStateException("Invalid number of channels: " + var9);
                           }

                           this.class_(var10.getFloatBuffer(0, var14), var1);
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

   private void class_(FloatBuffer var1, Nn_1 var2) {
      while (var1.hasRemaining()) {
         var2.class_(var1.get());
      }
   }

   @Override
   public void close() throws IOException {
      if (this.class_ != 0L) {
         STBVorbis.stb_vorbis_close(this.class_);
         this.class_ = 0L;
      }

      MemoryUtil.memFree(this.protected_);
      this.byte_.close();
   }

   public ByteBuffer break_() throws IOException {
      Nn_1 var1 = new Nn_1(16384);

      while (this.class_(var1)) {
      }

      return var1.class_();
   }

   private void protected_() {
      boolean var1 = this.protected_.position() == 0;
      boolean var2 = this.protected_.position() == this.protected_.limit();
      if (var2 && !var1) {
         ((Buffer)this.protected_).position(0);
         ((Buffer)this.protected_).limit(0);
      } else {
         ByteBuffer var3 = MemoryUtil.memAlloc(var1 ? 2 * this.protected_.capacity() : this.protected_.capacity());
         var3.put(this.protected_);
         MemoryUtil.memFree(this.protected_);
         ((Buffer)var3).flip();
         this.protected_ = var3;
      }
   }
}
