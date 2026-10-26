package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoPush extends Module {
   private static short[] byte_;
   private static String[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static byte[] catch_;

   public NoPush() {
      super("No Push", "Игнорирует отталкивание от\nчего-либо", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.super_();
      rrIk_1 var5 = new rrIk_1("Блоки", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Сущности", true);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Удочки", true);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Воду", false);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Пузыри", false);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Границу", false);
      this.break_[5] = var10;
      this.class_(
         new rrIc_1(
            "Игнорировать",
            (rrIk_1)this.break_[1],
            (rrIk_1)this.break_[2],
            (rrIk_1)this.break_[0],
            (rrIk_1)this.break_[3],
            (rrIk_1)this.break_[4],
            (rrIk_1)this.break_[5]
         )
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new short[]{3, 0, 1, 2, 3, 4, 5, 1, 2, 0, 3, 4, 5, 2, 0, 1, 1, 0, 3, 3, 4, 2, 5};
   }

   @EventTarget
   public void class_(rrAx_1 var1) {
      this.super_();
      rrAd_1 var2 = var1.class_();
      if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[2] && ((rrIk_1)this.break_[0]).class_()) {
         var1.class_(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1] && ((rrIk_1)this.break_[1]).class_()) {
         var1.class_(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[0] && ((rrIk_1)this.break_[3]).class_()) {
         var1.class_(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[3] && ((rrIk_1)this.break_[4]).class_()) {
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1450733010;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.super_();
      if (var1.class_() instanceof rvQ_2 var2 && var2.break_() == 31 && ((rrIk_1)this.break_[2]).class_()) {
         var1.class_(true);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8946148932134659189L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -36, 49, 52, 113, 68, -62, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      catch_ = new byte[]{6, 2, 3, 4, 5, 31, 6};
   }

   private static void else_() {
      protected_ = new String[]{
         new String("No Push"),
         new String("Игнорирует отталкивание от\nчего-либо"),
         new String("Блоки"),
         new String("Сущности"),
         new String("Удочки"),
         new String("Воду"),
         new String("Пузыри"),
         new String("Границу"),
         new String("Игнорировать")
      };
   }

   public boolean new_() {
      this.super_();
      return this.aJ_() && ((rrIk_1)this.break_[5]).class_() ? true : throws_[14];
   }

   private static void return_() {
      throws_ = new boolean[]{true, true, true, false, false, false, false, true, true, true, true, true, true, true, false};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }
}
