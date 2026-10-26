/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ED;
import celestial.EH;
import celestial.EI;
import celestial.EK;
import celestial.ER;
import celestial.ET;
import celestial.EU;
import celestial.EV;
import celestial.EY;
import celestial.EZ;
import celestial.Ea_1;
import celestial.Ee_1;
import celestial.Ef_1;
import celestial.Eg_1;
import celestial.Ei_1;
import celestial.Ej_1;
import celestial.El_1;
import celestial.Eo_1;
import celestial.Ep_1;
import celestial.Eq_1;
import celestial.Et_1;
import celestial.Ev_1;
import celestial.Ew_1;
import celestial.Ey_1;
import celestial.Mr_1;
import celestial.rU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract sealed class EC
extends Enum<EC>
permits El_1, EV, Eo_1, EK, ED, EU, Ee_1, Ea_1, Ei_1, EH, Ey_1, Ep_1, Eq_1, ET, Et_1, Ew_1, EI, Ef_1, Ej_1, Eg_1, ER, EY {
    private static String[] strings08a057b7f10f37959d555668d812e9fc;
    private static short[] shorts08a057b7f10f37959d555668d812e9fc;
    public Object[] fields08a057b7f10f37959d555668d812e9fc;
    private static boolean[] booleans08a057b7f10f37959d555668d812e9fc;
    private static byte[] bytes08a057b7f10f37959d555668d812e9fc;
    public static Object[] staticFields08a057b7f10f37959d555668d812e9fc;

    private void id_byte() {
        if (this.fields08a057b7f10f37959d555668d812e9fc == null) {
            Object[] objectArray = this.fields08a057b7f10f37959d555668d812e9fc = new Object[bytes08a057b7f10f37959d555668d812e9fc[81]];
            objectArray[EC.booleans08a057b7f10f37959d555668d812e9fc[79]] = booleans08a057b7f10f37959d555668d812e9fc[80];
            objectArray[EC.booleans08a057b7f10f37959d555668d812e9fc[81]] = booleans08a057b7f10f37959d555668d812e9fc[82];
            objectArray[EC.bytes08a057b7f10f37959d555668d812e9fc[82]] = booleans08a057b7f10f37959d555668d812e9fc[83];
            objectArray[EC.bytes08a057b7f10f37959d555668d812e9fc[83]] = booleans08a057b7f10f37959d555668d812e9fc[84];
            objectArray[EC.bytes08a057b7f10f37959d555668d812e9fc[84]] = booleans08a057b7f10f37959d555668d812e9fc[85];
        }
    }

    public EC(int n2, int n3, int n4) {
        this(n2, n3, n4, booleans08a057b7f10f37959d555668d812e9fc[0], booleans08a057b7f10f37959d555668d812e9fc[1]);
    }

    public EC(int n2, int n3, int n4, boolean bl, boolean bl2) {
        this.id_byte();
        Integer n5 = n2;
        this.fields08a057b7f10f37959d555668d812e9fc[EC.shorts08a057b7f10f37959d555668d812e9fc[1]] = n5;
        Integer n6 = n3;
        this.fields08a057b7f10f37959d555668d812e9fc[EC.shorts08a057b7f10f37959d555668d812e9fc[2]] = n6;
        Integer n7 = n4;
        this.fields08a057b7f10f37959d555668d812e9fc[EC.shorts08a057b7f10f37959d555668d812e9fc[3]] = n7;
        Boolean bl3 = bl;
        this.fields08a057b7f10f37959d555668d812e9fc[EC.shorts08a057b7f10f37959d555668d812e9fc[4]] = bl3;
        Boolean bl4 = bl2;
        this.fields08a057b7f10f37959d555668d812e9fc[EC.shorts08a057b7f10f37959d555668d812e9fc[5]] = bl4;
    }

    static {
        EC.ntfClinit();
    }

    public static EC[] values() {
        return (EC[])((EC[])staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[0]]).clone();
    }

    public static EC valueOf(String string) {
        return Enum.valueOf(EC.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1C9B58F8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDFD9B95F7F31CDFFL;
    }

    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        if (((Boolean)this.fields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[6]]).booleanValue() || ((Boolean)this.fields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[7]]).booleanValue()) {
            throw new UnsupportedOperationException();
        }
        Integer n4 = n + (Integer)this.fields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[8]];
        mr_1.id_class[EC.shorts08a057b7f10f37959d555668d812e9fc[9]] = n4;
        Integer n5 = n2 + (Integer)this.fields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[10]];
        mr_1.id_class[EC.shorts08a057b7f10f37959d555668d812e9fc[11]] = n5;
        Integer n6 = n3 + (Integer)this.fields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[12]];
        mr_1.id_class[EC.shorts08a057b7f10f37959d555668d812e9fc[13]] = n6;
        Double d = this.id_class(eZ, n, n2, n3);
        mr_1.id_class[EC.shorts08a057b7f10f37959d555668d812e9fc[14]] = d;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-33, -6, 41, -84, -69, -1, -96, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public double id_class(EZ eZ, int n, int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    public abstract Ev_1 id_class(EZ var1, rU_2 var2);

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new El_1(0, -1, 0), new EV(0, 1, 0), new Eo_1(0, 0, -1), new EK(0, 0, 1), new ED(1, 0, 0), new EU(-1, 0, 0), new Ee_1(0, 1, -1), new Ea_1(0, 1, 1), new Ei_1(1, 1, 0), new EH(-1, 1, 0), new Ey_1(1, -1, 0, false, true), new Ep_1(-1, -1, 0, false, true), new Eq_1(0, -1, -1, false, true), new ET(0, -1, 1, false, true), new Et_1(1, 0, -1, false, true), new Ew_1(-1, 0, -1, false, true), new EI(1, 0, 1, false, true), new Ef_1(-1, 0, 1, false, true), new Ej_1(0, 0, -4, true, true), new Eg_1(0, 0, 4, true, true), new ER(4, 0, 0, true, true), new EY(-4, 0, 0, true, true), new EC[]{(EC)((Object)objectArray[0]), (EC)((Object)objectArray[1]), (EC)((Object)objectArray[2]), (EC)((Object)objectArray[3]), (EC)((Object)objectArray[4]), (EC)((Object)objectArray[5]), (EC)((Object)objectArray[6]), (EC)((Object)objectArray[7]), (EC)((Object)objectArray[8]), (EC)((Object)objectArray[9]), (EC)((Object)objectArray[10]), (EC)((Object)objectArray[11]), (EC)((Object)objectArray[12]), (EC)((Object)objectArray[13]), (EC)((Object)objectArray[14]), (EC)((Object)objectArray[15]), (EC)((Object)objectArray[16]), (EC)((Object)objectArray[17]), (EC)((Object)objectArray[18]), (EC)((Object)objectArray[19]), (EC)((Object)objectArray[20]), (EC)((Object)objectArray[21])}};
        staticFields08a057b7f10f37959d555668d812e9fc = objectArray;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[86];
        blArray[3] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[36] = true;
        blArray[39] = true;
        blArray[42] = true;
        blArray[44] = true;
        blArray[46] = true;
        blArray[47] = true;
        blArray[50] = true;
        blArray[53] = true;
        blArray[54] = true;
        blArray[56] = true;
        blArray[58] = true;
        blArray[60] = true;
        blArray[62] = true;
        blArray[65] = true;
        blArray[66] = true;
        blArray[69] = true;
        blArray[70] = true;
        blArray[73] = true;
        blArray[74] = true;
        blArray[77] = true;
        blArray[78] = true;
        blArray[81] = true;
        booleans08a057b7f10f37959d555668d812e9fc = blArray;
    }

    private static void id_throws() {
        strings08a057b7f10f37959d555668d812e9fc = new String[]{new String("DOWNWARD"), new String("PILLAR"), new String("TRAVERSE_NORTH"), new String("TRAVERSE_SOUTH"), new String("TRAVERSE_EAST"), new String("TRAVERSE_WEST"), new String("ASCEND_NORTH"), new String("ASCEND_SOUTH"), new String("ASCEND_EAST"), new String("ASCEND_WEST"), new String("DESCEND_EAST"), new String("DESCEND_WEST"), new String("DESCEND_NORTH"), new String("DESCEND_SOUTH"), new String("DIAGONAL_NORTHEAST"), new String("DIAGONAL_NORTHWEST"), new String("DIAGONAL_SOUTHEAST"), new String("DIAGONAL_SOUTHWEST"), new String("PARKOUR_NORTH"), new String("PARKOUR_SOUTH"), new String("PARKOUR_EAST"), new String("PARKOUR_WEST")};
    }

    private static /* synthetic */ void ntfClinit() {
        EC.id_break();
        EC.id_throws();
        EC.id_protected();
        EC.id_case();
        EC.id_class();
    }

    private static /* synthetic */ EC[] id_catch() {
        EC[] eCArray = new EC[bytes08a057b7f10f37959d555668d812e9fc[0]];
        eCArray[EC.booleans08a057b7f10f37959d555668d812e9fc[2]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[15]]);
        eCArray[EC.booleans08a057b7f10f37959d555668d812e9fc[3]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[16]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[1]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[17]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[2]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[18]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[3]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[19]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[4]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[20]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[5]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[21]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[6]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[22]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[7]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[23]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[8]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[24]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[9]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[25]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[10]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[26]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[11]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[27]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[12]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[28]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[13]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[29]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[14]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[30]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[15]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[31]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[16]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[32]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[17]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[33]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[18]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[34]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[19]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[35]]);
        eCArray[EC.bytes08a057b7f10f37959d555668d812e9fc[20]] = (EC)((Object)staticFields08a057b7f10f37959d555668d812e9fc[shorts08a057b7f10f37959d555668d812e9fc[36]]);
        return eCArray;
    }

    private static void id_case() {
        bytes08a057b7f10f37959d555668d812e9fc = new byte[]{22, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, -1, 2, -1, 2, 3, 3, 4, 4, 5, -1, 5, 6, -1, 6, 7, 7, 8, 8, 9, -1, 9, 10, -1, 10, 11, -1, -1, 11, 12, -1, -1, 12, 13, -1, 13, 14, -1, 14, 15, -1, -1, 15, 16, 16, 17, -1, 17, 18, -4, 18, 19, 4, 19, 20, 4, 20, 21, -4, 21, 22, 5, 2, 3, 4, 23};
    }

    private static void id_protected() {
        short[] sArray = new short[37];
        sArray[0] = 22;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[3] = 4;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 3;
        sArray[11] = 1;
        sArray[12] = 4;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[19] = 4;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[22] = 7;
        sArray[23] = 8;
        sArray[24] = 9;
        sArray[25] = 10;
        sArray[26] = 11;
        sArray[27] = 12;
        sArray[28] = 13;
        sArray[29] = 14;
        sArray[30] = 15;
        sArray[31] = 16;
        sArray[32] = 17;
        sArray[33] = 18;
        sArray[34] = 19;
        sArray[35] = 20;
        sArray[36] = 21;
        shorts08a057b7f10f37959d555668d812e9fc = sArray;
    }
}

