package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SwingAnimations extends Module {
   public Object[] break_;
   private static double[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   private static String[] catch_;
   private static boolean[] private_;
   private static byte[] implements_;

   public SwingAnimations() {
      super("Swing Animations", "Изменяет положение предметов\nв руках", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.new_();
      rrIQ var5 = new rrIQ("Режим", "Type 1", "Type 1", "Type 2", "Default");
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Только с AttackAura", false);
      this.break_[1] = var6;
      rrIm_1 var7 = new rrIm_1("Сила", 70.0F, 10.0F, 100.0F, 10.0F).class_(() -> {
         this.new_();
         return !((rrIQ)this.break_[0]).byte_().equals("Default") ? true : private_[20];
      });
      this.break_[2] = var7;
      rrIm_1 var8 = new rrIm_1("Скорость", 7.0F, 1.0F, 10.0F, 1.0F);
      this.break_[3] = var8;
      rrIm_1 var9 = new rrIm_1("X координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.break_[4] = var9;
      rrIm_1 var10 = new rrIm_1("Y координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.break_[5] = var10;
      rrIm_1 var11 = new rrIm_1("Z координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.break_[6] = var11;
      rrIm_1 var12 = new rrIm_1("X координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.break_[7] = var12;
      rrIm_1 var13 = new rrIm_1("Y координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.break_[8] = var13;
      rrIm_1 var14 = new rrIm_1("Z координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.break_[9] = var14;
      this.class_(
         new Setting[]{
            new GroupSetting("Анимация", (rrIQ)this.break_[0], (rrIm_1)this.break_[2], (rrIm_1)this.break_[3]),
            new GroupSetting("Позиция правой руки", (rrIm_1)this.break_[7], (rrIm_1)this.break_[8], (rrIm_1)this.break_[9]),
            new GroupSetting("Позиция левой руки", (rrIm_1)this.break_[4], (rrIm_1)this.break_[5], (rrIm_1)this.break_[6]),
            new GroupSetting("Другое", (rrIk_1)this.break_[1])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new boolean[]{
         false, true, false, false, false, true, true, false, true, false, true, true, false, true, false, true, false, true, true, true, false
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2565377070511132123L;
   }

   private void class_(Ml_1 var1, float var2, float var3) {
      this.new_();
      float var4 = rfU_2.byte_(var2);
      var1.class_(rje_3.protected_.byte_(var3 * (45.0F + rfU_2.class_(var2 * var2 * (float) Math.PI) / 4.0F * -20.0F)));
      var1.class_(rje_3.case_.byte_(var3 * rfU_2.class_(var4 * (float) Math.PI) * -20.0F));
      var1.class_(rje_3.break_.byte_(rfU_2.class_(var4 * (float) Math.PI) * -((rrIm_1)this.break_[2]).byte_()));
      var1.class_(rje_3.protected_.byte_(var3 * -45.0F));
   }

   @EventTarget
   public void class_(rrAi_1 var1) {
      this.new_();
      if (this.continue_()) {
         Ml_1 var2 = var1.break_();
         rpZ_2 var3 = var1.class_();
         float var4 = var1.catch_();
         byte var5 = var3 == rpZ_2.RIGHT ? 1 : implements_[11];
         switch (((int[])rrqj_3.class_[1])[var1.throws_().ordinal()]) {
            case 1:
               switch (((int[])rrqj_3.class_[0])[var3.ordinal()]) {
                  case 1:
                     var2.class_(
                        (double)((rrIm_1)this.break_[7]).byte_().floatValue(),
                        (double)((rrIm_1)this.break_[8]).byte_().floatValue(),
                        (double)((rrIm_1)this.break_[9]).byte_().floatValue()
                     );
                     return;
                  case 2:
                     var2.class_(
                        (double)((rrIm_1)this.break_[4]).byte_().floatValue(),
                        (double)((rrIm_1)this.break_[5]).byte_().floatValue(),
                        (double)((rrIm_1)this.break_[6]).byte_().floatValue()
                     );
                     return;
                  default:
                     return;
               }
            case 2:
               if (var3 == ((Qw_1)import_.class_[20]).continue_) {
                  String var6 = ((rrIQ)this.break_[0]).byte_();
                  switch (var6) {
                     case "Type 1":
                        this.class_(var1, var2, var5);
                        this.class_(var2, var4, (float)var5);
                        break;
                     case "Type 2":
                        this.class_(var1, var2, var5);
                        this.break_(var2, var4, (float)var5);
                  }
               }
         }
      }
   }

   private void class_(rrAi_1 var1, Ml_1 var2, int var3) {
      var1.class_(true);
      var2.class_((double)((float)var3 * 0.56F), -0.52F, -0.72F);
   }

   @EventTarget
   public void class_(rrLl_1 var1) {
      this.new_();
      if (this.continue_()) {
         float var2 = ((rrIm_1)this.break_[3]).native_() - ((rrIm_1)this.break_[3]).byte_() + ((rrIm_1)this.break_[3]).class_();
         var1.class_(var2 * 2.0F);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 563666554;
   }

   private void break_(Ml_1 var1, float var2, float var3) {
      this.new_();
      var1.class_(rje_3.protected_.byte_(var3 * 90.0F));
      var1.class_(rje_3.case_.byte_(var3 * -60.0F));
      var1.class_(rje_3.break_.byte_(-60.0F - 40.0F * (float)Math.sin((double)var2 * (Math.PI / 2) * 2.0) * ((rrIm_1)this.break_[2]).byte_() / 50.0F));
      var1.class_(rje_3.break_.byte_(var3 * -20.0F));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -81, 7, -85, -2, 7, 116, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      byte_ = new double[]{Math.PI / 2, 2.0, -0.52F, -0.72F};
   }

   private boolean continue_() {
      this.new_();
      return ((rrIk_1)this.break_[1]).class_() && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().E().aJ_() ? false : private_[17];
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[10];
      }
   }

   private static void return_() {
      catch_ = new String[]{
         new String("Swing Animations"),
         new String("Изменяет положение предметов\nв руках"),
         new String("Режим"),
         new String("Type 1"),
         new String("Type 1"),
         new String("Type 2"),
         new String("Default"),
         new String("Только с AttackAura"),
         new String("Сила"),
         new String("Скорость"),
         new String("X координата"),
         new String("Y координата"),
         new String("Z координата"),
         new String("X координата"),
         new String("Y координата"),
         new String("Z координата"),
         new String("Анимация"),
         new String("Позиция правой руки"),
         new String("Позиция левой руки"),
         new String("Другое"),
         new String("Type 1"),
         new String("Type 2"),
         new String("Default")
      };
   }

   private static void super_() {
      protected_ = new short[]{2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 7, 8, 9, 4, 5, 6, 1, 1, 0, 7, 8, 9, 4, 5, 6, 20, 0, 3, 3, 3, 1, 0, 2, 2, 0};
   }

   private static void while_() {
      throws_ = new float[]{
         70.0F,
         10.0F,
         100.0F,
         10.0F,
         7.0F,
         1.0F,
         10.0F,
         1.0F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         2.0F,
         45.0F,
         (float) Math.PI,
         4.0F,
         -20.0F,
         (float) Math.PI,
         -20.0F,
         (float) Math.PI,
         -45.0F,
         90.0F,
         -60.0F,
         -60.0F,
         40.0F,
         50.0F,
         -20.0F,
         0.56F
      };
   }

   private static void public_() {
      implements_ = new byte[]{3, 2, 4, 3, 2, 3, 2, 2, 3, 2, 3, -1, -1, 10};
   }
}
