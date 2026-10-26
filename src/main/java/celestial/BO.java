/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bh_1;
import celestial.C_class;
import celestial.C_final;
import celestial.EF;
import celestial.EW;
import celestial.EZ;
import celestial.Ek_1;
import celestial.Gh_1;
import celestial.I;
import celestial.PM;
import celestial.PO;
import celestial.PP;
import celestial.PZ;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.Qw_1;
import celestial.T;
import celestial.V;
import celestial.a_1;
import celestial.bR_2;
import celestial.bg_3;
import celestial.bi_3;
import celestial.bw_3;
import celestial.j_1;
import celestial.p_1;
import celestial.q_1;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rW_2;
import celestial.rX_2;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BO
extends Pv_1
implements PP,
C_final {
    private static String[] id_throws;
    private static byte[] id_case;
    public Object[] id_break;
    private static short[] id_catch;
    private static double[] id_private;
    private static boolean[] id_implements;

    private static void id_char() {
        id_throws = new String[]{new String("Discarding next path as it does not contain current position"), new String("Continuing on to planned next path"), new String("Splicing into planned next path early..."), new String("Path almost over. Planning ahead..."), new String("Must be called with synchronization on pathCalcLock"), new String("Already doing it"), new String("Improper context thread safety level"), new String("no goal"), new String("Warning: discarding orphan path segment with incorrect start"), new String("Warning: discarding orphan next segment with incorrect start"), new String("Warning: PathingBehaivor illegal state! Discarding invalid path!")};
    }

    @Override
    public rP_2 id_byte() {
        this.id_while();
        return (rP_2)this.id_break[id_catch[121]];
    }

    public boolean id_int() {
        this.id_while();
        return (Boolean)this.id_break[id_catch[130]];
    }

    public BO(C_class c_class) {
        super(c_class);
        LinkedBlockingQueue linkedBlockingQueue;
        Object object;
        Object object2;
        this.id_while();
        this.id_break[BO.id_catch[0]] = object2 = new Object();
        this.id_break[BO.id_catch[1]] = object = new Object();
        this.id_break[BO.id_catch[2]] = linkedBlockingQueue = new LinkedBlockingQueue();
    }

    static {
        BO.ntfClinit();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_this() {
        this.id_while();
        Object object = this.id_break[id_catch[131]];
        synchronized (object) {
            this.id_case().ifPresent(EW::id_catch);
            if (!this.id_else()) {
                return;
            }
            Object var7_2 = null;
            this.id_break[BO.id_catch[132]] = var7_2;
            Object var8_3 = null;
            this.id_break[BO.id_catch[133]] = var8_3;
        }
        Boolean bl = id_implements[25];
        this.id_break[BO.id_catch[134]] = bl;
    }

    private void id_interface() {
        this.id_while();
        this.id_class((rU_2)this.id_break[id_catch[164]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xACE8D8631962A49BL;
    }

    private void id_class(rU_2 rU_22) {
        this.id_while();
        Integer n = id_implements[26];
        this.id_break[BO.id_catch[165]] = n;
        rU_2 rU_23 = rU_22;
        this.id_break[BO.id_catch[166]] = rU_23;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC8043FEC;
    }

    public void id_class(rP_2 rP_22) {
        this.id_while();
        rP_2 rP_23 = rP_22;
        this.id_break[BO.id_catch[105]] = rP_23;
    }

    private void id_class(rfH_2 rfH_22) {
        this.id_class(new rU_2(rfH_22));
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_while();
        if ((Gh_1)this.id_break[id_catch[98]] != null) {
            switch (((int[])Bh_1.id_class[id_catch[99]])[q_12.id_class().ordinal()]) {
                case 1: {
                    Boolean bl = ((Qw_1)BO.b_.id_class[BO.id_catch[100]]).id_static;
                    this.id_break[BO.id_catch[101]] = bl;
                    ((Qw_1)BO.b_.id_class[BO.id_catch[102]]).id_static = id_implements[10];
                    break;
                }
                case 2: {
                    ((Qw_1)BO.b_.id_class[BO.id_catch[103]]).id_static = (Boolean)this.id_break[id_catch[104]];
                    break;
                }
            }
        }
    }

    @Override
    public void id_class(I i) {
        this.id_while();
        if (this.id_catch()) {
            i.id_class(((Gh_1)this.id_break[id_catch[13]]).id_byte());
        }
    }

    @Override
    public void id_class(T t) {
        bg_3.id_class(t, this);
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_while();
        this.id_goto();
        if (j_12.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_catch[7]])) {
            this.id_throw();
            ((C_class)this.id_class[id_catch[8]]).id_void().id_case();
            return;
        }
        rU_2 rU_22 = this.id_super();
        this.id_break[BO.id_catch[9]] = rU_22;
        ((C_class)this.id_class[id_catch[10]]).id_void().id_catch();
        this.id_public();
        BO bO = this;
        Integer n = (Integer)bO.id_break[id_catch[11]] + id_implements[0];
        bO.id_break[BO.id_catch[12]] = n;
        this.id_goto();
    }

    private void id_class(rfH_2 rfH_22, boolean bl, EZ eZ) {
        long l;
        long l2;
        this.id_while();
        if (!Thread.holdsLock(this.id_break[id_catch[181]])) {
            throw new IllegalStateException(id_throws[4]);
        }
        if ((EW)this.id_break[id_catch[182]] != null) {
            throw new IllegalStateException(id_throws[5]);
        }
        if (!((Boolean)eZ.id_break[id_catch[183]]).booleanValue()) {
            throw new IllegalStateException(id_throws[6]);
        }
        rP_2 rP_22 = (rP_2)this.id_break[id_catch[184]];
        if (rP_22 == null) {
            this.id_byte(id_throws[7]);
            return;
        }
        if ((Gh_1)this.id_break[id_catch[185]] == null) {
            l2 = (Long)C_class.id_instanceof().rh.id_class[id_catch[186]];
            l = (Long)C_class.id_instanceof().PH.id_class[id_catch[187]];
        } else {
            l2 = (Long)C_class.id_instanceof().w.id_class[id_catch[188]];
            l = (Long)C_class.id_instanceof().rL.id_class[id_catch[189]];
        }
        EW eW = this.id_class(rfH_22, rP_22, (Gh_1)this.id_break[id_catch[190]] == null ? null : ((Gh_1)this.id_break[id_catch[191]]).id_class(), eZ);
        if (!Objects.equals(eW.id_break(), rP_22)) {
            this.id_byte("Simplifying " + rP_22.getClass() + " to GoalXZ due to distance");
        }
        EW eW2 = eW;
        this.id_break[BO.id_catch[192]] = eW2;
        C_class.id_interface().execute(() -> {
            this.id_while();
            if (bl) {
                this.id_byte("Starting to search for path from " + rfH_22 + " to " + rP_22);
            }
            PM pM = eW.id_class(l2, l);
            Object object = this.id_break[id_catch[196]];
            synchronized (object) {
                Optional<Gh_1> optional = pM.id_class().map(a_12 -> new Gh_1(this, (a_1)a_12));
                if ((Gh_1)this.id_break[id_catch[197]] == null) {
                    if (optional.isPresent()) {
                        if (optional.get().id_class().id_break().contains((rU_2)this.id_break[id_catch[198]])) {
                            this.id_class((p_1)((Object)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[199]])));
                            Gh_1 gh_1 = optional.get();
                            this.id_break[BO.id_catch[200]] = gh_1;
                            this.id_class(rfH_22);
                        } else {
                            this.id_byte(id_throws[8]);
                        }
                    } else if (pM.id_break() != (PO)((Object)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_catch[201]])) && pM.id_break() != (PO)((Object)((Object)PO.staticFields76a2616475a7392d96bc61fb714cace1[id_catch[202]]))) {
                        this.id_class((p_1)((Object)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[203]])));
                    }
                } else if ((Gh_1)this.id_break[id_catch[204]] == null) {
                    if (optional.isPresent()) {
                        if (optional.get().id_class().id_implements().equals(((Gh_1)this.id_break[id_catch[205]]).id_class().id_protected())) {
                            this.id_class((p_1)((Object)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[206]])));
                            Gh_1 gh_1 = optional.get();
                            this.id_break[BO.id_catch[207]] = gh_1;
                        } else {
                            this.id_byte(id_throws[9]);
                        }
                    } else {
                        this.id_class((p_1)((Object)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[208]])));
                    }
                } else {
                    this.id_case(id_throws[10]);
                }
                if (bl && (Gh_1)this.id_break[id_catch[209]] != null && ((Gh_1)this.id_break[id_catch[210]]).id_class() != null) {
                    if (rP_22.id_break(((Gh_1)this.id_break[id_catch[211]]).id_class().id_protected())) {
                        this.id_byte("Finished finding a path from " + rfH_22 + " to " + rP_22 + ". " + ((Gh_1)this.id_break[id_catch[212]]).id_class().id_case() + " nodes considered");
                    } else {
                        this.id_byte("Found path segment from " + rfH_22 + " towards " + rP_22 + ". " + ((Gh_1)this.id_break[id_catch[213]]).id_class().id_case() + " nodes considered");
                    }
                }
                Object object2 = this.id_break[id_catch[214]];
                synchronized (object2) {
                    Object var21_13 = null;
                    this.id_break[BO.id_catch[215]] = var21_13;
                }
            }
        });
    }

    private void id_class(p_1 p_12) {
        this.id_while();
        ((LinkedBlockingQueue)this.id_break[id_catch[3]]).add(p_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean id_class(rn_3 rn_32) {
        this.id_while();
        this.id_class((rP_2)rn_32.id_class[id_catch[106]]);
        if (rn_32 instanceof bR_2) {
            EZ eZ = (EZ)((bR_2)rn_32).id_break[id_catch[107]];
            this.id_break[BO.id_catch[108]] = eZ;
        } else {
            EZ eZ = new EZ((C_class)this.id_class[id_catch[109]], id_implements[11]);
            this.id_break[BO.id_catch[110]] = eZ;
        }
        if ((rP_2)this.id_break[id_catch[111]] == null) {
            return id_implements[12];
        }
        if (((rP_2)this.id_break[id_catch[112]]).id_break(((Ps_1)this.id_class[id_catch[113]]).id_volatile())) {
            return id_implements[13];
        }
        Object object = this.id_break[id_catch[114]];
        synchronized (object) {
            if ((Gh_1)this.id_break[id_catch[115]] != null) {
                return id_implements[14];
            }
            Object object2 = this.id_break[id_catch[116]];
            synchronized (object2) {
                if ((EW)this.id_break[id_catch[117]] != null) {
                    return id_implements[15];
                }
                this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[118]]));
                this.id_class((rU_2)this.id_break[id_catch[119]], id_implements[16], (EZ)this.id_break[id_catch[120]]);
                return id_implements[17];
            }
        }
    }

    @Override
    public Optional<Double> id_class() {
        double d;
        this.id_while();
        rU_2 rU_22 = ((Ps_1)this.id_class[id_catch[145]]).id_volatile();
        if ((rP_2)this.id_break[id_catch[146]] == null || rU_22 == null || (rU_2)this.id_break[id_catch[147]] == null) {
            return Optional.empty();
        }
        if (((rP_2)this.id_break[id_catch[148]]).id_break(((Ps_1)this.id_class[id_catch[149]]).id_volatile())) {
            this.id_interface();
            return Optional.of(id_private[0]);
        }
        if ((Integer)this.id_break[id_catch[150]] == 0) {
            return Optional.empty();
        }
        double d2 = ((rP_2)this.id_break[id_catch[151]]).id_class((Integer)rU_22.id_break[id_catch[152]], (Integer)rU_22.id_break[id_catch[153]], (Integer)rU_22.id_break[id_catch[154]]);
        if (d2 == (d = ((rP_2)this.id_break[id_catch[155]]).id_class((Integer)((rU_2)this.id_break[BO.id_catch[156]]).id_break[id_catch[157]], (Integer)((rU_2)this.id_break[BO.id_catch[158]]).id_break[id_catch[159]], (Integer)((rU_2)this.id_break[BO.id_catch[160]]).id_break[id_catch[161]]))) {
            return Optional.empty();
        }
        double d3 = Math.abs(d2 - ((rP_2)this.id_break[id_catch[162]]).id_class()) * (double)((Integer)this.id_break[id_catch[163]]).intValue() / Math.abs(d - d2);
        return Optional.of(d3);
    }

    private EW id_class(rfH_2 rfH_22, rP_2 rP_22, a_1 a_12, EZ eZ) {
        Object object;
        rP_2 rP_23 = rP_22;
        if (((Boolean)C_class.id_instanceof().r.id_class[id_catch[193]]).booleanValue() && rP_22 instanceof PZ && !((bw_3)eZ.id_break[id_catch[194]]).id_class(((rja_3)(object = ((PZ)((Object)rP_22)).id_break())).b_(), ((rja_3)object).d_())) {
            rP_23 = new rX_2(((rja_3)object).b_(), ((rja_3)object).d_());
        }
        object = new bi_3(eZ.id_break().id_throw(), a_12, eZ);
        rU_2 rU_22 = ((Ps_1)this.id_class[id_catch[195]]).id_volatile();
        rU_2 rU_23 = new rU_2(rfH_22);
        rfH_2 rfH_23 = rU_22.id_byte(rU_23);
        if (rU_22.c_() == rU_23.c_() && Math.abs(rfH_23.b_()) <= id_implements[30] && Math.abs(rfH_23.d_()) <= id_implements[31]) {
            rU_23 = rU_22;
        }
        return new Ek_1(rU_23, rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rP_23, (bi_3)object, eZ);
    }

    @Override
    public boolean id_break() {
        boolean bl = this.id_else();
        if (bl) {
            this.id_throw();
        }
        ((C_class)this.id_class[id_catch[129]]).id_void().id_case();
        return bl;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{88, -20, 47, 50, -20, 50, 124, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ rW_2 id_throws() {
        return this.id_new();
    }

    private static /* synthetic */ void ntfClinit() {
        BO.id_return();
        BO.id_char();
        BO.id_instanceof();
        BO.id_try();
        BO.id_abstract();
    }

    @Override
    public boolean id_catch() {
        this.id_while();
        return this.id_finally() && (Boolean)this.id_break[id_catch[122]] == false ? id_implements[18] : id_implements[19];
    }

    private void id_goto() {
        this.id_while();
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingQueue)this.id_break[id_catch[4]]).drainTo(arrayList);
        Boolean bl = arrayList.contains((Object)((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[5]])));
        this.id_break[BO.id_catch[6]] = bl;
    }

    public Optional<EW> id_case() {
        this.id_while();
        return Optional.ofNullable((EW)this.id_break[id_catch[125]]);
    }

    public EZ id_continue() {
        this.id_while();
        return (EZ)this.id_break[id_catch[144]];
    }

    public boolean id_else() {
        this.id_while();
        return (Gh_1)this.id_break[id_catch[126]] == null || (Boolean)this.id_break[id_catch[127]] != false ? id_implements[20] : id_implements[21];
    }

    @Override
    public /* synthetic */ rW_2 id_implements() {
        return this.id_package();
    }

    private static void id_instanceof() {
        short[] sArray = new short[220];
        sArray[0] = 13;
        sArray[1] = 14;
        sArray[2] = 17;
        sArray[3] = 17;
        sArray[4] = 17;
        sArray[5] = 2;
        sArray[6] = 11;
        sArray[7] = 1;
        sArray[9] = 16;
        sArray[11] = 4;
        sArray[12] = 4;
        sArray[14] = 9;
        sArray[15] = 7;
        sArray[16] = 6;
        sArray[17] = 7;
        sArray[18] = 8;
        sArray[21] = 8;
        sArray[22] = 9;
        sArray[23] = 8;
        sArray[24] = 10;
        sArray[25] = 10;
        sArray[27] = 14;
        sArray[28] = 13;
        sArray[29] = 12;
        sArray[30] = 12;
        sArray[31] = 12;
        sArray[34] = 1;
        sArray[35] = 16;
        sArray[36] = 1;
        sArray[37] = 16;
        sArray[38] = 12;
        sArray[41] = 6;
        sArray[45] = 2;
        sArray[46] = 2;
        sArray[47] = 1;
        sArray[48] = 2;
        sArray[49] = 7;
        sArray[50] = 1;
        sArray[52] = 1;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[55] = 1;
        sArray[56] = 1;
        sArray[57] = 16;
        sArray[58] = 10;
        sArray[59] = 1;
        sArray[60] = 1;
        sArray[61] = 5;
        sArray[62] = 1;
        sArray[64] = 1;
        sArray[66] = 13;
        sArray[67] = 12;
        sArray[68] = 8;
        sArray[70] = 16;
        sArray[71] = 3;
        sArray[72] = 6;
        sArray[73] = 1;
        sArray[74] = 1;
        sArray[75] = 6;
        sArray[76] = 1;
        sArray[78] = 1;
        sArray[82] = 1;
        sArray[84] = 1;
        sArray[86] = 1;
        sArray[87] = 1;
        sArray[88] = 13;
        sArray[89] = 12;
        sArray[90] = 1;
        sArray[91] = 2;
        sArray[92] = 2;
        sArray[95] = 3;
        sArray[97] = 3;
        sArray[100] = 20;
        sArray[101] = 15;
        sArray[102] = 20;
        sArray[103] = 20;
        sArray[104] = 15;
        sArray[105] = 2;
        sArray[108] = 3;
        sArray[110] = 3;
        sArray[111] = 2;
        sArray[112] = 2;
        sArray[113] = 1;
        sArray[114] = 14;
        sArray[116] = 13;
        sArray[117] = 12;
        sArray[119] = 16;
        sArray[120] = 3;
        sArray[121] = 2;
        sArray[122] = 9;
        sArray[124] = 1;
        sArray[125] = 12;
        sArray[127] = 6;
        sArray[128] = 7;
        sArray[130] = 11;
        sArray[131] = 14;
        sArray[133] = 1;
        sArray[134] = 10;
        sArray[135] = 11;
        sArray[136] = 14;
        sArray[139] = 1;
        sArray[142] = 13;
        sArray[143] = 12;
        sArray[144] = 3;
        sArray[145] = 1;
        sArray[146] = 2;
        sArray[147] = 5;
        sArray[148] = 2;
        sArray[149] = 1;
        sArray[150] = 4;
        sArray[151] = 2;
        sArray[153] = 1;
        sArray[154] = 2;
        sArray[155] = 2;
        sArray[156] = 5;
        sArray[158] = 5;
        sArray[159] = 1;
        sArray[160] = 5;
        sArray[161] = 2;
        sArray[162] = 2;
        sArray[163] = 4;
        sArray[164] = 16;
        sArray[165] = 4;
        sArray[166] = 5;
        sArray[167] = 1;
        sArray[168] = 1;
        sArray[169] = 1;
        sArray[170] = 1;
        sArray[171] = 1;
        sArray[173] = 1;
        sArray[174] = 2;
        sArray[176] = 2;
        sArray[177] = 1;
        sArray[178] = 1;
        sArray[179] = 1;
        sArray[180] = 1;
        sArray[181] = 13;
        sArray[182] = 12;
        sArray[184] = 2;
        sArray[192] = 12;
        sArray[194] = 4;
        sArray[195] = 1;
        sArray[196] = 14;
        sArray[198] = 16;
        sArray[199] = 1;
        sArray[201] = 3;
        sArray[202] = 4;
        sArray[203] = 2;
        sArray[204] = 1;
        sArray[206] = 4;
        sArray[207] = 1;
        sArray[208] = 9;
        sArray[214] = 13;
        sArray[215] = 12;
        sArray[218] = 2;
        sArray[219] = 2;
        id_catch = sArray;
    }

    public Gh_1 id_new() {
        this.id_while();
        return (Gh_1)this.id_break[id_catch[123]];
    }

    public Gh_1 id_package() {
        this.id_while();
        return (Gh_1)this.id_break[id_catch[124]];
    }

    private static void id_return() {
        boolean[] blArray = new boolean[40];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[30] = true;
        blArray[31] = true;
        id_implements = blArray;
    }

    public rU_2 id_super() {
        rU_2 rU_23 = ((Ps_1)this.id_class[id_catch[167]]).id_volatile();
        if (!EF.id_break((Ps_1)this.id_class[id_catch[168]], rU_23.id_case())) {
            if (((Ps_1)this.id_class[id_catch[169]]).id_catch().BL()) {
                int n;
                double d = ((Ps_1)this.id_class[BO.id_catch[170]]).id_catch().Ps().id_break;
                double d2 = ((Ps_1)this.id_class[BO.id_catch[171]]).id_catch().Ps().id_protected;
                ArrayList<rU_2> arrayList = new ArrayList<rU_2>();
                for (n = id_case[0]; n <= id_implements[27]; ++n) {
                    for (int i = id_case[1]; i <= id_implements[28]; ++i) {
                        arrayList.add(new rU_2((Integer)rU_23.id_break[id_catch[172]] + n, (Integer)rU_23.id_break[id_catch[173]], (Integer)rU_23.id_break[id_catch[174]] + i));
                    }
                }
                arrayList.sort(Comparator.comparingDouble(rU_22 -> ((double)((Integer)rU_22.id_break[id_catch[216]]).intValue() + id_private[5] - d) * ((double)((Integer)rU_22.id_break[id_catch[217]]).intValue() + id_private[6] - d) + ((double)((Integer)rU_22.id_break[id_catch[218]]).intValue() + id_private[7] - d2) * ((double)((Integer)rU_22.id_break[id_catch[219]]).intValue() + id_private[8] - d2)));
                for (n = id_implements[29]; n < id_case[2]; ++n) {
                    rU_2 rU_24 = (rU_2)arrayList.get(n);
                    double d3 = Math.abs((double)((Integer)rU_24.id_break[id_catch[175]]).intValue() + id_private[1] - d);
                    double d4 = Math.abs((double)((Integer)rU_24.id_break[id_catch[176]]).intValue() + id_private[2] - d2);
                    if (d3 > id_private[3] && d4 > id_private[4] || !EF.id_break((Ps_1)this.id_class[id_catch[177]], rU_24.id_case()) || !EF.id_class((Ps_1)this.id_class[id_catch[178]], rU_24) || !EF.id_class((Ps_1)this.id_class[id_catch[179]], rU_24.id_class())) continue;
                    return rU_24;
                }
            } else if (EF.id_break((Ps_1)this.id_class[id_catch[180]], rU_23.id_case().id_case())) {
                return rU_23.id_case();
            }
        }
        return rU_23;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_throw() {
        this.id_while();
        this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[135]]));
        Object object = this.id_break[id_catch[136]];
        synchronized (object) {
            this.id_case().ifPresent(EW::id_catch);
            if ((Gh_1)this.id_break[id_catch[137]] != null) {
                Object var7_2 = null;
                this.id_break[BO.id_catch[138]] = var7_2;
                Object var8_3 = null;
                this.id_break[BO.id_catch[139]] = var8_3;
                ((C_class)this.id_class[id_catch[140]]).id_int().id_class();
                ((C_class)this.id_class[id_catch[141]]).id_int().id_break().id_class();
            }
        }
    }

    private static void id_try() {
        double[] dArray = new double[9];
        dArray[1] = 0.5;
        dArray[2] = 0.5;
        dArray[3] = 0.8;
        dArray[4] = 0.8;
        dArray[5] = 0.5;
        dArray[6] = 0.5;
        dArray[7] = 0.5;
        dArray[8] = 0.5;
        id_private = dArray;
    }

    private void id_while() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[3]];
            objectArray[BO.id_case[4]] = id_implements[32];
            objectArray[BO.id_case[5]] = id_implements[33];
            objectArray[BO.id_case[6]] = id_implements[34];
            objectArray[BO.id_case[7]] = id_implements[35];
            objectArray[BO.id_case[8]] = id_implements[36];
            objectArray[BO.id_case[9]] = id_implements[37];
            objectArray[BO.id_case[10]] = id_implements[38];
            objectArray[BO.id_case[11]] = id_implements[39];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_public() {
        this.id_while();
        Boolean bl = id_implements[1];
        this.id_break[BO.id_catch[14]] = bl;
        if (((Boolean)this.id_break[id_catch[15]]).booleanValue() && ((Boolean)this.id_break[id_catch[16]]).booleanValue()) {
            Boolean bl2 = id_implements[2];
            this.id_break[BO.id_catch[17]] = bl2;
            if (((Boolean)this.id_break[id_catch[18]]).booleanValue()) {
                ((C_class)this.id_class[id_catch[19]]).id_int().id_class();
                ((C_class)this.id_class[id_catch[20]]).id_int().id_break().id_class();
            }
            Boolean bl3 = id_implements[3];
            this.id_break[BO.id_catch[21]] = bl3;
            Boolean bl4 = id_implements[4];
            this.id_break[BO.id_catch[22]] = bl4;
            return;
        }
        Boolean bl5 = id_implements[5];
        this.id_break[BO.id_catch[23]] = bl5;
        if (((Boolean)this.id_break[id_catch[24]]).booleanValue()) {
            Boolean bl6 = id_implements[6];
            this.id_break[BO.id_catch[25]] = bl6;
            ((C_class)this.id_class[id_catch[26]]).id_int().id_class();
        }
        Object object = this.id_break[id_catch[27]];
        synchronized (object) {
            Object object2 = this.id_break[id_catch[28]];
            synchronized (object2) {
                if ((EW)this.id_break[id_catch[29]] != null) {
                    rU_2 rU_22 = ((EW)this.id_break[id_catch[30]]).id_case();
                    Optional<a_1> optional = ((EW)this.id_break[id_catch[31]]).id_class();
                    if (!((Gh_1)this.id_break[id_catch[32]] != null && ((Gh_1)this.id_break[id_catch[33]]).id_class().id_protected().equals(rU_22) || rU_22.equals(((Ps_1)this.id_class[id_catch[34]]).id_volatile()) || rU_22.equals((rU_2)this.id_break[id_catch[35]]) || optional.isPresent() && (optional.get().id_break().contains(((Ps_1)this.id_class[id_catch[36]]).id_volatile()) || optional.get().id_break().contains((rU_2)this.id_break[id_catch[37]])))) {
                        ((EW)this.id_break[id_catch[38]]).id_catch();
                    }
                }
            }
            if ((Gh_1)this.id_break[id_catch[39]] == null) {
                return;
            }
            Boolean bl7 = ((Gh_1)this.id_break[id_catch[40]]).id_throws();
            this.id_break[BO.id_catch[41]] = bl7;
            if (((Gh_1)this.id_break[id_catch[42]]).id_private() || ((Gh_1)this.id_break[id_catch[43]]).id_protected()) {
                Object var20_13 = null;
                this.id_break[BO.id_catch[44]] = var20_13;
                if ((rP_2)this.id_break[id_catch[45]] == null || ((rP_2)this.id_break[id_catch[46]]).id_break(((Ps_1)this.id_class[id_catch[47]]).id_volatile())) {
                    this.id_byte("All done. At " + (rP_2)this.id_break[id_catch[48]]);
                    this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[49]]));
                    Object var21_14 = null;
                    this.id_break[BO.id_catch[50]] = var21_14;
                    if (((Boolean)C_class.id_instanceof().id_char.id_class[id_catch[51]]).booleanValue()) {
                        ((Ps_1)this.id_class[id_catch[52]]).id_case().id_catch();
                    }
                    return;
                }
                if ((Gh_1)this.id_break[id_catch[53]] != null && !((Gh_1)this.id_break[id_catch[54]]).id_class().id_break().contains(((Ps_1)this.id_class[id_catch[55]]).id_volatile()) && !((Gh_1)this.id_break[id_catch[56]]).id_class().id_break().contains((rU_2)this.id_break[id_catch[57]])) {
                    this.id_byte(id_throws[0]);
                    this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[58]]));
                    Object var22_15 = null;
                    this.id_break[BO.id_catch[59]] = var22_15;
                }
                if ((Gh_1)this.id_break[id_catch[60]] != null) {
                    this.id_byte(id_throws[1]);
                    this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[61]]));
                    Gh_1 gh_1 = (Gh_1)this.id_break[id_catch[62]];
                    this.id_break[BO.id_catch[63]] = gh_1;
                    Object var24_17 = null;
                    this.id_break[BO.id_catch[64]] = var24_17;
                    ((Gh_1)this.id_break[id_catch[65]]).id_throws();
                    return;
                }
                object2 = this.id_break[id_catch[66]];
                synchronized (object2) {
                    if ((EW)this.id_break[id_catch[67]] != null) {
                        this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[68]]));
                        return;
                    }
                    this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[69]]));
                    this.id_class((rU_2)this.id_break[id_catch[70]], id_implements[7], (EZ)this.id_break[id_catch[71]]);
                }
                return;
            }
            if (((Boolean)this.id_break[id_catch[72]]).booleanValue() && (Gh_1)this.id_break[id_catch[73]] != null && ((Gh_1)this.id_break[id_catch[74]]).id_implements()) {
                this.id_byte(id_throws[2]);
                this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[75]]));
                Gh_1 gh_1 = (Gh_1)this.id_break[id_catch[76]];
                this.id_break[BO.id_catch[77]] = gh_1;
                Object var26_20 = null;
                this.id_break[BO.id_catch[78]] = var26_20;
                ((Gh_1)this.id_break[id_catch[79]]).id_throws();
                return;
            }
            if (((Boolean)C_class.id_instanceof().PI.id_class[id_catch[80]]).booleanValue()) {
                Gh_1 gh_1 = ((Gh_1)this.id_break[id_catch[81]]).id_class((Gh_1)this.id_break[id_catch[82]]);
                this.id_break[BO.id_catch[83]] = gh_1;
            }
            if ((Gh_1)this.id_break[id_catch[84]] != null && ((Gh_1)this.id_break[id_catch[85]]).id_class().id_protected().equals(((Gh_1)this.id_break[id_catch[86]]).id_class().id_protected())) {
                Object var28_22 = null;
                this.id_break[BO.id_catch[87]] = var28_22;
            }
            object2 = this.id_break[id_catch[88]];
            synchronized (object2) {
                if ((EW)this.id_break[id_catch[89]] != null) {
                    return;
                }
                if ((Gh_1)this.id_break[id_catch[90]] != null) {
                    return;
                }
                if ((rP_2)this.id_break[id_catch[91]] == null || ((rP_2)this.id_break[id_catch[92]]).id_break(((Gh_1)this.id_break[id_catch[93]]).id_class().id_protected())) {
                    return;
                }
                if (this.id_class(id_implements[8]).get() < (double)((Integer)C_class.id_instanceof().H.id_class[id_catch[94]]).intValue()) {
                    this.id_byte(id_throws[3]);
                    this.id_class((p_1)((Object)p_1.staticFields210b45dc4af9338b80bcf1ca23dea17d[id_catch[95]]));
                    this.id_class(((Gh_1)this.id_break[id_catch[96]]).id_class().id_protected(), id_implements[9], (EZ)this.id_break[id_catch[97]]);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void id_private() {
        this.id_while();
        this.id_break();
        this.id_throw();
        Object object = this.id_break[id_catch[142]];
        synchronized (object) {
            Object var7_2 = null;
            this.id_break[BO.id_catch[143]] = var7_2;
        }
    }

    private static void id_abstract() {
        id_case = new byte[]{-1, -1, 4, 18, 4, 6, 7, 8, 9, 10, 11, 15};
    }

    public void id_final() {
        this.id_while();
        Boolean bl = id_implements[22];
        this.id_break[BO.id_catch[128]] = bl;
    }

    public boolean id_synchronized() {
        if (this.id_else()) {
            this.id_throw();
            return id_implements[23];
        }
        return id_implements[24];
    }
}

