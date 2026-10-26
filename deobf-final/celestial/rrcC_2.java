package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcC_2 implements rrcT_2<Boolean> {
   private static int[] break_;
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public static Object[] class_;

   private static void byte_() {
      throws_ = new boolean[]{
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true
      };
   }

   static {
      ntfClinit();
   }

   public static String class_(List<rrNt_1> var0, rrNt_1 var1) {
      return null;
   }

   public static boolean class_(String var0, String var1) {
      int var2 = var0.length() / 2;
      String var3 = var0.substring(0, var2);
      String var4 = var0.substring(var2);
      return (var4 + var3).equals(var1);
   }

   @Override
   public rrfI_2<Boolean> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcl_3(this, var2, var1);
   }

   public static boolean class_(String var0) {
      int var1 = var0.length() / 2;
      String var2 = var0.substring(0, var1);
      String var3 = var0.substring(var1);
      return var3.equals(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2303274060452531L;
   }

   private static void class_() {
      Object[] var0 = new Object[1];
      Object[] var2 = new Object[26];
      rdb_3 var10006 = rdy_3.Wl;
      rrcy_3[] var3 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
      var2[0] = new rrcH_2(var10006, var3);
      var10006 = rdy_3.Sv;
      rrcy_3[] var4 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(1000000), new rrcy_3(2500000)
      };
      var2[1] = new rrcH_2(var10006, var4);
      var10006 = rdy_3.hr;
      rrcy_3[] var5 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000)};
      var2[2] = new rrcH_2(var10006, var5);
      var10006 = rdy_3.hv;
      rrcy_3[] var6 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)
      };
      var2[3] = new rrcH_2(var10006, var6);
      var10006 = rdy_3.xI;
      rrcy_3[] var7 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000)};
      var2[4] = new rrcH_2(var10006, var7);
      var10006 = rdy_3.dk;
      rrcy_3[] var8 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000)};
      var2[5] = new rrcH_2(var10006, var8);
      var10006 = rdy_3.xD;
      rrcy_3[] var9 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000)};
      var2[6] = new rrcH_2(var10006, var9);
      var10006 = rdy_3.hL;
      rrcy_3[] var10 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)
      };
      var2[7] = new rrcH_2(var10006, var10);
      var10006 = rdy_3.hA;
      rrcy_3[] var11 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)
      };
      var2[8] = new rrcH_2(var10006, var11);
      var10006 = rdy_3.OJ;
      rrcy_3[] var12 = new rrcy_3[]{
         new rrcy_3(10),
         new rrcy_3(100),
         new rrcy_3(1000),
         new rrcy_3(10000),
         new rrcy_3(100000),
         new rrcy_3(300000),
         new rrcy_3(400000),
         new rrcy_3(450000),
         new rrcy_3(500000)
      };
      var2[9] = new rrcH_2(var10006, var12);
      var10006 = rdy_3.JT;
      rrcy_3[] var13 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
      var2[10] = new rrcH_2(var10006, var13);
      var10006 = rdy_3.hp;
      rrcy_3[] var14 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
      var2[11] = new rrcH_2(var10006, var14);
      var10006 = rdy_3.kn;
      rrcy_3[] var15 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000)};
      var2[12] = new rrcH_2(var10006, var15);
      var10006 = rdy_3.Og;
      rrcy_3[] var16 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)
      };
      var2[13] = new rrcH_2(var10006, var16);
      var10006 = rdy_3.Pz;
      rrcy_3[] var17 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000)};
      var2[14] = new rrcH_2(var10006, var17);
      var10006 = rdy_3.OW;
      rrcy_3[] var18 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000)};
      var2[15] = new rrcH_2(var10006, var18);
      var10006 = rdy_3.hF;
      rrcy_3[] var19 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)
      };
      var2[16] = new rrcH_2(var10006, var19);
      var10006 = rdy_3.kc;
      rrcy_3[] var20 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000)
      };
      var2[17] = new rrcH_2(var10006, var20);
      var10006 = rdy_3.Sm;
      rrcy_3[] var21 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000)};
      var2[18] = new rrcH_2(var10006, var21);
      var10006 = rdy_3.hy;
      rrcy_3[] var22 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
      var2[19] = new rrcH_2(var10006, var22);
      var10006 = rdy_3.ko;
      rrcy_3[] var23 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000)};
      var2[20] = new rrcH_2(var10006, var23);
      var10006 = rdy_3.OY;
      rrcy_3[] var24 = new rrcy_3[]{
         new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)
      };
      var2[21] = new rrcH_2(var10006, var24);
      var10006 = rdy_3.Pn;
      rrcy_3[] var25 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(1000000), new rrcy_3(5000000)};
      var2[22] = new rrcH_2(var10006, var25);
      var10006 = rdy_3.Ok;
      rrcy_3[] var26 = new rrcy_3[]{
         new rrcy_3(10),
         new rrcy_3(100),
         new rrcy_3(1000),
         new rrcy_3(10000),
         new rrcy_3(100000),
         new rrcy_3(250000),
         new rrcy_3(280000),
         new rrcy_3(300000),
         new rrcy_3(350000)
      };
      var2[23] = new rrcH_2(var10006, var26);
      var10006 = rdy_3.xe;
      rrcy_3[] var27 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(25000), new rrcy_3(100000)};
      var2[24] = new rrcH_2(var10006, var27);
      var10006 = rdy_3.kk;
      rrcy_3[] var28 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(1000000)};
      var2[25] = new rrcH_2(var10006, var28);
      var0[0] = Set.of(var2);
      class_ = var0;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -496567707;
   }

   private static void break_() {
      byte_ = new short[]{
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         25000,
         1000,
         1000,
         1000,
         1000,
         10000,
         1000,
         1000,
         1000,
         1000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000
      };
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, -39, -90, 96, 79, 66, -32, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new int[]{
         100000,
         250000,
         500000,
         1000000,
         100000,
         250000,
         500000,
         1000000,
         100000,
         250000,
         500000,
         1000000,
         100000,
         250000,
         500000,
         1000000,
         100000,
         250000,
         500000,
         1000000,
         100000,
         250000,
         500000,
         1000000,
         100000,
         250000,
         280000,
         300000,
         350000,
         100000,
         100000,
         250000,
         100000,
         250000,
         500000,
         100000,
         100000,
         100000,
         300000,
         400000,
         450000,
         500000,
         100000,
         100000,
         100000,
         250000,
         1000000,
         2500000,
         100000,
         250000,
         100000,
         100000,
         1000000,
         5000000,
         100000,
         250000,
         500000,
         100000,
         250000,
         100000,
         100000,
         250000,
         100000,
         250000,
         100000,
         1000000,
         100000,
         250000
      };
   }

   private static void protected_() {
      protected_ = new byte[]{
         2,
         2,
         26,
         8,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         2,
         8,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         3,
         8,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         4,
         8,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         5,
         8,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         6,
         9,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         7,
         5,
         10,
         100,
         2,
         3,
         4,
         8,
         5,
         10,
         100,
         2,
         3,
         4,
         9,
         7,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         10,
         5,
         10,
         100,
         2,
         3,
         4,
         11,
         5,
         10,
         100,
         2,
         3,
         4,
         12,
         9,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         13,
         6,
         10,
         100,
         2,
         3,
         4,
         5,
         14,
         4,
         10,
         100,
         2,
         3,
         15,
         7,
         10,
         100,
         2,
         3,
         4,
         5,
         6,
         16,
         5,
         10,
         100,
         2,
         3,
         4,
         17,
         5,
         10,
         100,
         2,
         3,
         4,
         18,
         6,
         10,
         100,
         2,
         3,
         4,
         5,
         19,
         6,
         10,
         100,
         2,
         3,
         4,
         5,
         20,
         5,
         10,
         100,
         2,
         3,
         4,
         21,
         4,
         10,
         100,
         2,
         3,
         22,
         6,
         10,
         100,
         2,
         3,
         4,
         5,
         23,
         6,
         10,
         100,
         2,
         3,
         4,
         5,
         24,
         6,
         10,
         100,
         2,
         3,
         4,
         5,
         25,
         6,
         10,
         100,
         2,
         3,
         4,
         5
      };
   }
}
