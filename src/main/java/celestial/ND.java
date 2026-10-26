/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALCCapabilities
 *  org.lwjgl.openal.ALCapabilities
 *  org.lwjgl.system.MemoryStack
 */
package celestial;

import celestial.NK;
import celestial.NU;
import celestial.NZ;
import celestial.Na_1;
import celestial.Ne_1;
import celestial.Ni_1;
import celestial.Nr_1;
import celestial.rfU_2;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.system.MemoryStack;

public class ND {
    private static final Logger id_class = LogManager.getLogger();
    private long id_break;
    private long id_byte;
    private static final Na_1 id_protected = new NU();
    private Na_1 id_throws = id_protected;
    private Na_1 id_case = id_protected;
    private final NZ id_catch = new NZ();

    public NZ id_byte() {
        return this.id_catch;
    }

    public void id_class() {
        this.id_break = ND.id_case();
        ALCCapabilities aLCCapabilities = ALC.createCapabilities((long)this.id_break);
        if (Nr_1.id_class(this.id_break, "Get capabilities")) {
            throw new IllegalStateException("Failed to get OpenAL capabilities");
        }
        if (!aLCCapabilities.OpenALC11) {
            throw new IllegalStateException("OpenAL 1.1 not supported");
        }
        this.id_byte = ALC10.alcCreateContext((long)this.id_break, (IntBuffer)null);
        ALC10.alcMakeContextCurrent((long)this.id_byte);
        int n = this.id_throws();
        int n2 = rfU_2.id_class((int)rfU_2.id_byte((float)n), 2, 8);
        int n3 = rfU_2.id_class(n - n2, 8, 255);
        this.id_throws = new Ne_1(n3);
        this.id_case = new Ne_1(n2);
        ALCapabilities aLCapabilities = AL.createCapabilities((ALCCapabilities)aLCCapabilities);
        Nr_1.id_class("Initialization");
        if (!aLCapabilities.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
        }
        AL10.alEnable((int)512);
        if (!aLCapabilities.AL_EXT_LINEAR_DISTANCE) {
            throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
        }
        Nr_1.id_class("Enable per-source distance models");
        id_class.info("OpenAL initialized.");
    }

    public NK id_class(Ni_1 ni_1) {
        return (ni_1 == Ni_1.STREAMING ? this.id_case : this.id_throws).id_class();
    }

    public void id_class(NK nK) {
        if (!this.id_throws.id_class(nK) && !this.id_case.id_class(nK)) {
            throw new IllegalStateException("Tried to release unknown channel");
        }
    }

    public void id_break() {
        this.id_throws.id_break();
        this.id_case.id_break();
        ALC10.alcDestroyContext((long)this.id_byte);
        if (this.id_break != 0L) {
            ALC10.alcCloseDevice((long)this.id_break);
        }
    }

    private int id_throws() {
        int n;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            int n2;
            int n3;
            int n4 = ALC10.alcGetInteger((long)this.id_break, (int)4098);
            if (Nr_1.id_class(this.id_break, "Get attributes size")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            IntBuffer intBuffer = memoryStack.mallocInt(n4);
            ALC10.alcGetIntegerv((long)this.id_break, (int)4099, (IntBuffer)intBuffer);
            if (Nr_1.id_class(this.id_break, "Get attributes")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            int n5 = 0;
            do {
                if (n5 >= n4) {
                    int n6 = 30;
                    return n6;
                }
                if ((n3 = intBuffer.get(n5++)) == 0) {
                    int n7 = 30;
                    return n7;
                }
                n2 = intBuffer.get(n5++);
            } while (n3 != 4112);
            n = n2;
        }
        return n;
    }

    private static long id_case() {
        for (int i = 0; i < 3; ++i) {
            long l = ALC10.alcOpenDevice((ByteBuffer)null);
            if (l == 0L || Nr_1.id_class(l, "Open device")) continue;
            return l;
        }
        throw new IllegalStateException("Failed to open OpenAL device");
    }

    public String id_protected() {
        return String.format("Sounds: %d/%d + %d/%d", this.id_throws.id_protected(), this.id_throws.id_byte(), this.id_case.id_protected(), this.id_case.id_byte());
    }
}

