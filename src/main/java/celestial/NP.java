/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.openal.AL10
 */
package celestial;

import celestial.Nr_1;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;

public class NP {
    private ByteBuffer id_class;
    private final AudioFormat id_break;
    private boolean id_byte;
    private int id_protected;

    public OptionalInt id_byte() {
        OptionalInt optionalInt = this.id_class();
        this.id_byte = false;
        return optionalInt;
    }

    public NP(ByteBuffer byteBuffer, AudioFormat audioFormat) {
        this.id_class = byteBuffer;
        this.id_break = audioFormat;
    }

    public OptionalInt id_class() {
        if (!this.id_byte) {
            if (this.id_class == null) {
                return OptionalInt.empty();
            }
            int n = Nr_1.id_class(this.id_break);
            int[] nArray = new int[1];
            AL10.alGenBuffers((int[])nArray);
            if (Nr_1.id_class("Creating buffer")) {
                return OptionalInt.empty();
            }
            AL10.alBufferData((int)nArray[0], (int)n, (ByteBuffer)this.id_class, (int)((int)this.id_break.getSampleRate()));
            if (Nr_1.id_class("Assigning buffer data")) {
                return OptionalInt.empty();
            }
            this.id_protected = nArray[0];
            this.id_byte = true;
            this.id_class = null;
        }
        return OptionalInt.of(this.id_protected);
    }

    public void id_break() {
        if (this.id_byte) {
            AL10.alDeleteBuffers((int[])new int[]{this.id_protected});
            if (Nr_1.id_class("Deleting stream buffers")) {
                return;
            }
        }
        this.id_byte = false;
    }
}

