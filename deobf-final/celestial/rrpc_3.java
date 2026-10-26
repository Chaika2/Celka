package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpc_3 extends rrTF<FtHelper> {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static String[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrpc_3(FtHelper var1, GroupSetting var2) {
      super(var1);
      this.byte_();
      rrIF var7 = new rrIF(
         "Открыть аукцион\nс предметом который\nна мышке либо в руке",
         (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0],
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_()
      );
      this.class_[0] = var7;
      var2.class_((rrIF)this.class_[0]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5365960446796320401L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 990039306;
   }

   private String class_(rdn_3 var1) {
      String var2;
      if (var1.this_()) {
         rgP_2 var3 = var1.continue_();
         rVi_1 var4 = var3.throws_();

         for (rgP_2 var6 : var3.protected_()) {
            if (!var6.class_().case_()) {
               var4.class_(var6);
            }
         }

         var2 = var4.byte_();
      } else {
         var2 = jI_2.class_(protected_[1], var1.finally_());
      }

      return var2.replace("ё", "е").replaceAll("\\[?(\\d+[xх]\\d+)]?|[^a-zA-Zа-яА-Я- ]+", "$1").trim();
   }

   @EventTarget
   public void class_(rrLs_1 var1) {
      this.byte_();
      int var2 = var1.protected_();
      int var3 = var1.class_();
      if (var3 == 1 && var2 == ((rrIF)this.class_[0]).finally_().byte_()) {
         rdn_3 var4 = null;
         vm_3 var6 = (vm_3)import_.class_[73];
         if (var6 instanceof Zg_1 var5) {
            var4 = var5.byte_();
         } else if ((vm_3)import_.class_[73] == null) {
            var4 = ((cb_3)import_.class_[57]).ss();
         }

         if (var4 != null && !var4.class_()) {
            this.break_(var4);
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -21, 71, -39, 60, -5, 104, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new short[]{0, 0, 0, 0, 0, 0, 73, 73, 57, 57, 0, 57, 4, 57};
   }

   private void break_(rdn_3 var1) {
      String var2 = this.class_(var1);
      if (rrfo_3.class_()) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmj_3(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_));
      }

      ((cb_3)import_.class_[57]).case_("/ah search " + var2);
   }

   private static void break_() {
      break_ = new boolean[]{true, false, true};
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("Открыть аукцион\nс предметом который\nна мышке либо в руке"),
         new String("ru_ru"),
         new String("ё"),
         new String("е"),
         new String("\\[?(\\d+[xх]\\d+)]?|[^a-zA-Zа-яА-Я- ]+"),
         new String("$1")
      };
   }
}
