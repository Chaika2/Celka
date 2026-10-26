package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryA extends rrTF<AutoDuel> {
   private static double[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static String[] protected_;
   private static byte[] case_;
   private static short[] catch_;
   private static float[] private_;

   private static void byte_() {
      catch_ = new short[]{4, 0, 1, 2, 3, 0, 0, 3, 73, 0, 0, 3000, 0, 1, 57, 3, 1, 2, 55, 57, 4, 2, 0, 57, 0, 1, 2, 3, 3, 0};
   }

   public rryA(AutoDuel var1) {
      super(var1);
      this.private_();
      rrIv_1 var6 = new rrIv_1("Выбор режима", "Тотемы", rrte_3.class_((Pattern)rrtR_2.class_[4])).class_(80.0F);
      this.class_[0] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.class_[1] = var7;
      rrfw_3 var8 = new rrfw_3();
      this.class_[2] = var8;
      ArrayList var9 = new ArrayList();
      this.class_[3] = var9;
      var1.class_(((rrIv_1)this.class_[0]).class_(() -> var1.new_() == this ? true : byte_[15]));
   }

   static {
      ntfClinit();
   }

   private rdn_3 class_(List<rdn_3> var1) {
      this.private_();
      String var2 = ((rrIv_1)this.class_[0]).extends_();

      for (rdn_3 var4 : var1) {
         if (!var4.class_() && var4.continue_().byte_().equalsIgnoreCase(var2)) {
            return var4;
         }
      }

      return null;
   }

   @EventTarget
   public void class_(rrns_3 var1) {
      this.private_();
      AutoDuel var2 = this.continue_();
      Fu_1 var3 = var1.class_();
      String var4 = var1.case_();
      if (var3 instanceof Fc_1 var5) {
         rqs_3 var6 = var5.G_().extends_();
         boolean var7 = false;
         switch (var4) {
            case "Выбор набора (1/1)":
               var7 = byte_[5];
               rdn_3 var11 = this.class_(var6);
               if (var11 != null) {
                  this.break_(var6.indexOf(var11));
               } else {
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                     .class_(new rrtx_3(var2.final_(), "Режим '" + ((rrIv_1)this.class_[0]).extends_() + "' не найден", 3000));
                  var2.byte_(false);
               }
               break;
            case "Настройка поединка":
               var7 = byte_[7];
               rdn_3 var10 = this.break_(var6);
               if (var10 != null) {
                  this.break_(var6.indexOf(var10));
               }
         }

         if (var7 && var5.throw_() > 10) {
            import_.break_(null);
         }
      }
   }

   private List<String> class_(boolean var1) {
      Predicate var2 = var1x -> {
         this.private_();
         if (((List)this.class_[3]).contains(var1x)) {
            return false;
         } else if (var1x.equals(import_.while_().byte_())) {
            return false;
         } else {
            return ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).break_(var1x) ? false : byte_[13];
         }
      };
      return uR_2.class_((Aq_1)((cb_3)import_.class_[57]).break_[0], var1).stream().map(var0 -> rql_3.class_(var0.class_().getName())).filter(var2).toList();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.private_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         List var2 = this.class_(true);
         if (var2.isEmpty()) {
            ((List)this.class_[3]).clear();
         }

         if (!var2.isEmpty() && !((vm_3)import_.class_[73] instanceof Fc_1)) {
            String var3 = (String)var2.get(0);
            this.break_(var3);
         }
      }
   }

   @EventTarget
   public void class_(rrFY var1) {
      this.continue_().byte_(true);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1761182948;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{11, -125, -43, -16, 68, 68, -122, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrFw_1 var1) {
      if (var1.class_() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[0]) {
         this.continue_().aw_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8057961746786261384L;
   }

   @EventTarget
   public void class_(rrAl_1 var1) {
      if (var1.class_() > 10.0F) {
         this.continue_().aw_();
      }
   }

   private static void class_() {
      private_ = new float[]{80.0F, 10.0F};
   }

   private rdn_3 break_(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         if (!var3.class_() && var3.continue_().byte_().equalsIgnoreCase("ОТПРАВИТЬ ЗАПРОС")) {
            return var3;
         }
      }

      return null;
   }

   private void break_(int var1) {
      this.private_();
      if (((rrfw_3)this.class_[2]).class_(200.0)) {
         ((Ax_1)import_.class_[55]).break_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, 2, rXa_1.CLONE, true);
         ((rrfw_3)this.class_[2]).class_();
      }
   }

   private static void break_() {
      byte_ = new boolean[]{true, false, false, false, true, true, false, true, true, true, false, false, false, true, true, false};
   }

   private void break_(String var1) {
      this.private_();
      if (((rrfw_3)this.class_[1]).class_(200.0)) {
         ((cb_3)import_.class_[57]).protected_("/duel " + var1);
         ((List)this.class_[3]).add(var1);
         ((rrfw_3)this.class_[1]).class_();
      }
   }

   private static void throws_() {
      case_ = new byte[]{-1, 10, 2, 4};
   }

   private void case_() {
      this.private_();
      ((rrfw_3)this.class_[1]).class_();
      ((rrfw_3)this.class_[2]).class_();
      ((List)this.class_[3]).clear();
   }

   private static void implements_() {
      break_ = new double[]{200.0, 200.0};
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("Выбор режима"), new String("Тотемы"), new String("Выбор набора (1/1)"), new String("Настройка поединка"), new String("ОТПРАВИТЬ ЗАПРОС")
      };
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
      }
   }

   @Override
   public boolean aK_() {
      this.case_();
      return super.aK_();
   }
}
