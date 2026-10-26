package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BaseFinder extends Module {
   private static String[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static double[] throws_;
   private static short[] catch_;
   private static byte[] private_;

   public BaseFinder() {
      super("Base Finder", "Утилитарный модуль для поиска\nбаз", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.goto_();
      rrIk_1 var5 = new rrIk_1("Сундуки", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Шалкера", true);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Бочки", true);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Наковальни", false);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Столы зачарования", false);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Печки", false);
      this.break_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Избегать враждебных\nсуществ", true);
      this.break_[6] = var11;
      this.class_(
         new Setting[]{
            new GroupSetting(
               "Триггеры",
               (rrIk_1)this.break_[0],
               (rrIk_1)this.break_[1],
               (rrIk_1)this.break_[2],
               (rrIk_1)this.break_[3],
               (rrIk_1)this.break_[4],
               (rrIk_1)this.break_[5]
            ),
            new GroupSetting("Другое", (rrIk_1)this.break_[6])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new double[]{100.0};
   }

   public void class_(int var1) {
      C_class var2 = C_throws.byte_();
      PI var3 = var2.native_().protected_();
      if (var3 != null) {
         Pf_1 var4 = var3.class_();
         if (var4 != (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            ((cb_3)import_.class_[57]).case_("/hub");
            var2.default_().class_(new Sl_1(var4.class_() + var3.break_(), var1));
         }
      }
   }

   @EventTarget
   public void class_(rrLM var1) {
      this.byte_(false);
   }

   @Override
   public void class_(boolean var1) {
      this.goto_();
      super.class_(var1);
      HashMap var2 = new HashMap();
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[0], (rrIk_1)this.break_[0]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[1], (rrIk_1)this.break_[1]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[4], (rrIk_1)this.break_[2]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[2], (rrIk_1)this.break_[3]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[3], (rrIk_1)this.break_[4]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[5], (rrIk_1)this.break_[5]);
      C_throws.byte_().volatile_().class_(() -> this.super_(), var2);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.goto_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((rrIk_1)this.break_[6]).class_()
         && !rrfZ_2.byte_()
         && ((cb_3)import_.class_[57]).Pu()
         && this.super_()) {
         boolean var2 = false;

         for (an_3 var4 : ((gm_3)import_.class_[56]).byte_()) {
            if (var4 instanceof iB_2 var5
               && var5.BC().throws_().private_()
               && !var5.BC().equals(aI_2.else_)
               && var5.int_((cb_3)import_.class_[57]) <= 100.0
               && var5.Pu()
               && var5.while_((cb_3)import_.class_[57])) {
               var2 = true;
               break;
            }
         }

         if (var2) {
            this.class_(120);
            rrfu_3.byte_(rrfu_3.class_((Module)this) + "Найдено враждебное существо, перезаходим");
         }
      }
   }

   public void class_(rVi_1 var1) {
      rVi_1 var2 = rrfu_3.break_((Module)this).class_(rgF_2.GRAY).class_(var1);
      rrfu_3.class_(var2);
      MinecraftAccessor.a_(var2.byte_(), false);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2863523849789982629L;
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.byte_(false);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -454492118;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-83, -86, -81, 68, -35, 67, -126, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      if (this.aJ_()) {
         C_throws.byte_().volatile_().private_();
      }
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }

   private static void continue_() {
      protected_ = new boolean[]{
         true, true, true, false, false, false, true, false, false, true, true, true, false, false, true, false, false, false, false, true, false, false, true
      };
   }

   private static void else_() {
      catch_ = new short[]{4, 0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 3, 4, 5, 6, 0, 6, 57, 56, 57, 57, 2, 57, 0, 0, 1, 1, 4, 2, 2, 3, 3, 4, 5, 5};
   }

   public void new_() {
      if (this.aJ_()) {
         String var1 = rrfu_3.class_((Module)this) + "Достигнута граница мира";
         rrfu_3.byte_(var1);
         MinecraftAccessor.a_(var1, false);
         this.byte_(true);
      }
   }

   private static void return_() {
      private_ = new byte[]{2, 6, 2, 3, 4, 5, 120, 7};
   }

   private boolean super_() {
      if (C_throws.byte_().default_().throws_()) {
         return false;
      } else {
         PI var1 = C_throws.byte_().native_().protected_();
         if (var1 != null) {
            Pf_1 var2 = var1.class_();
            if (var2 == null || !var2.break_()) {
               return protected_[18];
            }
         }

         return protected_[19];
      }
   }

   private static void public_() {
      byte_ = new String[]{
         new String("Base Finder"),
         new String("Утилитарный модуль для поиска\nбаз"),
         new String("Сундуки"),
         new String("Шалкера"),
         new String("Бочки"),
         new String("Наковальни"),
         new String("Столы зачарования"),
         new String("Печки"),
         new String("Избегать враждебных\nсуществ"),
         new String("Триггеры"),
         new String("Другое"),
         new String("/hub")
      };
   }
}
