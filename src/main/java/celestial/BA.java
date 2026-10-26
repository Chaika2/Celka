/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Fu_1;
import celestial.Pv_1;
import celestial.Y;
import celestial.rJr_1;
import celestial.rXi_1;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rmj_3;
import celestial.rmt_3;
import celestial.rrAM;
import celestial.rrFo_1;
import celestial.rrLU;
import celestial.ruS_2;
import celestial.vm_3;
import celestial.y_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BA
extends Pv_1 {
    private static boolean[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[6]];
            objectArray[BA.id_byte[7]] = id_byte[8];
        }
    }

    public BA(C_class c_class) {
        super(c_class);
        this.id_byte();
    }

    static {
        BA.ntfClinit();
    }

    public boolean id_class() {
        this.id_byte();
        return (Boolean)this.id_break[id_protected[1]];
    }

    @Override
    public void id_class(rrLU rrLU2) {
        super.id_class(rrLU2);
        vm_3 vm_32 = rrLU2.id_class();
        if (vm_32 instanceof Fu_1) {
            Fu_1 fu_1 = (Fu_1)vm_32;
            vm_32 = fu_1.G_();
            if (((rJr_1)((Object)vm_32)).id_case != 0 && !(vm_32 instanceof rXi_1)) {
                this.id_class(id_byte[3]);
            }
        }
    }

    @Override
    public void id_class(rrFo_1 rrFo_12) {
        super.id_class(rrFo_12);
        if (rrFo_12.id_break() instanceof Fu_1) {
            this.id_class(id_byte[4]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEB60E65D;
    }

    private void id_class(boolean bl) {
        this.id_byte();
        Boolean bl2 = bl;
        this.id_break[BA.id_protected[2]] = bl2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF8A2773E464FEECDL;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        super.id_class(rrAM2);
        this.id_class(id_byte[5]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 92, -71, -121, -64, 81, 50, -54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(y_1 y_12) {
        super.id_break(y_12);
        if (y_12.id_byte() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[0]])) {
            ruS_2<?> ruS_22 = y_12.id_protected();
            if (ruS_22 instanceof rmt_3) {
                this.id_class(id_byte[0]);
            } else if (ruS_22 instanceof rmD_2) {
                rmD_2 rmD_22 = (rmD_2)ruS_22;
                if (rmD_22.id_break() == rmU_2.OPEN_INVENTORY) {
                    this.id_class(id_byte[1]);
                }
            } else if (ruS_22 instanceof rmj_3) {
                this.id_class(id_byte[2]);
            }
        }
    }

    private static void id_break() {
        id_protected = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        BA.id_protected();
        BA.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_byte = blArray;
    }
}

