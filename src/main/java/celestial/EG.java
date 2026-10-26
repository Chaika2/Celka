/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_extends;
import celestial.C_finally;
import celestial.C_static;
import celestial.C_try;
import celestial.Pd_1;
import celestial.Ps_1;
import celestial.QY;
import celestial.W;
import celestial.Z;
import celestial.k_1;
import celestial.mT_2;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.v_1;
import celestial.vm_3;
import celestial.x_1;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EG
extends C_try {
    private static String[] id_break;
    private static short[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;

    public EG(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[EG.id_catch[0]] = id_break[0];
        stringArray[EG.id_catch[1]] = id_break[1];
        stringArray[EG.id_case[1]] = id_break[2];
        super(c_case, stringArray);
    }

    static {
        EG.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85B8814;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x91EB040A74609EBDL;
    }

    private void id_class(C_extends<?> c_extends, String string, boolean bl, String string2, String string3) {
        try {
            if (bl) {
                C_extends<?> c_extends2;
                if (c_extends.id_byte() != Boolean.class) {
                    this.id_case(id_break[35]);
                    return;
                }
                C_extends<?> c_extends3 = c_extends2 = c_extends;
                Boolean bl2 = (Boolean)c_extends3.id_class[id_throws[8]] ^ id_catch[31];
                c_extends3.id_class[EG.id_throws[9]] = bl2;
                Object[] objectArray = new Object[id_case[11]];
                objectArray[EG.id_catch[32]] = c_extends.id_protected();
                objectArray[EG.id_catch[33]] = c_extends.id_class[id_throws[10]];
                this.id_case(String.format(id_break[36], objectArray));
            } else if (string != null) {
                Pd_1.id_class(C_class.id_instanceof(), string3, string);
                Object[] objectArray = new Object[id_case[12]];
                objectArray[EG.id_catch[34]] = c_extends.id_protected();
                objectArray[EG.id_catch[35]] = Pd_1.id_break(c_extends);
                this.id_case(String.format(id_break[37], objectArray));
            }
            this.id_class(c_extends, string2);
            Pd_1.id_break(C_class.id_instanceof());
        }
        catch (Exception exception) {
            this.id_case("\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0438 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private void id_class(C_extends<?> c_extends, C_static c_static, boolean bl, boolean bl2, String string, String string2) throws x_1 {
        if (bl) {
            c_extends.id_break();
        } else if (bl2) {
            C_extends<?> c_extends2;
            if (c_extends.id_byte() != Boolean.class) {
                throw new W(c_static.id_private(), id_break[24], id_break[25]);
            }
            C_extends<?> c_extends3 = c_extends2 = c_extends;
            Boolean bl3 = (Boolean)c_extends3.id_class[id_throws[3]] ^ id_catch[20];
            c_extends3.id_class[EG.id_throws[4]] = bl3;
            Object[] objectArray = new Object[id_case[7]];
            objectArray[EG.id_catch[21]] = c_extends.id_protected();
            objectArray[EG.id_catch[22]] = c_extends.id_class[id_throws[5]];
            this.id_case(String.format(id_break[26], objectArray));
        } else {
            String string3 = c_static.id_extends();
            try {
                Pd_1.id_class(C_class.id_instanceof(), string2, string3);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                throw new W(c_static.id_private(), id_break[27], throwable);
            }
        }
        if (!bl2) {
            Object[] objectArray = new Object[id_case[8]];
            objectArray[EG.id_catch[23]] = bl ? id_break[29] : id_break[30];
            objectArray[EG.id_catch[24]] = c_extends.id_protected();
            objectArray[EG.id_case[9]] = Pd_1.id_break(c_extends);
            this.id_case(String.format(id_break[28], objectArray));
        }
        this.id_class(c_extends, string);
    }

    private void id_class(C_extends<?> c_extends, String string) {
        Object[] objectArray = new Object[id_catch[25]];
        objectArray[EG.id_catch[26]] = string;
        rVe_1 rVe_12 = new rVe_1(String.format(id_break[31], objectArray));
        Object[] objectArray2 = new Object[id_case[10]];
        objectArray2[EG.id_catch[27]] = c_extends.id_protected();
        objectArray2[EG.id_catch[28]] = string;
        rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.GRAY).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_break[32]))).id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_throws[6]] + String.format(id_break[33], objectArray2))));
        rVi_1[] rVi_1Array = new rVi_1[id_catch[29]];
        rVi_1Array[EG.id_catch[30]] = rVe_12;
        this.id_class(rVi_1Array);
    }

    private C_finally id_class(C_extends<?> c_extends) {
        try {
            Field[] fieldArray;
            Field[] fieldArray2 = fieldArray = C_class.id_instanceof().getClass().getFields();
            int n = fieldArray2.length;
            for (int i = id_catch[19]; i < n; ++i) {
                Field field = fieldArray2[i];
                if (!field.getType().equals(C_extends.class)) continue;
                try {
                    C_extends c_extends2 = (C_extends)field.get(C_class.id_instanceof());
                    if (c_extends2 != c_extends) continue;
                    return field.getAnnotation(C_finally.class);
                }
                catch (IllegalAccessException illegalAccessException) {
                    illegalAccessException.printStackTrace();
                    this.id_case("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043f\u043e\u043b\u0443\u0447\u0438\u0442\u044c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 " + field.getName());
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.id_case("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043f\u043e\u043b\u0443\u0447\u0438\u0442\u044c \u0430\u043d\u043d\u043e\u0442\u0430\u0446\u0438\u044e \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u044f \u0434\u043b\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 " + c_extends.id_protected());
        }
        return null;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        boolean bl;
        boolean bl2;
        String string2 = c_static.id_final() ? c_static.id_extends().toLowerCase(Locale.US) : id_break[3];
        String[] stringArray = new String[id_case[2]];
        stringArray[EG.id_catch[2]] = id_break[4];
        stringArray[EG.id_catch[3]] = id_break[5];
        if (Arrays.asList(stringArray).contains(string2)) {
            Pd_1.id_break(C_class.id_instanceof());
            this.id_case(id_break[6]);
            return;
        }
        String[] stringArray2 = new String[id_case[3]];
        stringArray2[EG.id_catch[4]] = id_break[7];
        stringArray2[EG.id_catch[5]] = id_break[8];
        stringArray2[EG.id_case[4]] = id_break[9];
        boolean bl3 = Arrays.asList(stringArray2).contains(string2);
        String[] stringArray3 = new String[id_case[5]];
        stringArray3[EG.id_catch[6]] = id_break[10];
        stringArray3[EG.id_catch[7]] = id_break[11];
        stringArray3[EG.id_case[6]] = id_break[12];
        boolean bl4 = Arrays.asList(stringArray3).contains(string2);
        boolean bl5 = bl2 = bl3 || bl4 ? id_catch[8] : id_catch[9];
        if (bl2) {
            String string3 = c_static.id_final() && c_static.id_throws(Integer.class) == null ? c_static.id_extends() : id_break[13];
            c_static.id_class(id_catch[10]);
            List list = (bl3 ? Pd_1.id_class(C_class.id_instanceof()) : (List)C_class.id_instanceof().Pj[id_throws[0]]).stream().filter(c_extends -> !Pd_1.id_throws(c_extends) ? id_catch[63] : id_catch[64]).filter(c_extends -> c_extends.id_protected().toLowerCase(Locale.US).contains(string3.toLowerCase(Locale.US))).sorted((c_extends, c_extends2) -> String.CASE_INSENSITIVE_ORDER.compare(c_extends.id_protected(), c_extends2.id_protected())).collect(Collectors.toList());
            Z.id_class(c_static, new Z(list), () -> {
                String string2;
                if (!string3.isEmpty()) {
                    Object[] objectArray = new Object[id_case[31]];
                    objectArray[EG.id_catch[59]] = bl3 ? id_break[73] : id_break[74];
                    objectArray[EG.id_catch[60]] = string3;
                    string2 = String.format(id_break[72], objectArray);
                } else {
                    Object[] objectArray = new Object[id_catch[61]];
                    objectArray[EG.id_catch[62]] = bl3 ? id_break[76] : id_break[77];
                    string2 = String.format(id_break[75], objectArray);
                }
                this.id_case(string2);
            }, c_extends -> {
                Object[] objectArray = new Object[id_catch[49]];
                objectArray[EG.id_catch[50]] = Pd_1.id_protected(c_extends);
                rgN_2 rgN_22 = new rgN_2(String.format(id_break[66], objectArray));
                rgN_22.id_class(rgN_22.id_class().id_class(rgF_2.DARK_GRAY));
                rgN_2 rgN_23 = new rgN_2(id_break[67]);
                rgN_23.id_class(rgN_23.id_class().id_class(rgF_2.GRAY));
                rgN_23.id_break(c_extends.id_protected());
                Object[] objectArray2 = new Object[id_catch[51]];
                objectArray2[EG.id_catch[52]] = Pd_1.id_protected(c_extends);
                rgN_23.id_break(String.format(id_break[68], objectArray2));
                Object[] objectArray3 = new Object[id_catch[53]];
                objectArray3[EG.id_catch[54]] = Pd_1.id_break(c_extends);
                rgN_23.id_break(String.format(id_break[69], objectArray3));
                Object[] objectArray4 = new Object[id_catch[55]];
                objectArray4[EG.id_catch[56]] = Pd_1.id_class(c_extends);
                rgN_23.id_break(String.format(id_break[70], objectArray4));
                Object[] objectArray5 = new Object[id_catch[57]];
                objectArray5[EG.id_catch[58]] = c_extends.id_protected();
                String string = (String)C_class.id_instanceof().id_protected.id_class[id_throws[13]] + String.format(id_break[71], objectArray5);
                rVe_1 rVe_12 = new rVe_1(c_extends.id_protected());
                rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.GRAY));
                rVe_12.id_class(rgN_22);
                rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rgN_23)).id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, string)));
                return rVe_12;
            }, (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]] + "set " + string2 + " " + string3);
            return;
        }
        c_static.id_class(id_catch[11]);
        boolean bl6 = string2.equalsIgnoreCase(id_break[14]);
        boolean bl7 = string2.equalsIgnoreCase(id_break[15]);
        boolean bl8 = bl = bl6 || bl7 ? id_catch[12] : id_catch[13];
        if (bl6) {
            if (!c_static.id_final()) {
                this.id_case(id_break[16]);
                this.id_case(id_break[17]);
                this.id_case(id_break[18]);
            } else if (c_static.id_implements().equalsIgnoreCase(id_break[19])) {
                Pd_1.id_class(C_class.id_instanceof()).forEach(C_extends::id_break);
                this.id_case(id_break[20]);
                Pd_1.id_break(C_class.id_instanceof());
                return;
            }
        }
        if (bl7) {
            c_static.id_private(id_catch[14]);
        }
        String string4 = bl ? c_static.id_extends() : string2;
        C_extends c_extends3 = ((List)C_class.id_instanceof().Pj[id_throws[2]]).stream().filter(c_extends -> c_extends.id_protected().equalsIgnoreCase(string4)).findFirst().orElse(null);
        if (c_extends3 == null) {
            throw new W(c_static.id_private(), id_break[21]);
        }
        if (Pd_1.id_throws(c_extends3)) {
            Object[] objectArray = new Object[id_catch[15]];
            objectArray[EG.id_catch[16]] = c_extends3.id_protected();
            throw new k_1(String.format(id_break[22], objectArray));
        }
        if (!bl && !c_static.id_final()) {
            Object[] objectArray = new Object[id_catch[17]];
            objectArray[EG.id_catch[18]] = c_extends3.id_protected();
            this.id_case(String.format(id_break[23], objectArray));
            this.id_case(Pd_1.id_break(c_extends3));
        } else {
            C_finally c_finally;
            String string5 = Pd_1.id_break(c_extends3);
            if (!bl6 && (c_finally = this.id_class(c_extends3)) != null) {
                String string6 = c_static.id_final() ? c_static.id_extends() : null;
                this.id_class(c_extends3, string6, bl7, string5, string2, c_finally);
                return;
            }
            this.id_class(c_extends3, c_static, bl6, bl7, string5, string2);
        }
        Pd_1.id_break(C_class.id_instanceof());
    }

    private void id_class(C_extends<?> c_extends, String string, boolean bl, String string2, String string3, C_finally c_finally) {
        try {
            QY qY = ((Ps_1)this.id_class[id_throws[7]]).id_throws();
            mT_2 mT_22 = new mT_2(bl2 -> {
                if (bl2) {
                    this.id_class(c_extends, string, bl, string2, string3);
                } else {
                    this.id_case(id_break[65]);
                }
                qY.id_break((vm_3)null);
            }, new rgn_3(c_finally.id_class()), new rgn_3(c_finally.id_break()));
            qY.id_private(() -> qY.id_break(mT_22));
        }
        catch (Exception exception) {
            this.id_case(id_break[34]);
            this.id_class(c_extends, string, bl, string2, string3);
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{80, -8, -88, 105, 112, -30, 64, -97}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (!c_static.id_final()) return Stream.empty();
        String string2 = c_static.id_extends();
        if (c_static.id_case()) {
            String[] stringArray = new String[id_case[13]];
            stringArray[EG.id_catch[36]] = id_break[38];
            stringArray[EG.id_catch[37]] = id_break[39];
            if (!Arrays.asList(stringArray).contains(c_static.id_implements().toLowerCase(Locale.US))) {
                if (string2.equalsIgnoreCase(id_break[40])) {
                    String[] stringArray2 = new String[id_catch[38]];
                    stringArray2[EG.id_catch[39]] = id_break[41];
                    return new v_1().id_case().id_class(stringArray2).id_class(c_static.id_extends()).id_protected();
                }
                if (string2.equalsIgnoreCase(id_break[42])) {
                    return new v_1().id_throws().id_class(c_static.id_extends()).id_protected();
                }
                C_extends c_extends = (C_extends)((Map)C_class.id_instanceof().Pj[id_throws[11]]).get(string2.toLowerCase(Locale.US));
                if (c_extends == null) return Stream.empty();
                if (c_extends.id_throws() != Boolean.class) return Stream.of(Pd_1.id_break(c_extends));
                v_1 v_12 = new v_1();
                if (((Boolean)c_extends.id_class[id_throws[12]]).booleanValue()) {
                    String[] stringArray3 = new String[id_case[14]];
                    stringArray3[EG.id_catch[40]] = id_break[43];
                    stringArray3[EG.id_catch[41]] = id_break[44];
                    v_12.id_break(stringArray3);
                    return v_12.id_class(c_static.id_extends()).id_protected();
                } else {
                    String[] stringArray4 = new String[id_case[15]];
                    stringArray4[EG.id_catch[42]] = id_break[45];
                    stringArray4[EG.id_catch[43]] = id_break[46];
                    v_12.id_break(stringArray4);
                }
                return v_12.id_class(c_static.id_extends()).id_protected();
            }
        }
        if (c_static.id_final()) return Stream.empty();
        String[] stringArray = new String[id_case[16]];
        stringArray[EG.id_catch[44]] = id_break[47];
        stringArray[EG.id_catch[45]] = id_break[48];
        stringArray[EG.id_case[17]] = id_break[49];
        stringArray[EG.id_case[18]] = id_break[50];
        stringArray[EG.id_case[19]] = id_break[51];
        return new v_1().id_byte().id_break().id_class(stringArray).id_class(string2).id_protected();
    }

    private static void id_throws() {
        id_case = new byte[]{3, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 5, 2, 3, 4, 12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        EG.id_extends();
        EG.id_protected();
        EG.id_finally();
        EG.id_throws();
    }

    private static void id_finally() {
        short[] sArray = new short[14];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[7] = 1;
        id_throws = sArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[20]];
        stringArray[EG.id_catch[46]] = id_break[53];
        stringArray[EG.id_catch[47]] = id_break[54];
        stringArray[EG.id_case[21]] = id_break[55];
        stringArray[EG.id_case[22]] = id_break[56];
        stringArray[EG.id_case[23]] = id_break[57];
        stringArray[EG.id_case[24]] = id_break[58];
        stringArray[EG.id_case[25]] = id_break[59];
        stringArray[EG.id_case[26]] = id_break[60];
        stringArray[EG.id_case[27]] = id_break[61];
        stringArray[EG.id_case[28]] = id_break[62];
        stringArray[EG.id_case[29]] = id_break[63];
        stringArray[EG.id_case[30]] = id_break[64];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[65];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[38] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[48] = true;
        blArray[49] = true;
        blArray[51] = true;
        blArray[53] = true;
        blArray[55] = true;
        blArray[57] = true;
        blArray[60] = true;
        blArray[61] = true;
        blArray[63] = true;
        id_catch = blArray;
    }

    @Override
    public boolean id_case() {
        return id_catch[48];
    }

    @Override
    public String id_implements() {
        return id_break[52];
    }

    private static void id_protected() {
        id_break = new String[]{new String("set"), new String("setting"), new String("settings"), new String("list"), new String("s"), new String("save"), new String("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u044b"), new String("m"), new String("mod"), new String("modified"), new String("all"), new String("l"), new String("list"), new String(""), new String("reset"), new String("toggle"), new String("\u041f\u043e\u0436\u0430\u043b\u0443\u0439\u0441\u0442\u0430, \u0443\u043a\u0430\u0436\u0438\u0442\u0435 'all' \u0432 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u0435 \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u0430 \u0434\u043b\u044f \u0441\u0431\u0440\u043e\u0441\u0430, \u0447\u0442\u043e\u0431\u044b \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u044c, \u0447\u0442\u043e \u0432\u044b \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u0445\u043e\u0442\u0438\u0442\u0435 \u0441\u0434\u0435\u043b\u0430\u0442\u044c \u044d\u0442\u043e."), new String("\u0412\u0441\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0431\u0443\u0434\u0443\u0442 \u0441\u0431\u0440\u043e\u0448\u0435\u043d\u044b. \u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u044b 'set modified' \u0438\u043b\u0438 'modified', \u0447\u0442\u043e\u0431\u044b \u0443\u0432\u0438\u0434\u0435\u0442\u044c, \u043a\u0430\u043a\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0431\u0443\u0434\u0443\u0442 \u0441\u0431\u0440\u043e\u0448\u0435\u043d\u044b."), new String("\u0423\u043a\u0430\u0436\u0438\u0442\u0435 \u0438\u043c\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0432\u043c\u0435\u0441\u0442\u043e 'all', \u0447\u0442\u043e\u0431\u044b \u0441\u0431\u0440\u043e\u0441\u0438\u0442\u044c \u0442\u043e\u043b\u044c\u043a\u043e \u043e\u0434\u043d\u0443 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0443"), new String("all"), new String("\u0412\u0441\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0431\u044b\u043b\u0438 \u0441\u0431\u0440\u043e\u0448\u0435\u043d\u044b \u0434\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0439 \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e"), new String("\u0432\u0430\u043b\u0438\u0434\u043d\u0430\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430"), new String("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 %s \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0430 \u0442\u043e\u043b\u044c\u043a\u043e \u0447\u0435\u0440\u0435\u0437 api."), new String("Value of setting %s:"), new String("\u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0430\u0435\u043c\u0430\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430"), new String("\u0434\u0440\u0443\u0433\u0438\u0435 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u044b"), new String("\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 %s \u043d\u0430 %s"), new String("a valid value"), new String("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \"%s %s\" \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0430 \u043d\u0430 %s"), new String("reset"), new String("set"), new String("\u0421\u0442\u0430\u0440\u043e\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435: %s"), new String("\u041d\u0430\u0436\u043c\u0438\u0442\u0435, \u0447\u0442\u043e\u0431\u044b \u0432\u0435\u0440\u043d\u0443\u0442\u044c \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0443 \u043a \u0434\u0430\u043d\u043d\u043e\u043c\u0443 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044e"), new String("set %s %s"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0434\u0438\u0430\u043b\u043e\u0433 \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u044f, \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u043c \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435..."), new String("\u041e\u0448\u0438\u0431\u043a\u0430: \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0430"), new String("\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 %s \u043d\u0430 %s"), new String("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \"set %s\" \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0430 \u043d\u0430 %s"), new String("s"), new String("save"), new String("reset"), new String("all"), new String("toggle"), new String("true"), new String("false"), new String("false"), new String("true"), new String("list"), new String("modified"), new String("reset"), new String("toggle"), new String("save"), new String("\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0435\u043a \u0431\u0430\u0440\u0438\u0442\u043e\u043d\u0430"), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044f \u043a\u043e\u043c\u0430\u043d\u0434\u0443 set, \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u0443\u043f\u0440\u0430\u0432\u043b\u044f\u0442\u044c \u0432\u0441\u0435\u043c\u0438 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430\u043c\u0438 Celestial. \u041f\u0440\u0430\u043a\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0430\u0436\u0434\u044b\u0439 \u0430\u0441\u043f\u0435\u043a\u0442 \u043a\u043e\u043d\u0442\u0440\u043e\u043b\u0438\u0440\u0443\u0435\u0442\u0441\u044f \u044d\u0442\u0438\u043c\u0438 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430\u043c\u0438 - \u0431\u0443\u0434\u044c\u0442\u0435 \u0443\u0432\u0435\u0440\u0435\u043d\u044b!"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> set - \u0422\u043e \u0436\u0435 \u0441\u0430\u043c\u043e\u0435, \u0447\u0442\u043e \u0438 `set list`."), new String("> set list [\u0441\u0442\u0440\u0430\u043d\u0438\u0446\u0430] - \u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440 \u0432\u0441\u0435\u0445 \u043d\u0430\u0441\u0442\u0440\u043e\u0435\u043a"), new String("> set modified [\u0441\u0442\u0440\u0430\u043d\u0438\u0446\u0430] - \u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u043d\u044b\u0445 \u043d\u0430\u0441\u0442\u0440\u043e\u0435\u043a"), new String("> set <\u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430> - \u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440 \u0442\u0435\u043a\u0443\u0449\u0435\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438"), new String("> set <\u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430> <\u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u0430"), new String("> set reset all - \u0421\u0431\u0440\u043e\u0441\u0438\u0442\u044c \u0412\u0421\u0415 \u041d\u0410\u0421\u0422\u0420\u041e\u0419\u041a\u0418 \u043d\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e"), new String("> set reset <\u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430> - \u0421\u0431\u0440\u043e\u0441 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u043d\u0430 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e"), new String("> set toggle <\u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430> - \u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0441 true \u043d\u0430 false \u0438 \u043d\u0430\u043e\u0431\u043e\u0440\u043e\u0442"), new String("> set save - \u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0432\u0441\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 (\u044d\u0442\u043e \u043f\u0440\u043e\u0438\u0441\u0445\u043e\u0434\u0438\u0442 \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438)"), new String("\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u043e\u0442\u043c\u0435\u043d\u0435\u043d\u043e"), new String(" (%s)"), new String(""), new String("\n\u0422\u0438\u043f: %s"), new String("\n\n\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435:\n%s"), new String("\n\n\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e:\n%s"), new String("set %s "), new String("All %ssettings containing the string '%s':"), new String("modified "), new String(""), new String("All %ssettings:"), new String("modified "), new String("")};
    }
}

