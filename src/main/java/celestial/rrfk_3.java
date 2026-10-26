/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Zg_1;
import celestial.cb_3;
import celestial.cm_3;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rrZH;
import celestial.rrfJ_2;
import celestial.rrfW_2;
import celestial.rrfx_3;
import celestial.rrfz_3;
import celestial.rrjv_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rsE_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfk_3
extends vm_3
implements Zg_1 {
    private static int[] id_case;
    public Object[] id_class;
    private static short[] id_catch;
    private static boolean[] id_private;
    private static double[] id_implements;
    private static float[] id_finally;
    private static String[] id_else;
    private static byte[] id_synchronized;
    public static Object[] id_throws;

    private static void id_char() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_private = blArray;
    }

    @Override
    public rdn_3 id_byte() {
        this.id_long();
        return (rrfz_3)this.id_class[id_catch[26]] != null ? ((rrfz_3)this.id_class[id_catch[27]]).id_protected().id_class() : null;
    }

    private static void id_int() {
        id_implements = new double[]{40.0};
    }

    private void id_long() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static void id_float() {
        id_synchronized = new byte[]{70, 25, 25, 10, 16, 3, 2};
    }

    public rrfk_3() {
        super(rgN_2.id_byte);
        this.id_long();
        rrfW_2 rrfW_22 = new rrfW_2(this);
        this.id_class[rrfk_3.id_catch[0]] = rrfW_22;
        rrZH rrZH2 = new rrZH(id_finally[0]);
        this.id_class[rrfk_3.id_catch[1]] = rrZH2;
        ((List)this.id_class[id_catch[2]]).sort(Comparator.comparingInt(rrfz_32 -> rrfz_32.id_class().ordinal()));
    }

    static {
        rrfk_3.ntfClinit();
    }

    private static void id_interface() {
        id_case = new int[]{0xFFFFFF, 0xFFFFFF};
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        this.id_long();
        ((rrZH)this.id_class[id_catch[19]]).id_class(id_private[3], d3, id_implements[0]);
        return super.id_class(d, d2, d3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, 53, -23, -7, -41, 38, 124, 46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x956AF5198ECDA7C4L;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        Object object;
        this.id_long();
        super.id_class(ml_1, n, n2, f);
        this.id_class(ml_1);
        float f2 = id_finally[1];
        int n3 = this.id_finally();
        ((rrZH)this.id_class[id_catch[3]]).id_class(n3, id_import.id_else().id_this() - id_synchronized[0]);
        float f3 = ((rrZH)this.id_class[id_catch[4]]).id_case();
        Object var19_8 = null;
        this.id_class[rrfk_3.id_catch[5]] = var19_8;
        float f4 = id_import.id_else().id_package() - id_finally[2];
        for (int i = id_private[0]; i < ((List)this.id_class[id_catch[6]]).size(); ++i) {
            rrfz_3 object2 = (rrfz_3)((List)this.id_class[id_catch[7]]).get(i);
            object2.id_byte(f4);
            object = object2.id_protected();
            rgP_2 rgP_22 = ((rrfJ_2)object).id_byte();
            rdn_3 rdn_32 = ((rrfJ_2)object).id_class();
            String string = ((rrfx_3)((Object)object2.id_class[id_catch[8]])).id_protected().name();
            id_import.id_float().id_class(rdn_32, (int)object2.id_throws(), (int)object2.id_break());
            ((cm_3)rrfk_3.id_import.id_class[id_catch[9]]).id_break(ml_1, rgP_22, object2.id_throws() + id_finally[3], object2.id_break() + id_finally[4], id_case[0]);
            if (object2.id_class(n, n2)) {
                rrfz_3 rrfz_32 = object2;
                this.id_class[rrfk_3.id_catch[10]] = rrfz_32;
                this.id_class(ml_1, rdn_32, n, n2);
            }
            f2 = i > 0 && !((rrfz_3)((List)this.id_class[id_catch[11]]).get(i - id_private[1])).id_class().id_protected().equals((Object)object2.id_class().id_protected()) ? (f2 += id_finally[5]) : (f2 += id_finally[6]);
            object2.id_break(f2);
            if (((Map)id_throws[id_catch[12]]).containsKey(string)) continue;
            ((Map)id_throws[id_catch[13]]).put(string, Float.valueOf(object2.id_break()));
        }
        for (Map.Entry entry : ((Map)id_throws[id_catch[14]]).entrySet()) {
            object = rgF_2.STRIKETHROUGH + id_else[0].repeat(id_synchronized[1]) + rgF_2.RESET + (String)entry.getKey() + rgF_2.STRIKETHROUGH + id_else[1].repeat(id_synchronized[2]);
            float f5 = ((Float)entry.getValue()).floatValue();
            ((cm_3)rrfk_3.id_import.id_class[id_catch[15]]).id_break(ml_1, (String)object, id_import.id_else().id_package() - (float)((cm_3)rrfk_3.id_import.id_class[id_catch[16]]).id_break((String)object) / id_finally[7], f3 - id_finally[8] + f5, id_case[1]);
        }
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_long();
        for (rrfz_3 rrfz_32 : (List)this.id_class[id_catch[20]]) {
            if (!rrfz_32.id_class((float)d, (float)d2)) continue;
            if (!id_import.id_finally()) {
                String string = id_else[2];
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[21]]).id_class(new rrtx_3(id_else[3], string, (int)id_catch[22]));
                return id_private[4];
            }
            rYB rYB2 = rrjv_3.id_class();
            rYB2.a_(new rsE_2(rYB2, ((cb_3)rrfk_3.id_import.id_class[id_catch[23]]).rx(), ((cb_3)rrfk_3.id_import.id_class[id_catch[24]]).re(), ((cb_3)rrfk_3.id_import.id_class[id_catch[25]]).BO(), rrfz_32.id_protected().id_class()));
            break;
        }
        return super.id_break(d, d2, n);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8D249D3F;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfk_3.id_char();
        rrfk_3.id_abstract();
        rrfk_3.id_package();
        rrfk_3.id_native();
        rrfk_3.id_int();
        rrfk_3.id_float();
        rrfk_3.id_interface();
        rrfk_3.id_final();
    }

    public int id_finally() {
        this.id_long();
        int n = id_private[2];
        n += ((List)this.id_class[id_catch[17]]).stream().mapToInt(rrfz_32 -> id_synchronized[4]).sum();
        return n += ((Map)id_throws[id_catch[18]]).size() * id_synchronized[3];
    }

    private static void id_package() {
        short[] sArray = new short[28];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[8] = 3;
        sArray[9] = 15;
        sArray[10] = 2;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 15;
        sArray[16] = 15;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[22] = 3000;
        sArray[23] = 57;
        sArray[24] = 57;
        sArray[25] = 57;
        sArray[26] = 2;
        sArray[27] = 2;
        id_catch = sArray;
    }

    private static void id_abstract() {
        id_else = new String[]{new String(" "), new String(" "), new String("\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0432\u044b\u0434\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u043d\u0435 \u0432 \u043e\u0434\u0438\u043d\u043e\u0447\u043d\u043e\u0439 \u0438\u0433\u0440\u0435"), new String("Items Menu")};
    }

    private static void id_final() {
        Object[] objectArray = new Object[]{new rrfk_3(), new HashMap()};
        id_throws = objectArray;
    }

    private static void id_native() {
        float[] fArray = new float[9];
        fArray[0] = 0.5f;
        fArray[2] = 70.0f;
        fArray[3] = 20.0f;
        fArray[4] = 5.0f;
        fArray[5] = 32.0f;
        fArray[6] = 16.0f;
        fArray[7] = 2.0f;
        fArray[8] = 10.0f;
        id_finally = fArray;
    }
}

