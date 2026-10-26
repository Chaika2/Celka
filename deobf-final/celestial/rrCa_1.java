package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCa_1 extends rrTF<NoSlow> {
   private static short[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   private static boolean[] case_;
   public Object[] class_;

   private static void byte_() {
      case_ = new boolean[]{
         true, true, true, true, false, false, true, true, false, true, true, true, false, false, false, false, false, false, true, false, false, false
      };
   }

   public rrCa_1(NoSlow var1) {
      super(var1);
      this.break_();
      Integer var6 = -1;
      this.class_[2] = var6;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{83, 109, -35, 11, -83, 49, -108, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1147295434;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.break_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Boolean)this.class_[0]) {
            int var10002 = (Integer)this.class_[1] + 1;
            Integer var6 = var10002;
            this.class_[1] = var6;
            if (var10002 > 3) {
               Integer var7 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
               this.class_[2] = var7;
               rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ % 8 + 1);
               Integer var8 = 0;
               this.class_[1] = var8;
               Boolean var9 = false;
               this.class_[0] = var9;
            }
         }

         if ((Integer)this.class_[2] != -1) {
            int var13 = (Integer)this.class_[3] + 1;
            Integer var10 = var13;
            this.class_[3] = var10;
            if (var13 > 1) {
               rrfo_3.class_((Integer)this.class_[2]);
               Integer var11 = -1;
               this.class_[2] = var11;
               Integer var12 = 0;
               this.class_[3] = var12;
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAA var1) {
      this.break_();
      if (var1.protected_() == rpm_3.OFF_HAND && var1.class_().class_().byte_()) {
         Boolean var6 = true;
         this.class_[0] = var6;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4727133288293698414L;
   }

   private boolean class_() {
      if (((cb_3)import_.class_[57]).P() == rpm_3.OFF_HAND && ((cb_3)import_.class_[57]).Sw() < 2) {
         return true;
      } else {
         return ((cb_3)import_.class_[57]).P() == rpm_3.MAIN_HAND && !((cb_3)import_.class_[57]).PZ() ? true : case_[12];
      }
   }

   @EventTarget
   public void class_(rrAB var1) {
      if (((cb_3)import_.class_[57]).P() != rpm_3.MAIN_HAND || !((cb_3)import_.class_[57]).PZ()) {
         if (this.class_()) {
            this.break_(var1);
         } else {
            var1.class_(true);
         }
      }
   }

   @EventTarget
   public void class_(rrAl_1 var1) {
      this.break_();
      if (var1.class_() < 10.0F && ((cb_3)import_.class_[57]).return_() && ((cb_3)import_.class_[57]).P() == rpm_3.OFF_HAND) {
         Boolean var6 = true;
         this.class_[0] = var6;
      }
   }

   private float class_(float var1) {
      return ((cb_3)import_.class_[57]).Sw() < 2 ? 0.2F : var1;
   }

   private void break_(rrAB var1) {
      if (((cb_3)import_.class_[57]).Se() >= 2 && ((cb_3)import_.class_[57]).BL()) {
         float var2 = ((cb_3)import_.class_[57]).private_[42] == 0.0F ? 0.538F : byte_[4];
         var1.break_(this.class_(var2));
      } else {
         var1.break_(0.205F);
      }
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[0] = false;
         this.class_[1] = 0;
         this.class_[2] = 0;
         this.class_[3] = 0;
      }
   }

   private static void throws_() {
      protected_ = new byte[]{-1, 3, 8, -1, -1, 2, 2, 2, -1, 4, 2, 3};
   }

   private static void case_() {
      byte_ = new float[]{10.0F, 0.205F, 0.0F, 0.538F, 0.38F, 0.2F};
   }

   private static void protected_() {
      break_ = new short[]{2, 0, 57, 57, 0, 0, 0, 1, 1, 57, 1, 2, 57, 1, 1, 0, 2, 3, 3, 2, 2, 3, 57, 57, 57, 57, 57, 42, 57, 57, 57, 57, 57, 0, 1, 3, 2};
   }

   @Override
   public boolean aK_() {
      this.break_();
      Boolean var5 = false;
      this.class_[0] = var5;
      Integer var6 = 0;
      this.class_[1] = var6;
      Integer var7 = 0;
      this.class_[3] = var7;
      Integer var8 = -1;
      this.class_[2] = var8;
      return super.aK_();
   }
}
