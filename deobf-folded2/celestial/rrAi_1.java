package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAi_1 extends Om_1 {
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;
   public static Object[] id_break;
   private static float[] id_case;

   public rrAi_1() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static rrAi_1 id_class(Y var0, Ml_1 var1, rpm_3 var2, rpZ_2 var3, rdn_3 var4, float var5) {
      ((rrAi_1)id_break[0]).id_class[5] = var0;
      ((rrAi_1)id_break[0]).id_class[0] = var1;
      ((rrAi_1)id_break[0]).id_class[1] = var2;
      ((rrAi_1)id_break[0]).id_class[2] = var3;
      ((rrAi_1)id_break[0]).id_class[3] = var4;
      rrAi_1 var10000 = (rrAi_1)id_break[0];
      Float var15 = var5;
      var10000.id_class[4] = var15;
      ((rrAi_1)id_break[0]).id_class(false);
      return (rrAi_1)id_break[0];
   }

   public void id_class(rdn_3 var1) {
      this.id_private();
      this.id_class[3] = var1;
   }

   public void id_class(rpZ_2 var1) {
      this.id_private();
      this.id_class[2] = var1;
   }

   public void id_class(rpm_3 var1) {
      this.id_private();
      this.id_class[1] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, -65, 56, -111, 12, 18, 63, 104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(Ml_1 var1) {
      this.id_private();
      this.id_class[0] = var1;
   }

   public void id_class(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_class[4] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -239997264344182719L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -172304177;
   }

   public void id_class(Y var1) {
      this.id_private();
      this.id_class[5] = var1;
   }

   public rpZ_2 id_class() {
      this.id_private();
      return (rpZ_2)this.id_class[2];
   }

   public Ml_1 id_break() {
      this.id_private();
      return (Ml_1)this.id_class[0];
   }

   public Y id_throws() {
      this.id_private();
      return (Y)this.id_class[5];
   }

   private static void id_finally() {
      id_case = new float[1];
   }

   public float id_catch() {
      this.id_private();
      return (Float)this.id_class[4];
   }

   private static void id_extends() {
      id_byte = new byte[]{6, 4};
   }

   public rpm_3 id_case() {
      this.id_private();
      return (rpm_3)this.id_class[1];
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{new rrAi_1()};
      id_break = var0;
   }

   public rdn_3 id_protected() {
      this.id_private();
      return (rdn_3)this.id_class[3];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[4] = 0.0F;
      }
   }

   private static void id_volatile() {
      id_protected = new short[]{0, 5, 0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   private static void id_native() {
      id_throws = new boolean[]{false, false, true};
   }
}
