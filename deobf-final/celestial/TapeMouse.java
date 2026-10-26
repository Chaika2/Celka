package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TapeMouse extends Module {
   private static byte[] byte_;
   private static float[] protected_;
   private static short[] throws_;
   public Object[] break_;
   private static boolean[] catch_;
   private static String[] private_;

   public TapeMouse() {
      super("Tape Mouse", "Автоматически нажимает левую\nили правую кнопку мыши", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.return_();
      rrIQ var5 = new rrIQ("Режим", "ЛКМ", "ЛКМ", "ПКМ");
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Задержка в секундах", 0.5F, 0.0F, 60.0F, 0.5F);
      this.break_[1] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.break_[2] = var7;
      this.class_(new Setting[]{(rrIQ)this.break_[0], (rrIm_1)this.break_[1]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new String[]{
         new String("Tape Mouse"),
         new String("Автоматически нажимает левую\nили правую кнопку мыши"),
         new String("Режим"),
         new String("ЛКМ"),
         new String("ЛКМ"),
         new String("ПКМ"),
         new String("Задержка в секундах"),
         new String("ЛКМ")
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 296301507;
   }

   @EventTarget
   public void class_(rrAm_1 var1) {
      var1.class_(true);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5593851194299067641L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((rrfw_3)this.break_[2]).class_((double)(((rrIm_1)this.break_[1]).byte_() * 1000.0F))) {
         if (((rrIQ)this.break_[0]).byte_().equals("ЛКМ")) {
            import_.z();
         } else {
            import_.for_();
         }

         ((rrfw_3)this.break_[2]).class_();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, 22, 98, 73, -79, 78, -117, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.return_();
      super.throws_(var1);
      ((rrfw_3)this.break_[2]).class_();
   }

   private static void continue_() {
      throws_ = new short[]{0, 0, 1, 2, 0, 1, 0, 2, 1, 0, 2, 2};
   }

   private static void else_() {
      protected_ = new float[]{0.5F, 0.0F, 60.0F, 0.5F, 1000.0F};
   }

   private static void new_() {
      byte_ = new byte[]{2, 2, 3};
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
      }
   }

   private static void super_() {
      catch_ = new boolean[]{false, true, false, true, true};
   }
}
