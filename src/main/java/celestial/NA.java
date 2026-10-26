/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.stb.STBVorbis
 *  org.lwjgl.stb.STBVorbisAlloc
 *  org.lwjgl.stb.STBVorbisInfo
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.Nn_1;
import celestial.Nz_1;
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

public class NA
implements Nz_1 {
    private long id_class;
    private final AudioFormat id_break;
    private final InputStream id_byte;
    private ByteBuffer id_protected = MemoryUtil.memAlloc((int)8192);

    private boolean id_byte() throws IOException {
        int n = this.id_protected.limit();
        int n2 = this.id_protected.capacity() - n;
        if (n2 == 0) {
            return true;
        }
        byte[] byArray = new byte[n2];
        int n3 = this.id_byte.read(byArray);
        if (n3 == -1) {
            return false;
        }
        int n4 = this.id_protected.position();
        ((Buffer)this.id_protected).limit(n + n3);
        ((Buffer)this.id_protected).position(n);
        this.id_protected.put(byArray, 0, n3);
        ((Buffer)this.id_protected).position(n4);
        return true;
    }

    public NA(InputStream inputStream) throws IOException {
        this.id_byte = inputStream;
        ((Buffer)this.id_protected).limit(0);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            while (this.id_class == 0L) {
                if (!this.id_byte()) {
                    throw new IOException("Failed to find Ogg header");
                }
                int n = this.id_protected.position();
                ((Buffer)this.id_protected).position(0);
                this.id_class = STBVorbis.stb_vorbis_open_pushdata((ByteBuffer)this.id_protected, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (STBVorbisAlloc)null);
                ((Buffer)this.id_protected).position(n);
                int n2 = intBuffer2.get(0);
                if (n2 == 1) {
                    this.id_protected();
                    continue;
                }
                if (n2 == 0) continue;
                throw new IOException("Failed to read Ogg file " + n2);
            }
            ((Buffer)this.id_protected).position(this.id_protected.position() + intBuffer.get(0));
            STBVorbisInfo sTBVorbisInfo = STBVorbisInfo.mallocStack((MemoryStack)memoryStack);
            STBVorbis.stb_vorbis_get_info((long)this.id_class, (STBVorbisInfo)sTBVorbisInfo);
            this.id_break = new AudioFormat(sTBVorbisInfo.sample_rate(), 16, sTBVorbisInfo.channels(), true, false);
        }
    }

    @Override
    public AudioFormat id_class() {
        return this.id_break;
    }

    private void id_class(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, Nn_1 nn_1) {
        while (floatBuffer.hasRemaining() && floatBuffer2.hasRemaining()) {
            nn_1.id_class(floatBuffer.get());
            nn_1.id_class(floatBuffer2.get());
        }
    }

    @Override
    public ByteBuffer id_class(int n) throws IOException {
        Nn_1 nn_1 = new Nn_1(n + 8192);
        while (this.id_class(nn_1) && nn_1.id_byte < n) {
        }
        return nn_1.id_class();
    }

    private boolean id_class(Nn_1 nn_1) throws IOException {
        if (this.id_class == 0L) {
            return false;
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            while (true) {
                int n;
                int n2 = STBVorbis.stb_vorbis_decode_frame_pushdata((long)this.id_class, (ByteBuffer)this.id_protected, (IntBuffer)intBuffer, (PointerBuffer)pointerBuffer, (IntBuffer)intBuffer2);
                ((Buffer)this.id_protected).position(this.id_protected.position() + n2);
                int n3 = STBVorbis.stb_vorbis_get_error((long)this.id_class);
                if (n3 == 1) {
                    this.id_protected();
                    if (this.id_byte()) continue;
                    n = 0;
                    return n != 0;
                }
                if (n3 != 0) {
                    throw new IOException("Failed to read Ogg file " + n3);
                }
                n = intBuffer2.get(0);
                if (n == 0) continue;
                int n4 = intBuffer.get(0);
                PointerBuffer pointerBuffer2 = pointerBuffer.getPointerBuffer(n4);
                if (n4 != 1) {
                    if (n4 == 2) {
                        this.id_class(pointerBuffer2.getFloatBuffer(0, n), pointerBuffer2.getFloatBuffer(1, n), nn_1);
                        boolean bl = true;
                        return bl;
                    }
                    throw new IllegalStateException("Invalid number of channels: " + n4);
                }
                this.id_class(pointerBuffer2.getFloatBuffer(0, n), nn_1);
                boolean bl = true;
                return bl;
            }
        }
    }

    private void id_class(FloatBuffer floatBuffer, Nn_1 nn_1) {
        while (floatBuffer.hasRemaining()) {
            nn_1.id_class(floatBuffer.get());
        }
    }

    @Override
    public void close() throws IOException {
        if (this.id_class != 0L) {
            STBVorbis.stb_vorbis_close((long)this.id_class);
            this.id_class = 0L;
        }
        MemoryUtil.memFree((Buffer)this.id_protected);
        this.id_byte.close();
    }

    public ByteBuffer id_break() throws IOException {
        Nn_1 nn_1 = new Nn_1(16384);
        while (this.id_class(nn_1)) {
        }
        return nn_1.id_class();
    }

    private void id_protected() {
        boolean bl;
        boolean bl2 = this.id_protected.position() == 0;
        boolean bl3 = bl = this.id_protected.position() == this.id_protected.limit();
        if (bl && !bl2) {
            ((Buffer)this.id_protected).position(0);
            ((Buffer)this.id_protected).limit(0);
        } else {
            ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(bl2 ? 2 * this.id_protected.capacity() : this.id_protected.capacity()));
            byteBuffer.put(this.id_protected);
            MemoryUtil.memFree((Buffer)this.id_protected);
            ((Buffer)byteBuffer).flip();
            this.id_protected = byteBuffer;
        }
    }
}

