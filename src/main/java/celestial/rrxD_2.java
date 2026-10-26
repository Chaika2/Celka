/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package celestial;

import celestial.MT;
import celestial.rrWs_1;
import celestial.rrki_1;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class rrxD_2 {
    private String id_class;
    private IntBuffer id_break;
    private IntBuffer id_byte;
    private boolean[] id_protected;
    private boolean[] id_throws;

    public int id_byte() {
        return this.id_break.limit();
    }

    public int id_byte(int n) {
        return this.id_class(n, this.id_protected[n]);
    }

    public rrxD_2(String string, int n) {
        this.id_class = string;
        this.id_break = BufferUtils.createIntBuffer((int)n);
        this.id_byte = BufferUtils.createIntBuffer((int)n);
        this.id_protected = new boolean[n];
        this.id_throws = new boolean[n];
    }

    public String toString() {
        return this.id_class + ", A: " + rrWs_1.id_class(this.id_break) + ", B: " + rrWs_1.id_class(this.id_byte) + ", flips: [" + rrki_1.id_class(this.id_protected, this.id_byte()) + "], changed: [" + rrki_1.id_class(this.id_throws, this.id_byte()) + "]";
    }

    private int id_class(int n, boolean bl) {
        IntBuffer intBuffer = bl ? this.id_byte : this.id_break;
        return intBuffer.get(n);
    }

    public int id_class() {
        return this.id_break.capacity();
    }

    public int id_class(boolean bl, int n) {
        return bl ? this.id_byte(n) : this.id_protected(n);
    }

    public rrxD_2 id_class(int n) {
        ((Buffer)this.id_break).position(n);
        ((Buffer)this.id_byte).position(n);
        return this;
    }

    public int id_break() {
        return this.id_break.position();
    }

    public rrxD_2 id_break(int n) {
        ((Buffer)this.id_break).limit(n);
        ((Buffer)this.id_byte).limit(n);
        return this;
    }

    public void id_throws(int n) {
        this.id_protected[n] = !this.id_protected[n];
        this.id_throws[n] = true;
    }

    public void id_throws() {
        MT.id_class(this.id_break);
        MT.id_class(this.id_byte);
    }

    public void id_catch(int n) {
        int n2 = this.id_byte();
        for (int i = 0; i < n2; ++i) {
            this.id_break.put(i, n);
            this.id_byte.put(i, n);
        }
    }

    public rrxD_2 id_catch() {
        this.id_class(0);
        this.id_break(this.id_class());
        return this;
    }

    public void id_case() {
        MT.id_break(this.id_break);
        MT.id_break(this.id_byte);
        this.id_protected();
    }

    public boolean id_case(int n) {
        return this.id_throws[n];
    }

    public int id_protected(int n) {
        return this.id_class(n, !this.id_protected[n]);
    }

    public void id_protected() {
        Arrays.fill(this.id_protected, false);
        Arrays.fill(this.id_throws, false);
    }
}

