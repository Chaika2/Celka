/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.stb.STBImageResize
 *  org.lwjgl.stb.STBImageWrite
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.MT;
import celestial.fc_3;
import celestial.fm_3;
import celestial.fo_3;
import celestial.gs_3;
import celestial.rrWe_1;
import celestial.rrbb_3;
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
import java.nio.file.attribute.FileAttribute;
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

public final class fN_2
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private static final Set<StandardOpenOption> id_break = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    private final fc_3 id_byte;
    private final int id_protected;
    private final int id_throws;
    private final boolean id_case;
    private long id_catch;
    private final long id_private;

    public static int id_byte(int n) {
        return n >> 8 & 0xFF;
    }

    public fc_3 id_byte() {
        return this.id_byte;
    }

    public fN_2(int n, int n2, boolean bl) {
        this(fc_3.RGBA, n, n2, bl);
    }

    private fN_2(fc_3 fc_32, int n, int n2, boolean bl, long l) {
        this.id_byte = fc_32;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = bl;
        this.id_catch = l;
        this.id_private = n * n2 * fc_32.id_class();
    }

    public fN_2(fc_3 fc_32, int n, int n2, boolean bl) {
        this.id_byte = fc_32;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_private = (long)n * (long)n2 * (long)fc_32.id_class();
        this.id_case = false;
        this.id_catch = bl ? MemoryUtil.nmemCalloc((long)1L, (long)this.id_private) : MemoryUtil.nmemAlloc((long)this.id_private);
        this.id_finally();
        rrWe_1.id_class(this);
    }

    public String toString() {
        return "NativeImage[" + this.id_byte + " " + this.id_protected + "x" + this.id_throws + "@" + this.id_catch + (this.id_case ? "S" : "N") + "]";
    }

    public void id_class(Path path) throws IOException {
        if (!this.id_byte.id_implements()) {
            throw new UnsupportedOperationException("Don't know how to write format " + this.id_byte);
        }
        this.id_finally();
        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(path, id_break, new FileAttribute[0]);){
            if (!this.id_class(seekableByteChannel)) {
                throw new IOException("Could not write image to the PNG file \"" + path.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
        }
    }

    public void id_class(int n, boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        this.id_finally();
        this.id_byte.id_break();
        MT.id_class(3553, n, this.id_byte.id_protected(), 5121, this.id_catch);
        if (bl && this.id_byte.id_throws()) {
            for (int i = 0; i < this.id_break(); ++i) {
                for (int j = 0; j < this.id_class(); ++j) {
                    this.id_class(j, i, this.id_class(j, i) | 255 << this.id_byte.id_case());
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean id_class(WritableByteChannel writableByteChannel) throws IOException {
        boolean bl;
        fm_3 fm_32 = new fm_3(writableByteChannel);
        try {
            int n = Math.min(this.id_break(), Integer.MAX_VALUE / this.id_class() / this.id_byte.id_class());
            if (n < this.id_break()) {
                id_class.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", (Object)this.id_break(), (Object)n);
            }
            if (STBImageWrite.nstbi_write_png_to_func((long)fm_32.address(), (long)0L, (int)this.id_class(), (int)n, (int)this.id_byte.id_class(), (long)this.id_catch, (int)0) == 0) {
                boolean bl2 = false;
                return bl2;
            }
            fm_32.id_class();
            bl = true;
        }
        finally {
            fm_32.free();
        }
        return bl;
    }

    public void id_class(fN_2 fN_22) {
        if (fN_22.id_byte() != this.id_byte) {
            throw new UnsupportedOperationException("Image formats don't match.");
        }
        int n = this.id_byte.id_class();
        this.id_finally();
        fN_22.id_finally();
        if (this.id_protected == fN_22.id_protected) {
            MemoryUtil.memCopy((long)fN_22.id_catch, (long)this.id_catch, (long)Math.min(this.id_private, fN_22.id_private));
        } else {
            int n2 = Math.min(this.id_class(), fN_22.id_class());
            int n3 = Math.min(this.id_break(), fN_22.id_break());
            for (int i = 0; i < n3; ++i) {
                int n4 = i * fN_22.id_class() * n;
                int n5 = i * this.id_class() * n;
                MemoryUtil.memCopy((long)(fN_22.id_catch + (long)n4), (long)(this.id_catch + (long)n5), (long)((long)n2 * (long)n));
            }
        }
    }

    public void id_class(STBTTFontinfo sTBTTFontinfo, int n, int n2, int n3, float f, float f2, float f3, float f4, int n4, int n5) {
        if (n4 >= 0 && n4 + n2 <= this.id_class() && n5 >= 0 && n5 + n3 <= this.id_break()) {
            if (this.id_byte.id_class() != 1) {
                throw new IllegalArgumentException("Can only write fonts into 1-component images.");
            }
        } else {
            throw new IllegalArgumentException(String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", n4, n5, n2, n3, this.id_class(), this.id_break()));
        }
        STBTruetype.nstbtt_MakeGlyphBitmapSubpixel((long)sTBTTFontinfo.address(), (long)(this.id_catch + (long)n4 + (long)(n5 * this.id_class())), (int)n2, (int)n3, (int)this.id_class(), (float)f, (float)f2, (float)f3, (float)f4, (int)n);
    }

    public void id_class(File file) throws IOException {
        this.id_class(file.toPath());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static fN_2 id_class(fc_3 fc_32, InputStream inputStream) throws IOException {
        fN_2 fN_22;
        ByteBuffer byteBuffer = null;
        try {
            byteBuffer = fo_3.id_class(inputStream);
            ((Buffer)byteBuffer).rewind();
            fN_22 = fN_2.id_class(fc_32, byteBuffer);
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return fN_22;
    }

    public static fN_2 id_class(String string) throws IOException {
        fN_2 fN_22;
        byte[] byArray = Base64.getDecoder().decode(string.replaceAll("\n", "").getBytes(Charsets.UTF_8));
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(byArray.length);
            byteBuffer.put(byArray);
            ((Buffer)byteBuffer).rewind();
            fN_22 = fN_2.id_class(byteBuffer);
        }
        return fN_22;
    }

    public static int id_class(int n) {
        return n >> 24 & 0xFF;
    }

    public static fN_2 id_class(InputStream inputStream) throws IOException {
        return fN_2.id_class(fc_3.RGBA, inputStream);
    }

    public static int id_class(int n, int n2, int n3, int n4) {
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | (n4 & 0xFF) << 0;
    }

    public void id_class(int n, int n2, int n3, int n4, fN_2 fN_22) {
        this.id_finally();
        if (fN_22.id_byte() != this.id_byte) {
            throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
        }
        int n5 = this.id_byte.id_class();
        STBImageResize.nstbir_resize_uint8((long)(this.id_catch + (long)((n + n2 * this.id_class()) * n5)), (int)n3, (int)n4, (int)(this.id_class() * n5), (long)fN_22.id_catch, (int)fN_22.id_class(), (int)fN_22.id_break(), (int)0, (int)n5);
    }

    public void id_class(int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n5; ++j) {
                int n7 = bl ? n5 - 1 - j : j;
                int n8 = bl2 ? n6 - 1 - i : i;
                int n9 = this.id_class(n + j, n2 + i);
                this.id_class(n + n3 + n7, n2 + n4 + n8, n9);
            }
        }
    }

    public void id_class(int n, int n2, int n3, int n4, int n5) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n; j < n + n3; ++j) {
                this.id_class(j, i, n5);
            }
        }
    }

    public void id_class(int n, int n2, int n3) {
        if (this.id_byte != fc_3.RGBA) {
            throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", new Object[]{this.id_byte}));
        }
        if (n < 0 || n2 < 0 || n >= this.id_protected || n2 >= this.id_throws) {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", n, n2, this.id_protected, this.id_throws));
        }
        this.id_finally();
        long l = (n + n2 * this.id_protected) * 4;
        MemoryUtil.memPutInt((long)(this.id_catch + l), (int)n3);
    }

    public int id_class(int n, int n2) {
        if (this.id_byte != fc_3.RGBA) {
            throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", new Object[]{this.id_byte}));
        }
        if (n >= 0 && n2 >= 0 && n < this.id_protected && n2 < this.id_throws) {
            this.id_finally();
            long l = (n + n2 * this.id_protected) * 4;
            return MemoryUtil.memGetInt((long)(this.id_catch + l));
        }
        throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", n, n2, this.id_protected, this.id_throws));
    }

    public static void id_class(boolean bl, boolean bl2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (bl) {
            MT.id_break(3553, 10241, bl2 ? 9987 : 9729);
            MT.id_break(3553, 10240, 9729);
        } else {
            int n = rrbb_3.id_new();
            MT.id_break(3553, 10241, bl2 ? n : 9728);
            MT.id_break(3553, 10240, 9728);
        }
    }

    public int id_class() {
        return this.id_protected;
    }

    public static void id_class(boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (bl) {
            MT.id_break(3553, 10242, 33071);
            MT.id_break(3553, 10243, 33071);
        } else {
            MT.id_break(3553, 10242, 10497);
            MT.id_break(3553, 10243, 10497);
        }
    }

    public static fN_2 id_class(ByteBuffer byteBuffer) throws IOException {
        return fN_2.id_class(fc_3.RGBA, byteBuffer);
    }

    public void id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2) {
        this.id_class(n, n2, n3, n4, n5, n6, n7, false, false, bl, bl2);
    }

    public void id_class(int n, int n2, int n3, boolean bl) {
        this.id_class(n, n2, n3, 0, 0, this.id_protected, this.id_throws, false, bl);
    }

    public static fN_2 id_class(fc_3 fc_32, ByteBuffer byteBuffer) throws IOException {
        fN_2 fN_22;
        if (fc_32 != null && !fc_32.id_implements()) {
            throw new UnsupportedOperationException("Don't know how to read format " + fc_32);
        }
        if (MemoryUtil.memAddress((ByteBuffer)byteBuffer) == 0L) {
            throw new IllegalArgumentException("Invalid buffer");
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            IntBuffer intBuffer3 = memoryStack.mallocInt(1);
            ByteBuffer byteBuffer2 = STBImage.stbi_load_from_memory((ByteBuffer)byteBuffer, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3, (int)(fc_32 == null ? 0 : fc_32.pixelSize));
            if (byteBuffer2 == null) {
                throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }
            fN_22 = new fN_2(fc_32 == null ? fc_3.id_class(intBuffer3.get(0)) : fc_32, intBuffer.get(0), intBuffer2.get(0), true, MemoryUtil.memAddress((ByteBuffer)byteBuffer2));
            rrWe_1.id_class(fN_22);
        }
        return fN_22;
    }

    public void id_class(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (!RenderSystem.isOnRenderThreadOrInit()) {
            RenderSystem.recordRenderCall(() -> this.id_break(n, n2, n3, n4, n5, n6, n7, bl, bl2, bl3, bl4));
        } else {
            this.id_break(n, n2, n3, n4, n5, n6, n7, bl, bl2, bl3, bl4);
        }
    }

    @Override
    public void close() {
        if (this.id_catch != 0L) {
            if (this.id_case) {
                STBImage.nstbi_image_free((long)this.id_catch);
            } else {
                MemoryUtil.nmemFree((long)this.id_catch);
            }
            rrWe_1.id_break(this);
        }
        this.id_catch = 0L;
    }

    public static int id_break(int n) {
        return n >> 0 & 0xFF;
    }

    private void id_break(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        this.id_finally();
        fN_2.id_class(bl, bl3);
        fN_2.id_class(bl2);
        if (n6 == this.id_class()) {
            MT.id_final(3314, 0);
        } else {
            MT.id_final(3314, this.id_class());
        }
        MT.id_final(3316, n4);
        MT.id_final(3315, n5);
        this.id_byte.id_byte();
        MT.id_class(3553, n, n2, n3, n6, n7, this.id_byte.id_protected(), 5121, this.id_catch);
        if (bl4) {
            this.close();
        }
    }

    public int id_break() {
        return this.id_throws;
    }

    public byte id_break(int n, int n2) {
        if (!this.id_byte.id_catch()) {
            throw new IllegalArgumentException(String.format("no luminance or alpha in %s", new Object[]{this.id_byte}));
        }
        if (n >= 0 && n2 >= 0 && n < this.id_protected && n2 < this.id_throws) {
            int n3 = (n + n2 * this.id_protected) * this.id_byte.id_class() + this.id_byte.id_private() / 8;
            return MemoryUtil.memGetByte((long)(this.id_catch + (long)n3));
        }
        throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", n, n2, this.id_protected, this.id_throws));
    }

    public void id_break(boolean bl) {
        this.id_finally();
        this.id_byte.id_break();
        if (bl) {
            MT.id_break(3357, Float.MAX_VALUE);
        }
        MT.id_class(0, 0, this.id_protected, this.id_throws, this.id_byte.id_protected(), 5121, this.id_catch);
        if (bl) {
            MT.id_break(3357, 0.0f);
        }
    }

    public void id_throws(int n) {
        if (this.id_byte != fc_3.RGBA) {
            throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", new Object[]{this.id_byte}));
        }
        this.id_finally();
        MemoryUtil.memSet((long)this.id_catch, (int)n, (long)this.id_private);
    }

    public byte[] id_throws() throws IOException {
        byte[] byArray;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             WritableByteChannel writableByteChannel = Channels.newChannel(byteArrayOutputStream);){
            if (!this.id_class(writableByteChannel)) {
                throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
            }
            byArray = byteArrayOutputStream.toByteArray();
        }
        return byArray;
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
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            int n = this.id_byte.id_class();
            int n2 = this.id_class() * n;
            long l = memoryStack.nmalloc(n2);
            for (int i = 0; i < this.id_break() / 2; ++i) {
                int n3 = i * this.id_class() * n;
                int n4 = (this.id_break() - 1 - i) * this.id_class() * n;
                MemoryUtil.memCopy((long)(this.id_catch + (long)n3), (long)l, (long)n2);
                MemoryUtil.memCopy((long)(this.id_catch + (long)n4), (long)(this.id_catch + (long)n3), (long)n2);
                MemoryUtil.memCopy((long)l, (long)(this.id_catch + (long)n4), (long)n2);
            }
        }
    }

    public long id_implements() {
        return this.id_private;
    }

    @Deprecated
    public int[] id_protected() {
        if (this.id_byte != fc_3.RGBA) {
            throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
        }
        this.id_finally();
        int[] nArray = new int[this.id_class() * this.id_break()];
        for (int i = 0; i < this.id_break(); ++i) {
            for (int j = 0; j < this.id_class(); ++j) {
                int n;
                int n2 = this.id_class(j, i);
                int n3 = fN_2.id_class(n2);
                int n4 = fN_2.id_protected(n2);
                int n5 = fN_2.id_byte(n2);
                int n6 = fN_2.id_break(n2);
                nArray[j + i * this.id_class()] = n = n3 << 24 | n6 << 16 | n5 << 8 | n4;
            }
        }
        return nArray;
    }

    public static int id_protected(int n) {
        return n >> 16 & 0xFF;
    }

    public IntBuffer id_private() {
        if (this.id_byte != fc_3.RGBA) {
            throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", new Object[]{this.id_byte}));
        }
        this.id_finally();
        return MemoryUtil.memIntBuffer((long)this.id_catch, (int)((int)this.id_private));
    }
}

