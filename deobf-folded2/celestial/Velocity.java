package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Velocity extends Module {
   private static String[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;

   public Velocity() {
      super("Velocity", "Редактирует ваше откидывание", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_continue();
      rrIQ var5 = this.id_class(new rrIQ("Режим", "Vanilla", "Vanilla", "Custom", "Jump", "JumpReset")).id_class("change_mode", (var1, var2) -> {
         this.id_continue();
         if ((rrTF)this.id_break[5] != null && this.aJ_()) {
            ((rrTF)this.id_break[5]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rrCf_1)this.id_break[1];
            case "Jump" -> (rrCI)this.id_break[3];
            case "Custom" -> (rrCt_1)this.id_break[2];
            case "JumpReset" -> (rrCw_1)this.id_break[4];
            default -> null;
         };
         this.id_break[5] = var9x;
         if ((rrTF)this.id_break[5] != null && this.aJ_()) {
            ((rrTF)this.id_break[5]).aI_();
         }
      });
      this.id_break[0] = var5;
      rrCf_1 var6 = new rrCf_1(this);
      this.id_break[1] = var6;
      rrCt_1 var7 = new rrCt_1(this);
      this.id_break[2] = var7;
      rrCI var8 = new rrCI(this);
      this.id_break[3] = var8;
      rrCw_1 var9 = new rrCw_1(this);
      this.id_break[4] = var9;
      rrCf_1 var10 = (rrCf_1)this.id_break[1];
      this.id_break[5] = var10;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new boolean[]{false, true, false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 506948522;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7729682805662392668L;
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 28, 0, 100, -14, -64, -17, 109}, "DES");
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

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static void id_else() {
      id_throws = new byte[]{4, 2, 3, -1, 2, 3, 6};
   }

   public rrTF<Velocity> id_new() {
      this.id_continue();
      return (rrTF<Velocity>)this.id_break[5];
   }

   private static void id_return() {
      id_byte = new String[]{
         new String("Velocity"),
         new String("Редактирует ваше откидывание"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Custom"),
         new String("Jump"),
         new String("JumpReset"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Jump"),
         new String("Custom"),
         new String("JumpReset")
      };
   }

   private static void id_super() {
      id_protected = new short[]{0, 0, 1, 2, 3, 4, 1, 5, 5, 5, 5, 1, 3, 2, 4, 5, 5, 5};
   }
}
