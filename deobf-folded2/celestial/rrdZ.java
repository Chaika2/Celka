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
   static QY id_class;
   static Hh_1 id_break;
   public static boolean id_byte = false;
   public static boolean id_protected = false;
   public static GLCapabilities id_throws;
   public static String id_case;
   public static String id_catch;
   public static String id_private;
   public static boolean id_implements = false;
   public static int id_finally = 0;
   private static int El = 0;
   private static int EH = 0;
   public static int id_extends = 0;
   public static int id_native = 0;
   public static boolean id_volatile = false;
   public static boolean id_final = false;
   public static boolean id_package = false;
   public static boolean id_int = false;
   public static boolean id_new = false;
   public static boolean id_continue = false;
   public static boolean id_super;
   private static boolean Ey;
   private static boolean Ep;
   private static boolean Eq;
   private static boolean ET;
   private static boolean Et;
   public static boolean id_this = false;
   public static boolean id_else = false;
   public static boolean id_synchronized = false;
   static float[] id_return = new float[4];
   static float[] id_public = new float[4];
   static float[] id_goto = new float[4];
   static float[] id_while = new float[4];
   static float[] id_try = new float[4];
   static float[] id_instanceof = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static float[] id_throw = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static float[] id_interface = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   private static float[] Ew = new float[16];
   static rji_3 id_char = new rji_3();
   static float id_abstract;
   static float id_long;
   static float id_float;
   static long id_void = 0L;
   static long id_static = 0L;
   static long id_import = 0L;
   static float id_short = 0.0F;
   static float id_default = 0.0F;
   static float id_const = 0.0F;
   static int id_strictfp = 0;
   static long id_boolean = 0L;
   static long id_transient = 0L;
   static long id_for = 0L;
   static int id_double = 0;
   static float id_switch = 0.0F;
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
   public static rrkl_1 g = ER.id_case("entityColor");
   public static rrkL R = ER.id_class("entityId");
   public static rrkL Y = ER.id_class("blockEntityId");
   public static rrkL o = ER.id_class("texture");
   public static rrkL K = ER.id_class("lightmap");
   public static rrkL D = ER.id_class("normals");
   public static rrkL U = ER.id_class("specular");
   public static rrkL e = ER.id_class("shadow");
   public static rrkL a = ER.id_class("watershadow");
   public static rrkL i = ER.id_class("shadowtex0");
   public static rrkL rr = ER.id_class("shadowtex1");
   public static rrkL rP = ER.id_class("depthtex0");
   public static rrkL rB = ER.id_class("depthtex1");
   public static rrkL rS = ER.id_class("shadowcolor");
   public static rrkL rs = ER.id_class("shadowcolor0");
   public static rrkL rE = ER.id_class("shadowcolor1");
   public static rrkL rG = ER.id_class("noisetex");
   public static rrkL rb = ER.id_class("gcolor");
   public static rrkL rM = ER.id_class("gdepth");
   public static rrkL rO = ER.id_class("gnormal");
   public static rrkL rh = ER.id_class("composite");
   public static rrkL rX = ER.id_class("gaux1");
   public static rrkL rJ = ER.id_class("gaux2");
   public static rrkL rx = ER.id_class("gaux3");
   public static rrkL rd = ER.id_class("gaux4");
   public static rrkL rk = ER.id_class("colortex0");
   public static rrkL rW = ER.id_class("colortex1");
   public static rrkL rz = ER.id_class("colortex2");
   public static rrkL rQ = ER.id_class("colortex3");
   public static rrkL rN = ER.id_class("colortex4");
   public static rrkL rc = ER.id_class("colortex5");
   public static rrkL ru = ER.id_class("colortex6");
   public static rrkL rm = ER.id_class("colortex7");
   public static rrkL rZ = ER.id_class("gdepthtex");
   public static rrkL rv = ER.id_class("depthtex2");
   public static rrkL rF = ER.id_class("colortex8");
   public static rrkL rL = ER.id_class("colortex9");
   public static rrkL rA = ER.id_class("colortex10");
   public static rrkL rn = ER.id_class("colortex11");
   public static rrkL rC = ER.id_class("colortex12");
   public static rrkL rl = ER.id_class("colortex13");
   public static rrkL rH = ER.id_class("colortex14");
   public static rrkL ry = ER.id_class("colortex15");
   public static rrkL rp = ER.id_class("colorimg0");
   public static rrkL rq = ER.id_class("colorimg1");
   public static rrkL rT = ER.id_class("colorimg2");
   public static rrkL rt = ER.id_class("colorimg3");
   public static rrkL rw = ER.id_class("colorimg4");
   public static rrkL rI = ER.id_class("colorimg5");
   public static rrkL rf = ER.id_class("shadowcolorimg0");
   public static rrkL rj = ER.id_class("shadowcolorimg1");
   public static rrkL rV = ER.id_class("tex");
   public static rrkL rg = ER.id_class("heldItemId");
   public static rrkL rR = ER.id_class("heldBlockLightValue");
   public static rrkL rY = ER.id_class("heldItemId2");
   public static rrkL ro = ER.id_class("heldBlockLightValue2");
   public static rrkL rK = ER.id_class("fogMode");
   public static rrkF rD = ER.id_protected("fogDensity");
   public static rrkC rU = ER.id_throws("fogColor");
   public static rrkC re = ER.id_throws("skyColor");
   public static rrkL ra = ER.id_class("worldTime");
   public static rrkL ri = ER.id_class("worldDay");
   public static rrkL Pr = ER.id_class("moonPhase");
   public static rrkL PP = ER.id_class("frameCounter");
   public static rrkF PB = ER.id_protected("frameTime");
   public static rrkF PS = ER.id_protected("frameTimeCounter");
   public static rrkF Ps = ER.id_protected("sunAngle");
   public static rrkF PE = ER.id_protected("shadowAngle");
   public static rrkF PG = ER.id_protected("rainStrength");
   public static rrkF Pb = ER.id_protected("aspectRatio");
   public static rrkF PM = ER.id_protected("viewWidth");
   public static rrkF PO = ER.id_protected("viewHeight");
   public static rrkF Ph = ER.id_protected("near");
   public static rrkF PX = ER.id_protected("far");
   public static rrkC PJ = ER.id_throws("sunPosition");
   public static rrkC Px = ER.id_throws("moonPosition");
   public static rrkC Pd = ER.id_throws("shadowLightPosition");
   public static rrkC Pk = ER.id_throws("upPosition");
   public static rrkC PW = ER.id_throws("previousCameraPosition");
   public static rrkC Pz = ER.id_throws("cameraPosition");
   public static rrkp_1 PQ = ER.id_catch("gbufferModelView");
   public static rrkp_1 PN = ER.id_catch("gbufferModelViewInverse");
   public static rrkp_1 Pc = ER.id_catch("gbufferPreviousProjection");
   public static rrkp_1 Pu = ER.id_catch("gbufferProjection");
   public static rrkp_1 Pm = ER.id_catch("gbufferProjectionInverse");
   public static rrkp_1 PZ = ER.id_catch("gbufferPreviousModelView");
   public static rrkp_1 Pv = ER.id_catch("shadowProjection");
   public static rrkp_1 PF = ER.id_catch("shadowProjectionInverse");
   public static rrkp_1 PL = ER.id_catch("shadowModelView");
   public static rrkp_1 PA = ER.id_catch("shadowModelViewInverse");
   public static rrkF Pn = ER.id_protected("wetness");
   public static rrkF PC = ER.id_protected("eyeAltitude");
   public static rrkn_1 Pl = ER.id_break("eyeBrightness");
   public static rrkn_1 PH = ER.id_break("eyeBrightnessSmooth");
   public static rrkn_1 Py = ER.id_break("terrainTextureSize");
   public static rrkL Pp = ER.id_class("terrainIconSize");
   public static rrkL Pq = ER.id_class("isEyeInWater");
   public static rrkF PT = ER.id_protected("nightVision");
   public static rrkF Pt = ER.id_protected("blindness");
   public static rrkF Pw = ER.id_protected("screenBrightness");
   public static rrkL PI = ER.id_class("hideGUI");
   public static rrkF Pf = ER.id_protected("centerDepthSmooth");
   public static rrkn_1 Pj = ER.id_break("atlasSize");
   public static rrkl_1 PV = ER.id_case("spriteBounds");
   public static rrkH Pg = ER.id_byte("blendFunc");
   public static rrkL PR = ER.id_class("instanceId");
   public static rrkF PY = ER.id_protected("playerMood");
   public static rrkL Po = ER.id_class("renderStage");
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
   public static final rrdG By = EU.id_class();
   public static final rrdG Bp = EU.id_break("shadow", By);
   public static final rrdG Bq = EU.id_break("shadow_solid", Bp);
   public static final rrdG BT = EU.id_break("shadow_cutout", Bp);
   public static final rrdG[] Bt = EU.id_break("shadowcomp", 16);
   public static final rrdG[] Bw = EU.id_byte("prepare", 16);
   public static final rrdG BI = EU.id_class("gbuffers_basic", By);
   public static final rrdG Bf = EU.id_class("gbuffers_textured", BI);
   public static final rrdG Bj = EU.id_class("gbuffers_textured_lit", Bf);
   public static final rrdG BV = EU.id_class("gbuffers_skybasic", BI);
   public static final rrdG Bg = EU.id_class("gbuffers_skytextured", Bf);
   public static final rrdG BR = EU.id_class("gbuffers_clouds", Bf);
   public static final rrdG BY = EU.id_class("gbuffers_terrain", Bj);
   public static final rrdG Bo = EU.id_class("gbuffers_terrain_solid", BY);
   public static final rrdG BK = EU.id_class("gbuffers_terrain_cutout_mip", BY);
   public static final rrdG BD = EU.id_class("gbuffers_terrain_cutout", BY);
   public static final rrdG BU = EU.id_class("gbuffers_damagedblock", BY);
   public static final rrdG Be = EU.id_class("gbuffers_block", BY);
   public static final rrdG Ba = EU.id_class("gbuffers_beaconbeam", Bf);
   public static final rrdG Bi = EU.id_class("gbuffers_item", Bj);
   public static final rrdG Sr = EU.id_class("gbuffers_entities", Bj);
   public static final rrdG SP = EU.id_class("gbuffers_entities_glowing", Sr);
   public static final rrdG SB = EU.id_class("gbuffers_armor_glint", Bf);
   public static final rrdG SS = EU.id_class("gbuffers_spidereyes", Bf);
   public static final rrdG Ss = EU.id_class("gbuffers_hand", Bj);
   public static final rrdG SE = EU.id_class("gbuffers_weather", Bj);
   public static final rrdG SG = EU.id_byte("deferred_pre");
   public static final rrdG[] Sb = EU.id_protected("deferred", 16);
   public static final rrdG SM = Sb[0];
   public static final rrdG SO = EU.id_class("gbuffers_water", BY);
   public static final rrdG Sh = EU.id_class("gbuffers_hand_water", Ss);
   public static final rrdG SX = EU.id_byte("composite_pre");
   public static final rrdG[] SJ = EU.id_class("composite", 16);
   public static final rrdG Sx = SJ[0];
   public static final rrdG Sd = EU.id_class("id_final");
   public static final int Sk = EU.id_break();
   public static final rrdG[] SW = EU.id_protected();
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
   public static final File sG = new File((File)QY.id_instanceof().id_class[24], "shaderpacks");
   static File sb = new File((File)QY.id_instanceof().id_class[24], "optionsshaders.txt");
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
   static final FloatBuffer EO = id_package(16);
   static final FloatBuffer Eh = id_package(16);
   static final FloatBuffer EX = id_package(16);
   static final FloatBuffer EJ = id_package(16);
   static final FloatBuffer Ex = id_package(16);
   static final FloatBuffer Ed = id_package(16);
   static final FloatBuffer Ek = id_package(16);
   static final FloatBuffer EW = id_package(16);
   static final FloatBuffer Ez = id_package(16);
   static final FloatBuffer EQ = id_package(16);
   static final FloatBuffer EN = id_package(16);
   static final FloatBuffer Ec = id_package(16);
   static final rrxY_2 Eu = new rrxY_2("dfbDrawBuffers", 16, 8);
   static final rrxY_2 Em = new rrxY_2("sfbDrawBuffers", 16, 8);
   static final rrxY_2 EZ = new rrxY_2("drawBuffersNone", 16, 8).id_protected(0);
   static final rrxY_2[] Ev = id_int(16);
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

   public static void id_boolean() {
      Z = true;
      id_break(-3, 0);
      id_class(BR);
      id_class(rrdX.CLOUDS);
   }

   public static void id_char() {
      GL43.glGetFloatv(2983, (FloatBuffer)((Buffer)EO).position(0));
      rrdx_1.id_class((FloatBuffer)((Buffer)Eh).position(0), (FloatBuffer)((Buffer)EO).position(0), EB, EP);
      ((Buffer)EO).position(0);
      ((Buffer)Eh).position(0);
   }

   private static void id_byte(rrxa_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            rrxa_3 var2 = var0[var1];
            var2.id_throws();
         }
      }
   }

   private static void id_byte(an_3 var0) {
      double var1 = Math.abs(Pe - PK);
      double var3 = Math.abs(Pi - PU);
      double var5 = Math.abs(Pe);
      double var7 = Math.abs(Pi);
      if (var1 > 1000.0 || var3 > 1000.0 || var5 > 1000000.0 || var7 > 1000000.0) {
         id_protected(var0);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static rrxa_3 id_byte(int var0, String var1) {
      rrMz_1 var2 = new rrMz_1("Shaders");
      String[] var3 = rrbb_3.id_class(var1, " ");
      ArrayDeque var4 = new ArrayDeque<>(Arrays.asList(var3));
      String var5 = (String)var4.poll();
      rrke_1 var6 = (rrke_1)var2.id_class((String)var4.poll(), rrke_1.values(), "texture type");
      if (var6 == null) {
         rrdJ.id_break("Invalid raw texture type: " + var1);
         return null;
      } else {
         rrkK var7 = (rrkK)var2.id_class((String)var4.poll(), rrkK.values(), "internal format");
         if (var7 == null) {
            rrdJ.id_break("Invalid raw texture internal format: " + var1);
            return null;
         } else {
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            switch (var6) {
               case TEXTURE_1D:
                  var8 = var2.id_class((String)var4.poll(), -1);
                  break;
               case TEXTURE_2D:
                  var8 = var2.id_class((String)var4.poll(), -1);
                  var9 = var2.id_class((String)var4.poll(), -1);
                  break;
               case TEXTURE_3D:
                  var8 = var2.id_class((String)var4.poll(), -1);
                  var9 = var2.id_class((String)var4.poll(), -1);
                  var10 = var2.id_class((String)var4.poll(), -1);
                  break;
               case TEXTURE_RECTANGLE:
                  var8 = var2.id_class((String)var4.poll(), -1);
                  var9 = var2.id_class((String)var4.poll(), -1);
                  break;
               default:
                  rrdJ.id_break("Invalid raw texture type: " + var6);
                  return null;
            }

            if (var8 >= 0 && var9 >= 0 && var10 >= 0) {
               rrkD var11 = (rrkD)var2.id_class((String)var4.poll(), rrkD.values(), "pixel format");
               if (var11 == null) {
                  rrdJ.id_break("Invalid raw texture pixel format: " + var1);
                  return null;
               } else {
                  rrkU var12 = (rrkU)var2.id_class((String)var4.poll(), rrkU.values(), "pixel type");
                  if (var12 == null) {
                     rrdJ.id_break("Invalid raw texture pixel type: " + var1);
                     return null;
                  } else if (!var4.isEmpty()) {
                     rrdJ.id_break("Invalid raw texture, too many parameters: " + var1);
                     return null;
                  } else {
                     return id_class(var0, var1, var5, var6, var7, var8, var9, var10, var11, var12);
                  }
               }
            } else {
               rrdJ.id_break("Invalid raw texture size: " + var1);
               return null;
            }
         }
      }
   }

   public static void id_byte(Ml_1 var0) {
      rjV_2 var1 = var0.id_byte().id_class();
      rjV_2 var2 = new rjV_2(var1);
      var2.id_protected();
      var2.id_class(Ew);
      rrdx_1.id_break(id_while, Ew, id_instanceof);
      id_class(Pk, 0.0F, 0.0F, 0.0F);
      if (GJ != null) {
         GJ.id_class();
      }
   }

   public static rrdD[] id_byte(String var0) {
      rrdD[] var1 = (rrdD[])Gr.clone();
      if (sO == null) {
         if (sM != null) {
            rrdU var9 = new rrdU(sM, var1);
            var1 = (rrdD[])rrbb_3.id_class(var1, var9, 0);
         }

         return id_break(var1);
      } else {
         String var2 = var0 != null ? "screen." + var0 : "screen";
         rrdV var3 = sO.get(var2);
         if (var3 == null) {
            return new rrdD[0];
         } else {
            rrdD[] var4 = var3.id_break();
            ArrayList var5 = new ArrayList();

            for (int var6 = 0; var6 < var4.length; var6++) {
               rrdD var7 = var4[var6];
               if (var7 == null) {
                  var5.add((rrdD)null);
               } else if (var7 instanceof rrda_1) {
                  rrdD[] var8 = id_class(sO, var1);
                  var5.addAll(Arrays.asList(var8));
               } else {
                  var5.add(var7);
               }
            }

            return var5.toArray(new rrdD[var5.size()]);
         }
      }
   }

   private static void id_byte(rrdG var0) {
      rrxz_3[] var1 = var0.id_new();
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrxz_3 var3 = var1[var2];
            if (var3 != null) {
               String var4 = Integer.toHexString(var2).toUpperCase();
               int var5 = 36064 + var2;
               int var6 = var0.id_extends().id_case(var5);
               if (var6 < 0) {
                  rrdJ.id_break("Blend buffer not used in draw buffers: " + var4);
               } else {
                  var0.id_break(var6, var3);
                  rrdJ.id_byte("Blend buffer: " + var4);
               }
            }
         }
      }
   }

   private static int id_byte(rrdG var0, String var1) {
      InputStream var2 = Ei.id_class(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(36313);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = id_class(Gr);
            ArrayList var5 = new ArrayList();
            Ef = false;
            Ej = false;
            EV = 3;
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.id_class(new InputStreamReader(var2));
                  var7 = rrks_1.id_class(var7, var1, Ei, 0, var5, 0);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = id_class(var10, var4);
                     var6.id_class(var10);
                     if (var8.id_class(var10)) {
                        rrdg_1 var11 = rrkG.id_class(var10);
                        if (var11 != null) {
                           if (var11.id_finally("GL_ARB_geometry_shader4")) {
                              String var12 = rrbb_3.id_private(var11.id_byte());
                              if (var12.equals("enable") || var12.equals("require") || var12.equals("warn")) {
                                 Ef = true;
                              }
                           }

                           if (var11.id_finally("GL_EXT_geometry_shader4")) {
                              String var17 = rrbb_3.id_private(var11.id_byte());
                              if (var17.equals("enable") || var17.equals("require") || var17.equals("warn")) {
                                 Ej = true;
                              }
                           }

                           if (var11.id_throws("maxVerticesOut")) {
                              EV = var11.id_package();
                           }
                        }
                     }
                  }
               } catch (Exception var13) {
                  rrdJ.id_class("Couldn't read " + var1 + "!");
                  var13.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var15 = var6.toString();
            if (sy) {
               id_class(var1, var15);
            }

            ARBShaderObjects.glShaderSourceARB(var3, var15);
            ARBShaderObjects.glCompileShaderARB(var3);
            if (GL43.glGetShaderi(var3, 35713) != 1) {
               rrdJ.id_class("Error compiling geometry shader: " + var1);
            }

            id_class(var3, var1, var5);
            return var3;
         }
      }
   }

   public static int id_byte(int var0) {
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

   private static IntBuffer[] id_byte(int var0, int var1) {
      IntBuffer[] var2 = new IntBuffer[var0];

      for (int var3 = 0; var3 < var0; var3++) {
         var2[var3] = id_class(var1);
      }

      return var2;
   }

   private static void id_byte(rrdF var0, rrdG var1) {
      if (var1.id_public() != null) {
         var0.id_private();
         GL43.glViewport(0, 0, var0.id_protected(), var0.id_throws());
      }

      rrdj_1 var2 = Sz.id_super();
      if (var2 != null) {
         GL43.glViewport(0, 0, var0.id_protected(), var0.id_throws());
      }
   }

   public static void id_byte() {
      id_class = QY.id_instanceof();
      boolean var0 = sr;
      boolean var1 = id_extends();
      if ((yX_2)id_class.id_class[8] != null) {
         ((yX_2)id_class.id_class[8]).id_synchronized();
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
         rE();
         Gh = null;
      }

      boolean var2 = false;
      if (rrbb_3.T()) {
         rrdJ.id_byte("Shaders can not be loaded, Antialiasing is enabled: " + rrbb_3.q() + "x");
         var2 = true;
      }

      if (rrbb_3.id_instanceof()) {
         rrdJ.id_byte("Shaders can not be loaded, Fabulous Graphics is enabled.");
         var2 = true;
      }

      String var3 = Sm.getProperty(rrdy_1.SHADER_PACK.id_break(), "(internal)");
      if (!var2) {
         Ei = id_break(var3);
         sr = Ei != null;
      }

      if (sr) {
         rrdJ.id_byte("Loaded shaderpack: " + y());
      } else {
         rrdJ.id_byte("No shaderpack loaded.");
         Ei = new rrdN();
      }

      if (sy) {
         id_class(new File(sG, "debug"));
      }

      rc();
      rB();
      Gr = rG();
      rS();
      rs();
      boolean var4 = sr != var0;
      boolean var5 = id_extends() != var1;
      if (var4 || var5) {
         ju_3.id_class();
         if (rrxr_3.BM.id_byte()) {
            rrxr_3.BO.id_break(null);
            rrxr_3.Bh.id_break(null);
         }

         id_private();
      }

      if (id_class.F() != null) {
         rrbW_2.id_class();
      }

      if ((yX_2)id_class.id_class[8] != null) {
         ((yX_2)id_class.id_class[8]).id_return();
      }

      if ((var4 || var5) && id_class.F() != null) {
         id_class.x();
      }
   }

   private static boolean id_byte(rdn_3 var0) {
      if (var0 == null) {
         return false;
      } else {
         rdb_3 var1 = var0.id_break();
         if (var1 == null) {
            return false;
         } else if (!(var1 instanceof rxJ_2 var2)) {
            return false;
         } else {
            xd_3 var3 = var2.id_catch();
            if (var3 == null) {
               return false;
            } else {
               HU var4 = yS_2.id_class(var3.id_continue());
               return var4 == rrxA_2.id_protected;
            }
         }
      }
   }

   private static int id_byte(ryO_2 var0) {
      if (var0 == null) {
         return -1;
      } else {
         xc_3 var1 = var0.id_abstract();
         return rrxt_3.id_class(var1);
      }
   }

   private static rrxY_2[] id_int(int var0) {
      rrxY_2[] var1 = new rrxY_2[var0];

      for (int var2 = 0; var2 < var1.length; var2++) {
         rrxY_2 var3 = new rrxY_2("single" + var2, 16, 8);
         var3.id_break(36064 + var2);
         var3.id_byte(0);
         var3.id_protected(1);
         var1[var2] = var3;
      }

      return var1;
   }

   public static boolean id_int() {
      return !sc.id_implements();
   }

   public static void id_long() {
      if (!id_new) {
         boolean var0 = id_class(BL, SG);
         if (Ea) {
            id_catch("pre-render Deferred");
            rQ();
            var0 = true;
         }

         if (var0) {
            rd();
            BL.id_class(true);
            rrxY_2 var1 = SO.id_extends() != null ? SO.id_extends() : BL.id_extends();
            rrxU_2.id_class(var1);
            MT.id_new(33984);
            id_class.A().id_class(fJ_2.id_class);
         }
      }
   }

   public static void id_float() {
      if (!id_new) {
         id_class(BL, SX);
         id_catch("pre-render CompositeFinal");
         rz();
      }
   }

   public static void id_double() {
      if (id_volatile && SS.id_private() != By.id_private()) {
         id_class(SS);
         MT.id_throws();
         MT.id_class(516, 0.0F);
         MT.id_break(770, 771);
      }
   }

   private rrdZ() {
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
      id_class(rK, sf);
      id_class(rD, sj);
   }

   public static boolean I() {
      return !ET && !Et;
   }

   public static void J() {
      MT.id_final();
      id_class(Bj);
      id_class(rrdX.NONE);
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
      u();
      id_class(BI);
   }

   public static float V() {
      return BX < 0.0F ? -1.0F : BO * BX;
   }

   public static boolean id_this() {
      return sn.id_private();
   }

   public static boolean e() {
      return Eg ? id_throws.GL_NV_geometry_shader4 : true;
   }

   public static boolean i() {
      return sr;
   }

   public static void b() {
      id_class(Bj);
   }

   public static void x() {
      if (!id_new && Bc >= 3) {
         MT.id_new(33996);
         GL43.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, id_extends, id_native);
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
         id_class(BV);
      } else if (Sz == Bf || Sz == Bj) {
         id_class(BI);
      }
   }

   public static void n() {
      m = false;
      if (Sz == Bj) {
         id_class(Bf);
      }
   }

   public static void h() {
      if (!id_new && Q) {
         ((Buffer)Ec).clear();
         GL43.glReadPixels(id_extends / 2, id_native / 2, 1, 1, 6402, 5126, Ec);
         k = Ec.get(0);
         float var0 = (float)id_for * 0.01F;
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
         MT.id_new(33995);
         id_catch("pre copy depth");
         GL43.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, id_extends, id_native);
         id_catch("copy depth");
         MT.id_new(33984);
      }

      rrdA.id_class(SZ.id_this());
   }

   public static boolean a() {
      return sr;
   }

   public static void id_interface() {
      if (Sc) {
         id_void();
         rd();
         BL.id_finally();
         BL.id_class(true);
      }
   }

   public static void id_class(float var0, long var1) {
      if (!id_new) {
         BL.id_private();
         GL11.glViewport(0, 0, id_extends, id_native);
         rrxU_2.id_class((rrxY_2)null);
         rrdA.id_class(SZ.id_this());
         id_class(Bf);
         id_catch("end beginRenderPass");
      }
   }

   public static void id_class(gm_3 var0) {
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

         id_protected(id_class.id_catch());
         int var2 = rrzc_3.id_class(var1);
         int var3 = rrzc_3.id_class(var0);
         if (var3 != var2) {
            boolean var4 = Gs.contains(var2);
            boolean var5 = Gs.contains(var3);
            if (var4 || var5) {
               id_while();
            }
         }

         rrkT.id_break();
      }
   }

   private static void id_class(int var0, rrxa_3[] var1) {
      if (BA != null) {
         BA.id_protected(0);
         BA.id_class(sa);
      }

      BL.id_protected(var0);
      BL.id_class(sU);
      if (Gd) {
         MT.id_new(33984 + Gx.id_class());
         MT.id_super(Gx.id_protected());
         MT.id_new(33984);
      }

      id_break(var1);
   }

   public static void id_class(QY var0, ly_3 var1, float var2, long var3) {
      id_catch("pre beginRender");
      id_class((gm_3)id_class.id_class[56]);
      id_class = var0;
      id_break = (Hh_1)id_class.id_class[16];
      if (!id_protected) {
         try {
            id_public();
         } catch (IllegalStateException var14) {
            if (rrbb_3.id_private(var14.getMessage()).equals("Function is not supported")) {
               id_private("[Shaders] Error: " + var14.getMessage());
               var14.printStackTrace();
               id_class("OFF");
               return;
            }
         }
      }

      if (id_class.id_else().id_extends() != El || id_class.id_else().id_native() != EH) {
         rh();
      }

      if (BS) {
         rX();
      }

      id_double++;
      if (id_double >= 720720) {
         id_double = 0;
      }

      id_boolean = System.currentTimeMillis();
      if (id_transient == 0L) {
         id_transient = id_boolean;
      }

      id_for = id_boolean - id_transient;
      id_transient = id_boolean;
      id_switch = (float)id_for / 1000.0F;
      r = r + id_switch;
      r %= 3600.0F;
      S = B != ((Qw_1)id_class.id_class[20]).id_volatile();
      B = ((Qw_1)id_class.id_class[20]).id_volatile();
      MT.id_transient();
      rrdL.id_class(var1, var0, var2);
      MT.id_for();
      gm_3 var5 = (gm_3)id_class.id_class[56];
      if (var5 != null) {
         id_void = var5.P();
         id_import = (id_void - id_static) % 24000L;
         if (id_import < 0L) {
            id_import += 24000L;
         }

         id_static = id_void;
         id_strictfp = var5.id_char();
         s = var5.id_private(var2);
         float var6 = (float)id_for * 0.01F;
         float var7 = (float)Math.exp(Math.log(0.5) * (double)var6 / (double)(E < s ? b : G));
         E = E * var7 + s * (1.0F - var7);
         an_3 var8 = var1.id_catch();
         if (var8 != null) {
            id_super = var8 instanceof iB_2 && ((iB_2)var8).Sc();
            d = (float)var1.id_break().id_break();
            X = id_class.id_case().id_class(var8, var2);
            float var9 = (float)id_for * 0.01F;
            float var10 = (float)Math.exp(Math.log(0.5) * (double)var9 / (double)M);
            J = J * var10 + (float)(X & 65535) * (1.0F - var10);
            x = x * var10 + (float)(X >> 16) * (1.0F - var10);
            rXE var11 = var1.id_finally();
            if (var11.id_class(rlG_2.id_break)) {
               h = 1;
            } else if (var11.id_class(rlG_2.id_byte)) {
               h = 2;
            } else {
               h = 0;
            }

            if (var8 instanceof iB_2 var12) {
               c = 0.0F;
               if (var12.id_break(rLD.id_int)) {
                  Hh_1 var13 = id_break;
                  c = Hh_1.id_class(var12, var2);
               }

               u = 0.0F;
               if (var12.id_break(rLD.id_package)) {
                  int var17 = var12.id_byte(rLD.id_package).id_break();
                  u = rrbb_3.id_class((float)var17 / 20.0F, 0.0F, 1.0F);
               }
            }

            rjU_2 var15 = var5.id_class(var8.Bs(), var2);
            var15 = rrbN_2.id_break(var15, var5, var8, var2);
            id_abstract = (float)var15.id_break;
            id_long = (float)var15.id_byte;
            id_float = (float)var15.id_protected;
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
      rd();
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
      id_catch("beginRender");
      rrdL.id_class(id_break, var1, 0, var2, var3);
      BL.id_class(true);
      id_class(rrdX.NONE);
      id_catch("end beginRender");
   }

   private static void id_class(rrdM var0) {
      switch (var0) {
         case GBUFFERS:
            id_class(o, 0);
            id_class(K, 2);
            id_class(D, 1);
            id_class(U, 3);
            id_class(e, Bx ? 5 : 4);
            id_class(a, 4);
            id_class(i, 4);
            id_class(rr, 5);
            id_class(rP, 6);
            if (GE != null || Ea) {
               id_class(rX, 7);
               id_class(rJ, 8);
               id_class(rx, 9);
               id_class(rd, 10);
               id_class(rN, 7);
               id_class(rc, 8);
               id_class(ru, 9);
               id_class(rm, 10);
               if (BN > 8) {
                  id_class(rF, 16);
                  id_class(rL, 17);
                  id_class(rA, 18);
                  id_class(rn, 19);
                  id_class(rC, 20);
                  id_class(rl, 21);
                  id_class(rH, 22);
                  id_class(ry, 23);
               }
            }

            id_class(rB, 11);
            id_class(rS, 13);
            id_class(rs, 13);
            id_class(rE, 14);
            id_class(rG, 15);
            break;
         case SHADOWCOMP:
         case PREPARE:
         case DEFERRED:
         case COMPOSITE:
            id_class(rb, 0);
            id_class(rM, 1);
            id_class(rO, 2);
            id_class(rh, 3);
            id_class(rX, 7);
            id_class(rJ, 8);
            id_class(rx, 9);
            id_class(rd, 10);
            id_class(rk, 0);
            id_class(rW, 1);
            id_class(rz, 2);
            id_class(rQ, 3);
            id_class(rN, 7);
            id_class(rc, 8);
            id_class(ru, 9);
            id_class(rm, 10);
            if (BN > 8) {
               id_class(rF, 16);
               id_class(rL, 17);
               id_class(rA, 18);
               id_class(rn, 19);
               id_class(rC, 20);
               id_class(rl, 21);
               id_class(rH, 22);
               id_class(ry, 23);
            }

            id_class(e, Bx ? 5 : 4);
            id_class(a, 4);
            id_class(i, 4);
            id_class(rr, 5);
            id_class(rZ, 6);
            id_class(rP, 6);
            id_class(rB, 11);
            id_class(rv, 12);
            id_class(rS, 13);
            id_class(rs, 13);
            id_class(rE, 14);
            id_class(rG, 15);
            break;
         case SHADOW:
            id_class(rV, 0);
            id_class(o, 0);
            id_class(K, 2);
            id_class(D, 1);
            id_class(U, 3);
            id_class(e, Bx ? 5 : 4);
            id_class(a, 4);
            id_class(i, 4);
            id_class(rr, 5);
            if (GE != null) {
               id_class(rX, 7);
               id_class(rJ, 8);
               id_class(rx, 9);
               id_class(rd, 10);
               id_class(rN, 7);
               id_class(rc, 8);
               id_class(ru, 9);
               id_class(rm, 10);
               if (BN > 8) {
                  id_class(rF, 16);
                  id_class(rL, 17);
                  id_class(rA, 18);
                  id_class(rn, 19);
                  id_class(rC, 20);
                  id_class(rl, 21);
                  id_class(rH, 22);
                  id_class(ry, 23);
               }
            }

            id_class(rS, 13);
            id_class(rs, 13);
            id_class(rE, 14);
            id_class(rG, 15);
      }

      rdn_3 var1 = (cb_3)id_class.id_class[57] != null ? ((cb_3)id_class.id_class[57]).ss() : null;
      rdb_3 var2 = var1 != null ? var1.id_break() : null;
      int var3 = -1;
      xd_3 var4 = null;
      if (var2 != null) {
         var3 = rVL.id_for.id_class(var2);
         if (var2 instanceof rxJ_2) {
            var4 = ((rxJ_2)var2).id_catch();
         }

         var3 = rrdP.id_class(var3);
      }

      int var5 = var4 != null ? var4.id_continue().id_case() : 0;
      rdn_3 var6 = (cb_3)id_class.id_class[57] != null ? ((cb_3)id_class.id_class[57]).Sn() : null;
      rdb_3 var7 = var6 != null ? var6.id_break() : null;
      int var8 = -1;
      xd_3 var9 = null;
      if (var7 != null) {
         var8 = rVL.id_for.id_class(var7);
         if (var7 instanceof rxJ_2) {
            var9 = ((rxJ_2)var7).id_catch();
         }

         var8 = rrdP.id_class(var8);
      }

      int var10 = var9 != null ? var9.id_continue().id_case() : 0;
      if (id_implements() && var10 > var5) {
         var3 = var8;
         var5 = var10;
      }

      float var11 = (cb_3)id_class.id_class[57] != null ? ((cb_3)id_class.id_class[57]).id_double() : 0.0F;
      id_class(rg, var3);
      id_class(rR, var5);
      id_class(rY, var8);
      id_class(ro, var10);
      id_class(rK, Z ? sf : 0);
      id_class(rD, Z ? sj : 0.0F);
      id_class(rU, sV, sg, sR);
      id_class(re, id_abstract, id_long, id_float);
      id_class(ra, (int)(id_void % 24000L));
      id_class(ri, (int)(id_void / 24000L));
      id_class(Pr, id_strictfp);
      id_class(PP, id_double);
      id_class(PB, id_switch);
      id_class(PS, r);
      id_class(Ps, id_default);
      id_class(PE, id_const);
      id_class(PG, s);
      id_class(Pb, (float)id_extends / (float)id_native);
      id_class(PM, (float)id_extends);
      id_class(PO, (float)id_native);
      id_class(Ph, 0.05F);
      id_class(PX, (float)(((Qw_1)id_class.id_class[20]).id_break * 16));
      id_class(PJ, 0.0F, 0.0F, 0.0F);
      id_class(Px, 0.0F, 0.0F, 0.0F);
      id_class(Pd, 0.0F, 0.0F, 0.0F);
      id_class(Pk, 0.0F, 0.0F, 0.0F);
      id_class(PW, (float)PK, (float)PD, (float)PU);
      id_class(Pz, (float)Pe, (float)Pa, (float)Pi);
      id_class(PQ, false, EX);
      id_class(PN, false, EJ);
      id_class(Pc, false, Ez);
      id_class(Pu, false, EO);
      id_class(Pm, false, Eh);
      id_class(PZ, false, EQ);
      if (BB) {
         id_class(Pv, false, Ex);
         id_class(PF, false, Ed);
         id_class(PL, false, Ek);
         id_class(PA, false, EW);
      }

      id_class(Pn, E);
      id_class(PC, d);
      id_class(Pl, X & 65535, X >> 16);
      id_class(PH, Math.round(J), Math.round(x));
      id_class(Py, sK[0], sK[1]);
      id_class(Pp, so);
      id_class(Pq, h);
      id_class(PT, c);
      id_class(Pt, u);
      id_class(Pw, (float)((Qw_1)id_class.id_class[20]).a);
      id_class(PI, ((Qw_1)id_class.id_class[20]).g ? 1 : 0);
      id_class(Pf, W);
      id_class(Pj, j, V);
      id_class(PY, var11);
      id_class(Po, v.ordinal());
      if (GJ != null) {
         GJ.id_class();
      }
   }

   private static rrxY_2 id_class(rrxY_2 var0) {
      int var1 = var0.id_break();

      for (int var2 = var0.id_class(); var2 < var1; var2++) {
         var0.id_class(var2, 0);
      }

      return var0;
   }

   public static void id_class(rrdG var0) {
      id_catch("pre-useProgram");
      if (id_new) {
         var0 = Bp;
      } else if (id_continue) {
         var0 = SP;
      }

      if (Sz != var0) {
         rP();
         id_class(Sz, var0);
         if (EF && EL) {
            KHRDebug.glPopDebugGroup();
         }

         Sz = var0;
         if (EF) {
            KHRDebug.glPushDebugGroup(33354, 0, Sz.id_synchronized());
            EL = true;
         }

         int var1 = var0.id_private();
         SQ = var1;
         ARBShaderObjects.glUseProgramObjectARB(var1);
         if (id_catch("useProgram") != 0) {
            var0.id_class(0);
            var1 = var0.id_private();
            SQ = var1;
            ARBShaderObjects.glUseProgramObjectARB(var1);
         }

         ER.id_class(var1);
         if (GJ != null) {
            GJ.id_class(var1);
         }

         if (var1 != 0) {
            rrxY_2 var2 = var0.id_extends();
            if (id_int) {
               rrxU_2.id_class(var2);
            }

            id_class(var0.id_case());
            rb();
            id_catch("end useProgram");
         }
      }
   }

   public static void id_class(float var0, float var1, float var2, float var3) {
      id_char.id_class(var0, var1, var2, 1.0F);
   }

   public static void id_class(float var0, float var1, float var2) {
      sV = var0;
      sg = var1;
      sR = var2;
      id_class(rU, sV, sg, sR);
   }

   public static void id_class(int var0, int var1, int var2, int var3) {
      MT.id_class(true, true, true, true);
      if (id_new) {
         GL11.glViewport(0, 0, Bs, BE);
      } else {
         GL11.glViewport(0, 0, id_extends, id_native);
         BL.id_private();
         id_int = true;
         MT.id_throw();
         MT.id_volatile();
         rrxU_2.id_class(EZ);
         id_class(Bf);
         id_catch("beginRenderPass");
      }
   }

   private static void id_class(rrkL var0, int var1) {
      var0.id_break(var1);
   }

   public static void id_class(boolean var0, boolean var1) {
      ET = var0;
      Et = var1;
   }

   private static void id_class(rrkC var0, float var1, float var2, float var3) {
      var0.id_class(var1, var2, var3);
   }

   private static void id_class(rrkp_1 var0, boolean var1, FloatBuffer var2) {
      var0.id_class(var1, var2);
   }

   private static void id_class(rrkn_1 var0, int var1, int var2) {
      var0.id_class(var1, var2);
   }

   public static boolean id_class(rpm_3 var0) {
      return var0 == rpm_3.MAIN_HAND && ET ? true : var0 == rpm_3.OFF_HAND && Et;
   }

   private static void id_class(rrdG var0, rrdG var1) {
      if (var0.id_package() != null) {
         MT.G();
      }

      if (var0.id_int() != null) {
         MT.b();
      }

      if (var0.id_continue() != null) {
         MT.d();
      }

      rrxW_2 var2 = var1.id_package();
      if (var2 != null) {
         MT.id_class(var2);
      }

      rrxz_3 var3 = var1.id_int();
      if (var3 != null) {
         MT.id_class(var3);
      }

      if (var1.id_continue() != null) {
         MT.id_class(var1.id_continue());
      }
   }

   private static void id_class(rrkF var0, float var1) {
      var0.id_class(var1);
   }

   private static IntBuffer id_class(IntBuffer var0) {
      int var1 = var0.limit();

      for (int var2 = var0.position(); var2 < var1; var2++) {
         var0.put(var2, 0);
      }

      return var0;
   }

   public static void id_class(ryO_2 var0) {
      if (id_volatile) {
         id_catch("nextBlockEntity");
         id_class(Be);
         id_break(var0);
      }
   }

   public static void id_class(an_3 var0) {
      if (id_volatile) {
         if (var0.w()) {
            id_class(SP);
         } else {
            id_class(Sr);
         }

         id_break(var0);
      }
   }

   public static void id_class(xd_3 var0) {
      EC++;
      int var1 = var0.id_class(var0.id_continue()).ordinal();
      En[EC * 2] = rVL.id_strictfp.id_class(var0) & 65535 | var1 << 16;
      En[EC * 2 + 1] = 0;
   }

   public static void id_class() {
      rrdJ.id_byte("Load shaders configuration.");

      try {
         if (!sG.exists()) {
            sG.mkdir();
         }
      } catch (Exception var8) {
         rrdJ.id_class("Failed to open the shaderpacks directory: " + sG);
      }

      Sm = new rrzE_2();
      Sm.setProperty(rrdy_1.SHADER_PACK.id_break(), "");
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
            id_break();
         } catch (Exception var6) {
         }
      }

      rrdy_1[] var9 = rrdy_1.values();

      for (int var1 = 0; var1 < var9.length; var1++) {
         rrdy_1 var2 = var9[var1];
         String var3 = var2.id_break();
         String var4 = var2.id_byte();
         String var5 = Sm.getProperty(var3, var4);
         id_class(var2, var5);
      }

      id_byte();
   }

   public static boolean id_class(Qw_1 var0) {
      if (!sr) {
         return true;
      } else {
         id_catch("shouldRenderClouds");
         return id_new ? Sl : var0.id_throws != Vd_1.OFF;
      }
   }

   public static void id_class(rjU_2 var0) {
      id_abstract = (float)var0.id_break;
      id_long = (float)var0.id_byte;
      id_float = (float)var0.id_protected;
      id_class(re, id_abstract, id_long, id_float);
   }

   private static rrxa_3 id_class(int var0, String var1, String var2, rrke_1 var3, rrkK var4, int var5, int var6, int var7, rrkD var8, rrkU var9) {
      try {
         String var10 = "shaders/" + rrzX_2.id_protected(var2, "/");
         InputStream var11 = Ei.id_class(var10);
         if (var11 == null) {
            rrdJ.id_break("Raw texture not found: " + var2);
            return null;
         } else {
            byte[] var12 = rrbb_3.id_byte(var11);
            IOUtils.closeQuietly(var11);
            ByteBuffer var13 = Hb_1.id_class(var12.length);
            var13.put(var12);
            ((Buffer)var13).flip();
            Vs_1 var14 = rrdl_1.id_class(var10, new Vs_1(true, true));
            return new rrxg_3(var3, var4, var5, var6, var7, var8, var9, var13, var0, var14.id_class(), var14.id_break());
         }
      } catch (IOException var15) {
         rrdJ.id_break("Error loading raw texture: " + var2);
         rrdJ.id_break(var15.getClass().getName() + ": " + var15.getMessage());
         return null;
      }
   }

   public static void id_class(int var0, int var1) {
      GL11.glFogi(var0, var1);
      if (var0 == 2917) {
         sf = var1;
         if (Z) {
            id_class(rK, sf);
         }
      }
   }

   public static void id_class(float var0) {
      sj = var0;
      if (Z) {
         id_class(rD, var0);
      }
   }

   public static void id_class(MD var0) {
      id_protected(var0.param);
   }

   public static void id_class(Ml_1 var0, boolean var1) {
      GL43.glMatrixMode(5888);
      GL43.glPushMatrix();
      GL43.glMatrixMode(5889);
      GL43.glPushMatrix();
      GL43.glMatrixMode(5888);
      var0.id_class();
      if (var1) {
         id_class(Sh);
      } else {
         id_class(Ss);
      }

      id_catch("beginHand");
      id_case("beginHand");
   }

   public static IntBuffer id_class(int var0) {
      ByteBuffer var1 = Gz;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0 * 4);
      return var1.asIntBuffer();
   }

   private static boolean id_class(rrdF var0, rrdG var1) {
      boolean var2 = false;
      Boolean[] var3 = var1.id_this();

      for (int var4 = 0; var4 < BN; var4++) {
         if (rrbb_3.id_class(var3[var4])) {
            var0.id_case(var4);
            var2 = true;
         }
      }

      return var2;
   }

   public static String id_class(rrdy_1 var0) {
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
            return SY.id_byte();
         case OLD_LIGHTING:
            return SR.id_byte();
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

   public static void id_class(String var0) {
      sP = var0;
      Sm.setProperty(rrdy_1.SHADER_PACK.id_break(), var0);
      id_byte();
   }

   public static void id_class(Ml_1 var0) {
      var0.id_class(rje_3.id_case.id_byte(sw * 1.0F));
      id_catch("preCelestialRotate");
   }

   public static void id_class(rdn_3 var0) {
      id_else = id_byte(var0);
   }

   public static void id_class(Ml_1 var0, ly_3 var1, float var2) {
      an_3 var3 = var1.id_catch();
      rjU_2 var4 = var1.id_break();
      double var5 = var4.id_break;
      double var7 = var4.id_byte;
      double var9 = var4.id_protected;
      id_byte(var3);
      Pe = var5 - (double)Br;
      Pa = var7;
      Pi = var9 - (double)BP;
      id_char();
      rjV_2 var11 = var0.id_byte().id_class();
      rjV_2 var12 = new rjV_2(var11);
      var12.id_protected();
      var12.id_class(Ew);
      ((Buffer)EX).position(0);
      EX.put(Ew);
      rrdx_1.id_class((FloatBuffer)((Buffer)EJ).position(0), (FloatBuffer)((Buffer)EX).position(0), Es, ES);
      ((Buffer)EX).position(0);
      ((Buffer)EJ).position(0);
      id_catch("setCamera");
   }

   public static void id_class(rrxf_3 var0) {
      if (BL != null) {
         ARBShaderObjects.glUseProgramObjectARB(var0.id_case());
         if (id_catch("useComputeProgram") != 0) {
            var0.id_class(0);
         } else {
            ER.id_class(var0.id_case());
            if (GJ != null) {
               GJ.id_class(var0.id_case());
            }

            id_class(var0.id_throws());
            rb();
            BL.id_break(true);
            rja_3 var1 = var0.id_implements();
            if (var1 == null) {
               rjK_2 var2 = var0.id_finally();
               if (var2 == null) {
                  var2 = new rjK_2(1.0F, 1.0F);
               }

               int var3 = (int)Math.ceil((double)((float)id_extends * var2.id_byte));
               int var4 = (int)Math.ceil((double)((float)id_native * var2.id_protected));
               rja_3 var5 = var0.id_private();
               int var6 = (int)Math.ceil(1.0 * (double)var3 / (double)var5.b_());
               int var7 = (int)Math.ceil(1.0 * (double)var4 / (double)var5.c_());
               var1 = new rja_3(var6, var7, 1);
            }

            GL43.glMemoryBarrier(40);
            GL43.glDispatchCompute(var1.b_(), var1.c_(), var1.d_());
            GL43.glMemoryBarrier(40);
            id_catch("compute");
         }
      }
   }

   public static void id_class(rrdF var0, rrxf_3[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         rrxf_3 var3 = var1[var2];
         id_class(var3);
         if (var3.id_native()) {
            var0.id_throws(var3.id_extends());
         }
      }
   }

   private static void id_class(rrdy_1 var0, String var1) {
      if (var1 == null) {
         var1 = var0.id_byte();
      }

      switch (var0) {
         case ANTIALIASING:
            So = rrbb_3.id_class(var1, 0);
            break;
         case NORMAL_MAP:
            SV = rrbb_3.id_class(var1, true);
            break;
         case SPECULAR_MAP:
            Sg = rrbb_3.id_class(var1, true);
            break;
         case RENDER_RES_MUL:
            Sy = rrbb_3.id_class(var1, 1.0F);
            break;
         case SHADOW_RES_MUL:
            Sp = rrbb_3.id_class(var1, 1.0F);
            break;
         case HAND_DEPTH_MUL:
            SH = rrbb_3.id_class(var1, 0.125F);
            break;
         case CLOUD_SHADOW:
            Sl = rrbb_3.id_class(var1, true);
            break;
         case OLD_HAND_LIGHT:
            SY.id_class(var1);
            break;
         case OLD_LIGHTING:
            SR.id_class(var1);
            break;
         case SHADER_PACK:
            sP = var1;
            break;
         case TWEAK_BLOCK_DAMAGE:
            SC = rrbb_3.id_class(var1, true);
            break;
         case SHADOW_CLIP_FRUSTRUM:
            Sj = rrbb_3.id_class(var1, true);
            break;
         case TEX_MIN_FIL_B:
            Sq = rrbb_3.id_class(var1, 0);
            break;
         case TEX_MIN_FIL_N:
            ST = rrbb_3.id_class(var1, 0);
            break;
         case TEX_MIN_FIL_S:
            St = rrbb_3.id_class(var1, 0);
            break;
         case TEX_MAG_FIL_B:
            Sw = rrbb_3.id_class(var1, 0);
            break;
         case TEX_MAG_FIL_N:
            Sw = rrbb_3.id_class(var1, 0);
            break;
         case TEX_MAG_FIL_S:
            Sw = rrbb_3.id_class(var1, 0);
            break;
         default:
            throw new IllegalArgumentException("Unknown option: " + var0);
      }
   }

   private static void id_class(rrdF var0, rrdG[] var1, boolean var2, rrxa_3[] var3) {
      GL43.glPushMatrix();
      GL43.glLoadIdentity();
      GL43.glMatrixMode(5889);
      GL43.glPushMatrix();
      GL43.glLoadIdentity();
      GL43.glOrtho(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
      GL43.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      MT.id_import();
      MT.id_protected();
      MT.id_final();
      MT.id_volatile();
      MT.id_break(519);
      MT.id_class(false);
      MT.id_catch();
      id_class(0, var3);
      var0.id_break(true);
      var0.id_class(false);
      var0.id_implements();
      var0.id_finally();
      id_catch("pre-composite");

      for (int var4 = 0; var4 < var1.length; var4++) {
         rrdG var5 = var1[var4];
         id_class(var0, var5.id_goto());
         if (var5.id_private() != 0) {
            id_class(var5);
            id_catch(var5.id_throws());
            if (var5.id_return()) {
               var0.id_throws(var5.id_volatile());
            }

            id_break(var0, var5);
            id_abstract();
            id_byte(var0, var5);
            var0.id_break(var5.id_else());
         }
      }

      id_catch("composite");
      if (var2) {
         rN();
         id_package = true;
      }

      MT.id_import();
      MT.id_throws();
      MT.id_package();
      MT.id_break(515);
      MT.id_class(true);
      GL43.glPopMatrix();
      GL43.glMatrixMode(5888);
      GL43.glPopMatrix();
      id_class(By);
   }

   private static void id_class(rrdG[] var0, boolean var1, rrxa_3[] var2) {
      id_class(BL, var0, var1, var2);
   }

   public static void id_class(boolean var0) {
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
      So = rrbb_3.id_class(So, 0, 4);
   }

   public static void id_class(rrdX var0) {
      if (sr) {
         v = var0;
         Po.id_break(var0.ordinal());
      }
   }

   public static void id_class(QY var0) {
      p();
      id_class = var0;
      var0 = QY.id_instanceof();
      id_throws = org.lwjgl.opengl.GL.getCapabilities();
      id_case = GL11.glGetString(7938);
      id_catch = GL11.glGetString(7936);
      id_private = GL11.glGetString(7937);
      rrdJ.id_byte("OpenGL Version: " + id_case);
      rrdJ.id_byte("Vendor:  " + id_catch);
      rrdJ.id_byte("Renderer: " + id_private);
      rrdJ.id_byte(
         "Capabilities: "
            + (id_throws.OpenGL20 ? " 2.0 " : " - ")
            + (id_throws.OpenGL21 ? " 2.1 " : " - ")
            + (id_throws.OpenGL30 ? " 3.0 " : " - ")
            + (id_throws.OpenGL32 ? " 3.2 " : " - ")
            + (id_throws.OpenGL40 ? " 4.0 " : " - ")
      );
      rrdJ.id_byte("GL_MAX_DRAW_BUFFERS: " + GL43.glGetInteger(34852));
      rrdJ.id_byte("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL43.glGetInteger(36063));
      rrdJ.id_byte("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL43.glGetInteger(34930));
      id_implements = id_throws.OpenGL30;
      EF = Boolean.getBoolean("gl.debug.groups") && id_throws.GL_KHR_debug;
      if (EF) {
         rrdJ.id_byte("glDebugGroups: true");
      }

      id_class();
   }

   public static void id_class(String var0, IntBuffer var1) {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(var0).append(" [pos ").append(var1.position()).append(" lim ").append(var1.limit()).append(" cap ").append(var1.capacity()).append(" :");
      int var3 = var1.limit();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.append(" ").append(var1.get(var4));
      }

      var2.append("]");
      rrdJ.id_byte(var2.toString());
   }

   private static String id_class(String var0, rrdD[] var1) {
      if (var1 != null && var1.length > 0) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            rrdD var3 = var1[var2];
            if (var3.id_case(var0)) {
               var0 = var3.id_package();
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   private static int id_class(rrdG var0, String var1) {
      int var2 = 0;
      int var3 = rrbb_3.id_class(var1, -1);
      if (var0 == Bp) {
         if (var3 >= 0 && var3 < 2) {
            var2 = 36064 + var3;
            Bu = Math.max(Bu, var3 + 1);
         }

         return var2;
      } else {
         if (var3 >= 0 && var3 < 16) {
            var0.id_else()[var3] = true;
            var2 = 36064 + var3;
            BZ = Math.max(BZ, var3 + 1);
            BN = Math.max(BN, var3 + 1);
         }

         return var2;
      }
   }

   private static rrxa_3[] id_class(Properties var0, rrdM var1) {
      String var2 = "texture." + var1.id_class() + ".";
      Set var3 = var0.keySet();
      ArrayList var4 = new ArrayList();

      for (String var6 : var3) {
         if (var6.startsWith(var2)) {
            String var7 = rrzX_2.id_protected(var6, var2);
            var7 = rrzX_2.id_byte(var7, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
            String var8 = var0.getProperty(var6).trim();
            int var9 = id_class(var1, var7);
            if (var9 < 0) {
               rrdJ.id_break("Invalid texture name: " + var6);
            } else {
               rrxa_3 var10 = id_class(var9, var8);
               if (var10 != null) {
                  rrdJ.id_byte("Custom texture: " + var6 + " = " + var8);
                  var4.add(var10);
               }
            }
         }
      }

      return var4.size() <= 0 ? null : var4.toArray(new rrxa_3[var4.size()]);
   }

   public static boolean id_class(HU var0) {
      if (var0 == rrxA_2.id_class) {
         return sv.id_private();
      } else if (var0 == rrxA_2.id_byte) {
         return sF.id_private();
      } else if (var0 == rrxA_2.id_break) {
         return sL.id_private();
      } else {
         return var0 == rrxA_2.id_protected ? sA.id_private() : false;
      }
   }

   private static rrxa_3 id_class(int var0, String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         if (var1.indexOf(58) >= 0) {
            return id_break(var0, var1);
         } else {
            return var1.indexOf(32) >= 0 ? id_byte(var0, var1) : id_protected(var0, var1);
         }
      }
   }

   private static rrdD[] id_class(Map<String, rrdV> var0, rrdD[] var1) {
      HashSet var2 = new HashSet();

      for (String var4 : var0.keySet()) {
         rrdV var5 = (rrdV)var0.get(var4);
         rrdD[] var6 = var5.id_break();

         for (int var7 = 0; var7 < var6.length; var7++) {
            rrdD var8 = var6[var7];
            if (var8 != null) {
               var2.add(var8.id_class());
            }
         }
      }

      ArrayList var9 = new ArrayList();

      for (int var10 = 0; var10 < var1.length; var10++) {
         rrdD var11 = var1[var10];
         if (var11.id_native()) {
            String var12 = var11.id_class();
            if (!var2.contains(var12)) {
               var9.add(var11);
            }
         }
      }

      return var9.toArray(new rrdD[var9.size()]);
   }

   public static int id_class(String var0, int var1) {
      String var2 = var0 != null ? "screen." + var0 : "screen";
      if (sO == null) {
         return var1;
      } else {
         rrdV var3 = sO.get(var2);
         return var3 == null ? var1 : var3.id_byte();
      }
   }

   private static void id_class(rrxa_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            if (var0[var1] instanceof rrxV_2 var3) {
               var3.id_byte();
            }
         }
      }
   }

   private static int id_class(rrdM var0, String var1) {
      if (var0 == rrdM.GBUFFERS) {
         int var2 = rrkG.id_class(var1, "colortex", 4, 15);
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

      if (var0.id_break()) {
         int var3 = rrkG.id_class(var1, "colortex", 0, 15);
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

   public static rrdD[] id_class(rrdD[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrdD var3 = var0[var2];
         if (var3.id_finally() && var3.id_extends()) {
            var1.add(var3);
         }
      }

      return var1.toArray(new rrdD[var1.size()]);
   }

   private static Properties id_class(rrxi_3 var0) throws IOException {
      rrzE_2 var1 = new rrzE_2();
      String var2 = "shaderpacks/" + var0.id_class() + ".txt";
      File var3 = new File((File)QY.id_instanceof().id_class[24], var2);
      if (var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
         return var1;
      } else {
         return var1;
      }
   }

   private static void id_class(rrxi_3 var0, Properties var1) throws IOException {
      String var2 = "shaderpacks/" + var0.id_class() + ".txt";
      File var3 = new File((File)QY.id_instanceof().id_class[24], var2);
      if (var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }
   }

   private static void id_class(rrdD[] var0, rrxi_3 var1) {
      rrzE_2 var2 = new rrzE_2();
      if (Gr != null) {
         for (int var3 = 0; var3 < var0.length; var3++) {
            rrdD var4 = var0[var3];
            if (var4.id_extends() && var4.id_finally()) {
               var2.setProperty(var4.id_class(), var4.id_protected());
            }
         }
      }

      try {
         id_class(var1, var2);
      } catch (IOException var5) {
         rrbb_3.id_protected("[Shaders] Error saving configuration for " + Ei.id_class());
         var5.printStackTrace();
      }
   }

   private static void id_class(File var0) {
      if (var0.exists() && var0.isDirectory()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for (int var2 = 0; var2 < var1.length; var2++) {
               File var3 = var1[var2];
               if (var3.isDirectory()) {
                  id_class(var3);
               }

               var3.delete();
            }
         }
      }
   }

   private static void id_class(rrxf_3 var0, String var1) {
      id_catch("pre setupProgram");
      int var2 = id_break(var0, var1);
      id_catch("create");
      if (var2 != 0) {
         int var3 = ARBShaderObjects.glCreateProgramObjectARB();
         id_catch("create");
         if (var2 != 0) {
            ARBShaderObjects.glAttachObjectARB(var3, var2);
            id_catch("attach");
         }

         ARBShaderObjects.glLinkProgramARB(var3);
         if (GL43.glGetProgrami(var3, 35714) != 1) {
            rrdJ.id_class("Error linking program: " + var3 + " (" + var0.id_protected() + ")");
         }

         id_case(var3, var0.id_protected());
         if (var2 != 0) {
            ARBShaderObjects.glDetachObjectARB(var3, var2);
            ARBShaderObjects.glDeleteObjectARB(var2);
         }

         var0.id_class(var3);
         var0.id_break(var3);
         ARBShaderObjects.glUseProgramObjectARB(var3);
         ARBShaderObjects.glValidateProgramARB(var3);
         ARBShaderObjects.glUseProgramObjectARB(0);
         id_case(var3, var0.id_protected());
         int var4 = GL43.glGetProgrami(var3, 35715);
         if (var4 != 1) {
            String var5 = "\"";
            id_private("[Shaders] Error: Invalid program " + var5 + var0.id_protected() + var5);
            ARBShaderObjects.glDeleteObjectARB(var3);
            boolean var6 = false;
            var0.id_break();
         }
      }
   }

   public static void id_class(String var0, String var1) {
      try {
         File var2 = new File(sG, "debug/" + var0);
         var2.getParentFile().mkdirs();
         rrbb_3.id_class(var2, var1);
      } catch (IOException var3) {
         rrbb_3.id_protected("Error saving: " + var0);
         var3.printStackTrace();
      }
   }

   private static void id_class(rrdG var0, String var1, String var2, String var3) {
      id_catch("pre setupProgram");
      T = false;
      t = false;
      w = false;
      I = false;
      f = false;
      int var4 = id_break(var0, var1);
      int var5 = id_byte(var0, var2);
      int var6 = id_protected(var0, var3);
      id_catch("create");
      if (var4 != 0 || var5 != 0 || var6 != 0) {
         int var7 = ARBShaderObjects.glCreateProgramObjectARB();
         id_catch("create");
         if (var4 != 0) {
            ARBShaderObjects.glAttachObjectARB(var7, var4);
            id_catch("attach");
         }

         if (var5 != 0) {
            ARBShaderObjects.glAttachObjectARB(var7, var5);
            id_catch("attach");
            if (Ef) {
               ARBGeometryShader4.glProgramParameteriARB(var7, 36315, 4);
               ARBGeometryShader4.glProgramParameteriARB(var7, 36316, 5);
               ARBGeometryShader4.glProgramParameteriARB(var7, 36314, EV);
               id_catch("arbGeometryShader4");
            }

            if (Ej) {
               EXTGeometryShader4.glProgramParameteriEXT(var7, 36315, 4);
               EXTGeometryShader4.glProgramParameteriEXT(var7, 36316, 5);
               EXTGeometryShader4.glProgramParameteriEXT(var7, 36314, EV);
               id_catch("extGeometryShader4");
            }

            Eg = true;
         }

         if (var6 != 0) {
            ARBShaderObjects.glAttachObjectARB(var7, var6);
            id_catch("attach");
         }

         if (T) {
            ARBVertexShader.glBindAttribLocationARB(var7, F, "mc_Entity");
            id_catch("mc_Entity");
         }

         if (t) {
            ARBVertexShader.glBindAttribLocationARB(var7, L, "mc_midTexCoord");
            id_catch("mc_midTexCoord");
         }

         if (w) {
            ARBVertexShader.glBindAttribLocationARB(var7, A, "at_tangent");
            id_catch("at_tangent");
         }

         if (I) {
            ARBVertexShader.glBindAttribLocationARB(var7, n, "at_velocity");
            id_catch("at_velocity");
         }

         if (f) {
            ARBVertexShader.glBindAttribLocationARB(var7, C, "at_midBlock");
            id_catch("at_midBlock");
         }

         ARBShaderObjects.glLinkProgramARB(var7);
         if (GL43.glGetProgrami(var7, 35714) != 1) {
            rrdJ.id_class("Error linking program: " + var7 + " (" + var0.id_throws() + ")");
         }

         id_case(var7, var0.id_throws());
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

         var0.id_class(var7);
         var0.id_break(var7);
         id_class(var0);
         ARBShaderObjects.glValidateProgramARB(var7);
         id_class(By);
         id_case(var7, var0.id_throws());
         int var8 = GL43.glGetProgrami(var7, 35715);
         if (var8 != 1) {
            String var9 = "\"";
            id_private("[Shaders] Error: Invalid program " + var9 + var0.id_throws() + var9);
            ARBShaderObjects.glDeleteObjectARB(var7);
            boolean var10 = false;
            var0.id_break();
         }
      }
   }

   private static boolean id_class(int var0, String var1, List<String> var2) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      int var4 = GL43.glGetShaderi(var0, 35716);
      if (var4 <= 1) {
         return true;
      } else {
         for (int var5 = 0; var5 < var2.size(); var5++) {
            String var6 = (String)var2.get(var5);
            rrdJ.id_byte("File: " + (var5 + 1) + " = " + var6);
         }

         String var7 = GL43.glGetShaderInfoLog(var0, var4);
         var7 = rrzX_2.id_private(var7, " \n\r\t");
         rrdJ.id_byte("Shader info log: " + var1 + "\n" + var7);
         return false;
      }
   }

   private static void rd() {
      id_class(4, GE);
   }

   public static void m() {
      rrdG var0 = Ee.id_class();
      id_class(var0);
   }

   public static void o() {
      if (id_volatile) {
         id_class(Be);
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
      if (id_volatile) {
         if (!id_new) {
            id_long();
            id_class(SO);
            MT.id_package();
            MT.id_class(true);
         } else {
            MT.id_class(true);
         }
      }
   }

   public static void id_default() {
      id_final = false;
      id_class(m ? Bj : Bf);
      H();
      id_class(rrdX.NONE);
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
      id_class(rrdX.NONE);
   }

   public static void v() {
      m();
   }

   public static boolean j() {
      return Eq;
   }

   public static void q() {
      rc();
      id_class(GE);
      id_class(GG);
      id_class(Gb);
      id_class(GM);
      id_class(GO);
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
      id_class(Bg);
      id_break(-2, 0);
      id_class(rrdX.SKY);
   }

   public static void z() {
      MT.id_catch();
      MT.id_final();
   }

   public static void id_void() {
      id_class(Bw, false, GO);
   }

   public static boolean w() {
      return Ep && Eq;
   }

   public static void u() {
      Ee.id_class(Sz);
   }

   public static void r() {
      if (id_volatile) {
         id_break((an_3)null);
         id_class(m ? Bj : Bf);
      }
   }

   public static String y() {
      if (Ei == null) {
         return null;
      } else {
         return Ei instanceof rrdN ? null : Ei.id_class();
      }
   }

   public static void N() {
      if (id_final) {
         id_class(Bg);
      } else if (Sz == BI) {
         id_class(m ? Bj : Bf);
      }
   }

   private static void rh() {
      El = id_class.id_else().id_extends();
      EH = id_class.id_else().id_native();
      id_extends = Math.round((float)El * Sy);
      id_native = Math.round((float)EH * Sy);
      rJ();
   }

   public static void id_break(int var0, int var1) {
      EC++;
      En[EC * 2] = var0 & 65535 | var1 << 16;
      En[EC * 2 + 1] = 0;
   }

   public static void id_break(ryO_2 var0) {
      if (Y.id_case()) {
         int var1 = id_byte(var0);
         Y.id_break(var1);
      }
   }

   private static int id_break(rrxf_3 var0, String var1) {
      InputStream var2 = Ei.id_class(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(37305);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = id_class(Gr);
            ArrayList var5 = new ArrayList();
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.id_class(new InputStreamReader(var2));
                  var7 = rrks_1.id_class(var7, var1, Ei, 0, var5, 0);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = id_class(var10, var4);
                     var6.id_class(var10);
                     if (var8.id_class(var10)) {
                        rrdg_1 var11 = rrkG.id_class(var10);
                        if (var11 != null) {
                           if (var11.id_protected()) {
                              String var12 = var11.id_break();
                              int var13;
                              if ((var13 = rrkG.id_break(var12)) >= 0) {
                                 Bm = Math.max(Bm, var13 + 1);
                              } else if ((var13 = rrkG.id_byte(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                              } else if ((var13 = rrkG.id_protected(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                                 BF = true;
                              } else if ((var13 = rrkG.id_throws(var12)) >= 0) {
                                 Bc = Math.max(Bc, var13 + 1);
                              } else if ((var13 = rrkG.id_case(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                              } else if ((var13 = rrkG.id_catch(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                                 BF = true;
                              }
                           } else if (var11.id_byte("in")) {
                              rja_3 var19 = rrkG.id_finally(var11.id_byte());
                              if (var19 != null) {
                                 var0.id_class(var19);
                              } else {
                                 rrdJ.id_class("Invalid local size: " + var10);
                              }
                           } else if (var11.id_catch("workGroups")) {
                              rja_3 var20 = var11.id_new();
                              if (var20 != null) {
                                 var0.id_break(var20);
                              } else {
                                 rrdJ.id_class("Invalid workGroups: " + var10);
                              }
                           } else if (var11.id_native("workGroupsRender")) {
                              rjK_2 var21 = var11.id_continue();
                              if (var21 != null) {
                                 var0.id_class(var21);
                              } else {
                                 rrdJ.id_class("Invalid workGroupsRender: " + var10);
                              }
                           } else if (var11.id_class("MipmapEnabled", true)) {
                              String var22 = rrzX_2.id_throws(var11.id_break(), "MipmapEnabled");
                              int var28 = id_implements(var22);
                              if (var28 >= 0) {
                                 int var14 = var0.id_extends();
                                 var14 |= 1 << var28;
                                 var0.id_byte(var14);
                                 rrdJ.id_byte("%s mipmap enabled", var22);
                              }
                           }
                        }
                     }
                  }
               } catch (Exception var15) {
                  rrdJ.id_class("Couldn't read " + var1 + "!");
                  var15.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var17 = var6.toString();
            if (sy) {
               id_class(var1, var17);
            }

            if (var0.id_private() == null) {
               rrdJ.id_class("Missing local size: " + var1);
               GL43.glDeleteShader(var3);
               return 0;
            } else {
               ARBShaderObjects.glShaderSourceARB(var3, var17);
               ARBShaderObjects.glCompileShaderARB(var3);
               if (GL43.glGetShaderi(var3, 35713) != 1) {
                  rrdJ.id_class("Error compiling compute shader: " + var1);
               }

               id_class(var3, var1, var5);
               return var3;
            }
         }
      }
   }

   public static void id_break(an_3 var0) {
      if (R.id_case()) {
         int var1 = rrWu_1.id_class(var0);
         int var2 = rrxo_3.id_class(var1);
         R.id_break(var2);
      }
   }

   public static int id_break(int var0) {
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

   public static void id_break(boolean var0, boolean var1) {
      Ep = var0;
      Eq = var1;
   }

   public static void id_break(float var0, float var1, float var2, float var3) {
      if (id_volatile && !id_new) {
         g.id_class(var0, var1, var2, var3);
      }
   }

   private static void id_break(rrdF var0, rrdG var1) {
      int var2 = var0.id_protected();
      int var3 = var0.id_throws();
      if (var1.id_public() != null) {
         Dimension var4 = var1.id_public().id_class(var2, var3);
         var2 = var4.width;
         var3 = var4.height;
         rrxK_2 var5 = var0.id_class(var2, var3, var1.id_extends(), false);
         var5.id_break();
         GL43.glViewport(0, 0, var2, var3);
      }

      rrdj_1 var9 = var1.id_super();
      if (var9 != null) {
         int var10 = (int)((float)var2 * var9.id_break());
         int var6 = (int)((float)var3 * var9.id_byte());
         int var7 = (int)((float)var2 * var9.id_class());
         int var8 = (int)((float)var3 * var9.id_class());
         GL43.glViewport(var10, var6, var7, var8);
      }
   }

   public static rrxi_3 id_break(String var0) {
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

   public static void id_break(Ml_1 var0, ly_3 var1, float var2) {
      an_3 var3 = var1.id_catch();
      rjU_2 var4 = var1.id_break();
      double var5 = var4.id_break;
      double var7 = var4.id_byte;
      double var9 = var4.id_protected;
      id_byte(var3);
      Pe = var5 - (double)Br;
      Pa = var7;
      Pi = var9 - (double)BP;
      GL43.glViewport(0, 0, Bs, BE);
      GL43.glMatrixMode(5889);
      GL43.glLoadIdentity();
      if (Bh) {
         GL43.glOrtho((double)(-BO), (double)BO, (double)(-BO), (double)BO, 0.05F, 256.0);
      } else {
         MT.id_class(rjV_2.id_class((double)BM, (float)Bs / (float)BE, 0.05F, 256.0F));
      }

      var0.id_class(0.0, 0.0, -100.0);
      var0.id_class(rje_3.id_break.id_byte(90.0F));
      id_short = ((gm_3)id_class.id_class[56]).id_protected(var2);
      id_default = id_short < 0.75F ? id_short + 0.25F : id_short - 0.75F;
      float var11 = id_short * -360.0F;
      float var12 = sI > 0.0F ? var11 % sI - sI * 0.5F : 0.0F;
      if ((double)id_default <= 0.5) {
         var0.id_class(rje_3.id_case.id_byte(var11 - var12));
         var0.id_class(rje_3.id_break.id_byte(sw));
         id_const = id_default;
      } else {
         var0.id_class(rje_3.id_case.id_byte(var11 + 180.0F - var12));
         var0.id_class(rje_3.id_break.id_byte(sw));
         id_const = id_default - 0.5F;
      }

      if (Bh) {
         float var13 = sY;
         float var14 = var13 / 2.0F;
         var0.id_class((double)((float)var5 % var13 - var14), (double)((float)var7 % var13 - var14), (double)((float)var9 % var13 - var14));
      }

      float var21 = id_default * (float) (Math.PI * 2);
      float var22 = (float)Math.cos((double)var21);
      float var15 = (float)Math.sin((double)var21);
      float var16 = sw * (float) (Math.PI * 2);
      float var17 = var22;
      float var18 = var15 * (float)Math.cos((double)var16);
      float var19 = var15 * (float)Math.sin((double)var16);
      if ((double)id_default > 0.5) {
         var17 = -var22;
         var18 = -var18;
         var19 = -var19;
      }

      id_try[0] = var17;
      id_try[1] = var18;
      id_try[2] = var19;
      id_try[3] = 0.0F;
      rk();
      rjV_2 var20 = var0.id_byte().id_class();
      var20.id_class((FloatBuffer)((Buffer)Ek).position(0));
      rrdx_1.id_class((FloatBuffer)((Buffer)EW).position(0), (FloatBuffer)((Buffer)Ek).position(0), EM, Eb);
      ((Buffer)Ek).position(0);
      ((Buffer)EW).position(0);
      id_class(Pu, false, EO);
      id_class(Pm, false, Eh);
      id_class(Pc, false, Ez);
      id_class(PQ, false, EX);
      id_class(PN, false, EJ);
      id_class(PZ, false, EQ);
      id_class(Pv, false, Ex);
      id_class(PF, false, Ed);
      id_class(PL, false, Ek);
      id_class(PA, false, EW);
      id_catch("setCamera");
   }

   private static rrxf_3[] id_break(rrdG var0, String var1, String var2, String var3) {
      if (var0.id_case() == rrdM.GBUFFERS) {
         return new rrxf_3[0];
      } else {
         ArrayList var4 = new ArrayList();
         byte var5 = 27;

         for (int var6 = 0; var6 < var5; var6++) {
            String var7 = var6 > 0 ? "_" + (char)(97 + var6 - 1) : "";
            String var8 = var2 + var7;
            String var9 = var1 + var8 + var3;
            rrxf_3 var10 = new rrxf_3(var0.id_throws(), var0.id_case());
            id_class(var10, var9);
            if (var10.id_case() > 0) {
               var4.add(var10);
               rrdJ.id_byte("Compute program loaded: " + var8);
            }
         }

         return var4.toArray(new rrxf_3[var4.size()]);
      }
   }

   public static void id_break(rdn_3 var0) {
      id_synchronized = id_byte(var0);
   }

   private static rrxa_3 id_break(int var0, String var1) {
      String var2 = var1.trim();
      byte var3 = 0;
      if (var2.startsWith("minecraft:textures/")) {
         var2 = rrzX_2.id_case(var2, ".png");
         if (var2.endsWith("_n.png")) {
            var2 = rrzX_2.id_class(var2, "_n.png", ".png");
            var3 = 1;
         } else if (var2.endsWith("_s.png")) {
            var2 = rrzX_2.id_class(var2, "_s.png", ".png");
            var3 = 2;
         }
      }

      if (var2.startsWith("minecraft:dynamic/lightmap_")) {
         var2 = var2.replace("lightmap", "light_map");
      }

      rqO_2 var4 = new rqO_2(var2);
      return new rrxV_2(var0, var4, var3);
   }

   public static void id_break(boolean var0) {
      Ey = true;
      if (var0) {
         id_class(rrdX.HAND_TRANSLUCENT);
      } else {
         id_class(rrdX.HAND_SOLID);
      }
   }

   private static int id_break(rrdG var0, String var1) {
      InputStream var2 = Ei.id_class(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(35633);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = id_class(Gr);
            ArrayList var5 = new ArrayList();
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.id_class(new InputStreamReader(var2));
                  var7 = rrks_1.id_class(var7, var1, Ei, 0, var5, 0);
                  var7 = rrks_1.id_class(var7);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = id_class(var10, var4);
                     var6.id_class(var10);
                     if (var8.id_class(var10)) {
                        rrdg_1 var11 = rrkG.id_class(var10);
                        if (var11 != null) {
                           if (var11.id_break("mc_Entity")) {
                              l = true;
                              T = true;
                           } else if (var11.id_break("mc_midTexCoord")) {
                              H = true;
                              t = true;
                           } else if (var11.id_break("at_tangent")) {
                              y = true;
                              w = true;
                           } else if (var11.id_break("at_velocity")) {
                              p = true;
                              I = true;
                           } else if (var11.id_break("at_midBlock")) {
                              q = true;
                              f = true;
                           }

                           if (var11.id_throws("countInstances")) {
                              var0.id_protected(var11.id_package());
                              rrdJ.id_byte("countInstances: " + var0.id_final());
                           }
                        }
                     }
                  }
               } catch (Exception var12) {
                  rrdJ.id_class("Couldn't read " + var1 + "!");
                  var12.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var15 = var6.toString();
            if (sy) {
               id_class(var1, var15);
            }

            ARBShaderObjects.glShaderSourceARB(var3, var15);
            ARBShaderObjects.glCompileShaderARB(var3);
            if (GL43.glGetShaderi(var3, 35713) != 1) {
               rrdJ.id_class("Error compiling vertex shader: " + var1);
            }

            id_class(var3, var1, var5);
            return var3;
         }
      }
   }

   public static String id_break(String var0, String var1) {
      String var2 = GB.get(var0);
      return var2 == null ? var1 : var2;
   }

   public static void id_break() {
      rrdJ.id_byte("Save shaders configuration.");
      if (Sm == null) {
         Sm = new rrzE_2();
      }

      rrdy_1[] var0 = rrdy_1.values();

      for (int var1 = 0; var1 < var0.length; var1++) {
         rrdy_1 var2 = var0[var1];
         String var3 = var2.id_break();
         String var4 = id_class(var2);
         Sm.setProperty(var3, var4);
      }

      try {
         FileWriter var6 = new FileWriter(sb);
         Sm.store(var6, (String)null);
         var6.close();
      } catch (Exception var5) {
         rrdJ.id_class("Error saving configuration: " + var5.getClass().getName() + ": " + var5.getMessage());
      }
   }

   private static void id_break(rrdG var0) {
      int var1 = GL43.glGetInteger(34852);
      Arrays.fill(var0.id_else(), false);
      if (var0 == Sd) {
         var0.id_class((rrxY_2)null);
      } else if (var0.id_private() == 0) {
         if (var0 == Bp) {
            var0.id_class(EZ);
         } else {
            var0.id_class(Ev[0]);
         }
      } else {
         String[] var2 = var0.id_finally();
         if (var2 == null) {
            if (var0 != Bp && var0 != Bq && var0 != BT) {
               var0.id_class(Eu);
               Bv = Math.min(BN, var1);
               Arrays.fill(var0.id_else(), 0, BN, true);
            } else {
               var0.id_class(Em);
            }
         } else {
            rrxY_2 var3 = var0.id_native();
            int var4 = var2.length;
            Bv = Math.max(Bv, var4);
            var4 = Math.min(var4, var1);
            var0.id_class(var3);
            var3.id_protected(var4);

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = id_class(var0, var2[var5]);
               var3.id_class(var5, var6);
            }

            String var8 = var3.id_class(false);
            String var9 = var3.id_class(true);
            if (!rrbb_3.id_class((Object)var8, (Object)var9)) {
               rrdJ.id_byte("Draw buffers: " + var8 + " -> " + var9);
            }
         }
      }
   }

   private static rrdD[] id_break(rrdD[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrdD var3 = var0[var2];
         if (var3.id_native()) {
            var1.add(var3);
         }
      }

      return var1.toArray(new rrdD[var1.size()]);
   }

   public static void id_break(Ml_1 var0) {
      rjV_2 var1 = var0.id_byte().id_class();
      rjV_2 var2 = new rjV_2(var1);
      var2.id_protected();
      var2.id_class(Ew);
      rrdx_1.id_break(id_return, Ew, id_throw);
      rrdx_1.id_break(id_public, Ew, id_interface);
      System.arraycopy(id_const == id_default ? id_return : id_public, 0, id_goto, 0, 3);
      id_class(PJ, 0.0F, 0.0F, 0.0F);
      id_class(Px, 0.0F, 0.0F, 0.0F);
      id_class(Pd, 0.0F, 0.0F, 0.0F);
      if (GJ != null) {
         GJ.id_class();
      }

      id_catch("postCelestialRotate");
   }

   private static void id_break(rrxa_3[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            rrxa_3 var2 = var0[var1];
            MT.id_new(33984 + var2.id_class());
            int var3 = var2.id_protected();
            int var4 = var2.af_();
            if (var4 == 3553) {
               MT.id_super(var3);
            } else {
               GL11.glBindTexture(var4, var3);
            }
         }

         MT.id_new(33984);
      }
   }

   public static rrdD[] id_throws() {
      return Gr;
   }

   public static boolean id_throws(String var0) {
      return GP == null ? false : GP.contains(var0);
   }

   private static String id_throws(int var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      if (var0 == 1286) {
         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         String var4 = id_continue(var3);
         String var5 = ", fbStatus: " + var3 + " (" + var4 + ")";
         var2.append(var5);
      }

      String var6 = Sz.id_throws();
      if (var6.isEmpty()) {
         var6 = "none";
      }

      var2.append(", program: " + var6);
      rrdG var7 = id_new(SQ);
      if (var7 != Sz) {
         String var8 = var7.id_throws();
         if (var8.isEmpty()) {
            var8 = "none";
         }

         var2.append(" (" + var8 + ")");
      }

      if (var1.equals("setDrawBuffers")) {
         var2.append(", drawBuffers: " + rrki_1.id_class(Sz.id_finally()));
      }

      return var2.toString();
   }

   public static void id_throws(int var0) {
      GL43.glEnable(var0);
      if (var0 == 3553) {
         N();
      } else if (var0 == 2912) {
         F();
      }
   }

   private static void id_throws(rrdG var0) {
      if (var0.id_case().id_byte()) {
         rrWz_1 var1 = null;
         int var2 = 0;
         int var3 = 0;
         rrxY_2 var4 = var0.id_extends();
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.id_break(); var5++) {
               int var6 = var4.id_class(var5);
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
               if (var3 != var4.id_break()) {
                  rrdJ.id_class("Program " + var0.id_throws() + " draws to buffers with different sizes");
               } else {
                  var0.id_class(var1);
               }
            }
         }
      }
   }

   public static void id_throws(Ml_1 var0) {
      id_byte(var0);
      GL11.glColor3f(sV, sg, sR);
      id_protected(var0);
      GL11.glColor3f(id_abstract, id_long, id_float);
   }

   public static void L() {
      Z = false;
      id_class(rK, 0);
   }

   public static void M() {
      id_class(Bf);
      id_class(rrdX.PARTICLES);
   }

   public static void W() {
      if (id_volatile) {
         if (id_new) {
         }

         id_class(m ? Bj : Bf);
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
      if (id_volatile) {
         id_continue = true;
      }
   }

   public static boolean id_finally() {
      return !sk.id_catch() ? sk.id_private() : true;
   }

   public static InputStream id_finally(String var0) {
      return Ei == null ? null : Ei.id_class(var0);
   }

   public static void id_finally(int var0) {
      GL43.glDisable(var0);
      L();
   }

   public static ArrayList id_catch() {
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

   public static void id_catch(int var0) {
      GL43.glEnable(var0);
      N();
   }

   public static void id_catch(Ml_1 var0) {
      id_catch("pre endHand");
      id_case("pre endHand");
      var0.id_break();
      GL43.glMatrixMode(5889);
      GL43.glPopMatrix();
      GL43.glMatrixMode(5888);
      GL43.glPopMatrix();
      MT.id_break(770, 771);
      id_catch("endHand");
   }

   public static int id_catch(String var0) {
      int var1 = MT.id_switch();
      if (var1 != 0 && rrbo_3.id_class(var1)) {
         String var2 = rrbb_3.id_byte(var1);
         String var3 = id_throws(var1, var0);
         String var4 = String.format("OpenGL error: %s (%s)%s, at: %s", var1, var2, var3, var0);
         rrdJ.id_class(var4);
         if (rrbb_3.rT() && rrzQ_2.id_class("ShowGlErrorShaders", 10000L)) {
            String var5 = jI_2.id_class("of.message.openglError", var1, var2);
            id_volatile(var5);
         }
      }

      return var1;
   }

   public static void G() {
      if (id_volatile) {
         id_catch("endBlockEntities");
         id_break((ryO_2)null);
         id_class(m ? Bj : Bf);
         rrdA.id_class(SZ.id_this());
      }
   }

   public static void O() {
      id_class(Bj);
      id_class(rrdX.NONE);
   }

   public static int id_extends(int var0) {
      En[EC * 2] = En[EC * 2] & 65535 | var0 << 16;
      return var0;
   }

   public static boolean id_extends() {
      if (!SR.id_catch()) {
         return SR.id_private();
      } else {
         return !sx.id_catch() ? sx.id_private() : true;
      }
   }

   public static boolean id_extends(String var0) {
      if (var0 == null) {
         return false;
      } else if (var0.length() <= 0) {
         return false;
      } else {
         int var1 = var0.lastIndexOf("/");
         if (var1 >= 0) {
            var0 = var0.substring(var1 + 1);
         }

         rrdG var2 = id_native(var0);
         return var2 != null;
      }
   }

   public static void id_goto() {
      rrdJ.id_byte("Reset model renderers");
      id_finally++;
      rrdJ.id_byte("Reset world renderers");
      ((yX_2)id_class.id_class[8]).id_throws();
   }

   public static gm_3 K() {
      return GS;
   }

   public static void id_case(int var0) {
      GL43.glDisable(var0);
      if (var0 == 3553) {
         c();
      } else if (var0 == 2912) {
         L();
      }
   }

   public static void id_case() {
      id_class(Gr, Ei);
   }

   public static void id_case(Ml_1 var0) {
      if ((double)SH != 1.0) {
         var0.id_class(1.0F, 1.0F, SH);
      }
   }

   private static boolean id_case(int var0, String var1) {
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
         var6 = rrzX_2.id_private(var6, " \n\r\t");
         rrdJ.id_byte("Info log: " + var1 + "\n" + var6);
         return false;
      } else {
         return true;
      }
   }

   public static int id_case(String var0) {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var1 != 36053) {
         rrdJ.id_class("FramebufferStatus 0x%04X at '%s'", var1, var0);
      }

      return var1;
   }

   public static void id_const() {
      id_catch("beginUpdateChunks1");
      id_case("beginUpdateChunks1");
      if (!id_new) {
         id_class(BY);
      }

      id_catch("beginUpdateChunks2");
      id_case("beginUpdateChunks2");
   }

   public static boolean id_continue() {
      return !sm.id_implements();
   }

   private static String id_continue(int var0) {
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

   public static boolean id_else() {
      return sC.id_private();
   }

   public static void id_for() {
      if (id_volatile) {
         id_class(Sr);
         id_class(rrdX.ENTITIES);
      }
   }

   public static int id_implements(String var0) {
      int var1 = rrkG.id_class(var0, "colortex", 0, 15);
      if (var1 >= 0) {
         return var1;
      } else {
         int var2 = rrkG.id_class(var0, "colorimg", 0, 15);
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

   public static boolean id_implements() {
      if (!SY.id_catch()) {
         return SY.id_private();
      } else {
         return !sd.id_catch() ? sd.id_private() : true;
      }
   }

   public static void id_implements(int var0) {
      GL43.glEnable(var0);
      F();
   }

   public static void id_import() {
      if (id_new) {
         id_catch("shadow endRender");
      } else {
         if (!id_package) {
            id_float();
         }

         id_volatile = false;
         MT.id_class(true, true, true, true);
         id_class(By);
         id_class(rrdX.NONE);
         HF.id_break();
         id_catch("endRender end");
      }
   }

   public static void id_instanceof() {
      BS = true;
   }

   public static boolean id_new() {
      return !su.id_implements();
   }

   private static rrdG id_new(int var0) {
      for (int var1 = 0; var1 < SW.length; var1++) {
         rrdG var2 = SW[var1];
         if (var2.id_private() == var0) {
            return var2;
         }
      }

      return By;
   }

   public static boolean id_package() {
      return !sN.id_implements();
   }

   private static String id_package(String var0) {
      int var1 = var0.indexOf(95);
      return var1 < 0 ? var0 : var0.substring(0, var1) + var0.substring(var1).toUpperCase(Locale.ROOT);
   }

   private static FloatBuffer id_package(int var0) {
      ByteBuffer var1 = Gz;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0 * 4);
      return var1.asFloatBuffer();
   }

   public static boolean id_return() {
      return !sH.id_implements();
   }

   private static rji_3 id_super(int var0) {
      rji_3 var1 = BC[var0];
      if (var1 != null) {
         return var1;
      } else if (var0 == 0) {
         return id_char;
      } else {
         return var0 == 1 ? EK : Eo;
      }
   }

   public static boolean id_super() {
      return !sZ.id_implements();
   }

   public static void id_switch() {
      if (id_volatile && SS.id_private() != By.id_private()) {
         id_class(Sr);
         MT.id_protected();
      }
   }

   public static void id_throw() {
      if (id_new) {
         id_catch("shadow clear pre");
         BA.id_class(new rji_3(1.0F, 1.0F, 1.0F, 1.0F));
         id_catch("shadow clear");
      } else {
         id_catch("clear pre");
         rji_3[] var0 = new rji_3[BN];

         for (int var1 = 0; var1 < var0.length; var1++) {
            var0[var1] = id_super(var1);
         }

         BL.id_class(Bn, var0);
         BL.id_finally();
         id_case("clear");
         id_catch("clear");
      }
   }

   public static void id_try() {
      EH = 0;
   }

   public static void id_while() {
      if (id_protected) {
         id_catch("Shaders.uninit pre");

         for (int var0 = 0; var0 < SW.length; var0++) {
            rrdG var1 = SW[var0];
            if (var1.id_implements() != 0) {
               ARBShaderObjects.glDeleteObjectARB(var1.id_implements());
               id_catch("del programRef");
            }

            var1.id_break(0);
            var1.id_class(0);
            var1.id_class((String[])null);
            var1.id_class((rrxY_2)null);
            var1.id_byte(0);
            rrxf_3[] var2 = var1.id_goto();

            for (int var3 = 0; var3 < var2.length; var3++) {
               rrxf_3 var4 = var2[var3];
               if (var4.id_catch() != 0) {
                  ARBShaderObjects.glDeleteObjectARB(var4.id_catch());
                  id_catch("del programRef");
               }

               var4.id_break(0);
               var4.id_class(0);
            }

            var1.id_class(new rrxf_3[0]);
         }

         Ea = false;
         SN = false;
         Sc = false;
         if (BL != null) {
            BL.id_break();
            BL = null;
            id_catch("del dfb");
         }

         if (BA != null) {
            BA.id_break();
            BA = null;
            id_catch("del sfb");
         }

         if (Eu != null) {
            id_class(Eu);
         }

         if (Em != null) {
            id_class(Em);
         }

         if (Gx != null) {
            Gx.id_throws();
            Gx = null;
         }

         for (int var5 = 0; var5 < si.length; var5++) {
            MT.id_class(si[var5], 0, 0, false, 0, 35000, 32856);
         }

         rrdJ.id_byte("Uninit");
         BB = false;
         BJ = false;
         id_protected = false;
         id_catch("Shaders.uninit");
      }
   }

   private static void rs() {
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

      for (int var0 = 0; var0 < SW.length; var0++) {
         rrdG var1 = SW[var0];
         var1.id_class();
      }

      Arrays.fill(GX, null);
      if (Ei != null) {
         rrxt_3.id_class(Ei);
         rrdP.id_class(Ei);
         rrxo_3.id_class(Ei);
         String var4 = "/shaders/shaders.properties";

         try {
            InputStream var5 = Ei.id_class(var4);
            if (var5 == null) {
               return;
            }

            var5 = rrdT.id_class(var5, var4, true);
            rrzE_2 var2 = new rrzE_2();
            var2.load(var5);
            var5.close();
            sJ.id_class(var2);
            sd.id_class(var2);
            sk.id_class(var2);
            sW.id_class(var2);
            sz.id_class(var2);
            sQ.id_class(var2);
            sN.id_class(var2);
            sc.id_class(var2);
            su.id_class(var2);
            sZ.id_class(var2);
            sm.id_class(var2);
            sv.id_class(var2);
            sF.id_class(var2);
            sL.id_class(var2);
            sA.id_class(var2);
            sn.id_class(var2);
            sC.id_class(var2);
            sH.id_class(var2);
            sh = rrks_1.id_break(var2, Gr);
            GE = id_class(var2, rrdM.GBUFFERS);
            GG = id_class(var2, rrdM.COMPOSITE);
            Gb = id_class(var2, rrdM.DEFERRED);
            GM = id_class(var2, rrdM.SHADOWCOMP);
            GO = id_class(var2, rrdM.PREPARE);
            Gh = var2.getProperty("texture.noise");
            if (Gh != null) {
               Gd = true;
            }

            GJ = rrks_1.id_class(var2);
            rrks_1.id_break(var2);
            rrks_1.id_byte(var2);
            rrks_1.id_protected(var2);
            rrks_1.id_throws(var2);
            GX = rrks_1.id_class(var2, 16);
         } catch (IOException var3) {
            rrbb_3.id_protected("[Shaders] Error reading: " + var4);
         }
      }
   }

   public static void id_static() {
      id_class(BA, Bt, false, GM);
   }

   public static void id_public() {
      boolean var0;
      if (!id_byte) {
         id_byte = true;
         var0 = true;
      } else {
         var0 = false;
      }

      if (!id_protected) {
         id_catch("Shaders.init pre");
         if (y() != null) {
         }

         if (!id_throws.OpenGL20) {
            id_private("No OpenGL 2.0");
         }

         if (!id_throws.GL_EXT_framebuffer_object) {
            id_private("No EXT_framebuffer_object");
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
         id_private();
         rrkT.id_break();
         ER.id_class();
         if (GJ != null) {
            GJ.id_break();
         }

         rrkb_1 var1 = rrdm_1.id_class(sM, Gr, false);
         String var2 = "";
         if (GS != null) {
            int var3 = rrzc_3.id_class(GS.E());
            if (Gs.contains(var3)) {
               var2 = "world" + var3 + "/";
            }
         }

         rs();

         for (int var14 = 0; var14 < SW.length; var14++) {
            rrdG var4 = SW[var14];
            var4.id_break();
            var4.id_byte();
            if (var4.id_case() != rrdM.NONE) {
               String var5 = var4.id_throws();
               String var6 = var2 + var5;
               boolean var7 = true;
               if (sh.containsKey(var6)) {
                  var7 = var7 && sh.get(var6).id_break();
               }

               if (var1 != null) {
                  var7 = var7 && !var1.id_protected(var6);
               }

               if (!var7) {
                  rrdJ.id_byte("Program disabled: " + var6);
                  var5 = "<disabled>";
                  var6 = var2 + var5;
               }

               String var8 = "/shaders/" + var6;
               String var9 = var8 + ".vsh";
               String var10 = var8 + ".gsh";
               String var11 = var8 + ".fsh";
               rrxf_3[] var12 = id_break(var4, "/shaders/", var6, ".csh");
               var4.id_class(var12);
               rrbb_3.id_class(10L);
               id_class(var4, var9, var10, var11);
               int var13 = var4.id_private();
               if (var13 > 0) {
                  rrdJ.id_byte("Program loaded: " + var6);
               }

               id_break(var4);
               id_byte(var4);
               id_protected(var4);
               id_throws(var4);
            }
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
         int var15 = GL43.glGetInteger(34852);
         if (Bv > var15) {
            id_private("[Shaders] Error: Not enough draw buffers, needed: " + Bv + ", available: " + var15);
            Bv = var15;
         }

         Eu.id_byte(0).id_protected(Bv);

         for (int var16 = 0; var16 < Bv; var16++) {
            Eu.id_class(var16, 36064 + var16);
         }

         Em.id_byte(0).id_protected(Bu);

         for (int var17 = 0; var17 < Bu; var17++) {
            Em.id_class(var17, 36064 + var17);
         }

         for (int var18 = 0; var18 < SW.length; var18++) {
            rrdG var21 = SW[var18];
            rrdG var22 = var21;

            while (var22.id_private() == 0 && var22.id_catch() != var22) {
               var22 = var22.id_catch();
            }

            if (var22 != var21 && var21 != Bp) {
               var21.id_class(var22);
            }
         }

         rh();
         rX();
         if (Gd) {
            rM();
         }

         if (SZ == null) {
            SZ = rrdA.id_class();
         }

         Ml_1 var19 = new Ml_1();
         var19.id_class(rje_3.id_protected.id_byte(-90.0F));
         id_class(var19);
         id_break(var19);
         id_protected = true;
         rO();
         id_goto();
         if (!var0) {
         }

         id_catch("Shaders.init");
      }
   }

   public static rrdD id_protected(String var0) {
      return rrdm_1.id_class(var0, Gr);
   }

   private static void id_protected(an_3 var0) {
      if (var0 == null) {
         Br = 0;
         BP = 0;
      } else {
         Br = (int)var0.rx() / 1000 * 1000;
         BP = (int)var0.BO() / 1000 * 1000;
      }
   }

   private static rrxa_3 id_protected(int var0, String var1) {
      var1 = var1.trim();
      if (var1.indexOf(46) < 0) {
         var1 = var1 + ".png";
      }

      try {
         String var2 = "shaders/" + rrzX_2.id_protected(var1, "/");
         InputStream var3 = Ei.id_class(var2);
         if (var3 == null) {
            rrdJ.id_break("Texture not found: " + var1);
            return null;
         } else {
            IOUtils.closeQuietly(var3);
            rrdl_1 var4 = new rrdl_1(var2);
            var4.a_(id_class.F());
            return new rrxj_3(var0, var2, var4);
         }
      } catch (IOException var5) {
         rrdJ.id_break("Error loading texture: " + var1);
         rrdJ.id_break(var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      }
   }

   public static void id_protected(Ml_1 var0) {
      lD_2 var1 = yb_3.id_class().id_byte();
      float var2 = (float)(((Qw_1)id_class.id_class[20]).id_break * 16);
      double var3 = (double)var2 * 0.9238;
      double var5 = (double)var2 * 0.3826;
      double var7 = -var5;
      double var9 = -var3;
      double var11 = 16.0;
      double var13 = -Pa + GS.id_synchronized().id_volatile() + 12.0 - 16.0;
      if (Pa < GS.id_synchronized().id_volatile()) {
         var13 = -4.0;
      }

      MT.id_transient();
      MT.id_class(var0.id_byte().id_class());
      var1.id_class(7, ju_3.id_super);
      var1.id_class(var7, var13, var9).id_class();
      var1.id_class(var7, var11, var9).id_class();
      var1.id_class(var9, var11, var7).id_class();
      var1.id_class(var9, var13, var7).id_class();
      var1.id_class(var9, var13, var7).id_class();
      var1.id_class(var9, var11, var7).id_class();
      var1.id_class(var9, var11, var5).id_class();
      var1.id_class(var9, var13, var5).id_class();
      var1.id_class(var9, var13, var5).id_class();
      var1.id_class(var9, var11, var5).id_class();
      var1.id_class(var7, var11, var3).id_class();
      var1.id_class(var7, var13, var3).id_class();
      var1.id_class(var7, var13, var3).id_class();
      var1.id_class(var7, var11, var3).id_class();
      var1.id_class(var5, var11, var3).id_class();
      var1.id_class(var5, var13, var3).id_class();
      var1.id_class(var5, var13, var3).id_class();
      var1.id_class(var5, var11, var3).id_class();
      var1.id_class(var3, var11, var5).id_class();
      var1.id_class(var3, var13, var5).id_class();
      var1.id_class(var3, var13, var5).id_class();
      var1.id_class(var3, var11, var5).id_class();
      var1.id_class(var3, var11, var7).id_class();
      var1.id_class(var3, var13, var7).id_class();
      var1.id_class(var3, var13, var7).id_class();
      var1.id_class(var3, var11, var7).id_class();
      var1.id_class(var5, var11, var9).id_class();
      var1.id_class(var5, var13, var9).id_class();
      var1.id_class(var5, var13, var9).id_class();
      var1.id_class(var5, var11, var9).id_class();
      var1.id_class(var7, var11, var9).id_class();
      var1.id_class(var7, var13, var9).id_class();
      var1.id_class(var9, var13, var9).id_class();
      var1.id_class(var9, var13, var3).id_class();
      var1.id_class(var3, var13, var3).id_class();
      var1.id_class(var3, var13, var9).id_class();
      yb_3.id_class().id_break();
      MT.id_for();
   }

   private static void id_protected(rrdG var0) {
      boolean[] var1 = var0.id_else();
      Boolean[] var2 = var0.id_this();

      for (int var3 = 0; var3 < var2.length; var3++) {
         Boolean var4 = var2[var3];
         if (var4 != null) {
            var1[var3] = var4;
         }
      }
   }

   public static void id_protected(int var0) {
      sf = var0;
      if (Z) {
         id_class(rK, var0);
      }
   }

   private static int id_protected(rrdG var0, String var1) {
      InputStream var2 = Ei.id_class(var1);
      if (var2 == null) {
         return 0;
      } else {
         int var3 = ARBShaderObjects.glCreateShaderObjectARB(35632);
         if (var3 == 0) {
            return 0;
         } else {
            rrdD[] var4 = id_class(Gr);
            ArrayList var5 = new ArrayList();
            rrWV var6 = new rrWV();
            if (var6 != null) {
               try {
                  rrWV var7 = rrWV.id_class(new InputStreamReader(var2));
                  var7 = rrks_1.id_class(var7, var1, Ei, 0, var5, 0);
                  rrdt_1 var8 = new rrdt_1();

                  for (String var10 : var7) {
                     var10 = id_class(var10, var4);
                     var6.id_class(var10);
                     if (var8.id_class(var10)) {
                        rrdg_1 var11 = rrkG.id_class(var10);
                        if (var11 != null) {
                           if (var11.id_protected()) {
                              String var12 = var11.id_break();
                              int var13;
                              if ((var13 = rrkG.id_break(var12)) >= 0) {
                                 Bm = Math.max(Bm, var13 + 1);
                              } else if ((var13 = rrkG.id_byte(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                              } else if ((var13 = rrkG.id_protected(var12)) >= 0) {
                                 Bu = Math.max(Bu, var13 + 1);
                                 BF = true;
                              } else if ((var13 = rrkG.id_throws(var12)) >= 0) {
                                 Bc = Math.max(Bc, var13 + 1);
                              } else if (var12.equals("gdepth") && EY[1] == 6408) {
                                 EY[1] = 34836;
                              } else if ((var13 = rrkG.id_case(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                              } else if ((var13 = rrkG.id_catch(var12)) >= 0) {
                                 BN = Math.max(BN, var13 + 1);
                                 BF = true;
                              } else if (var12.equals("centerDepthSmooth")) {
                                 Q = true;
                              }
                           } else if (var11.id_throws("shadowMapResolution") || var11.id_protected("SHADOWRES")) {
                              BG = Bb = var11.id_package();
                              Bs = BE = Math.round((float)BG * Sp);
                              rrdJ.id_byte("Shadow map resolution: " + BG);
                           } else if (var11.id_private("shadowMapFov") || var11.id_protected("SHADOWFOV")) {
                              BM = var11.id_int();
                              Bh = false;
                              rrdJ.id_byte("Shadow map field of view: " + BM);
                           } else if (var11.id_private("shadowDistance") || var11.id_protected("SHADOWHPL")) {
                              BO = var11.id_int();
                              Bh = true;
                              rrdJ.id_byte("Shadow map distance: " + BO);
                           } else if (var11.id_private("shadowDistanceRenderMul")) {
                              BX = var11.id_int();
                              rrdJ.id_byte("Shadow distance render mul: " + BX);
                           } else if (var11.id_private("shadowIntervalSize")) {
                              sY = var11.id_int();
                              rrdJ.id_byte("Shadow map interval size: " + sY);
                           } else if (var11.id_break("generateShadowMipmap", true)) {
                              Arrays.fill(SF, true);
                              rrdJ.id_byte("Generate shadow mipmap");
                           } else if (var11.id_break("generateShadowColorMipmap", true)) {
                              Arrays.fill(SA, true);
                              rrdJ.id_byte("Generate shadow color mipmap");
                           } else if (var11.id_break("shadowHardwareFiltering", true)) {
                              Arrays.fill(Sv, true);
                              rrdJ.id_byte("Hardware shadow filtering enabled.");
                           } else if (var11.id_break("shadowHardwareFiltering0", true)) {
                              Sv[0] = true;
                              rrdJ.id_byte("shadowHardwareFiltering0");
                           } else if (var11.id_break("shadowHardwareFiltering1", true)) {
                              Sv[1] = true;
                              rrdJ.id_byte("shadowHardwareFiltering1");
                           } else if (var11.id_class("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                              SF[0] = true;
                              rrdJ.id_byte("shadowtex0Mipmap");
                           } else if (var11.id_break("shadowtex1Mipmap", true)) {
                              SF[1] = true;
                              rrdJ.id_byte("shadowtex1Mipmap");
                           } else if (var11.id_class("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                              SA[0] = true;
                              rrdJ.id_byte("shadowcolor0Mipmap");
                           } else if (var11.id_class("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                              SA[1] = true;
                              rrdJ.id_byte("shadowcolor1Mipmap");
                           } else if (var11.id_class("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                              SL[0] = true;
                              rrdJ.id_byte("shadowtex0Nearest");
                           } else if (var11.id_class("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                              SL[1] = true;
                              rrdJ.id_byte("shadowtex1Nearest");
                           } else if (var11.id_class("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                              Sn[0] = true;
                              rrdJ.id_byte("shadowcolor0Nearest");
                           } else if (var11.id_class("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                              Sn[1] = true;
                              rrdJ.id_byte("shadowcolor1Nearest");
                           } else if (var11.id_private("wetnessHalflife") || var11.id_protected("WETNESSHL")) {
                              G = var11.id_int();
                              rrdJ.id_byte("Wetness halflife: " + G);
                           } else if (var11.id_private("drynessHalflife") || var11.id_protected("DRYNESSHL")) {
                              b = var11.id_int();
                              rrdJ.id_byte("Dryness halflife: " + b);
                           } else if (var11.id_private("eyeBrightnessHalflife")) {
                              M = var11.id_int();
                              rrdJ.id_byte("Eye brightness halflife: " + M);
                           } else if (var11.id_private("centerDepthHalflife")) {
                              z = var11.id_int();
                              rrdJ.id_byte("Center depth halflife: " + z);
                           } else if (var11.id_private("sunPathRotation")) {
                              sw = var11.id_int();
                              rrdJ.id_byte("Sun path rotation: " + sw);
                           } else if (var11.id_private("ambientOcclusionLevel")) {
                              st = rrbb_3.id_class(var11.id_int(), 0.0F, 1.0F);
                              rrdJ.id_byte("AO Level: " + st);
                           } else if (var11.id_throws("superSamplingLevel")) {
                              int var21 = var11.id_package();
                              if (var21 > 1) {
                                 rrdJ.id_byte("Super sampling level: " + var21 + "x");
                                 N = var21;
                              } else {
                                 N = 1;
                              }
                           } else if (var11.id_throws("noiseTextureResolution")) {
                              Gk = var11.id_package();
                              Gd = true;
                              rrdJ.id_byte("Noise texture enabled");
                              rrdJ.id_byte("Noise texture resolution: " + Gk);
                           } else if (var11.id_case("Format")) {
                              String var22 = rrzX_2.id_throws(var11.id_break(), "Format");
                              String var33 = var11.id_byte();
                              int var14 = id_final(var33);
                              if (var14 != 0) {
                                 int var15 = id_implements(var22);
                                 if (var15 >= 0) {
                                    EY[var15] = var14;
                                    rrdJ.id_byte("%s format: %s", var22, var33);
                                 }

                                 int var16 = rrkG.id_byte(var22);
                                 if (var16 >= 0) {
                                    ED[var16] = var14;
                                    rrdJ.id_byte("%s format: %s", var22, var33);
                                 }
                              }
                           } else if (var11.id_class("Clear", false)) {
                              if (var0.id_case().id_break()) {
                                 String var23 = rrzX_2.id_throws(var11.id_break(), "Clear");
                                 int var34 = id_implements(var23);
                                 if (var34 >= 0) {
                                    Bn[var34] = false;
                                    rrdJ.id_byte("%s clear disabled", var23);
                                 }

                                 int var39 = rrkG.id_byte(var23);
                                 if (var39 >= 0) {
                                    Bl[var39] = false;
                                    rrdJ.id_byte("%s clear disabled", var23);
                                 }
                              }
                           } else if (var11.id_volatile("ClearColor")) {
                              if (var0.id_case().id_break()) {
                                 String var24 = rrzX_2.id_throws(var11.id_break(), "ClearColor");
                                 rji_3 var35 = var11.id_super();
                                 if (var35 != null) {
                                    int var40 = id_implements(var24);
                                    if (var40 >= 0) {
                                       BC[var40] = var35;
                                       rrdJ.id_byte(
                                          "%s clear color: %s %s %s %s", var24, var35.id_class(), var35.id_break(), var35.id_byte(), var35.id_protected()
                                       );
                                    }

                                    int var43 = rrkG.id_byte(var24);
                                    if (var43 >= 0) {
                                       BH[var43] = var35;
                                       rrdJ.id_byte(
                                          "%s clear color: %s %s %s %s", var24, var35.id_class(), var35.id_break(), var35.id_byte(), var35.id_protected()
                                       );
                                    }
                                 } else {
                                    rrdJ.id_break("Invalid color value: " + var11.id_byte());
                                 }
                              }
                           } else if (var11.id_class("GAUX4FORMAT", "RGBA32F")) {
                              EY[7] = 34836;
                              rrdJ.id_byte("gaux4 format : RGB32AF");
                           } else if (var11.id_class("GAUX4FORMAT", "RGB32F")) {
                              EY[7] = 34837;
                              rrdJ.id_byte("gaux4 format : RGB32F");
                           } else if (var11.id_class("GAUX4FORMAT", "RGB16")) {
                              EY[7] = 32852;
                              rrdJ.id_byte("gaux4 format : RGB16");
                           } else if (var11.id_class("MipmapEnabled", true)) {
                              if (var0.id_case().id_break()) {
                                 String var25 = rrzX_2.id_throws(var11.id_break(), "MipmapEnabled");
                                 int var36 = id_implements(var25);
                                 if (var36 >= 0) {
                                    int var41 = var0.id_volatile();
                                    var41 |= 1 << var36;
                                    var0.id_byte(var41);
                                    rrdJ.id_byte("%s mipmap enabled", var25);
                                 }
                              }
                           } else if (var11.id_protected("DRAWBUFFERS")) {
                              String var26 = var11.id_byte();
                              String[] var37 = rrkG.id_private(var26);
                              if (var37 != null) {
                                 var0.id_class(var37);
                              } else {
                                 rrdJ.id_break("Invalid draw buffers: " + var26);
                              }
                           } else if (var11.id_protected("RENDERTARGETS")) {
                              String var27 = var11.id_byte();
                              String[] var38 = rrkG.id_implements(var27);
                              if (var38 != null) {
                                 var0.id_class(var38);
                              } else {
                                 rrdJ.id_break("Invalid render targets: " + var27);
                              }
                           }
                        }
                     }
                  }
               } catch (Exception var17) {
                  rrdJ.id_class("Couldn't read " + var1 + "!");
                  var17.printStackTrace();
                  ARBShaderObjects.glDeleteObjectARB(var3);
                  return 0;
               }
            }

            String var19 = var6.toString();
            if (sy) {
               id_class(var1, var19);
            }

            ARBShaderObjects.glShaderSourceARB(var3, var19);
            ARBShaderObjects.glCompileShaderARB(var3);
            if (GL43.glGetShaderi(var3, 35713) != 1) {
               rrdJ.id_class("Error compiling fragment shader: " + var1);
            }

            id_class(var3, var1, var5);
            return var3;
         }
      }
   }

   public static rrxi_3 id_protected() {
      return Ei;
   }

   public static void id_private() {
      if (id_extends()) {
         sp = 0.5F;
         sq = 0.6F;
         sT = 0.8F;
      } else {
         sp = 1.0F;
         sq = 1.0F;
         sT = 1.0F;
      }
   }

   public static void id_private(int var0) {
      GL43.glDisable(var0);
      c();
   }

   public static void id_private(String var0) {
      rrdJ.id_class(var0);
      ((cq_3)id_class.id_class[19]).id_throws().id_class(new rgN_2(var0));
   }

   public static void id_abstract() {
      GL43.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      rW();
      int var0 = Sz.id_final();
      if (var0 > 1) {
         for (int var1 = 1; var1 < var0; var1++) {
            PR.id_break(var1);
            rW();
         }

         PR.id_break(0);
      }
   }

   private static ByteBuffer id_final(int var0) {
      ByteBuffer var1 = Gz;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0);
      return var1.slice();
   }

   private static int id_final(String var0) {
      var0 = var0.trim();

      for (int var1 = 0; var1 < GQ.length; var1++) {
         String var2 = GQ[var1];
         if (var0.equals(var2)) {
            return GN[var1];
         }
      }

      return 0;
   }

   public static boolean id_final() {
      return !sQ.id_implements();
   }

   public static void id_transient() {
      L();
      H();
      id_class(m ? Bj : Bf);
      id_class(rrdX.NONE);
   }

   public static boolean id_volatile() {
      return !sz.id_implements();
   }

   private static void id_volatile(String var0) {
      ((cq_3)id_class.id_class[19]).id_throws().id_class(new rgN_2(var0));
   }

   public static void id_volatile(int var0) {
      EC++;
      En[EC * 2] = var0 & 65535;
      En[EC * 2 + 1] = 0;
   }

   public static boolean id_synchronized() {
      return sl.id_private();
   }

   public static int id_native(int var0) {
      En[EC * 2 + 1] = En[EC * 2 + 1] & -65536 | var0 & 65535;
      return var0;
   }

   public static boolean id_native() {
      return !sW.id_implements();
   }

   public static rrdG id_native(String var0) {
      return EU.id_protected(var0);
   }

   public static void id_strictfp() {
      id_catch("endUpdateChunks1");
      id_case("endUpdateChunks1");
      if (!id_new) {
         id_class(BY);
      }

      id_catch("endUpdateChunks2");
      id_case("endUpdateChunks2");
   }

   public static void E() {
      if (id_volatile) {
         id_catch("beginBlockEntities");
         id_class(Be);
         id_class(rrdX.BLOCK_ENTITIES);
      }
   }

   public static void A() {
      m = true;
      if (Sz == Bf) {
         id_class(Bj);
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
         id_class(SE);
         id_class(rrdX.RAIN_SNOW);
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
         var0.add(var1 + id_package(var2) + var3);
         if (!rrbb_3.rE().rG.equals(var2)) {
            String var4 = rrbb_3.rE().rG;
            var0.add(var1 + var4 + var3);
            var0.add(var1 + id_package(var4) + var3);
         }

         try {
            for (String var5 : var0) {
               InputStream var6 = Ei.id_class(var5);
               if (var6 != null) {
                  rrzE_2 var7 = new rrzE_2();
                  rrba_3.id_class(var6, var7);
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
         for (rqO_2 var1 : rVL.id_strictfp.id_protected()) {
            xd_3 var2 = rVL.id_strictfp.id_class(var1);
            int var3 = rVL.id_strictfp.id_class(var2);
            EA.put(var2, var3);
         }
      }

      BufferedReader var11 = null;

      try {
         var11 = new BufferedReader(new InputStreamReader(Ei.id_class("/mc_Entity_x.txt")));
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
                  if (rVL.id_strictfp.id_byte(var6)) {
                     xd_3 var7 = rVL.id_strictfp.id_class(var6);
                     EA.put(var7, var5);
                  } else {
                     rrdJ.id_break("Unknown block name %s", var14);
                  }
               } else {
                  rrdJ.id_break("unmatched %s\n", var12);
               }
            }
         } catch (Exception var10) {
            rrdJ.id_break("Error parsing mc_Entity_x.txt");
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
      if (!id_new) {
         id_class(Sb, false, Gb);
      }
   }

   private static void rJ() {
      if (BL != null) {
         BL.id_break();
      }

      boolean[] var0 = rrki_1.id_class(Bc, true);
      boolean[] var1 = new boolean[Bc];
      boolean[] var2 = new boolean[BN];
      int[] var3 = BF ? si : null;
      BL = new rrdF("dfb", id_extends, id_native, BN, Bc, 8, var0, var1, var2, GX, EY, sD, sU, var3, Eu);
      BL.id_class();
   }

   private static void rM() {
      if (Gx == null && Gh != null) {
         Gx = id_class(15, Gh);
      }

      if (Gx == null) {
         Gx = new rrxe_3(Gk, Gk);
      }
   }

   private static void rB() {
      Gs.clear();

      for (int var0 = -128; var0 <= 128; var0++) {
         String var1 = "/shaders/world" + var0;
         if (Ei.id_break(var1)) {
            Gs.add(var0);
         }
      }

      if (Gs.size() > 0) {
         Integer[] var2 = Gs.toArray(new Integer[Gs.size()]);
         rrbb_3.id_byte("[Shaders] Worlds: " + rrbb_3.id_class(var2));
      }
   }

   private static rrdD[] rG() {
      try {
         String[] var0 = EU.id_byte();
         Properties var1 = id_class(Ei);
         rrdD[] var2 = rrks_1.id_class(Ei, var0, Gs);

         for (int var3 = 0; var3 < var2.length; var3++) {
            rrdD var4 = var2[var3];
            String var5 = var1.getProperty(var4.id_class());
            if (var5 != null) {
               var4.id_case();
               if (!var4.id_break(var5)) {
                  rrbb_3.id_protected("[Shaders] Invalid value, option: " + var4.id_class() + ", value: " + var5);
               }
            }
         }

         return var2;
      } catch (IOException var6) {
         rrbb_3.id_protected("[Shaders] Error reading configuration for " + Ei.id_class());
         var6.printStackTrace();
         return null;
      }
   }

   private static void rk() {
      GL43.glGetFloatv(2983, (FloatBuffer)((Buffer)Ex).position(0));
      rrdx_1.id_class((FloatBuffer)((Buffer)Ed).position(0), (FloatBuffer)((Buffer)Ex).position(0), EG, EE);
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
      id_byte(GE);
      id_byte(GG);
      id_byte(Gb);
      id_byte(GM);
      id_byte(GO);
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
         id_class(SJ, true, GG);
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
      id_class(BL, Sd.id_goto());
      id_int = false;
      id_class.B().id_class(true);
      MT.id_class(Vl_1.id_class, Vl_1.id_byte, 3553, id_class.B().id_case(), 0);
      GL43.glViewport(0, 0, id_class.id_else().id_extends(), id_class.id_else().id_native());
      MT.id_class(true);
      GL43.glClearColor(id_char.id_class(), id_char.id_break(), id_char.id_byte(), 1.0F);
      GL43.glClear(16640);
      GL43.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      MT.id_import();
      MT.id_protected();
      MT.id_final();
      MT.id_volatile();
      MT.id_break(519);
      MT.id_class(false);
      id_catch("pre-final");
      id_class(Sd);
      id_catch("id_final");
      if (Sd.id_return()) {
         BL.id_throws(Sd.id_volatile());
      }

      id_abstract();
      id_catch("renderCompositeFinal");
   }

   private static void rx() {
      if (BB) {
         id_new = true;
         if (BA != null) {
            BA.id_break();
         }

         rrWz_1[] var0 = new rrWz_1[2];
         int[] var1 = BF ? Er : null;
         BA = new rrdF("sfb", Bs, BE, Bu, Bm, 8, SL, Sv, Sn, var0, ED, se, sa, var1, Em);
         BA.id_class();
         id_new = false;
      }
   }

   private static void rS() {
      sx.id_case();
      sl.id_case();
      if (Ei != null) {
         String var0 = "/shaders/shaders.properties";

         try {
            InputStream var1 = Ei.id_class(var0);
            if (var1 == null) {
               return;
            }

            var1 = rrdT.id_class(var1, var0, false);
            rrzE_2 var2 = new rrzE_2();
            var2.load(var1);
            var1.close();
            sx.id_class(var2);
            sl.id_class(var2);
            GP = rrks_1.id_byte(var2, Gr);
            sM = rrks_1.id_class(var2, Gr);
            sO = rrks_1.id_class(var2, sM, Gr);
         } catch (IOException var3) {
            rrbb_3.id_protected("[Shaders] Error reading: " + var0);
         }
      }
   }

   public static void Y() {
      if (id_volatile) {
         id_class(Ba);
      }
   }
}
