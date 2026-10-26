package celestial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import org.lwjgl.stb.STBIEOFCallback;
import org.lwjgl.stb.STBIIOCallbacks;
import org.lwjgl.stb.STBIReadCallback;
import org.lwjgl.stb.STBISkipCallback;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

public class fF_2 {
   public final int class_;
   public final int break_;
   private static final Object byte_ = new Object();

   public fF_2(String var1, InputStream var2) throws IOException {
      synchronized (byte_) {
         MemoryStack var4 = MemoryStack.stackPush();

         try (fL_2 var5 = class_(var2)) {
            STBIReadCallback var6 = STBIReadCallback.create(var5::class_);

            try {
               STBISkipCallback var7 = STBISkipCallback.create(var5::class_);

               try {
                  STBIEOFCallback var8 = STBIEOFCallback.create(var5::class_);

                  try {
                     STBIIOCallbacks var9 = STBIIOCallbacks.mallocStack(var4);
                     var9.read(var6);
                     var9.skip(var7);
                     var9.eof(var8);
                     IntBuffer var10 = var4.mallocInt(1);
                     IntBuffer var11 = var4.mallocInt(1);
                     IntBuffer var12 = var4.mallocInt(1);
                     if (!STBImage.stbi_info_from_callbacks(var9, 0L, var10, var11, var12)) {
                        throw new IOException("Could not read info from the PNG file " + var1 + " " + STBImage.stbi_failure_reason());
                     }

                     this.class_ = var10.get(0);
                     this.break_ = var11.get(0);
                  } catch (Throwable var19) {
                     if (var8 != null) {
                        try {
                           var8.close();
                        } catch (Throwable var18) {
                           var19.addSuppressed(var18);
                        }
                     }

                     throw var19;
                  }

                  if (var8 != null) {
                     var8.close();
                  }
               } catch (Throwable var20) {
                  if (var7 != null) {
                     try {
                        var7.close();
                     } catch (Throwable var17) {
                        var20.addSuppressed(var17);
                     }
                  }

                  throw var20;
               }

               if (var7 != null) {
                  var7.close();
               }
            } catch (Throwable var21) {
               if (var6 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var16) {
                     var21.addSuppressed(var16);
                  }
               }

               throw var21;
            }

            if (var6 != null) {
               var6.close();
            }
         } catch (Throwable var23) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var14) {
                  var23.addSuppressed(var14);
               }
            }

            throw var23;
         }

         if (var4 != null) {
            var4.close();
         }
      }
   }

   @Override
   public String toString() {
      return this.class_ + " x " + this.break_;
   }

   private static fL_2 class_(InputStream var0) {
      return (fL_2)(var0 instanceof FileInputStream ? new fn_3(((FileInputStream)var0).getChannel()) : new fA_2(Channels.newChannel(var0)));
   }
}
