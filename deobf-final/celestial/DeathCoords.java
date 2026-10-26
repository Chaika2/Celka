package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DeathCoords extends Module {
   private static String[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;

   public DeathCoords() {
      super("Death Coords", "Отображает координаты вашей\nсмерти", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private String this_() {
      String var1 = "Точка смерти";
      int var2 = 1;

      while (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).protected_(var1)) {
         var1 = String.format("Точка смерти %d", ++var2);
      }

      return var1;
   }

   private void class_(String var1, rja_3 var2) {
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3(this.final_(), var1, 5000));
      rVi_1 var3 = rgv_3.class_(
         rrfu_3.break_((Module)this).class_(rgF_2.GRAY).break_(var1).class_(new rgN_2(" (Нажмите, чтобы создать точку)").class_(rgF_2.RED)),
         new rgl_3(() -> this.class_(var2))
      );
      rrfu_3.class_(var3);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8789248249881075358L;
   }

   private void class_(rja_3 var1) {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(new rrjD_2(this.this_(), var1.else_(), rrfp_3.throws_()), true);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1069388033;
   }

   @EventTarget
   public void class_(rrAG var1) {
      rja_3 var2 = var1.class_().finally_();
      String var3 = String.format("X: %d Y: %d Z: %d", var2.b_(), var2.c_(), var2.d_());
      String var4 = String.format("Ваши координаты смерти: %s", var3);
      this.class_(var4, var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 18, 8, -24, 82, 85, 30, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      throws_ = new short[]{4, 0, 5000, 0, 0};
   }

   private static void else_() {
      break_ = new String[]{
         new String("Death Coords"),
         new String("Отображает координаты вашей\nсмерти"),
         new String("X: %d Y: %d Z: %d"),
         new String("Ваши координаты смерти: %s"),
         new String(" (Нажмите, чтобы создать точку)"),
         new String("Точка смерти"),
         new String("Точка смерти %d")
      };
   }

   private static void new_() {
      protected_ = new byte[]{3, 2};
   }

   private static void super_() {
      byte_ = new boolean[]{false, true, true, false, true, true, true, false};
   }
}
