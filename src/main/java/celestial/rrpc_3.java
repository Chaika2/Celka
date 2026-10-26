/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Zg_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.jI_2;
import celestial.manager.FontManager;
import celestial.module.util.FtHelper;
import celestial.rJr_1;
import celestial.rVi_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rmj_3;
import celestial.rrIF;
import celestial.rrLs_1;
import celestial.rrTF;
import celestial.rrfo_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpc_3
extends rrTF<FtHelper> {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static String[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrpc_3(FtHelper ftHelper, GroupSetting groupSetting) {
        super(ftHelper);
        this.id_byte();
        rrIF rrIF2 = new rrIF(id_protected[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[0]], ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[1]]).id_finally(), ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[2]]).id_finally());
        this.id_class[rrpc_3.id_byte[3]] = rrIF2;
        groupSetting.id_class((Setting<?>)((rrIF)this.id_class[id_byte[4]]));
    }

    static {
        rrpc_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB588476759E8B16FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3B02CD0A;
    }

    private String id_class(rdn_3 rdn_32) {
        String string;
        if (rdn_32.id_this()) {
            rgP_2 rgP_22 = rdn_32.id_continue();
            rVi_1 rVi_12 = rgP_22.id_throws();
            for (rgP_2 rgP_23 : rgP_22.id_protected()) {
                if (rgP_23.id_class().id_case()) continue;
                rVi_12.id_class(rgP_23);
            }
            string = rVi_12.id_byte();
        } else {
            string = jI_2.id_class(id_protected[1], rdn_32.id_finally(), new Object[id_break[1]]);
        }
        string = string.replace(id_protected[2], id_protected[3]).replaceAll(id_protected[4], id_protected[5]).trim();
        return string;
    }

    @EventTarget
    public void id_class(rrLs_1 rrLs_12) {
        this.id_byte();
        int n = rrLs_12.id_protected();
        int n2 = rrLs_12.id_class();
        if (n2 != id_break[0] || n != ((rrIF)this.id_class[id_byte[5]]).id_finally().id_byte()) {
            return;
        }
        rdn_3 rdn_32 = null;
        vm_3 vm_32 = (vm_3)rrpc_3.id_import.id_class[id_byte[6]];
        if (vm_32 instanceof Zg_1) {
            Zg_1 zg_1 = (Zg_1)((Object)vm_32);
            rdn_32 = zg_1.id_byte();
        } else if ((vm_3)rrpc_3.id_import.id_class[id_byte[7]] == null) {
            rdn_32 = ((cb_3)rrpc_3.id_import.id_class[id_byte[8]]).ss();
        }
        if (rdn_32 == null || rdn_32.id_class()) {
            return;
        }
        this.id_break(rdn_32);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-107, -21, 71, -39, 60, -5, 104, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[14];
        sArray[6] = 73;
        sArray[7] = 73;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[11] = 57;
        sArray[12] = 4;
        sArray[13] = 57;
        id_byte = sArray;
    }

    private void id_break(rdn_3 rdn_32) {
        String string = this.id_class(rdn_32);
        if (rrfo_3.id_class()) {
            ((Aq_1)((cb_3)rrpc_3.id_import.id_class[rrpc_3.id_byte[9]]).id_break[id_byte[10]]).id_break(new rmj_3(((rJr_1)((cb_3)rrpc_3.id_import.id_class[rrpc_3.id_byte[11]]).id_implements[rrpc_3.id_byte[12]]).id_case));
        }
        ((cb_3)rrpc_3.id_import.id_class[id_byte[13]]).id_case("/ah search " + string);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpc_3.id_break();
        rrpc_3.id_protected();
        rrpc_3.id_class();
    }

    private static void id_protected() {
        id_protected = new String[]{new String("\u041e\u0442\u043a\u0440\u044b\u0442\u044c \u0430\u0443\u043a\u0446\u0438\u043e\u043d\n\u0441 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u043c \u043a\u043e\u0442\u043e\u0440\u044b\u0439\n\u043d\u0430 \u043c\u044b\u0448\u043a\u0435 \u043b\u0438\u0431\u043e \u0432 \u0440\u0443\u043a\u0435"), new String("ru_ru"), new String("\u0451"), new String("\u0435"), new String("\\[?(\\d+[x\u0445]\\d+)]?|[^a-zA-Z\u0430-\u044f\u0410-\u042f- ]+"), new String("$1")};
    }
}

