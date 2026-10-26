package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Speed extends Module implements rrnZ_2 {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static short[] id_catch;

   public Speed() {
      super("Speed", "Увеличивает скорость игрока", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_continue();
      rrIQ var5 = this.id_class(new rrIQ("Режим", "Vanilla", "Vanilla", "Collision", "Matrix", "Grim"));
      this.id_break[1] = var5;
      rrlB_2 var6 = new rrlB_2(this);
      this.id_break[2] = var6;
      rrls_3 var7 = new rrls_3(this);
      this.id_break[3] = var7;
      rrlS_2 var8 = new rrlS_2(this);
      this.id_break[4] = var8;
      rrlE_2 var9 = new rrlE_2(this);
      this.id_break[5] = var9;
      rrlE_2 var10 = (rrlE_2)this.id_break[5];
      this.id_break[0] = var10;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_continue();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Vanilla" -> (rrlE_2)this.id_break[5];
            case "Collision" -> (rrlB_2)this.id_break[2];
            case "Matrix" -> (rrls_3)this.id_break[3];
            case "Grim" -> (rrlS_2)this.id_break[4];
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
      id_protected = new byte[]{4, 2, 3, -1, 2, 3, 6};
   }

   @Override
   public void id_class() {
      this.id_byte(false);
      rrTF var1 = this.id_new();
      var1.aK_();
      var1.id_super();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -630759078;
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1386181535954914130L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 59, -107, 122, -75, 125, -74, -91}, "DES");
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
      id_throws = new String[]{
         new String("Speed"),
         new String("Увеличивает скорость игрока"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Collision"),
         new String("Matrix"),
         new String("Grim"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Collision"),
         new String("Matrix"),
         new String("Grim")
      };
   }

   public rrTF<Speed> id_new() {
      this.id_continue();
      return (rrTF<Speed>)this.id_break[0];
   }

   private static void id_return() {
      id_catch = new short[]{1, 1, 2, 3, 4, 5, 5, 0, 1, 0, 0, 0, 5, 2, 3, 4, 0, 0, 0};
   }

   private static void id_super() {
      id_byte = new boolean[]{false, true, false, false, true};
   }
}
