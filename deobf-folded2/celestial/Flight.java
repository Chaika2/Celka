package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Flight extends Module implements rrnZ_2 {
   private static boolean[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;
   private static float[] id_catch;
   private static byte[] id_private;

   public Flight() {
      super("Flight", "Позволяет летать без креатив\nрежима", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_throw();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "Levitation Boost", "Jump");
      this.id_break[1] = var5;
      rrIm_1 var6 = new rrIm_1("Скорость", 2.0F, 0.5F, 10.0F, 0.1F).id_class(() -> {
         this.id_throw();
         return this.id_new() == (rrCD)this.id_break[4] ? true : id_byte[10];
      });
      this.id_break[2] = var6;
      rrIm_1 var7 = new rrIm_1("Скорость", 1.0F, 0.6F, 5.0F, 0.1F).id_class(() -> {
         this.id_throw();
         return this.id_new() == (rrCK)this.id_break[5] ? true : id_byte[8];
      });
      this.id_break[3] = var7;
      rrCD var8 = new rrCD(this);
      this.id_break[4] = var8;
      rrCK var9 = new rrCK(this);
      this.id_break[5] = var9;
      rrCo_1 var10 = new rrCo_1(this);
      this.id_break[6] = var10;
      this.id_class(new Setting[]{(rrIQ)this.id_break[1], (rrIm_1)this.id_break[2], (rrIm_1)this.id_break[3]});
      rrCD var11 = (rrCD)this.id_break[4];
      this.id_break[0] = var11;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_throw();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rrCD)this.id_break[4];
            case "Levitation Boost" -> (rrCK)this.id_break[5];
            case "Jump" -> (rrCo_1)this.id_break[6];
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

   public rrIm_1 id_this() {
      this.id_throw();
      return (rrIm_1)this.id_break[2];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -879094649;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4720540146179947115L;
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   @Override
   public void id_class() {
      this.id_byte(false);
      this.id_new().id_super();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 85, 25, -60, -55, 3, 50, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new().aK_();
   }

   private static void id_goto() {
      id_catch = new float[]{2.0F, 0.5F, 10.0F, 0.1F, 1.0F, 0.6F, 5.0F, 0.1F};
   }

   public rrIQ id_continue() {
      this.id_throw();
      return (rrIQ)this.id_break[1];
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("Flight"),
         new String("Позволяет летать без креатив\nрежима"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Levitation Boost"),
         new String("Jump"),
         new String("Скорость"),
         new String("Скорость"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Levitation Boost"),
         new String("Jump")
      };
   }

   private static void id_instanceof() {
      id_throws = new short[]{1, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 0, 1, 0, 1, 2, 3, 0, 0, 4, 5, 6, 0, 0, 0, 5, 4};
   }

   public rrTF<Flight> id_new() {
      this.id_throw();
      return (rrTF<Flight>)this.id_break[0];
   }

   public rrIm_1 id_super() {
      this.id_throw();
      return (rrIm_1)this.id_break[3];
   }

   private void id_throw() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   private static void id_try() {
      id_private = new byte[]{3, 2, 3, 2, -1, 2, 7};
   }

   private static void id_while() {
      id_byte = new boolean[]{false, true, false, true, false, false, true, true, false, true, false};
   }
}
