/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package celestial;

import celestial.rrWs_1;
import celestial.rrki_1;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class rrxY_2 {
    private String id_class;
    private final int id_break;
    private final int id_byte;
    private final IntBuffer id_protected;
    private int[] id_throws;
    private IntBuffer id_case;

    public rrxY_2 id_byte(int n) {
        this.id_case();
        ((Buffer)this.id_protected).position(n);
        return this;
    }

    public int id_byte() {
        return this.id_protected.capacity();
    }

    public rrxY_2(String string, int n, int n2) {
        this.id_class = string;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = IntBuffer.wrap(new int[n2]);
    }

    public String toString() {
        return this.id_class + ": " + rrWs_1.id_class(this.id_protected) + ", mapping: " + rrki_1.id_class(this.id_throws) + ", glDrawBuffers: " + rrWs_1.id_class(this.id_case);
    }

    public int id_class(int n) {
        return this.id_protected.get(n);
    }

    private static int[] id_class(IntBuffer intBuffer, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int[] nArray = new int[n];
        Arrays.fill(nArray, -1);
        for (n5 = 0; n5 < intBuffer.limit(); ++n5) {
            n4 = intBuffer.get(n5);
            n3 = n4 - 36064;
            if (n3 < 0 || n3 >= n2) continue;
            nArray[n3] = n3;
        }
        for (n5 = 0; n5 < intBuffer.limit(); ++n5) {
            n4 = intBuffer.get(n5);
            n3 = n4 - 36064;
            if (n3 < n2 || n3 >= n) continue;
            int n6 = rrxY_2.id_class(n3, n2, nArray);
            if (n6 < 0) {
                throw new RuntimeException("Too many draw buffers, mapping: " + rrki_1.id_class(nArray));
            }
            nArray[n3] = n6;
        }
        return nArray;
    }

    private static int id_class(int n, int n2, int[] nArray) {
        if (n < n2) {
            return n;
        }
        if (nArray[n] >= 0) {
            return nArray[n];
        }
        for (int i = 0; i < n2; ++i) {
            if (rrki_1.id_class(nArray, i)) continue;
            return i;
        }
        return -1;
    }

    private static IntBuffer id_class(IntBuffer intBuffer, int[] nArray) {
        IntBuffer intBuffer2 = BufferUtils.createIntBuffer((int)intBuffer.capacity());
        for (int i = 0; i < intBuffer.limit(); ++i) {
            int n = intBuffer.get(i);
            int n2 = n - 36064;
            int n3 = 0;
            if (n2 >= 0 && n2 < nArray.length) {
                n3 = 36064 + nArray[n2];
            }
            intBuffer2.put(i, n3);
        }
        ((Buffer)intBuffer2).limit(intBuffer.limit());
        ((Buffer)intBuffer2).position(intBuffer.position());
        return intBuffer2;
    }

    public String id_class(boolean bl) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.id_protected.limit(); ++i) {
            Object object;
            int n = this.id_protected.get(i);
            int n2 = n - 36064;
            if (bl) {
                object = this.id_protected();
                if (n2 >= 0 && n2 < ((int[])object).length) {
                    n2 = object[n2];
                }
            }
            object = this.id_catch(n2);
            stringBuffer.append((String)object);
        }
        return stringBuffer.toString();
    }

    public rrxY_2 id_class(int n, int n2) {
        this.id_case();
        this.id_protected.put(n, n2);
        return this;
    }

    public int id_class() {
        return this.id_protected.position();
    }

    public int id_break() {
        return this.id_protected.limit();
    }

    public rrxY_2 id_break(int n) {
        this.id_case();
        this.id_protected.put(n);
        return this;
    }

    public IntBuffer id_throws() {
        if (this.id_case == null) {
            this.id_case = rrxY_2.id_class(this.id_protected, this.id_protected());
        }
        return this.id_case;
    }

    public rrxY_2 id_throws(int n) {
        for (int i = 0; i < this.id_protected.limit(); ++i) {
            this.id_protected.put(i, n);
        }
        this.id_case();
        return this;
    }

    private String id_catch(int n) {
        return n >= 0 && n < this.id_break ? "" + n : "N";
    }

    public int id_case(int n) {
        for (int i = 0; i < this.id_break(); ++i) {
            if (this.id_class(i) != n) continue;
            return i;
        }
        return -1;
    }

    private void id_case() {
        this.id_throws = null;
        this.id_case = null;
    }

    public int[] id_protected() {
        if (this.id_throws == null) {
            this.id_throws = rrxY_2.id_class(this.id_protected, this.id_break, this.id_byte);
        }
        return this.id_throws;
    }

    public rrxY_2 id_protected(int n) {
        this.id_case();
        ((Buffer)this.id_protected).limit(n);
        return this;
    }
}

