package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAO extends Om_1 {
   private static double[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static byte[] id_throws;
   private static short[] id_case;
   private static float[] id_catch;
   public Object[] id_break;

   public void id_byte(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[1] = var6;
   }

   private static void id_int() {
      id_byte = new double[1];
   }

   public rrAO() {
      this.id_package();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 134561779;
   }

   public void id_class(float var1) {
      this.id_package();
      Float var6 = var1;
      this.id_break[5] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4806048170652259312L;
   }

   public boolean id_class() {
      this.id_package();
      return (Boolean)this.id_break[1];
   }

   public static rrAO id_class(boolean var0, boolean var1, boolean var2, boolean var3, float var4, float var5, boolean var6, boolean var7, double var8) {
      rrAO var10 = id_break(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_case[20]]).id_class(var10);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[21]]).id_finally().id_class(var10);
      return var10;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -5, -110, 119, -80, -10, -54, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(double var1) {
      this.id_package();
      Double var7 = var1;
      this.id_break[8] = var7;
   }

   public void id_break(float var1) {
      this.id_package();
      Float var6 = var1;
      this.id_break[4] = var6;
   }

   private static rrAO id_break(boolean var0, boolean var1, boolean var2, boolean var3, float var4, float var5, boolean var6, boolean var7, double var8) {
      rrAO var10000 = (rrAO)id_class[id_case[0]];
      Boolean var14 = var0;
      var10000.id_break[id_case[1]] = var14;
      var10000 = (rrAO)id_class[id_case[2]];
      Boolean var15 = var1;
      var10000.id_break[1] = var15;
      var10000 = (rrAO)id_class[id_case[4]];
      Boolean var16 = var2;
      var10000.id_break[2] = var16;
      var10000 = (rrAO)id_class[id_case[6]];
      Boolean var17 = var3;
      var10000.id_break[3] = var17;
      var10000 = (rrAO)id_class[id_case[8]];
      Float var18 = var4;
      var10000.id_break[4] = var18;
      var10000 = (rrAO)id_class[id_case[10]];
      Float var19 = var5;
      var10000.id_break[5] = var19;
      var10000 = (rrAO)id_class[id_case[12]];
      Boolean var20 = var6;
      var10000.id_break[6] = var20;
      var10000 = (rrAO)id_class[id_case[14]];
      Boolean var21 = var7;
      var10000.id_break[7] = var21;
      var10000 = (rrAO)id_class[id_case[16]];
      Double var22 = var8;
      var10000.id_break[8] = var22;
      ((rrAO)id_class[id_case[18]]).id_class(id_protected[0]);
      return (rrAO)id_class[id_case[19]];
   }

   public boolean id_break() {
      this.id_package();
      return (Boolean)this.id_break[6];
   }

   public void id_break(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[6] = var6;
   }

   public float id_throws() {
      this.id_package();
      return (Float)this.id_break[5];
   }

   public void id_throws(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[3] = var6;
   }

   public boolean id_finally() {
      this.id_package();
      return (Boolean)this.id_break[3];
   }

   public void id_catch(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[7] = var6;
   }

   public float id_catch() {
      this.id_package();
      return (Float)this.id_break[4];
   }

   public boolean id_extends() {
      this.id_package();
      return (Boolean)this.id_break[id_case[28]];
   }

   public double id_case() {
      this.id_package();
      return (Double)this.id_break[8];
   }

   public void id_case(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[2] = var6;
   }

   private static void id_continue() {
      id_case = new short[]{
         0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 0, 0, 0, 0, 1, 2, 3, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8
      };
   }

   public boolean id_implements() {
      this.id_package();
      return (Boolean)this.id_break[7];
   }

   private static void id_new() {
      id_throws = new byte[]{9, 2, 3, 4, 5, 6, 7, 8};
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         Object[] var1 = this.id_break;
         var1[id_protected[4]] = id_protected[5];
         var1[1] = id_protected[7];
         var1[2] = id_protected[8];
         var1[3] = id_protected[9];
         var1[4] = id_catch[0];
         var1[5] = id_catch[1];
         var1[6] = id_protected[10];
         var1[7] = id_protected[11];
         var1[8] = id_byte[0];
      }
   }

   public void id_protected(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[id_case[37]] = var6;
   }

   public boolean id_protected() {
      this.id_package();
      return (Boolean)this.id_break[2];
   }

   public boolean id_private() {
      this.id_package();
      return !this.id_break[id_case[22]] && !this.id_break[1] && !this.id_break[2] && !this.id_break[3] && !this.id_break[6] && !this.id_break[7]
         ? id_protected[2]
         : true;
   }

   private static void id_final() {
      id_protected = new boolean[]{false, true, false, false, false, false, true, false, false, false, false, false, true};
   }

   private static void id_volatile() {
      id_catch = new float[2];
   }

   private static void id_native() {
      Object[] var0 = new Object[]{new rrAO()};
      id_class = var0;
   }
}
