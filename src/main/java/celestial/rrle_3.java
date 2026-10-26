/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Zb_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.player.FreeCamera;
import celestial.rFP;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rrAo_1;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.rrlU_2;
import celestial.ruS_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrle_3
extends rrTF<FreeCamera> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[11];
        sArray[0] = 73;
        sArray[1] = 57;
        sArray[2] = 18;
        sArray[3] = 73;
        sArray[4] = 57;
        sArray[5] = 57;
        sArray[7] = 57;
        sArray[9] = 57;
        id_byte = sArray;
    }

    public rrle_3(FreeCamera freeCamera) {
        super(freeCamera);
        this.id_break();
    }

    static {
        rrle_3.ntfClinit();
    }

    private static void id_class() {
        id_break = new boolean[]{true, true};
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rFP) {
            if ((vm_3)rrle_3.id_import.id_class[id_byte[3]] instanceof Zb_1) {
                return;
            }
            ((FreeCamera)this.id_continue()).aw_();
        }
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        FreeCamera freeCamera = (FreeCamera)this.id_continue();
        if (!freeCamera.id_continue()) {
            return;
        }
        if ((vm_3)rrle_3.id_import.id_class[id_byte[0]] instanceof Zb_1) {
            return;
        }
        rrlU_2 rrlU_22 = freeCamera.id_new();
        if (rrlU_22.id_protected() || ((rhx_3)((cb_3)rrle_3.id_import.id_class[rrle_3.id_byte[1]]).id_implements[rrle_3.id_byte[2]]).id_break) {
            rrAo_12.id_class(rrlU_22.id_throws());
            rrAo_12.id_byte(rrlU_22.id_case());
            rrAo_12.id_byte(rrlU_22.id_break());
            rrAo_12.id_protected(rrlU_22.id_byte());
            rrAo_12.id_break(rrlU_22.id_class());
            rrAo_12.id_break(rrlU_22.id_protected());
        } else {
            rrAo_12.id_class(id_break[0]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB384403C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x838BFBCFB6E30600L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-117, -58, 48, 122, 80, -109, -121, -16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrle_3.id_class();
        rrle_3.id_byte();
    }

    @Override
    public boolean aI_() {
        this.id_break();
        if ((cb_3)rrle_3.id_import.id_class[id_byte[4]] != null) {
            rjU_2 rjU_22 = ((cb_3)rrle_3.id_import.id_class[id_byte[5]]).rv();
            this.id_class[rrle_3.id_byte[6]] = rjU_22;
        }
        return super.aI_();
    }

    @Override
    public boolean aK_() {
        this.id_break();
        if ((cb_3)rrle_3.id_import.id_class[id_byte[7]] != null && (rjU_2)this.id_class[id_byte[8]] != null && ((FreeCamera)this.id_continue()).id_continue()) {
            ((cb_3)rrle_3.id_import.id_class[id_byte[9]]).id_byte((rjU_2)this.id_class[id_byte[10]]);
        }
        return super.aK_();
    }
}

