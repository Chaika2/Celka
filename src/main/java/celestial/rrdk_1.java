/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package celestial;

import celestial.Ok_1;
import celestial.jZ_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rje_3;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrxq_3;
import celestial.rrxt_3;
import celestial.xc_3;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class rrdk_1 {
    public int id_class;
    public int id_break;
    public int id_byte;
    public int id_protected;
    public boolean id_throws;
    public boolean id_case;
    public boolean id_catch;
    public boolean id_private;
    public long[] id_implements = new long[10];
    public int id_finally = 0;

    public static void id_byte(lD_2 lD_22) {
        if (lD_22.id_int() == 0) {
            rrdk_1.id_break(lD_22);
        }
    }

    public rrdk_1() {
        this.id_implements[this.id_finally] = 0L;
    }

    public static boolean id_class(jZ_2 jZ_22, ByteBuffer byteBuffer) {
        int n = jZ_22.id_break();
        if (n != 72) {
            return false;
        }
        ((Buffer)byteBuffer).position(36);
        GL20.glVertexAttribPointer((int)rrdZ.L, (int)2, (int)5126, (boolean)false, (int)n, (ByteBuffer)byteBuffer);
        ((Buffer)byteBuffer).position(44);
        GL20.glVertexAttribPointer((int)rrdZ.A, (int)4, (int)5122, (boolean)false, (int)n, (ByteBuffer)byteBuffer);
        ((Buffer)byteBuffer).position(52);
        GL20.glVertexAttribPointer((int)rrdZ.F, (int)3, (int)5122, (boolean)false, (int)n, (ByteBuffer)byteBuffer);
        ((Buffer)byteBuffer).position(60);
        GL20.glVertexAttribPointer((int)rrdZ.n, (int)3, (int)5126, (boolean)false, (int)n, (ByteBuffer)byteBuffer);
        ((Buffer)byteBuffer).position(0);
        GL20.glEnableVertexAttribArray((int)rrdZ.L);
        GL20.glEnableVertexAttribArray((int)rrdZ.A);
        GL20.glEnableVertexAttribArray((int)rrdZ.F);
        GL20.glEnableVertexAttribArray((int)rrdZ.n);
        return true;
    }

    public void id_class(FloatBuffer floatBuffer, int n, int n2, rrxq_3[] rrxq_3Array, int n3, float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (rrxq_3Array != null && rrxq_3Array.length == 4) {
            rrxq_3 rrxq_32 = rrxq_3Array[n2];
            rrxq_32.id_class(n3, f, f2, f3);
            if (rrxq_32.id_class()) {
                f4 = rrxq_32.id_break();
                f5 = rrxq_32.id_byte();
                f6 = rrxq_32.id_protected();
            }
        }
        int n4 = n + n2 * this.id_class + 15;
        floatBuffer.put(n4 + 0, f4);
        floatBuffer.put(n4 + 1, f5);
        floatBuffer.put(n4 + 2, f6);
    }

    public static void id_class(lD_2 lD_22, int[] nArray) {
        if (lD_22.id_int() == 0) {
            rrdk_1.id_break(lD_22);
        }
        rrdk_1 rrdk_12 = lD_22.id_private;
        if (rrdk_12.id_class == 18) {
            long l = rrdk_12.id_implements[rrdk_12.id_finally];
            int n = 13;
            while (n + 1 < nArray.length) {
                nArray[n] = (int)l;
                nArray[n + 1] = (int)(l >> 32);
                n += 18;
            }
        }
    }

    public static void id_class(lD_2 lD_22, ByteBuffer byteBuffer) {
        if (lD_22.id_int() == 0) {
            rrdk_1.id_break(lD_22);
        }
        rrdk_1 rrdk_12 = lD_22.id_private;
        if (rrdk_12.id_class == 18) {
            long l = rrdk_12.id_implements[rrdk_12.id_finally];
            int n = byteBuffer.limit() / 4;
            int n2 = 13;
            while (n2 + 1 < n) {
                int n3 = (int)l;
                int n4 = (int)(l >> 32);
                byteBuffer.putInt(n2 * 4, n3);
                byteBuffer.putInt((n2 + 1) * 4, n4);
                n2 += 18;
            }
        }
    }

    public void id_class(IntBuffer intBuffer, int n, int n2, float f, float f2, float f3) {
        int n3 = (int)(f * 64.0f) & 0xFF;
        int n4 = (int)(f2 * 64.0f) & 0xFF;
        int n5 = (int)(f3 * 64.0f) & 0xFF;
        int n6 = (n5 << 16) + (n4 << 8) + n3;
        intBuffer.put(n + n2 * this.id_class + 8, n6);
    }

    public void id_class(lD_2 lD_22, int n) {
        Object object;
        FloatBuffer floatBuffer = lD_22.id_continue();
        IntBuffer intBuffer = lD_22.id_super();
        float f = floatBuffer.get((n += lD_22.id_goto()) + 0 * this.id_class);
        float f2 = floatBuffer.get(n + 0 * this.id_class + 1);
        float f3 = floatBuffer.get(n + 0 * this.id_class + 2);
        float f4 = floatBuffer.get(n + 0 * this.id_class + this.id_byte);
        float f5 = floatBuffer.get(n + 0 * this.id_class + this.id_byte + 1);
        float f6 = floatBuffer.get(n + 1 * this.id_class);
        float f7 = floatBuffer.get(n + 1 * this.id_class + 1);
        float f8 = floatBuffer.get(n + 1 * this.id_class + 2);
        float f9 = floatBuffer.get(n + 1 * this.id_class + this.id_byte);
        float f10 = floatBuffer.get(n + 1 * this.id_class + this.id_byte + 1);
        float f11 = floatBuffer.get(n + 2 * this.id_class);
        float f12 = floatBuffer.get(n + 2 * this.id_class + 1);
        float f13 = floatBuffer.get(n + 2 * this.id_class + 2);
        float f14 = floatBuffer.get(n + 2 * this.id_class + this.id_byte);
        float f15 = floatBuffer.get(n + 2 * this.id_class + this.id_byte + 1);
        float f16 = floatBuffer.get(n + 3 * this.id_class);
        float f17 = floatBuffer.get(n + 3 * this.id_class + 1);
        float f18 = floatBuffer.get(n + 3 * this.id_class + 2);
        float f19 = floatBuffer.get(n + 3 * this.id_class + this.id_byte);
        float f20 = floatBuffer.get(n + 3 * this.id_class + this.id_byte + 1);
        float f21 = f12 - f2;
        float f22 = f18 - f8;
        float f23 = f17 - f7;
        float f24 = f13 - f3;
        float f25 = f21 * f22 - f23 * f24;
        float f26 = f16 - f6;
        float f27 = f11 - f;
        float f28 = f24 * f26 - f22 * f27;
        float f29 = f27 * f23 - f26 * f21;
        float f30 = f25 * f25 + f28 * f28 + f29 * f29;
        float f31 = (double)f30 != 0.0 ? (float)(1.0 / Math.sqrt(f30)) : 1.0f;
        f25 *= f31;
        f28 *= f31;
        f29 *= f31;
        f27 = f6 - f;
        f21 = f7 - f2;
        f24 = f8 - f3;
        float f32 = f9 - f4;
        float f33 = f10 - f5;
        f26 = f11 - f;
        f23 = f12 - f2;
        f22 = f13 - f3;
        float f34 = f14 - f4;
        float f35 = f15 - f5;
        float f36 = f32 * f35 - f34 * f33;
        float f37 = f36 != 0.0f ? 1.0f / f36 : 1.0f;
        float f38 = (f35 * f27 - f33 * f26) * f37;
        float f39 = (f35 * f21 - f33 * f23) * f37;
        float f40 = (f35 * f24 - f33 * f22) * f37;
        float f41 = (f32 * f26 - f34 * f27) * f37;
        float f42 = (f32 * f23 - f34 * f21) * f37;
        float f43 = (f32 * f22 - f34 * f24) * f37;
        f30 = f38 * f38 + f39 * f39 + f40 * f40;
        f31 = (double)f30 != 0.0 ? (float)(1.0 / Math.sqrt(f30)) : 1.0f;
        f38 *= f31;
        f39 *= f31;
        f40 *= f31;
        f30 = f41 * f41 + f42 * f42 + f43 * f43;
        f31 = (double)f30 != 0.0 ? (float)(1.0 / Math.sqrt(f30)) : 1.0f;
        float f44 = f29 * f39 - f28 * f40;
        float f45 = f25 * f40 - f29 * f38;
        float f46 = f28 * f38 - f25 * f39;
        float f47 = (f41 *= f31) * f44 + (f42 *= f31) * f45 + (f43 *= f31) * f46 < 0.0f ? -1.0f : 1.0f;
        int n2 = (int)(f25 * 127.0f) & 0xFF;
        int n3 = (int)(f28 * 127.0f) & 0xFF;
        int n4 = (int)(f29 * 127.0f) & 0xFF;
        int n5 = (n4 << 16) + (n3 << 8) + n2;
        intBuffer.put(n + 0 * this.id_class + this.id_break, n5);
        intBuffer.put(n + 1 * this.id_class + this.id_break, n5);
        intBuffer.put(n + 2 * this.id_class + this.id_break, n5);
        intBuffer.put(n + 3 * this.id_class + this.id_break, n5);
        int n6 = ((int)(f38 * 32767.0f) & 0xFFFF) + (((int)(f39 * 32767.0f) & 0xFFFF) << 16);
        int n7 = ((int)(f40 * 32767.0f) & 0xFFFF) + (((int)(f47 * 32767.0f) & 0xFFFF) << 16);
        intBuffer.put(n + 0 * this.id_class + 11, n6);
        intBuffer.put(n + 0 * this.id_class + 11 + 1, n7);
        intBuffer.put(n + 1 * this.id_class + 11, n6);
        intBuffer.put(n + 1 * this.id_class + 11 + 1, n7);
        intBuffer.put(n + 2 * this.id_class + 11, n6);
        intBuffer.put(n + 2 * this.id_class + 11 + 1, n7);
        intBuffer.put(n + 3 * this.id_class + 11, n6);
        intBuffer.put(n + 3 * this.id_class + 11 + 1, n7);
        float f48 = (f4 + f9 + f14 + f19) / 4.0f;
        float f49 = (f5 + f10 + f15 + f20) / 4.0f;
        floatBuffer.put(n + 0 * this.id_class + 9, f48);
        floatBuffer.put(n + 0 * this.id_class + 9 + 1, f49);
        floatBuffer.put(n + 1 * this.id_class + 9, f48);
        floatBuffer.put(n + 1 * this.id_class + 9 + 1, f49);
        floatBuffer.put(n + 2 * this.id_class + 9, f48);
        floatBuffer.put(n + 2 * this.id_class + 9 + 1, f49);
        floatBuffer.put(n + 3 * this.id_class + 9, f48);
        floatBuffer.put(n + 3 * this.id_class + 9 + 1, f49);
        if (rrdZ.p) {
            object = lD_22.id_else();
            int n8 = rrbb_3.Q().id_public();
            this.id_class(floatBuffer, n, 0, (rrxq_3[])object, n8, f, f2, f3);
            this.id_class(floatBuffer, n, 1, (rrxq_3[])object, n8, f6, f7, f8);
            this.id_class(floatBuffer, n, 2, (rrxq_3[])object, n8, f11, f12, f13);
            this.id_class(floatBuffer, n, 3, (rrxq_3[])object, n8, f16, f17, f18);
            lD_22.id_class((rrxq_3[])null);
        }
        if (lD_22.id_return() == ju_3.id_private) {
            object = lD_22.id_synchronized();
            float f50 = ((rje_3)object).id_class();
            float f51 = ((rje_3)object).id_break();
            float f52 = ((rje_3)object).id_byte();
            this.id_class(intBuffer, n, 0, f50 - f, f51 - f2, f52 - f3);
            this.id_class(intBuffer, n, 1, f50 - f6, f51 - f7, f52 - f8);
            this.id_class(intBuffer, n, 2, f50 - f11, f51 - f12, f52 - f13);
            this.id_class(intBuffer, n, 3, f50 - f16, f51 - f17, f52 - f18);
        }
    }

    public static void id_class(lD_2 lD_22) {
        lD_22.id_private = new rrdk_1();
    }

    public void id_class(long l) {
        ++this.id_finally;
        this.id_implements[this.id_finally] = l;
    }

    public void id_class() {
        this.id_implements[this.id_finally] = 0L;
        --this.id_finally;
    }

    public static void id_class(xc_3 xc_32, Ok_1 ok_1) {
        if (ok_1 instanceof lD_2) {
            lD_2 lD_22 = (lD_2)ok_1;
            int n = rrxt_3.id_class(xc_32);
            int n2 = rrxt_3.id_break(xc_32);
            int n3 = rrxt_3.id_byte(xc_32);
            int n4 = ((n3 & 0xFFFF) << 16) + (n & 0xFFFF);
            int n5 = n2 & 0xFFFF;
            lD_22.id_private.id_class(((long)n5 << 32) + (long)n4);
        }
    }

    public static void id_class(Ok_1 ok_1) {
        if (ok_1 instanceof lD_2) {
            lD_2 lD_22 = (lD_2)ok_1;
            lD_22.id_private.id_class();
        }
    }

    public static boolean id_class(boolean bl, lD_2 lD_22) {
        lD_22.id_private.id_class();
        return bl;
    }

    public static void id_break() {
        GL20.glDisableVertexAttribArray((int)rrdZ.L);
        GL20.glDisableVertexAttribArray((int)rrdZ.A);
        GL20.glDisableVertexAttribArray((int)rrdZ.F);
        GL20.glDisableVertexAttribArray((int)rrdZ.n);
    }

    public static void id_break(lD_2 lD_22) {
        rrdk_1 rrdk_12 = lD_22.id_private;
        jZ_2 jZ_22 = lD_22.id_return();
        rrdk_12.id_class = jZ_22.id_break() / 4;
        rrdk_12.id_case = rrdk_12.id_throws = jZ_22.id_catch();
        rrdk_12.id_catch = jZ_22.id_break(0);
        rrdk_12.id_break = rrdk_12.id_throws ? jZ_22.id_private() / 4 : 0;
        rrdk_12.id_byte = rrdk_12.id_catch ? jZ_22.id_byte(0) / 4 : 0;
        rrdk_12.id_protected = 8;
    }

    public static void id_throws(lD_2 lD_22) {
        rrdk_1 rrdk_12 = lD_22.id_private;
        if (rrdk_12.id_class == 18 && lD_22.id_package() == 7 && lD_22.id_int() % 4 == 0) {
            rrdk_12.id_class(lD_22, lD_22.id_this() - 4 * rrdk_12.id_class);
        }
    }

    public static void id_case(lD_2 lD_22) {
        if (lD_22.id_return().id_catch() && lD_22.id_package() == 7 && lD_22.id_int() % 4 == 0) {
            rrdk_1 rrdk_12 = lD_22.id_private;
            rrdk_1.id_break(lD_22);
            int n = lD_22.id_int() * rrdk_12.id_class;
            for (int i = 0; i < n; i += rrdk_12.id_class * 4) {
                rrdk_12.id_class(lD_22, i);
            }
        }
    }

    public static void id_protected(lD_2 lD_22) {
        rrdk_1 rrdk_12 = lD_22.id_private;
        if (rrdk_12.id_class == 18) {
            if (lD_22.id_package() == 7 && lD_22.id_int() % 4 == 0) {
                rrdk_12.id_class(lD_22, lD_22.id_this() - 4 * rrdk_12.id_class);
            }
            long l = rrdk_12.id_implements[rrdk_12.id_finally];
            int n = lD_22.id_this() - 18 + 13;
            lD_22.id_super().put(n += lD_22.id_goto(), (int)l);
            lD_22.id_super().put(n + 1, (int)(l >> 32));
        }
    }
}

