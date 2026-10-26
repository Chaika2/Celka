package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ItemScroller extends Module {
   private static float[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_catch;
   private static byte[] id_private;
   public Object[] id_break;

   public ItemScroller() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.id_return();
      rrIm_1 var5 = new rrIm_1(id_throws[2], id_byte[0], id_byte[1], id_byte[2], id_byte[3]);
      this.id_break[id_protected[1]] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[id_protected[2]] = var6;
      this.id_class((rrIm_1)this.id_break[id_protected[3]]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new float[]{0.0F, 0.0F, 100.0F, 10.0F};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9196545789209238788L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 682197849;
   }

   @EventTarget
   public void id_class(rrns_3 var1) {
      this.id_return();
      Fu_1 var2 = var1.id_class();
      rJY var3 = var2.id_int();
      if (var3 != null && var3.id_break()) {
         if (((rrfw_3)this.id_break[id_protected[4]]).id_class((double)((rrIm_1)this.id_break[id_protected[5]]).id_byte().floatValue())) {
            if (vm_3.id_synchronized() && rrfC_2.id_break(id_catch[0])) {
               var2.id_class(var3, var3.id_protected, id_catch[1], rXa_1.QUICK_MOVE);
            } else if (vm_3.id_else() && rrfC_2.id_break(((Qw_1)id_import.id_class[id_protected[6]]).N.id_int().id_break())) {
               var2.id_class(var3, var3.id_protected, id_catch[2], rXa_1.THROW);
            }

            ((rrfw_3)this.id_break[id_protected[7]]).id_class();
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 8, 126, -18, -71, -56, 36, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_private = new byte[]{2};
   }

   private static void id_else() {
      id_protected = new short[]{4, 0, 1, 0, 1, 0, 20, 1};
   }

   private static void id_new() {
      id_throws = new String[]{new String("Item Scroller"), new String("Позволяет быстро забирать или\nперекладывать предметы"), new String("Задержка")};
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   private static void id_super() {
      id_catch = new boolean[]{false, false, true};
   }
}
