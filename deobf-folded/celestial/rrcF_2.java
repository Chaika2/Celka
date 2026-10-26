package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcF_2 implements rrcT_2<Boolean> {
   public static Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static int[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_byte = new boolean[]{
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
         true
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public rrfI_2<Boolean> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcL_2(this, var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -169752657315738939L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, 34, -28, 123, 114, 41, -107, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      Object[] var0 = new Object[1];
      Object[] var2 = new Object[25];
      rdb_3 var10006 = rdy_3.JT;
      rrcn_3[] var3 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000)};
      var2[0] = new rrcA_2(var10006, var3);
      var10006 = rdy_3.hF;
      rrcn_3[] var4 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)
      };
      var2[1] = new rrcA_2(var10006, var4);
      var10006 = rdy_3.xe;
      rrcn_3[] var5 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(25000)};
      var2[2] = new rrcA_2(var10006, var5);
      var10006 = rdy_3.OY;
      rrcn_3[] var6 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)
      };
      var2[3] = new rrcA_2(var10006, var6);
      var10006 = rdy_3.OJ;
      rrcn_3[] var7 = new rrcn_3[]{
         new rrcn_3(10),
         new rrcn_3(100),
         new rrcn_3(1000),
         new rrcn_3(10000),
         new rrcn_3(100000),
         new rrcn_3(300000),
         new rrcn_3(400000),
         new rrcn_3(450000),
         new rrcn_3(500000)
      };
      var2[4] = new rrcA_2(var10006, var7);
      var10006 = rdy_3.Og;
      rrcn_3[] var8 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)
      };
      var2[5] = new rrcA_2(var10006, var8);
      var10006 = rdy_3.Pz;
      rrcn_3[] var9 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000)};
      var2[6] = new rrcA_2(var10006, var9);
      var10006 = rdy_3.hr;
      rrcn_3[] var10 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000)};
      var2[7] = new rrcA_2(var10006, var10);
      var10006 = rdy_3.Sv;
      rrcn_3[] var11 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(1000000), new rrcn_3(2500000)
      };
      var2[8] = new rrcA_2(var10006, var11);
      var10006 = rdy_3.Wl;
      rrcn_3[] var12 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000)};
      var2[9] = new rrcA_2(var10006, var12);
      var10006 = rdy_3.kc;
      rrcn_3[] var13 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000)
      };
      var2[10] = new rrcA_2(var10006, var13);
      var10006 = rdy_3.xI;
      rrcn_3[] var14 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000)};
      var2[11] = new rrcA_2(var10006, var14);
      var10006 = rdy_3.dk;
      rrcn_3[] var15 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000)};
      var2[12] = new rrcA_2(var10006, var15);
      var10006 = rdy_3.Ok;
      rrcn_3[] var16 = new rrcn_3[]{
         new rrcn_3(10),
         new rrcn_3(100),
         new rrcn_3(1000),
         new rrcn_3(10000),
         new rrcn_3(100000),
         new rrcn_3(250000),
         new rrcn_3(280000),
         new rrcn_3(300000),
         new rrcn_3(350000)
      };
      var2[13] = new rrcA_2(var10006, var16);
      var10006 = rdy_3.hv;
      rrcn_3[] var17 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)
      };
      var2[14] = new rrcA_2(var10006, var17);
      var10006 = rdy_3.hA;
      rrcn_3[] var18 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)
      };
      var2[15] = new rrcA_2(var10006, var18);
      var10006 = rdy_3.Pn;
      rrcn_3[] var19 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(1000000), new rrcn_3(5000000)};
      var2[16] = new rrcA_2(var10006, var19);
      var10006 = rdy_3.kn;
      rrcn_3[] var20 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000)};
      var2[17] = new rrcA_2(var10006, var20);
      var10006 = rdy_3.ko;
      rrcn_3[] var21 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000)};
      var2[18] = new rrcA_2(var10006, var21);
      var10006 = rdy_3.kk;
      rrcn_3[] var22 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(1000000)};
      var2[19] = new rrcA_2(var10006, var22);
      var10006 = rdy_3.hp;
      rrcn_3[] var23 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000)};
      var2[20] = new rrcA_2(var10006, var23);
      var10006 = rdy_3.hL;
      rrcn_3[] var24 = new rrcn_3[]{
         new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)
      };
      var2[21] = new rrcA_2(var10006, var24);
      var10006 = rdy_3.xD;
      rrcn_3[] var25 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000)};
      var2[22] = new rrcA_2(var10006, var25);
      var10006 = rdy_3.OW;
      rrcn_3[] var26 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000)};
      var2[23] = new rrcA_2(var10006, var26);
      var10006 = rdy_3.hy;
      rrcn_3[] var27 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000)};
      var2[24] = new rrcA_2(var10006, var27);
      var0[0] = Set.of(var2);
      id_class = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1663671424;
   }

   private static void id_break() {
      id_break = new byte[]{
         25,
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
         4,
         10,
         100,
         2,
         3,
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
         4,
         10,
         100,
         2,
         3,
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
         5,
         10,
         100,
         2,
         3,
         4,
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
         3,
         10,
         100,
         2,
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
         5
      };
   }

   private static void id_throws() {
      id_throws = new short[]{
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
         1000,
         1000,
         1000,
         1000,
         1000,
         10000,
         1000,
         10000,
         1000,
         10000
      };
   }

   private static void id_protected() {
      id_protected = new int[]{
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
         300000,
         400000,
         450000,
         500000,
         100000,
         100000,
         250000,
         1000000,
         2500000,
         100000,
         250000,
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
         1000000
      };
   }
}
