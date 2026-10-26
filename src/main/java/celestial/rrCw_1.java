/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.Velocity;
import celestial.rrAO;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.ruS_2;
import celestial.rvc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCw_1
extends rrTF<Velocity> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    public rrCw_1(Velocity velocity) {
        super(velocity);
        this.id_break();
    }

    static {
        rrCw_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE7BD7189646ED7F5L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-88, 76, -95, -13, 64, -76, 70, -39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_break();
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (!(ruS_22 instanceof rvc_3)) {
            return;
        }
        rvc_3 rvc_32 = (rvc_3)ruS_22;
        if ((cb_3)rrCw_1.id_import.id_class[id_byte[0]] == null || rvc_32.id_break() != ((cb_3)rrCw_1.id_import.id_class[id_byte[1]]).V()) {
            return;
        }
        Boolean bl = id_break[0];
        this.id_class[rrCw_1.id_byte[2]] = bl;
    }

    @EventTarget
    public void id_class(rrAO rrAO2) {
        this.id_break();
        if (((Boolean)this.id_class[id_byte[3]]).booleanValue()) {
            rrAO2.id_break(id_break[1]);
            Boolean bl = id_break[2];
            this.id_class[rrCw_1.id_byte[4]] = bl;
        }
    }

    private static void id_class() {
        short[] sArray = new short[6];
        sArray[0] = 57;
        sArray[1] = 57;
        id_byte = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC7737930;
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
            this.id_class[0] = false;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrCw_1.id_byte();
        rrCw_1.id_class();
    }

    @Override
    public boolean aK_() {
        this.id_break();
        Boolean bl = id_break[3];
        this.id_class[rrCw_1.id_byte[5]] = bl;
        return super.aK_();
    }
}

