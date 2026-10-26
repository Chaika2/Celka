/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.Velocity;
import celestial.rrIm_1;
import celestial.rrLu_1;
import celestial.rrTF;
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

public class rrCt_1
extends rrTF<Velocity> {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static String[] id_case;
    private static float[] id_catch;

    private static void id_byte() {
        id_byte = new byte[]{2, 31, 2};
    }

    public rrCt_1(Velocity velocity) {
        super(velocity);
        this.id_case();
        rrIm_1 rrIm_12 = new rrIm_1(id_case[0], Float.valueOf(id_catch[0]), Float.valueOf(id_catch[1]), Float.valueOf(id_catch[2]), Float.valueOf(id_catch[3]));
        this.id_class[rrCt_1.id_protected[0]] = rrIm_12;
        rrIm_1 rrIm_13 = new rrIm_1(id_case[1], Float.valueOf(id_catch[4]), Float.valueOf(id_catch[5]), Float.valueOf(id_catch[6]), Float.valueOf(id_catch[7]));
        this.id_class[rrCt_1.id_protected[1]] = rrIm_13;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rrCt_1.id_break[0]] = (Setting)((rrIm_1)this.id_class[id_protected[2]]).id_class(() -> velocity.id_new() == this ? id_break[5] : id_break[6]);
        settingArray[rrCt_1.id_break[1]] = (Setting)((rrIm_1)this.id_class[id_protected[3]]).id_class(() -> velocity.id_new() == this ? id_break[3] : id_break[4]);
        velocity.id_class(settingArray);
    }

    static {
        rrCt_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9040963CCFA1E9D6L;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        rvQ_2 rvQ_22;
        this.id_case();
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvc_3) {
            rvc_3 rvc_32 = (rvc_3)ruS_22;
            if ((cb_3)rrCt_1.id_import.id_class[id_protected[4]] != null && rvc_32.id_break() == ((cb_3)rrCt_1.id_import.id_class[id_protected[5]]).V()) {
                rvc_32.id_class((int)((float)rvc_32.id_byte() * (((Float)((rrIm_1)this.id_class[id_protected[6]]).id_byte()).floatValue() / id_catch[8])));
                rvc_32.id_break((int)((float)rvc_32.id_protected() * (((Float)((rrIm_1)this.id_class[id_protected[7]]).id_byte()).floatValue() / id_catch[9])));
                rvc_32.id_byte((int)((float)rvc_32.id_throws() * (((Float)((rrIm_1)this.id_class[id_protected[8]]).id_byte()).floatValue() / id_catch[10])));
            }
        } else if (ruS_22 instanceof rvu_3) {
            rvu_3 rvu_32 = (rvu_3)ruS_22;
            rvu_32.id_class((int)(rvu_32.id_break() * (((Float)((rrIm_1)this.id_class[id_protected[9]]).id_byte()).floatValue() / id_catch[11])));
            rvu_32.id_break((int)(rvu_32.id_byte() * (((Float)((rrIm_1)this.id_class[id_protected[10]]).id_byte()).floatValue() / id_catch[12])));
            rvu_32.id_byte((int)(rvu_32.id_protected() * (((Float)((rrIm_1)this.id_class[id_protected[11]]).id_byte()).floatValue() / id_catch[13])));
        } else if (ruS_22 instanceof rvQ_2 && (rvQ_22 = (rvQ_2)ruS_22).id_break() == id_byte[1]) {
            rrLu_12.id_class(id_break[2]);
        }
    }

    private static void id_class() {
        float[] fArray = new float[14];
        fArray[0] = 50.0f;
        fArray[2] = 100.0f;
        fArray[3] = 1.0f;
        fArray[4] = 50.0f;
        fArray[6] = 100.0f;
        fArray[7] = 1.0f;
        fArray[8] = 100.0f;
        fArray[9] = 100.0f;
        fArray[10] = 100.0f;
        fArray[11] = 100.0f;
        fArray[12] = 100.0f;
        fArray[13] = 100.0f;
        id_catch = fArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2E1B1AD6;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-100, 77, 86, -106, 116, -74, 92, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 57;
        sArray[5] = 57;
        sArray[7] = 1;
        sArray[10] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCt_1.id_break();
        rrCt_1.id_protected();
        rrCt_1.id_class();
        rrCt_1.id_throws();
        rrCt_1.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private static void id_protected() {
        id_case = new String[]{new String("\u0413\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u043e"), new String("\u0412\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u043e")};
    }
}

