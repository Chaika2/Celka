package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTC implements C_int, MinecraftAccessor {
   private static boolean[] id_byte;
   public static Object[] id_class;
   private static short[] id_protected;
   public Object[] id_break;
   private static byte[] id_throws;
   private static double[] id_case;
   private static float[] id_catch;

   public double id_byte() {
      return ((Qw_1)id_import.id_class[20]).id_class;
   }

   public rrTC(rrnF_2 var1) {
      this.id_implements();
      Pr_1 var6 = new Pr_1();
      this.id_break[1] = var6;
      this.id_break[id_protected[1]] = var1;
   }

   rrTC(rrTC var1) {
      this.id_implements();
      Pr_1 var6 = ((Pr_1)var1.id_break[1]).id_class();
      this.id_break[1] = var6;
      rrnF_2 var7 = (rrnF_2)var1.id_break[id_protected[4]];
      this.id_break[id_protected[5]] = var7;
   }

   static {
      ntfClinit();
   }

   private float id_class(float var1, float var2) {
      float var3 = var2 - var1;
      double var4 = this.id_class(var3);
      return var1 + this.id_class(var4);
   }

   @Override
   public void id_class(int var1) {
      for (int var2 = id_byte[0]; var2 < var1; var2++) {
         this.id_break();
      }
   }

   private float id_class(double var1) {
      double var3 = this.id_byte() * 0.6F + 0.2F;
      return (float)(var1 * var3 * var3 * var3 * 8.0) * 0.15F;
   }

   @Override
   public C_int id_class() {
      return new rrTl_1(this, this);
   }

   @Override
   public PX id_class(PX var1) {
      rrTf_1 var2 = ((rrnF_2)this.id_break[id_protected[6]]).aL_();
      PX var3 = this.id_throws();
      float var4 = var3.id_throws();
      float var5 = var3.id_protected();
      float var6 = var1.id_throws();
      float var7 = var1.id_protected();
      float var8 = ((rrnF_2)this.id_break[id_protected[7]]).id_break();
      float var9 = ((rrnF_2)this.id_break[id_protected[8]]).id_private();
      if (var8 != -1.0F) {
         var6 = ((rrnF_2)this.id_break[id_protected[9]]).aA_().process(var4, var6, var8);
      }

      if (var9 != -1.0F) {
         var7 = ((rrnF_2)this.id_break[id_protected[10]]).aE_().process(var5, var7, var9);
      }

      if (var2 != null) {
         PX var10 = var2.processRandom(var3, new PX(var6, var7));
         var6 = var10.id_throws();
         var7 = var10.id_protected();
      }

      var6 = (Float)((cb_3)id_import.id_class[57]).id_throws[15] + rfU_2.id_catch(var6 - (Float)((cb_3)id_import.id_class[57]).id_throws[15]);
      float var13 = this.id_class(var4, var4 + rfU_2.id_catch(var6 - var4));
      float var11 = this.id_class(var5, var7);
      return new PX(var13, var11).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1945552562075482507L;
   }

   private double id_class(float var1) {
      float var2 = this.id_class(1.0);
      return (double)Math.round(var1 / var2);
   }

   @Override
   public void id_break() {
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1095389317;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, 94, 41, 9, -50, 23, -113, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public PX id_break(PX var1) {
      PX var2 = this.id_class(var1);
      this.id_break();
      return var2;
   }

   public abstract PX id_throws();

   private static void id_finally() {
      Object[] var0 = new Object[]{0.0F};
      id_class = var0;
   }

   private static void id_catch() {
      id_protected = new short[]{1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 57, 15, 57, 15, 20, 1};
   }

   private static void id_extends() {
      id_case = new double[]{1.0, 0.6F, 0.2F, 8.0};
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   public Pr_1 id_protected() {
      return (Pr_1)this.id_break[1];
   }

   private static void id_private() {
      id_byte = new boolean[]{false, true, false};
   }

   private static void id_native() {
      id_catch = new float[]{-1.0F, -1.0F, 0.15F, -1.0F};
   }
}
