/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rrfu_3;
import celestial.rrqd_3;
import celestial.rrqz_3;
import celestial.rrtQ_2;
import celestial.rrtd_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.u_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqv_3
implements rrqd_3 {
    private static String[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[20];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[6] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[11] = 2000;
        sArray[13] = 2000;
        sArray[15] = 2000;
        sArray[17] = 2000;
        sArray[19] = 2000;
        id_break = sArray;
    }

    static {
        rrqv_3.ntfClinit();
    }

    public String id_class(rrqz_3 rrqz_32) {
        return "'" + rrqz_32.id_byte().id_native().getString() + "'";
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1E7675E5F5FF7A0AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-86, 61, 127, 64, 35, 118, -107, 9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x80101783;
    }

    @Override
    public void id_class(Collection<rrqz_3> collection) {
        if (collection.isEmpty()) {
            String string = id_class[18];
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[16]]).id_class(new rrtd_3(id_class[19], string, (int)id_break[17]));
            rrfu_3.id_byte(string);
            MinecraftAccessor.a_("X-Ray: " + string, id_byte[0]);
            return;
        }
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[18]]).id_class(new rrtd_3(id_class[20], id_class[21], (int)id_break[19]));
        MinecraftAccessor.a_(id_class[22], id_byte[1]);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        rgN_2 rgN_22 = new rgN_2(rgF_2.GRAY + "\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e, \u043d\u0430\u0439\u0434\u0435\u043d\u043e:\n");
        for (rrqz_3 object : collection) {
            String string = object.id_byte().id_native().getString();
            hashMap.put(string, hashMap.getOrDefault(string, id_byte[2]) + id_byte[3]);
        }
        int n = id_byte[4];
        for (Map.Entry entry : hashMap.entrySet()) {
            String string = (String)entry.getKey();
            Integer n2 = (Integer)entry.getValue();
            rgN_22.id_break(rgF_2.GRAY + "- " + rgF_2.WHITE + string).id_break(id_class[23]).id_break(rgF_2.RED + "x" + n2);
            if (n != hashMap.size() - id_byte[5]) {
                rgN_22.id_break(id_class[24]);
            }
            ++n;
        }
        rrfu_3.id_class(rgN_22);
    }

    @Override
    public void id_class(rrqz_3 rrqz_32, boolean bl) {
        String string = this.id_class(rrqz_32) + (bl ? id_class[0] : id_class[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(bl ? new rrtQ_2(id_class[2], string, (int)id_break[1]) : new rrtx_3(id_class[3], string, (int)id_break[2]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void id_class(String string, Exception exception) {
        u_1 u_12;
        String string2 = "'" + string + "'";
        String string3 = "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0438 " + string2;
        if (exception instanceof u_1 && (u_12 = (u_1)exception).getMessage().equals(id_class[4])) {
            string3 = "\u0411\u043b\u043e\u043a " + string2 + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0438\u043b\u0438 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0432\u043e\u0437\u0434\u0443\u0445\u043e\u043c";
        }
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(new rrtx_3(id_class[5], string3, (int)id_break[4]));
        rrfu_3.id_byte(string3);
    }

    @Override
    public void id_break(rrqz_3 rrqz_32, boolean bl) {
        String string = this.id_class(rrqz_32) + (bl ? id_class[6] : id_class[7]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[5]]).id_class(bl ? new rrtQ_2(id_class[8], string, (int)id_break[6]) : new rrtx_3(id_class[9], string, (int)id_break[7]));
        rrfu_3.id_byte(string);
    }

    private static /* synthetic */ void ntfClinit() {
        rrqv_3.id_class();
        rrqv_3.id_protected();
        rrqv_3.id_byte();
    }

    private static void id_protected() {
        id_class = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435"), new String("X-Ray"), new String("X-Ray"), new String("Block not found"), new String("X-Ray"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435"), new String("X-Ray"), new String("X-Ray"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("X-Ray"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432 \u043f\u0443\u0441\u0442"), new String("X-Ray"), new String("X-Ray"), new String("\u0432\u043e\u0437\u043e\u0431\u043d\u043e\u0432\u043b\u0451\u043d"), new String("\u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d"), new String("X-Ray"), new String("\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e"), new String("X-Ray"), new String("X-Ray"), new String("\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e"), new String("X-Ray: \u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e"), new String(" "), new String("\n")};
    }

    @Override
    public void a_(String string) {
        String string2 = "'" + string + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[12]]).id_class(new rrtx_3(id_class[14], string2, (int)id_break[13]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void g_(boolean bl) {
        String string = "X-Ray \u0431\u044b\u043b " + (bl ? id_class[15] : id_class[16]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[14]]).id_class(new rrtd_3(id_class[17], string, (int)id_break[15]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void g_() {
        String string = id_class[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtQ_2(id_class[11], string, (int)id_break[9]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void f_() {
        String string = id_class[12];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[13], string, (int)id_break[11]));
        rrfu_3.id_byte(string);
    }
}

