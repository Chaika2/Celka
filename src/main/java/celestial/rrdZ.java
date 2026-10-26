/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBGeometryShader4
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.EXTGeometryShader4
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL43
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.KHRDebug
 */
package celestial;

import celestial.HF;
import celestial.HU;
import celestial.Hb_1;
import celestial.Hh_1;
import celestial.MD;
import celestial.MT;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.VZ;
import celestial.Vd_1;
import celestial.Vl_1;
import celestial.Vs_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.cq_3;
import celestial.fJ_2;
import celestial.ff_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.jI_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.ly_3;
import celestial.rLD;
import celestial.rVL;
import celestial.rXE;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgN_2;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rji_3;
import celestial.rlG_2;
import celestial.rpm_3;
import celestial.rqO_2;
import celestial.rrMz_1;
import celestial.rrTR;
import celestial.rrWV;
import celestial.rrWu_1;
import celestial.rrWz_1;
import celestial.rrXw_1;
import celestial.rrbN_2;
import celestial.rrbW_2;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrbo_3;
import celestial.rrdA;
import celestial.rrdD;
import celestial.rrdF;
import celestial.rrdG;
import celestial.rrdI;
import celestial.rrdJ;
import celestial.rrdL;
import celestial.rrdM;
import celestial.rrdN;
import celestial.rrdO;
import celestial.rrdP;
import celestial.rrdQ;
import celestial.rrdT;
import celestial.rrdU;
import celestial.rrdV;
import celestial.rrdX;
import celestial.rrda_1;
import celestial.rrdb_1;
import celestial.rrdc_1;
import celestial.rrdf_1;
import celestial.rrdg_1;
import celestial.rrdh_1;
import celestial.rrdj_1;
import celestial.rrdl_1;
import celestial.rrdm_1;
import celestial.rrdt_1;
import celestial.rrdx_1;
import celestial.rrdy_1;
import celestial.rrdz_1;
import celestial.rrkC;
import celestial.rrkD;
import celestial.rrkF;
import celestial.rrkG;
import celestial.rrkH;
import celestial.rrkK;
import celestial.rrkL;
import celestial.rrkQ;
import celestial.rrkT;
import celestial.rrkU;
import celestial.rrkb_1;
import celestial.rrke_1;
import celestial.rrki_1;
import celestial.rrkl_1;
import celestial.rrkn_1;
import celestial.rrkp_1;
import celestial.rrkq_1;
import celestial.rrks_1;
import celestial.rrxA_2;
import celestial.rrxK_2;
import celestial.rrxU_2;
import celestial.rrxV_2;
import celestial.rrxW_2;
import celestial.rrxY_2;
import celestial.rrxa_3;
import celestial.rrxe_3;
import celestial.rrxf_3;
import celestial.rrxg_3;
import celestial.rrxi_3;
import celestial.rrxj_3;
import celestial.rrxn_3;
import celestial.rrxo_3;
import celestial.rrxr_3;
import celestial.rrxt_3;
import celestial.rrxz_3;
import celestial.rrzE_2;
import celestial.rrzQ_2;
import celestial.rrzX_2;
import celestial.rrzc_3;
import celestial.rxJ_2;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.yS_2;
import celestial.yX_2;
import celestial.yb_3;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBGeometryShader4;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.EXTGeometryShader4;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.KHRDebug;

public class rrdZ {
    public static QY id_class;
    public static Hh_1 id_break;
    public static boolean id_byte;
    public static boolean id_protected;
    public static GLCapabilities id_throws;
    public static String id_case;
    public static String id_catch;
    public static String id_private;
    public static boolean id_implements;
    public static int id_finally;
    private static int El;
    private static int EH;
    public static int id_extends;
    public static int id_native;
    public static boolean id_volatile;
    public static boolean id_final;
    public static boolean id_package;
    public static boolean id_int;
    public static boolean id_new;
    public static boolean id_continue;
    public static boolean id_super;
    private static boolean Ey;
    private static boolean Ep;
    private static boolean Eq;
    private static boolean ET;
    private static boolean Et;
    public static boolean id_this;
    public static boolean id_else;
    public static boolean id_synchronized;
    public static float[] id_return;
    public static float[] id_public;
    public static float[] id_goto;
    public static float[] id_while;
    public static float[] id_try;
    public static float[] id_instanceof;
    public static float[] id_throw;
    public static float[] id_interface;
    private static float[] Ew;
    public static rji_3 id_char;
    public static float id_abstract;
    public static float id_long;
    public static float id_float;
    public static long id_void;
    public static long id_static;
    public static long id_import;
    public static float id_short;
    public static float id_default;
    public static float id_const;
    public static int id_strictfp;
    public static long id_boolean;
    public static long id_transient;
    public static long id_for;
    public static int id_double;
    public static float id_switch;
    public static float r;
    public static int P;
    public static VZ B;
    public static boolean S;
    public static float s;
    public static float E;
    public static float G;
    public static float b;
    public static float M;
    public static boolean O;
    public static int h;
    public static int X;
    public static float J;
    public static float x;
    public static float d;
    public static float k;
    public static float W;
    public static float z;
    public static boolean Q;
    public static int N;
    public static float c;
    public static float u;
    public static boolean m;
    public static boolean Z;
    public static rrdX v;
    private static int EI;
    public static int F;
    public static int L;
    public static int A;
    public static int n;
    public static int C;
    public static boolean l;
    public static boolean H;
    public static boolean y;
    public static boolean p;
    public static boolean q;
    public static boolean T;
    public static boolean t;
    public static boolean w;
    public static boolean I;
    public static boolean f;
    private static boolean Ef;
    private static boolean Ej;
    private static int EV;
    private static boolean Eg;
    public static int j;
    public static int V;
    private static rrkq_1 ER;
    public static rrkl_1 g;
    public static rrkL R;
    public static rrkL Y;
    public static rrkL o;
    public static rrkL K;
    public static rrkL D;
    public static rrkL U;
    public static rrkL e;
    public static rrkL a;
    public static rrkL i;
    public static rrkL rr;
    public static rrkL rP;
    public static rrkL rB;
    public static rrkL rS;
    public static rrkL rs;
    public static rrkL rE;
    public static rrkL rG;
    public static rrkL rb;
    public static rrkL rM;
    public static rrkL rO;
    public static rrkL rh;
    public static rrkL rX;
    public static rrkL rJ;
    public static rrkL rx;
    public static rrkL rd;
    public static rrkL rk;
    public static rrkL rW;
    public static rrkL rz;
    public static rrkL rQ;
    public static rrkL rN;
    public static rrkL rc;
    public static rrkL ru;
    public static rrkL rm;
    public static rrkL rZ;
    public static rrkL rv;
    public static rrkL rF;
    public static rrkL rL;
    public static rrkL rA;
    public static rrkL rn;
    public static rrkL rC;
    public static rrkL rl;
    public static rrkL rH;
    public static rrkL ry;
    public static rrkL rp;
    public static rrkL rq;
    public static rrkL rT;
    public static rrkL rt;
    public static rrkL rw;
    public static rrkL rI;
    public static rrkL rf;
    public static rrkL rj;
    public static rrkL rV;
    public static rrkL rg;
    public static rrkL rR;
    public static rrkL rY;
    public static rrkL ro;
    public static rrkL rK;
    public static rrkF rD;
    public static rrkC rU;
    public static rrkC re;
    public static rrkL ra;
    public static rrkL ri;
    public static rrkL Pr;
    public static rrkL PP;
    public static rrkF PB;
    public static rrkF PS;
    public static rrkF Ps;
    public static rrkF PE;
    public static rrkF PG;
    public static rrkF Pb;
    public static rrkF PM;
    public static rrkF PO;
    public static rrkF Ph;
    public static rrkF PX;
    public static rrkC PJ;
    public static rrkC Px;
    public static rrkC Pd;
    public static rrkC Pk;
    public static rrkC PW;
    public static rrkC Pz;
    public static rrkp_1 PQ;
    public static rrkp_1 PN;
    public static rrkp_1 Pc;
    public static rrkp_1 Pu;
    public static rrkp_1 Pm;
    public static rrkp_1 PZ;
    public static rrkp_1 Pv;
    public static rrkp_1 PF;
    public static rrkp_1 PL;
    public static rrkp_1 PA;
    public static rrkF Pn;
    public static rrkF PC;
    public static rrkn_1 Pl;
    public static rrkn_1 PH;
    public static rrkn_1 Py;
    public static rrkL Pp;
    public static rrkL Pq;
    public static rrkF PT;
    public static rrkF Pt;
    public static rrkF Pw;
    public static rrkL PI;
    public static rrkF Pf;
    public static rrkn_1 Pj;
    public static rrkl_1 PV;
    public static rrkH Pg;
    public static rrkL PR;
    public static rrkF PY;
    public static rrkL Po;
    public static double PK;
    public static double PD;
    public static double PU;
    public static double Pe;
    public static double Pa;
    public static double Pi;
    public static int Br;
    public static int BP;
    public static boolean BB;
    public static boolean BS;
    public static int Bs;
    public static int BE;
    public static int BG;
    public static int Bb;
    public static float BM;
    public static float BO;
    public static boolean Bh;
    public static float BX;
    public static boolean BJ;
    public static boolean Bx;
    public static final int Bd = 8;
    public static final int Bk = 16;
    public static final int BW = 3;
    public static final int Bz = 2;
    public static final int BQ = 2;
    public static int BN;
    public static int Bc;
    public static int Bu;
    public static int Bm;
    public static int BZ;
    public static int Bv;
    public static boolean BF;
    public static rrdF BL;
    public static rrdF BA;
    private static int[] EY;
    public static boolean[] Bn;
    public static rji_3[] BC;
    private static final rji_3 Eo;
    private static final rji_3 EK;
    private static int[] ED;
    public static boolean[] Bl;
    public static rji_3[] BH;
    private static rrdh_1 EU;
    public static final rrdG By;
    public static final rrdG Bp;
    public static final rrdG Bq;
    public static final rrdG BT;
    public static final rrdG[] Bt;
    public static final rrdG[] Bw;
    public static final rrdG BI;
    public static final rrdG Bf;
    public static final rrdG Bj;
    public static final rrdG BV;
    public static final rrdG Bg;
    public static final rrdG BR;
    public static final rrdG BY;
    public static final rrdG Bo;
    public static final rrdG BK;
    public static final rrdG BD;
    public static final rrdG BU;
    public static final rrdG Be;
    public static final rrdG Ba;
    public static final rrdG Bi;
    public static final rrdG Sr;
    public static final rrdG SP;
    public static final rrdG SB;
    public static final rrdG SS;
    public static final rrdG Ss;
    public static final rrdG SE;
    public static final rrdG SG;
    public static final rrdG[] Sb;
    public static final rrdG SM;
    public static final rrdG SO;
    public static final rrdG Sh;
    public static final rrdG SX;
    public static final rrdG[] SJ;
    public static final rrdG Sx;
    public static final rrdG Sd;
    public static final int Sk;
    public static final rrdG[] SW;
    public static rrdG Sz;
    public static int SQ;
    private static rrdb_1 Ee;
    private static boolean Ea;
    public static boolean SN;
    public static boolean Sc;
    public static Properties Su;
    public static Properties Sm;
    public static ff_3 SZ;
    public static boolean[] Sv;
    public static boolean[] SF;
    public static boolean[] SL;
    public static boolean[] SA;
    public static boolean[] Sn;
    public static boolean SC;
    public static boolean Sl;
    public static float SH;
    public static float Sy;
    public static float Sp;
    public static int Sq;
    public static int ST;
    public static int St;
    public static int Sw;
    public static int SI;
    public static int Sf;
    public static boolean Sj;
    public static boolean SV;
    public static boolean Sg;
    public static rrdf_1 SR;
    public static rrdf_1 SY;
    public static int So;
    public static final int SK = 3;
    public static final int SD = 2;
    public static final String[] SU;
    public static final String[] Se;
    public static final int[] Sa;
    public static final int[] Si;
    private static rrxi_3 Ei;
    public static boolean sr;
    public static String sP;
    public static final String sB = "OFF";
    public static final String sS = "(internal)";
    public static final String ss = "shaderpacks";
    public static final String sE = "optionsshaders.txt";
    public static final File sG;
    public static File sb;
    private static rrdD[] Gr;
    private static Set<String> GP;
    public static rrkb_1[] sM;
    public static Map<String, rrdV> sO;
    public static Map<String, rrXw_1> sh;
    public static final String sX = "/shaders/shaders.properties";
    public static rrdI sJ;
    public static rrdf_1 sx;
    public static rrdf_1 sd;
    public static rrdf_1 sk;
    public static rrdf_1 sW;
    public static rrdf_1 sz;
    public static rrdf_1 sQ;
    public static rrdf_1 sN;
    public static rrdf_1 sc;
    public static rrdf_1 su;
    public static rrdf_1 sm;
    public static rrdf_1 sZ;
    public static rrdf_1 sv;
    public static rrdf_1 sF;
    public static rrdf_1 sL;
    public static rrdf_1 sA;
    public static rrdf_1 sn;
    public static rrdf_1 sC;
    public static rrdf_1 sl;
    public static rrdf_1 sH;
    private static Map<String, String> GB;
    private static gm_3 GS;
    private static List<Integer> Gs;
    private static rrxa_3[] GE;
    private static rrxa_3[] GG;
    private static rrxa_3[] Gb;
    private static rrxa_3[] GM;
    private static rrxa_3[] GO;
    private static String Gh;
    private static rrWz_1[] GX;
    private static rrkQ GJ;
    public static final boolean sy;
    public static float sp;
    public static float sq;
    public static float sT;
    public static float st;
    public static float sw;
    public static float sI;
    public static int sf;
    public static float sj;
    public static float sV;
    public static float sg;
    public static float sR;
    public static float sY;
    public static int so;
    public static int[] sK;
    private static rrxa_3 Gx;
    private static boolean Gd;
    private static int Gk;
    public static final int[] sD;
    public static final int[] sU;
    public static final int[] se;
    public static final int[] sa;
    public static final int[] si;
    public static final int[] Er;
    private static final int GW;
    private static final ByteBuffer Gz;
    public static final float[] EP;
    public static final float[] EB;
    public static final float[] ES;
    public static final float[] Es;
    public static final float[] EE;
    public static final float[] EG;
    public static final float[] Eb;
    public static final float[] EM;
    public static final FloatBuffer EO;
    public static final FloatBuffer Eh;
    public static final FloatBuffer EX;
    public static final FloatBuffer EJ;
    public static final FloatBuffer Ex;
    public static final FloatBuffer Ed;
    public static final FloatBuffer Ek;
    public static final FloatBuffer EW;
    public static final FloatBuffer Ez;
    public static final FloatBuffer EQ;
    public static final FloatBuffer EN;
    public static final FloatBuffer Ec;
    public static final rrxY_2 Eu;
    public static final rrxY_2 Em;
    public static final rrxY_2 EZ;
    public static final rrxY_2[] Ev;
    public static boolean EF;
    public static boolean EL;
    public static Map<xd_3, Integer> EA;
    private static final String[] GQ;
    private static final int[] GN;
    private static final Pattern Gc;
    public static int[] En;
    public static int EC;

    public static void id_boolean() {
        Z = true;
        rrdZ.id_break(-3, 0);
        rrdZ.id_class(BR);
        rrdZ.id_class(rrdX.CLOUDS);
    }

    public static void id_char() {
        GL43.glGetFloatv((int)2983, (FloatBuffer)((FloatBuffer)((Buffer)EO).position(0)));
        rrdx_1.id_class((FloatBuffer)((Buffer)Eh).position(0), (FloatBuffer)((Buffer)EO).position(0), EB, EP);
        ((Buffer)EO).position(0);
        ((Buffer)Eh).position(0);
    }

    private static void id_byte(rrxa_3[] rrxa_3Array) {
        if (rrxa_3Array != null) {
            for (int i = 0; i < rrxa_3Array.length; ++i) {
                rrxa_3 rrxa_32 = rrxa_3Array[i];
                rrxa_32.id_throws();
            }
        }
    }

    private static void id_byte(an_3 an_32) {
        double d = Math.abs(Pe - PK);
        double d2 = Math.abs(Pi - PU);
        double d3 = Math.abs(Pe);
        double d4 = Math.abs(Pi);
        if (d > 1000.0 || d2 > 1000.0 || d3 > 1000000.0 || d4 > 1000000.0) {
            rrdZ.id_protected(an_32);
        }
    }

    private static rrxa_3 id_byte(int n, String string) {
        rrMz_1 rrMz_12 = new rrMz_1("Shaders");
        String[] stringArray = rrbb_3.id_class(string, " ");
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>(Arrays.asList(stringArray));
        String string2 = (String)arrayDeque.poll();
        rrke_1 rrke_12 = (rrke_1)rrMz_12.id_class((String)arrayDeque.poll(), rrke_1.values(), "texture type");
        if (rrke_12 == null) {
            rrdJ.id_break("Invalid raw texture type: " + string);
            return null;
        }
        rrkK rrkK2 = (rrkK)rrMz_12.id_class((String)arrayDeque.poll(), rrkK.values(), "internal format");
        if (rrkK2 == null) {
            rrdJ.id_break("Invalid raw texture internal format: " + string);
            return null;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        switch (rrke_12) {
            case TEXTURE_1D: {
                n2 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                break;
            }
            case TEXTURE_2D: {
                n2 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                n3 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                break;
            }
            case TEXTURE_3D: {
                n2 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                n3 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                n4 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                break;
            }
            case TEXTURE_RECTANGLE: {
                n2 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                n3 = rrMz_12.id_class((String)arrayDeque.poll(), -1);
                break;
            }
            default: {
                rrdJ.id_break("Invalid raw texture type: " + rrke_12);
                return null;
            }
        }
        if (n2 >= 0 && n3 >= 0 && n4 >= 0) {
            rrkD rrkD2 = (rrkD)rrMz_12.id_class((String)arrayDeque.poll(), rrkD.values(), "pixel format");
            if (rrkD2 == null) {
                rrdJ.id_break("Invalid raw texture pixel format: " + string);
                return null;
            }
            rrkU rrkU2 = (rrkU)rrMz_12.id_class((String)arrayDeque.poll(), rrkU.values(), "pixel type");
            if (rrkU2 == null) {
                rrdJ.id_break("Invalid raw texture pixel type: " + string);
                return null;
            }
            if (!arrayDeque.isEmpty()) {
                rrdJ.id_break("Invalid raw texture, too many parameters: " + string);
                return null;
            }
            return rrdZ.id_class(n, string, string2, rrke_12, rrkK2, n2, n3, n4, rrkD2, rrkU2);
        }
        rrdJ.id_break("Invalid raw texture size: " + string);
        return null;
    }

    public static void id_byte(Ml_1 ml_1) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        rjV_2 rjV_23 = new rjV_2(rjV_22);
        rjV_23.id_protected();
        rjV_23.id_class(Ew);
        rrdx_1.id_break(id_while, Ew, id_instanceof);
        rrdZ.id_class(Pk, id_while[0], id_while[1], id_while[2]);
        if (GJ != null) {
            GJ.id_class();
        }
    }

    public static rrdD[] id_byte(String string) {
        Object[] objectArray = (rrdD[])Gr.clone();
        if (sO == null) {
            if (sM != null) {
                rrdU rrdU2 = new rrdU(sM, (rrdD[])objectArray);
                objectArray = (rrdD[])rrbb_3.id_class(objectArray, rrdU2, 0);
            }
            return rrdZ.id_break((rrdD[])objectArray);
        }
        Object object = string != null ? "screen." + string : "screen";
        rrdV rrdV2 = sO.get(object);
        if (rrdV2 == null) {
            return new rrdD[0];
        }
        rrdD[] rrdDArray = rrdV2.id_break();
        ArrayList<rrdD> arrayList = new ArrayList<rrdD>();
        for (int i = 0; i < rrdDArray.length; ++i) {
            rrdD rrdD2 = rrdDArray[i];
            if (rrdD2 == null) {
                arrayList.add(null);
                continue;
            }
            if (rrdD2 instanceof rrda_1) {
                rrdD[] rrdDArray2 = rrdZ.id_class(sO, (rrdD[])objectArray);
                arrayList.addAll(Arrays.asList(rrdDArray2));
                continue;
            }
            arrayList.add(rrdD2);
        }
        return arrayList.toArray(new rrdD[arrayList.size()]);
    }

    private static void id_byte(rrdG rrdG2) {
        rrxz_3[] rrxz_3Array = rrdG2.id_new();
        if (rrxz_3Array != null) {
            for (int i = 0; i < rrxz_3Array.length; ++i) {
                rrxz_3 rrxz_32 = rrxz_3Array[i];
                if (rrxz_32 == null) continue;
                String string = Integer.toHexString(i).toUpperCase();
                int n = 36064 + i;
                int n2 = rrdG2.id_extends().id_case(n);
                if (n2 < 0) {
                    rrdJ.id_break("Blend buffer not used in draw buffers: " + string);
                    continue;
                }
                rrdG2.id_break(n2, rrxz_32);
                rrdJ.id_byte("Blend buffer: " + string);
            }
        }
    }

