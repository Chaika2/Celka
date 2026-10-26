/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.Qj_1;
import celestial.rgN_2;
import celestial.rruN;
import celestial.rruQ;
import celestial.rruz_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruc_1
extends Enum<rruc_1> {
    private static boolean[] booleans8976bba2dba834c8b8aad687eeef9d7a;
    private static short[] shorts8976bba2dba834c8b8aad687eeef9d7a;
    private static byte[] bytes8976bba2dba834c8b8aad687eeef9d7a;
    public Object[] fields8976bba2dba834c8b8aad687eeef9d7a;
    public static Object[] staticFields8976bba2dba834c8b8aad687eeef9d7a;
    private static String[] strings8976bba2dba834c8b8aad687eeef9d7a;

    private static /* synthetic */ rruc_1[] id_byte() {
        rruc_1[] rruc_1Array = new rruc_1[booleans8976bba2dba834c8b8aad687eeef9d7a[4]];
        rruc_1Array[rruc_1.booleans8976bba2dba834c8b8aad687eeef9d7a[5]] = (rruc_1)((Object)staticFields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[30]]);
        return rruc_1Array;
    }

    private rruc_1() {
        LinkedHashMap linkedHashMap;
        this.id_protected();
        this.fields8976bba2dba834c8b8aad687eeef9d7a[rruc_1.shorts8976bba2dba834c8b8aad687eeef9d7a[1]] = linkedHashMap = new LinkedHashMap();
    }

    static {
        rruc_1.ntfClinit();
    }

    public static rruc_1[] values() {
        return (rruc_1[])((rruc_1[])staticFields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[0]]).clone();
    }

    public static rruc_1 valueOf(String string) {
        return Enum.valueOf(rruc_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x11B9AA34;
    }

    public void id_class(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : ((Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[26]]).entrySet()) {
            rruz_1 rruz_12 = (rruz_1)entry.getKey();
            List list = (List)entry.getValue();
            if (!rruz_12.id_class().equals(strings8976bba2dba834c8b8aad687eeef9d7a[32])) continue;
            stringBuilder.append(strings8976bba2dba834c8b8aad687eeef9d7a[33]).append(rruz_12.id_class()).append(strings8976bba2dba834c8b8aad687eeef9d7a[34]).append(rruz_12.id_break()).append(strings8976bba2dba834c8b8aad687eeef9d7a[35]);
            for (int i = booleans8976bba2dba834c8b8aad687eeef9d7a[2]; i < list.size(); ++i) {
                rruQ rruQ2 = (rruQ)list.get(i);
                stringBuilder.append(rruQ2.id_byte().id_class()).append(strings8976bba2dba834c8b8aad687eeef9d7a[36]).append(rruQ2.id_class().getString());
                if (rruQ2.id_break() != null) {
                    stringBuilder.append(strings8976bba2dba834c8b8aad687eeef9d7a[37]).append(rruQ2.id_break().getString()).append(strings8976bba2dba834c8b8aad687eeef9d7a[38]);
                }
                if (i == list.size() - booleans8976bba2dba834c8b8aad687eeef9d7a[3]) continue;
                stringBuilder.append(strings8976bba2dba834c8b8aad687eeef9d7a[39]);
            }
        }
        System.out.println(stringBuilder);
        if (bl) {
            ((Qj_1)QY.id_instanceof().id_class[shorts8976bba2dba834c8b8aad687eeef9d7a[27]]).id_class(stringBuilder.toString());
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-10, -30, -49, 0, -102, 53, 59, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCEC13295DCF833C9L;
    }

    public void id_class(rruz_1 rruz_12, List<rruQ> list) {
        ((Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[28]]).put(rruz_12, list);
    }

    public Map<rruz_1, List<rruQ>> id_class() {
        return (Map)this.fields8976bba2dba834c8b8aad687eeef9d7a[shorts8976bba2dba834c8b8aad687eeef9d7a[29]];
    }

    public void id_break() {
        rruQ[] rruQArray = new rruQ[bytes8976bba2dba834c8b8aad687eeef9d7a[0]];
        rruQArray[rruc_1.booleans8976bba2dba834c8b8aad687eeef9d7a[0]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[2]), new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[3]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[2]]));
        rruQArray[rruc_1.booleans8976bba2dba834c8b8aad687eeef9d7a[1]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[4]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[3]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[1]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[5]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[4]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[2]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[6]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[5]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[3]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[7]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[6]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[4]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[8]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[7]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[5]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[9]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[8]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[6]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[10]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[9]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[7]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[11]), new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[12]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[10]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[8]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[13]), new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[14]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[11]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[9]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[15]), new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[16]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[12]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[10]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[17]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[13]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[11]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[18]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[14]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[12]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[19]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[15]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[13]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[20]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[16]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[14]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[21]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[17]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[15]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[22]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[18]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[16]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[23]), new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[24]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[19]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[17]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[25]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[20]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[18]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[26]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[21]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[19]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[27]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[22]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[20]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[28]), new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[29]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[23]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[21]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[30]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[24]]));
        rruQArray[rruc_1.bytes8976bba2dba834c8b8aad687eeef9d7a[22]] = new rruQ(new rgN_2(strings8976bba2dba834c8b8aad687eeef9d7a[31]), (rruN)((Object)rruN.staticFields36ebb780c771397e903bfcb65c8ed147[shorts8976bba2dba834c8b8aad687eeef9d7a[25]]));
        this.id_class(new rruz_1(strings8976bba2dba834c8b8aad687eeef9d7a[0], strings8976bba2dba834c8b8aad687eeef9d7a[1]), List.of(rruQArray));
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[9] = true;
        booleans8976bba2dba834c8b8aad687eeef9d7a = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruc_1.id_throws();
        rruc_1.id_case();
        rruc_1.id_implements();
        rruc_1.id_catch();
        rruc_1.id_private();
    }

    private static void id_catch() {
        bytes8976bba2dba834c8b8aad687eeef9d7a = new byte[]{24, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 2};
    }

    private static void id_case() {
        strings8976bba2dba834c8b8aad687eeef9d7a = new String[]{new String("1.1"), new String("25/05/2026"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0440\u0435\u0436\u0438\u043c \"SpookyTime\" \u0432 AttackAura"), new String("\u0421\u0430\u043c\u0430\u044f \u043b\u0443\u0447\u0448\u0430\u044f \u0438 \u0431\u044b\u0441\u0442\u0440\u0430\u044f AttackAura \u0441\u0440\u0435\u0434\u0438 \u0432\u0441\u0435\u0445 \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0440\u0435\u0436\u0438\u043c \"SpookyTime\" \u0432 NoSlow"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0440\u0435\u0436\u0438\u043c \"SpookyTime\" \u0432 KeepSprint"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0440\u0435\u0436\u0438\u043c \"JumpReset\" \u0432 Velocity"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0447\u0435\u043a\u0431\u043e\u043a\u0441 \"\u041f\u0438\u043d\u0433\" \u0432 ESP"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e \u0437\u0435\u043b\u044c\u0435 \u043f\u0440\u044b\u0433\u0443\u0447\u0435\u0441\u0442\u0438 \u0432 FTHelper"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0430 \u0441\u0438\u0441\u0442\u0435\u043c\u0430 \u0446\u0435\u043d\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u043f\u0435\u0440\u0435\u0442\u0430\u0441\u043a\u0438\u0432\u0430\u0435\u043c\u044b\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 HUD"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u044d\u043a\u0438\u043f\u0438\u0440\u043e\u0432\u043a\u0438 \u0446\u0435\u043b\u0438 \u0432 TargetHUD"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0447\u0435\u043a\u0431\u043e\u043a\u0441 \"\u041f\u0440\u0435\u0432\u044c\u044e \u0448\u0430\u043b\u043a\u0435\u0440\u0430\" \u0432 ESP"), new String("\u0414\u043e\u043b\u0433\u043e\u0436\u0434\u0430\u043d\u043d\u0430\u044f \u0444\u0443\u043d\u043a\u0446\u0438\u044f. \u0428\u0430\u043b\u043a\u0435\u0440\u044b \u043d\u0435 \u043f\u0435\u0440\u0435\u043a\u0440\u044b\u0432\u0430\u044e\u0442 \u0434\u0440\u0443\u0433 \u0434\u0440\u0443\u0433\u0430 - \u0443\u0434\u043e\u0431\u043d\u043e \u0440\u0430\u0441\u0441\u043c\u0430\u0442\u0440\u0438\u0432\u0430\u0442\u044c, \u043a\u0430\u043a\u0438\u0435 \u0440\u0435\u0441\u0443\u0440\u0441\u044b \u0432\u043d\u0443\u0442\u0440\u0438"), new String("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0430 \u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f \"\u0411\u0438\u043d\u0434\u044b \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432\" \u0432 HUD"), new String("\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0437\u0430\u0431\u0438\u043d\u0436\u0435\u043d\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0438\u0437 FT/HW Helper'\u043e\u0432, \u0438\u043c\u0435\u044e\u0449\u0438\u0435\u0441\u044f \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435"), new String("AutoBuy \u0442\u0435\u043f\u0435\u0440\u044c \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 SpookyTime"), new String("\u041b\u0443\u0447\u0448\u0438\u0439 AutoBuy \u0441\u0440\u0435\u0434\u0438 \u0432\u0441\u0435\u0445 \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 .rct \u0442\u0435\u043f\u0435\u0440\u044c \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 SpookyTime"), new String("StructureTimer \u0442\u0435\u043f\u0435\u0440\u044c \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 SpookyTime"), new String("AntiAFK \u0442\u0435\u043f\u0435\u0440\u044c \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 SpookyTime"), new String("\u0420\u0435\u0436\u0438\u043c \"\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\" \u0432 AutoLeave \u0442\u0435\u043f\u0435\u0440\u044c \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 SpookyTime"), new String("\u0417\u043d\u0430\u0447\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u0440\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0430 \u0438\u0441\u0442\u043e\u0440\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0432 AutoBuy - \u0431\u043e\u043b\u044c\u0448\u0435 \u0434\u0430\u043d\u043d\u044b\u0445 \u043f\u043e \u043a\u0430\u0436\u0434\u043e\u0439 \u043f\u043e\u043a\u0443\u043f\u043a\u0435"), new String("\u041f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043f\u0435\u0440\u0435\u043f\u0438\u0441\u0430\u043d AutoSprint - \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0430 \u043a\u0430\u0441\u0442\u043e\u043c\u043d\u0430\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u043e\u0434 \u043b\u044e\u0431\u043e\u0439 \u0430\u043d\u0442\u0438\u0447\u0438\u0442"), new String("\u0423\u043b\u0443\u0447\u0448\u0435\u043d AutoExp"), new String("\u0418\u0441\u043f\u0440\u0430\u0432\u043b\u0435\u043d \u0434\u0435\u0442\u0435\u043a\u0442 \u0432 \u043d\u0435\u043a\u043e\u0442\u043e\u0440\u044b\u0445 \u0430\u043d\u0442\u0438\u0447\u0438\u0442\u0430\u0445"), new String("\u0422\u0435\u043f\u0435\u0440\u044c \u0433\u043e\u043b\u043e\u0432\u0430 \u0446\u0435\u043b\u0438 \u0432 TargetHUD \u0437\u0435\u043b\u0435\u043d\u0435\u0435\u0442 \u043f\u0440\u0438 \u0432\u044b\u0438\u0433\u0440\u044b\u0448\u0435 \u0438 \u043a\u0440\u0430\u0441\u043d\u0435\u0435\u0442 \u043f\u0440\u0438 \u043f\u0440\u043e\u0438\u0433\u0440\u044b\u0448\u0435"), new String("\u0423\u043b\u0443\u0447\u0448\u0435\u043d\u044b \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438 \u0432 ClickGUI"), new String("\u0414\u043e\u0440\u0430\u0431\u043e\u0442\u0430\u043d\u044b \u043c\u0435\u043b\u043a\u0438\u0435 \u0434\u0435\u0442\u0430\u043b\u0438 \u0434\u043b\u044f \u0443\u043b\u0443\u0447\u0448\u0435\u043d\u0438\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0433\u043e \u043e\u043f\u044b\u0442\u0430"), new String("\u0420\u0435\u0436\u0438\u043c \"HolyWorld\" \u0432 GuiMove \u043f\u0435\u0440\u0435\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d \u0432 \"Advanced\""), new String("\u0421\u043e\u0432\u0435\u0442\u0443\u0435\u043c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0438\u043c\u0435\u043d\u043d\u043e \u044d\u0442\u043e\u0442 \u0440\u0435\u0436\u0438\u043c \u043d\u0430 SpookyTime"), new String("\u0418\u0441\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u043e \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u043b\u043e\u0433\u043e\u0442\u0438\u043f\u0430 \u043a\u043b\u0438\u0435\u043d\u0442\u0430 \u0432 DiscordRPC"), new String("\u0418\u0441\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u044b \u043a\u0440\u0430\u0448\u0438 \u0438 \u043f\u0440\u043e\u0447\u0438\u0435 \u043d\u0435\u0434\u043e\u0440\u0430\u0431\u043e\u0442\u043a\u0438"), new String("1.1"), new String("Build: "), new String(" ("), new String(")\n"), new String(" "), new String(" ("), new String(")"), new String("\n"), new String("INSTANCE")};
    }

    private static void id_implements() {
        short[] sArray = new short[31];
        sArray[0] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[27] = 23;
        shorts8976bba2dba834c8b8aad687eeef9d7a = sArray;
    }

    private void id_protected() {
        if (this.fields8976bba2dba834c8b8aad687eeef9d7a == null) {
            Object[] objectArray = this.fields8976bba2dba834c8b8aad687eeef9d7a = new Object[booleans8976bba2dba834c8b8aad687eeef9d7a[9]];
        }
    }

    private static void id_private() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new rruc_1();
        rruc_1[] rruc_1Array = new rruc_1[]{new rruc_1()};
        objectArray[1] = rruc_1Array;
        staticFields8976bba2dba834c8b8aad687eeef9d7a = objectArray;
    }
}

