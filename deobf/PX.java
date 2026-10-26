package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PX {
   public static Object[] id_class;
   private static boolean[] id_byte;
   public Object[] id_break;
   private static float[] id_protected;
   private static double[] id_throws;
   private static short[] id_case;
   private static byte[] id_catch;

   public void id_byte(float var1) {
      Float var6 = var1;
      this.id_break[1] = var6;
   }

   public PX id_byte(PX var1) {
      return new PX((Float)this.id_break[0] - (Float)var1.id_break[0], (Float)this.id_break[1] - (Float)var1.id_break[1]);
   }

   public PX id_byte() {
      return new PX(id_protected((Float)this.id_break[0]), id_break((Float)this.id_break[1]));
   }

   public PX(float var1, float var2) {
      this.id_private();
      Float var7 = var1;
      this.id_break[0] = var7;
      Float var8 = var2;
      this.id_break[1] = var8;
   }

   static {
      ntfClinit();
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         PX var2 = (PX)var1;
         return Float.floatToIntBits((Float)this.id_break[0]) == Float.floatToIntBits((Float)var2.id_break[0]) && Float.floatToIntBits((Float)this.id_break[1]) == Float.floatToIntBits((Float)var2.id_break[1]) ? true : false;
      } else {
         return false;
      }
   }

   public String toString() {
      float var10000 = (Float)this.id_break[0];
      return "Yaw: " + var10000 + ", Pitch: " + (Float)this.id_break[1];
   }

   public int hashCode() {
      Object[] var10000 = new Object[2];
      var10000[0] = (Float)this.id_break[0];
      var10000[1] = (Float)this.id_break[1];
      return Objects.hash(var10000);
   }

   public boolean id_class(PX var1, float var2) {
      return this.id_break(var1.id_throws(), var2) && this.id_class(var1.id_protected(), var2) ? true : false;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, 34, -20, -114, 63, -47, 57, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public PX id_class() {
      return new PX((Float)this.id_break[0], id_break((Float)this.id_break[1]));
   }

   public boolean id_class(PX var1) {
      return this.id_break(var1) && this.id_throws(var1) ? true : false;
   }

   public boolean id_class(float var1, float var2, float var3) {
      return this.id_break(var1, var3) && this.id_class(var2, var3) ? true : false;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1643416083;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_break[0] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4428564563199629314L;
   }

   public rjU_2 id_class(an_3 var1, float var2) {
      return PJ.id_class(this).id_throws(var1.id_new(var2));
   }

   public boolean id_class(float var1, float var2) {
      return Math.abs((Float)this.id_break[1] - var1) < var2 ? true : false;
   }

   public boolean id_break(PX var1, float var2) {
      return Math.abs((Float)this.id_break[1] - (Float)var1.id_break[1]) < var2 ? true : false;
   }

   public boolean id_break(float var1, float var2) {
      float var3 = Math.abs(id_protected((Float)this.id_break[0]) - id_protected(var1));
      return !(var3 < var2) && !(var3 > 360.0F - var2) ? false : true;
   }

   public static float id_break(float var0) {
      return rfU_2.id_class(var0, -90.0F, 90.0F);
   }

   public PX id_break() {
      return new PX(id_protected((Float)this.id_break[0]), (Float)this.id_break[1]);
   }

   public boolean id_break(PX var1) {
      float var2 = Math.abs(id_protected((Float)this.id_break[0]) - id_protected((Float)var1.id_break[0]));
      return !((double)var2 < 0.01) && !((double)var2 > 359.99) ? false : true;
   }

   public float id_throws() {
      return (Float)this.id_break[0];
   }

   public boolean id_throws(PX var1) {
      return (double)Math.abs((Float)this.id_break[1] - (Float)var1.id_break[1]) < 0.01 ? true : false;
   }

   public PX id_throws(float var1) {
      return new PX(var1, (Float)this.id_break[1]);
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_case();
      id_catch();
      id_native();
      id_implements();
      id_extends();
      id_finally();
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new PX(0.0F, 0.0F)};
      id_class = var0;
   }

   private static void id_catch() {
      id_case = new short[]{0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1};
   }

   private static void id_extends() {
      id_catch = new byte[]{2, 2};
   }

   public PX id_case(float var1) {
      return new PX((Float)this.id_break[0], var1);
   }

   private static void id_case() {
      id_byte = new boolean[]{true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, false, true, false, false, true, true};
   }

   private static void id_implements() {
      id_protected = new float[]{360.0F, -90.0F, 90.0F, 360.0F, -180.0F, 360.0F, 180.0F, 360.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public PX id_protected(PX var1) {
      return new PX((Float)this.id_break[0] + (Float)var1.id_break[0], (Float)this.id_break[1] + (Float)var1.id_break[1]);
   }

   public float id_protected() {
      return (Float)this.id_break[1];
   }

   public static float id_protected(float var0) {
      float var1 = var0 % 360.0F;
      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      if (var1 > 180.0F) {
         var1 -= 360.0F;
      }

      return var1;
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
      }

   }

   private static void id_native() {
      id_throws = new double[]{0.01, 0.01, 359.99};
   }
}
