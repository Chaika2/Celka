package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Spider extends Module implements rrnZ_2 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;
   private static String[] id_catch;

   public Spider() {
      super("Spider", "Позволяет взбираться по стенам", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_else();
      rrIQ var5 = new rrIQ("Режим", "Grim", "Grim", "Matrix", "Funtime");
      this.id_break[1] = var5;
      this.id_class(new Setting[]{(rrIQ)this.id_break[1]});
      rrlM_2 var6 = new rrlM_2(this);
      this.id_break[2] = var6;
      rrlO_2 var7 = new rrlO_2(this);
      this.id_break[3] = var7;
      rrlb_3 var8 = new rrlb_3(this);
      this.id_break[4] = var8;
      rrlM_2 var9 = (rrlM_2)this.id_break[2];
      this.id_break[0] = var9;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_else();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Grim" -> (rrlM_2)this.id_break[2];
            case "Matrix" -> (rrlO_2)this.id_break[3];
            case "Funtime" -> (rrlb_3)this.id_break[4];
            default -> null;
         };
         this.id_break[0] = var9x;
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new boolean[]{false, true, true, false, false, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1091183455412216698L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 26088505;
   }

   @Override
   public void id_class() {
      this.id_protected(false);
      this.id_new().aK_();
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -84, 104, 9, -62, 49, 113, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }
   }

   public rrlM_2 id_continue() {
      this.id_else();
      return (rrlM_2)this.id_break[2];
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
      }
   }

   public rrTF<Spider> id_new() {
      this.id_else();
      return (rrTF<Spider>)this.id_break[0];
   }

   private static void id_return() {
      id_catch = new String[]{
         new String("Spider"),
         new String("Позволяет взбираться по стенам"),
         new String("Режим"),
         new String("Grim"),
         new String("Grim"),
         new String("Matrix"),
         new String("Funtime"),
         new String("change_mode"),
         new String("Grim"),
         new String("Matrix"),
         new String("Funtime")
      };
   }

   private static void id_super() {
      id_throws = new short[]{1, 1, 1, 2, 3, 4, 2, 0, 1, 0, 2, 0, 0, 2, 3, 4, 0, 0, 0};
   }

   private static void id_public() {
      id_byte = new byte[]{3, 2, -1, 2, 5};
   }
}
