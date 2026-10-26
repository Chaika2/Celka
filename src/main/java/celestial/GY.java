/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.an_3;
import celestial.bq_3;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rX_2;
import celestial.rb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rn_3;
import celestial.rsE_2;
import celestial.rs_3;
import celestial.rv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GY
extends bq_3
implements rv_3 {
    private static double[] id_throws;
    public Object[] id_break;
    private static byte[] id_catch;
    private static short[] id_private;
    private static boolean[] id_implements;

    @Override
    public boolean id_byte() {
        this.id_int();
        if ((Predicate)this.id_break[id_private[15]] == null) {
            return id_implements[4];
        }
        this.id_final();
        return !((List)this.id_break[id_private[16]]).isEmpty() ? id_implements[5] : id_implements[6];
    }

    private void id_int() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[0]];
            objectArray[GY.id_catch[1]] = id_implements[11];
        }
    }

    public GY(C_class c_class) {
        super(c_class);
        this.id_int();
    }

    static {
        GY.ntfClinit();
    }

    private boolean id_class(an_3 an_32) {
        if (an_32 == null) {
            return id_implements[0];
        }
        if (!an_32.BM()) {
            return id_implements[1];
        }
        if (an_32.equals(((Ps_1)this.id_case[id_private[8]]).id_catch())) {
            return id_implements[2];
        }
        int n = (Integer)C_class.id_instanceof().id_interface.id_class[id_private[9]];
        if (n != 0 && an_32.id_int(((Ps_1)this.id_case[id_private[10]]).id_catch()) > (double)(n * n)) {
            return id_implements[3];
        }
        return ((Ps_1)this.id_case[id_private[11]]).id_implements().anyMatch(an_32::equals);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, -30, 49, -31, -7, -5, -74, 12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public String id_class() {
        this.id_int();
        return "Following " + (List)this.id_break[id_private[19]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A5AE18E;
    }

    @Override
    public void id_class(Predicate<rdn_3> predicate) {
        Predicate<an_3> predicate2;
        this.id_int();
        this.id_break[GY.id_private[22]] = predicate2 = an_32 -> {
            rsE_2 rsE_22;
            return an_32 instanceof rsE_2 && predicate.test((rsE_22 = (rsE_2)an_32).id_protected()) ? id_implements[9] : id_implements[10];
        };
        Boolean bl = id_implements[8];
        this.id_break[GY.id_private[23]] = bl;
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        this.id_int();
        this.id_final();
        rs_3 rs_32 = new rs_3((rP_2[])((List)this.id_break[id_private[0]]).stream().map(this::id_break).toArray(rP_2[]::new));
        return new rn_3(rs_32, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[1]]));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6EED257F3FCD500AL;
    }

    private rP_2 id_break(an_3 an_32) {
        rfH_2 rfH_22;
        this.id_int();
        if ((Double)C_class.id_instanceof().id_while.id_class[id_private[2]] == id_throws[0] || ((Boolean)this.id_break[id_private[3]]).booleanValue()) {
            rfH_22 = an_32.Bs();
        } else {
            rX_2 rX_22 = rX_2.id_class(an_32.Ps(), ((Float)C_class.id_instanceof().PE.id_class[id_private[4]]).floatValue(), (Double)C_class.id_instanceof().id_while.id_class[id_private[5]]);
            rfH_22 = new rU_2((double)rX_22.id_byte(), an_32.Ps().id_byte, (double)rX_22.id_break());
        }
        if (((Boolean)this.id_break[id_private[6]]).booleanValue()) {
            return new rS_2(rfH_22);
        }
        return new rb_3(rfH_22, (Integer)C_class.id_instanceof().T.id_class[id_private[7]]);
    }

    @Override
    public void id_break(Predicate<an_3> predicate) {
        Predicate<an_3> predicate2;
        this.id_int();
        this.id_break[GY.id_private[20]] = predicate2 = predicate;
        Boolean bl = id_implements[7];
        this.id_break[GY.id_private[21]] = bl;
    }

    private static /* synthetic */ void ntfClinit() {
        GY.id_extends();
        GY.id_package();
        GY.id_native();
        GY.id_volatile();
    }

    @Override
    public Predicate<an_3> id_finally() {
        this.id_int();
        return (Predicate)this.id_break[id_private[25]];
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[12];
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_implements = blArray;
    }

    @Override
    public List<an_3> id_implements() {
        this.id_int();
        return (List)this.id_break[id_private[24]];
    }

    private static void id_package() {
        short[] sArray = new short[26];
        sArray[0] = 1;
        sArray[1] = 3;
        sArray[3] = 2;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[21] = 2;
        sArray[23] = 2;
        sArray[24] = 1;
        id_private = sArray;
    }

    @Override
    public void id_protected() {
        this.id_int();
        super.id_protected();
        Object var5_1 = null;
        this.id_break[GY.id_private[17]] = var5_1;
        Object var6_2 = null;
        this.id_break[GY.id_private[18]] = var6_2;
    }

    private void id_final() {
        List list;
        this.id_int();
        this.id_break[GY.id_private[14]] = list = ((Ps_1)this.id_case[id_private[12]]).id_implements().filter(this::id_class).filter((Predicate)this.id_break[id_private[13]]).distinct().collect(Collectors.toList());
    }

    private static void id_volatile() {
        id_catch = new byte[]{3, 2};
    }

    private static void id_native() {
        id_throws = new double[1];
    }
}

