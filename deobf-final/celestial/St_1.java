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
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public static Object[] class_;
   private static long[] case_;
   public Object[] break_;
   private static String[] catch_;
   private static int[] private_;

   public byte[] byte_() {
      return ((BitSet)this.break_[2]).toByteArray();
   }

   public St_1(int var1, int var2, BitSet var3, xc_3[] var4, Map<String, List<rfH_2>> var5, long var6) {
      this.private_();
      class_(var3);
      Integer var12 = var1;
      this.break_[0] = var12;
      Integer var13 = var2;
      this.break_[1] = var13;
      this.break_[2] = var3;
      this.break_[4] = var4;
      int[] var16 = new int[256];
      this.break_[5] = var16;
      this.break_[6] = var5;
      Long var18 = var6;
      this.break_[7] = var18;
      if (var5.isEmpty()) {
         Object var19 = null;
         this.break_[3] = var19;
      } else {
         Int2ObjectOpenHashMap var20 = new Int2ObjectOpenHashMap();
         this.break_[3] = var20;
         this.protected_();
      }

      this.extends_();
   }

   static {
      ntfClinit();
   }

   public xc_3 class_(int var1, int var2, int var3, rqM_2<rYB> var4) {
      int var5 = class_(var1, var2, var3);
      MB var6 = this.break_(var5);
      int var7 = var3 << 4 | var1;
      if (((int[])this.break_[5])[var7] == var2 && var6 != (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[2]) {
         return ((xc_3[])this.break_[4])[var7];
      } else {
         if ((Int2ObjectOpenHashMap)this.break_[3] != null) {
            String var8 = (String)((Int2ObjectOpenHashMap)this.break_[3]).get(var5);
            if (var8 != null) {
               return ri_3.break_(var8).continue_();
            }
         }

         if (var6 == (MB)MB.staticFields66e4c6f8de393faf832676ed33680249[3]) {
            if (var2 == 127 && var4 == rYB.protected_) {
               return xu_3.while_.continue_();
            }

            if (var2 < 5 && var4 == rYB.byte_) {
               return xu_3.rg.continue_();
            }
         }

         return Sj_1.class_(var6, var4);
      }
   }

   public static int class_(int var0, int var1, int var2) {
      return var0 << 1 | var2 << 5 | var1 << 9;
   }

   public xc_3[] class_() {
      return (xc_3[])this.break_[4];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 763020760;
   }

   private static void class_(BitSet var0) {
      if (var0.size() > 131072) {
         throw new IllegalArgumentException("BitSet of invalid length provided");
      }
   }

   public ArrayList<rfH_2> class_(String var1) {
      if (((Map)this.break_[6]).get(var1) == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (rfH_2 var4 : (List)((Map)this.break_[6]).get(var1)) {
            var2.add(new rfH_2(var4.b_() + (Integer)this.break_[0] * 16, var4.c_(), var4.d_() + (Integer)this.break_[1] * 16));
         }

         return var2;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5242089003152230639L;
   }

   public Map<String, List<rfH_2>> break_() {
      return (Map<String, List<rfH_2>>)this.break_[6];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 15, 64, -36, 121, -45, 79, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private MB break_(int var1) {
      return MB.class_(((BitSet)this.break_[2]).get(var1), ((BitSet)this.break_[2]).get(var1 + 1));
   }

   private static void throws_() {
      throws_ = new boolean[]{true, false, false, false, true, true, false, true, false, false, false, true, false, true};
   }

   private static void finally_() {
      byte_ = new short[]{0, 1, 2, 4, 256, 5, 6, 7, 3, 3, 6, 3, 5, 2, 4, 3, 3, 3, 2, 2, 5, 256, 2, 2, 5, 4, 6, 6, 6, 0, 1, 2, 16384};
   }

   private static void catch_() {
      private_ = new int[]{131072, 131072};
   }

   private void extends_() {
      for (int var1 = 0; var1 < 16; var1++) {
         for (int var2 = 0; var2 < 16; var2++) {
            int var3 = var1 << 4 | var2;
            ((int[])this.break_[5])[var3] = 0;

            for (int var4 = 256; var4 >= 0; var4--) {
               int var5 = class_(var2, var4, var1);
               if (((BitSet)this.break_[2]).get(var5) || ((BitSet)this.break_[2]).get(var5 + 1)) {
                  ((int[])this.break_[5])[var3] = var4;
                  break;
               }
            }
         }
      }
   }

   private static void case_() {
      case_ = new long[1];
   }

   private static void implements_() {
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
      class_ = var0;
   }

   private final void protected_() {
      for (Entry var2 : ((Map)this.break_[6]).entrySet()) {
         for (rfH_2 var4 : (List)var2.getValue()) {
            ((Int2ObjectOpenHashMap)this.break_[3]).put(class_(var4.b_(), var4.c_(), var4.d_()), (String)var2.getKey());
         }
      }
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         Object[] var1 = this.break_;
         var1[0] = 0;
         var1[1] = 0;
         var1[7] = 0L;
      }
   }

   private static void volatile_() {
      catch_ = new String[]{new String("BitSet of invalid length provided")};
   }

   private static void native_() {
      protected_ = new byte[]{
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
