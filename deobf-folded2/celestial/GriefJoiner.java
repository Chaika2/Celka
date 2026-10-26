package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GriefJoiner extends Module {
   private static short[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;

   public GriefJoiner() {
      super("Grief Joiner", "Помогает зайти на гриф сервера\nReallyWorld", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_goto();
      rrIv_1 var5 = new rrIv_1("Режим", rrte_3.id_class((Pattern)rrtR_2.id_class[2]));
      this.id_break[0] = var5;
      this.id_class((rrIv_1)this.id_break[0]);
      rrpH_2 var6 = new rrpH_2(this);
      this.id_break[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new String[]{
         new String("Grief Joiner"), new String("Помогает зайти на гриф сервера\nReallyWorld"), new String("Режим"), new String("Не удалось определить сервер")
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1828892537;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3654383188304516265L;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      if (this.id_continue() && ((rrpl_3)this.id_break[2] == null || ((rrpl_3)this.id_break[2]).aI_())) {
         super.id_class(var1);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -48, 9, 87, 48, 62, -6, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_goto();
      if ((rrpl_3)this.id_break[2] == null || ((rrpl_3)this.id_break[2]).aK_()) {
         super.id_throws(var1);
         Object var6 = null;
         this.id_break[2] = var6;
      }
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   private boolean id_continue() {
      this.id_goto();
      ((rrpH_2)this.id_break[1]).id_class((rrfq_3)rrfp_3.id_class[1]).ifPresentOrElse(var1 -> {
         this.id_goto();
         this.id_break[2] = var1;
         ((rrpl_3)this.id_break[2]).id_class();
      }, () -> {
         this.id_byte(false);
         String var1 = "Не удалось определить сервер";
         rrfu_3.id_byte(rrfu_3.id_class((Module)this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
      });
      return (rrpl_3)this.id_break[2] != null ? true : id_catch[1];
   }

   private static void id_else() {
      id_byte = new short[]{4, 2, 0, 0, 1, 2, 2, 2, 2, 2, 1, 1, 2, 0, 0, 2000, 2, 2};
   }

   public String id_new() {
      this.id_goto();
      return ((rrIv_1)this.id_break[0]).id_extends();
   }

   private static void id_return() {
      id_protected = new byte[]{3};
   }

   private static void id_public() {
      id_catch = new boolean[]{true, false, false};
   }
}
