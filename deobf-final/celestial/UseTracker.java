package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class UseTracker extends Module {
   private static String[] byte_;
   private static short[] protected_;
   private static long[] throws_;
   public Object[] break_;
   private static byte[] catch_;
   private static boolean[] private_;

   public UseTracker() {
      super("Use Tracker", "Отслеживает использование\nпредметов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.public_();
      HashSet var5 = new HashSet();
      this.break_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      this.public_();
      Iterator var1 = ((Set)this.break_[0]).iterator();
      if (var1.hasNext()) {
         rryO var2 = (rryO)var1.next();
         var2.class_(true);
      }
   }

   private void class_(rhd_3 var1, rdn_3 var2) {
      rgN_2 var3 = new rgN_2("");
      var3.class_(rgF_2.GRAY).class_(rrjZ_2.byte_((an_3)var1)).break_(" использовал ").class_(this.class_(var2).break_(rgF_2.RED));
      rrfu_3.class_((rVi_1)var3);
   }

   private rVi_1 class_(rdn_3 var1) {
      if (var1.this_()) {
         rVi_1 var2 = new rgN_2("(").break_(rgF_2.GOLD).break_(jI_2.class_("ru_ru", var1.finally_())).break_(")");
         return var1.continue_().case_().break_(" ").class_(var2);
      } else {
         return new rgN_2(jI_2.class_("ru_ru", var1.finally_()));
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.break_();
         if (var4 == rqn_3.hn) {
            this.this_();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1290568346;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.public_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         for (cG_2 var3 : ((gm_3)import_.class_[56]).continue_()) {
            if (rrff_3.class_(var3)) {
               rdn_3 var4 = var3.sX();
               int var5 = var3.SH();
               if (!var4.class_() && var5 == 2) {
                  if (var4.break_() == rdy_3.JA) {
                     this.break_(var3, var4);
                  } else {
                     ((Set)this.break_[0]).add(new rryO(var3, var4));
                  }
               }
            }
         }

         Iterator var6 = ((Set)this.break_[0]).iterator();

         while (var6.hasNext()) {
            rryO var7 = (rryO)var6.next();
            rhd_3 var8 = var7.protected_();
            rdn_3 var9 = var7.class_();
            if (rqR_2.break_() - var7.break_() > 300L) {
               var6.remove();
            } else if (var7.byte_()) {
               this.class_(var8, var9);
               var6.remove();
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2759041638784309124L;
   }

   private void break_(rhd_3 var1, rdn_3 var2) {
      rgN_2 var3 = new rgN_2("");
      rgN_2 var4 = new rgN_2("\n");
      var3.class_(rgF_2.GRAY).class_(rrjZ_2.byte_((an_3)var1)).break_(" выпил ").class_(this.class_(var2).break_(rgF_2.RED));
      List var5 = rAB.class_(var2);
      if (!var5.isEmpty()) {
         boolean var6 = false;

         for (int var7 = 0; var7 < var5.size(); var7++) {
            rLY var8 = (rLY)var5.get(var7);
            if (var8.break_() > 0) {
               var4.break_(rgF_2.GRAY + " • ").break_(rgF_2.RED + rAB.class_(var8, rgF_2.GRAY));
               if (var7 != var5.size() - 1) {
                  var4.break_("\n");
               }

               var6 = private_[3];
            }
         }

         if (var6) {
            var3.class_(var4);
         }
      }

      rrfu_3.class_((rVi_1)var3);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, -46, 38, -120, 93, -68, -107, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      private_ = new boolean[]{false, false, true, true, false, false, true, true};
   }

   private static void else_() {
      throws_ = new long[]{300L};
   }

   private static void new_() {
      protected_ = new short[]{4, 0, 0, 56, 0, 0, 0};
   }

   private static void return_() {
      catch_ = new byte[]{2};
   }

   private static void super_() {
      byte_ = new String[]{
         new String("Use Tracker"),
         new String("Отслеживает использование\nпредметов"),
         new String(""),
         new String(" использовал "),
         new String(""),
         new String("\n"),
         new String(" выпил "),
         new String("\n"),
         new String("("),
         new String("ru_ru"),
         new String(")"),
         new String(" "),
         new String("ru_ru")
      };
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }
}
