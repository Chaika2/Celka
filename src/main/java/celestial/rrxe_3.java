/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.MT;
import celestial.rrxa_3;
import celestial.rrzJ_2;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrxe_3
implements rrxa_3 {
    private int id_class = GL11.glGenTextures();
    private int id_break = 15;

    public int id_byte() {
        return this.id_class;
    }

    public rrxe_3(int n, int n2) {
        byte[] byArray = this.id_class(n, n2);
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length);
        byteBuffer.put(byArray);
        ((Buffer)byteBuffer).flip();
        MT.id_super(this.id_class);
        rrzJ_2.id_catch();
        GL11.glTexImage2D((int)3553, (int)0, (int)6407, (int)n, (int)n2, (int)0, (int)6407, (int)5121, (ByteBuffer)byteBuffer);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        MT.id_super(0);
    }

    private byte[] id_class(int n, int n2) {
        byte[] byArray = new byte[n * n2 * 3];
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 1; k < 4; ++k) {
                    byArray[n3++] = this.id_class(j, i, k);
                }
            }
        }
        return byArray;
    }

    private byte id_class(int n, int n2, int n3) {
        int n4 = (this.id_class(n) + this.id_class(n2 * 19)) * this.id_class(n3 * 23) - n3;
        return (byte)(this.id_class(n4) % 128);
    }

    @Override
    public int id_class() {
        return this.id_break;
    }

    private int id_class(int n) {
        n ^= n << 13;
        n ^= n >> 17;
        return n ^ n << 5;
    }

    @Override
    public void id_throws() {
        MT.id_continue(this.id_class);
        this.id_class = 0;
    }

    @Override
    public int id_protected() {
        return this.id_class;
    }
}

