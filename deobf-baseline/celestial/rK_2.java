package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rK_2 implements C_int {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static double[] id_protected;
   private static float[] id_throws;
   private static short[] id_case;

   public abstract PX id_byte();

   rK_2(rK_2 var1) {
      this.id_implements();
      Ps_1 var6 = (Ps_1)var1.id_class[id_case[2]];
      this.id_class[id_case[3]] = var6;
      Pr_1 var7 = ((Pr_1)var1.id_class[id_case[4]]).id_class();
      this.id_class[id_case[5]] = var7;
      Double var8 = (Double)var1.id_class[id_case[6]];
      this.id_class[id_case[7]] = var8;
      Double var9 = (Double)var1.id_class[id_case[8]];
      this.id_class[id_case[9]] = var9;
   }

   public rK_2(Ps_1 var1) {
      this.id_implements();
      this.id_class[id_case[0]] = var1;
      Pr_1 var7 = new Pr_1();
      this.id_class[id_case[1]] = var7;
   }

   static {
      ntfClinit();
   }

   private float id_class(float var1, float var2) {
      float var3 = var2 - var1;
      double var4 = this.id_break(var3);
      return var1 + this.id_class(var4);
   }

   @Override
   public void id_class(int var1) {
      for (int var2 = id_break[0]; var2 < var1; var2++) {
         this.id_break();
      }
   }

   @Override
   public C_int id_class() {
      return new rD_2(this, this);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3234824775722761568L;
   }

   private float id_class(float var1) {
      if (var1 < id_throws[0]) {
         return var1 + id_throws[1];
      } else {
         return var1 > id_throws[2] ? var1 - id_throws[3] : var1;
      }
   }

   @Override
   public PX id_class(PX var1) {
      PX var2 = this.id_byte();
      float var3 = var1.id_throws();
      float var4 = var1.id_protected();
      if (var4 == var2.id_protected()) {
         var4 = this.id_class(var4);
      }

      var3 += (float)((Double)this.id_class[id_case[10]]).doubleValue();
      var4 += (float)((Double)this.id_class[id_case[11]]).doubleValue();
      return new PX(this.id_class(var2.id_throws(), var3), this.id_class(var2.id_protected(), var4)).id_class();
   }

   private float id_class(double var1) {
      double var3 = ((Qw_1)((Ps_1)this.id_class[id_case[17]]).id_throws().id_class[id_case[18]]).id_class * id_protected[3] + id_protected[4];
      return (float)(var1 * var3 * var3 * var3 * id_protected[5]) * id_throws[4];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, -61, -55, 51, -14, -24, 102, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 805709315;
   }

   @Override
   public PX id_break(PX var1) {
      PX var2 = this.id_class(var1);
      this.id_break();
      return var2;
   }

   @Override
   public void id_break() {
      double var1 = (Double)C_class.id_instanceof().t.id_class[id_case[12]];
      Double var7 = (((Pr_1)this.id_class[id_case[13]]).id_byte() - id_protected[0]) * var1;
      this.id_class[id_case[14]] = var7;
      Double var8 = (((Pr_1)this.id_class[id_case[15]]).id_byte() - id_protected[1]) * var1;
      this.id_class[id_case[16]] = var8;
   }

   private double id_break(float var1) {
      float var2 = this.id_class(id_protected[2]);
      return (double)Math.round(var1 / var2);
   }

   private static void id_throws() {
      id_protected = new double[]{0.5, 0.5, 1.0, 0.6F, 0.2F, 8.0, 0.0, 0.0};
   }

   private static void id_catch() {
      id_break = new boolean[1];
   }

   private static void id_case() {
      id_case = new short[]{0, 1, 0, 0, 1, 1, 2, 2, 3, 3, 2, 3, 0, 1, 2, 1, 3, 0, 20};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = id_protected[6];
         var1[id_byte[2]] = id_protected[7];
      }
   }

   private static void id_protected() {
      id_throws = new float[]{-20.0F, 1.0F, 10.0F, 1.0F, 0.15F};
   }

   private static void id_private() {
      id_byte = new byte[]{4, 2, 3};
   }
}
