/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Floats
 *  com.mojang.datafixers.util.Pair
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.system.MemoryStack
 */
package celestial;

import celestial.HU;
import celestial.Hb_1;
import celestial.Hd_1;
import celestial.OW;
import celestial.Od_1;
import celestial.Ok_1;
import celestial.fj_3;
import celestial.jL_2;
import celestial.jZ_2;
import celestial.ju_3;
import celestial.jv_3;
import celestial.lU_2;
import celestial.le_3;
import celestial.rfH_2;
import celestial.rje_3;
import celestial.rrMh_1;
import celestial.rrbb_3;
import celestial.rrdk_1;
import celestial.rrxF_2;
import celestial.rrxm_3;
import celestial.rrxq_3;
import celestial.rrxu_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.datafixers.util.Pair;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryStack;

public class lD_2
extends Od_1
implements OW {
    private static final Logger id_native = LogManager.getLogger();
    private ByteBuffer id_volatile;
    private final List<lU_2> id_final = Lists.newArrayList();
    private int id_package = 0;
    private int id_int = 0;
    private int id_new = 0;
    private int id_continue = 0;
    private int id_super;
    private jv_3 id_this;
    private int id_else;
    private int id_synchronized;
    private jZ_2 id_return;
    private boolean id_public;
    private boolean id_goto;
    private boolean id_while;
    private HU id_try;
    private boolean id_instanceof;
    private fj_3[] id_throw = null;
    private fj_3[] id_interface = null;
    private fj_3 id_char = null;
    private final rrxu_3 id_abstract = new rrxu_3();
    public rrdk_1 id_private;
    public rrxF_2 id_implements = null;
    public BitSet id_finally = null;
    public BitSet id_extends = new BitSet();
    private ByteBuffer id_long;
    private final rje_3 id_float = new rje_3();
    private final float[] id_void = new float[4];
    private final int[] id_static = new int[4];
    private IntBuffer id_import;
    private FloatBuffer id_short;
    private Hd_1 id_default;
    private FloatBuffer id_const;
    private rrxq_3[] id_strictfp;
    private final rje_3 id_boolean = new rje_3();

    @Override
    public HU id_byte() {
        return this.id_try;
    }

    @Override
    public void id_byte(float f, float f2, float f3) {
        this.id_boolean.id_break(f, f2, f3);
    }

    @Override
    public int[] id_byte(int n, int n2, int n3, int n4) {
        this.id_static[0] = n;
        this.id_static[1] = n2;
        this.id_static[2] = n3;
        this.id_static[3] = n4;
        return this.id_static;
    }

    public int id_int() {
        return this.id_super;
    }

    public lD_2(int n) {
        this.id_volatile = Hb_1.id_class(n * 4);
        this.id_import = this.id_volatile.asIntBuffer();
        this.id_short = this.id_volatile.asFloatBuffer();
        rrdk_1.id_class(this);
    }

    public int id_this() {
        return this.id_super * this.id_return.id_class();
    }

    @Override
    public void id_class() {
        if (this.id_else != 0) {
            throw new IllegalStateException("Not filled all elements of the vertex");
        }
        ++this.id_super;
        this.id_private();
        if (rrbb_3.rs()) {
            rrdk_1.id_protected(this);
        }
    }

    private static void id_class(int[] nArray, float[] fArray) {
        lD_2.id_class(nArray, 0, nArray.length, fArray, Arrays.copyOf(nArray, nArray.length));
    }

    @Override
    public void id_class(HU hU) {
        this.id_try = hU;
    }

    @Override
    public void id_class(boolean bl) {
        this.id_instanceof = bl;
        if (rrbb_3.w()) {
            this.id_try();
        }
    }

    @Override
    public void id_class(fj_3 fj_32) {
        if (this.id_finally != null && fj_32 != null && fj_32.id_try() && fj_32.id_continue() >= 0) {
            this.id_finally.set(fj_32.id_continue());
        }
        if (this.id_throw != null) {
            int n = this.id_super / 4;
            this.id_throw[n] = fj_32;
        }
    }

    @Override
    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, float f10, float f11, float f12) {
        if (this.id_class) {
            throw new IllegalStateException();
        }
        if (this.id_public) {
            int n3;
            this.id_class(0, f);
            this.id_class(4, f2);
            this.id_class(8, f3);
            this.id_class(12, (byte)(f4 * 255.0f));
            this.id_class(13, (byte)(f5 * 255.0f));
            this.id_class(14, (byte)(f6 * 255.0f));
            this.id_class(15, (byte)(f7 * 255.0f));
            this.id_class(16, f8);
            this.id_class(20, f9);
            if (this.id_goto) {
                this.id_class(24, (short)(n & 0xFFFF));
                this.id_class(26, (short)(n >> 16 & 0xFFFF));
                n3 = 28;
            } else {
                n3 = 24;
            }
            this.id_class(n3, (short)(n2 & 0xFFFF));
            this.id_class(n3 + 2, (short)(n2 >> 16 & 0xFFFF));
            this.id_class(n3 + 4, OW.id_class(f10));
            this.id_class(n3 + 5, OW.id_class(f11));
            this.id_class(n3 + 6, OW.id_class(f12));
            this.id_new += this.id_return.id_break();
            this.id_class();
        } else {
            super.id_class(f, f2, f3, f4, f5, f6, f7, f8, f9, n, n2, f10, f11, f12);
        }
    }

    @Override
    public Ok_1 id_class(int n) {
        if (this.id_class) {
            throw new IllegalStateException();
        }
        return this.id_break(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF);
    }

    public void id_class(Hd_1 hd_1) {
        this.id_default = hd_1;
    }

    public void id_class(float f, float f2, float f3, int n, int n2, int n3, int n4, float f4, float f5, int n5, int n6) {
        if (this.id_return.id_break() != ju_3.id_goto.id_break()) {
            throw new IllegalStateException("Invalid text vertex format: " + this.id_return);
        }
        this.id_class(0, f);
        this.id_class(4, f2);
        this.id_class(8, f3);
        this.id_class(12, (byte)n);
        this.id_class(13, (byte)n2);
        this.id_class(14, (byte)n3);
        this.id_class(15, (byte)n4);
        this.id_class(16, f4);
        this.id_class(20, f5);
        this.id_class(24, (short)n5);
        this.id_class(26, (short)n6);
        this.id_new += this.id_return.id_break();
        this.id_class();
    }

    @Override
    public void id_class(rrxq_3[] rrxq_3Array) {
        this.id_strictfp = rrxq_3Array;
    }

    public void id_class(ByteBuffer byteBuffer) {
        if (rrbb_3.rs()) {
            rrdk_1.id_class(this, byteBuffer);
        }
        this.id_throws(byteBuffer.limit() + this.id_return.id_break());
        ((Buffer)this.id_volatile).position(this.id_super * this.id_return.id_break());
        this.id_volatile.put(byteBuffer);
        this.id_super += byteBuffer.limit() / this.id_return.id_break();
        this.id_new += byteBuffer.limit();
        if (rrbb_3.rs()) {
            rrdk_1.id_throws(this);
        }
    }

    @Override
    public rje_3 id_class(rje_3 rje_32) {
        this.id_float.id_break(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
        return this.id_float;
    }

    private static void id_class(ByteBuffer byteBuffer, jZ_2 jZ_22, int n, ByteBuffer byteBuffer2) {
        int n2 = jZ_22.id_break();
        int n3 = byteBuffer.limit();
        ((Buffer)byteBuffer).rewind();
        ((Buffer)byteBuffer2).clear();
        for (int i = 0; i < n; i += 4) {
            ((Buffer)byteBuffer).limit((i + 3) * n2);
            ((Buffer)byteBuffer).position(i * n2);
            byteBuffer2.put(byteBuffer);
            ((Buffer)byteBuffer).limit((i + 1) * n2);
            ((Buffer)byteBuffer).position(i * n2);
            byteBuffer2.put(byteBuffer);
            ((Buffer)byteBuffer).limit((i + 2 + 2) * n2);
            ((Buffer)byteBuffer).position((i + 2) * n2);
            byteBuffer2.put(byteBuffer);
        }
        ((Buffer)byteBuffer).limit(n3);
        ((Buffer)byteBuffer).rewind();
        ((Buffer)byteBuffer2).flip();
    }

    @Override
    public rrxF_2 id_class(xc_3 xc_32, rfH_2 rfH_22) {
        if (this.id_implements == null) {
            this.id_implements = new rrxF_2(xc_32, rfH_22);
            return this.id_implements;
        }
        this.id_implements.id_class(xc_32, rfH_22);
        return this.id_implements;
    }

    private static float id_class(FloatBuffer floatBuffer, float f, float f2, float f3, int n, int n2) {
        int n3 = n2;
        float f4 = floatBuffer.get(n3);
        float f5 = floatBuffer.get(n3 + 1);
        float f6 = floatBuffer.get(n3 + 2);
        float f7 = floatBuffer.get(n3 += n);
        float f8 = floatBuffer.get(n3 + 1);
        float f9 = floatBuffer.get(n3 + 2);
        float f10 = floatBuffer.get(n3 += n);
        float f11 = floatBuffer.get(n3 + 1);
        float f12 = floatBuffer.get(n3 + 2);
        float f13 = floatBuffer.get(n3 += n);
        float f14 = floatBuffer.get(n3 + 1);
        float f15 = floatBuffer.get(n3 + 2);
        float f16 = (f4 + f7 + f10 + f13) * 0.25f - f;
        float f17 = (f5 + f8 + f11 + f14) * 0.25f - f2;
        float f18 = (f6 + f9 + f12 + f15) * 0.25f - f3;
        return f16 * f16 + f17 * f17 + f18 * f18;
    }

    private static void id_class(int[] nArray, int n, int n2, float[] fArray, int[] nArray2) {
        int n3 = n2 - n;
        if (n3 < 16) {
            lD_2.id_class(nArray, n, n2, fArray);
            return;
        }
        int n4 = n + n2 >>> 1;
        lD_2.id_class(nArray2, n, n4, fArray, nArray);
        lD_2.id_class(nArray2, n4, n2, fArray, nArray);
        if (Floats.compare((float)fArray[nArray2[n4]], (float)fArray[nArray2[n4 - 1]]) <= 0) {
            System.arraycopy(nArray2, n, nArray, n, n3);
            return;
        }
        int n5 = n;
        int n6 = n4;
        for (int i = n; i < n2; ++i) {
            nArray[i] = n6 >= n2 || n5 < n4 && Floats.compare((float)fArray[nArray2[n6]], (float)fArray[nArray2[n5]]) <= 0 ? nArray2[n5++] : nArray2[n6++];
        }
    }

    private static void id_class(int[] nArray, int n, int n2, float[] fArray) {
        int n3 = n;
        while (++n3 < n2) {
            int n4 = nArray[n3];
            int n5 = n3;
            int n6 = nArray[n5 - 1];
            while (Floats.compare((float)fArray[n6], (float)fArray[n4]) < 0) {
                nArray[n5] = n6;
                if (n == n5 - 1) {
                    --n5;
                    break;
                }
                n6 = nArray[--n5 - 1];
            }
            nArray[n5] = n4;
        }
    }

    @Override
    public void id_class(int n, byte by) {
        this.id_volatile.put(this.id_new + n, by);
    }

    private void id_class(jZ_2 jZ_22) {
        if (this.id_return != jZ_22) {
            this.id_return = jZ_22;
            boolean bl = jZ_22 == ju_3.id_implements;
            boolean bl2 = jZ_22 == ju_3.id_private;
            this.id_public = bl || bl2;
            this.id_goto = bl;
        }
    }

    @Override
    public Ok_1 id_class(float f, float f2) {
        if (this.id_char != null && this.id_throw != null) {
            f = this.id_char.id_byte(f);
            f2 = this.id_char.id_protected(f2);
            this.id_throw[this.id_super / 4] = this.id_char;
        }
        return OW.super.id_class(f, f2);
    }

    public void id_class(int n, jZ_2 jZ_22) {
        if (this.id_while) {
            throw new IllegalStateException("Already building!");
        }
        this.id_while = true;
        this.id_synchronized = n;
        this.id_class(jZ_22);
        this.id_this = (jv_3)jZ_22.id_byte().get(0);
        this.id_else = 0;
        ((Buffer)this.id_volatile).clear();
        if (rrbb_3.rs()) {
            rrdk_1.id_break(this);
        }
        if (rrbb_3.w()) {
            this.id_try();
        }
        if (rrMh_1.id_class()) {
            if (this.id_finally == null) {
                this.id_finally = this.id_extends;
            }
            this.id_finally.clear();
        } else if (this.id_finally != null) {
            this.id_finally = null;
        }
    }

    public void id_class(le_3 le_32) {
        ((Buffer)le_32.id_class).clear();
        int n = le_32.id_class.capacity();
        this.id_throws(n);
        ((Buffer)this.id_volatile).limit(this.id_volatile.capacity());
        ((Buffer)this.id_volatile).position(this.id_int);
        this.id_volatile.put(le_32.id_class);
        ((Buffer)this.id_volatile).clear();
        jZ_2 jZ_22 = le_32.id_break;
        this.id_class(jZ_22);
        this.id_super = n / jZ_22.id_break();
        this.id_new = this.id_int + this.id_super * jZ_22.id_break();
        if (le_32.id_byte != null) {
            if (this.id_throw == null) {
                this.id_throw = this.id_interface;
            }
            if (this.id_throw == null || this.id_throw.length < this.id_instanceof()) {
                this.id_throw = new fj_3[this.id_instanceof()];
            }
            fj_3[] fj_3Array = le_32.id_byte;
            System.arraycopy(fj_3Array, 0, this.id_throw, 0, fj_3Array.length);
        } else {
            if (this.id_throw != null) {
                this.id_interface = this.id_throw;
            }
            this.id_throw = null;
        }
    }

    @Override
    public void id_class(int n, float f) {
        this.id_volatile.putFloat(this.id_new + n, f);
    }

    @Override
    public void id_class(int n, short s) {
        this.id_volatile.putShort(this.id_new + n, s);
    }

    private static void id_class(FloatBuffer floatBuffer, int n, int n2, int n3) {
        int n4 = n3 + n * n2;
        floatBuffer.limit(n4 + n2);
        floatBuffer.position(n4);
    }

    @Override
    public float[] id_break(float f, float f2, float f3, float f4) {
        this.id_void[0] = f;
        this.id_void[1] = f2;
        this.id_void[2] = f3;
        this.id_void[3] = f4;
        return this.id_void;
    }

    public void id_break(HU hU) {
        this.id_try = hU;
        this.id_instanceof = true;
    }

    @Override
    public rje_3 id_break(float f, float f2, float f3) {
        this.id_float.id_break(f, f2, f3);
        return this.id_float;
    }

    @Override
    public void id_break(fj_3 fj_32) {
        if (this.id_finally != null && fj_32 != null && fj_32.id_try() && fj_32.id_continue() >= 0) {
            this.id_finally.set(fj_32.id_continue());
        }
        if (this.id_throw != null) {
            this.id_char = fj_32;
        }
    }

    @Override
    public Ok_1 id_break(int n, int n2, int n3, int n4) {
        if (this.id_class) {
            throw new IllegalStateException();
        }
        return OW.super.id_break(n, n2, n3, n4);
    }

    @Override
    public boolean id_break() {
        return this.id_throw != null;
    }

    private void id_throws(int n) {
        if (this.id_new + n > this.id_volatile.capacity()) {
            int n2 = this.id_volatile.capacity();
            int n3 = n2 + lD_2.id_case(n);
            id_native.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", (Object)n2, (Object)n3);
            ByteBuffer byteBuffer = Hb_1.id_class(n3);
            ((Buffer)this.id_volatile).position(0);
            byteBuffer.put(this.id_volatile);
            ((Buffer)byteBuffer).rewind();
            this.id_volatile = byteBuffer;
            this.id_import = this.id_volatile.asIntBuffer();
            this.id_short = this.id_volatile.asFloatBuffer();
            if (this.id_throw != null) {
                fj_3[] fj_3Array = this.id_throw;
                int n4 = this.id_instanceof();
                this.id_throw = new fj_3[n4];
                System.arraycopy(fj_3Array, 0, this.id_throw, 0, Math.min(fj_3Array.length, this.id_throw.length));
                this.id_interface = null;
            }
        }
    }

    public void id_finally() {
        if (!this.id_while) {
            throw new IllegalStateException("Not building!");
        }
        this.id_while = false;
        rrxm_3 rrxm_32 = this.id_abstract.id_class(this.id_super, this.id_try, this.id_throw);
        this.id_final.add(new lU_2(this.id_return, this.id_super, this.id_synchronized, rrxm_32));
        this.id_try = null;
        this.id_instanceof = false;
        if (this.id_throw != null) {
            this.id_interface = this.id_throw;
        }
        this.id_throw = null;
        this.id_char = null;
        this.id_int += this.id_super * this.id_return.id_break();
        this.id_super = 0;
        this.id_this = null;
        this.id_else = 0;
    }

    @Override
    public void id_catch() {
        ImmutableList<jv_3> immutableList = this.id_return.id_byte();
        int n = immutableList.size();
        do {
            if (++this.id_else >= n) {
                this.id_else -= n;
            }
            this.id_new += this.id_this.id_protected();
            this.id_this = (jv_3)immutableList.get(this.id_else);
        } while (this.id_this.id_break() == jL_2.PADDING);
        if (this.id_class && this.id_this.id_break() == jL_2.COLOR) {
            OW.super.id_break(this.id_break, this.id_byte, this.id_protected, this.id_throws);
        }
    }

    private FloatBuffer id_catch(int n) {
        if (this.id_const == null || this.id_const.capacity() < n) {
            this.id_const = Hb_1.id_byte(n);
        }
        return this.id_const;
    }

    public Pair<lU_2, ByteBuffer> id_extends() {
        lU_2 lU_22 = this.id_final.get(this.id_package++);
        ((Buffer)this.id_volatile).position(this.id_continue);
        this.id_continue += lU_22.id_byte() * lU_22.id_break().id_break();
        ((Buffer)this.id_volatile).limit(this.id_continue);
        if (this.id_package == this.id_final.size() && this.id_super == 0) {
            this.id_native();
        }
        ByteBuffer byteBuffer = this.id_volatile.slice();
        byteBuffer.order(this.id_volatile.order());
        ((Buffer)this.id_volatile).clear();
        if (lU_22.id_byte == 7 && rrbb_3.rI()) {
            if (this.id_long == null) {
                this.id_long = Hb_1.id_class(this.id_volatile.capacity() * 2);
            }
            if (this.id_long.capacity() < this.id_volatile.capacity() * 2) {
                this.id_long = Hb_1.id_class(this.id_volatile.capacity() * 2);
            }
            jZ_2 jZ_22 = lU_22.id_break();
            int n = lU_22.id_byte();
            lD_2.id_class(byteBuffer, jZ_22, n, this.id_long);
            int n2 = n * 6 / 4;
            lU_2 lU_23 = new lU_2(jZ_22, n2, 4);
            return Pair.of((Object)lU_23, (Object)this.id_long);
        }
        return Pair.of((Object)lU_22, (Object)byteBuffer);
    }

    public int id_goto() {
        return this.id_int / 4;
    }

    private static int id_case(int n) {
        int n2;
        int n3 = 0x200000;
        if (n == 0) {
            return n3;
        }
        if (n < 0) {
            n3 *= -1;
        }
        return (n2 = n % n3) == 0 ? n : n + n3 - n2;
    }

    @Override
    public jv_3 id_case() {
        if (this.id_this == null) {
            throw new IllegalStateException("BufferBuilder not started");
        }
        return this.id_this;
    }

    public FloatBuffer id_continue() {
        return this.id_short;
    }

    public rrxq_3[] id_else() {
        return this.id_strictfp;
    }

    public le_3 id_implements() {
        ((Buffer)this.id_volatile).limit(this.id_new);
        ((Buffer)this.id_volatile).position(this.id_int);
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.id_super * this.id_return.id_break());
        byteBuffer.put(this.id_volatile);
        ((Buffer)this.id_volatile).clear();
        fj_3[] fj_3Array = this.id_while();
        return new le_3(byteBuffer, this.id_return, fj_3Array);
    }

    private int id_instanceof() {
        return this.id_volatile.capacity() / this.id_return.id_break();
    }

    public ByteBuffer id_new() {
        return this.id_volatile;
    }

    public int id_package() {
        return this.id_synchronized;
    }

    public jZ_2 id_return() {
        return this.id_return;
    }

    public IntBuffer id_super() {
        return this.id_import;
    }

    private void id_try() {
        if (this.id_instanceof && this.id_try != null && this.id_throw == null && this.id_while) {
            if (this.id_super > 0) {
                int n = this.id_synchronized;
                jZ_2 jZ_22 = this.id_return;
                HU hU = this.id_try;
                boolean bl = this.id_instanceof;
                this.id_try.id_class(this, 0, 0, 0);
                this.id_class(n, jZ_22);
                this.id_try = hU;
                this.id_instanceof = bl;
            }
            this.id_throw = this.id_interface;
            if (this.id_throw == null || this.id_throw.length < this.id_instanceof()) {
                this.id_throw = new fj_3[this.id_instanceof()];
            }
        }
    }

    private fj_3[] id_while() {
        if (this.id_throw == null) {
            return null;
        }
        int n = this.id_super / 4;
        fj_3[] fj_3Array = new fj_3[n];
        System.arraycopy(this.id_throw, 0, fj_3Array, 0, n);
        return fj_3Array;
    }

    public int id_public() {
        return this.id_int;
    }

    public void id_protected(float f, float f2, float f3) {
        ((Buffer)this.id_volatile).clear();
        FloatBuffer floatBuffer = this.id_volatile.asFloatBuffer();
        int n = this.id_return.id_break();
        int n2 = this.id_return.id_class() * 4;
        int n3 = this.id_int / 4;
        int n4 = this.id_super / 4;
        int n5 = this.id_return.id_class();
        float[] fArray = new float[n4];
        int[] nArray = new int[n4];
        for (int i = 0; i < n4; ++i) {
            fArray[i] = lD_2.id_class(floatBuffer, f, f2, f3, n5, n3 + i * n);
            nArray[i] = i;
        }
        lD_2.id_class(nArray, fArray);
        BitSet bitSet = new BitSet();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            FloatBuffer floatBuffer2 = memoryStack.mallocFloat(n5 * 4);
            int n6 = bitSet.nextClearBit(0);
            while (n6 < nArray.length) {
                int n7 = nArray[n6];
                if (n7 != n6) {
                    lD_2.id_class(floatBuffer, n7, n2, n3);
                    floatBuffer2.clear();
                    floatBuffer2.put(floatBuffer);
                    int n8 = n7;
                    int n9 = nArray[n7];
                    while (n8 != n6) {
                        lD_2.id_class(floatBuffer, n9, n2, n3);
                        FloatBuffer floatBuffer3 = floatBuffer.slice();
                        lD_2.id_class(floatBuffer, n8, n2, n3);
                        floatBuffer.put(floatBuffer3);
                        bitSet.set(n8);
                        n8 = n9;
                        n9 = nArray[n9];
                    }
                    lD_2.id_class(floatBuffer, n6, n2, n3);
                    floatBuffer2.flip();
                    floatBuffer.put(floatBuffer2);
                }
                bitSet.set(n6);
                n6 = bitSet.nextClearBit(n6 + 1);
            }
        }
    }

    @Override
    public Hd_1 id_protected() {
        return this.id_default;
    }

    protected void id_private() {
        this.id_throws(this.id_return.id_break());
    }

    public boolean id_final() {
        return this.id_while;
    }

    public void id_volatile() {
        this.id_int = 0;
        this.id_continue = 0;
        this.id_new = 0;
        this.id_final.clear();
        this.id_package = 0;
        this.id_char = null;
    }

    public rje_3 id_synchronized() {
        return this.id_boolean;
    }

    public void id_native() {
        if (this.id_int != this.id_continue) {
            id_native.warn("Bytes mismatch " + this.id_int + " " + this.id_continue);
        }
        this.id_volatile();
    }
}

