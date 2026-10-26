package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EZ {
   private static boolean[] id_byte;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static double[] id_case;
   private static float[] id_catch;

   public boolean id_byte(int var1, int var2, int var3) {
      return false;
   }

   private static void id_byte() {
      id_case = new double[]{9.09090909090909, 4.63284688441047, 1000000.0, 1000000.0, 1000000.0, 1000000.0, 1000000.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public EZ(C_case var1) {
      this(var1, false);
   }

   public EZ(C_case var1, boolean var2) {
      this.id_implements();
      GJ var10 = new GJ();
      this.id_break[29] = var10;
      Boolean var11 = var2;
      this.id_break[0] = var11;
      this.id_break[1] = var1;
      cb_3 var3 = var1.id_throw().id_catch();
      rYB var13 = var1.id_throw().id_case();
      this.id_break[2] = var13;
      SR var14 = (SR)var1.id_implements().id_class();
      this.id_break[3] = var14;
      bw_3 var15 = new bw_3((rYB)this.id_break[2], (SR)this.id_break[3], var2);
      this.id_break[4] = var15;
      bU_2 var16 = new bU_2(var3);
      this.id_break[5] = var16;
      Boolean var17 = C_class.id_instanceof().id_byte() && ((C_class)var1).id_static().id_class() ? true : id_byte[2];
      this.id_break[7] = var17;
      Boolean var18 = C_class.id_instanceof().rJ.id_class[0]
            && rhz_3.id_break(((rhz_3)var3.id_implements[1]).id_break((rdn_3)id_class[0]))
            && ((rYB)this.id_break[2]).E() != rYB.id_protected
         ? true
         : id_byte[4];
      this.id_break[6] = var18;
      Boolean var19 = C_class.id_instanceof().Pc.id_class[0] && var3.sk().id_class() > 6 ? true : id_byte[6];
      this.id_break[8] = var19;
      Double var20 = (Double)C_class.id_instanceof().Pe.id_class[0];
      this.id_break[9] = var20;
      Boolean var21 = C_class.id_instanceof().id_throws();
      this.id_break[10] = var21;
      ArrayList var22 = new ArrayList((Collection)C_class.id_instanceof().I.id_class[0]);
      this.id_break[11] = var22;
      Boolean var23 = (Boolean)C_class.id_instanceof().id_double.id_class[0];
      this.id_break[12] = var23;
      Boolean var24 = C_class.id_instanceof().id_class();
      this.id_break[13] = var24;
      Boolean var25 = (Boolean)C_class.id_instanceof().o.id_class[0];
      this.id_break[14] = var25;
      Boolean var26 = (Boolean)C_class.id_instanceof().id_else.id_class[0];
      this.id_break[15] = var26;
      Boolean var27 = (Boolean)C_class.id_instanceof().rZ.id_class[0];
      this.id_break[16] = var27;
      Integer var28 = eA_2.id_class(eY_2.id_finally, var1.id_throw().id_catch());
      this.id_break[17] = var28;
      Boolean var29 = (Boolean)C_class.id_instanceof().Y.id_class[0];
      this.id_break[18] = var29;
      Boolean var30 = (Boolean)C_class.id_instanceof().rA.id_class[0];
      this.id_break[19] = var30;
      Boolean var31 = (Boolean)C_class.id_instanceof().PR.id_class[0];
      this.id_break[20] = var31;
      Integer var32 = (Integer)C_class.id_instanceof().rb.id_class[0];
      this.id_break[21] = var32;
      Integer var33 = (Integer)C_class.id_instanceof().id_extends.id_class[0];
      this.id_break[22] = var33;
      int var4 = eA_2.id_throws(var3);
      if (var4 > 3) {
         var4 = 3;
      }

      float var5 = (float)var4 / 3.0F;
      Double var34 = 9.09090909090909 * (double)(1.0F - var5) + 4.63284688441047 * (double)var5;
      this.id_break[23] = var34;
      Double var35 = (Double)C_class.id_instanceof().rs.id_class[0];
      this.id_break[24] = var35;
      Double var36 = (Double)C_class.id_instanceof().rm.id_class[0];
      this.id_break[25] = var36;
      Double var37 = (Double)C_class.id_instanceof().Pz.id_class[0];
      this.id_break[26] = var37;
      Double var38 = (Double)C_class.id_instanceof().id_int.id_class[0];
      this.id_break[27] = var38;
      ba_3 var39 = new ba_3(((rYB)this.id_break[2]).id_instanceof());
      this.id_break[28] = var39;
   }

   static {
      ntfClinit();
   }

   public xc_3 id_class(rfH_2 var1) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_());
   }

   public boolean id_class(int var1, int var2) {
      return ((bw_3)this.id_break[4]).id_break(var1, var2);
   }

   public double id_class(int var1, int var2, int var3, xc_3 var4) {
      if (!(Boolean)this.id_break[7]) {
         return 1000000.0;
      } else if (this.id_byte(var1, var2, var3)) {
         return 1000000.0;
      } else {
         return !((ba_3)this.id_break[28]).id_class(var1, var3) ? 1000000.0 : (Double)this.id_break[9];
      }
   }

   public double id_class() {
      return (Double)this.id_break[9];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 34, 110, 37, 41, -79, -9, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 730441755;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4813817942088094797L;
   }

   public xc_3 id_class(int var1, int var2, int var3) {
      return ((bw_3)this.id_break[4]).id_class(var1, var2, var3);
   }

   public C_case id_break() {
      return (C_case)this.id_break[1];
   }

   public double id_break(int var1, int var2, int var3, xc_3 var4) {
      if (!(Boolean)this.id_break[10] && !((List)this.id_break[11]).contains(var4.id_break())) {
         return 1000000.0;
      } else {
         return this.id_byte(var1, var2, var3) ? 1000000.0 : id_case[7];
      }
   }

   public xd_3 id_break(int var1, int var2, int var3) {
      return this.id_class(var1, var2, var3).id_break();
   }

   private static void id_throws() {
      id_protected = new short[]{
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

   private static void id_catch() {
      id_catch = new float[]{3.0F, 1.0F};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.hR, 1)};
      id_class = var0;
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[30];
         Object[] var1 = this.id_break;
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

   private static void id_protected() {
      id_byte = new boolean[]{
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

   private static void id_private() {
      id_throws = new byte[]{6, 3, 3, 30, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
   }
}
