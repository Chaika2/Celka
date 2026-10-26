package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SuperBow extends Module {
   public Object[] id_break;
   private static short[] id_byte;
   private static double[] id_protected;
   private static String[] id_throws;
   private static float[] id_catch;
   private static boolean[] id_private;

   public SuperBow() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_continue();
      rrIm_1 var5 = new rrIm_1(id_throws[2], 50.0F, 10.0F, 100.0F, 10.0F);
      this.id_break[id_byte[1]] = var5;
      this.id_class((rrIm_1)this.id_break[id_byte[2]]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new float[]{50.0F, 10.0F, 100.0F, 10.0F};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -461325330508360598L;
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_continue();
      if (var1.id_class() instanceof rZb_1 var2) {
         if (var2.id_protected() != rZM.RELEASE_USE_ITEM || !((cb_3)id_import.id_class[57]).sR()) {
            return;
         }

         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_byte[5]]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.START_SPRINTING));

         for (int var4 = id_private[0]; var4 < ((rrIm_1)this.id_break[id_byte[7]]).id_byte().intValue(); var4++) {
            this.id_class(((cb_3)id_import.id_class[57]).re() + 1.0E-10, id_private[1]);
            this.id_class(((cb_3)id_import.id_class[57]).re() - 1.0E-10, true);
         }
      }
   }

   private void id_class(double var1, boolean var3) {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_byte[11]])
         .id_class(new rZh_1(((cb_3)id_import.id_class[57]).rx(), var1, ((cb_3)id_import.id_class[57]).BO(), var3));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 979963855;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, -90, 11, 44, -17, -87, 85, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_else() {
      id_protected = new double[]{1.0E-10, 1.0E-10};
   }

   private static void id_new() {
      id_private = new boolean[]{false, false, true, true};
   }

   private static void id_return() {
      id_throws = new String[]{new String("Super Bow"), new String("Увеличивает урон с лука"), new String("Сила выстрела")};
   }

   private static void id_super() {
      id_byte = new short[]{0, 0, 0, 57, 57, 0, 57, 0, 57, 57, 57, 0, 57, 57};
   }
}
