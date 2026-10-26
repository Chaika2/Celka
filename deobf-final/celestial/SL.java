package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SL extends Pv_1 {
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] break_;
   private static float[] throws_;
   private static boolean[] case_;

   public cd_3 byte_() {
      this.package_();
      return (cd_3)this.break_[2];
   }

   private void int_() {
      this.package_();
      if ((UUID)this.break_[3] != null) {
         ((cq_3)((Ps_1)this.class_[1]).throws_().class_[19]).extends_().catch_().remove((UUID)this.break_[3]);
         Object var5 = null;
         this.break_[3] = var5;
         Object var6 = null;
         this.break_[2] = var6;
      }
   }

   public SL(C_class var1) {
      super(var1);
      this.package_();
      SA var6 = new SA(this);
      this.break_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new float[]{20.0F, 1.0F, 0.0F, 1.0F};
   }

   @Override
   public void class_(rrAl_1 var1) {
      this.finally_().ifPresent(var1x -> var1x.class_(var1));
   }

   @Override
   public void class_(q_1 var1) {
      this.finally_().ifPresent(var2 -> {
         this.package_();
         if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.break_[5]) {
            Integer var7 = (Integer)this.break_[4] + 1;
            this.break_[4] = var7;
            this.final_();
         }

         var2.class_(var1);
      });
   }

   public void class_(SC var1) {
      this.package_();
      this.break_[0] = var1;
      this.finally_().ifPresent(var1x -> var1x.class_(var1));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 470673797;
   }

   @Override
   public void class_(rrAM var1) {
      this.finally_().ifPresent(var1x -> var1x.class_(var1));
   }

   @Override
   public void class_(rrFK var1) {
      this.finally_().ifPresent(var1x -> var1x.class_(var1));
   }

   public void class_() {
      this.package_();
      if ((SC)this.break_[0] != null) {
         this.int_();
         UUID var5 = UUID.randomUUID();
         this.break_[3] = var5;
         Boolean var6 = true;
         this.break_[5] = var6;
         this.final_();
      }
   }

   @Override
   public void class_(rrLO var1) {
      this.finally_().ifPresent(var1x -> var1x.class_(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8166423336542917410L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 44, 34, 79, 18, -26, 15, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_() {
      this.package_();
      Object var5 = null;
      this.break_[0] = var5;
      this.int_();
      Integer var6 = 0;
      this.break_[4] = var6;
      Boolean var7 = false;
      this.break_[5] = var7;
   }

   public boolean throws_() {
      this.package_();
      return (SC)this.break_[0] != null && !rql_3.break_(((SC)this.break_[0]).byte_()) ? true : case_[6];
   }

   private Optional<Sv_1> finally_() {
      this.package_();
      return !this.throws_() ? Optional.empty() : ((SA)this.break_[1]).class_();
   }

   public SC catch_() {
      this.package_();
      return (SC)this.break_[0];
   }

   private static void extends_() {
      byte_ = new byte[]{6, 4, 5};
   }

   public boolean case_() {
      this.package_();
      return (Boolean)this.break_[5];
   }

   private static void continue_() {
      protected_ = new short[]{1, 0, 3, 0, 4, 4, 4, 2, 3, 2, 2, 1, 19, 3, 2, 0, 3, 5, 1, 0, 0, 0, 0, 4, 5, 3, 1, 19, 3, 3, 2, 0, 1, 2, 3, 4, 5, 0, 5, 4, 4};
   }

   public int implements_() {
      this.package_();
      return (Integer)this.break_[4];
   }

   private static void new_() {
      case_ = new boolean[]{false, false, false, true, true, true, false, false, false, true, false, false};
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         Object[] var1 = this.break_;
         var1[4] = 0;
         var1[5] = false;
      }
   }

   private boolean super_() {
      return true;
   }

   public SA protected_() {
      this.package_();
      return (SA)this.break_[1];
   }

   public UUID private_() {
      this.package_();
      return (UUID)this.break_[3];
   }

   private void final_() {
      this.package_();
      if ((SC)this.break_[0] != null && (UUID)this.break_[3] != null) {
         int var1 = ((SC)this.break_[0]).break_();
         if (var1 > 0) {
            if ((Integer)this.break_[4] >= var1) {
               this.int_();
            } else {
               int var2 = var1 - (Integer)this.break_[4];
               float var3 = (float)var2 / 20.0F;
               float var4 = 1.0F - rfU_2.class_((float)((Integer)this.break_[4]).intValue() / (float)var1, 0.0F, 1.0F);
               if ((cd_3)this.break_[2] != null && !this.super_()) {
                  ((cd_3)this.break_[2]).class_(var4);
               } else {
                  rgN_2 var5 = new rgN_2("Перезаход через " + rgF_2.RED + rql_3.class_(var3) + " сек.");
                  cd_3 var10 = new cd_3((UUID)this.break_[3], var5, rRb_1.WHITE, rRM.PROGRESS, var4, false, false, false);
                  this.break_[2] = var10;
               }

               ((cq_3)((Ps_1)this.class_[1]).throws_().class_[19]).extends_().catch_().put((UUID)this.break_[3], (cd_3)this.break_[2]);
            }
         }
      }
   }
}
