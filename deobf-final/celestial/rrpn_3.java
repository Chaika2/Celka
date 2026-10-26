package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpn_3 extends rrpl_3 {
   private static float[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static String[] case_;
   private static short[] catch_;

   private boolean byte_() {
      rgP_2 var1 = ((cq_3)import_.class_[19]).implements_().protected_();
      return var1 != null && var1.byte_().contains("Вы находитесь в: Lobby") ? true : protected_[9];
   }

   public rrpn_3(GriefJoiner var1) {
      super(var1);
      this.throws_();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.throws_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrpC_2)this.class_[0] != (rrpC_2)rrpC_2.staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[0]) {
            return;
         }

         if ((Boolean)this.class_[1] && (Integer)((cb_3)import_.class_[57]).throws_[41] % 25 == 0) {
            Boolean var13 = false;
            this.class_[1] = var13;
         }

         GriefJoiner var2 = this.continue_();
         String var3 = var2.new_();
         boolean var4 = !var3.equalsIgnoreCase("mega") && !var3.equalsIgnoreCase("мега") ? protected_[2] : protected_[1];
         vm_3 var6 = (vm_3)import_.class_[73];
         if (var6 instanceof Fc_1 var5) {
            String var15 = var5.new_().byte_().toLowerCase();
            rqs_3 var7 = var5.G_().extends_();
            if (var4) {
               rdn_3 var17 = this.break_(var7);
               if (var17 != null) {
                  this.class_(var7, var17);
               }

               return;
            }

            if (var15.contains("выбор сервера")) {
               rdn_3 var16 = this.class_(var7);
               if (var16 != null) {
                  this.class_(var7, var16);
               }

               return;
            }

            if (var15.contains("выбор мира грифа")) {
               rdn_3 var8 = this.class_(var3, var7);
               if (var8 != null) {
                  this.class_(var7, var8);
               }
            }
         } else if (!(Boolean)this.class_[1]) {
            this.private_();
            Boolean var14 = true;
            this.class_[1] = var14;
         }
      }
   }

   private rdn_3 class_(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_().toLowerCase();
         if (var4.contains("гриферское выживание")) {
            return var3;
         }
      }

      return null;
   }

   @EventTarget
   public void class_(rrFY var1) {
      vm_3 var2 = var1.class_();
      if (var2 instanceof Fc_1) {
         String var3 = var2.new_().byte_().toLowerCase();
         if (var3.contains("выбор сервера") || var3.contains("выбор мира грифа")) {
            this.continue_().byte_(true);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4999888400485090739L;
   }

   private void class_(rqs_3<rdn_3> var1, rdn_3 var2) {
      ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1.indexOf(var2), 1, rXa_1.PICKUP);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1702324786;
   }

   @Override
   public void class_() {
      this.throws_();
      GriefJoiner var1 = this.continue_();
      if (!this.byte_()) {
         var1.byte_(false);
         String var2 = "Вы не находитесь в хабе";
         rrfu_3.byte_(rrfu_3.class_((Module)var1) + var2);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var1.final_(), var2, 2000));
      } else {
         rrpC_2 var7 = (rrpC_2)rrpC_2.staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[0];
         this.class_[0] = var7;
      }
   }

   @EventTarget
   public void class_(rrAl_1 var1) {
      if (var1.class_() > 10.0F) {
         GriefJoiner var2 = this.continue_();
         var2.byte_(false);
         String var3 = "Вы успешно зашли на " + var2.new_() + " гриф";
         String var4 = rrfu_3.class_((Module)var2) + var3;
         rrfu_3.byte_(var4);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2(var2.final_(), var3, 2000));
         MinecraftAccessor.a_(var4, false);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 32, 43, 51, 84, 21, -73, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rdn_3 class_(String var1, List<rdn_3> var2) {
      try {
         int var3 = Integer.parseInt(var1);

         for (rdn_3 var5 : var2) {
            if (!var5.class_() && var5.continue_().byte_().contains("#" + var3)) {
               return var5;
            }
         }

         return null;
      } catch (NumberFormatException var6) {
         return null;
      }
   }

   private static void break_() {
      byte_ = new byte[]{25, -1, -2, -3, 2};
   }

   private rdn_3 break_(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_().toLowerCase();
         if (var4.contains("мега гриф")) {
            return var3;
         }
      }

      return null;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = false;
      }
   }

   private static void finally_() {
      case_ = new String[]{
         new String("mega"),
         new String("мега"),
         new String("выбор сервера"),
         new String("выбор мира грифа"),
         new String("выбор сервера"),
         new String("выбор мира грифа"),
         new String("Вы не находитесь в хабе"),
         new String("Вы находитесь в: Lobby"),
         new String("мега гриф"),
         new String("гриферское выживание")
      };
   }

   private static void case_() {
      break_ = new float[]{10.0F};
   }

   private static void implements_() {
      protected_ = new boolean[]{false, true, false, true, true, false, false, false, true, false, true, true, false};
   }

   private static void protected_() {
      catch_ = new short[]{0, 0, 0, 1, 57, 41, 1, 73, 1, 1, 57, 0, 57, 0, 57, 0, 0, 2000, 0, 2000, 0, 0, 0, 19, 55, 57, 4};
   }

   private void private_() {
      int var1 = rrfY_2.break_(rdy_3.Xx);
      if (var1 != -1) {
         if (var1 == -2) {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZd_1(rpm_3.MAIN_HAND));
         } else if (var1 == -3) {
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZd_1(rpm_3.OFF_HAND));
         } else {
            rrfo_3.class_(var1);
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZd_1(rpm_3.MAIN_HAND));
         }
      }
   }

   @Override
   public boolean aK_() {
      this.throws_();
      Object var5 = null;
      this.class_[0] = var5;
      return super.aK_();
   }
}
