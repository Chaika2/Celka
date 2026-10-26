/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.PX;
import celestial.Pv_1;
import celestial.Y;
import celestial.cb_3;
import celestial.q_1;
import celestial.rZT;
import celestial.rZq_1;
import celestial.rfU_2;
import celestial.rrAH;
import celestial.rrAO;
import celestial.rrAX;
import celestial.rrFK;
import celestial.rrQX;
import celestial.rrfQ_2;
import celestial.rrfj_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.ruS_2;
import celestial.util.MinecraftAccessor;
import celestial.y_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCS
extends Pv_1
implements MinecraftAccessor {
    public Object[] id_break;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_byte;
    private static double[] id_case;
    private static short[] id_catch;
    private static long[] id_private;
    private static float[] id_implements;

    private static void id_byte() {
        long[] lArray = new long[4];
        lArray[0] = 4000L;
        lArray[1] = 4000L;
        lArray[3] = 4000L;
        id_private = lArray;
    }

    public rrCS() {
        super(C_throws.id_byte());
        this.id_catch();
    }

    static {
        rrCS.ntfClinit();
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_catch();
        super.id_class(rrFK2);
        Long l = System.currentTimeMillis() + id_private[1];
        this.id_break[rrCS.id_catch[40]] = l;
    }

    @Override
    public void id_class(rrAX rrAX2) {
    }

    private static float id_class(float f, float f2, boolean bl) {
        float f3;
        float f4 = rrfQ_2.id_byte(id_implements[2], id_implements[3]);
        float f5 = Math.abs(f2);
        float f6 = f + f4;
        float f7 = f - f4;
        if (bl) {
            f6 = rfU_2.id_class(f6, id_implements[4], id_implements[5]);
            f7 = rfU_2.id_class(f7, id_implements[6], id_implements[7]);
        }
        float f8 = f6 - f;
        float f9 = f7 - f;
        if (f8 == id_implements[8]) {
            return f9;
        }
        if (f9 == id_implements[9]) {
            return f8;
        }
        float f10 = Math.abs(Math.abs(f6) - f5);
        return f10 >= (f3 = Math.abs(Math.abs(f7) - f5)) ? f8 : f9;
    }

    public static double id_class(double d, double d2) {
        double d3 = Math.pow(id_case[4], d2);
        return Math.ceil(d * d3) / d3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2C05EFC27B5515ABL;
    }

    @Override
    public void id_class(rrAO rrAO2) {
        this.id_catch();
        if ((PX)this.id_break[id_catch[36]] != null) {
            rrfj_3.id_class(rrAO2, ((PX)this.id_break[id_catch[37]]).id_throws(), ((Float)((cb_3)rrCS.id_import.id_class[rrCS.id_catch[38]]).id_break[id_catch[39]]).floatValue());
        }
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_catch();
        Y y = q_12.id_class();
        if (y == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[0]])) {
            Object var16_3 = null;
            this.id_break[rrCS.id_catch[1]] = var16_3;
            Object var17_4 = null;
            this.id_break[rrCS.id_catch[2]] = var17_4;
            if (!this.id_implements() || System.currentTimeMillis() - (Long)this.id_break[id_catch[3]] > id_private[0]) {
                Boolean bl = id_throws[0];
                this.id_break[rrCS.id_catch[4]] = bl;
                return;
            }
            boolean bl = (Boolean)this.id_break[id_catch[5]];
            Boolean bl2 = id_throws[1];
            this.id_break[rrCS.id_catch[6]] = bl2;
            float f = ((cb_3)rrCS.id_import.id_class[id_catch[7]]).N();
            float f2 = ((cb_3)rrCS.id_import.id_class[id_catch[8]]).b();
            float f3 = ((Float)((cb_3)rrCS.id_import.id_class[rrCS.id_catch[9]]).id_throws[id_catch[10]]).floatValue();
            float f4 = ((Float)((cb_3)rrCS.id_import.id_class[rrCS.id_catch[11]]).id_throws[id_catch[12]]).floatValue();
            float f5 = Math.abs(f3 - f);
            float f6 = Math.abs(f4 - f2);
            if (rrCS.id_class(f5, id_case[0]) > id_case[1] || rrCS.id_class(f6, id_case[2]) > id_case[3]) {
                Boolean bl3 = id_throws[2];
                this.id_break[rrCS.id_catch[13]] = bl3;
            }
            if (bl) {
                PX pX = ((cb_3)rrCS.id_import.id_class[id_catch[14]]).id_goto();
                this.id_break[rrCS.id_catch[15]] = pX;
                float f7 = rrCS.id_class(f3, f, id_throws[3]);
                float f8 = rrCS.id_class(f4, f2, id_throws[4]);
                PX pX2 = new PX(f3 + f7, rfU_2.id_class(f4 + f8, id_implements[0], id_implements[1]));
                this.id_break[rrCS.id_catch[16]] = pX2;
                Float f9 = Float.valueOf(((PX)this.id_break[id_catch[18]]).id_throws());
                ((cb_3)rrCS.id_import.id_class[rrCS.id_catch[17]]).id_throws[rrCS.id_catch[19]] = f9;
                Float f10 = Float.valueOf(((PX)this.id_break[id_catch[21]]).id_protected());
                ((cb_3)rrCS.id_import.id_class[rrCS.id_catch[20]]).id_throws[rrCS.id_catch[22]] = f10;
            }
        } else if (y == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[23]]) && (PX)this.id_break[id_catch[24]] != null) {
            Float f = Float.valueOf(((PX)this.id_break[id_catch[26]]).id_throws());
            ((cb_3)rrCS.id_import.id_class[rrCS.id_catch[25]]).id_throws[rrCS.id_catch[27]] = f;
            Float f11 = Float.valueOf(((PX)this.id_break[id_catch[29]]).id_protected());
            ((cb_3)rrCS.id_import.id_class[rrCS.id_catch[28]]).id_throws[rrCS.id_catch[30]] = f11;
            Object var27_23 = null;
            this.id_break[rrCS.id_catch[31]] = var27_23;
        }
    }

    @Override
    public void id_class(rrAH rrAH2) {
        if (this.id_implements()) {
            rrAH2.id_class(((cb_3)rrCS.id_import.id_class[id_catch[32]]).N());
            rrAH2.id_break(((cb_3)rrCS.id_import.id_class[id_catch[33]]).b());
            rrAH2.id_class(id_throws[5]);
        }
    }

    private static void id_class() {
        short[] sArray = new short[44];
        sArray[1] = 3;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[10] = 15;
        sArray[11] = 57;
        sArray[12] = 16;
        sArray[14] = 57;
        sArray[15] = 2;
        sArray[16] = 3;
        sArray[17] = 57;
        sArray[18] = 3;
        sArray[19] = 15;
        sArray[20] = 57;
        sArray[21] = 3;
        sArray[22] = 16;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 57;
        sArray[26] = 2;
        sArray[27] = 15;
        sArray[28] = 57;
        sArray[29] = 2;
        sArray[30] = 16;
        sArray[31] = 2;
        sArray[32] = 57;
        sArray[33] = 57;
        sArray[35] = 1;
        sArray[36] = 3;
        sArray[37] = 3;
        sArray[38] = 57;
        sArray[39] = 45;
        sArray[40] = 1;
        sArray[41] = 1;
        sArray[42] = 4;
        id_catch = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7066DD0;
    }

    private static void id_break() {
        id_protected = new byte[]{4, 2};
    }

    @Override
    public void id_break(y_1 y_12) {
        rZq_1 rZq_12;
        this.id_catch();
        if (y_12.id_byte() != (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[34]])) {
            return;
        }
        ruS_2<?> ruS_22 = y_12.id_protected();
        if (ruS_22 instanceof rZq_1 && (rZq_12 = (rZq_1)ruS_22).id_break() == rZT.ATTACK) {
            Long l = System.currentTimeMillis();
            this.id_break[rrCS.id_catch[35]] = l;
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-21, 48, -71, -72, 16, 74, 94, 116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        float[] fArray = new float[11];
        fArray[0] = -90.0f;
        fArray[1] = 90.0f;
        fArray[2] = 2.2f;
        fArray[3] = 2.3f;
        fArray[4] = -90.0f;
        fArray[5] = 90.0f;
        fArray[6] = -90.0f;
        fArray[7] = 90.0f;
        fArray[10] = 35.0f;
        id_implements = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCS.id_case();
        rrCS.id_byte();
        rrCS.id_class();
        rrCS.id_protected();
        rrCS.id_throws();
        rrCS.id_break();
        rrCS.id_private();
    }

    private void id_catch() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
            this.id_break[0] = false;
            this.id_break[1] = 0L;
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[14];
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[13] = true;
        id_throws = blArray;
    }

    private boolean id_implements() {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_catch[41]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[42]])) {
            return id_throws[6];
        }
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[43]]).id_private().E().id_void()) {
            return id_throws[7];
        }
        return id_throws[8];
    }

    private static void id_protected() {
        id_case = new double[]{2.0, 35.0, 2.0, 35.0, 10.0};
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), 4000L};
        id_byte = objectArray;
    }
}

