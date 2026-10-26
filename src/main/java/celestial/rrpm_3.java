/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.aI_2;
import celestial.an_3;
import celestial.cd_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Module;
import celestial.module.util.FtHelper;
import celestial.q_1;
import celestial.rRM;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rql_3;
import celestial.rrFK;
import celestial.rrIk_1;
import celestial.rrTF;
import celestial.rrfu_3;
import celestial.rrjS_2;
import celestial.rrpZ_2;
import celestial.rrpv_3;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpm_3
extends rrTF<FtHelper> {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;
    private static short[] id_case;
    public Object[] id_class;

    public rrpv_3 id_byte(String string) {
        if (rql_3.id_break(string)) {
            return null;
        }
        Matcher matcher = ((Pattern)rrjS_2.id_class[id_case[20]]).matcher(string);
        if (matcher.matches()) {
            return rrpv_3.id_break(matcher.group(id_byte[9]));
        }
        return null;
    }

    private static void id_byte() {
        boolean[] blArray = new boolean[13];
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        id_byte = blArray;
    }

    public rrpm_3(FtHelper ftHelper, GroupSetting groupSetting) {
        super(ftHelper);
        this.id_case();
        rrIk_1 rrIk_12 = new rrIk_1(id_protected[0], id_byte[0]);
        this.id_class[rrpm_3.id_case[0]] = rrIk_12;
        groupSetting.id_class((Setting<?>)((rrIk_1)this.id_class[id_case[1]]));
    }

    static {
        rrpm_3.ntfClinit();
    }

    public void id_class() {
        this.id_private();
    }

    public void id_class(rrpZ_2 rrpZ_22, rrpZ_2 rrpZ_23) {
        this.id_break(rrpZ_22);
        rVi_1 rVi_12 = rrfu_3.id_break((Module)this.id_continue()).id_class(id_protected[1]).id_class(rgF_2.GRAY);
        rVi_12.id_break(id_protected[2]).id_class(new rgN_2(rrpZ_23.id_break().id_class()).id_class(rgF_2.RED));
        rVi_12.id_break(id_protected[3]).id_class(new rgN_2(this.id_class(rrpZ_23)).id_class(rgF_2.RED));
        rrfu_3.id_class(rVi_12);
        MinecraftAccessor.a_(rVi_12.id_byte(), id_byte[8]);
    }

    @EventTarget
    public void id_class(rrFK rrFK2) {
        this.id_class();
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_case();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]])) {
            if (!(((rrIk_1)this.id_class[id_case[3]]).id_class().booleanValue() && rrjS_2.id_class() && this.id_break())) {
                this.id_class();
                return;
            }
            if ((rrpZ_2)this.id_class[id_case[4]] == null) {
                return;
            }
            UUID uUID = ((rrpZ_2)this.id_class[id_case[5]]).id_class();
            rrpv_3 rrpv_32 = ((rrpZ_2)this.id_class[id_case[6]]).id_break();
            rgN_2 rgN_22 = new rgN_2("\u0428\u0430\u0445\u0442\u0430: " + rrpv_32.id_byte() + rrpv_32.id_class() + rgF_2.RESET + " (" + this.id_class((rrpZ_2)this.id_class[id_case[7]]) + ")");
            ((cq_3)rrpm_3.id_import.id_class[id_case[8]]).id_extends().id_catch().put(uUID, new cd_3(uUID, rgN_22, rrpv_32.id_break(), rRM.PROGRESS, (float)((rrpZ_2)this.id_class[id_case[9]]).id_protected() / (float)((rrpZ_2)this.id_class[id_case[10]]).id_byte(), id_byte[1], id_byte[2], id_byte[3]));
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A00F872;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, -108, -18, -71, 16, 35, 17, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private String id_class(rrpZ_2 rrpZ_22) {
        Object[] objectArray = new Object[id_byte[11]];
        objectArray[rrpm_3.id_byte[12]] = rrpZ_22.id_protected() % id_break[10];
        return rrpZ_22.id_protected() / id_break[9] + ":" + String.format(id_protected[4], objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF5A682DED9DFE9C9L;
    }

    public boolean id_break() {
        this.id_case();
        rrpv_3 rrpv_32 = null;
        int n = id_break[0];
        for (an_3 an_32 : ((gm_3)rrpm_3.id_import.id_class[id_case[11]]).id_byte()) {
            if (an_32.BC() == aI_2.id_break) {
                int n2;
                String string = an_32.L_().getString();
                rrpv_3 rrpv_33 = this.id_byte(string);
                if (rrpv_33 != null) {
                    rrpv_32 = rrpv_33;
                }
                if ((n2 = this.id_break(string)) != id_break[1]) {
                    n = n2;
                }
            }
            if (rrpv_32 == null || n == id_break[2]) continue;
            break;
        }
        if (rrpv_32 == null || n == id_break[3]) {
            return id_byte[4];
        }
        rrpZ_2 rrpZ_22 = (rrpZ_2)this.id_class[id_case[12]];
        boolean bl = id_byte[5];
        if ((rrpZ_2)this.id_class[id_case[13]] != null && Math.abs(((rrpZ_2)this.id_class[id_case[14]]).id_protected() - n) > id_break[4]) {
            Object var12_9 = null;
            this.id_class[rrpm_3.id_case[15]] = var12_9;
            bl = id_byte[6];
        }
        if ((rrpZ_2)this.id_class[id_case[16]] == null) {
            rrpZ_2 rrpZ_23 = new rrpZ_2(UUID.randomUUID(), n);
            this.id_class[rrpm_3.id_case[17]] = rrpZ_23;
        }
        ((rrpZ_2)this.id_class[id_case[18]]).id_class(rrpv_32, n);
        if (bl) {
            this.id_class(rrpZ_22, (rrpZ_2)this.id_class[id_case[19]]);
        }
        return id_byte[7];
    }

    public int id_break(String string) {
        if (rql_3.id_break(string)) {
            return id_break[5];
        }
        Matcher matcher = ((Pattern)rrjS_2.id_class[id_case[21]]).matcher(string);
        if (matcher.matches()) {
            int n = Integer.parseInt(matcher.group(id_byte[10]));
            int n2 = Integer.parseInt(matcher.group(id_break[6]));
            return n * id_break[7] + n2;
        }
        return id_break[8];
    }

    private void id_break(rrpZ_2 rrpZ_22) {
        if (rrpZ_22 != null) {
            ((cq_3)rrpm_3.id_import.id_class[id_case[25]]).id_extends().id_catch().remove(rrpZ_22.id_class());
        }
    }

    private static void id_throws() {
        id_protected = new String[]{new String("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e\n\u043e \u0448\u0430\u0445\u0442\u0435 \u0432 \u0432\u0438\u0434\u0435 \u0431\u043e\u0441\u0441\u0431\u0430\u0440\u0430"), new String("\u041f\u0440\u043e\u0438\u0437\u043e\u0448\u043b\u043e \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435 \u0448\u0430\u0445\u0442\u044b"), new String("\n \u2022 \u0423\u0440\u043e\u0432\u0435\u043d\u044c: "), new String("\n \u2022 \u041e\u0441\u0442\u0430\u043b\u043e\u0441\u044c: "), new String("%02d")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpm_3.id_byte();
        rrpm_3.id_throws();
        rrpm_3.id_implements();
        rrpm_3.id_protected();
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private static void id_implements() {
        short[] sArray = new short[26];
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 19;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 56;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 19;
        id_case = sArray;
    }

    private static void id_protected() {
        id_break = new byte[]{-1, -1, -1, -1, 20, -1, 2, 60, -1, 60, 60, 2};
    }

    private void id_private() {
        this.id_case();
        if ((rrpZ_2)this.id_class[id_case[22]] != null) {
            this.id_break((rrpZ_2)this.id_class[id_case[23]]);
            Object var5_1 = null;
            this.id_class[rrpm_3.id_case[24]] = var5_1;
        }
    }

    @Override
    public boolean aK_() {
        this.id_class();
        return super.aK_();
    }
}

