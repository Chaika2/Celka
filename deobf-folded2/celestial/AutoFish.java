package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoFish extends Module {
   private static String[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_catch;
   public Object[] id_break;
   private static short[] id_private;

   private void id_byte(rpm_3 var1) {
      this.id_this();
      if (this.id_return()) {
         if (!(Boolean)this.id_break[0]
            && (rhp_3)((cb_3)id_import.id_class[57]).id_implements[29] != null
            && ((rhp_3)((cb_3)id_import.id_class[57]).id_implements[29]).id_implements()) {
            this.id_class(var1);
            Boolean var6 = true;
            this.id_break[0] = var6;
         }
      }
   }

   public AutoFish() {
      super("Auto Fish", "Автоматически ловит рыбу за вас", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_this();
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         this.id_break[0] = false;
         this.id_break[1] = 0;
      }
   }

   private void id_class(rpm_3 var1) {
      ryZ_2 var2 = ((Ax_1)id_import.id_class[55]).id_class(var1);
      if (var2 == ryZ_2.SUCCESS) {
         ((cb_3)id_import.id_class[57]).id_class(var1);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rpm_3 var2 = rrfH_2.id_class((cb_3)id_import.id_class[57], rdy_3.Xd);
         if (var2 != null) {
            this.id_byte(var2);
            this.id_break(var2);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3974042643107681316L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -693866113;
   }

   private void id_break(rpm_3 var1) {
      this.id_this();
      if (this.id_return()) {
         if ((Boolean)this.id_break[0]) {
            Integer var6 = (Integer)this.id_break[1] + 1;
            this.id_break[1] = var6;
            if ((Integer)this.id_break[1] >= 5) {
               this.id_class(var1);
               this.id_goto();
            }
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 112, 53, 11, 45, -85, 26, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_goto();
   }

   private void id_goto() {
      this.id_this();
      Integer var5 = 0;
      this.id_break[1] = var5;
      Boolean var6 = false;
      this.id_break[0] = var6;
   }

   private static void id_continue() {
      id_catch = new boolean[]{true, true, false, false, true, false, false, false, false, true, false};
   }

   private static void id_else() {
      id_private = new short[]{4, 0, 57, 0, 57, 29, 57, 29, 0, 0, 1, 1, 1, 55, 57, 57, 1, 0};
   }

   private static void id_new() {
      id_throws = new byte[]{5, 2};
   }

   private boolean id_return() {
      an_3 var1 = Ph_1.id_class(((cb_3)id_import.id_class[57]).rO(), 20.0F, false, null);
      return var1 != null ? false : id_catch[4];
   }

   private static void id_super() {
      id_protected = new float[]{20.0F};
   }

   private static void id_public() {
      id_byte = new String[]{new String("Auto Fish"), new String("Автоматически ловит рыбу за вас")};
   }
}
