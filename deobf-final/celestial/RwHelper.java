package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RwHelper extends Module {
   private static float[] byte_;
   public Object[] break_;
   private static long[] protected_;
   private static String[] throws_;
   private static byte[] catch_;
   private static short[] private_;
   private static boolean[] implements_;

   public RwHelper() {
      super("RW Helper", "Утилитарный модуль для\nReallyWorld", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.super_();
      rrIk_1 var5 = new rrIk_1("Флай на драгоне", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Закрытие меню", true);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Не ставить шары", true);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Авто. полёт", true);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Авто. починка", true);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Авто. исцеление", true);
      this.break_[5] = var10;
      CopyOnWriteArrayList var11 = new CopyOnWriteArrayList();
      this.break_[6] = var11;
      this.class_(
         new Setting[]{
            new rrIc_1("Утилиты", (rrIk_1)this.break_[0], (rrIk_1)this.break_[1], (rrIk_1)this.break_[2]),
            new rrIc_1("После ПВП", (rrIk_1)this.break_[5], (rrIk_1)this.break_[4], (rrIk_1)this.break_[3])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new float[]{0.0F, 1.061F, 1.199F, 0.56F, 1.199F};
   }

   @EventTarget
   public void class_(rrFw_1 var1) {
      if (var1.class_() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]) {
         this.while_();
      }
   }

   @EventTarget
   public void class_(rrAR var1) {
      this.super_();
      if (((rrIk_1)this.break_[2]).class_()) {
         rdn_3 var2 = var1.class_();
         if (rrjQ_2.class_(var2)) {
            var1.class_(true);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1320744056;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.super_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((rrIk_1)this.break_[0]).class_() && (Boolean)this.break_[7]) {
            if (!((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_) {
               Integer var8 = (Integer)this.break_[8] + 1;
               this.break_[8] = var8;
            }

            if ((Integer)this.break_[8] > 10) {
               ((cb_3)import_.class_[57]).G();
               this.new_();
            }
         }

         for (rrHa_1 var3 : (List)this.break_[6]) {
            if (System.currentTimeMillis() - ((Ax_1)import_.class_[55]).byte_ > 1000L && ((cb_3)import_.class_[57]).protected_(var3.class_())) {
               ((List)this.break_[6]).remove(var3);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.super_();
      ((List)this.break_[6]).clear();
   }

   @EventTarget
   public void class_(rrAt_1 var1) {
      this.super_();
      if (((rrIk_1)this.break_[0]).class_() && var1.class_() == (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[1]) {
         var1.class_(true);
         Boolean var6 = true;
         this.break_[7] = var6;
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.super_();
      if (var1.class_() instanceof rvp_3 var2
         && ((rrIk_1)this.break_[1]).class_()
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         String var4 = var2.protected_().byte_();
         if (var4.equals("ꈁꀀꈂꌁꈂꀁꈃꄀ") || var4.equals("Меню")) {
            var1.class_(true);
            ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rmj_3(var2.break_()));
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1916942720712137223L;
   }

   @EventTarget
   public void class_(rrLz_1 var1) {
      this.super_();
      if (((rrIk_1)this.break_[0]).class_() && ((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_) {
         float var2 = rrfj_3.class_();
         boolean var3 = rrfj_3.catch_();
         boolean var4 = var2 != 0.0F ? true : implements_[13];
         float var5 = var3 && var4 ? 1.061F : byte_[2];
         float var6 = var3 ? 0.56F : byte_[4];
         var1.class_(var5);
         var1.catch_().byte_ = (double)(var2 * var6);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -128, 108, -35, -123, 66, -86, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.new_();
   }

   private static void goto_() {
      catch_ = new byte[]{2, 3, 2, 3, 2, 10, 9, 7, 8};
   }

   private static void continue_() {
      throws_ = new String[]{
         new String("RW Helper"),
         new String("Утилитарный модуль для\nReallyWorld"),
         new String("Флай на драгоне"),
         new String("Закрытие меню"),
         new String("Не ставить шары"),
         new String("Авто. полёт"),
         new String("Авто. починка"),
         new String("Авто. исцеление"),
         new String("Утилиты"),
         new String("После ПВП"),
         new String("ꈁꀀꈂꌁꈂꀁꈃꄀ"),
         new String("Меню"),
         new String("/fly"),
         new String("/fix all"),
         new String("/heal")
      };
   }

   private static void else_() {
      implements_ = new boolean[]{
         true, true, true, true, true, true, false, false, true, true, false, true, true, false, true, true, true, true, true, false, false, false, false
      };
   }

   private void new_() {
      this.super_();
      Boolean var5 = false;
      this.break_[7] = var5;
      Integer var6 = 0;
      this.break_[8] = var6;
   }

   private static void return_() {
      protected_ = new long[]{1000L};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         this.break_[7] = false;
         this.break_[8] = 0;
      }
   }

   private void while_() {
      this.super_();
      ((List)this.break_[6]).clear();
      if (((rrIk_1)this.break_[3]).class_()) {
         ((List)this.break_[6]).add(new rrHa_1("/fly"));
      }

      if (((rrIk_1)this.break_[4]).class_()) {
         ((List)this.break_[6]).add(new rrHa_1("/fix all"));
      }

      if (((rrIk_1)this.break_[5]).class_()) {
         ((List)this.break_[6]).add(new rrHa_1("/heal"));
      }
   }

   private static void public_() {
      private_ = new short[]{
         4,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         1,
         2,
         5,
         4,
         3,
         0,
         57,
         18,
         1,
         0,
         1,
         7,
         0,
         0,
         7,
         57,
         18,
         8,
         8,
         8,
         57,
         6,
         55,
         57,
         6,
         1,
         1,
         0,
         57,
         0,
         2,
         6,
         6,
         3,
         6,
         4,
         6,
         5,
         6,
         7,
         8
      };
   }
}
