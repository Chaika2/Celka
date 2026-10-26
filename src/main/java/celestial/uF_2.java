/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.uJ_2;
import celestial.uL_2;
import celestial.uc_3;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.stream.IntStream;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class uF_2
implements uc_3 {
    private final ByteBuffer id_class;
    public final STBTTFontinfo id_break;
    public final float id_byte;
    private final IntSet id_protected = new IntArraySet();
    public final float id_throws;
    public final float id_case;
    public final float id_catch;
    public final float id_private;

    public uF_2(ByteBuffer byteBuffer, STBTTFontinfo sTBTTFontinfo, float f, float f2, float f3, float f4, String string) {
        this.id_class = byteBuffer;
        this.id_break = sTBTTFontinfo;
        this.id_byte = f2;
        string.codePoints().forEach(arg_0 -> ((IntSet)this.id_protected).add(arg_0));
        this.id_throws = f3 * f2;
        this.id_case = f4 * f2;
        this.id_catch = STBTruetype.stbtt_ScaleForPixelHeight((STBTTFontinfo)sTBTTFontinfo, (float)(f * f2));
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            IntBuffer intBuffer3 = memoryStack.mallocInt(1);
            STBTruetype.stbtt_GetFontVMetrics((STBTTFontinfo)sTBTTFontinfo, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3);
            this.id_private = (float)intBuffer.get(0) * this.id_catch;
        }
    }

    @Override
    public IntSet id_class() {
        return (IntSet)IntStream.range(0, 65535).filter(n -> !this.id_protected.contains(n)).collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
    }

    @Override
    public /* synthetic */ uJ_2 id_class(int n) {
        return this.id_break(n);
    }

    @Override
    public void close() {
        this.id_break.free();
        MemoryUtil.memFree((Buffer)this.id_class);
    }

    public uL_2 id_break(int n) {
        Object var2_16;
        if (this.id_protected.contains(n)) {
            return null;
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            IntBuffer intBuffer3 = memoryStack.mallocInt(1);
            IntBuffer intBuffer4 = memoryStack.mallocInt(1);
            int n2 = STBTruetype.stbtt_FindGlyphIndex((STBTTFontinfo)this.id_break, (int)n);
            if (n2 != 0) {
                STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel((STBTTFontinfo)this.id_break, (int)n2, (float)this.id_catch, (float)this.id_catch, (float)this.id_throws, (float)this.id_case, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3, (IntBuffer)intBuffer4);
                int n3 = intBuffer3.get(0) - intBuffer.get(0);
                int n4 = intBuffer4.get(0) - intBuffer2.get(0);
                if (n3 != 0 && n4 != 0) {
                    IntBuffer intBuffer5 = memoryStack.mallocInt(1);
                    IntBuffer intBuffer6 = memoryStack.mallocInt(1);
                    STBTruetype.stbtt_GetGlyphHMetrics((STBTTFontinfo)this.id_break, (int)n2, (IntBuffer)intBuffer5, (IntBuffer)intBuffer6);
                    uL_2 uL_22 = new uL_2(this, intBuffer.get(0), intBuffer3.get(0), -intBuffer2.get(0), -intBuffer4.get(0), (float)intBuffer5.get(0) * this.id_catch, (float)intBuffer6.get(0) * this.id_catch, n2);
                    return uL_22;
                }
                uL_2 uL_23 = null;
                return uL_23;
            }
            var2_16 = null;
        }
        return var2_16;
    }
}

