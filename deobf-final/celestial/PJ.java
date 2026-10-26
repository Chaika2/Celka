package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PJ {
   private static short[] break_;
   private static float[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static double[] throws_;
   private static byte[] case_;

   public static int byte_(an_3 var0, double var1, double var3) {
      double var5 = 0.0;
      double var7 = var1 - var0.rx();
      double var9 = var3 - var0.BO();
      if (var9 > 0.0 && var7 > 0.0) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 > 0.0 && var7 < 0.0) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 < 0.0 && var7 > 0.0) {
         var5 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
      } else if (var9 < 0.0 && var7 < 0.0) {
         var5 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
      }

      int var11 = (int)(Math.abs(var5 - (double)((Float)var0.throws_[15]).floatValue()) % 360.0);
      return var11 > 180 ? 360 - var11 : var11;
   }

   private static void byte_() {
      byte_ = new float[]{
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

   public static float class_(float var0, double var1, double var3, double var5, double var7) {
      double var9 = var5 - var1;
      double var11 = var7 - var3;
      float var13 = (float)(Math.atan2(var11, var9) * 180.0 / Math.PI - 90.0);
      return var0 + rfU_2.catch_(var13 - var0);
   }

   public static PX class_(rfH_2 var0) {
      double var1 = (double)var0.b_() + 0.5 - ((cb_3)PP.b_.class_[57]).rx();
      double var3 = (double)var0.c_() + 0.5 - ((cb_3)PP.b_.class_[57]).rH();
      double var5 = (double)var0.d_() + 0.5 - ((cb_3)PP.b_.class_[57]).BO();
      return class_(var1, var3, var5);
   }

   public static PX class_(rfH_2 var0, rfH_2 var1) {
      return class_(new rjU_2(var0), new rjU_2(var1));
   }

   @Deprecated
   public static Optional<PX> class_(an_3 var0, rfH_2 var1, double var2, boolean var4) {
      return class_(var0, var1, Pu_1.class_((rYB)var0.throws_[7], var1), var2, var4);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, double var2) {
      return break_(var0, var1, var2, false);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, boolean var2, Predicate<xc_3> var3) {
      return break_(var0, var1, var0.native_().case_(), var2, var3);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, Predicate<xc_3> var2) {
      return class_(var0, var1, false, var2);
   }

   public static rjG_2 class_(PX var0, rjU_2 var1, double var2, boolean var4) {
      rjU_2 var5 = ((cb_3)PP.b_.class_[57]).class_(var1, 1.0F);
      return class_(var0, var2, var4, var5);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, double var2, boolean var4, Predicate<xc_3> var5) {
      return class_(var0, var1, Pu_1.class_(var0.case_(), var1), var2, var4, var5);
   }

   private static rjG_2 class_(PX var0, double var1, boolean var3, rjU_2 var4) {
      return class_(var0, var1, var3, var4, null);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 27, 7, -10, -6, -72, 77, -17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static PX class_(rrTj_1 var0) {
      if (var0 instanceof rrTR var1) {
         return var1 instanceof an_3 var2 ? class_(var2) : class_(var1.rr().private_());
      } else {
         return ((cb_3)PP.b_.class_[57]).goto_();
      }
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, rjU_2 var2, double var3, boolean var5) {
      return class_(var0, var1, var2, var3, var5, var0x -> true);
   }

   public static PX class_(rrTA var0) {
      rjU_2 var1 = var0.rr();
      double var2 = var1.class_() - ((cb_3)PP.b_.class_[57]).rx();
      double var4 = var1.break_() - ((cb_3)PP.b_.class_[57]).rH();
      double var6 = var1.byte_() - ((cb_3)PP.b_.class_[57]).BO();
      return class_(var2, var4, var6);
   }

   public static rjU_2 class_(rjK_2 var0) {
      float var1 = rfU_2.break_(-var0.byte_ * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var2 = rfU_2.class_(-var0.byte_ * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = -rfU_2.break_(-var0.protected_ * (float) (Math.PI / 180.0));
      float var4 = rfU_2.class_(-var0.protected_ * (float) (Math.PI / 180.0));
      return new rjU_2((double)(var2 * var3), (double)var4, (double)(var1 * var3));
   }

   public static PX class_(rjU_2 var0, rjU_2 var1) {
      double[] var2 = new double[]{var0.break_ - var1.break_, var0.byte_ - var1.byte_, var0.protected_ - var1.protected_};
      double var3 = rfU_2.protected_(var2[0], -var2[2]);
      double var5 = Math.sqrt(var2[0] * var2[0] + var2[2] * var2[2]);
      double var7 = rfU_2.protected_(var2[1], var5);
      return new PX((float)(var3 * (180.0 / Math.PI)), (float)(var7 * (180.0 / Math.PI)));
   }

   @Deprecated
   public static Optional<Px_1> class_(cb_3 var0, rfH_2 var1, double var2) {
      return class_(var0, var1, var2, false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1273695447;
   }

   public static rjU_2 class_(PX var0) {
      float var1 = rfU_2.break_(-var0.throws_() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var2 = rfU_2.class_(-var0.throws_() * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = -rfU_2.break_(-var0.protected_() * (float) (Math.PI / 180.0));
      float var4 = rfU_2.class_(-var0.protected_() * (float) (Math.PI / 180.0));
      return new rjU_2((double)(var2 * var3), (double)var4, (double)(var1 * var3));
   }

   @Deprecated
   public static Optional<PX> class_(an_3 var0, rfH_2 var1, rjU_2 var2, double var3, boolean var5) {
      rjU_2 var6 = var5 ? Ph_1.class_(var0) : var0.new_(1.0F);
      PX var7 = class_(var6, var2, new PX((Float)var0.throws_[15], (Float)var0.throws_[16]));
      rjG_2 var8 = Ph_1.class_(var0, var7, var3, var5);
      if (var8 != null && var8.byte_() == rjM_2.BLOCK) {
         if (((rff_3)var8).class_().equals(var1)) {
            return Optional.of(var7);
         }

         if (((rYB)var0.throws_[7]).byte_(var1).break_() instanceof Jj_1 && ((rff_3)var8).class_().equals(var1.break_())) {
            return Optional.of(var7);
         }
      }

      return Optional.empty();
   }

   public static PX class_(rjU_2 var0) {
      double var1 = var0.class_() - ((cb_3)PP.b_.class_[57]).rx();
      double var3 = var0.break_() - ((cb_3)PP.b_.class_[57]).rH();
      double var5 = var0.byte_() - ((cb_3)PP.b_.class_[57]).BO();
      return class_(var1, var3, var5);
   }

   public static PX class_(an_3 var0) {
      double var1 = var0.rx() - ((cb_3)PP.b_.class_[57]).rx();
      double var3 = var0.re() + (double)(var0.Bx() / 2.0F) - ((cb_3)PP.b_.class_[57]).rH();
      double var5 = var0.BO() - ((cb_3)PP.b_.class_[57]).BO();
      return class_(var1, var3, var5);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, boolean var2) {
      return break_(var0, var1, var0.native_().case_(), var2);
   }

   private static void class_() {
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
      class_ = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3598733349883537890L;
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1) {
      return class_(var0, var1, false);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, double var2, boolean var4) {
      return class_(var0, var1, Pu_1.class_(var0.case_(), var1), var2, var4);
   }

   public static boolean class_(rhd_3 var0, rhd_3 var1) {
      return var0.m().break_(var1.m()) >= 0.0 ? true : protected_[13];
   }

   public static rjG_2 class_(PX var0, double var1, boolean var3) {
      return class_(var0, var1, var3, null);
   }

   public static double class_(an_3 var0, double var1, double var3) {
      double var5 = 0.0;
      double var7 = var1 - var0.rx();
      double var9 = var3 - var0.BO();
      if (var9 > 0.0 && var7 > 0.0) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 > 0.0 && var7 < 0.0) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 < 0.0 && var7 > 0.0) {
         var5 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
      } else if (var9 < 0.0 && var7 < 0.0) {
         var5 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
      }

      double var11 = Math.abs(var5 - (double)((Float)var0.throws_[15]).floatValue()) % 360.0;
      return var11 > 180.0 ? 360.0 - var11 : var11;
   }

   public static PX class_(float var0) {
      return new PX(-rfU_2.class_(var0 * rfU_2.throws_), rfU_2.break_(var0 * rfU_2.throws_));
   }

   public static double class_(double var0) {
      var0 %= 360.0;
      if (var0 >= 180.0) {
         var0 -= 360.0;
      }

      if (var0 < -180.0) {
         var0 += 360.0;
      }

      return var0;
   }

   public static PX class_(double var0, double var2, double var4) {
      float var6 = (float)(rfU_2.protected_(var4, var0) * (180.0 / Math.PI) - 90.0);
      float var7 = (float)(-(rfU_2.protected_(var2, (double)rfU_2.class_(var0 * var0 + var4 * var4)) * (180.0 / Math.PI)));
      float var8 = rfU_2.catch_(var6);
      return new PX(var8, var7);
   }

   public static PX class_(rjU_2 var0, rjU_2 var1, PX var2) {
      return break_(var2, class_(var0, var1));
   }

   public static double class_(float var0, float var1) {
      return (double)Math.abs(var0 - var1);
   }

   public static rjG_2 class_(PX var0, double var1, boolean var3, Predicate<xc_3> var4) {
      rjU_2 var5 = ((cb_3)PP.b_.class_[57]).new_(1.0F);
      return class_(var0, var1, var3, var5, var4);
   }

   public static int class_(an_3 var0, double var1, double var3, double var5) {
      double var7 = var1 - var0.rx();
      double var9 = var3 - 0.7 - var0.re();
      double var11 = var5 - var0.BO();
      double var13 = Math.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return (int)Math.abs((double)var15 - (double)((Float)var0.throws_[16]).floatValue());
   }

   private static rjG_2 class_(PX var0, double var1, boolean var3, rjU_2 var4, Predicate<xc_3> var5) {
      rjU_2 var6 = class_(var0);
      rjU_2 var7 = var4.break_(var6.break_ * var1, var6.byte_ * var1, var6.protected_ * var1);
      rjB_2 var8 = new rjB_2(var4, var7, rjS_2.OUTLINE, var3 ? rjs_3.ANY : rjs_3.NONE, (cb_3)PP.b_.class_[57]);
      var8.class_(var5);
      return ((gm_3)PP.b_.class_[56]).class_(var8);
   }

   public static double class_(PX var0, PX var1) {
      double var2 = (double)Math.abs(var0.throws_() - var1.throws_());
      double var4 = (double)Math.abs(var0.protected_() - var1.protected_());
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public static Optional<Px_1> class_(Ps_1 var0, rfH_2 var1, rjU_2 var2, double var3, boolean var5, Predicate<xc_3> var6) {
      rjU_2 var7 = var5 ? Ph_1.class_(var0.catch_()) : var0.catch_().new_(1.0F);
      PX var8 = class_(var7, var2, var0.protected_());
      PX var9 = C_throws.class_().class_(var0.catch_()).catch_().class_().class_(var8);
      rjG_2 var10 = Ph_1.class_(var0.catch_(), var9, var3, var5, var6);
      if (var10 != null && var10.byte_() == rjM_2.BLOCK) {
         if (((rff_3)var10).class_().equals(var1)) {
            return Optional.of(new Px_1(var8, var10));
         }

         if (var0.case_().byte_(var1).break_() instanceof Jj_1 && ((rff_3)var10).class_().equals(var1.break_())) {
            return Optional.of(new Px_1(var8, var10));
         }
      }

      return Optional.empty();
   }

   @Deprecated
   public static Optional<Px_1> class_(cb_3 var0, rfH_2 var1, double var2, boolean var4) {
      C_case var5 = C_throws.class_().class_(var0);
      Ps_1 var6 = var5.throw_();
      return break_(var6, var1, var2, var4);
   }

   public static double break_(float var0, float var1) {
      double var2 = (double)Math.abs(var0 - var1);
      return Math.min(var2, 360.0 - var2);
   }

   public static boolean break_(an_3 var0, double var1, double var3, double var5) {
      double var7 = var1 - var0.rx();
      double var9 = var3 - 0.7 - var0.re();
      double var11 = var5 - var0.BO();
      double var13 = Math.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return (float)class_((double)((Float)var0.throws_[16] - var15)) < 0.0F ? true : protected_[15];
   }

   public static PX break_(PX var0, PX var1) {
      return var0.break_(var1) ? new PX(var0.throws_(), var1.protected_()) : var1.byte_(var0).break_().protected_(var0);
   }

   public static float break_(an_3 var0) {
      return class_((Float)((cb_3)PP.b_.class_[57]).throws_[15], ((cb_3)PP.b_.class_[57]).rx(), ((cb_3)PP.b_.class_[57]).BO(), var0.rx(), var0.BO());
   }

   public static Optional<Px_1> break_(Ps_1 var0, rfH_2 var1, double var2, boolean var4) {
      return break_(var0, var1, var2, var4, var0x -> true);
   }

   public static boolean break_(an_3 var0, double var1, double var3) {
      double var5 = 0.0;
      double var7 = var1 - var0.rx();
      double var9 = var3 - var0.BO();
      if (var9 > 0.0 && var7 > 0.0) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 > 0.0 && var7 < 0.0) {
         var5 = Math.toDegrees(-Math.atan(var7 / var9));
      } else if (var9 < 0.0 && var7 > 0.0) {
         var5 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
      } else if (var9 < 0.0 && var7 < 0.0) {
         var5 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
      }

      int var11 = (int)class_((var5 - (double)((Float)var0.throws_[15]).floatValue()) % 360.0);
      return var11 < 0 ? true : protected_[17];
   }

   private static void break_() {
      break_ = new short[]{
         57, 57, 57, 56, 0, 3, 15, 16, 7, 7, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 15, 57, 57, 15, 180, 360, 16, 16, 15, 15
      };
   }

   public static Optional<Px_1> break_(Ps_1 var0, rfH_2 var1, double var2, boolean var4, Predicate<xc_3> var5) {
      if ((Boolean)C_class.instanceof_().N.class_[0] && var0.class_(var1)) {
         PX var6 = var0.protected_().protected_(new PX(0.0F, 1.0E-4F));
         rjG_2 var7 = Ph_1.class_(var0.catch_(), var6, var2, true, var5);
         if (!var4) {
            return Optional.of(new Px_1(var6, var7));
         }

         if (var7 != null && var7.byte_() == rjM_2.BLOCK && ((rff_3)var7).class_().equals(var1)) {
            return Optional.of(new Px_1(var6, var7));
         }
      }

      Optional var19 = class_(var0, var1, var2, var4, var5);
      if (var19.isPresent()) {
         return var19;
      } else {
         xc_3 var21 = var0.case_().byte_(var1);
         rjC_2 var8 = var21.finally_(var0.case_(), var1);
         if (var8.break_()) {
            var8 = rjw_3.break_();
         }

         for (rjU_2 var12 : (rjU_2[])class_[3]) {
            double var13 = var8.break_(rpB_2.X) * var12.break_ + var8.byte_(rpB_2.X) * (1.0 - var12.break_);
            double var15 = var8.break_(rpB_2.Y) * var12.byte_ + var8.byte_(rpB_2.Y) * (1.0 - var12.byte_);
            double var17 = var8.break_(rpB_2.Z) * var12.protected_ + var8.byte_(rpB_2.Z) * (1.0 - var12.protected_);
            var19 = class_(var0, var1, new rjU_2((double)var1.b_(), (double)var1.c_(), (double)var1.d_()).break_(var13, var15, var17), var2, var4, var5);
            if (var19.isPresent()) {
               return var19;
            }
         }

         return Optional.empty();
      }
   }

   private static void throws_() {
      case_ = new byte[]{3, 2, 2, 2, 2, 6, 2, 3, 4, 5, 3, 4, 2};
   }

   private static void case_() {
      protected_ = new boolean[]{
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

   private static void protected_() {
      throws_ = new double[]{
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
