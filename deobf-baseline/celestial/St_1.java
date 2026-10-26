package celestial;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class St_1 {
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_class;
   private static long[] id_case;
   public Object[] id_break;
   private static String[] id_catch;
   private static int[] id_private;

   public byte[] id_byte() {
      return ((BitSet)this.id_break[id_byte[31]]).toByteArray();
   }

   public St_1(int var1, int var2, BitSet var3, xc_3[] var4, Map<String, List<rfH_2>> var5, long var6) {
      this.id_private();
      id_class(var3);
      Integer var12 = var1;
      this.id_break[id_byte[0]] = var12;
      Integer var13 = var2;
      this.id_break[id_byte[1]] = var13;
      this.id_break[id_byte[2]] = var3;
      this.id_break[id_byte[3]] = var4;
      int[] var16 = new int[id_byte[4]];
      this.id_break[id_byte[5]] = var16;
      this.id_break[id_byte[6]] = var5;
      Long var18 = var6;
      this.id_break[id_byte[7]] = var18;
      if (var5.isEmpty()) {
         Object var19 = null;
         this.id_break[id_byte[8]] = var19;
      } else {
         Int2ObjectOpenHashMap var20 = new Int2ObjectOpenHashMap();
         this.id_break[id_byte[9]] = var20;
         this.id_protected();
      }

      this.id_extends();
   }

   static {
      ntfClinit();
   }

   public xc_3 id_class(int var1, int var2, int var3, rqM_2<rYB> var4) {
      int var5 = id_class(var1, var2, var3);
      MB var6 = this.id_break(var5);
      int var7 = var3 << id_protected[0] | var1;
      if (((int[])this.id_break[id_byte[12]])[var7] == var2 && var6 != (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_byte[13]]) {
         return ((xc_3[])this.id_break[id_byte[14]])[var7];
      } else {
         if ((Int2ObjectOpenHashMap)this.id_break[id_byte[15]] != null) {
            String var8 = (String)((Int2ObjectOpenHashMap)this.id_break[id_byte[16]]).get(var5);
            if (var8 != null) {
               return ri_3.id_break(var8).id_continue();
            }
         }

         if (var6 == (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[id_byte[17]]) {
            if (var2 == id_protected[1] && var4 == rYB.id_protected) {
               return xu_3.id_while.id_continue();
            }

            if (var2 < id_protected[2] && var4 == rYB.id_byte) {
               return xu_3.rg.id_continue();
            }
         }

         return Sj_1.id_class(var6, var4);
      }
   }

   public static int id_class(int var0, int var1, int var2) {
      return var0 << id_throws[5] | var2 << id_protected[8] | var1 << id_protected[9];
   }

   public xc_3[] id_class() {
      return (xc_3[])this.id_break[id_byte[25]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 763020760;
   }

   private static void id_class(BitSet var0) {
      if (var0.size() > id_private[0]) {
         throw new IllegalArgumentException(id_catch[0]);
      }
   }

   public ArrayList<rfH_2> id_class(String var1) {
      if (((Map)this.id_break[id_byte[27]]).get(var1) == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (rfH_2 var4 : (List)((Map)this.id_break[id_byte[28]]).get(var1)) {
            var2.add(
               new rfH_2(
                  var4.b_() + (Integer)this.id_break[id_byte[29]] * id_protected[6],
                  var4.c_(),
                  var4.d_() + (Integer)this.id_break[id_byte[30]] * id_protected[7]
               )
            );
         }

         return var2;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5242089003152230639L;
   }

   public Map<String, List<rfH_2>> id_break() {
      return (Map<String, List<rfH_2>>)this.id_break[id_byte[26]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 15, 64, -36, 121, -45, 79, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private MB id_break(int var1) {
      return MB.id_class(((BitSet)this.id_break[id_byte[18]]).get(var1), ((BitSet)this.id_break[id_byte[19]]).get(var1 + id_throws[0]));
   }

   private static void id_throws() {
      id_throws = new boolean[]{true, false, false, false, true, true, false, true, false, false, false, true, false, true};
   }

   private static void id_finally() {
      id_byte = new short[]{0, 1, 2, 4, 256, 5, 6, 7, 3, 3, 6, 3, 5, 2, 4, 3, 3, 3, 2, 2, 5, 256, 2, 2, 5, 4, 6, 6, 6, 0, 1, 2, 16384};
   }

   private static void id_catch() {
      id_private = new int[]{131072, 131072};
   }

   private void id_extends() {
      for (int var1 = id_throws[1]; var1 < id_protected[3]; var1++) {
         for (int var2 = id_throws[2]; var2 < id_protected[4]; var2++) {
            int var3 = var1 << id_protected[5] | var2;
            ((int[])this.id_break[id_byte[20]])[var3] = id_throws[3];

            for (int var4 = id_byte[21]; var4 >= 0; var4--) {
               int var5 = id_class(var2, var4, var1);
               if (((BitSet)this.id_break[id_byte[22]]).get(var5) || ((BitSet)this.id_break[id_byte[23]]).get(var5 + id_throws[4])) {
                  ((int[])this.id_break[id_byte[24]])[var3] = var4;
                  break;
               }
            }
         }
      }
   }

   private static void id_case() {
      id_case = new long[1];
   }

   private static void id_implements() {
      Object[] var0 = new Object[3];
      Object[] var2 = new Object[]{
         xu_3.SW,
         xu_3.Ps,
         xu_3.re,
         xu_3.sZ,
         xu_3.SM,
         xu_3.SO,
         xu_3.rD,
         xu_3.Ec,
         xu_3.bK,
         xu_3.bU,
         xu_3.be,
         xu_3.ba,
         xu_3.bi,
         xu_3.Mr,
         xu_3.MP,
         xu_3.MB,
         xu_3.MS,
         xu_3.Ms,
         xu_3.ME,
         xu_3.MG,
         xu_3.Mb,
         xu_3.MM,
         xu_3.MO,
         xu_3.Mh,
         xu_3.MX,
         xu_3.Pi,
         xu_3.sl,
         xu_3.Sv,
         xu_3.SG,
         xu_3.sW,
         xu_3.sz,
         xu_3.sQ,
         xu_3.sN,
         xu_3.sd,
         xu_3.sk,
         xu_3.sJ,
         xu_3.sx,
         xu_3.sM,
         xu_3.sO,
         xu_3.sh,
         xu_3.sX,
         xu_3.SE,
         xu_3.sc,
         xu_3.C,
         xu_3.l,
         xu_3.H,
         xu_3.y,
         xu_3.p,
         xu_3.q,
         xu_3.T,
         xu_3.t,
         xu_3.w,
         xu_3.I,
         xu_3.f,
         xu_3.j,
         xu_3.V,
         xu_3.g,
         xu_3.R,
         xu_3.Y,
         xu_3.SX,
         xu_3.Pj,
         xu_3.bw,
         xu_3.U,
         xu_3.Ss,
         xu_3.PJ,
         xu_3.BD
      };
      var0[0] = ImmutableSet.copyOf(var2);
      var0[1] = 131072;
      var0[2] = 16384;
      id_class = var0;
   }

   private final void id_protected() {
      for (Entry var2 : ((Map)this.id_break[id_byte[10]]).entrySet()) {
         for (rfH_2 var4 : (List)var2.getValue()) {
            ((Int2ObjectOpenHashMap)this.id_break[id_byte[11]]).put(id_class(var4.b_(), var4.c_(), var4.d_()), (String)var2.getKey());
         }
      }
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[69]];
         Object[] var1 = this.id_break;
         var1[id_throws[9]] = Integer.valueOf(id_throws[10]);
         var1[id_throws[11]] = Integer.valueOf(id_throws[12]);
         var1[id_protected[70]] = id_case[0];
      }
   }

   private static void id_volatile() {
      id_catch = new String[]{new String("BitSet of invalid length provided")};
   }

   private static void id_native() {
      id_protected = new byte[]{
         4,
         127,
         5,
         16,
         16,
         4,
         16,
         16,
         5,
         9,
         60,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         52,
         53,
         54,
         55,
         56,
         57,
         58,
         59,
         8,
         7,
         3,
         2
      };
   }
}
