package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoGApple extends Module {
   private static String[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;
   private static byte[] id_catch;
   private static boolean[] id_private;
   public Object[] id_break;

   public AutoGApple() {
      super("Auto GApple", "Автоматически ест золотое яблоко\nпри определённом здоровье", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_new();
      rrIm_1 var5 = new rrIm_1("Здоровье", 15.0F, 5.0F, 20.0F, 0.5F);
      this.id_break[2] = var5;
      this.id_class((rrIm_1)this.id_break[2]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new float[]{15.0F, 5.0F, 20.0F, 0.5F};
   }

   @EventTarget
   public void id_class(rrAm_1 var1) {
      this.id_new();
      if ((Boolean)this.id_break[0] || (Boolean)this.id_break[1]) {
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 343223658;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4834134824521969145L;
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_new();
      if ((Boolean)this.id_break[0]) {
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(rrAC var1) {
      this.id_new();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[0]) {
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Boolean var6 = false;
         this.id_break[1] = var6;
         if (((cb_3)id_import.id_class[57]).Ss() <= ((rrIm_1)this.id_break[2]).id_byte()
            && !((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.hy, rdy_3.hp)
            && rrfH_2.id_class((cb_3)id_import.id_class[57], rdy_3.hy, rdy_3.hp) != null) {
            ((Qw_1)id_import.id_class[20]).u.id_class(true);
            Boolean var7 = true;
            this.id_break[0] = var7;
         } else if ((Boolean)this.id_break[0]) {
            ((Qw_1)id_import.id_class[20]).u.id_class(false);
            Boolean var8 = false;
            this.id_break[0] = var8;
            Boolean var9 = true;
            this.id_break[1] = var9;
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, 61, 73, 7, 63, 56, -2, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      Boolean var6 = false;
      this.id_break[1] = var6;
      if ((Boolean)this.id_break[0]) {
         if (((Qw_1)id_import.id_class[20]).u.id_protected()) {
            ((Qw_1)id_import.id_class[20]).u.id_class(false);
         }

         Boolean var7 = false;
         this.id_break[0] = var7;
      }
   }

   private static void id_continue() {
      id_byte = new String[]{new String("Auto GApple"), new String("Автоматически ест золотое яблоко\nпри определённом здоровье"), new String("Здоровье")};
   }

   private static void id_else() {
      id_catch = new byte[]{2, 2, 3};
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[0] = false;
         this.id_break[1] = false;
      }
   }

   private static void id_return() {
      id_throws = new short[]{0, 2, 2, 0, 1, 57, 2, 57, 57, 20, 0, 0, 20, 0, 1, 0, 0, 0, 0, 1, 1, 0, 20, 20, 0};
   }

   private static void id_super() {
      id_private = new boolean[]{
         false, false, true, false, true, true, true, false, false, true, true, true, true, false, false, false, false, false, true, false
      };
   }
}
