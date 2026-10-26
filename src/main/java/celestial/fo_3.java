/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.MT;
import celestial.fu_3;
import celestial.rqu_3;
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
    private static final Logger id_class = LogManager.getLogger();

    public static int id_class() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (rqu_3.id_byte) {
            int[] nArray = new int[ThreadLocalRandom.current().nextInt(15) + 1];
            MT.id_class(nArray);
            int n = MT.id_default();
            MT.id_break(nArray);
            return n;
        }
        return MT.id_default();
    }

    public static void id_class(fu_3 fu_32, int n, int n2, int n3, int n4) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        fo_3.id_break(n);
        if (n2 >= 0) {
            MT.id_break(3553, 33085, n2);
            MT.id_break(3553, 33082, 0);
            MT.id_break(3553, 33083, n2);
            MT.id_class(3553, 34049, 0.0f);
        }
        for (int i = 0; i <= n2; ++i) {
            MT.id_class(3553, i, fu_32.id_class(), n3 >> i, n4 >> i, 0, 6408, 5121, null);
        }
    }

    public static ByteBuffer id_class(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream)inputStream;
            FileChannel fileChannel = fileInputStream.getChannel();
            byteBuffer = MemoryUtil.memAlloc((int)((int)fileChannel.size() + 1));
            while (fileChannel.read(byteBuffer) != -1) {
            }
        } else {
            byteBuffer = MemoryUtil.memAlloc((int)8192);
            ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
            while (readableByteChannel.read(byteBuffer) != -1) {
                if (byteBuffer.remaining() != 0) continue;
                byteBuffer = MemoryUtil.memRealloc((ByteBuffer)byteBuffer, (int)(byteBuffer.capacity() * 2));
            }
        }
        return byteBuffer;
    }

    public static void id_class(IntBuffer intBuffer, int n, int n2) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GL11.glPixelStorei((int)3312, (int)0);
        GL11.glPixelStorei((int)3313, (int)0);
        GL11.glPixelStorei((int)3314, (int)0);
        GL11.glPixelStorei((int)3315, (int)0);
        GL11.glPixelStorei((int)3316, (int)0);
        GL11.glPixelStorei((int)3317, (int)4);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n, (int)n2, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
    }

    public static void id_class(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_continue(n);
    }

    public static void id_class(int n, int n2, int n3) {
        fo_3.id_class(fu_3.RGBA, n, 0, n2, n3);
    }

    public static void id_class(fu_3 fu_32, int n, int n2, int n3) {
        fo_3.id_class(fu_32, n, 0, n2, n3);
    }

    public static void id_class(int n, int n2, int n3, int n4) {
        fo_3.id_class(fu_3.RGBA, n, n2, n3, n4);
    }

    private static void id_break(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        MT.id_super(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String id_break(InputStream inputStream) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        ByteBuffer byteBuffer = null;
        try {
            byteBuffer = fo_3.id_class(inputStream);
            int n = byteBuffer.position();
            ((Buffer)byteBuffer).rewind();
            String string = MemoryUtil.memASCII((ByteBuffer)byteBuffer, (int)n);
            return string;
        }
        catch (IOException iOException) {
        }
        finally {
            if (byteBuffer != null) {
                MemoryUtil.memFree((Buffer)byteBuffer);
            }
        }
        return null;
    }
}

