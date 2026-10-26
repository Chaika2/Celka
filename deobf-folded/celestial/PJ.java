package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PJ {
   private static short[] id_break;
   private static float[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static double[] id_throws;
   private static byte[] id_case;

   public static int id_byte(an_3 var0, double var1, double var3) {
      double var5 = id_throws[16];
      double var7 = var1 - var0.rx();
      double var9 = var3 - var0.BO();
      if (var9 > id_throws[17] && var7 > id_throws[18]) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 > id_throws[19] && var7 < id_throws[20]) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 < id_throws[21] && var7 > id_throws[22]) {
         var5 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
      } else if (var9 < id_throws[24] && var7 < id_throws[25]) {
         var5 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
      }

      int var11 = (int)(Math.abs(var5 - (double)((Float)var0.id_throws[15]).floatValue()) % 360.0);
      return var11 > 180 ? 360 - var11 : var11;
   }

   private static void id_byte() {
      id_byte = new float[]{
         (float) (Math.PI / 180.0),
         (float) Math.PI,
         (float) (Math.PI / 180.0),
         (float) Math.PI,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) Math.PI,
         (float) (Math.PI / 180.0),
         (float) Math.PI,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         1.0F,
         1.0F,
         0.0F,
         1.0E-4F,
         1.0F,
         1.0F,
         2.0F,
         0.0F
      };
   }

   private PJ() {
   }

   static {
      ntfClinit();
   }

   public static float id_class(float var0, double var1, double var3, double var5, double var7) {
      double var9 = var5 - var1;
      double var11 = var7 - var3;
      float var13 = (float)(Math.atan2(var11, var9) * 180.0 / Math.PI - 90.0);
      return var0 + rfU_2.id_catch(var13 - var0);
   }

   public static PX id_class(rfH_2 var0) {
      double var1 = (double)var0.b_() + 0.5 - ((cb_3)PP.b_.id_class[57]).rx();
      double var3 = (double)var0.c_() + 0.5 - ((cb_3)PP.b_.id_class[57]).rH();
      double var5 = (double)var0.d_() + 0.5 - ((cb_3)PP.b_.id_class[57]).BO();
      return id_class(var1, var3, var5);
   }

   public static PX id_class(rfH_2 var0, rfH_2 var1) {
      return id_class(new rjU_2(var0), new rjU_2(var1));
   }

   @Deprecated
   public static Optional<PX> id_class(an_3 var0, rfH_2 var1, double var2, boolean var4) {
      return id_class(var0, var1, Pu_1.id_class((rYB)var0.id_throws[7], var1), var2, var4);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, double var2) {
      return id_break(var0, var1, var2, id_protected[8]);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, boolean var2, Predicate<xc_3> var3) {
      return id_break(var0, var1, var0.id_native().id_case(), var2, var3);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, Predicate<xc_3> var2) {
      return id_class(var0, var1, id_protected[7], var2);
   }

   public static rjG_2 id_class(PX var0, rjU_2 var1, double var2, boolean var4) {
      rjU_2 var5 = ((cb_3)PP.b_.id_class[57]).id_class(var1, 1.0F);
      return id_class(var0, var2, var4, var5);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, double var2, boolean var4, Predicate<xc_3> var5) {
      return id_class(var0, var1, Pu_1.id_class(var0.id_case(), var1), var2, var4, var5);
   }

   private static rjG_2 id_class(PX var0, double var1, boolean var3, rjU_2 var4) {
      return id_class(var0, var1, var3, var4, null);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 27, 7, -10, -6, -72, 77, -17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static PX id_class(rrTj_1 var0) {
      if (var0 instanceof rrTR var1) {
         return var1 instanceof an_3 var2 ? id_class(var2) : id_class(var1.rr().id_private());
      } else {
         return ((cb_3)PP.b_.id_class[57]).id_goto();
      }
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, rjU_2 var2, double var3, boolean var5) {
      return id_class(var0, var1, var2, var3, var5, var0x -> true);
   }

   public static PX id_class(rrTA var0) {
      rjU_2 var1 = var0.rr();
      double var2 = var1.id_class() - ((cb_3)PP.b_.id_class[57]).rx();
      double var4 = var1.id_break() - ((cb_3)PP.b_.id_class[57]).rH();
      double var6 = var1.id_byte() - ((cb_3)PP.b_.id_class[57]).BO();
      return id_class(var2, var4, var6);
   }

   public static rjU_2 id_class(rjK_2 var0) {
      float var1 = rfU_2.id_break(-var0.id_byte * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var2 = rfU_2.id_class(-var0.id_byte * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = -rfU_2.id_break(-var0.id_protected * (float) (Math.PI / 180.0));
      float var4 = rfU_2.id_class(-var0.id_protected * (float) (Math.PI / 180.0));
      return new rjU_2((double)(var2 * var3), (double)var4, (double)(var1 * var3));
   }

   public static PX id_class(rjU_2 var0, rjU_2 var1) {
      double[] var10000 = new double[3];
      var10000[id_protected[0]] = var0.id_break - var1.id_break;
      var10000[1] = var0.id_byte - var1.id_byte;
      var10000[2] = var0.id_protected - var1.id_protected;
      double[] var2 = var10000;
      double var3 = rfU_2.id_protected(var2[id_protected[2]], -var2[2]);
      double var5 = Math.sqrt(var2[id_protected[3]] * var2[id_protected[4]] + var2[2] * var2[2]);
      double var7 = rfU_2.id_protected(var2[1], var5);
      return new PX((float)(var3 * (180.0 / Math.PI)), (float)(var7 * (180.0 / Math.PI)));
   }

   @Deprecated
   public static Optional<Px_1> id_class(cb_3 var0, rfH_2 var1, double var2) {
      return id_class(var0, var1, var2, id_protected[11]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1273695447;
   }

   public static rjU_2 id_class(PX var0) {
      float var1 = rfU_2.id_break(-var0.id_throws() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var2 = rfU_2.id_class(-var0.id_throws() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = -rfU_2.id_break(-var0.id_protected() * (float) (Math.PI / 180.0));
      float var4 = rfU_2.id_class(-var0.id_protected() * (float) (Math.PI / 180.0));
      return new rjU_2((double)(var2 * var3), (double)var4, (double)(var1 * var3));
   }

   @Deprecated
   public static Optional<PX> id_class(an_3 var0, rfH_2 var1, rjU_2 var2, double var3, boolean var5) {
      rjU_2 var6 = var5 ? Ph_1.id_class(var0) : var0.id_new(1.0F);
      PX var7 = id_class(var6, var2, new PX((Float)var0.id_throws[15], (Float)var0.id_throws[16]));
      rjG_2 var8 = Ph_1.id_class(var0, var7, var3, var5);
      if (var8 != null && var8.id_byte() == rjM_2.BLOCK) {
         if (((rff_3)var8).id_class().equals(var1)) {
            return Optional.of(var7);
         }

         if (((rYB)var0.id_throws[7]).id_byte(var1).id_break() instanceof Jj_1 && ((rff_3)var8).id_class().equals(var1.id_break())) {
            return Optional.of(var7);
         }
      }

      return Optional.empty();
   }

   public static PX id_class(rjU_2 var0) {
      double var1 = var0.id_class() - ((cb_3)PP.b_.id_class[57]).rx();
      double var3 = var0.id_break() - ((cb_3)PP.b_.id_class[57]).rH();
      double var5 = var0.id_byte() - ((cb_3)PP.b_.id_class[57]).BO();
      return id_class(var1, var3, var5);
   }

   public static PX id_class(an_3 var0) {
      double var1 = var0.rx() - ((cb_3)PP.b_.id_class[57]).rx();
      double var3 = var0.re() + (double)(var0.Bx() / 2.0F) - ((cb_3)PP.b_.id_class[57]).rH();
      double var5 = var0.BO() - ((cb_3)PP.b_.id_class[57]).BO();
      return id_class(var1, var3, var5);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, boolean var2) {
      return id_break(var0, var1, var0.id_native().id_case(), var2);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new PX(-40.048595F, 18.149609F), Math.PI / 180.0, 180.0 / Math.PI, null};
      rjU_2[] var2 = new rjU_2[]{
         new rjU_2(0.5, 0.0, 0.5),
         new rjU_2(0.5, 1.0, 0.5),
         new rjU_2(0.5, 0.5, 0.0),
         new rjU_2(0.5, 0.5, 1.0),
         new rjU_2(0.0, 0.5, 0.5),
         new rjU_2(1.0, 0.5, 0.5)
      };
      var0[3] = var2;
      id_class = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3598733349883537890L;
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1) {
      return id_class(var0, var1, id_protected[6]);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, double var2, boolean var4) {
      return id_class(var0, var1, Pu_1.id_class(var0.id_case(), var1), var2, var4);
   }

   public static boolean id_class(rhd_3 var0, rhd_3 var1) {
      return var0.m().id_break(var1.m()) >= id_throws[6] ? true : id_protected[13];
   }

   public static rjG_2 id_class(PX var0, double var1, boolean var3) {
      return id_class(var0, var1, var3, null);
   }

   public static double id_class(an_3 var0, double var1, double var3) {
      double var5 = id_throws[39];
      double var7 = var1 - var0.rx();
      double var9 = var3 - var0.BO();
      if (var9 > id_throws[40] && var7 > id_throws[41]) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 > id_throws[42] && var7 < id_throws[43]) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 < id_throws[44] && var7 > id_throws[45]) {
         var5 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
      } else if (var9 < id_throws[47] && var7 < id_throws[48]) {
         var5 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
      }

      double var11 = Math.abs(var5 - (double)((Float)var0.id_throws[15]).floatValue()) % 360.0;
      return var11 > 180.0 ? 360.0 - var11 : var11;
   }

   public static PX id_class(float var0) {
      return new PX(-rfU_2.id_class(var0 * rfU_2.id_throws), rfU_2.id_break(var0 * rfU_2.id_throws));
   }

   public static double id_class(double var0) {
      var0 %= 360.0;
      if (var0 >= 180.0) {
         var0 -= 360.0;
      }

      if (var0 < -180.0) {
         var0 += 360.0;
      }

      return var0;
   }

   public static PX id_class(double var0, double var2, double var4) {
      float var6 = (float)(rfU_2.id_protected(var4, var0) * (180.0 / Math.PI) - 90.0);
      float var7 = (float)(-(rfU_2.id_protected(var2, (double)rfU_2.id_class(var0 * var0 + var4 * var4)) * (180.0 / Math.PI)));
      float var8 = rfU_2.id_catch(var6);
      return new PX(var8, var7);
   }

   public static PX id_class(rjU_2 var0, rjU_2 var1, PX var2) {
      return id_break(var2, id_class(var0, var1));
   }

   public static double id_class(float var0, float var1) {
      return (double)Math.abs(var0 - var1);
   }

   public static rjG_2 id_class(PX var0, double var1, boolean var3, Predicate<xc_3> var4) {
      rjU_2 var5 = ((cb_3)PP.b_.id_class[57]).id_new(1.0F);
      return id_class(var0, var1, var3, var5, var4);
   }

   public static int id_class(an_3 var0, double var1, double var3, double var5) {
      double var7 = var1 - var0.rx();
      double var9 = var3 - 0.7 - var0.re();
      double var11 = var5 - var0.BO();
      double var13 = Math.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return (int)Math.abs((double)var15 - (double)((Float)var0.id_throws[16]).floatValue());
   }

   private static rjG_2 id_class(PX var0, double var1, boolean var3, rjU_2 var4, Predicate<xc_3> var5) {
      rjU_2 var6 = id_class(var0);
      rjU_2 var7 = var4.id_break(var6.id_break * var1, var6.id_byte * var1, var6.id_protected * var1);
      rjB_2 var8 = new rjB_2(var4, var7, rjS_2.OUTLINE, var3 ? rjs_3.ANY : rjs_3.NONE, (cb_3)PP.b_.id_class[57]);
      var8.id_class(var5);
      return ((gm_3)PP.b_.id_class[56]).id_class(var8);
   }

   public static double id_class(PX var0, PX var1) {
      double var2 = (double)Math.abs(var0.id_throws() - var1.id_throws());
      double var4 = (double)Math.abs(var0.id_protected() - var1.id_protected());
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public static Optional<Px_1> id_class(Ps_1 var0, rfH_2 var1, rjU_2 var2, double var3, boolean var5, Predicate<xc_3> var6) {
      rjU_2 var7 = var5 ? Ph_1.id_class(var0.id_catch()) : var0.id_catch().id_new(1.0F);
      PX var8 = id_class(var7, var2, var0.id_protected());
      PX var9 = C_throws.id_class().id_class(var0.id_catch()).id_catch().id_class().id_class(var8);
      rjG_2 var10 = Ph_1.id_class(var0.id_catch(), var9, var3, var5, var6);
      if (var10 != null && var10.id_byte() == rjM_2.BLOCK) {
         if (((rff_3)var10).id_class().equals(var1)) {
            return Optional.of(new Px_1(var8, var10));
         }

         if (var0.id_case().id_byte(var1).id_break() instanceof Jj_1 && ((rff_3)var10).id_class().equals(var1.id_break())) {
            return Optional.of(new Px_1(var8, var10));
         }
      }

      return Optional.empty();
   }

   @Deprecated
   public static Optional<Px_1> id_class(cb_3 var0, rfH_2 var1, double var2, boolean var4) {
      C_case var5 = C_throws.id_class().id_class(var0);
      Ps_1 var6 = var5.id_throw();
      return id_break(var6, var1, var2, var4);
   }

   public static double id_break(float var0, float var1) {
      double var2 = (double)Math.abs(var0 - var1);
      return Math.min(var2, 360.0 - var2);
   }

   public static boolean id_break(an_3 var0, double var1, double var3, double var5) {
      double var7 = var1 - var0.rx();
      double var9 = var3 - 0.7 - var0.re();
      double var11 = var5 - var0.BO();
      double var13 = Math.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return (float)id_class((double)((Float)var0.id_throws[16] - var15)) < id_byte[19] ? true : id_protected[15];
   }

   public static PX id_break(PX var0, PX var1) {
      return var0.id_break(var1) ? new PX(var0.id_throws(), var1.id_protected()) : var1.id_byte(var0).id_break().id_protected(var0);
   }

   public static float id_break(an_3 var0) {
      return id_class((Float)((cb_3)PP.b_.id_class[57]).id_throws[15], ((cb_3)PP.b_.id_class[57]).rx(), ((cb_3)PP.b_.id_class[57]).BO(), var0.rx(), var0.BO());
   }

   public static Optional<Px_1> id_break(Ps_1 var0, rfH_2 var1, double var2, boolean var4) {
      return id_break(var0, var1, var2, var4, var0x -> true);
   }

   public static boolean id_break(an_3 var0, double var1, double var3) {
      double var5 = id_throws[53];
      double var7 = var1 - var0.rx();
      double var9 = var3 - var0.BO();
      if (var9 > id_throws[54] && var7 > id_throws[55]) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 > id_throws[56] && var7 < id_throws[57]) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 < id_throws[58] && var7 > id_throws[59]) {
         var5 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
      } else if (var9 < id_throws[61] && var7 < id_throws[62]) {
         var5 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
      }

      int var11 = (int)id_class((var5 - (double)((Float)var0.id_throws[15]).floatValue()) % 360.0);
      return var11 < 0 ? true : id_protected[17];
   }

   private static void id_break() {
      id_break = new short[]{
         57, 57, 57, 56, 0, 3, 15, 16, 7, 7, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 15, 57, 57, 15, 180, 360, 16, 16, 15, 15
      };
   }

   public static Optional<Px_1> id_break(Ps_1 var0, rfH_2 var1, double var2, boolean var4, Predicate<xc_3> var5) {
      if ((Boolean)C_class.id_instanceof().N.id_class[id_break[4]] && var0.id_class(var1)) {
         PX var6 = var0.id_protected().id_protected(new PX(id_byte[14], 1.0E-4F));
         rjG_2 var7 = Ph_1.id_class(var0.id_catch(), var6, var2, true, var5);
         if (!var4) {
            return Optional.of(new Px_1(var6, var7));
         }

         if (var7 != null && var7.id_byte() == rjM_2.BLOCK && ((rff_3)var7).id_class().equals(var1)) {
            return Optional.of(new Px_1(var6, var7));
         }
      }

      Optional var19 = id_class(var0, var1, var2, var4, var5);
      if (var19.isPresent()) {
         return var19;
      } else {
         xc_3 var21 = var0.id_case().id_byte(var1);
         rjC_2 var8 = var21.id_finally(var0.id_case(), var1);
         if (var8.id_break()) {
            var8 = rjw_3.id_break();
         }

         rjU_2[] var9 = (rjU_2[])id_class[3];
         int var10 = var9.length;

         for (int var11 = id_protected[10]; var11 < var10; var11++) {
            rjU_2 var12 = var9[var11];
            double var13 = var8.id_break(rpB_2.X) * var12.id_break + var8.id_byte(rpB_2.X) * (1.0 - var12.id_break);
            double var15 = var8.id_break(rpB_2.Y) * var12.id_byte + var8.id_byte(rpB_2.Y) * (1.0 - var12.id_byte);
            double var17 = var8.id_break(rpB_2.Z) * var12.id_protected + var8.id_byte(rpB_2.Z) * (1.0 - var12.id_protected);
            var19 = id_class(var0, var1, new rjU_2((double)var1.b_(), (double)var1.c_(), (double)var1.d_()).id_break(var13, var15, var17), var2, var4, var5);
            if (var19.isPresent()) {
               return var19;
            }
         }

         return Optional.empty();
      }
   }

   private static void id_throws() {
      id_case = new byte[]{3, 2, 2, 2, 2, 6, 2, 3, 4, 5, 3, 4, 2};
   }

   private static void id_case() {
      id_protected = new boolean[]{
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true
      };
   }

   private static void id_protected() {
      id_throws = new double[]{
         180.0 / Math.PI,
         180.0 / Math.PI,
         360.0,
         1.0,
         1.0,
         1.0,
         0.0,
         0.5,
         0.5,
         0.5,
         180.0 / Math.PI,
         90.0,
         180.0 / Math.PI,
         180.0,
         Math.PI,
         90.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         -90.0,
         0.0,
         0.0,
         90.0,
         360.0,
         0.7,
         180.0,
         Math.PI,
         0.7,
         180.0,
         Math.PI,
         360.0,
         180.0,
         360.0,
         -180.0,
         360.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         -90.0,
         0.0,
         0.0,
         90.0,
         360.0,
         180.0,
         360.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         -90.0,
         0.0,
         0.0,
         90.0,
         360.0,
         0.5,
         0.0,
         0.5,
         0.5,
         1.0,
         0.5,
         0.5,
         0.5,
         0.0,
         0.5,
         0.5,
         1.0,
         0.0,
         0.5,
         0.5,
         1.0,
         0.5,
         0.5,
         Math.PI / 180.0,
         180.0 / Math.PI
      };
   }
}
