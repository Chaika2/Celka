package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SrpSpoofer extends Module {
   private static String[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static short[] throws_;

   public SrpSpoofer() {
      super("SRP Spoofer", "Убирает ресурспак на серверах\nгде это запрещено", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.new_();
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new String[]{new String("SRP Spoofer"), new String("Убирает ресурспак на серверах\nгде это запрещено"), new String("Ресурспак успешно подменён")};
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.new_();
      if (var1.class_() instanceof rZQ var2 && var2.break_() == rZN.DECLINED) {
         var2.class_(rZN.ACCEPTED);
         Boolean var8 = true;
         this.break_[0] = var8;
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.new_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.break_[0]) {
         this.return_();
         this.continue_();
         Boolean var6 = false;
         this.break_[0] = var6;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 283642576;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7349062650280530281L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -27, -107, 96, 47, 39, 43, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.new_();
      super.throws_(var1);
      Boolean var6 = false;
      this.break_[0] = var6;
   }

   private void continue_() {
      String var1 = "Ресурспак успешно подменён";
      rrfu_3.byte_(rrfu_3.class_((Module)this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2(this.final_(), var1, 3000));
   }

   private static void else_() {
      throws_ = new short[]{4, 0, 0, 0, 0, 0, 57, 0, 0, 3000};
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         this.break_[0] = false;
      }
   }

   private void return_() {
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(rZN.SUCCESSFULLY_LOADED);
   }

   private static void super_() {
      protected_ = new boolean[]{true, false, false, true, false, false};
   }
}
