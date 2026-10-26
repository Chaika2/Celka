/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.Velocity;
import celestial.q_1;
import celestial.rfU_2;
import celestial.rrAS;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.rrfj_3;
import celestial.ruS_2;
import celestial.rvQ_2;
import celestial.rvc_3;
import celestial.rvu_3;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCI
extends rrTF<Velocity> {
    private static short[] id_break;
    private static double[] id_byte;
    private static String[] id_protected;
    private static byte[] id_case;
    private static boolean[] id_catch;
    public Object[] id_class;
    private static float[] id_private;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[2] = false;
        }
    }

    public rrCI(Velocity velocity) {
        super(velocity);
        this.id_byte();
        rrIm_1 rrIm_12 = new rrIm_1(id_protected[0], Float.valueOf(id_private[0]), Float.valueOf(id_private[1]), Float.valueOf(id_private[2]), Float.valueOf(id_private[3]));
        this.id_class[rrCI.id_break[0]] = rrIm_12;
        rrIk_1 rrIk_12 = new rrIk_1(id_protected[1], id_catch[0]);
        this.id_class[rrCI.id_break[1]] = rrIk_12;
        Setting[] settingArray = new Setting[id_case[0]];
        settingArray[rrCI.id_catch[1]] = (Setting)((rrIm_1)this.id_class[id_break[2]]).id_class(() -> velocity.id_new() == this ? id_catch[12] : id_catch[13]);
        settingArray[rrCI.id_catch[2]] = (Setting)((rrIk_1)this.id_class[id_break[3]]).id_class(() -> velocity.id_new() == this ? id_catch[10] : id_catch[11]);
        velocity.id_class(settingArray);
    }

    static {
        rrCI.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{19, -119, -87, 64, -3, -103, -95, -49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrAS rrAS2) {
        this.id_byte();
        if (((Boolean)this.id_class[id_break[7]]).booleanValue()) {
            rrAS2.id_class(id_catch[7]);
            Boolean bl = id_catch[8];
            this.id_class[rrCI.id_break[8]] = bl;
        }
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_byte();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[9]])) {
            if (((Boolean)this.id_class[id_break[10]]).booleanValue()) {
                float f = ((Float)((rrIm_1)this.id_class[id_break[11]]).id_byte()).floatValue();
                float f2 = ((cb_3)rrCI.id_import.id_class[id_break[12]]).sO() * id_private[6];
                ((cb_3)rrCI.id_import.id_class[id_break[13]]).id_byte(((cb_3)rrCI.id_import.id_class[id_break[14]]).rv().id_break(-rfU_2.id_class(f2) * f, id_byte[0], rfU_2.id_break(f2) * f));
                Boolean bl = id_catch[9];
                this.id_class[rrCI.id_break[15]] = bl;
            }
            if (((rrIk_1)this.id_class[id_break[16]]).id_class().booleanValue() && (Integer)((cb_3)rrCI.id_import.id_class[rrCI.id_break[17]]).id_private[id_break[18]] > 0) {
                rrfj_3.id_class(rrfj_3.id_break());
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE49367B3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x97891F032412B19L;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        rvQ_2 rvQ_22;
        this.id_byte();
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvc_3) {
            rvc_3 rvc_32 = (rvc_3)ruS_22;
            if ((cb_3)rrCI.id_import.id_class[id_break[4]] != null && rvc_32.id_break() == ((cb_3)rrCI.id_import.id_class[id_break[5]]).V()) {
                rvc_32.id_class(id_catch[3]);
                rvc_32.id_break(rvc_32.id_protected());
                rvc_32.id_byte(id_catch[4]);
                Boolean bl = id_catch[5];
                this.id_class[rrCI.id_break[6]] = bl;
            }
        } else if (ruS_22 instanceof rvu_3) {
            rvu_3 rvu_32 = (rvu_3)ruS_22;
            rvu_32.id_class(id_private[4]);
            rvu_32.id_break(rvu_32.id_byte());
            rvu_32.id_byte(id_private[5]);
        } else if (ruS_22 instanceof rvQ_2 && (rvQ_22 = (rvQ_2)ruS_22).id_break() == id_case[1]) {
            rrLu_12.id_class(id_catch[6]);
        }
    }

    private static void id_class() {
        float[] fArray = new float[7];
        fArray[0] = 0.2f;
        fArray[1] = 0.1f;
        fArray[2] = 2.0f;
        fArray[3] = 0.05f;
        fArray[6] = (float)Math.PI / 180;
        id_private = fArray;
    }

    private static void id_break() {
        id_protected = new String[]{new String("\u0421\u0438\u043b\u0430"), new String("\u0421\u0442\u0440\u0435\u0439\u0444")};
    }

    private static void id_throws() {
        id_byte = new double[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrCI.id_case();
        rrCI.id_break();
        rrCI.id_class();
        rrCI.id_private();
        rrCI.id_throws();
        rrCI.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[15];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[12] = true;
        id_catch = blArray;
    }

    private static void id_protected() {
        id_case = new byte[]{2, 31, 3, 2};
    }

    private static void id_private() {
        short[] sArray = new short[19];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 57;
        sArray[5] = 57;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[10] = 2;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[14] = 57;
        sArray[15] = 2;
        sArray[16] = 1;
        sArray[17] = 57;
        sArray[18] = 10;
        id_break = sArray;
    }
}

