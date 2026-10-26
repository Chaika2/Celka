/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.stb.STBIEOFCallback
 *  org.lwjgl.stb.STBIEOFCallbackI
 *  org.lwjgl.stb.STBIIOCallbacks
 *  org.lwjgl.stb.STBIReadCallback
 *  org.lwjgl.stb.STBIReadCallbackI
 *  org.lwjgl.stb.STBISkipCallback
 *  org.lwjgl.stb.STBISkipCallbackI
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.system.MemoryStack
 */
package celestial;

import celestial.fA_2;
import celestial.fL_2;
import celestial.fn_3;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import org.lwjgl.stb.STBIEOFCallback;
import org.lwjgl.stb.STBIEOFCallbackI;
import org.lwjgl.stb.STBIIOCallbacks;
import org.lwjgl.stb.STBIReadCallback;
import org.lwjgl.stb.STBIReadCallbackI;
import org.lwjgl.stb.STBISkipCallback;
import org.lwjgl.stb.STBISkipCallbackI;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

public class fF_2 {
    public final int id_class;
    public final int id_break;
    private static final Object id_byte = new Object();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fF_2(String string, InputStream inputStream) throws IOException {
        Object object = id_byte;
        synchronized (object) {
            try (MemoryStack memoryStack = MemoryStack.stackPush();
                 fL_2 fL_22 = fF_2.id_class(inputStream);
                 STBIReadCallback sTBIReadCallback = STBIReadCallback.create(fL_22::id_class);
                 STBISkipCallback sTBISkipCallback = STBISkipCallback.create(fL_22::id_class);
                 STBIEOFCallback sTBIEOFCallback = STBIEOFCallback.create(fL_22::id_class);){
                STBIIOCallbacks sTBIIOCallbacks = STBIIOCallbacks.mallocStack((MemoryStack)memoryStack);
                sTBIIOCallbacks.read((STBIReadCallbackI)sTBIReadCallback);
                sTBIIOCallbacks.skip((STBISkipCallbackI)sTBISkipCallback);
                sTBIIOCallbacks.eof((STBIEOFCallbackI)sTBIEOFCallback);
                IntBuffer intBuffer = memoryStack.mallocInt(1);
                IntBuffer intBuffer2 = memoryStack.mallocInt(1);
                IntBuffer intBuffer3 = memoryStack.mallocInt(1);
                if (!STBImage.stbi_info_from_callbacks((STBIIOCallbacks)sTBIIOCallbacks, (long)0L, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3)) {
                    throw new IOException("Could not read info from the PNG file " + string + " " + STBImage.stbi_failure_reason());
                }
                this.id_class = intBuffer.get(0);
                this.id_break = intBuffer2.get(0);
            }
        }
    }

    public String toString() {
        return this.id_class + " x " + this.id_break;
    }

    private static fL_2 id_class(InputStream inputStream) {
        return inputStream instanceof FileInputStream ? new fn_3(((FileInputStream)inputStream).getChannel()) : new fA_2(Channels.newChannel(inputStream));
    }
}

