package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MinecraftOptimizer extends Module {
   private static String[] protected_;
   private static byte[] throws_;
   public Object[] break_;
   private static short[] catch_;
   private static boolean[] private_;
   public static Object[] byte_;

   public MinecraftOptimizer() {
      super("Minecraft Optimizer", "Оптимизирует майнкрафт", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.return_();
      rrIk_1 var5 = new rrIk_1("Баннеры", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Рамки", false);
      this.break_[1] = var6;
      this.class_(new rrIc_1("Убирать", (rrIk_1)this.break_[0], (rrIk_1)this.break_[1]));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new short[]{4, 0, 1, 0, 1, 0, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -177897343;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 507960844333435528L;
   }

   @EventTarget
   public void class_(rrAe_1 var1) {
      var1.class_(true);
   }

   @EventTarget
   public void class_(rrnb_3 var1) {
      this.return_();
      ao_3 var2 = var1.class_();
      if (((rrIk_1)this.break_[0]).class_() && var2 instanceof rHb_1) {
         var1.class_(true);
      } else if (((rrIk_1)this.break_[1]).class_() && var2 instanceof rsG_2) {
         var1.class_(true);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 55, 9, 40, -83, -20, 49, -48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new String[]{
         new String("Minecraft Optimizer"),
         new String("Оптимизирует майнкрафт"),
         new String("Баннеры"),
         new String("Рамки"),
         new String("Убирать"),
         new String("Optimizer"),
         new String("Optimizer")
      };
   }

   private static void else_() {
      throws_ = new byte[]{2, 2};
   }

   private static void new_() {
      private_ = new boolean[]{true, false, false, true, true, true, true, true, false};
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void super_() {
      Object[] var0 = new Object[]{"Optimizer"};
      byte_ = var0;
   }

   @Override
   public String final_() {
      return "Optimizer";
   }
}
