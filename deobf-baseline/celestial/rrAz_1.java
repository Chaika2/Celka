package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAz_1 {
   private static byte[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static float[] id_throws;
   private static double[] id_case;
   private static short[] id_catch;
   public Object[] id_break;

   public boolean id_byte() {
      return (Boolean)this.id_break[id_catch[26]];
   }

   private static void id_int() {
      id_case = new double[2];
   }

   public rrAz_1() {
      this.id_package();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1899598388127777641L;
   }

   public static void id_class(rrAz_1 var0) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[17]]).id_finally().id_class(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_catch[18]]).id_class(var0);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1748699761;
   }

   public void id_class(rfl_3 var1) {
      this.id_break[id_catch[31]] = var1;
   }

   public static rrAz_1 id_class(rjG_2 var0, double var1, double var3, rjU_2 var5, rfl_3 var6, PX var7, boolean var8, float var9) {
      ((rrAz_1)id_class[id_catch[0]]).id_break[id_catch[1]] = var0;
      rrAz_1 var10000 = (rrAz_1)id_class[id_catch[2]];
      Double var15 = var1;
      var10000.id_break[id_catch[3]] = var15;
      var10000 = (rrAz_1)id_class[id_catch[4]];
      Double var16 = var3;
      var10000.id_break[id_catch[5]] = var16;
      ((rrAz_1)id_class[id_catch[6]]).id_break[id_catch[7]] = var5;
      ((rrAz_1)id_class[id_catch[8]]).id_break[id_catch[9]] = var6;
      ((rrAz_1)id_class[id_catch[10]]).id_break[id_catch[11]] = var7;
      var10000 = (rrAz_1)id_class[id_catch[12]];
      Boolean var20 = var8;
      var10000.id_break[id_catch[13]] = var20;
      var10000 = (rrAz_1)id_class[id_catch[14]];
      Float var21 = var9;
      var10000.id_break[id_catch[15]] = var21;
      return (rrAz_1)id_class[id_catch[16]];
   }

   public void id_class(rjG_2 var1) {
      this.id_break[id_catch[28]] = var1;
   }

   public void id_class(rjU_2 var1) {
      this.id_break[id_catch[30]] = var1;
   }

   public void id_class(PX var1) {
      this.id_break[id_catch[36]] = var1;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[id_catch[34]] = var6;
   }

   public void id_class(rfo_3 var1) {
      this.id_break[id_catch[29]] = var1;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_break[id_catch[35]] = var6;
   }

   public rfo_3 id_class() {
      return (rfo_3)this.id_break[id_catch[20]];
   }

   public void id_class(double var1) {
      Double var7 = var1;
      this.id_break[id_catch[33]] = var7;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, -46, -38, -120, 82, 37, -37, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(double var1) {
      Double var7 = var1;
      this.id_break[id_catch[32]] = var7;
   }

   public rjG_2 id_break() {
      return (rjG_2)this.id_break[id_catch[19]];
   }

   public rjU_2 id_throws() {
      return (rjU_2)this.id_break[id_catch[21]];
   }

   private static void id_finally() {
      id_catch = new short[]{0, 0, 0, 5, 0, 6, 0, 2, 0, 3, 0, 4, 0, 7, 0, 8, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 5, 6, 7, 8, 4};
   }

   public PX id_catch() {
      return (PX)this.id_break[id_catch[23]];
   }

   private static void id_extends() {
      id_byte = new byte[]{9, 5, 6, 7, 8};
   }

   public float id_case() {
      return (Float)this.id_break[id_catch[27]];
   }

   public rfl_3 id_implements() {
      return (rfl_3)this.id_break[id_catch[22]];
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
         var1[id_byte[1]] = id_case[0];
         var1[id_byte[2]] = id_case[1];
         var1[id_byte[3]] = id_protected[1];
         var1[id_byte[4]] = id_throws[0];
      }
   }

   public double id_protected() {
      return (Double)this.id_break[id_catch[25]];
   }

   public double id_private() {
      return (Double)this.id_break[id_catch[24]];
   }

   private static void id_final() {
      id_protected = new boolean[]{false, false, true};
   }

   private static void id_volatile() {
      id_throws = new float[1];
   }

   private static void id_native() {
      Object[] var0 = new Object[]{new rrAz_1()};
      id_class = var0;
   }
}
