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
      this.id_break[id_private[45]] = var6;
   }

   public void id_byte(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[id_private[38]] = var7;
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
      double var1 = Math.pow((Double)this.id_break[id_private[23]] - (Double)this.id_break[id_private[24]], id_throws[0]);
      double var3 = Math.pow((Double)this.id_break[id_private[25]] - (Double)this.id_break[id_private[26]], id_throws[1]);
      double var5 = Math.pow((Double)this.id_break[id_private[27]] - (Double)this.id_break[id_private[28]], id_throws[2]);
      return rfU_2.id_class(var1 + var3 + var5);
   }

   public static rrAl_1 id_class(double var0, double var2, double var4, double var6, double var8, double var10, int var12, boolean var13, boolean var14) {
      rrAl_1 var10000 = (rrAl_1)id_class[id_private[0]];
      Double var19 = var0;
      var10000.id_break[id_private[1]] = var19;
      var10000 = (rrAl_1)id_class[id_private[2]];
      Double var20 = var2;
      var10000.id_break[id_private[3]] = var20;
      var10000 = (rrAl_1)id_class[id_private[4]];
      Double var21 = var4;
      var10000.id_break[id_private[5]] = var21;
      var10000 = (rrAl_1)id_class[id_private[6]];
      Double var22 = var6;
      var10000.id_break[id_private[7]] = var22;
      var10000 = (rrAl_1)id_class[id_private[8]];
      Double var23 = var8;
      var10000.id_break[id_private[9]] = var23;
      var10000 = (rrAl_1)id_class[id_private[10]];
      Double var24 = var10;
      var10000.id_break[id_private[11]] = var24;
      var10000 = (rrAl_1)id_class[id_private[12]];
      Integer var25 = var12;
      var10000.id_break[id_private[13]] = var25;
      var10000 = (rrAl_1)id_class[id_private[14]];
      Boolean var26 = var13;
      var10000.id_break[id_private[15]] = var26;
      var10000 = (rrAl_1)id_class[id_private[16]];
      Boolean var27 = var14;
      var10000.id_break[id_private[17]] = var27;
      ((rrAl_1)id_class[id_private[18]]).id_class(id_case[0]);
      return (rrAl_1)id_class[id_private[19]];
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
      this.id_break[id_private[41]] = var7;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2825966880584819239L;
   }

   public void id_class(int var1) {
      this.id_final();
      Integer var6 = var1;
      this.id_break[id_private[44]] = var6;
   }

   public void id_break(boolean var1) {
      this.id_final();
      Boolean var6 = var1;
      this.id_break[id_private[46]] = var6;
   }

   public void id_break(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[id_private[39]] = var7;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1961356492;
   }

   public double id_break() {
      this.id_final();
      return (Double)this.id_break[id_private[29]];
   }

   public void id_throws(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[id_private[42]] = var7;
   }

   public double id_throws() {
      this.id_final();
      return (Double)this.id_break[id_private[32]];
   }

   public int id_finally() {
      this.id_final();
      return (Integer)this.id_break[id_private[35]];
   }

   public double id_catch() {
      this.id_final();
      return (Double)this.id_break[id_private[31]];
   }

   public double id_extends() {
      this.id_final();
      return (Double)this.id_break[id_private[30]];
   }

   public boolean id_case() {
      this.id_final();
      return (Boolean)this.id_break[id_private[36]];
   }

   public void id_case(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[id_private[40]] = var7;
   }

   private static void id_continue() {
      id_protected = new float[]{10.0F};
   }

   public void id_implements() {
      if (!(this.id_class() > id_protected[0])) {
         for (Module var2 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[20]]).id_private().g()) {
            if (var2 instanceof rrnZ_2) {
               rrnZ_2 var3 = (rrnZ_2)var2;
               if (var2.id_implements() && var2.aJ_()) {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[21]])
                     .id_class(new rrtx_3(var2.id_final(), id_byte[0], id_private[22]));
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
      return (Double)this.id_break[id_private[34]];
   }

   public void id_protected(double var1) {
      this.id_final();
      Double var7 = var1;
      this.id_break[id_private[43]] = var7;
   }

   public double id_private() {
      this.id_final();
      return (Double)this.id_break[id_private[33]];
   }

   private void id_final() {
      if (this.id_break == null) {
         this.id_break = new Object[id_catch[0]];
         Object[] var1 = this.id_break;
         var1[id_case[2]] = id_throws[3];
         var1[id_case[3]] = id_throws[4];
         var1[id_catch[1]] = id_throws[5];
         var1[id_catch[2]] = id_throws[6];
         var1[id_catch[3]] = id_throws[7];
         var1[id_catch[4]] = id_throws[8];
         var1[id_catch[5]] = Integer.valueOf(id_case[4]);
         var1[id_catch[6]] = id_case[5];
         var1[id_catch[7]] = id_case[6];
      }
   }

   private static void id_volatile() {
      id_private = new short[]{
         0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 0, 0, 0, 1500, 0, 3, 1, 4, 2, 5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8
      };
   }

   public boolean id_native() {
      this.id_final();
      return (Boolean)this.id_break[id_private[37]];
   }
}
