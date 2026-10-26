/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ax_1;
import celestial.Fc_1;
import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.module.util.AutoAccept;
import celestial.rJY;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rdn_3;
import celestial.rqr_3;
import celestial.rrAZ;
import celestial.rrFo_1;
import celestial.rrIk_1;
import celestial.rrLO;
import celestial.rrTF;
import celestial.rrZW;
import celestial.rrlT_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.uj_3;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlq_3
extends rrTF<AutoAccept> {
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_case;
    private static String[] id_catch;
    public Object[] id_break;

    private void id_byte(String string) {
        ((cb_3)rrlq_3.id_import.id_class[id_protected[17]]).id_case("/duel team accept " + string);
    }

    private void id_byte() {
        ((cb_3)rrlq_3.id_import.id_class[id_protected[18]]).id_case(id_catch[7]);
    }

    public rrlq_3(AutoAccept autoAccept) {
        super(autoAccept);
        this.id_private();
        rrIk_1 rrIk_12 = (rrIk_1)new rrIk_1(id_catch[0], id_byte[0]).id_class(id_catch[1], (Setting<T> setting, Pair<T, Boolean> pair) -> {
            this.id_private();
            Object var7_3 = null;
            this.id_break[rrlq_3.id_protected[20]] = var7_3;
        });
        this.id_break[rrlq_3.id_protected[0]] = rrIk_12;
        rrIk_1 rrIk_13 = new rrIk_1(id_catch[2], id_byte[1]);
        this.id_break[rrlq_3.id_protected[1]] = rrIk_13;
        Setting[] settingArray = new Setting[id_case[0]];
        settingArray[rrlq_3.id_byte[2]] = (rrIk_1)this.id_break[id_protected[2]];
        settingArray[rrlq_3.id_byte[3]] = (rrIk_1)this.id_break[id_protected[3]];
        autoAccept.id_class(new GroupSetting(id_catch[3], settingArray));
    }

    static {
        rrlq_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrFo_1 rrFo_12) {
        Fc_1 fc_1;
        String string;
        this.id_private();
        vm_3 vm_32 = rrFo_12.id_break();
        if (vm_32 instanceof Fc_1 && this.id_break(string = (fc_1 = (Fc_1)vm_32).id_new().id_byte().toLowerCase())) {
            Object var9_5 = null;
            this.id_break[rrlq_3.id_protected[9]] = var9_5;
        }
    }

    private boolean id_class(rrLO rrLO2, String string) {
        this.id_private();
        if (((rrIk_1)this.id_break[id_protected[15]]).id_class().booleanValue()) {
            if (rrLO2.id_class() != null) {
                return id_byte[10];
            }
            return ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_protected[16]]).id_break(string);
        }
        return id_byte[11];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD4D8935;
    }

    @EventTarget
    public void id_class(rrLO rrLO2) {
        this.id_private();
        if (!((rrIk_1)this.id_break[id_protected[4]]).id_class().booleanValue() || rrLO2.id_class() != null) {
            return;
        }
        String string = rrLO2.id_protected();
        Pattern[] patternArray = (Pattern[])id_class[id_protected[5]];
        int n = patternArray.length;
        for (int i = id_byte[4]; i < n; ++i) {
            Pattern pattern = patternArray[i];
            Matcher matcher = pattern.matcher(string);
            if (!matcher.find()) continue;
            String string2 = matcher.group(id_byte[5]);
            if (!this.id_class(rrLO2, string2)) break;
            uj_3 uj_32 = ((cq_3)rrlq_3.id_import.id_class[id_protected[6]]).id_extends();
            String[] stringArray = new String[id_case[1]];
            stringArray[rrlq_3.id_byte[6]] = id_catch[4];
            stringArray[rrlq_3.id_byte[7]] = id_catch[5];
            if (uj_32.id_class(stringArray)) {
                this.id_byte();
            }
            this.id_byte(string2);
            rrlT_2 rrlT_22 = (rrlT_2)((Object)rrlT_2.staticFields8894b88cba4233cc950e42483f078233[id_protected[7]]);
            this.id_break[rrlq_3.id_protected[8]] = rrlT_22;
            break;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC5E36DDBADA391A0L;
    }

    @EventTarget
    public void id_class(rrAZ rrAZ2) {
        this.id_private();
        vm_3 vm_32 = rrAZ2.id_class();
        if ((rrlT_2)((Object)this.id_break[id_protected[10]]) == (rrlT_2)((Object)rrlT_2.staticFields8894b88cba4233cc950e42483f078233[id_protected[11]]) && vm_32 instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)vm_32;
            String string = fc_1.id_new().id_byte().toLowerCase();
            rXe_1 rXe_12 = (rXe_1)fc_1.G_();
            if (this.id_break(string)) {
                ((rqr_3)((cb_3)rrlq_3.id_import.id_class[rrlq_3.id_protected[12]]).id_break[rrlq_3.id_protected[13]]).id_finally = id_byte[8];
                List<rJY> list = rXe_12.id_class((rJY rJY2) -> this.id_class(rJY2.id_class()));
                if (!list.isEmpty()) {
                    ((Ax_1)rrlq_3.id_import.id_class[id_protected[14]]).id_class(rXe_12.id_case, list.get((int)rrlq_3.id_byte[9]).id_protected, id_case[2], rXa_1.CLONE);
                }
            }
        }
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        Pattern[] patternArray = new Pattern[]{Pattern.compile(id_catch[9], 0)};
        objectArray[0] = patternArray;
        id_class = objectArray;
    }

    private boolean id_class(rdn_3 rdn_32) {
        if (rdn_32 == null || rdn_32.id_class()) {
            return id_byte[12];
        }
        return rdn_32.id_continue().id_byte().equalsIgnoreCase(id_catch[8]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, -119, 77, 55, -81, 122, -1, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[17];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[16] = true;
        id_byte = blArray;
    }

    private boolean id_break(String string) {
        return string.contains(id_catch[6]);
    }

    private static void id_throws() {
        short[] sArray = new short[21];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[6] = 19;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[12] = 57;
        sArray[13] = 17;
        sArray[14] = 55;
        sArray[15] = 1;
        sArray[17] = 57;
        sArray[18] = 57;
        sArray[19] = 2;
        sArray[20] = 2;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlq_3.id_break();
        rrlq_3.id_case();
        rrlq_3.id_throws();
        rrlq_3.id_protected();
        rrlq_3.id_class();
    }

    private static void id_case() {
        id_catch = new String[]{new String("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e"), new String("enabled"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u043e\u0442 \u0434\u0440\u0443\u0437\u0435\u0439"), new String("\u0417\u0430\u043f\u0440\u043e\u0441 \u0432 \u043a\u043e\u043c\u0430\u043d\u0434\u0443"), new String("\u043f\u043e\u0438\u0441\u043a"), new String("\u0434\u0443\u044d\u043b\u0438"), new String("\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0435\u043d\u0438\u0435 \u0432 \u043a\u043e\u043c\u0430\u043d\u0434\u0443"), new String("/duel cancel"), new String("[\u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u044c]"), new String("\\[\u2694] \u0418\u0433\u0440\u043e\u043a (.*) \u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442 \u0432\u0430\u0441 (.*)")};
    }

    private static void id_protected() {
        id_case = new byte[]{2, 2, 2, 3};
    }

    private void id_private() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
        }
    }

    @Override
    public boolean aK_() {
        this.id_private();
        Object var5_1 = null;
        this.id_break[rrlq_3.id_protected[19]] = var5_1;
        return super.aK_();
    }
}

