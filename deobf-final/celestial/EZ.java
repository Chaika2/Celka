package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EZ {
   private static boolean[] byte_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] protected_;
   private static byte[] throws_;
   private static double[] case_;
   private static float[] catch_;

   public boolean byte_(int var1, int var2, int var3) {
      return false;
   }

   private static void byte_() {
      case_ = new double[]{9.09090909090909, 4.63284688441047, 1000000.0, 1000000.0, 1000000.0, 1000000.0, 1000000.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public EZ(C_case var1) {
      this(var1, false);
   }

   public EZ(C_case var1, boolean var2) {
      this.implements_();
      GJ var10 = new GJ();
      this.break_[29] = var10;
      Boolean var11 = var2;
      this.break_[0] = var11;
      this.break_[1] = var1;
      cb_3 var3 = var1.throw_().catch_();
      rYB var13 = var1.throw_().case_();
      this.break_[2] = var13;
      SR var14 = (SR)var1.implements_().class_();
      this.break_[3] = var14;
      bw_3 var15 = new bw_3((rYB)this.break_[2], (SR)this.break_[3], var2);
      this.break_[4] = var15;
      bU_2 var16 = new bU_2(var3);
      this.break_[5] = var16;
      Boolean var17 = C_class.instanceof_().byte_() && ((C_class)var1).static_().class_() ? true : byte_[2];
      this.break_[7] = var17;
      Boolean var18 = C_class.instanceof_().rJ.class_[0]
            && rhz_3.break_(((rhz_3)var3.implements_[1]).break_((rdn_3)class_[0]))
            && ((rYB)this.break_[2]).E() != rYB.protected_
         ? true
         : byte_[4];
      this.break_[6] = var18;
      Boolean var19 = C_class.instanceof_().Pc.class_[0] && var3.sk().class_() > 6 ? true : byte_[6];
      this.break_[8] = var19;
      Double var20 = (Double)C_class.instanceof_().Pe.class_[0];
      this.break_[9] = var20;
      Boolean var21 = C_class.instanceof_().throws_();
      this.break_[10] = var21;
      ArrayList var22 = new ArrayList((Collection)C_class.instanceof_().I.class_[0]);
      this.break_[11] = var22;
      Boolean var23 = (Boolean)C_class.instanceof_().double_.class_[0];
      this.break_[12] = var23;
      Boolean var24 = C_class.instanceof_().class_();
      this.break_[13] = var24;
      Boolean var25 = (Boolean)C_class.instanceof_().o.class_[0];
      this.break_[14] = var25;
      Boolean var26 = (Boolean)C_class.instanceof_().else_.class_[0];
      this.break_[15] = var26;
      Boolean var27 = (Boolean)C_class.instanceof_().rZ.class_[0];
      this.break_[16] = var27;
      Integer var28 = eA_2.class_(eY_2.finally_, var1.throw_().catch_());
      this.break_[17] = var28;
      Boolean var29 = (Boolean)C_class.instanceof_().Y.class_[0];
      this.break_[18] = var29;
      Boolean var30 = (Boolean)C_class.instanceof_().rA.class_[0];
      this.break_[19] = var30;
      Boolean var31 = (Boolean)C_class.instanceof_().PR.class_[0];
      this.break_[20] = var31;
      Integer var32 = (Integer)C_class.instanceof_().rb.class_[0];
      this.break_[21] = var32;
      Integer var33 = (Integer)C_class.instanceof_().extends_.class_[0];
      this.break_[22] = var33;
      int var4 = eA_2.throws_(var3);
      if (var4 > 3) {
         var4 = 3;
      }

      float var5 = (float)var4 / 3.0F;
      Double var34 = 9.09090909090909 * (double)(1.0F - var5) + 4.63284688441047 * (double)var5;
      this.break_[23] = var34;
      Double var35 = (Double)C_class.instanceof_().rs.class_[0];
      this.break_[24] = var35;
      Double var36 = (Double)C_class.instanceof_().rm.class_[0];
      this.break_[25] = var36;
      Double var37 = (Double)C_class.instanceof_().Pz.class_[0];
      this.break_[26] = var37;
      Double var38 = (Double)C_class.instanceof_().int_.class_[0];
      this.break_[27] = var38;
      ba_3 var39 = new ba_3(((rYB)this.break_[2]).instanceof_());
      this.break_[28] = var39;
   }

   static {
      ntfClinit();
   }

   public xc_3 class_(rfH_2 var1) {
      return this.class_(var1.b_(), var1.c_(), var1.d_());
   }

   public boolean class_(int var1, int var2) {
      return ((bw_3)this.break_[4]).break_(var1, var2);
   }

   public double class_(int var1, int var2, int var3, xc_3 var4) {
      if (!(Boolean)this.break_[7]) {
         return 1000000.0;
      } else if (this.byte_(var1, var2, var3)) {
         return 1000000.0;
      } else {
         return !((ba_3)this.break_[28]).class_(var1, var3) ? 1000000.0 : (Double)this.break_[9];
      }
   }

   public double class_() {
      return (Double)this.break_[9];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 34, 110, 37, 41, -79, -9, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 730441755;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4813817942088094797L;
   }

   public xc_3 class_(int var1, int var2, int var3) {
      return ((bw_3)this.break_[4]).class_(var1, var2, var3);
   }

   public C_case break_() {
      return (C_case)this.break_[1];
   }

   public double break_(int var1, int var2, int var3, xc_3 var4) {
      if (!(Boolean)this.break_[10] && !((List)this.break_[11]).contains(var4.break_())) {
         return 1000000.0;
      } else {
         return this.byte_(var1, var2, var3) ? 1000000.0 : case_[7];
      }
   }

   public xd_3 break_(int var1, int var2, int var3) {
      return this.class_(var1, var2, var3).break_();
   }

   private static void throws_() {
      protected_ = new short[]{
         29,
         0,
         1,
         2,
         3,
         2,
         3,
         4,
         5,
         7,
         0,
         1,
         0,
         2,
         6,
         0,
         8,
         0,
         9,
         10,
         0,
         11,
         0,
         12,
         13,
         0,
         14,
         0,
         15,
         0,
         16,
         17,
         0,
         18,
         0,
         19,
         0,
         20,
         0,
         21,
         0,
         22,
         23,
         0,
         24,
         0,
         25,
         0,
         26,
         0,
         27,
         2,
         28,
         1,
         4,
         4,
         7,
         28,
         9,
         10,
         11,
         9
      };
   }

   private static void catch_() {
      catch_ = new float[]{3.0F, 1.0F};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.hR, 1)};
      class_ = var0;
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[30];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[6] = false;
         var1[7] = false;
         var1[8] = false;
         var1[9] = 0.0;
         var1[10] = false;
         var1[12] = false;
         var1[13] = false;
         var1[14] = false;
         var1[15] = false;
         var1[16] = false;
         var1[17] = 0;
         var1[18] = false;
         var1[19] = false;
         var1[20] = false;
         var1[21] = 0;
         var1[22] = 0;
         var1[23] = 0.0;
         var1[24] = 0.0;
         var1[25] = 0.0;
         var1[26] = 0.0;
         var1[27] = 0.0;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void private_() {
      throws_ = new byte[]{6, 3, 3, 30, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
   }
}
