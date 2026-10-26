package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HitBoxes extends Module {
   private static byte[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   public Object[] break_;
   private static boolean[] catch_;
   private static String[] private_;

   public HitBoxes() {
      super("Hitboxes", "Увеличивает хитбокс у энтити", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.else_();
      CheckGroup var5 = new CheckGroup().catch_(true).case_(false).throws_(false).implements_(false).byte_(false).protected_(false).class_(true);
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Размер", 0.2F, 0.1F, 2.0F, 0.1F);
      this.break_[1] = var6;
      this.class_(new Setting[]{new rrIc_1("Выбор целей", ((CheckGroup)this.break_[0]).byte_()), (rrIm_1)this.break_[1]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new String[]{new String("Hitboxes"), new String("Увеличивает хитбокс у энтити"), new String("Размер"), new String("Выбор целей")};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4104110519189998539L;
   }

   private boolean class_(an_3 var1) {
      this.else_();
      return var1 == (cb_3)import_.class_[57] ? false : rrff_3.class_(var1, (CheckGroup)this.break_[0]);
   }

   @EventTarget
   public void class_(rrnJ_2 var1) {
      this.else_();
      an_3 var2 = var1.class_();
      if (this.class_(var2)) {
         var1.class_(((rrIm_1)this.break_[1]).byte_());
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1016036912;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -125, 23, -22, 41, -67, -70, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new short[]{0, 0, 1, 0, 1, 1, 57, 0};
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void new_() {
      byte_ = new byte[]{2, 2};
   }

   private static void return_() {
      throws_ = new float[]{0.2F, 0.1F, 2.0F, 0.1F};
   }

   private static void super_() {
      catch_ = new boolean[]{true, false, false, false, false, false, true, false, true, false};
   }
}
