/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.iB_2;
import celestial.module.combat.AttackAura;
import celestial.q_1;
import celestial.rjU_2;
import celestial.rrCB;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrnD_2;
import celestial.rrnK_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCP
extends rrnK_2 {
    private static boolean[] id_protected;
    private static short[] id_case;
    public Object[] id_byte;
    private static float[] id_catch;
    private static byte[] id_private;

    @Override
    public float id_byte() {
        return id_catch[0];
    }

    @Override
    public float id_int() {
        return id_catch[1];
    }

    public rrCP(AttackAura attackAura) {
        super(attackAura, new rrTT(attackAura));
        this.id_else();
        Boolean bl = id_protected[0];
        this.id_byte[rrCP.id_case[0]] = bl;
        rrCB rrCB2 = new rrCB(this);
        this.id_byte[rrCP.id_case[1]] = rrCB2;
        this.id_class(id_protected[1]);
    }

    static {
        rrCP.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[15];
        sArray[1] = 1;
        sArray[5] = 1;
        sArray[8] = 57;
        sArray[9] = 15;
        sArray[11] = 57;
        sArray[12] = 16;
        sArray[14] = 1;
        id_case = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD34D60407E29743L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5B42AD40;
    }

    @Override
    public float id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        this.id_else();
        return (Boolean)this.id_byte[id_case[7]] != false ? ((Float)((cb_3)rrCP.id_import.id_class[rrCP.id_case[8]]).id_throws[id_case[9]]).floatValue() : super.id_class(rjU_22, rjU_23);
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_else();
        super.id_class(q_12);
        AttackAura attackAura = (AttackAura)this.id_continue();
        rrnD_2 rrnD_22 = attackAura.id_long();
        iB_2 iB_22 = attackAura.id_continue();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]])) {
            this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_case[3]]));
            if (rrnD_22.id_class(attackAura)) {
                Boolean bl = id_protected[2];
                this.id_byte[rrCP.id_case[4]] = bl;
                this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_case[5]]));
                this.id_class(iB_22);
            } else {
                Boolean bl = id_protected[3];
                this.id_byte[rrCP.id_case[6]] = bl;
            }
        }
        rrnD_22.id_class(attackAura, q_12);
    }

    @Override
    public float id_break(rjU_2 rjU_22, rjU_2 rjU_23) {
        this.id_else();
        return (Boolean)this.id_byte[id_case[10]] != false ? ((Float)((cb_3)rrCP.id_import.id_class[rrCP.id_case[11]]).id_throws[id_case[12]]).floatValue() : super.id_break(rjU_22, rjU_23);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -105, -58, -70, 79, 59, 68, -5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrCP.id_synchronized();
        rrCP.id_this();
        rrCP.id_return();
        rrCP.id_public();
    }

    private void id_else() {
        if (this.id_byte == null) {
            this.id_byte = new Object[2];
            this.id_byte[0] = false;
        }
    }

    private static void id_return() {
        id_catch = new float[]{-1.0f, -1.0f};
    }

    private static void id_public() {
        id_private = new byte[]{2};
    }

    @Override
    public rrTf_1 id_protected() {
        this.id_else();
        return (rrTf_1)this.id_byte[id_case[14]];
    }

    @Override
    public void id_volatile() {
        this.id_else();
        super.id_volatile();
        Boolean bl = id_protected[4];
        this.id_byte[rrCP.id_case[13]] = bl;
    }

    private static void id_synchronized() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        id_protected = blArray;
    }
}

