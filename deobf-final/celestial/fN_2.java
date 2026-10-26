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
   private static final Logger class_ = LogManager.getLogger();
   private static final Set<StandardOpenOption> break_ = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   private final fc_3 byte_;
   private final int protected_;
   private final int throws_;
   private final boolean case_;
   private long catch_;
   private final long private_;

   public static int byte_(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public fc_3 byte_() {
      return this.byte_;
   }

   public fN_2(int var1, int var2, boolean var3) {
      this(fc_3.RGBA, var1, var2, var3);
   }

   private fN_2(fc_3 var1, int var2, int var3, boolean var4, long var5) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
      this.private_ = (long)(var2 * var3 * var1.class_());
   }

   public fN_2(fc_3 var1, int var2, int var3, boolean var4) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.private_ = (long)var2 * (long)var3 * (long)var1.class_();
      this.case_ = false;
      if (var4) {
         this.catch_ = MemoryUtil.nmemCalloc(1L, this.private_);
      } else {
         this.catch_ = MemoryUtil.nmemAlloc(this.private_);
      }

      this.finally_();
      rrWe_1.class_(this);
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.byte_ + " " + this.protected_ + "x" + this.throws_ + "@" + this.catch_ + (this.case_ ? "S" : "N") + "]";
   }

   public void class_(Path var1) throws IOException {
      if (!this.byte_.implements_()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.byte_);
      } else {
         this.finally_();

         try (SeekableByteChannel var2 = Files.newByteChannel(var1, break_)) {
            if (!this.class_(var2)) {
               throw new IOException("Could not write image to the PNG file \"" + var1.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
         }
      }
   }

   public void class_(int var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.finally_();
      this.byte_.break_();
      MT.class_(3553, var1, this.byte_.protected_(), 5121, this.catch_);
      if (var2 && this.byte_.throws_()) {
         for (int var3 = 0; var3 < this.break_(); var3++) {
            for (int var4 = 0; var4 < this.class_(); var4++) {
               this.class_(var4, var3, this.class_(var4, var3) | 255 << this.byte_.case_());
            }
         }
      }
   }

   private boolean class_(WritableByteChannel var1) throws IOException {
      fm_3 var2 = new fm_3(var1);

      boolean var5;
      try {
         int var4 = Math.min(this.break_(), Integer.MAX_VALUE / this.class_() / this.byte_.class_());
         if (var4 < this.break_()) {
            class_.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.break_(), var4);
         }

         if (STBImageWrite.nstbi_write_png_to_func(var2.address(), 0L, this.class_(), var4, this.byte_.class_(), this.catch_, 0) != 0) {
            var2.class_();
            return true;
         }

         var5 = false;
      } finally {
         var2.free();
      }

      return var5;
   }

   public void class_(fN_2 var1) {
      if (var1.byte_() != this.byte_) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int var2 = this.byte_.class_();
         this.finally_();
         var1.finally_();
         if (this.protected_ == var1.protected_) {
            MemoryUtil.memCopy(var1.catch_, this.catch_, Math.min(this.private_, var1.private_));
         } else {
            int var3 = Math.min(this.class_(), var1.class_());
            int var4 = Math.min(this.break_(), var1.break_());

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = var5 * var1.class_() * var2;
               int var7 = var5 * this.class_() * var2;
               MemoryUtil.memCopy(var1.catch_ + (long)var6, this.catch_ + (long)var7, (long)var3 * (long)var2);
            }
         }
      }
   }

   public void class_(STBTTFontinfo var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var9 < 0 || var9 + var3 > this.class_() || var10 < 0 || var10 + var4 > this.break_()) {
         throw new IllegalArgumentException(
            String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", var9, var10, var3, var4, this.class_(), this.break_())
         );
      } else if (this.byte_.class_() != 1) {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      } else {
         STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(
            var1.address(), this.catch_ + (long)var9 + (long)(var10 * this.class_()), var3, var4, this.class_(), var5, var6, var7, var8, var2
         );
      }
   }

   public void class_(File var1) throws IOException {
      this.class_(var1.toPath());
   }

   public static fN_2 class_(fc_3 var0, InputStream var1) throws IOException {
      ByteBuffer var2 = null;

      fN_2 var3;
      try {
         var2 = fo_3.class_(var1);
         ((Buffer)var2).rewind();
         var3 = class_(var0, var2);
      } finally {
         MemoryUtil.memFree(var2);
         IOUtils.closeQuietly(var1);
      }

      return var3;
   }

   public static fN_2 class_(String var0) throws IOException {
      byte[] var1 = Base64.getDecoder().decode(var0.replaceAll("\n", "").getBytes(Charsets.UTF_8));
      MemoryStack var3 = MemoryStack.stackPush();

      fN_2 var2;
      try {
         ByteBuffer var4 = var3.malloc(var1.length);
         var4.put(var1);
         ((Buffer)var4).rewind();
         var2 = class_(var4);
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

   public static int class_(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static fN_2 class_(InputStream var0) throws IOException {
      return class_(fc_3.RGBA, var0);
   }

   public static int class_(int var0, int var1, int var2, int var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | (var3 & 0xFF) << 0;
   }

   public void class_(int var1, int var2, int var3, int var4, fN_2 var5) {
      this.finally_();
      if (var5.byte_() != this.byte_) {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      } else {
         int var6 = this.byte_.class_();
         STBImageResize.nstbir_resize_uint8(
            this.catch_ + (long)((var1 + var2 * this.class_()) * var6), var3, var4, this.class_() * var6, var5.catch_, var5.class_(), var5.break_(), 0, var6
         );
      }
   }

   public void class_(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      for (int var9 = 0; var9 < var6; var9++) {
         for (int var10 = 0; var10 < var5; var10++) {
            int var11 = var7 ? var5 - 1 - var10 : var10;
            int var12 = var8 ? var6 - 1 - var9 : var9;
            int var13 = this.class_(var1 + var10, var2 + var9);
            this.class_(var1 + var3 + var11, var2 + var4 + var12, var13);
         }
      }
   }

   public void class_(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var2; var6 < var2 + var4; var6++) {
         for (int var7 = var1; var7 < var1 + var3; var7++) {
            this.class_(var7, var6, var5);
         }
      }
   }

   public void class_(int var1, int var2, int var3) {
      if (this.byte_ != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.byte_));
      } else if (var1 >= 0 && var2 >= 0 && var1 < this.protected_ && var2 < this.throws_) {
         this.finally_();
         long var4 = (long)((var1 + var2 * this.protected_) * 4);
         MemoryUtil.memPutInt(this.catch_ + var4, var3);
      } else {
         throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.protected_, this.throws_));
      }
   }

   public int class_(int var1, int var2) {
      if (this.byte_ != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.byte_));
      } else if (var1 >= 0 && var2 >= 0 && var1 < this.protected_ && var2 < this.throws_) {
         this.finally_();
         long var3 = (long)((var1 + var2 * this.protected_) * 4);
         return MemoryUtil.memGetInt(this.catch_ + var3);
      } else {
         throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.protected_, this.throws_));
      }
   }

   public static void class_(boolean var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0) {
         MT.break_(3553, 10241, var1 ? 9987 : 9729);
         MT.break_(3553, 10240, 9729);
      } else {
         int var2 = rrbb_3.new_();
         MT.break_(3553, 10241, var1 ? var2 : 9728);
         MT.break_(3553, 10240, 9728);
      }
   }

   public int class_() {
      return this.protected_;
   }

   public static void class_(boolean var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var0) {
         MT.break_(3553, 10242, 33071);
         MT.break_(3553, 10243, 33071);
      } else {
         MT.break_(3553, 10242, 10497);
         MT.break_(3553, 10243, 10497);
      }
   }

   public static fN_2 class_(ByteBuffer var0) throws IOException {
      return class_(fc_3.RGBA, var0);
   }

   public void class_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.class_(var1, var2, var3, var4, var5, var6, var7, false, false, var8, var9);
   }

   public void class_(int var1, int var2, int var3, boolean var4) {
      this.class_(var1, var2, var3, 0, 0, this.protected_, this.throws_, false, var4);
   }

   public static fN_2 class_(fc_3 var0, ByteBuffer var1) throws IOException {
      if (var0 != null && !var0.implements_()) {
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

            var2 = new fN_2(var0 == null ? fc_3.class_(var6.get(0)) : var0, var4.get(0), var5.get(0), true, MemoryUtil.memAddress(var7));
            rrWe_1.class_(var2);
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

   public void class_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.break_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11));
      } else {
         this.break_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   @Override
   public void close() {
      if (this.catch_ != 0L) {
         if (this.case_) {
            STBImage.nstbi_image_free(this.catch_);
         } else {
            MemoryUtil.nmemFree(this.catch_);
         }

         rrWe_1.break_(this);
      }

      this.catch_ = 0L;
   }

   public static int break_(int var0) {
      return var0 >> 0 & 0xFF;
   }

   private void break_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.finally_();
      class_(var8, var10);
      class_(var9);
      if (var6 == this.class_()) {
         MT.final_(3314, 0);
      } else {
         MT.final_(3314, this.class_());
      }

      MT.final_(3316, var4);
      MT.final_(3315, var5);
      this.byte_.byte_();
      MT.class_(3553, var1, var2, var3, var6, var7, this.byte_.protected_(), 5121, this.catch_);
      if (var11) {
         this.close();
      }
   }

   public int break_() {
      return this.throws_;
   }

   public byte break_(int var1, int var2) {
      if (!this.byte_.catch_()) {
         throw new IllegalArgumentException(String.format("no luminance or alpha in %s", this.byte_));
      } else if (var1 >= 0 && var2 >= 0 && var1 < this.protected_ && var2 < this.throws_) {
         int var3 = (var1 + var2 * this.protected_) * this.byte_.class_() + this.byte_.private_() / 8;
         return MemoryUtil.memGetByte(this.catch_ + (long)var3);
      } else {
         throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.protected_, this.throws_));
      }
   }

   public void break_(boolean var1) {
      this.finally_();
      this.byte_.break_();
      if (var1) {
         MT.break_(3357, Float.MAX_VALUE);
      }

      MT.class_(0, 0, this.protected_, this.throws_, this.byte_.protected_(), 5121, this.catch_);
      if (var1) {
         MT.break_(3357, 0.0F);
      }
   }

   public void throws_(int var1) {
      if (this.byte_ != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.byte_));
      } else {
         this.finally_();
         MemoryUtil.memSet(this.catch_, var1, this.private_);
      }
   }

   public byte[] throws_() throws IOException {
      byte[] var1;
      try (
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         WritableByteChannel var3 = Channels.newChannel(var2);
      ) {
         if (!this.class_(var3)) {
            throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
         }

         var1 = var2.toByteArray();
      }

      return var1;
   }

   private void finally_() {
      if (this.catch_ == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   public void catch_() {
      gs_3.class_(this.catch_);
   }

   public void case_() {
      this.finally_();
      MemoryStack var1 = MemoryStack.stackPush();

      try {
         int var2 = this.byte_.class_();
         int var3 = this.class_() * var2;
         long var4 = var1.nmalloc(var3);

         for (int var6 = 0; var6 < this.break_() / 2; var6++) {
            int var7 = var6 * this.class_() * var2;
            int var8 = (this.break_() - 1 - var6) * this.class_() * var2;
            MemoryUtil.memCopy(this.catch_ + (long)var7, var4, (long)var3);
            MemoryUtil.memCopy(this.catch_ + (long)var8, this.catch_ + (long)var7, (long)var3);
            MemoryUtil.memCopy(var4, this.catch_ + (long)var8, (long)var3);
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

   public long implements_() {
      return this.private_;
   }

   @Deprecated
   public int[] protected_() {
      if (this.byte_ != fc_3.RGBA) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.finally_();
         int[] var1 = new int[this.class_() * this.break_()];

         for (int var2 = 0; var2 < this.break_(); var2++) {
            for (int var3 = 0; var3 < this.class_(); var3++) {
               int var4 = this.class_(var3, var2);
               int var5 = class_(var4);
               int var6 = protected_(var4);
               int var7 = byte_(var4);
               int var8 = break_(var4);
               int var9 = var5 << 24 | var8 << 16 | var7 << 8 | var6;
               var1[var3 + var2 * this.class_()] = var9;
            }
         }

         return var1;
      }
   }

   public static int protected_(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public IntBuffer private_() {
      if (this.byte_ != fc_3.RGBA) {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.byte_));
      } else {
         this.finally_();
         return MemoryUtil.memIntBuffer(this.catch_, (int)this.private_);
      }
   }
}
