package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlV_2 extends rrlg_3 {
   private static byte[] break_;
   private static String[] protected_;
   private static short[] case_;
   public Object[] class_;
   private static boolean[] catch_;

   public boolean byte_() {
      if (!this.case_()) {
         return false;
      } else {
         return !((cb_3)import_.class_[57]).break_(rLD.final_) ? true : catch_[13];
      }
   }

   public rrlV_2(AutoUse var1) {
      super(var1);
      this.extends_();
      rrIk_1 var6 = new rrIk_1("Включено", false).class_("enabled", (var1x, var2) -> {
         if (!var1x.byte_()) {
            this.package_();
         }
      });
      this.class_[0] = var6;
      var1.class_(new GroupSetting("Зелье невидимости", (rrIk_1)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(rrAC var1) {
      this.extends_();
      if (var1.break_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.class_[1]) {
         var1.class_(true);
      }
   }

   private boolean class_(rdn_3 var1) {
      return var1.break_() != rdy_3.JA ? false : rAB.break_(var1, List.of(rLD.final_));
   }

   @Override
   public boolean class_() {
      this.extends_();
      return (Boolean)this.class_[1];
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(rrLH var1) {
      this.extends_();
      if (var1.protected_() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0] && (Boolean)this.class_[1]) {
         var1.class_(true);
      }
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(rrLp_1 var1) {
      this.extends_();
      rrLq_1 var2 = var1.case_();
      if ((var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[1] || var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[0])
         && (Boolean)this.class_[1]) {
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1853190394;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{30, -125, 24, -76, -57, -126, 54, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(q_1 var1) {
      this.extends_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         AutoUse var2 = this.continue_();
         if (!((rrIk_1)this.class_[0]).class_() || !var2.class_(this)) {
            this.break_();
            return;
         }

         rdn_3 var3 = ((cb_3)import_.class_[57]).Sn();
         Pair var4 = this.break_(var3);
         if (var4 == null) {
            this.break_();
            return;
         }

         rdn_3 var5 = (rdn_3)var4.getLeft();
         int var6 = (Integer)var4.getRight();
         if (!this.byte_()) {
            this.break_();
            return;
         }

         this.private_();
         int var7 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         if (var6 != -1 && var7 == 0 && !rdn_3.break_(var3, var5)) {
            ((Ax_1)import_.class_[55]).class_(var7, var6, 40, rXa_1.SWAP, false);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
            Boolean var13 = false;
            this.class_[1] = var13;
            return;
         }

         if (!(Boolean)this.class_[1] && !((cb_3)import_.class_[57]).return_() && this.class_(var3)) {
            ryZ_2 var8 = ((Ax_1)import_.class_[55]).class_(rpm_3.OFF_HAND);
            if (var8.class_()) {
               ((cb_3)import_.class_[57]).break_(rpm_3.OFF_HAND);
               ((Hh_1)import_.class_[16]).class_.class_(rpm_3.OFF_HAND);
               Boolean var14 = true;
               this.class_[1] = var14;
            }
         }

         if ((Boolean)this.class_[1]) {
            if (!((cb_3)import_.class_[57]).return_()) {
               Boolean var15 = false;
               this.class_[1] = var15;
            } else if (((cb_3)import_.class_[57]).Sw() > var3.extends_() * 2) {
               ((Ax_1)import_.class_[55]).byte_((cb_3)import_.class_[57]);
               Boolean var16 = false;
               this.class_[1] = var16;
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7353662504368329895L;
   }

   private Pair<rdn_3, Integer> break_(rdn_3 var1) {
      if (this.class_(var1)) {
         return Pair.of(var1, -1);
      } else {
         for (int var2 = catch_[14]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (!var3.class_() && this.class_(var3)) {
               return Pair.of(var3, rrfY_2.break_(var2));
            }
         }

         return null;
      }
   }

   public void break_() {
      this.extends_();
      Boolean var5 = false;
      this.class_[1] = var5;
   }

   private static void finally_() {
      case_ = new short[]{0, 0, 0, 0, 57, 57, 4, 55, 0, 1, 1, 57, 55, 57, 16, 1, 1, 57, 1, 57, 55, 57, 1, 0, 1, 1, 0, 1, 0, 1, 1, 57, 1, 57, 55, 57, 57, 1, 1};
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = false;
      }
   }

   private static void implements_() {
      protected_ = new String[]{new String("Включено"), new String("enabled"), new String("Зелье невидимости")};
   }

   private void package_() {
      this.extends_();
      if ((Boolean)this.class_[1] && ((cb_3)import_.class_[57]).return_()) {
         ((Ax_1)import_.class_[55]).byte_((cb_3)import_.class_[57]);
      }

      this.break_();
   }

   private static void final_() {
      break_ = new byte[]{-1, 40, 2, -1, 45, 2};
   }

   private static void native_() {
      catch_ = new boolean[]{false, true, false, false, false, true, false, false, true, true, true, false, true, false, false, false, false, true, false};
   }

   @Override
   public boolean aK_() {
      this.package_();
      return super.aK_();
   }
}
