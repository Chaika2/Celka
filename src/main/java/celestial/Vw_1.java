/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.MT;
import celestial.VH;
import celestial.VI;
import celestial.fo_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;

public class Vw_1 {
    private final VI id_class;
    private final String id_break;
    private final int id_byte;
    private int id_protected;

    private Vw_1(VI vI, int n, String string) {
        this.id_class = vI;
        this.id_byte = n;
        this.id_break = string;
    }

    public static Vw_1 id_class(VI vI, String string, InputStream inputStream, String string2) throws IOException {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        String string3 = fo_3.id_break(inputStream);
        if (string3 == null) {
            throw new IOException("Could not load program " + vI.id_class());
        }
        int n = MT.id_throws(vI.id_protected());
        MT.id_class(n, string3);
        MT.id_case(n);
        if (MT.id_throws(n, 35713) == 0) {
            String string4 = StringUtils.trim((String)MT.id_implements(n, 32768));
            throw new IOException("Couldn't compile " + vI.id_class() + " program (" + string2 + ", " + string + ") : " + string4);
        }
        Vw_1 vw_1 = new Vw_1(vI, n, string);
        vI.id_byte().put(string, vw_1);
        return vw_1;
    }

    public void id_class() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        --this.id_protected;
        if (this.id_protected <= 0) {
            MT.id_protected(this.id_byte);
            this.id_class.id_byte().remove(this.id_break);
        }
    }

    public void id_class(VH vH) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        ++this.id_protected;
        MT.id_protected(vH.id_class(), this.id_byte);
    }

    public String id_break() {
        return this.id_break;
    }
}

