package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAl_1 extends Om_1 {
   private static String[] id_byte;
   private static float[] id_protected;
   public static Object[] id_class;
   private static double[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;
   private static short[] id_private;
   public Object[] id_break;

   public void id_byte(boolean var1) {
      this.id_final();
      Boolean var6 = var1;
      this.id_break[7] = var6;
   }

   public void id_byte(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[0] = var7;
   }

   private static void id_int() {
      Object[] var0 = new Object[]{new rrAl_1()};
      id_class = var0;
   }

   public rrAl_1() {
      this.id_final();
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new String[]{new String("Был отключен из-за флага!")};
   }

   public float id_class() {
      this.id_final();
      double var1 = Math.pow((Double)this.id_break[0] - (Double)this.id_break[3], 2.0);
      double var3 = Math.pow((Double)this.id_break[1] - (Double)this.id_break[4], 2.0);
      double var5 = Math.pow((Double)this.id_break[2] - (Double)this.id_break[5], 2.0);
      return rfU_2.id_class(var1 + var3 + var5);
   }

   public static rrAl_1 id_class(double var0, double var2, double var4, double var6, double var8, double var10, int var12, boolean var13, boolean var14) {
      rrAl_1 var10000 = (rrAl_1)id_class[0];
      Double var19 = var0;
      var10000.id_break[0] = var19;
      var10000 = (rrAl_1)id_class[0];
      Double var20 = var2;
      var10000.id_break[1] = var20;
      var10000 = (rrAl_1)id_class[0];
      Double var21 = var4;
      var10000.id_break[2] = var21;
      var10000 = (rrAl_1)id_class[0];
      Double var22 = var6;
      var10000.id_break[3] = var22;
      var10000 = (rrAl_1)id_class[0];
      Double var23 = var8;
      var10000.id_break[4] = var23;
      var10000 = (rrAl_1)id_class[0];
      Double var24 = var10;
      var10000.id_break[5] = var24;
      var10000 = (rrAl_1)id_class[0];
      Integer var25 = var12;
      var10000.id_break[6] = var25;
      var10000 = (rrAl_1)id_class[0];
      Boolean var26 = var13;
      var10000.id_break[7] = var26;
      var10000 = (rrAl_1)id_class[0];
      Boolean var27 = var14;
      var10000.id_break[8] = var27;
      ((rrAl_1)id_class[0]).id_class(false);
      return (rrAl_1)id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 54, 13, 56, 106, 107, 47, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[3] = var7;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2825966880584819239L;
   }

   public void id_class(int var1) {
      this.id_final();
      Integer var6 = var1;
      this.id_break[6] = var6;
   }

   public void id_break(boolean var1) {
      this.id_final();
      Boolean var6 = var1;
      this.id_break[8] = var6;
   }

   public void id_break(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[1] = var7;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1961356492;
   }

   public double id_break() {
      this.id_final();
      return (Double)this.id_break[0];
   }

   public void id_throws(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[4] = var7;
   }

   public double id_throws() {
      this.id_final();
      return (Double)this.id_break[3];
   }

   public int id_finally() {
      this.id_final();
      return (Integer)this.id_break[6];
   }

   public double id_catch() {
      this.id_final();
      return (Double)this.id_break[2];
   }

   public double id_extends() {
      this.id_final();
      return (Double)this.id_break[1];
   }

   public boolean id_case() {
      this.id_final();
      return (Boolean)this.id_break[7];
   }

   public void id_case(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[2] = var7;
   }

   private static void id_continue() {
      id_protected = new float[]{10.0F};
   }

   public void id_implements() {
      if (!(this.id_class() > 10.0F)) {
         for (Module var2 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g()) {
            if (var2 instanceof rrnZ_2) {
               rrnZ_2 var3 = (rrnZ_2)var2;
               if (var2.id_implements() && var2.aJ_()) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(var2.id_final(), "Был отключен из-за флага!", 1500));
                  var3.id_class();
               }
            }
         }
      }
   }

   private static void id_new() {
      id_catch = new byte[]{9, 2, 3, 4, 5, 6, 7, 8};
   }

   private static void id_package() {
      id_case = new boolean[]{false, false, false, true, false, false, false, true};
   }

   private static void id_super() {
      id_throws = new double[]{2.0, 2.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public double id_protected() {
      this.id_final();
      return (Double)this.id_break[5];
   }

   public void id_protected(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[5] = var7;
   }

   public double id_private() {
      this.id_final();
      return (Double)this.id_break[4];
   }

   private void id_final() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         Object[] var1 = this.id_break;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
         var1[6] = 0;
         var1[7] = false;
         var1[8] = false;
      }
   }

   private static void id_volatile() {
      id_private = new short[]{
         0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 0, 0, 0, 1500, 0, 3, 1, 4, 2, 5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8
      };
   }

   public boolean id_native() {
      this.id_final();
      return (Boolean)this.id_break[8];
   }
}
