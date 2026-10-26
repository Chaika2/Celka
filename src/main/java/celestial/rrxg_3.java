/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package celestial;

import celestial.rrkD;
import celestial.rrkK;
import celestial.rrkU;
import celestial.rrke_1;
import celestial.rrxa_3;
import celestial.rrzJ_2;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class rrxg_3
implements rrxa_3 {
    private rrke_1 id_class;
    private int id_break;
    private int id_byte;

    public rrxg_3(rrke_1 rrke_12, rrkK rrkK2, int n, int n2, int n3, rrkD rrkD2, rrkU rrkU2, ByteBuffer byteBuffer, int n4, boolean bl, boolean bl2) {
        this.id_class = rrke_12;
        this.id_break = n4;
        this.id_byte = GL11.glGenTextures();
        GL11.glBindTexture((int)this.af_(), (int)this.id_byte);
        rrzJ_2.id_catch();
        int n5 = bl2 ? 33071 : 10497;
        int n6 = bl ? 9729 : 9728;
        switch (rrke_12) {
            case TEXTURE_1D: {
                GL11.glTexImage1D((int)3552, (int)0, (int)rrkK2.id_class(), (int)n, (int)0, (int)rrkD2.id_class(), (int)rrkU2.id_class(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)3552, (int)10242, (int)n5);
                GL11.glTexParameteri((int)3552, (int)10240, (int)n6);
                GL11.glTexParameteri((int)3552, (int)10241, (int)n6);
                break;
            }
            case TEXTURE_2D: {
                GL11.glTexImage2D((int)3553, (int)0, (int)rrkK2.id_class(), (int)n, (int)n2, (int)0, (int)rrkD2.id_class(), (int)rrkU2.id_class(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)3553, (int)10242, (int)n5);
                GL11.glTexParameteri((int)3553, (int)10243, (int)n5);
                GL11.glTexParameteri((int)3553, (int)10240, (int)n6);
                GL11.glTexParameteri((int)3553, (int)10241, (int)n6);
                break;
            }
            case TEXTURE_3D: {
                GL20.glTexImage3D((int)32879, (int)0, (int)rrkK2.id_class(), (int)n, (int)n2, (int)n3, (int)0, (int)rrkD2.id_class(), (int)rrkU2.id_class(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)32879, (int)10242, (int)n5);
                GL11.glTexParameteri((int)32879, (int)10243, (int)n5);
                GL11.glTexParameteri((int)32879, (int)32882, (int)n5);
                GL11.glTexParameteri((int)32879, (int)10240, (int)n6);
                GL11.glTexParameteri((int)32879, (int)10241, (int)n6);
                break;
            }
            case TEXTURE_RECTANGLE: {
                GL11.glTexImage2D((int)34037, (int)0, (int)rrkK2.id_class(), (int)n, (int)n2, (int)0, (int)rrkD2.id_class(), (int)rrkU2.id_class(), (ByteBuffer)byteBuffer);
                GL11.glTexParameteri((int)34037, (int)10242, (int)n5);
                GL11.glTexParameteri((int)34037, (int)10243, (int)n5);
                GL11.glTexParameteri((int)34037, (int)10240, (int)n6);
                GL11.glTexParameteri((int)34037, (int)10241, (int)n6);
            }
        }
        GL11.glBindTexture((int)this.af_(), (int)0);
    }

    @Override
    public int id_class() {
        return this.id_break;
    }

    @Override
    public void id_throws() {
        if (this.id_byte > 0) {
            GL11.glDeleteTextures((int)this.id_byte);
            this.id_byte = 0;
        }
    }

    @Override
    public int id_protected() {
        return this.id_byte;
    }

    @Override
    public int af_() {
        return this.id_class.id_class();
    }
}

