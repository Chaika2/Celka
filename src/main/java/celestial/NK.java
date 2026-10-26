/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.openal.AL10
 */
package celestial;

import celestial.NP;
import celestial.Nr_1;
import celestial.Nz_1;
import celestial.rjU_2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;

public class NK {
    private static final Logger id_class = LogManager.getLogger();
    private final int id_break;
    private final AtomicBoolean id_byte = new AtomicBoolean(true);
    private int id_protected = 16384;
    private Nz_1 id_throws;

    public void id_byte(float f) {
        AL10.alSourcei((int)this.id_break, (int)53248, (int)53251);
        AL10.alSourcef((int)this.id_break, (int)4131, (float)f);
        AL10.alSourcef((int)this.id_break, (int)4129, (float)1.0f);
        AL10.alSourcef((int)this.id_break, (int)4128, (float)0.0f);
    }

    public void id_byte() {
        AL10.alSourcePlay((int)this.id_break);
    }

    private NK(int n) {
        this.id_break = n;
    }

    public void id_class(NP nP) {
        nP.id_class().ifPresent(n -> AL10.alSourcei((int)this.id_break, (int)4105, (int)n));
    }

    public static NK id_class() {
        int[] nArray = new int[1];
        AL10.alGenSources((int[])nArray);
        return Nr_1.id_class("Allocate new source") ? null : new NK(nArray[0]);
    }

    public void id_class(boolean bl) {
        AL10.alSourcei((int)this.id_break, (int)4103, (int)(bl ? 1 : 0));
    }

    public void id_class(Nz_1 nz_1) {
        this.id_throws = nz_1;
        AudioFormat audioFormat = nz_1.id_class();
        this.id_protected = NK.id_class(audioFormat, 1);
        this.id_class(4);
    }

    private static int id_class(AudioFormat audioFormat, int n) {
        return (int)((float)(n * audioFormat.getSampleSizeInBits()) / 8.0f * (float)audioFormat.getChannels() * audioFormat.getSampleRate());
    }

    private void id_class(int n2) {
        if (this.id_throws != null) {
            try {
                for (int i = 0; i < n2; ++i) {
                    ByteBuffer byteBuffer = this.id_throws.id_class(this.id_protected);
                    if (byteBuffer == null) continue;
                    new NP(byteBuffer, this.id_throws.id_class()).id_byte().ifPresent(n -> AL10.alSourceQueueBuffers((int)this.id_break, (int[])new int[]{n}));
                }
            }
            catch (IOException iOException) {
                id_class.error("Failed to read from audio stream", (Throwable)iOException);
            }
        }
    }

    public void id_class(float f) {
        AL10.alSourcef((int)this.id_break, (int)4099, (float)f);
    }

    public void id_class(rjU_2 rjU_22) {
        AL10.alSourcefv((int)this.id_break, (int)4100, (float[])new float[]{(float)rjU_22.id_break, (float)rjU_22.id_byte, (float)rjU_22.id_protected});
    }

    public void id_break(float f) {
        AL10.alSourcef((int)this.id_break, (int)4106, (float)f);
    }

    public void id_break() {
        if (this.id_byte.compareAndSet(true, false)) {
            AL10.alSourceStop((int)this.id_break);
            Nr_1.id_class("Stop");
            if (this.id_throws != null) {
                try {
                    this.id_throws.close();
                }
                catch (IOException iOException) {
                    id_class.error("Failed to close audio stream", (Throwable)iOException);
                }
                this.id_extends();
                this.id_throws = null;
            }
            AL10.alDeleteSources((int[])new int[]{this.id_break});
            Nr_1.id_class("Cleanup");
        }
    }

    public void id_break(boolean bl) {
        AL10.alSourcei((int)this.id_break, (int)514, (int)(bl ? 1 : 0));
    }

    public void id_throws() {
        if (this.id_finally() == 4115) {
            AL10.alSourcePlay((int)this.id_break);
        }
    }

    private int id_finally() {
        return !this.id_byte.get() ? 4116 : AL10.alGetSourcei((int)this.id_break, (int)4112);
    }

    public boolean id_catch() {
        return this.id_finally() == 4116;
    }

    private int id_extends() {
        int n = AL10.alGetSourcei((int)this.id_break, (int)4118);
        if (n > 0) {
            int[] nArray = new int[n];
            AL10.alSourceUnqueueBuffers((int)this.id_break, (int[])nArray);
            Nr_1.id_class("Unqueue buffers");
            AL10.alDeleteBuffers((int[])nArray);
            Nr_1.id_class("Remove processed buffers");
        }
        return n;
    }

    public void id_case() {
        if (this.id_byte.get()) {
            AL10.alSourceStop((int)this.id_break);
            Nr_1.id_class("Stop");
        }
    }

    public void id_implements() {
        if (this.id_throws != null) {
            int n = this.id_extends();
            this.id_class(n);
        }
    }

    public void id_protected() {
        if (this.id_finally() == 4114) {
            AL10.alSourcePause((int)this.id_break);
        }
    }

    public void id_private() {
        AL10.alSourcei((int)this.id_break, (int)53248, (int)0);
    }
}

