package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoRespawn extends Module {
   private static String[] byte_;
   private static byte[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static short[] catch_;

   private boolean byte_(String var1) {
      return !var1.isEmpty() && !var1.isBlank() ? true : throws_[8];
   }

   public AutoRespawn() {
      super("Auto Respawn", "Автоматически респавнит вас\nпосле смерти", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.new_();
      rrIv_1 var5 = new rrIv_1("Сообщение после респавна", rrte_3.class_((Pattern)rrtR_2.class_[5]));
      this.break_[0] = var5;
      this.class_((rrIv_1)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new String[]{new String("Auto Respawn"), new String("Автоматически респавнит вас\nпосле смерти"), new String("Сообщение после респавна")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 719655780;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.new_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.break_[1]) {
         if ((vm_3)import_.class_[73] instanceof ZS && (Integer)((cb_3)import_.class_[57]).private_[13] == 1) {
            ((cb_3)import_.class_[57]).J();
         } else if (((cb_3)import_.class_[57]).Pu()) {
            int var10002 = (Integer)this.break_[2] + 1;
            Integer var7 = var10002;
            this.break_[2] = var7;
            if (var10002 >= 17) {
               String var2 = ((rrIv_1)this.break_[0]).extends_();
               if (this.byte_(var2)) {
                  ((cb_3)import_.class_[57]).protected_(var2);
               }

               Boolean var8 = false;
               this.break_[1] = var8;
               Integer var9 = 0;
               this.break_[2] = var9;
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7363245691509839040L;
   }

   @EventTarget
   public void class_(rrAG var1) {
      this.new_();
      Boolean var6 = true;
      this.break_[1] = var6;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -94, 88, 1, -118, 22, -54, -69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.new_();
      super.throws_(var1);
      Boolean var6 = false;
      this.break_[1] = var6;
      Integer var7 = 0;
      this.break_[2] = var7;
   }

   private static void continue_() {
      protected_ = new byte[]{17, 3, 2};
   }

   private static void else_() {
      catch_ = new short[]{3, 5, 0, 0, 0, 1, 73, 57, 13, 57, 57, 2, 2, 0, 57, 1, 2, 1, 1, 2};
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         this.break_[1] = false;
         this.break_[2] = 0;
      }
   }

   private static void super_() {
      throws_ = new boolean[]{true, true, false, false, true, false, false, true, false, true, false, false};
   }
}
