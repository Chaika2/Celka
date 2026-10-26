/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.module.combat.AttackAura;
import celestial.q_1;
import celestial.rfU_2;
import celestial.rrCE;
import celestial.rrTH;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrnD_2;
import celestial.rrnK_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCs_1
extends rrnK_2 {
    private static boolean[] id_case;
    private static double[] id_catch;
    public Object[] id_byte;
    private static String[] id_private;
    public static Object[] id_protected;
    private static short[] id_implements;
    private static byte[] id_finally;
    private static float[] id_extends;

    @Override
    public float id_byte() {
        this.id_instanceof();
        return (Boolean)this.id_byte[id_implements[20]] != false ? id_extends[17] : id_extends[18];
    }

    @Override
    public float id_int() {
        this.id_instanceof();
        return (Boolean)this.id_byte[id_implements[21]] != false ? id_extends[19] : id_extends[20];
    }

    public rrCs_1(AttackAura attackAura) {
        super(attackAura, rrCs_1.id_class(attackAura));
        this.id_instanceof();
        Float f4 = Float.valueOf(id_extends[0]);
        this.id_byte[rrCs_1.id_implements[0]] = f4;
        rrTH rrTH2 = (f, f2, f3) -> {
            this.id_instanceof();
            float f4 = rfU_2.id_catch(f2 - f);
            float f5 = this.id_while();
            float f6 = (float)Math.sin((double)f5 * id_catch[5]);
            float f7 = f + f4 * f6;
            if (((Float)this.id_byte[id_implements[34]]).floatValue() < id_extends[23]) {
                if (!((Boolean)this.id_byte[id_implements[35]]).booleanValue()) {
                    Float f8 = Float.valueOf(f7);
                    this.id_byte[rrCs_1.id_implements[36]] = f8;
                    Boolean bl = id_case[12];
                    this.id_byte[rrCs_1.id_implements[37]] = bl;
                }
                float f9 = Math.min(((Float)this.id_byte[id_implements[38]]).floatValue() + (float)(Math.random() / id_catch[6]), id_extends[24]);
                return f + (((Float)this.id_byte[id_implements[39]]).floatValue() - f) * f9;
            }
            return f7;
        };
        this.id_byte[rrCs_1.id_implements[1]] = rrTH2;
        rrTH rrTH3 = (f, f2, f3) -> {
            this.id_instanceof();
            float f4 = f2 - f;
            float f5 = this.id_while();
            float f6 = (float)Math.sin((double)f5 * id_catch[3]);
            float f7 = f + f4 * f6;
            if (((Float)this.id_byte[id_implements[28]]).floatValue() < id_extends[21]) {
                if (!((Boolean)this.id_byte[id_implements[29]]).booleanValue()) {
                    Float f8 = Float.valueOf(f7);
                    this.id_byte[rrCs_1.id_implements[30]] = f8;
                    Boolean bl = id_case[11];
                    this.id_byte[rrCs_1.id_implements[31]] = bl;
                }
                float f9 = Math.min(((Float)this.id_byte[id_implements[32]]).floatValue() + (float)(Math.random() / id_catch[4]), id_extends[22]);
                return f + (((Float)this.id_byte[id_implements[33]]).floatValue() - f) * f9;
            }
            return f7;
        };
        this.id_byte[rrCs_1.id_implements[2]] = rrTH3;
    }

    static {
        rrCs_1.ntfClinit();
    }

    private static void id_this() {
        id_private = new String[]{new String(".*(snow|banner|sign|step|frame|conduit|bamboo|anvil|chipped_anvil|damaged_anvil|nether_brick_wall|grindstone|stonecutter|lantern|soul_lantern|campfire|soul_campfire|daylight_detector|lectern|brewing_stand|cauldron|table|slab|stair|chest|ladder|vine|waterlily|wall|chain|carpet|pane|fence|fence_gate|gate|rod|bed|skull|pot|hopper|door|bars|piston|lily|plate|farm|path).*")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5371D88;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_instanceof();
        super.id_class(q_12);
        AttackAura attackAura = (AttackAura)this.id_continue();
        rrnD_2 rrnD_22 = attackAura.id_long();
        iB_2 iB_22 = attackAura.id_continue();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[3]])) {
            if (iB_22 != null && !((Boolean)this.id_byte[id_implements[4]]).booleanValue()) {
                Float f = Float.valueOf(id_extends[1]);
                this.id_byte[rrCs_1.id_implements[5]] = f;
                Boolean bl = id_case[0];
                this.id_byte[rrCs_1.id_implements[6]] = bl;
                Boolean bl2 = id_case[1];
                this.id_byte[rrCs_1.id_implements[7]] = bl2;
            }
            Boolean bl = iB_22 != null ? id_case[2] : id_case[3];
            this.id_byte[rrCs_1.id_implements[8]] = bl;
            if (((Float)this.id_byte[id_implements[9]]).floatValue() < id_extends[2]) {
                rrCs_1 rrCs_12 = this;
                Float f = Float.valueOf(((Float)rrCs_12.id_byte[id_implements[10]]).floatValue() + id_extends[3]);
                rrCs_12.id_byte[rrCs_1.id_implements[11]] = f;
                if (((Float)this.id_byte[id_implements[12]]).floatValue() > id_extends[4]) {
                    Float f2 = Float.valueOf(id_extends[5]);
                    this.id_byte[rrCs_1.id_implements[13]] = f2;
                }
            }
            Boolean bl3 = id_case[4];
            this.id_byte[rrCs_1.id_implements[14]] = bl3;
            this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_implements[15]]));
            if (rrnD_22.id_class(attackAura)) {
                Boolean bl4 = id_case[5];
                this.id_byte[rrCs_1.id_implements[16]] = bl4;
                this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_implements[17]]));
                this.id_class(iB_22);
            }
        }
        rrnD_22.id_class(attackAura, q_12);
    }

    private static rrTT id_class(AttackAura attackAura) {
        rrTT rrTT2 = new rrTT(attackAura);
        rrTT2.id_class(new rrCE(rrTT2));
        return rrTT2;
    }

    @Override
    public boolean id_class(xc_3 xc_32) {
        if (!xc_32.id_break().id_byte) {
            return id_case[7];
        }
        return ((Set)id_protected[id_implements[24]]).contains(xc_32.id_break());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C7AC6079A5BC30FL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{7, 13, -99, 57, -12, 32, -113, 118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrCs_1.id_goto();
        rrCs_1.id_this();
        rrCs_1.id_synchronized();
        rrCs_1.id_try();
        rrCs_1.id_public();
        rrCs_1.id_return();
        rrCs_1.id_else();
    }

    @Override
    public rrTH id_finally() {
        this.id_instanceof();
        return (rrTH)this.id_byte[id_implements[22]];
    }

    private static void id_goto() {
        boolean[] blArray = new boolean[21];
        blArray[2] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[20] = true;
        id_case = blArray;
    }

    private static void id_else() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(3.6893488E19f), 0.12676056, new HashSet()};
        id_protected = objectArray;
    }

    private void id_instanceof() {
        if (this.id_byte == null) {
            this.id_byte = new Object[9];
            this.id_byte[0] = false;
            this.id_byte[1] = Float.valueOf(0.0f);
            this.id_byte[2] = false;
            this.id_byte[3] = Float.valueOf(0.0f);
            this.id_byte[4] = Float.valueOf(0.0f);
            this.id_byte[5] = false;
            this.id_byte[6] = false;
        }
    }

    @Override
    public rrTH id_package() {
        this.id_instanceof();
        return (rrTH)this.id_byte[id_implements[23]];
    }

    private static void id_return() {
        id_finally = new byte[]{4, 4, 9, 2, 3, 4, 5, 6, 5, 2, 3};
    }

    private static void id_try() {
        short[] sArray = new short[40];
        sArray[0] = 1;
        sArray[1] = 7;
        sArray[2] = 8;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[17] = 1;
        sArray[18] = 57;
        sArray[19] = 57;
        sArray[22] = 7;
        sArray[23] = 8;
        sArray[24] = 4;
        sArray[25] = 2;
        sArray[26] = 5;
        sArray[27] = 6;
        sArray[28] = 1;
        sArray[29] = 6;
        sArray[30] = 4;
        sArray[31] = 6;
        sArray[32] = 1;
        sArray[33] = 4;
        sArray[34] = 1;
        sArray[35] = 5;
        sArray[36] = 3;
        sArray[37] = 5;
        sArray[38] = 1;
        sArray[39] = 3;
        id_implements = sArray;
    }

    private float id_while() {
        float f;
        float f2;
        float f3 = ((cb_3)rrCs_1.id_import.id_class[id_implements[18]]).id_class(id_extends[6], id_case[6]);
        double d = ((cb_3)rrCs_1.id_import.id_class[id_implements[19]]).id_class(iQ_2.id_private);
        if (d > id_catch[0]) {
            f3 *= (float)(id_catch[1] / d);
        }
        if (d < id_catch[2]) {
            f2 = id_extends[7];
            float f4 = f2 + id_extends[8];
            f = f4 * f3 * f3 * f3 - f2 * f3 * f3;
        } else if (f3 < id_extends[9]) {
            f = id_extends[10] * f3 * f3 * f3 * f3;
        } else {
            f2 = f3 - id_extends[11];
            f = id_extends[12] - id_extends[13] * f2 * f2 * f2 * f2;
        }
        f2 = id_extends[14] + id_extends[15] * f;
        return f2 / id_extends[16];
    }

    private static void id_public() {
        id_catch = new double[]{1.6, 1.6, 2.0, Math.PI, 20.0, Math.PI, 20.0, 0.12676056};
    }

    @Override
    public rrTf_1 id_protected() {
        return null;
    }

    @Override
    public void id_volatile() {
        this.id_instanceof();
        super.id_volatile();
        Boolean bl = id_case[8];
        this.id_byte[rrCs_1.id_implements[25]] = bl;
        Boolean bl2 = id_case[9];
        this.id_byte[rrCs_1.id_implements[26]] = bl2;
        Boolean bl3 = id_case[10];
        this.id_byte[rrCs_1.id_implements[27]] = bl3;
    }

    private static void id_synchronized() {
        float[] fArray = new float[31];
        fArray[0] = 1.0f;
        fArray[2] = 1.0f;
        fArray[3] = 0.35f;
        fArray[4] = 1.0f;
        fArray[5] = 1.0f;
        fArray[6] = 1.0f;
        fArray[7] = 1.70158f;
        fArray[8] = 1.0f;
        fArray[9] = 0.5f;
        fArray[10] = 8.0f;
        fArray[11] = 1.0f;
        fArray[12] = 1.0f;
        fArray[13] = 8.0f;
        fArray[14] = 1.0f;
        fArray[15] = 29.0f;
        fArray[16] = 50.0f;
        fArray[17] = -1.0f;
        fArray[18] = 1.0f;
        fArray[19] = -1.0f;
        fArray[20] = 1.0f;
        fArray[21] = 1.0f;
        fArray[22] = 1.0f;
        fArray[23] = 1.0f;
        fArray[24] = 1.0f;
        fArray[28] = 30.0f;
        fArray[29] = 1.0f;
        fArray[30] = 0.35f;
        id_extends = fArray;
    }
}

