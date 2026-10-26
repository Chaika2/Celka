package celestial;

import com.google.common.base.Charsets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Base64;
import java.util.EnumSet;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public final class fN_2 implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private static final Set<StandardOpenOption> id_break = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   private final fc_3 id_byte;
   private final int id_protected;
   private final int id_throws;
   private final boolean id_case;
   private long id_catch;
   private final long id_private;

   public static int id_byte(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public fc_3 id_byte() {
      return this.id_byte;
   }

   public fN_2(int var1, int var2, boolean var3) {
      this(fc_3.RGBA, var1, var2, var3);
   }

   private fN_2(fc_3 var1, int var2, int var3, boolean var4, long var5) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_private = (long)(var2 * var3 * var1.id_class());
   }

   public fN_2(fc_3 var1, int var2, int var3, boolean var4) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_private = (long)var2 * (long)var3 * (long)var1.id_class();
      this.id_case = false;
      if (var4) {
         this.id_catch = MemoryUtil.nmemCalloc(1L, this.id_private);
      } else {
         this.id_catch = MemoryUtil.nmemAlloc(this.id_private);
      }

      this.id_finally();
      rrWe_1.id_class(this);
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.id_byte + " " + this.id_protected + "x" + this.id_throws + "@" + this.id_catch + (this.id_case ? "S" : "N") + "]";
   }

   public void id_class(Path var1) throws IOException {
      if (!this.id_byte.id_implements()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.id_byte);
      } else {
         this.id_finally();

         try (SeekableByteChannel var2 = Files.newByteChannel(var1, id_break)) {
            if (!this.id_class(var2)) {
               throw new IOException("Could not write image to the PNG file \"" + var1.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
         }
      }
   }

   public void id_class(int var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.id_finally();
      this.id_byte.id_break();
      MT.id_class(3553, var1, this.id_byte.id_protected(), 5121, this.id_catch);
      if (var2 && this.id_byte.id_throws()) {
         for (int var3 = 0; var3 < this.id_break(); var3++) {
            for (int var4 = 0; var4 < this.id_class(); var4++) {
               this.id_class(var4, var3, this.id_class(var4, var3) | 255 << this.id_byte.id_case());
            }
         }
      }
   }

   private boolean id_class(WritableByteChannel var1) throws IOException {
      fm_3 var2 = new fm_3(var1);

      boolean var5;
      try {
         int var4 = Math.min(this.id_break(), Integer.MAX_VALUE / this.id_class() / this.id_byte.id_class());
         if (var4 < this.id_break()) {
            id_class.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.id_break(), var4);
         }

         if (STBImageWrite.nstbi_write_png_to_func(var2.address(), 0L, this.id_class(), var4, this.id_byte.id_class(), this.id_catch, 0) != 0) {
            var2.id_class();
            return true;
         }

         var5 = false;
      } finally {
         var2.free();
      }

      return var5;
   }

   public void id_class(fN_2 var1) {
      if (var1.id_byte() != this.id_byte) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int var2 = this.id_byte.id_class();
         this.id_finally();
         var1.id_finally();
         if (this.id_protected == var1.id_protected) {
            MemoryUtil.memCopy(var1.id_catch, this.id_catch, Math.min(this.id_private, var1.id_private));
         } else {
            int var3 = Math.min(this.id_class(), var1.id_class());
            int var4 = Math.min(this.id_break(), var1.id_break());

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = var5 * var1.id_class() * var2;
               int var7 = var5 * this.id_class() * var2;
               MemoryUtil.memCopy(var1.id_catch + (long)var6, this.id_catch + (long)var7, (long)var3 * (long)var2);
            }
         }
      }
   }

   public void id_class(STBTTFontinfo var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var9 < 0 || var9 + var3 > this.id_class() || var10 < 0 || var10 + var4 > this.id_break()) {
         throw new IllegalArgumentException(
            String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", var9, var10, var3, var4, this.id_class(), this.id_break())
         );
      } else if (this.id_byte.id_class() != 1) {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      } else {
         STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(
            var1.address(), this.id_catch + (long)var9 + (long)(var10 * this.id_class()), var3, var4, this.id_class(), var5, var6, var7, var8, var2
         );
      }
   }

   public void id_class(File var1) throws IOException {
      this.id_class(var1.toPath());
   }

   public static fN_2 id_class(fc_3 var0, InputStream var1) throws IOException {
      ByteBuffer var2 = null;

      fN_2 var3;
      try {
         var2 = fo_3.id_class(var1);
         ((Buffer)var2).rewind();
         var3 = id_class(var0, var2);
      } finally {
         MemoryUtil.memFree(var2);
         IOUtils.closeQuietly(var1);
      }

      return var3;
   }

   public static fN_2 id_class(String var0) throws IOException {
      byte[] var1 = Base64.getDecoder().decode(var0.replaceAll("\n", "").getBytes(Charsets.UTF_8));
      MemoryStack var3 = MemoryStack.stackPush();

      fN_2 var2;
      try {
         ByteBuffer var4 = var3.malloc(var1.length);
         var4.put(var1);
         ((Buffer)var4).rewind();
         var2 = id_class(var4);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }

      return var2;
   }

   public static int id_class(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static fN_2 id_class(InputStream var0) throws IOException {
      return id_class(fc_3.RGBA, var0);
   }

   public static int id_class(int var0, int var1, int var2, int var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | (var3 & 0xFF) << 0;
   }

   public void id_class(int var1, int var2, int var3, int var4, fN_2 var5) {
      this.id_finally();
      if (var5.id_byte() != this.id_byte) {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      } else {
         int var6 = this.id_byte.id_class();
         STBImageResize.nstbir_resize_uint8(
            this.id_catch + (long)((var1 + var2 * this.id_class()) * var6),
            var3,
            var4,
            this.id_class() * var6,
            var5.id_catch,
            var5.id_class(),
            var5.id_break(),
            0,
            var6
         );
      }
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      for (int var9 = 0; var9 < var6; var9++) {
         for (int var10 = 0; var10 < var5; var10++) {
            int var11 = var7 ? var5 - 1 - var10 : var10;
            int var12 = var8 ? var6 - 1 - var9 : var9;
            int var13 = this.id_class(var1 + var10, var2 + var9);
            this.id_class(var1 + var3 + var11, var2 + var4 + var12, var13);
         }
      }
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var2; var6 < var2 + var4; var6++) {
         for (int var7 = var1; var7 < var1 + var3; var7++) {
            this.id_class(var7, var6, var5);
         }
      }
   }

   public void id_class(int var1, int var2, int var3) {
      if (this.id_byte != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.id_byte));
      } else if (var1 >= 0 && var2 >= 0 && var1 < this.id_protected && var2 < this.id_throws) {
         this.id_finally();
         long var4 = (long)((var1 + var2 * this.id_protected) * 4);
         MemoryUtil.memPutInt(this.id_catch + var4, var3);
      } else {
         throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.id_protected, this.id_throws));
      }
   }

   public int id_class(int var1, int var2) {
      if (this.id_byte != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.id_byte));
      } else if (var1 >= 0 && var2 >= 0 && var1 < this.id_protected && var2 < this.id_throws) {
         this.id_finally();
         long var3 = (long)((var1 + var2 * this.id_protected) * 4);
         return MemoryUtil.memGetInt(this.id_catch + var3);
      } else {
         throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.id_protected, this.id_throws));
      }
   }

   public static void id_class(boolean var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0) {
         MT.id_break(3553, 10241, var1 ? 9987 : 9729);
         MT.id_break(3553, 10240, 9729);
      } else {
         int var2 = rrbb_3.id_new();
         MT.id_break(3553, 10241, var1 ? var2 : 9728);
         MT.id_break(3553, 10240, 9728);
      }
   }

   public int id_class() {
      return this.id_protected;
   }

   public static void id_class(boolean var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0) {
         MT.id_break(3553, 10242, 33071);
         MT.id_break(3553, 10243, 33071);
      } else {
         MT.id_break(3553, 10242, 10497);
         MT.id_break(3553, 10243, 10497);
      }
   }

   public static fN_2 id_class(ByteBuffer var0) throws IOException {
      return id_class(fc_3.RGBA, var0);
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.id_class(var1, var2, var3, var4, var5, var6, var7, false, false, var8, var9);
   }

   public void id_class(int var1, int var2, int var3, boolean var4) {
      this.id_class(var1, var2, var3, 0, 0, this.id_protected, this.id_throws, false, var4);
   }

   public static fN_2 id_class(fc_3 var0, ByteBuffer var1) throws IOException {
      if (var0 != null && !var0.id_implements()) {
         throw new UnsupportedOperationException("Don't know how to read format " + var0);
      } else if (MemoryUtil.memAddress(var1) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         MemoryStack var3 = MemoryStack.stackPush();

         fN_2 var2;
         try {
            IntBuffer var4 = var3.mallocInt(1);
            IntBuffer var5 = var3.mallocInt(1);
            IntBuffer var6 = var3.mallocInt(1);
            ByteBuffer var7 = STBImage.stbi_load_from_memory(var1, var4, var5, var6, var0 == null ? 0 : var0.pixelSize);
            if (var7 == null) {
               throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }

            var2 = new fN_2(var0 == null ? fc_3.id_class(var6.get(0)) : var0, var4.get(0), var5.get(0), true, MemoryUtil.memAddress(var7));
            rrWe_1.id_class(var2);
         } catch (Throwable var9) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if (var3 != null) {
            var3.close();
         }

         return var2;
      }
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.id_break(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11));
      } else {
         this.id_break(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   @Override
   public void close() {
      if (this.id_catch != 0L) {
         if (this.id_case) {
            STBImage.nstbi_image_free(this.id_catch);
         } else {
            MemoryUtil.nmemFree(this.id_catch);
         }

         rrWe_1.id_break(this);
      }

      this.id_catch = 0L;
   }

   public static int id_break(int var0) {
      return var0 >> 0 & 0xFF;
   }

   private void id_break(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.id_finally();
      id_class(var8, var10);
      id_class(var9);
      if (var6 == this.id_class()) {
         MT.id_final(3314, 0);
      } else {
         MT.id_final(3314, this.id_class());
      }

      MT.id_final(3316, var4);
      MT.id_final(3315, var5);
      this.id_byte.id_byte();
      MT.id_class(3553, var1, var2, var3, var6, var7, this.id_byte.id_protected(), 5121, this.id_catch);
      if (var11) {
         this.close();
      }
   }

   public int id_break() {
      return this.id_throws;
   }

   public byte id_break(int var1, int var2) {
      if (!this.id_byte.id_catch()) {
         throw new IllegalArgumentException(String.format("no luminance or alpha in %s", this.id_byte));
      } else if (var1 >= 0 && var2 >= 0 && var1 < this.id_protected && var2 < this.id_throws) {
         int var3 = (var1 + var2 * this.id_protected) * this.id_byte.id_class() + this.id_byte.id_private() / 8;
         return MemoryUtil.memGetByte(this.id_catch + (long)var3);
      } else {
         throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.id_protected, this.id_throws));
      }
   }

   public void id_break(boolean var1) {
      this.id_finally();
      this.id_byte.id_break();
      if (var1) {
         MT.id_break(3357, Float.MAX_VALUE);
      }

      MT.id_class(0, 0, this.id_protected, this.id_throws, this.id_byte.id_protected(), 5121, this.id_catch);
      if (var1) {
         MT.id_break(3357, 0.0F);
      }
   }

   public void id_throws(int var1) {
      if (this.id_byte != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.id_byte));
      } else {
         this.id_finally();
         MemoryUtil.memSet(this.id_catch, var1, this.id_private);
      }
   }

   public byte[] id_throws() throws IOException {
      byte[] var1;
      try (
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         WritableByteChannel var3 = Channels.newChannel(var2);
      ) {
         if (!this.id_class(var3)) {
            throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
         }

         var1 = var2.toByteArray();
      }

      return var1;
   }

   private void id_finally() {
      if (this.id_catch == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   public void id_catch() {
      gs_3.id_class(this.id_catch);
   }

   public void id_case() {
      this.id_finally();
      MemoryStack var1 = MemoryStack.stackPush();

      try {
         int var2 = this.id_byte.id_class();
         int var3 = this.id_class() * var2;
         long var4 = var1.nmalloc(var3);

         for (int var6 = 0; var6 < this.id_break() / 2; var6++) {
            int var7 = var6 * this.id_class() * var2;
            int var8 = (this.id_break() - 1 - var6) * this.id_class() * var2;
            MemoryUtil.memCopy(this.id_catch + (long)var7, var4, (long)var3);
            MemoryUtil.memCopy(this.id_catch + (long)var8, this.id_catch + (long)var7, (long)var3);
            MemoryUtil.memCopy(var4, this.id_catch + (long)var8, (long)var3);
         }
      } catch (Throwable var10) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var1 != null) {
         var1.close();
      }
   }

   public long id_implements() {
      return this.id_private;
   }

   @Deprecated
   public int[] id_protected() {
      if (this.id_byte != fc_3.RGBA) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.id_finally();
         int[] var1 = new int[this.id_class() * this.id_break()];

         for (int var2 = 0; var2 < this.id_break(); var2++) {
            for (int var3 = 0; var3 < this.id_class(); var3++) {
               int var4 = this.id_class(var3, var2);
               int var5 = id_class(var4);
               int var6 = id_protected(var4);
               int var7 = id_byte(var4);
               int var8 = id_break(var4);
               int var9 = var5 << 24 | var8 << 16 | var7 << 8 | var6;
               var1[var3 + var2 * this.id_class()] = var9;
            }
         }

         return var1;
      }
   }

   public static int id_protected(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public IntBuffer id_private() {
      if (this.id_byte != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.id_byte));
      } else {
         this.id_finally();
         return MemoryUtil.memIntBuffer(this.id_catch, (int)this.id_private);
      }
   }
}
