package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtp_3 extends rrtm_3 {
   private static byte[] id_protected;
   private static short[] id_throws;
   private static String[] id_native;
   private static boolean[] id_volatile;
   private static float[] id_final;
   public Object[] id_byte;
   private static int[] id_package;

   public rrtp_3(rrtN_2 var1, rrIm_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_goto();
      rrtv_3 var11 = new rrtv_3((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[0]], id_final[0], id_volatile[0]);
      this.id_byte[id_throws[1]] = var11;
      AnimValue var12 = new AnimValue(id_final[1], id_volatile[1]);
      this.id_byte[id_throws[2]] = var12;
      this.id_byte[id_throws[3]] = var1;
      this.id_byte[id_throws[4]] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_goto();
      if (super.id_class(var1, var2, var3, var4, var5)) {
         if (var4 == 0) {
            Boolean var10 = id_volatile[5];
            this.id_byte[id_throws[33]] = var10;
         } else if (var4 == id_protected[4]) {
            ((rrIm_1)this.id_byte[id_throws[34]]).id_class(((rrIm_1)this.id_byte[id_throws[35]]).id_extends(), id_volatile[6], id_volatile[7]);
         }

         return id_volatile[8];
      } else {
         return id_volatile[9];
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.id_goto();
      super.id_class(var1, var2, var3, var4);
      float var5 = this.id_package();
      float var6 = this.id_final();
      float var7 = this.id_new();
      float var8 = ((rrIm_1)this.id_byte[id_throws[5]]).id_class();
      float var9 = ((rrIm_1)this.id_byte[id_throws[6]]).id_native();
      float var10 = ((rrIm_1)this.id_byte[id_throws[7]]).id_byte();
      float var11 = ((rrIm_1)this.id_byte[id_throws[8]]).id_volatile();
      this.id_class(var5, var7, var8, var9, var11, var3);
      this.id_private().id_interface().id_class(var1, () -> this.id_class(var1, var5, var6, var7, var8, var9, var10));
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.id_goto();
      int var8 = ColorHelper.id_class(id_final[2]);
      int var9 = ColorHelper.id_class(id_final[3]);
      String var10 = String.valueOf(var5);
      String var11 = String.valueOf(var6);
      ((AnimValue)this.id_byte[id_throws[9]]).id_break(var7);
      boolean var12 = ((rrIm_1)this.id_byte[id_throws[10]]).id_final();
      byte var13 = var12 ? id_protected[0] : id_protected[1];
      float var14 = (float)((int)(((AnimValue)this.id_byte[id_throws[11]]).id_byte() * (float)var13)) / (float)var13;
      String var15 = var14 + "";
      if (var12 && var15.endsWith(id_native[0]) && var15.length() > id_protected[2]) {
         var15 = var15.substring(id_volatile[2], var15.length() - id_protected[3]);
      }

      float var16 = (((rrIm_1)this.id_byte[id_throws[12]]).id_byte() - var5) / (var6 - var5);
      ((rrtv_3)this.id_byte[id_throws[13]]).id_class().id_break(var16);
      float var17 = ((rrtv_3)this.id_byte[id_throws[14]]).id_class().id_byte();
      var11 = this.id_class(((rrIm_1)this.id_byte[id_throws[15]]).id_package(), var14, var11);
      var15 = this.id_class(((rrIm_1)this.id_byte[id_throws[16]]).id_break(), var14, var15);
      rrtF_2.id_protected(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[17]]).id_finally(),
         ((rrIm_1)this.id_byte[id_throws[18]]).id_throws(),
         var2,
         var3,
         rrZF.k_,
         id_throws[19]
      );
      rrtF_2.id_protected(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[20]]).id_native(),
         var10,
         var2,
         var3 + id_final[4],
         rrZF.k_,
         id_throws[21]
      );
      rrtF_2.id_protected(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[22]]).id_native(),
         var11,
         var2 + var4 + id_final[5] - ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[23]]).id_native().id_break(var11),
         var3 + id_final[6],
         rrZF.k_,
         id_throws[24]
      );
      rrtF_2.id_break(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[25]]).id_native(),
         var15,
         var2 + var4 / id_final[7],
         var3 + id_final[8],
         rrZF.k_,
         id_throws[26]
      );
      rrtF_2.id_class(
         var1, var2 + id_final[9], var3 + id_final[10], var4 - id_final[11], id_final[12], id_final[13], id_package[0], this.id_class(id_throws[27])
      );
      rrtF_2.id_class(
         var1,
         var2 + id_final[14],
         var3 + id_final[15],
         (var4 - id_final[16]) * var17,
         id_final[17],
         id_final[18],
         var8,
         var8,
         var9,
         var9,
         this.id_class(id_throws[28])
      );
      float var18 = rfU_2.id_class(var2 + var4 * var17, var2 + id_final[19], var2 + var4 - id_final[20]);
      rrtF_2.id_class(var1, this, var18, var3 + id_final[21], id_final[22], rrZF.d_, id_throws[29], this.id_private().id_long() * rrvk_1.id_class());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4563716211253658676L;
   }

   private String id_class(BiFunction<rrIm_1, Float, String> var1, float var2, String var3) {
      this.id_goto();
      if (var1 != null) {
         String var4 = (String)var1.apply((rrIm_1)this.id_byte[id_throws[32]], var2);
         if (var4 != null) {
            var3 = var4;
         }
      }

      return var3;
   }

   private void id_class(float var1, float var2, float var3, float var4, float var5, int var6) {
      this.id_goto();
      if ((Boolean)this.id_byte[id_throws[30]]) {
         float var7 = rrfQ_2.id_class(((float)var6 - var1) * (var4 - var3) / var2 + var3, var5);
         ((rrIm_1)this.id_byte[id_throws[31]]).id_class(rfU_2.id_class(var7, var3, var4), id_volatile[3], id_volatile[4]);
      }
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      this.id_goto();
      if (super.id_break(var1, var2, var3)) {
         Boolean var8 = id_volatile[10];
         this.id_byte[id_throws[36]] = var8;
         return id_volatile[11];
      } else {
         return id_volatile[12];
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1162221727;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, -121, -41, -76, 63, 53, -99, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<?> id_finally() {
      this.id_goto();
      return (rrIm_1)this.id_byte[id_throws[39]];
   }

   private void id_goto() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_protected[5]];
         Object[] var1 = this.id_byte;
         var1[id_protected[6]] = id_volatile[14];
      }
   }

   @Override
   public void id_case() {
      this.id_goto();
      super.id_case();
      Boolean var5 = id_volatile[13];
      this.id_byte[id_throws[37]] = var5;
   }

   private static void id_instanceof() {
      id_package = new int[]{6781311};
   }

   private static void id_return() {
      id_throws = new short[]{
         1, 2, 3, 1, 0, 0, 0, 0, 0, 3, 0, 3, 0, 2, 2, 0, 0, 0, 0, 255, 0, 255, 0, 0, 255, 0, 255, 255, 255, 255, 4, 0, 0, 4, 0, 0, 4, 4, 1, 0
      };
   }

   private static void id_try() {
      id_protected = new byte[]{100, 10, 3, 2, 2, 5, 4};
   }

   private static void id_while() {
      id_volatile = new boolean[]{false, true, false, false, true, true, false, true, true, false, false, true, false, false, false};
   }

   private static void id_public() {
      id_final = new float[]{
         0.4F,
         0.3F,
         0.0F,
         180.0F,
         19.0F,
         1.0F,
         19.0F,
         2.0F,
         19.0F,
         1.0F,
         10.0F,
         1.0F,
         2.0F,
         1.0F,
         1.0F,
         10.0F,
         1.0F,
         2.0F,
         1.0F,
         3.0F,
         2.0F,
         11.0F,
         8.0F,
         8.0F,
         1.0F,
         6.0F
      };
   }

   @Override
   public rrtN_2 id_private() {
      this.id_goto();
      return (rrtN_2)this.id_byte[id_throws[38]];
   }

   @Override
   public rruv_1 id_volatile() {
      return new rruv_1(this.id_package(), this.id_final() + id_final[23], this.id_new() + id_final[24], id_final[25]);
   }

   private static void id_synchronized() {
      id_native = new String[]{new String(".0")};
   }
}
