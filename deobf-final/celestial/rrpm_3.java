package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpm_3 extends rrTF<FtHelper> {
   private static byte[] break_;
   private static boolean[] byte_;
   private static String[] protected_;
   private static short[] case_;
   public Object[] class_;

   public rrpv_3 byte_(String var1) {
      if (rql_3.break_(var1)) {
         return null;
      } else {
         Matcher var2 = ((Pattern)rrjS_2.class_[2]).matcher(var1);
         return var2.matches() ? rrpv_3.break_(var2.group(1)) : null;
      }
   }

   private static void byte_() {
      byte_ = new boolean[]{false, false, false, false, false, false, true, true, false, true, true, true, false};
   }

   public rrpm_3(FtHelper var1, GroupSetting var2) {
      super(var1);
      this.case_();
      rrIk_1 var7 = new rrIk_1("Отображать информацию\nо шахте в виде боссбара", false);
      this.class_[0] = var7;
      var2.class_((rrIk_1)this.class_[0]);
   }

   static {
      ntfClinit();
   }

   public void class_() {
      this.private_();
   }

   public void class_(rrpZ_2 var1, rrpZ_2 var2) {
      this.break_(var1);
      rVi_1 var3 = rrfu_3.break_(this.continue_()).class_("Произошло обновление шахты").class_(rgF_2.GRAY);
      var3.break_("\n • Уровень: ").class_(new rgN_2(var2.break_().class_()).class_(rgF_2.RED));
      var3.break_("\n • Осталось: ").class_(new rgN_2(this.class_(var2)).class_(rgF_2.RED));
      rrfu_3.class_(var3);
      MinecraftAccessor.a_(var3.byte_(), false);
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.class_();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.case_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!((rrIk_1)this.class_[0]).class_() || !rrjS_2.class_() || !this.break_()) {
            this.class_();
            return;
         }

         if ((rrpZ_2)this.class_[1] == null) {
            return;
         }

         UUID var2 = ((rrpZ_2)this.class_[1]).class_();
         rrpv_3 var3 = ((rrpZ_2)this.class_[1]).break_();
         rgN_2 var4 = new rgN_2("Шахта: " + var3.byte_() + var3.class_() + rgF_2.RESET + " (" + this.class_((rrpZ_2)this.class_[1]) + ")");
         ((cq_3)import_.class_[19])
            .extends_()
            .catch_()
            .put(
               var2,
               new cd_3(
                  var2,
                  var4,
                  var3.break_(),
                  rRM.PROGRESS,
                  (float)((rrpZ_2)this.class_[1]).protected_() / (float)((rrpZ_2)this.class_[1]).byte_(),
                  false,
                  false,
                  false
               )
            );
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1711212430;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -108, -18, -71, 16, 35, 17, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private String class_(rrpZ_2 var1) {
      return var1.protected_() / 60 + ":" + String.format("%02d", var1.protected_() % 60);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -745764794633557559L;
   }

   public boolean break_() {
      this.case_();
      rrpv_3 var1 = null;
      int var2 = -1;

      for (an_3 var4 : ((gm_3)import_.class_[56]).byte_()) {
         if (var4.BC() == aI_2.break_) {
            String var5 = var4.L_().getString();
            rrpv_3 var6 = this.byte_(var5);
            if (var6 != null) {
               var1 = var6;
            }

            int var7 = this.break_(var5);
            if (var7 != -1) {
               var2 = var7;
            }
         }

         if (var1 != null && var2 != -1) {
            break;
         }
      }

      if (var1 != null && var2 != -1) {
         rrpZ_2 var14 = (rrpZ_2)this.class_[1];
         boolean var15 = false;
         if ((rrpZ_2)this.class_[1] != null && Math.abs(((rrpZ_2)this.class_[1]).protected_() - var2) > 20) {
            Object var12 = null;
            this.class_[1] = var12;
            var15 = true;
         }

         if ((rrpZ_2)this.class_[1] == null) {
            rrpZ_2 var13 = new rrpZ_2(UUID.randomUUID(), var2);
            this.class_[1] = var13;
         }

         ((rrpZ_2)this.class_[1]).class_(var1, var2);
         if (var15) {
            this.class_(var14, (rrpZ_2)this.class_[1]);
         }

         return byte_[7];
      } else {
         return byte_[4];
      }
   }

   public int break_(String var1) {
      if (rql_3.break_(var1)) {
         return -1;
      } else {
         Matcher var2 = ((Pattern)rrjS_2.class_[3]).matcher(var1);
         if (var2.matches()) {
            int var3 = Integer.parseInt(var2.group(1));
            int var4 = Integer.parseInt(var2.group(2));
            return var3 * 60 + var4;
         } else {
            return break_[8];
         }
      }
   }

   private void break_(rrpZ_2 var1) {
      if (var1 != null) {
         ((cq_3)import_.class_[19]).extends_().catch_().remove(var1.class_());
      }
   }

   private static void throws_() {
      protected_ = new String[]{
         new String("Отображать информацию\nо шахте в виде боссбара"),
         new String("Произошло обновление шахты"),
         new String("\n • Уровень: "),
         new String("\n • Осталось: "),
         new String("%02d")
      };
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private static void implements_() {
      case_ = new short[]{0, 0, 0, 0, 1, 1, 1, 1, 19, 1, 1, 56, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 1, 1, 1, 19};
   }

   private static void protected_() {
      break_ = new byte[]{-1, -1, -1, -1, 20, -1, 2, 60, -1, 60, 60, 2};
   }

   private void private_() {
      this.case_();
      if ((rrpZ_2)this.class_[1] != null) {
         this.break_((rrpZ_2)this.class_[1]);
         Object var5 = null;
         this.class_[1] = var5;
      }
   }

   @Override
   public boolean aK_() {
      this.class_();
      return super.aK_();
   }
}
