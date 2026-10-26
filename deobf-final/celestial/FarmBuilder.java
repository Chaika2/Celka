package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FarmBuilder extends Module {
   private static short[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   private static byte[] catch_;
   public Object[] break_;

   public boolean byte_(String var1) {
      this.goto_();
      bW_2 var2 = C_throws.byte_().abstract_();
      String var3 = rrfu_3.class_((Module)this);
      if ((rY_2)this.break_[1] == null) {
         String var6 = var3 + "Необходимо установить область фермы криперов. Используйте команду %sfb".formatted(C_throws.break_().protected_.class_[0]);
         rrfu_3.byte_(var6);
         return false;
      } else {
         bc_3 var4 = this.protected_(var1);
         if (var4 == null) {
            String var5 = var3 + "Неверный режим: " + ((rrIQ)this.break_[0]).byte_();
            rrfu_3.byte_(var5);
            return false;
         } else {
            var2.class_(var4, (rY_2)this.break_[1]);
            return true;
         }
      }
   }

   public FarmBuilder() {
      super("Farm Builder", "Помогает в постройке фермы\nкриперов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.goto_();
      rrIQ var5 = new rrIQ("Режим", "Люки", "Люки", "Полублоки").class_("onChangeMode", (var1, var2) -> {
         if (this.aJ_()) {
            String var3 = var1.byte_();
            if (!this.byte_(var3)) {
               this.byte_(true);
            }
         }
      });
      this.break_[0] = var5;
      this.class_((rrIQ)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private void this_() {
      this.super_().protected_();
   }

   public void class_(rY_2 var1) {
      this.goto_();
      this.break_[1] = var1;
   }

   @Override
   public void class_(boolean var1) {
      this.goto_();
      if (!this.byte_(((rrIQ)this.break_[0]).byte_())) {
         this.byte_(true);
      } else {
         super.class_(var1);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2064511098753329296L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -984812413;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, 57, 98, 1, -2, 85, 93, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.this_();
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void continue_() {
      byte_ = new short[]{4, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1};
   }

   private static void else_() {
      catch_ = new byte[]{2, -1, 2};
   }

   public rY_2 new_() {
      this.goto_();
      return (rY_2)this.break_[1];
   }

   private static void return_() {
      protected_ = new boolean[]{false, true, true, true, false, false, false, true, false, true, true};
   }

   private bW_2 super_() {
      return C_throws.byte_().abstract_();
   }

   private static void public_() {
      throws_ = new String[]{
         new String("Farm Builder"),
         new String("Помогает в постройке фермы\nкриперов"),
         new String("Режим"),
         new String("Люки"),
         new String("Люки"),
         new String("Полублоки"),
         new String("onChangeMode"),
         new String("Необходимо установить область фермы криперов. Используйте команду %sfb"),
         new String("Люки"),
         new String("Полублоки")
      };
   }

   private bc_3 protected_(String var1) {
      return switch (var1) {
         case "Люки" -> (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0];
         case "Полублоки" -> (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1];
         default -> null;
      };
   }
}
