package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNk_1 {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[29];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_protected[4]);
         var1[2] = Integer.valueOf(id_protected[5]);
         var1[3] = Integer.valueOf(id_protected[6]);
         var1[4] = Integer.valueOf(id_protected[7]);
         var1[21] = id_protected[8];
         var1[24] = id_protected[9];
         var1[25] = id_protected[10];
         var1[26] = id_protected[11];
      }
   }

   public rrNk_1 id_byte(String var1) {
      this.id_class[20] = var1;
      return this;
   }

   public rrNk_1 id_byte(boolean var1) {
      Boolean var6 = var1;
      this.id_class[21] = var6;
      return this;
   }

   public rrNk_1 id_byte(List<String> var1) {
      ((List)this.id_class[18]).addAll(var1);
      return this;
   }

   public rrNk_1 id_byte(FuntimeEnchantment var1) {
      ((List)this.id_class[10]).add(var1);
      return this;
   }

   public rrNk_1 id_byte(rrfA_2 var1) {
      ((List)this.id_class[6]).add(var1);
      return this;
   }

   public rrNk_1 id_byte(int var1) {
      Integer var6 = var1;
      this.id_class[4] = var6;
      return this;
   }

   public rrNk_1() {
      this.id_byte();
      Integer var5 = 1;
      this.id_class[3] = var5;
      Integer var6 = 50;
      this.id_class[4] = var6;
      ArrayList var7 = new ArrayList();
      this.id_class[5] = var7;
      ArrayList var8 = new ArrayList();
      this.id_class[6] = var8;
      ArrayList var9 = new ArrayList();
      this.id_class[7] = var9;
      ArrayList var10 = new ArrayList();
      this.id_class[8] = var10;
      ArrayList var11 = new ArrayList();
      this.id_class[9] = var11;
      ArrayList var12 = new ArrayList();
      this.id_class[10] = var12;
      ArrayList var13 = new ArrayList();
      this.id_class[11] = var13;
      ArrayList var14 = new ArrayList();
      this.id_class[12] = var14;
      ArrayList var15 = new ArrayList();
      this.id_class[13] = var15;
      ArrayList var16 = new ArrayList();
      this.id_class[14] = var16;
      ArrayList var17 = new ArrayList();
      this.id_class[15] = var17;
      ArrayList var18 = new ArrayList();
      this.id_class[16] = var18;
      ArrayList var19 = new ArrayList();
      this.id_class[18] = var19;
      Boolean var20 = true;
      this.id_class[25] = var20;
   }

   static {
      ntfClinit();
   }

   public rrNk_1 id_class(rrIk_1 var1) {
      this.id_class[28] = var1;
      return this;
   }

   public rrNk_1 id_class(rrcT_2<?> var1) {
      ((List)this.id_class[16]).add(var1);
      return this;
   }

   public rrNk_1 id_class() {
      Boolean var5 = true;
      this.id_class[24] = var5;
      return this;
   }

   public rrNk_1 id_class(rrNw_1 var1) {
      this.id_class[22] = var1;
      return this;
   }

   public rrNk_1 id_class(rdn_3 var1) {
      this.id_class[17] = var1;
      return this;
   }

   public rrNk_1 id_class(rrNX var1) {
      this.id_class[23] = var1;
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3831626523193395833L;
   }

   public rrNk_1 id_class(rrfA_2 var1) {
      ((List)this.id_class[5]).add(var1);
      return this;
   }

   public rrNk_1 id_class(List<String> var1) {
      ((List)this.id_class[14]).addAll(var1);
      return this;
   }

   public rrNk_1 id_class(rdb_3 var1) {
      this.id_class[id_byte[16]] = var1;
      return this;
   }

   public rrNk_1 id_class(int var1) {
      Integer var6 = var1;
      this.id_class[1] = var6;
      return this;
   }

   public rrNk_1 id_class(String var1) {
      ((List)this.id_class[14]).add(var1);
      return this;
   }

   public rrNk_1 id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[27] = var6;
      return this;
   }

   public rrNk_1 id_class(FuntimeEnchantment var1) {
      ((List)this.id_class[8]).add(var1);
      return this;
   }

   public rrNk_1 id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_class[24] = var6;
      return this;
   }

   public rrNk_1 id_break(String var1) {
      this.id_class[19] = var1;
      return this;
   }

   public rrNk_1 id_break(int var1) {
      Integer var6 = var1;
      this.id_class[3] = var6;
      return this;
   }

   public rrNk_1 id_break(List<FuntimeEnchantment> var1) {
      ((List)this.id_class[9]).addAll(var1);
      return this;
   }

   public rrNd_1 id_break() {
      return new rrNd_1(this);
   }

   public rrNk_1 id_break(FuntimeEnchantment var1) {
      ((List)this.id_class[9]).add(var1);
      return this;
   }

   public rrNk_1 id_break(rrfA_2 var1) {
      ((List)this.id_class[7]).add(var1);
      return this;
   }

   public rrNk_1 id_throws(List<rrfA_2> var1) {
      ((List)this.id_class[6]).addAll(var1);
      return this;
   }

   private static int id_throws(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 344906625;
   }

   private static void id_throws() {
      id_byte = new short[]{
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
         18,
         25,
         0,
         1,
         2,
         3,
         5,
         6,
         7,
         5,
         8,
         8,
         9,
         9,
         10,
         10,
         6,
         7,
         11,
         11,
         12,
         12,
         13,
         13,
         14,
         14,
         15,
         15,
         16,
         16,
         17,
         18,
         18,
         19,
         20,
         21,
         22,
         23,
         25,
         26,
         28,
         4,
         27,
         24,
         24
      };
   }

   public rrNk_1 id_throws(boolean var1) {
      Boolean var6 = var1;
      this.id_class[26] = var6;
      return this;
   }

   public rrNk_1 id_throws(String var1) {
      ((List)this.id_class[12]).add(var1);
      return this;
   }

   public rrNk_1 id_finally(List<FuntimeEnchantment> var1) {
      ((List)this.id_class[10]).addAll(var1);
      return this;
   }

   public rrNk_1 id_catch(List<rrcT_2<?>> var1) {
      ((List)this.id_class[16]).addAll(var1);
      return this;
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -33, 0, 106, -5, 9, 108, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrNk_1 id_extends(List<String> var1) {
      ((List)this.id_class[13]).addAll(var1);
      return this;
   }

   private static void id_case() {
      id_break = new byte[]{50, 29, 2, 3, 4, 21, 24, 25, 26};
   }

   public rrNk_1 id_case(List<String> var1) {
      ((List)this.id_class[12]).addAll(var1);
      return this;
   }

   public rrNk_1 id_case(String var1) {
      ((List)this.id_class[15]).add(var1);
      return this;
   }

   public rrNk_1 id_implements(String var1) {
      ((List)this.id_class[18]).add(var1);
      return this;
   }

   public rrNk_1 id_implements(List<FuntimeEnchantment> var1) {
      ((List)this.id_class[8]).addAll(var1);
      return this;
   }

   public rrNk_1 id_protected(String var1) {
      ((List)this.id_class[11]).add(var1);
      return this;
   }

   public rrNk_1 id_protected(int var1) {
      Integer var6 = var1;
      this.id_class[2] = var6;
      return this;
   }

   public rrNk_1 id_protected(List<rrfA_2> var1) {
      ((List)this.id_class[7]).addAll(var1);
      return this;
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, true, true, true, false, false, false, false, false, false, false, false};
   }

   public rrNk_1 id_protected(boolean var1) {
      Boolean var6 = var1;
      this.id_class[25] = var6;
      return this;
   }

   public rrNk_1 id_private(String var1) {
      ((List)this.id_class[13]).add(var1);
      return this;
   }

   public rrNk_1 id_private(List<String> var1) {
      ((List)this.id_class[11]).addAll(var1);
      return this;
   }

   public rrNk_1 id_volatile(List<String> var1) {
      ((List)this.id_class[15]).addAll(var1);
      return this;
   }

   public rrNk_1 id_native(List<rrfA_2> var1) {
      ((List)this.id_class[5]).addAll(var1);
      return this;
   }
}
