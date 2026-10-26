/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrNJ;
import celestial.rrNX;
import celestial.rrNk_1;
import celestial.rrNw_1;
import celestial.rrNx_1;
import celestial.rrcT_2;
import celestial.rrfA_2;
import celestial.rrfI_2;
import celestial.rrfq_3;
import celestial.rrwI_2;
import celestial.setting.Setting;
import celestial.util.FuntimeEnchantment;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrNd_1
extends rrwI_2
implements Comparable<rrNd_1>,
rrNJ,
rrNx_1 {
    public Object[] id_class;
    private static float[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;
    private static boolean[] id_catch;

    public List<String> id_char() {
        this.id_static();
        return (List)this.id_class[id_protected[127]];
    }

    public void id_byte(boolean bl) {
        this.id_static();
        Boolean bl2 = bl;
        this.id_class[rrNd_1.id_protected[139]] = bl2;
    }

    public void id_byte(int n) {
        this.id_static();
        Integer n2 = n;
        this.id_class[rrNd_1.id_protected[143]] = n2;
    }

    public rrNd_1 id_byte() {
        this.id_static();
        return new rrNk_1().id_class((rdb_3)this.id_class[id_protected[63]]).id_protected((Integer)this.id_class[id_protected[64]]).id_break((Integer)this.id_class[id_protected[65]]).id_native((List)this.id_class[id_protected[66]]).id_throws((List)this.id_class[id_protected[67]]).id_protected((List)this.id_class[id_protected[68]]).id_implements((List)this.id_class[id_protected[69]]).id_break((List)this.id_class[id_protected[70]]).id_finally((List)this.id_class[id_protected[71]]).id_case((List)this.id_class[id_protected[72]]).id_private((List)this.id_class[id_protected[73]]).id_extends((List)this.id_class[id_protected[74]]).id_class((List)this.id_class[id_protected[75]]).id_volatile((List)this.id_class[id_protected[76]]).id_catch((List)this.id_class[id_protected[77]]).id_class((rdn_3)this.id_class[id_protected[78]]).id_byte((List)this.id_class[id_protected[79]]).id_break((String)this.id_class[id_protected[80]]).id_byte((String)this.id_class[id_protected[81]]).id_byte((Boolean)this.id_class[id_protected[82]]).id_class((rrNw_1)this.id_class[id_protected[83]]).id_class((rrNX)((Object)this.id_class[id_protected[84]])).id_protected((Boolean)this.id_class[id_protected[85]]).id_throws((Boolean)this.id_class[id_protected[86]]).id_class((rrIk_1)this.id_class[id_protected[87]]).id_byte((Integer)this.id_class[id_protected[88]]).id_class((Boolean)this.id_class[id_protected[89]]).id_break((Boolean)this.id_class[id_protected[90]]).id_break();
    }

    public List<String> id_int() {
        this.id_static();
        return (List)this.id_class[id_protected[125]];
    }

    private static void id_long() {
        id_break = new float[]{5.0f, 100.0f, 5.0f, 1.0f, 1.0f};
    }

    public rrNd_1(rrNk_1 rrNk_12) {
        this.id_static();
        rdb_3 rdb_32 = (rdb_3)rrNk_12.id_class[id_protected[0]];
        this.id_class[rrNd_1.id_protected[1]] = rdb_32;
        Integer n = (int)((Integer)rrNk_12.id_class[id_protected[2]]);
        this.id_class[rrNd_1.id_protected[3]] = n;
        Integer n2 = (int)((Integer)rrNk_12.id_class[id_protected[4]]);
        this.id_class[rrNd_1.id_protected[5]] = n2;
        List list = (List)rrNk_12.id_class[id_protected[6]];
        this.id_class[rrNd_1.id_protected[7]] = list;
        List list2 = (List)rrNk_12.id_class[id_protected[8]];
        this.id_class[rrNd_1.id_protected[9]] = list2;
        List list3 = (List)rrNk_12.id_class[id_protected[10]];
        this.id_class[rrNd_1.id_protected[11]] = list3;
        List list4 = (List)rrNk_12.id_class[id_protected[12]];
        this.id_class[rrNd_1.id_protected[13]] = list4;
        List list5 = (List)rrNk_12.id_class[id_protected[14]];
        this.id_class[rrNd_1.id_protected[15]] = list5;
        List list6 = (List)rrNk_12.id_class[id_protected[16]];
        this.id_class[rrNd_1.id_protected[17]] = list6;
        List list7 = (List)rrNk_12.id_class[id_protected[18]];
        this.id_class[rrNd_1.id_protected[19]] = list7;
        List list8 = (List)rrNk_12.id_class[id_protected[20]];
        this.id_class[rrNd_1.id_protected[21]] = list8;
        List list9 = (List)rrNk_12.id_class[id_protected[22]];
        this.id_class[rrNd_1.id_protected[23]] = list9;
        List list10 = (List)rrNk_12.id_class[id_protected[24]];
        this.id_class[rrNd_1.id_protected[25]] = list10;
        List list11 = (List)rrNk_12.id_class[id_protected[26]];
        this.id_class[rrNd_1.id_protected[27]] = list11;
        List list12 = (List)rrNk_12.id_class[id_protected[28]];
        this.id_class[rrNd_1.id_protected[29]] = list12;
        rdn_3 rdn_32 = (rdn_3)rrNk_12.id_class[id_protected[30]];
        this.id_class[rrNd_1.id_protected[31]] = rdn_32;
        List list13 = (List)rrNk_12.id_class[id_protected[32]];
        this.id_class[rrNd_1.id_protected[33]] = list13;
        String string = (String)rrNk_12.id_class[id_protected[34]];
        this.id_class[rrNd_1.id_protected[35]] = string;
        String string2 = (String)rrNk_12.id_class[id_protected[36]];
        this.id_class[rrNd_1.id_protected[37]] = string2;
        Boolean bl = (boolean)((Boolean)rrNk_12.id_class[id_protected[38]]);
        this.id_class[rrNd_1.id_protected[39]] = bl;
        rrNw_1 rrNw_12 = (rrNw_1)rrNk_12.id_class[id_protected[40]];
        this.id_class[rrNd_1.id_protected[41]] = rrNw_12;
        rrNX rrNX2 = (rrNX)((Object)rrNk_12.id_class[id_protected[42]]);
        this.id_class[rrNd_1.id_protected[43]] = rrNX2;
        Boolean bl2 = (boolean)((Boolean)rrNk_12.id_class[id_protected[44]]);
        this.id_class[rrNd_1.id_protected[45]] = bl2;
        rrIk_1 rrIk_12 = (rrIk_1)rrNk_12.id_class[id_protected[46]];
        this.id_class[rrNd_1.id_protected[47]] = rrIk_12;
        Boolean bl3 = (boolean)((Boolean)rrNk_12.id_class[id_protected[48]]);
        this.id_class[rrNd_1.id_protected[49]] = bl3;
        Integer n3 = (int)((Integer)rrNk_12.id_class[id_protected[50]]);
        this.id_class[rrNd_1.id_protected[51]] = n3;
        Boolean bl4 = (Boolean)rrNk_12.id_class[id_protected[52]] == null ? ((rdb_3)this.id_class[id_protected[53]]).id_extends() : ((Boolean)rrNk_12.id_class[id_protected[54]]).booleanValue();
        this.id_class[rrNd_1.id_protected[55]] = bl4;
        Boolean bl5 = (boolean)((Boolean)rrNk_12.id_class[id_protected[56]]);
        this.id_class[rrNd_1.id_protected[57]] = bl5;
        this.id_class((Setting)new rrIk_1(id_throws[0], this.id_class()).id_class(id_throws[1], (Setting<T> setting, Pair<T, Boolean> pair) -> this.id_class((Boolean)setting.id_byte())));
        if ((rrIk_1)this.id_class[id_protected[58]] != null) {
            this.id_class((rrIk_1)this.id_class[id_protected[59]]);
        }
        if (((Boolean)this.id_class[id_protected[60]]).booleanValue()) {
            this.id_class((Setting)new rrIk_1(id_throws[2], this.id_return()).id_class(id_throws[3], (Setting<T> setting, Pair<T, Boolean> pair) -> this.id_byte((Boolean)setting.id_byte())));
            this.id_class((Setting)new rrIm_1(id_throws[4], Float.valueOf(this.id_public()), Float.valueOf(id_break[0]), Float.valueOf(id_break[1]), Float.valueOf(id_break[2])).id_class(id_throws[5], (Setting<T> setting, Pair<T, Boolean> pair) -> this.id_byte(((Float)setting.id_byte()).intValue()))).id_class(() -> this.id_return());
        }
        if (((rdb_3)this.id_class[id_protected[61]]).id_implements() > id_catch[0]) {
            this.id_class((Setting)new rrIm_1(id_throws[6], Float.valueOf(this.id_native()), Float.valueOf(id_break[3]), Float.valueOf(((rdb_3)this.id_class[id_protected[62]]).id_implements()), Float.valueOf(id_break[4])).id_class(id_throws[7], (Setting<T> setting, Pair<T, Boolean> pair) -> this.id_class(((Float)setting.id_byte()).intValue())));
        }
    }

    static {
        rrNd_1.ntfClinit();
    }

    public boolean equals(Object object) {
        this.id_static();
        if (this == object) {
            return id_catch[6];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_catch[7];
        }
        rrNd_1 rrNd_12 = (rrNd_1)object;
        if ((rrNw_1)this.id_class[id_protected[102]] == null || (rrNw_1)rrNd_12.id_class[id_protected[103]] == null) {
            return Objects.equals((String)this.id_class[id_protected[104]], (String)rrNd_12.id_class[id_protected[105]]);
        }
        return Objects.equals((rrNw_1)this.id_class[id_protected[106]], (rrNw_1)rrNd_12.id_class[id_protected[107]]);
    }

    public int hashCode() {
        this.id_static();
        if ((rrNw_1)this.id_class[id_protected[108]] == null) {
            return Objects.hashCode((String)this.id_class[id_protected[109]]);
        }
        return Objects.hashCode((rrNw_1)this.id_class[id_protected[110]]);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((rrNd_1)object);
    }

    public List<FuntimeEnchantment> id_this() {
        this.id_static();
        return (List)this.id_class[id_protected[122]];
    }

    public List<FuntimeEnchantment> id_interface() {
        this.id_static();
        return (List)this.id_class[id_protected[121]];
    }

    public void id_class(rrfq_3 rrfq_32) {
        this.id_static();
        rrfq_3 rrfq_33 = rrfq_32;
        this.id_class[rrNd_1.id_protected[148]] = rrfq_33;
    }

    public void id_class(rrNw_1 rrNw_12) {
        this.id_static();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrNd_1.id_protected[93]] = rrNw_13;
    }

    @Override
    public boolean id_class() {
        this.id_static();
        return (Boolean)this.id_class[id_protected[92]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-42, -58, 124, -13, -49, -59, -105, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrIk_1 rrIk_12) {
        this.id_static();
        rrIk_1 rrIk_13 = rrIk_12;
        this.id_class[rrNd_1.id_protected[141]] = rrIk_13;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x731F6A0F73654E35L;
    }

    public void id_class(int n) {
        this.id_static();
        Integer n2 = n;
        this.id_class[rrNd_1.id_protected[144]] = n2;
    }

    public void id_class(boolean bl) {
        this.id_static();
        Boolean bl2 = bl;
        this.id_class[rrNd_1.id_protected[137]] = bl2;
    }

    @Override
    public boolean id_class(rrNw_1 rrNw_12, Predicate<rrcT_2<?>> predicate) {
        this.id_static();
        for (rrcT_2 rrcT_22 : (List)this.id_class[id_protected[91]]) {
            rrfI_2 rrfI_22;
            if (predicate != null && !predicate.test(rrcT_22) || (rrfI_22 = rrcT_22.id_class(this, rrNw_12)).id_byte()) continue;
            return id_catch[1];
        }
        return id_catch[2];
    }

    public int id_class(rrNd_1 rrNd_12) {
        this.id_static();
        if (rrNd_12 == null) {
            throw new NullPointerException(id_throws[8]);
        }
        if ((rrNw_1)this.id_class[id_protected[94]] == null || (rrNw_1)rrNd_12.id_class[id_protected[95]] == null) {
            return id_catch[3];
        }
        rdb_3 rdb_32 = ((rrNw_1)this.id_class[id_protected[96]]).id_protected().id_break();
        rdb_3 rdb_33 = ((rrNw_1)rrNd_12.id_class[id_protected[97]]).id_protected().id_break();
        if (rdb_32 == rdy_3.kL || rdb_33 == rdy_3.kL) {
            return id_catch[4];
        }
        if (rdb_32 == rdy_3.dJ || rdb_33 == rdy_3.dJ) {
            return id_catch[5];
        }
        int n = Math.abs((Integer)this.id_class[id_protected[98]] - ((rrNw_1)this.id_class[id_protected[99]]).id_case());
        int n2 = Math.abs((Integer)rrNd_12.id_class[id_protected[100]] - ((rrNw_1)rrNd_12.id_class[id_protected[101]]).id_case());
        return Integer.compare(n2, n);
    }

    private static void id_default() {
        short[] sArray = new short[149];
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 5;
        sArray[7] = 4;
        sArray[8] = 6;
        sArray[9] = 5;
        sArray[10] = 7;
        sArray[11] = 6;
        sArray[12] = 8;
        sArray[13] = 7;
        sArray[14] = 9;
        sArray[15] = 8;
        sArray[16] = 10;
        sArray[17] = 9;
        sArray[18] = 11;
        sArray[19] = 10;
        sArray[20] = 12;
        sArray[21] = 11;
        sArray[22] = 13;
        sArray[23] = 12;
        sArray[24] = 14;
        sArray[25] = 13;
        sArray[26] = 15;
        sArray[27] = 14;
        sArray[28] = 16;
        sArray[29] = 15;
        sArray[30] = 17;
        sArray[31] = 16;
        sArray[32] = 18;
        sArray[33] = 17;
        sArray[34] = 19;
        sArray[35] = 18;
        sArray[36] = 20;
        sArray[37] = 19;
        sArray[38] = 21;
        sArray[39] = 20;
        sArray[40] = 22;
        sArray[41] = 21;
        sArray[42] = 23;
        sArray[43] = 22;
        sArray[44] = 25;
        sArray[45] = 25;
        sArray[46] = 28;
        sArray[47] = 27;
        sArray[48] = 26;
        sArray[49] = 26;
        sArray[50] = 4;
        sArray[51] = 3;
        sArray[52] = 27;
        sArray[54] = 27;
        sArray[55] = 23;
        sArray[56] = 24;
        sArray[57] = 24;
        sArray[58] = 27;
        sArray[59] = 27;
        sArray[60] = 23;
        sArray[64] = 1;
        sArray[65] = 2;
        sArray[66] = 4;
        sArray[67] = 5;
        sArray[68] = 6;
        sArray[69] = 7;
        sArray[70] = 8;
        sArray[71] = 9;
        sArray[72] = 11;
        sArray[73] = 10;
        sArray[74] = 12;
        sArray[75] = 13;
        sArray[76] = 14;
        sArray[77] = 15;
        sArray[78] = 16;
        sArray[79] = 17;
        sArray[80] = 18;
        sArray[81] = 19;
        sArray[82] = 20;
        sArray[83] = 21;
        sArray[84] = 22;
        sArray[85] = 25;
        sArray[86] = 26;
        sArray[87] = 27;
        sArray[88] = 3;
        sArray[89] = 23;
        sArray[90] = 24;
        sArray[91] = 15;
        sArray[92] = 25;
        sArray[93] = 21;
        sArray[94] = 21;
        sArray[95] = 21;
        sArray[96] = 21;
        sArray[97] = 21;
        sArray[98] = 1;
        sArray[99] = 21;
        sArray[100] = 1;
        sArray[101] = 21;
        sArray[102] = 21;
        sArray[103] = 21;
        sArray[104] = 18;
        sArray[105] = 18;
        sArray[106] = 21;
        sArray[107] = 21;
        sArray[108] = 21;
        sArray[109] = 18;
        sArray[110] = 21;
        sArray[111] = 28;
        sArray[112] = 28;
        sArray[114] = 1;
        sArray[115] = 1;
        sArray[116] = 2;
        sArray[117] = 4;
        sArray[118] = 5;
        sArray[119] = 6;
        sArray[120] = 7;
        sArray[121] = 8;
        sArray[122] = 9;
        sArray[123] = 11;
        sArray[124] = 10;
        sArray[125] = 12;
        sArray[126] = 13;
        sArray[127] = 14;
        sArray[128] = 15;
        sArray[129] = 16;
        sArray[130] = 17;
        sArray[131] = 18;
        sArray[132] = 19;
        sArray[133] = 20;
        sArray[134] = 20;
        sArray[135] = 21;
        sArray[136] = 22;
        sArray[137] = 25;
        sArray[138] = 26;
        sArray[139] = 26;
        sArray[140] = 27;
        sArray[141] = 27;
        sArray[142] = 3;
        sArray[143] = 3;
        sArray[144] = 2;
        sArray[145] = 23;
        sArray[146] = 24;
        sArray[147] = 28;
        sArray[148] = 28;
        id_protected = sArray;
    }

    private static void id_short() {
        id_throws = new String[]{new String("\u0420\u0430\u0431\u043e\u0442\u0430\u0442\u044c \u0441 Auto Parser"), new String("auto_parser"), new String("\u041f\u0440\u043e\u0432\u0435\u0440\u044f\u0442\u044c \u043f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c"), new String("durability"), new String("\u041c\u0438\u043d. \u043f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c \u0432 \u043f\u0440\u043e\u0446\u0435\u043d\u0442\u0430\u0445"), new String("min_durability"), new String("\u041c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e"), new String("min_count"), new String("otherItem is marked non-null but is null")};
    }

    private static void id_void() {
        id_byte = new byte[]{29, 2, 3, 20, 23, 24, 25, 26};
    }

    @Override
    @Nullable
    public rrNw_1 id_break() {
        this.id_static();
        return (rrNw_1)this.id_class[id_protected[135]];
    }

    public void id_break(boolean bl) {
        this.id_static();
        Boolean bl2 = bl;
        this.id_class[rrNd_1.id_protected[134]] = bl2;
    }

    public void id_break(int n) {
        this.id_static();
        Integer n2 = n;
        this.id_class[rrNd_1.id_protected[115]] = n2;
    }

    public boolean id_throws() {
        this.id_static();
        return (Boolean)this.id_class[id_protected[145]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNd_1.id_import();
        rrNd_1.id_short();
        rrNd_1.id_default();
        rrNd_1.id_long();
        rrNd_1.id_void();
    }

    public rrfq_3 id_finally() {
        this.id_static();
        return (rrfq_3)((Object)this.id_class[id_protected[147]]);
    }

    public rdb_3 id_catch() {
        this.id_static();
        return (rdb_3)this.id_class[id_protected[113]];
    }

    public List<String> id_extends() {
        this.id_static();
        return (List)this.id_class[id_protected[123]];
    }

    public List<rrfA_2> id_goto() {
        this.id_static();
        return (List)this.id_class[id_protected[119]];
    }

    public String id_case() {
        this.id_static();
        return (String)this.id_class[id_protected[131]];
    }

    public rrNX id_continue() {
        this.id_static();
        return (rrNX)((Object)this.id_class[id_protected[136]]);
    }

    public int id_else() {
        this.id_static();
        return (Integer)this.id_class[id_protected[114]];
    }

    public boolean id_implements() {
        this.id_static();
        return (Boolean)this.id_class[id_protected[146]];
    }

    private static void id_import() {
        boolean[] blArray = new boolean[17];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_catch = blArray;
    }

    public List<rrcT_2<?>> id_instanceof() {
        this.id_static();
        return (List)this.id_class[id_protected[128]];
    }

    public List<rrfA_2> id_new() {
        this.id_static();
        return (List)this.id_class[id_protected[118]];
    }

    public rdn_3 id_package() {
        this.id_static();
        return (rdn_3)this.id_class[id_protected[129]];
    }

    public boolean id_return() {
        this.id_static();
        return (Boolean)this.id_class[id_protected[138]];
    }

    public List<rrfA_2> id_super() {
        this.id_static();
        return (List)this.id_class[id_protected[117]];
    }

    public List<FuntimeEnchantment> id_throw() {
        this.id_static();
        return (List)this.id_class[id_protected[120]];
    }

    public List<String> id_try() {
        this.id_static();
        return (List)this.id_class[id_protected[124]];
    }

    public boolean id_while() {
        this.id_static();
        return (Boolean)this.id_class[id_protected[133]];
    }

    private void id_static() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrNd_1.id_catch[8]] = id_catch[9];
            objectArray[rrNd_1.id_byte[1]] = id_catch[10];
            objectArray[rrNd_1.id_byte[2]] = id_catch[11];
            objectArray[rrNd_1.id_byte[3]] = id_catch[12];
            objectArray[rrNd_1.id_byte[4]] = id_catch[13];
            objectArray[rrNd_1.id_byte[5]] = id_catch[14];
            objectArray[rrNd_1.id_byte[6]] = id_catch[15];
            objectArray[rrNd_1.id_byte[7]] = id_catch[16];
        }
    }

    public int id_public() {
        this.id_static();
        return (Integer)this.id_class[id_protected[142]];
    }

    public List<String> id_protected() {
        this.id_static();
        return (List)this.id_class[id_protected[126]];
    }

    private static int id_protected(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2B925517;
    }

    public List<String> id_private() {
        this.id_static();
        return (List)this.id_class[id_protected[130]];
    }

    public String id_abstract() {
        this.id_static();
        return (String)this.id_class[id_protected[132]];
    }

    public rrIk_1 id_final() {
        this.id_static();
        return (rrIk_1)this.id_class[id_protected[140]];
    }

    public String id_volatile() {
        this.id_static();
        String string = this.id_case();
        if ((rrfq_3)((Object)this.id_class[id_protected[111]]) == null) {
            return string;
        }
        return ((rrfq_3)((Object)this.id_class[id_protected[112]])).name() + ":" + string;
    }

    @Override
    public String id_synchronized() {
        return this.id_case();
    }

    public int id_native() {
        this.id_static();
        return (Integer)this.id_class[id_protected[116]];
    }
}

