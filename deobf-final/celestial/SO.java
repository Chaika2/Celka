package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SO extends Pv_1 {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] break_;

   private static void byte_() {
      byte_ = new boolean[]{true};
   }

   private void byte_(String var1) {
      this.class_();
      Bt_1 var2 = ((Bw_1)this.break_[0]).class_(var1);
      if (var2 != null && var2.case_()) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(Bp_1.class_((Bq_1)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[0], var2, (BT)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[1]));
      }
   }

   public SO(C_class var1) {
      super(var1);
      this.class_();
      SX var6 = new SX();
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rFv_1 var2) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
            return;
         }

         rgP_2 var5 = var2.protected_();
         if (var5 == null) {
            return;
         }

         String var4 = var5.byte_();
         switch (((int[])Sh_1.class_[0])[var2.byte_().ordinal()]) {
            case 1:
               this.protected_(var4);
               break;
            case 2:
               this.byte_(var4);
         }
      }
   }

   @Override
   public void class_(rrLO var1) {
      if (var1.class_() == null && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         this.protected_(var1.protected_());
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1149623424;
   }

   private void class_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7932361412794669418L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -62, -83, -92, -45, -74, -110, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new short[]{0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
   }

   private void protected_(String var1) {
      this.class_();
      Bt_1 var2 = ((Bw_1)this.break_[0]).class_(var1);
      if (var2 != null) {
         rja_3 var3 = null;
         if (var2 instanceof Bn_1 var4) {
            try {
               var3 = var4.break_(var1);
            } catch (Exception var6) {
               var6.printStackTrace();
               return;
            }

            if (var3 == null) {
               return;
            }

            var4.class_(var3);
         }

         var2.throws_(var1);
         if (var3 != null) {
            boolean var7 = ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(var3);
            var2.protected_(((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(var2.throws_(), var7));
            if (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).protected_(var2.throws_()) && var7) {
               return;
            }
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(Bp_1.class_((Bq_1)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[0], var2, (BT)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[0]));
      }
   }
}
