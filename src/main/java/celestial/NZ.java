/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.openal.AL10
 */
package celestial;

import celestial.rjU_2;
import celestial.rje_3;
import org.lwjgl.openal.AL10;

public class NZ {
    private float id_class = 1.0f;
    private rjU_2 id_break = rjU_2.id_class;

    public void id_byte() {
        this.id_class(rjU_2.id_class);
        this.id_class(rje_3.id_throws, rje_3.id_protected);
    }

    public void id_class(rje_3 rje_32, rje_3 rje_33) {
        AL10.alListenerfv((int)4111, (float[])new float[]{rje_32.id_class(), rje_32.id_break(), rje_32.id_byte(), rje_33.id_class(), rje_33.id_break(), rje_33.id_byte()});
    }

    public void id_class(float f) {
        AL10.alListenerf((int)4106, (float)f);
        this.id_class = f;
    }

    public void id_class(rjU_2 rjU_22) {
        this.id_break = rjU_22;
        AL10.alListener3f((int)4100, (float)((float)rjU_22.id_break), (float)((float)rjU_22.id_byte), (float)((float)rjU_22.id_protected));
    }

    public rjU_2 id_class() {
        return this.id_break;
    }

    public float id_break() {
        return this.id_class;
    }
}

