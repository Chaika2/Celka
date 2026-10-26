/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C;
import celestial.C_case;
import celestial.C_extends;
import celestial.C_import;
import celestial.C_private;
import celestial.C_throw;
import celestial.C_throws;
import celestial.D;
import celestial.EJ;
import celestial.F;
import celestial.N;
import celestial.PP;
import celestial.Pd_1;
import celestial.Q;
import celestial.f_1;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rqj_3;
import celestial.sG_2;
import celestial.sS_2;
import celestial.v_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SD
implements D,
PP {
    private static boolean[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;
    private static String[] id_case;
    private static short[] id_catch;
    private static byte[] id_private;

    private static void id_byte() {
        short[] sArray = new short[29];
        sArray[13] = 1;
        sArray[22] = 1;
        id_catch = sArray;
    }

    public SD(C_case c_case) {
        this.id_protected();
        F f = c_case.id_switch();
        this.id_class[SD.id_catch[0]] = f;
        c_case.s().id_class(this);
    }

    static {
        SD.ntfClinit();
    }

    private static void id_class() {
        id_case = new String[]{new String("> %s"), new String("Click to rerun command"), new String("help"), new String("set toggle %s"), new String("set %s"), new String("set %s %s"), new String("true"), new String("false"), new String("false"), new String("true")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, 20, 116, -24, 33, -41, -67, 99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(f_1 f_12) {
        String[] stringArray;
        if (!((Boolean)((C_private)SD.id_break[SD.id_catch[17]]).l.id_class[id_catch[18]]).booleanValue()) {
            return;
        }
        String string = (String)f_12.id_class[id_catch[19]];
        String string3 = (String)((C_private)SD.id_break[SD.id_catch[20]]).id_protected.id_class[id_catch[21]];
        if (!string.startsWith(string3)) {
            return;
        }
        String string4 = string.substring(string3.length());
        List<C_import> list = sG_2.id_class(string4, id_throws[12]);
        Stream<String> stream = this.id_private(string4);
        if (list.size() == id_throws[13]) {
            stream = stream.map(string2 -> string3 + string2);
        }
        if ((stringArray = (String[])stream.toArray(String[]::new)).length > 0) {
            String[] stringArray2;
            f_12.id_class[SD.id_catch[22]] = stringArray2 = stringArray;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7CF52C4C23738406L;
    }

    @Override
    public void id_class(C c) {
        String string = c.id_class();
        String string2 = (String)((C_private)SD.id_break[SD.id_catch[1]]).id_protected.id_class[id_catch[2]];
        boolean bl = string.startsWith(C_throw.id_class);
        if (string.startsWith(string2)) {
            c.id_break();
            String string3 = string.substring(bl ? C_throw.id_class.length() : string2.length());
            if (!this.id_break(string3) && !string3.trim().isEmpty()) {
                new N(EJ.id_throws(string3).id_class()).id_class(null, null);
            }
        }
    }

    private void id_class(String string, String string2) {
        if (((Boolean)((C_private)SD.id_break[SD.id_catch[3]]).rt.id_class[id_catch[4]]).booleanValue()) {
            String string3 = string + string2;
            String string4 = (Boolean)((C_private)SD.id_break[SD.id_catch[5]]).rp.id_class[id_catch[6]] != false ? string + " ..." : string3;
            Object[] objectArray = new Object[id_throws[0]];
            objectArray[SD.id_throws[1]] = string4;
            rVe_1 rVe_12 = new rVe_1(String.format(id_case[0], objectArray));
            rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.WHITE).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_case[1]))).id_class(new rgl_3(rgH_2.RUN_COMMAND, C_throw.id_class + string3)));
            rVi_1[] rVi_1Array = new rVi_1[id_throws[2]];
            rVi_1Array[SD.id_throws[3]] = rVe_12;
            this.id_class(rVi_1Array);
        }
    }

    public boolean id_break(String string) {
        if (string.isEmpty()) {
            return this.id_break(id_case[2]);
        }
        rqj_3<String, List<C_import>> rqj_32 = EJ.id_throws(string);
        String string2 = rqj_32.id_class();
        String string3 = string.substring(rqj_32.id_class().length());
        sS_2 sS_22 = new sS_2((F)this.id_class[id_catch[7]], rqj_32.id_break());
        if (!sS_22.id_final()) {
            C_extends c_extends = (C_extends)((Map)((C_private)SD.id_break[SD.id_catch[8]]).Pj[id_catch[9]]).get(string2.toLowerCase(Locale.US));
            if (c_extends != null) {
                this.id_class(string2, string3);
                if (c_extends.id_byte() == Boolean.class) {
                    Object[] objectArray = new Object[id_throws[4]];
                    objectArray[SD.id_throws[5]] = c_extends.id_protected();
                    ((F)this.id_class[id_catch[10]]).id_class(String.format(id_case[3], objectArray));
                } else {
                    Object[] objectArray = new Object[id_throws[6]];
                    objectArray[SD.id_throws[7]] = c_extends.id_protected();
                    ((F)this.id_class[id_catch[11]]).id_class(String.format(id_case[4], objectArray));
                }
                return id_throws[8];
            }
        } else if (sS_22.id_case()) {
            for (C_extends c_extends : (List)((C_private)SD.id_break[SD.id_catch[12]]).Pj[id_catch[13]]) {
                if (Pd_1.id_throws(c_extends) || !c_extends.id_protected().equalsIgnoreCase(rqj_32.id_class())) continue;
                this.id_class(string2, string3);
                try {
                    Object[] objectArray = new Object[id_private[0]];
                    objectArray[SD.id_throws[9]] = c_extends.id_protected();
                    objectArray[SD.id_throws[10]] = sS_22.id_extends();
                    ((F)this.id_class[id_catch[14]]).id_class(String.format(id_case[5], objectArray));
                }
                catch (Q q) {
                    // empty catch block
                }
                return id_throws[11];
            }
        }
        if (((F)this.id_class[id_catch[15]]).id_break(rqj_32.id_class()) != null) {
            this.id_class(string2, string3);
        }
        return ((F)this.id_class[id_catch[16]]).id_break(rqj_32);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{C_throws.id_break()};
        id_break = objectArray;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5B76E6DE;
    }

    private static void id_throws() {
        id_private = new byte[]{2, 2, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        SD.id_case();
        SD.id_class();
        SD.id_byte();
        SD.id_throws();
        SD.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[23];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[22] = true;
        id_throws = blArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[21]];
        }
    }

    public Stream<String> id_private(String string) {
        try {
            List<C_import> list = sG_2.id_class(string, id_throws[14]);
            sS_2 sS_22 = new sS_2((F)this.id_class[id_catch[23]], list);
            if (sS_22.id_catch(id_private[1])) {
                if (sS_22.id_case(id_throws[15])) {
                    return new v_1().id_class((F)this.id_class[id_catch[24]]).id_byte().id_class(sS_22.id_extends()).id_protected();
                }
                C_extends c_extends = (C_extends)((Map)((C_private)SD.id_break[SD.id_catch[25]]).Pj[id_catch[26]]).get(sS_22.id_extends().toLowerCase(Locale.US));
                if (c_extends != null && !Pd_1.id_throws(c_extends)) {
                    if (c_extends.id_byte() == Boolean.class) {
                        v_1 v_12 = new v_1();
                        if (((Boolean)c_extends.id_class[id_catch[27]]).booleanValue()) {
                            String[] stringArray = new String[id_private[2]];
                            stringArray[SD.id_throws[16]] = id_case[6];
                            stringArray[SD.id_throws[17]] = id_case[7];
                            v_12.id_break(stringArray);
                        } else {
                            String[] stringArray = new String[id_private[3]];
                            stringArray[SD.id_throws[18]] = id_case[8];
                            stringArray[SD.id_throws[19]] = id_case[9];
                            v_12.id_break(stringArray);
                        }
                        return v_12.id_class(sS_22.id_extends()).id_protected();
                    }
                    return Stream.of(Pd_1.id_break(c_extends));
                }
            }
            return ((F)this.id_class[id_catch[28]]).id_byte(string);
        }
        catch (Q q) {
            return Stream.empty();
        }
    }
}

