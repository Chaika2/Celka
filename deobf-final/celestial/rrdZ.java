package celestial;

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
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.KHRDebug;

public class rrdZ {
   static QY class_;
   static Hh_1 break_;
   public static boolean byte_ = false;
   public static boolean protected_ = false;
   public static GLCapabilities throws_;
   public static String case_;
   public static String catch_;
   public static String private_;
   public static boolean implements_ = false;
   public static int finally_ = 0;
   private static int El = 0;
   private static int EH = 0;
   public static int extends_ = 0;
   public static int native_ = 0;
   public static boolean volatile_ = false;
   public static boolean final_ = false;
   public static boolean package_ = false;
   public static boolean int_ = false;
   public static boolean new_ = false;
   public static boolean continue_ = false;
   public static boolean super_;
   private static boolean Ey;
   private static boolean Ep;
   private static boolean Eq;
   private static boolean ET;
   private static boolean Et;
   public static boolean this_ = false;
   public static boolean else_ = false;
   public static boolean synchronized_ = false;
   static float[] return_ = new float[4];
   static float[] public_ = new float[4];
   static float[] goto_ = new float[4];
   static float[] while_ = new float[4];
   static float[] try_ = new float[4];
   static float[] instanceof_ = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static float[] throw_ = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static float[] interface_ = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   private static float[] Ew = new float[16];
   static rji_3 char_ = new rji_3();
   static float abstract_;
   static float long_;
   static float float_;
   static long void_ = 0L;
   static long static_ = 0L;
   static long import_ = 0L;
   static float short_ = 0.0F;
   static float default_ = 0.0F;
   static float const_ = 0.0F;
   static int strictfp_ = 0;
   static long boolean_ = 0L;
   static long transient_ = 0L;
   static long for_ = 0L;
   static int double_ = 0;
   static float switch_ = 0.0F;
   static float r = 0.0F;
   static int P = 0;
   public static VZ B = VZ.FIRST_PERSON;
   public static boolean S = false;
   static float s = 0.0F;
   static float E = 0.0F;
   public static float G = 600.0F;
   public static float b = 200.0F;
   public static float M = 10.0F;
   static boolean O = false;
   static int h = 0;
   static int X = 0;
   static float J = 0.0F;
   static float x = 0.0F;
   static float d = 0.0F;
   static float k = 0.0F;
   static float W = 0.0F;
   static float z = 1.0F;
   static boolean Q = false;
   static int N = 1;
   static float c = 0.0F;
   static float u = 0.0F;
   static boolean m = false;
   static boolean Z = true;
   static rrdX v = rrdX.NONE;
   private static int EI = 11;
   public static int F = EI + 0;
   public static int L = EI + 1;
   public static int A = EI + 2;
   public static int n = EI + 3;
   public static int C = EI + 4;
   public static boolean l = false;
   public static boolean H = false;
   public static boolean y = false;
   public static boolean p = false;
   public static boolean q = false;
   public static boolean T = false;
   public static boolean t = false;
   public static boolean w = false;
   public static boolean I = false;
   public static boolean f = false;
   private static boolean Ef = false;
   private static boolean Ej = false;
   private static int EV = 3;
   private static boolean Eg = false;
   public static int j = 0;
   public static int V = 0;
   private static rrkq_1 ER = new rrkq_1();
   public static rrkl_1 g = ER.case_("entityColor");
   public static rrkL R = ER.class_("entityId");
   public static rrkL Y = ER.class_("blockEntityId");
   public static rrkL o = ER.class_("texture");
   public static rrkL K = ER.class_("lightmap");
   public static rrkL D = ER.class_("normals");
   public static rrkL U = ER.class_("specular");
   public static rrkL e = ER.class_("shadow");
   public static rrkL a = ER.class_("watershadow");
   public static rrkL i = ER.class_("shadowtex0");
   public static rrkL rr = ER.class_("shadowtex1");
   public static rrkL rP = ER.class_("depthtex0");
   public static rrkL rB = ER.class_("depthtex1");
   public static rrkL rS = ER.class_("shadowcolor");
   public static rrkL rs = ER.class_("shadowcolor0");
   public static rrkL rE = ER.class_("shadowcolor1");
   public static rrkL rG = ER.class_("noisetex");
   public static rrkL rb = ER.class_("gcolor");
   public static rrkL rM = ER.class_("gdepth");
   public static rrkL rO = ER.class_("gnormal");
   public static rrkL rh = ER.class_("composite");
   public static rrkL rX = ER.class_("gaux1");
   public static rrkL rJ = ER.class_("gaux2");
   public static rrkL rx = ER.class_("gaux3");
   public static rrkL rd = ER.class_("gaux4");
   public static rrkL rk = ER.class_("colortex0");
   public static rrkL rW = ER.class_("colortex1");
   public static rrkL rz = ER.class_("colortex2");
   public static rrkL rQ = ER.class_("colortex3");
   public static rrkL rN = ER.class_("colortex4");
   public static rrkL rc = ER.class_("colortex5");
   public static rrkL ru = ER.class_("colortex6");
   public static rrkL rm = ER.class_("colortex7");
   public static rrkL rZ = ER.class_("gdepthtex");
   public static rrkL rv = ER.class_("depthtex2");
   public static rrkL rF = ER.class_("colortex8");
   public static rrkL rL = ER.class_("colortex9");
   public static rrkL rA = ER.class_("colortex10");
   public static rrkL rn = ER.class_("colortex11");
   public static rrkL rC = ER.class_("colortex12");
   public static rrkL rl = ER.class_("colortex13");
   public static rrkL rH = ER.class_("colortex14");
   public static rrkL ry = ER.class_("colortex15");
   public static rrkL rp = ER.class_("colorimg0");
   public static rrkL rq = ER.class_("colorimg1");
   public static rrkL rT = ER.class_("colorimg2");
   public static rrkL rt = ER.class_("colorimg3");
   public static rrkL rw = ER.class_("colorimg4");
   public static rrkL rI = ER.class_("colorimg5");
   public static rrkL rf = ER.class_("shadowcolorimg0");
   public static rrkL rj = ER.class_("shadowcolorimg1");
   public static rrkL rV = ER.class_("tex");
   public static rrkL rg = ER.class_("heldItemId");
   public static rrkL rR = ER.class_("heldBlockLightValue");
   public static rrkL rY = ER.class_("heldItemId2");
   public static rrkL ro = ER.class_("heldBlockLightValue2");
   public static rrkL rK = ER.class_("fogMode");
   public static rrkF rD = ER.protected_("fogDensity");
   public static rrkC rU = ER.throws_("fogColor");
   public static rrkC re = ER.throws_("skyColor");
   public static rrkL ra = ER.class_("worldTime");
   public static rrkL ri = ER.class_("worldDay");
   public static rrkL Pr = ER.class_("moonPhase");
   public static rrkL PP = ER.class_("frameCounter");
   public static rrkF PB = ER.protected_("frameTime");
   public static rrkF PS = ER.protected_("frameTimeCounter");
   public static rrkF Ps = ER.protected_("sunAngle");
   public static rrkF PE = ER.protected_("shadowAngle");
   public static rrkF PG = ER.protected_("rainStrength");
   public static rrkF Pb = ER.protected_("aspectRatio");
   public static rrkF PM = ER.protected_("viewWidth");
   public static rrkF PO = ER.protected_("viewHeight");
   public static rrkF Ph = ER.protected_("near");
   public static rrkF PX = ER.protected_("far");
   public static rrkC PJ = ER.throws_("sunPosition");
   public static rrkC Px = ER.throws_("moonPosition");
   public static rrkC Pd = ER.throws_("shadowLightPosition");
   public static rrkC Pk = ER.throws_("upPosition");
   public static rrkC PW = ER.throws_("previousCameraPosition");
   public static rrkC Pz = ER.throws_("cameraPosition");
   public static rrkp_1 PQ = ER.catch_("gbufferModelView");
   public static rrkp_1 PN = ER.catch_("gbufferModelViewInverse");
   public static rrkp_1 Pc = ER.catch_("gbufferPreviousProjection");
   public static rrkp_1 Pu = ER.catch_("gbufferProjection");
   public static rrkp_1 Pm = ER.catch_("gbufferProjectionInverse");
   public static rrkp_1 PZ = ER.catch_("gbufferPreviousModelView");
   public static rrkp_1 Pv = ER.catch_("shadowProjection");
   public static rrkp_1 PF = ER.catch_("shadowProjectionInverse");
   public static rrkp_1 PL = ER.catch_("shadowModelView");
   public static rrkp_1 PA = ER.catch_("shadowModelViewInverse");
   public static rrkF Pn = ER.protected_("wetness");
   public static rrkF PC = ER.protected_("eyeAltitude");
   public static rrkn_1 Pl = ER.break_("eyeBrightness");
   public static rrkn_1 PH = ER.break_("eyeBrightnessSmooth");
   public static rrkn_1 Py = ER.break_("terrainTextureSize");
   public static rrkL Pp = ER.class_("terrainIconSize");
   public static rrkL Pq = ER.class_("isEyeInWater");
   public static rrkF PT = ER.protected_("nightVision");
   public static rrkF Pt = ER.protected_("blindness");
   public static rrkF Pw = ER.protected_("screenBrightness");
   public static rrkL PI = ER.class_("hideGUI");
   public static rrkF Pf = ER.protected_("centerDepthSmooth");
   public static rrkn_1 Pj = ER.break_("atlasSize");
   public static rrkl_1 PV = ER.case_("spriteBounds");
   public static rrkH Pg = ER.byte_("blendFunc");
   public static rrkL PR = ER.class_("instanceId");
   public static rrkF PY = ER.protected_("playerMood");
   public static rrkL Po = ER.class_("renderStage");
   static double PK;
   static double PD;
   static double PU;
   static double Pe;
   static double Pa;
   static double Pi;
   static int Br;
   static int BP;
   static boolean BB = false;
   public static boolean BS = false;
   static int Bs = 1024;
   static int BE = 1024;
   static int BG = 1024;
   static int Bb = 1024;
   static float BM = 90.0F;
   static float BO = 160.0F;
   static boolean Bh = true;
   static float BX = -1.0F;
   public static boolean BJ = false;
   static boolean Bx = false;
   public static final int Bd = 8;
   public static final int Bk = 16;
   public static final int BW = 3;
   public static final int Bz = 2;
   public static final int BQ = 2;
   static int BN = 0;
   static int Bc = 0;
   static int Bu = 0;
   static int Bm = 0;
   static int BZ = 0;
   static int Bv = 0;
   static boolean BF = false;
   static rrdF BL;
   static rrdF BA;
   private static int[] EY = new int[16];
   public static boolean[] Bn = new boolean[16];
   public static rji_3[] BC = new rji_3[16];
   private static final rji_3 Eo = new rji_3(0.0F, 0.0F, 0.0F, 0.0F);
   private static final rji_3 EK = new rji_3(1.0F, 1.0F, 1.0F, 1.0F);
   private static int[] ED = new int[2];
   public static boolean[] Bl = new boolean[2];
   public static rji_3[] BH = new rji_3[2];
   private static rrdh_1 EU = new rrdh_1();
   public static final rrdG By = EU.class_();
   public static final rrdG Bp = EU.break_("shadow", By);
   public static final rrdG Bq = EU.break_("shadow_solid", Bp);
   public static final rrdG BT = EU.break_("shadow_cutout", Bp);
   public static final rrdG[] Bt = EU.break_("shadowcomp", 16);
   public static final rrdG[] Bw = EU.byte_("prepare", 16);
   public static final rrdG BI = EU.class_("gbuffers_basic", By);
   public static final rrdG Bf = EU.class_("gbuffers_textured", BI);
   public static final rrdG Bj = EU.class_("gbuffers_textured_lit", Bf);
   public static final rrdG BV = EU.class_("gbuffers_skybasic", BI);
   public static final rrdG Bg = EU.class_("gbuffers_skytextured", Bf);
   public static final rrdG BR = EU.class_("gbuffers_clouds", Bf);
   public static final rrdG BY = EU.class_("gbuffers_terrain", Bj);
   public static final rrdG Bo = EU.class_("gbuffers_terrain_solid", BY);
   public static final rrdG BK = EU.class_("gbuffers_terrain_cutout_mip", BY);
   public static final rrdG BD = EU.class_("gbuffers_terrain_cutout", BY);
   public static final rrdG BU = EU.class_("gbuffers_damagedblock", BY);
   public static final rrdG Be = EU.class_("gbuffers_block", BY);
   public static final rrdG Ba = EU.class_("gbuffers_beaconbeam", Bf);
   public static final rrdG Bi = EU.class_("gbuffers_item", Bj);
   public static final rrdG Sr = EU.class_("gbuffers_entities", Bj);
   public static final rrdG SP = EU.class_("gbuffers_entities_glowing", Sr);
   public static final rrdG SB = EU.class_("gbuffers_armor_glint", Bf);
   public static final rrdG SS = EU.class_("gbuffers_spidereyes", Bf);
   public static final rrdG Ss = EU.class_("gbuffers_hand", Bj);
   public static final rrdG SE = EU.class_("gbuffers_weather", Bj);
   public static final rrdG SG = EU.byte_("deferred_pre");
   public static final rrdG[] Sb = EU.protected_("deferred", 16);
   public static final rrdG SM = Sb[0];
   public static final rrdG SO = EU.class_("gbuffers_water", BY);
   public static final rrdG Sh = EU.class_("gbuffers_hand_water", Ss);
   public static final rrdG SX = EU.byte_("composite_pre");
   public static final rrdG[] SJ = EU.class_("composite", 16);
   public static final rrdG Sx = SJ[0];
   public static final rrdG Sd = EU.class_("id_final");
   public static final int Sk = EU.break_();
   public static final rrdG[] SW = EU.protected_();
   public static rrdG Sz = By;
   public static int SQ = 0;
   private static rrdb_1 Ee = new rrdb_1();
   private static boolean Ea = false;
   public static boolean SN = false;
   public static boolean Sc = false;
   public static Properties Su = null;
   public static Properties Sm = null;
   public static ff_3 SZ = null;
   public static boolean[] Sv = new boolean[2];
   public static boolean[] SF = new boolean[2];
   public static boolean[] SL = new boolean[2];
   public static boolean[] SA = new boolean[2];
   public static boolean[] Sn = new boolean[2];
   public static boolean SC = false;
   public static boolean Sl = false;
   public static float SH = 0.125F;
   public static float Sy = 1.0F;
   public static float Sp = 1.0F;
   public static int Sq = 0;
   public static int ST = 0;
   public static int St = 0;
   public static int Sw = 0;
   public static int SI = 0;
   public static int Sf = 0;
   public static boolean Sj = true;
   public static boolean SV = true;
   public static boolean Sg = true;
   public static rrdf_1 SR = new rrdf_1("oldLighting", "Classic Lighting", 0);
   public static rrdf_1 SY = new rrdf_1("oldHandLight", "Old Hand Light", 0);
   public static int So = 0;
   public static final int SK = 3;
   public static final int SD = 2;
   public static final String[] SU = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
   public static final String[] Se = new String[]{"Nearest", "Linear"};
   public static final int[] Sa = new int[]{9728, 9984, 9986};
   public static final int[] Si = new int[]{9728, 9729};
   private static rrxi_3 Ei = null;
   public static boolean sr = false;
   public static String sP;
   public static final String sB = "OFF";
   public static final String sS = "(internal)";
   public static final String ss = "shaderpacks";
   public static final String sE = "optionsshaders.txt";
   public static final File sG = new File((File)QY.instanceof_().class_[24], "shaderpacks");
   static File sb = new File((File)QY.instanceof_().class_[24], "optionsshaders.txt");
   private static rrdD[] Gr = null;
   private static Set<String> GP = null;
   static rrkb_1[] sM = null;
   static Map<String, rrdV> sO = null;
   static Map<String, rrXw_1> sh = new HashMap<>();
   public static final String sX = "/shaders/shaders.properties";
   public static rrdI sJ = new rrdI("clouds", "Clouds", 0);
   public static rrdf_1 sx = new rrdf_1("oldLighting", "Classic Lighting", 0);
   public static rrdf_1 sd = new rrdf_1("oldHandLight", "Old Hand Light", 0);
   public static rrdf_1 sk = new rrdf_1("dynamicHandLight", "Dynamic Hand Light", 0);
   public static rrdf_1 sW = new rrdf_1("shadowTerrain", "Shadow Terrain", 0);
   public static rrdf_1 sz = new rrdf_1("shadowTranslucent", "Shadow Translucent", 0);
   public static rrdf_1 sQ = new rrdf_1("shadowEntities", "Shadow Entities", 0);
   public static rrdf_1 sN = new rrdf_1("shadowBlockEntities", "Shadow Block Entities", 0);
   public static rrdf_1 sc = new rrdf_1("underwaterOverlay", "Underwater Overlay", 0);
   public static rrdf_1 su = new rrdf_1("sun", "Sun", 0);
   public static rrdf_1 sm = new rrdf_1("moon", "Moon", 0);
   public static rrdf_1 sZ = new rrdf_1("vignette", "Vignette", 0);
   public static rrdf_1 sv = new rrdf_1("backFace.solid", "Back-face Solid", 0);
   public static rrdf_1 sF = new rrdf_1("backFace.cutout", "Back-face Cutout", 0);
   public static rrdf_1 sL = new rrdf_1("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
   public static rrdf_1 sA = new rrdf_1("backFace.translucent", "Back-face Translucent", 0);
   public static rrdf_1 sn = new rrdf_1("rain.depth", "Rain Depth", 0);
   public static rrdf_1 sC = new rrdf_1("beacon.beam.depth", "Rain Depth", 0);
   public static rrdf_1 sl = new rrdf_1("separateAo", "Separate AO", 0);
   public static rrdf_1 sH = new rrdf_1("frustum.culling", "Frustum Culling", 0);
   private static Map<String, String> GB = new HashMap<>();
   private static gm_3 GS = null;
   private static List<Integer> Gs = new ArrayList<>();
   private static rrxa_3[] GE = null;
   private static rrxa_3[] GG = null;
   private static rrxa_3[] Gb = null;
   private static rrxa_3[] GM = null;
   private static rrxa_3[] GO = null;
   private static String Gh = null;
   private static rrWz_1[] GX = new rrWz_1[16];
   private static rrkQ GJ = null;
   public static final boolean sy = System.getProperty("shaders.debug.save", "false").equals("true");
   public static float sp = 0.5F;
   public static float sq = 0.6F;
   public static float sT = 0.8F;
   public static float st = -1.0F;
   public static float sw = 0.0F;
   public static float sI = 0.0F;
   public static int sf = 0;
   public static float sj = 0.0F;
   public static float sV;
   public static float sg;
   public static float sR;
   public static float sY = 2.0F;
   public static int so = 16;
   public static int[] sK = new int[2];
   private static rrxa_3 Gx;
   private static boolean Gd = false;
   private static int Gk = 256;
   static final int[] sD = new int[]{0, 1, 2, 3, 7, 8, 9, 10, 16, 17, 18, 19, 20, 21, 22, 23};
   static final int[] sU = new int[]{6, 11, 12};
   static final int[] se = new int[]{13, 14};
   static final int[] sa = new int[]{4, 5};
   static final int[] si = new int[]{0, 1, 2, 3, 4, 5};
   static final int[] Er = new int[]{6, 7};
   private static final int GW = (295 + 8 * Sk) * 4;
   private static final ByteBuffer Gz = (ByteBuffer)((Buffer)BufferUtils.createByteBuffer(GW)).limit(0);
   static final float[] EP = new float[16];
   static final float[] EB = new float[16];
   static final float[] ES = new float[16];
   static final float[] Es = new float[16];
   static final float[] EE = new float[16];
   static final float[] EG = new float[16];
   static final float[] Eb = new float[16];
   static final float[] EM = new float[16];
   static final FloatBuffer EO = package_(16);
   static final FloatBuffer Eh = package_(16);
   static final FloatBuffer EX = package_(16);
   static final FloatBuffer EJ = package_(16);
   static final FloatBuffer Ex = package_(16);
   static final FloatBuffer Ed = package_(16);
   static final FloatBuffer Ek = package_(16);
   static final FloatBuffer EW = package_(16);
   static final FloatBuffer Ez = package_(16);
   static final FloatBuffer EQ = package_(16);
   static final FloatBuffer EN = package_(16);
   static final FloatBuffer Ec = package_(16);
   static final rrxY_2 Eu = new rrxY_2("dfbDrawBuffers", 16, 8);
   static final rrxY_2 Em = new rrxY_2("sfbDrawBuffers", 16, 8);
   static final rrxY_2 EZ = new rrxY_2("drawBuffersNone", 16, 8).protected_(0);
   static final rrxY_2[] Ev = int_(16);
   static boolean EF;
   static boolean EL;
   static Map<xd_3, Integer> EA;
   private static final String[] GQ = new String[]{
      "R8",
      "RG8",
      "RGB8",
      "RGBA8",
      "R8_SNORM",
      "RG8_SNORM",
      "RGB8_SNORM",
      "RGBA8_SNORM",
      "R8I",
      "RG8I",
      "RGB8I",
      "RGBA8I",
      "R8UI",
      "RG8UI",
      "RGB8UI",
      "RGBA8UI",
      "R16",
      "RG16",
      "RGB16",
      "RGBA16",
      "R16_SNORM",
      "RG16_SNORM",
      "RGB16_SNORM",
      "RGBA16_SNORM",
      "R16F",
      "RG16F",
      "RGB16F",
      "RGBA16F",
      "R16I",
      "RG16I",
      "RGB16I",
      "RGBA16I",
      "R16UI",
      "RG16UI",
      "RGB16UI",
      "RGBA16UI",
      "R32F",
      "RG32F",
      "RGB32F",
      "RGBA32F",
      "R32I",
      "RG32I",
      "RGB32I",
      "RGBA32I",
      "R32UI",
      "RG32UI",
      "RGB32UI",
      "RGBA32UI",
      "R3_G3_B2",
      "RGB5_A1",
      "RGB10_A2",
      "R11F_G11F_B10F",
      "RGB9_E5"
   };
   private static final int[] GN = new int[]{
      33321,
      33323,
      32849,
      32856,
      36756,
      36757,
      36758,
      36759,
      33329,
      33335,
      36239,
      36238,
      33330,
      33336,
      36221,
      36220,
      33322,
      33324,
      32852,
      32859,
      36760,
      36761,
      36762,
      36763,
      33325,
      33327,
      34843,
      34842,
      33331,
      33337,
      36233,
      36232,
      33332,
      33338,
      36215,
      36214,
      33326,
      33328,
      34837,
      34836,
      33333,
      33339,
      36227,
      36226,
      33334,
      33340,
      36209,
      36208,
      10768,
      32855,
      32857,
      35898,
      35901
   };
   private static final Pattern Gc = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
   public static int[] En = new int[32];
   public static int EC = 0;

   public static void boolean_() {
      Z = true;
      break_(-3, 0);
      class_(BR);
      class_(rrdX.CLOUDS);
   }

   public static void char_() {
      GL43.glGetFloatv(2983, (FloatBuffer)((Buffer)EO).position(0));
      rrdx_1.class_((FloatBuffer)((Buffer)Eh).position(0), (FloatBuffer)((Buffer)EO).position(0), EB, EP);
      ((Buffer)EO).position(0);
      ((Buffer)Eh).position(0);
   }

   private static void byte_(rrxa_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            rrxa_3 var2 = var0[var1];
            var2.throws_();
         }
      }
   }

   private static void byte_(an_3 var0) {
      double var1 = Math.abs(Pe - PK);
      double var3 = Math.abs(Pi - PU);
      double var5 = Math.abs(Pe);
      double var7 = Math.abs(Pi);
      if (var1 > 1000.0 || var3 > 1000.0 || var5 > 1000000.0 || var7 > 1000000.0) {
         protected_(var0);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static rrxa_3 byte_(int var0, String var1) {
      rrMz_1 var2 = new rrMz_1("Shaders");
      String[] var3 = rrbb_3.class_(var1, " ");
      ArrayDeque var4 = new ArrayDeque<>(Arrays.asList(var3));
      String var5 = (String)var4.poll();
      rrke_1 var6 = (rrke_1)var2.class_((String)var4.poll(), rrke_1.values(), "texture type");
      if (var6 == null) {
         rrdJ.break_("Invalid raw texture type: " + var1);
         return null;
      } else {
         rrkK var7 = (rrkK)var2.class_((String)var4.poll(), rrkK.values(), "internal format");
         if (var7 == null) {
            rrdJ.break_("Invalid raw texture internal format: " + var1);
            return null;
         } else {
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            switch (var6) {
               case TEXTURE_1D:
                  var8 = var2.class_((String)var4.poll(), -1);
                  break;
               case TEXTURE_2D:
                  var8 = var2.class_((String)var4.poll(), -1);
                  var9 = var2.class_((String)var4.poll(), -1);
                  break;
               case TEXTURE_3D:
                  var8 = var2.class_((String)var4.poll(), -1);
                  var9 = var2.class_((String)var4.poll(), -1);
                  var10 = var2.class_((String)var4.poll(), -1);
                  break;
               case TEXTURE_RECTANGLE:
                  var8 = var2.class_((String)var4.poll(), -1);
                  var9 = var2.class_((String)var4.poll(), -1);
                  break;
               default:
                  rrdJ.break_("Invalid raw texture type: " + var6);
                  return null;
            }

            if (var8 >= 0 && var9 >= 0 && var10 >= 0) {
               rrkD var11 = (rrkD)var2.class_((String)var4.poll(), rrkD.values(), "pixel format");
               if (var11 == null) {
                  rrdJ.break_("Invalid raw texture pixel format: " + var1);
                  return null;
               } else {
                  rrkU var12 = (rrkU)var2.class_((String)var4.poll(), rrkU.values(), "pixel type");
                  if (var12 == null) {
                     rrdJ.break_("Invalid raw texture pixel type: " + var1);
                     return null;
                  } else if (!var4.isEmpty()) {
                     rrdJ.break_("Invalid raw texture, too many parameters: " + var1);
                     return null;
                  } else {
                     return class_(var0, var1, var5, var6, var7, var8, var9, var10, var11, var12);
                  }
               }
            } else {
               rrdJ.break_("Invalid raw texture size: " + var1);
               return null;
            }
         }
      }
   }

   public static void byte_(Ml_1 var0) {
      rjV_2 var1 = var0.byte_().class_();
      rjV_2 var2 = new rjV_2(var1);
      var2.protected_();
      var2.class_(Ew);
      rrdx_1.break_(while_, Ew, instanceof_);
      class_(Pk, 0.0F, 0.0F, 0.0F);
      if (GJ != null) {
         GJ.class_();
      }
   }

   public static rrdD[] byte_(String var0) {
      rrdD[] var1 = (rrdD[])Gr.clone();
      if (sO == null) {
         if (sM != null) {
            rrdU var9 = new rrdU(sM, var1);
            var1 = (rrdD[])rrbb_3.class_(var1, var9, 0);
         }

         return break_(var1);
      } else {
         String var2 = var0 != null ? "screen." + var0 : "screen";
         rrdV var3 = sO.get(var2);
         if (var3 == null) {
            return new rrdD[0];
         } else {
            rrdD[] var4 = var3.break_();
            ArrayList var5 = new ArrayList();

            for (int var6 = 0; var6 < var4.length; var6++) {
               rrdD var7 = var4[var6];
               if (var7 == null) {
                  var5.add((rrdD)null);
               } else if (var7 instanceof rrda_1) {
                  rrdD[] var8 = class_(sO, var1);
                  var5.addAll(Arrays.asList(var8));
               } else {
                  var5.add(var7);
               }
            }

            return var5.toArray(new rrdD[var5.size()]);
         }
      }
   }

   private static void byte_(rrdG var0) {
      rrxz_3[] var1 = var0.new_();
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrxz_3 var3 = var1[var2];
            if (var3 != null) {
               String var4 = Integer.toHexString(var2).toUpperCase();
               int var5 = 36064 + var2;
               int var6 = var0.extends_().case_(var5);
               if (var6 < 0) {
                  rrdJ.break_("Blend buffer not used in draw buffers: " + var4);
               } else {
                  var0.break_(var6, var3);
                  rrdJ.byte_("Blend buffer: " + var4);
               }
            }
         }
      }
   }

   private static int byte_(rrdG var0, String var1) {
      InputStream var2 = Ei.class_(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(36313);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = class_(Gr);
            ArrayList var5 = new ArrayList();
            Ef = false;
            Ej = false;
            EV = 3;
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.class_(new InputStreamReader(var2));
                  var7 = rrks_1.class_(var7, var1, Ei, 0, var5, 0);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = class_(var10, var4);
                     var6.class_(var10);
                     if (var8.class_(var10)) {
                        rrdg_1 var11 = rrkG.class_(var10);
                        if (var11 != null) {
                           if (var11.finally_("GL_ARB_geometry_shader4")) {
                              String var12 = rrbb_3.private_(var11.byte_());
                              if (var12.equals("enable") || var12.equals("require") || var12.equals("warn")) {
                                 Ef = true;
                              }
                           }

                           if (var11.finally_("GL_EXT_geometry_shader4")) {
                              String var17 = rrbb_3.private_(var11.byte_());
                              if (var17.equals("enable") || var17.equals("require") || var17.equals("warn")) {
                                 Ej = true;
                              }
                           }

                           if (var11.throws_("maxVerticesOut")) {
                              EV = var11.package_();
                           }
                        }
                     }
                  }
               } catch (Exception var13) {
                  rrdJ.class_("Couldn't read " + var1 + "!");
                  var13.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var15 = var6.toString();
            if (sy) {
               class_(var1, var15);
            }

            ARBShaderObjects.glShaderSourceARB(var3, var15);
            ARBShaderObjects.glCompileShaderARB(var3);
            if (GL43.glGetShaderi(var3, 35713) != 1) {
               rrdJ.class_("Error compiling geometry shader: " + var1);
            }

            class_(var3, var1, var5);
            return var3;
         }
      }
   }

   public static int byte_(int var0) {
      switch (var0) {
         case 33329:
         case 33335:
         case 36238:
         case 36239:
            return 36251;
         case 33330:
         case 33336:
         case 36220:
         case 36221:
            return 36251;
         case 33331:
         case 33337:
         case 36232:
         case 36233:
            return 36251;
         case 33332:
         case 33338:
         case 36214:
         case 36215:
            return 36251;
         case 33333:
         case 33339:
         case 36226:
         case 36227:
            return 36251;
         case 33334:
         case 33340:
         case 36208:
         case 36209:
            return 36251;
         default:
            return 32993;
      }
   }

   private static IntBuffer[] byte_(int var0, int var1) {
      IntBuffer[] var2 = new IntBuffer[var0];

      for (int var3 = 0; var3 < var0; var3++) {
         var2[var3] = class_(var1);
      }

      return var2;
   }

   private static void byte_(rrdF var0, rrdG var1) {
      if (var1.public_() != null) {
         var0.private_();
         GL43.glViewport(0, 0, var0.protected_(), var0.throws_());
      }

      rrdj_1 var2 = Sz.super_();
      if (var2 != null) {
         GL43.glViewport(0, 0, var0.protected_(), var0.throws_());
      }
   }

   public static void byte_() {
      class_ = QY.instanceof_();
      boolean var0 = sr;
      boolean var1 = extends_();
      if ((yX_2)class_.class_[8] != null) {
         ((yX_2)class_.class_[8]).synchronized_();
      }

      sr = false;
      if (Ei != null) {
         Ei.break_();
         Ei = null;
         GB.clear();
         Gs.clear();
         Gr = null;
         GP = null;
         sM = null;
         sO = null;
         sh.clear();
         sJ.case_();
         sd.case_();
         sk.case_();
         sx.case_();
         rE();
         Gh = null;
      }

      boolean var2 = false;
      if (rrbb_3.T()) {
         rrdJ.byte_("Shaders can not be loaded, Antialiasing is enabled: " + rrbb_3.q() + "x");
         var2 = true;
      }

      if (rrbb_3.instanceof_()) {
         rrdJ.byte_("Shaders can not be loaded, Fabulous Graphics is enabled.");
         var2 = true;
      }

      String var3 = Sm.getProperty(rrdy_1.SHADER_PACK.break_(), "(internal)");
      if (!var2) {
         Ei = break_(var3);
         sr = Ei != null;
      }

      if (sr) {
         rrdJ.byte_("Loaded shaderpack: " + y());
      } else {
         rrdJ.byte_("No shaderpack loaded.");
         Ei = new rrdN();
      }

      if (sy) {
         class_(new File(sG, "debug"));
      }

      rc();
      rB();
      Gr = rG();
      rS();
      rs();
      boolean var4 = sr != var0;
      boolean var5 = extends_() != var1;
      if (var4 || var5) {
         ju_3.class_();
         if (rrxr_3.BM.byte_()) {
            rrxr_3.BO.break_(null);
            rrxr_3.Bh.break_(null);
         }

         private_();
      }

      if (class_.F() != null) {
         rrbW_2.class_();
      }

      if ((yX_2)class_.class_[8] != null) {
         ((yX_2)class_.class_[8]).return_();
      }

      if ((var4 || var5) && class_.F() != null) {
         class_.x();
      }
   }

   private static boolean byte_(rdn_3 var0) {
      if (var0 == null) {
         return false;
      } else {
         rdb_3 var1 = var0.break_();
         if (var1 == null) {
            return false;
         } else if (!(var1 instanceof rxJ_2 var2)) {
            return false;
         } else {
            xd_3 var3 = var2.catch_();
            if (var3 == null) {
               return false;
            } else {
               HU var4 = yS_2.class_(var3.continue_());
               return var4 == rrxA_2.protected_;
            }
         }
      }
   }

   private static int byte_(ryO_2 var0) {
      if (var0 == null) {
         return -1;
      } else {
         xc_3 var1 = var0.abstract_();
         return rrxt_3.class_(var1);
      }
   }

   private static rrxY_2[] int_(int var0) {
      rrxY_2[] var1 = new rrxY_2[var0];

      for (int var2 = 0; var2 < var1.length; var2++) {
         rrxY_2 var3 = new rrxY_2("single" + var2, 16, 8);
         var3.break_(36064 + var2);
         var3.byte_(0);
         var3.protected_(1);
         var1[var2] = var3;
      }

      return var1;
   }

   public static boolean int_() {
      return !sc.implements_();
   }

   public static void long_() {
      if (!new_) {
         boolean var0 = class_(BL, SG);
         if (Ea) {
            catch_("pre-render Deferred");
            rQ();
            var0 = true;
         }

         if (var0) {
            rd();
            BL.class_(true);
            rrxY_2 var1 = SO.extends_() != null ? SO.extends_() : BL.extends_();
            rrxU_2.class_(var1);
            MT.new_(33984);
            class_.A().class_(fJ_2.class_);
         }
      }
   }

   public static void float_() {
      if (!new_) {
         class_(BL, SX);
         catch_("pre-render CompositeFinal");
         rz();
      }
   }

   public static void double_() {
      if (volatile_ && SS.private_() != By.private_()) {
         class_(SS);
         MT.throws_();
         MT.class_(516, 0.0F);
         MT.break_(770, 771);
      }
   }

   private rrdZ() {
   }

   public static void B() {
      if (volatile_) {
         continue_ = false;
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
      class_(rK, sf);
      class_(rD, sj);
   }

   public static boolean I() {
      return !ET && !Et;
   }

   public static void J() {
      MT.final_();
      class_(Bj);
      class_(rrdX.NONE);
   }

   public static void S() {
      if (volatile_) {
         rrdA.break_(SZ);
         if (!new_) {
            rrxU_2.class_(Ev[0]);
         }
      }
   }

   public static void Z() {
      u();
      class_(BI);
   }

   public static float V() {
      return BX < 0.0F ? -1.0F : BO * BX;
   }

   public static boolean this_() {
      return sn.private_();
   }

   public static boolean e() {
      return Eg ? throws_.GL_NV_geometry_shader4 : true;
   }

   public static boolean i() {
      return sr;
   }

   public static void b() {
      class_(Bj);
   }

   public static void x() {
      if (!new_ && Bc >= 3) {
         MT.new_(33996);
         GL43.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, extends_, native_);
         MT.new_(33984);
      }
   }

   public static void s() {
      if (volatile_ && !new_) {
         rrxU_2.class_(Sr.extends_());
      }
   }

   public static void c() {
      if (final_) {
         class_(BV);
      } else if (Sz == Bf || Sz == Bj) {
         class_(BI);
      }
   }

   public static void n() {
      m = false;
      if (Sz == Bj) {
         class_(Bf);
      }
   }

   public static void h() {
      if (!new_ && Q) {
         ((Buffer)Ec).clear();
         GL43.glReadPixels(extends_ / 2, native_ / 2, 1, 1, 6402, 5126, Ec);
         k = Ec.get(0);
         float var0 = (float)for_ * 0.01F;
         float var1 = (float)Math.exp(Math.log(0.5) * (double)var0 / (double)z);
         W = W * var1 + k * (1.0F - var1);
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
         MT.new_(33995);
         catch_("pre copy depth");
         GL43.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, extends_, native_);
         catch_("copy depth");
         MT.new_(33984);
      }

      rrdA.class_(SZ.this_());
   }

   public static boolean a() {
      return sr;
   }

   public static void interface_() {
      if (Sc) {
         void_();
         rd();
         BL.finally_();
         BL.class_(true);
      }
   }

   public static void class_(float var0, long var1) {
      if (!new_) {
         BL.private_();
         GL11.glViewport(0, 0, extends_, native_);
         rrxU_2.class_((rrxY_2)null);
         rrdA.class_(SZ.this_());
         class_(Bf);
         catch_("end beginRenderPass");
      }
   }

   public static void class_(gm_3 var0) {
      if (GS != var0) {
         gm_3 var1 = GS;
         GS = var0;
         if (GS == null) {
            Pe = 0.0;
            Pa = 0.0;
            Pi = 0.0;
            PK = 0.0;
            PD = 0.0;
            PU = 0.0;
         }

         protected_(class_.catch_());
         int var2 = rrzc_3.class_(var1);
         int var3 = rrzc_3.class_(var0);
         if (var3 != var2) {
            boolean var4 = Gs.contains(var2);
            boolean var5 = Gs.contains(var3);
            if (var4 || var5) {
               while_();
            }
         }

         rrkT.break_();
      }
   }

   private static void class_(int var0, rrxa_3[] var1) {
      if (BA != null) {
         BA.protected_(0);
         BA.class_(sa);
      }

      BL.protected_(var0);
      BL.class_(sU);
      if (Gd) {
         MT.new_(33984 + Gx.class_());
         MT.super_(Gx.protected_());
         MT.new_(33984);
      }

      break_(var1);
   }

   public static void class_(QY var0, ly_3 var1, float var2, long var3) {
      catch_("pre beginRender");
      class_((gm_3)class_.class_[56]);
      class_ = var0;
      break_ = (Hh_1)class_.class_[16];
      if (!protected_) {
         try {
            public_();
         } catch (IllegalStateException var14) {
            if (rrbb_3.private_(var14.getMessage()).equals("Function is not supported")) {
               private_("[Shaders] Error: " + var14.getMessage());
               var14.printStackTrace();
               class_("OFF");
               return;
            }
         }
      }

      if (class_.else_().extends_() != El || class_.else_().native_() != EH) {
         rh();
      }

      if (BS) {
         rX();
      }

      double_++;
      if (double_ >= 720720) {
         double_ = 0;
      }

      boolean_ = System.currentTimeMillis();
      if (transient_ == 0L) {
         transient_ = boolean_;
      }

      for_ = boolean_ - transient_;
      transient_ = boolean_;
      switch_ = (float)for_ / 1000.0F;
      r = r + switch_;
      r %= 3600.0F;
      S = B != ((Qw_1)class_.class_[20]).volatile_();
      B = ((Qw_1)class_.class_[20]).volatile_();
      MT.transient_();
      rrdL.class_(var1, var0, var2);
      MT.for_();
      gm_3 var5 = (gm_3)class_.class_[56];
      if (var5 != null) {
         void_ = var5.P();
         import_ = (void_ - static_) % 24000L;
         if (import_ < 0L) {
            import_ += 24000L;
         }

         static_ = void_;
         strictfp_ = var5.char_();
         s = var5.private_(var2);
         float var6 = (float)for_ * 0.01F;
         float var7 = (float)Math.exp(Math.log(0.5) * (double)var6 / (double)(E < s ? b : G));
         E = E * var7 + s * (1.0F - var7);
         an_3 var8 = var1.catch_();
         if (var8 != null) {
            super_ = var8 instanceof iB_2 && ((iB_2)var8).Sc();
            d = (float)var1.break_().break_();
            X = class_.case_().class_(var8, var2);
            float var9 = (float)for_ * 0.01F;
            float var10 = (float)Math.exp(Math.log(0.5) * (double)var9 / (double)M);
            J = J * var10 + (float)(X & 65535) * (1.0F - var10);
            x = x * var10 + (float)(X >> 16) * (1.0F - var10);
            rXE var11 = var1.finally_();
            if (var11.class_(rlG_2.break_)) {
               h = 1;
            } else if (var11.class_(rlG_2.byte_)) {
               h = 2;
            } else {
               h = 0;
            }

            if (var8 instanceof iB_2 var12) {
               c = 0.0F;
               if (var12.break_(rLD.int_)) {
                  Hh_1 var13 = break_;
                  c = Hh_1.class_(var12, var2);
               }

               u = 0.0F;
               if (var12.break_(rLD.package_)) {
                  int var17 = var12.byte_(rLD.package_).break_();
                  u = rrbb_3.class_((float)var17 / 20.0F, 0.0F, 1.0F);
               }
            }

            rjU_2 var15 = var5.class_(var8.Bs(), var2);
            var15 = rrbN_2.break_(var15, var5, var8, var2);
            abstract_ = (float)var15.break_;
            long_ = (float)var15.byte_;
            float_ = (float)var15.protected_;
         }
      }

      volatile_ = true;
      package_ = false;
      new_ = false;
      Ep = false;
      Eq = false;
      ET = false;
      Et = false;
      BL.class_(9729, 9729);
      rd();
      BL.break_(true);
      if (BA != null) {
         BA.break_(true);
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
      catch_("beginRender");
      rrdL.class_(break_, var1, 0, var2, var3);
      BL.class_(true);
      class_(rrdX.NONE);
      catch_("end beginRender");
   }

   private static void class_(rrdM var0) {
      switch (var0) {
         case GBUFFERS:
            class_(o, 0);
            class_(K, 2);
            class_(D, 1);
            class_(U, 3);
            class_(e, Bx ? 5 : 4);
            class_(a, 4);
            class_(i, 4);
            class_(rr, 5);
            class_(rP, 6);
            if (GE != null || Ea) {
               class_(rX, 7);
               class_(rJ, 8);
               class_(rx, 9);
               class_(rd, 10);
               class_(rN, 7);
               class_(rc, 8);
               class_(ru, 9);
               class_(rm, 10);
               if (BN > 8) {
                  class_(rF, 16);
                  class_(rL, 17);
                  class_(rA, 18);
                  class_(rn, 19);
                  class_(rC, 20);
                  class_(rl, 21);
                  class_(rH, 22);
                  class_(ry, 23);
               }
            }

            class_(rB, 11);
            class_(rS, 13);
            class_(rs, 13);
            class_(rE, 14);
            class_(rG, 15);
            break;
         case SHADOWCOMP:
         case PREPARE:
         case DEFERRED:
         case COMPOSITE:
            class_(rb, 0);
            class_(rM, 1);
            class_(rO, 2);
            class_(rh, 3);
            class_(rX, 7);
            class_(rJ, 8);
            class_(rx, 9);
            class_(rd, 10);
            class_(rk, 0);
            class_(rW, 1);
            class_(rz, 2);
            class_(rQ, 3);
            class_(rN, 7);
            class_(rc, 8);
            class_(ru, 9);
            class_(rm, 10);
            if (BN > 8) {
               class_(rF, 16);
               class_(rL, 17);
               class_(rA, 18);
               class_(rn, 19);
               class_(rC, 20);
               class_(rl, 21);
               class_(rH, 22);
               class_(ry, 23);
            }

            class_(e, Bx ? 5 : 4);
            class_(a, 4);
            class_(i, 4);
            class_(rr, 5);
            class_(rZ, 6);
            class_(rP, 6);
            class_(rB, 11);
            class_(rv, 12);
            class_(rS, 13);
            class_(rs, 13);
            class_(rE, 14);
            class_(rG, 15);
            break;
         case SHADOW:
            class_(rV, 0);
            class_(o, 0);
            class_(K, 2);
            class_(D, 1);
            class_(U, 3);
            class_(e, Bx ? 5 : 4);
            class_(a, 4);
            class_(i, 4);
            class_(rr, 5);
            if (GE != null) {
               class_(rX, 7);
               class_(rJ, 8);
               class_(rx, 9);
               class_(rd, 10);
               class_(rN, 7);
               class_(rc, 8);
               class_(ru, 9);
               class_(rm, 10);
               if (BN > 8) {
                  class_(rF, 16);
                  class_(rL, 17);
                  class_(rA, 18);
                  class_(rn, 19);
                  class_(rC, 20);
                  class_(rl, 21);
                  class_(rH, 22);
                  class_(ry, 23);
               }
            }

            class_(rS, 13);
            class_(rs, 13);
            class_(rE, 14);
            class_(rG, 15);
      }

      rdn_3 var1 = (cb_3)class_.class_[57] != null ? ((cb_3)class_.class_[57]).ss() : null;
      rdb_3 var2 = var1 != null ? var1.break_() : null;
      int var3 = -1;
      xd_3 var4 = null;
      if (var2 != null) {
         var3 = rVL.for_.class_(var2);
         if (var2 instanceof rxJ_2) {
            var4 = ((rxJ_2)var2).catch_();
         }

         var3 = rrdP.class_(var3);
      }

      int var5 = var4 != null ? var4.continue_().case_() : 0;
      rdn_3 var6 = (cb_3)class_.class_[57] != null ? ((cb_3)class_.class_[57]).Sn() : null;
      rdb_3 var7 = var6 != null ? var6.break_() : null;
      int var8 = -1;
      xd_3 var9 = null;
      if (var7 != null) {
         var8 = rVL.for_.class_(var7);
         if (var7 instanceof rxJ_2) {
            var9 = ((rxJ_2)var7).catch_();
         }

         var8 = rrdP.class_(var8);
      }

      int var10 = var9 != null ? var9.continue_().case_() : 0;
      if (implements_() && var10 > var5) {
         var3 = var8;
         var5 = var10;
      }

      float var11 = (cb_3)class_.class_[57] != null ? ((cb_3)class_.class_[57]).double_() : 0.0F;
      class_(rg, var3);
      class_(rR, var5);
      class_(rY, var8);
      class_(ro, var10);
      class_(rK, Z ? sf : 0);
      class_(rD, Z ? sj : 0.0F);
      class_(rU, sV, sg, sR);
      class_(re, abstract_, long_, float_);
      class_(ra, (int)(void_ % 24000L));
      class_(ri, (int)(void_ / 24000L));
      class_(Pr, strictfp_);
      class_(PP, double_);
      class_(PB, switch_);
      class_(PS, r);
      class_(Ps, default_);
      class_(PE, const_);
      class_(PG, s);
      class_(Pb, (float)extends_ / (float)native_);
      class_(PM, (float)extends_);
      class_(PO, (float)native_);
      class_(Ph, 0.05F);
      class_(PX, (float)(((Qw_1)class_.class_[20]).break_ * 16));
      class_(PJ, 0.0F, 0.0F, 0.0F);
      class_(Px, 0.0F, 0.0F, 0.0F);
      class_(Pd, 0.0F, 0.0F, 0.0F);
      class_(Pk, 0.0F, 0.0F, 0.0F);
      class_(PW, (float)PK, (float)PD, (float)PU);
      class_(Pz, (float)Pe, (float)Pa, (float)Pi);
      class_(PQ, false, EX);
      class_(PN, false, EJ);
      class_(Pc, false, Ez);
      class_(Pu, false, EO);
      class_(Pm, false, Eh);
      class_(PZ, false, EQ);
      if (BB) {
         class_(Pv, false, Ex);
         class_(PF, false, Ed);
         class_(PL, false, Ek);
         class_(PA, false, EW);
      }

      class_(Pn, E);
      class_(PC, d);
      class_(Pl, X & 65535, X >> 16);
      class_(PH, Math.round(J), Math.round(x));
      class_(Py, sK[0], sK[1]);
      class_(Pp, so);
      class_(Pq, h);
      class_(PT, c);
      class_(Pt, u);
      class_(Pw, (float)((Qw_1)class_.class_[20]).a);
      class_(PI, ((Qw_1)class_.class_[20]).g ? 1 : 0);
      class_(Pf, W);
      class_(Pj, j, V);
      class_(PY, var11);
      class_(Po, v.ordinal());
      if (GJ != null) {
         GJ.class_();
      }
   }

   private static rrxY_2 class_(rrxY_2 var0) {
      int var1 = var0.break_();

      for (int var2 = var0.class_(); var2 < var1; var2++) {
         var0.class_(var2, 0);
      }

      return var0;
   }

   public static void class_(rrdG var0) {
      catch_("pre-useProgram");
      if (new_) {
         var0 = Bp;
      } else if (continue_) {
         var0 = SP;
      }

      if (Sz != var0) {
         rP();
         class_(Sz, var0);
         if (EF && EL) {
            KHRDebug.glPopDebugGroup();
         }

         Sz = var0;
         if (EF) {
            KHRDebug.glPushDebugGroup(33354, 0, Sz.synchronized_());
            EL = true;
         }

         int var1 = var0.private_();
         SQ = var1;
         ARBShaderObjects.glUseProgramObjectARB(var1);
         if (catch_("useProgram") != 0) {
            var0.class_(0);
            var1 = var0.private_();
            SQ = var1;
            ARBShaderObjects.glUseProgramObjectARB(var1);
         }

         ER.class_(var1);
         if (GJ != null) {
            GJ.class_(var1);
         }

         if (var1 != 0) {
            rrxY_2 var2 = var0.extends_();
            if (int_) {
               rrxU_2.class_(var2);
            }

            class_(var0.case_());
            rb();
            catch_("end useProgram");
         }
      }
   }

   public static void class_(float var0, float var1, float var2, float var3) {
      char_.class_(var0, var1, var2, 1.0F);
   }

   public static void class_(float var0, float var1, float var2) {
      sV = var0;
      sg = var1;
      sR = var2;
      class_(rU, sV, sg, sR);
   }

   public static void class_(int var0, int var1, int var2, int var3) {
      MT.class_(true, true, true, true);
      if (new_) {
         GL11.glViewport(0, 0, Bs, BE);
      } else {
         GL11.glViewport(0, 0, extends_, native_);
         BL.private_();
         int_ = true;
         MT.throw_();
         MT.volatile_();
         rrxU_2.class_(EZ);
         class_(Bf);
         catch_("beginRenderPass");
      }
   }

   private static void class_(rrkL var0, int var1) {
      var0.break_(var1);
   }

   public static void class_(boolean var0, boolean var1) {
      ET = var0;
      Et = var1;
   }

   private static void class_(rrkC var0, float var1, float var2, float var3) {
      var0.class_(var1, var2, var3);
   }

   private static void class_(rrkp_1 var0, boolean var1, FloatBuffer var2) {
      var0.class_(var1, var2);
   }

   private static void class_(rrkn_1 var0, int var1, int var2) {
      var0.class_(var1, var2);
   }

   public static boolean class_(rpm_3 var0) {
      return var0 == rpm_3.MAIN_HAND && ET ? true : var0 == rpm_3.OFF_HAND && Et;
   }

   private static void class_(rrdG var0, rrdG var1) {
      if (var0.package_() != null) {
         MT.G();
      }

      if (var0.int_() != null) {
         MT.b();
      }

      if (var0.continue_() != null) {
         MT.d();
      }

      rrxW_2 var2 = var1.package_();
      if (var2 != null) {
         MT.class_(var2);
      }

      rrxz_3 var3 = var1.int_();
      if (var3 != null) {
         MT.class_(var3);
      }

      if (var1.continue_() != null) {
         MT.class_(var1.continue_());
      }
   }

   private static void class_(rrkF var0, float var1) {
      var0.class_(var1);
   }

   private static IntBuffer class_(IntBuffer var0) {
      int var1 = var0.limit();

      for (int var2 = var0.position(); var2 < var1; var2++) {
         var0.put(var2, 0);
      }

      return var0;
   }

   public static void class_(ryO_2 var0) {
      if (volatile_) {
         catch_("nextBlockEntity");
         class_(Be);
         break_(var0);
      }
   }

   public static void class_(an_3 var0) {
      if (volatile_) {
         if (var0.w()) {
            class_(SP);
         } else {
            class_(Sr);
         }

         break_(var0);
      }
   }

   public static void class_(xd_3 var0) {
      EC++;
      int var1 = var0.class_(var0.continue_()).ordinal();
      En[EC * 2] = rVL.strictfp_.class_(var0) & 65535 | var1 << 16;
      En[EC * 2 + 1] = 0;
   }

   public static void class_() {
      rrdJ.byte_("Load shaders configuration.");

      try {
         if (!sG.exists()) {
            sG.mkdir();
         }
      } catch (Exception var8) {
         rrdJ.class_("Failed to open the shaderpacks directory: " + sG);
      }

      Sm = new rrzE_2();
      Sm.setProperty(rrdy_1.SHADER_PACK.break_(), "");
      if (sb.exists()) {
         try {
            FileReader var0 = new FileReader(sb);
            Sm.load(var0);
            var0.close();
         } catch (Exception var7) {
         }
      }

      if (!sb.exists()) {
         try {
            break_();
         } catch (Exception var6) {
         }
      }

      rrdy_1[] var9 = rrdy_1.values();

      for (int var1 = 0; var1 < var9.length; var1++) {
         rrdy_1 var2 = var9[var1];
         String var3 = var2.break_();
         String var4 = var2.byte_();
         String var5 = Sm.getProperty(var3, var4);
         class_(var2, var5);
      }

      byte_();
   }

   public static boolean class_(Qw_1 var0) {
      if (!sr) {
         return true;
      } else {
         catch_("shouldRenderClouds");
         return new_ ? Sl : var0.throws_ != Vd_1.OFF;
      }
   }

   public static void class_(rjU_2 var0) {
      abstract_ = (float)var0.break_;
      long_ = (float)var0.byte_;
      float_ = (float)var0.protected_;
      class_(re, abstract_, long_, float_);
   }

   private static rrxa_3 class_(int var0, String var1, String var2, rrke_1 var3, rrkK var4, int var5, int var6, int var7, rrkD var8, rrkU var9) {
      try {
         String var10 = "shaders/" + rrzX_2.protected_(var2, "/");
         InputStream var11 = Ei.class_(var10);
         if (var11 == null) {
            rrdJ.break_("Raw texture not found: " + var2);
            return null;
         } else {
            byte[] var12 = rrbb_3.byte_(var11);
            IOUtils.closeQuietly(var11);
            ByteBuffer var13 = Hb_1.class_(var12.length);
            var13.put(var12);
            ((Buffer)var13).flip();
            Vs_1 var14 = rrdl_1.class_(var10, new Vs_1(true, true));
            return new rrxg_3(var3, var4, var5, var6, var7, var8, var9, var13, var0, var14.class_(), var14.break_());
         }
      } catch (IOException var15) {
         rrdJ.break_("Error loading raw texture: " + var2);
         rrdJ.break_(var15.getClass().getName() + ": " + var15.getMessage());
         return null;
      }
   }

   public static void class_(int var0, int var1) {
      GL11.glFogi(var0, var1);
      if (var0 == 2917) {
         sf = var1;
         if (Z) {
            class_(rK, sf);
         }
      }
   }

   public static void class_(float var0) {
      sj = var0;
      if (Z) {
         class_(rD, var0);
      }
   }

   public static void class_(MD var0) {
      protected_(var0.param);
   }

   public static void class_(Ml_1 var0, boolean var1) {
      GL43.glMatrixMode(5888);
      GL43.glPushMatrix();
      GL43.glMatrixMode(5889);
      GL43.glPushMatrix();
      GL43.glMatrixMode(5888);
      var0.class_();
      if (var1) {
         class_(Sh);
      } else {
         class_(Ss);
      }

      catch_("beginHand");
      case_("beginHand");
   }

   public static IntBuffer class_(int var0) {
      ByteBuffer var1 = Gz;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0 * 4);
      return var1.asIntBuffer();
   }

   private static boolean class_(rrdF var0, rrdG var1) {
      boolean var2 = false;
      Boolean[] var3 = var1.this_();

      for (int var4 = 0; var4 < BN; var4++) {
         if (rrbb_3.class_(var3[var4])) {
            var0.case_(var4);
            var2 = true;
         }
      }

      return var2;
   }

   public static String class_(rrdy_1 var0) {
      switch (var0) {
         case ANTIALIASING:
            return Integer.toString(So);
         case NORMAL_MAP:
            return Boolean.toString(SV);
         case SPECULAR_MAP:
            return Boolean.toString(Sg);
         case RENDER_RES_MUL:
            return Float.toString(Sy);
         case SHADOW_RES_MUL:
            return Float.toString(Sp);
         case HAND_DEPTH_MUL:
            return Float.toString(SH);
         case CLOUD_SHADOW:
            return Boolean.toString(Sl);
         case OLD_HAND_LIGHT:
            return SY.byte_();
         case OLD_LIGHTING:
            return SR.byte_();
         case SHADER_PACK:
            return sP;
         case TWEAK_BLOCK_DAMAGE:
            return Boolean.toString(SC);
         case SHADOW_CLIP_FRUSTRUM:
            return Boolean.toString(Sj);
         case TEX_MIN_FIL_B:
            return Integer.toString(Sq);
         case TEX_MIN_FIL_N:
            return Integer.toString(ST);
         case TEX_MIN_FIL_S:
            return Integer.toString(St);
         case TEX_MAG_FIL_B:
            return Integer.toString(Sw);
         case TEX_MAG_FIL_N:
            return Integer.toString(Sw);
         case TEX_MAG_FIL_S:
            return Integer.toString(Sw);
         default:
            throw new IllegalArgumentException("Unknown option: " + var0);
      }
   }

   public static void class_(String var0) {
      sP = var0;
      Sm.setProperty(rrdy_1.SHADER_PACK.break_(), var0);
      byte_();
   }

   public static void class_(Ml_1 var0) {
      var0.class_(rje_3.case_.byte_(sw * 1.0F));
      catch_("preCelestialRotate");
   }

   public static void class_(rdn_3 var0) {
      else_ = byte_(var0);
   }

   public static void class_(Ml_1 var0, ly_3 var1, float var2) {
      an_3 var3 = var1.catch_();
      rjU_2 var4 = var1.break_();
      double var5 = var4.break_;
      double var7 = var4.byte_;
      double var9 = var4.protected_;
      byte_(var3);
      Pe = var5 - (double)Br;
      Pa = var7;
      Pi = var9 - (double)BP;
      char_();
      rjV_2 var11 = var0.byte_().class_();
      rjV_2 var12 = new rjV_2(var11);
      var12.protected_();
      var12.class_(Ew);
      ((Buffer)EX).position(0);
      EX.put(Ew);
      rrdx_1.class_((FloatBuffer)((Buffer)EJ).position(0), (FloatBuffer)((Buffer)EX).position(0), Es, ES);
      ((Buffer)EX).position(0);
      ((Buffer)EJ).position(0);
      catch_("setCamera");
   }

   public static void class_(rrxf_3 var0) {
      if (BL != null) {
         ARBShaderObjects.glUseProgramObjectARB(var0.case_());
         if (catch_("useComputeProgram") != 0) {
            var0.class_(0);
         } else {
            ER.class_(var0.case_());
            if (GJ != null) {
               GJ.class_(var0.case_());
            }

            class_(var0.throws_());
            rb();
            BL.break_(true);
            rja_3 var1 = var0.implements_();
            if (var1 == null) {
               rjK_2 var2 = var0.finally_();
               if (var2 == null) {
                  var2 = new rjK_2(1.0F, 1.0F);
               }

               int var3 = (int)Math.ceil((double)((float)extends_ * var2.byte_));
               int var4 = (int)Math.ceil((double)((float)native_ * var2.protected_));
               rja_3 var5 = var0.private_();
               int var6 = (int)Math.ceil(1.0 * (double)var3 / (double)var5.b_());
               int var7 = (int)Math.ceil(1.0 * (double)var4 / (double)var5.c_());
               var1 = new rja_3(var6, var7, 1);
            }

            GL43.glMemoryBarrier(40);
            GL43.glDispatchCompute(var1.b_(), var1.c_(), var1.d_());
            GL43.glMemoryBarrier(40);
            catch_("compute");
         }
      }
   }

   public static void class_(rrdF var0, rrxf_3[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         rrxf_3 var3 = var1[var2];
         class_(var3);
         if (var3.native_()) {
            var0.throws_(var3.extends_());
         }
      }
   }

   private static void class_(rrdy_1 var0, String var1) {
      if (var1 == null) {
         var1 = var0.byte_();
      }

      switch (var0) {
         case ANTIALIASING:
            So = rrbb_3.class_(var1, 0);
            break;
         case NORMAL_MAP:
            SV = rrbb_3.class_(var1, true);
            break;
         case SPECULAR_MAP:
            Sg = rrbb_3.class_(var1, true);
            break;
         case RENDER_RES_MUL:
            Sy = rrbb_3.class_(var1, 1.0F);
            break;
         case SHADOW_RES_MUL:
            Sp = rrbb_3.class_(var1, 1.0F);
            break;
         case HAND_DEPTH_MUL:
            SH = rrbb_3.class_(var1, 0.125F);
            break;
         case CLOUD_SHADOW:
            Sl = rrbb_3.class_(var1, true);
            break;
         case OLD_HAND_LIGHT:
            SY.class_(var1);
            break;
         case OLD_LIGHTING:
            SR.class_(var1);
            break;
         case SHADER_PACK:
            sP = var1;
            break;
         case TWEAK_BLOCK_DAMAGE:
            SC = rrbb_3.class_(var1, true);
            break;
         case SHADOW_CLIP_FRUSTRUM:
            Sj = rrbb_3.class_(var1, true);
            break;
         case TEX_MIN_FIL_B:
            Sq = rrbb_3.class_(var1, 0);
            break;
         case TEX_MIN_FIL_N:
            ST = rrbb_3.class_(var1, 0);
            break;
         case TEX_MIN_FIL_S:
            St = rrbb_3.class_(var1, 0);
            break;
         case TEX_MAG_FIL_B:
            Sw = rrbb_3.class_(var1, 0);
            break;
         case TEX_MAG_FIL_N:
            Sw = rrbb_3.class_(var1, 0);
            break;
         case TEX_MAG_FIL_S:
            Sw = rrbb_3.class_(var1, 0);
            break;
         default:
            throw new IllegalArgumentException("Unknown option: " + var0);
      }
   }

   private static void class_(rrdF var0, rrdG[] var1, boolean var2, rrxa_3[] var3) {
      GL43.glPushMatrix();
      GL43.glLoadIdentity();
      GL43.glMatrixMode(5889);
      GL43.glPushMatrix();
      GL43.glLoadIdentity();
      GL43.glOrtho(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
      GL43.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      MT.import_();
      MT.protected_();
      MT.final_();
      MT.volatile_();
      MT.break_(519);
      MT.class_(false);
      MT.catch_();
      class_(0, var3);
      var0.break_(true);
      var0.class_(false);
      var0.implements_();
      var0.finally_();
      catch_("pre-composite");

      for (int var4 = 0; var4 < var1.length; var4++) {
         rrdG var5 = var1[var4];
         class_(var0, var5.goto_());
         if (var5.private_() != 0) {
            class_(var5);
            catch_(var5.throws_());
            if (var5.return_()) {
               var0.throws_(var5.volatile_());
            }

            break_(var0, var5);
            abstract_();
            byte_(var0, var5);
            var0.break_(var5.else_());
         }
      }

      catch_("composite");
      if (var2) {
         rN();
         package_ = true;
      }

      MT.import_();
      MT.throws_();
      MT.package_();
      MT.break_(515);
      MT.class_(true);
      GL43.glPopMatrix();
      GL43.glMatrixMode(5888);
      GL43.glPopMatrix();
      class_(By);
   }

   private static void class_(rrdG[] var0, boolean var1, rrxa_3[] var2) {
      class_(BL, var0, var1, var2);
   }

   public static void class_(boolean var0) {
      if (var0) {
         So += 2;
         if (So > 4) {
            So = 0;
         }
      } else {
         So -= 2;
         if (So < 0) {
            So = 4;
         }
      }

      So = So / 2 * 2;
      So = rrbb_3.class_(So, 0, 4);
   }

   public static void class_(rrdX var0) {
      if (sr) {
         v = var0;
         Po.break_(var0.ordinal());
      }
   }

   public static void class_(QY var0) {
      p();
      class_ = var0;
      var0 = QY.instanceof_();
      throws_ = org.lwjgl.opengl.GL.getCapabilities();
      case_ = GL11.glGetString(7938);
      catch_ = GL11.glGetString(7936);
      private_ = GL11.glGetString(7937);
      rrdJ.byte_("OpenGL Version: " + case_);
      rrdJ.byte_("Vendor:  " + catch_);
      rrdJ.byte_("Renderer: " + private_);
      rrdJ.byte_(
         "Capabilities: "
            + (throws_.OpenGL20 ? " 2.0 " : " - ")
            + (throws_.OpenGL21 ? " 2.1 " : " - ")
            + (throws_.OpenGL30 ? " 3.0 " : " - ")
            + (throws_.OpenGL32 ? " 3.2 " : " - ")
            + (throws_.OpenGL40 ? " 4.0 " : " - ")
      );
      rrdJ.byte_("GL_MAX_DRAW_BUFFERS: " + GL43.glGetInteger(34852));
      rrdJ.byte_("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL43.glGetInteger(36063));
      rrdJ.byte_("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL43.glGetInteger(34930));
      implements_ = throws_.OpenGL30;
      EF = Boolean.getBoolean("gl.debug.groups") && throws_.GL_KHR_debug;
      if (EF) {
         rrdJ.byte_("glDebugGroups: true");
      }

      class_();
   }

   public static void class_(String var0, IntBuffer var1) {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(var0).append(" [pos ").append(var1.position()).append(" lim ").append(var1.limit()).append(" cap ").append(var1.capacity()).append(" :");
      int var3 = var1.limit();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.append(" ").append(var1.get(var4));
      }

      var2.append("]");
      rrdJ.byte_(var2.toString());
   }

   private static String class_(String var0, rrdD[] var1) {
      if (var1 != null && var1.length > 0) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrdD var3 = var1[var2];
            if (var3.case_(var0)) {
               var0 = var3.package_();
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   private static int class_(rrdG var0, String var1) {
      int var2 = 0;
      int var3 = rrbb_3.class_(var1, -1);
      if (var0 == Bp) {
         if (var3 >= 0 && var3 < 2) {
            var2 = 36064 + var3;
            Bu = Math.max(Bu, var3 + 1);
         }

         return var2;
      } else {
         if (var3 >= 0 && var3 < 16) {
            var0.else_()[var3] = true;
            var2 = 36064 + var3;
            BZ = Math.max(BZ, var3 + 1);
            BN = Math.max(BN, var3 + 1);
         }

         return var2;
      }
   }

   private static rrxa_3[] class_(Properties var0, rrdM var1) {
      String var2 = "texture." + var1.class_() + ".";
      Set var3 = var0.keySet();
      ArrayList var4 = new ArrayList();

      for (String var6 : var3) {
         if (var6.startsWith(var2)) {
            String var7 = rrzX_2.protected_(var6, var2);
            var7 = rrzX_2.byte_(var7, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
            String var8 = var0.getProperty(var6).trim();
            int var9 = class_(var1, var7);
            if (var9 < 0) {
               rrdJ.break_("Invalid texture name: " + var6);
            } else {
               rrxa_3 var10 = class_(var9, var8);
               if (var10 != null) {
                  rrdJ.byte_("Custom texture: " + var6 + " = " + var8);
                  var4.add(var10);
               }
            }
         }
      }

      return var4.size() <= 0 ? null : var4.toArray(new rrxa_3[var4.size()]);
   }

   public static boolean class_(HU var0) {
      if (var0 == rrxA_2.class_) {
         return sv.private_();
      } else if (var0 == rrxA_2.byte_) {
         return sF.private_();
      } else if (var0 == rrxA_2.break_) {
         return sL.private_();
      } else {
         return var0 == rrxA_2.protected_ ? sA.private_() : false;
      }
   }

   private static rrxa_3 class_(int var0, String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         if (var1.indexOf(58) >= 0) {
            return break_(var0, var1);
         } else {
            return var1.indexOf(32) >= 0 ? byte_(var0, var1) : protected_(var0, var1);
         }
      }
   }

   private static rrdD[] class_(Map<String, rrdV> var0, rrdD[] var1) {
      HashSet var2 = new HashSet();

      for (String var4 : var0.keySet()) {
         rrdV var5 = (rrdV)var0.get(var4);
         rrdD[] var6 = var5.break_();

         for (int var7 = 0; var7 < var6.length; var7++) {
            rrdD var8 = var6[var7];
            if (var8 != null) {
               var2.add(var8.class_());
            }
         }
      }

      ArrayList var9 = new ArrayList();

      for (int var10 = 0; var10 < var1.length; var10++) {
         rrdD var11 = var1[var10];
         if (var11.native_()) {
            String var12 = var11.class_();
            if (!var2.contains(var12)) {
               var9.add(var11);
            }
         }
      }

      return var9.toArray(new rrdD[var9.size()]);
   }

   public static int class_(String var0, int var1) {
      String var2 = var0 != null ? "screen." + var0 : "screen";
      if (sO == null) {
         return var1;
      } else {
         rrdV var3 = sO.get(var2);
         return var3 == null ? var1 : var3.byte_();
      }
   }

   private static void class_(rrxa_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            if (var0[var1] instanceof rrxV_2 var3) {
               var3.byte_();
            }
         }
      }
   }

   private static int class_(rrdM var0, String var1) {
      if (var0 == rrdM.GBUFFERS) {
         int var2 = rrkG.class_(var1, "colortex", 4, 15);
         if (var2 >= 0) {
            return sD[var2];
         }

         if (var1.equals("texture")) {
            return 0;
         }

         if (var1.equals("lightmap")) {
            return 1;
         }

         if (var1.equals("normals")) {
            return 2;
         }

         if (var1.equals("specular")) {
            return 3;
         }

         if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
            return 4;
         }

         if (var1.equals("shadow")) {
            return Bx ? 5 : 4;
         }

         if (var1.equals("shadowtex1")) {
            return 5;
         }

         if (var1.equals("depthtex0")) {
            return 6;
         }

         if (var1.equals("gaux1")) {
            return 7;
         }

         if (var1.equals("gaux2")) {
            return 8;
         }

         if (var1.equals("gaux3")) {
            return 9;
         }

         if (var1.equals("gaux4")) {
            return 10;
         }

         if (var1.equals("depthtex1")) {
            return 12;
         }

         if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
            return 13;
         }

         if (var1.equals("shadowcolor1")) {
            return 14;
         }

         if (var1.equals("noisetex")) {
            return 15;
         }
      }

      if (var0.break_()) {
         int var3 = rrkG.class_(var1, "colortex", 0, 15);
         if (var3 >= 0) {
            return sD[var3];
         }

         if (var1.equals("colortex0")) {
            return 0;
         }

         if (var1.equals("gdepth")) {
            return 1;
         }

         if (var1.equals("gnormal")) {
            return 2;
         }

         if (var1.equals("composite")) {
            return 3;
         }

         if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
            return 4;
         }

         if (var1.equals("shadow")) {
            return Bx ? 5 : 4;
         }

         if (var1.equals("shadowtex1")) {
            return 5;
         }

         if (var1.equals("depthtex0") || var1.equals("gdepthtex")) {
            return 6;
         }

         if (var1.equals("gaux1")) {
            return 7;
         }

         if (var1.equals("gaux2")) {
            return 8;
         }

         if (var1.equals("gaux3")) {
            return 9;
         }

         if (var1.equals("gaux4")) {
            return 10;
         }

         if (var1.equals("depthtex1")) {
            return 11;
         }

         if (var1.equals("depthtex2")) {
            return 12;
         }

         if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
            return 13;
         }

         if (var1.equals("shadowcolor1")) {
            return 14;
         }

         if (var1.equals("noisetex")) {
            return 15;
         }
      }

      return -1;
   }

   public static rrdD[] class_(rrdD[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrdD var3 = var0[var2];
         if (var3.finally_() && var3.extends_()) {
            var1.add(var3);
         }
      }

      return var1.toArray(new rrdD[var1.size()]);
   }

   private static Properties class_(rrxi_3 var0) throws IOException {
      rrzE_2 var1 = new rrzE_2();
      String var2 = "shaderpacks/" + var0.class_() + ".txt";
      File var3 = new File((File)QY.instanceof_().class_[24], var2);
      if (var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
         return var1;
      } else {
         return var1;
      }
   }

   private static void class_(rrxi_3 var0, Properties var1) throws IOException {
      String var2 = "shaderpacks/" + var0.class_() + ".txt";
      File var3 = new File((File)QY.instanceof_().class_[24], var2);
      if (var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }
   }

   private static void class_(rrdD[] var0, rrxi_3 var1) {
      rrzE_2 var2 = new rrzE_2();
      if (Gr != null) {
         for (int var3 = 0; var3 < var0.length; var3++) {
            rrdD var4 = var0[var3];
            if (var4.extends_() && var4.finally_()) {
               var2.setProperty(var4.class_(), var4.protected_());
            }
         }
      }

      try {
         class_(var1, var2);
      } catch (IOException var5) {
         rrbb_3.protected_("[Shaders] Error saving configuration for " + Ei.class_());
         var5.printStackTrace();
      }
   }

   private static void class_(File var0) {
      if (var0.exists() && var0.isDirectory()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for (int var2 = 0; var2 < var1.length; var2++) {
               File var3 = var1[var2];
               if (var3.isDirectory()) {
                  class_(var3);
               }

               var3.delete();
            }
         }
      }
   }

   private static void class_(rrxf_3 var0, String var1) {
      catch_("pre setupProgram");
      int var2 = break_(var0, var1);
      catch_("create");
      if (var2 != 0) {
         int var3 = ARBShaderObjects.glCreateProgramObjectARB();
         catch_("create");
         if (var2 != 0) {
            ARBShaderObjects.glAttachObjectARB(var3, var2);
            catch_("attach");
         }

         ARBShaderObjects.glLinkProgramARB(var3);
         if (GL43.glGetProgrami(var3, 35714) != 1) {
            rrdJ.class_("Error linking program: " + var3 + " (" + var0.protected_() + ")");
         }

         case_(var3, var0.protected_());
         if (var2 != 0) {
            ARBShaderObjects.glDetachObjectARB(var3, var2);
            ARBShaderObjects.glDeleteObjectARB(var2);
         }

         var0.class_(var3);
         var0.break_(var3);
         ARBShaderObjects.glUseProgramObjectARB(var3);
         ARBShaderObjects.glValidateProgramARB(var3);
         ARBShaderObjects.glUseProgramObjectARB(0);
         case_(var3, var0.protected_());
         int var4 = GL43.glGetProgrami(var3, 35715);
         if (var4 != 1) {
            String var5 = "\"";
            private_("[Shaders] Error: Invalid program " + var5 + var0.protected_() + var5);
            ARBShaderObjects.glDeleteObjectARB(var3);
            boolean var6 = false;
            var0.break_();
         }
      }
   }

   public static void class_(String var0, String var1) {
      try {
         File var2 = new File(sG, "debug/" + var0);
         var2.getParentFile().mkdirs();
         rrbb_3.class_(var2, var1);
      } catch (IOException var3) {
         rrbb_3.protected_("Error saving: " + var0);
         var3.printStackTrace();
      }
   }

   private static void class_(rrdG var0, String var1, String var2, String var3) {
      catch_("pre setupProgram");
      T = false;
      t = false;
      w = false;
      I = false;
      f = false;
      int var4 = break_(var0, var1);
      int var5 = byte_(var0, var2);
      int var6 = protected_(var0, var3);
      catch_("create");
      if (var4 != 0 || var5 != 0 || var6 != 0) {
         int var7 = ARBShaderObjects.glCreateProgramObjectARB();
         catch_("create");
         if (var4 != 0) {
            ARBShaderObjects.glAttachObjectARB(var7, var4);
            catch_("attach");
         }

         if (var5 != 0) {
            ARBShaderObjects.glAttachObjectARB(var7, var5);
            catch_("attach");
            if (Ef) {
               ARBGeometryShader4.glProgramParameteriARB(var7, 36315, 4);
               ARBGeometryShader4.glProgramParameteriARB(var7, 36316, 5);
               ARBGeometryShader4.glProgramParameteriARB(var7, 36314, EV);
               catch_("arbGeometryShader4");
            }

            if (Ej) {
               EXTGeometryShader4.glProgramParameteriEXT(var7, 36315, 4);
               EXTGeometryShader4.glProgramParameteriEXT(var7, 36316, 5);
               EXTGeometryShader4.glProgramParameteriEXT(var7, 36314, EV);
               catch_("extGeometryShader4");
            }

            Eg = true;
         }

         if (var6 != 0) {
            ARBShaderObjects.glAttachObjectARB(var7, var6);
            catch_("attach");
         }

         if (T) {
            ARBVertexShader.glBindAttribLocationARB(var7, F, "mc_Entity");
            catch_("mc_Entity");
         }

         if (t) {
            ARBVertexShader.glBindAttribLocationARB(var7, L, "mc_midTexCoord");
            catch_("mc_midTexCoord");
         }

         if (w) {
            ARBVertexShader.glBindAttribLocationARB(var7, A, "at_tangent");
            catch_("at_tangent");
         }

         if (I) {
            ARBVertexShader.glBindAttribLocationARB(var7, n, "at_velocity");
            catch_("at_velocity");
         }

         if (f) {
            ARBVertexShader.glBindAttribLocationARB(var7, C, "at_midBlock");
            catch_("at_midBlock");
         }

         ARBShaderObjects.glLinkProgramARB(var7);
         if (GL43.glGetProgrami(var7, 35714) != 1) {
            rrdJ.class_("Error linking program: " + var7 + " (" + var0.throws_() + ")");
         }

         case_(var7, var0.throws_());
         if (var4 != 0) {
            ARBShaderObjects.glDetachObjectARB(var7, var4);
            ARBShaderObjects.glDeleteObjectARB(var4);
         }

         if (var5 != 0) {
            ARBShaderObjects.glDetachObjectARB(var7, var5);
            ARBShaderObjects.glDeleteObjectARB(var5);
         }

         if (var6 != 0) {
            ARBShaderObjects.glDetachObjectARB(var7, var6);
            ARBShaderObjects.glDeleteObjectARB(var6);
         }

         var0.class_(var7);
         var0.break_(var7);
         class_(var0);
         ARBShaderObjects.glValidateProgramARB(var7);
         class_(By);
         case_(var7, var0.throws_());
         int var8 = GL43.glGetProgrami(var7, 35715);
         if (var8 != 1) {
            String var9 = "\"";
            private_("[Shaders] Error: Invalid program " + var9 + var0.throws_() + var9);
            ARBShaderObjects.glDeleteObjectARB(var7);
            boolean var10 = false;
            var0.break_();
         }
      }
   }

   private static boolean class_(int var0, String var1, List<String> var2) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      int var4 = GL43.glGetShaderi(var0, 35716);
      if (var4 <= 1) {
         return true;
      } else {
         for (int var5 = 0; var5 < var2.size(); var5++) {
            String var6 = (String)var2.get(var5);
            rrdJ.byte_("File: " + (var5 + 1) + " = " + var6);
         }

         String var7 = GL43.glGetShaderInfoLog(var0, var4);
         var7 = rrzX_2.private_(var7, " \n\r\t");
         rrdJ.byte_("Shader info log: " + var1 + "\n" + var7);
         return false;
      }
   }

   private static void rd() {
      class_(4, GE);
   }

   public static void m() {
      rrdG var0 = Ee.class_();
      class_(var0);
   }

   public static void o() {
      if (volatile_) {
         class_(Be);
      }
   }

   public static void p() {
      try {
         Class var0 = Class.forName("shadersmod.transform.SMCClassTransformer");
      } catch (Throwable var1) {
         return;
      }

      throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
   }

   public static void k() {
      if (volatile_) {
         if (!new_) {
            long_();
            class_(SO);
            MT.package_();
            MT.class_(true);
         } else {
            MT.class_(true);
         }
      }
   }

   public static void default_() {
      final_ = false;
      class_(m ? Bj : Bf);
      H();
      class_(rrdX.NONE);
   }

   private static void rb() {
      if (BF) {
         rp.break_(si[0]);
         rq.break_(si[1]);
         rT.break_(si[2]);
         rt.break_(si[3]);
         rw.break_(si[4]);
         rI.break_(si[5]);
         rf.break_(Er[0]);
         rj.break_(Er[1]);
      }
   }

   public static boolean t() {
      return synchronized_;
   }

   public static void g() {
      Ey = false;
      class_(rrdX.NONE);
   }

   public static void v() {
      m();
   }

   public static boolean j() {
      return Eq;
   }

   public static void q() {
      rc();
      class_(GE);
      class_(GG);
      class_(Gb);
      class_(GM);
      class_(GO);
      if (sr) {
         rrxt_3.break_();
         rrdP.class_();
         rrxo_3.class_();
      }
   }

   public static boolean U() {
      return GJ != null;
   }

   public static void short_() {
      final_ = true;
      Z = true;
      class_(Bg);
      break_(-2, 0);
      class_(rrdX.SKY);
   }

   public static void z() {
      MT.catch_();
      MT.final_();
   }

   public static void void_() {
      class_(Bw, false, GO);
   }

   public static boolean w() {
      return Ep && Eq;
   }

   public static void u() {
      Ee.class_(Sz);
   }

   public static void r() {
      if (volatile_) {
         break_((an_3)null);
         class_(m ? Bj : Bf);
      }
   }

   public static String y() {
      if (Ei == null) {
         return null;
      } else {
         return Ei instanceof rrdN ? null : Ei.class_();
      }
   }

   public static void N() {
      if (final_) {
         class_(Bg);
      } else if (Sz == BI) {
         class_(m ? Bj : Bf);
      }
   }

   private static void rh() {
      El = class_.else_().extends_();
      EH = class_.else_().native_();
      extends_ = Math.round((float)El * Sy);
      native_ = Math.round((float)EH * Sy);
      rJ();
   }

   public static void break_(int var0, int var1) {
      EC++;
      En[EC * 2] = var0 & 65535 | var1 << 16;
      En[EC * 2 + 1] = 0;
   }

   public static void break_(ryO_2 var0) {
      if (Y.case_()) {
         int var1 = byte_(var0);
         Y.break_(var1);
      }
   }

   private static int break_(rrxf_3 var0, String var1) {
      InputStream var2 = Ei.class_(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(37305);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = class_(Gr);
            ArrayList var5 = new ArrayList();
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.class_(new InputStreamReader(var2));
                  var7 = rrks_1.class_(var7, var1, Ei, 0, var5, 0);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = class_(var10, var4);
                     var6.class_(var10);
                     if (var8.class_(var10)) {
                        rrdg_1 var11 = rrkG.class_(var10);
                        if (var11 != null) {
                           if (var11.protected_()) {
                              String var12 = var11.break_();
                              int var13;
                              if ((var13 = rrkG.break_(var12)) >= 0) {
                                 Bm = Math.max(Bm, var13 + 1);
                              } else if ((var13 = rrkG.byte_(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                              } else if ((var13 = rrkG.protected_(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                                 BF = true;
                              } else if ((var13 = rrkG.throws_(var12)) >= 0) {
                                 Bc = Math.max(Bc, var13 + 1);
                              } else if ((var13 = rrkG.case_(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                              } else if ((var13 = rrkG.catch_(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                                 BF = true;
                              }
                           } else if (var11.byte_("in")) {
                              rja_3 var19 = rrkG.finally_(var11.byte_());
                              if (var19 != null) {
                                 var0.class_(var19);
                              } else {
                                 rrdJ.class_("Invalid local size: " + var10);
                              }
                           } else if (var11.catch_("workGroups")) {
                              rja_3 var20 = var11.new_();
                              if (var20 != null) {
                                 var0.break_(var20);
                              } else {
                                 rrdJ.class_("Invalid workGroups: " + var10);
                              }
                           } else if (var11.native_("workGroupsRender")) {
                              rjK_2 var21 = var11.continue_();
                              if (var21 != null) {
                                 var0.class_(var21);
                              } else {
                                 rrdJ.class_("Invalid workGroupsRender: " + var10);
                              }
                           } else if (var11.class_("MipmapEnabled", true)) {
                              String var22 = rrzX_2.throws_(var11.break_(), "MipmapEnabled");
                              int var28 = implements_(var22);
                              if (var28 >= 0) {
                                 int var14 = var0.extends_();
                                 var14 |= 1 << var28;
                                 var0.byte_(var14);
                                 rrdJ.byte_("%s mipmap enabled", var22);
                              }
                           }
                        }
                     }
                  }
               } catch (Exception var15) {
                  rrdJ.class_("Couldn't read " + var1 + "!");
                  var15.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var17 = var6.toString();
            if (sy) {
               class_(var1, var17);
            }

            if (var0.private_() == null) {
               rrdJ.class_("Missing local size: " + var1);
               GL43.glDeleteShader(var3);
               return 0;
            } else {
               ARBShaderObjects.glShaderSourceARB(var3, var17);
               ARBShaderObjects.glCompileShaderARB(var3);
               if (GL43.glGetShaderi(var3, 35713) != 1) {
                  rrdJ.class_("Error compiling compute shader: " + var1);
               }

               class_(var3, var1, var5);
               return var3;
            }
         }
      }
   }

   public static void break_(an_3 var0) {
      if (R.case_()) {
         int var1 = rrWu_1.class_(var0);
         int var2 = rrxo_3.class_(var1);
         R.break_(var2);
      }
   }

   public static int break_(int var0) {
      switch (var0) {
         case 6407:
            return 32849;
         case 6408:
            return 32856;
         case 8194:
            return 33321;
         case 10768:
            return 32849;
         case 32855:
            return 32856;
         case 33319:
            return 33323;
         case 35901:
            return 32852;
         default:
            return var0;
      }
   }

   public static void break_(boolean var0, boolean var1) {
      Ep = var0;
      Eq = var1;
   }

   public static void break_(float var0, float var1, float var2, float var3) {
      if (volatile_ && !new_) {
         g.class_(var0, var1, var2, var3);
      }
   }

   private static void break_(rrdF var0, rrdG var1) {
      int var2 = var0.protected_();
      int var3 = var0.throws_();
      if (var1.public_() != null) {
         Dimension var4 = var1.public_().class_(var2, var3);
         var2 = var4.width;
         var3 = var4.height;
         rrxK_2 var5 = var0.class_(var2, var3, var1.extends_(), false);
         var5.break_();
         GL43.glViewport(0, 0, var2, var3);
      }

      rrdj_1 var9 = var1.super_();
      if (var9 != null) {
         int var10 = (int)((float)var2 * var9.break_());
         int var6 = (int)((float)var3 * var9.byte_());
         int var7 = (int)((float)var2 * var9.class_());
         int var8 = (int)((float)var3 * var9.class_());
         GL43.glViewport(var10, var6, var7, var8);
      }
   }

   public static rrxi_3 break_(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         if (var0.isEmpty() || var0.equals("OFF")) {
            return null;
         } else if (var0.equals("(internal)")) {
            return new rrdz_1();
         } else {
            try {
               File var1 = new File(sG, var0);
               if (var1.isDirectory()) {
                  return new rrdQ(var0, var1);
               } else {
                  return var1.isFile() && var0.toLowerCase().endsWith(".zip") ? new rrdc_1(var0, var1) : null;
               }
            } catch (Exception var2) {
               var2.printStackTrace();
               return null;
            }
         }
      }
   }

   public static void break_(Ml_1 var0, ly_3 var1, float var2) {
      an_3 var3 = var1.catch_();
      rjU_2 var4 = var1.break_();
      double var5 = var4.break_;
      double var7 = var4.byte_;
      double var9 = var4.protected_;
      byte_(var3);
      Pe = var5 - (double)Br;
      Pa = var7;
      Pi = var9 - (double)BP;
      GL43.glViewport(0, 0, Bs, BE);
      GL43.glMatrixMode(5889);
      GL43.glLoadIdentity();
      if (Bh) {
         GL43.glOrtho((double)(-BO), (double)BO, (double)(-BO), (double)BO, 0.05F, 256.0);
      } else {
         MT.class_(rjV_2.class_((double)BM, (float)Bs / (float)BE, 0.05F, 256.0F));
      }

      var0.class_(0.0, 0.0, -100.0);
      var0.class_(rje_3.break_.byte_(90.0F));
      short_ = ((gm_3)class_.class_[56]).protected_(var2);
      default_ = short_ < 0.75F ? short_ + 0.25F : short_ - 0.75F;
      float var11 = short_ * -360.0F;
      float var12 = sI > 0.0F ? var11 % sI - sI * 0.5F : 0.0F;
      if ((double)default_ <= 0.5) {
         var0.class_(rje_3.case_.byte_(var11 - var12));
         var0.class_(rje_3.break_.byte_(sw));
         const_ = default_;
      } else {
         var0.class_(rje_3.case_.byte_(var11 + 180.0F - var12));
         var0.class_(rje_3.break_.byte_(sw));
         const_ = default_ - 0.5F;
      }

      if (Bh) {
         float var13 = sY;
         float var14 = var13 / 2.0F;
         var0.class_((double)((float)var5 % var13 - var14), (double)((float)var7 % var13 - var14), (double)((float)var9 % var13 - var14));
      }

      float var21 = default_ * (float) (Math.PI * 2);
      float var22 = (float)Math.cos((double)var21);
      float var15 = (float)Math.sin((double)var21);
      float var16 = sw * (float) (Math.PI * 2);
      float var17 = var22;
      float var18 = var15 * (float)Math.cos((double)var16);
      float var19 = var15 * (float)Math.sin((double)var16);
      if ((double)default_ > 0.5) {
         var17 = -var22;
         var18 = -var18;
         var19 = -var19;
      }

      try_[0] = var17;
      try_[1] = var18;
      try_[2] = var19;
      try_[3] = 0.0F;
      rk();
      rjV_2 var20 = var0.byte_().class_();
      var20.class_((FloatBuffer)((Buffer)Ek).position(0));
      rrdx_1.class_((FloatBuffer)((Buffer)EW).position(0), (FloatBuffer)((Buffer)Ek).position(0), EM, Eb);
      ((Buffer)Ek).position(0);
      ((Buffer)EW).position(0);
      class_(Pu, false, EO);
      class_(Pm, false, Eh);
      class_(Pc, false, Ez);
      class_(PQ, false, EX);
      class_(PN, false, EJ);
      class_(PZ, false, EQ);
      class_(Pv, false, Ex);
      class_(PF, false, Ed);
      class_(PL, false, Ek);
      class_(PA, false, EW);
      catch_("setCamera");
   }

   private static rrxf_3[] break_(rrdG var0, String var1, String var2, String var3) {
      if (var0.case_() == rrdM.GBUFFERS) {
         return new rrxf_3[0];
      } else {
         ArrayList var4 = new ArrayList();
         byte var5 = 27;

         for (int var6 = 0; var6 < var5; var6++) {
            String var7 = var6 > 0 ? "_" + (char)(97 + var6 - 1) : "";
            String var8 = var2 + var7;
            String var9 = var1 + var8 + var3;
            rrxf_3 var10 = new rrxf_3(var0.throws_(), var0.case_());
            class_(var10, var9);
            if (var10.case_() > 0) {
               var4.add(var10);
               rrdJ.byte_("Compute program loaded: " + var8);
            }
         }

         return var4.toArray(new rrxf_3[var4.size()]);
      }
   }

   public static void break_(rdn_3 var0) {
      synchronized_ = byte_(var0);
   }

   private static rrxa_3 break_(int var0, String var1) {
      String var2 = var1.trim();
      byte var3 = 0;
      if (var2.startsWith("minecraft:textures/")) {
         var2 = rrzX_2.case_(var2, ".png");
         if (var2.endsWith("_n.png")) {
            var2 = rrzX_2.class_(var2, "_n.png", ".png");
            var3 = 1;
         } else if (var2.endsWith("_s.png")) {
            var2 = rrzX_2.class_(var2, "_s.png", ".png");
            var3 = 2;
         }
      }

      if (var2.startsWith("minecraft:dynamic/lightmap_")) {
         var2 = var2.replace("lightmap", "light_map");
      }

      rqO_2 var4 = new rqO_2(var2);
      return new rrxV_2(var0, var4, var3);
   }

   public static void break_(boolean var0) {
      Ey = true;
      if (var0) {
         class_(rrdX.HAND_TRANSLUCENT);
      } else {
         class_(rrdX.HAND_SOLID);
      }
   }

   private static int break_(rrdG var0, String var1) {
      InputStream var2 = Ei.class_(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(35633);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = class_(Gr);
            ArrayList var5 = new ArrayList();
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.class_(new InputStreamReader(var2));
                  var7 = rrks_1.class_(var7, var1, Ei, 0, var5, 0);
                  var7 = rrks_1.class_(var7);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = class_(var10, var4);
                     var6.class_(var10);
                     if (var8.class_(var10)) {
                        rrdg_1 var11 = rrkG.class_(var10);
                        if (var11 != null) {
                           if (var11.break_("mc_Entity")) {
                              l = true;
                              T = true;
                           } else if (var11.break_("mc_midTexCoord")) {
                              H = true;
                              t = true;
                           } else if (var11.break_("at_tangent")) {
                              y = true;
                              w = true;
                           } else if (var11.break_("at_velocity")) {
                              p = true;
                              I = true;
                           } else if (var11.break_("at_midBlock")) {
                              q = true;
                              f = true;
                           }

                           if (var11.throws_("countInstances")) {
                              var0.protected_(var11.package_());
                              rrdJ.byte_("countInstances: " + var0.final_());
                           }
                        }
                     }
                  }
               } catch (Exception var12) {
                  rrdJ.class_("Couldn't read " + var1 + "!");
                  var12.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var15 = var6.toString();
            if (sy) {
               class_(var1, var15);
            }

            ARBShaderObjects.glShaderSourceARB(var3, var15);
            ARBShaderObjects.glCompileShaderARB(var3);
            if (GL43.glGetShaderi(var3, 35713) != 1) {
               rrdJ.class_("Error compiling vertex shader: " + var1);
            }

            class_(var3, var1, var5);
            return var3;
         }
      }
   }

   public static String break_(String var0, String var1) {
      String var2 = GB.get(var0);
      return var2 == null ? var1 : var2;
   }

   public static void break_() {
      rrdJ.byte_("Save shaders configuration.");
      if (Sm == null) {
         Sm = new rrzE_2();
      }

      rrdy_1[] var0 = rrdy_1.values();

      for (int var1 = 0; var1 < var0.length; var1++) {
         rrdy_1 var2 = var0[var1];
         String var3 = var2.break_();
         String var4 = class_(var2);
         Sm.setProperty(var3, var4);
      }

      try {
         FileWriter var6 = new FileWriter(sb);
         Sm.store(var6, (String)null);
         var6.close();
      } catch (Exception var5) {
         rrdJ.class_("Error saving configuration: " + var5.getClass().getName() + ": " + var5.getMessage());
      }
   }

   private static void break_(rrdG var0) {
      int var1 = GL43.glGetInteger(34852);
      Arrays.fill(var0.else_(), false);
      if (var0 == Sd) {
         var0.class_((rrxY_2)null);
      } else if (var0.private_() == 0) {
         if (var0 == Bp) {
            var0.class_(EZ);
         } else {
            var0.class_(Ev[0]);
         }
      } else {
         String[] var2 = var0.finally_();
         if (var2 == null) {
            if (var0 != Bp && var0 != Bq && var0 != BT) {
               var0.class_(Eu);
               Bv = Math.min(BN, var1);
               Arrays.fill(var0.else_(), 0, BN, true);
            } else {
               var0.class_(Em);
            }
         } else {
            rrxY_2 var3 = var0.native_();
            int var4 = var2.length;
            Bv = Math.max(Bv, var4);
            var4 = Math.min(var4, var1);
            var0.class_(var3);
            var3.protected_(var4);

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = class_(var0, var2[var5]);
               var3.class_(var5, var6);
            }

            String var8 = var3.class_(false);
            String var9 = var3.class_(true);
            if (!rrbb_3.class_((Object)var8, (Object)var9)) {
               rrdJ.byte_("Draw buffers: " + var8 + " -> " + var9);
            }
         }
      }
   }

   private static rrdD[] break_(rrdD[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrdD var3 = var0[var2];
         if (var3.native_()) {
            var1.add(var3);
         }
      }

      return var1.toArray(new rrdD[var1.size()]);
   }

   public static void break_(Ml_1 var0) {
      rjV_2 var1 = var0.byte_().class_();
      rjV_2 var2 = new rjV_2(var1);
      var2.protected_();
      var2.class_(Ew);
      rrdx_1.break_(return_, Ew, throw_);
      rrdx_1.break_(public_, Ew, interface_);
      System.arraycopy(const_ == default_ ? return_ : public_, 0, goto_, 0, 3);
      class_(PJ, 0.0F, 0.0F, 0.0F);
      class_(Px, 0.0F, 0.0F, 0.0F);
      class_(Pd, 0.0F, 0.0F, 0.0F);
      if (GJ != null) {
         GJ.class_();
      }

      catch_("postCelestialRotate");
   }

   private static void break_(rrxa_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            rrxa_3 var2 = var0[var1];
            MT.new_(33984 + var2.class_());
            int var3 = var2.protected_();
            int var4 = var2.af_();
            if (var4 == 3553) {
               MT.super_(var3);
            } else {
               GL11.glBindTexture(var4, var3);
            }
         }

         MT.new_(33984);
      }
   }

   public static rrdD[] throws_() {
      return Gr;
   }

   public static boolean throws_(String var0) {
      return GP == null ? false : GP.contains(var0);
   }

   private static String throws_(int var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      if (var0 == 1286) {
         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         String var4 = continue_(var3);
         String var5 = ", fbStatus: " + var3 + " (" + var4 + ")";
         var2.append(var5);
      }

      String var6 = Sz.throws_();
      if (var6.isEmpty()) {
         var6 = "none";
      }

      var2.append(", program: " + var6);
      rrdG var7 = new_(SQ);
      if (var7 != Sz) {
         String var8 = var7.throws_();
         if (var8.isEmpty()) {
            var8 = "none";
         }

         var2.append(" (" + var8 + ")");
      }

      if (var1.equals("setDrawBuffers")) {
         var2.append(", drawBuffers: " + rrki_1.class_(Sz.finally_()));
      }

      return var2.toString();
   }

   public static void throws_(int var0) {
      GL43.glEnable(var0);
      if (var0 == 3553) {
         N();
      } else if (var0 == 2912) {
         F();
      }
   }

   private static void throws_(rrdG var0) {
      if (var0.case_().byte_()) {
         rrWz_1 var1 = null;
         int var2 = 0;
         int var3 = 0;
         rrxY_2 var4 = var0.extends_();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.break_(); var5++) {
               int var6 = var4.class_(var5);
               int var7 = var6 - 36064;
               if (var7 >= 0 && var7 < GX.length) {
                  rrWz_1 var8 = GX[var7];
                  if (var8 != null) {
                     var2++;
                     if (var1 == null) {
                        var1 = var8;
                     }

                     if (var8.equals(var1)) {
                        var3++;
                     }
                  }
               }
            }

            if (var2 != 0) {
               if (var3 != var4.break_()) {
                  rrdJ.class_("Program " + var0.throws_() + " draws to buffers with different sizes");
               } else {
                  var0.class_(var1);
               }
            }
         }
      }
   }

   public static void throws_(Ml_1 var0) {
      byte_(var0);
      GL11.glColor3f(sV, sg, sR);
      protected_(var0);
      GL11.glColor3f(abstract_, long_, float_);
   }

   public static void L() {
      Z = false;
      class_(rK, 0);
   }

   public static void M() {
      class_(Bf);
      class_(rrdX.PARTICLES);
   }

   public static void W() {
      if (volatile_) {
         if (new_) {
         }

         class_(m ? Bj : Bf);
      }
   }

   public static void H() {
      En[EC * 2] = 0;
      En[EC * 2 + 1] = 0;
      EC--;
   }

   public static boolean R() {
      return Ey;
   }

   public static void P() {
      if (volatile_) {
         continue_ = true;
      }
   }

   public static boolean finally_() {
      return !sk.catch_() ? sk.private_() : true;
   }

   public static InputStream finally_(String var0) {
      return Ei == null ? null : Ei.class_(var0);
   }

   public static void finally_(int var0) {
      GL43.glDisable(var0);
      L();
   }

   public static ArrayList catch_() {
      ArrayList var0 = new ArrayList();
      ArrayList var1 = new ArrayList();

      try {
         if (!sG.exists()) {
            sG.mkdir();
         }

         File[] var2 = sG.listFiles();

         for (int var3 = 0; var3 < var2.length; var3++) {
            File var4 = var2[var3];
            String var5 = var4.getName();
            if (var4.isDirectory()) {
               if (!var5.equals("debug")) {
                  File var6 = new File(var4, "shaders");
                  if (var6.exists() && var6.isDirectory()) {
                     var0.add(var5);
                  }
               }
            } else if (var4.isFile() && var5.toLowerCase().endsWith(".zip")) {
               var1.add(var5);
            }
         }
      } catch (Exception var7) {
      }

      Collections.sort(var0, String.CASE_INSENSITIVE_ORDER);
      Collections.sort(var1, String.CASE_INSENSITIVE_ORDER);
      ArrayList var8 = new ArrayList();
      var8.add("OFF");
      var8.add("(internal)");
      var8.addAll(var0);
      var8.addAll(var1);
      return var8;
   }

   public static void catch_(int var0) {
      GL43.glEnable(var0);
      N();
   }

   public static void catch_(Ml_1 var0) {
      catch_("pre endHand");
      case_("pre endHand");
      var0.break_();
      GL43.glMatrixMode(5889);
      GL43.glPopMatrix();
      GL43.glMatrixMode(5888);
      GL43.glPopMatrix();
      MT.break_(770, 771);
      catch_("endHand");
   }

   public static int catch_(String var0) {
      int var1 = MT.switch_();
      if (var1 != 0 && rrbo_3.class_(var1)) {
         String var2 = rrbb_3.byte_(var1);
         String var3 = throws_(var1, var0);
         String var4 = String.format("OpenGL error: %s (%s)%s, at: %s", var1, var2, var3, var0);
         rrdJ.class_(var4);
         if (rrbb_3.rT() && rrzQ_2.class_("ShowGlErrorShaders", 10000L)) {
            String var5 = jI_2.class_("of.message.openglError", var1, var2);
            volatile_(var5);
         }
      }

      return var1;
   }

   public static void G() {
      if (volatile_) {
         catch_("endBlockEntities");
         break_((ryO_2)null);
         class_(m ? Bj : Bf);
         rrdA.class_(SZ.this_());
      }
   }

   public static void O() {
      class_(Bj);
      class_(rrdX.NONE);
   }

   public static int extends_(int var0) {
      En[EC * 2] = En[EC * 2] & 65535 | var0 << 16;
      return var0;
   }

   public static boolean extends_() {
      if (!SR.catch_()) {
         return SR.private_();
      } else {
         return !sx.catch_() ? sx.private_() : true;
      }
   }

   public static boolean extends_(String var0) {
      if (var0 == null) {
         return false;
      } else if (var0.length() <= 0) {
         return false;
      } else {
         int var1 = var0.lastIndexOf("/");
         if (var1 >= 0) {
            var0 = var0.substring(var1 + 1);
         }

         rrdG var2 = native_(var0);
         return var2 != null;
      }
   }

   public static void goto_() {
      rrdJ.byte_("Reset model renderers");
      finally_++;
      rrdJ.byte_("Reset world renderers");
      ((yX_2)class_.class_[8]).throws_();
   }

   public static gm_3 K() {
      return GS;
   }

   public static void case_(int var0) {
      GL43.glDisable(var0);
      if (var0 == 3553) {
         c();
      } else if (var0 == 2912) {
         L();
      }
   }

   public static void case_() {
      class_(Gr, Ei);
   }

   public static void case_(Ml_1 var0) {
      if ((double)SH != 1.0) {
         var0.class_(1.0F, 1.0F, SH);
      }
   }

   private static boolean case_(int var0, String var1) {
      IntBuffer var2 = BufferUtils.createIntBuffer(1);
      ARBShaderObjects.glGetObjectParameterivARB(var0, 35716, var2);
      int var3 = var2.get();
      if (var3 > 1) {
         ByteBuffer var4 = BufferUtils.createByteBuffer(var3);
         ((Buffer)var2).flip();
         ARBShaderObjects.glGetInfoLogARB(var0, var2, var4);
         byte[] var5 = new byte[var3];
         var4.get(var5);
         if (var5[var3 - 1] == 0) {
            var5[var3 - 1] = 10;
         }

         String var6 = new String(var5, StandardCharsets.US_ASCII);
         var6 = rrzX_2.private_(var6, " \n\r\t");
         rrdJ.byte_("Info log: " + var1 + "\n" + var6);
         return false;
      } else {
         return true;
      }
   }

   public static int case_(String var0) {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var1 != 36053) {
         rrdJ.class_("FramebufferStatus 0x%04X at '%s'", var1, var0);
      }

      return var1;
   }

   public static void const_() {
      catch_("beginUpdateChunks1");
      case_("beginUpdateChunks1");
      if (!new_) {
         class_(BY);
      }

      catch_("beginUpdateChunks2");
      case_("beginUpdateChunks2");
   }

   public static boolean continue_() {
      return !sm.implements_();
   }

   private static String continue_(int var0) {
      switch (var0) {
         case 33305:
            return "Undefined";
         case 36053:
            return "Complete";
         case 36054:
            return "Incomplete attachment";
         case 36055:
            return "Incomplete missing attachment";
         case 36059:
            return "Incomplete draw buffer";
         case 36060:
            return "Incomplete read buffer";
         case 36061:
            return "Unsupported";
         case 36182:
            return "Incomplete multisample";
         case 36264:
            return "Incomplete layer targets";
         default:
            return "Unknown";
      }
   }

   public static boolean else_() {
      return sC.private_();
   }

   public static void for_() {
      if (volatile_) {
         class_(Sr);
         class_(rrdX.ENTITIES);
      }
   }

   public static int implements_(String var0) {
      int var1 = rrkG.class_(var0, "colortex", 0, 15);
      if (var1 >= 0) {
         return var1;
      } else {
         int var2 = rrkG.class_(var0, "colorimg", 0, 15);
         if (var2 >= 0) {
            return var2;
         } else if (var0.equals("gcolor")) {
            return 0;
         } else if (var0.equals("gdepth")) {
            return 1;
         } else if (var0.equals("gnormal")) {
            return 2;
         } else if (var0.equals("composite")) {
            return 3;
         } else if (var0.equals("gaux1")) {
            return 4;
         } else if (var0.equals("gaux2")) {
            return 5;
         } else if (var0.equals("gaux3")) {
            return 6;
         } else {
            return var0.equals("gaux4") ? 7 : -1;
         }
      }
   }

   public static boolean implements_() {
      if (!SY.catch_()) {
         return SY.private_();
      } else {
         return !sd.catch_() ? sd.private_() : true;
      }
   }

   public static void implements_(int var0) {
      GL43.glEnable(var0);
      F();
   }

   public static void import_() {
      if (new_) {
         catch_("shadow endRender");
      } else {
         if (!package_) {
            float_();
         }

         volatile_ = false;
         MT.class_(true, true, true, true);
         class_(By);
         class_(rrdX.NONE);
         HF.break_();
         catch_("endRender end");
      }
   }

   public static void instanceof_() {
      BS = true;
   }

   public static boolean new_() {
      return !su.implements_();
   }

   private static rrdG new_(int var0) {
      for (int var1 = 0; var1 < SW.length; var1++) {
         rrdG var2 = SW[var1];
         if (var2.private_() == var0) {
            return var2;
         }
      }

      return By;
   }

   public static boolean package_() {
      return !sN.implements_();
   }

   private static String package_(String var0) {
      int var1 = var0.indexOf(95);
      return var1 < 0 ? var0 : var0.substring(0, var1) + var0.substring(var1).toUpperCase(Locale.ROOT);
   }

   private static FloatBuffer package_(int var0) {
      ByteBuffer var1 = Gz;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0 * 4);
      return var1.asFloatBuffer();
   }

   public static boolean return_() {
      return !sH.implements_();
   }

   private static rji_3 super_(int var0) {
      rji_3 var1 = BC[var0];
      if (var1 != null) {
         return var1;
      } else if (var0 == 0) {
         return char_;
      } else {
         return var0 == 1 ? EK : Eo;
      }
   }

   public static boolean super_() {
      return !sZ.implements_();
   }

   public static void switch_() {
      if (volatile_ && SS.private_() != By.private_()) {
         class_(Sr);
         MT.protected_();
      }
   }

   public static void throw_() {
      if (new_) {
         catch_("shadow clear pre");
         BA.class_(new rji_3(1.0F, 1.0F, 1.0F, 1.0F));
         catch_("shadow clear");
      } else {
         catch_("clear pre");
         rji_3[] var0 = new rji_3[BN];

         for (int var1 = 0; var1 < var0.length; var1++) {
            var0[var1] = super_(var1);
         }

         BL.class_(Bn, var0);
         BL.finally_();
         case_("clear");
         catch_("clear");
      }
   }

   public static void try_() {
      EH = 0;
   }

   public static void while_() {
      if (protected_) {
         catch_("Shaders.uninit pre");

         for (int var0 = 0; var0 < SW.length; var0++) {
            rrdG var1 = SW[var0];
            if (var1.implements_() != 0) {
               ARBShaderObjects.glDeleteObjectARB(var1.implements_());
               catch_("del programRef");
            }

            var1.break_(0);
            var1.class_(0);
            var1.class_((String[])null);
            var1.class_((rrxY_2)null);
            var1.byte_(0);
            rrxf_3[] var2 = var1.goto_();

            for (int var3 = 0; var3 < var2.length; var3++) {
               rrxf_3 var4 = var2[var3];
               if (var4.catch_() != 0) {
                  ARBShaderObjects.glDeleteObjectARB(var4.catch_());
                  catch_("del programRef");
               }

               var4.break_(0);
               var4.class_(0);
            }

            var1.class_(new rrxf_3[0]);
         }

         Ea = false;
         SN = false;
         Sc = false;
         if (BL != null) {
            BL.break_();
            BL = null;
            catch_("del dfb");
         }

         if (BA != null) {
            BA.break_();
            BA = null;
            catch_("del sfb");
         }

         if (Eu != null) {
            class_(Eu);
         }

         if (Em != null) {
            class_(Em);
         }

         if (Gx != null) {
            Gx.throws_();
            Gx = null;
         }

         for (int var5 = 0; var5 < si.length; var5++) {
            MT.class_(si[var5], 0, 0, false, 0, 35000, 32856);
         }

         rrdJ.byte_("Uninit");
         BB = false;
         BJ = false;
         protected_ = false;
         catch_("Shaders.uninit");
      }
   }

   private static void rs() {
      sJ.case_();
      sd.case_();
      sk.case_();
      sW.case_();
      sz.case_();
      sQ.case_();
      sN.case_();
      sc.case_();
      su.case_();
      sm.case_();
      sZ.case_();
      sv.case_();
      sF.case_();
      sL.case_();
      sA.case_();
      sn.case_();
      sC.case_();
      sH.case_();
      rrxt_3.protected_();
      rrdP.break_();
      rrxo_3.break_();
      GJ = null;

      for (int var0 = 0; var0 < SW.length; var0++) {
         rrdG var1 = SW[var0];
         var1.class_();
      }

      Arrays.fill(GX, null);
      if (Ei != null) {
         rrxt_3.class_(Ei);
         rrdP.class_(Ei);
         rrxo_3.class_(Ei);
         String var4 = "/shaders/shaders.properties";

         try {
            InputStream var5 = Ei.class_(var4);
            if (var5 == null) {
               return;
            }

            var5 = rrdT.class_(var5, var4, true);
            rrzE_2 var2 = new rrzE_2();
            var2.load(var5);
            var5.close();
            sJ.class_(var2);
            sd.class_(var2);
            sk.class_(var2);
            sW.class_(var2);
            sz.class_(var2);
            sQ.class_(var2);
            sN.class_(var2);
            sc.class_(var2);
            su.class_(var2);
            sZ.class_(var2);
            sm.class_(var2);
            sv.class_(var2);
            sF.class_(var2);
            sL.class_(var2);
            sA.class_(var2);
            sn.class_(var2);
            sC.class_(var2);
            sH.class_(var2);
            sh = rrks_1.break_(var2, Gr);
            GE = class_(var2, rrdM.GBUFFERS);
            GG = class_(var2, rrdM.COMPOSITE);
            Gb = class_(var2, rrdM.DEFERRED);
            GM = class_(var2, rrdM.SHADOWCOMP);
            GO = class_(var2, rrdM.PREPARE);
            Gh = var2.getProperty("texture.noise");
            if (Gh != null) {
               Gd = true;
            }

            GJ = rrks_1.class_(var2);
            rrks_1.break_(var2);
            rrks_1.byte_(var2);
            rrks_1.protected_(var2);
            rrks_1.throws_(var2);
            GX = rrks_1.class_(var2, 16);
         } catch (IOException var3) {
            rrbb_3.protected_("[Shaders] Error reading: " + var4);
         }
      }
   }

   public static void static_() {
      class_(BA, Bt, false, GM);
   }

   public static void public_() {
      boolean var0;
      if (!byte_) {
         byte_ = true;
         var0 = true;
      } else {
         var0 = false;
      }

      if (!protected_) {
         catch_("Shaders.init pre");
         if (y() != null) {
         }

         if (!throws_.OpenGL20) {
            private_("No OpenGL 2.0");
         }

         if (!throws_.GL_EXT_framebuffer_object) {
            private_("No EXT_framebuffer_object");
         }

         Eu.byte_(0).protected_(8);
         Em.byte_(0).protected_(8);
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
         sw = 0.0F;
         sY = 2.0F;
         Bs = 1024;
         BE = 1024;
         BG = 1024;
         Bb = 1024;
         BM = 90.0F;
         BO = 160.0F;
         Bh = true;
         BX = -1.0F;
         st = -1.0F;
         l = false;
         H = false;
         y = false;
         p = false;
         Bx = false;
         Eg = false;
         private_();
         rrkT.break_();
         ER.class_();
         if (GJ != null) {
            GJ.break_();
         }

         rrkb_1 var1 = rrdm_1.class_(sM, Gr, false);
         String var2 = "";
         if (GS != null) {
            int var3 = rrzc_3.class_(GS.E());
            if (Gs.contains(var3)) {
               var2 = "world" + var3 + "/";
            }
         }

         rs();

         for (int var14 = 0; var14 < SW.length; var14++) {
            rrdG var4 = SW[var14];
            var4.break_();
            var4.byte_();
            if (var4.case_() != rrdM.NONE) {
               String var5 = var4.throws_();
               String var6 = var2 + var5;
               boolean var7 = true;
               if (sh.containsKey(var6)) {
                  var7 = var7 && sh.get(var6).break_();
               }

               if (var1 != null) {
                  var7 = var7 && !var1.protected_(var6);
               }

               if (!var7) {
                  rrdJ.byte_("Program disabled: " + var6);
                  var5 = "<disabled>";
                  var6 = var2 + var5;
               }

               String var8 = "/shaders/" + var6;
               String var9 = var8 + ".vsh";
               String var10 = var8 + ".gsh";
               String var11 = var8 + ".fsh";
               rrxf_3[] var12 = break_(var4, "/shaders/", var6, ".csh");
               var4.class_(var12);
               rrbb_3.class_(10L);
               class_(var4, var9, var10, var11);
               int var13 = var4.private_();
               if (var13 > 0) {
                  rrdJ.byte_("Program loaded: " + var6);
               }

               break_(var4);
               byte_(var4);
               protected_(var4);
               throws_(var4);
            }
         }

         Ea = rrdO.class_(Sb);
         SN = rrdO.class_(Bt);
         Sc = rrdO.class_(Bw);
         BZ = BN;
         if (Bm > 0 || Bu > 0) {
            BB = true;
            Bm = Math.max(Bm, 1);
         }

         BJ = BB;
         rrdJ.byte_("usedColorBuffers: " + BN);
         rrdJ.byte_("usedDepthBuffers: " + Bc);
         rrdJ.byte_("usedShadowColorBuffers: " + Bu);
         rrdJ.byte_("usedShadowDepthBuffers: " + Bm);
         rrdJ.byte_("usedColorAttachs: " + BZ);
         rrdJ.byte_("usedDrawBuffers: " + Bv);
         rrdJ.byte_("bindImageTextures: " + BF);
         int var15 = GL43.glGetInteger(34852);
         if (Bv > var15) {
            private_("[Shaders] Error: Not enough draw buffers, needed: " + Bv + ", available: " + var15);
            Bv = var15;
         }

         Eu.byte_(0).protected_(Bv);

         for (int var16 = 0; var16 < Bv; var16++) {
            Eu.class_(var16, 36064 + var16);
         }

         Em.byte_(0).protected_(Bu);

         for (int var17 = 0; var17 < Bu; var17++) {
            Em.class_(var17, 36064 + var17);
         }

         for (int var18 = 0; var18 < SW.length; var18++) {
            rrdG var21 = SW[var18];
            rrdG var22 = var21;

            while (var22.private_() == 0 && var22.catch_() != var22) {
               var22 = var22.catch_();
            }

            if (var22 != var21 && var21 != Bp) {
               var21.class_(var22);
            }
         }

         rh();
         rX();
         if (Gd) {
            rM();
         }

         if (SZ == null) {
            SZ = rrdA.class_();
         }

         Ml_1 var19 = new Ml_1();
         var19.class_(rje_3.protected_.byte_(-90.0F));
         class_(var19);
         break_(var19);
         protected_ = true;
         rO();
         goto_();
         if (!var0) {
         }

         catch_("Shaders.init");
      }
   }

   public static rrdD protected_(String var0) {
      return rrdm_1.class_(var0, Gr);
   }

   private static void protected_(an_3 var0) {
      if (var0 == null) {
         Br = 0;
         BP = 0;
      } else {
         Br = (int)var0.rx() / 1000 * 1000;
         BP = (int)var0.BO() / 1000 * 1000;
      }
   }

   private static rrxa_3 protected_(int var0, String var1) {
      var1 = var1.trim();
      if (var1.indexOf(46) < 0) {
         var1 = var1 + ".png";
      }

      try {
         String var2 = "shaders/" + rrzX_2.protected_(var1, "/");
         InputStream var3 = Ei.class_(var2);
         if (var3 == null) {
            rrdJ.break_("Texture not found: " + var1);
            return null;
         } else {
            IOUtils.closeQuietly(var3);
            rrdl_1 var4 = new rrdl_1(var2);
            var4.a_(class_.F());
            return new rrxj_3(var0, var2, var4);
         }
      } catch (IOException var5) {
         rrdJ.break_("Error loading texture: " + var1);
         rrdJ.break_(var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      }
   }

   public static void protected_(Ml_1 var0) {
      lD_2 var1 = yb_3.class_().byte_();
      float var2 = (float)(((Qw_1)class_.class_[20]).break_ * 16);
      double var3 = (double)var2 * 0.9238;
      double var5 = (double)var2 * 0.3826;
      double var7 = -var5;
      double var9 = -var3;
      double var11 = 16.0;
      double var13 = -Pa + GS.synchronized_().volatile_() + 12.0 - 16.0;
      if (Pa < GS.synchronized_().volatile_()) {
         var13 = -4.0;
      }

      MT.transient_();
      MT.class_(var0.byte_().class_());
      var1.class_(7, ju_3.super_);
      var1.class_(var7, var13, var9).class_();
      var1.class_(var7, var11, var9).class_();
      var1.class_(var9, var11, var7).class_();
      var1.class_(var9, var13, var7).class_();
      var1.class_(var9, var13, var7).class_();
      var1.class_(var9, var11, var7).class_();
      var1.class_(var9, var11, var5).class_();
      var1.class_(var9, var13, var5).class_();
      var1.class_(var9, var13, var5).class_();
      var1.class_(var9, var11, var5).class_();
      var1.class_(var7, var11, var3).class_();
      var1.class_(var7, var13, var3).class_();
      var1.class_(var7, var13, var3).class_();
      var1.class_(var7, var11, var3).class_();
      var1.class_(var5, var11, var3).class_();
      var1.class_(var5, var13, var3).class_();
      var1.class_(var5, var13, var3).class_();
      var1.class_(var5, var11, var3).class_();
      var1.class_(var3, var11, var5).class_();
      var1.class_(var3, var13, var5).class_();
      var1.class_(var3, var13, var5).class_();
      var1.class_(var3, var11, var5).class_();
      var1.class_(var3, var11, var7).class_();
      var1.class_(var3, var13, var7).class_();
      var1.class_(var3, var13, var7).class_();
      var1.class_(var3, var11, var7).class_();
      var1.class_(var5, var11, var9).class_();
      var1.class_(var5, var13, var9).class_();
      var1.class_(var5, var13, var9).class_();
      var1.class_(var5, var11, var9).class_();
      var1.class_(var7, var11, var9).class_();
      var1.class_(var7, var13, var9).class_();
      var1.class_(var9, var13, var9).class_();
      var1.class_(var9, var13, var3).class_();
      var1.class_(var3, var13, var3).class_();
      var1.class_(var3, var13, var9).class_();
      yb_3.class_().break_();
      MT.for_();
   }

   private static void protected_(rrdG var0) {
      boolean[] var1 = var0.else_();
      Boolean[] var2 = var0.this_();

      for (int var3 = 0; var3 < var2.length; var3++) {
         Boolean var4 = var2[var3];
         if (var4 != null) {
            var1[var3] = var4;
         }
      }
   }

   public static void protected_(int var0) {
      sf = var0;
      if (Z) {
         class_(rK, var0);
      }
   }

   private static int protected_(rrdG var0, String var1) {
      InputStream var2 = Ei.class_(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(35632);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = class_(Gr);
            ArrayList var5 = new ArrayList();
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.class_(new InputStreamReader(var2));
                  var7 = rrks_1.class_(var7, var1, Ei, 0, var5, 0);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = class_(var10, var4);
                     var6.class_(var10);
                     if (var8.class_(var10)) {
                        rrdg_1 var11 = rrkG.class_(var10);
                        if (var11 != null) {
                           if (var11.protected_()) {
                              String var12 = var11.break_();
                              int var13;
                              if ((var13 = rrkG.break_(var12)) >= 0) {
                                 Bm = Math.max(Bm, var13 + 1);
                              } else if ((var13 = rrkG.byte_(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                              } else if ((var13 = rrkG.protected_(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                                 BF = true;
                              } else if ((var13 = rrkG.throws_(var12)) >= 0) {
                                 Bc = Math.max(Bc, var13 + 1);
                              } else if (var12.equals("gdepth") && EY[1] == 6408) {
                                 EY[1] = 34836;
                              } else if ((var13 = rrkG.case_(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                              } else if ((var13 = rrkG.catch_(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                                 BF = true;
                              } else if (var12.equals("centerDepthSmooth")) {
                                 Q = true;
                              }
                           } else if (var11.throws_("shadowMapResolution") || var11.protected_("SHADOWRES")) {
                              BG = Bb = var11.package_();
                              Bs = BE = Math.round((float)BG * Sp);
                              rrdJ.byte_("Shadow map resolution: " + BG);
                           } else if (var11.private_("shadowMapFov") || var11.protected_("SHADOWFOV")) {
                              BM = var11.int_();
                              Bh = false;
                              rrdJ.byte_("Shadow map field of view: " + BM);
                           } else if (var11.private_("shadowDistance") || var11.protected_("SHADOWHPL")) {
                              BO = var11.int_();
                              Bh = true;
                              rrdJ.byte_("Shadow map distance: " + BO);
                           } else if (var11.private_("shadowDistanceRenderMul")) {
                              BX = var11.int_();
                              rrdJ.byte_("Shadow distance render mul: " + BX);
                           } else if (var11.private_("shadowIntervalSize")) {
                              sY = var11.int_();
                              rrdJ.byte_("Shadow map interval size: " + sY);
                           } else if (var11.break_("generateShadowMipmap", true)) {
                              Arrays.fill(SF, true);
                              rrdJ.byte_("Generate shadow mipmap");
                           } else if (var11.break_("generateShadowColorMipmap", true)) {
                              Arrays.fill(SA, true);
                              rrdJ.byte_("Generate shadow color mipmap");
                           } else if (var11.break_("shadowHardwareFiltering", true)) {
                              Arrays.fill(Sv, true);
                              rrdJ.byte_("Hardware shadow filtering enabled.");
                           } else if (var11.break_("shadowHardwareFiltering0", true)) {
                              Sv[0] = true;
                              rrdJ.byte_("shadowHardwareFiltering0");
                           } else if (var11.break_("shadowHardwareFiltering1", true)) {
                              Sv[1] = true;
                              rrdJ.byte_("shadowHardwareFiltering1");
                           } else if (var11.class_("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                              SF[0] = true;
                              rrdJ.byte_("shadowtex0Mipmap");
                           } else if (var11.break_("shadowtex1Mipmap", true)) {
                              SF[1] = true;
                              rrdJ.byte_("shadowtex1Mipmap");
                           } else if (var11.class_("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                              SA[0] = true;
                              rrdJ.byte_("shadowcolor0Mipmap");
                           } else if (var11.class_("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                              SA[1] = true;
                              rrdJ.byte_("shadowcolor1Mipmap");
                           } else if (var11.class_("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                              SL[0] = true;
                              rrdJ.byte_("shadowtex0Nearest");
                           } else if (var11.class_("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                              SL[1] = true;
                              rrdJ.byte_("shadowtex1Nearest");
                           } else if (var11.class_("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                              Sn[0] = true;
                              rrdJ.byte_("shadowcolor0Nearest");
                           } else if (var11.class_("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                              Sn[1] = true;
                              rrdJ.byte_("shadowcolor1Nearest");
                           } else if (var11.private_("wetnessHalflife") || var11.protected_("WETNESSHL")) {
                              G = var11.int_();
                              rrdJ.byte_("Wetness halflife: " + G);
                           } else if (var11.private_("drynessHalflife") || var11.protected_("DRYNESSHL")) {
                              b = var11.int_();
                              rrdJ.byte_("Dryness halflife: " + b);
                           } else if (var11.private_("eyeBrightnessHalflife")) {
                              M = var11.int_();
                              rrdJ.byte_("Eye brightness halflife: " + M);
                           } else if (var11.private_("centerDepthHalflife")) {
                              z = var11.int_();
                              rrdJ.byte_("Center depth halflife: " + z);
                           } else if (var11.private_("sunPathRotation")) {
                              sw = var11.int_();
                              rrdJ.byte_("Sun path rotation: " + sw);
                           } else if (var11.private_("ambientOcclusionLevel")) {
                              st = rrbb_3.class_(var11.int_(), 0.0F, 1.0F);
                              rrdJ.byte_("AO Level: " + st);
                           } else if (var11.throws_("superSamplingLevel")) {
                              int var21 = var11.package_();
                              if (var21 > 1) {
                                 rrdJ.byte_("Super sampling level: " + var21 + "x");
                                 N = var21;
                              } else {
                                 N = 1;
                              }
                           } else if (var11.throws_("noiseTextureResolution")) {
                              Gk = var11.package_();
                              Gd = true;
                              rrdJ.byte_("Noise texture enabled");
                              rrdJ.byte_("Noise texture resolution: " + Gk);
                           } else if (var11.case_("Format")) {
                              String var22 = rrzX_2.throws_(var11.break_(), "Format");
                              String var33 = var11.byte_();
                              int var14 = final_(var33);
                              if (var14 != 0) {
                                 int var15 = implements_(var22);
                                 if (var15 >= 0) {
                                    EY[var15] = var14;
                                    rrdJ.byte_("%s format: %s", var22, var33);
                                 }

                                 int var16 = rrkG.byte_(var22);
                                 if (var16 >= 0) {
                                    ED[var16] = var14;
                                    rrdJ.byte_("%s format: %s", var22, var33);
                                 }
                              }
                           } else if (var11.class_("Clear", false)) {
                              if (var0.case_().break_()) {
                                 String var23 = rrzX_2.throws_(var11.break_(), "Clear");
                                 int var34 = implements_(var23);
                                 if (var34 >= 0) {
                                    Bn[var34] = false;
                                    rrdJ.byte_("%s clear disabled", var23);
                                 }

                                 int var39 = rrkG.byte_(var23);
                                 if (var39 >= 0) {
                                    Bl[var39] = false;
                                    rrdJ.byte_("%s clear disabled", var23);
                                 }
                              }
                           } else if (var11.volatile_("ClearColor")) {
                              if (var0.case_().break_()) {
                                 String var24 = rrzX_2.throws_(var11.break_(), "ClearColor");
                                 rji_3 var35 = var11.super_();
                                 if (var35 != null) {
                                    int var40 = implements_(var24);
                                    if (var40 >= 0) {
                                       BC[var40] = var35;
                                       rrdJ.byte_("%s clear color: %s %s %s %s", var24, var35.class_(), var35.break_(), var35.byte_(), var35.protected_());
                                    }

                                    int var43 = rrkG.byte_(var24);
                                    if (var43 >= 0) {
                                       BH[var43] = var35;
                                       rrdJ.byte_("%s clear color: %s %s %s %s", var24, var35.class_(), var35.break_(), var35.byte_(), var35.protected_());
                                    }
                                 } else {
                                    rrdJ.break_("Invalid color value: " + var11.byte_());
                                 }
                              }
                           } else if (var11.class_("GAUX4FORMAT", "RGBA32F")) {
                              EY[7] = 34836;
                              rrdJ.byte_("gaux4 format : RGB32AF");
                           } else if (var11.class_("GAUX4FORMAT", "RGB32F")) {
                              EY[7] = 34837;
                              rrdJ.byte_("gaux4 format : RGB32F");
                           } else if (var11.class_("GAUX4FORMAT", "RGB16")) {
                              EY[7] = 32852;
                              rrdJ.byte_("gaux4 format : RGB16");
                           } else if (var11.class_("MipmapEnabled", true)) {
                              if (var0.case_().break_()) {
                                 String var25 = rrzX_2.throws_(var11.break_(), "MipmapEnabled");
                                 int var36 = implements_(var25);
                                 if (var36 >= 0) {
                                    int var41 = var0.volatile_();
                                    var41 |= 1 << var36;
                                    var0.byte_(var41);
                                    rrdJ.byte_("%s mipmap enabled", var25);
                                 }
                              }
                           } else if (var11.protected_("DRAWBUFFERS")) {
                              String var26 = var11.byte_();
                              String[] var37 = rrkG.private_(var26);
                              if (var37 != null) {
                                 var0.class_(var37);
                              } else {
                                 rrdJ.break_("Invalid draw buffers: " + var26);
                              }
                           } else if (var11.protected_("RENDERTARGETS")) {
                              String var27 = var11.byte_();
                              String[] var38 = rrkG.implements_(var27);
                              if (var38 != null) {
                                 var0.class_(var38);
                              } else {
                                 rrdJ.break_("Invalid render targets: " + var27);
                              }
                           }
                        }
                     }
                  }
               } catch (Exception var17) {
                  rrdJ.class_("Couldn't read " + var1 + "!");
                  var17.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var19 = var6.toString();
            if (sy) {
               class_(var1, var19);
            }

            ARBShaderObjects.glShaderSourceARB(var3, var19);
            ARBShaderObjects.glCompileShaderARB(var3);
            if (GL43.glGetShaderi(var3, 35713) != 1) {
               rrdJ.class_("Error compiling fragment shader: " + var1);
            }

            class_(var3, var1, var5);
            return var3;
         }
      }
   }

   public static rrxi_3 protected_() {
      return Ei;
   }

   public static void private_() {
      if (extends_()) {
         sp = 0.5F;
         sq = 0.6F;
         sT = 0.8F;
      } else {
         sp = 1.0F;
         sq = 1.0F;
         sT = 1.0F;
      }
   }

   public static void private_(int var0) {
      GL43.glDisable(var0);
      c();
   }

   public static void private_(String var0) {
      rrdJ.class_(var0);
      ((cq_3)class_.class_[19]).throws_().class_(new rgN_2(var0));
   }

   public static void abstract_() {
      GL43.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      rW();
      int var0 = Sz.final_();
      if (var0 > 1) {
         for (int var1 = 1; var1 < var0; var1++) {
            PR.break_(var1);
            rW();
         }

         PR.break_(0);
      }
   }

   private static ByteBuffer final_(int var0) {
      ByteBuffer var1 = Gz;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0);
      return var1.slice();
   }

   private static int final_(String var0) {
      var0 = var0.trim();

      for (int var1 = 0; var1 < GQ.length; var1++) {
         String var2 = GQ[var1];
         if (var0.equals(var2)) {
            return GN[var1];
         }
      }

      return 0;
   }

   public static boolean final_() {
      return !sQ.implements_();
   }

   public static void transient_() {
      L();
      H();
      class_(m ? Bj : Bf);
      class_(rrdX.NONE);
   }

   public static boolean volatile_() {
      return !sz.implements_();
   }

   private static void volatile_(String var0) {
      ((cq_3)class_.class_[19]).throws_().class_(new rgN_2(var0));
   }

   public static void volatile_(int var0) {
      EC++;
      En[EC * 2] = var0 & 65535;
      En[EC * 2 + 1] = 0;
   }

   public static boolean synchronized_() {
      return sl.private_();
   }

   public static int native_(int var0) {
      En[EC * 2 + 1] = En[EC * 2 + 1] & -65536 | var0 & 65535;
      return var0;
   }

   public static boolean native_() {
      return !sW.implements_();
   }

   public static rrdG native_(String var0) {
      return EU.protected_(var0);
   }

   public static void strictfp_() {
      catch_("endUpdateChunks1");
      case_("endUpdateChunks1");
      if (!new_) {
         class_(BY);
      }

      catch_("endUpdateChunks2");
      case_("endUpdateChunks2");
   }

   public static void E() {
      if (volatile_) {
         catch_("beginBlockEntities");
         class_(Be);
         class_(rrdX.BLOCK_ENTITIES);
      }
   }

   public static void A() {
      m = true;
      if (Sz == Bf) {
         class_(Bj);
      }
   }

   public static boolean T() {
      return else_;
   }

   public static void X() {
      if (!new_) {
         MT.volatile_();
         MT.package_();
         MT.break_(770, 771);
         MT.throws_();
         class_(SE);
         class_(rrdX.RAIN_SNOW);
      }
   }

   public static void Q() {
   }

   public static boolean rr() {
      return sr;
   }

   private static void rc() {
      GB = new HashMap<>();
      if (sr) {
         ArrayList var0 = new ArrayList();
         String var1 = "/shaders/lang/";
         String var2 = "en_us";
         String var3 = ".lang";
         var0.add(var1 + var2 + var3);
         var0.add(var1 + package_(var2) + var3);
         if (!rrbb_3.rE().rG.equals(var2)) {
            String var4 = rrbb_3.rE().rG;
            var0.add(var1 + var4 + var3);
            var0.add(var1 + package_(var4) + var3);
         }

         try {
            for (String var5 : var0) {
               InputStream var6 = Ei.class_(var5);
               if (var6 != null) {
                  rrzE_2 var7 = new rrzE_2();
                  rrba_3.class_(var6, var7);
                  var6.close();

                  for (String var9 : var7.keySet()) {
                     String var10 = var7.getProperty(var9);
                     GB.put(var9, var10);
                  }
               }
            }
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }
   }

   private static void rO() {
      EA = new IdentityHashMap<>(300);
      if (EA.isEmpty()) {
         for (rqO_2 var1 : rVL.strictfp_.protected_()) {
            xd_3 var2 = rVL.strictfp_.class_(var1);
            int var3 = rVL.strictfp_.class_(var2);
            EA.put(var2, var3);
         }
      }

      BufferedReader var11 = null;

      try {
         var11 = new BufferedReader(new InputStreamReader(Ei.class_("/mc_Entity_x.txt")));
      } catch (Exception var9) {
      }

      if (var11 != null) {
         String var12;
         try {
            while ((var12 = var11.readLine()) != null) {
               Matcher var13 = Gc.matcher(var12);
               if (var13.matches()) {
                  String var14 = var13.group(1);
                  String var4 = var13.group(2);
                  int var5 = Integer.parseInt(var4);
                  rqO_2 var6 = new rqO_2(var14);
                  if (rVL.strictfp_.byte_(var6)) {
                     xd_3 var7 = rVL.strictfp_.class_(var6);
                     EA.put(var7, var5);
                  } else {
                     rrdJ.break_("Unknown block name %s", var14);
                  }
               } else {
                  rrdJ.break_("unmatched %s\n", var12);
               }
            }
         } catch (Exception var10) {
            rrdJ.break_("Error parsing mc_Entity_x.txt");
         }
      }

      if (var11 != null) {
         try {
            var11.close();
         } catch (Exception var8) {
         }
      }
   }

   private static void rQ() {
      if (!new_) {
         class_(Sb, false, Gb);
      }
   }

   private static void rJ() {
      if (BL != null) {
         BL.break_();
      }

      boolean[] var0 = rrki_1.class_(Bc, true);
      boolean[] var1 = new boolean[Bc];
      boolean[] var2 = new boolean[BN];
      int[] var3 = BF ? si : null;
      BL = new rrdF("dfb", extends_, native_, BN, Bc, 8, var0, var1, var2, GX, EY, sD, sU, var3, Eu);
      BL.class_();
   }

   private static void rM() {
      if (Gx == null && Gh != null) {
         Gx = class_(15, Gh);
      }

      if (Gx == null) {
         Gx = new rrxe_3(Gk, Gk);
      }
   }

   private static void rB() {
      Gs.clear();

      for (int var0 = -128; var0 <= 128; var0++) {
         String var1 = "/shaders/world" + var0;
         if (Ei.break_(var1)) {
            Gs.add(var0);
         }
      }

      if (Gs.size() > 0) {
         Integer[] var2 = Gs.toArray(new Integer[Gs.size()]);
         rrbb_3.byte_("[Shaders] Worlds: " + rrbb_3.class_(var2));
      }
   }

   private static rrdD[] rG() {
      try {
         String[] var0 = EU.byte_();
         Properties var1 = class_(Ei);
         rrdD[] var2 = rrks_1.class_(Ei, var0, Gs);

         for (int var3 = 0; var3 < var2.length; var3++) {
            rrdD var4 = var2[var3];
            String var5 = var1.getProperty(var4.class_());
            if (var5 != null) {
               var4.case_();
               if (!var4.break_(var5)) {
                  rrbb_3.protected_("[Shaders] Invalid value, option: " + var4.class_() + ", value: " + var5);
               }
            }
         }

         return var2;
      } catch (IOException var6) {
         rrbb_3.protected_("[Shaders] Error reading configuration for " + Ei.class_());
         var6.printStackTrace();
         return null;
      }
   }

   private static void rk() {
      GL43.glGetFloatv(2983, (FloatBuffer)((Buffer)Ex).position(0));
      rrdx_1.class_((FloatBuffer)((Buffer)Ed).position(0), (FloatBuffer)((Buffer)Ex).position(0), EG, EE);
      ((Buffer)Ex).position(0);
      ((Buffer)Ed).position(0);
   }

   private static void rX() {
      BS = false;
      Bs = Math.round((float)BG * Sp);
      BE = Math.round((float)Bb * Sp);
      rx();
   }

   private static void rE() {
      byte_(GE);
      byte_(GG);
      byte_(Gb);
      byte_(GM);
      byte_(GO);
      GE = null;
      GG = null;
      Gb = null;
      GM = null;
      GO = null;
   }

   public static void rP() {
      rrxn_3.break_();
   }

   private static void rz() {
      if (!new_) {
         class_(SJ, true, GG);
      }
   }

   private static void rW() {
      if (!e()) {
         GL43.glBegin(5);
         GL43.glTexCoord2f(0.0F, 0.0F);
         GL43.glVertex3f(0.0F, 0.0F, 0.0F);
         GL43.glTexCoord2f(1.0F, 0.0F);
         GL43.glVertex3f(1.0F, 0.0F, 0.0F);
         GL43.glTexCoord2f(0.0F, 1.0F);
         GL43.glVertex3f(0.0F, 1.0F, 0.0F);
         GL43.glTexCoord2f(1.0F, 1.0F);
         GL43.glVertex3f(1.0F, 1.0F, 0.0F);
         GL43.glEnd();
      } else {
         GL43.glBegin(7);
         GL43.glTexCoord2f(0.0F, 0.0F);
         GL43.glVertex3f(0.0F, 0.0F, 0.0F);
         GL43.glTexCoord2f(1.0F, 0.0F);
         GL43.glVertex3f(1.0F, 0.0F, 0.0F);
         GL43.glTexCoord2f(1.0F, 1.0F);
         GL43.glVertex3f(1.0F, 1.0F, 0.0F);
         GL43.glTexCoord2f(0.0F, 1.0F);
         GL43.glVertex3f(0.0F, 1.0F, 0.0F);
         GL43.glEnd();
      }
   }

   private static void rN() {
      class_(BL, Sd.goto_());
      int_ = false;
      class_.B().class_(true);
      MT.class_(Vl_1.class_, Vl_1.byte_, 3553, class_.B().case_(), 0);
      GL43.glViewport(0, 0, class_.else_().extends_(), class_.else_().native_());
      MT.class_(true);
      GL43.glClearColor(char_.class_(), char_.break_(), char_.byte_(), 1.0F);
      GL43.glClear(16640);
      GL43.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      MT.import_();
      MT.protected_();
      MT.final_();
      MT.volatile_();
      MT.break_(519);
      MT.class_(false);
      catch_("pre-final");
      class_(Sd);
      catch_("id_final");
      if (Sd.return_()) {
         BL.throws_(Sd.volatile_());
      }

      abstract_();
      catch_("renderCompositeFinal");
   }

   private static void rx() {
      if (BB) {
         new_ = true;
         if (BA != null) {
            BA.break_();
         }

         rrWz_1[] var0 = new rrWz_1[2];
         int[] var1 = BF ? Er : null;
         BA = new rrdF("sfb", Bs, BE, Bu, Bm, 8, SL, Sv, Sn, var0, ED, se, sa, var1, Em);
         BA.class_();
         new_ = false;
      }
   }

   private static void rS() {
      sx.case_();
      sl.case_();
      if (Ei != null) {
         String var0 = "/shaders/shaders.properties";

         try {
            InputStream var1 = Ei.class_(var0);
            if (var1 == null) {
               return;
            }

            var1 = rrdT.class_(var1, var0, false);
            rrzE_2 var2 = new rrzE_2();
            var2.load(var1);
            var1.close();
            sx.class_(var2);
            sl.class_(var2);
            GP = rrks_1.byte_(var2, Gr);
            sM = rrks_1.class_(var2, Gr);
            sO = rrks_1.class_(var2, sM, Gr);
         } catch (IOException var3) {
            rrbb_3.protected_("[Shaders] Error reading: " + var0);
         }
      }
   }

   public static void Y() {
      if (volatile_) {
         class_(Ba);
      }
   }
}
