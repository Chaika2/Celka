/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BA;
import celestial.BE;
import celestial.BF;
import celestial.BI;
import celestial.BJ;
import celestial.BL;
import celestial.BM;
import celestial.BO;
import celestial.BX;
import celestial.BZ;
import celestial.Bb_1;
import celestial.Bc_1;
import celestial.Bk_1;
import celestial.Bm_1;
import celestial.Br_1;
import celestial.Bv_1;
import celestial.Bx_1;
import celestial.C_case;
import celestial.C_final;
import celestial.C_private;
import celestial.C_public;
import celestial.C_throws;
import celestial.C_volatile;
import celestial.EJ;
import celestial.Ed_1;
import celestial.F;
import celestial.GH;
import celestial.GU;
import celestial.GW;
import celestial.GY;
import celestial.Gd_1;
import celestial.Ge_1;
import celestial.Gf_1;
import celestial.Gn_1;
import celestial.Go_1;
import celestial.MS;
import celestial.PA;
import celestial.PD;
import celestial.PF;
import celestial.PL;
import celestial.PP;
import celestial.PS;
import celestial.PT;
import celestial.PU;
import celestial.PV;
import celestial.Pa_1;
import celestial.Pg_1;
import celestial.Pj_1;
import celestial.Pl_1;
import celestial.Pp_1;
import celestial.Pq_1;
import celestial.Ps_1;
import celestial.Pt_1;
import celestial.Pv_1;
import celestial.Py_1;
import celestial.SL;
import celestial.SO;
import celestial.SQ;
import celestial.SY;
import celestial.U;
import celestial.bO_2;
import celestial.bV_2;
import celestial.bW_2;
import celestial.bY_2;
import celestial.bf_3;
import celestial.br_3;
import celestial.by_3;
import celestial.rA_2;
import celestial.rF_2;
import celestial.rL_2;
import celestial.rN_2;
import celestial.rQ_2;
import celestial.rZ_2;
import celestial.rc_3;
import celestial.rm_3;
import celestial.ro_3;
import celestial.rrFx_1;
import celestial.rrNh_1;
import celestial.rr_3;
import celestial.rrvY;
import celestial.rrva_1;
import celestial.rrwW_2;
import celestial.ru_3;
import celestial.rv_3;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_class
implements C_case {
    public static Object[] id_class;
    private static int[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;
    private static long[] id_private;
    public Object[] id_break;

    public Bk_1 id_boolean() {
        return (Bk_1)this.id_break[id_case[84]];
    }

    @Override
    public /* synthetic */ rN_2 id_char() {
        return this.id_break();
    }

    public GY id_byte() {
        return (GY)this.id_break[id_case[54]];
    }

    public bV_2 id_int() {
        return (bV_2)this.id_break[id_case[50]];
    }

    @Override
    public /* synthetic */ rm_3 id_long() {
        return this.id_abstract();
    }

    @Override
    public void id_float() {
        new Thread(() -> {
            try {
                Thread.sleep(id_private[0]);
                PP.b_.execute(() -> PP.b_.id_break(new bf_3()));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }).start();
    }

    @Override
    public /* synthetic */ ro_3 id_double() {
        return this.E();
    }

    public C_class() {
        this.W();
        Ed_1 ed_1 = new Ed_1(this);
        this.id_break[C_class.id_case[0]] = ed_1;
        MS mS = new MS(this);
        this.id_break[C_class.id_case[1]] = mS;
        Pl_1 pl_1 = new Pl_1(this);
        this.id_break[C_class.id_case[2]] = pl_1;
        Br_1 br_1 = new Br_1(this);
        this.id_break[C_class.id_case[3]] = br_1;
        BO bO = new BO(this);
        this.id_break[C_class.id_case[4]] = bO;
        new BE(this);
        new rrFx_1(this);
        new rrvY(this);
        new rrva_1(this);
        new Py_1(this);
        new PV(this);
        SL sL = new SL(this);
        this.id_break[C_class.id_case[5]] = sL;
        Bb_1 bb_1 = new Bb_1(this);
        this.id_break[C_class.id_case[6]] = bb_1;
        new BM(this);
        BF bF = new BF(this);
        this.id_break[C_class.id_case[7]] = bF;
        BX bX = new BX(this);
        this.id_break[C_class.id_case[8]] = bX;
        Pg_1 pg_1 = new Pg_1(this);
        this.id_break[C_class.id_case[9]] = pg_1;
        new BJ(this);
        Pt_1 pt_1 = new Pt_1(this);
        this.id_break[C_class.id_case[10]] = pt_1;
        PU pU = new PU(this);
        this.id_break[C_class.id_case[11]] = pU;
        bV_2 bV_22 = new bV_2(this);
        this.id_break[C_class.id_case[12]] = bV_22;
        new BL(this);
        new PA(this);
        GU gU = new GU(this);
        this.id_break[C_class.id_case[13]] = gU;
        new Pa_1(this);
        new PD(this);
        new SO(this);
        new BI(this);
        new PT(this);
        new BZ(this);
        Pj_1 pj_1 = new Pj_1(this);
        this.id_break[C_class.id_case[14]] = pj_1;
        Pq_1 pq_1 = new Pq_1(this);
        this.id_break[C_class.id_case[15]] = pq_1;
        new Bx_1(this);
        PF pF = new PF(this);
        this.id_break[C_class.id_case[16]] = pF;
        new Bc_1(this);
        new Bm_1(this);
        new Bv_1(this);
        new Pp_1(this);
        new SQ(this);
        Bk_1 bk_1 = new Bk_1(this);
        this.id_break[C_class.id_case[17]] = bk_1;
        new PL(this);
        BA bA = new BA(this);
        this.id_break[C_class.id_case[18]] = bA;
        bY_2 bY_22 = new bY_2(this);
        this.id_break[C_class.id_case[19]] = bY_22;
        GY gY = new GY(this);
        this.id_break[C_class.id_case[21]] = gY;
        ((bY_2)this.id_break[id_case[20]]).id_class(gY);
        Ge_1 ge_1 = new Ge_1(this);
        this.id_break[C_class.id_case[23]] = ge_1;
        ((bY_2)this.id_break[id_case[22]]).id_class(ge_1);
        Gn_1 gn_1 = new Gn_1(this);
        this.id_break[C_class.id_case[25]] = gn_1;
        ((bY_2)this.id_break[id_case[24]]).id_class(gn_1);
        Go_1 go_1 = new Go_1(this);
        this.id_break[C_class.id_case[27]] = go_1;
        ((bY_2)this.id_break[id_case[26]]).id_class(go_1);
        GW gW = new GW(this);
        this.id_break[C_class.id_case[29]] = gW;
        ((bY_2)this.id_break[id_case[28]]).id_class(gW);
        GH gH = new GH(this);
        this.id_break[C_class.id_case[31]] = gH;
        ((bY_2)this.id_break[id_case[30]]).id_class(gH);
        Gd_1 gd_1 = new Gd_1(this);
        this.id_break[C_class.id_case[33]] = gd_1;
        ((bY_2)this.id_break[id_case[32]]).id_class(gd_1);
        Gf_1 gf_1 = new Gf_1(this);
        this.id_break[C_class.id_case[35]] = gf_1;
        ((bY_2)this.id_break[id_case[34]]).id_class(gf_1);
        bO_2 bO_22 = new bO_2(this);
        this.id_break[C_class.id_case[37]] = bO_22;
        ((bY_2)this.id_break[id_case[36]]).id_class(bO_22);
        bW_2 bW_22 = new bW_2(this);
        this.id_break[C_class.id_case[39]] = bW_22;
        ((bY_2)this.id_break[id_case[38]]).id_class(bW_22);
        br_3 br_32 = new br_3(this);
        this.id_break[C_class.id_case[41]] = br_32;
        ((bY_2)this.id_break[id_case[40]]).id_class(br_32);
        SY sY = new SY();
        this.id_break[C_class.id_case[42]] = sY;
        by_3 by_32 = new by_3(this);
        this.id_break[C_class.id_case[43]] = by_32;
        EJ eJ = new EJ(this);
        this.id_break[C_class.id_case[44]] = eJ;
        ((rrwW_2)rrwW_2.staticFieldsd828d5c982463367b63d6cc3c26fd998[id_case[45]]).id_class(this);
        ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_case[46]])).id_class(this);
    }

    static {
        C_class.ntfClinit();
    }

    public static File B() {
        return (File)id_class[id_case[69]];
    }

    private static void J() {
        short[] sArray = new short[85];
        sArray[1] = 32;
        sArray[2] = 17;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 16;
        sArray[6] = 19;
        sArray[7] = 26;
        sArray[8] = 20;
        sArray[9] = 21;
        sArray[10] = 18;
        sArray[11] = 27;
        sArray[12] = 3;
        sArray[13] = 15;
        sArray[14] = 23;
        sArray[15] = 24;
        sArray[16] = 22;
        sArray[17] = 28;
        sArray[18] = 25;
        sArray[19] = 29;
        sArray[20] = 29;
        sArray[21] = 4;
        sArray[22] = 29;
        sArray[23] = 5;
        sArray[24] = 29;
        sArray[25] = 7;
        sArray[26] = 29;
        sArray[27] = 6;
        sArray[28] = 29;
        sArray[29] = 8;
        sArray[30] = 29;
        sArray[31] = 9;
        sArray[32] = 29;
        sArray[33] = 14;
        sArray[34] = 29;
        sArray[35] = 13;
        sArray[36] = 29;
        sArray[37] = 10;
        sArray[38] = 29;
        sArray[39] = 11;
        sArray[40] = 29;
        sArray[41] = 12;
        sArray[42] = 33;
        sArray[43] = 30;
        sArray[44] = 31;
        sArray[49] = 29;
        sArray[50] = 3;
        sArray[51] = 7;
        sArray[52] = 6;
        sArray[53] = 32;
        sArray[54] = 4;
        sArray[55] = 8;
        sArray[56] = 2;
        sArray[57] = 9;
        sArray[58] = 5;
        sArray[59] = 13;
        sArray[60] = 1;
        sArray[61] = 30;
        sArray[62] = 33;
        sArray[64] = 31;
        sArray[65] = 10;
        sArray[66] = 11;
        sArray[67] = 12;
        sArray[69] = 1;
        sArray[70] = 14;
        sArray[71] = 15;
        sArray[72] = 16;
        sArray[73] = 17;
        sArray[74] = 18;
        sArray[75] = 19;
        sArray[76] = 20;
        sArray[77] = 21;
        sArray[78] = 22;
        sArray[79] = 23;
        sArray[80] = 24;
        sArray[81] = 25;
        sArray[82] = 26;
        sArray[83] = 27;
        sArray[84] = 28;
        id_case = sArray;
    }

    public EJ S() {
        return (EJ)this.id_break[id_case[64]];
    }

    @Override
    public /* synthetic */ C_final id_this() {
        return this.id_while();
    }

    public GW b() {
        return (GW)this.id_break[id_case[55]];
    }

    private static void x() {
        id_catch = new String[]{new String("baritone")};
    }

    @Override
    public U s() {
        return (Ed_1)this.id_break[id_case[63]];
    }

    private static void h() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    public static Executor id_interface() {
        return (ThreadPoolExecutor)id_class[id_case[68]];
    }

    @Override
    public /* synthetic */ ru_3 id_class() {
        return this.id_transient();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x999C1814;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -89, 107, -20, -123, 43, -100, 91}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3BE0F1A2E4EDA3D6L;
    }

    public void id_class(Pv_1 pv_1) {
        ((Ed_1)this.id_break[id_case[48]]).id_break(pv_1);
    }

    private static void k() {
        id_byte = new int[]{Integer.MAX_VALUE};
    }

    public SL id_default() {
        return (SL)this.id_break[id_case[72]];
    }

    public Pl_1 id_short() {
        return (Pl_1)this.id_break[id_case[73]];
    }

    public bY_2 id_void() {
        return (bY_2)this.id_break[id_case[49]];
    }

    @Override
    public /* synthetic */ rQ_2 r() {
        return this.b();
    }

    public bO_2 id_break() {
        return (bO_2)this.id_break[id_case[65]];
    }

    public void id_break(Pv_1 pv_1) {
        ((Ed_1)this.id_break[id_case[47]]).id_class(pv_1);
    }

    @Override
    public /* synthetic */ rZ_2 id_throws() {
        return this.id_finally();
    }

    private static /* synthetic */ void ntfClinit() {
        C_class.h();
        C_class.x();
        C_class.X();
        C_class.J();
        C_class.O();
        C_class.k();
        C_class.Q();
    }

    public Gn_1 M() {
        return (Gn_1)this.id_break[id_case[51]];
    }

    private void W() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[2]];
        }
    }

    public Pg_1 P() {
        return (Pg_1)this.id_break[id_case[77]];
    }

    public Gf_1 id_finally() {
        return (Gf_1)this.id_break[id_case[59]];
    }

    @Override
    public /* synthetic */ C_volatile id_catch() {
        return this.id_private();
    }

    public Gd_1 G() {
        return (Gd_1)this.id_break[id_case[70]];
    }

    private static void O() {
        id_throws = new byte[]{4, 24, 35, 2};
    }

    public Ge_1 id_extends() {
        return (Ge_1)this.id_break[id_case[58]];
    }

    @Override
    public /* synthetic */ rr_3 id_goto() {
        return this.id_void();
    }

    @Override
    public /* synthetic */ rL_2 id_case() {
        return this.id_extends();
    }

    public GU id_const() {
        return (GU)this.id_break[id_case[71]];
    }

    public BF id_continue() {
        return (BF)this.id_break[id_case[82]];
    }

    public Go_1 id_else() {
        return (Go_1)this.id_break[id_case[52]];
    }

    public Pq_1 id_for() {
        return (Pq_1)this.id_break[id_case[80]];
    }

    @Override
    public /* synthetic */ C_public id_implements() {
        return this.id_strictfp();
    }

    @Override
    public /* synthetic */ rc_3 id_import() {
        return this.M();
    }

    public static C_private id_instanceof() {
        return C_throws.id_break();
    }

    @Override
    public /* synthetic */ PS id_new() {
        return this.id_int();
    }

    public Pj_1 id_package() {
        return (Pj_1)this.id_break[id_case[79]];
    }

    public BA id_return() {
        return (BA)this.id_break[id_case[81]];
    }

    @Override
    public /* synthetic */ rF_2 id_super() {
        return this.id_else();
    }

    @Override
    public /* synthetic */ F id_switch() {
        return this.S();
    }

    @Override
    public Ps_1 id_throw() {
        return (Ps_1)this.id_break[id_case[53]];
    }

    public PF id_try() {
        return (PF)this.id_break[id_case[78]];
    }

    public BO id_while() {
        return (BO)this.id_break[id_case[60]];
    }

    public PU id_static() {
        return (PU)this.id_break[id_case[83]];
    }

    @Override
    public /* synthetic */ rv_3 id_public() {
        return this.id_byte();
    }

    @Override
    public /* synthetic */ rA_2 id_protected() {
        return this.id_volatile();
    }

    public Br_1 id_private() {
        return (Br_1)this.id_break[id_case[56]];
    }

    public bW_2 id_abstract() {
        return (bW_2)this.id_break[id_case[66]];
    }

    public BX id_final() {
        return (BX)this.id_break[id_case[76]];
    }

    public GH id_transient() {
        return (GH)this.id_break[id_case[57]];
    }

    public br_3 id_volatile() {
        return (br_3)this.id_break[id_case[67]];
    }

    public Bb_1 id_synchronized() {
        return (Bb_1)this.id_break[id_case[75]];
    }

    public Pt_1 id_native() {
        return (Pt_1)this.id_break[id_case[74]];
    }

    public SY id_strictfp() {
        return (SY)this.id_break[id_case[62]];
    }

    public by_3 E() {
        return (by_3)this.id_break[id_case[61]];
    }

    private static void X() {
        id_private = new long[]{100L, 60L};
    }

    private static void Q() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 60L, Enum.valueOf(TimeUnit.class, "SECONDS"), new SynchronousQueue());
        new File("C:\\Celestial\\Beta 1.16.5\\baritone").toPath();
        id_class = objectArray;
    }
}

