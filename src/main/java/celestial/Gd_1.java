/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.EA;
import celestial.EF;
import celestial.Ev_1;
import celestial.Gh_1;
import celestial.Gk_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.bq_3;
import celestial.rC_2;
import celestial.rfH_2;
import celestial.rn_3;
import celestial.ron_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gd_1
extends bq_3 {
    public Object[] id_break;
    private static boolean[] id_throws;
    private static String[] id_catch;
    private static double[] id_private;
    private static short[] id_implements;

    @Override
    public boolean id_byte() {
        this.id_native();
        if (((Ps_1)this.id_case[id_implements[1]]).id_catch() == null || ((Ps_1)this.id_case[id_implements[2]]).id_case() == null) {
            return id_throws[0];
        }
        if (!((Boolean)C_class.id_instanceof().B.id_class[id_implements[3]]).booleanValue()) {
            return id_throws[1];
        }
        if (((Boolean)C_class.id_instanceof().id_double.id_class[id_implements[4]]).booleanValue()) {
            this.id_case(id_catch[0]);
            Boolean bl = id_throws[2];
            C_class.id_instanceof().B.id_class[Gd_1.id_implements[5]] = bl;
            return id_throws[3];
        }
        for (rfH_2 rfH_22 : new ArrayList(((HashMap)this.id_break[id_implements[6]]).keySet())) {
            if (!(((Ps_1)this.id_case[id_implements[7]]).id_case().id_volatile(rfH_22) instanceof ron_3) && ((Ps_1)this.id_case[id_implements[8]]).id_case().id_byte(rfH_22).id_break() == xu_3.id_class) continue;
            ((HashMap)this.id_break[id_implements[9]]).remove(rfH_22);
        }
        this.id_volatile();
        ((C_class)this.id_case[id_implements[10]]).id_int().id_class();
        return !this.id_private().isEmpty() ? id_throws[4] : id_throws[5];
    }

    public Gd_1(C_class c_class) {
        super(c_class);
        HashMap hashMap;
        this.id_native();
        this.id_break[Gd_1.id_implements[0]] = hashMap = new HashMap();
    }

    static {
        Gd_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF607DBF8BD6891B6L;
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        if (!bl2) {
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[11]]));
        }
        ((C_class)this.id_case[id_implements[12]]).id_int().id_class();
        block5: for (rfH_2 rfH_22 : this.id_private()) {
            EA eA = new EA();
            switch (((int[])Gk_1.id_class[id_implements[13]])[EF.id_class(eA, (C_class)this.id_case[id_implements[14]], rfH_22, id_throws[6], id_throws[7]).ordinal()]) {
                case 1: {
                    continue block5;
                }
                case 2: {
                    ((C_class)this.id_case[id_implements[15]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_implements[16]]), id_throws[8]);
                    return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[17]]));
                }
                case 3: {
                    ((C_class)this.id_case[id_implements[18]]).id_private().id_class(eA.id_class().id_break().get(), id_throws[9]);
                    return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[19]]));
                }
            }
            throw new IllegalStateException();
        }
        return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_implements[20]]));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 35, -79, 24, 121, -112, 117, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private boolean id_class(rfH_2 rfH_22) {
        Gh_1 gh_1 = ((C_class)this.id_case[id_implements[29]]).id_while().id_new();
        if (gh_1 == null || gh_1.id_protected() || gh_1.id_private()) {
            return id_throws[10];
        }
        Ev_1 ev_1 = (Ev_1)gh_1.id_class().id_catch().get(gh_1.id_break());
        return Arrays.asList(ev_1.id_finally()).contains(rfH_22);
    }

    @Override
    public String id_class() {
        return id_catch[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x32890966;
    }

    private static /* synthetic */ void ntfClinit() {
        Gd_1.id_extends();
        Gd_1.id_finally();
        Gd_1.id_final();
        Gd_1.id_implements();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("Backfill cannot be used with allowParkour true"), new String("Backfill")};
    }

    @Override
    public boolean id_catch() {
        return id_throws[11];
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[17];
        blArray[4] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        id_throws = blArray;
    }

    @Override
    public double id_case() {
        return id_private[0];
    }

    private static void id_implements() {
        id_private = new double[]{5.0};
    }

    @Override
    public void id_protected() {
        this.id_native();
        super.id_protected();
        if ((HashMap)this.id_break[id_implements[30]] != null && !((HashMap)this.id_break[id_implements[31]]).isEmpty()) {
            ((HashMap)this.id_break[id_implements[32]]).clear();
        }
    }

    public List<rfH_2> id_private() {
        this.id_native();
        return ((HashMap)this.id_break[id_implements[27]]).keySet().stream().filter(rfH_22 -> ((Ps_1)this.id_case[id_implements[34]]).id_case().id_byte((rfH_2)rfH_22).id_break() == xu_3.id_class ? id_throws[14] : id_throws[15]).filter(rfH_22 -> ((C_class)this.id_case[id_implements[33]]).b().id_class((rfH_2)rfH_22, xu_3.id_finally.id_continue())).filter(rfH_22 -> !this.id_class((rfH_2)rfH_22) ? id_throws[12] : id_throws[13]).sorted(Comparator.comparingDouble(((Ps_1)this.id_case[id_implements[28]]).id_volatile()::id_private).reversed()).collect(Collectors.toList());
    }

    private static void id_final() {
        short[] sArray = new short[35];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[11] = 1;
        sArray[16] = 5;
        sArray[17] = 1;
        sArray[19] = 1;
        sArray[20] = 5;
        sArray[21] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[28] = 1;
        sArray[34] = 1;
        id_implements = sArray;
    }

    private void id_volatile() {
        this.id_native();
        if (!((Ps_1)this.id_case[id_implements[21]]).id_class().isPresent() || !((C_class)this.id_case[id_implements[22]]).id_while().id_catch()) {
            return;
        }
        ((HashMap)this.id_break[id_implements[23]]).put(((Ps_1)this.id_case[id_implements[24]]).id_class().get(), ((Ps_1)this.id_case[id_implements[25]]).id_case().id_byte(((Ps_1)this.id_case[id_implements[26]]).id_class().get()));
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[16]];
        }
    }
}

