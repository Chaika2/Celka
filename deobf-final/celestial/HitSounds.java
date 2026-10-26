package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HitSounds extends Module {
   private static short[] byte_;
   private static boolean[] protected_;
   private static double[] throws_;
   public Object[] break_;
   private static byte[] catch_;
   private static float[] private_;
   private static String[] implements_;

   public HitSounds() {
      super("Hit Sounds", "Воспроизводит звуки при ударе", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.goto_();
      rrIQ var5 = new rrIQ("Выбор звука", "UwU", "UwU", "Бонк", "Стоны", "Маркер");
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Питч звука", 1.0F, 0.1F, 2.0F, 0.1F);
      this.break_[1] = var6;
      this.class_(new Setting[]{(rrIQ)this.break_[0], (rrIm_1)this.break_[1]});
      ((rrIQ)this.break_[0]).class_("change_mode", (var1, var2) -> {
         this.goto_();
         if (!(Boolean)var2.getRight()) {
            String var3 = var1.byte_();
            float var4 = ((rrIm_1)this.break_[1]).byte_();
            this.class_(var3, var4);
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new boolean[]{false, true, false, true, false, true};
   }

   @EventTarget
   public void class_(rrFj_1 var1) {
      this.goto_();
      if (var1.class_() instanceof iB_2) {
         this.class_(((rrIQ)this.break_[0]).byte_(), ((rrIm_1)this.break_[1]).byte_());
      }
   }

   private void class_(String var1, float var2) {
      switch (var1) {
         case "UwU":
            rrIy_1.class_(rqn_3.zx, 1.0F, var2);
            break;
         case "Бонк":
            rrIy_1.class_(rqn_3.zd, 1.0F, var2);
            break;
         case "Маркер":
            rrIy_1.class_(rqn_3.zk, 1.0F, var2);
            break;
         case "Стоны":
            rrIy_1.class_(this.public_(), 1.0F, var2);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5615088515655037784L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -401675121;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, 11, 34, -89, -85, -44, 26, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void continue_() {
      implements_ = new String[]{
         new String("Hit Sounds"),
         new String("Воспроизводит звуки при ударе"),
         new String("Выбор звука"),
         new String("UwU"),
         new String("UwU"),
         new String("Бонк"),
         new String("Стоны"),
         new String("Маркер"),
         new String("Питч звука"),
         new String("change_mode"),
         new String("UwU"),
         new String("Бонк"),
         new String("Маркер"),
         new String("Стоны")
      };
   }

   private static void else_() {
      catch_ = new byte[]{4, 2, 3, 2, -1, 2, 3, 2};
   }

   private static void new_() {
      private_ = new float[]{1.0F, 0.1F, 2.0F, 0.1F, 1.0F, 1.0F, 1.0F, 1.0F};
   }

   private static void return_() {
      byte_ = new short[]{0, 0, 1, 0, 1, 0, 0, 1, 1};
   }

   private static void super_() {
      throws_ = new double[]{4.0};
   }

   private rqA_2 public_() {
      return switch ((int)(Math.random() * 4.0)) {
         case 1 -> rqn_3.zz;
         case 2 -> rqn_3.zQ;
         case 3 -> rqn_3.zN;
         default -> rqn_3.zW;
      };
   }
}
