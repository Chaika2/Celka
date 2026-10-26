package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bV_2 extends Pv_1 implements PS {
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   public Object[] break_;

   private boolean byte_() {
      for (Pm_1 var4 : new Pm_1[]{
         (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0],
         (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1],
         (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[2],
         (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[3],
         (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7]
      }) {
         if (this.class_(var4)) {
            return true;
         }
      }

      return !((C_class)this.class_[0]).while_().catch_() && (C_class)this.class_[0] == C_throws.class_().break_() ? byte_[8] : byte_[7];
   }

   public bV_2(C_class var1) {
      super(var1);
      this.throws_();
      HashMap var6 = new HashMap();
      this.break_[0] = var6;
      bT_2 var7 = new bT_2(var1.throw_());
      this.break_[1] = var7;
      bt_3 var8 = new bt_3(var1.throw_());
      this.break_[2] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_() {
      this.throws_();
      ((Map)this.break_[0]).clear();
   }

   @Override
   public boolean class_(Pm_1 var1) {
      this.throws_();
      return var1 == null ? false : ((Map)this.break_[0]).getOrDefault(var1, false);
   }

   @Override
   public void class_(Pm_1 var1, boolean var2) {
      this.throws_();
      ((Map)this.break_[0]).put(var1, var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5998623668820980303L;
   }

   @Override
   public void class_(j_1 var1) {
      this.throws_();
      if (var1.class_() != (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[1]) {
         if (this.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4])) {
            this.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], false);
         }

         ((bT_2)this.break_[1]).class_(this.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4]));
         ((bt_3)this.break_[2]).class_(this.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5]));
         if (this.byte_()) {
            if (((rqr_3)((Ps_1)this.class_[1]).catch_().break_[17]).getClass() != bD_2.class) {
               cb_3 var10000 = ((Ps_1)this.class_[1]).catch_();
               bD_2 var6 = new bD_2(this);
               var10000.break_[17] = var6;
            }
         } else if (((rqr_3)((Ps_1)this.class_[1]).catch_().break_[17]).getClass() == bD_2.class) {
            cb_3 var8 = ((Ps_1)this.class_[1]).catch_();
            rqP_2 var7 = new rqP_2((Qw_1)QY.instanceof_().class_[20]);
            var8.break_[17] = var7;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1638104439;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -64, 47, -29, -78, 112, 87, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public bT_2 break_() {
      this.throws_();
      return (bT_2)this.break_[1];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      byte_ = new boolean[]{false, false, false, false, true, false, true, true, false};
   }

   private static void case_() {
      throws_ = new short[]{0, 1, 2, 0, 0, 0, 1, 4, 5, 1, 4, 2, 5, 1, 17, 1, 17, 1, 17, 1, 20, 17, 0, 1, 2, 3, 7, 0, 0, 1};
   }

   private static void protected_() {
      protected_ = new byte[]{5, 2, 3, 4, 3};
   }
}
