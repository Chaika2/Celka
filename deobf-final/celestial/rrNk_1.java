package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNk_1 {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[29];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
         var1[21] = false;
         var1[24] = false;
         var1[25] = false;
         var1[26] = false;
      }
   }

   public rrNk_1 byte_(String var1) {
      this.class_[20] = var1;
      return this;
   }

   public rrNk_1 byte_(boolean var1) {
      Boolean var6 = var1;
      this.class_[21] = var6;
      return this;
   }

   public rrNk_1 byte_(List<String> var1) {
      ((List)this.class_[18]).addAll(var1);
      return this;
   }

   public rrNk_1 byte_(FuntimeEnchantment var1) {
      ((List)this.class_[10]).add(var1);
      return this;
   }

   public rrNk_1 byte_(rrfA_2 var1) {
      ((List)this.class_[6]).add(var1);
      return this;
   }

   public rrNk_1 byte_(int var1) {
      Integer var6 = var1;
      this.class_[4] = var6;
      return this;
   }

   public rrNk_1() {
      this.byte_();
      Integer var5 = 1;
      this.class_[3] = var5;
      Integer var6 = 50;
      this.class_[4] = var6;
      ArrayList var7 = new ArrayList();
      this.class_[5] = var7;
      ArrayList var8 = new ArrayList();
      this.class_[6] = var8;
      ArrayList var9 = new ArrayList();
      this.class_[7] = var9;
      ArrayList var10 = new ArrayList();
      this.class_[8] = var10;
      ArrayList var11 = new ArrayList();
      this.class_[9] = var11;
      ArrayList var12 = new ArrayList();
      this.class_[10] = var12;
      ArrayList var13 = new ArrayList();
      this.class_[11] = var13;
      ArrayList var14 = new ArrayList();
      this.class_[12] = var14;
      ArrayList var15 = new ArrayList();
      this.class_[13] = var15;
      ArrayList var16 = new ArrayList();
      this.class_[14] = var16;
      ArrayList var17 = new ArrayList();
      this.class_[15] = var17;
      ArrayList var18 = new ArrayList();
      this.class_[16] = var18;
      ArrayList var19 = new ArrayList();
      this.class_[18] = var19;
      Boolean var20 = true;
      this.class_[25] = var20;
   }

   static {
      ntfClinit();
   }

   public rrNk_1 class_(rrIk_1 var1) {
      this.class_[28] = var1;
      return this;
   }

   public rrNk_1 class_(rrcT_2<?> var1) {
      ((List)this.class_[16]).add(var1);
      return this;
   }

   public rrNk_1 class_() {
      Boolean var5 = true;
      this.class_[24] = var5;
      return this;
   }

   public rrNk_1 class_(rrNw_1 var1) {
      this.class_[22] = var1;
      return this;
   }

   public rrNk_1 class_(rdn_3 var1) {
      this.class_[17] = var1;
      return this;
   }

   public rrNk_1 class_(rrNX var1) {
      this.class_[23] = var1;
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3831626523193395833L;
   }

   public rrNk_1 class_(rrfA_2 var1) {
      ((List)this.class_[5]).add(var1);
      return this;
   }

   public rrNk_1 class_(List<String> var1) {
      ((List)this.class_[14]).addAll(var1);
      return this;
   }

   public rrNk_1 class_(rdb_3 var1) {
      this.class_[0] = var1;
      return this;
   }

   public rrNk_1 class_(int var1) {
      Integer var6 = var1;
      this.class_[1] = var6;
      return this;
   }

   public rrNk_1 class_(String var1) {
      ((List)this.class_[14]).add(var1);
      return this;
   }

   public rrNk_1 class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[27] = var6;
      return this;
   }

   public rrNk_1 class_(FuntimeEnchantment var1) {
      ((List)this.class_[8]).add(var1);
      return this;
   }

   public rrNk_1 break_(boolean var1) {
      Boolean var6 = var1;
      this.class_[24] = var6;
      return this;
   }

   public rrNk_1 break_(String var1) {
      this.class_[19] = var1;
      return this;
   }

   public rrNk_1 break_(int var1) {
      Integer var6 = var1;
      this.class_[3] = var6;
      return this;
   }

   public rrNk_1 break_(List<FuntimeEnchantment> var1) {
      ((List)this.class_[9]).addAll(var1);
      return this;
   }

   public rrNd_1 break_() {
      return new rrNd_1(this);
   }

   public rrNk_1 break_(FuntimeEnchantment var1) {
      ((List)this.class_[9]).add(var1);
      return this;
   }

   public rrNk_1 break_(rrfA_2 var1) {
      ((List)this.class_[7]).add(var1);
      return this;
   }

   public rrNk_1 throws_(List<rrfA_2> var1) {
      ((List)this.class_[6]).addAll(var1);
      return this;
   }

   private static int throws_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 344906625;
   }

   private static void throws_() {
      byte_ = new short[]{
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

   public rrNk_1 throws_(boolean var1) {
      Boolean var6 = var1;
      this.class_[26] = var6;
      return this;
   }

   public rrNk_1 throws_(String var1) {
      ((List)this.class_[12]).add(var1);
      return this;
   }

   public rrNk_1 finally_(List<FuntimeEnchantment> var1) {
      ((List)this.class_[10]).addAll(var1);
      return this;
   }

   public rrNk_1 catch_(List<rrcT_2<?>> var1) {
      ((List)this.class_[16]).addAll(var1);
      return this;
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -33, 0, 106, -5, 9, 108, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrNk_1 extends_(List<String> var1) {
      ((List)this.class_[13]).addAll(var1);
      return this;
   }

   private static void case_() {
      break_ = new byte[]{50, 29, 2, 3, 4, 21, 24, 25, 26};
   }

   public rrNk_1 case_(List<String> var1) {
      ((List)this.class_[12]).addAll(var1);
      return this;
   }

   public rrNk_1 case_(String var1) {
      ((List)this.class_[15]).add(var1);
      return this;
   }

   public rrNk_1 implements_(String var1) {
      ((List)this.class_[18]).add(var1);
      return this;
   }

   public rrNk_1 implements_(List<FuntimeEnchantment> var1) {
      ((List)this.class_[8]).addAll(var1);
      return this;
   }

   public rrNk_1 protected_(String var1) {
      ((List)this.class_[11]).add(var1);
      return this;
   }

   public rrNk_1 protected_(int var1) {
      Integer var6 = var1;
      this.class_[2] = var6;
      return this;
   }

   public rrNk_1 protected_(List<rrfA_2> var1) {
      ((List)this.class_[7]).addAll(var1);
      return this;
   }

   private static void protected_() {
      protected_ = new boolean[]{true, true, true, true, false, false, false, false, false, false, false, false};
   }

   public rrNk_1 protected_(boolean var1) {
      Boolean var6 = var1;
      this.class_[25] = var6;
      return this;
   }

   public rrNk_1 private_(String var1) {
      ((List)this.class_[13]).add(var1);
      return this;
   }

   public rrNk_1 private_(List<String> var1) {
      ((List)this.class_[11]).addAll(var1);
      return this;
   }

   public rrNk_1 volatile_(List<String> var1) {
      ((List)this.class_[15]).addAll(var1);
      return this;
   }

   public rrNk_1 native_(List<rrfA_2> var1) {
      ((List)this.class_[5]).addAll(var1);
      return this;
   }
}
