package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class fo_3 {
   private static final Logger class_ = LogManager.getLogger();

   public static int class_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (rqu_3.byte_) {
         int[] var0 = new int[ThreadLocalRandom.current().nextInt(15) + 1];
         MT.class_(var0);
         int var1 = MT.default_();
         MT.break_(var0);
         return var1;
      } else {
         return MT.default_();
      }
   }

   public static void class_(fu_3 var0, int var1, int var2, int var3, int var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      break_(var1);
      if (var2 >= 0) {
         MT.break_(3553, 33085, var2);
         MT.break_(3553, 33082, 0);
         MT.break_(3553, 33083, var2);
         MT.class_(3553, 34049, 0.0F);
      }

      for (int var5 = 0; var5 <= var2; var5++) {
         MT.class_(3553, var5, var0.class_(), var3 >> var5, var4 >> var5, 0, 6408, 5121, (IntBuffer)null);
      }
   }

   public static ByteBuffer class_(InputStream var0) throws IOException {
      ByteBuffer var1;
      if (var0 instanceof FileInputStream var2) {
         FileChannel var3 = var2.getChannel();
         var1 = MemoryUtil.memAlloc((int)var3.size() + 1);

         while (var3.read(var1) != -1) {
         }
      } else {
         var1 = MemoryUtil.memAlloc(8192);
         ReadableByteChannel var4 = Channels.newChannel(var0);

         while (var4.read(var1) != -1) {
            if (var1.remaining() == 0) {
               var1 = MemoryUtil.memRealloc(var1, var1.capacity() * 2);
            }
         }
      }

      return var1;
   }

   public static void class_(IntBuffer var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GL11.glPixelStorei(3312, 0);
      GL11.glPixelStorei(3313, 0);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3315, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3317, 4);
      GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 32993, 33639, var0);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10241, 9729);
   }

   public static void class_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      MT.continue_(var0);
   }

   public static void class_(int var0, int var1, int var2) {
      class_(fu_3.RGBA, var0, 0, var1, var2);
   }

   public static void class_(fu_3 var0, int var1, int var2, int var3) {
      class_(var0, var1, 0, var2, var3);
   }

   public static void class_(int var0, int var1, int var2, int var3) {
      class_(fu_3.RGBA, var0, var1, var2, var3);
   }

   private static void break_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      MT.super_(var0);
   }

   public static String break_(InputStream var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      ByteBuffer var1 = null;

      try {
         var1 = class_(var0);
         int var2 = var1.position();
         ((Buffer)var1).rewind();
         return MemoryUtil.memASCII(var1, var2);
      } catch (IOException var7) {
      } finally {
         if (var1 != null) {
            MemoryUtil.memFree(var1);
         }
      }

      return null;
   }
}
