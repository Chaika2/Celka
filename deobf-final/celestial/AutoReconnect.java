package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoReconnect extends Module {
   public Object[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static long[] throws_;
   private static String[] catch_;
   private static boolean[] private_;

   public AutoReconnect() {
      super("Auto Reconnect", "Автоматически перезаходит на\nпоследний игровой режим", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.continue_();
   }

   static {
      ntfClinit();
   }

   private void this_() {
      this.continue_();
      PI var1 = C_throws.byte_().native_().protected_();
      if (var1 != null) {
         Pf_1 var2 = var1.class_();
         if (var2.break_()) {
            String var7 = var2.class_() + var1.break_();
            this.break_[0] = var7;
         } else if (!rql_3.break_((String)this.break_[0])
            && (Integer)((cb_3)import_.class_[57]).throws_[41] != 0
            && (Integer)((cb_3)import_.class_[57]).throws_[41] % 20 == 0) {
            ((cb_3)import_.class_[57]).case_("/" + (String)this.break_[0]);
         }
      }
   }

   private void class_(SL var1) {
      this.continue_();
      String var2 = C_throws.byte_().final_().throws_();
      if (!rql_3.break_(var2)) {
         this.break_[0] = var2;
      } else if (!rql_3.break_((String)this.break_[0])) {
         var1.class_(new SF((String)this.break_[0], 0L));
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.class_[1] == null) {
            return;
         }

         SL var2 = C_throws.byte_().default_();
         if (var2.throws_()) {
            return;
         }

         switch (((int[])rrlQ_2.class_[0])[((rrfq_3)rrfp_3.class_[1]).ordinal()]) {
            case 1:
            case 2:
               this.this_();
               break;
            case 3:
               this.break_(var2);
               break;
            case 4:
               this.class_(var2);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7277647066595262163L;
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.continue_();
      Object var6 = null;
      this.break_[0] = var6;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -448057592;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, -67, 17, 11, 10, -120, -11, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_(SL var1) {
      this.continue_();
      Po_1 var2 = C_throws.byte_().P().break_();
      if (var2 != null) {
         PK var3 = var2.break_();
         if (var3.break_()) {
            String var8 = var3.class_() + var2.class_();
            this.break_[0] = var8;
         } else if (!rql_3.break_((String)this.break_[0])) {
            var1.class_(new SF((String)this.break_[0], 0L));
         }
      }
   }

   @Override
   public void throws_(boolean var1) {
      this.continue_();
      super.throws_(var1);
      Object var6 = null;
      this.break_[0] = var6;
   }

   private void continue_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static void else_() {
      throws_ = new long[2];
   }

   private static void new_() {
      private_ = new boolean[]{true};
   }

   private static void return_() {
      byte_ = new byte[]{20};
   }

   private static void super_() {
      protected_ = new short[]{3, 0, 1, 0, 1, 0, 0, 0, 57, 41, 57, 41, 57, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   private static void public_() {
      catch_ = new String[]{new String("Auto Reconnect"), new String("Автоматически перезаходит на\nпоследний игровой режим")};
   }
}