    private static int id_byte(rrdG rrdG2, String string) {
        Object object;
        InputStream inputStream = Ei.id_class(string);
        if (inputStream == null) {
            return 0;
        }
        int n = ARBShaderObjects.glCreateShaderObjectARB((int)36313);
        if (n == 0) {
            return 0;
        }
        rrdD[] rrdDArray = rrdZ.id_class(Gr);
        ArrayList<String> arrayList = new ArrayList<String>();
        Ef = false;
        Ej = false;
        EV = 3;
        rrWV rrWV2 = new rrWV();
        if (rrWV2 != null) {
            try {
                object = rrWV.id_class(new InputStreamReader(inputStream));
                object = rrks_1.id_class((rrWV)object, string, Ei, 0, arrayList, 0);
                rrdt_1 rrdt_12 = new rrdt_1();
                Iterator<String> iterator = ((rrWV)object).iterator();
                while (iterator.hasNext()) {
                    String string2;
                    rrdg_1 rrdg_12;
                    String string3 = iterator.next();
                    string3 = rrdZ.id_class(string3, rrdDArray);
                    rrWV2.id_class(string3);
                    if (!rrdt_12.id_class(string3) || (rrdg_12 = rrkG.id_class(string3)) == null) continue;
                    if (rrdg_12.id_finally("GL_ARB_geometry_shader4") && ((string2 = rrbb_3.id_private(rrdg_12.id_byte())).equals("enable") || string2.equals("require") || string2.equals("warn"))) {
                        Ef = true;
                    }
                    if (rrdg_12.id_finally("GL_EXT_geometry_shader4") && ((string2 = rrbb_3.id_private(rrdg_12.id_byte())).equals("enable") || string2.equals("require") || string2.equals("warn"))) {
                        Ej = true;
                    }
                    if (!rrdg_12.id_throws("maxVerticesOut")) continue;
                    EV = rrdg_12.id_package();
                }
            }
            catch (Exception exception) {
                rrdJ.id_class("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n);
                return 0;
            }
        }
        object = rrWV2.toString();
        if (sy) {
            rrdZ.id_class(string, (String)object);
        }
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)object);
        ARBShaderObjects.glCompileShaderARB((int)n);
        if (GL43.glGetShaderi((int)n, (int)35713) != 1) {
            rrdJ.id_class("Error compiling geometry shader: " + string);
        }
        rrdZ.id_class(n, string, arrayList);
        return n;
    }

    public static int id_byte(int n) {
        switch (n) {
            case 33329: 
            case 33335: 
            case 36238: 
            case 36239: {
                return 36251;
            }
            case 33330: 
            case 33336: 
            case 36220: 
            case 36221: {
                return 36251;
            }
            case 33331: 
            case 33337: 
            case 36232: 
            case 36233: {
                return 36251;
            }
            case 33332: 
            case 33338: 
            case 36214: 
            case 36215: {
                return 36251;
            }
            case 33333: 
            case 33339: 
            case 36226: 
            case 36227: {
                return 36251;
            }
            case 33334: 
            case 33340: 
            case 36208: 
            case 36209: {
                return 36251;
            }
        }
        return 32993;
    }

    private static IntBuffer[] id_byte(int n, int n2) {
        IntBuffer[] intBufferArray = new IntBuffer[n];
        for (int i = 0; i < n; ++i) {
            intBufferArray[i] = rrdZ.id_class(n2);
        }
        return intBufferArray;
    }

    private static void id_byte(rrdF rrdF2, rrdG rrdG2) {
        rrdj_1 rrdj_12;
        if (rrdG2.id_public() != null) {
            rrdF2.id_private();
            GL43.glViewport((int)0, (int)0, (int)rrdF2.id_protected(), (int)rrdF2.id_throws());
        }
        if ((rrdj_12 = Sz.id_super()) != null) {
            GL43.glViewport((int)0, (int)0, (int)rrdF2.id_protected(), (int)rrdF2.id_throws());
        }
    }

    public static void id_byte() {
        boolean bl;
        id_class = QY.id_instanceof();
        boolean bl2 = sr;
        boolean bl3 = rrdZ.id_extends();
        if ((yX_2)rrdZ.id_class.id_class[8] != null) {
            ((yX_2)rrdZ.id_class.id_class[8]).id_synchronized();
        }
        sr = false;
        if (Ei != null) {
            Ei.id_break();
            Ei = null;
            GB.clear();
            Gs.clear();
            Gr = null;
            GP = null;
            sM = null;
            sO = null;
            sh.clear();
            sJ.id_case();
            sd.id_case();
            sk.id_case();
            sx.id_case();
            rrdZ.rE();
            Gh = null;
        }
        boolean bl4 = false;
        if (rrbb_3.T()) {
            rrdJ.id_byte("Shaders can not be loaded, Antialiasing is enabled: " + rrbb_3.q() + "x");
            bl4 = true;
        }
        if (rrbb_3.id_instanceof()) {
            rrdJ.id_byte("Shaders can not be loaded, Fabulous Graphics is enabled.");
            bl4 = true;
        }
        String string = Sm.getProperty(rrdy_1.SHADER_PACK.id_break(), sS);
        if (!bl4) {
            Ei = rrdZ.id_break(string);
            boolean bl5 = sr = Ei != null;
        }
        if (sr) {
            rrdJ.id_byte("Loaded shaderpack: " + rrdZ.y());
        } else {
            rrdJ.id_byte("No shaderpack loaded.");
            Ei = new rrdN();
        }
        if (sy) {
            rrdZ.id_class(new File(sG, "debug"));
        }
        rrdZ.rc();
        rrdZ.rB();
        Gr = rrdZ.rG();
        rrdZ.rS();
        rrdZ.rs();
        boolean bl6 = sr != bl2;
        boolean bl7 = bl = rrdZ.id_extends() != bl3;
        if (bl6 || bl) {
            ju_3.id_class();
            if (rrxr_3.BM.id_byte()) {
                rrxr_3.BO.id_break(null);
                rrxr_3.Bh.id_break(null);
            }
            rrdZ.id_private();
        }
        if (id_class.F() != null) {
            rrbW_2.id_class();
        }
        if ((yX_2)rrdZ.id_class.id_class[8] != null) {
            ((yX_2)rrdZ.id_class.id_class[8]).id_return();
        }
        if ((bl6 || bl) && id_class.F() != null) {
            id_class.x();
        }
    }

    private static boolean id_byte(rdn_3 rdn_32) {
        if (rdn_32 == null) {
            return false;
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 == null) {
            return false;
        }
        if (!(rdb_32 instanceof rxJ_2)) {
            return false;
        }
        rxJ_2 rxJ_22 = (rxJ_2)rdb_32;
        xd_3 xd_32 = rxJ_22.id_catch();
        if (xd_32 == null) {
            return false;
        }
        HU hU = yS_2.id_class(xd_32.id_continue());
        return hU == rrxA_2.id_protected;
    }

    private static int id_byte(ryO_2 ryO_22) {
        if (ryO_22 == null) {
            return -1;
        }
        xc_3 xc_32 = ryO_22.id_abstract();
        return rrxt_3.id_class(xc_32);
    }

    private static rrxY_2[] id_int(int n) {
        rrxY_2[] rrxY_2Array = new rrxY_2[n];
        for (int i = 0; i < rrxY_2Array.length; ++i) {
            rrxY_2 rrxY_22 = new rrxY_2("single" + i, 16, 8);
            rrxY_22.id_break(36064 + i);
            rrxY_22.id_byte(0);
            rrxY_22.id_protected(1);
            rrxY_2Array[i] = rrxY_22;
        }
        return rrxY_2Array;
    }

    public static boolean id_int() {
        return !sc.id_implements();
    }

    public static void id_long() {
        if (!id_new) {
            boolean bl = rrdZ.id_class(BL, SG);
            if (Ea) {
                rrdZ.id_catch("pre-render Deferred");
                rrdZ.rQ();
                bl = true;
            }
            if (bl) {
                rrdZ.rd();
                BL.id_class(true);
                rrxY_2 rrxY_22 = SO.id_extends() != null ? SO.id_extends() : BL.id_extends();
                rrxU_2.id_class(rrxY_22);
                MT.id_new(33984);
                id_class.A().id_class(fJ_2.id_class);
            }
        }
    }

    public static void id_float() {
        if (!id_new) {
            rrdZ.id_class(BL, SX);
            rrdZ.id_catch("pre-render CompositeFinal");
            rrdZ.rz();
        }
    }

    public static void id_double() {
        if (id_volatile && SS.id_private() != By.id_private()) {
            rrdZ.id_class(SS);
            MT.id_throws();
            MT.id_class(516, 0.0f);
            MT.id_break(770, 771);
        }
    }

    private rrdZ() {
    }

    static {
        id_byte = false;
        id_protected = false;
        id_implements = false;
        id_finally = 0;
        El = 0;
        EH = 0;
        id_extends = 0;
        id_native = 0;
        id_volatile = false;
        id_final = false;
        id_package = false;
        id_int = false;
        id_new = false;
        id_continue = false;
        id_this = false;
        id_else = false;
        id_synchronized = false;
        id_return = new float[4];
        id_public = new float[4];
        id_goto = new float[4];
        id_while = new float[4];
        id_try = new float[4];
        id_instanceof = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        id_throw = new float[]{0.0f, 100.0f, 0.0f, 0.0f};
        id_interface = new float[]{0.0f, -100.0f, 0.0f, 0.0f};
        Ew = new float[16];
        id_char = new rji_3();
        id_void = 0L;
        id_static = 0L;
        id_import = 0L;
        id_short = 0.0f;
        id_default = 0.0f;
        id_const = 0.0f;
        id_strictfp = 0;
        id_boolean = 0L;
        id_transient = 0L;
        id_for = 0L;
        id_double = 0;
        id_switch = 0.0f;
        r = 0.0f;
        P = 0;
        B = VZ.FIRST_PERSON;
        S = false;
        s = 0.0f;
        E = 0.0f;
        G = 600.0f;
        b = 200.0f;
        M = 10.0f;
        O = false;
        h = 0;
        X = 0;
        J = 0.0f;
        x = 0.0f;
        d = 0.0f;
        k = 0.0f;
        W = 0.0f;
        z = 1.0f;
        Q = false;
        N = 1;
        c = 0.0f;
        u = 0.0f;
        m = false;
        Z = true;
        v = rrdX.NONE;
        EI = 11;
        F = EI + 0;
        L = EI + 1;
        A = EI + 2;
        n = EI + 3;
        C = EI + 4;
        l = false;
        H = false;
        y = false;
        p = false;
        q = false;
        T = false;
        t = false;
        w = false;
        I = false;
        f = false;
        Ef = false;
        Ej = false;
        EV = 3;
        Eg = false;
        j = 0;
        V = 0;
        ER = new rrkq_1();
        g = ER.id_case("entityColor");
        R = ER.id_class("entityId");
        Y = ER.id_class("blockEntityId");
        o = ER.id_class("texture");
        K = ER.id_class("lightmap");
        D = ER.id_class("normals");
        U = ER.id_class("specular");
        e = ER.id_class("shadow");
        a = ER.id_class("watershadow");
        i = ER.id_class("shadowtex0");
        rr = ER.id_class("shadowtex1");
        rP = ER.id_class("depthtex0");
        rB = ER.id_class("depthtex1");
        rS = ER.id_class("shadowcolor");
        rs = ER.id_class("shadowcolor0");
        rE = ER.id_class("shadowcolor1");
        rG = ER.id_class("noisetex");
        rb = ER.id_class("gcolor");
        rM = ER.id_class("gdepth");
        rO = ER.id_class("gnormal");
        rh = ER.id_class("composite");
        rX = ER.id_class("gaux1");
        rJ = ER.id_class("gaux2");
        rx = ER.id_class("gaux3");
        rd = ER.id_class("gaux4");
        rk = ER.id_class("colortex0");
        rW = ER.id_class("colortex1");
        rz = ER.id_class("colortex2");
        rQ = ER.id_class("colortex3");
        rN = ER.id_class("colortex4");
        rc = ER.id_class("colortex5");
        ru = ER.id_class("colortex6");
        rm = ER.id_class("colortex7");
        rZ = ER.id_class("gdepthtex");
        rv = ER.id_class("depthtex2");
        rF = ER.id_class("colortex8");
        rL = ER.id_class("colortex9");
        rA = ER.id_class("colortex10");
        rn = ER.id_class("colortex11");
        rC = ER.id_class("colortex12");
        rl = ER.id_class("colortex13");
        rH = ER.id_class("colortex14");
        ry = ER.id_class("colortex15");
        rp = ER.id_class("colorimg0");
        rq = ER.id_class("colorimg1");
        rT = ER.id_class("colorimg2");
        rt = ER.id_class("colorimg3");
        rw = ER.id_class("colorimg4");
        rI = ER.id_class("colorimg5");
        rf = ER.id_class("shadowcolorimg0");
        rj = ER.id_class("shadowcolorimg1");
        rV = ER.id_class("tex");
        rg = ER.id_class("heldItemId");
        rR = ER.id_class("heldBlockLightValue");
        rY = ER.id_class("heldItemId2");
        ro = ER.id_class("heldBlockLightValue2");
        rK = ER.id_class("fogMode");
        rD = ER.id_protected("fogDensity");
        rU = ER.id_throws("fogColor");
        re = ER.id_throws("skyColor");
        ra = ER.id_class("worldTime");
        ri = ER.id_class("worldDay");
        Pr = ER.id_class("moonPhase");
        PP = ER.id_class("frameCounter");
        PB = ER.id_protected("frameTime");
        PS = ER.id_protected("frameTimeCounter");
        Ps = ER.id_protected("sunAngle");
        PE = ER.id_protected("shadowAngle");
        PG = ER.id_protected("rainStrength");
        Pb = ER.id_protected("aspectRatio");
        PM = ER.id_protected("viewWidth");
        PO = ER.id_protected("viewHeight");
        Ph = ER.id_protected("near");
        PX = ER.id_protected("far");
        PJ = ER.id_throws("sunPosition");
        Px = ER.id_throws("moonPosition");
        Pd = ER.id_throws("shadowLightPosition");
        Pk = ER.id_throws("upPosition");
        PW = ER.id_throws("previousCameraPosition");
        Pz = ER.id_throws("cameraPosition");
        PQ = ER.id_catch("gbufferModelView");
        PN = ER.id_catch("gbufferModelViewInverse");
        Pc = ER.id_catch("gbufferPreviousProjection");
        Pu = ER.id_catch("gbufferProjection");
        Pm = ER.id_catch("gbufferProjectionInverse");
        PZ = ER.id_catch("gbufferPreviousModelView");
        Pv = ER.id_catch("shadowProjection");
        PF = ER.id_catch("shadowProjectionInverse");
        PL = ER.id_catch("shadowModelView");
        PA = ER.id_catch("shadowModelViewInverse");
        Pn = ER.id_protected("wetness");
        PC = ER.id_protected("eyeAltitude");
        Pl = ER.id_break("eyeBrightness");
        PH = ER.id_break("eyeBrightnessSmooth");
        Py = ER.id_break("terrainTextureSize");
        Pp = ER.id_class("terrainIconSize");
        Pq = ER.id_class("isEyeInWater");
        PT = ER.id_protected("nightVision");
        Pt = ER.id_protected("blindness");
        Pw = ER.id_protected("screenBrightness");
        PI = ER.id_class("hideGUI");
        Pf = ER.id_protected("centerDepthSmooth");
        Pj = ER.id_break("atlasSize");
        PV = ER.id_case("spriteBounds");
        Pg = ER.id_byte("blendFunc");
        PR = ER.id_class("instanceId");
        PY = ER.id_protected("playerMood");
        Po = ER.id_class("renderStage");
        BB = false;
        BS = false;
        Bs = 1024;
        BE = 1024;
        BG = 1024;
        Bb = 1024;
        BM = 90.0f;
        BO = 160.0f;
        Bh = true;
        BX = -1.0f;
        BJ = false;
        Bx = false;
        BN = 0;
        Bc = 0;
        Bu = 0;
        Bm = 0;
        BZ = 0;
        Bv = 0;
        BF = false;
        EY = new int[16];
        Bn = new boolean[16];
        BC = new rji_3[16];
        Eo = new rji_3(0.0f, 0.0f, 0.0f, 0.0f);
        EK = new rji_3(1.0f, 1.0f, 1.0f, 1.0f);
        ED = new int[2];
        Bl = new boolean[2];
        BH = new rji_3[2];
        EU = new rrdh_1();
        By = EU.id_class();
        Bp = EU.id_break("shadow", By);
        Bq = EU.id_break("shadow_solid", Bp);
        BT = EU.id_break("shadow_cutout", Bp);
        Bt = EU.id_break("shadowcomp", 16);
        Bw = EU.id_byte("prepare", 16);
        BI = EU.id_class("gbuffers_basic", By);
        Bf = EU.id_class("gbuffers_textured", BI);
        Bj = EU.id_class("gbuffers_textured_lit", Bf);
        BV = EU.id_class("gbuffers_skybasic", BI);
        Bg = EU.id_class("gbuffers_skytextured", Bf);
        BR = EU.id_class("gbuffers_clouds", Bf);
        BY = EU.id_class("gbuffers_terrain", Bj);
        Bo = EU.id_class("gbuffers_terrain_solid", BY);
        BK = EU.id_class("gbuffers_terrain_cutout_mip", BY);
        BD = EU.id_class("gbuffers_terrain_cutout", BY);
        BU = EU.id_class("gbuffers_damagedblock", BY);
        Be = EU.id_class("gbuffers_block", BY);
        Ba = EU.id_class("gbuffers_beaconbeam", Bf);
        Bi = EU.id_class("gbuffers_item", Bj);
        Sr = EU.id_class("gbuffers_entities", Bj);
        SP = EU.id_class("gbuffers_entities_glowing", Sr);
        SB = EU.id_class("gbuffers_armor_glint", Bf);
        SS = EU.id_class("gbuffers_spidereyes", Bf);
        Ss = EU.id_class("gbuffers_hand", Bj);
        SE = EU.id_class("gbuffers_weather", Bj);
        SG = EU.id_byte("deferred_pre");
        Sb = EU.id_protected("deferred", 16);
        SM = Sb[0];
        SO = EU.id_class("gbuffers_water", BY);
        Sh = EU.id_class("gbuffers_hand_water", Ss);
        SX = EU.id_byte("composite_pre");
        SJ = EU.id_class("composite", 16);
        Sx = SJ[0];
        Sd = EU.id_class("id_final");
        Sk = EU.id_break();
        SW = EU.id_protected();
        Sz = By;
        SQ = 0;
        Ee = new rrdb_1();
        Ea = false;
        SN = false;
        Sc = false;
        Su = null;
        Sm = null;
        SZ = null;
        Sv = new boolean[2];
        SF = new boolean[2];
        SL = new boolean[2];
        SA = new boolean[2];
        Sn = new boolean[2];
        SC = false;
        Sl = false;
        SH = 0.125f;
        Sy = 1.0f;
        Sp = 1.0f;
        Sq = 0;
        ST = 0;
        St = 0;
        Sw = 0;
        SI = 0;
        Sf = 0;
        Sj = true;
        SV = true;
        Sg = true;
        SR = new rrdf_1("oldLighting", "Classic Lighting", 0);
        SY = new rrdf_1("oldHandLight", "Old Hand Light", 0);
        So = 0;
        SU = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
        Se = new String[]{"Nearest", "Linear"};
        Sa = new int[]{9728, 9984, 9986};
        Si = new int[]{9728, 9729};
        Ei = null;
        sr = false;
        sG = new File((File)QY.id_instanceof().id_class[24], ss);
        sb = new File((File)QY.id_instanceof().id_class[24], sE);
        Gr = null;
        GP = null;
        sM = null;
        sO = null;
        sh = new HashMap<String, rrXw_1>();
        sJ = new rrdI("clouds", "Clouds", 0);
        sx = new rrdf_1("oldLighting", "Classic Lighting", 0);
        sd = new rrdf_1("oldHandLight", "Old Hand Light", 0);
        sk = new rrdf_1("dynamicHandLight", "Dynamic Hand Light", 0);
        sW = new rrdf_1("shadowTerrain", "Shadow Terrain", 0);
        sz = new rrdf_1("shadowTranslucent", "Shadow Translucent", 0);
        sQ = new rrdf_1("shadowEntities", "Shadow Entities", 0);
        sN = new rrdf_1("shadowBlockEntities", "Shadow Block Entities", 0);
        sc = new rrdf_1("underwaterOverlay", "Underwater Overlay", 0);
        su = new rrdf_1("sun", "Sun", 0);
        sm = new rrdf_1("moon", "Moon", 0);
        sZ = new rrdf_1("vignette", "Vignette", 0);
        sv = new rrdf_1("backFace.solid", "Back-face Solid", 0);
        sF = new rrdf_1("backFace.cutout", "Back-face Cutout", 0);
        sL = new rrdf_1("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
        sA = new rrdf_1("backFace.translucent", "Back-face Translucent", 0);
        sn = new rrdf_1("rain.depth", "Rain Depth", 0);
        sC = new rrdf_1("beacon.beam.depth", "Rain Depth", 0);
        sl = new rrdf_1("separateAo", "Separate AO", 0);
        sH = new rrdf_1("frustum.culling", "Frustum Culling", 0);
        GB = new HashMap<String, String>();
        GS = null;
        Gs = new ArrayList<Integer>();
        GE = null;
        GG = null;
        Gb = null;
        GM = null;
        GO = null;
        Gh = null;
        GX = new rrWz_1[16];
        GJ = null;
        sy = System.getProperty("shaders.debug.save", "false").equals("true");
        sp = 0.5f;
        sq = 0.6f;
        sT = 0.8f;
        st = -1.0f;
        sw = 0.0f;
        sI = 0.0f;
        sf = 0;
        sj = 0.0f;
        sY = 2.0f;
        so = 16;
        sK = new int[2];
        Gd = false;
        Gk = 256;
        sD = new int[]{0, 1, 2, 3, 7, 8, 9, 10, 16, 17, 18, 19, 20, 21, 22, 23};
        sU = new int[]{6, 11, 12};
        se = new int[]{13, 14};
        sa = new int[]{4, 5};
        si = new int[]{0, 1, 2, 3, 4, 5};
        Er = new int[]{6, 7};
        GW = (295 + 8 * Sk) * 4;
        Gz = (ByteBuffer)((Buffer)BufferUtils.createByteBuffer((int)GW)).limit(0);
        EP = new float[16];
        EB = new float[16];
        ES = new float[16];
        Es = new float[16];
        EE = new float[16];
        EG = new float[16];
        Eb = new float[16];
        EM = new float[16];
        EO = rrdZ.id_package(16);
        Eh = rrdZ.id_package(16);
        EX = rrdZ.id_package(16);
        EJ = rrdZ.id_package(16);
        Ex = rrdZ.id_package(16);
        Ed = rrdZ.id_package(16);
        Ek = rrdZ.id_package(16);
        EW = rrdZ.id_package(16);
        Ez = rrdZ.id_package(16);
        EQ = rrdZ.id_package(16);
        EN = rrdZ.id_package(16);
        Ec = rrdZ.id_package(16);
        Eu = new rrxY_2("dfbDrawBuffers", 16, 8);
        Em = new rrxY_2("sfbDrawBuffers", 16, 8);
        EZ = new rrxY_2("drawBuffersNone", 16, 8).id_protected(0);
        Ev = rrdZ.id_int(16);
        GQ = new String[]{"R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R8I", "RG8I", "RGB8I", "RGBA8I", "R8UI", "RG8UI", "RGB8UI", "RGBA8UI", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R16I", "RG16I", "RGB16I", "RGBA16I", "R16UI", "RG16UI", "RGB16UI", "RGBA16UI", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5"};
        GN = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33329, 33335, 36239, 36238, 33330, 33336, 36221, 36220, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33331, 33337, 36233, 36232, 33332, 33338, 36215, 36214, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901};
        Gc = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
        En = new int[32];
        EC = 0;
    }

    public static void B() {
        if (id_volatile) {
            id_continue = false;
        }
    }

    public static int C() {
        return En[EC * 2];
    }

    public static rfH_2 D() {
        return new rfH_2(Pe + (double)Br, Pa, Pi + (double)BP);
    }

    public static void F() {
        Z = true;
        rrdZ.id_class(rK, sf);
        rrdZ.id_class(rD, sj);
    }

    public static boolean I() {
        return !ET && !Et;
    }

    public static void J() {
        MT.id_final();
        rrdZ.id_class(Bj);
        rrdZ.id_class(rrdX.NONE);
    }

    public static void S() {
        if (id_volatile) {
            rrdA.id_break(SZ);
            if (!id_new) {
                rrxU_2.id_class(Ev[0]);
            }
        }
    }

    public static void Z() {
        rrdZ.u();
        rrdZ.id_class(BI);
    }

    public static float V() {
        return BX < 0.0f ? -1.0f : BO * BX;
    }

    public static boolean id_this() {
        return sn.id_private();
    }

    public static boolean e() {
        return Eg ? rrdZ.id_throws.GL_NV_geometry_shader4 : true;
    }

    public static boolean i() {
        return sr;
    }

    public static void b() {
        rrdZ.id_class(Bj);
    }

    public static void x() {
        if (!id_new && Bc >= 3) {
            MT.id_new(33996);
            GL43.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)id_extends, (int)id_native);
            MT.id_new(33984);
        }
    }

    public static void s() {
        if (id_volatile && !id_new) {
            rrxU_2.id_class(Sr.id_extends());
        }
    }

    public static void c() {
        if (id_final) {
            rrdZ.id_class(BV);
        } else if (Sz == Bf || Sz == Bj) {
            rrdZ.id_class(BI);
        }
    }

    public static void n() {
        m = false;
        if (Sz == Bj) {
            rrdZ.id_class(Bf);
        }
    }

    public static void h() {
        if (!id_new && Q) {
            ((Buffer)Ec).clear();
            GL43.glReadPixels((int)(id_extends / 2), (int)(id_native / 2), (int)1, (int)1, (int)6402, (int)5126, (FloatBuffer)Ec);
            k = Ec.get(0);
            float f = (float)id_for * 0.01f;
            float f2 = (float)Math.exp(Math.log(0.5) * (double)f / (double)z);
            W = W * f2 + k * (1.0f - f2);
        }
    }

    public static boolean f() {
        return Ep;
    }

    public static int l() {
        return En[EC * 2 + 1];
    }

    public static void d() {
        if (Bc >= 2) {
            MT.id_new(33995);
            rrdZ.id_catch("pre copy depth");
            GL43.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)id_extends, (int)id_native);
            rrdZ.id_catch("copy depth");
            MT.id_new(33984);
        }
        rrdA.id_class(SZ.id_this());
    }

    public static boolean a() {
        return sr;
    }

    public static void id_interface() {
        if (Sc) {
            rrdZ.id_void();
            rrdZ.rd();
            BL.id_finally();
            BL.id_class(true);
        }
    }

    public static void id_class(float f, long l) {
        if (!id_new) {
            BL.id_private();
            GL11.glViewport((int)0, (int)0, (int)id_extends, (int)id_native);
            rrxU_2.id_class((rrxY_2)null);
            rrdA.id_class(SZ.id_this());
            rrdZ.id_class(Bf);
            rrdZ.id_catch("end beginRenderPass");
        }
    }

    public static void id_class(gm_3 gm_32) {
        if (GS != gm_32) {
            gm_3 gm_33 = GS;
            GS = gm_32;
            if (GS == null) {
                Pe = 0.0;
                Pa = 0.0;
                Pi = 0.0;
                PK = 0.0;
                PD = 0.0;
                PU = 0.0;
            }
            rrdZ.id_protected(id_class.id_catch());
            int n = rrzc_3.id_class(gm_33);
            int n2 = rrzc_3.id_class(gm_32);
            if (n2 != n) {
                boolean bl = Gs.contains(n);
                boolean bl2 = Gs.contains(n2);
                if (bl || bl2) {
                    rrdZ.id_while();
                }
            }
            rrkT.id_break();
        }
    }

    private static void id_class(int n, rrxa_3[] rrxa_3Array) {
        if (BA != null) {
            BA.id_protected(0);
            BA.id_class(sa);
        }
        BL.id_protected(n);
        BL.id_class(sU);
        if (Gd) {
            MT.id_new(33984 + Gx.id_class());
            MT.id_super(Gx.id_protected());
            MT.id_new(33984);
        }
        rrdZ.id_break(rrxa_3Array);
    }

    public static void id_class(QY qY, ly_3 ly_32, float f, long l) {
        block14: {
            rrdZ.id_catch("pre beginRender");
            rrdZ.id_class((gm_3)rrdZ.id_class.id_class[56]);
            id_class = qY;
            id_break = (Hh_1)rrdZ.id_class.id_class[16];
            if (!id_protected) {
                try {
                    rrdZ.id_public();
                }
                catch (IllegalStateException illegalStateException) {
                    if (!rrbb_3.id_private(illegalStateException.getMessage()).equals("Function is not supported")) break block14;
                    rrdZ.id_private("[Shaders] Error: " + illegalStateException.getMessage());
                    illegalStateException.printStackTrace();
                    rrdZ.id_class(sB);
                    return;
                }
            }
        }
        if (id_class.id_else().id_extends() != El || id_class.id_else().id_native() != EH) {
            rrdZ.rh();
        }
        if (BS) {
            rrdZ.rX();
        }
        if (++id_double >= 720720) {
            id_double = 0;
        }
        id_boolean = System.currentTimeMillis();
        if (id_transient == 0L) {
            id_transient = id_boolean;
        }
        id_for = id_boolean - id_transient;
        id_transient = id_boolean;
        id_switch = (float)id_for / 1000.0f;
        r += id_switch;
        r %= 3600.0f;
        S = B != ((Qw_1)rrdZ.id_class.id_class[20]).id_volatile();
        B = ((Qw_1)rrdZ.id_class.id_class[20]).id_volatile();
        MT.id_transient();
        rrdL.id_class(ly_32, qY, f);
        MT.id_for();
        gm_3 gm_32 = (gm_3)rrdZ.id_class.id_class[56];
        if (gm_32 != null) {
            id_void = gm_32.P();
            id_import = (id_void - id_static) % 24000L;
            if (id_import < 0L) {
                id_import += 24000L;
            }
            id_static = id_void;
            id_strictfp = gm_32.id_char();
            s = gm_32.id_private(f);
            float f2 = (float)id_for * 0.01f;
            float f3 = (float)Math.exp(Math.log(0.5) * (double)f2 / (double)(E < s ? b : G));
            E = E * f3 + s * (1.0f - f3);
            an_3 an_32 = ly_32.id_catch();
            if (an_32 != null) {
                rrTR rrTR2;
                id_super = an_32 instanceof iB_2 && ((iB_2)an_32).Sc();
                d = (float)ly_32.id_break().id_break();
                X = id_class.id_case().id_class(an_32, f);
                float f4 = (float)id_for * 0.01f;
                float f5 = (float)Math.exp(Math.log(0.5) * (double)f4 / (double)M);
                J = J * f5 + (float)(X & 0xFFFF) * (1.0f - f5);
                x = x * f5 + (float)(X >> 16) * (1.0f - f5);
                rXE rXE2 = ly_32.id_finally();
                h = rXE2.id_class(rlG_2.id_break) ? 1 : (rXE2.id_class(rlG_2.id_byte) ? 2 : 0);
                if (an_32 instanceof iB_2) {
                    rrTR2 = (iB_2)an_32;
                    c = 0.0f;
                    if (((iB_2)rrTR2).id_break(rLD.id_int)) {
                        Hh_1 hh_1 = id_break;
                        c = Hh_1.id_class((iB_2)rrTR2, f);
                    }
                    u = 0.0f;
                    if (((iB_2)rrTR2).id_break(rLD.id_package)) {
                        int n = ((iB_2)rrTR2).id_byte(rLD.id_package).id_break();
                        u = rrbb_3.id_class((float)n / 20.0f, 0.0f, 1.0f);
                    }
                }
                rrTR2 = gm_32.id_class(an_32.Bs(), f);
                rrTR2 = rrbN_2.id_break((rjU_2)rrTR2, gm_32, an_32, f);
                id_abstract = (float)((rjU_2)rrTR2).id_break;
                id_long = (float)((rjU_2)rrTR2).id_byte;
                id_float = (float)((rjU_2)rrTR2).id_protected;
            }
        }
        id_volatile = true;
        id_package = false;
        id_new = false;
        Ep = false;
        Eq = false;
        ET = false;
        Et = false;
        BL.id_class(9729, 9729);
        rrdZ.rd();
        BL.id_break(true);
        if (BA != null) {
            BA.id_break(true);
        }
        PK = Pe;
        PD = Pa;
        PU = Pi;
        ((Buffer)Ez).position(0);
        ((Buffer)EO).position(0);
        Ez.put(EO);
        ((Buffer)Ez).position(0);
        ((Buffer)EO).position(0);
        ((Buffer)EQ).position(0);
        ((Buffer)EX).position(0);
        EQ.put(EX);
        ((Buffer)EQ).position(0);
        ((Buffer)EX).position(0);
        rrdZ.id_catch("beginRender");
        rrdL.id_class(id_break, ly_32, 0, f, l);
        BL.id_class(true);
        rrdZ.id_class(rrdX.NONE);
        rrdZ.id_catch("end beginRender");
    }

    private static void id_class(rrdM rrdM2) {
        int n;
        switch (rrdM2) {
            case GBUFFERS: {
                rrdZ.id_class(o, 0);
                rrdZ.id_class(K, 2);
                rrdZ.id_class(D, 1);
                rrdZ.id_class(U, 3);
                rrdZ.id_class(e, Bx ? 5 : 4);
                rrdZ.id_class(a, 4);
                rrdZ.id_class(i, 4);
                rrdZ.id_class(rr, 5);
                rrdZ.id_class(rP, 6);
                if (GE != null || Ea) {
                    rrdZ.id_class(rX, 7);
                    rrdZ.id_class(rJ, 8);
                    rrdZ.id_class(rx, 9);
                    rrdZ.id_class(rd, 10);
                    rrdZ.id_class(rN, 7);
                    rrdZ.id_class(rc, 8);
                    rrdZ.id_class(ru, 9);
                    rrdZ.id_class(rm, 10);
                    if (BN > 8) {
                        rrdZ.id_class(rF, 16);
                        rrdZ.id_class(rL, 17);
                        rrdZ.id_class(rA, 18);
                        rrdZ.id_class(rn, 19);
                        rrdZ.id_class(rC, 20);
                        rrdZ.id_class(rl, 21);
                        rrdZ.id_class(rH, 22);
                        rrdZ.id_class(ry, 23);
                    }
                }
                rrdZ.id_class(rB, 11);
                rrdZ.id_class(rS, 13);
                rrdZ.id_class(rs, 13);
                rrdZ.id_class(rE, 14);
                rrdZ.id_class(rG, 15);
                break;
            }
            case SHADOWCOMP: 
            case PREPARE: 
            case DEFERRED: 
            case COMPOSITE: {
                rrdZ.id_class(rb, 0);
                rrdZ.id_class(rM, 1);
                rrdZ.id_class(rO, 2);
                rrdZ.id_class(rh, 3);
                rrdZ.id_class(rX, 7);
                rrdZ.id_class(rJ, 8);
                rrdZ.id_class(rx, 9);
                rrdZ.id_class(rd, 10);
                rrdZ.id_class(rk, 0);
                rrdZ.id_class(rW, 1);
                rrdZ.id_class(rz, 2);
                rrdZ.id_class(rQ, 3);
                rrdZ.id_class(rN, 7);
                rrdZ.id_class(rc, 8);
                rrdZ.id_class(ru, 9);
                rrdZ.id_class(rm, 10);
                if (BN > 8) {
                    rrdZ.id_class(rF, 16);
                    rrdZ.id_class(rL, 17);
                    rrdZ.id_class(rA, 18);
                    rrdZ.id_class(rn, 19);
                    rrdZ.id_class(rC, 20);
                    rrdZ.id_class(rl, 21);
                    rrdZ.id_class(rH, 22);
                    rrdZ.id_class(ry, 23);
                }
                rrdZ.id_class(e, Bx ? 5 : 4);
                rrdZ.id_class(a, 4);
                rrdZ.id_class(i, 4);
                rrdZ.id_class(rr, 5);
                rrdZ.id_class(rZ, 6);
                rrdZ.id_class(rP, 6);
                rrdZ.id_class(rB, 11);
                rrdZ.id_class(rv, 12);
                rrdZ.id_class(rS, 13);
                rrdZ.id_class(rs, 13);
                rrdZ.id_class(rE, 14);
                rrdZ.id_class(rG, 15);
                break;
            }
            case SHADOW: {
                rrdZ.id_class(rV, 0);
                rrdZ.id_class(o, 0);
                rrdZ.id_class(K, 2);
                rrdZ.id_class(D, 1);
                rrdZ.id_class(U, 3);
                rrdZ.id_class(e, Bx ? 5 : 4);
                rrdZ.id_class(a, 4);
                rrdZ.id_class(i, 4);
                rrdZ.id_class(rr, 5);
                if (GE != null) {
                    rrdZ.id_class(rX, 7);
                    rrdZ.id_class(rJ, 8);
                    rrdZ.id_class(rx, 9);
                    rrdZ.id_class(rd, 10);
                    rrdZ.id_class(rN, 7);
                    rrdZ.id_class(rc, 8);
                    rrdZ.id_class(ru, 9);
                    rrdZ.id_class(rm, 10);
                    if (BN > 8) {
                        rrdZ.id_class(rF, 16);
                        rrdZ.id_class(rL, 17);
                        rrdZ.id_class(rA, 18);
                        rrdZ.id_class(rn, 19);
                        rrdZ.id_class(rC, 20);
                        rrdZ.id_class(rl, 21);
                        rrdZ.id_class(rH, 22);
                        rrdZ.id_class(ry, 23);
                    }
                }
                rrdZ.id_class(rS, 13);
                rrdZ.id_class(rs, 13);
                rrdZ.id_class(rE, 14);
                rrdZ.id_class(rG, 15);
            }
        }
        rdn_3 rdn_32 = (cb_3)rrdZ.id_class.id_class[57] != null ? ((cb_3)rrdZ.id_class.id_class[57]).ss() : null;
        rdb_3 rdb_32 = rdn_32 != null ? rdn_32.id_break() : null;
        int n2 = -1;
        xd_3 xd_32 = null;
        if (rdb_32 != null) {
            n2 = rVL.id_for.id_class(rdb_32);
            if (rdb_32 instanceof rxJ_2) {
                xd_32 = ((rxJ_2)rdb_32).id_catch();
            }
            n2 = rrdP.id_class(n2);
        }
        int n3 = xd_32 != null ? xd_32.id_continue().id_case() : 0;
        rdn_3 rdn_33 = (cb_3)rrdZ.id_class.id_class[57] != null ? ((cb_3)rrdZ.id_class.id_class[57]).Sn() : null;
        rdb_3 rdb_33 = rdn_33 != null ? rdn_33.id_break() : null;
        int n4 = -1;
        xd_3 xd_33 = null;
        if (rdb_33 != null) {
            n4 = rVL.id_for.id_class(rdb_33);
            if (rdb_33 instanceof rxJ_2) {
                xd_33 = ((rxJ_2)rdb_33).id_catch();
            }
            n4 = rrdP.id_class(n4);
        }
        int n5 = n = xd_33 != null ? xd_33.id_continue().id_case() : 0;
        if (rrdZ.id_implements() && n > n3) {
            n2 = n4;
            n3 = n;
        }
        float f = (cb_3)rrdZ.id_class.id_class[57] != null ? ((cb_3)rrdZ.id_class.id_class[57]).id_double() : 0.0f;
        rrdZ.id_class(rg, n2);
        rrdZ.id_class(rR, n3);
        rrdZ.id_class(rY, n4);
        rrdZ.id_class(ro, n);
        rrdZ.id_class(rK, Z ? sf : 0);
        rrdZ.id_class(rD, Z ? sj : 0.0f);
        rrdZ.id_class(rU, sV, sg, sR);
        rrdZ.id_class(re, id_abstract, id_long, id_float);
        rrdZ.id_class(ra, (int)(id_void % 24000L));
        rrdZ.id_class(ri, (int)(id_void / 24000L));
        rrdZ.id_class(Pr, id_strictfp);
        rrdZ.id_class(PP, id_double);
        rrdZ.id_class(PB, id_switch);
        rrdZ.id_class(PS, r);
        rrdZ.id_class(Ps, id_default);
        rrdZ.id_class(PE, id_const);
        rrdZ.id_class(PG, s);
        rrdZ.id_class(Pb, (float)id_extends / (float)id_native);
        rrdZ.id_class(PM, (float)id_extends);
        rrdZ.id_class(PO, (float)id_native);
        rrdZ.id_class(Ph, 0.05f);
        rrdZ.id_class(PX, (float)(((Qw_1)rrdZ.id_class.id_class[20]).id_break * 16));
        rrdZ.id_class(PJ, id_return[0], id_return[1], id_return[2]);
        rrdZ.id_class(Px, id_public[0], id_public[1], id_public[2]);
        rrdZ.id_class(Pd, id_goto[0], id_goto[1], id_goto[2]);
        rrdZ.id_class(Pk, id_while[0], id_while[1], id_while[2]);
        rrdZ.id_class(PW, (float)PK, (float)PD, (float)PU);
        rrdZ.id_class(Pz, (float)Pe, (float)Pa, (float)Pi);
        rrdZ.id_class(PQ, false, EX);
        rrdZ.id_class(PN, false, EJ);
        rrdZ.id_class(Pc, false, Ez);
        rrdZ.id_class(Pu, false, EO);
        rrdZ.id_class(Pm, false, Eh);
        rrdZ.id_class(PZ, false, EQ);
        if (BB) {
            rrdZ.id_class(Pv, false, Ex);
            rrdZ.id_class(PF, false, Ed);
            rrdZ.id_class(PL, false, Ek);
            rrdZ.id_class(PA, false, EW);
        }
        rrdZ.id_class(Pn, E);
        rrdZ.id_class(PC, d);
        rrdZ.id_class(Pl, X & 0xFFFF, X >> 16);
        rrdZ.id_class(PH, Math.round(J), Math.round(x));
        rrdZ.id_class(Py, sK[0], sK[1]);
        rrdZ.id_class(Pp, so);
        rrdZ.id_class(Pq, h);
        rrdZ.id_class(PT, c);
        rrdZ.id_class(Pt, u);
        rrdZ.id_class(Pw, (float)((Qw_1)rrdZ.id_class.id_class[20]).a);
        rrdZ.id_class(PI, ((Qw_1)rrdZ.id_class.id_class[20]).g ? 1 : 0);
        rrdZ.id_class(Pf, W);
        rrdZ.id_class(Pj, j, V);
        rrdZ.id_class(PY, f);
        rrdZ.id_class(Po, v.ordinal());
        if (GJ != null) {
            GJ.id_class();
        }
    }

    private static rrxY_2 id_class(rrxY_2 rrxY_22) {
        int n = rrxY_22.id_break();
        for (int i = rrxY_22.id_class(); i < n; ++i) {
            rrxY_22.id_class(i, 0);
        }
        return rrxY_22;
    }

    public static void id_class(rrdG rrdG2) {
        rrdZ.id_catch("pre-useProgram");
        if (id_new) {
            rrdG2 = Bp;
        } else if (id_continue) {
            rrdG2 = SP;
        }
        if (Sz != rrdG2) {
            int n;
            rrdZ.rP();
            rrdZ.id_class(Sz, rrdG2);
            if (EF && EL) {
                KHRDebug.glPopDebugGroup();
            }
            Sz = rrdG2;
            if (EF) {
                KHRDebug.glPushDebugGroup((int)33354, (int)0, (CharSequence)Sz.id_synchronized());
                EL = true;
            }
            SQ = n = rrdG2.id_private();
            ARBShaderObjects.glUseProgramObjectARB((int)n);
            if (rrdZ.id_catch("useProgram") != 0) {
                rrdG2.id_class(0);
                SQ = n = rrdG2.id_private();
                ARBShaderObjects.glUseProgramObjectARB((int)n);
            }
            ER.id_class(n);
            if (GJ != null) {
                GJ.id_class(n);
            }
            if (n != 0) {
                rrxY_2 rrxY_22 = rrdG2.id_extends();
                if (id_int) {
                    rrxU_2.id_class(rrxY_22);
                }
                rrdZ.id_class(rrdG2.id_case());
                rrdZ.rb();
                rrdZ.id_catch("end useProgram");
            }
        }
    }

    public static void id_class(float f, float f2, float f3, float f4) {
        id_char.id_class(f, f2, f3, 1.0f);
    }

    public static void id_class(float f, float f2, float f3) {
        sV = f;
        sg = f2;
        sR = f3;
        rrdZ.id_class(rU, sV, sg, sR);
    }

    public static void id_class(int n, int n2, int n3, int n4) {
        MT.id_class(true, true, true, true);
        if (id_new) {
            GL11.glViewport((int)0, (int)0, (int)Bs, (int)BE);
        } else {
            GL11.glViewport((int)0, (int)0, (int)id_extends, (int)id_native);
            BL.id_private();
            id_int = true;
            MT.id_throw();
            MT.id_volatile();
            rrxU_2.id_class(EZ);
            rrdZ.id_class(Bf);
            rrdZ.id_catch("beginRenderPass");
        }
    }

    private static void id_class(rrkL rrkL2, int n) {
        rrkL2.id_break(n);
    }

    public static void id_class(boolean bl, boolean bl2) {
        ET = bl;
        Et = bl2;
    }

    private static void id_class(rrkC rrkC2, float f, float f2, float f3) {
        rrkC2.id_class(f, f2, f3);
    }

    private static void id_class(rrkp_1 rrkp_12, boolean bl, FloatBuffer floatBuffer) {
        rrkp_12.id_class(bl, floatBuffer);
    }

    private static void id_class(rrkn_1 rrkn_12, int n, int n2) {
        rrkn_12.id_class(n, n2);
    }

    public static boolean id_class(rpm_3 rpm_32) {
        if (rpm_32 == rpm_3.MAIN_HAND && ET) {
            return true;
        }
        return rpm_32 == rpm_3.OFF_HAND && Et;
    }

    private static void id_class(rrdG rrdG2, rrdG rrdG3) {
        rrxz_3 rrxz_32;
        rrxW_2 rrxW_22;
        if (rrdG2.id_package() != null) {
            MT.G();
        }
        if (rrdG2.id_int() != null) {
            MT.b();
        }
        if (rrdG2.id_continue() != null) {
            MT.d();
        }
        if ((rrxW_22 = rrdG3.id_package()) != null) {
            MT.id_class(rrxW_22);
        }
        if ((rrxz_32 = rrdG3.id_int()) != null) {
            MT.id_class(rrxz_32);
        }
        if (rrdG3.id_continue() != null) {
            MT.id_class(rrdG3.id_continue());
        }
    }

    private static void id_class(rrkF rrkF2, float f) {
        rrkF2.id_class(f);
    }

    private static IntBuffer id_class(IntBuffer intBuffer) {
        int n = intBuffer.limit();
        for (int i = intBuffer.position(); i < n; ++i) {
            intBuffer.put(i, 0);
        }
        return intBuffer;
    }

    public static void id_class(ryO_2 ryO_22) {
        if (id_volatile) {
            rrdZ.id_catch("nextBlockEntity");
            rrdZ.id_class(Be);
            rrdZ.id_break(ryO_22);
        }
    }

    public static void id_class(an_3 an_32) {
        if (id_volatile) {
            if (an_32.w()) {
                rrdZ.id_class(SP);
            } else {
                rrdZ.id_class(Sr);
            }
            rrdZ.id_break(an_32);
        }
    }

    public static void id_class(xd_3 xd_32) {
        int n = xd_32.id_class(xd_32.id_continue()).ordinal();
        rrdZ.En[++rrdZ.EC * 2] = rVL.id_strictfp.id_class(xd_32) & 0xFFFF | n << 16;
        rrdZ.En[rrdZ.EC * 2 + 1] = 0;
    }

    public static void id_class() {
        Object object;
        rrdJ.id_byte("Load shaders configuration.");
        try {
            if (!sG.exists()) {
                sG.mkdir();
            }
        }
        catch (Exception exception) {
            rrdJ.id_class("Failed to open the shaderpacks directory: " + sG);
        }
        Sm = new rrzE_2();
        Sm.setProperty(rrdy_1.SHADER_PACK.id_break(), "");
        if (sb.exists()) {
            try {
                object = new FileReader(sb);
                Sm.load((Reader)object);
                ((InputStreamReader)object).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (!sb.exists()) {
            try {
                rrdZ.id_break();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        object = rrdy_1.values();
        for (int i = 0; i < ((rrdy_1[])object).length; ++i) {
            Object object2 = object[i];
            String string = ((rrdy_1)((Object)object2)).id_break();
            String string2 = ((rrdy_1)((Object)object2)).id_byte();
            String string3 = Sm.getProperty(string, string2);
            rrdZ.id_class((rrdy_1)((Object)object2), string3);
        }
        rrdZ.id_byte();
    }

    public static boolean id_class(Qw_1 qw_1) {
        if (!sr) {
            return true;
        }
        rrdZ.id_catch("shouldRenderClouds");
        return id_new ? Sl : qw_1.id_throws != Vd_1.OFF;
    }

    public static void id_class(rjU_2 rjU_22) {
        id_abstract = (float)rjU_22.id_break;
        id_long = (float)rjU_22.id_byte;
        id_float = (float)rjU_22.id_protected;
        rrdZ.id_class(re, id_abstract, id_long, id_float);
    }

    private static rrxa_3 id_class(int n, String string, String string2, rrke_1 rrke_12, rrkK rrkK2, int n2, int n3, int n4, rrkD rrkD2, rrkU rrkU2) {
        try {
            String string3 = "shaders/" + rrzX_2.id_protected(string2, "/");
            InputStream inputStream = Ei.id_class(string3);
            if (inputStream == null) {
                rrdJ.id_break("Raw texture not found: " + string2);
                return null;
            }
            byte[] byArray = rrbb_3.id_byte(inputStream);
            IOUtils.closeQuietly((InputStream)inputStream);
            ByteBuffer byteBuffer = Hb_1.id_class(byArray.length);
            byteBuffer.put(byArray);
            ((Buffer)byteBuffer).flip();
            Vs_1 vs_1 = rrdl_1.id_class(string3, new Vs_1(true, true));
            return new rrxg_3(rrke_12, rrkK2, n2, n3, n4, rrkD2, rrkU2, byteBuffer, n, vs_1.id_class(), vs_1.id_break());
        }
        catch (IOException iOException) {
            rrdJ.id_break("Error loading raw texture: " + string2);
            rrdJ.id_break(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    public static void id_class(int n, int n2) {
        GL11.glFogi((int)n, (int)n2);
        if (n == 2917) {
            sf = n2;
            if (Z) {
                rrdZ.id_class(rK, sf);
            }
        }
    }

    public static void id_class(float f) {
        sj = f;
        if (Z) {
            rrdZ.id_class(rD, f);
        }
    }

    public static void id_class(MD mD) {
        rrdZ.id_protected(mD.param);
    }

    public static void id_class(Ml_1 ml_1, boolean bl) {
        GL43.glMatrixMode((int)5888);
        GL43.glPushMatrix();
        GL43.glMatrixMode((int)5889);
        GL43.glPushMatrix();
        GL43.glMatrixMode((int)5888);
        ml_1.id_class();
        if (bl) {
            rrdZ.id_class(Sh);
        } else {
            rrdZ.id_class(Ss);
        }
        rrdZ.id_catch("beginHand");
        rrdZ.id_case("beginHand");
    }

    public static IntBuffer id_class(int n) {
        ByteBuffer byteBuffer = Gz;
        int n2 = byteBuffer.limit();
        ((Buffer)byteBuffer).position(n2).limit(n2 + n * 4);
        return byteBuffer.asIntBuffer();
    }

    private static boolean id_class(rrdF rrdF2, rrdG rrdG2) {
        boolean bl = false;
        Boolean[] booleanArray = rrdG2.id_this();
        for (int i = 0; i < BN; ++i) {
            if (!rrbb_3.id_class(booleanArray[i])) continue;
            rrdF2.id_case(i);
            bl = true;
        }
        return bl;
    }

    public static String id_class(rrdy_1 rrdy_12) {
        switch (rrdy_12) {
            case ANTIALIASING: {
                return Integer.toString(So);
            }
            case NORMAL_MAP: {
                return Boolean.toString(SV);
            }
            case SPECULAR_MAP: {
                return Boolean.toString(Sg);
            }
            case RENDER_RES_MUL: {
                return Float.toString(Sy);
            }
            case SHADOW_RES_MUL: {
                return Float.toString(Sp);
            }
            case HAND_DEPTH_MUL: {
                return Float.toString(SH);
            }
            case CLOUD_SHADOW: {
                return Boolean.toString(Sl);
            }
            case OLD_HAND_LIGHT: {
                return SY.id_byte();
            }
            case OLD_LIGHTING: {
                return SR.id_byte();
            }
            case SHADER_PACK: {
                return sP;
            }
            case TWEAK_BLOCK_DAMAGE: {
                return Boolean.toString(SC);
            }
            case SHADOW_CLIP_FRUSTRUM: {
                return Boolean.toString(Sj);
            }
            case TEX_MIN_FIL_B: {
                return Integer.toString(Sq);
            }
            case TEX_MIN_FIL_N: {
                return Integer.toString(ST);
            }
            case TEX_MIN_FIL_S: {
                return Integer.toString(St);
            }
            case TEX_MAG_FIL_B: {
                return Integer.toString(Sw);
            }
            case TEX_MAG_FIL_N: {
                return Integer.toString(Sw);
            }
            case TEX_MAG_FIL_S: {
                return Integer.toString(Sw);
            }
        }
        throw new IllegalArgumentException("Unknown option: " + rrdy_12);
    }

    public static void id_class(String string) {
        sP = string;
        Sm.setProperty(rrdy_1.SHADER_PACK.id_break(), string);
        rrdZ.id_byte();
    }

    public static void id_class(Ml_1 ml_1) {
        ml_1.id_class(rje_3.id_case.id_byte(sw * 1.0f));
        rrdZ.id_catch("preCelestialRotate");
    }

    public static void id_class(rdn_3 rdn_32) {
        id_else = rrdZ.id_byte(rdn_32);
    }

    public static void id_class(Ml_1 ml_1, ly_3 ly_32, float f) {
        an_3 an_32 = ly_32.id_catch();
        rjU_2 rjU_22 = ly_32.id_break();
        double d = rjU_22.id_break;
        double d2 = rjU_22.id_byte;
        double d3 = rjU_22.id_protected;
        rrdZ.id_byte(an_32);
        Pe = d - (double)Br;
        Pa = d2;
        Pi = d3 - (double)BP;
        rrdZ.id_char();
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        rjV_2 rjV_23 = new rjV_2(rjV_22);
        rjV_23.id_protected();
        rjV_23.id_class(Ew);
        ((Buffer)EX).position(0);
        EX.put(Ew);
        rrdx_1.id_class((FloatBuffer)((Buffer)EJ).position(0), (FloatBuffer)((Buffer)EX).position(0), Es, ES);
        ((Buffer)EX).position(0);
        ((Buffer)EJ).position(0);
        rrdZ.id_catch("setCamera");
    }

    public static void id_class(rrxf_3 rrxf_32) {
        if (BL != null) {
            ARBShaderObjects.glUseProgramObjectARB((int)rrxf_32.id_case());
            if (rrdZ.id_catch("useComputeProgram") != 0) {
                rrxf_32.id_class(0);
            } else {
                ER.id_class(rrxf_32.id_case());
                if (GJ != null) {
                    GJ.id_class(rrxf_32.id_case());
                }
                rrdZ.id_class(rrxf_32.id_throws());
                rrdZ.rb();
                BL.id_break(true);
                rja_3 rja_32 = rrxf_32.id_implements();
                if (rja_32 == null) {
                    rjK_2 rjK_22 = rrxf_32.id_finally();
                    if (rjK_22 == null) {
                        rjK_22 = new rjK_2(1.0f, 1.0f);
                    }
                    int n = (int)Math.ceil((float)id_extends * rjK_22.id_byte);
                    int n2 = (int)Math.ceil((float)id_native * rjK_22.id_protected);
                    rja_3 rja_33 = rrxf_32.id_private();
                    int n3 = (int)Math.ceil(1.0 * (double)n / (double)rja_33.b_());
                    int n4 = (int)Math.ceil(1.0 * (double)n2 / (double)rja_33.c_());
                    rja_32 = new rja_3(n3, n4, 1);
                }
                GL43.glMemoryBarrier((int)40);
                GL43.glDispatchCompute((int)rja_32.b_(), (int)rja_32.c_(), (int)rja_32.d_());
                GL43.glMemoryBarrier((int)40);
                rrdZ.id_catch("compute");
            }
        }
    }

    public static void id_class(rrdF rrdF2, rrxf_3[] rrxf_3Array) {
        for (int i = 0; i < rrxf_3Array.length; ++i) {
            rrxf_3 rrxf_32 = rrxf_3Array[i];
            rrdZ.id_class(rrxf_32);
            if (!rrxf_32.id_native()) continue;
            rrdF2.id_throws(rrxf_32.id_extends());
        }
    }

    private static void id_class(rrdy_1 rrdy_12, String string) {
        if (string == null) {
            string = rrdy_12.id_byte();
        }
        switch (rrdy_12) {
            case ANTIALIASING: {
                So = rrbb_3.id_class(string, 0);
                break;
            }
            case NORMAL_MAP: {
                SV = rrbb_3.id_class(string, true);
                break;
            }
            case SPECULAR_MAP: {
                Sg = rrbb_3.id_class(string, true);
                break;
            }
            case RENDER_RES_MUL: {
                Sy = rrbb_3.id_class(string, 1.0f);
                break;
            }
            case SHADOW_RES_MUL: {
                Sp = rrbb_3.id_class(string, 1.0f);
                break;
            }
            case HAND_DEPTH_MUL: {
                SH = rrbb_3.id_class(string, 0.125f);
                break;
            }
            case CLOUD_SHADOW: {
                Sl = rrbb_3.id_class(string, true);
                break;
            }
            case OLD_HAND_LIGHT: {
                SY.id_class(string);
                break;
            }
            case OLD_LIGHTING: {
                SR.id_class(string);
                break;
            }
            case SHADER_PACK: {
                sP = string;
                break;
            }
            case TWEAK_BLOCK_DAMAGE: {
                SC = rrbb_3.id_class(string, true);
                break;
            }
            case SHADOW_CLIP_FRUSTRUM: {
                Sj = rrbb_3.id_class(string, true);
                break;
            }
            case TEX_MIN_FIL_B: {
                Sq = rrbb_3.id_class(string, 0);
                break;
            }
            case TEX_MIN_FIL_N: {
                ST = rrbb_3.id_class(string, 0);
                break;
            }
            case TEX_MIN_FIL_S: {
                St = rrbb_3.id_class(string, 0);
                break;
            }
            case TEX_MAG_FIL_B: {
                Sw = rrbb_3.id_class(string, 0);
                break;
            }
            case TEX_MAG_FIL_N: {
                Sw = rrbb_3.id_class(string, 0);
                break;
            }
            case TEX_MAG_FIL_S: {
                Sw = rrbb_3.id_class(string, 0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + rrdy_12);
            }
        }
    }

    private static void id_class(rrdF rrdF2, rrdG[] rrdGArray, boolean bl, rrxa_3[] rrxa_3Array) {
        GL43.glPushMatrix();
        GL43.glLoadIdentity();
        GL43.glMatrixMode((int)5889);
        GL43.glPushMatrix();
        GL43.glLoadIdentity();
        GL43.glOrtho((double)0.0, (double)1.0, (double)0.0, (double)1.0, (double)0.0, (double)1.0);
        GL43.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        MT.id_import();
        MT.id_protected();
        MT.id_final();
        MT.id_volatile();
        MT.id_break(519);
        MT.id_class(false);
        MT.id_catch();
        rrdZ.id_class(0, rrxa_3Array);
        rrdF2.id_break(true);
        rrdF2.id_class(false);
        rrdF2.id_implements();
        rrdF2.id_finally();
        rrdZ.id_catch("pre-composite");
        for (int i = 0; i < rrdGArray.length; ++i) {
            rrdG rrdG2 = rrdGArray[i];
            rrdZ.id_class(rrdF2, rrdG2.id_goto());
            if (rrdG2.id_private() == 0) continue;
            rrdZ.id_class(rrdG2);
            rrdZ.id_catch(rrdG2.id_throws());
            if (rrdG2.id_return()) {
                rrdF2.id_throws(rrdG2.id_volatile());
            }
            rrdZ.id_break(rrdF2, rrdG2);
            rrdZ.id_abstract();
            rrdZ.id_byte(rrdF2, rrdG2);
            rrdF2.id_break(rrdG2.id_else());
        }
        rrdZ.id_catch("composite");
        if (bl) {
            rrdZ.rN();
            id_package = true;
        }
        MT.id_import();
        MT.id_throws();
        MT.id_package();
        MT.id_break(515);
        MT.id_class(true);
        GL43.glPopMatrix();
        GL43.glMatrixMode((int)5888);
        GL43.glPopMatrix();
        rrdZ.id_class(By);
    }

    private static void id_class(rrdG[] rrdGArray, boolean bl, rrxa_3[] rrxa_3Array) {
        rrdZ.id_class(BL, rrdGArray, bl, rrxa_3Array);
    }

    public static void id_class(boolean bl) {
        if (bl) {
            if ((So += 2) > 4) {
                So = 0;
            }
        } else if ((So -= 2) < 0) {
            So = 4;
        }
        So = So / 2 * 2;
        So = rrbb_3.id_class(So, 0, 4);
    }

    public static void id_class(rrdX rrdX2) {
        if (sr) {
            v = rrdX2;
            Po.id_break(rrdX2.ordinal());
        }
    }

    public static void id_class(QY qY) {
        rrdZ.p();
        id_class = qY;
        qY = QY.id_instanceof();
        id_throws = GL.getCapabilities();
        id_case = GL11.glGetString((int)7938);
        id_catch = GL11.glGetString((int)7936);
        id_private = GL11.glGetString((int)7937);
        rrdJ.id_byte("OpenGL Version: " + id_case);
        rrdJ.id_byte("Vendor:  " + id_catch);
        rrdJ.id_byte("Renderer: " + id_private);
        rrdJ.id_byte("Capabilities: " + (rrdZ.id_throws.OpenGL20 ? " 2.0 " : " - ") + (rrdZ.id_throws.OpenGL21 ? " 2.1 " : " - ") + (rrdZ.id_throws.OpenGL30 ? " 3.0 " : " - ") + (rrdZ.id_throws.OpenGL32 ? " 3.2 " : " - ") + (rrdZ.id_throws.OpenGL40 ? " 4.0 " : " - "));
        rrdJ.id_byte("GL_MAX_DRAW_BUFFERS: " + GL43.glGetInteger((int)34852));
        rrdJ.id_byte("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL43.glGetInteger((int)36063));
        rrdJ.id_byte("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL43.glGetInteger((int)34930));
        id_implements = rrdZ.id_throws.OpenGL30;
        boolean bl = EF = Boolean.getBoolean("gl.debug.groups") && rrdZ.id_throws.GL_KHR_debug;
        if (EF) {
            rrdJ.id_byte("glDebugGroups: true");
        }
        rrdZ.id_class();
    }

    public static void id_class(String string, IntBuffer intBuffer) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(string).append(" [pos ").append(intBuffer.position()).append(" lim ").append(intBuffer.limit()).append(" cap ").append(intBuffer.capacity()).append(" :");
        int n = intBuffer.limit();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(" ").append(intBuffer.get(i));
        }
        stringBuilder.append("]");
        rrdJ.id_byte(stringBuilder.toString());
    }

    private static String id_class(String string, rrdD[] rrdDArray) {
        if (rrdDArray != null && rrdDArray.length > 0) {
            for (int i = 0; i < rrdDArray.length; ++i) {
                rrdD rrdD2 = rrdDArray[i];
                if (!rrdD2.id_case(string)) continue;
                string = rrdD2.id_package();
                break;
            }
            return string;
        }
        return string;
    }

    private static int id_class(rrdG rrdG2, String string) {
        int n = 0;
        int n2 = rrbb_3.id_class(string, -1);
        if (rrdG2 == Bp) {
            if (n2 >= 0 && n2 < 2) {
                n = 36064 + n2;
                Bu = Math.max(Bu, n2 + 1);
            }
            return n;
        }
        if (n2 >= 0 && n2 < 16) {
            rrdG2.id_else()[n2] = true;
            n = 36064 + n2;
            BZ = Math.max(BZ, n2 + 1);
            BN = Math.max(BN, n2 + 1);
        }
        return n;
    }

    private static rrxa_3[] id_class(Properties properties, rrdM rrdM2) {
        String string = "texture." + rrdM2.id_class() + ".";
        Set<Object> set = properties.keySet();
        ArrayList<rrxa_3> arrayList = new ArrayList<rrxa_3>();
        for (String string2 : set) {
            if (!string2.startsWith(string)) continue;
            String string3 = rrzX_2.id_protected(string2, string);
            string3 = rrzX_2.id_byte(string3, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
            String string4 = properties.getProperty(string2).trim();
            int n = rrdZ.id_class(rrdM2, string3);
            if (n < 0) {
                rrdJ.id_break("Invalid texture name: " + string2);
                continue;
            }
            rrxa_3 rrxa_32 = rrdZ.id_class(n, string4);
            if (rrxa_32 == null) continue;
            rrdJ.id_byte("Custom texture: " + string2 + " = " + string4);
            arrayList.add(rrxa_32);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        rrxa_3[] rrxa_3Array = arrayList.toArray(new rrxa_3[arrayList.size()]);
        return rrxa_3Array;
    }

    public static boolean id_class(HU hU) {
        if (hU == rrxA_2.id_class) {
            return sv.id_private();
        }
        if (hU == rrxA_2.id_byte) {
            return sF.id_private();
        }
        if (hU == rrxA_2.id_break) {
            return sL.id_private();
        }
        return hU == rrxA_2.id_protected ? sA.id_private() : false;
    }

    private static rrxa_3 id_class(int n, String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).indexOf(58) >= 0) {
            return rrdZ.id_break(n, string);
        }
        return string.indexOf(32) >= 0 ? rrdZ.id_byte(n, string) : rrdZ.id_protected(n, string);
    }

    private static rrdD[] id_class(Map<String, rrdV> map, rrdD[] rrdDArray) {
        Object object;
        Object object2;
        HashSet<String> hashSet = new HashSet<String>();
        for (String string : map.keySet()) {
            object2 = map.get(string);
            object = ((rrdV)object2).id_break();
            for (int i = 0; i < ((rrdD[])object).length; ++i) {
                rrdD rrdD2 = object[i];
                if (rrdD2 == null) continue;
                hashSet.add(rrdD2.id_class());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rrdDArray.length; ++i) {
            object2 = rrdDArray[i];
            if (!((rrdD)object2).id_native() || hashSet.contains(object = ((rrdD)object2).id_class())) continue;
            arrayList.add(object2);
        }
        return arrayList.toArray(new rrdD[arrayList.size()]);
    }

    public static int id_class(String string, int n) {
        Object object;
        Object object2 = object = string != null ? "screen." + string : "screen";
        if (sO == null) {
            return n;
        }
        rrdV rrdV2 = sO.get(object);
        return rrdV2 == null ? n : rrdV2.id_byte();
    }

    private static void id_class(rrxa_3[] rrxa_3Array) {
        if (rrxa_3Array != null) {
            for (int i = 0; i < rrxa_3Array.length; ++i) {
                rrxa_3 rrxa_32 = rrxa_3Array[i];
                if (!(rrxa_32 instanceof rrxV_2)) continue;
                rrxV_2 rrxV_22 = (rrxV_2)rrxa_32;
                rrxV_22.id_byte();
            }
        }
    }

    private static int id_class(rrdM rrdM2, String string) {
        int n;
        if (rrdM2 == rrdM.GBUFFERS) {
            n = rrkG.id_class(string, "colortex", 4, 15);
            if (n >= 0) {
                return sD[n];
            }
            if (string.equals("texture")) {
                return 0;
            }
            if (string.equals("lightmap")) {
                return 1;
            }
            if (string.equals("normals")) {
                return 2;
            }
            if (string.equals("specular")) {
                return 3;
            }
            if (string.equals("shadowtex0") || string.equals("watershadow")) {
                return 4;
            }
            if (string.equals("shadow")) {
                return Bx ? 5 : 4;
            }
            if (string.equals("shadowtex1")) {
                return 5;
            }
            if (string.equals("depthtex0")) {
                return 6;
            }
            if (string.equals("gaux1")) {
                return 7;
            }
            if (string.equals("gaux2")) {
                return 8;
            }
            if (string.equals("gaux3")) {
                return 9;
            }
            if (string.equals("gaux4")) {
                return 10;
            }
            if (string.equals("depthtex1")) {
                return 12;
            }
            if (string.equals("shadowcolor0") || string.equals("shadowcolor")) {
                return 13;
            }
            if (string.equals("shadowcolor1")) {
                return 14;
            }
            if (string.equals("noisetex")) {
                return 15;
            }
        }
        if (rrdM2.id_break()) {
            n = rrkG.id_class(string, "colortex", 0, 15);
            if (n >= 0) {
                return sD[n];
            }
            if (string.equals("colortex0")) {
                return 0;
            }
            if (string.equals("gdepth")) {
                return 1;
            }
            if (string.equals("gnormal")) {
                return 2;
            }
            if (string.equals("composite")) {
                return 3;
            }
            if (string.equals("shadowtex0") || string.equals("watershadow")) {
                return 4;
            }
            if (string.equals("shadow")) {
                return Bx ? 5 : 4;
            }
            if (string.equals("shadowtex1")) {
                return 5;
            }
            if (string.equals("depthtex0") || string.equals("gdepthtex")) {
                return 6;
            }
            if (string.equals("gaux1")) {
                return 7;
            }
            if (string.equals("gaux2")) {
                return 8;
            }
            if (string.equals("gaux3")) {
                return 9;
            }
            if (string.equals("gaux4")) {
                return 10;
            }
            if (string.equals("depthtex1")) {
                return 11;
            }
            if (string.equals("depthtex2")) {
                return 12;
            }
            if (string.equals("shadowcolor0") || string.equals("shadowcolor")) {
                return 13;
            }
            if (string.equals("shadowcolor1")) {
                return 14;
            }
            if (string.equals("noisetex")) {
                return 15;
            }
        }
        return -1;
    }

    public static rrdD[] id_class(rrdD[] rrdDArray) {
        ArrayList<rrdD> arrayList = new ArrayList<rrdD>();
        for (int i = 0; i < rrdDArray.length; ++i) {
            rrdD rrdD2 = rrdDArray[i];
            if (!rrdD2.id_finally() || !rrdD2.id_extends()) continue;
            arrayList.add(rrdD2);
        }
        return arrayList.toArray(new rrdD[arrayList.size()]);
    }

    private static Properties id_class(rrxi_3 rrxi_32) throws IOException {
        rrzE_2 rrzE_22 = new rrzE_2();
        String string = "shaderpacks/" + rrxi_32.id_class() + ".txt";
        File file = new File((File)QY.id_instanceof().id_class[24], string);
        if (file.exists() && file.isFile() && file.canRead()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            rrzE_22.load(fileInputStream);
            fileInputStream.close();
            return rrzE_22;
        }
        return rrzE_22;
    }

    private static void id_class(rrxi_3 rrxi_32, Properties properties) throws IOException {
        String string = "shaderpacks/" + rrxi_32.id_class() + ".txt";
        File file = new File((File)QY.id_instanceof().id_class[24], string);
        if (properties.isEmpty()) {
            file.delete();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.store(fileOutputStream, (String)null);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }

    private static void id_class(rrdD[] rrdDArray, rrxi_3 rrxi_32) {
        rrzE_2 rrzE_22 = new rrzE_2();
        if (Gr != null) {
            for (int i = 0; i < rrdDArray.length; ++i) {
                rrdD rrdD2 = rrdDArray[i];
                if (!rrdD2.id_extends() || !rrdD2.id_finally()) continue;
                rrzE_22.setProperty(rrdD2.id_class(), rrdD2.id_protected());
            }
        }
        try {
            rrdZ.id_class(rrxi_32, rrzE_22);
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("[Shaders] Error saving configuration for " + Ei.id_class());
            iOException.printStackTrace();
        }
    }

    private static void id_class(File file) {
        File[] fileArray;
        if (file.exists() && file.isDirectory() && (fileArray = file.listFiles()) != null) {
            for (int i = 0; i < fileArray.length; ++i) {
                File file2 = fileArray[i];
                if (file2.isDirectory()) {
                    rrdZ.id_class(file2);
                }
                file2.delete();
            }
        }
    }

    private static void id_class(rrxf_3 rrxf_32, String string) {
        rrdZ.id_catch("pre setupProgram");
        int n = rrdZ.id_break(rrxf_32, string);
        rrdZ.id_catch("create");
        if (n != 0) {
            int n2 = ARBShaderObjects.glCreateProgramObjectARB();
            rrdZ.id_catch("create");
            if (n != 0) {
                ARBShaderObjects.glAttachObjectARB((int)n2, (int)n);
                rrdZ.id_catch("attach");
            }
            ARBShaderObjects.glLinkProgramARB((int)n2);
            if (GL43.glGetProgrami((int)n2, (int)35714) != 1) {
                rrdJ.id_class("Error linking program: " + n2 + " (" + rrxf_32.id_protected() + ")");
            }
            rrdZ.id_case(n2, rrxf_32.id_protected());
            if (n != 0) {
                ARBShaderObjects.glDetachObjectARB((int)n2, (int)n);
                ARBShaderObjects.glDeleteObjectARB((int)n);
            }
            rrxf_32.id_class(n2);
            rrxf_32.id_break(n2);
            ARBShaderObjects.glUseProgramObjectARB((int)n2);
            ARBShaderObjects.glValidateProgramARB((int)n2);
            ARBShaderObjects.glUseProgramObjectARB((int)0);
            rrdZ.id_case(n2, rrxf_32.id_protected());
            int n3 = GL43.glGetProgrami((int)n2, (int)35715);
            if (n3 != 1) {
                String string2 = "\"";
                rrdZ.id_private("[Shaders] Error: Invalid program " + string2 + rrxf_32.id_protected() + string2);
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                n2 = 0;
                rrxf_32.id_break();
            }
        }
    }

    public static void id_class(String string, String string2) {
        try {
            File file = new File(sG, "debug/" + string);
            file.getParentFile().mkdirs();
            rrbb_3.id_class(file, string2);
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("Error saving: " + string);
            iOException.printStackTrace();
        }
    }

    private static void id_class(rrdG rrdG2, String string, String string2, String string3) {
        rrdZ.id_catch("pre setupProgram");
        T = false;
        t = false;
        w = false;
        I = false;
        f = false;
        int n = rrdZ.id_break(rrdG2, string);
        int n2 = rrdZ.id_byte(rrdG2, string2);
        int n3 = rrdZ.id_protected(rrdG2, string3);
        rrdZ.id_catch("create");
        if (n != 0 || n2 != 0 || n3 != 0) {
            int n4 = ARBShaderObjects.glCreateProgramObjectARB();
            rrdZ.id_catch("create");
            if (n != 0) {
                ARBShaderObjects.glAttachObjectARB((int)n4, (int)n);
                rrdZ.id_catch("attach");
            }
            if (n2 != 0) {
                ARBShaderObjects.glAttachObjectARB((int)n4, (int)n2);
                rrdZ.id_catch("attach");
                if (Ef) {
                    ARBGeometryShader4.glProgramParameteriARB((int)n4, (int)36315, (int)4);
                    ARBGeometryShader4.glProgramParameteriARB((int)n4, (int)36316, (int)5);
                    ARBGeometryShader4.glProgramParameteriARB((int)n4, (int)36314, (int)EV);
                    rrdZ.id_catch("arbGeometryShader4");
                }
                if (Ej) {
                    EXTGeometryShader4.glProgramParameteriEXT((int)n4, (int)36315, (int)4);
                    EXTGeometryShader4.glProgramParameteriEXT((int)n4, (int)36316, (int)5);
                    EXTGeometryShader4.glProgramParameteriEXT((int)n4, (int)36314, (int)EV);
                    rrdZ.id_catch("extGeometryShader4");
                }
                Eg = true;
            }
            if (n3 != 0) {
                ARBShaderObjects.glAttachObjectARB((int)n4, (int)n3);
                rrdZ.id_catch("attach");
            }
            if (T) {
                ARBVertexShader.glBindAttribLocationARB((int)n4, (int)F, (CharSequence)"mc_Entity");
                rrdZ.id_catch("mc_Entity");
            }
            if (t) {
                ARBVertexShader.glBindAttribLocationARB((int)n4, (int)L, (CharSequence)"mc_midTexCoord");
                rrdZ.id_catch("mc_midTexCoord");
            }
            if (w) {
                ARBVertexShader.glBindAttribLocationARB((int)n4, (int)A, (CharSequence)"at_tangent");
                rrdZ.id_catch("at_tangent");
            }
            if (I) {
                ARBVertexShader.glBindAttribLocationARB((int)n4, (int)rrdZ.n, (CharSequence)"at_velocity");
                rrdZ.id_catch("at_velocity");
            }
            if (f) {
                ARBVertexShader.glBindAttribLocationARB((int)n4, (int)C, (CharSequence)"at_midBlock");
                rrdZ.id_catch("at_midBlock");
            }
            ARBShaderObjects.glLinkProgramARB((int)n4);
            if (GL43.glGetProgrami((int)n4, (int)35714) != 1) {
                rrdJ.id_class("Error linking program: " + n4 + " (" + rrdG2.id_throws() + ")");
            }
            rrdZ.id_case(n4, rrdG2.id_throws());
            if (n != 0) {
                ARBShaderObjects.glDetachObjectARB((int)n4, (int)n);
                ARBShaderObjects.glDeleteObjectARB((int)n);
            }
            if (n2 != 0) {
                ARBShaderObjects.glDetachObjectARB((int)n4, (int)n2);
                ARBShaderObjects.glDeleteObjectARB((int)n2);
            }
            if (n3 != 0) {
                ARBShaderObjects.glDetachObjectARB((int)n4, (int)n3);
                ARBShaderObjects.glDeleteObjectARB((int)n3);
            }
            rrdG2.id_class(n4);
            rrdG2.id_break(n4);
            rrdZ.id_class(rrdG2);
            ARBShaderObjects.glValidateProgramARB((int)n4);
            rrdZ.id_class(By);
            rrdZ.id_case(n4, rrdG2.id_throws());
            int n5 = GL43.glGetProgrami((int)n4, (int)35715);
            if (n5 != 1) {
                String string4 = "\"";
                rrdZ.id_private("[Shaders] Error: Invalid program " + string4 + rrdG2.id_throws() + string4);
                ARBShaderObjects.glDeleteObjectARB((int)n4);
                n4 = 0;
                rrdG2.id_break();
            }
        }
    }

    private static boolean id_class(int n, String string, List<String> list) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        int n2 = GL43.glGetShaderi((int)n, (int)35716);
        if (n2 <= 1) {
            return true;
        }
        for (int i = 0; i < list.size(); ++i) {
            String string2 = list.get(i);
            rrdJ.id_byte("File: " + (i + 1) + " = " + string2);
        }
        String string3 = GL43.glGetShaderInfoLog((int)n, (int)n2);
        string3 = rrzX_2.id_private(string3, " \n\r\t");
        rrdJ.id_byte("Shader info log: " + string + "\n" + string3);
        return false;
    }

    private static void rd() {
        rrdZ.id_class(4, GE);
    }

    public static void m() {
        rrdG rrdG2 = Ee.id_class();
        rrdZ.id_class(rrdG2);
    }

    public static void o() {
        if (id_volatile) {
            rrdZ.id_class(Be);
        }
    }

    public static void p() {
        try {
            Class<?> clazz = Class.forName("shadersmod.transform.SMCClassTransformer");
        }
        catch (Throwable throwable) {
            return;
        }
        throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
    }

    public static void k() {
        if (id_volatile) {
            if (!id_new) {
                rrdZ.id_long();
                rrdZ.id_class(SO);
                MT.id_package();
                MT.id_class(true);
            } else {
                MT.id_class(true);
            }
        }
    }

    public static void id_default() {
        id_final = false;
        rrdZ.id_class(m ? Bj : Bf);
        rrdZ.H();
        rrdZ.id_class(rrdX.NONE);
    }

    private static void rb() {
        if (BF) {
            rp.id_break(si[0]);
            rq.id_break(si[1]);
            rT.id_break(si[2]);
            rt.id_break(si[3]);
            rw.id_break(si[4]);
            rI.id_break(si[5]);
            rf.id_break(Er[0]);
            rj.id_break(Er[1]);
        }
    }

    public static boolean t() {
        return id_synchronized;
    }

    public static void g() {
        Ey = false;
        rrdZ.id_class(rrdX.NONE);
    }

    public static void v() {
        rrdZ.m();
    }

    public static boolean j() {
        return Eq;
    }

    public static void q() {
        rrdZ.rc();
        rrdZ.id_class(GE);
        rrdZ.id_class(GG);
        rrdZ.id_class(Gb);
        rrdZ.id_class(GM);
        rrdZ.id_class(GO);
        if (sr) {
            rrxt_3.id_break();
            rrdP.id_class();
            rrxo_3.id_class();
        }
    }

    public static boolean U() {
        return GJ != null;
    }

    public static void id_short() {
        id_final = true;
        Z = true;
        rrdZ.id_class(Bg);
        rrdZ.id_break(-2, 0);
        rrdZ.id_class(rrdX.SKY);
    }

    public static void z() {
        MT.id_catch();
        MT.id_final();
    }

    public static void id_void() {
        rrdZ.id_class(Bw, false, GO);
    }

    public static boolean w() {
        return Ep && Eq;
    }

    public static void u() {
        Ee.id_class(Sz);
    }

    public static void r() {
        if (id_volatile) {
            rrdZ.id_break((an_3)null);
            rrdZ.id_class(m ? Bj : Bf);
        }
    }

    public static String y() {
        if (Ei == null) {
            return null;
        }
        return Ei instanceof rrdN ? null : Ei.id_class();
    }

    public static void N() {
        if (id_final) {
            rrdZ.id_class(Bg);
        } else if (Sz == BI) {
            rrdZ.id_class(m ? Bj : Bf);
        }
    }

    private static void rh() {
        El = id_class.id_else().id_extends();
        EH = id_class.id_else().id_native();
        id_extends = Math.round((float)El * Sy);
        id_native = Math.round((float)EH * Sy);
        rrdZ.rJ();
    }

    public static void id_break(int n, int n2) {
        rrdZ.En[++rrdZ.EC * 2] = n & 0xFFFF | n2 << 16;
        rrdZ.En[rrdZ.EC * 2 + 1] = 0;
    }

    public static void id_break(ryO_2 ryO_22) {
        if (Y.id_case()) {
            int n = rrdZ.id_byte(ryO_22);
            Y.id_break(n);
        }
    }

    private static int id_break(rrxf_3 rrxf_32, String string) {
        Object object;
        InputStream inputStream = Ei.id_class(string);
        if (inputStream == null) {
            return 0;
        }
        int n = ARBShaderObjects.glCreateShaderObjectARB((int)37305);
        if (n == 0) {
            return 0;
        }
        rrdD[] rrdDArray = rrdZ.id_class(Gr);
        ArrayList<String> arrayList = new ArrayList<String>();
        rrWV rrWV2 = new rrWV();
        if (rrWV2 != null) {
            try {
                object = rrWV.id_class(new InputStreamReader(inputStream));
                object = rrks_1.id_class((rrWV)object, string, Ei, 0, arrayList, 0);
                rrdt_1 rrdt_12 = new rrdt_1();
                Iterator<String> iterator = ((rrWV)object).iterator();
                while (iterator.hasNext()) {
                    int n2;
                    Object object2;
                    rrdg_1 rrdg_12;
                    String string2 = iterator.next();
                    string2 = rrdZ.id_class(string2, rrdDArray);
                    rrWV2.id_class(string2);
                    if (!rrdt_12.id_class(string2) || (rrdg_12 = rrkG.id_class(string2)) == null) continue;
                    if (rrdg_12.id_protected()) {
                        object2 = rrdg_12.id_break();
                        n2 = rrkG.id_break((String)object2);
                        if (n2 >= 0) {
                            Bm = Math.max(Bm, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_byte((String)object2);
                        if (n2 >= 0) {
                            Bu = Math.max(Bu, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_protected((String)object2);
                        if (n2 >= 0) {
                            Bu = Math.max(Bu, n2 + 1);
                            BF = true;
                            continue;
                        }
                        n2 = rrkG.id_throws((String)object2);
                        if (n2 >= 0) {
                            Bc = Math.max(Bc, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_case((String)object2);
                        if (n2 >= 0) {
                            BN = Math.max(BN, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_catch((String)object2);
                        if (n2 < 0) continue;
                        BN = Math.max(BN, n2 + 1);
                        BF = true;
                        continue;
                    }
                    if (rrdg_12.id_byte("in")) {
                        object2 = rrkG.id_finally(rrdg_12.id_byte());
                        if (object2 != null) {
                            rrxf_32.id_class((rja_3)object2);
                            continue;
                        }
                        rrdJ.id_class("Invalid local size: " + string2);
                        continue;
                    }
                    if (rrdg_12.id_catch("workGroups")) {
                        object2 = rrdg_12.id_new();
                        if (object2 != null) {
                            rrxf_32.id_break((rja_3)object2);
                            continue;
                        }
                        rrdJ.id_class("Invalid workGroups: " + string2);
                        continue;
                    }
                    if (rrdg_12.id_native("workGroupsRender")) {
                        object2 = rrdg_12.id_continue();
                        if (object2 != null) {
                            rrxf_32.id_class((rjK_2)object2);
                            continue;
                        }
                        rrdJ.id_class("Invalid workGroupsRender: " + string2);
                        continue;
                    }
                    if (!rrdg_12.id_class("MipmapEnabled", true) || (n2 = rrdZ.id_implements((String)(object2 = rrzX_2.id_throws(rrdg_12.id_break(), "MipmapEnabled")))) < 0) continue;
                    int n3 = rrxf_32.id_extends();
                    rrxf_32.id_byte(n3 |= 1 << n2);
                    rrdJ.id_byte("%s mipmap enabled", object2);
                }
            }
            catch (Exception exception) {
                rrdJ.id_class("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n);
                return 0;
            }
        }
        object = rrWV2.toString();
        if (sy) {
            rrdZ.id_class(string, (String)object);
        }
        if (rrxf_32.id_private() == null) {
            rrdJ.id_class("Missing local size: " + string);
            GL43.glDeleteShader((int)n);
            return 0;
        }
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)object);
        ARBShaderObjects.glCompileShaderARB((int)n);
        if (GL43.glGetShaderi((int)n, (int)35713) != 1) {
            rrdJ.id_class("Error compiling compute shader: " + string);
        }
        rrdZ.id_class(n, string, arrayList);
        return n;
    }

    public static void id_break(an_3 an_32) {
        if (R.id_case()) {
            int n = rrWu_1.id_class(an_32);
            int n2 = rrxo_3.id_class(n);
            R.id_break(n2);
        }
    }

    public static int id_break(int n) {
        switch (n) {
            case 6407: {
                return 32849;
            }
            case 6408: {
                return 32856;
            }
            case 8194: {
                return 33321;
            }
            case 10768: {
                return 32849;
            }
            case 32855: {
                return 32856;
            }
            case 33319: {
                return 33323;
            }
            case 35901: {
                return 32852;
            }
        }
        return n;
    }

    public static void id_break(boolean bl, boolean bl2) {
        Ep = bl;
        Eq = bl2;
    }

    public static void id_break(float f, float f2, float f3, float f4) {
        if (id_volatile && !id_new) {
            g.id_class(f, f2, f3, f4);
        }
    }

    private static void id_break(rrdF rrdF2, rrdG rrdG2) {
        Object object;
        int n = rrdF2.id_protected();
        int n2 = rrdF2.id_throws();
        if (rrdG2.id_public() != null) {
            object = rrdG2.id_public().id_class(n, n2);
            n = ((Dimension)object).width;
            n2 = ((Dimension)object).height;
            rrxK_2 rrxK_22 = rrdF2.id_class(n, n2, rrdG2.id_extends(), false);
            rrxK_22.id_break();
            GL43.glViewport((int)0, (int)0, (int)n, (int)n2);
        }
        if ((object = rrdG2.id_super()) != null) {
            int n3 = (int)((float)n * ((rrdj_1)object).id_break());
            int n4 = (int)((float)n2 * ((rrdj_1)object).id_byte());
            int n5 = (int)((float)n * ((rrdj_1)object).id_class());
            int n6 = (int)((float)n2 * ((rrdj_1)object).id_class());
            GL43.glViewport((int)n3, (int)n4, (int)n5, (int)n6);
        }
    }

    public static rrxi_3 id_break(String string) {
        if (string == null) {
            return null;
        }
        if (!(string = string.trim()).isEmpty() && !string.equals(sB)) {
            if (string.equals(sS)) {
                return new rrdz_1();
            }
            try {
                File file = new File(sG, string);
                if (file.isDirectory()) {
                    return new rrdQ(string, file);
                }
                return file.isFile() && string.toLowerCase().endsWith(".zip") ? new rrdc_1(string, file) : null;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static void id_break(Ml_1 ml_1, ly_3 ly_32, float f) {
        float f2;
        float f3;
        float f4;
        an_3 an_32 = ly_32.id_catch();
        rjU_2 rjU_22 = ly_32.id_break();
        double d = rjU_22.id_break;
        double d2 = rjU_22.id_byte;
        double d3 = rjU_22.id_protected;
        rrdZ.id_byte(an_32);
        Pe = d - (double)Br;
        Pa = d2;
        Pi = d3 - (double)BP;
        GL43.glViewport((int)0, (int)0, (int)Bs, (int)BE);
        GL43.glMatrixMode((int)5889);
        GL43.glLoadIdentity();
        if (Bh) {
            GL43.glOrtho((double)(-BO), (double)BO, (double)(-BO), (double)BO, (double)0.05f, (double)256.0);
        } else {
            MT.id_class(rjV_2.id_class((double)BM, (float)Bs / (float)BE, 0.05f, 256.0f));
        }
        ml_1.id_class(0.0, 0.0, -100.0);
        ml_1.id_class(rje_3.id_break.id_byte(90.0f));
        id_short = ((gm_3)rrdZ.id_class.id_class[56]).id_protected(f);
        id_default = id_short < 0.75f ? id_short + 0.25f : id_short - 0.75f;
        float f5 = id_short * -360.0f;
        float f6 = f4 = sI > 0.0f ? f5 % sI - sI * 0.5f : 0.0f;
        if ((double)id_default <= 0.5) {
            ml_1.id_class(rje_3.id_case.id_byte(f5 - f4));
            ml_1.id_class(rje_3.id_break.id_byte(sw));
            id_const = id_default;
        } else {
            ml_1.id_class(rje_3.id_case.id_byte(f5 + 180.0f - f4));
            ml_1.id_class(rje_3.id_break.id_byte(sw));
            id_const = id_default - 0.5f;
        }
        if (Bh) {
            f3 = sY;
            f2 = f3 / 2.0f;
            ml_1.id_class((double)((float)d % f3 - f2), (double)((float)d2 % f3 - f2), (double)((float)d3 % f3 - f2));
        }
        f3 = id_default * ((float)Math.PI * 2);
        f2 = (float)Math.cos(f3);
        float f7 = (float)Math.sin(f3);
        float f8 = sw * ((float)Math.PI * 2);
        float f9 = f2;
        float f10 = f7 * (float)Math.cos(f8);
        float f11 = f7 * (float)Math.sin(f8);
        if ((double)id_default > 0.5) {
            f9 = -f2;
            f10 = -f10;
            f11 = -f11;
        }
        rrdZ.id_try[0] = f9;
        rrdZ.id_try[1] = f10;
        rrdZ.id_try[2] = f11;
        rrdZ.id_try[3] = 0.0f;
        rrdZ.rk();
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        rjV_22.id_class((FloatBuffer)((Buffer)Ek).position(0));
        rrdx_1.id_class((FloatBuffer)((Buffer)EW).position(0), (FloatBuffer)((Buffer)Ek).position(0), EM, Eb);
        ((Buffer)Ek).position(0);
        ((Buffer)EW).position(0);
        rrdZ.id_class(Pu, false, EO);
        rrdZ.id_class(Pm, false, Eh);
        rrdZ.id_class(Pc, false, Ez);
        rrdZ.id_class(PQ, false, EX);
        rrdZ.id_class(PN, false, EJ);
        rrdZ.id_class(PZ, false, EQ);
        rrdZ.id_class(Pv, false, Ex);
        rrdZ.id_class(PF, false, Ed);
        rrdZ.id_class(PL, false, Ek);
        rrdZ.id_class(PA, false, EW);
        rrdZ.id_catch("setCamera");
    }

    private static rrxf_3[] id_break(rrdG rrdG2, String string, String string2, String string3) {
        if (rrdG2.id_case() == rrdM.GBUFFERS) {
            return new rrxf_3[0];
        }
        ArrayList<rrxf_3> arrayList = new ArrayList<rrxf_3>();
        int n = 27;
        for (int i = 0; i < n; ++i) {
            String string4 = i > 0 ? "_" + (char)(97 + i - 1) : "";
            String string5 = string2 + string4;
            String string6 = string + string5 + string3;
            rrxf_3 rrxf_32 = new rrxf_3(rrdG2.id_throws(), rrdG2.id_case());
            rrdZ.id_class(rrxf_32, string6);
            if (rrxf_32.id_case() <= 0) continue;
            arrayList.add(rrxf_32);
            rrdJ.id_byte("Compute program loaded: " + string5);
        }
        return arrayList.toArray(new rrxf_3[arrayList.size()]);
    }

    public static void id_break(rdn_3 rdn_32) {
        id_synchronized = rrdZ.id_byte(rdn_32);
    }

    private static rrxa_3 id_break(int n, String string) {
        String string2 = string.trim();
        int n2 = 0;
        if (string2.startsWith("minecraft:textures/")) {
            if ((string2 = rrzX_2.id_case(string2, ".png")).endsWith("_n.png")) {
                string2 = rrzX_2.id_class(string2, "_n.png", ".png");
                n2 = 1;
            } else if (string2.endsWith("_s.png")) {
                string2 = rrzX_2.id_class(string2, "_s.png", ".png");
                n2 = 2;
            }
        }
        if (string2.startsWith("minecraft:dynamic/lightmap_")) {
            string2 = string2.replace("lightmap", "light_map");
        }
        rqO_2 rqO_22 = new rqO_2(string2);
        return new rrxV_2(n, rqO_22, n2);
    }

    public static void id_break(boolean bl) {
        Ey = true;
        if (bl) {
            rrdZ.id_class(rrdX.HAND_TRANSLUCENT);
        } else {
            rrdZ.id_class(rrdX.HAND_SOLID);
        }
    }

    private static int id_break(rrdG rrdG2, String string) {
        Object object;
        InputStream inputStream = Ei.id_class(string);
        if (inputStream == null) {
            return 0;
        }
        int n = ARBShaderObjects.glCreateShaderObjectARB((int)35633);
        if (n == 0) {
            return 0;
        }
        rrdD[] rrdDArray = rrdZ.id_class(Gr);
        ArrayList<String> arrayList = new ArrayList<String>();
        rrWV rrWV2 = new rrWV();
        if (rrWV2 != null) {
            try {
                object = rrWV.id_class(new InputStreamReader(inputStream));
                object = rrks_1.id_class((rrWV)object, string, Ei, 0, arrayList, 0);
                object = rrks_1.id_class((rrWV)object);
                rrdt_1 rrdt_12 = new rrdt_1();
                Iterator<String> iterator = ((rrWV)object).iterator();
                while (iterator.hasNext()) {
                    rrdg_1 rrdg_12;
                    String string2 = iterator.next();
                    string2 = rrdZ.id_class(string2, rrdDArray);
                    rrWV2.id_class(string2);
                    if (!rrdt_12.id_class(string2) || (rrdg_12 = rrkG.id_class(string2)) == null) continue;
                    if (rrdg_12.id_break("mc_Entity")) {
                        l = true;
                        T = true;
                    } else if (rrdg_12.id_break("mc_midTexCoord")) {
                        H = true;
                        t = true;
                    } else if (rrdg_12.id_break("at_tangent")) {
                        y = true;
                        w = true;
                    } else if (rrdg_12.id_break("at_velocity")) {
                        p = true;
                        I = true;
                    } else if (rrdg_12.id_break("at_midBlock")) {
                        q = true;
                        f = true;
                    }
                    if (!rrdg_12.id_throws("countInstances")) continue;
                    rrdG2.id_protected(rrdg_12.id_package());
                    rrdJ.id_byte("countInstances: " + rrdG2.id_final());
                }
            }
            catch (Exception exception) {
                rrdJ.id_class("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n);
                return 0;
            }
        }
        object = rrWV2.toString();
        if (sy) {
            rrdZ.id_class(string, (String)object);
        }
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)object);
        ARBShaderObjects.glCompileShaderARB((int)n);
        if (GL43.glGetShaderi((int)n, (int)35713) != 1) {
            rrdJ.id_class("Error compiling vertex shader: " + string);
        }
        rrdZ.id_class(n, string, arrayList);
        return n;
    }

    public static String id_break(String string, String string2) {
        String string3 = GB.get(string);
        return string3 == null ? string2 : string3;
    }

    public static void id_break() {
        rrdJ.id_byte("Save shaders configuration.");
        if (Sm == null) {
            Sm = new rrzE_2();
        }
        rrdy_1[] rrdy_1Array = rrdy_1.values();
        for (int i = 0; i < rrdy_1Array.length; ++i) {
            rrdy_1 rrdy_12 = rrdy_1Array[i];
            String string = rrdy_12.id_break();
            String string2 = rrdZ.id_class(rrdy_12);
            Sm.setProperty(string, string2);
        }
        try {
            FileWriter fileWriter = new FileWriter(sb);
            Sm.store(fileWriter, (String)null);
            fileWriter.close();
        }
        catch (Exception exception) {
            rrdJ.id_class("Error saving configuration: " + exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    private static void id_break(rrdG rrdG2) {
        int n = GL43.glGetInteger((int)34852);
        Arrays.fill(rrdG2.id_else(), false);
        if (rrdG2 == Sd) {
            rrdG2.id_class((rrxY_2)null);
        } else if (rrdG2.id_private() == 0) {
            if (rrdG2 == Bp) {
                rrdG2.id_class(EZ);
            } else {
                rrdG2.id_class(Ev[0]);
            }
        } else {
            String[] stringArray = rrdG2.id_finally();
            if (stringArray == null) {
                if (rrdG2 != Bp && rrdG2 != Bq && rrdG2 != BT) {
                    rrdG2.id_class(Eu);
                    Bv = Math.min(BN, n);
                    Arrays.fill(rrdG2.id_else(), 0, BN, true);
                } else {
                    rrdG2.id_class(Em);
                }
            } else {
                String string;
                rrxY_2 rrxY_22 = rrdG2.id_native();
                int n2 = stringArray.length;
                Bv = Math.max(Bv, n2);
                n2 = Math.min(n2, n);
                rrdG2.id_class(rrxY_22);
                rrxY_22.id_protected(n2);
                for (int i = 0; i < n2; ++i) {
                    int n3 = rrdZ.id_class(rrdG2, stringArray[i]);
                    rrxY_22.id_class(i, n3);
                }
                String string2 = rrxY_22.id_class(false);
                if (!rrbb_3.id_class((Object)string2, (Object)(string = rrxY_22.id_class(true)))) {
                    rrdJ.id_byte("Draw buffers: " + string2 + " -> " + string);
                }
            }
        }
    }

    private static rrdD[] id_break(rrdD[] rrdDArray) {
        ArrayList<rrdD> arrayList = new ArrayList<rrdD>();
        for (int i = 0; i < rrdDArray.length; ++i) {
            rrdD rrdD2 = rrdDArray[i];
            if (!rrdD2.id_native()) continue;
            arrayList.add(rrdD2);
        }
        return arrayList.toArray(new rrdD[arrayList.size()]);
    }

    public static void id_break(Ml_1 ml_1) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        rjV_2 rjV_23 = new rjV_2(rjV_22);
        rjV_23.id_protected();
        rjV_23.id_class(Ew);
        rrdx_1.id_break(id_return, Ew, id_throw);
        rrdx_1.id_break(id_public, Ew, id_interface);
        System.arraycopy(id_const == id_default ? id_return : id_public, 0, id_goto, 0, 3);
        rrdZ.id_class(PJ, id_return[0], id_return[1], id_return[2]);
        rrdZ.id_class(Px, id_public[0], id_public[1], id_public[2]);
        rrdZ.id_class(Pd, id_goto[0], id_goto[1], id_goto[2]);
        if (GJ != null) {
            GJ.id_class();
        }
        rrdZ.id_catch("postCelestialRotate");
    }

    private static void id_break(rrxa_3[] rrxa_3Array) {
        if (rrxa_3Array != null) {
            for (int i = 0; i < rrxa_3Array.length; ++i) {
                rrxa_3 rrxa_32 = rrxa_3Array[i];
                MT.id_new(33984 + rrxa_32.id_class());
                int n = rrxa_32.id_protected();
                int n2 = rrxa_32.af_();
                if (n2 == 3553) {
                    MT.id_super(n);
                    continue;
                }
                GL11.glBindTexture((int)n2, (int)n);
            }
            MT.id_new(33984);
        }
    }

    public static rrdD[] id_throws() {
        return Gr;
    }

    public static boolean id_throws(String string) {
        return GP == null ? false : GP.contains(string);
    }

    private static String id_throws(int n, String string) {
        String string2;
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        if (n == 1286) {
            int n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
            object2 = rrdZ.id_continue(n2);
            object = ", fbStatus: " + n2 + " (" + (String)object2 + ")";
            stringBuilder.append((String)object);
        }
        if ((string2 = Sz.id_throws()).isEmpty()) {
            string2 = "none";
        }
        stringBuilder.append(", program: " + string2);
        object2 = rrdZ.id_new(SQ);
        if (object2 != Sz) {
            object = ((rrdG)object2).id_throws();
            if (((String)object).isEmpty()) {
                object = "none";
            }
            stringBuilder.append(" (" + (String)object + ")");
        }
        if (string.equals("setDrawBuffers")) {
            stringBuilder.append(", drawBuffers: " + rrki_1.id_class(Sz.id_finally()));
        }
        return stringBuilder.toString();
    }

    public static void id_throws(int n) {
        GL43.glEnable((int)n);
        if (n == 3553) {
            rrdZ.N();
        } else if (n == 2912) {
            rrdZ.F();
        }
    }

    private static void id_throws(rrdG rrdG2) {
        if (rrdG2.id_case().id_byte()) {
            rrWz_1 rrWz_12 = null;
            int n = 0;
            int n2 = 0;
            rrxY_2 rrxY_22 = rrdG2.id_extends();
            if (rrxY_22 != null) {
                for (int i = 0; i < rrxY_22.id_break(); ++i) {
                    rrWz_1 rrWz_13;
                    int n3 = rrxY_22.id_class(i);
                    int n4 = n3 - 36064;
                    if (n4 < 0 || n4 >= GX.length || (rrWz_13 = GX[n4]) == null) continue;
                    ++n;
                    if (rrWz_12 == null) {
                        rrWz_12 = rrWz_13;
                    }
                    if (!rrWz_13.equals(rrWz_12)) continue;
                    ++n2;
                }
                if (n != 0) {
                    if (n2 != rrxY_22.id_break()) {
                        rrdJ.id_class("Program " + rrdG2.id_throws() + " draws to buffers with different sizes");
                    } else {
                        rrdG2.id_class(rrWz_12);
                    }
                }
            }
        }
    }

    public static void id_throws(Ml_1 ml_1) {
        rrdZ.id_byte(ml_1);
        GL11.glColor3f((float)sV, (float)sg, (float)sR);
        rrdZ.id_protected(ml_1);
        GL11.glColor3f((float)id_abstract, (float)id_long, (float)id_float);
    }

    public static void L() {
        Z = false;
        rrdZ.id_class(rK, 0);
    }

    public static void M() {
        rrdZ.id_class(Bf);
        rrdZ.id_class(rrdX.PARTICLES);
    }

    public static void W() {
        if (id_volatile) {
            if (id_new) {
                // empty if block
            }
            rrdZ.id_class(m ? Bj : Bf);
        }
    }

    public static void H() {
        rrdZ.En[rrdZ.EC * 2] = 0;
        rrdZ.En[rrdZ.EC * 2 + 1] = 0;
        --EC;
    }

    public static boolean R() {
        return Ey;
    }

    public static void P() {
        if (id_volatile) {
            id_continue = true;
        }
    }

    public static boolean id_finally() {
        return !sk.id_catch() ? sk.id_private() : true;
    }

    public static InputStream id_finally(String string) {
        return Ei == null ? null : Ei.id_class(string);
    }

    public static void id_finally(int n) {
        GL43.glDisable((int)n);
        rrdZ.L();
    }

    public static ArrayList id_catch() {
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        try {
            if (!sG.exists()) {
                sG.mkdir();
            }
            object = sG.listFiles();
            for (int i = 0; i < ((File[])object).length; ++i) {
                File file = object[i];
                String string = file.getName();
                if (file.isDirectory()) {
                    File file2;
                    if (string.equals("debug") || !(file2 = new File(file, "shaders")).exists() || !file2.isDirectory()) continue;
                    arrayList.add(string);
                    continue;
                }
                if (!file.isFile() || !string.toLowerCase().endsWith(".zip")) continue;
                arrayList2.add(string);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(arrayList2, String.CASE_INSENSITIVE_ORDER);
        object = new ArrayList();
        ((ArrayList)object).add(sB);
        ((ArrayList)object).add(sS);
        ((ArrayList)object).addAll(arrayList);
        ((ArrayList)object).addAll(arrayList2);
        return object;
    }

    public static void id_catch(int n) {
        GL43.glEnable((int)n);
        rrdZ.N();
    }

    public static void id_catch(Ml_1 ml_1) {
        rrdZ.id_catch("pre endHand");
        rrdZ.id_case("pre endHand");
        ml_1.id_break();
        GL43.glMatrixMode((int)5889);
        GL43.glPopMatrix();
        GL43.glMatrixMode((int)5888);
        GL43.glPopMatrix();
        MT.id_break(770, 771);
        rrdZ.id_catch("endHand");
    }

    public static int id_catch(String string) {
        int n = MT.id_switch();
        if (n != 0 && rrbo_3.id_class(n)) {
            String string2 = rrbb_3.id_byte(n);
            String string3 = rrdZ.id_throws(n, string);
            String string4 = String.format("OpenGL error: %s (%s)%s, at: %s", n, string2, string3, string);
            rrdJ.id_class(string4);
            if (rrbb_3.rT() && rrzQ_2.id_class("ShowGlErrorShaders", 10000L)) {
                String string5 = jI_2.id_class("of.message.openglError", n, string2);
                rrdZ.id_volatile(string5);
            }
        }
        return n;
    }

    public static void G() {
        if (id_volatile) {
            rrdZ.id_catch("endBlockEntities");
            rrdZ.id_break((ryO_2)null);
            rrdZ.id_class(m ? Bj : Bf);
            rrdA.id_class(SZ.id_this());
        }
    }

    public static void O() {
        rrdZ.id_class(Bj);
        rrdZ.id_class(rrdX.NONE);
    }

    public static int id_extends(int n) {
        rrdZ.En[rrdZ.EC * 2] = En[EC * 2] & 0xFFFF | n << 16;
        return n;
    }

    public static boolean id_extends() {
        if (!SR.id_catch()) {
            return SR.id_private();
        }
        return !sx.id_catch() ? sx.id_private() : true;
    }

    public static boolean id_extends(String string) {
        rrdG rrdG2;
        if (string == null) {
            return false;
        }
        if (string.length() <= 0) {
            return false;
        }
        int n = string.lastIndexOf("/");
        if (n >= 0) {
            string = string.substring(n + 1);
        }
        return (rrdG2 = rrdZ.id_native(string)) != null;
    }

    public static void id_goto() {
        rrdJ.id_byte("Reset model renderers");
        ++id_finally;
        rrdJ.id_byte("Reset world renderers");
        ((yX_2)rrdZ.id_class.id_class[8]).id_throws();
    }

    public static gm_3 K() {
        return GS;
    }

    public static void id_case(int n) {
        GL43.glDisable((int)n);
        if (n == 3553) {
            rrdZ.c();
        } else if (n == 2912) {
            rrdZ.L();
        }
    }

    public static void id_case() {
        rrdZ.id_class(Gr, Ei);
    }

    public static void id_case(Ml_1 ml_1) {
        if ((double)SH != 1.0) {
            ml_1.id_class(1.0f, 1.0f, SH);
        }
    }

    private static boolean id_case(int n, String string) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        ARBShaderObjects.glGetObjectParameterivARB((int)n, (int)35716, (IntBuffer)intBuffer);
        int n2 = intBuffer.get();
        if (n2 > 1) {
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)n2);
            ((Buffer)intBuffer).flip();
            ARBShaderObjects.glGetInfoLogARB((int)n, (IntBuffer)intBuffer, (ByteBuffer)byteBuffer);
            byte[] byArray = new byte[n2];
            byteBuffer.get(byArray);
            if (byArray[n2 - 1] == 0) {
                byArray[n2 - 1] = 10;
            }
            String string2 = new String(byArray, StandardCharsets.US_ASCII);
            string2 = rrzX_2.id_private(string2, " \n\r\t");
            rrdJ.id_byte("Info log: " + string + "\n" + string2);
            return false;
        }
        return true;
    }

    public static int id_case(String string) {
        int n = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
        if (n != 36053) {
            rrdJ.id_class("FramebufferStatus 0x%04X at '%s'", n, string);
        }
        return n;
    }

    public static void id_const() {
        rrdZ.id_catch("beginUpdateChunks1");
        rrdZ.id_case("beginUpdateChunks1");
        if (!id_new) {
            rrdZ.id_class(BY);
        }
        rrdZ.id_catch("beginUpdateChunks2");
        rrdZ.id_case("beginUpdateChunks2");
    }

    public static boolean id_continue() {
        return !sm.id_implements();
    }

    private static String id_continue(int n) {
        switch (n) {
            case 33305: {
                return "Undefined";
            }
            case 36053: {
                return "Complete";
            }
            case 36054: {
                return "Incomplete attachment";
            }
            case 36055: {
                return "Incomplete missing attachment";
            }
            case 36059: {
                return "Incomplete draw buffer";
            }
            case 36060: {
                return "Incomplete read buffer";
            }
            case 36061: {
                return "Unsupported";
            }
            case 36182: {
                return "Incomplete multisample";
            }
            case 36264: {
                return "Incomplete layer targets";
            }
        }
        return "Unknown";
    }

    public static boolean id_else() {
        return sC.id_private();
    }

    public static void id_for() {
        if (id_volatile) {
            rrdZ.id_class(Sr);
            rrdZ.id_class(rrdX.ENTITIES);
        }
    }

    public static int id_implements(String string) {
        int n = rrkG.id_class(string, "colortex", 0, 15);
        if (n >= 0) {
            return n;
        }
        int n2 = rrkG.id_class(string, "colorimg", 0, 15);
        if (n2 >= 0) {
            return n2;
        }
        if (string.equals("gcolor")) {
            return 0;
        }
        if (string.equals("gdepth")) {
            return 1;
        }
        if (string.equals("gnormal")) {
            return 2;
        }
        if (string.equals("composite")) {
            return 3;
        }
        if (string.equals("gaux1")) {
            return 4;
        }
        if (string.equals("gaux2")) {
            return 5;
        }
        if (string.equals("gaux3")) {
            return 6;
        }
        return string.equals("gaux4") ? 7 : -1;
    }

    public static boolean id_implements() {
        if (!SY.id_catch()) {
            return SY.id_private();
        }
        return !sd.id_catch() ? sd.id_private() : true;
    }

    public static void id_implements(int n) {
        GL43.glEnable((int)n);
        rrdZ.F();
    }

    public static void id_import() {
        if (id_new) {
            rrdZ.id_catch("shadow endRender");
        } else {
            if (!id_package) {
                rrdZ.id_float();
            }
            id_volatile = false;
            MT.id_class(true, true, true, true);
            rrdZ.id_class(By);
            rrdZ.id_class(rrdX.NONE);
            HF.id_break();
            rrdZ.id_catch("endRender end");
        }
    }

    public static void id_instanceof() {
        BS = true;
    }

    public static boolean id_new() {
        return !su.id_implements();
    }

    private static rrdG id_new(int n) {
        for (int i = 0; i < SW.length; ++i) {
            rrdG rrdG2 = SW[i];
            if (rrdG2.id_private() != n) continue;
            return rrdG2;
        }
        return By;
    }

    public static boolean id_package() {
        return !sN.id_implements();
    }

    private static String id_package(String string) {
        int n = string.indexOf(95);
        return n < 0 ? string : string.substring(0, n) + string.substring(n).toUpperCase(Locale.ROOT);
    }

    private static FloatBuffer id_package(int n) {
        ByteBuffer byteBuffer = Gz;
        int n2 = byteBuffer.limit();
        ((Buffer)byteBuffer).position(n2).limit(n2 + n * 4);
        return byteBuffer.asFloatBuffer();
    }

    public static boolean id_return() {
        return !sH.id_implements();
    }

    private static rji_3 id_super(int n) {
        rji_3 rji_32 = BC[n];
        if (rji_32 != null) {
            return rji_32;
        }
        if (n == 0) {
            return id_char;
        }
        return n == 1 ? EK : Eo;
    }

    public static boolean id_super() {
        return !sZ.id_implements();
    }

    public static void id_switch() {
        if (id_volatile && SS.id_private() != By.id_private()) {
            rrdZ.id_class(Sr);
            MT.id_protected();
        }
    }

    public static void id_throw() {
        if (id_new) {
            rrdZ.id_catch("shadow clear pre");
            BA.id_class(new rji_3(1.0f, 1.0f, 1.0f, 1.0f));
            rrdZ.id_catch("shadow clear");
        } else {
            rrdZ.id_catch("clear pre");
            rji_3[] rji_3Array = new rji_3[BN];
            for (int i = 0; i < rji_3Array.length; ++i) {
                rji_3Array[i] = rrdZ.id_super(i);
            }
            BL.id_class(Bn, rji_3Array);
            BL.id_finally();
            rrdZ.id_case("clear");
            rrdZ.id_catch("clear");
        }
    }

    public static void id_try() {
        EH = 0;
    }

    public static void id_while() {
        if (id_protected) {
            int n;
            rrdZ.id_catch("Shaders.uninit pre");
            for (n = 0; n < SW.length; ++n) {
                rrdG rrdG2 = SW[n];
                if (rrdG2.id_implements() != 0) {
                    ARBShaderObjects.glDeleteObjectARB((int)rrdG2.id_implements());
                    rrdZ.id_catch("del programRef");
                }
                rrdG2.id_break(0);
                rrdG2.id_class(0);
                rrdG2.id_class((String[])null);
                rrdG2.id_class((rrxY_2)null);
                rrdG2.id_byte(0);
                rrxf_3[] rrxf_3Array = rrdG2.id_goto();
                for (int i = 0; i < rrxf_3Array.length; ++i) {
                    rrxf_3 rrxf_32 = rrxf_3Array[i];
                    if (rrxf_32.id_catch() != 0) {
                        ARBShaderObjects.glDeleteObjectARB((int)rrxf_32.id_catch());
                        rrdZ.id_catch("del programRef");
                    }
                    rrxf_32.id_break(0);
                    rrxf_32.id_class(0);
                }
                rrdG2.id_class(new rrxf_3[0]);
            }
            Ea = false;
            SN = false;
            Sc = false;
            if (BL != null) {
                BL.id_break();
                BL = null;
                rrdZ.id_catch("del dfb");
            }
            if (BA != null) {
                BA.id_break();
                BA = null;
                rrdZ.id_catch("del sfb");
            }
            if (Eu != null) {
                rrdZ.id_class(Eu);
            }
            if (Em != null) {
                rrdZ.id_class(Em);
            }
            if (Gx != null) {
                Gx.id_throws();
                Gx = null;
            }
            for (n = 0; n < si.length; ++n) {
                MT.id_class(si[n], 0, 0, false, 0, 35000, 32856);
            }
            rrdJ.id_byte("Uninit");
            BB = false;
            BJ = false;
            id_protected = false;
            rrdZ.id_catch("Shaders.uninit");
        }
    }

    private static void rs() {
        Object object;
        sJ.id_case();
        sd.id_case();
        sk.id_case();
        sW.id_case();
        sz.id_case();
        sQ.id_case();
        sN.id_case();
        sc.id_case();
        su.id_case();
        sm.id_case();
        sZ.id_case();
        sv.id_case();
        sF.id_case();
        sL.id_case();
        sA.id_case();
        sn.id_case();
        sC.id_case();
        sH.id_case();
        rrxt_3.id_protected();
        rrdP.id_break();
        rrxo_3.id_break();
        GJ = null;
        for (int i = 0; i < SW.length; ++i) {
            object = SW[i];
            ((rrdG)object).id_class();
        }
        Arrays.fill(GX, null);
        if (Ei != null) {
            rrxt_3.id_class(Ei);
            rrdP.id_class(Ei);
            rrxo_3.id_class(Ei);
            String string = sX;
            try {
                object = Ei.id_class(string);
                if (object == null) {
                    return;
                }
                object = rrdT.id_class((InputStream)object, string, true);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load((InputStream)object);
                ((InputStream)object).close();
                sJ.id_class(rrzE_22);
                sd.id_class(rrzE_22);
                sk.id_class(rrzE_22);
                sW.id_class(rrzE_22);
                sz.id_class(rrzE_22);
                sQ.id_class(rrzE_22);
                sN.id_class(rrzE_22);
                sc.id_class(rrzE_22);
                su.id_class(rrzE_22);
                sZ.id_class(rrzE_22);
                sm.id_class(rrzE_22);
                sv.id_class(rrzE_22);
                sF.id_class(rrzE_22);
                sL.id_class(rrzE_22);
                sA.id_class(rrzE_22);
                sn.id_class(rrzE_22);
                sC.id_class(rrzE_22);
                sH.id_class(rrzE_22);
                sh = rrks_1.id_break(rrzE_22, Gr);
                GE = rrdZ.id_class(rrzE_22, rrdM.GBUFFERS);
                GG = rrdZ.id_class(rrzE_22, rrdM.COMPOSITE);
                Gb = rrdZ.id_class(rrzE_22, rrdM.DEFERRED);
                GM = rrdZ.id_class(rrzE_22, rrdM.SHADOWCOMP);
                GO = rrdZ.id_class(rrzE_22, rrdM.PREPARE);
                Gh = rrzE_22.getProperty("texture.noise");
                if (Gh != null) {
                    Gd = true;
                }
                GJ = rrks_1.id_class(rrzE_22);
                rrks_1.id_break(rrzE_22);
                rrks_1.id_byte(rrzE_22);
                rrks_1.id_protected(rrzE_22);
                rrks_1.id_throws(rrzE_22);
                GX = rrks_1.id_class((Properties)rrzE_22, 16);
            }
            catch (IOException iOException) {
                rrbb_3.id_protected("[Shaders] Error reading: " + string);
            }
        }
    }

    public static void id_static() {
        rrdZ.id_class(BA, Bt, false, GM);
    }

    public static void id_public() {
        boolean bl;
        if (!id_byte) {
            id_byte = true;
            bl = true;
        } else {
            bl = false;
        }
        if (!id_protected) {
            int n;
            Object object;
            Object object2;
            int n2;
            rrdZ.id_catch("Shaders.init pre");
            if (rrdZ.y() != null) {
                // empty if block
            }
            if (!rrdZ.id_throws.OpenGL20) {
                rrdZ.id_private("No OpenGL 2.0");
            }
            if (!rrdZ.id_throws.GL_EXT_framebuffer_object) {
                rrdZ.id_private("No EXT_framebuffer_object");
            }
            Eu.id_byte(0).id_protected(8);
            Em.id_byte(0).id_protected(8);
            BN = 4;
            Bc = 1;
            Bu = 0;
            Bm = 0;
            BZ = 1;
            Bv = 1;
            BF = false;
            Arrays.fill(EY, 6408);
            Arrays.fill(Bn, true);
            Arrays.fill(BC, null);
            Arrays.fill(ED, 6408);
            Arrays.fill(Bl, true);
            Arrays.fill(BH, null);
            Arrays.fill(Sv, false);
            Arrays.fill(SF, false);
            Arrays.fill(SL, false);
            Arrays.fill(SA, false);
            Arrays.fill(Sn, false);
            Q = false;
            Gd = false;
            sw = 0.0f;
            sY = 2.0f;
            Bs = 1024;
            BE = 1024;
            BG = 1024;
            Bb = 1024;
            BM = 90.0f;
            BO = 160.0f;
            Bh = true;
            BX = -1.0f;
            st = -1.0f;
            l = false;
            H = false;
            y = false;
            p = false;
            Bx = false;
            Eg = false;
            rrdZ.id_private();
            rrkT.id_break();
            ER.id_class();
            if (GJ != null) {
                GJ.id_break();
            }
            rrkb_1 rrkb_12 = rrdm_1.id_class(sM, Gr, false);
            Object object3 = "";
            if (GS != null && Gs.contains(n2 = rrzc_3.id_class(GS.E()))) {
                object3 = "world" + n2 + "/";
            }
            rrdZ.rs();
            for (n2 = 0; n2 < SW.length; ++n2) {
                rrdG rrdG2 = SW[n2];
                rrdG2.id_break();
                rrdG2.id_byte();
                if (rrdG2.id_case() == rrdM.NONE) continue;
                object2 = rrdG2.id_throws();
                object = (String)object3 + (String)object2;
                boolean bl2 = true;
                if (sh.containsKey(object)) {
                    boolean bl3 = bl2 = bl2 && sh.get(object).id_break();
                }
                if (rrkb_12 != null) {
                    boolean bl4 = bl2 = bl2 && !rrkb_12.id_protected((String)object);
                }
                if (!bl2) {
                    rrdJ.id_byte("Program disabled: " + (String)object);
                    object2 = "<disabled>";
                    object = (String)object3 + (String)object2;
                }
                String string = "/shaders/" + (String)object;
                String string2 = string + ".vsh";
                String string3 = string + ".gsh";
                String string4 = string + ".fsh";
                rrxf_3[] rrxf_3Array = rrdZ.id_break(rrdG2, "/shaders/", (String)object, ".csh");
                rrdG2.id_class(rrxf_3Array);
                rrbb_3.id_class(10L);
                rrdZ.id_class(rrdG2, string2, string3, string4);
                int n3 = rrdG2.id_private();
                if (n3 > 0) {
                    rrdJ.id_byte("Program loaded: " + (String)object);
                }
                rrdZ.id_break(rrdG2);
                rrdZ.id_byte(rrdG2);
                rrdZ.id_protected(rrdG2);
                rrdZ.id_throws(rrdG2);
            }
            Ea = rrdO.id_class(Sb);
            SN = rrdO.id_class(Bt);
            Sc = rrdO.id_class(Bw);
            BZ = BN;
            if (Bm > 0 || Bu > 0) {
                BB = true;
                Bm = Math.max(Bm, 1);
            }
            BJ = BB;
            rrdJ.id_byte("usedColorBuffers: " + BN);
            rrdJ.id_byte("usedDepthBuffers: " + Bc);
            rrdJ.id_byte("usedShadowColorBuffers: " + Bu);
            rrdJ.id_byte("usedShadowDepthBuffers: " + Bm);
            rrdJ.id_byte("usedColorAttachs: " + BZ);
            rrdJ.id_byte("usedDrawBuffers: " + Bv);
            rrdJ.id_byte("bindImageTextures: " + BF);
            n2 = GL43.glGetInteger((int)34852);
            if (Bv > n2) {
                rrdZ.id_private("[Shaders] Error: Not enough draw buffers, needed: " + Bv + ", available: " + n2);
                Bv = n2;
            }
            Eu.id_byte(0).id_protected(Bv);
            for (n = 0; n < Bv; ++n) {
                Eu.id_class(n, 36064 + n);
            }
            Em.id_byte(0).id_protected(Bu);
            for (n = 0; n < Bu; ++n) {
                Em.id_class(n, 36064 + n);
            }
            for (n = 0; n < SW.length; ++n) {
                for (object = object2 = SW[n]; ((rrdG)object).id_private() == 0 && ((rrdG)object).id_catch() != object; object = ((rrdG)object).id_catch()) {
                }
                if (object == object2 || object2 == Bp) continue;
                ((rrdG)object2).id_class((rrdG)object);
            }
            rrdZ.rh();
            rrdZ.rX();
            if (Gd) {
                rrdZ.rM();
            }
            if (SZ == null) {
                SZ = rrdA.id_class();
            }
            Ml_1 ml_1 = new Ml_1();
            ml_1.id_class(rje_3.id_protected.id_byte(-90.0f));
            rrdZ.id_class(ml_1);
            rrdZ.id_break(ml_1);
            id_protected = true;
            rrdZ.rO();
            rrdZ.id_goto();
            if (!bl) {
                // empty if block
            }
            rrdZ.id_catch("Shaders.init");
        }
    }

    public static rrdD id_protected(String string) {
        return rrdm_1.id_class(string, Gr);
    }

    private static void id_protected(an_3 an_32) {
        if (an_32 == null) {
            Br = 0;
            BP = 0;
        } else {
            Br = (int)an_32.rx() / 1000 * 1000;
            BP = (int)an_32.BO() / 1000 * 1000;
        }
    }

    private static rrxa_3 id_protected(int n, String object) {
        if (((String)(object = ((String)object).trim())).indexOf(46) < 0) {
            object = (String)object + ".png";
        }
        try {
            String string = "shaders/" + rrzX_2.id_protected((String)object, "/");
            InputStream inputStream = Ei.id_class(string);
            if (inputStream == null) {
                rrdJ.id_break("Texture not found: " + (String)object);
                return null;
            }
            IOUtils.closeQuietly((InputStream)inputStream);
            rrdl_1 rrdl_12 = new rrdl_1(string);
            rrdl_12.a_(id_class.F());
            return new rrxj_3(n, string, rrdl_12);
        }
        catch (IOException iOException) {
            rrdJ.id_break("Error loading texture: " + (String)object);
            rrdJ.id_break(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    public static void id_protected(Ml_1 ml_1) {
        lD_2 lD_22 = yb_3.id_class().id_byte();
        float f = ((Qw_1)rrdZ.id_class.id_class[20]).id_break * 16;
        double d = (double)f * 0.9238;
        double d2 = (double)f * 0.3826;
        double d3 = -d2;
        double d4 = -d;
        double d5 = 16.0;
        double d6 = -Pa + GS.id_synchronized().id_volatile() + 12.0 - 16.0;
        if (Pa < GS.id_synchronized().id_volatile()) {
            d6 = -4.0;
        }
        MT.id_transient();
        MT.id_class(ml_1.id_byte().id_class());
        lD_22.id_class(7, ju_3.id_super);
        lD_22.id_class(d3, d6, d4).id_class();
        lD_22.id_class(d3, d5, d4).id_class();
        lD_22.id_class(d4, d5, d3).id_class();
        lD_22.id_class(d4, d6, d3).id_class();
        lD_22.id_class(d4, d6, d3).id_class();
        lD_22.id_class(d4, d5, d3).id_class();
        lD_22.id_class(d4, d5, d2).id_class();
        lD_22.id_class(d4, d6, d2).id_class();
        lD_22.id_class(d4, d6, d2).id_class();
        lD_22.id_class(d4, d5, d2).id_class();
        lD_22.id_class(d3, d5, d).id_class();
        lD_22.id_class(d3, d6, d).id_class();
        lD_22.id_class(d3, d6, d).id_class();
        lD_22.id_class(d3, d5, d).id_class();
        lD_22.id_class(d2, d5, d).id_class();
        lD_22.id_class(d2, d6, d).id_class();
        lD_22.id_class(d2, d6, d).id_class();
        lD_22.id_class(d2, d5, d).id_class();
        lD_22.id_class(d, d5, d2).id_class();
        lD_22.id_class(d, d6, d2).id_class();
        lD_22.id_class(d, d6, d2).id_class();
        lD_22.id_class(d, d5, d2).id_class();
        lD_22.id_class(d, d5, d3).id_class();
        lD_22.id_class(d, d6, d3).id_class();
        lD_22.id_class(d, d6, d3).id_class();
        lD_22.id_class(d, d5, d3).id_class();
        lD_22.id_class(d2, d5, d4).id_class();
        lD_22.id_class(d2, d6, d4).id_class();
        lD_22.id_class(d2, d6, d4).id_class();
        lD_22.id_class(d2, d5, d4).id_class();
        lD_22.id_class(d3, d5, d4).id_class();
        lD_22.id_class(d3, d6, d4).id_class();
        lD_22.id_class(d4, d6, d4).id_class();
        lD_22.id_class(d4, d6, d).id_class();
        lD_22.id_class(d, d6, d).id_class();
        lD_22.id_class(d, d6, d4).id_class();
        yb_3.id_class().id_break();
        MT.id_for();
    }

    private static void id_protected(rrdG rrdG2) {
        boolean[] blArray = rrdG2.id_else();
        Boolean[] booleanArray = rrdG2.id_this();
        for (int i = 0; i < booleanArray.length; ++i) {
            Boolean bl = booleanArray[i];
            if (bl == null) continue;
            blArray[i] = bl;
        }
    }

    public static void id_protected(int n) {
        sf = n;
        if (Z) {
            rrdZ.id_class(rK, n);
        }
    }

    private static int id_protected(rrdG rrdG2, String string) {
        Object object;
        InputStream inputStream = Ei.id_class(string);
        if (inputStream == null) {
            return 0;
        }
        int n = ARBShaderObjects.glCreateShaderObjectARB((int)35632);
        if (n == 0) {
            return 0;
        }
        rrdD[] rrdDArray = rrdZ.id_class(Gr);
        ArrayList<String> arrayList = new ArrayList<String>();
        rrWV rrWV2 = new rrWV();
        if (rrWV2 != null) {
            try {
                object = rrWV.id_class(new InputStreamReader(inputStream));
                object = rrks_1.id_class((rrWV)object, string, Ei, 0, arrayList, 0);
                rrdt_1 rrdt_12 = new rrdt_1();
                Iterator<String> iterator = ((rrWV)object).iterator();
                while (iterator.hasNext()) {
                    String string2;
                    rrdg_1 rrdg_12;
                    String string3 = iterator.next();
                    string3 = rrdZ.id_class(string3, rrdDArray);
                    rrWV2.id_class(string3);
                    if (!rrdt_12.id_class(string3) || (rrdg_12 = rrkG.id_class(string3)) == null) continue;
                    if (rrdg_12.id_protected()) {
                        string2 = rrdg_12.id_break();
                        int n2 = rrkG.id_break(string2);
                        if (n2 >= 0) {
                            Bm = Math.max(Bm, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_byte(string2);
                        if (n2 >= 0) {
                            Bu = Math.max(Bu, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_protected(string2);
                        if (n2 >= 0) {
                            Bu = Math.max(Bu, n2 + 1);
                            BF = true;
                            continue;
                        }
                        n2 = rrkG.id_throws(string2);
                        if (n2 >= 0) {
                            Bc = Math.max(Bc, n2 + 1);
                            continue;
                        }
                        if (string2.equals("gdepth") && EY[1] == 6408) {
                            rrdZ.EY[1] = 34836;
                            continue;
                        }
                        n2 = rrkG.id_case(string2);
                        if (n2 >= 0) {
                            BN = Math.max(BN, n2 + 1);
                            continue;
                        }
                        n2 = rrkG.id_catch(string2);
                        if (n2 >= 0) {
                            BN = Math.max(BN, n2 + 1);
                            BF = true;
                            continue;
                        }
                        if (!string2.equals("centerDepthSmooth")) continue;
                        Q = true;
                        continue;
                    }
                    if (!rrdg_12.id_throws("shadowMapResolution") && !rrdg_12.id_protected("SHADOWRES")) {
                        if (!rrdg_12.id_private("shadowMapFov") && !rrdg_12.id_protected("SHADOWFOV")) {
                            if (!rrdg_12.id_private("shadowDistance") && !rrdg_12.id_protected("SHADOWHPL")) {
                                if (rrdg_12.id_private("shadowDistanceRenderMul")) {
                                    BX = rrdg_12.id_int();
                                    rrdJ.id_byte("Shadow distance render mul: " + BX);
                                    continue;
                                }
                                if (rrdg_12.id_private("shadowIntervalSize")) {
                                    sY = rrdg_12.id_int();
                                    rrdJ.id_byte("Shadow map interval size: " + sY);
                                    continue;
                                }
                                if (rrdg_12.id_break("generateShadowMipmap", true)) {
                                    Arrays.fill(SF, true);
                                    rrdJ.id_byte("Generate shadow mipmap");
                                    continue;
                                }
                                if (rrdg_12.id_break("generateShadowColorMipmap", true)) {
                                    Arrays.fill(SA, true);
                                    rrdJ.id_byte("Generate shadow color mipmap");
                                    continue;
                                }
                                if (rrdg_12.id_break("shadowHardwareFiltering", true)) {
                                    Arrays.fill(Sv, true);
                                    rrdJ.id_byte("Hardware shadow filtering enabled.");
                                    continue;
                                }
                                if (rrdg_12.id_break("shadowHardwareFiltering0", true)) {
                                    rrdZ.Sv[0] = true;
                                    rrdJ.id_byte("shadowHardwareFiltering0");
                                    continue;
                                }
                                if (rrdg_12.id_break("shadowHardwareFiltering1", true)) {
                                    rrdZ.Sv[1] = true;
                                    rrdJ.id_byte("shadowHardwareFiltering1");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    rrdZ.SF[0] = true;
                                    rrdJ.id_byte("shadowtex0Mipmap");
                                    continue;
                                }
                                if (rrdg_12.id_break("shadowtex1Mipmap", true)) {
                                    rrdZ.SF[1] = true;
                                    rrdJ.id_byte("shadowtex1Mipmap");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    rrdZ.SA[0] = true;
                                    rrdJ.id_byte("shadowcolor0Mipmap");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    rrdZ.SA[1] = true;
                                    rrdJ.id_byte("shadowcolor1Mipmap");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    rrdZ.SL[0] = true;
                                    rrdJ.id_byte("shadowtex0Nearest");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    rrdZ.SL[1] = true;
                                    rrdJ.id_byte("shadowtex1Nearest");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    rrdZ.Sn[0] = true;
                                    rrdJ.id_byte("shadowcolor0Nearest");
                                    continue;
                                }
                                if (rrdg_12.id_class("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    rrdZ.Sn[1] = true;
                                    rrdJ.id_byte("shadowcolor1Nearest");
                                    continue;
                                }
                                if (!rrdg_12.id_private("wetnessHalflife") && !rrdg_12.id_protected("WETNESSHL")) {
                                    if (!rrdg_12.id_private("drynessHalflife") && !rrdg_12.id_protected("DRYNESSHL")) {
                                        int n3;
                                        int n4;
                                        if (rrdg_12.id_private("eyeBrightnessHalflife")) {
                                            M = rrdg_12.id_int();
                                            rrdJ.id_byte("Eye brightness halflife: " + M);
                                            continue;
                                        }
                                        if (rrdg_12.id_private("centerDepthHalflife")) {
                                            z = rrdg_12.id_int();
                                            rrdJ.id_byte("Center depth halflife: " + z);
                                            continue;
                                        }
                                        if (rrdg_12.id_private("sunPathRotation")) {
                                            sw = rrdg_12.id_int();
                                            rrdJ.id_byte("Sun path rotation: " + sw);
                                            continue;
                                        }
                                        if (rrdg_12.id_private("ambientOcclusionLevel")) {
                                            st = rrbb_3.id_class(rrdg_12.id_int(), 0.0f, 1.0f);
                                            rrdJ.id_byte("AO Level: " + st);
                                            continue;
                                        }
                                        if (rrdg_12.id_throws("superSamplingLevel")) {
                                            int n5 = rrdg_12.id_package();
                                            if (n5 > 1) {
                                                rrdJ.id_byte("Super sampling level: " + n5 + "x");
                                                N = n5;
                                                continue;
                                            }
                                            N = 1;
                                            continue;
                                        }
                                        if (rrdg_12.id_throws("noiseTextureResolution")) {
                                            Gk = rrdg_12.id_package();
                                            Gd = true;
                                            rrdJ.id_byte("Noise texture enabled");
                                            rrdJ.id_byte("Noise texture resolution: " + Gk);
                                            continue;
                                        }
                                        if (rrdg_12.id_case("Format")) {
                                            int n6;
                                            string2 = rrzX_2.id_throws(rrdg_12.id_break(), "Format");
                                            String string4 = rrdg_12.id_byte();
                                            n4 = rrdZ.id_final(string4);
                                            if (n4 == 0) continue;
                                            n3 = rrdZ.id_implements(string2);
                                            if (n3 >= 0) {
                                                rrdZ.EY[n3] = n4;
                                                rrdJ.id_byte("%s format: %s", string2, string4);
                                            }
                                            if ((n6 = rrkG.id_byte(string2)) < 0) continue;
                                            rrdZ.ED[n6] = n4;
                                            rrdJ.id_byte("%s format: %s", string2, string4);
                                            continue;
                                        }
                                        if (rrdg_12.id_class("Clear", false)) {
                                            if (!rrdG2.id_case().id_break()) continue;
                                            string2 = rrzX_2.id_throws(rrdg_12.id_break(), "Clear");
                                            int n7 = rrdZ.id_implements(string2);
                                            if (n7 >= 0) {
                                                rrdZ.Bn[n7] = false;
                                                rrdJ.id_byte("%s clear disabled", string2);
                                            }
                                            if ((n4 = rrkG.id_byte(string2)) < 0) continue;
                                            rrdZ.Bl[n4] = false;
                                            rrdJ.id_byte("%s clear disabled", string2);
                                            continue;
                                        }
                                        if (rrdg_12.id_volatile("ClearColor")) {
                                            if (!rrdG2.id_case().id_break()) continue;
                                            string2 = rrzX_2.id_throws(rrdg_12.id_break(), "ClearColor");
                                            rji_3 rji_32 = rrdg_12.id_super();
                                            if (rji_32 != null) {
                                                n4 = rrdZ.id_implements(string2);
                                                if (n4 >= 0) {
                                                    rrdZ.BC[n4] = rji_32;
                                                    rrdJ.id_byte("%s clear color: %s %s %s %s", string2, Float.valueOf(rji_32.id_class()), Float.valueOf(rji_32.id_break()), Float.valueOf(rji_32.id_byte()), Float.valueOf(rji_32.id_protected()));
                                                }
                                                if ((n3 = rrkG.id_byte(string2)) < 0) continue;
                                                rrdZ.BH[n3] = rji_32;
                                                rrdJ.id_byte("%s clear color: %s %s %s %s", string2, Float.valueOf(rji_32.id_class()), Float.valueOf(rji_32.id_break()), Float.valueOf(rji_32.id_byte()), Float.valueOf(rji_32.id_protected()));
                                                continue;
                                            }
                                            rrdJ.id_break("Invalid color value: " + rrdg_12.id_byte());
                                            continue;
                                        }
                                        if (rrdg_12.id_class("GAUX4FORMAT", "RGBA32F")) {
                                            rrdZ.EY[7] = 34836;
                                            rrdJ.id_byte("gaux4 format : RGB32AF");
                                            continue;
                                        }
                                        if (rrdg_12.id_class("GAUX4FORMAT", "RGB32F")) {
                                            rrdZ.EY[7] = 34837;
                                            rrdJ.id_byte("gaux4 format : RGB32F");
                                            continue;
                                        }
                                        if (rrdg_12.id_class("GAUX4FORMAT", "RGB16")) {
                                            rrdZ.EY[7] = 32852;
                                            rrdJ.id_byte("gaux4 format : RGB16");
                                            continue;
                                        }
                                        if (rrdg_12.id_class("MipmapEnabled", true)) {
                                            int n8;
                                            if (!rrdG2.id_case().id_break() || (n8 = rrdZ.id_implements(string2 = rrzX_2.id_throws(rrdg_12.id_break(), "MipmapEnabled"))) < 0) continue;
                                            n4 = rrdG2.id_volatile();
                                            rrdG2.id_byte(n4 |= 1 << n8);
                                            rrdJ.id_byte("%s mipmap enabled", string2);
                                            continue;
                                        }
                                        if (rrdg_12.id_protected("DRAWBUFFERS")) {
                                            string2 = rrdg_12.id_byte();
                                            String[] stringArray = rrkG.id_private(string2);
                                            if (stringArray != null) {
                                                rrdG2.id_class(stringArray);
                                                continue;
                                            }
                                            rrdJ.id_break("Invalid draw buffers: " + string2);
                                            continue;
                                        }
                                        if (!rrdg_12.id_protected("RENDERTARGETS")) continue;
                                        string2 = rrdg_12.id_byte();
                                        String[] stringArray = rrkG.id_implements(string2);
                                        if (stringArray != null) {
                                            rrdG2.id_class(stringArray);
                                            continue;
                                        }
                                        rrdJ.id_break("Invalid render targets: " + string2);
                                        continue;
                                    }
                                    b = rrdg_12.id_int();
                                    rrdJ.id_byte("Dryness halflife: " + b);
                                    continue;
                                }
                                G = rrdg_12.id_int();
                                rrdJ.id_byte("Wetness halflife: " + G);
                                continue;
                            }
                            BO = rrdg_12.id_int();
                            Bh = true;
                            rrdJ.id_byte("Shadow map distance: " + BO);
                            continue;
                        }
                        BM = rrdg_12.id_int();
                        Bh = false;
                        rrdJ.id_byte("Shadow map field of view: " + BM);
                        continue;
                    }
                    BG = Bb = rrdg_12.id_package();
                    Bs = BE = Math.round((float)BG * Sp);
                    rrdJ.id_byte("Shadow map resolution: " + BG);
                }
            }
            catch (Exception exception) {
                rrdJ.id_class("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n);
                return 0;
            }
        }
        object = rrWV2.toString();
        if (sy) {
            rrdZ.id_class(string, (String)object);
        }
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)object);
        ARBShaderObjects.glCompileShaderARB((int)n);
        if (GL43.glGetShaderi((int)n, (int)35713) != 1) {
            rrdJ.id_class("Error compiling fragment shader: " + string);
        }
        rrdZ.id_class(n, string, arrayList);
        return n;
    }

    public static rrxi_3 id_protected() {
        return Ei;
    }

    public static void id_private() {
        if (rrdZ.id_extends()) {
            sp = 0.5f;
            sq = 0.6f;
            sT = 0.8f;
        } else {
            sp = 1.0f;
            sq = 1.0f;
            sT = 1.0f;
        }
    }

    public static void id_private(int n) {
        GL43.glDisable((int)n);
        rrdZ.c();
    }

    public static void id_private(String string) {
        rrdJ.id_class(string);
        ((cq_3)rrdZ.id_class.id_class[19]).id_throws().id_class(new rgN_2(string));
    }

    public static void id_abstract() {
        GL43.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        rrdZ.rW();
        int n = Sz.id_final();
        if (n > 1) {
            for (int i = 1; i < n; ++i) {
                PR.id_break(i);
                rrdZ.rW();
            }
            PR.id_break(0);
        }
    }

    private static ByteBuffer id_final(int n) {
        ByteBuffer byteBuffer = Gz;
        int n2 = byteBuffer.limit();
        ((Buffer)byteBuffer).position(n2).limit(n2 + n);
        return byteBuffer.slice();
    }

    private static int id_final(String string) {
        string = string.trim();
        for (int i = 0; i < GQ.length; ++i) {
            String string2 = GQ[i];
            if (!string.equals(string2)) continue;
            return GN[i];
        }
        return 0;
    }

    public static boolean id_final() {
        return !sQ.id_implements();
    }

    public static void id_transient() {
        rrdZ.L();
        rrdZ.H();
        rrdZ.id_class(m ? Bj : Bf);
        rrdZ.id_class(rrdX.NONE);
    }

    public static boolean id_volatile() {
        return !sz.id_implements();
    }

    private static void id_volatile(String string) {
        ((cq_3)rrdZ.id_class.id_class[19]).id_throws().id_class(new rgN_2(string));
    }

    public static void id_volatile(int n) {
        rrdZ.En[++rrdZ.EC * 2] = n & 0xFFFF;
        rrdZ.En[rrdZ.EC * 2 + 1] = 0;
    }

    public static boolean id_synchronized() {
        return sl.id_private();
    }

    public static int id_native(int n) {
        rrdZ.En[rrdZ.EC * 2 + 1] = En[EC * 2 + 1] & 0xFFFF0000 | n & 0xFFFF;
        return n;
    }

    public static boolean id_native() {
        return !sW.id_implements();
    }

    public static rrdG id_native(String string) {
        return EU.id_protected(string);
    }

    public static void id_strictfp() {
        rrdZ.id_catch("endUpdateChunks1");
        rrdZ.id_case("endUpdateChunks1");
        if (!id_new) {
            rrdZ.id_class(BY);
        }
        rrdZ.id_catch("endUpdateChunks2");
        rrdZ.id_case("endUpdateChunks2");
    }

    public static void E() {
        if (id_volatile) {
            rrdZ.id_catch("beginBlockEntities");
            rrdZ.id_class(Be);
            rrdZ.id_class(rrdX.BLOCK_ENTITIES);
        }
    }

    public static void A() {
        m = true;
        if (Sz == Bf) {
            rrdZ.id_class(Bj);
        }
    }

    public static boolean T() {
        return id_else;
    }

    public static void X() {
        if (!id_new) {
            MT.id_volatile();
            MT.id_package();
            MT.id_break(770, 771);
            MT.id_throws();
            rrdZ.id_class(SE);
            rrdZ.id_class(rrdX.RAIN_SNOW);
        }
    }

    public static void Q() {
    }

    public static boolean rr() {
        return sr;
    }

    private static void rc() {
        GB = new HashMap<String, String>();
        if (sr) {
            ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
            String string = "/shaders/lang/";
            String string2 = "en_us";
            String string3 = ".lang";
            arrayList.add((CallSite)((Object)(string + string2 + string3)));
            arrayList.add((CallSite)((Object)(string + rrdZ.id_package(string2) + string3)));
            if (!rrbb_3.rE().rG.equals(string2)) {
                String string4 = rrbb_3.rE().rG;
                arrayList.add((CallSite)((Object)(string + (String)string4 + string3)));
                arrayList.add((CallSite)((Object)(string + rrdZ.id_package(string4) + string3)));
            }
            try {
                for (String string5 : arrayList) {
                    InputStream inputStream = Ei.id_class(string5);
                    if (inputStream == null) continue;
                    rrzE_2 rrzE_22 = new rrzE_2();
                    rrba_3.id_class(inputStream, rrzE_22);
                    inputStream.close();
                    for (String string6 : ((Properties)rrzE_22).keySet()) {
                        String string7 = rrzE_22.getProperty(string6);
                        GB.put(string6, string7);
                    }
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static void rO() {
        Object object;
        EA = new IdentityHashMap<xd_3, Integer>(300);
        if (EA.isEmpty()) {
            for (rqO_2 object2 : rVL.id_strictfp.id_protected()) {
                object = rVL.id_strictfp.id_class(object2);
                int n = rVL.id_strictfp.id_class((xd_3)object);
                EA.put((xd_3)object, n);
            }
        }
        Object object3 = null;
        try {
            object3 = new BufferedReader(new InputStreamReader(Ei.id_class("/mc_Entity_x.txt")));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (object3 != null) {
            try {
                String string;
                while ((string = ((BufferedReader)object3).readLine()) != null) {
                    object = Gc.matcher(string);
                    if (((Matcher)object).matches()) {
                        String string2 = ((Matcher)object).group(1);
                        String string3 = ((Matcher)object).group(2);
                        int n = Integer.parseInt(string3);
                        rqO_2 rqO_22 = new rqO_2(string2);
                        if (rVL.id_strictfp.id_byte(rqO_22)) {
                            xd_3 xd_32 = rVL.id_strictfp.id_class(rqO_22);
                            EA.put(xd_32, n);
                            continue;
                        }
                        rrdJ.id_break("Unknown block name %s", string2);
                        continue;
                    }
                    rrdJ.id_break("unmatched %s\n", string);
                }
            }
            catch (Exception exception) {
                rrdJ.id_break("Error parsing mc_Entity_x.txt");
            }
        }
        if (object3 != null) {
            try {
                ((BufferedReader)object3).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static void rQ() {
        if (!id_new) {
            rrdZ.id_class(Sb, false, Gb);
        }
    }

    private static void rJ() {
        if (BL != null) {
            BL.id_break();
        }
        boolean[] blArray = rrki_1.id_class(Bc, true);
        boolean[] blArray2 = new boolean[Bc];
        boolean[] blArray3 = new boolean[BN];
        int[] nArray = (int[])(BF ? si : null);
        BL = new rrdF("dfb", id_extends, id_native, BN, Bc, 8, blArray, blArray2, blArray3, GX, EY, sD, sU, nArray, Eu);
        BL.id_class();
    }

    private static void rM() {
        if (Gx == null && Gh != null) {
            Gx = rrdZ.id_class(15, Gh);
        }
        if (Gx == null) {
            Gx = new rrxe_3(Gk, Gk);
        }
    }

    private static void rB() {
        Gs.clear();
        for (int i = -128; i <= 128; ++i) {
            String string = "/shaders/world" + i;
            if (!Ei.id_break(string)) continue;
            Gs.add(i);
        }
        if (Gs.size() > 0) {
            Integer[] integerArray = Gs.toArray(new Integer[Gs.size()]);
            rrbb_3.id_byte("[Shaders] Worlds: " + rrbb_3.id_class((Object[])integerArray));
        }
    }

    private static rrdD[] rG() {
        try {
            String[] stringArray = EU.id_byte();
            Properties properties = rrdZ.id_class(Ei);
            rrdD[] rrdDArray = rrks_1.id_class(Ei, stringArray, Gs);
            for (int i = 0; i < rrdDArray.length; ++i) {
                rrdD rrdD2 = rrdDArray[i];
                String string = properties.getProperty(rrdD2.id_class());
                if (string == null) continue;
                rrdD2.id_case();
                if (rrdD2.id_break(string)) continue;
                rrbb_3.id_protected("[Shaders] Invalid value, option: " + rrdD2.id_class() + ", value: " + string);
            }
            return rrdDArray;
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("[Shaders] Error reading configuration for " + Ei.id_class());
            iOException.printStackTrace();
            return null;
        }
    }

    private static void rk() {
        GL43.glGetFloatv((int)2983, (FloatBuffer)((FloatBuffer)((Buffer)Ex).position(0)));
        rrdx_1.id_class((FloatBuffer)((Buffer)Ed).position(0), (FloatBuffer)((Buffer)Ex).position(0), EG, EE);
        ((Buffer)Ex).position(0);
        ((Buffer)Ed).position(0);
    }

    private static void rX() {
        BS = false;
        Bs = Math.round((float)BG * Sp);
        BE = Math.round((float)Bb * Sp);
        rrdZ.rx();
    }

    private static void rE() {
        rrdZ.id_byte(GE);
        rrdZ.id_byte(GG);
        rrdZ.id_byte(Gb);
        rrdZ.id_byte(GM);
        rrdZ.id_byte(GO);
        GE = null;
        GG = null;
        Gb = null;
        GM = null;
        GO = null;
    }

    public static void rP() {
        rrxn_3.id_break();
    }

    private static void rz() {
        if (!id_new) {
            rrdZ.id_class(SJ, true, GG);
        }
    }

    private static void rW() {
        if (!rrdZ.e()) {
            GL43.glBegin((int)5);
            GL43.glTexCoord2f((float)0.0f, (float)0.0f);
            GL43.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
            GL43.glTexCoord2f((float)1.0f, (float)0.0f);
            GL43.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
            GL43.glTexCoord2f((float)0.0f, (float)1.0f);
            GL43.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL43.glTexCoord2f((float)1.0f, (float)1.0f);
            GL43.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
            GL43.glEnd();
        } else {
            GL43.glBegin((int)7);
            GL43.glTexCoord2f((float)0.0f, (float)0.0f);
            GL43.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
            GL43.glTexCoord2f((float)1.0f, (float)0.0f);
            GL43.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
            GL43.glTexCoord2f((float)1.0f, (float)1.0f);
            GL43.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
            GL43.glTexCoord2f((float)0.0f, (float)1.0f);
            GL43.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL43.glEnd();
        }
    }

    private static void rN() {
        rrdZ.id_class(BL, Sd.id_goto());
        id_int = false;
        id_class.B().id_class(true);
        MT.id_class(Vl_1.id_class, Vl_1.id_byte, 3553, id_class.B().id_case(), 0);
        GL43.glViewport((int)0, (int)0, (int)id_class.id_else().id_extends(), (int)id_class.id_else().id_native());
        MT.id_class(true);
        GL43.glClearColor((float)id_char.id_class(), (float)id_char.id_break(), (float)id_char.id_byte(), (float)1.0f);
        GL43.glClear((int)16640);
        GL43.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        MT.id_import();
        MT.id_protected();
        MT.id_final();
        MT.id_volatile();
        MT.id_break(519);
        MT.id_class(false);
        rrdZ.id_catch("pre-final");
        rrdZ.id_class(Sd);
        rrdZ.id_catch("id_final");
        if (Sd.id_return()) {
            BL.id_throws(Sd.id_volatile());
        }
        rrdZ.id_abstract();
        rrdZ.id_catch("renderCompositeFinal");
    }

    private static void rx() {
        if (BB) {
            id_new = true;
            if (BA != null) {
                BA.id_break();
            }
            rrWz_1[] rrWz_1Array = new rrWz_1[2];
            int[] nArray = (int[])(BF ? Er : null);
            BA = new rrdF("sfb", Bs, BE, Bu, Bm, 8, SL, Sv, Sn, rrWz_1Array, ED, se, sa, nArray, Em);
            BA.id_class();
            id_new = false;
        }
    }

    private static void rS() {
        sx.id_case();
        sl.id_case();
        if (Ei != null) {
            String string = sX;
            try {
                InputStream inputStream = Ei.id_class(string);
                if (inputStream == null) {
                    return;
                }
                inputStream = rrdT.id_class(inputStream, string, false);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                sx.id_class(rrzE_22);
                sl.id_class(rrzE_22);
                GP = rrks_1.id_byte(rrzE_22, Gr);
                sM = rrks_1.id_class((Properties)rrzE_22, Gr);
                sO = rrks_1.id_class(rrzE_22, sM, Gr);
            }
            catch (IOException iOException) {
                rrbb_3.id_protected("[Shaders] Error reading: " + string);
            }
        }
    }

    public static void Y() {
        if (id_volatile) {
            rrdZ.id_class(Ba);
        }
    }
}

